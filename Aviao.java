package aeroporto;



public class Aviao {
    
    String prefixo;
    String companhia;
    
    public Aviao(){
        
        prefixo = "";
        companhia = "";
        
    }
    
    Aviao patio[] = new Aviao[3];
    
    void aterrissar(Aviao a){
        
        for(int i = 0; i < 3; i++){
            if(patio[i] == null){
                patio[i] = a;
                break;
            }
        }
    }
    
    
    void listar(){
        for(Aviao a : patio){
        if(a != null){
        System.out.println("Prefixo: " + a.prefixo);
        System.out.println("Companhia " + a.companhia);
        System.out.println("");
        }
      }
    }

    
    void decolar(Aviao a){
        
        for(int i = 0; i < 3; i++){
            if(patio[i].companhia.equals(a.companhia)){
                patio[i] = null;
                
            }
        }
        
    }
    
}
