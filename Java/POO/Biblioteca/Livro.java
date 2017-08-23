
package biblioteca;

public class Livro {
    private String nome;
    private String autor;
    private String genero;
    private String editora;
   
   //Livro1 Inicio 
   public String getNome(){
   
       return nome;
   }
   
   public void setNome(String pegalivro1){
       
       nome = pegalivro1;
   }
   // Livro1 Fim

   /***************************************************/
   
   // Autor Inicio
   public String getAutor(){
   
       return autor;
   }

   public void setAutor(String pegaautor){
   
       autor = pegaautor;
   }
   // Autor FIM
   /****************************************************/
   
    // Genero Inicio
   public String getGenero(){
   
       return genero;
   }

   public void setGenero(String pegagenero){
   
       genero = pegagenero;
   }
   // Genero FIM
   /****************************************************/
   
    // Editora Inicio
   public String getEditora(){
   
       return editora;
   }

   public void setEditora(String pegaeditora){
   
       editora = pegaeditora;
   }
   // Genero FIM
   /****************************************************/
   

}
