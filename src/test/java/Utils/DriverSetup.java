package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup extends ParallelMethods {

    private DriverSetup(){}

    private static ThreadLocal<WebDriver> driver_instance = new ThreadLocal<>();
    static int threadCount =0;

    static WebDriver getInstance(){
        System.out.println(threadCount);
        if(driver_instance.get()==null) {
            threadCount++;
            driver_instance.set(new ChromeDriver());
            System.out.println(threadCount);
        }
        return driver_instance.get();
    }
    public static WebDriver getDriver(){
        return getInstance();
    }
}