package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CalcPage extends  BasePage{

    @FindBy(xpath = "//h2[@class='calculator-block__title block-title']")
    public WebElement title;

    @FindBy(xpath = "//label[@class='calculator__currency-field']")
    List<WebElement> moeny;

    @FindBy(xpath = "//input[@name='amount']")
    public  WebElement moneyAmount;

    @FindBy(xpath = "//input[@name='replenish']")
    public WebElement replenish;

    @FindBy(xpath = "//div[text()='Ставка ']/span/span")
    public WebElement stavka;
    @FindBy(xpath = "//span[@class='js-calc-earned']")
    public WebElement earned;
    @FindBy(xpath = "//span[@class='js-calc-replenish']")
    public  WebElement replenished;
    @FindBy(xpath = "//span[@class='js-calc-result']")
    public  WebElement result;


    public void containstitle(String name){

        Assert.assertEquals("Неправильный заголовок", title.getText(), name);
    }

    public void choosemoney(String name){
        selectCollectionItem(name,moeny);

    }
    public void inputmoney(String value){
        fillField(moneyAmount,value);

    }
    public void selectduration(String value){
        WebElement w = driver.findElement(By.tagName("select"));
        Select s=new Select(w);
        s.selectByValue(value);
    }
    public void setreplenish(String value){

        fillField(replenish,value);
    }
    public void setcheckbox(String name) {
        WebElement checkbox=driver.findElement(By.xpath("//span[contains(text(),'"+name+"')]/ancestor::label//div[contains(@class,'calculator')]"));
        checkbox.click();
        waitVisibilityOf(stavka,20);
    }
    public void rightstavka(String value){
        try {
            Thread.sleep(10000);        //для прогрузки их калькулятора
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //waitVisibilityOf(stavka,20);
        Assert.assertEquals("Неверное значение", stavka.getText(), value);
    }
    public void rightearned(String value){

        Assert.assertEquals("Неверное значение", earned.getText(), value);
    }
    public void rightrep(String value){

        Assert.assertEquals("Неверное значение", replenished.getText(), value);
    }
    public void rightresult(String value){

        Assert.assertEquals("Неверное значение", result.getText(), value);
    }

}
