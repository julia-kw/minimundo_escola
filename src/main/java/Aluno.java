public class Aluno {
    // Atributos
    private String nome;
    private int idade;
    private String sexo;
    
    
    // Construtor
    public Aluno(String nome, int idade, String sexo) {
        this.nome = nome;
      
    }

    // Métodos para acessar os atributos 
    private String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
      }
    
     private void validarNome(String nome){
       String regex
       boolean teste = nome.matches(regex);
       if(teste){
         this.nome = nome
     } else {
         
       }

    private int getIdade() {
        return this.idade;
            }

    private void int setIdade(int idade) {
          this.idade = idade
        }

    private String getSexo() {
        return this.sexo;
    }

   private void setSexo(String sexo) {
       return.sexo = sexo
       }
 }

