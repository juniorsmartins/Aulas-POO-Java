package AulasUdemy.AulasDatas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ProgramaData 
{
    public static void main(String[] args) 
    {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje); // Formato ISO (internacional)

        
        int ano1 = hoje.getYear();
        Month mes1 = hoje.getMonth();
        int dia1 = hoje.getDayOfMonth();
        System.out.println("Dia: " + dia1 + " Mês: " + mes1 + " Ano: " + ano1);

        
        LocalDate ano_novo = LocalDate.of(2019, Month.MARCH, 3);
        System.out.println(ano_novo); // Formato ISO (internacional)
        
        
        int ano = ano_novo.getYear();
        Month mes = ano_novo.getMonth();
        int dia = ano_novo.getDayOfMonth();
        System.out.println("O ano novo será em " + dia + " de " + mes + " de " + ano);
        
        
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(hoje.format(formatador)); // formatado para o padrão brasileiro
        
        
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora); // formato ISO (internacional)
        
        
        DateTimeFormatter formatador_horas = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(agora.format(formatador_horas));
    }
}