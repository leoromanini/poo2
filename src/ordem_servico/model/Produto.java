package ordem_servico.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Produto {
    private Integer id;
    private String nome;
    private Integer qtd;
    private Float precoSugerido;
    private Dados dados = new Dados();
    
    public Produto(){
                
    }
    
    public Produto(Integer id){
        try{
            ResultSet rs = dados.busca("SELECT * FROM produto WHERE id= " + id.toString());
            if (rs.next()){
                this.id = rs.getInt(1);
                this.nome = rs.getString(2);
                this.qtd = rs.getInt(3);
                this.precoSugerido = rs.getFloat(4);
            }
        }catch(SQLException ex){
            System.err.println("Erro SQL: " + ex);
        }catch(Exception e){
            System.err.println("Erro geral na criação de Produto: " + e);
        }        
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public Float getPrecoSugerido() {
        return precoSugerido;
    }

    public void setPrecoSugerido(Float precoSugerido) {
        this.precoSugerido = precoSugerido;
    }
    
    public boolean insertProduto() {
        return (dados.executa("INSERT INTO produto(nome,qtd,preco_sugerido) VALUES('"+nome+"',"+qtd+","+precoSugerido+")"));
    }

    public boolean updateProduto() {
        return (dados.executa("UPDATE produto SET nome='"+nome+"', qtd="+qtd+", preco_sugerido="+precoSugerido+" WHERE id="+id));
    }

    public boolean deleteProduto() {
        return (dados.executa("DELETE FROM produto WHERE id=" + id));
    }
        
    private ArrayList<Produto> buscaGeral(String sql){
        ArrayList<Produto> listProduto = new ArrayList();
        ResultSet rsProduto;
        Produto produto;
        rsProduto = dados.busca(sql);
        try {
            while (rsProduto.next()) {
                produto = new Produto(rsProduto.getInt(1));
                listProduto.add(produto);
            }
        } catch (SQLException ex) {
            System.err.println("Erro SQL busca produtos: " + ex);
        } catch (Exception e) {
            System.err.println("Erro geral busca produtos: " + e);
        }
        return listProduto;
    }
    
    public ArrayList<Produto> selectAll() {
        String sql = "SELECT id FROM produto ORDER BY id DESC";
        return buscaGeral(sql);
    }
    
}