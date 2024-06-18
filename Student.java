import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Student {
private String name;
private Date dateOfBirth;
public Student(String name, String dob) throws ParseException {
this.name = name;
SimpleDateFormat sdf = new SimpleDateFormat(&quot;dd-MM-yyyy&quot;); // Change format as
needed
this.dateOfBirth = sdf.parse(dob);
}
public void displayDetails() {
System.out.println(&quot;Student Name: &quot; + name);
System.out.println(&quot;Age: &quot; + calculateAge() + &quot; years&quot;);
}
private int calculateAge() {
Date currentDate = new Date();
long diff = currentDate.getTime() - dateOfBirth.getTime();

return (int) (diff / (1000L * 60 * 60 * 24 * 365));
}
public static void main(String[] args) throws ParseException {
// Creating a new student
Student student = new Student(&quot;Amit&quot;, &quot;24-03-2004&quot;);
// Displaying student details
student.displayDetails();
StudentCourses studentCourses = new StudentCourses();
// Adding courses and marks
studentCourses.addCourseMark(&quot;C++&quot;, 90);
studentCourses.addCourseMark(&quot;Java&quot;, 85);
studentCourses.addCourseMark(&quot;C#&quot;, 88);
// Displaying courses and marks
studentCourses.displayCoursesAndMarks();
}
}
StudentCourses.java
import java.util.HashMap;
import java.util.Map;
public class StudentCourses {
private Map&lt;String, Integer&gt; courseMarks = new HashMap&lt;&gt;();
public void addCourseMark(String courseName, int mark) {
courseMarks.put(courseName, mark);
}
public void displayCoursesAndMarks() {
System.out.println(&quot;Courses and Marks:&quot;);
for (Map.Entry&lt;String, Integer&gt; entry : courseMarks.entrySet()) {
System.out.println(&quot;Course: &quot; + entry.getKey() + &quot;, Marks: &quot; + entry.getValue());
}
}
}