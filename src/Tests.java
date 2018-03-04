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

    private QuickSort qSort;
    private MergeSort mSort;
    private BubbleSort bSort;

    @Before
    public void init() {
        qSort = new QuickSort();
        mSort = new MergeSort();
        bSort = new BubbleSort();
    }

    @Test
    public void qTest1(){
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(4,9,7,6,2,3,8));
        qSort.sort(arr, 0, 6);
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(2,3,4,6,7,8,9));
        assertThat(arr, is(expected));

    }

    @Test
    public void qTest2(){
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(4,9,7,6,2,3,1));
        qSort.sort(arr, 0, 6);
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1,2,3,4,6,7,9));
        assertThat(arr, is(expected));

    }

    @Test
    public void qTest3(){
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(4,9,7,6,2,3,1,5));
        qSort.sort(arr, 0, 7 );
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,9));
        assertThat(arr, is(expected));

    }
    @Test
    public void mTest1(){
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(4,9,7,6,2,3,8));
        mSort.sort(arr, 0, 6);
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(2,3,4,6,7,8,9));
        assertThat(arr, is(expected));

    }

    @Test
    public void mTest2(){
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(4,9,7,6,2,3,1));
        mSort.sort(arr, 0, 6);
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1,2,3,4,6,7,9));
        assertThat(arr, is(expected));

    }

    @Test
    public void mTest3(){
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(4,9,7,6,2,3,1,5));
        mSort.sort(arr, 0, 7 );
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,9));
        assertThat(arr, is(expected));

    }

    @Test
    public void bTest1(){
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(4,9,7,6,2,3,8));
        bSort.sort(arr, 0, 6);
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(2,3,4,6,7,8,9));
        assertThat(arr, is(expected));

    }

    @Test
    public void bTest2(){
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(4,9,7,6,2,3,1));
        bSort.sort(arr, 0, 6);
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1,2,3,4,6,7,9));
        assertThat(arr, is(expected));

    }

    @Test
    public void bTest3(){
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(4,9,7,6,2,3,1,5));
        bSort.sort(arr, 0, 7 );
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,9));
        assertThat(arr, is(expected));

    }


}
