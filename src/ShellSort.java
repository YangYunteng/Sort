public class ShellSort {
    private int[] numbers;

    ShellSort(int[] numbers) {
        this.numbers = numbers;
    }

    private void shellSort() {
        for (int gap = numbers.length / 2; gap > 0; gap /= 2)
            for (int i = gap; i < numbers.length; i++) {
                for (int j = i; j >= gap && numbers[j] < numbers[j - gap]; j -= gap)
                    swap(j, j - gap);
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
        shellSort();
        for (int i : numbers) {
            System.out.print(i + "\t");
        }
    }

}
