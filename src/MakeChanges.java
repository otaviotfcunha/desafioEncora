public class MakeChanges {
    public static double[] valorFinal = new double[4];
    public static double[] valorMoedas = new double[]{25, 10, 5, 1};
    public static String[] nomeMoedas = new String[]{"Quarters", "Dimes", "Nickels", "Pennies"};

    public static void imprimeResultado(){
        System.out.println();
        System.out.println("O valor final resultante e:");
        for(int j = 0; j < 4; j++){
            System.out.println("Total de: " + valorFinal[j] + " em " + nomeMoedas[j]);
        }
        System.out.println();
    }

    public static void makeChange(double val){
        for(int i =  0; i < 4; i++){
            valorFinal[i] = val * (valorMoedas[i] / 100);
        }
        imprimeResultado();
    }
}
