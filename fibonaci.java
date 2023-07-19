import java.util.*;
class fibonaci{
    
    private static Map<Integer,Integer> ca=new HashMap<>();
   public static int fib(int n){
        if(n<=1)
            return n;
        
        if(ca.containsKey(n)){
            return ca.get(n);
        }
        
       int re=fib(n-1)+fib(n-2);
        //System.out.println(re);
        ca.put(n,re);
        return re;
    }
    public static void fibseries(int n){
        if(n<=0)
            return;

        fibseries(--n);
        System.out.println(fib(n));    
    }
    public static void main(String[] args) {
        int n=10;
        // for(int i =0; i<n; i++){
        //     System.out.println(fib(i));
        // }
        fibseries(n);
        System.out.println("Hello, World!");
    }
}