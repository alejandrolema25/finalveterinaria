package dom.vet;

public class MascotaApta extends Mascota  {


    protected MascotaApta(String nombre, String sexo, int edad, boolean esterilizado) {
        super(nombre, sexo, edad, esterilizado);
    }

    @Override
    public boolean operar() {
        return false;
    }

    @Override
    public boolean noOperar() {
        return false;
    }
}
