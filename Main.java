import WorkerPackage.OnTaskDoneListener;
import WorkerPackage.OnTaskErrorListener;
import WorkerPackage.Worker;

public class Main {

    public static void main(String[] args) {

        OnTaskDoneListener linester = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;

        Worker worker = new Worker(linester, errorListener);

        worker.start();

    }
}
