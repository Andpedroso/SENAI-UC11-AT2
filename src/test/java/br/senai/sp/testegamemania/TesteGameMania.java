package br.senai.sp.testegamemania;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteGameMania 
{
	private WebDriver driver;
	
	@Before
	public void Setup() 
	{
		System.setProperty( "webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe" );
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait( 2, TimeUnit.SECONDS );
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void TesteNavegador() 
	{
		driver.get( "http://localhost:4200/" );
		
		//Home - Teste do botão comprar e cancelar
		
		//driver.findElement( By.xpath( "/html/body/app-root/app-home/div/table/tbody/tr[1]/td[5]" ) ).click();
		
		//driver.manage().timeouts().implicitlyWait( 2, TimeUnit.SECONDS );
		
		//driver.findElement( By.xpath( "/html/body/app-root/app-comprar/div/div/div/button[2]" ) ).click();
		
		//Home - Teste do botão comprar e confirmar
		
		//driver.findElement( By.xpath( "/html/body/app-root/app-home/div/table/tbody/tr[2]/td[5]" ) ).click();
		
		//driver.findElement( By.xpath( "/html/body/app-root/app-comprar/div/div/div/button[1]" ) ).click();
		
		//Cadastro - Teste do menu Cadastro, inputs e cadastro
		
		/*
		driver.findElement( By.xpath( "/html/body/app-root/app-header/header/div/a[2]" ) ).click();
		
		WebElement input = driver.findElement( By.xpath( "/html/body/app-root/app-cadastro/div/div[1]/label[1]/input" ) );
		
		input.sendKeys( "André" );
		
		WebElement input2 = driver.findElement( By.xpath( "/html/body/app-root/app-cadastro/div/div[1]/label[2]/input" ) );
		
		input2.sendKeys( "Pedroso" );
		
		WebElement input3 = driver.findElement( By.xpath( "/html/body/app-root/app-cadastro/div/div[1]/label[3]/input" ) );
		
		input3.sendKeys( "35" );
		
		WebElement input4 = driver.findElement( By.xpath( "/html/body/app-root/app-cadastro/div/div[1]/label[4]/input" ) );
		
		input4.sendKeys( "Solteiro" );
		
		WebElement input5 = driver.findElement( By.xpath( "/html/body/app-root/app-cadastro/div/div[1]/label[5]/input" ) );
		
		input5.sendKeys( "19971694388" );
		
		WebElement input6 = driver.findElement( By.xpath( "/html/body/app-root/app-cadastro/div/div[1]/label[6]/input" ) );
		
		input6.sendKeys( "Desenvolvedor Web" );
		
		WebElement input7 = driver.findElement( By.xpath( "/html/body/app-root/app-cadastro/div/div[1]/label[7]/input" ) );
		
		input7.sendKeys( "ankpedroso@gmail.com" );
		
		driver.findElement( By.xpath( "/html/body/app-root/app-cadastro/div/div[1]/button" ) ).click();
		*/
		//Cadastro - Teste de inputs e cadastro de usuário para login
		
		//driver.findElement( By.xpath( "/html/body/app-root/app-header/header/div/a[2]" ) ).click();
		
		//WebElement input8 = driver.findElement( By.xpath( "/html/body/app-root/app-cadastro/div/div[2]/label[1]/input" ) );
		
		//input8.sendKeys( "usuarioteste2@mail.com" );
		
		//WebElement input9 = driver.findElement( By.xpath( "/html/body/app-root/app-cadastro/div/div[2]/label[2]/input" ) );
		
		//input9.sendKeys( "usuario2" );
		
		//driver.findElement( By.xpath( "/html/body/app-root/app-cadastro/div/div[2]/button" ) ).click();
		
		//Login - Teste de login com mensagens de erro ou sucesso
		/*
		
		driver.findElement( By.xpath( "/html/body/app-root/app-header/header/div/a[3]" ) ).click();
		
		WebElement inputEmail = driver.findElement( By.id( "email" ) );
		
		WebElement inputPassword = driver.findElement( By.id( "senha" ) );
		
		WebElement btn = driver.findElement( By.xpath( "/html/body/app-root/app-login/main/form/button" ) );
		
		String[] listaEmail = { "usuarioteste2@mail.com", "usuarioteste2@mail.com;--", "usuarioteste2@mail.com" };
		
		String[] listaSenhas = { "usuario", "usuario2", "usuario2" };
		
		for( int tentativas = 0; tentativas < 3; tentativas++ ) 
		{
			try 
			{
				inputEmail.clear();
				
				inputPassword.clear();
				
				inputEmail.sendKeys( listaEmail[ tentativas ] );
				
				inputPassword.sendKeys( listaSenhas[ tentativas ] );
				
				btn.click();
				
				Thread.sleep( 3000 );
			}
			catch( InterruptedException e ) 
			{
				e.printStackTrace();
			}
		}
		*/
		//Usuários - Teste do botão atualizar e update do Crud
		
		/*	
		driver.findElement( By.xpath( "/html/body/app-root/app-header/header/div/a[4]" ) ).click();
		
		driver.findElement( By.xpath( "/html/body/app-root/app-usuarios/div/table/tbody/tr[9]/td[8]" ) ).click();
		
		WebElement input10 = driver.findElement( By.xpath( "/html/body/app-root/app-update/div/div/label[1]/input" ) );
		
		input10.sendKeys( "André" );
				
		WebElement input11 = driver.findElement( By.xpath( "/html/body/app-root/app-update/div/div/label[2]/input" ) );
				
		input11.sendKeys( "Moura" );
				
		WebElement input12 = driver.findElement( By.xpath( "/html/body/app-root/app-update/div/div/label[3]/input" ) );
				
		input12.sendKeys( "18" );
				
		WebElement input13 = driver.findElement( By.xpath( "/html/body/app-root/app-update/div/div/label[4]/input" ) );
				
		input13.sendKeys( "Casado" );
				
		WebElement input14 = driver.findElement( By.xpath( "/html/body/app-root/app-update/div/div/label[5]/input" ) );
				
		input14.sendKeys( "19971694377" );
				
		WebElement input15 = driver.findElement( By.xpath( "/html/body/app-root/app-update/div/div/label[6]/input" ) );
				
		input15.sendKeys( "Desenvolvedor Web" );
				
		WebElement input16 = driver.findElement( By.xpath( "/html/body/app-root/app-update/div/div/label[7]/input" ) );
				
		input16.sendKeys( "usuarioteste1.com" );
				
		driver.findElement( By.xpath( "/html/body/app-root/app-update/div/div/button[1]" ) ).click();
		*/
		//Usuários - Teste do botão remover e delete do Crud
		
		//driver.findElement( By.xpath( "/html/body/app-root/app-header/header/div/a[4]" ) ).click();
		
		//driver.findElement( By.xpath( "/html/body/app-root/app-usuarios/div/table/tbody/tr[9]/td[9]" ) ).click();
		
		//driver.findElement( By.xpath( "/html/body/app-root/app-delete-user/div/div/div/button[1]" ) ).click();
	}
	
	@After
	public void FinalizarTeste() {}
}
