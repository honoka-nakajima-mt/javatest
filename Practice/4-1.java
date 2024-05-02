public class Practice{
    
        int a;
        int b;
        String c;
        String d;

        public void sameName(){
            System.out.println("引数を持たないsameNameメソッドです");
        }

        public void sameName(int a1){
            a = a1;
            System.out.println("int型の引数を1つもつsameNameメソッドです。引数：" + a);
        }

        public void sameName(int a1, int b1){
            a = a1;
            b = b1;
            System.out.println("int型の引数を2つもつsameNameメソッドです。引数：" + a + "," + b);
        }

        public void sameName(String c1){
            c = c1;
            System.out.println("String型の引数を1つもつsameNameメソッドです。引数：" + c);
        }

        public void sameName(String c1, String d1){
            c = c1;
            d = d1;
            System.out.println("String型の引数を2つもつsameNameメソッドです。引数：" + c + "," + d);
        }

    }