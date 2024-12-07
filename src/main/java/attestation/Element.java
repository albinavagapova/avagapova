package attestation;

import java.util.Arrays;

public class Element {
    public static void main(String[] args) {
        int[] elements = {0, 20, 80, 90, 111, 150, 15};
        Arrays.sort(elements);
        int largest=elements[elements.length-2];
        System.out.println("Второй по величине элемент: " + largest);


    }
}
