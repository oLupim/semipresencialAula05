package ATV2;

public class Veiculo {

    String marca;
    String modelo;
    int ano;

    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar(){
        System.out.println(modelo +": Ligando...\n");
    }

    public void desligar(){
        System.out.println(modelo +": Desligando..\n");
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " " + ano ;
    }
}
