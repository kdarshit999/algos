package org.bk.algo003.sort.insertion;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.collection.IsArrayContainingInOrder.arrayContaining;
import static org.junit.Assert.assertThat;

import org.bk.algo.sort.SortFixtures;
import org.junit.Test;

public class InsertionSortTest {
	
	@Test
	public void testForASmallArrayOfIntegers(){
		Integer[] arr = SortFixtures.fixture1();
		InsertionSort.sort(arr);		
		assertThat(arr, is(arrayContaining(SortFixtures.fixture1Expected())));
	}

}
