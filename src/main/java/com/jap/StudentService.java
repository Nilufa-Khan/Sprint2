package com.jap;

import java.util.*;

public class StudentService {


    public static Set<Student> getAllStudentData(){
        //create six student object by calling Student class parameterized constructor
         Student s1 = new Student("raj",34,567);
        Student s2 = new Student("diya",11,467);
        Student s3 = new Student("samim",90,667);
        Student s4 = new Student("virat",23,867);
        Student s5 = new Student("shahrukh",1,967);
        Student s6 = new Student("kaira",12,767);


        //create HashSet object and add all the students object inside it
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);
        studentSet.add(s5);
        studentSet.add(s6);
        //return the HashSet object


        return studentSet;
    }


    public static Set<String> getAllStudentNameInSorted(Set<Student> studentSet){
        //Create a TreeSet object
        Set<String> treeSet = new TreeSet<>();
        //Use Iterator object of type <Student> to iterate through the studentSet
        Iterator<Student> itr = studentSet.iterator();
        //get all the name and add it inside the TreeSet object
        while(itr.hasNext()){
            Student  obj = itr.next();
            treeSet.add(obj.getName());
        }

      //return the TreeSet object;
        return treeSet;
    }

    public static Map<String,Integer> calculateAverage(Set<Student> studentSet){
        //create a HashMap object of type <String,Integer>
        Map<String,Integer> map = new HashMap<>();

        //Use Iterator object of type <Student>to iterate through the studentSet
        Iterator<Student> itr = studentSet.iterator();

        //retrieve the Student object from the iterator


        while(itr.hasNext()){
            Student obj = itr.next();
            //Use getter method to get TotalMarks of each student. calculate the average
            //add the student name and average marks in the HashMap object created in the
            map.put(obj.getName(), obj.getTotalMarks());
        }

        //first line and return the map

           return map;

    }

    public static void main(String[] args) {
        Set studentName = getAllStudentData();
        System.out.println(getAllStudentNameInSorted(studentName));
        System.out.println(calculateAverage(studentName));
    }


}
