package enum_1;

public class enum_for {

    enum Color{
        RED,GREEN,BLUE;
    }    public static void main(String[] args) {
        for(Color c2:Color.values()){
            System.out.println(c2);
        }
    }
}
