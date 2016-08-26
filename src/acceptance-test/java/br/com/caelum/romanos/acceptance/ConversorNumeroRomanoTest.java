package br.com.caelum.romanos.acceptance;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConversorNumeroRomanoTest {

	public static String BASE_URL = "http://localhost:8080";
	private static WebDriver browser;

	@BeforeClass
	public static void abreBrowser() {
		browser = new FirefoxDriver();
	}

	@AfterClass
	public static void teardown() {
		browser.close();
	}

	@Test
	public void deveConverterNumerosAte3999ParaRomanos() throws Exception {
        String numero = "3999";

        browser.get(BASE_URL);

        WebElement form = browser.findElement(By.id("form"));
        form.findElement(By.name("numero")).sendKeys(numero);
        form.submit();

        WebElement romano = browser.findElement(By.id("romano"));

        assertEquals("MMMCMXCIX", romano.getText());
	}

}
