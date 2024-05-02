class Main{
    public static void main(String[] args){
        int [][] seiseki = {
            {20, 50, 60},
            {30, 60, 70},
            {45, 60, 80},
            {35, 40, 50}
        };
        
        for(int i = 0; i < seiseki.length; i++){
            for(int j = 0; j < seiseki[i].length; j++){
                 System.out.println("社員" + (i+1) + "の" + (j+1) +  "回目の点数は" + seiseki[i][j] + "です。");
            }
        }
    }
}