package ATV2;

public class Main {
    public static void main(String[] args) {

        Veiculo carro1 = new Veiculo("Fiat", "Uno", 2009);
        Veiculo carro2 = new Veiculo("Fiat", "Punto", 2010);


        System.out.println(carro1);
        System.out.println(carro2);

        carro1.ligar();
        carro1.desligar();

        carro2.ligar();
    }
}

