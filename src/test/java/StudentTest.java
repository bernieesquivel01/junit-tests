import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {
    private Student student;

    @Before
    public void setUp(){
        student = new Student (1L, "Bernie");
        long id = 1L;
        ArrayList<Object> grades = new ArrayList<>();
    }

    @Test
    public void testNewStudent(){
        Student student = new Student(1L, "Bernie");
        Student jose = null;
        assertNull(jose);
        assertNotNull(student);
    }

    @Test
    public void testStudentFields(){
        Student bernie = new Student(1L, "Bernie");
        assertSame(1L, student.getId());
        assertSame("Bernie", student.getName());
        assertSame(0, student.getGrades().size());
    }

    @Test
    public void canGetGrades(){
        List<Integer> grades = student.getGrades();
        assertNotNull(grades);
    }
    
    @Test
    public void testAddGrade(){
        student.addGrade(Integer.valueOf(90));
        
        List<Integer> grades = student.getGrades();
        assertEquals(1, grades.size());
        assertEquals(Integer.valueOf(90), grades.get(0));
    }

    @Test
    public void testAverageGrade(){
        student.addGrade(90);
        student.addGrade(90);
        double gradeAverage = student.getGradeAverage();
        
        assertEquals(90, gradeAverage, 0);
    }
}
