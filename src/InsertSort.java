public class InsertSort {
    private int[] numbers;

    InsertSort(int[] numbers) {
        this.numbers = numbers;
    }

    private void insertSort() {
        int j;
        for (int i = 1; i < numbers.length; i++) {
            int tmp = numbers[i];
            for (j = i; j > 0 && numbers[j - 1] > numbers[j]; j--)
                numbers[j] = numbers[j - 1];
            numbers[j] = tmp;
        }
    }

    public int[] getNumbers() {
        return this.numbers;
    }

    public void showResult() {
        insertSort();
        for (int i:numbers) {
            System.out.println(i + "\t");
        }
    }
}
