package task2;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProductionReadyTaskTest {

    private ProductionReadyTask productionTask;

    @BeforeClass
    public void intialize() {
        productionTask = new ProductionReadyTask();
    }

    @Test(dataProvider = "numbers", dataProviderClass = NumberDataProvider.class)
    public void shouldAddTwoToFour(int firstNumber, int secondNumber, int expResult) {
        int sum = productionTask.sum(firstNumber, secondNumber);
        Assert.assertEquals(expResult, sum);
    }
}