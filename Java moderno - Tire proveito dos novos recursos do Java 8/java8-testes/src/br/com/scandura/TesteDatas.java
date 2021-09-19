package br.com.scandura;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TesteDatas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        System.out.println(hoje);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(hoje.format(formatador));

        LocalDateTime agora = LocalDateTime.now();

        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

        System.out.println(agora.format(formatadorComHoras));

        LocalDate copaDoMundoQatar = LocalDate.of(2022, Month.NOVEMBER, 21);

        Period periodo = Period.between(hoje, copaDoMundoQatar);

        System.out.println(String.format("Faltam %d ano(s), %d mes(es) e %d dia(s) para a copa do mundo do Qatar!", periodo.getYears(), periodo.getMonths(), periodo.getDays()));
    }
    
}
