public class Main {

    public static void main(String[] args) {
        try {
            int numeratore = 10;
            Integer denominatore = 2;
            eseguiDivisione(numeratore, denominatore);
        } catch (Exception e) {
            System.out.println("Errore durante l'esecuzione della divisione: " + e.getMessage());
        }


        try {
            Integer numeratoreNull = null;
            int denominatoreNull = 5;
            eseguiDivisione(numeratoreNull, denominatoreNull);
        } catch (Exception e) {
            System.out.println("Errore : " + e.getMessage());
        }
    }

    public static void eseguiDivisione(Integer numeratore, Integer denominatore) {

        if (numeratore == null || denominatore == null) {
            throw new IllegalArgumentException("non devono essere nulli.");
        }

        try {
            int risultato = numeratore / denominatore;
            System.out.println("Risultato della divisione: " + risultato);
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Impossibile dividere");
        }
    }
}