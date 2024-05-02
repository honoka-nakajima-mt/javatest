public class Employee{
    
    private String name;
  
  
    public Employee(){
        this.name = "匿名希望";
    }

    public Employee(String name){
       if(name.length() > 10){
        this.name = new StringBuilder(name).substring(0, 10);
       } else {
        this.name = name;
       }
    }

    public void printName(){
        System.out.println("私はMETATEAMの社員です。名前は" + name + "です。");
    }
}