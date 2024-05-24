public class Executora {
    public static void main(String[] args) {
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        arvoreBinaria.inserir(99);
        arvoreBinaria.inserir(90);
        arvoreBinaria.inserir(91);
        arvoreBinaria.inserir(80);
        arvoreBinaria.inserir(75);
        arvoreBinaria.inserir(82);
        arvoreBinaria.inserir(81);

        //arvoreBinaria.preOrdem(arvoreBinaria.getRaiz());
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        //arvoreBinaria.posOrdem(arvoreBinaria.getRaiz());
        arvoreBinaria.remover(99);
        arvoreBinaria.preOrdem(arvoreBinaria.getRaiz());
        //arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
    }
}