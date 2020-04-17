import java.util.Scanner;

public class Convert {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the date in mm/dd/yyyy format");
        String date = keyboard.nextLine();
        char month1 = date.charAt(0);
        int pMonth1 = Integer.parseInt(String.valueOf(month1));

        char month2 = date.charAt(1);
        int pMonth2 = Integer.parseInt(String.valueOf(month2));

        if ((pMonth1 + pMonth2) <= 12 && (pMonth1 + pMonth2) > 00){
            char day1 = date.charAt(3);
            int pDay1 = Integer.parseInt(String.valueOf(day1));

            char day2 = date.charAt(4);
            int pDay2 = Integer.parseInt(String.valueOf(day2));

            if ((pDay1 + pDay2) <= 31 && (pDay1 + pDay2) > 00){
                char year1 = date.charAt(6);
                int pYear1 = Integer.parseInt(String.valueOf(year1));

                char year2 = date.charAt(7);
                int pYear2 = Integer.parseInt(String.valueOf(year2));

                char year3 = date.charAt(8);
                int pYear3 = Integer.parseInt(String.valueOf(year3));

                char year4 = date.charAt(9);
                int pYear4 = Integer.parseInt(String.valueOf(year4));
                if ((pYear1 + pYear2 + pYear3 + pYear4) <= 2020 && (pYear1 + pYear2 + pYear3 + pYear4) > 1800){
                    System.out.println("It is " + pMonth1 + pMonth2 + "/" + pDay1 + pDay2 + "/" + pYear1 + pYear2 + pYear3 + pYear4);
                } else {
                    System.out.println("Please enter a valid year.");
                }
            } else {
                System.out.println("Please enter a valid day.");
            }
        } else {
            System.out.println("Please enter a valid month.");
        }
        System.out.println();
    }
}
