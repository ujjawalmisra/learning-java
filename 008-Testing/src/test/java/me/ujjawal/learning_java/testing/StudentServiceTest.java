package me.ujjawal.learning_java.testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class StudentServiceTest {

    @Mock
    UsingMockito.StudentDao studentDao;

    @Test
    public void testCreate() {
        assertNotNull(studentDao);

        UsingMockito.Student expectedStudent = new UsingMockito.Student();
        expectedStudent.setFirstName("Darshan");
        expectedStudent.setLastName("Mehta");

        Mockito.when(studentDao.save(Mockito.any(UsingMockito.Student.class))).thenReturn(expectedStudent);

        UsingMockito.StudentService studentService = new UsingMockito.StudentService(studentDao);
        UsingMockito.Student resultStudent = studentService.createStudent("S", "A");
        assertEquals(expectedStudent, resultStudent);
    }
}