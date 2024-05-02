import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
     
        try{
            int i = scanner.nextInt();  //入力された数字がintに格納されている
            int j = scanner.nextInt();                   //1. 実行時引数に数字以外が設定された場合に「数字を入力してください」と出力する。
            
           if(i == 0){
               throw new IllegalArgumentException();            //2. 実行時引数が０個の場合に「引数は2つ設定してください」と出力する。
           }
           
           System.out.println(i/j);
           System.out.println("正常");
            
        } catch(java.util.InputMismatchException e) {
         System.out.println("数字を入力してください");          //1. 実行時引数に数字以外が設定された場合に「数字を入力してください」と出力する。
        } catch(IllegalArgumentException e) {
         System.out.println("引数は2つ設定してください");           //2. 実行時引数が０個の場合に「引数は2つ設定してください」と出力する。
        } catch(Exception e) {
         System.out.println("予期しない例外が発生しました");             //3. その他例外（jが0の場合を含む等）の場合「予期しない例外が発生しました」と出力する。
        } finally {
         System.out.println("終了");
         scanner.close();
        }
     }
    
 }



