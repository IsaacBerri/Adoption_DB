
public class Employee extends User{
//Atributos----------------------------------------------------------------------------------------------------
  String name;
  AdoptionProcess adoption = new AdoptionProcess();
//Atributos----------------------------------------------------------------------------------------------------

//CRUD----------------------------------------------------------------------------------------------------
  //Este CRUD se encarga de consumir el CRUD que esta en AdoptionProcess ya que las funciones que se hacen
  // en el proceso de adopcion las realiza el empleado
  public void createProcess(){
    adoption.addProcess("", "", "");
  }
  public void update(){
    adoption.updateProcess();
  }
  public void read(){
    adoption.readProcess();
  }
//CRUD----------------------------------------------------------------------------------------------------
}
