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
    @Test
    public void weaknessGrassTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Fire");
        actualList.add("Ice");
        actualList.add("Poison");
        actualList.add("Flying");
        actualList.add("Bug");
        List<String> strList = typeChecker.getWeakness("Grass");
        assertEquals(actualList,strList);
        String strString = "Fire,Ice,Poison,Flying,Bug";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessElectricTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Ground");
        List<String> strList = typeChecker.getWeakness("Electric");
        assertEquals(actualList,strList);
        String strString = "Ground";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessIceTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Fire");
        actualList.add("Fighting");
        actualList.add("Rock");
        actualList.add("Steel");
        List<String> strList = typeChecker.getWeakness("Ice");
        assertEquals(actualList,strList);
        String strString = "Fire,Fighting,Rock,Steel";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessFightingTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Flying");
        actualList.add("Psychic");
        actualList.add("Fairy");
        List<String> strList = typeChecker.getWeakness("Fighting");
        assertEquals(actualList,strList);
        String strString = "Flying,Psychic,Fairy";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessPoisonTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Ground");
        actualList.add("Psychic");
        List<String> strList = typeChecker.getWeakness("Poison");
        assertEquals(actualList,strList);
        String strString = "Ground,Psychic";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessGroundTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Water");
        actualList.add("Grass");
        actualList.add("Ice");
        List<String> strList = typeChecker.getWeakness("Ground");
        assertEquals(actualList,strList);
        String strString = "Water,Grass,Ice";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessFlyingTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Electric");
        actualList.add("Ice");
        actualList.add("Rock");
        List<String> strList = typeChecker.getWeakness("Flying");
        assertEquals(actualList,strList);
        String strString = "Electric,Ice,Rock";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessPsychicTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Bug");
        actualList.add("Ghost");
        actualList.add("Dark");
        List<String> strList = typeChecker.getWeakness("Psychic");
        assertEquals(actualList,strList);
        String strString = "Bug,Ghost,Dark";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessBugTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Fire");
        actualList.add("Flying");
        actualList.add("Rock");
        List<String> strList = typeChecker.getWeakness("Bug");
        assertEquals(actualList,strList);
        String strString = "Fire,Flying,Rock";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessRockTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Water");
        actualList.add("Grass");
        actualList.add("Fighting");
        actualList.add("Ground");
        actualList.add("Steel");
        List<String> strList = typeChecker.getWeakness("Rock");
        assertEquals(actualList,strList);
        String strString = "Water,Grass,Fighting,Ground,Steel";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessGhostTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Ghost");
        actualList.add("Dark");
        List<String> strList = typeChecker.getWeakness("Ghost");
        assertEquals(actualList,strList);
        String strString = "Ghost,Dark";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessDragonTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Ice");
        actualList.add("Dragon");
        actualList.add("Fairy");
        List<String> strList = typeChecker.getWeakness("Dragon");
        assertEquals(actualList,strList);
        String strString = "Ice,Dragon,Fairy";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessDarkTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Fighting");
        actualList.add("Bug");
        actualList.add("Fairy");
        List<String> strList = typeChecker.getWeakness("Dark");
        assertEquals(actualList,strList);
        String strString = "Fighting,Bug,Fairy";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessSteelTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Fire");
        actualList.add("Fighting");
        actualList.add("Ground");
        List<String> strList = typeChecker.getWeakness("Steel");
        assertEquals(actualList,strList);
        String strString = "Fire,Fighting,Ground";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void weaknessFairyTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Poison");
        actualList.add("Steel");
        List<String> strList = typeChecker.getWeakness("Fairy");
        assertEquals(actualList,strList);
        String strString = "Poison,Steel";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
}
