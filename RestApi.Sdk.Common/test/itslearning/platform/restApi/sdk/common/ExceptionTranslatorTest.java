/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package itslearning.platform.restApi.sdk.common;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Amund
 */
public class ExceptionTranslatorTest {

    public ExceptionTranslatorTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception
    {
    }

    @AfterClass
    public static void tearDownClass() throws Exception
    {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of fromHttpStatus method, of class ExceptionTranslator.
     */
    @Test
    public void testFromHttpStatus()
    {
        System.out.println("fromHttpStatus");
        HttpStatusWrapper httpStatus = new HttpStatusWrapper(org.springframework.http.HttpStatus.UNAUTHORIZED);
        Exception expResult = null;
        System.out.println(httpStatus.getDescription());
        Exception result = ExceptionTranslator.fromHttpStatus(httpStatus);
        assertTrue(result instanceof SecurityException);        
    }

}