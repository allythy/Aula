
package biblioteca;

import java.util.Scanner; 

public class Biblioteca {

    public static void main(String[] args) {
      
/* sem entra de dados
        
       //Livro
       Livro livro1 = new Livro(); // criando o objeto Livro1
       livro1.setNome("Python"); // Configurando(set)o nome para Python
       System.out.println("Nome do Livro: " + livro1.getNome()); // Pegando(get) e colocando na tela do nome do Livro1
     
      // Autor
      livro1.setAutor("Allythy");
      System.out.println("Nome do Autor: " + livro1.getAutor());
    
      //Genero
      livro1.setGenero("Programação");
      System.out.println("Gênero do Livro: " + livro1.getGenero());
      
      //Editor
      livro1.setEditora("Novatec");
      System.out.println("Editora: " + livro1.getEditora());
     
   } */   
        
  
   Scanner entrada = new Scanner(System.in);
   
   System.out.print("Digite o nome do livro: ");
   String livro = entrada.nextLine();
   
   System.out.print("Digite o nome do autor: ");
   String autor = entrada.nextLine();
   
   System.out.print("Digite o gênero: ");
   String genero = entrada.nextLine();
   
   System.out.print("Digite o nome da editora: ");
   String editora = entrada.nextLine();
   
   Livro livro1 = new Livro();
   
   livro1.setNome(livro);
   livro1.setAutor(autor);
   livro1.setGenero(genero);
   livro1.setEditora(editora);
    
   System.out.println("----------------------");
   System.out.println("\nNomde do livro: " + livro1.getNome()+ "\n" + "Nome do autor: " + livro1.getAutor() + "\n" +"Gênero: "+ livro1.getGenero()+ "\n" + "Editora: " + livro1.getEditora());
   
    }    
}
