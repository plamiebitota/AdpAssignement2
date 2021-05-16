package za.ac.cput;

import org.junit.jupiter.api.Test;
import java.util.function.BooleanSupplier;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class customerTest {
    @Test
    void CollectionTest() {
        Collection c = new LinkedHashSet();
        customer c1 = new customer();
        //add
        c.add(c1);
        //find
        System.out.println(c.contains(c1));
        //remove
        c.remove(c1);
        System.out.println(c.size());

    }

    @Test
    void MapTest() {
        Map<Integer, customer> customerMap = new HashMap<>();
        customer c2 = new customer();
        //add
        customerMap.put(4, c2);
        //find
        assertEquals(c2, customerMap.get(4));
        //remove
        customerMap.remove(4);
        System.out.println(customerMap.size());
    }


    @Test
    void setTest() {
        Set<customer> customerSet = new HashSet<>();
        customer c3 = new customer();
        //add
        customerSet.add(c3);
        //find
        Iterator<customer> itr = customerSet.iterator();
        while (itr.hasNext()) {
            assertSame(c3, itr.next());
        }
        //remove
        customerSet.remove(c3);
        System.out.println(customerSet.size());
    }

    @Test
    void listTest() {
        List<customer> customerList = new ArrayList<>();

        customer c4 = new customer(446, "James", "Brown", "cape town");
        //add
        customerList.add(c4);
        //find
        Object e=customerList.get(0);
        assertEquals(c4,e);
        //remove
        customerList.remove(c4);
        assertTrue(customerList.isEmpty());
    }
}