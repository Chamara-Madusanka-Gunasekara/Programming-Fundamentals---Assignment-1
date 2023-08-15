public class Demo3 {
    public static void main(String[] args) {
        int firstNum= 456;
        int secondNum = 7890 ;
        String areaCode = "(123)";
        String color = "\033[35;1m", reset = "\033[30;0m";
        System.out.printf("%2$s%1$s%3$s %4$d-%5$d\n",areaCode,color,reset,firstNum,secondNum);

    }
}