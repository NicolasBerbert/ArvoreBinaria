public class ArvoreBinaria {
    private No raiz;
    public ArvoreBinaria() {
        this.raiz = null;
    }
    public void inserir(int conteudo) {
        No novoNo = new No(conteudo);
        No pai;
        if(raiz == null) {
            //System.out.println("A raiz foi criada com o conteúdo " + novoNo.getConteudo() + ".");
            raiz = novoNo;
        } else {
            //Verificar se ficara a esq ou direita
            No atual = raiz;
            while(true) {
                pai = atual;
                if(novoNo.getConteudo() <= atual.getConteudo()) {
                    //posicionar o nó à esq
                    atual = atual.getEsquerda();
                    if(atual == null) {
                        pai.setEsquerda(novoNo);
                        //System.out.println("O nó com conteúdo " + novoNo.getConteudo() + " foi inserido com sucesso, onde seu pai é igual a: " + pai.getConteudo());
                        return;
                    }
                } else {
                    //posicionar o nó à dir
                    atual = atual.getDireita();
                    if(atual == null) {
                        pai.setDireita(novoNo);
                        //System.out.println("O nó com conteúdo " + novoNo.getConteudo() + " foi inserido com sucesso, onde seu pai é igual a: " + pai.getConteudo());
                        return;
                    }
                }
            }

        }
    }
    public void preOrdem(No no) {
        if(no == null) {
            return;
        }
        System.out.println(no.getConteudo());
        preOrdem(no.getEsquerda());
        preOrdem(no.getDireita());
    }
    public void emOrdem(No no) {
        if(no == null) {
            return;
        }
        emOrdem(no.getEsquerda());
        System.out.println(no.getConteudo());
        emOrdem(no.getDireita());
    }
    public void posOrdem(No no) {
        if(no == null) {
            return;
        }
        posOrdem(no.getEsquerda());
        posOrdem(no.getDireita());
        System.out.println(no.getConteudo());
    }
    public No getRaiz() {
        return raiz;
    }


    public void remover(int conteudo){
        searchNo(conteudo);
        No noRemover = achado;

        if((noRemover.getEsquerda() == null)&&(noRemover.getDireita() == null)){ //REMOVER FOLHA

        } else if((noRemover.getEsquerda() == null)&&(noRemover.getDireita() != null) || (noRemover.getEsquerda() != null)&&(noRemover.getDireita() == null)) {//REMOVER 1 FILHO

        } else if () {//REMOVER 2 FILHOS

        }

    }

    public No sucessor = null;
    public No paiSucessor = null;
    public No paiRemover = null;

    public void AcharSucessor(No atual2) {
        if(atual2.getConteudo() < raiz.getConteudo()){ //NÓ
            if(atual2.getDireita()!=null){
                atual2 = atual2.getDireita();
                while(true){
                    if(atual2.getEsquerda() == null){
                        sucessor = atual2;
                        return;
                    }else{
                        paiSucessor = atual2;
                        atual2 = atual2.getEsquerda();
                    }
                }
            }else{
                atual2 = atual2.getEsquerda();
                while(true){
                    if(atual2.getDireita() == null){
                        sucessor = atual2;
                        return;
                    }else{
                        paiSucessor = atual2;
                        atual2 = atual2.getDireita();
                    }
                }
            }
        }
    }

    public No achado = null;
    public void searchNo(int conteudo){
        No atual = raiz;
        while(true){
                if (conteudo == raiz.getConteudo()) {
                    achado = raiz;
                    return;
                }
                if(conteudo == atual.getConteudo()){
                    achado = atual;
                    System.out.println("Nó achado!");
                    System.out.println(achado.getConteudo());
                    return;
                }

                if (conteudo < atual.getConteudo()) {
                    paiRemover = atual;
                    atual = atual.getEsquerda();
                }

                if (conteudo > atual.getConteudo()) {
                    paiRemover = atual;
                    atual = atual.getDireita();
                }

        }
    }
}