package day29_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class JobTitles {
    public static void main(String[] args) {

        ArrayList<String> allJobs = new ArrayList<>();

        //addAll()
        allJobs.addAll(Arrays.asList("SDET", "Developer", "PO", "CEO", "DevOps", "QA", "QE", "BA", "Dr"));
        System.out.println("Original:" + allJobs);


        //removeAll();
        ArrayList<String> jobs1 = new ArrayList<>(allJobs);
        jobs1.removeAll(Arrays.asList("PO", "QA", "QE", "BA"));
        System.out.println("After 1st remove:" + jobs1);

        //retainAll();
        ArrayList<String> jobs2 = new ArrayList<>(allJobs);
        jobs2.removeAll(Arrays.asList("SDET" , "Developer", "DevOps"));
        System.out.println("After Retained:" + jobs2);

        // containsAll();

        ArrayList<String> jobs3 = new ArrayList<>(allJobs);
        System.out.println(jobs3.containsAll(Arrays.asList("DevOps", "Dr")));
        System.out.println(jobs3.containsAll(Arrays.asList("Police", "Dr", "Developer")));

    }
}
