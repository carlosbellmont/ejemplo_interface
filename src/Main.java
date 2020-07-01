import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Esta línea se ejecuta en tercer lugar");
        Clase1 clase1 = new Clase1();
        clase1.mostrarPorPantalla();

        Clase2 clase2 = new Clase2();
        clase2.mostrarPorPantalla();

        ArrayList<MostrablePorPantalla> listaDeMostrables = agruparEnLista(clase1, clase2);
        mostrarLista(listaDeMostrables);
    }

    private static ArrayList<MostrablePorPantalla> agruparEnLista(Clase1 clase1, Clase2 clase2){
        ArrayList<MostrablePorPantalla> listaDeMostrables = new ArrayList<>();
        listaDeMostrables.add(clase1);
        listaDeMostrables.add(clase2);
        return listaDeMostrables;
    }

    private static void mostrarLista(ArrayList<MostrablePorPantalla> listaDeMostrables){
        System.out.println("----Mostrando una lista de MostrablesPorPantalla----");
        for (int i = 0; i < listaDeMostrables.size(); i++){
            listaDeMostrables.get(i).mostrarPorPantalla();
        }
    }
}

