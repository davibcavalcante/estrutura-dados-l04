class FilaCircular {
    int tamanho;
    int inicio;
    int fim;
    int total;
    Object vetor[];

    FilaCircular(int tam) {
        inicio = 0;
        fim = -1; 
        total = 0;
        tamanho = tam;
        vetor = new Object[tam];
    }

    public boolean vazia() {
        return total == 0;
    }

    public boolean cheia() {
        return total == tamanho;
    }

    public void enfileirar(Object elem) {
        if (!cheia()) {
            fim = (fim + 1) % tamanho;
            vetor[fim] = elem;
            total++;
        } else {
            System.out.println("Fila Cheia");
        }
    }

    public Object desenfileirar() {
        if (!vazia()) {
            Object excluido = vetor[inicio];
            inicio = (inicio + 1) % tamanho;
            total--;
            return excluido;
        } else {
            System.out.println("Fila Vazia");
            return null;
        }
    }

    public void exibeFila() {
        System.out.println("Elementos na Fila Circular:");
        for (int i = 0; i < total; i++) {
            int pos = (inicio + i) % tamanho;
            System.out.println("Posicao " + pos + " Valor " + vetor[pos]);
        }
    }
}