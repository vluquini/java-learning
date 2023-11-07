package fundamentos.enums;

public class EnumsExemplo {
    // Definição de um enum para os dias da semana
    enum DiaDaSemana {
        DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
    }

    public static void main(String[] args) {
        // Usando o enum para representar um dia da semana
        DiaDaSemana hoje = DiaDaSemana.SEGUNDA;

        // Exemplo de uso do enum em um switch (novo switch do java)
        switch (hoje) {
            case DOMINGO -> System.out.println("Hoje é domingo.");
            case SEGUNDA -> System.out.println("Hoje é segunda-feira.");
            case TERCA -> System.out.println("Hoje é terça-feira.");
            case QUARTA -> System.out.println("Hoje é quarta-feira.");
            case QUINTA -> System.out.println("Hoje é quinta-feira.");
            case SEXTA -> System.out.println("Hoje é sexta-feira.");
            case SABADO -> System.out.println("Hoje é sábado.");

        }
        // Acessando valores e métodos do enum
        System.out.println("Número do dia da semana: " + hoje.ordinal()); // Retorna 1 para SEGUNDA
        System.out.println("Próximo dia da semana: " + DiaDaSemana.values()[(hoje.ordinal() + 1) % DiaDaSemana.values().length]);

        MesesAno mes = MesesAno.JANEIRO;

        switch (mes) {
            case JANEIRO -> System.out.println("O mês é Janeiro.");
            case FEVEREIRO -> System.out.println("O mês é Fevereiro.");
            case MARÇO -> System.out.println("O mês é Março.");
        }

        System.out.println("Mês atual " + mes.ordinal()); // Retorna 1 para JANEIRO
        System.out.println("Próximo mês: " + MesesAno.values()[(mes.ordinal() + 1) % MesesAno.values().length]);


    }
}

