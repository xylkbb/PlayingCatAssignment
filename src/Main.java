public class Main {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

    }

    private static boolean isCatPlaying(boolean summer, int temperature) {
        if(summer){
            return temperature >= 25 && temperature <= 45;
        }else{
            return temperature >= 25 && temperature <= 35;
        }
    }


}