package AulasUdemy.AulasStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Streams são fluxos de dados
 * Stream + Thread (paralelismo)
 * Útil quando trabalhamos com milhões de dados
 * Não é recomendado para quantidade pequena de dados
*/
public class ProgramaStreams4 
{
    public static void main(String[] args) 
    {
        List<Curso> cursos = new ArrayList<Curso>();
        
        cursos.add(new Curso("Programação C++", 101));
        cursos.add(new Curso("Programação Python", 102));
        cursos.add(new Curso("Programação JavaScript", 89));
        cursos.add(new Curso("Programação Java", 203));
        cursos.add(new Curso("Programação C", 75));
        cursos.add(new Curso("Programação PHP", 92));
        
        cursos.parallelStream()
            .filter(c -> c.getAlunos() >= 100)
            .collect(Collectors.toMap(
            c -> c.getNome(),
            c -> c.getAlunos()))
        .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
    }
}