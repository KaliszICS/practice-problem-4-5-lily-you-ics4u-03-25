/**
 * This Student Class allows users to access the name, age and student number of a student.
 * It also allows users to get the name, age and student number of a student in a readable format
 * and compare students' student numbers
 * @author Lily You
 * @version 3
 */

import java.util.Objects;

public class Student{
    private String name;
    private int age;
    private String studentNumber;

    /**
     * Constructs a new Student object with the variables name, age and studentNumber
     * @param name String - the name of the student
     * @param age int - the age of the student
     * @param studentNumber String - the unique student number of the student
     */
    public Student(String name, int age, String studentNumber){
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    /**
     * Returns the name of the student
     * @return the name of the student as a String
     */
    public String getName(){
        return this.name;
    }

    /**
     * Returns the age of the student
     * @return the age of the student as an integer
     */
    public int getAge(){
        return this.age;
    }

    /**
     * Returns the unique student number of the student
     * @return the student number of a student as a String
     */
    public String getStudentNumber(){
        return this.studentNumber;
    }

    /**
     * Returns the name, age and student number of a student in a readable format
     * @return name, age and student number of a student as a String in the format "name, age - student number" 
     */
    @Override
    public String toString(){
        return this.name + ", " + this.age + " - " + this.studentNumber;
    }

    /**
     * Checks if two students match by comparing their student numbers
     * @param obj the object given to compare with
     * @return true if the student has the same student number as this student, otherwise false
     */
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Student student = (Student)obj;
        return student.getStudentNumber().equals(this.studentNumber);
    }

    /**
     * Returns a hash code value for the student number and ensures that students
     * with the same student number are equal by having identical hash codes
     * @return a hash code that represents the student as an integer
     */
    @Override
    public int hashCode(){
        return Objects.hash(studentNumber);
    }
}