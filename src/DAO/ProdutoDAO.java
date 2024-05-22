package DAO;

import Model.Produto;

import java.sql.*;
import java.util.ArrayList;

public class ProdutoDAO {

    public static ArrayList<Produto> produtos = new ArrayList<>();

    //Construtor vazio
    public ProdutoDAO() {
    }

    //DriverManager
    public Connection getConnection() {

        Connection connection = null;

        try {

            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            String server = "localhost";
            String database = "db_a3";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "123";

            connection = DriverManager.getConnection(url, user, password);

            return connection;

        } catch (ClassNotFoundException error) {
            System.out.println("Status: O driver do banco de dados não foi encontrado. Erro: " + error.getMessage());
            return null;

        } catch (SQLException error) {
            System.out.println("Status: Nao foi possível conectar ao banco de dados. Erro: " + error.getMessage());
            return null;
        }
    }

    //Retorna uma ArrayList com os produtos
    public ArrayList getProdutosList() {

        produtos.clear();

        try {

            Statement stmt = this.getConnection().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_produto");
            while (res.next()) {

                int id_produto = res.getInt("id_produto");
                String nome_produto = res.getString("nome_produto");
                String descricao_produto = res.getString("descricao_produto");
                int quantidade_estoque = res.getInt("quantidade_estoque");
                float preco = res.getFloat("preco");
                Date data_cadastro = res.getDate("data_cadastro");

                Produto objeto = new Produto(id_produto, nome_produto, descricao_produto, quantidade_estoque, preco, data_cadastro);

                produtos.add(objeto);
            }

            stmt.close();

        } catch (SQLException error) {
            System.out.println("Erro: " + error.getMessage());
        }

        return produtos;
    }

    //Retorna o maior ID
    public int getMaxID() throws SQLException {

        int maiorID = 0;
        try {
            Statement stmt = this.getConnection().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id_produto) id FROM tb_produto");
            res.next();
            maiorID = res.getInt("id_produto");

            stmt.close();

        } catch (SQLException error) {
            System.out.println("Erro: " + error.getMessage());
        }

        return maiorID;
    }

    //Cadastra novo produto
    public boolean InsertProdutoBD(Produto objeto) {
        String sql = "INSERT INTO tb_produto(id_produto, nome_produto, descricao_produto, quantidade_estoque, preco, data_cadastro) VALUES(?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmt = this.getConnection().prepareStatement(sql);

            stmt.setInt(1, objeto.getId_produto());
            stmt.setString(2, objeto.getNome_produto());
            stmt.setString(3, objeto.getDescricao_produto());
            stmt.setInt(4, objeto.getQuantidade_estoque());
            stmt.setFloat(5, objeto.getPreco());
            stmt.setDate(6, new java.sql.Date(objeto.getData_cadastro().getTime()));

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException error) {
            throw new RuntimeException(error);
        }

    }

    //Deleta um produto específico pelo seu campo ID
    public boolean DeleteProdutoBD(int id) {
        try {
            Statement stmt = this.getConnection().createStatement();
            stmt.executeUpdate("DELETE FROM tb_produto WHERE id_produto = " + id);
            stmt.close();

        } catch (SQLException error) {
            System.out.println(error.getMessage());
        }

        return true;
    }

    //Edita um produto específico pelo seu campo ID
    public boolean UpdateProdutoBD(Produto objeto) {

        String sql = "UPDATE tb_produto set nome_produto = ?, descricao_produto = ?, quantidade_estoque = ?, preco = ? WHERE id_produto = ?";

        try {
            PreparedStatement stmt = this.getConnection().prepareStatement(sql);

            stmt.setString(1, objeto.getNome_produto());
            stmt.setString(2, objeto.getDescricao_produto());
            stmt.setInt(3, objeto.getQuantidade_estoque());
            stmt.setFloat(4, objeto.getPreco());
            stmt.setInt(5, objeto.getId_produto());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException error) {
            throw new RuntimeException(error);
        }
    }

    //Retorna um produto pelo seu campo ID
    public Produto getProduto(int id) {

        Produto objeto = new Produto();
        objeto.setId_produto(id);

        try {
            Statement stmt = this.getConnection().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_produto WHERE id_produto = " + id);
            res.next();

            objeto.setNome_produto(res.getString("nome_produto"));
            objeto.setDescricao_produto(res.getString("descricao_produto"));
            objeto.setQuantidade_estoque(res.getInt("quantidade_estoque"));
            objeto.setPreco(res.getFloat("preco"));
            objeto.setData_cadastro(res.getDate("data_cadastro"));

            stmt.close();

        } catch (SQLException error) {
            System.out.println("Erro: " + error.getMessage());
        }
        return objeto;
    }
}
