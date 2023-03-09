public class MermeladaDecorador implements Helado {

    private Helado helado;

    public MermeladaDecorador(Helado helado) {
        this.helado = helado;
    }

    @Override
    public String getDescripcion() {
        return this.helado.getDescripcion() + " con mermelada extra";
    }

    @Override
    public int getPrecio() {
        return this.helado.getPrecio() + 10;
    }

}