package day7.homework;
import java.util.HashSet;

public class Student 
{
	    private String name;
	    private int id;
	    private String major;

	    public Student(String name, int id, String major) {
	        this.name = name;
	        this.id = id;
	        this.major = major;
	    }

	    public int getId() {
	        return id;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;
	        }
	        Student student = (Student) obj;
	        return id == student.id;
	    }

	    @Override
	    public int hashCode() {
	        return id;
	    }

	    @Override
	    public String toString() {
	        return "Student{" +
	                "name='" + name + '\'' +
	                ", id=" + id +
	                ", major='" + major + '\'' +
	                '}';
	    }
	

	    public static void main(String[] args) {
	        HashSet<Student> students = new HashSet<>();

	        // Creating student objects
	        Student student1 = new Student("John Doe", 1, "Computer Science");
	        Student student2 = new Student("Jane Smith", 2, "Mathematics");
	        Student student3 = new Student("David Johnson", 1, "Physics");
	        Student student4 = new Student("Mary Wilson", 3, "Chemistry");
	        Student student5 = new Student("Michael Brown", 4, "Biology");

	        // Adding students to the HashSet
	        students.add(student1);
	        students.add(student2);
	        students.add(student3);
	        students.add(student4);
	        students.add(student5);

	        // Printing the HashSet
	        for (Student student : students) {
	            System.out.println(student);
	        }
	    }
	}

