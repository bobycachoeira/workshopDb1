package db1.workshop;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestPo {



	private static final By campoPesquisa = By.id( "lst-ib" );
    private static final By btnpesquisa = By.name( "btnK" );
    WebDriver driver;
    WebDriverWait wait;
    
   
    public TestPo( WebDriver driver, WebDriverWait wait ) {
        this.driver = driver;
        this.wait = wait;
    }
    
    
    public void acessaPaginaLogin(String url) {
        driver.get( url );
    }
    
    public void preenchePesquisa( String sPesquisa ) {
        driver.findElement( campoPesquisa ).sendKeys( sPesquisa );
    }

    
    public void clicaEmPesquisar () {
    	driver.findElement( btnpesquisa ).click();
    }

}
