public class Final1 {
    public static void main(String[] args) {
        try{
            System.out.println(9/0);
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("pichi vasavi");
        }
    }
}
