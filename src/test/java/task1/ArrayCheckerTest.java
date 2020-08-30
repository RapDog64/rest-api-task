package task1;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayCheckerTest {

    private ArrayChecker checker;

    @BeforeClass
    public void prepareData(){
        checker = new ArrayChecker();
    }

    @Test
    public void shouldShowAllStringsDifferent() {
        System.out.println("====== First String Test ======");
        List<String> stringList = new ArrayList<>();
        stringList.add("abc");
        stringList.add("acb");
        stringList.add("bca");

        checker.check(stringList);
    }

    @Test
    public void shouldShowCopies() {
        System.out.println("====== Second String Test ======");
        List<String> stringList = new ArrayList<>();
        stringList.add("abc");
        stringList.add("abc");
        stringList.add("acb");
        stringList.add("bca");
        stringList.add("bca");

        checker.check(stringList);
    }

    @Test
    public void shouldShowAllIntegersDifferent() {
        System.out.println("====== First Integer Test ======");
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(4);
        integerList.add(1);
        integerList.add(6);
        integerList.add(5);

        checker.check(integerList);
    }

    @Test
    public void shouldShowIntegerCopies() {
        System.out.println("====== Second Integer Test ======");
        List<Integer> integerList = new ArrayList<>();
        integerList.add(41);
        integerList.add(41);
        integerList.add(12321);
        integerList.add(41);
        integerList.add(16);
        integerList.add(232);
        integerList.add(232);

        checker.check(integerList);
    }

    @Test
    public void shouldShowAllPersonDifferent() {
        System.out.println("====== First Person Test ======");

        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "Vasya", 34));
        personList.add(new Person(2, "Ignat", 21));
        personList.add(new Person(3, "Petr", 23));
        personList.add(new Person(4, "Petr", 25));
        personList.add(new Person(5, "Vasya", 56));

        checker.check(personList);
    }

    @Test
    public void shouldShowPersonCopies() {
        System.out.println("====== Second Person Test ======");

        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "Vasya", 34));
        personList.add(new Person(8, "Ignat", 29));
        personList.add(new Person(3, "Petr", 23));
        personList.add(new Person(3, "Petr", 23));
        personList.add(new Person(1, "Vasya", 34));

        checker.check(personList);
    }
}