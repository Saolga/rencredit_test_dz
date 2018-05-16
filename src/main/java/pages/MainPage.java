package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage{
    @FindBy(xpath = "//div[@class='service__title-text']")
    List<WebElement> mainItems;         //вклады, кредит, страхование

@FindBy(xpath = "//div[@class='service__title-text']//ancestor::div[@class='service']//a[@class='service__links-item']")
    List<WebElement> ss;

    final String item="//div[@class='service']//a[@class='service__links-item']";

    @FindBy(xpath = "//div[text()='Вклады']//ancestor::div[@class='service']//a[@class='service__links-item']")
    List<WebElement> subItems;


    public void selectitem(String name){
        selectCollectionItem(name,subItems);
    }
}
