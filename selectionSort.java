public class selectionSort {
    public static void main(String[] args){
        int[] array = {64,25,12,22,11};

        for(int i=0;i<array.length-1;i++){
            int minIndex=i;//en küçük elemanın index değerini belirledik
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[minIndex]){
                    minIndex=j;
                }
            }

            int temp=array[minIndex];
            array[minIndex]=array[i];
            array[i]=temp;
        }git 

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }


    }
}
