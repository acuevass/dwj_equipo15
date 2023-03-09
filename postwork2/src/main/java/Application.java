public class Application {
    public static void main(String[] args) {

        Helado helado = new HeladoSuave();

        helado = new CoberturaDecorador(helado);
        helado = new GranolaDecorador(helado);
        helado = new GalletaDecorador(helado);
        helado = new MermeladaDecorador(helado);
        helado = new ToppingDecorador(helado);

        System.out.println("===== HELADOS =====");
        System.out.println("\t" + helado.getDescripcion());
        System.out.println("\t$" + helado.getPrecio());

    }
}