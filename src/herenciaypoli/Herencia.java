/*========================================================
======POLIMORFISMO, Las clases empleado,consultor,etc=====
=======heredan datos de Persona que es su clase Madre=====
==========================================================*/
//ANOTAR EXTENDS EN LIBRO

package herenciaypoli;


public class Herencia {

    public static void main(String[] args) {
        
        Persona[] vector = new Persona[5];
        vector[0] = new Persona();
        vector[1] = new Empleado();
        vector[2] = new Consultor();
        vector[3] = new Jefe();
        
        Persona perso = new Persona();
        Consultor consul = new Consultor();
        
        perso = consul;  
     /* consul = perso; //Esta mal
        
        ====NO SE PUEDE YA QUE NO SE PUEDE====
        ASIGNAR VALORES DE UN PADRE A UN HIJO,
        =====SOLO DE UN HIJO A UN PADRE!======*/

        
    }
    
}
