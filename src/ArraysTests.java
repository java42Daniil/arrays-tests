import  static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

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
	void systemArrayCopy1() {
		int ar[] = new int[5];
		int ar1[] = {1, 2, 3};
		int ar2[] = {4, 5};
		int expected[] = {1, 2, 3, 4, 5};
		System.arraycopy(ar1, 0, ar, 0, ar1.length);
		System.arraycopy(ar2, 0, ar, 3, ar2.length);
		assertArrayEquals(expected, ar);
	}
	@Test 
	void systemArrayShift() {
		int ar[] = {1, 2, 3, 4, 5};
		System.arraycopy(ar, 1, ar, 0, ar.length -1);//{2, 3, 4, 5, 5};
		ar[ar.length -1] = 0;
		int expected[] = {2, 3, 4, 5, 0};
		assertArrayEquals(expected, ar);
	}
	//////////////homework
	@Test
	void systemArrayDelete() {
		int ar[] = {1, 2, 3, 4, 5};
		int actual[] = new int[4];
		int expected[] = {1, 2, 4, 5};
		//TODO make sure the following assert will pass using System.arraycopy
		int ar1 = 2; //[YG] not good variable name. indDeleted - would be much better
		System.arraycopy(ar, 0, actual, 0, ar1);
		System.arraycopy(ar, ar1 +1, actual, ar1, ar.length-ar1-1);
		assertArrayEquals(expected, actual);
	}
	@Test
	void systemArrayInsert() {
		int ar[] = {1, 2, 3, 4, 5};
		int i = 3; //[YG] indInsert would be better name
		int actual[] = Arrays.copyOf(ar, ar.length+1);
		int expected[] = {1, 2, 3, -10, 4, 5};
		//TODO make sure the following assert will pass using System.arraycopy
		//ar = Arrays.copyOf(ar, ar.length+1);
		System.arraycopy(actual, i, actual, i + 1, actual.length -i -1);
		actual[i] = -10;
		assertArrayEquals(expected, actual);
	}
	@Test
	void arraysCopyOf() {
		//TODO write test for  Arrays.copyOf functionality according to the doc
		int ar[] = {1, 2, 3, 4, 5};
		int[] ar1 = Arrays.copyOf(ar, 2);
		//[YG] println is not a test. You should get used to apply assert statements instead of println. Usually, an Unit test shoud be ran with no additional displayed info
		//[YG] there should be at least three assert statements for three values of the length parameter: the same length as in ar, less and greater than ar.length
		System.out.println(ar1);
	}
	@Test
	void arrayCopyOfRange() {
		//TODO write test for  Arrays.copyOfRage functionality according to the doc
		int ar[] = {1, 2, 3, 4, 5};
		int[] ar1 = Arrays.copyOfRange(ar, 2, 3);
		//[YG] println is not a test. You should get used to apply assert statements instead of println. Usually, an Unit test shoud be ran with no additional displayed info
		System.out.println(ar1);
	}
	@Test 
	void arraysBinarySearch() {
		//TODO write test for  Arrays.copyOfBinarySearch functionality according to the doc
		int ar[] = {1, 2, 3, 4, 5};
		int ar1 = Arrays.binarySearch(ar, 2); 
		int ar2 = Arrays.binarySearch(ar, 3); 
		//[YG] println is not a test. You should get used to apply assert statements instead of println. Usually, an Unit test shoud be ran with no additional displayed info
		//[YG] there should be at least two assert statements for two cases: key (second parameter) does exist in the array and doesn't
		System.out.println(ar1);
	    System.out.println(ar2);
	}
}
