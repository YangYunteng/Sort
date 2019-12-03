public class InsertSort {
    private int[] numbers;

    InsertSort(int[] numbers) {
        this.numbers = numbers;
    }

    private void insertSort() {
        int j;
        for (int i = 0; i < numbers.length; i++) {
            int tmp = numbers[i];
            for (j = i; j > 0 && numbers[j - 1] > tmp; j--)
                numbers[j] = numbers[j - 1];
            numbers[j]=tmp;
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

    public static void main(String[] args) {
        int[] numbers = {3, 78, 7, 2, 10, 22, 15};
        InsertSort insertSort = new InsertSort(numbers);
        insertSort.showResult();
    }

}
