public class stackTwo {
    int[] stackArray;//yığının elemanlarını saklayan boş dizi
    int top;//yığın yapısında her zaman son eklenen elemanı gösteren değişken
    int maxSize;//yığının maksimum kapasitesi

    //yığını başlatma metodu
    public void init(int size){
        maxSize=size;
        stackArray=new int[size];
        top=-1;//ilk başta yığın boştur
    }
    //ekleme metodu
    public void push(int value){
        if(top==maxSize-1){
            System.out.println("yığın dolu eleman eklenemez...");
        }
        stackArray[++top]=value;//elemanı ekle ve top değerini arttır
    }
    //pop metodu
    public int pop(){
        if(top==-1){
            System.out.println("yığın boştur çıkarılacak eleman yok...");
            return -1;//boşsa -1 döndür
        }
        return stackArray[top--];//en üstteki elemanı döndür ve tepeyi azalt
    }

    //peek metodu
    public int peek() {
        if (top == -1) {
            System.out.println("Yığın boş!");
            return -1;
        }
        return stackArray[top]; // En üstteki elemanı döndür
    }

    //empty metodu
    public boolean isEmpty() {
        return top == -1; // Tepe -1 ise yığın boştur
    }

    public boolean isFull() {
        return top == maxSize - 1; // Tepe maksimum kapasiteye ulaştıysa doludur
    }


    //main metot
    public static void main(String[] args){
        stackTwo stack = new stackTwo();
        stack.init(5); // Yığını 5 kapasiteyle başlat

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("En üstteki eleman: " + stack.peek());
        System.out.println("Çıkarılan eleman: " + stack.pop());
        System.out.println("Yığın boş mu? " + stack.isEmpty());

        stack.push(40);
        stack.push(50);
        stack.push(60); // Yığın dolu mesajı vermesi beklenir

        while (!stack.isEmpty()) {
            System.out.println("Çıkarılan eleman: " + stack.pop());
        }
    }
}

