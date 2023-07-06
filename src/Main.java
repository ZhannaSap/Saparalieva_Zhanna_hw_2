public class Main {
    public static void main(String[] args) {


        System.out.println(canYouGoOut(35, 20));
        System.out.println(canYouGoOut(45, 20));
        System.out.println(canYouGoOut(19, 28));
        System.out.println(canYouGoOut(34,30));
        System.out.println(canYouGoOut(32,-30));

        System.out.println("Hello world");

        test(generateRandomAge(),10);
        test(generateRandomAge(),25);
        test(generateRandomAge(),34);
        test(generateRandomAge(),28);
        test(generateRandomAge(),15);
    }
    public static int generateRandomAge (){
        double test = (Math.random()*100);
        return (int) test;
    }
    public static void test (int age, int temperature){
        System.out.println(canYouGoOut(generateRandomAge(),generateRandomAge()));
    }
    public static String canYouGoOut (double age, double temperature){
        if (45 >= age && age>=20 && temperature >= -20 && temperature <= 30){
        return "Можно идти гулять";
        }else if (age <= 20 && temperature <= 28 && temperature >= 0){
            return "Можно идти гулять" ;
        }else if( age >= 45 && temperature >= -10 && temperature <= 25){
        return "Можно итдти гулять";
        }else {
         return "Оставайтесь дома";
        }
    }
}