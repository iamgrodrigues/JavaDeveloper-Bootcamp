package one.digitalinovation.map.teste;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise {

    public static void main(String[] args) {

        LinkedHashMap<String, String> brazilianStates = new LinkedHashMap<>();

        brazilianStates.put("AC", "Acre");
        brazilianStates.put("AL", "Alagoas");
        brazilianStates.put("AP", "Amapá");
        brazilianStates.put("AM", "Amazonas");
        brazilianStates.put("BA", "Bahia");
        brazilianStates.put("CE", "Ceará");
        brazilianStates.put("ES", "Espírito Santo");
        brazilianStates.put("GO", "Goiás");
        brazilianStates.put("MA", "Maranhão");
        brazilianStates.put("MT", "Mato Grosso");
        brazilianStates.put("MS", "Mato Grosso do Sul");
        brazilianStates.put("MG", "Minas Gerais");
        brazilianStates.put("PA", "Pará");
        brazilianStates.put("PB", "Paraíba");
        brazilianStates.put("PR", "Paraná");
        brazilianStates.put("PE", "Pernambuco");
        brazilianStates.put("PI", "Piauí");
        brazilianStates.put("RJ", "Rio de Janeiro");
        brazilianStates.put("RN", "Rio Grande do Norte");
        brazilianStates.put("RS", "Rio Grande do Sul");
        brazilianStates.put("RO", "Rondônia");
        brazilianStates.put("RR", "Roraima");
        brazilianStates.put("SC", "Santa Catarina");
        brazilianStates.put("SP", "São Paulo");
        brazilianStates.put("SE", "Sergipe");
        brazilianStates.put("TO", "Tocantins");

        System.out.println(brazilianStates);

        brazilianStates.remove("MG");

        System.out.println(brazilianStates);

        brazilianStates.put("DF", "Distrito Federal");

        System.out.println("How many states does Brazil have? " + brazilianStates.size());

        brazilianStates.values().remove("Mato Grosso do Sul");

        System.out.println(brazilianStates);

        for (Map.Entry<String, String> entry : brazilianStates.entrySet()) {

            System.out.println(entry.getValue() + " - " + entry.getKey());
        }

        System.out.println("Is the Santa Catarina state in the LinkedHashMap? " + brazilianStates.containsKey("SC"));

        System.out.println("Is the Maranhão state in the LinkedHashMap? " + brazilianStates.containsValue("Maranhão"));

    }
}
