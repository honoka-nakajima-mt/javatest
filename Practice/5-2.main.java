import seattle.SeattleEmployee;
import seattle.SeattleSSEmployee;

class Main{
    public static void main(String[] args){
        SeattleEmployee se1 = new SeattleSSEmployee();
        SeattleEmployee se2 = new SeattleSSEmployee();
       
        se1.setEmpName("森本真由");
        se2.setEmpName("Pepper");

        System.out.println("社員名：" + se1.getEmpName() + "/ 所属部署：" + se1.getDept());
        System.out.println("社員名：" + se2.getEmpName() + "/ 所属部署：" + se2.getDept());
    }
}
