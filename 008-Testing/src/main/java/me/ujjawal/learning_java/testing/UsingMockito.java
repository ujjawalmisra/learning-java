package me.ujjawal.learning_java.testing;

import lombok.Data;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * References:
 * <ol>
 *     <li>{@link https://www.vogella.com/tutorials/Mockito/article.html}</li>
 * </ol>
 */
public class UsingMockito {

    private static Logger logger = LogManager.getLogger(UsingMockito.class);

    public static void main(String[] args) {

        StudentDao studentDao = new StudentDao();
        StudentService studentService = new StudentService(studentDao);

        Student rajat = studentService.createStudent("Rajat", "Bharti");
        logger.info(rajat);
    }

    static class StudentService {

        private static Logger logger = LogManager.getLogger(StudentService.class);

        private StudentDao studentDao;

        StudentService(StudentDao studentDao) {
            this.studentDao = studentDao;
        }

        /**
         * This method takes firstName and lastName for a student and gets an entry created in the database with the
         * help of a DAO. firstName should not be null. lastName may be null. Before creating the entry the firstName
         * and lastName are trimmed.
         * @param firstName String representing the first name of a student. This should not be null.
         * @param lastName String representing the last name of a student. This may be null.
         * @return Student entry created in the database
         * @throws IllegalArgumentException If firstName is null.
         *
         * 1. Takes 2 Strings and returns Student
         * 2. Throws IllegalArgumentException in case firstName is null.
         * 3. No exception thrown if lastName is null.
         * 4. Trims firstName and lastName before storing Student.
         */
        Student createStudent(String firstName, String lastName) {
            if(null == firstName) {
                throw new IllegalArgumentException("firstName shouldn't be null");
            }
            Student student = new Student();
            student.setFirstName(firstName.trim());
            if(null != lastName) {
                student.setLastName(lastName.trim());
            }
            Student result = studentDao.save(student);
            logger.debug("created " + result);
            return result;
        }

        Student getStudent(Integer id) {
            Student student = studentDao.getById(id);
            return student;
        }

    }

    /**
     * create student {
     *     id unsigned int autoincrement primary key,
     *     first_name varchar,
     *     last_name varchar
     * };
     *
     * insert into student(first_name, last_name) values('','');
     *
     */
    static class StudentDao {
        private AtomicInteger studentIdSequence;

        StudentDao() {
            studentIdSequence = new AtomicInteger();
        }

        /**
         * Save the student to the database.
         * @param student
         * @return
         */
        Student save(Student student) {
            student.setId(studentIdSequence.incrementAndGet());
            //insert into student(first_name, last_name) values('','');
            throw new UnsupportedOperationException();
        }

        /**
         * Retrieve the student from the database on the basis of the id.
         * @param id
         * @return
         */
        Student getById(Integer id) {
            throw new UnsupportedOperationException();
        }
    }

    @Data
    static class Student {
        private Integer id;
        private String firstName;
        private String lastName;
    }
}
