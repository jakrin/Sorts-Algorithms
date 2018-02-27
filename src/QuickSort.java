/**
 * Created by janny on 18.02.2018.
 */

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class QuickSort implements Sort{

    public void sort(ArrayList<Integer> arr, int first_element, int last_element){

        if (arr.size() == 0) return;
        if (first_element > last_element) return;

        int p = arr.get((first_element + last_element)/2);
        int a,b;
        int j = last_element;
        int i = first_element;

                while (i <= j){
                    while ((arr.get(i) < p)){
                        i++;
                    }

                    while (arr.get(j) > p) {
                        j--;
                    }
                    if (i <= j) {
                        a = arr.get(i);
                        b = arr.get(j);
                        arr.set(i, b);
                        arr.set(j, a);

                        i++;
                        j--;

                    }

                }

        if (first_element < j)
            sort(arr, first_element , j);

        if (i < last_element){
           sort(arr, i, last_element);
        }

    }

    }
