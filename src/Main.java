public class Main {
    public static void main(String[] args) {
        StopWatch run = new StopWatch();
        run.start();
        for (long i = 0; i < 100000; i++) {
            long j = i;
        }
        run.stop();
        System.out.println("time of runing is: "+ run.getElapsedTime());
    }

}
