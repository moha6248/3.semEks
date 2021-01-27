package com.example.demo.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupervisorTest {
    private static Supervisor supervisor;
    @BeforeEach
    void setUp() {
        supervisor = new Supervisor(1L, "Noah", "Fenster", "nf@kea.dk");
    }
    @Test
    public void testSupervisorDetails() {
        assertEquals("Noah", supervisor.getFirstName());
        assertEquals("Fenster", supervisor.getLastName());
        assertEquals("nf@kea.dk", supervisor.getEmail());
        System.out.println("\033[0;1m" + "Test completed");
    }
    /*@Test
    void supervisorAreTheSame(){
        Supervisor john = new Supervisor(1L,"John", "Doe","jd@kea.dk");
        Supervisor doe = new Supervisor(2L,"John", "Doe","jd@kea.dk");
        assertEquals(john, doe);
    }*/
    @Test
    void supervisorDetailChange() {
        supervisor.setEmail("emailIsChanged@kea.dk");
        assertEquals("emailIsChanged@kea.dk", supervisor.getEmail());
        System.out.println("\033[0;1m" + "Test completed");
    }
}