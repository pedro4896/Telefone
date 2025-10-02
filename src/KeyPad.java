package src;

/**
 * Simula o teclado do telefone.
 * Pressionar uma tecla envia o dígito ao modelo.
 */
public class KeyPad {
    private final PhoneModel model;

    public KeyPad(PhoneModel model) {
        this.model = model;
    }

    public void press(String digit) {
        System.out.println("Pressionando: " + digit);
        model.insertDigit(digit);
    }
}
