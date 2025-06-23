package urokijava;

public class ForWhileLoops {
    public static void main(String[] args) {

        int my_Int = 0;

        while (10 >= my_Int){
            System.out.println(my_Int);
            my_Int++;
        }
        int myint2 = 10;
         do{
             myint2++;
             System.out.println(myint2);
         }while(myint2 < 10);

         for (int i = 1; i <= 10 ; i ++){
             System.out.println(i);
         }

    }
}
