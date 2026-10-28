# Mi Billetera Java 2.0 - Colecciones y Excepciones

Aplicación interactiva de consola en Java que administra una billetera personal con historial de movimientos, categorías únicas, reporte de gastos por categoría y entradas seguras mediante manejo de excepciones.

## Estructura del Proyecto

* **`Movimiento.java`**: Representa una transacción individual inmutable (`private final`) con tipo, categoría y valor.
* **`Billetera.java`**: Contiene el saldo, contadores y las colecciones (`ArrayList` para historial, `HashSet` para categorías y `HashMap` para gastos agrupados).
* **`Main.java`**: Controla el menú interactivo, la lectura segura de entradas con `try/catch` y la presentación de resultados.
* **`PruebaBilleteras.java`**: Script de verificación de independencia entre objetos y protección del historial contra modificaciones externas.

## Instrucciones de Compilación y Ejecución

Desde la terminal en la carpeta `MiBilleteraJava`:

1. **Compilar el proyecto:**
   ```powershell
   javac (Get-ChildItem *.java)