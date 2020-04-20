package Abstract;

public class korim extends mobileUser {
    @Override
    public void sendMessage(int n){
        System.out.println(n);
        
    }
    
    public int Sum(int n, int m){
        int result = n + m;
        return result;
    }
}
