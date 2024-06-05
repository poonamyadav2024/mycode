package com.demo.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

public class GenericMethod {

	public WebDriver driver;
	 private ExtentSparkReporter extSparkReport;
	public ExtentReports ext;
	public ExtentTest logger;

	// Method to launch the browser based on the given browser name
	public void launchBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			driver = new ChromeDriver(options);
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			driver = new FirefoxDriver(options);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public void hitUrl(String url) {

		driver.get(url);

	}

	public void inputData(WebElement we, String value) {
		we.clear();
		we.sendKeys(value);

	}

	public void click(WebElement we) {
		we.click();

	}

	public void moveToElrmrnt(WebElement we) {
		Actions act = new Actions(driver);
		act.moveToElement(we).build().perform();
	}

	public void GetTextAllElement(List<WebElement> we) {
		ArrayList<String> ls = new ArrayList<String>();
		for (WebElement allElement : we) {

			String text = allElement.getText();
			allElement.click();
			System.out.println(text);

		}

	}

	public void closeBrowser() {

		driver.quit();
	}

	public void verifyText(String Expected, WebElement we) {

		String Actual = we.getText();

		if (Expected.equals(Actual)) {

			System.out.println("Passed..." + "Actual String :-  " + Actual);

		} else {
			System.out.println("Failed....");
		}

	}
	
	
	public  void extentReportinitReport(String testcase){
	
	 extSparkReport=	new ExtentSparkReporter("report testRepoter.html");
	 ext=new ExtentReports();
	 ext.attachReporter(extSparkReport);
	 logger= ext.createTest("testcasename like validLogin");

	ext.setSystemInfo("UserName", System.getProperty("user.name"));
	ext.setSystemInfo("OS Name", System.getProperty("os.name"));
	ext.setSystemInfo("ProcessorName", System.getProperty("os.arch"));
	ext.setSystemInfo("userName", System.getProperty("user.name"));
	
	logger.log(Status.INFO, "user is able to pass username(poonam)");
	logger.log(Status.INFO, "user is able to pass password(poonam123)");
	logger.log(Status.INFO, "user clicked on login button()");
	logger.log(Status.PASS, "user lands on homepage()");
	
	ext.flush();
	
	
	}
	public void snapShot(String target,String source) {

		TakesScreenshot ts=(TakesScreenshot)driver;
		File frm=ts.getScreenshotAs(OutputType.FILE);
		File to=new File("report//ts.png");
		try {
			Files.copy(frm, to);
		} catch (IOException e) {
			
			e.printStackTrace();
			logger.log(Status.INFO, "snapshote for this element");
		}
		
	}

	}


