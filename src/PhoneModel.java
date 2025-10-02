package src;

import java.util.ArrayList;
import java.util.List;

/**
 * Modelo do telefone.
 * Armazena o número atual e notifica observadores (UI).
 * Não sabe nada sobre a tela -> aplica Observer corretamente.
 *
 *  - Adiciona lista de observers.
 *   - Implementa método insertDigit() e notifyObservers().
 */
public class PhoneModel {
    private final List<PhoneObserver> observers = new ArrayList<>();
    private final StringBuilder currentNumber = new StringBuilder();

    public void addObserver(PhoneObserver observer) {
        observers.add(observer);
    }

    public void insertDigit(String digit) {
        currentNumber.append(digit);
        notifyObservers(digit);
    }

    private void notifyObservers(String digit) {
        for (PhoneObserver obs : observers) {
            obs.digitInserted(digit, currentNumber.toString());
        }
    }
}
