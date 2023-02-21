package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public static WebDriver driver;
	   
	  @FindBy(id="username")
	  private WebElement user;
	  
	  @FindBy(xpath="//input[@name='password']")
	  private WebElement pass;
		   
	  @FindBy(id="login")
	  private WebElement login_Btn;
	  
	  public  Login(WebDriver driver2) {
	
		  Login.driver=driver2;
		  PageFactory.initElements(driver, this);
	  }
	  
	  @FindBy(xpath="//select[@name='location']")
	  private WebElement location;
	  
	  @FindBy(xpath="//select[@name='hotels']")
	  private WebElement hotels;
	  
	  @FindBy(xpath="//select[@name='room_type']")
	  private WebElement Room_type;
	  
	  @FindBy(xpath="//select[@name='room_nos']")
	  private WebElement Room_nos;
	  
	  @FindBy(xpath="//input[@name='datepick_in']")
	  private WebElement check_in;
	  
	  @FindBy(xpath="//input[@name='datepick_out']")
	  private WebElement check_out;
	  
	  @FindBy(xpath="//select[@name='adult_room']")
	  private WebElement adult_room;
	  
	  @FindBy(xpath="//select[@name='child_room']")
	  private WebElement child_room;
	  
	  @FindBy(xpath="//input[@name='Submit']")
	  private WebElement search_btn;
	  
	  @FindBy(xpath="//input[@name='radiobutton_0']")
	  private WebElement search_hotel;
	  
	  @FindBy(xpath="//input[@name='continue']")
	  private WebElement continue_btn;
	  
	  @FindBy(xpath="//input[@name='first_name']")
	  private WebElement name;
	 
	  @FindBy(xpath="//input[@name='last_name']")
	  private WebElement last_name;
	  
	  @FindBy(xpath="//textarea[@id='address']")
	  private WebElement address;
	  
	  @FindBy(xpath="//input[@id='cc_num']")
	  private WebElement credit_no;
	  
	  @FindBy(xpath="//select[@id='cc_type']")
	  private WebElement cretid_type;
	  
	  @FindBy(xpath="//select[@id='cc_exp_month']")
	  private WebElement expiry_date;
	  
	  @FindBy(xpath="//select[@id='cc_exp_year']")
	  private WebElement expiry_date1;
	
	  @FindBy(xpath="//input[@name='cc_cvv']")
	  private WebElement cvv_no;
	  
	  @FindBy(xpath="//input[@name='book_now']")
	  private WebElement book_now;
	  
	  @FindBy(xpath="//input[@id='logout']")
	  private WebElement logout_btn;

	

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin_Btn() {
		return login_Btn;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return Room_type;
	}

	public WebElement getRoom_nos() {
		return Room_nos;
	}

	public WebElement getCheck_in() {
		return check_in;
	}

	public WebElement getCheck_out() {
		return check_out;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	public WebElement getSearch_btn() {
		return search_btn;
	}

	public WebElement getSearch_hotel() {
		return search_hotel;
	}

	public WebElement getContinue_btn() {
		return continue_btn;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCredit_no() {
		return credit_no;
	}

	public WebElement getCretid_type() {
		return cretid_type;
	}

	public WebElement getExpiry_date() {
		return expiry_date;
	}

	public WebElement getExpiry_date1() {
		return expiry_date1;
	}

	public WebElement getCvv_no() {
		return cvv_no;
	}

	public WebElement getBook_now() {
		return book_now;
	}
	public WebElement getLogout_btn() {
		return logout_btn;
	}
	
	 
	
	
	
	}
	  
	
	  
	  
	  
	  
	  
	
	


