package steps;

import java.sql.Driver;

import org.apache.jasper.Options;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class buy {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\FARHAD\\Downloads\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		options.addArguments("--incognito");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--disable-popup-blocking");
		WebDriver web=new ChromeDriver(options);
		web.get("https://demo.opencart.com/");
		web.manage().window().maximize();
		
		WebElement account;
		account=web.findElement(By.className("fa-user"));
		account.click();
		
		web.get("https://demo.opencart.com/index.php?route=account/login");
		
		WebElement email;
		email=web.findElement(By.id("input-email"));
		email.sendKeys("farhad.javed@yahoo.com");
		
		WebElement password;
		password=web.findElement(By.id("input-password"));
		password.sendKeys("qwerty");
		
		WebElement login;
		login = web.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		
		web.get("https://demo.opencart.com/index.php?route=product/category&path=33");
		
		web.get("https://demo.opencart.com/index.php?route=product/product&path=33&product_id=31");
		
		
		WebElement cart;
		cart = web.findElement(By.id("button-cart"));
		cart.click();
		
		WebElement carts;
		carts = web.findElement(By.id("cart-total"));
		carts.click();
		
		WebElement checkout;  
		checkout = web.findElement(By.className("fa-share"));
		checkout.click();
		
		WebElement check;
		check = web.findElement(By.className("btn-primary"));
		//contact.click();
		
		//through link
		JavascriptExecutor jse=(JavascriptExecutor)web;
		jse.executeScript("arguments[0].scrollIntoView()", check);
		
		Thread.sleep(2000);
		 
		WebElement checklink = web.findElement(By.linkText("Checkout"));
		checklink.click();
		
		
		
		
		
		
		


	}

}
