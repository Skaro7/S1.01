public class MainClassLoading {

    public static void main(String[] args) {
        System.out.println("Triger Static");
        ClassLoading.mensaje();


        System.out.println("Creando un objeto");
        ClassLoading C1 = new ClassLoading();

        System.out.println("Creando segundo objeto");
        ClassLoading C2 = new ClassLoading();

    }
}
