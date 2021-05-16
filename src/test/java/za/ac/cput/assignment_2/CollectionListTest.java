package za.ac.cput.assignment_2;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CollectionListTest
{
    Collection clientCollection = new HashSet();
    @Test
    public void testCollection()
    {
   clientCollection.add("Asiphiwe");
   clientCollection.add("Bongisa");
   clientCollection.add("Lukhona");

   for(Object object: clientCollection)
   {
       System.out.println(object);
       assertEquals(3,clientCollection.size());
   }

        clientCollection.remove("Bongisa");
        System.out.println("Bongisa is removed from the collection of clients:" +clientCollection);
        assertEquals(2,clientCollection.size());

        //Search remaining elements in the list after deleting one client
        System.out.println("Search");
        try {
            clientCollection.contains("");
            System.out.println("Finding....");

        } catch (Exception e) {
            System.out.println("No results");
        }
        System.out.println(clientCollection + " was found ");
        assertEquals(2,clientCollection.size());
    }

}