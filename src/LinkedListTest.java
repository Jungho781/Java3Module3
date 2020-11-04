import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LinkedListTest {
    @Test
    void testAddNumbers(){
        LinkedList<Integer>list=new LinkedList<>();

        list.addFirst(2);
       assertEquals("2",list.toString());

        for(int h=0;h<=5;h++){
            list.addLast(h*3);
        }
        assertEquals("2, 0, 3, 6, 9, 12, 15",list.toString());
    }

    @Test
    void testGetSize(){
        LinkedList<Integer>intList=new LinkedList<>();
        for(int i=0;i<=5;i++){
            intList.addLast(i);
        }
        assertEquals(6,intList.size());
        intList.print();
    }

    @Test
    void testRemove(){
        LinkedList<Integer>remList=new LinkedList<>();
        for(int j=0;j<=5;j++){
            remList.addLast(j*2);
        }
        assertTrue(remList.size()==6);
        remList.remove(3);
        assertEquals("0, 2, 6, 8, 10",remList.toString());
    }

    @Test
    void testAddIndex(){
        LinkedList<Integer> addList=new LinkedList<>();
        for(int k=0;k<=10;k++){
            addList.addLast(k*5);
        }
        addList.add(2,6);
        assertEquals("0, 5, 10, 15, 20, 2, 25, 30, 35, 40, 45, 50",addList.toString());

    }

    @Test
    void testLimit(){
        LinkedList<String> nameList=new LinkedList<>();
        nameList.addLast("Hassan");
        nameList.print();
        nameList.addFirst("Sarah");
        nameList.print();
        nameList.addLast("Eric");
        nameList.print();
        nameList.add("Ferdinand",2);
        assertEquals("Sarah, Ferdinand, Hassan, Eric",nameList.toString());
        nameList.print();

        nameList.remove(4);
        assertEquals(3,nameList.size());
        nameList.print();

        nameList.add("Dimitri",2);
        assertEquals("Sarah, Dimitri, Ferdinand, Hassan",nameList.toString());
        nameList.print();

    }

}