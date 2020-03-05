CSVReader csvReader = new CSVReader(new FileReader(Environment.getExternalStorageDirectory() + "/" + TableName));
String[] nextLine;
int count = 0;
StringBuilder columns = new StringBuilder();
StringBuilder value = new StringBuilder();
 
while ((nextLine = csvReader.readNext()) != null) {
      // nextLine[] is an array of values from the line
         for (int i = 0; i < nextLine.length - 1; i++) {
             if (count == 0) {
                 if (i == nextLine.length - 2)
                     columns.append(nextLine[i]);
                 else
                     columns.append(nextLine[i]).append(",");
             } else {
                 if (i == nextLine.length - 2)
                    value.append("'").append(nextLine[i]).append("'");
                 else
                    value.append("'").append(nextLine[i]).append("',");
             }
        }
 
Log.d(TAG, columns + "-------" + value);
 