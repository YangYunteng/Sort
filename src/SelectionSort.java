public class SelectionSort {
    private int[] numbers;
    SelectionSort(int[] numbers){
        this.numbers=numbers;
    }
    void selectionSort(){
        for(int i=0;i<numbers.length;i++){
            int index=i;
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[j]<numbers[index])
                    index=j;
            }
            swap(i,index);
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
    public void showResult(){
        selectionSort();
        for(int i:numbers)
            System.out.print(i+"\t");
    }
}
