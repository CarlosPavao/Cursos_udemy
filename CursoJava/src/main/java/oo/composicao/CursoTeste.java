
package oo.composicao;

/**
 *
 * @author Carlos Pavão
 */
public class CursoTeste {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("João");
        
        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web 2021");
        Curso curso3 = new Curso("React Native");
        
        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);
        
        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);
        
        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);
        
        
        for(Aluno aluno: curso3.alunos){
            System.out.println("Estou matriculado no Curso:" + curso3.nome);
            System.out.println("e meu nome é " + aluno.nome);
            System.out.println();
        }
        
        System.out.println(aluno1.cursos.get(0).alunos);
        
        Curso cursoEncontrado = aluno1.ObterCursoPorNome("Java Completo");
        
        if(cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
            
        }
        
    }
    
}
