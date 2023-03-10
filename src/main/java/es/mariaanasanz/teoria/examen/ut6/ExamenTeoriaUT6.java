package es.mariaanasanz.teoria.examen.ut6;

import org.junit.Test;

import java.util.*;
import java.util.Map.Entry;

public class ExamenTeoriaUT6 {

    @Test
    public void ejercicio1(){
        ArrayList<String> saludos = new ArrayList<>();
        saludos.add("hola");
        saludos.add("aupa");
        saludos.add("que tal");
        saludos.add("como te va");
        System.out.println("1-c) "+saludos.get(saludos.size()-2));
    }

    @Test
    public void ejercicio2(){
        ArrayList<String> saludos = new ArrayList<>();
        saludos.add("hola");
        saludos.add("aupa");
        saludos.add(1,"que tal");
        saludos.add(1, "como te va");
        System.out.println("2-c) "+saludos.get(saludos.size()-2));
    }

    @Test
    public void ejercicio3(){
        ArrayList<String> saludos = new ArrayList<>();
        saludos.add("hola");
        saludos.add("aupa");
        saludos.add("que tal");
        saludos.add("como te va");
        saludos.remove(saludos.size()-2);
        System.out.println("3-c) "+saludos.toString());
    }

    @Test
    public void ejercicio4(){
        ArrayList<String> saludos = new ArrayList<>();
        saludos.add("hola");
        saludos.add("aupa");
        saludos.add("que tal");
        saludos.add("como te va");
        saludos.remove(saludos.indexOf("aupa")+1);
        saludos.add(2, "que tal");
        System.out.println("4-d) "+saludos.toString());
    }

    @Test
    public void ejercicio5(){
        ArrayList<String> saludos = new ArrayList<>();
        saludos.add("hola");
        saludos.add("aupa");
        saludos.add("que tal");
        saludos.add("como te va");
        Iterator iterator = saludos.iterator();
        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
            iterator.next();
        }
        System.out.println("5-d) "+saludos.toString());
    }

    @Test
    public void ejercicio6(){
        String profesion = null;
        LinkedHashMap<String, Integer> ingresos;
        ingresos = new LinkedHashMap<>();
        ingresos.put("Informatico",2500);
        ingresos.put("Profesor",1500);
        ingresos.put("Astronauta",5000);
        ingresos.put("Electricista",2000);
        for(int i=0; i<ingresos.size(); i++){
            profesion = ingresos.keySet().iterator().next();
        }
        System.out.println("6-a) "+profesion);
    }

    @Test
    public void ejercicio7(){
        String profesion = null;
        int salario = 0;
        LinkedHashMap<String, Integer> ingresos;
        ingresos = new LinkedHashMap<>();
        ingresos.put("Informatico",2500);
        ingresos.put("Profesor",1500);
        ingresos.put("Astronauta",5000);
        ingresos.put("Electricista",2000);
        for(int i=0; i<ingresos.size(); i++){
            profesion = ingresos.keySet().iterator().next();
            salario = salario + ingresos.values().iterator().next();
        }
        System.out.println("7-b) "+profesion+" - "+salario);
    }

    @Test
    public void ejercicio8(){
        LinkedHashMap<String, Integer> ingresos;
        ingresos = new LinkedHashMap<>();
        ingresos.put("Informatico",2500);
        ingresos.put("Profesor",1500);
        ingresos.put("Astronauta",5000);
        ingresos.put("Electricista",2000);
        Iterator<Entry<String, Integer>> iterator;
        iterator = ingresos.entrySet().iterator();
        while(iterator.hasNext()){
            if(iterator.next().getValue()<iterator.next().getValue()){
                iterator.remove();
            }
        }
        System.out.println("8-a) "+ingresos.toString());
    }

    @Test
    public void ejercicio9(){
        LinkedHashMap<String, Integer> ingresos;
        ingresos = new LinkedHashMap<>();
        ingresos.put("Informatico",2500);
        ingresos.put("Profesor",1500);
        ingresos.put("Astronauta",5000);
        ingresos.put("Electricista",2000);
        Iterator<Entry<String, Integer>> iterator;
        iterator = ingresos.entrySet().iterator();
        while(iterator.hasNext()){
            iterator.next().setValue(iterator.next().getValue());
        }
        System.out.println("9-d) "+ingresos.toString());
    }

    @Test
    public void ejercicio10(){
        LinkedHashMap<String, Integer> ingresos;
        ingresos = new LinkedHashMap<>();
        ingresos.put("Informatico",2500);
        ingresos.put("Profesor",1500);
        ingresos.put("Astronauta",5000);
        ingresos.put("Electricista",2000);
        Iterator<Entry<String, Integer>> iterator;
        iterator = ingresos.entrySet().iterator();
        while(iterator.hasNext()){
            ingresos.put(
                    iterator.next().getKey(),
                    iterator.next().getValue()
            );
        }
        System.out.println("10-d) "+ingresos.toString());
    }

    @Test
    public void ejercicio11(){
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(2);
        lista.add(3);
        lista.add(1);
        while (lista.remove(Integer.valueOf("3")));
        System.out.println("11-b) "+lista.toString());
    }

    @Test
    public void ejercicio12(){
        LinkedHashMap<String, Integer> ingresos;
        ingresos = new LinkedHashMap<>();
        ingresos.put("Informatico",2500);
        ingresos.put("Profesor",1500);
        ingresos.put("Astronauta",5000);
        ingresos.put("Electricista",2000);
        ArrayList<String> profesiones = new ArrayList<>();
        for (String key : ingresos.keySet()) {
            if (!(ingresos.get(key)>2000)){
                profesiones.add(key);
            }
        }
        System.out.println("12-c) "+profesiones.toString());
    }

    @Test
    public void ejercicio13(){
        ArrayList<String> saludos = new ArrayList<>();
        saludos.add("hola");
        saludos.add("que tal");
        saludos.add("como te va");
        TreeMap<Integer, String> ingresos;
        ingresos = new TreeMap<>();
        for (int i = 0; i < 3; i++) {
            int index = (int) (Math.random()*saludos.size());
            String saludo = saludos.get(index);
            saludos.remove(saludo);
            ingresos.put(saludo.length(), saludo);
        }
        System.out.println("13-a) "+ingresos.toString());
    }

    @Test
    public void ejercicio14(){
        HashMap<Character, Integer> tabla = new HashMap<>();
        String letras = "MDCLXVI";
        int[] numeros = {1000, 500, 100, 50, 10, 5, 1};
        for (int i = 0; i < letras.length(); i++) {
            tabla.put(letras.charAt(i), numeros[i]);
        }
        String ano = "MCIV";
        int num = 0;
        for (int i = 0; i < ano.length(); i++) {
            num = num + tabla.get(ano.charAt(i));
        }
        System.out.println("14-c) "+num);
    }

    @Test
    public void ejercicio15(){
        TreeSet<Integer> c1 = new TreeSet<>();
        HashSet<Integer> c2 = new HashSet<>();
        c1.addAll( Arrays.asList( 1, 11, 2, 3, 33 ) );
        c2.addAll( Arrays.asList( 1, 11, 2, 4, 33 ) );
        c1.retainAll(c2);
        System.out.println("15-c) "+c1);
    }
}