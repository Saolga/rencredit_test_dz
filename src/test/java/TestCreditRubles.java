import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import steps.BaseSteps;
import steps.CalcSteps;
import steps.MainSteps;

public class TestCreditRubles extends BaseSteps {
    MainSteps mainsteps=new MainSteps();
    CalcSteps calcsteps = new CalcSteps();

    @DisplayName("Вклад рубли")
    @Test
    public void  testMenuRubles() {
        mainsteps.selectItem("Калькулятор");
        calcsteps.containsTitle("Рассчитайте доходность по вкладу");
        calcsteps.chooseMoney("Рубли");
        calcsteps.inputMoney("2000000");
        calcsteps.selectDuration("6");
        calcsteps.setReplenish("30000");
        calcsteps.setCheckbox("Ежемесячная капитализация");
        calcsteps.setCheckbox("Частичное снятие");
        calcsteps.rightStavka("6.25%");
        calcsteps.rightEarned("65 132,87");
        calcsteps.rightRep("150 000");
        calcsteps.rightResult("2 215 132,87");
    }
}
