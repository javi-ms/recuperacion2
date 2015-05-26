/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacion2eva;

/**
 *
 * @author Javier
 */
public class Desplegable {
   // ArrayList<String> efectos = new ArrayList();
    String[] efectos={"Estornudos","“Picor de ojos", "Irritaciones en la piel", "Tos"};

    @Override
    public String toString() {
        return "Desplegable{" + "efectos=" + efectos + '}';
    }
    
     public String  EfectosEnfermedad(){
         
         return String.valueOf(efectos);
    }
}
