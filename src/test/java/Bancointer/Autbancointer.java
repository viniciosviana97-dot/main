package Bancointer;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Autbancointer {

	
	
WebDriver driver;

		@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe" );
	  driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://inter.co/");
		
		}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
		
	}

	//@Ignore
	@Test
	public void testeaberturadeconta () throws Exception {
		
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("vinicios viana");
		
		Thread.sleep(2000);
		String texto= driver.findElement(By.xpath("(//h2)[9] ")).getText();
		assertEquals("Abra agora sua Conta Digital", texto);
		System.out.println("valor da variavel texto: " + texto);
		driver.findElement(By.id("phone")).sendKeys("77988556699");	
driver.findElement(By.id("email")).sendKeys("vinicios.10@gmail.com");
driver.findElement(By.id("socialId")).sendKeys("00413584739");
	driver.findElement(By.id("dateOfBirth")).sendKeys("01122000");	
	driver.findElement(By.cssSelector("body > div.sc-dILkzW.jmczzn > div.sc-hUheUT.eReyjh > div > form > div.sc-jNDflC.RXypR > label")).click();
	driver.findElement(By.cssSelector("body > div.sc-dILkzW.jmczzn > div.sc-hUheUT.eReyjh > div > form > button")).click();

	}	
		
	}


