public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(20);
        arvore.inserir(40);
        arvore.inserir(70);
        arvore.inserir(60);
        arvore.inserir(80);

        System.out.print("Em Ordem: ");
        arvore.emOrdem();

        System.out.print("Pré-Ordem: ");
        arvore.preOrdem();

        System.out.print("Pós-Ordem: ");
        arvore.posOrdem();

        arvore.remover(20);
        arvore.remover(30);
        arvore.remover(50);

        System.out.print("Em Ordem: ");
        arvore.emOrdem();

        System.out.print("Pré-Ordem: ");
        arvore.preOrdem();

        System.out.print("Pós-Ordem: ");
        arvore.posOrdem();
    }
}