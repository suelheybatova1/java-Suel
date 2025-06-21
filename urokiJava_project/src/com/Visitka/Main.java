package com.Visitka;

public class Main {
    public static void main(String[] args) {

        //main info about the person
        String name = "Aflatun";
        int age = 55;
        float height = 1.79f;
        char fav_char = '%';
        boolean fact = false;
        double weight = 89.900;

        //operations that we do
        System.out.println(age*365);
        System.out.println(weight/(height*height));

        //usage of increment
         age++;
        System.out.println(age);

        //usage of
        if ( age > 18) {
            System.out.println("You can drink alcohol and sleep with people");
        }
            else {
            System.out.println("Sit evde, and help ur father");
        }
            if (name.equals("Alesha") && age >= 20) {
                System.out.println("Gj");
            }
                else{
                System.out.println("Unlucky");
                }
            }

    }
