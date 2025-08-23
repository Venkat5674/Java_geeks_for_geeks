import java.util.*;

public class FlightItinerary {
    
    public static List<String> findItinerary(List<List<String>> tickets) {
        // Map to store adjacency list (from -> min-heap of destinations)
        Map<String, PriorityQueue<String>> graph = new HashMap<>();

        // Build the graph
        for (List<String> ticket : tickets) {
            String from = ticket.get(0);
            String to = ticket.get(1);
            graph.computeIfAbsent(from, k -> new PriorityQueue<>()).add(to);
        }

        // Result list
        LinkedList<String> result = new LinkedList<>();

        // Start DFS from JFK
        dfs("JFK", graph, result);

        return result;
    }

    private static void dfs(String airport, Map<String, PriorityQueue<String>> graph, LinkedList<String> result) {
        PriorityQueue<String> nextAirports = graph.get(airport);
        while (nextAirports != null && !nextAirports.isEmpty()) {
            String next = nextAirports.poll(); // get smallest lexicographically
            dfs(next, graph, result);
        }
        // Add at the beginning when no more outgoing edges
        result.addFirst(airport);
    }

    public static void main(String[] args) {
        // Example 1
        List<List<String>> tickets1 = new ArrayList<>();
        tickets1.add(Arrays.asList("JFK", "LAX"));
        tickets1.add(Arrays.asList("LAX", "SFO"));
        tickets1.add(Arrays.asList("SFO", "JFK"));
        System.out.println(findItinerary(tickets1));

        // Example 2
        List<List<String>> tickets2 = new ArrayList<>();
        tickets2.add(Arrays.asList("JFK", "SFO"));
        tickets2.add(Arrays.asList("JFK", "ATL"));
        tickets2.add(Arrays.asList("SFO", "ATL"));
        tickets2.add(Arrays.asList("ATL", "JFK"));
        tickets2.add(Arrays.asList("ATL", "SFO"));
        System.out.println(findItinerary(tickets2));
    }
}
