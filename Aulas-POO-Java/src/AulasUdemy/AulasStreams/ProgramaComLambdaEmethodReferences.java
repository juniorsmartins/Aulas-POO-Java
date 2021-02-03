package AulasUdemy.AulasStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProgramaComLambdaEmethodReferences 
{
    public static void main(String[] args) 
    {
        List<Curso> cursos = new ArrayList<Curso>();
        
        cursos.add(new Curso("Matemática", 145));
        cursos.add(new Curso("Português", 73));
        cursos.add(new Curso("Estatística", 165));
        cursos.add(new Curso("Java", 280));
        cursos.add(new Curso("C#", 201));
        cursos.add(new Curso("Python", 99));
        
//        cursos.sort(Comparator.comparing(c -> c.getAlunos())); // Lambda
        cursos.sort(Comparator.comparing(Curso::getAlunos)); // Method References
        
//        cursos.forEach(c -> System.out.println(c.getNome())); // Lambda
        cursos.forEach(System.out::println); // Method References
        
    }
}