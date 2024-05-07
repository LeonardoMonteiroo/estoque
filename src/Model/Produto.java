package Model;

import DAO.ProdutoDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public class Produto {

    private final ProdutoDAO dao;
    private int id_produto;
    private String nome_produto;
    private String descricao_produto;
    private int quantidade_estoque;
    private float preco;
    private int data_cadastro;

    //Construtor vazio
    public Produto() {
        this.dao = new ProdutoDAO();
    }

    //Construtor
    public Produto(int id_produto, String nome_produto, String descricao_produto, int quantidade_estoque, float preco, int data_cadastro) {
        this.id_produto = id_produto;
        this.nome_produto = nome_produto;
        this.descricao_produto = descricao_produto;
        this.quantidade_estoque = quantidade_estoque;
        this.preco = preco;
        this.data_cadastro = data_cadastro;
        this.dao = new ProdutoDAO();
    }

    //Início dos métodos getters e setters
    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getDescricao_produto() {
        return descricao_produto;
    }

    public void setDescricao_produto(String descricao_produto) {
        this.descricao_produto = descricao_produto;
    }

    public int getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public void setQuantidade_estoque(int quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(int data_cadastro) {
        this.data_cadastro = data_cadastro;
    }
    //Fim dos métodos getters e setters

    //
    public ArrayList getProdutosList() {
        return dao.getProdutosList();
    }

    //Retorna o maior ID
    public int getMaxID() throws SQLException {
        return dao.getMaxID();
    }

    //Cadastra novo produto
    public boolean InsertProdutoBD(int id_produto, String nome_produto, String descricao_produto, int quantidade_estoque, float preco, int data_cadastro) throws SQLException {
        int id = this.getMaxID() + 1;
        Produto objeto = new Produto(id_produto, nome_produto, descricao_produto, quantidade_estoque, preco, data_cadastro);
        dao.InsertProdutoBD(objeto);
        return true;
    }

    //Deleta um produto específico pelo seu campo ID
    public boolean DeleteProdutoBD(int id) {
        dao.DeleteProdutoBD(id);
        return true;
    }

    //Edita um produto específico pelo seu campo ID
    public boolean UpdateAlunoBD(int id_produto, String nome_produto, String descricao_produto, int quantidade_estoque, float preco, int data_cadastro) {
        Produto objeto = new Produto(id_produto, nome_produto, descricao_produto, quantidade_estoque, preco, data_cadastro);
        dao.UpdateProdutoBD(objeto);
        return true;
    }

    //Retorna um produto pelo seu campo ID
    public Produto getProduto(int id) {
        dao.getProduto(id);
        return null;
    }
}
