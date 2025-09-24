package org.diegofg11;

import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Controlador para la interfaz de selección de color.
 * Permite cambiar el color de un rectángulo usando tres sliders RGB.
 */
public class Controlador {

    /** Rectángulo cuyo color se actualizará según los sliders. */
    @FXML
    private Rectangle cuadroColor;

    /** Slider para el componente rojo (0-255). */
    @FXML
    private Slider sliderRojo;

    /** Slider para el componente verde (0-255). */
    @FXML
    private Slider sliderVerde;

    /** Slider para el componente azul (0-255). */
    @FXML
    private Slider sliderAzul;

    /**
     * Inicializa el controlador.
     * Añade listeners a los sliders para actualizar el color automáticamente.
     */
    @FXML
    public void initialize() {
        sliderRojo.valueProperty().addListener((obs, oldVal, newVal) -> cambioColor());
        sliderVerde.valueProperty().addListener((obs, oldVal, newVal) -> cambioColor());
        sliderAzul.valueProperty().addListener((obs, oldVal, newVal) -> cambioColor());
        cambioColor();
    }

    /**
     * Actualiza el color del rectángulo según los valores actuales de los sliders RGB.
     */
    private void cambioColor() {
        int r = (int) sliderRojo.getValue();
        int g = (int) sliderVerde.getValue();
        int b = (int) sliderAzul.getValue();
        cuadroColor.setFill(Color.rgb(r, g, b));
    }
}


