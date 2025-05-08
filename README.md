# Conversor de Monedas 💱

Este es un proyecto Java que permite convertir monedas utilizando la API de [ExchangeRate-API](https://www.exchangerate-api.com/).

## 📦 Estructura
- `Main.java`: Entrada del programa
- `ConversorMoneda.java`: Lógica de conversión
- `HttpService.java`: Conexión HTTP usando `HttpClient`
- `ApiResponse.java`: Clase `record` para mapear respuesta JSON
- `Config.java`: Carga segura de tu API key

## 🔐 Configuración
Crea un archivo `config.properties` dentro de la carpeta `src/` con tu API key:



## 🚀 Funcionalidades

- Conversión entre las siguientes monedas:
  - USD ↔ COP (Peso colombiano)
  - USD ↔ BRL (Real brasileño)
  - USD ↔ ARS (Peso argentino)
- Conexión a API externa para obtener tasas de cambio en tiempo real.
- Separación clara entre lógica de red, lógica de negocio y entrada del usuario.
- Protección de la API Key mediante archivo de configuración `.properties`.

---

## 🧩 Requisitos

- Java 11 o superior
- Conexión a internet
- Una cuenta gratuita en [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener tu API Key




