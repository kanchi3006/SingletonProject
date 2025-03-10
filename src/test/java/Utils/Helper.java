package Utils;

public class Helper {

    public void navigateToSite(String url)
    {
        System.out.println("Hitting");
        System.out.println(DriverSetup.getDriver());
        DriverSetup.getDriver().get("https://google.com");

    }



}
