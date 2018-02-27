import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by janny on 27.02.2018.
 */
public class Main {

    static ArrayList<Integer> array = new ArrayList<Integer>();

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

        //new QuickSort().sort(array, 0, array.size() - 1);

        new MergeSort().sort(array, 0, array.size() - 1);

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
