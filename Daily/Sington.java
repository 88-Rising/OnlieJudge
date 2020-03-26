package Daily;

class EagerSington{

    public static final EagerSington sighton=new EagerSington();

    public EagerSington(){

    }

    public static EagerSington getInstance(){
        return sighton;
    }


}

class LazySigton{

    public static volatile LazySigton sigton=null;

    public LazySigton(){

    }

    public static LazySigton getInstance(){
        if(sigton==null){

            synchronized (LazySigton.class){

                if(sigton==null){
                    sigton=new LazySigton();
                }
            }
        }
        return sigton;
    }

}


public class Sington {



}
