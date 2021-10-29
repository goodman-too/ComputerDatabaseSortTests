package utils;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

import static com.codeborne.selenide.Selenide.$$;


public class ListsUtil {

    ElementsCollection computerNameFields = $$(By.xpath("//tbody/tr/td[1]/a"));
    ElementsCollection introducedFields = $$(By.xpath("//tbody/tr/td[2]"));
    ElementsCollection discontinuedFields = $$(By.xpath("//tbody/tr/td[3]"));
    ElementsCollection companyFields = $$(By.xpath("//tbody/tr/td[4]"));

    public void verifySortingByNameCorrectness(Comparator<String> order) {
        ArrayList<String> actualResult;

        actualResult = transformElementsToStringList(computerNameFields);
        ArrayList<String> expectedResult = new ArrayList<>(actualResult);
        expectedResult.sort(order);

        System.out.println("Actual result:\n" + actualResult);
        System.out.println("Expected result:\n" + expectedResult);

        Assert.assertEquals(actualResult, expectedResult);
    }

    public void verifySortingByIntroducedCorrectness(Comparator<Date> order) {
        ArrayList<Date> actualResult;

        actualResult = transformElementsToDateList(introducedFields);
        ArrayList<Date> expectedResult = new ArrayList<>(actualResult);
        expectedResult.sort(order);

        System.out.println("Actual result:\n" + actualResult);
        System.out.println("Expected result:\n" + expectedResult);

        Assert.assertEquals(actualResult, expectedResult);
    }

    public void verifySortingByDiscontinuedCorrectness(Comparator<Date> order) {
        ArrayList<Date> actualResult;

        actualResult = transformElementsToDateList(discontinuedFields);
        ArrayList<Date> expectedResult = new ArrayList<>(actualResult);
        expectedResult.sort(order);

        System.out.println("Actual result:\n" + actualResult);
        System.out.println("Expected result:\n" + expectedResult);

        Assert.assertEquals(actualResult, expectedResult);
    }

    public void verifySortingByCompanyCorrectness(Comparator<String> order) {
        ArrayList<String> actualResult;

        actualResult = transformElementsToStringList(companyFields);
        ArrayList<String> expectedResult = new ArrayList<>(actualResult);
        expectedResult.sort(order);

        System.out.println("Actual result:\n" + actualResult);
        System.out.println("Expected result:\n" + expectedResult);

        Assert.assertEquals(actualResult, expectedResult);
    }

    private ArrayList<String> transformElementsToStringList(ElementsCollection collection) {
        ArrayList<String> resultList = new ArrayList<>();

        collection.stream()
                .map(SelenideElement::getText)
                .filter(s -> s.length() > 1)
                .forEach(resultList::add);

        return resultList;
    }

    private ArrayList<Date> transformElementsToDateList(ElementsCollection collection) {
        ArrayList<Date> resultList = new ArrayList<>();

        collection.stream()
                .map(SelenideElement::getText)
                .filter(s -> s.length() > 1)
                .map(Date::new)
                .forEach(resultList::add);

        return resultList;
    }
}
