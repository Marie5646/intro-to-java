package Assignments;

public class PartOne {
    public static double footToMeter(double foot){
        return foot * 0.305;
    }

    public static double meterToFoot(double meter){
        return meter * 3.279;
    }

    public static void conversionTest(){
        System.out.printf("%-10s %-10s | %-10s %-10s\n","Feet","Meters","Feet","Meters");
        for (int i = 1 ,j = 20 ;i <= 10 && j <= 65 ; i++,j +=5){
            double meter = Math.abs(footToMeter(i));
            double foot = meterToFoot(i);
            System.out.printf("%-10s %-10s | %-10s %-10s\n", i,meter ,j, foot);
        }
    }
    public static void main(String[] args) {
        System.out.println("Chapter 6:  Programming Exercise 6.9");
        System.out.println("-----------------------");

        System.out.println("Write a class that contains the following two methods:");
        System.out.println("Meter To Foot");
        System.out.println(meterToFoot(1));
        System.out.println("Foot To Meter");
        System.out.println(footToMeter(1));

        System.out.println("Write a test program that invokes these methods to display the following tables:");
        conversionTest();
    }
}
