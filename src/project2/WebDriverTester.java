package project2;

import java.sql.Driver;

public class WebDriverTester {
    public static void main(String[] args) {
        ChromeDriver chrome=new ChromeDriver();
        chrome.open();
        chrome.close();
        chrome.getTitle();
        chrome.getScreenshot();
        chrome.navigate();

        FirefoxDriver fire=new FirefoxDriver();
        fire.open();
        fire.close();
        fire.getTitle();
        fire.getScreenshot();
        fire.navigate();

        SafariDriver safari=new SafariDriver();
        safari.open();
        safari.close();
        safari.getTitle();
        safari.getScreenshot();
        safari.navigate();

    }
}
