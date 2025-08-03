# ReadingDiary - Leitor de ISBN 📚

Um aplicativo Android simples e funcional, construído com Kotlin, que transforma seu celular em uma ferramenta para catalogar sua biblioteca pessoal. Aponte a câmera para o código de barras ISBN de um livro, e o app busca as informações e o adiciona a uma galeria visual.

Este projeto foi desenvolvido como um exercício prático, utilizando as bibliotecas e componentes modernos do ecossistema Android para a disciplina Programação para Dispositivos Móveis do curso de Sistemas e Mídias Digitais (UFC).

---

## Screenshots

1. Galeria com livros adicionados:
   <img width="400" height="897" alt="image" src="https://github.com/user-attachments/assets/d63030e4-63cf-46cc-a766-cc71e48a0986" />

---

## ✨ Funcionalidades Principais

* **Leitura de ISBN em Tempo Real:** Utiliza a câmera do dispositivo e o ML Kit do Google para uma detecção rápida e precisa de códigos de barras.
* **Busca Automática de Dados:** Integração com a Google Books API via Retrofit para buscar informações detalhadas do livro, como capa, título e autor.
* **Galeria Visual:** Exibe os livros escaneados em uma grade (`RecyclerView`) limpa e organizada.
* **Carregamento de Imagens:** Uso da biblioteca Glide para carregar e cachear as imagens das capas dos livros de forma eficiente.
* **Interface Simples:** Foco em uma experiência de usuário direta e sem complicações.

---

## 🛠️ Tecnologias Utilizadas

Este projeto foi construído utilizando um conjunto de ferramentas e bibliotecas modernas do Android:

* **Linguagem:** [Kotlin](https://kotlinlang.org/)
* **Arquitetura de UI:** Android Views (XML) com ViewBinding
* **Componentes de UI:**
    * [Material Design 3](https://m3.material.io/)
    * [RecyclerView](https://developer.android.com/guide/topics/ui/layout/recyclerview)
    * [ConstraintLayout](https://developer.android.com/training/constraint-layout)
* **Rede (Networking):**
    * [Retrofit 2](https://square.github.io/retrofit/) - Para chamadas à API REST.
    * [Gson](https://github.com/google/gson) - Para fazer o parse do JSON da API.
* **Carregamento de Imagem:**
    * [Glide](https://github.com/bumptech/glide) - Para carregar e exibir imagens de forma otimizada.
* **Câmera e Machine Learning:**
    * [CameraX](https://developer.android.com/training/camerax) - Para um controle simplificado e robusto da câmera.
    * [Google ML Kit (Barcode Scanning)](https://developers.google.com/ml-kit/vision/barcode-scanning) - Para a detecção do código de barras.

---

## 🚀 Como Executar o Projeto

Para rodar este projeto localmente, você só precisa seguir estes passos:

#### Pré-requisitos
* [Android Studio](https://developer.android.com/studio) (versão Hedgehog ou mais recente)
* Um celular Android ou um Emulador com câmera configurada (API 26+)

#### Instalação
1.  Clone o repositório para a sua máquina:
    ```bash
    git clone [https://github.com/seu-usuario/ReadingDiary.git](https://github.com/seu-usuario/ReadingDiary.git)
    ```
    *(Lembre-se de trocar `seu-usuario/ReadingDiary` pelo caminho do seu repositório)*

2.  Abra o projeto no Android Studio.

3.  Deixe o Gradle sincronizar e baixar todas as dependências.

4.  Execute o aplicativo clicando no botão "Run" (▶️).

---


## 💬 Contato

Maria Clara Freire Teles - [LinkedIn](https://www.linkedin.com/in/maria-clara-freire-teles-759381276/) - mariaclarafreireteles@gmail.com
