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
}
