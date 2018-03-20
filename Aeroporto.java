
package aeroporto;



public class Aeroporto {

    String prefixo;
    String nome;
       
    
    public static void main(String[] args) {
        
        
        Aviao av = new Aviao();
        av.prefixo = "AND";
        av.companhia = "Andira";
        av.aterrissar(av);
      
        
        Aviao av1 = new Aviao();
        av1.prefixo = "SIQ";
        av1.companhia = "Siqueira";
        av.aterrissar(av1);
       
        
        Aviao av2 = new Aviao();
        av2.prefixo = "STA";
        av2.companhia = "Santa Amelia";
        av.aterrissar(av2);
        av.decolar(av2);
    
        av.listar();
        
        
    }
    
}
