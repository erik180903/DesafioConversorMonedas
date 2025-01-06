# DesafioConversorMonedas
El sistema de conversión de monedas permite a los usuarios convertir entre diferentes tipos de divisas de manera rápida y sencilla una cantidad especificada por el usuario, según las tasas de cambio actuales. El sistema soporta múltiples opciones de divisas y facilita la selección de la conversión deseada a través de un menu intuitiva.

## Características

- **Conversión Multidivisa**: Soporta múltiples monedas como USD, EUR, MXN, JPY, entre otras.
- **Tasas de Cambio en Tiempo Real**: Las tasas de conversión se actualizan dinámicamente a través de una API de servicios financieros.
- **Menu Intuitiva**: Los usuarios pueden seleccionar fácilmente las monedas de origen y destino, e ingresar el monto a convertir.
- **Historial de Conversiones**: El sistema guarda un registro en formato JSON de las conversiones realizadas para futuras consultas.

## Requisitos

- Java 8 o superior.
- Conexión a Internet para obtener las tasas de cambio en tiempo real.

## Instalación

1. Clona este repositorio en tu máquina local:

    ```bash
    git clone https://github.com/tu-usuario/sistema-conversion-moneda.git
    ```

2. Navega al directorio del proyecto:

    ```bash
    cd sistema-conversion-moneda
    ```

3. Compila y ejecuta el proyecto usando tu IDE favorito o desde la línea de comandos:

    ```bash
    javac Principal.java
    java Principal
    ```

## Uso

1. Ejecuta el programa.
2. Selecciona una opción del menú para elegir la conversión de moneda (Euro a Peso Mexicano, Dólar a Euro, etc.).
3. Ingresa el monto a convertir.
4. El sistema te mostrará el resultado de la conversión de acuerdo con las tasas de cambio actuales.

## API Utilizada

Este sistema obtiene las tasas de cambio en tiempo real a través de una API externa (en este caso ExchangeRate-API) o cualquier otra fuente confiable).

## Contribución

Si deseas contribuir a este proyecto, sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama para tu funcionalidad o corrección de errores.
3. Realiza tus cambios y haz commit de ellos.
4. Abre un Pull Request describiendo tus cambios.


