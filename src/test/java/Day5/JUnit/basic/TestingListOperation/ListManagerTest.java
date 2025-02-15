package Day5.JUnit.basic.TestingListOperation;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {
    private ListManager listManager;
    private List<Integer>list;
    @BeforeEach
    void setUp(){
        listManager= new ListManager();
        list= new ArrayList<>();
    }
    @Test
    void testAddElement(){
        listManager.addElement( list,5);
        assertEquals(1,list.size());
        assertTrue(list.contains(5));
    }
    @Test
    void testRemoveElememnt(){
        listManager.addElement(list,10);
        assertTrue(listManager.removeElement(list,10));
        assertFalse(list.contains(10));
        assertEquals(0,list.size());
    }
    @Test
    void testGetSize(){
        assertEquals(0,listManager.getsize(list));

        listManager.addElement(list, 1);
        listManager.addElement(list, 2);
        assertEquals(2, listManager.getsize(list));

        listManager.removeElement(list, 1);
        assertEquals(1, listManager.getsize(list));
    }
    @Test
    void testNullListOperations() {
        assertDoesNotThrow(() -> listManager.addElement(null, 5));
        assertFalse(listManager.removeElement(null, 5));
        assertEquals(0, listManager.getsize(null));
    }

}
