import java.util.ArrayList;

/**
 * Created by janny on 25.02.2018.
 */
public class MergeSort implements Sort {

    private void merge(ArrayList<Integer> a, int p, int q, int r) {
        ArrayList<Integer> arrayResult = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>(a.subList(p, q + 1));
        ArrayList<Integer> arr2 = new ArrayList<>(a.subList(q + 1, r + 1));

        while (!arr1.isEmpty() && !arr2.isEmpty() ){

            if (arr1.get(0) <= arr2.get(0)) {
                arrayResult.add(arr1.get(0));
                arr1.remove(0);

            } else {
                arrayResult.add(arr2.get(0));
                arr2.remove(0);
            }

        }

        if (!arr1.isEmpty()){
            arrayResult.addAll(arr1);
        } else if (!arr2.isEmpty()) {
            arrayResult.addAll(arr2);
        }

        for (int k = p, i = 0; k <= r; k++, i++) {
            a.set(k, arrayResult.get(i));
        }

    }

    public void sort(ArrayList<Integer> arrayList, int p, int r){

        if (p < r) {
            int q = (p + r)/2;
            sort(arrayList, p, q);
            sort(arrayList, q+1, r);
            merge(arrayList, p, q, r);
        }
    }
}
