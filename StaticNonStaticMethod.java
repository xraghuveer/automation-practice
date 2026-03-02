public class StaticNonStaticMethod {
    public static void main(String[] args) {

    }
}
class B{
    public int nonStaticAdd(int i , int j){
        int k  = i+j;
        return k;
    }
    static int staticAdd(int i , int j){
        int k  = i+j;
        return k;
    }
}
