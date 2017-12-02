package db1.workshop;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
	WebDriver driver;
	WebDriverWait wait;
	TestPo test;

	@Before
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\eclipse-workspace\\workshop\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 2);

		test = new TestPo(driver, wait);
	}

	@After
	public void tearDown() {

		driver.quit();
	}

	@org.junit.Test
	public void testSusessfullLogin() throws InterruptedException {
		test.acessaPaginaLogin("https://www.google.com.br/");
		test.preenchePesquisa("db1");
		test.clicaEmPesquisar();

		// exemplo vomitando o código sem usar pageobjects
		// funciona, porém fica feio e dificil de dar manutenção
		String retorno = driver.findElement(By.xpath("//*[@id=\'rso\']/div[1]/div/div/div/div/h3/a")).getText();
		assertTrue(retorno.equals("DB1 Global Software"));

	}

}
