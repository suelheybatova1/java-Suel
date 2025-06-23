package urokijava;

public class TaskMassive {
    public static void main(String[] args) {

        //eto u nas dva otdelnix massiva
        /*String[] names = {"Ali","Alihandro","Maryam","Aflatun","Elemdar"};
        int[] numbers = {44,45,66,75,33};

        //tut ya sdelala fignyu s tem, chtobi vivodilos ima i cislo
        System.out.println("resultatik budet : ");*/
        
        String[][] data = {
                {"Ali", "Alihandro", "Maryam", "Aflatun", "Elemdar"},
                {"44", "45", "66", "75", "33"}
        };

        System.out.println(data[0][0] + data[1][0]); // Ali44
        System.out.println(data[0][1] + data[1][1]); // Alihandro45
        System.out.println(data[0][2] + data[1][2]); // Maryam66
        System.out.println(data[0][3] + data[1][3]); // Aflatun75
        System.out.println(data[0][4] + data[1][4]); // Elemdar33
    }
}

