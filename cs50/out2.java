package cs50;

class Classy {

    static int ClassyCount = 0;

    Classy() {
        ClassyCount++;
        System.out.println("Classy watch has been constructed");
    }

    void printPink() {
        System.out.println("Pink has been printed");
    }
}

class Messy {

    Messy() {
        System.out.println("Messy watch has been built");
        Classy watch3 = new Classy();
        watch3.printPink();
    }
}

class ConstructorTracing {

    public static void main(String[] args) {

        Classy watch = new Classy();   
        Messy watch2 = new Messy();    

        System.out.println("Total Classy Watch: " + Classy.ClassyCount);

        watch.printPink();           
    }
}

