import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu(sc);

    }
    public static void menu(Scanner sc){
        int meta = 0;
        int streak = 0;
        int op = 0;

        while (op != 5){
            System.out.println("### Controle de Hábitos (Habit Tracker) ###");
            System.out.println("1 - Registrar conclusão de hábito hoje (ex:Estudei Java)");
            System.out.println("2 - Ver sequência de dias (streak)");
            System.out.println("3 - Redefinir meta semanal.");
            System.out.println("4 - Registrar sentimentos.");
            System.out.println("5 - Sair");

            op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1:
                    streak++;
                    registrar(sc);
                    break;

                 case 2:
                     sequencia(streak);
                     break;

                 case 3:
                     meta = metasemanal(sc, meta);
                     break;

                 case 4:
                    registrarSentimento(sc);
                    break;
                case 5:
                    System.out.println("Saindo, até mais!");
                    System.out.println("\n--------------------------\n");
                    break;

                 default:
                    System.out.println("ATENÇÂO: opção invalida!");

            }
        }
        sc.close();
    }

    public static String registrar(Scanner sc){
        System.out.println("Qual hábito você quer registrar? ");
        String habito = sc.nextLine();
        System.out.println("Mostrando hábito registrado: " +  habito);
        System.out.println("\n--------------------------\n");
        return habito;
    }

    public static void sequencia(int streak){
        System.out.println("Mostra sequência de " + streak + " dias.");
        System.out.println("\n--------------------------\n");
    }

    public static int metasemanal(Scanner sc, int meta){
        System.out.println("Sua meta atual é " + meta);
        System.out.println("Digite a nova meta semanal: ");
        meta = sc.nextInt();
        sc.nextLine();
        while(meta > 7 || meta < 1){
            System.out.println("A semana só tem 7 dias");
            System.out.println("Digite novamente: ");
            meta = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Você digitou " + meta + " dias");
        System.out.println("Meta atualizada com sucesso!");
        System.out.println("\n--------------------------\n");
        return meta;
    }
   public static void registrarSentimento(Scanner sc){
       System.out.println("Olá, como você se chama?: ");
       String nome =  sc.nextLine();
       System.out.println("O que você está sentindo? ");
       String sentimento = sc.nextLine();
       System.out.println("Entendo... você está se sentindo " + sentimento);
       System.out.println("Lembre-se: Mesmo nos dias difíceis, você não desistiu do seu código, " + nome + " Nunca esqueça disso!!");
       System.out.println("\n--------------------------\n");
   }
}


