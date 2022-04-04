package singleton;

public class Singleton {
    private static Singleton instanta=null;
    synchronized public static Singleton returnareInstanta(){
        if(instanta==null){
            instanta=new Singleton();
        }
        return instanta;
    }

    //mare grija constructorul sa fie privat !!!!
    private Singleton() {
    }
}
