import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;
public class StudentTest {
    @Test
    public void testCreateStudent(){
        Student jw = new Student(12321, "J.W.");
        Student bruce = null;
        assertNull(bruce);
        assertNotNull(jw);
    }

    @Test
    public void testStudentFields(){
        Student jw = new Student(1L, "J.W.");
        assertSame(1L, jw.getId());
        assertSame("J.W.", jw.getName());
        assertSame(0, jw.getGrades().size());
    }


    @Test
    public void testAddGrade(){
        Student jw = new Student(1L, "J.W.");
        jw.addGrade(100);
        assertSame(100, jw.getGrades().get(0));
        jw.addGrade(85);
        assertSame(85, jw.getGrades().get(1));
    }

    @Test
    public void testAverageGrade(){
        Student jw = new Student(1L, "J.W.");
        jw.addGrade(100);
        jw.addGrade(80);
        assertEquals(90, jw.getGradeAverage(), 0);
    }

}
