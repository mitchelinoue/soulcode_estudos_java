package aulas;// Enums são estrutuas com classes definidas
// Dias da semana, meses do ano, turnos do dia, estações
// níveis (junior, pleno, senior), feriados nacionais




public class EstudoEnums {
    public static void main(String[] args) {
        enum DiaDaSemana {
            Segunda,
            Terca,
            Quarta,
            Quinta,
            Sexta,
            Sabado,
            Domingo
        }

        DiaDaSemana hoje = DiaDaSemana.Quinta;
        System.out.println(hoje);

        enum NivelDev {JUNIOR, PLENO, SENIOR}

        NivelDev nivel = NivelDev.SENIOR;
        NivelDev nivel2 = NivelDev.valueOf("JUNIOR"); //o vlaor precisa exatamente ser uma das três disponíveis


        switch(nivel){
            case JUNIOR:
                System.out.println("Seu nível é junior");
                break;
            case PLENO:
                System.out.println("Seu nível é pleno");
                break;
            case SENIOR:
                System.out.println("Seu nível é senior");
                break;
        }

        switch(nivel) {
            case JUNIOR -> {
                System.out.println("Seu nível é JUNIOR");
            }
            case PLENO -> {
                System.out.println("Seu nível é PLENO");
            }
            case SENIOR -> {
                System.out.println("Seu nível é SENIOR");
            }
            default -> {
                System.out.println("Nunca executa");
            }
        }





    }
}
