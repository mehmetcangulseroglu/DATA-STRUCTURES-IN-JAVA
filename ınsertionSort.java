public class ınsertionSort {
    public static void main(String[] args){
        //1.adım
       int[] array ={29,10,14,37,13};
       System.out.println("sıralama öncesi dizi :");
       for(int num:array){
           System.out.print(num+" ");
       }
       System.out.println();


       //3.adım
       //diziyi sıralama metodunu kullanalım
        insertionSort(array);

        System.out.println("sıralama sonrası dizi :");
        for(int num:array){
            System.out.print(num+" ");
        }
        System.out.println();

    }


    //2.adım
    public static void insertionSort(int[] array){
        
        for(int i = 1;i<array.length;i++){
            int key=array[i];//sıradaki elemanı seçmek arrayin 1.elemanı demek dizinin 2.elemanı aslında sağı solla kıyaslamak için key değerini yani 2.elemana atadık
            int j = i-1;

            //key den büyük elemanları sağa kaydırma işlemi
            while(j>=0 && array[j]>key) {
                array[j + 1] = array[j];
                j--;
            }
            //keyi doğru konuma götürmek
            array[j+1]=key;

            //her yapılan işlem sonrası diziyi yazdır
            System.out.print("adım  "+i+": ");
            for(int num:array){
                System.out.print(num +" ");
            }
            System.out.println();
        }
    }
}
