import java.util.LinkedList;
import java.util.Queue;
//queuenin arraylistten farkı mesela arraylistte add yaparken araya ekleme yapabiliyordun index verip stack ve queue de sadece eklersin add index almaz
public class queue {
    public static void main(String[] args){
        Queue<String> q = new LinkedList<>();//polymorphism ile nesne oluşturduk
        q.add("pazartesi");
        q.add("salı");
        q.add("çarşamba");

        //isEmpty() kuyrukta eleman olup olmadığını kontrol eder boş mu ? diye soruyor
        System.out.println(q.isEmpty());

        //q.clear();//tüm kuyruğu siler
        //contains() içeriyor mu anlamına gelir
        if(q.contains("salı")){
            System.out.println("salı var");
        }else{
            System.out.println("salı yok");
        }

        //remove() ile bir elemanı silebilirsin içine değer yazarsan yazdığını siler yazmazsan mantığı gereği ilk giren ilk silinir
        q.remove();
        //element() ilk elemanı alıyor silmiyor ama alıyor sadece
        q.element();
        String s= q.element();
        System.out.println(s);
        //pool()  ilk elemanı alıyor ama aynı zamanda listeden siliyor remove() ile aynı mantık
        String ss=q.poll();
        System.out.println(ss);
        //peek() ilk elemanı alıyor ama silmiyor element() gibi yani
        String sss=q.peek();
        System.out.println(sss);
        //offer() add() gibi davranır eleman ekler genelde kuyruk yapısında add yerine bunu kullanırız
        q.offer("perşembe");
        //size() kuyrukta depolanan eleman sayısını verir
        System.out.println(q.size());

        System.out.println("q :"+q);


    }



}
