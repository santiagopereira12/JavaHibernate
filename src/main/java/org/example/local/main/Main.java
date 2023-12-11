package org.example.local.main;

import org.example.local.entity.Employee;
import org.example.local.util.UtilEntity;

import javax.persistence.EntityManager;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManager em = UtilEntity.getEntityManager();
        List<Employee> employees = em.createQuery("SELECT e from registros e", Employee.class).getResultList();
        System.out.println("----LISTAR TODO----");
        employees.forEach(System.out::println);

        System.out.println("----BUSCAR UNO----");
        int employeeId = 4;
        Employee employ = em.find(Employee.class, employeeId);
        System.out.println("registro encontrado: " +employ);

        System.out.println("----CREAR UNO----");
        Employee newRegister = new Employee();
        newRegister.setCorreo("ingreso@hibernate.com");
        newRegister.setNombre("Ingreso");
        newRegister.setApellido("hibernate");
        newRegister.setPassword("123456789");

        em.getTransaction().begin();
        em.persist(newRegister);
        em.getTransaction().commit();

        System.out.println("Nuevo registro Creado" +newRegister);
    }
}
