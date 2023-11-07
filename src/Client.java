import java.util.Scanner;

public class Client extends User {
//Atributos----------------------------------------------------------------------------------------------------
    int id;
    String address;
    int contactNumber;
    int stratum;
    int idProcessAdoption;
//Atributos----------------------------------------------------------------------------------------------------

//Constructor----------------------------------------------------------------------------------------------------
    Client (){

    }
//Constructor----------------------------------------------------------------------------------------------------

//Setters y Getters----------------------------------------------------------------------------------------------------
    public String getAddress() {
        return address;
    }

    public void setAddress() {
        Scanner sc = new Scanner(System.in);
        address = sc.nextLine();
    }

    public int getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber() {
        Scanner sc = new Scanner(System.in);
        contactNumber = sc.nextInt();
    }
    public int getStratum() {
        return stratum;
    }
    public void setStratum() {
        Scanner sc = new Scanner(System.in);
        stratum = sc.nextInt();
    }
//Setters y Getters----------------------------------------------------------------------------------------------------

//Metodos------------------------------------------------------------------------------------------------------------
    // Este metodo se encarga se subir los datos que capturo el reguister de la clase user a DB, nose si este bien dejarlo aca
    public void addClient() {

    }
//Metodos------------------------------------------------------------------------------------------------------------
}