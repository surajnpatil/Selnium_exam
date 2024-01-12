package lab_exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestExam {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CDAC\\Desktop\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		System.out.println(d.getCurrentUrl());
		d.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("Suraj");
		d.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("Patil");
		d.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")).sendKeys("9657527735");
		d.findElement(By.xpath("//input[@id='userName']")).sendKeys("surajpatil@gmail.com");
		d.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]")).sendKeys("Sadashiv peth ");
		d.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).sendKeys("Pune");
		d.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]")).sendKeys("Maharashtra");
		d.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]")).sendKeys("411030");
		Select country=new Select(d.findElement(By.xpath("//tbody/tr[11]/td[2]/select[1]")));
		country.selectByValue("INDIA");
		d.findElement(By.xpath("//input[@id='email']")).sendKeys("surya");
		d.findElement(By.xpath("//tbody/tr[14]/td[2]/input[1]")).sendKeys("123");
		d.findElement(By.xpath("//tbody/tr[15]/td[2]/input[1]")).sendKeys("123");
		d.findElement(By.xpath("//tbody/tr[17]/td[1]/input[1]")).click();
		d.findElement(By.xpath("//a[contains(text(),'sign-in')]")).click();
		d.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("surya");
		d.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("123");
		
		System.out.println(d.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).getAttribute("value"));
		System.out.println(d.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).getAttribute("value"));
		
		d.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		
		
		
		
		
		

	}

}
