# Monitor de CriptoMoedas em Tempo Real

Este projeto foi desenvolvido por: **Amanda Cornelsen** 

---

##  Sobre o Projeto

Este projeto fornece uma aplicação Android que consome dados em tempo real do mercado de criptomoedas, permitindo ao usuário monitorar valores, tendências e outras informações essenciais de forma direta e intuitiva.

---

##  Descrição das Partes do Código

### **MainActivity**
A `MainActivity` é a atividade principal do aplicativo. Suas responsabilidades incluem:
- Configurar a interface do usuário, incluindo a barra de ferramentas (toolbar).
- Gerenciar o botão de atualização, permitindo que o usuário atualize manualmente os dados.
- Realizar chamadas à API do Mercado Bitcoin para buscar informações em tempo real.
- Exibir o último valor negociado de uma criptomoeda e a data/hora da última atualização.
- Tratar erros de comunicação com a API, exibindo mensagens apropriadas ao usuário.

### **MercadoBitcoinService**
A interface `MercadoBitcoinService` é responsável por definir o contrato para as chamadas à API do Mercado Bitcoin. Ela utiliza o Retrofit para realizar:
- Uma chamada GET para o endpoint `/api/BTC/ticker/`, que retorna os dados mais recentes da criptomoeda Bitcoin.

### **MercadoBitcoinServiceFactory**
A classe `MercadoBitcoinServiceFactory` é responsável por configurar e instanciar o serviço `MercadoBitcoinService`. Suas responsabilidades incluem:
- Definir a URL base da API (`https://www.mercadobitcoin.net/`).
- Configurar o Retrofit com o conversor JSON `GsonConverterFactory`.
- Criar e retornar uma instância configurada do `MercadoBitcoinService`.

### **TickerResponse e Ticker**
As classes `TickerResponse` e `Ticker` definem o modelo de dados retornado pela API do Mercado Bitcoin. Elas mapeiam as informações recebidas no formato JSON para objetos Kotlin:
- `TickerResponse` encapsula o objeto `Ticker`.
- `Ticker` contém os seguintes campos:
  - **high**: Maior valor de negociação no período.
  - **low**: Menor valor de negociação no período.
  - **vol**: Volume negociado.
  - **last**: Último valor negociado.
  - **buy**: Preço de compra.
  - **sell**: Preço de venda.
  - **date**: Timestamp da última atualização.

### **Dependência de Coroutines**
No arquivo `build.gradle.kts`, a biblioteca `kotlinx-coroutines-android` foi adicionada. Essa dependência é essencial para:
- Permitir a execução assíncrona de tarefas, como chamadas à API, sem bloquear a interface do usuário.
- Gerenciar o fluxo de trabalho com uso de `Dispatchers.Main` para manipulação da interface e `Dispatchers.IO` para operações de entrada/saída.

---

##  Tecnologias Utilizadas

- **Linguagem:** Kotlin (Android)
- **Frameworks e Bibliotecas:** Retrofit, Coroutines, GsonConverterFactory
- **API de Mercado:** Mercado Bitcoin
- **Design:** Material Design para uma interface moderna e responsiva.

---

## Contato 

Se você tiver dúvidas ou sugestões, sinta-se à vontade para entrar em contato:  
📧 **amandacornelsen.c@gmail.com**  
🌐 [GitHub](https://github.com/AmandaCornelsen)
