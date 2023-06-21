import java.util.Scanner;

public class HomeWorkQA5 {
    public static void main(String[] args) {
        //task1();
//        task2();
        task3();

    }

    public static void task1() {
        String hello = "Hello";
        String world = "World";
        System.out.println(hello + " " + world);
        System.out.println();
        System.out.println(hello.concat(" " + world));
        System.out.println();
        System.out.println(String.format("%s %s", hello, world));
    }

    public static void task2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an even line:");
        String str = sc.next();
        if (str.length() % 2 == 0) {
            int middleElement = str.length() / 2;
            String result = str.substring(middleElement - 1, middleElement + 1);
            System.out.println(result);
        } else {
            System.out.println("Line is odd!");
        }
    }

    public static void task3() {
        String format = "Student %s %s %s";

        String student1 = String.format(format, "Oleg", "Olegovich", "Computer Science");
        String student2 = String.format(format, "Petro", "Ivanovich", "Management ");
        String student3 = String.format(format, "Vania", "Serhejovich", "Logistics");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }


}
