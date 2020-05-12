package Models;
// Generated 12/05/2020 15:28:40 by Hibernate Tools 4.3.1



/**
 * Estaciona generated by hbm2java
 */
public class Estaciona  implements java.io.Serializable {


     private String placa;
     private String entrada;
     private String cpf;
     private String saida;
     private String status;
     private String qtUso;
     private String qtLivre;
     private String qtTotal;
     private String setor;

    public Estaciona() {
    }

	
    public Estaciona(String placa) {
        this.placa = placa;
    }
    public Estaciona(String placa, String entrada, String cpf, String saida, String status, String qtUso, String qtLivre, String qtTotal, String setor) {
       this.placa = placa;
       this.entrada = entrada;
       this.cpf = cpf;
       this.saida = saida;
       this.status = status;
       this.qtUso = qtUso;
       this.qtLivre = qtLivre;
       this.qtTotal = qtTotal;
       this.setor = setor;
    }

    public Estaciona(String cpf, String placa, String data, String um) {
       this.cpf = cpf;
       this.placa = placa;
       this.entrada = data;
       this.qtUso = um;
    }
   
    public String getPlaca() {
        return this.placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getEntrada() {
        return this.entrada;
    }
    
    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getSaida() {
        return this.saida;
    }
    
    public void setSaida(String saida) {
        this.saida = saida;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public String getQtUso() {
        return this.qtUso;
    }
    
    public void setQtUso(String qtUso) {
        this.qtUso = qtUso;
    }
    public String getQtLivre() {
        return this.qtLivre;
    }
    
    public void setQtLivre(String qtLivre) {
        this.qtLivre = qtLivre;
    }
    public String getQtTotal() {
        return this.qtTotal;
    }
    
    public void setQtTotal(String qtTotal) {
        this.qtTotal = qtTotal;
    }
    public String getSetor() {
        return this.setor;
    }
    
    public void setSetor(String setor) {
        this.setor = setor;
    }




}

