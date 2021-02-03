package AulasUdemy.AulasStreams;

import java.util.ArrayList;
import java.util.List;

public class ProgramaStreams2 
{
    /*
     * Apresenta a quantidade de alunos de cada curso
    */
    public static void main(String[] args) 
    {
        List<Curso> cursos = new ArrayList<Curso>();
        
        cursos.add(new Curso("Programação C++", 271));
        cursos.add(new Curso("Programação Python", 188));
        cursos.add(new Curso("Programação JavaScript", 89));
        cursos.add(new Curso("Programação Java", 302));
        cursos.add(new Curso("Programação C", 75));
        cursos.add(new Curso("Programação PHP", 221));
        
        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .map(Curso::getAlunos) // ele mapeia um tipo de dado para outro
                . forEach(System.out::println);
    }
}