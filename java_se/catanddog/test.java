package catanddog;

public class test {
    public static void main(String[] args) {
        show(new cat());
        show(new dog());
        animal a=new cat();
        a.eat();
        
    }
    public static void show(animal a){
        a.eat();
        if (a instanceof cat) {
            cat c=(cat)a;
            c.work();
        } else if(a instanceof dog) {
            dog b=(dog)a;
            b.work();
        }
       

    }
}
