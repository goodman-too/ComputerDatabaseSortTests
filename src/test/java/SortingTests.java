import org.testng.annotations.Test;
import pages.MainPage;
import utils.ListsUtil;

import java.util.Comparator;


public class SortingTests extends BaseTest {

    MainPage mainPage = new MainPage();
    ListsUtil listsUtil = new ListsUtil();


    @Test
    public void checkSortingByNameAsc() {
        mainPage.openPageOrderedByNameAsc();
        listsUtil.verifySortingByNameCorrectness(String.CASE_INSENSITIVE_ORDER);
    }

    @Test
    public void checkSortingByNameDesc() {
        mainPage.openPageOrderedByNameDesc();
        listsUtil.verifySortingByNameCorrectness(String.CASE_INSENSITIVE_ORDER.reversed());
    }

    @Test
    public void checkSortingByIntroducedAsc() {
        mainPage.openPageOrderedByIntroducedAsc();
        listsUtil.verifySortingByIntroducedCorrectness(Comparator.naturalOrder());
    }

    @Test
    public void checkSortingByIntroducedDesc() {
        mainPage.openPageOrderedByIntroducedDesc();
        listsUtil.verifySortingByIntroducedCorrectness(Comparator.reverseOrder());
    }

    @Test
    public void checkSortingByDiscontinuedAsc() {
        mainPage.openPageOrderedByDiscontinuedAsc();
        listsUtil.verifySortingByDiscontinuedCorrectness(Comparator.naturalOrder());
    }

    @Test
    public void checkSortingByDiscontinuedDesc() {
        mainPage.openPageOrderedByDiscontinuedDesc();
        listsUtil.verifySortingByDiscontinuedCorrectness(Comparator.reverseOrder());
    }

    @Test
    public void checkSortingByCompanyAsc() {
        mainPage.openPageOrderedByCompanyAsc();
        listsUtil.verifySortingByCompanyCorrectness(String.CASE_INSENSITIVE_ORDER);
    }

    @Test
    public void checkSortingByCompanyDesc() {
        mainPage.openPageOrderedByCompanyDesc();
        listsUtil.verifySortingByCompanyCorrectness(String.CASE_INSENSITIVE_ORDER.reversed());
    }
}
