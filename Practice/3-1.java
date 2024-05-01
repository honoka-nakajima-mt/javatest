public class Practice{
    public static void main(String[] args){
        int [] scr = {20, 30, 45, 35} ;
        for(int i = 0; i<4; i++){
            System.out.println((i+1) + "番目の人の点数は" + scr[i] + "です。");
        }
        System.out.println("過去問を解いた社員の人数は全部で" + scr.length + "人です。");
    }
}