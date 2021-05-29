package dom.vet;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Veterinaria {
    private String NombreVet;
    private ArrayList<Mascota>mascotas;
    public Veterinaria(String nombre, String sexo, int edad, boolean esterilizado){
        this.mascotas=new ArrayList<>();

    }
    public boolean operarMascotas(Operable mascotaAOperar){
        return mascotaAOperar.operar();

    }
    public boolean noOperarMascotas(Operable MascotaNoAOperar){
        return MascotaNoAOperar.noOperar();
    }

    public ArrayList<Mascota> getMascotas() {
        return (ArrayList<Mascota>) mascotas.stream().filter(mascota->mascota.isEsterilizado()==true).collect(Collectors.toList());
    }
    //public getPacienteAOperar()=list<MascotaApta>{

    //}
    public ArrayList<Mascota> operar(){
        return (ArrayList<Mascota>) mascotas.stream().filter(mascota->mascota.isEsterilizado()==true).filter(mascota -> mascota.isEsterilizado()==false).collect(Collectors.toList());
    }

}
