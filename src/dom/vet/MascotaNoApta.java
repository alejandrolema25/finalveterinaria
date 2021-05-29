package dom.vet;

public class MascotaNoApta extends Mascota {
    protected MascotaNoApta(String nombre, String sexo, int edad, boolean esterilizado) {
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
