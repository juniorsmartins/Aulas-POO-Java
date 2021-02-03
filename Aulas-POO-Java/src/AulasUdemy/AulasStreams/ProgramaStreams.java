package AulasUdemy.AulasStreams;

import java.util.ArrayList;
import java.util.List;

public class ProgramaStreams 
{
    /*
     * Streams são fluxos de dados/objetos utilizados para que possamos trabalhar 
     * com esses dados de forma mais criteriosa.
     *
     * Quando trabalhamos com stream, os métodos aplicados a este stream não afeta a coleção original
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
        
        // Como fazer para imprimir somente os cursos com mais de 100 alunos?
//        cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getNome())); // Lambda
        cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(System.out::println); // Lambda e Method Reference
        
        // Passo 1 - Transformando a coleção de cursos em stream
        // cursos.stream()
        // Passo 2 - Aplicado filtro para cursos com 100 ou mais alunos
        // .filter(c -> c.getAlunos() >= 100)
        // Passo 3 - Imprimimos o resultado
        // .forEach(System.out:;println);
    }
}