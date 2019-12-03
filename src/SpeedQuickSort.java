//快速排序的加速方法，当数组长度小于一定的数值的时候速度会变慢，此时替换为插入排序和选择排序速度会更快
public class SpeedQuickSort {

    private void insertSort(int[] numbers, int start, int end) {
        int j;

        for (int i = start; i <= end; i++) {
            int tmp = numbers[i];
            for (j = i; j > 0 && numbers[j - 1] > tmp; j--)
                numbers[j] = numbers[j - 1];
            numbers[j] = tmp;
        }

    }

    private void speedQuickSort(int[] numbers, int start, int end, int m) {
        //递归出口
        if (start > end)
            return;
        //当排序的数量小于指定数量m时，进行插入排序
        if (end - start + 1 <= m) {
            insertSort(numbers, start, end);
        } else {
            //快速排序
            int base = numbers[start];
            int i = start;
            int j = end;
            while (i < j) {
                while (j > i && numbers[j] >= base)
                    j--;
                while (j > i && numbers[i] <= base)
                    i++;
                if (i < j)
                    swap(numbers, i, j);
            }
            swap(numbers, start, i);
            speedQuickSort(numbers, start, i - 1, m);
            speedQuickSort(numbers, i + 1, end, m);
        }
    }


    private void swap(int[] numbers, int i, int j) {
        int tmp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = tmp;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 78, 7, 2, 10, 22, 15};
        SpeedQuickSort speedQuickSort = new SpeedQuickSort();
        speedQuickSort.speedQuickSort(numbers, 0, numbers.length - 1,5);
        for (int i : numbers)
            System.out.print(i + "\t");
    }
}
