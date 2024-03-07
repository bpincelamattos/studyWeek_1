package loops;

import java.util.ArrayList;

public class Exercise1_3 {

    public static void main(String[] args) {
        String[]  courses = {"UNIX", "SQL", "Java", "Python", "Web Apps"};

        ArrayList<String> coursesList = new ArrayList<String>();

        for (String course: courses) {
            coursesList.add(course);
            System.out.println(course);
        }

    }
}
