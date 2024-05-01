public class Practice {
    public static void main(String[] args){
        System.out.println("1～10の整数を入力してください。");
          int i = new java.util.Scanner(System.in).nextInt();
     
     if(i < 5){
         System.out.println("5未満の整数" + i + "が入力されました");
     } else if(i == 5) {
         System.out.println("5が入力されました");
     } else {
         System.out.println("6以上の整数" + i + "が入力されました");
     }
    }
}
