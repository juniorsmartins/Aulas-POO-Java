package AulasUdemy.AulasStreams;

import java.util.ArrayList;
import java.util.List;

public class ProgramaStreams3 
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
        
        int soma = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)
                .sum();
        System.out.println("A soma dos alunos de todos os cursos com mais de 100 alunos é: " + soma);
    }
}