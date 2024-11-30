import java.util.Stack;//stack kütüphanesini import ettik
public class stack {
    public static void main(String[] args){
        //push()   eleman eklemek için kullanılır
        //peek()   son eklenen elemanı gösterir
        //pop()    son eklenen elemanı siler
        //remove() stack içindeki elemanı siler
        //empty()  stack içindeki elemanları kontrol eder eğer eleman varsa true yoksa false döndürür


        Stack<String> s1 = new Stack<String>();//stack nesnesini oluşturduk
        //eleman ekleme=push()
        s1.push("a");
        s1.push("b");
        s1.push("c");
        s1.push("d");
        //System.out.println(s1);
        for(String goster:s1){
            System.out.println("değer :"+goster);
        }
        System.out.println();
        //son eklenen değeri görme=peek()
        System.out.println("son eklenen değer : "+s1.peek());
        System.out.println();
        //eleman çıkarma=pop()
        System.out.println("son çıkarılan değer :"+s1.pop());
        for(String eski:s1){
            System.out.println("değer :"+eski);
        }

    }
}
