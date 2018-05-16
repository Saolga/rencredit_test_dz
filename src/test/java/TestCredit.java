import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import steps.BaseSteps;
import steps.CalcSteps;
import steps.MainSteps;

public class TestCredit extends BaseSteps {
    MainSteps mainsteps=new MainSteps();
    CalcSteps calcsteps = new CalcSteps();

    @DisplayName("Вклад доллары")
    @Test
    public void  testMenuDollars() {
        mainsteps.selectItem("Калькулятор");
        calcsteps.containsTitle("Рассчитайте доходность по вкладу");
        calcsteps.chooseMoney("Доллары США");
        calcsteps.inputMoney("50000");
        calcsteps.selectDuration("9");
        calcsteps.setReplenish("1000");
        calcsteps.setCheckbox("Ежемесячная капитализация");
        calcsteps.rightStavka("0.75%");
        calcsteps.rightEarned("301,42");
        calcsteps.rightRep("8 000");
        calcsteps.rightResult("58 301,42");
    }

}
