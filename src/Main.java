
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);

    public void addStudent(ArrayList<Student> list, Student s) {

        list.add(s);
    }

    public String getID(ArrayList<Student> list) {
        while (true) {
            System.out.println("Enter id:");
            String id = sc.nextLine();
            boolean check = true;
            for (int i = 0; i < list.size(); i++) {
                if (id.equalsIgnoreCase(list.get(i).getRollNo())) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                return id;
            } else {
                System.out.println("ID existed!");
            }
        }
    }

    public static void showIf(ArrayList<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }

    }

    public static void main(String[] args) {
        System.out.println("==========================");
        System.out.println("1. Thêm sinh viên");
        System.out.println("2. Đưa ra thông tin");
        ArrayList<Student> list = new ArrayList<Student>();
        Main m = new Main();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter choice:");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    String id = m.getID(list);
                    System.out.println("Enter name:");
                    String name = sc.nextLine();
                    System.out.println("Enter term:");
                    int term = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter totalFE:");
                    double totalAvgFE = Double.parseDouble(sc.nextLine());
                    System.out.println("Enter ACT:");
                    double extraActivities = Double.parseDouble(sc.nextLine());
                    Student s = new Student(id, name, term, totalAvgFE, extraActivities);
                    m.addStudent(list, s);
                    break;
                case 2:
                    System.out.println("Ham truoc khi sap xep: ");
                    showIf(list);
                    
                    System.out.println("Ham sau khi sap xep: ");
                    Collections.sort(list, new CompareByName());
                    showIf(list);
                    break;
            }
        }

    }

}
