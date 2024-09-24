public class lista02_ex06 {
    public static void main(String[] args) {
    
        int totalSegundos = 10 * 60;
        
        for (int i = totalSegundos; i >= 0; i--){
            
            int minutos = i / 60;
            int segundos = i % 60;      
            
            System.out.printf("%02d:%02d%n", minutos,segundos);
            
            
        }
            System.out.println("Contagem regressiva finalizada:");
    }
  }
