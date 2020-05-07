package Singlton;

public class Singlton {
    private static Singlton singlton;

    private Singlton() {
    }

    public static Singlton getInstance(){
        if (singlton==null){
            singlton = new Singlton();
        }
        return singlton;
    }

}

