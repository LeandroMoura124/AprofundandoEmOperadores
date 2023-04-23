import java.util.ArrayList; //sendo mais especifico - menos abrangente, classe filha
import java.util.List;  // pega a classe mae inteira da List - é mais abrangente

public class TestaOperadores{
    public static void main(String[] args){
        ArrayList<String> lista= new ArrayList<>();
        List<String> lista2 = lista;
        long idade = 15; //long armazena mais que int
        //int e = idade; // erro, nao podemos converte do mais abrangente para o meno abrangente (long pra int)
               
        
         //TABELA
                    //char > 
          // byte > short > int > long
          // float > double 

          int a = 10;
          long b = 20;
          short c = 3;
          byte d = 4;

          float f = 40.3f;
          double e = 30.5d;

          f=b;
          b=a;
          c=d;
          
         // float e double pode armazenar int, long, short e byte
         f=a;
         f=b;
         f=c;
         f=d;

         e = a;
         e=b;
         e=c;
         e=d;

         //agora se eu fizer o inverso, ou seja, converter de um maior para o menor, da erro
         // jogando o long=20 para o int
         //     a=b;        <- erro de long pra int
       // c=b; erro - de long pra shor
        // e assim respectivamente

    }
  

}