
package qualquer;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testebusca {
private WebDriver driver;

@Before
public void abrirNavegador() {
	System.setProperty("webdriver.chrome,driver" ,"C:\\Program Files\\ChromeDriver\\Chromedriver.exe");
	driver = new ChromeDriver();	
	
	driver.manage().window().maximize();
 }

//@Test
//public void TesteNavegador(){
//	driver.get("https://www.google.com/");
//	driver.findElement(By.id("busca1_txtFiltro")).sendKeys("gestão");
//	driver.findElement(By.id("Busca1_btnBusca")).click();
//	}

@Test
public void TesteNavegador(){
	driver.get("https://www.amazon.com.br/");
	driver.findElement(By.id("teotabsearchtextbox")).sendKeys("Playstation");
	driver.findElement(By.id("Busca1_btnBusca")).sendKeys(Keys.RETURN);
	}
}
