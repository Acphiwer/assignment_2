package za.ac.cput.assignment_2;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetListTest
{
    Set<String> clientSet = new HashSet<>();

    @Test
    public void testSet()
    {
        clientSet.add("Asiphiwe");
        clientSet.add("Bongisa");
        clientSet.add("Lukhona");
        System.out.println("These are clients :" + "\n" + clientSet);
        assertEquals(3, clientSet.size());

        //Lukhona is being removed on the list

        clientSet.remove("Lukhona");
        System.out.println(" " + clientSet);
        assertEquals(2, clientSet.size());

        //Search remaining elements in the list after deleting one client
        System.out.println("Search");
        try {
            clientSet.contains("");
            System.out.println("Finding....");
            System.out.println(clientSet);

        } catch (Exception e) {
            System.out.println("No results");
        }
        System.out.println(clientSet + " was found ");
        assertEquals(2,clientSet.size());
    }


}