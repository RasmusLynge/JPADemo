package utils;

import dbfacades.DemoFacade;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class Tester {
  
  public static void main(String[] args) {
    System.out.println("Building the Table(s)");
    //Persistence.generateSchema("pu", null);
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    DemoFacade df = new DemoFacade(emf);
    
  }

}
