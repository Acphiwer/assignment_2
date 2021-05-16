package za.ac.cput.assignment_2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapListTest
{
    Map<Integer, String> clientMap = new HashMap();
    @Test
    public void testMap() {

        clientMap.put(101, "client 1");
        clientMap.put(120, "client 2");
        clientMap.put(204, "client 3");
        System.out.println("Clients with their keys:" +clientMap);
        assertEquals(3, clientMap.size());

        String element3 = (String) clientMap.remove(101);
        System.out.println("Client with key number 101 is removed : " +clientMap);
        assertEquals(2,clientMap.size());

        boolean hasKey = clientMap.containsKey(204);
        System.out.println("Key 204 was found:" +clientMap.containsKey(204));
        assertEquals(2, clientMap.size());
    }
}





