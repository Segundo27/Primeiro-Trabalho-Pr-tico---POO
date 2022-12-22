package stringlc;

import java.util.*;

public class Stringtc 
 {
    private final static List<List<String>> listacomb = new ArrayList<>();
    public static void mostrarcombs(String palavra, int r) {

        Queue<List<String>> paths = new LinkedList<>();

       
        for (String i : palavra.split("")) {
            List<String> list = new LinkedList<>();
            list.add(i);
            paths.add(list);
            list = null;
        }

        while (!paths.isEmpty()) {

            List<String> path = paths.remove();

            for (String i : palavra.split("")) {
                if (!path.contains(i)) {
                    if (path.size() == r) {
                        listacomb.add(path);
                        continue;
                    }
                    List<String> newPath = new LinkedList<>(path);
                    newPath.add(i);
                    paths.add(newPath);
                    newPath = null;
                }
            }
        }
    }

    public static void main(String[] args) {

        String palavra = "raios";
        int r = 3;

        mostrarcombs(palavra, r);

        System.out.println("\n Todas as combinações são: ");
        for (List<String> palavraEle : listacomb) {
            System.out.println(palavraEle);
        }
    }
}