package sk.stuba.fei.uim.oop;

public class App {
    public static void main(String[] args){
        int celeCislo = 5;
        long vacsieCeleCislo = 5L;
        float desatinneCislo = 5.5f;
        double dlhsieDesatinneCislo = 5.5;
        char znak = 's';
        String retazec = "Hello world";
        boolean bool = false;

        int podiel = 2/3;
        System.out.println(podiel);

        int zvysok = 2%3;
        System.out.println(zvysok);

        float desatinnyFloat = 2/3.0f;
        System.out.println(desatinnyFloat);

        int cislo = 2;

        for(int number = 0; number < 4; number++){
            System.out.print(number);
        }
        int temp = 0;
        while(temp < 8){
            System.out.println(temp);
            temp++;
        }
        int[] array = new int[10];

        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }

        for(int i = 0; i < array.length; i++){
            App.vypisCisel(array[i]);
        }
    }

    public static void vypisCisel(int a){
        System.out.println(a);
    }

}
