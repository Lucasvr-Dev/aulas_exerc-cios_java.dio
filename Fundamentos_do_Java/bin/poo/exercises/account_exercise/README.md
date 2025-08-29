# 🏦 Sistema Bancário TheBestBank

Um sistema bancário simples desenvolvido em Java que simula operações básicas de uma conta bancária, implementando conceitos de programação orientada a objetos.

## 📋 Descrição do Projeto

O TheBestBank é um simulador de conta bancária que permite realizar operações financeiras básicas através de uma interface de linha de comando, demonstrando conceitos fundamentais de POO como encapsulamento, validação de dados e controle de estado.

## 📝 Desafio Original

**Objetivo**: Escrever um código onde temos uma conta bancária que possa realizar as seguintes operações:

### Operações Requeridas:
- Consultar saldo
- Consultar cheque especial
- Depositar dinheiro
- Sacar dinheiro
- Pagar um boleto
- Verificar se a conta está usando cheque especial

### Regras de Implementação:

1. **Limite de cheque especial**: A conta bancária deve ter um limite de cheque especial somado ao saldo da conta

2. **Definição do cheque especial**: O valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação:
   - **≤ R$ 500,00**: Cheque especial de **R$ 50,00**
   - **> R$ 500,00**: Cheque especial de **50% do valor depositado**

3. **Taxa do cheque especial**: Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma **taxa de 20%** do valor usado do cheque especial

### Exemplos Práticos:
- **Depósito inicial R$ 300,00** → Cheque especial: R$ 50,00
- **Depósito inicial R$ 1.000,00** → Cheque especial: R$ 500,00 (50% de R$ 1.000,00)
- **Uso do cheque especial R$ 100,00** → Taxa cobrada: R$ 20,00 (20% de R$ 100,00)

## 🎯 Funcionalidades Implementadas

- **💰 Consultar Saldo**: Visualização do saldo atual da conta com formatação em reais
- **🔍 Consultar Cheque Especial**: Verificação do limite disponível no cheque especial
- **📈 Depositar Dinheiro**: Adição de valores ao saldo com quitação automática de dívidas
- **📉 Sacar Dinheiro**: Retirada com autenticação por senha e uso opcional do cheque especial
- **📄 Pagar Boletos**: Pagamento via código de barras com uso automático do cheque especial
- **⚠️ Status do Cheque Especial**: Verificação em tempo real se a conta está no vermelho
- **👤 Gerenciamento de Conta**: Criação com dados pessoais e definição automática do limite
- **🔒 Sistema de Segurança**: Autenticação por senha para operações de saque

## 🏗️ Estrutura do Projeto

```
poo.exercises.account_exercise/
├── BankAccount.java     # Classe principal com lógica bancária
└── main.java           # Classe executável com interface do usuário
```

### Arquitetura do Sistema
- **BankAccount**: Classe principal que gerencia todas as operações bancárias
- **Main**: Interface do usuário com menu interativo
- **Scanner**: Captura de entrada de dados do usuário

## 🚀 Como Executar

1. **Pré-requisitos**:
   - Java JDK 8 ou superior
   - IDE Java (Eclipse, IntelliJ, VS Code) ou terminal

2. **Compilação**:
   ```bash
   javac poo/exercises/account_exercise/*.java
   ```

3. **Execução**:
   ```bash
   java poo.exercises.account_exercise.main
   ```

## 🎮 Interface do Usuário

O sistema apresenta o menu principal do **TheBestBank**:

```
====================TheBestBank=====================
Bem-vindo, [Nome]! Selecione o que deseja fazer:

1 - Consultar saldo
2 - Consultar cheque especial
3 - Depositar dinheiro
4 - Sacar dinheiro
5 - Pagar um boleto
6 - Verificar se a conta está usando cheque especial
7 - Sair

====================================================
```

## 💡 Exemplo de Uso

### Fluxo Completo de Operações:

1. **Criar conta**: 
   - Informar nome completo e ano de nascimento
   - Criar senha de 6 dígitos
   - Fazer depósito inicial (mín. R$ 50,00)
   - Sistema define automaticamente o cheque especial

2. **Operações básicas**:
   - **Consultar saldo**: Verificar saldo atual formatado
   - **Fazer depósito**: Sistema quita dívidas automaticamente se existirem
   - **Realizar saque**: Inserir senha → Usar cheque especial se necessário
   - **Pagar boleto**: Código de barras + valor → Uso automático do cheque especial

3. **Monitoramento**:
   - **Verificar cheque especial**: Ver limite disponível
   - **Status da conta**: Verificar se está usando cheque especial
   - **Controle de taxas**: Sistema cobra 20% automaticamente

### Cenário Prático:
```
Depósito inicial: R$ 1.200,00
Cheque especial: R$ 600,00 (50% do depósito)
Saque de R$ 1.500,00 → Usa R$ 300,00 do cheque especial
Taxa cobrada: R$ 60,00 (20% de R$ 300,00)
Próximo depósito quita automaticamente a dívida + taxa
```

## 🔧 Tecnologias Utilizadas

- **Java SE**: Linguagem principal
- **Scanner**: Entrada de dados do usuário
- **POO**: Encapsulamento e validação de dados
- **Switch Expressions**: Sintaxe moderna do Java

## 📚 Conceitos de POO Demonstrados

- **Encapsulamento**: Atributos privados com métodos de acesso
- **Validação**: Regras de negócio para operações financeiras
- **Abstração**: Separação entre interface do usuário e lógica bancária
- **Controle de Estado**: Gerenciamento do status da conta
- **Segurança**: Validações para operações financeiras

## 🛡️ Validações e Segurança

O sistema inclui validações para:
- **Autenticação**: Senha obrigatória para saques (6 dígitos)
- **Valores mínimos**: Depósito mínimo na criação (R$ 50,00) e operações (R$ 1,00)
- **Limite de crédito**: Controle automático do limite do cheque especial
- **Taxa automática**: Cobrança de 20% sobre uso do cheque especial
- **Quitação inteligente**: Priorização automática para quitar dívidas nos depósitos
- **Validação de entrada**: Tratamento de valores negativos ou inválidos
- **Controle de operações**: Cancelamento automático quando limites são excedidos

## 🔄 Estados da Conta

- **Saldo Positivo**: Conta operando com recursos próprios
- **Usando Cheque Especial**: Saldo negativo dentro do limite aprovado
- **Taxa Pendente**: Cobrança automática de 20% sobre valor usado do cheque especial
- **Limite Esgotado**: Bloqueio automático quando cheque especial é excedido
- **Quitação Automática**: Depósitos são direcionados automaticamente para quitar dívidas

## 🤝 Contribuições

Este é um projeto educacional. Sugestões de melhorias são bem-vindas:
- Histórico de transações
- Diferentes tipos de conta (poupança, corrente)
- Transferências entre contas
- Sistema de autenticação
- Juros e rendimentos

## 📄 Licença

Projeto desenvolvido para fins educacionais - uso livre para aprendizado.

---

**TheBestBank - Desenvolvido como exercício de Programação Orientada a Objetos em Java** 🎓