import java.util.Scanner;

public abstract class User{
//Atributos----------------------------------------------------------------------------------------------------
    static String name;
    int docId;
//Atributos----------------------------------------------------------------------------------------------------

//Setters y Getters----------------------------------------------------------------------------------------------------
    public String getName() {
        return name;
    }

    public void setName() {
        Scanner sc = new Scanner(System.in);
        name = sc.next();
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId() {
        Scanner sc = new Scanner(System.in);
        this.docId = sc.nextInt();
    }
//Setters y Getters----------------------------------------------------------------------------------------------------

//Metodos------------------------------------------------------------------------------------------------------------
    //Estos metodos los cree basicamente pasa obtener los valores del adoptante en caso tan no se encuentre ya registrado
    public boolean logging() {
        //Valida si los datos que ingreso el usuario estan ya en DB, solo si estan retorna true
        return true;
    }

    public void register() {
        //Si el logging retorna flase este metodo entra en accion para pedir los datos del cliente y subirlos a DB
    }
    //Los puese en la clase use porque en un principio tenia pensado que el empleado y el cliente tuvieran acceso a esto metodos
    // pero lo termine implementando solo para cliente asi que se puede mover a esa clase
//Metodos------------------------------------------------------------------------------------------------------------
}
