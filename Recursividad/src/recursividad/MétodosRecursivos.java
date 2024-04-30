/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author felix
 */
public class MétodosRecursivos {
    int factorial( int n, int iteracion ){
      /* if ( n < 0 )
           throw new Exception("No es válido el número"); */
       if ( n == 1 || n == 0 )
          return 1;
       
      /*
       int factorial = 1;
       for (int i = n; i > 1; i--){
           factorial *= i;
       }
       return factorial;
     
     */  
        System.out.println("Iteración:" + iteracion);
       return n * factorial( n - 1, iteracion + 1 ); 
    }
    //1
    int fibonacci(int n){
        if(n > 1){
            return fibonacci(n - 1) + fibonacci(n - 2);
        }else if ( n == 1){
            return 1;
        }else if ( n == 0){
            return 0;
        }else{
            System.out.println("Ingrese un Valor");
            return -1;
        }
    }
   // 2
    
    static void ordenarArregloEnteros(int a[], int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
            }
        }
        ordenarArregloEnteros(a, n - 1);
    }
   
   // 3
    
    int sumaEnteros(int n) {
        if (n > 0) {
            return n + sumaEnteros(n - 1);

        } else if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            System.out.println("Solo numeros enteros");
            return -1;
         }
        }
   // 4
    
    int sumarecursivasumapares(int n) {
        if (n > 1 && n % 2 == 0) {
            return n + sumarecursivasumapares(n - 2);
        } else if (n == 0) {
            return 0;
        } else {
            System.out.println("Numeros Pares");
            return -1;
        }
    }
   // 5
    int mcd(int m, int n) {
        int aux = 0;
        int aux2 = 0;
        if (m < n) {
            aux = m;
            aux2 = n;
            m = aux2;
            n = aux;
        }
        if (n == 0) {
            return m;
        } else {
            return mcd(n, m % n);
        }
    }
    
   // 6
   
    int ADecimal(String binario, int numero, int potencia) {
        if (binario.length() != 0) {
            int digito = binario.charAt(binario.length() - 1) == '0' ? 0 : 1;
            numero += digito == 1 ? (int) Math.pow(2, potencia) : 0;
            return ADecimal(binario.substring(0, binario.length() - 1), numero, potencia + 1);
        }
        return numero;
    }
    
   // 7
    
    
   // 8
   
    
   // 9
    
    
   // 10
   
    
   //11
    
    
   // 12
    
}
