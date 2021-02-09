import java.util.Random;

public class RandomTester{
        private Random aleatorio;

    public RandomTester(){
        aleatorio = new Random();
    }

    public void printOneRandom(){        
        int numAleatorio = aleatorio.nextInt();
        System.out.println(numAleatorio);
    }
    
    public void printMultiRandom(int cantidad){
        int contador=1;
        while(contador <= cantidad){
            int numAleatorio = aleatorio.nextInt();
            System.out.println(numAleatorio);
            contador++;
        }    
    }
    
    public int lanzarDado(){
        int numAleatorio = aleatorio.nextInt(7);        
        return numAleatorio;
    }
    
    public String getRespuesta(){
        String respuesta = "";
        int numAleatorio = aleatorio.nextInt(3);
        if (numAleatorio == 0){
            respuesta = "si";
        }
        if (numAleatorio == 1){
            respuesta = "no";
        }
        if (numAleatorio == 2){
            respuesta = "quizás";
        }
        return respuesta;
    }
    
    public int getNumeroEntre1Y(int max){
        int numAleatorio = 1 + aleatorio.nextInt((max +1) - 1);
        return numAleatorio;
    }
    
    public int getNumeroEntre(int min, int max){
        int numAleatorio = min + aleatorio.nextInt((max +1) - min); 
        return numAleatorio;
    }    
}
