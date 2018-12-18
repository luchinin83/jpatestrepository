package com.luchinin83;

import com.luchinin83.entity.Address;
import com.luchinin83.entity.EmplProj;
import com.luchinin83.entity.Employee;
import com.luchinin83.entity.Project;
import com.luchinin83.service.AddressService;
import com.luchinin83.service.EmplProjService;
import com.luchinin83.service.EmployeeService;
import com.luchinin83.service.ProjectService;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;

public class Domain {

    public static void main(String[] args) {

        AddressService addressService = new AddressService();
        EmployeeService employeeService = new EmployeeService();
        EmplProjService emplProjService = new EmplProjService();
        ProjectService projectService = new ProjectService();

        Address address = new Address();
        address.setId(1L);
        address.setCountry("DC");
        address.setCity("Gotham City");
        address.setStreet("Arkham street 1");
        address.setPostCode("12345");

        Employee employee = new Employee();
        employee.setId(1L);
        employee.setFirstName("James");
        employee.setLastName("Gordon");

        Calendar calendar = Calendar.getInstance();
        calendar.set(1939, Calendar.MAY, 1);

        employee.setBirthday(new Date(calendar.getTime().getTime()));
        employee.setAddressId(address.getId());

        Project project = new Project();
        project.setId(1L);
        project.setTitle("Gotham City Police Department Commissioner");

        EmplProj emplProj = new EmplProj();
        emplProj.setEmployeeId(employee.getId());
        emplProj.setProjectId(project.getId());

        try {
            addressService.add(address);
            employeeService.add(employee);
            projectService.add(project);
            emplProjService.add(emplProj);
        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
