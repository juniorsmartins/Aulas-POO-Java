package AulasUdemy.AulasStreams;

import java.util.ArrayList;
import java.util.List;

public class ProgramaStreams 
{
    public static void main(String[] args) 
    {
        List<Curso> cursos = new ArrayList<Curso>();
        
        cursos.add(new Curso("Matemática", 145));
        cursos.add(new Curso("Português", 73));
        cursos.add(new Curso("Estatística", 1665));
        cursos.add(new Curso("Java", 280));
        cursos.add(new Curso("C#", 201));
        cursos.add(new Curso("Python", 99));
    }
}