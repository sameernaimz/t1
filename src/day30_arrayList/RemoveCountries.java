package day30_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

/*

 */
public class RemoveCountries {

    public static ArrayList<String> removeCountries (ArrayList <String> countries) {
        countries.removeIf(each -> each.length() > 7);

        return countries;
    }

    public static void main(String[] args) {
        ArrayList <String> countryList = new ArrayList<>(Arrays.asList("Japan", "Korea", "United States","Turkey", "United Kingdom", "Canada"));

        System.out.println(countryList);
        System.out.println(removeCountries(countryList));
    }
}
