import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	
	private JTextField studentNameField, courseNameField;
	private JButton button, button2;
	private JPanel panel;
	private ArrayList<Course> courses = new ArrayList<Course>();
	private ArrayList<Student> students = new ArrayList<Student>();
	
	
	
	public MyFrame() {
		
		Course c1 = new Course("Python");
		Course c2 = new Course("Java");
		Course c3 = new Course("C++");
		
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		 
		
		panel = new JPanel();
		
		studentNameField = new JTextField("Student Name ");
		courseNameField = new JTextField("Course Title");
		button = new JButton("Create student");
		button2 = new JButton("Print students ");
		
		panel.add(studentNameField);
		panel.add(courseNameField);
		panel.add(button);
		panel.add(button2);
		
		this.setContentPane(panel);
		
		//Create Listener object
		ButtonListener listener = new  ButtonListener();
		
		//Connect the Listener
		button.addActionListener(listener);
		button2.addActionListener(listener);
		
		
		
		this.setVisible(true);
		this.setSize(400, 400);
		this.setTitle("HASAN ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	}
	
	//Create class listener
	class ButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()== button) {
			   
				String studentName = studentNameField.getText();
			   
			   Student newStudent = new Student(studentName);
 			   
			   String courseName = courseNameField.getText();
			   
			   Course selectedCourse = null;
			   
			   for(Course course: courses) {
				   if(course.getName().equals(courseName))
					   selectedCourse = course;
				   
			   }
			   
			   newStudent.setCourse(selectedCourse);
			   
			   students.add(newStudent);
			   
			}
			else { 
				for(Student student: students)
					student.printInfo();
			}
			
		}
	}

}


