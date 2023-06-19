package com.stc.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class STC {
	
	WebDriver driver=null; 
	
	
	@Test
	public void Amethod() {
		
		WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://subscribe.stctv.com/");	}
	
	
	@Test 
	public void Bmethod() throws InterruptedException {
		//To click on Country field 
		    driver.findElement(By.xpath("//div[@id='country']")).click();
		    //Choose the country as  KSA 
		    driver.findElement(By.xpath(" //div[@id='sa-contry-flag']//img[@alt='sa'] ")).click();
		    //Choose Subscription 
		    driver.findElement(By.xpath("//a[@id='لايت-selection']")).click();
		    
	        WebElement web1 = driver.findElement(By.xpath("//span[@id='order-tier-price']"));

	 	    String CurrencyAndPrice= web1.getText(); 
		 	   Thread.sleep(5000);

	 	    
	 	      System.out.println("the Subscription is LITE and the price is  "+ CurrencyAndPrice);
	 	     driver.navigate().back();
	 	     
	 	     //Return to subscription page
	 	    driver.get("https://subscribe.stctv.com/");	

		    driver.findElement(By.xpath("//a[@id='الأساسية-selection']")).click();
		    
	        WebElement web2 = driver.findElement(By.xpath("//span[@id='order-tier-price']"));

	 	    String CurrencyAndPrice2= web2.getText(); 
	 	   Thread.sleep(5000);
	 	   
	 	      System.out.println("the Subscription is CLASSIC and the price is  "+ CurrencyAndPrice2);
		 	     driver.navigate().back();
		 	     
		 	     
		 	     //Return to subscription page
		 		driver.get("https://subscribe.stctv.com/");	

				
			    driver.findElement(By.xpath("//a[@id='بريميوم-selection']")).click();
			    
		        WebElement web3 = driver.findElement(By.xpath("//span[@id='order-tier-price']"));

		 	    String CurrencyAndPrice3= web3.getText(); 
		 	    
		 	      System.out.println("the Subscription is PREMIUM and the price is  "+ CurrencyAndPrice3);
		 	     Thread.sleep(5000);   
		 	     
		 	    driver.navigate().back();
	}
	
	
	  @Test 
	  
	public void Cmethod() throws InterruptedException {
		
 		driver.get("https://subscribe.stctv.com/");	

		//To click on Country field 
	    driver.findElement(By.xpath("//div[@id='country']")).click();
	    //Choose the country as  BH
   driver.findElement(By.xpath("//img[@alt='bh']")).click();
	    //Choose Subscription 
	    driver.findElement(By.xpath("//a[@id='لايت-selection']")).click();
	    
        WebElement web1 = driver.findElement(By.xpath("//span[@id='order-tier-price']"));

 	    String CurrencyAndPrice= web1.getText(); 
	 	   Thread.sleep(5000);

 	    
 	      System.out.println("the Subscription is LITE and the price is  "+ CurrencyAndPrice);
 	     driver.navigate().back();
 	     
 	     //Return to subscription page
 	    driver.get("https://subscribe.stctv.com/bh-ar");	

	    driver.findElement(By.xpath("//a[@id='الأساسية-selection']")).click();
	    
        WebElement web2 = driver.findElement(By.xpath("//span[@id='order-tier-price']"));

 	    String CurrencyAndPrice2= web2.getText(); 
 	   Thread.sleep(10000);
 	   
 	      System.out.println("the Subscription is CLASSIC and the price is  "+ CurrencyAndPrice2);
	 	     driver.navigate().back();
	 	     
	 	     
	 	     //Return to subscription page
	 		driver.get("https://subscribe.stctv.com/bh-ar");	

			
		    driver.findElement(By.xpath("//a[@id='بريميوم-selection']")).click();
		    
	        WebElement web3 = driver.findElement(By.xpath("//span[@id='order-tier-price']"));

	 	    String CurrencyAndPrice3= web3.getText(); 
	 	    
	 	      System.out.println("the Subscription is PREMIUM and the price is  "+ CurrencyAndPrice3);
	 	     Thread.sleep(10000);   
	}
	
	 
	@Test 
	  public void Dmethod() throws InterruptedException {
		

 		driver.get("https://subscribe.stctv.com/");	

		//To click on Country field 
	    driver.findElement(By.xpath("//div[@id='country']")).click();
	    //Choose the country as  BH
   driver.findElement(By.xpath("//img[@alt='kw']")).click();
	    //Choose Subscription 
	    driver.findElement(By.xpath("//a[@id='لايت-selection']")).click();
	    
        WebElement web1 = driver.findElement(By.xpath("//span[@id='order-tier-price']"));

 	    String CurrencyAndPrice= web1.getText(); 
	 	   Thread.sleep(5000);

 	    
 	      System.out.println("the Subscription is LITE and the price is  "+ CurrencyAndPrice);
 	     driver.navigate().back();
 	     
 	     //Return to subscription page
 	    driver.get("https://subscribe.stctv.com/kw-ar");	

	    driver.findElement(By.xpath("//a[@id='الأساسية-selection']")).click();
	    
        WebElement web2 = driver.findElement(By.xpath("//span[@id='order-tier-price']"));

 	    String CurrencyAndPrice2= web2.getText(); 
 	   Thread.sleep(10000);
 	   
 	      System.out.println("the Subscription is CLASSIC and the price is  "+ CurrencyAndPrice2);
	 	     driver.navigate().back();
	 	     
	 	     
	 	     //Return to subscription page
	 		driver.get("https://subscribe.stctv.com/kw-ar");	

			
		    driver.findElement(By.xpath("//a[@id='بريميوم-selection']")).click();
		    
	        WebElement web3 = driver.findElement(By.xpath("//span[@id='order-tier-price']"));

	 	    String CurrencyAndPrice3= web3.getText(); 
	 	    
	 	      System.out.println("the Subscription is PREMIUM and the price is  "+ CurrencyAndPrice3);
	 	     Thread.sleep(10000);   
		
		
	}
	
	
	@Test
	public void Emethod() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
