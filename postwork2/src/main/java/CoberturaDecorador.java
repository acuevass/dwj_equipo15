public class CoberturaDecorador implements Helado{

    private Helado helado;

    public CoberturaDecorador(Helado helado) {
        this.helado = helado;
    }

    @Override
    public String getDescripcion() {
        return this.helado.getDescripcion() + " con cobertura extra";
    }

    @Override
    public int getPrecio() {
        return this.helado.getPrecio() + 20;
    }

}