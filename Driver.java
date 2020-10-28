import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
	public static void printArrayCourses(ArrayList<Course> course) {
		for (Course el : course) {
			System.out.println("\n" + el.getInstructor().getStatus() +
					"\nCourse name is " + el.getCourseName() + " which takes " + el.getDuration() + 
					"\nThe Instructor of this course is " + el.getCourseName() +
					"\nThe Phone number of Instructor is " + el.getInstructor().getPhoneNumber());
		}
		
	}
	
	public static void checkInstructor(ArrayList<Course> instructor, String target) {
		boolean isInstractor = false;
		for (Course el : instructor) {
			if (el.getInstructor().getLastName().equals(target)) {
				System.out.println(el.getCourseName());
				isInstractor = true;
			}
		}
		if (!isInstractor) {
			System.out.println("Not exist");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		ArrayList<Course> courses = new ArrayList<Course>();
		
		Instructor instructor1 = new Instructor("john", "Dow", "1111", 1);
		Instructor instructor2 = new Instructor("Smith", "Dew", "2222", 4);
		Instructor instructor3 = new Instructor("Hew", "Dew", "33333", 5);
		
		Course course1 = new Course("baseball", 4, instructor1);
		Course course2 = new Course("swimming", 5, instructor2);
		Course course3 = new Course("running", 7, instructor3);
		Course course4 = new Course("Game", 5, instructor1);
		
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		courses.add(course4);
		
		printArrayCourses(courses);
		
		System.out.println("\nPlease enter your instructor name: ");
		String inputVal = input.next();
		
		checkInstructor(courses, inputVal);
	}

}
