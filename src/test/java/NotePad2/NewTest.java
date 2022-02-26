package NotePad2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  
	// define the chrome driver
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");

	   // define the drive instance
	  WebDriver driver = new ChromeDriver();
	  // nagivate the browser to this url
	  driver.get("http://localhost:8091/NotePad2/NoteServlet/dashboard");
	  
	  //CREATE/ADD USER
	  
	  WebElement add = driver.findElement(By.name("add"));
	  
	  add.click();
	  
	  WebElement username = driver.findElement(By.name("userName"));
	  
	  WebElement title = driver.findElement(By.name("title"));
	  
	  WebElement description = driver.findElement(By.name("description"));
	  
	  WebElement submit = driver.findElement(By.name("submit"));
	  
	  username.sendKeys("TESTNG");
	  
	  title.sendKeys("TESTNG");
	  
	  description.sendKeys("TESTNG");
	  
	  submit.click();
	  
	  //EDIT
	  
	  WebElement edit = driver.findElement(By.name("editTESTNG"));
	  
	  edit.click();
	  
	  WebElement title2 = driver.findElement(By.name("title"));
	  
	  WebElement details = driver.findElement(By.name("details"));
	  
	  title2.clear();
	  
	  details.clear();
	  
	  title2.sendKeys("TESTNG EDITED");
	  
	  details.sendKeys("TESTNG EDITED");
	  
	  WebElement editsave = driver.findElement(By.name("editsave"));
	  
	  editsave.click();
	  
	  //DELETE USER
	  
	  WebElement delete = driver.findElement(By.name("deleteTESTNG"));
	  
	  delete.click();
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
