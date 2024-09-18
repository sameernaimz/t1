package day30_b_custom_classes;

public class Animal {

    //INSTANCE VARIABLES
    String species;
    long population;

        //This is a SPECIAL method. This will help up top print object Correctly.

    public String toString() {
        return "Animal species=" + species + ", population=" + population ;
    }
}
