import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student student1;
    Student student2;

    @Before
    public void initStudentConstruction () {
        student1 = new Student(1111L, "student1", 90.5);
        student2 = new Student(1112L, "student2", 80.5);
    }

    @Test
    public void testUserID () {
        assertEquals(1111L, student1.getUserID());
        assertNotEquals(student1, student2);

//        long random = student1.getUserID();
//        assertSame(student1.getUserID(), random);
    }

    @Test
    public void testUserName () {
        assertEquals("student1", student1.getUserName());
    }

    @Test
    public void testUserGrades () {

    }

}
