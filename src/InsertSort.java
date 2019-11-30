public class InsertSort {
    private int[] numbers;

    InsertSort(int[] numbers) {
        this.numbers = numbers;
    }

    private void insertSort() {
        for (int i = 1; i < numbers.length; i++) {
            int tmp = numbers[i];
            for (int j = i; j > 0 && numbers[j - 1] > numbers[j]; j--)
                swap(j, j - 1);
        }
    }

    private void swap(int i, int j) {
        int tmp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = tmp;
    }

    public int[] getNumbers() {
        return this.numbers;
    }

    public void showResult() {
        insertSort();
        for (int i : numbers) {
            System.out.print(i + "\t");
        }
    }

}
