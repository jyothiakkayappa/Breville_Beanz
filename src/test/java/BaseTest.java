package test.java;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import main.java.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class BaseTest  {

    public static WebDriver driver;
    public ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest logger;

    @BeforeTest
    public void beforeTestMethod(){
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+ File.separator + "reports"+ File.separator + "AutomationReport.html");
        htmlReporter.config().setEncoding("UTF-8");
        htmlReporter.config().setDocumentTitle("Automation Report");
        htmlReporter.config().setReportName("Automation test Results");
        htmlReporter.config().setTheme(Theme.DARK);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Automation Tester", "Jyothi");
    }

    @BeforeMethod
    @Parameters(value={"browserName"})  //picking up the value from testng  which will be inserting from below step and that will be passing via setupdriver method
    public void beforeMethodMethod (String browserName, Method testMethod){  // accordingly driver will be initiated
        logger = extent.createTest(testMethod.getName());
        setUpDriver(browserName);
        driver.manage().window().maximize();
        driver.get(Constants.url);
        implicitWait();
    }

    @AfterMethod
    public void afterMethodMethod(ITestResult result) {
        if(result.getStatus()==ITestResult.SUCCESS){
            String methodName = result.getMethod().getMethodName();
            String longText = "TestCase: " + methodName + " Passed";
            Markup m = MarkupHelper.createLabel(longText, ExtentColor.GREEN);
            logger.log(Status.PASS,m);
        }
        else if(result.getStatus()==ITestResult.FAILURE) {
            String methodName = result.getMethod().getMethodName();
            String longText = "TestCase: " + methodName + " Failed";
            Markup m = MarkupHelper.createLabel(longText, ExtentColor.RED);
            logger.log(Status.FAIL, m);
        }
        else if(result.getStatus()==ITestResult.SKIP) {
            String methodName = result.getMethod().getMethodName();
            String longText = "TestCase: " + methodName + " Skipped";
            Markup m = MarkupHelper.createLabel(longText, ExtentColor.BLUE);
            logger.log(Status.SKIP, m);
        }
        driver.quit();
    }

    @AfterTest
    public void afterTestMethod() {
        extent.flush();
    }

    public void setUpDriver (String browserName) {
        if(browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("ff")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "geckodriver.exe");
            driver = new FirefoxDriver();
        }
    }

    public void implicitWait() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void waitForElementToBeVisible(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch(Exception e) {
        }
    }

}
