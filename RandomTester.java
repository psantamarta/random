import java.util.Random;

public class RandomTester{


    public RandomTester(){
        
    }

    public void printOneRandom(){
        Random aleatorio;
        aleatorio = new Random();
        int numAleatorio = aleatorio.nextInt();
        System.out.println(numAleatorio);
    }
    
    public void printMultiRandom(int cantidad){
        int contador=1;
        while(contador <= cantidad){
            Random aleatorio;
            aleatorio = new Random();
            int numAleatorio = aleatorio.nextInt();
            System.out.println(numAleatorio);
            contador++;
        }
    
    }
}
