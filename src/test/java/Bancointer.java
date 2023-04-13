import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bancointer {
	
	
	
    WebDriver driver;
	@Before
	public void setUp() throws Exception {
		// código para indicar o navegador
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		// comando para chamar o drive dentro do before
		driver = new ChromeDriver();
		// comando para indicar url
		//driver.get("https://www.bancointer.com.br/");
		driver.get("https://www.4devs.com.br/gerador_de_pessoas/");
		// comando para maximizar a tela
		driver.manage().window().maximize();
		// comando para intragir com o elemento
		//driver.findElement(By.cssSelector("#gatsby-focus-wrapper > div > header > section > div > div > div > div > div.styles__LogoNIcons-sc-1gbjc3e-6.gjJzHM > div.styles__SearchNFlags-sc-1gbjc3e-8.yVPnY > div.styles__ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)")).click();
		driver.findElement(By.id("idade")).sendKeys("20");
		driver.findElement(By.id("cep_estado")).sendKeys("SP");
		Thread.sleep(3000);
		driver.findElement(By.id("cep_cidade")).sendKeys("São Paulo");
		driver.findElement(By.cssSelector("#bt_gerar_pessoa")).click();
		
		Thread.sleep(3000);
		String nome = driver.findElement(By.cssSelector("#nome")).getText();
		System.out.println(nome);
		
		String telefone = driver.findElement(By.cssSelector("#celular")).getText();
		System.out.println(telefone);
		
		String email = driver.findElement(By.cssSelector("#email")).getText();
		System.out.println(email);
		
		String cpf = driver.findElement(By.cssSelector("#cpf")).getText();
		System.out.println(cpf);
		
		String nasc = driver.findElement(By.cssSelector("#data_nasc")).getText();
		System.out.println(nasc);
		
		Thread.sleep(4000);
		driver.quit();
		
		Thread.sleep(3000);
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		// comando para chamar o drive dentro do before
		driver = new ChromeDriver();
		// comando para indicar url
		driver.get("https://www.bancointer.com.br/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#gatsby-focus-wrapper > div > header > section > div > div > div > div > div.styles__LogoNIcons-sc-1gbjc3e-6.gjJzHM > div.styles__SearchNFlags-sc-1gbjc3e-8.yVPnY > div.styles__ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.id("nome")).sendKeys(nome);
		driver.findElement(By.id("celular")).sendKeys(telefone);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("cpf")).sendKeys(cpf);
		driver.findElement(By.id("dataNascimento")).sendKeys(nasc);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div:nth-child(6) > div > label")).click();
		driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div.col-12.text-center > button")).click();

		
				
		// comando para campo nome e preenchimento
		//Thread.sleep(2000);
		/*driver.findElement(By.id("nome")).sendKeys("Teste Flash Code");
		driver.findElement(By.id("celular")).sendKeys("11111111111");
		driver.findElement(By.id("email")).sendKeys("thais@gmail.com");
		driver.findElement(By.id("cpf")).sendKeys("21771585080");
		driver.findElement(By.id("dataNascimento")).sendKeys("11/11/1994");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div:nth-child(6) > div > label")).click();
		driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div.col-12.text-center > button")).click();*/

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException  {
		Thread.sleep(3000);
		String texto = driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center.sent > div > p")).getText();
		System.out.println(texto);
		assertEquals("Recebemos os seus dados.", texto);
		
		
		
	}

}
