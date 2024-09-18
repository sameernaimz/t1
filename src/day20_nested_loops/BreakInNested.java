package day20_nested_loops;

public class BreakInNested {
    public static void main(String[] args) {

//OUTER LOOP
        for (int i = 0; i < 5; i++) {

            System.out.println("i: " + i);

            if(i== 3) {
                break;

            }
            //When the above break statement is run we stop the OUTER LOOP
// INNER
            for (int j = 0; j < 2; j++) {

                System.out.println("j:" + j);
                break;
                //When the above break statement is reached, we stop the inner loop
            }
            System.out.println();
        }

        System.out.println("k:" + 5);

        for (int j = 0; j < 5; j++) {
            break;
        }
    }

    public static class ContinueInNested {
        public static void main(String[] args) {

            for (int i = 0; i < 5; i++) {


                if(i == 1) {
                    // Here when the contunue is reached, I go to the next ITERATION in OUTER LOOP
                    continue;
                }

                System.out.println("i:" + i);

                for(int j = 0; j < 3; j++) {

                    if(j == 1) {
                        // Here when the contunue is reached, I go to the next ITERATION in INNER LOOP
                        continue;
                    }

                    System.out.println("\tj:" + j);
                }
            }

        }
    }
}
