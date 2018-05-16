package steps;

import io.qameta.allure.Step;
import pages.CalcPage;

public class CalcSteps {

    @Step("Заголовок {0} присутсвует")
    public  void containsTitle(String name){

        new CalcPage().containstitle(name);
    }
    @Step("Выбор валюты {0}")
    public void chooseMoney(String value){
        new CalcPage().choosemoney(value);
    }
    @Step("Сумма вклада {0}")
    public void inputMoney(String value){
        new CalcPage().inputmoney(value);
    }
    @Step("Срок {0}")
    public void selectDuration(String value){
        new CalcPage().selectduration(value);
    }
    @Step("Ежемесячное пополнение {0}")
    public void setReplenish(String value){
        new CalcPage().setreplenish(value);
    }
    @Step("Отметить чекбокс {0}")
    public void setCheckbox(String name){
        new CalcPage().setcheckbox(name);
    }
    @Step("Ставка соответсвует {0}")
    public void rightStavka(String value){
        new CalcPage().rightstavka(value);
    }
    @Step("Начислено {0}")
    public void rightEarned(String value){
        new CalcPage().rightearned(value);
    }
    @Step("К пополнению {0}")
    public void rightRep(String value){
        new CalcPage().rightrep(value);
    }
    @Step("К пополнению {0}")
    public void rightResult(String value){
        new CalcPage().rightresult(value);
    }





}
