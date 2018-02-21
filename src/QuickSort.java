/**
 * Created by janny on 18.02.2018.
 */

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class QuickSort {

    static  ArrayList<Integer> array = new ArrayList<Integer>();

    public void quickSort(ArrayList<Integer> arr, int first_element, int last_element){

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
            quickSort(arr, first_element , j);

        if (i < last_element){
           quickSort(arr, i, last_element);
        }


    }

    public static void main(String[] args){
        System.out.println("Please, enter array for sorting. Use a space to separate numbers.");
        InputStreamReader inputReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputReader);
        String inputString = "";
        try {
            inputString = bufferedReader.readLine();
            args = inputString.split(" ");
            for (int i = 0; i < args.length; i++){
                array.add(Integer.valueOf(args[i]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        new QuickSort().quickSort(array, 0, array.size() - 1);

        Iterator<Integer> it = array.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        JUnitCore runner = new JUnitCore();
        Result result = runner.run(Tests.class);
        System.out.println("run tests: " + result.getRunCount());
        System.out.println("failed tests: " + result.getFailureCount());
        System.out.println("ignored tests: " + result.getIgnoreCount());
        System.out.println("success: " + result.wasSuccessful());


        }


    }
