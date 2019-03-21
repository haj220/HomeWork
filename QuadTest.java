/**
 * Contributions: Worked on all methods together, everyone contributed equally
 * 
 * Test class for the Quad Class
 * 
 * @author Cam Rosenthal, Zach Weinert, Vincent Albanese
 * @version 2018.04.24
 *
 */
public class QuadTest extends student.TestCase {
    private Quad a;

    private Point top;
    private Point bot;

    /**
     * set up Quads
     */
    public void setUp() {
        top = new Point(0, 0);
        bot = new Point(3, 3);
        a = new Quad(top, bot);

    }

    /**
     * test insert method
     */
    public void testInsert() {
        top = new Point(0, 0);
        bot = new Point(3, 3);
        a = new Quad(top, bot);
        Point p = new Point(1, 1);

        assertTrue(a.inTheBound(p));

        a.insert(1, 2, "for");
        a.insert(1, 3, "for");

        a.insert(2, 3, "for");
        a.insert(2, 1, "bank");
        a.insert(2, 2, "school");
        a.insert(2, 2, "for");
        assertNull(a.search(10, 0));
        a.insert(null);
        assertEquals("[]", a.search("lol").toString());

        // a.insert(null);

        assertEquals("[for]", a.search(1, 2).getPlace().toString());
        assertEquals("[for]", a.search(1, 3).getPlace().toString());
        assertEquals("[school, for]", a.search(2, 2).getPlace().toString());
        assertEquals("[bank]", a.search(2, 1).getPlace().toString());
        assertEquals("[(2, 2)[school, for]]", a.search("school").toString());

        assertNull(a.search(10, 10));

        // assertEquals("bank",a.search("bank").toString());

        a.insert(null);
        assertEquals(
                "[(1, 3)[for], (1, 2)[for], (2, 3)[for], (2, 2)[school, for]]",
                a.search("for").toString());
    }

    /**
     * test search method
     */
    public void testSearch() {
        a.insert(1, 1, "first");

    }
    
    /**
     * test improved insert method
     */
    public void testImprovedInsertAndSearch() {
        a.insert(1, 1, "bank", "first", "second", "third");
        a.insert(10, 10 ,"bank", "first", "second", "third");
        a.insert(1, 1 ,"school", "first", "second", "third");
        //a.insert(1, 1, "bank", "first", "second", "third");
        assertTrue(systemOut().getHistory().contains("out of bound"));
        //assertTrue(systemOut().getHistory().contains("it exists"));
        assertEquals(a.streetSearch("first", "bank").toString(), "[(1, 1)[bank]]");
        assertEquals(a.streetSearch("first", "school").toString(), "[(1, 1)[school]]");
        
        assertEquals("",a.streetSearch("first").toString());
        //a.streetSearch(null);
        //assertTrue(systemOut().getHistory().contains("string is null"));
        
        
    }
    public void testStreetSearch() {
        a.insert(2, 2, "bank", "first");
        a.insert(3, 3, "bank", "first");
        assertEquals("",a.streetSearch(1, 1, "first", "bank").toString());
        
        
    }
    

}