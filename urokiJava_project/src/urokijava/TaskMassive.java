package urokijava;

public class TaskMassive {
    public static void main(String[] args) {

        //eto u nas dva otdelnix massiva
        //tring[][] data = {
             //   {"Ali ", "Alihandro ", "Maryam ", "Aflatun ", "Elemdar "},
              //  {"44", "45", "66", "75", "33"}
        //};
        //tut ya sdelala fignyu s tem, chtobi vivodilos ima i cislo
        //System.out.println("resultatik budet :");
        //for (int i = 0; i < 5; i++) {
           // System.out.println(data[0][i] + data[1][i]);
       // }
        String[] names = {"Ali", "Alihandro", "Maryam", "Aflatun", "Elemdar"};
        int[] numbers = {44, 45, 66, 75, 33};

        System.out.println("naw result budet: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + numbers[i]);
        }
    }
}
        //String[] names = {"Ali","Alihandro","Maryam","Aflatun","Elemdar"};
       // int[] numbers = {44,45,66,75,33};

       // System.out.println(names[0] + numbers[0] + "," + names[1] + numbers[1] + "," +names[2] + numbers[2] + ","+ names[3] + numbers[3] + ","+ names[4] + numbers[4] + ",");
//}}

