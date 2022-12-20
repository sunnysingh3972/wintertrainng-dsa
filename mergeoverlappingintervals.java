import java.util.Arrays;
import java.util.Comparator;

class pair {
    int start, end;

    pair(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class mergeoverlappingintervals {
    static void mergeIntervals(pair arr[]) {
        Arrays.sort(arr, new Comparator<pair>() {
            public int compare(pair i1, pair i2) {
                return i1.start - i2.start;
            }
        });

        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[index].end >= arr[i].start) {
                arr[index].end = Math.max(arr[index].end, arr[i].end);
                arr[index].start = Math.min(arr[index].start, arr[i].start);
            } else {
                index++;
                arr[index] = arr[i];
            }
        }
        for (int i = 0; i <=index; i++) {
            System.out.println("{ " + arr[i].start + " , " + arr[i].end + " } ");
        }
    }

    public static void main(String[] args) {
        pair arr[] = new pair[4];
        arr[0] = new pair(6, 8);
        arr[1] = new pair(1, 9);
        arr[2] = new pair(2, 4);
        arr[3] = new pair(4, 7);
        mergeIntervals(arr);
    }
}
