package carroatv;
public class Carro {
    private String cor;
    private String modelo;
    private double velocidadeAtual;
    private double velocidadeMaxima;
    private int marcha;
    private boolean ligado;
    private double aceleracao;

    //ToString
    public String detalhes() {
        return  "===========================" + "\nCor: " + cor + "\nModelo: " + modelo + "\nAceleracao: " + aceleracao + "\nVelocidadeAtual: " + velocidadeAtual + "\nVelocidadeMaxima: " + velocidadeMaxima + "\nMarcha: " + marcha + "\nLigado: " + ligado +  "\n===========================" + "";
    } 
    
    // Get e set
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public double getAceleracao() {
        return aceleracao;
        
    }

    public void setAceleracao(double aceleracao) { 
        this.aceleracao = aceleracao;
         
        if(this.aceleracao >= 300){            
        this.velocidadeAtual = 300;
        System.out.println("Cuidado! Não pode acelera mais, você  atingiu a velecidade maxima");
        }else{
            this.velocidadeAtual = this.aceleracao;
        }
    }// Coloquei um if aqui pra não permitir que a aceleração seja maior que a velocidade maxima
    
    //Métodos
    public void ligar(){
        this.ligado = true;
    }
    
       
    public int pegaMarcha(){
        if(this.velocidadeAtual>0 && this.velocidadeAtual<=60.9){
            return marcha = 1;
        }else if(this.velocidadeAtual>=61 && this.velocidadeAtual<=120.9){
            return marcha = 2;
        }else if(this.velocidadeAtual>=121 && this.velocidadeAtual<=180.9){
            return marcha = marcha = 3;
        }else if(this.velocidadeAtual>=181 && this.velocidadeAtual<=240.9){
            return marcha = 4;
        }else if(this.velocidadeAtual>=241 && this.velocidadeAtual<300.1){
            return marcha = 5;
        }            
        return marcha =0;
    }
}
