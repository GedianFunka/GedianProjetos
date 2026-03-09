package Pessoa;

public class Pessoa {

	        //atributos
	        private String nome;
	        private int idade;
	        private String cpf;
	        
	        //construtor completo
	        public Pessoa(String nome, int idade, String cpf) {
	            this.nome = nome;
	            this.idade = idade;
	            this.cpf = cpf;
	            
	        }
	        
	        
	        //criando metodos de acesso getters e setters
	        //getters -> chama atributo .get
	        //setters -> modifica o atributo .set

			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public int getIdade() {
				return idade;
			}

			public void setIdade(int idade) {
				this.idade = idade;
			}

			public String getCpf() {
				return cpf;
			}

			public void setCpf(String cpf) {
				this.cpf = cpf;
			}
	
	        
	        
	    }
	
