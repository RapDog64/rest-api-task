package task2;

import org.testng.annotations.DataProvider;

public class NumberDataProvider {

    @DataProvider(name = "numbers")
    public Object[][] numbers() {
        return new Integer[][] {
                {-150_000, -150_000, -300_000},
                {-1, 4, 3},
                {-43, 0, -43},
                {-0, +0, 0},
                {-0, 4, 4},
                {1, 4, 5},
                {9, 3, 12},
                {99, 11, 110},
                {5_000, 15_000, 20_000},
                {350_000, -150_000, 200_000},
        };
    }
}
