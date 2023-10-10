package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program Started" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
         StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
         Student student=new Student();
//         student.setId(3);
//         student.setName("Rajan Tiwary");
//         student.setCity("Varanashi");
//         int result=studentDao.insert(student);
         
//         student.setId(3);
//         student.setName("Kajal Mishra");
//         student.setCity("Kanpur");
//        int result= studentDao.change(student);
         
//         int result= studentDao.delete(3);
         
//         Student result=studentDao.getStudent(2);
         List<Student> students=studentDao.getAllStudent();
         for(Student s: students)
         {
        	 System.out.println(s);
         }
//        System.out.println("Number of record inserted..."+ result);
    }
}
