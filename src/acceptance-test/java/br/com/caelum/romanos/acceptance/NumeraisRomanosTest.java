package br.com.caelum.romanos.acceptance;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NumeraisRomanosTest {

	public static String BASE_URL = "http://localhost:8080";
	private static WebDriver browser;

	@BeforeClass
	public static void abreBrowser() {
		browser = new FirefoxDriver();
	}

	@AfterClass
	public static void teardown() {
//		browser.close();
	}

	@Test
	public void deveConverterInteirosAte3999ParaNumerosRomanos() throws Exception {
	    browser.get(BASE_URL);
	    
	    WebElement form = browser.findElement(By.id("form"));
        String numero = "3999";
        form.findElement(By.name("numero")).sendKeys(numero);
        form.submit();
        
        WebElement romano = browser.findElement(By.id("romano"));
        assertThat(romano.getText(), containsString("MMMCMXCIX"));
	}
	
}
