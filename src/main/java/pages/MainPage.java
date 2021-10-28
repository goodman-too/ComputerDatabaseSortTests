package pages;

import static com.codeborne.selenide.Selenide.*;


public class MainPage {

//    SelenideElement computerNameSortButton = $("th.col-name > a");
//    SelenideElement introducedSortButton = $("th.col-introduced > a");
//    SelenideElement discountedSortButton = $("th.col-discontinued > a");
//    SelenideElement companyNameSortButton = $("th.col-company > a");
//
//    ElementsCollection computerNameFields = $$(By.xpath("//tbody/tr/td[1]/a"));
//    ElementsCollection introducedFields = $$(By.xpath("//tbody/tr/td[2]"));
//    ElementsCollection discontinuedFields = $$(By.xpath("//tbody/tr/td[3]"));
//    ElementsCollection companyFields = $$(By.xpath("//tbody/tr/td[4]"));
//
//    ArrayList<String> computerNames = new ArrayList<>();
//    ArrayList<String> computerNamesForCompare = new ArrayList<>();
//    ArrayList<Date> introducedDates = new ArrayList<>();
//    ArrayList<Date> introducedDatesForCompare = new ArrayList<>();

    public void openPageOrderedByNameAsc() {
        open("http://computer-database.gatling.io/computers?p=0&n=574&s=name&d=asc");
    }

    public void openPageOrderedByNameDesc() {
        open("http://computer-database.gatling.io/computers?p=0&n=574&s=name&d=desc");
    }

    public void openPageOrderedByIntroducedAsc() {
        open("http://computer-database.gatling.io/computers?p=0&n=574&s=introduced&d=asc");
    }

    public void openPageOrderedByIntroducedDesc() {
        open("http://computer-database.gatling.io/computers?p=0&n=574&s=introduced&d=desc");
    }

    public void openPageOrderedByDiscontinuedAsc() {
        open("http://computer-database.gatling.io/computers?p=0&n=574&s=discontinued&d=asc");
    }

    public void openPageOrderedByDiscontinuedDesc() {
        open("http://computer-database.gatling.io/computers?p=0&n=574&s=discontinued&d=desc");
    }

    public void openPageOrderedByCompanyAsc() {
        open("http://computer-database.gatling.io/computers?p=0&n=574&s=companyName&d=asc");
    }

    public void openPageOrderedByCompanyDesc() {
        open("http://computer-database.gatling.io/computers?p=0&n=574&s=companyName&d=desc");
    }
}
