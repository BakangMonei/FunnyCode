package finalAssignment;

public class ProgramRuntime {

    static {
        Object interruptedException = null;
        // Object interruptedException1 = interruptedException;
        {

            long start = System.nanoTime();

            // -------- program --------

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // -------------------------------

            long duration = (System.nanoTime() - start) / 1000000;
            System.out.println(duration + "ms");
        }
    }
}
