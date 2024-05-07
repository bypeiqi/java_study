    package enum_1;
    enum Color{
        RED,GREEN,BLUE;
    }
    public class enum_switch{
        public static void main(String[] args) {
            Color mycolor=Color.GREEN;
            switch(mycolor){
                case RED:
                    System.out.println("红色");
                    break;
                case GREEN:
                    System.out.println("绿色");
                    break;
                case BLUE:
                    System.out.println("蓝色");
                    break;
                default: 
                    System.out.println("无对应");
                    break;

            }
        }
    }