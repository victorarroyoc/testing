package Automatizacion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class primeraclase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Crear una nueva instancia de Firefox
		String MostrarResultado;
		String Price1;
		String Price2;
		String Price3;
		String Price4;
		String Price5;
		
		String Product1;
		String Product2;
		String Product3;
		String Product4;
		String Product5;
		
		System.setProperty("webdriver.gecko.driver","C:\\automatizacion\\gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		// Abrir la página web Ebay
		
		driver.get("https://www.ebay.com");
		System.out.println("Se abrió la página exitosamente");

		// Esperar 2 segundos
				Thread.sleep(2000);
				
		// Iniciar la página en el idioma inglés
		
		driver.findElement(By.xpath("/html/body/div[3]/div/header/div/ul[2]/li[1]/div/a/span[2]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/header/div/ul[2]/li[1]/div/div/ul/li/a/span[2]")).click();
		
		// Search for shoes - Select brand PUMA - Select size 10
			// Shoes
				driver.findElement(By.id("gh-ac")).sendKeys("shoes");
				driver.findElement(By.id("gh-btn")).click();

				// Esperar 1 segundos
				Thread.sleep(1000);

			// Size 10
				driver.findElement(By.id("e1-29")).click();
				// Esperar 1 segundos
				Thread.sleep(1000);

			// Brand PUMA
				driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[3]/div/div/div[1]/div[2]/div[2]/div[2]/div/div[7]/a/span")).click();
				// Esperar 1 segundos
				Thread.sleep(1000);

		// Print the number of results
			
			WebElement elemento = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/div/div[3]/h1/span[1]"));
			MostrarResultado = elemento.getText();
			System.out.println("The number of results ::> "+MostrarResultado);

		// Order by price ascendant -- replaced by [Price:Highest first] because there is not one
			driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/div/div[2]/div[1]/ul[1]/li/div/a")).click();
			driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/div/div[2]/div[1]/ul[2]/li[5]/a")).click();
			Thread.sleep(1000);
			
		// 7-Assert the order taking the first 5 results | 8-Take the first 5 products with their prices and print them in console.
			
			WebElement ElementoProduct1= driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[1]/div/div[1]/div/div[3]/div/div[1]/div/w-root/div/div/ul/li[1]/div/div[2]/h3/a"));
			Product1 = ElementoProduct1.getText();
			System.out.println("Product 1 ::> "+Product1);

			WebElement ElementoPrice1= driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[1]/div/div[1]/div/div[3]/div/div[1]/div/w-root/div/div/ul/li[1]/div/div[3]/div/span[1]"));
			Price1 = ElementoPrice1.getText();
			System.out.println("Price 1 ::> "+Price1);

			WebElement ElementoProduct2= driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[1]/div/div[1]/div/div[3]/div/div[1]/div/w-root/div/div/ul/li[2]/div/div[2]/h3/a"));
			Product2 = ElementoProduct2.getText();
			System.out.println("Product 2 ::> "+Product2);

			WebElement ElementoPrice2= driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[1]/div/div[1]/div/div[3]/div/div[1]/div/w-root/div/div/ul/li[2]/div/div[3]/div[2]/span[1]"));
			Price2 = ElementoPrice2.getText();
			System.out.println("Price 2 ::> "+Price2);
			
			WebElement ElementoProduct3= driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[1]/div/div[1]/div/div[3]/div/div[1]/div/w-root/div/div/ul/li[3]/div/div[2]/h3/a"));
			Product3 = ElementoProduct3.getText();
			System.out.println("Product 3 ::> "+Product3);

			
			WebElement ElementoPrice3= driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[1]/div/div[1]/div/div[3]/div/div[1]/div/w-root/div/div/ul/li[3]/div/div[3]/div[2]/div/span[1]/span"));
			Price3 = ElementoPrice3.getText();
			System.out.println("Price 3 ::> "+Price3);
			
			WebElement ElementoProduct4= driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[1]/div/div[1]/div/div[3]/div/div[1]/div/w-root/div/div/ul/li[4]/div/div[2]/h3/a"));
			Product4 = ElementoProduct4.getText();
			System.out.println("Product 4 ::> "+Product4);

			WebElement ElementoPrice4= driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[1]/div/div[1]/div/div[3]/div/div[1]/div/w-root/div/div/ul/li[4]/div/div[3]/div[2]/span[1]"));
			Price4 = ElementoPrice4.getText();
			System.out.println("Price 4 ::> "+Price4);
			
			WebElement ElementoProduct5= driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[1]/div/div[1]/div/div[3]/div/div[1]/div/w-root/div/div/ul/li[5]/div/div[2]/h3/a"));
			Product5 = ElementoProduct5.getText();
			System.out.println("Product 5 ::> "+Product5);

			
			WebElement ElementoPrice5= driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[1]/div/div[1]/div/div[3]/div/div[1]/div/w-root/div/div/ul/li[5]/div/div[3]/div[2]/span[1]"));
			Price5 = ElementoPrice5.getText();
			System.out.println("Price 5 ::> "+Price5);
				
		// Cerrar ventana
		driver.quit();
	}

}
