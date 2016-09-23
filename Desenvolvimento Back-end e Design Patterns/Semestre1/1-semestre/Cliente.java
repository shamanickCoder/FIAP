class Cliente {
      private String nome;
      private int id;
      private String cpf;
      private String email;
      public void setNome(String x){
             nome = x;
      }
      public String getNome(){
             return nome;
      }
      public void setId(int a){
             id = a;
      }
      public int getId(){
             return id;
      }
      public void setCpf(String b){
             cpf = b;
      }
      public String getCpf(){
             return cpf;
      }
      public void setEmail(String c){
             email = c;
      }
      public String getEmail(){
             return email;
      }
      public void setTudo(String nome2, int id2, String cpf2, String email2){
             nome = nome2;
             id = id2;
             cpf = cpf2;
             email = email2;
      }
      public String getTudo(){
             return nome+id+cpf+email;
      }
} 