import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.Iterator;

/**
 * Created by janny on 19.02.2018.
 */
public class Tests {

    private QuickSort sort;

    @Before
    public void init() {
        sort = new QuickSort();
    }

    @Test
    public void Test1(){
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(4,9,7,6,2,3,8));
        sort.quickSort(arr, 0, 6);
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(2,3,4,6,7,8,9));
        assertThat(arr, is(expected));

    }

    @Test
    public void Test2(){
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(4,9,7,6,2,3,1));
        sort.quickSort(arr, 0, 6);
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1,2,3,4,6,7,9));
        assertThat(arr, is(expected));

    }

    @Test
    public void Test3(){
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(4,9,7,6,2,3,1,5));
        sort.quickSort(arr, 0, 7 );
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,9));
        assertThat(arr, is(expected));

    }
}
