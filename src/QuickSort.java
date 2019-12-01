public class QuickSort {
    private int[] numbers;
    public QuickSort(int[] numbers){
        this.numbers=numbers;
    }
    //选取数组中间值作为基准
    private void midQuickSort(int start,int end){
        int piovtIndex=findPiovt(start,end);
        swap(piovtIndex,end);
        int k=partition(start-1,end,numbers[end]);
        swap(k,end);
        if ((k - start) > 1) midQuickSort(start, k-1);
        if ((end - k) > 1) midQuickSort(k+1, end);

    }
    private int findPiovt(int i,int j){
        return (i+j)/2;
    }
    private int partition(int l,int r,int pivot){
        do {
            // find the first value that is >= the pivot
            while (numbers[++l]<pivot);
            // find the first value that is <= the pivot
            while ((r != 0) && (numbers[- -r]>pivot));
            swap(l, r); // swap out-of-place values
        } while (l < r);
        swap(l, r); // reverse the last wasted swap
        return l;

    }
    //选取数组开始值作为基准
    private void firstQuickSort(int start,int end){
        if(start>end)
            return;
        int base=numbers[start];
        int i=start;
        int j=end;
        while(i<j){
            while(i<j && numbers[j]>=base)
                j--;
            while(i<j && numbers[i]<=base)
                i++;
            if(i<j)
                swap(i,j);
        }
        swap(start,i);
        firstQuickSort(start,i-1);
        firstQuickSort(i+1,end);
    }
    private void swap(int i,int j){
        int tmp=numbers[i];
        numbers[i]=numbers[j];
        numbers[j]=tmp;
    }
    private void showFirstQuickSort(){
        firstQuickSort(0,numbers.length-1);
        for(int i:numbers)
            System.out.print(i+"\t");
    }

}
