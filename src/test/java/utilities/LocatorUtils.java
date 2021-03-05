package utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 

public class LocatorUtils {
	
	WebDriver driver ; 
	
	
	public static void clickById(WebElement elementId) {
		String xpath = "//*[@id='"+elementId+"]";		
		WebElement element = Driver.getDriver().findElement(By.xpath(xpath)); 
		element.click(); 	
	}
	
	public static void clickByLabel(WebElement elementLabel) {
		String xpathLabel = "//label[@for="+elementLabel+"]";
		WebElement element = Driver.getDriver().findElement(By.xpath(xpathLabel)); 
		
		element.click(); 
	}
	
	public static void clickByComplexXpath(String tagName, String function, String value) {
		
		 String xpath = "//" + tagName + "[" + function + "(text(),'"+ value + "')]" ;		 
		 WebElement element = Driver.getDriver().findElement(By.xpath(xpath)); 
		 element.click(); 		
		
	}
	
	
	public static void setInputTextByID(WebElement elementId, String textValue) {
		String xpath_id = "//*[@id='"+elementId+"]";		
		WebElement element = Driver.getDriver().findElement(By.xpath(xpath_id));
		element.clear();
		element.sendKeys(textValue);		
	}
	
	
	public static void clickDropdownMenuByText() {


	}

	
	
	/*
	 *   context node means the node itself. 
	 * 
	 *   //interestedNode/ancestor::*               -> select all ancestor node of the the interestedNode node.
	 *   //ancestor::interestedNode                 -> select all ancestor of the interestedNode in context node. 
	 *   //child::*                                 -> select all child nodes of the context node.
	 *   //child::interestedNode                    -> select all child elements of interestedNode node. 
	 *   //interestedNode/parent::*                 -> select parent node of the interestedNode context node.
	 *   //interestedNode/parent::focusedNode       -> return result node if interestedNode is parent node of focusedNode , otherwise no node found. 
	 *   //interestedNodes/preceding::focusedNode   -> select all interestedNodes (with child nodes) before the focusedNode. 
	 *   //interestedNodes/following::focusedNode   -> select all node (with child node) after the context node. 
	 *   //focusedNode/self::*                      -> select the current node 'focusedNode' 
	 *   //descendant::focusedNode                  -> select all descendants of the focusedNode, namely, children, grand children, etc of the focusedNode 
	 *   
	 */

}
