import java.util.*;

class Student {
    int id;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student(" + id + ", " + name + ")";
    }
}
public class ArraysLists {
    public static void main(String[] args) {
        // Syntax: ArrayList<type> name = new ArrayList<>();
        // ArrayList of Integer
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr);

        // to get the length (number of element)
        // size()
        System.out.println("Currently there are " + arr.size() + " elements in the Array");


        // Loop in ArrayList for Integer
        for(int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        // for each loop in ArrayList for Integer
        for(Integer eachValue: arr) {
            System.out.println(eachValue * eachValue);
        }

        // Insertion of element at specify position
        // 10 20 30 40 
        // 0  1  2  3
        arr.add(1, 100);
        System.out.println(arr);

        // add and remove
        

        // ArrayList of Students
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Vivek"));
        studentList.add(new Student(2, "Akshay"));
        studentList.add(new Student(3, "Om"));
        for(Student eachStudent: studentList) {
            System.out.println(eachStudent);
            System.out.println(eachStudent.name);
        }


        ArrayList<String> str = new ArrayList<>();
    }
}
