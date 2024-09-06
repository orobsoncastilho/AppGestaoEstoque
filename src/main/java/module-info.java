module GerenciadorDeEstoque {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.estoque to javafx.fxml;
    exports com.estoque;
}
