package academy.devonline.java.basic.section01_setup.section06_setup;

public class FindMinElementcount {
    public static void main(String[] args) {
        int []array = {5,2,3,4,4,3,3,2,2,2,2,2};
        var elem =2;
        var coun = 0;
        for (int value : array) {
            if (value == elem){
                coun++;
            }
        }
        System.out.println(coun);
    }
}
