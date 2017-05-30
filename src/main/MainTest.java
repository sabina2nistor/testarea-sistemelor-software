package main;

import static org.junit.Assert.*;


import java.util.stream.IntStream;

import org.junit.Test;
import static main.Fibonacci.check;
import static main.Fibonacci.countFib;

public class MainTest {
	
	String message = "Nu se poate!";
	
	@Test
	public void exampleTest(){
		assertTrue(true);
	}
	
	@Test
	public void checkIfNumberIsFibonacci(){
		assertTrue(check(21));
		assertFalse(check(-21));
		assertFalse(check(7));
		assertFalse(check(0));
		assertTrue(check(1));
	}	
	
	
	@Test
	public void countFib1(){
		assertFalse(countFib(4, new int [] {2, 3, 4, 5}) == 3);
		assertFalse(countFib(4, new int [] {2, 3, -4, 5}) == 1);
		
		assertTrue(countFib(4, new int [] {2, 3, 4, 5}) == 1);
		assertTrue(countFib(4, new int [] {2, 3, -4, 5}) == -1);
		
		assertFalse(countFib(-4, new int [] {2, 3, 4, -5}) == 1);
		assertFalse(countFib(-4, new int [] {2, 3, 4, 5}) == 1);
		
		
		assertTrue(countFib(-1, new int [] {}) == 0);
		
		assertTrue(countFib(-2, new int [] {0, 2}) == 0);
		assertFalse(countFib(3, new int [] {0, 2, 1}) == 0);
		
		
		assertTrue(countFib(4, new int [] {2, 2, 2, 2}) == 4);
		assertFalse(countFib(4, new int [] {-2, -2, -2, -2}) == 4);
				
		assertFalse(countFib(5, new int [] {1, 21, 5, 3, 1}) == 4);
		
		assertFalse(countFib(4, new int [] {2, 3, -4, 5}) == -2);
		
		assertEquals(countFib(4, new int [] {2, 2, 2, 2}), 4);
		
		assertEquals(countFib(4, new int [] {2, 2, 2, 12}), 3);
		
		assertTrue(countFib(1, new int [] {3}) == 0);
		assertTrue(countFib(1, new int [] {2}) == 1);
		assertTrue(countFib(0, new int [] {}) == 0);
		assertTrue( countFib( 50, IntStream.rangeClosed(1, 50).map(x-> x = 2).toArray()) == 50 );
	}
	
	
	
}
