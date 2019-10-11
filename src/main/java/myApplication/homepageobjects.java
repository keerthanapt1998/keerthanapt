package myApplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepageobjects extends basepage {
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/a")
	 WebElement Women;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	 WebElement Dresses;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[3]/a")
	 WebElement TShirts;
	
	@FindBy(xpath="//*[@id=\'block_top_menu\']/ul/li[2]/a")
	WebElement SelectDresses;
	
	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']/li[1]/label/a")
	WebElement SelectSize;
	
	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_3']/li[7]/label/a")
	 WebElement Selectcolor;
	
	@FindBy(xpath="//*[@id='newsletter-input']")
	WebElement NewsLetter;
	
	@FindBy(xpath="//*[@id='center_column']/div/div/div[3]/p[7]/button[1]")
	WebElement Tweet;
	
	@FindBy(xpath="//*[@id='center_column']/div/div/div[3]/p[7]/button[2]")
	WebElement Share;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
	WebElement image;
	
	@FindBy(xpath="//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span")
	WebElement AddToCart;
	
	public homepageobjects() {
		PageFactory.initElements(driver, this);

	}
	 public WebElement WomenfromSite() {
		return Women;
	}
	
	 public WebElement DressesfromSite() {
		return Dresses;
	}
	
	public WebElement TShirtfromSite() {
		return TShirts;
	}
	
	public WebElement SelectionOfDress() {
		return SelectDresses;
	}
    public WebElement SelectSize() {
    	return SelectSize;
    }
    public WebElement SelectColor() {
    	return Selectcolor;
 
    }
	public WebElement Tweeting() {
		return Tweet;
	}
	public WebElement sharing() {
		return Share;
	}
	public WebElement NewsLetter() {
		return NewsLetter;
	}
	public WebElement image() {
		return image;
	}
	public WebElement AddToCart() {
		return AddToCart;
	}
	public WebElement TShirts() {
		return TShirts;
	}
	
	}
	
