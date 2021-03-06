package com.example.pokechecker;
import android.content.Context;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class StrengthTypeTest {
    @Test
    public void strengthFiretest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Grass");
        actualList.add("Ice");
        actualList.add("Bug");
        actualList.add("Steel");
        List<String> strList = typeChecker.getStrength("Fire");
        assertEquals(strList,actualList);
        String strString = "Grass,Ice,Bug,Steel";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(strString,actualStrString);
    }
    @Test
    public void strengthNormalTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("");
        List<String> strList = typeChecker.getStrength("Normal");
        assertEquals(actualList,strList);
    }
    @Test
    public void strengthWaterTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Fire");
        actualList.add("Ground");
        actualList.add("Rock");
        List<String> strList = typeChecker.getStrength("Water");
        assertEquals(actualList,strList);
        String strString = "Fire,Ground,Rock";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void strengthGrassTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Water");
        actualList.add("Ground");
        actualList.add("Rock");
        List<String> strList = typeChecker.getStrength("Grass");
        assertEquals(actualList,strList);
        String strString = "Water,Ground,Rock";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void strengthElectricTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Water");
        actualList.add("Flying");
        List<String> strList = typeChecker.getStrength("Electric");
        assertEquals(actualList,strList);
        String strString = "Water,Flying";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void strengthIceTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Grass");
        actualList.add("Ground");
        actualList.add("Flying");
        actualList.add("Dragon");
        List<String> strList = typeChecker.getStrength("Ice");
        assertEquals(actualList,strList);
        String strString = "Grass,Ground,Flying,Dragon";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void strengthFightingTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Normal");
        actualList.add("Ice");
        actualList.add("Rock");
        actualList.add("Dark");
        actualList.add("Steel");
        List<String> strList = typeChecker.getStrength("Fighting");
        assertEquals(actualList,strList);
        String strString = "Normal,Ice,Rock,Dark,Steel";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void strengthPoisonTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Grass");
        actualList.add("Fairy");
        List<String> strList = typeChecker.getStrength("Poison");
        assertEquals(actualList,strList);
        String strString = "Grass,Fairy";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void strengthGroundTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Fire");
        actualList.add("Electric");
        actualList.add("Poison");
        actualList.add("Rock");
        actualList.add("Steel");
        List<String> strList = typeChecker.getStrength("Ground");
        assertEquals(actualList,strList);
        String strString = "Fire,Electric,Poison,Rock,Steel";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void strengthFlyingTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Grass");
        actualList.add("Fighting");
        actualList.add("Bug");
        List<String> strList = typeChecker.getStrength("Flying");
        assertEquals(actualList,strList);
        String strString = "Grass,Fighting,Bug";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void strengthPsychicTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Fighting");
        actualList.add("Poison");
        List<String> strList = typeChecker.getStrength("Psychic");
        assertEquals(actualList,strList);
        String strString = "Fighting,Poison";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void strengthBugTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Grass");
        actualList.add("Psychic");
        actualList.add("Dark");
        List<String> strList = typeChecker.getStrength("Bug");
        assertEquals(actualList,strList);
        String strString = "Grass,Psychic,Dark";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void strengthRockTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Fire");
        actualList.add("Ice");
        actualList.add("Flying");
        actualList.add("Bug");
        List<String> strList = typeChecker.getStrength("Rock");
        assertEquals(actualList,strList);
        String strString = "Fire,Ice,Flying,Bug";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void strengthGhostTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Psychic");
        actualList.add("Ghost");
        List<String> strList = typeChecker.getStrength("Ghost");
        assertEquals(actualList,strList);
        String strString = "Psychic,Ghost";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void strengthDragonTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Dragon");
        List<String> strList = typeChecker.getStrength("Dragon");
        assertEquals(actualList,strList);
        String strString = "Dragon";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void strengthDarkTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Psychic");
        actualList.add("Ghost");
        List<String> strList = typeChecker.getStrength("Dark");
        assertEquals(actualList,strList);
        String strString = "Psychic,Ghost";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void strengthSteelTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Ice");
        actualList.add("Rock");
        actualList.add("Fairy");
        List<String> strList = typeChecker.getStrength("Steel");
        assertEquals(actualList,strList);
        String strString = "Ice,Rock,Fairy";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }
    @Test
    public void strengthFairyTest(){
        TypeChecker typeChecker = new TypeChecker();
        List<String> actualList = new ArrayList<>();
        actualList.add("Fighting");
        actualList.add("Dragon");
        actualList.add("Dark");
        List<String> strList = typeChecker.getStrength("Fairy");
        assertEquals(actualList,strList);
        String strString = "Fighting,Dragon,Dark";
        String actualStrString = typeChecker.convertStringList(strList);
        assertEquals(actualStrString,strString);
    }

}
