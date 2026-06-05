import java.util.*;
public class StrExp {
    public static void main(String[] args) {
        try{
        String s = null;
        String s1 = "BB";
        if(s.equals(s1)){
            System.out.println("Equal");
        }
        System.out.println("Equal");
    }catch(NullPointerException e){
        System.out.println("Null");
    }
    catch(ArithmeticException e){
        System.out.println("AE");
    }
    }
}
