package operatpr;
public class dowhile {
    public static void main(String[] args) {
        int i=0;
        int sum =0;
        do{
            sum=sum+i;
            i++;
        }while(i<100);
        System.out.println(sum);
    }
}
