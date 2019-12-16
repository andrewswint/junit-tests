import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class CohortTest {

    Cohort deimos;
    Student student1;
    Student student2;

    @Before
    public void create() {
        deimos = new Cohort();
        student1 = new Student(1L, "student1");
        student1.addGrade(80);
        student1.addGrade(90);
        student2 = new Student(2L, "student2");
        student2.addGrade(70);
        student2.addGrade(60);
    }

    @Test
    public void testGettingStudentArr() {
        assertEquals(deimos.getStudents().size(), 0);
    }

    @Test
    public void testAddStudentToList() {
        deimos.addStudent(student1);
        deimos.addStudent(student2);
        assertEquals(deimos.getStudents().size(), 1);
    }

    @Test
    public void testCalculatingAverage() {
        deimos.addStudent(student1);
        deimos.addStudent(student2);
        assertEquals(deimos.getCohortAverage(), (80+90+70+60)/4,0);
    }

}
