package src;

/**
 * UI (Tela) do telefone.
 * Cria e registra os observadores concretos:
 * 1. Mostra o dígito mais recente
 * 2. Mostra "Agora discando ..." quando o número completo foi digitado
 */
public class Screen {

    public Screen(PhoneModel model) {
        // Observador 1: imprime o último dígito
        model.addObserver((digit, fullNumber) -> {
            System.out.println(digit);
        });

        // Observador 2: imprime o número completo
        model.addObserver((digit, fullNumber) -> {
            if (fullNumber.length() == 12) { // número de teste com 12 dígitos
                System.out.println("Agora discando " + fullNumber + "...");
            }
        });
    }
}
