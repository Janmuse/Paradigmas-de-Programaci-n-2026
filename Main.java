public class Main {
    static void main() {

        Integer [] intVector = { 101, 99, 12, 19, 21, 111, 345, 25, 77, 81 };
        Integer [] resultInt = Utils.ordena (intVector);
        System.out.println("Con int");
        Utils.imprimir(resultInt);

        System.out.println("Con float");
        Float [] floatVector = { 19.1f, 456.6f, 23.45f, 12.34f, 11.11f, 354.55f, 78.45f, 28.33f, 45.99f, 108.88f };
        Float[] resultFloat = Utils.ordena (floatVector);
        Utils.imprimir(resultFloat);

        System.out.println("Con string");
        String [] strVector = {"zz", "aa", "cc", "hh", "bb", "ee", "ll"};
//Fails con String
//      String [] resultStr = Utils.ordena (strVector);
        Utils.imprimir(strVector);
    }
}
