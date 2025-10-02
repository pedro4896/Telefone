package src;

/**
 * Interface Observer.
 * Todo observador interessado nos dígitos do telefone deve implementar.
 * - Define contrato de notificação de novos dígitos.
 */
public interface PhoneObserver {
    /**
     * Chamado sempre que um novo dígito é inserido.
     * @param digit dígito mais recente
     * @param fullNumber número completo até o momento
     */
    void digitInserted(String digit, String fullNumber);
}
