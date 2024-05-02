public class Employee{
    
    private String name;
    public static int member = 0;
  
    public Employee(){
        this.name = "匿名希望";
        member++;
    }

    public Employee(String name){
       if(name.length() > 10){
        this.name = new StringBuilder(name).substring(0, 10);
       } else {
        this.name = name;
       }
       member++;
    }

    public void printName(){
        System.out.println("私はMETATEAMの社員です。名前は" + name + "です。");
    }

    public void printMember(){
        System.out.println("社員は全部で" + member + "です。");
    }
}