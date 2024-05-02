class Main{
 public static void main(String[] args){
    CapslationPractice m = new CapslationPractice();
    m.setPrivateDate(200);
    System.out.println("CapslationDate:" + m.getPrivateDate());
 }
}


class CapslationPractice{
    private int privateDate = 100;
    public int getPrivateDate(){
        return privateDate;
    }

    public void setPrivateDate(int privateDate){
        this.privateDate = privateDate;
    }
}
