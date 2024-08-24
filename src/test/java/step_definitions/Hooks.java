package step_definitions;

import driver_factory.DriverFactory;
import driver_factory.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public final class Hooks {

    private DriverFactory driverFactory;

    @Before
    public void setUp() {
        driverFactory = new DriverFactory();
        String browser = "Chrome";
        WebDriver driver = driverFactory.initializeBrowserWithName(browser);
        DriverManager.setDriver(driver);
    }

    @After
    public void tearDown() {
        driverFactory.quitDriver();
    }
}
