package com.example.pokechecker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class WeaknessTypeTest {
    @Test
    public void weaknessNormalTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Fighting");
        List<String> strList = typeChecker.getWeakness("Normal");
        assertEquals(strList,actualList);
        String strString = "Fighting";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(strString,actualStrString);
    }
    @Test
    public void weaknessFiretest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Water");
        actualList.add("Ground");
        actualList.add("Rock");
        List<String> strList = typeChecker.getWeakness("Fire");
        assertEquals(strList,actualList);
        String strString = "Water,Ground,Rock";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(strString,actualStrString);
    }
    @Test
    public void weaknessWaterTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Grass");
        actualList.add("Electric");
        List<String> strList = typeChecker.getWeakness("Water");
        assertEquals(actualList,strList);
        String strString = "Grass,Electric";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    //TODO: Continue from here fix types
    @Test
    public void weaknessGrassTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Water");
        actualList.add("Ground");
        actualList.add("Rock");
        List<String> strList = typeChecker.getWeakness("Grass");
        assertEquals(actualList,strList);
        String strString = "Water,Ground,Rock";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessElectricTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Water");
        actualList.add("Flying");
        List<String> strList = typeChecker.getWeakness("Electric");
        assertEquals(actualList,strList);
        String strString = "Water,Flying";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessIceTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Grass");
        actualList.add("Ground");
        actualList.add("Flying");
        actualList.add("Dragon");
        List<String> strList = typeChecker.getWeakness("Ice");
        assertEquals(actualList,strList);
        String strString = "Grass,Ground,Flying,Dragon";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessFightingTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Normal");
        actualList.add("Ice");
        actualList.add("Rock");
        actualList.add("Dark");
        actualList.add("Steel");
        List<String> strList = typeChecker.getWeakness("Fighting");
        assertEquals(actualList,strList);
        String strString = "Normal,Ice,Rock,Dark,Steel";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessPoisonTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Grass");
        actualList.add("Fairy");
        List<String> strList = typeChecker.getWeakness("Poison");
        assertEquals(actualList,strList);
        String strString = "Grass,Fairy";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessGroundTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Fire");
        actualList.add("Electric");
        actualList.add("Poison");
        actualList.add("Rock");
        actualList.add("Steel");
        List<String> strList = typeChecker.getWeakness("Ground");
        assertEquals(actualList,strList);
        String strString = "Fire,Electric,Poison,Rock,Steel";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessFlyingTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Grass");
        actualList.add("Fighting");
        actualList.add("Bug");
        List<String> strList = typeChecker.getWeakness("Flying");
        assertEquals(actualList,strList);
        String strString = "Grass,Fighting,Bug";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessPsychicTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Fighting");
        actualList.add("Poison");
        List<String> strList = typeChecker.getWeakness("Psychic");
        assertEquals(actualList,strList);
        String strString = "Fighting,Poison";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessBugTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Grass");
        actualList.add("Psychic");
        actualList.add("Dark");
        List<String> strList = typeChecker.getWeakness("Bug");
        assertEquals(actualList,strList);
        String strString = "Grass,Psychic,Dark";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessRockTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Fire");
        actualList.add("Ice");
        actualList.add("Flying");
        actualList.add("Bug");
        List<String> strList = typeChecker.getWeakness("Rock");
        assertEquals(actualList,strList);
        String strString = "Fire,Ice,Flying,Bug";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessGhostTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Psychic");
        actualList.add("Ghost");
        List<String> strList = typeChecker.getWeakness("Ghost");
        assertEquals(actualList,strList);
        String strString = "Psychic,Ghost";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessDragonTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Dragon");
        List<String> strList = typeChecker.getWeakness("Dragon");
        assertEquals(actualList,strList);
        String strString = "Dragon";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessDarkTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Psychic");
        actualList.add("Ghost");
        List<String> strList = typeChecker.getWeakness("Dark");
        assertEquals(actualList,strList);
        String strString = "Psychic,Ghost";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessSteelTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Ice");
        actualList.add("Rock");
        actualList.add("Fairy");
        List<String> strList = typeChecker.getWeakness("Steel");
        assertEquals(actualList,strList);
        String strString = "Ice,Rock,Fairy";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessFairyTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Fighting");
        actualList.add("Dragon");
        actualList.add("Dark");
        List<String> strList = typeChecker.getWeakness("Fairy");
        assertEquals(actualList,strList);
        String strString = "Fighting,Dragon,Dark";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
}
