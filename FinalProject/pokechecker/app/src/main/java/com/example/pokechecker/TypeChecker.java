package com.example.pokechecker;

import java.util.ArrayList;
import java.util.List;

public class TypeChecker {
    public List<String> getStrength(String type){
        List<String> weakTypes = new ArrayList<>();
        switch (type){
            case "Normal":
                weakTypes.add("");
                break;
            case "Fire":
                weakTypes.add("Grass");
                weakTypes.add("Ice");
                weakTypes.add("Bug");
                weakTypes.add("Steel");
                break;
            default:
                weakTypes.add("Null");
                break;
        }
        return weakTypes;
    }
    public String convertStringList(List<String> stringList){
        String delim = ",";
        StringBuilder sb = new StringBuilder();
        int i=0;
        while (i< stringList.size()-1){
            sb.append(stringList.get(i));
            sb.append(delim);
            i++;
        }
        sb.append(stringList.get(i));
        String strList = sb.toString();
        return strList;
    }
}
