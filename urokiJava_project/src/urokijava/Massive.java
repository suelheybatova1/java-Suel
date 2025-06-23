package urokijava;

public class Massive {
    public static void main(String[] args) {
        int month_days[];
        month_days = new int [12];
        month_days[0] = 31; //january
        month_days[1] = 28; //february
        month_days[2] = 31; //march
        month_days[3] = 30; //april
        month_days[4] = 31; //may
        month_days[5] = 30; //june
        month_days[6] = 31; //july
        month_days[7] = 31; //august
        month_days[8] = 30; //september
        month_days[9] = 31; //october
        month_days[10] = 30; //november
        month_days[11] = 31; //december

        System.out.println("В январе " + month_days[0] + " дней");

        int month_days1[] = {31,30,28};
        System.out.println(month_days1[2]);

        int[][] grades = {
                {90,99,96},
                {87,88,76},
                {65,55,45}
        };
        System.out.println(grades[2][2]);
    }
}
