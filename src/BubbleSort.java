import java.util.ArrayList;

/**
 * Created by janny on 01.03.2018.
 */
public class BubbleSort implements Sort{

    public void sort(ArrayList<Integer> arrayList, int p, int r){

        int k;
        for (int j = 0; j <= r; j ++) {

            for (int i = r; i > j; i--) {
                if (arrayList.get(i) < arrayList.get(i - 1)) {
                    k = arrayList.get(i - 1);
                    arrayList.set(i - 1, arrayList.get(i));
                    arrayList.set(i, k);
                }

            }
        }

    }
}
