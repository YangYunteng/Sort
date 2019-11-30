public class BubbleSort {
    private int[] numbers;
    BubbleSort(int[] numbers){
        this.numbers=numbers;
    }
    private void bubbleSort(){
        for(int i=0;i<numbers.length;i++){
            for(int j=numbers.length-1;j>i;j--)
                if(numbers[j]<numbers[j-1])
                    swap(j,j-1);
        }
    }
    private void swap(int i,int j){
        int tmp=numbers[i];
        numbers[i]=numbers[j];
        numbers[j]=tmp;
    }
    public int[] getNumbers(){
        return this.numbers;
    }
    public void showResult() {
        bubbleSort();
        for (int i:numbers) {
            System.out.print(i + "\t");
        }
    }

}
