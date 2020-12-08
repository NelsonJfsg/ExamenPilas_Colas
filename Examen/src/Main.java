public class Main {
    public static void main(String[] args) {
        
        //Titulo
        System.out.println("3. PILAS Y PUEBLOS.\n");
        Pila pila = new Pila(5);
        
        //En camino.
        System.out.println("Camino a mi destino.");
        for(int i = 0; i < 5; i++){
            pila.push("pueblo: " + i);
            System.out.println(pila.ultimo());
        }
        
        //De regreso a casa.
        System.out.println("\nDe regreso a casa.");
        for(int i = 4; i >= 0; i--){
            System.out.println(pila.ultimo());
            pila.pop();
        }
    
        //Titulo
        System.out.println("4. COLAS Y NUMEROS.\n");
        
        
        
        
        
    }
    
}
