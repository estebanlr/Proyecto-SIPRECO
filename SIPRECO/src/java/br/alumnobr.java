
package br;

import be.alumnobe;
import dao.alumnodao;
import java.util.List;

public class alumnobr {

    public alumnobr() {
    }
    public int nuevoAlumno(alumnobe a){
        return new alumnodao().registrarAlumno(a);
    }
    public int EliminaAlumno(alumnobe a){
        return  new alumnodao().Eliminar(a);
    }
   public List<alumnobe> ListarAlumnos(){
       return new alumnodao().listarAlumno();
   } 
}
