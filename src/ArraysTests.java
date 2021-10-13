import  static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArraysTests {

	@Test
	void simpleArrayTests() {
		int ar[] = new int[10];
		ar[9] = 2;
		assertEquals(2, ar[9]);
		int ar1[] = ar;
		ar1[9] = 20;
		assertEquals(20, ar1[9]);
		assertEquals(20, ar[9]);
	}
	@Test
	void swapTests () {
		int ar[] = {-10, 20, 12, 40};
		assertEquals(40, ar[3]);
		assertEquals(12,ar[2]);
		//swap
		int tmp = ar[3];
		ar[3] = ar [2];
		ar[2] = tmp;
		assertEquals(12, ar[3]);
		assertEquals(40,ar[2]);
	}
	@Test
	void twoDimensional1() {
		int ar[][] = {{1,2,3}, {10,20,30}, {100,200,300}};
		assertEquals(20, ar[1][1]);
		}
	@Test
	void twoDimensional2() {
		int ar1[] = {10, -3, 8};
		int ar2[] = {-7, 11};
		int ar3[] = {1, 2, 3, 4};
		int ar[][] = {ar1, ar2, ar3};
		ar[1][1] = 10;
		assertEquals(10, ar2[1]);
	}
	@Test
	void systemArrayCopy() {
		int ar[] = new int[5];
		int ar1[] = {1, 2, 3};
		int ar2[] = {4, 5};
		int expected[] = {1, 2, 3, 4, 5};
		System.arraycopy(ar1, 0, ar, 0, ar1.length);
		System.arraycopy(ar2, 0, ar, 3, ar2.length);
		assertArrayEquals(expected, ar);
		
	}
}
