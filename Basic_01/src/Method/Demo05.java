package Method;

public class Demo05 {
    public static void main(String[] args) {
        System.out.println(f(5));
    }

    public static int f(int i){
        if (i == 1){
            return 1;
        }else{
            return i * f(i-1);
        }
    }
}
