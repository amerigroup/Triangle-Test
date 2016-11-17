package com.tradeshift.TriangleTest;

import org.junit.Assert;
import org.junit.Test;

import com.tradeshift.Triangle.MyException;
import com.tradeshift.Triangle.Triangle;



/**
 * Unit test for simple App.
 */
public class AppTest 
   
{
    
 

    /**
     * Rigourous Test :-)
     * @throws MyException 
     */
    @Test
    public void testIsNegetiveLength() 
    {
    	try {
			Triangle	t = new Triangle(-1, 4, 5);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	//Assert.assertThat(ex.getMessage(), containsString("age should be +ve"));
    }
    @Test
    public void testIsTriangle() throws MyException 
    {
    	
			Triangle	t = new Triangle(100, 4, 5);
			int ret=t.getShape();
	    	Assert.assertEquals(-1, ret);
		
    	//Assert.assertThat(ex.getMessage(), containsString("age should be +ve"));
    }
    @Test
    public void testIsosceles() throws MyException 
    {
    	Triangle	t = new Triangle(4, 4, 5);
    	int ret=t.getShape();
    	Assert.assertEquals(2, ret);
    	//Assert.assertThat(ex.getMessage(), containsString("age should be +ve"));
    }
    @Test
    public void testEquilateral() throws MyException 
    {
    	Triangle	t = new Triangle(4, 4, 4);
    	int ret=t.getShape();
    	Assert.assertEquals(1, ret);
    	//Assert.assertThat(ex.getMessage(), containsString("age should be +ve"));
    }
    @Test
    public void testScalene() throws MyException 
    {
    	Triangle	t = new Triangle(3, 4, 5);
    	int ret=t.getShape();
    	Assert.assertEquals(3, ret);
    	//Assert.assertThat(ex.getMessage(), containsString("age should be +ve"));
    }
}
