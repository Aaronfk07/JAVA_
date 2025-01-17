package at.aaron_frick.swp.AufgabenKW3.Nachmittag;

class VariableDemo {
        int instanceVar = 1; // Instanzvariable
        static int classVar = 2; // Klassenvariable

        void display() {
            System.out.println("Instance Variable: " + instanceVar);
            System.out.println("Class Variable: " + classVar);
        }

        public static void main(String[] args) {
            VariableDemo obj1 = new VariableDemo();
            VariableDemo obj2 = new VariableDemo();

            obj1.instanceVar = 10; // Änderung nur für obj1
            obj2.instanceVar = 20;

            VariableDemo.classVar = 30; // Änderung wirkt für alle Objekte

            obj1.display();
            obj2.display();
        }
    }


