public class ClassLoading {

    static {
        //Bloque estatico. Se ejecuta cuando la se crea una clase, antes que nada en la clase
        System.out.println("Primera instancia inicializada cuando se carga");
    }

    {
        // inicializacion sin static. Se ejecuta antes del constructor cada vez que un objeto es creado
        System.out.println("Segunda instancia cuando se carga una miembro estatico");
    }

    public ClassLoading(){
        System.out.println("Constructor");
    }

    static void mensaje() {
        System.out.println("metodo estatico llamado por mensaje()");
    }

}
