public class GranolaDecorador implements Helado {

    private Helado helado;

    public GranolaDecorador(Helado helado) {
        this.helado = helado;
    }

    @Override
    public String getDescripcion() {
        return this.helado.getDescripcion() + " con granola extra";
    }

    @Override
    public int getPrecio() {
        return this.helado.getPrecio() + 10;
    }

}