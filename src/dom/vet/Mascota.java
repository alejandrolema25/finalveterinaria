package dom.vet;

import java.util.Arrays;

public abstract class Mascota implements Operable {
    private String nombre;
    private String sexo;
    private int edad;
    public boolean esterilizado;
 public Mascota(String nombre,String sexo,int edad,boolean esterilizado){
this.edad=edad;
this.nombre=nombre;
this.sexo=sexo;
this.esterilizado=esterilizado;
 }

    public boolean isEsterilizado() {
        return esterilizado;
    }

    public String getNombre() {
        return nombre;
    }
    public String getSexo() {
     return sexo;
     
    }
    public int getEdad(){
     return edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEsterilizado(boolean esterilizado) {
        this.esterilizado = esterilizado;
    }
    @Override
    public String toString() {
        String a;
        if(esterilizado==false){

            Arrays mascotas;
            a= mascotas.stream().filter(mascota->mascota.getEdad()>=12 && getEdad()<=18).map.(mascota->mascota.getSexo());
        }
        else
        {
            a=" esta operado";
        }
        return (getNombre()+a);
    }

}
