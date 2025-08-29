# 🚗 Simulador de Carro em Java

Um projeto de programação orientada a objetos que simula o funcionamento básico de um automóvel, desenvolvido como exercício prático de POO em Java.

## 📋 Descrição do Projeto

Este simulador permite controlar as funções principais de um carro através de uma interface de linha de comando, implementando conceitos fundamentais de orientação a objetos como herança, encapsulamento e polimorfismo.

## 📝 Desafio Original

**Objetivo**: Escrever um código onde controlamos as funções de um carro, implementando as seguintes funcionalidades:

### Funções Requeridas:
- Ligar o carro
- Desligar o carro
- Acelerar
- Diminuir velocidade
- Virar para esquerda/direita
- Verificar velocidade
- Trocar a marcha

### Regras de Implementação:
1. **Estado inicial**: Quando o carro for criado ele deve começar desligado, em ponto morto e com sua velocidade em 0

2. **Carro desligado**: O carro desligado não pode realizar nenhuma função

3. **Aceleração**: Quando o carro for acelerado ele deve incrementar 1km em sua velocidade (pode chegar no máximo a 120km)

4. **Desaceleração**: Quando diminuir a velocidade do carro ele deve decrementar 1 km de sua velocidade (pode chegar no mínimo a 0km)

5. **Sistema de marchas**: O carro deve possuir 6 marchas, não deve ser permitido pular uma marcha no carro

6. **Limites de velocidade por marcha**:
   - Se o carro estiver na marcha 0 (ponto morto) ele não pode acelerar
   - Se estiver na 1ª marcha sua velocidade pode estar entre 0km e 20km
   - Se estiver na 2ª marcha sua velocidade pode estar entre 21km e 40km
   - Se estiver na 3ª marcha sua velocidade pode estar entre 41km e 60km
   - Se estiver na 4ª marcha sua velocidade pode estar entre 61km e 80km
   - Se estiver na 5ª marcha sua velocidade pode estar entre 81km e 100km
   - Se estiver na 6ª marcha sua velocidade pode estar entre 101km e 120km

7. **Desligar o carro**: O carro poderá ser desligado se estiver em ponto morto (marcha 0) e sua velocidade em 0 km

8. **Virar**: O carro só pode virar para esquerda/direita se sua velocidade for de no mínimo 1km e no máximo 40km

## 🎯 Funcionalidades Implementadas

- **Ligar/Desligar o carro**: Sistema de ignição com validações
- **Acelerar**: Incremento gradual de velocidade respeitando limites por marcha
- **Frear**: Redução controlada da velocidade
- **Sistema de marchas**: 6 marchas + ponto morto com restrições de velocidade
- **Direção**: Virar para esquerda ou direita com limitações de velocidade
- **Monitoramento**: Verificação da velocidade atual

## ⚙️ Regras de Funcionamento

### Estado Inicial
- Carro começa **desligado**
- Marcha em **ponto morto (0)**
- Velocidade **0 km/h**

### Sistema de Marchas e Velocidades
| Marcha | Faixa de Velocidade |
|--------|-------------------|
| 0 (Ponto Morto) | Não acelera |
| 1ª | 0 - 20 km/h |
| 2ª | 21 - 40 km/h |
| 3ª | 41 - 60 km/h |
| 4ª | 61 - 80 km/h |
| 5ª | 81 - 100 km/h |
| 6ª | 101 - 120 km/h |

### Restrições de Segurança
- **Carro desligado**: Nenhuma função operacional disponível
- **Desligar carro**: Apenas em ponto morto e velocidade 0 km/h
- **Virar**: Velocidade entre 1-40 km/h
- **Velocidade máxima**: 120 km/h
- **Velocidade mínima**: 0 km/h

## 🏗️ Estrutura do Projeto

```
poo.exercise_car/
├── vehicle.java      # Classe pai com atributos básicos do veículo
├── car.java         # Classe principal com lógica do simulador
└── main.java        # Classe executável com interface do usuário
```

### Hierarquia de Classes
- **Vehicle**: Classe base com atributos fundamentais (ano, modelo, marca)
- **Car**: Herda de Vehicle, implementa toda a lógica de funcionamento
- **Main**: Classe executável com menu interativo

## 🚀 Como Executar

1. **Pré-requisitos**:
   - Java JDK 8 ou superior
   - IDE Java (Eclipse, IntelliJ, VS Code) ou terminal

2. **Compilação**:
   ```bash
   javac poo/exercise_car/*.java
   ```

3. **Execução**:
   ```bash
   java poo.exercise_car.main
   ```

## 🎮 Interface do Usuário

O programa apresenta um menu interativo com as seguintes opções:

```
Teste seu carro:

1 - Ligar carro
2 - Desligar carro
3 - Acelerar carro
4 - Frear carro
5 - Virar para esquerda/direita
6 - Verificar velocidade
7 - Trocar de marcha
0 - Sair
```

## 💡 Exemplo de Uso

1. **Criar o carro**: Informe ano, modelo e marca
2. **Ligar o carro**: Opção 1
3. **Engatar 1ª marcha**: Opção 7 → Escolher marcha 1
4. **Acelerar**: Opção 3 (repetir para aumentar velocidade)
5. **Verificar velocidade**: Opção 6
6. **Virar**: Opção 5 (se velocidade entre 1-40 km/h)
7. **Trocar marcha**: Opção 7 (quando necessário)

## 🔧 Tecnologias Utilizadas

- **Java SE**: Linguagem principal
- **Scanner**: Entrada de dados do usuário
- **POO**: Herança, Encapsulamento, Polimorfismo

## 📚 Conceitos de POO Demonstrados

- **Herança**: Car extends Vehicle
- **Encapsulamento**: Atributos privados com getters/setters
- **Validação**: Regras de negócio implementadas nos métodos
- **Abstração**: Separação clara de responsabilidades entre classes

## 🐛 Tratamento de Erros

O sistema inclui validações para:
- Tentativas de operação com carro desligado
- Mudanças de marcha inadequadas
- Aceleração/desaceleração fora dos limites
- Tentativas de desligar em condições inadequadas
- Curvas em velocidades inadequadas

## 🤝 Contribuições

Este é um projeto educacional. Sugestões de melhorias são bem-vindas:
- Implementação de ré
- Sistema de combustível
- Indicadores luminosos (setas)
- Interface gráfica

## 📄 Licença

Projeto desenvolvido para fins educacionais - uso livre para aprendizado.

---

**Desenvolvido como exercício de Programação Orientada a Objetos em Java** 🎓