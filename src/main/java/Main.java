import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<AbstractClass> array= new ArrayList<>();
        array.add(0, new LoopForTread1(30));
        array.add(1, new LoopForTread2(30));
        for (AbstractClass a: array){
            long bTime = System.nanoTime();
            new Thread(() -> {
                System.out.println(a.methodForTread(a.getIntI()));
            }).start();
            System.out.println("Total time = " + (System.nanoTime() - bTime) / 1_000_000d);
        }
    }
}
