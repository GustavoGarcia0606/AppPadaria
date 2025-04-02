package view.components;

import javafx.scene.control.Button;

import javafx.scene.control.Label;

import javafx.scene.image.Image;

import javafx.scene.image.ImageView;

import javafx.scene.layout.HBox;

import javafx.scene.layout.VBox;

public class Sidebar extends VBox {

    public Button btnFornecedor = new Button("Fornecedor");

    public Button btnProduto = new Button("Produto");

    public Button btnCliente = new Button("Cliente");

    public Button btnPedido = new Button("Pedido");

    //construtor para inicializar o componentes (como um objeto) em outras janelas

    public Sidebar() {

        ImageView iconCliente = new ImageView( new Image(getClass().getResourceAsStream("/view/img/icon-cliente.png")));

        ImageView iconProduto = new ImageView(new Image(getClass().getResourceAsStream("/view/img/icon-produto.png")));

        ImageView IconPedido = new ImageView(new Image(getClass().getResourceAsStream("/view/img/icon-pedido.png")));

        ImageView IconFornecedor = new ImageView(new Image(getClass().getResourceAsStream("/view/img/icon-fornecedor.png")));

        iconCliente.setFitHeight(25);

        iconCliente.setFitWidth(25);

        iconProduto.setFitHeight(25);

        iconProduto.setFitWidth(25);

        IconPedido.setFitHeight(25);

        IconPedido.setFitWidth(25);

        IconFornecedor.setFitHeight(25);

        IconFornecedor.setFitWidth(25);

        btnPedido.setGraphic((IconPedido));

        String styleButton = "-fx-background-color: transparent;" +
                             "-fx-border-color: transparent;" +
                              "-fx-font-size: 14px;" +
                              "fx-font-weight: bold;" +
                              "fx-text-fill: green;" +
                               "fx-alignment: center;" +
                                "fx-graphic-text-gap: 10px" ;
        btnCliente.setStyle(styleButton);

        btnProduto.setStyle(styleButton);

        btnFornecedor.setStyle(styleButton);

        btnPedido.setStyle(styleButton);

        btnFornecedor.setGraphic((IconFornecedor));

        btnCliente.setGraphic((iconCliente));

        btnProduto.setGraphic((iconProduto));

        Label lblMenu = new Label("Starbucks");

        lblMenu.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        getChildren().addAll(lblMenu, btnFornecedor, btnProduto, btnCliente, btnPedido);

    }

}
