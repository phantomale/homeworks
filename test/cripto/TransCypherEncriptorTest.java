/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cripto;

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JuanCamilo
 */
public class TransCypherEncriptorTest {

    public TransCypherEncriptorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class TransCypherEncriptor.
     */
    @Test
    public void testMain() throws IOException {
        System.out.println("main");
        String[] args = new String[]{"-en", "mi mega mensaje nuevisimo", "#"};
        TransCypherEncriptor.main(args);
        args = new String[]{"-de", "mat.txt", "key.txt", "#"};
        TransCypherEncriptor.main(args);
    }

    /**
     * Test of rotateByNinetyToRight method, of class TransCypherEncriptor.
     */
    @Test
    public void testRotateByNinetyToRight() {
        System.out.println("rotateByNinetyToRight");
        char[][] m = new char[][]{{'1', '2'}, {'3', '4'}};
        TransCypherEncriptor.rotateByNinetyToRight(m);
        assertArrayEquals(m, new char[][]{{'3', '1'}, {'4', '2'}});
        TransCypherEncriptor.rotateByNinetyToLeft(m);
        assertArrayEquals(m, new char[][]{{'1', '2'}, {'3', '4'}});
    }

}
