package day32_tasks;

import java.util.ArrayList;

public class usingHobby {
    public static void main(String[] args) {
        ArrayList <Hobby> hobbyArrayList = new ArrayList<>();

        Hobby hobby1  = new Hobby("Driving");
        hobbyArrayList.add(hobby1);

        Hobby hobby2 = new Hobby("Swimming", 750, true, false);
        hobbyArrayList.add(hobby2);

        Hobby hobby3 = new Hobby("Tennis", 500);
        hobbyArrayList.add(hobby3);


        for(Hobby hobbyb : hobbyArrayList) {
            hobbyb.dolt();
        }

            hobbyArrayList.removeIf(each -> each.isOutdoors);
            System.out.println("Indoor Hobbies: " + hobbyArrayList);

            hobbyArrayList.removeIf(each -> each.requiresOthers);
        System.out.println(hobbyArrayList);

            hobbyArrayList.removeIf(each -> each.annualCost >= 500);
        System.out.println(hobbyArrayList);












        }

    }

