package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import singleton.SettingsFileEngine;

public class SettingsFileEngineTestSuite {
    private static SettingsFileEngine settingsFileEngine;

    @BeforeClass
    public static void openSettingFile(){

       SettingsFileEngine.getInstance().open("myapp.settings");
    }
    @AfterClass
    public static void closeSettingFile(){
        SettingsFileEngine.getInstance().close();
    }
    @Test
    public void testSettingsFile(){
        //Given
        //When
        String fileName = SettingsFileEngine.getInstance().getFileName();
        System.out.println("Opened: "+ fileName);
        //Then
        Assert.assertEquals("myapp.settings",fileName);
    }
    @Test
    public void testLoadFile(){
        //Given
        //When
        boolean result = SettingsFileEngine.getInstance().loadSettings();
        //Then
        Assert.assertTrue(result);
    }
    @Test
    public void testSaveSetting(){
        //Given
        //When
        boolean result = SettingsFileEngine.getInstance().saveSetting();
        //Then
        Assert.assertTrue(result);
    }


}
