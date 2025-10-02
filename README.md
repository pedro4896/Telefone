# Telephone – Aplicando o Padrão Observer

## 📖 Descrição
Projeto de exemplo para aplicar o **padrão Observer**.  
O sistema simula um telefone: ao pressionar dígitos no teclado (`KeyPad`), o modelo (`PhoneModel`) notifica a tela (`Screen`) em tempo real.

---

## 🎯 Objetivo
- Refatorar o código para usar o **Observer**.
- Definir interface para os observadores (`PhoneObserver`).
- Notificar sempre que um novo dígito for inserido.
- Criar dois observadores na tela:
    1. Imprime o último dígito inserido.
    2. Imprime "Agora discando <número completo>..." ao final.

---

## 🛠️ Estrutura

src/<br>
├─ Main.java<br>
├─ Screen.java<br>
├─ KeyPad.java<br>
├─ PhoneModel.java<br>
├─ PhoneObserver.java<br>
PROMPTS.md<br>
AJUSTES.md<br>


---

## ▶️ Execução

1. Compile:
   ```bash
   javac src/*.java

2. Rode:
   ```bash
   java -cp src Main
   
3. Saída Esperada:
    ```bash
   Pressionando: 0
    0
    Pressionando: 8
    8
    Pressionando: 1
    1
    ...
    Agora discando 081999887766...

## 🧩 Padrão Observer aplicado
- **Subject (PhoneModel)** → mantém lista de observers e notifica quando um dígito é inserido.
- **Observers (Screen)** → imprimem informações na tela.
- **KeyPad** → simula a entrada de dados.
- **Main** → configura a interação.

## 📑 Documentação da IA

**PROMPTS.md**
→ prompts usados e respostas resumidas.

**AJUSTES.md**
→ ajustes feitos sobre as respostas da IA.

## 📌 Histórico de commits
1. adicionar código base do projeto
2. criar interface PhoneObserver
3. alterar PhoneModel para notificar observers
4. implementar observadores na Screen
5. ajustar KeyPad para enviar dígitos
6. atualizar Main para simular discagem
7. adicionar histórico de prompts e ajustes da IA

Cada commit foi acompanhado de comentários no código e referência em **PROMPTS.md** e **AJUSTES.md**.

## 👨‍💻 Autores
Pedro Victor da Silva Pereira
Valéria Cristina