package enum_1;
enum Color{
    RED,GREEN,BLUE;
}
public class enum_values {
    public static void main(String[] args) {
        Color[] arr=Color.values();
        for(Color color2:arr){
            System.out.println(color2+" at index "+color2.ordinal());
        }
        System.out.println(Color.valueOf("GREEN"));
    }
}
