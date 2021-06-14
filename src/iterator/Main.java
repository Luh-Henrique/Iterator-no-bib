package iterator;

public class Main {
    
    public static void main(String args[])
    {
        Cores [] cores = new Cores[4];

        cores[0] = new Cores("Azul");
        cores[1] = new Cores("Verde");
        cores[2] = new Cores("Amarelo");
        cores[3] = new Cores("Vermelho");

        //Usando for
        System.out.println("Usando for:\n");
        
        for (int i=0; i < cores.length; i++) {
            System.out.println(cores[i].nome);
        }

        //Usando padrão iterator
        System.out.println("\n\nUsando Iterator:\n");
        
        Iterator coresIterator = new CoresIterator(cores);

        while (coresIterator.hasNext()) {
            Cores menuItem = (Cores)coresIterator.next();
            System.out.println(menuItem.nome);
    }
}
}
