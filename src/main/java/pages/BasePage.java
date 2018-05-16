package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

import java.util.List;

public class BasePage {
    WebDriver driver = BaseSteps.getDriver();


    public BasePage(){
        PageFactory.initElements(driver, this);
    }

    public void selectCollectionItem(String name, List<WebElement> collection){
        for (WebElement item : collection ){
            if (item.getText().equalsIgnoreCase(name)){
                item.click();
                return;
            }
        }
        Assert.fail("Не найден элмент коллекции - " + name);
    }

    public void fillField(WebElement w, String val){
        w.sendKeys(val);

    }
    public void waitVisibilityOf(WebElement loc, int timeout){
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOf(loc));
    }





}
