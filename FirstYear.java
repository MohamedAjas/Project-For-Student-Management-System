package EM;

public class FirstYear implements TimeTable{

    @Override
    public void timeTable() {
        System.out.println("||================================================================================================||");
        System.out.println("|| _______Time_______  ||    Monday   ||   Tuesday  ||   Wednesday  ||   Thursday  ||    Friday   ||");
        System.out.println("|| 08.00 am - 09.00 am ||             ||            ||     Stat     ||             ||             ||");
        System.out.println("|| 09.00 am - 10.00 am ||             ||     PMGT   ||     Stat     ||    PStat    ||             ||");
        System.out.println("|| 10.00 am - 11.00 am ||      WS     ||     PMGT   ||     SC       ||    PStat    ||   English   ||");
        System.out.println("|| 11.00 am - 12.00 pm ||      WS     ||     PMGT   ||     SC       ||    PStat    ||   English   ||");
        System.out.println("|| 01.00 am - 02.00 pm ||      POOP   ||     OOP    ||     PWS      ||    NT       ||             ||");
        System.out.println("|| 02.00 am - 03.00 am ||      POOP   ||     OOP    ||     PWS      ||    NT       ||   MGT       ||");
        System.out.println("|| 03.00 am - 04.00 am ||      POOP   ||            ||     PWS      ||             ||   MGT       ||");
        System.out.println("||================================================================================================||");
    }
}
