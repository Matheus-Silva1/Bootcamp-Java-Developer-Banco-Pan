package edu.mps.map.exemplomap;

import java.util.*;

/*Dados os modelos dos carros e seus respectivos consumos na
estrada, faça:

Modelo = Gol - Consumo = 14,4 km/l
Modelo = Uno - Consumo = 15,6 km/l
Modelo = Mobi - Consumo = 16,1 km/l
Modelo = HB20 - Consumo = 14,5 km/l
Modelo = Kwid - Consumo = 15,6 km/l*/
public class ExemploMap {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione" +
        " o modelo e seus respectivos consumos: ");

        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};

        System.out.println(carrosPopulares);

        System.out.println("\nSubstitua o consumo do gol por 15,2: ");
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.print("\nConfira se o modelo Tucson está no dicionário: ");
        System.out.println(carrosPopulares.containsKey("Tucson"));

        System.out.print("\nExiba o consumo do Uno: ");
        System.out.println(carrosPopulares.get("Uno"));

        System.out.print("\nExiba o terceiro modelo adicionado: \n");
        //Map não possui método para mostrar a posição das chaves e
        // valores

        System.out.print("\nExiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.print("\nExiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.print("\nExiba o modelo mais econômico: ");
        Double consumoMaisEficiente = Collections.max(
        carrosPopulares.values());

        //System.out.println(consumoMaisEficiente);

        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();

        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry: entries) {
            if(entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();

                System.out.println("\nModelo mais eficiente: " +
                modeloMaisEficiente + " - " + consumoMaisEficiente + " km/l");
            }
        }

        System.out.println("\nExiba o modelo menos econômico: \n");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());

        Set<Map.Entry<String, Double>> entries1 = carrosPopulares.entrySet();

        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry1: entries1) {
            if(entry1.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry1.getKey();

                System.out.println("Modelo menos eficiente: " +
                modeloMenosEficiente + " - " + consumoMenosEficiente + " km/l");
            }
        }
        System.out.println("\nExiba a soma dos consumos: ");

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        double soma = 0d;

        while(iterator.hasNext()){
            double next = iterator.next();
            soma += next;
        }

        System.out.println("Soma dos Consumos: " + soma);

        System.out.print("\nExiba a média dos consumos desse" +
                " dicionário: ");

        double media = soma/carrosPopulares.size();

        System.out.println(media + " km/l");

        System.out.println("\nRemova os modelos com consumo igual a" +
                " 15,6 km/l: ");

        Iterator<Double> iterator1 = carrosPopulares.values().iterator();

        while(iterator1.hasNext()){

            if(iterator1.next().equals(15.6)){
                iterator1.remove();
            }
        }
        System.out.println(carrosPopulares);

        System.out.println("\nExiba todos os carros na ordem em que foram " +
        "informados: ");

        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};

        System.out.println("\nCarros Populares2" + carrosPopulares1);

        System.out.println("\nExiba o dicionário ordenado pelo modelo: ");

        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);

        System.out.println(carrosPopulares2);

        System.out.print("\nApague o dicionário de carros: ");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);

        System.out.print("Confira se o dicionário de carros " +
        "está vazio: ");

        System.out.println(carrosPopulares.isEmpty());
    }
}