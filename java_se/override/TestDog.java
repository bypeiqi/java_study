package override;
class Animal{
    public void move(){
        System.out.println("动物可以移动");
    }
}
class Dog extends Animal{
    public void move(){
        super.move();
    }
}
public class TestDog {
    public static void main(String[] args) {
        Animal a=new Dog();
        a.move();
    }
}
