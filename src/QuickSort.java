/**
 * Created by janny on 18.02.2018.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class QuickSort {

    static  ArrayList<Integer> array = new ArrayList<Integer>();

    public static void quickSort(ArrayList<Integer> arr, int first_element, int last_element){
        int p = (first_element + last_element) /2;
        int a,b;
        int j = last_element;

        for (int i = 0; i < j; i++){
            if (arr.get(i) >= arr.get(p)) {
                a = arr.get(i);
                for (; j >= i; j--){
                    if (arr.get(j) <= arr.get(p)){
                        b = arr.get(j);
                        arr.set(i, b);
                        arr.set(j, a);
                        break;
                    }
                }
            }
        }

        if (first_element < p - 1){
            quickSort(arr, first_element , p - 1);
        }
        if (p + 1 < last_element){
            quickSort(arr, p + 1, last_element);
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

        quickSort(array, 1, array.size() - 1);

        Iterator<Integer> it = array.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }


        }


    }
