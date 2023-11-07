package com.example;

import java.io.File;
import java.net.URL;
import java.nio.charset.MalformedInputException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws MalformedURLException
    {
        File apk = new File("C:\\Users\\Sara\\Documents\\AppiumTesting\\testing\\src\\main\\resources\\Alura Cursos Online_4.2.3_Apkpure.apk");
        DesiredCapabilities config = new DesiredCapabilities();
        config.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());
        config.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        config.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        URL urlConexao = new URL("http://127.0.0.1:4723/");
        AppiumDriver driver = new AppiumDriver<>(urlConexao, config);
    }
}
