public class Pila {
 
    String arr[];
    int max;
    int top;
    
    public Pila(int n){
        max = n;
        arr = new String[max];
        top = 0;
    }
    
    public boolean vacio(){
        if(top == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public void push(String valor){
        if(top < max){
            arr[top] = valor;
            top++;   
        }
    }
    
    public String ultimo(){
        if(top > 0){
            return arr[top-1];   
        }else{
            return "vacio";
        }
    }
    
    public String pop(){
        
        String temp = null;
        
        if(top > 0){
            temp = arr[top-1];
            arr[top-1] = null;
            top--;
        }
        
        return temp;
    }
    
    
}