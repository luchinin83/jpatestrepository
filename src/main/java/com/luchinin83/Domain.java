package com.luchinin83;

import com.luchinin83.bl.HibernateUtil;
import com.luchinin83.entity.Address;
import com.luchinin83.entity.Employee;
import com.luchinin83.entity.Project;
import com.luchinin83.service.AddressService;
import com.luchinin83.service.ProjectService;
import org.hibernate.Session;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Domain {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Address address = new Address();
        address.setId(1L);
        address.setCountry("DC");
        address.setCity("Gotham City");
        address.setStreet("Arkham street 1");
        address.setPostCode("12345");

        Project project = new Project();
        project.setId(1L);
        project.setTitle("Gotham City Police Department Commissioner");

        Employee employee = new Employee();
        employee.setId(1L);
        employee.setFirstName("James");
        employee.setLastName("Gordon");

        Calendar calendar = Calendar.getInstance();
        calendar.set(1939, Calendar.MAY, 1);

        employee.setBirthday(new Date(calendar.getTime().getTime()));
        employee.setAddress(address);

        Set<Employee> employees = new HashSet<>();
        employees.add(employee);
        project.setEmployees(employees);

        Set<Project> projects = new HashSet<>();
        projects.add(project);
        employee.setProjects(projects);

        session.save(address);
        session.save(project);
        session.save(employee);

        session.getTransaction().commit();
        HibernateUtil.shutdown();

    }
}
