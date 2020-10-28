import java.util.Scanner;

public class dataTypes {

    public static void main(String[] args) {

        int studentAge = 15;
        double studentGPA = 3.75;

        boolean perfectAttendance = true;

        String studentFirstName = "Ethan";
        String studentLastName = "Moffatt";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);

        System.out.println(studentGPA);

        System.out.println("Update Data");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentGPA);
    }
}
