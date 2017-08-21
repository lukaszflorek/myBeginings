/**
 * In this example I'm using char type
 */
public class example2 {
    public static void main(String args[]) {
        char myLittleLetter = 'b';
        char myBigLetter = Character.toUpperCase(myLittleLetter);
        System.out.print("This is my little letter: ");
        System.out.println(myLittleLetter);
        System.out.print("And this is my big letter: ");
        System.out.print(myBigLetter);
    }
}
