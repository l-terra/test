public class casting
{
    public static void main(String [] args)
    {
        int a, b;
        double resultado;

        a = 5;
        b = 2;

        resultado = (double) a/b;

        System.out.println(resultado);

        /*
        OUTRO CASO EH QUANDO:
        OUBLE A;
        INT B;

        A = 5.0;
        B = (INT) A;

        SYSTEM.OUT.PRINTLN(B); -> ISSO VAI PRINTAR APENAS 5 INTEIRO
        */
    }
}
