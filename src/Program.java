public class Program {

    static SomeThing mThing;

    public static void main(String[] args){
        mThing = new SomeThing();

        Thread myThready = new Thread(mThing);
        myThready.start();

        System.out.println("main thread stops");
    }

}
