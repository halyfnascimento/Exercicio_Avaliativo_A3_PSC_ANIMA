import java.util.Scanner;

public class Professor {

    // Atributos
    String nome;
    int regime;
    double valorH;
    double salario;
    double vContrato;

    Professor p1 = new Professor();

    public static void Formulario(Scanner teclado) {
        String nome;
        int regime;
        double valorH, cHoraria;
        double salario;
        double vContrato, calc;
        System.out.println("Qual seu nome?");
        nome = teclado.next();
        System.out.println("Qual seu regime de trabalho? [1 - CLT - 2 PJ - 3 Horista]");
        regime = teclado.nextInt();

        if (regime == 1) {
            System.out.println("Qual valor do seu salario?");
            salario = teclado.nextDouble();

            System.out.println("Nome: " + nome);
            System.out.println("Regime: CLT");
            System.out.println("Valor a Receber R$: " + salario);
        }
        if (regime == 2) {
            System.out.println("Qual valor do seu contrato?");
            vContrato = teclado.nextDouble();

            System.out.println("Nome: " + nome);
            System.out.println("Regime: PJ");
            System.out.println("Valor a receber R$: " + vContrato);
        }
        if (regime == 3) {
            System.out.println("Qual valor da sua hora trabalhada?");
            valorH = teclado.nextDouble();
            System.out.println("Quantas horas você trabalha  diariamente?");
            cHoraria = teclado.nextDouble();

            calc = cHoraria * valorH;

            System.out.println("Nome: " + nome);
            System.out.println("Regime: Horista");
            System.out.println("Valor a receber R$: " + calc);
        }
        teclado.close();

    }
}
