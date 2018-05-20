import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	
	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("444-44-4444", "Carlos","Therán", 3.0));
		students.add(new Student("333-33-3333", "Enrique","Torres", 2.0));
		students.add(new Student("111-11-1111", "Elvin","Ortiz", 1.0));
		students.add(new Student("222-22-2222", "Josian","Vélez", 0.0));
		students.add(new Student("222-22-2222", "Josian","Vélez", 0.0));
		
		System.out.println("Original ArrayList: " + students);
		
		Collections.sort(students);
		
		System.out.println("Sorted By ID ArrayList: " + students);

		Collections.sort(students, new Comparator<Student> () {
			public int compare(Student s1, Student s2) {
				return (int) (s2.getGpa() - s1.getGpa());
			}
		});
		
		System.out.println("Sorted By GPA ArrayList: " + students);
		
		students.sort((Student s1,Student s2)->((int)(s1.getLastName().compareTo(s2.getLastName()))));
		
		System.out.println("Sorted By LastName ArrayList: " + students);
		
		double sumGPA = 0;
		for (Student s : students) {
			sumGPA += s.getGpa();
		}
		System.out.println("Average GPA among students is: " + sumGPA / students.size());


		Maze.solveMaze(Maze.maze, 0, 0);
		
//		LinkedList<Student> studentsLinked = new LinkedList<Student>(students);
//		
//		System.out.println(studentsLinked);
//		
//
//		TreeSet<Student> studentsSet = new TreeSet<Student>(students);
//		
//		System.out.println(studentsSet);
		
		
	}


}
