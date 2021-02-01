package com.cybage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;
//
///**
// * Unit test for simple App.
// */
//public class AppTest 
//    extends TestCase
//{
//    /**
//     * Create the test case
//     *
//     * @param testName name of the test case
//     */
//    public AppTest( String testName )
//    {
//        super( testName );
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
//}

public class AppTest{
	
	@Tag("DEV")
	@Test
	public void Test1() {
		assertEquals(1, 1);
	}
	
	@Tag("PROD")
	@Test
	public void Test2() {
		assertEquals(1, 1);
	}
}