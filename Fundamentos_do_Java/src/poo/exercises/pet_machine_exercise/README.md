# 🐕 Sistema de Máquina de Banho para Pets 🛁

Um sistema desenvolvido em Java para controle de banho em petshops, implementando conceitos de programação orientada a objetos para gerenciar uma máquina automatizada de banho para animais de estimação.

## 📋 Descrição do Projeto

Este sistema simula o funcionamento de uma máquina de banho para pets em um petshop, permitindo controle completo das operações através de uma interface de linha de comando. O projeto demonstra conceitos de encapsulamento, validação de estado e gerenciamento de recursos.

## 📝 Desafio Original

**Objetivo**: Escrever um código onde temos o controle de banho de um petshop, onde a máquina de banhos dos pets deve ter as seguintes operações:

### 🎯 Operações Requeridas:
- Dar banho no pet
- Abastecer com água
- Abastecer com shampoo
- Verificar nível de água
- Verificar nível de shampoo
- Verificar se tem pet no banho
- Colocar pet na máquina
- Retirar pet da máquina
- Limpar máquina

### ⚙️ Regras de Implementação:

1. **Capacidade**: A máquina de banho deve permitir somente **1 pet por vez**

2. **Consumo por banho**: Cada banho realizado irá consumir **10 litros de água** e **2 litros de shampoo**

3. **Capacidade máxima**: A máquina tem capacidade máxima de **30 litros de água** e **10 litros de shampoo**

4. **Higienização**: Se o pet for retirado da máquina sem estar limpo será necessário **limpar a máquina** para permitir a entrada de outro pet

5. **Consumo da limpeza**: A limpeza da máquina irá consumir **3 litros de água** e **1 litro de shampoo**

6. **Abastecimento**: O abastecimento de água e shampoo deve permitir **2 litros por vez** que for acionado

## 🚀 Funcionalidades Implementadas

- **🛁 Banho automatizado**: Sistema completo de banho com consumo controlado de recursos
- **📊 Controle de capacidade**: Monitoramento de níveis de água e shampoo
- **⛽ Abastecimento controlado**: Reposição gradual de 2 litros por operação
- **🧹 Validação de higiene**: Controle de limpeza da máquina baseado no estado do pet
- **🐾 Gerenciamento de pets**: Sistema de entrada e saída com validações
- **✨ Limpeza automática**: Processo de higienização da máquina
- **🖥️ Interface intuitiva**: Menu interativo para todas as operações

## 🏗️ Estrutura do Projeto

```
poo.exercises.pet_machine_exercise/
├── Pet.java         # 🐕 Classe que representa o animal de estimação
├── PetMachine.java  # 🛁 Classe principal da máquina de banho
└── Main.java        # 🖥️ Interface do usuário e controle do sistema
```

### 🏛️ Arquitetura das Classes

**🐾 Pet**: 
- Atributos: nome (final), estado de limpeza
- Representa o animal com controle de seu estado de higiene

**🛁 PetMachine**: 
- Gerencia todos os recursos (água, shampoo)
- Controla estado de limpeza da máquina
- Valida operações baseadas no estado atual

**🖥️ Main**: 
- Interface do usuário
- Menu interativo com todas as opções disponíveis

## 🚀 Como Executar

1. **📋 Pré-requisitos**:
   - Java JDK 8 ou superior
   - IDE Java ou terminal

2. **⚙️ Compilação**:
   ```bash
   javac poo/exercises/pet_machine_exercise/*.java
   ```

3. **▶️ Execução**:
   ```bash
   java poo.exercises.pet_machine_exercise.Main
   ```

## 🎮 Interface do Usuário

O sistema apresenta um menu com as seguintes opções:

```
===Escolha uma das opções ===
1 - Dar banho no pet
2 - Abastecer máquina com água
3 - Abastecer máquina com shampoo
4 - Verificar água da máquina
5 - Verificar shampoo da máquina
6 - Verificar se tem pet no banho
7 - Colocar pet na máquina
8 - Retirar pet da máquina
9 - Limpar a máquina
0 - Sair
```

## 💡 Exemplo de Uso

### 🔄 Fluxo Típico de Operação:

1. **📊 Verificar recursos**: Checar níveis de água e shampoo
2. **⛽ Abastecer se necessário**: Adicionar água/shampoo em incrementos de 2L
3. **🐕 Colocar pet**: Inserir animal informando o nome
4. **🛁 Dar banho**: Executar processo de limpeza (consome 10L água + 2L shampoo)
5. **✨ Retirar pet**: Remover animal limpo da máquina
6. **🧹 Limpar máquina**: Se necessário (quando pet sai sujo)

### 📋 Cenário Prático:
```
Estado inicial: 30L água, 10L shampoo, máquina limpa
Colocar pet "Rex" → Pet inserido com sucesso
Dar banho → Consome 10L água + 2L shampoo → Pet limpo
Retirar pet → Rex removido, máquina permanece limpa
Recursos restantes: 20L água, 8L shampoo
```

## 📊 Controle de Recursos

### 📈 Capacidades Máximas:
- **💧 Água**: 30 litros
- **🧴 Shampoo**: 10 litros

### ⚡ Consumo por Operação:
- **🛁 Banho**: 10L água + 2L shampoo
- **🧹 Limpeza da máquina**: 3L água + 1L shampoo
- **⛽ Abastecimento**: +2L por acionamento

## 🔄 Estados da Máquina

- **✅ Limpa e vazia**: Pronta para receber pet
- **🐕 Com pet limpo**: Pet pode ser retirado sem limpeza adicional
- **🐕💧 Com pet sujo**: Pet precisa de banho
- **❌ Suja**: Requer limpeza antes de aceitar novo pet
- **⚠️ Sem recursos**: Precisa de abastecimento para operar

## 🛡️ Validações e Segurança

O sistema inclui validações para:
- ❌ Tentativa de colocar pet em máquina suja
- ⚠️ Operações sem recursos suficientes
- 🚫 Múltiplos pets simultaneamente
- 📊 Abastecimento além da capacidade máxima
- 🛁 Banho sem pet na máquina
- 👻 Remoção de pet inexistente

## 🔧 Tecnologias Utilizadas

- **☕ Java SE**: Linguagem principal
- **⌨️ Scanner**: Entrada de dados
- **🎯 POO**: Encapsulamento, composição, validação de estado

## 📚 Conceitos de POO Demonstrados

- **🔒 Encapsulamento**: Atributos privados com controle de acesso
- **🧩 Composição**: PetMachine contém Pet
- **✅ Validação de Estado**: Verificações baseadas no estado atual
- **🔐 Imutabilidade**: Nome do pet como atributo final
- **🎯 Responsabilidade Única**: Cada classe tem uma responsabilidade específica

## 🚀 Melhorias Possíveis

- 📈 Histórico de banhos realizados
- 🧴 Diferentes tipos de shampoo
- 🌡️ Controle de temperatura da água
- 📅 Sistema de agendamento
- 📊 Relatórios de consumo
- 🖥️ Interface gráfica

## 📄 Licença

Projeto desenvolvido para fins educacionais - uso livre para aprendizado.

---

**🐾 Desenvolvido como exercício de Programação Orientada a Objetos em Java** 🎓