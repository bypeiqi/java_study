package abs_cls;

public abstract class Employee {
    private String name;
    private String address;
    private int num;
    public Employee(String name,String address,int num){
        System.out.println("创建一个员工");
        this.name=name;
        this.address=address;
        this.num=num;
    }
    public double computePay(){
        System.out.println("员工的computePay");
        return 0.0;
    }
    public void mailCheck(){
        System.out.println("Mailing is check to"+this.name+" "+this.address);
    }
    
}
