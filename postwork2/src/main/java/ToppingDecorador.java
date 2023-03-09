public class ToppingDecorador implements Helado {

    private Helado helado;

    public ToppingDecorador(Helado helado) {
        this.helado = helado;
    }

    @Override
    public String getDescripcion() {
        return this.helado.getDescripcion() + " con topping extra";
    }

    @Override
    public int getPrecio() {
        return this.helado.getPrecio() + 20;
    }

}