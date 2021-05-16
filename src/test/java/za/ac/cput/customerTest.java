package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class customerTest
{
    @Test
    void CollectionTest()
    {
        Collection c= new LinkedHashSet();
        customer c1 = new customer();
         c.add(c1);
         System.out.println("This is the length of the array after add and before remove "+c.size());
         System.out.println(c.contains(c1));
         c.remove(c1);
         System.out.println("This is the length after remove "+c.size());

    }
    @Test
      void MapTest() {
        Map<Integer, customer> customerMap = new HashMap<>();
        customer c2 = new customer();
        customerMap.put(4,c2);
        assertEquals(c2,customerMap.get(4));
        }


    @Test
    void setTest()
    {
        Set<customer> customerSet = new HashSet<>();
        customer c3 = new customer();
        customerSet.add(c3);
        Iterator<customer> itr=customerSet.iterator();
        while(itr.hasNext()){
            assertSame(c3,itr.next());
        }
        customerSet.remove(c3);
        System.out.println(customerSet.size());
    }

    @Test
    void listTest()
    {
        List<customer>customerList=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            customer c4= new customer();
            customerList.add(c4);
        }
        assertEquals(5,customerList.size());

    }

}