package tipoevariaveis;

public class variavelglobalelocal {

    //variavel global é acessivel a todos os metodos e seu valor é compartilhado entre todos os metodos
   static int numeroGlobal = 11;
    public static void main(String[] args) {

        //variável local porque pertence somente a esse metodo
        //e o valor só pode ser usado aqui dentro.

        int numero = 10;
        System.out.println("Valor variável local = " + numero);
        System.out.println("O variavel local é de " + numero + " e o valor global é " + numeroGlobal);

        metodo2();
    }

    public static void metodo2(){
        System.out.println("Valor da variável global é = " + numeroGlobal);

    }
}
