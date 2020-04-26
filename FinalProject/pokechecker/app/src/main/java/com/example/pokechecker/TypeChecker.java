package com.example.pokechecker;

import java.util.ArrayList;
import java.util.List;

public class TypeChecker {
    public List<String> getStrength(String type){
        List<String> strTypes = new ArrayList<>();
        switch (type){
            case "Normal":
                strTypes.add("");
                break;
            case "Fire":
                strTypes.add("Grass");
                strTypes.add("Ice");
                strTypes.add("Bug");
                strTypes.add("Steel");
                break;
            case "Water":
                strTypes.add("Fire");
                strTypes.add("Ground");
                strTypes.add("Rock");
                break;
            case "Grass":
                strTypes.add("Water");
                strTypes.add("Ground");
                strTypes.add("Rock");
                break;
            case "Electric":
                strTypes.add("Water");
                strTypes.add("Flying");
                break;
            case "Ice":
                strTypes.add("Grass");
                strTypes.add("Ground");
                strTypes.add("Flying");
                strTypes.add("Dragon");
                break;
            case "Fighting":
                strTypes.add("Normal");
                strTypes.add("Ice");
                strTypes.add("Rock");
                strTypes.add("Dark");
                strTypes.add("Steel");
                break;
            case "Poison":
                strTypes.add("Grass");
                strTypes.add("Fairy");
                break;
            case "Ground":
                strTypes.add("Fire");
                strTypes.add("Electric");
                strTypes.add("Poison");
                strTypes.add("Rock");
                strTypes.add("Steel");
                break;
            case "Flying":
                strTypes.add("Grass");
                strTypes.add("Fighting");
                strTypes.add("Bug");
                break;
            case "Psychic":
                strTypes.add("Fighting");
                strTypes.add("Poison");
                break;
            case "Bug":
                strTypes.add("Grass");
                strTypes.add("Psychic");
                strTypes.add("Dark");
                break;
            case "Rock":
                strTypes.add("Fire");
                strTypes.add("Ice");
                strTypes.add("Flying");
                strTypes.add("Bug");
                break;
            case "Ghost":
                strTypes.add("Psychic");
                strTypes.add("Ghost");
                break;
            case "Dragon":
                strTypes.add("Dragon");
                break;
            case "Dark":
                strTypes.add("Psychic");
                strTypes.add("Ghost");
                break;
            case "Steel":
                strTypes.add("Ice");
                strTypes.add("Rock");
                strTypes.add("Fairy");
                break;
            case "Fairy":
                strTypes.add("Fighting");
                strTypes.add("Dragon");
                strTypes.add("Dark");
                break;
            default:
                strTypes.add("Null");
                break;
        }
        return strTypes;
    }
    // TODO: finish writing out weakness once test is complete
    public List<String> getWeakness(String type) {
        List<String> weakTypes = new ArrayList<>();
        switch (type) {
            case "Normal":
                weakTypes.add("Fighting");
                break;
            case "Fire":
                weakTypes.add("Water");
                weakTypes.add("Ground");
                weakTypes.add("Rock");
                break;
            case "Water":
                weakTypes.add("Grass");
                weakTypes.add("Electric");
                break;
            case "Grass":
                weakTypes.add("Fire");
                weakTypes.add("Ice");
                weakTypes.add("Poison");
                weakTypes.add("Flying");
                weakTypes.add("Bug");
                break;
            case "Electric":
                weakTypes.add("Ground");
                break;
            case "Ice":
                weakTypes.add("Fire");
                weakTypes.add("Fighting");
                weakTypes.add("Rock");
                weakTypes.add("Steel");
                break;
            case "Fighting":
                weakTypes.add("Flying");
                weakTypes.add("Psychic");
                weakTypes.add("Fairy");
                break;
            case "Poison":
                weakTypes.add("Ground");
                weakTypes.add("Psychic");
                break;
            case "Ground":
                weakTypes.add("Water");
                weakTypes.add("Grass");
                weakTypes.add("Ice");
                break;
            case "Flying":
                weakTypes.add("Electric");
                weakTypes.add("Ice");
                weakTypes.add("Rock");
                break;
            case "Psychic":
                weakTypes.add("Bug");
                weakTypes.add("Ghost");
                weakTypes.add("Dark");
                break;
            case "Bug":
                weakTypes.add("Fire");
                weakTypes.add("Flying");
                weakTypes.add("Rock");
                break;
            case "Rock":
                weakTypes.add("Water");
                weakTypes.add("Grass");
                weakTypes.add("Fighting");
                weakTypes.add("Ground");
                weakTypes.add("Steel");
                break;
            case "Ghost":
                weakTypes.add("Ghost");
                weakTypes.add("Dark");
                break;
            case "Dragon":
                weakTypes.add("Ice");
                weakTypes.add("Dragon");
                weakTypes.add("Fairy");
                break;
            case "Dark":
                weakTypes.add("Fighting");
                weakTypes.add("Bug");
                weakTypes.add("Fairy");
                break;
            case "Steel":
                weakTypes.add("Fire");
                weakTypes.add("Fighting");
                weakTypes.add("Ground");
                break;
            case "Fairy":
                weakTypes.add("Poison");
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
