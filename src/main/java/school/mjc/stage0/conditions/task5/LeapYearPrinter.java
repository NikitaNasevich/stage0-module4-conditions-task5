package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
//        switch (year){
//            case (% 4 == 0)
//        }
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0) || year == 1900)
            System.out.println("leap");
        else
            System.out.println("not leap");
    }
}
