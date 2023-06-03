public class MainCarro {

    public static void main(String[] args) {

        Carro renault = new Carro("Renault", "Logan", 2018, "Negro");
        Carro mazda = new Carro("Mazda", "CX 30", 2020, "Rojo");

        renault.setAcelerar("si");
        mazda.setAcelerar("si");

        //Imprimo la accion del carro
        System.out.println(renault.getAcelerar());
        System.out.println(mazda.getAcelerar());

        renault.setGirar("derecha");
        mazda.setGirar("izquierda");

        //imprime el giro del carro
        System.out.println(renault.getGirar());;
        System.out.println(mazda.getGirar());;

        renault.setFrenar("si");
        mazda.setFrenar("si");

        //Imprime la accion del carro
        System.out.println(renault.getFrenar());
        System.out.println(mazda.getFrenar());

        System.out.println(renault.mostrarInformacion());
        System.out.println(mazda.mostrarInformacion());

    }

}