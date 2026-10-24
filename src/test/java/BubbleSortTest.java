

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {

    private BubbleSort bubbleSort;

    @BeforeEach
    void setUp() {
        bubbleSort = new BubbleSort();
    }

    @Test
    @DisplayName("CP1: Arreglo vacío")
    void shouldHandleEmptyArray() {
        int[] input = {};
        int[] expected = {};

        bubbleSort.sort(input);

        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("CP2: Arreglo ya ordenado")
    void shouldKeepSortedArray() {
        int[] input = {1, 2, 3};
        int[] expected = {1, 2, 3};

        bubbleSort.sort(input);

        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("CP3: Intercambiar dos elementos")
    void shouldSwapElements() {
        int[] input = {2, 1};
        int[] expected = {1, 2};

        bubbleSort.sort(input);

        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("CP4: Ordenar arreglo inverso")
    void shouldSortReverseArray() {
        int[] input = {3, 2, 1};
        int[] expected = {1, 2, 3};

        bubbleSort.sort(input);

        assertArrayEquals(expected, input);
    }
}
