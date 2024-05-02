public class Practice{
    public static void main(String[] args){
        public static void main(String[] args){
            System.out.println("1～入力された値までの和を計算します");
            System.out.println("値を入力してください");
    
            int num = new java.util.Scanner(System.in).nextInt();
    
            int ans = 0;
            for(int i = 0; i <= num; i++){
                ans += i;
            }
    
            System.out.println("1から" + num + "の和は" + ans + "です");
    }
}