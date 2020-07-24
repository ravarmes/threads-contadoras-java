

public class Main {

    public static void main(String[] args) {
        System.out.println("INICIO DA THREAD MAIN ***");
        
        //1. Instanciar as Runnables
        MinhaRunnable minhaRunnable1 = new MinhaRunnable();
        MinhaRunnable minhaRunnable2 = new MinhaRunnable();
        
        //2. Instanciar as Threads
        Thread t1 = new Thread(minhaRunnable1, "thread 1");
        Thread t2 = new Thread(minhaRunnable2, "\t\tthread 2");
        
        //3. Startar/Iniciar as Threads
        t1.start();
        t2.start();
    }
}
