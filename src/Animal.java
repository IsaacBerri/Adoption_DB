import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;

public class Animal{
//Atributos----------------------------------------------------------------------------------------------------
    private int id;
    String name;
    int age;
    String race;
    String specie;
    String description;
    Scanner sc = new Scanner(System.in);
//Atributos----------------------------------------------------------------------------------------------------

//Constructor----------------------------------------------------------------------------------------------------
    public Animal() throws IOException {

    }
//Constructor----------------------------------------------------------------------------------------------------

//Setters y Getters----------------------------------------------------------------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {

        this.race = race;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {

        this.specie = specie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) throws Exception {
        if (description.length() <= 25) {

            this.description = description;
        }else {
            throw new RuntimeException("La descripcion es muy larga");
        }

    }
//Setters y Getters----------------------------------------------------------------------------------------------------


    public void registerAnimal() throws IOException {
        try {
            System.out.println("Enter name");
            setName(sc.nextLine());
            System.out.println("Enter age");
            setAge(Integer.parseInt(sc.nextLine()));
            System.out.println("Enter race");
            setSpecie(sc.nextLine());
            System.out.println("Enter specie");
            setRace(sc.nextLine());
            System.out.println("Enter description");
            setDescription(sc.nextLine());
        }catch(Exception err) {
            String exceptionType = err.getClass().getName();
            if (exceptionType.equals("java.lang.NumberFormatException")) {
                Tools.updateLogger(Level.SEVERE, "El usuario ingresó una cadena de texto en age");
            }
            if (exceptionType.equals("java.lang.RuntimeException")) {
                Tools.updateLogger(Level.SEVERE, "El usuario ingresó una cadena de texto muy larga en descripton");
            }
        }
    }

//CRUD----------------------------------------------------------------------------------------------------
    public void addAnimal() {

    }

    public void readAnimal() throws IOException {

    }

    public void updateAnimal() {

    }

    public void deleteAnimal() throws IOException {
    }
//CRUD----------------------------------------------------------------------------------------------------
}
