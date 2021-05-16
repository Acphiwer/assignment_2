package za.ac.cput.assignment_2;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    @Test
    public void testList() {
        ArrayList clients = new ArrayList();
        clients.add(0, "Asiphiwe");
        clients.add(1, "Bongisa");
        clients.add(2, "Lukhona");
        System.out.println(" " + clients);
        assertEquals(3, clients.size());

        clients.remove("Lukhona");
        System.out.println(" " + clients);
        assertEquals(2, clients.size());

        System.out.println("Search");
        try {
            clients.contains("Lukhona");
            System.out.println("Finding....");
            System.out.println(clients);

        } catch (Exception e) {
            System.out.println("No results");
        }
        System.out.println(clients + " was found ");
        assertEquals(2,clients.size());
    }

    }


