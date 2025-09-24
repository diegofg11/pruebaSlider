package org.diegofg11;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    /**
     * Método principal que se llama al iniciar la aplicación JavaFX.
     * Carga el FXML, crea la escena y muestra la ventana principal.
     *
     * @param stage Ventana principal proporcionada por JavaFX
     * @throws Exception Si ocurre un error al cargar el archivo FXML
     */
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/colores.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Método principal del programa. Llama a {@link #launch(String...)} para iniciar la aplicación JavaFX.
     *
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        launch();
    }
}



