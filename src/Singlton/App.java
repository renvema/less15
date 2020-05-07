package Singlton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Singlton firstSinglton = Singlton.getInstance();
        Singlton secondSinglton = Singlton.getInstance();

        Singlton thirdSinglton = null;
        Class<Singlton> informationAboutClass = Singlton.class;
        Constructor<Singlton> informationConstructor = informationAboutClass.getDeclaredConstructor();
        informationConstructor.setAccessible(true);
        thirdSinglton = informationConstructor.newInstance();
        //  thirdSinglton = new Singlton();

        System.out.println(firstSinglton.hashCode());
        System.out.println(secondSinglton.hashCode());
        System.out.println(thirdSinglton.hashCode());
    }
}
