package view.components;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class Sidebar extends VBox {

    public Button btnFornecedor = new Button("Fornecedor");
    public Button btnProduto = new Button("Produto");
    public Button btnCliente = new Button("Cliente");
    public Button btnPedido = new Button("Pedido");


    //construtor para inicializar o componentes (como um objeto) em outras janelas
    public Sidebar() {
        Image imgIconFornecedor = new Image(getClass().getResourceAsStream("/view/resources/img/icon-fornecedor.png"));
        Image  imgIconProduto = new Image(getClass().getResourceAsStream("/view/resources/img/icon-produto.png"));
        Image  imgIconCliente = new Image(getClass().getResourceAsStream("/view/resources/img/icons8-cliente-40.png"));
        Image  imgIconPedido = new Image(getClass().getResourceAsStream("/view/resources/img/icon-pedido.png"));
        Image imgIconStarbucks = new Image(getClass().getResourceAsStream("/view/resources/img/starbucks96px.png"));

        //carregamento de fonts
        Font fonteNegrito = Font.loadFont(getClass().getResourceAsStream("/view/resources/fonts/Jost-ExtraBold.ttf"), 14);
        Font fonteLigth = Font.loadFont(getClass().getResourceAsStream("/view/resources/fonts/Jost-Light.ttf"), 10);

        //determina como as imagens serao vizualizada
        ImageView imgViewIconStarbucks = new ImageView(imgIconStarbucks);
        imgViewIconStarbucks.setFitWidth(50);
        imgViewIconStarbucks.setFitHeight(50);


        ImageView imgViewIconFornecedor = new ImageView(imgIconFornecedor);
        imgViewIconFornecedor.setFitHeight(20);//altura
        imgViewIconFornecedor.setFitWidth(20);//largura
        btnFornecedor.setGraphic(imgViewIconFornecedor);

        ImageView imgViewProduto = new ImageView(imgIconProduto);
        imgViewProduto.setFitHeight(20);
        imgViewProduto.setFitWidth(20);
        btnProduto.setGraphic(imgViewProduto);

        ImageView imgViewCliente = new ImageView(imgIconCliente);
        imgViewCliente.setFitHeight(20);
        imgViewCliente.setFitWidth(20);
        btnCliente.setGraphic(imgViewCliente);

        ImageView imgViewPedido = new ImageView(imgIconPedido);
        imgViewPedido.setFitHeight(20);
        imgViewPedido.setFitWidth(20);
        btnPedido.setGraphic(imgViewPedido);

        String styleButton = "-fx-background-color: transparent;" +
                "-fx-border-color: transparent;"+
                "-fx-font-size: 18px;"+
                "-fx-text-fill: black;" +
                "-fx-alignment: center;"+
                "-fx-graphic-text-gap: 20px;"+
                "-fx-font-family:" + fonteLigth.getFamily() +";"+
                     "-fx-cursor: hand;";
        btnFornecedor.setStyle(styleButton);
        btnProduto.setStyle(styleButton);
        btnCliente.setStyle(styleButton);
        btnPedido.setStyle(styleButton);

        Label lblMenu = new Label("Starbucks");
        lblMenu.setFont(Font.font(fonteNegrito.getFamily(),28));
    lblMenu.setGraphic(imgViewIconStarbucks);
    lblMenu.setGraphicTextGap(20);

     btnCliente.setOnMouseEntered(evento -> btnCliente.setStyle(styleButton.replace(" transparent", "#58b558")));

     btnCliente.setOnMouseExited(evento ->btnCliente.setStyle(styleButton.replace(" #58b558", "transparent")));


        btnPedido.setOnMouseEntered(evento -> btnPedido.setStyle(styleButton.replace(" transparent", "#58b558")));

        btnPedido.setOnMouseExited(evento ->btnPedido.setStyle(styleButton.replace(" #58b558", "transparent")));


        btnProduto.setOnMouseEntered(evento -> btnProduto.setStyle(styleButton.replace(" transparent", "#58b558")));

        btnProduto.setOnMouseExited(evento ->btnProduto.setStyle(styleButton.replace(" #58b558", "transparent")));


        btnFornecedor.setOnMouseEntered(evento -> btnFornecedor.setStyle(styleButton.replace(" transparent", "#58b558")));

        btnFornecedor.setOnMouseExited(evento ->btnFornecedor.setStyle(styleButton.replace(" #58b558", "transparent")));




        setMargin(lblMenu,new Insets(0,0,20,0));
        //superior ,direita, inferior, esquerda

        getChildren().addAll(lblMenu, btnFornecedor, btnProduto, btnCliente, btnPedido);

    }
}