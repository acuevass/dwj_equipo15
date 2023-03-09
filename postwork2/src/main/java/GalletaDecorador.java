public class GalletaDecorador implements Helado {

    private Helado helado;

    public GalletaDecorador(Helado helado) {
        this.helado = helado;
    }

    @Override
    public String getDescripcion() {
        return this.helado.getDescripcion() + " con galleta extra";
    }

    @Override
    public int getPrecio() {
        return this.helado.getPrecio() + 15;
    }

}