package attestation;

import java.util.Scanner;

public class Fence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Длина забора (в см): ");
        int fenceLength = scanner.nextInt();

        int Letters = 15;
        int Spaces = 3;
        int lengthLettersOfFence = 62;
        int lengthSpacesOfFence = 12;

        int Groups = Letters / 3;
        int GroupsLength = Groups * lengthLettersOfFence;

        int SpacesLength = Spaces * lengthSpacesOfFence;
        int totalLength = GroupsLength + SpacesLength;

        if (totalLength <= fenceLength) {
            System.out.println("Надпись поместится на заборе.");
        } else {
            System.out.println("Надпись не поместится на заборе.");
        }
    }
}




