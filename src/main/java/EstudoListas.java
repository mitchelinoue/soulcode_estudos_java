import java.util.ArrayList;

public class EstudoListas {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(); //cria um anovo ArrayList que guarda Integer e podeser vazio
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println(numeros);
        System.out.println(nomes);

        //adicionando elementos no array
        numeros.add(10);
        numeros.add(20);
        numeros.add(1000);

        System.out.println(numeros);
        System.out.println(numeros.get(2)); // ArrayList precisa utilizar .get(), equivale a numeros[2]

        numeros.set(0, 500); //serve para inserir na posição 0 o valor 500, como numeros[0] = 500

        numeros.add(1, 10);
        numeros.add(3, 250);
        numeros.add(10);


        System.out.println(numeros);

        numeros.remove(0); //remove o elemento na posição 0

        System.out.println(numeros);

        System.out.println(numeros.get(0));
        System.out.println(numeros.get(1));

        System.out.println(numeros.size()); // serve para saver o tamanho do array, como array.length

        for( int i = 0; i < numeros.size(); i++){
            System.out.println("No array numeros temos: " + numeros.get(i));
        }

        System.out.println("--------------------");

        for(int numero : numeros) {
            System.out.println(numero);
        }

        System.out.println(numeros.contains(500)); //true = achou, false = não achou
        System.out.println(numeros.indexOf(1000)); //qual a posição do 1000 na lista?
        System.out.println(numeros.indexOf(123456)); // -1 = não achou o elemento
        System.out.println(numeros.indexOf(10)); // mostra o arry do primeiro encontrado
        System.out.println(numeros.lastIndexOf(10)); // mostra o último encontrado
    }
}
