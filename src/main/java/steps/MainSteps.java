package steps;

import io.qameta.allure.Step;
import pages.MainPage;

public class MainSteps {

    @Step("выбор {0} в разделе вклады")
    public  void selectItem(String name){
        new MainPage().selectitem(name);
    }
}
