# Habit Tracker & Emotional Log (Java)

## 📋 Sobre o Projeto
Este é um algoritmo de Controle de Hábitos desenvolvido em Java para console. O objetivo principal foi praticar a lógica de programação estruturada e a transição para o desenvolvimento modular (separação por métodos), criando uma ferramenta que permite ao usuário gerenciar metas semanais e registrar seu estado emocional durante o processo de aprendizado.

## 🛠️ Conceitos Praticados
Durante o desenvolvimento deste projeto, foram aplicados conceitos fundamentais de Java:

- **Estruturas de Repetição:** Uso de `while` para manter o menu interativo e para validação de entradas (garantindo que a meta semanal esteja entre 1 e 7 dias).

- **Estruturas Condicionais:** Implementação de `switch-case` para a navegação fluida entre as opções do menu.

- **Modularização:** Refatoração do código original para separar as responsabilidades em métodos específicos (`registrar`, `sequencia`, `metasemanal`, `registrarSentimento`), facilitando a manutenção e leitura.

- **Manipulação de Variáveis e Escopo:** Gerenciamento de variáveis de estado como `streak` (acumuladora) e `meta` (substituição), entendendo onde devem ser declaradas para persistência de dados durante a execução.

- **Interação com o Usuário:** Uso da classe `Scanner` para entrada de dados numéricos e de texto, com tratamento de buffer (`sc.nextLine()`).

## 🚀 Funcionalidades

- **Registrar Hábito:** Incrementa a sequência de dias (`streak`) e registra a atividade realizada.

- **Visualizar Streak:** Exibe o progresso atual do usuário.

- **Definir Meta:** Permite configurar um objetivo semanal com validação de dias reais (1-7).

- **Log Emocional:** Um espaço dedicado para o usuário registrar como se sente, reforçando a persistência nos estudos através de mensagens personalizadas.

## 💡 Por que este projeto é importante?

O algoritmo demonstra a capacidade de transformar requisitos abstratos em um sistema funcional e organizado. Mais do que um contador de dias, ele representa a maturidade técnica de sair do código linear para um código baseado em funções reutilizáveis e lógica de segurança.

