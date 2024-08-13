public class Main {
    public static void main(String[] args) {

        System.out.println(romanValue(5));
    }

    public static String romanValue(int numeralValue){

        switch (numeralValue){
            case 1:return "I";
            case 5: {
                return "V";
                for (numeralValue=5;i>1;i--){

                }
            }
            case 10:return "X";
            case 50:return "L";
            case 100:return "C";
            case 500:return "D";
            case 1000:return "M";
        }
        return romanValue(numeralValue);

    }
}