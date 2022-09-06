public class LoopForTread2 extends AbstractClass{

    private final int i;

    public LoopForTread2(int i) {
        this.i = i;
    }

    @Override
    public int methodForTread(int i) {
        long[] array = new long[100];
        array[0] = 1;
        array[1] = 1;
        if (i == 0 || i == 1) {
            return 1;
        }

        array[i] = methodForTread(i-1) + methodForTread( i-2);

        return (int) array[i];
    }

    @Override
    public int getIntI() {
        return i;
    }

}
