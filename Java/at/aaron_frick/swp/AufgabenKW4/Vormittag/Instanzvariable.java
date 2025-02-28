package at.aaron_frick.swp.AufgabenKW4.Vormittag;

public class Instanzvariable {
        // Instanzvariable: Jede Instanz hat ihren eigenen Wert
        private int instanzVariable = 0;

        // Klassenvariable: Alle Instanzen teilen sich diesen Wert
        private static int klassenVariable = 0;

        // Konstruktor, um Instanzvariable zu erhöhen
        public Instanzvariable() {
            instanzVariable++;
            klassenVariable++;
        }

        public void printWerte() {
            System.out.println("Instanzvariable: " + instanzVariable);
            System.out.println("Klassenvariable: " + klassenVariable);
        }

        public static void main(String[] args) {
            Instanzvariable obj1 = new Instanzvariable();
            obj1.printWerte();

            Instanzvariable obj2 = new Instanzvariable();
            obj2.printWerte();
        }
    }




