package pessoa;

public class TestePessoa {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setNome("Thayna");;
        professor.setIdade(25);;
        professor.setCpf("063.544.912.07");;
        professor.setSalario(10.000);

        Aluno aluno = new Aluno();
        aluno.setNome("Gledson");;
        aluno.setIdade(23);;
        aluno.setCpf("063.544.912.07");;
        aluno.setMatricula("11123");;

        System.out.println(professor.imprimirDadosDaPessoa());
        System.out.println(aluno.imprimirDadosDaPessoa());

    }
}
