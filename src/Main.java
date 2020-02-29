import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BirdSurvey bs = new BirdSurvey();
        Scanner stdin = new Scanner(System.in);
        String temp;

        while(true) {
            System.out.print("Insert Bird Type (or \"done\" to exit): ");
            temp = stdin.nextLine();

            if(temp.equals("done")) {
                break;
            }

            else {
                bs.add(temp);
                System.out.println("\n\n" + "there are " + bs.getCount(temp) + " " + temp + "(s)\n");
            }
        }

        System.out.println(bs.getReport());
    }
}
