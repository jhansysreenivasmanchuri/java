package com.wipro.java.java8.usecase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;

public class EmployeeManagementTest {
    private EmployeeService service;

    @Before
    public void setUp() { 
        service = new EmployeeService();
        service.addEmployee(new Employee(1, "Sree", "HR", 50000, LocalDate.of(2023, 5, 10)));
        service.addEmployee(new Employee(2, "Mani", "IT", 60000, LocalDate.of(2024, 6, 10)));
    }

    @Test
    public void testingAddEmployee() { 
        Employee emp = new Employee(3, "Kiran", "Finance", 55000, LocalDate.of(2023, 5, 10));
        service.addEmployee(emp);
        Optional<Employee> detected = service.searchEmployee(3);
        assertTrue(detected.isPresent());
        assertEquals("Kiran", detected.get().getName());
    }

    @Test
    public void testingRemoveEmployee() { 
        service.removeEmployee(1);
        assertFalse(service.searchEmployee(1).isPresent());
    }

    @Test
    public void testingSearchEmployee() { 
        Optional<Employee> emp = service.searchEmployee(2);
        assertTrue(emp.isPresent());
        assertEquals("Mani", emp.get().getName());
        assertNotEquals("John", emp.get().getName());
    }

    @Test
    public void testingUpdateSalary() { 
        service.updateSalary(2, 75000);
        assertEquals(75000.0, service.searchEmployee(2).get().getSalary(), 0.001); 
    }

    @Test
    public void testingGetAverageSalary() { 
        double avg = service.getAverageSalary();
        assertEquals(55000.0, avg, 0.01); 
    }

    @Test
    public void testingFilterByDepartment() { 
        List<Employee> hrMembers = service.filterByDepartment("HR");
        assertEquals(1, hrMembers.size());
        assertEquals("Sree", hrMembers.get(0).getName());
    }

    @Test
    public void testingSortByName() { 
        List<Employee> sorted = service.sortByName();
        assertEquals("Sree", sorted.get(1).getName());
        assertEquals("Mani", sorted.get(0).getName());
    }
}
