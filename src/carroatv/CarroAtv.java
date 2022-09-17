package carroatv;


public class CarroAtv {

    
    public static void main(String[] args) {
       Carro carro1 = new Carro(); 
       
        carro1.setCor("Branca");
        carro1.setModelo("Porche");
        carro1.setLigado(true);
        carro1.setAceleracao(221);
        carro1.pegaMarcha();
        
        System.out.println(carro1.detalhes());
        
        
        
   
   }
    
}
