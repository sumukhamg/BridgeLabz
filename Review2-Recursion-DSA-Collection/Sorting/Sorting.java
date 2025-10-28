package Sorting;
// create student class wiith innstance variable name, id and percentage and passedout year. Then create a main class to store Students in 

// a set with custom sorting - sort based on id.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Student {
    int id;
    String name;
    double per;
    int year;

    Student(int id, String name, double per, int year) {
        this.id = id;
        this.name = name;
        this.per = per;
        this.year = year;
    }

    @Override
    public String toString() {
        return "[Student: id: " + id + "Name: " + name + " Percentage:  " + per + "]";
    }

}

class Test {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Bhuvan", 50, 2022);
        Student s2 = new Student(102, "Maheshwari", 95, 2024);
        Student s3 = new Student(103, "Sumukh", 80, 2025);
        Student s4 = new Student(104, "Pawan", 60, 2023);
        Student s5 = new Student(105, "Yogeesh", 35, 2023);

        MyComparator com = new MyComparator();
        Set<Student> studentSet = new TreeSet<>(com);

        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);
        studentSet.add(s5);

        // Iterator itr = studentSet.iterator();

        // while (itr.hasNext()) {
        // System.out.println(itr.next());
        // }

        List<Student> list = new ArrayList<>();
        MyComparator2 com2 = new MyComparator2();
        Collections.sort(list, com2);

        System.out.println(list);

    }
}

class MyComparator2 implements Comparator<Object> {
    public int compare(Object obj1, Object obj2) {
        Student name1 = (Student) obj1;
        Student name2 = (Student) obj2;

        return name1.name.compareTo(name2.name);
    }
}

class MyComparator implements Comparator<Object> {
    public int compare(Object obj1, Object obj2) {
        Student s1 = (Student) obj1;
        Student s2 = (Student) obj2;

        if (s1.id > s2.id) {
            return 1;
        } else {
            return -1;
        }
    }
}