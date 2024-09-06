package com.estoque;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class EstoqueController {

    @FXML
    private TableView<Produto> tabelaEstoque;

    @FXML
    private TextField nomeField;

    @FXML
    private TextField quantidadeField;

    @FXML
    private TextField codigoField;

    @FXML
    private TableColumn<Produto, String> nomeColumn;

    @FXML
    private TableColumn<Produto, Integer> quantidadeColumn;

    @FXML
    private TableColumn<Produto, String> codigoColumn;

    @FXML
    private void initialize() {
        nomeColumn.setCellValueFactory(new PropertyValueFactory<>("nome"));
        quantidadeColumn.setCellValueFactory(new PropertyValueFactory<>("quantidade"));
        codigoColumn.setCellValueFactory(new PropertyValueFactory<>("codigo"));
    }

    @FXML
    public void adicionarProduto(ActionEvent event) {
        String nome = nomeField.getText();
        int quantidade = Integer.parseInt(quantidadeField.getText());
        String codigo = codigoField.getText();
        Produto novoProduto = new Produto(nome, quantidade, codigo);
        tabelaEstoque.getItems().add(novoProduto);
    }

    @FXML
    public void removerProduto(ActionEvent event) {
        Produto selecionado = tabelaEstoque.getSelectionModel().getSelectedItem();
        if (selecionado != null) {
            tabelaEstoque.getItems().remove(selecionado);
        }
    }

    @FXML
    public void atualizarEstoque(ActionEvent event) {
        tabelaEstoque.refresh();
    }
}
