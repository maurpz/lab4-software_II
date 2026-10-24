
public class BubbleSort {

    public void sort(int[] vet) {
        for (int i = vet.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (vet[j] > vet[j + 1]) {
                    int aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
    }
}
