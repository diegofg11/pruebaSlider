# Selector de Color RGB en JavaFX

Este proyecto es una pequeña aplicación en **JavaFX** que permite seleccionar un color usando tres sliders para los componentes **Rojo, Verde y Azul (RGB)** y mostrarlo en un rectángulo en tiempo real.

---

## Funcionalidades

- Ajustar el valor de **Rojo, Verde y Azul** mediante sliders.
- Visualizar inmediatamente el color resultante en un rectángulo.
- Interfaz gráfica sencilla y responsive gracias a JavaFX y FXML.

---

## Tecnologías

- **Java 23** (o superior)
- **JavaFX 23** (`controls`, `fxml`, `media`)
- **Maven** como gestor de dependencias y compilación
- FXML para definir la interfaz de usuario
- **JavaDoc** para documentación de todas las clases y métodos

---

## Estructura del proyecto

```
src/
├─ main/
│  ├─ java/org/diegofg11/
│  │  ├─ Controlador.java      # Controlador para los sliders y rectángulo (con JavaDoc)
│  │  └─ MainApp.java          # Clase principal que lanza la aplicación (con JavaDoc)
│  └─ resources/fxml/
│     └─ colores.fxml          # Interfaz definida en FXML
```

---

## Cómo ejecutar

1. **Con Maven desde terminal**:

```bash
mvn clean install
mvn javafx:run
```

2. **Desde IntelliJ IDEA**:

- Asegúrate de que el **SDK de Java** y **JavaFX** estén configurados.
- Ejecuta la clase `MainApp.java`.

---

## Documentación

Se ha incluido **JavaDoc** en las clases:

- `Controlador.java` → Explica cada slider y el método `actualizarColor()`.
- `MainApp.java` → Explica la inicialización de la aplicación.

Para generar la documentación HTML:

```bash
javadoc -d doc -sourcepath src/main/java -subpackages org.diegofg11
```

Luego abre `doc/index.html` en el navegador.

---

## Notas

- Los sliders deben tener valores entre `0` y `255` para representar correctamente los componentes RGB.
- Asegúrate de que el `fx:controller` en `colores.fxml` apunte a `org.diegofg11.Controlador`.
- El rectángulo cambiará de color en tiempo real al mover cualquiera de los sliders.

---

## Autor

Diego F.G.
