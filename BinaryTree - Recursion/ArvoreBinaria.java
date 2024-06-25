class ArvoreBinaria {
    No raiz;

    public ArvoreBinaria() {
        raiz = null;
    }
    public void inserir(int chave) {
        raiz = inserirRecursivo(raiz, chave);
    }

    No inserirRecursivo(No raiz, int chave) {
        if (raiz == null) {
            raiz = new No(chave);
            return raiz;
        }

        if (chave < raiz.chave)
            raiz.esquerdo = inserirRecursivo(raiz.esquerdo, chave);
        else if (chave > raiz.chave)
            raiz.direito = inserirRecursivo(raiz.direito, chave);

        return raiz;
    }

    public boolean buscar(int chave) {
        return buscarRecursivo(raiz, chave);
    }

    boolean buscarRecursivo(No raiz, int chave) {
        if (raiz == null || raiz.chave == chave)
            return raiz != null;

        if (raiz.chave < chave)
            return buscarRecursivo(raiz.direito, chave);

        return buscarRecursivo(raiz.esquerdo, chave);
    }

    public void remover(int chave) {
        raiz = removerRecursivo(raiz, chave);
    }

    No removerRecursivo(No raiz, int chave) {
        if (raiz == null) return raiz;
        if (chave < raiz.chave)
            raiz.esquerdo = removerRecursivo(raiz.esquerdo, chave);
        else if (chave > raiz.chave)
            raiz.direito = removerRecursivo(raiz.direito, chave);
        else {
            if (raiz.esquerdo == null)
                return raiz.direito;
            else if (raiz.direito == null)
                return raiz.esquerdo;
            raiz.chave = menorValor(raiz.direito);
            raiz.direito = removerRecursivo(raiz.direito, raiz.chave);
        }

        return raiz;
    }

    int menorValor(No raiz) {
        int menorValor = raiz.chave;
        while (raiz.esquerdo != null) {
            menorValor = raiz.esquerdo.chave;
            raiz = raiz.esquerdo;
        }
        return menorValor;
    }

    public void emOrdem() {
        emOrdemRecursivo(raiz);
        System.out.println();
    }

    void emOrdemRecursivo(No raiz) {
        if (raiz != null) {
            emOrdemRecursivo(raiz.esquerdo);
            System.out.print(raiz.chave + " ");
            emOrdemRecursivo(raiz.direito);
        }
    }


    public void preOrdem() {
        preOrdemRecursivo(raiz);
        System.out.println();
    }

    void preOrdemRecursivo(No raiz) {
        if (raiz != null) {
            System.out.print(raiz.chave + " ");
            preOrdemRecursivo(raiz.esquerdo);
            preOrdemRecursivo(raiz.direito);
        }
    }

    public void posOrdem() {
        posOrdemRecursivo(raiz);
        System.out.println();
    }

    void posOrdemRecursivo(No raiz) {
        if (raiz != null) {
            posOrdemRecursivo(raiz.esquerdo);
            posOrdemRecursivo(raiz.direito);
            System.out.print(raiz.chave + " ");
        }
    }
}