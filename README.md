# 💱 Conversor de Moedas

Este é um projeto Java simples de conversor de moedas que utiliza uma API de câmbio em tempo real para converter valores entre diferentes moedas (USD, BRL, ARS, COP). O projeto é estruturado em camadas utilizando boas práticas de organização de código.

## 🧩 Funcionalidades

- Conversão de moedas entre:
    - Dólar ⇄ Peso Argentino
    - Dólar ⇄ Real Brasileiro
    - Dólar ⇄ Peso Colombiano
- Integração com a API [ExchangeRate-API](https://www.exchangerate-api.com/) para obter taxas de câmbio atualizadas
- Menu interativo via terminal
- Estrutura modular (Entities, Models, Services)

## 📁 Estrutura do Projeto

```
src/
├── Application.java                # Classe principal (entrada do programa)
├── entities/
│   └── TaxaMoeda.java             # Representa a resposta da API com as taxas de câmbio
├── models/
│   └── Moeda.java                 # Enum com os tipos de moedas suportadas
├── services/
    ├── ConsultaTaxaCambio.java    # Consulta taxas de câmbio na API
    └── ConversorMoeda.java        # Realiza a conversão de valores entre moedas
```

## 🚀 Como executar

## 🔐 API

Este projeto utiliza a [ExchangeRate-API](https://www.exchangerate-api.com/). Certifique-se de:

- Substituir a sua chave da API no seguinte trecho da classe `ConsultaTaxaCambio`:
```java
URI taxaDeCambio = URI.create("https://v6.exchangerate-api.com/v6/SUA_CHAVE_API/latest/" + moeda.toString());
```

## 🛠 Tecnologias

- Java 21+
- API HTTP nativa (`HttpClient`)
- Gson (para desserialização JSON)

## 📌 Exemplo de Uso

```plaintext
**********************************
1) Dólar =>> Peso Argentino
2) Peso Argentino =>> Dólar
...
7) SAIR
**********************************
Escolha uma opção válida: 3
Digite o valor que deseja converter: 100
BRL = 512.34
```

Desenvolvido por [Lukas Kardeck](https://github.com/lukaskardeck) 💻