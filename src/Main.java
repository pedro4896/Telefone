package src;

/**
 * Classe principal.
 * Cria os componentes do telefone e simula a discagem.
 */
public class Main {
    public static void main(String[] args) {
        PhoneModel model = new PhoneModel();
        Screen screen = new Screen(model);
        KeyPad keypad = new KeyPad(model);

        // Número de teste
        String number = "081999887766";
        for (char c : number.toCharArray()) {
            keypad.press(String.valueOf(c));
        }
    }
}
