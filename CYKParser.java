import java.util.*;

public class CYKParser {
    static Set<String>[][] table;

    public static void main(String[] args) {
        // Grammar dalam bentuk CNF
        Map<String, List<String>> grammar = new HashMap<>();
        grammar.put("S", Arrays.asList("AB", "BC"));
        grammar.put("A", Arrays.asList("BA", "a"));
        grammar.put("B", Arrays.asList("CC", "b"));
        grammar.put("C", Arrays.asList("AB", "a"));

        // Input string
        String input = "baaba";
        boolean accepted = cyk(input, grammar);
        
        System.out.println("Input string: " + input);
        System.out.println("Accepted by grammar: " + (accepted ? "YES" : "NO"));
    }

    public static boolean cyk(String w, Map<String, List<String>> grammar) {
        int n = w.length();
        table = new HashSet[n][n];

        // Inisialisasi tabel
        for (int i = 0; i < n; i++) {
            table[i][i] = new HashSet<>();
            String terminal = String.valueOf(w.charAt(i));
            for (Map.Entry<String, List<String>> entry : grammar.entrySet()) {
                if (entry.getValue().contains(terminal)) {
                    table[i][i].add(entry.getKey());
                }
            }
        }

        // Algoritma CYK
        for (int l = 2; l <= n; l++) { // panjang substring
            for (int i = 0; i <= n - l; i++) {
                int j = i + l - 1;
                table[i][j] = new HashSet<>();
                for (int k = i; k < j; k++) {
                    for (String b : table[i][k]) {
                        for (String c : table[k + 1][j]) {
                            String combination = b + c;
                            for (Map.Entry<String, List<String>> entry : grammar.entrySet()) {
                                if (entry.getValue().contains(combination)) {
                                    table[i][j].add(entry.getKey());
                                }
                            }
                        }
                    }
                }
            }
        }

        return table[0][n - 1].contains("S");
    }
}
