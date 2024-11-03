import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        //DATA STRUCTURES İN JAVA -LİNKED LİST
        LinkedList linkedlist1 = new LinkedList();//linked list sınıfından linkedlist1 adında nesne oluşturduk.
        LinkedList<String> isimler = new LinkedList<String>();//String formatında bir bağlı liste(linkedList) oluşturduk.

        //listeye eleman ekledik add ile
        isimler.add("kanuni");
        isimler.add("yavuz");

        //listenin başına eleman eklemek=addFirst()
        isimler.addFirst("mehmet");
        //listenin sonuna isim eklemek=addLast()
        isimler.addLast("fatih");

        //add ile istenen indexe de eleman eklemek mümkün
        isimler.add(0,"hatice");//0.indexe haticeyi ekler

        //set ile ilgili indexteki veriyi değiştirme güncellemek için set kullanırız
        isimler.set(2,"gamze");

        //remove ile ilgili indexteki veriyi silebiliriz
        isimler.remove(2);
        isimler.remove("mehmet");

        //istenen indexi direkt get ile de çağırabiliriz
        System.out.println(isimler.get(2));

        //push ile ilgili veriyi listenin başına alabiliriz
        isimler.push("fatih");//aşağıda for döngüsü ile listeyi bastık fatihi başa aldı
        //pop ile listenin ilk elemanını silebilirsin
        isimler.pop();//fatih değil artık ilk eleman...


        //isimleri ekrana basalım forEach ile
        for(String isim:isimler){
            System.out.println(isim);
        }

        //getLast ile son indexi basabiliriz ekrana...
        System.out.println("son index : "+isimler.getLast());

        //liste içinde istenen eleman var mı ? if ve contains ile kontrol edebiliriz
        if(isimler.contains("fatih")){
            System.out.println("listede fatih vardır...");
        }

        //herhangi bir linkedListi silmek için
        //oluşturduğun linkedList yapısının ismiyle clearı kullan
        //isimler.clear();

    }
}