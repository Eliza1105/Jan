package Patterns;

import java.util.*;

public class EulerGraphs {
      /*  static class Graph {
            private int V;
            private LinkedList<Integer> adj[];

            Graph(int v) {
                V = v;
                adj = new LinkedList[v];
                for (int i = 0; i < v; ++i)
                    adj[i] = new LinkedList();
            }

            void addEdge(int v, int w) {
                adj[v].add(w);
                adj[w].add(v);
            }

            int countDegrees(int v) {
                return adj[v].size();
            }

            void DFSUtil(int v, boolean visited[]) {
                visited[v] = true;

                for (Integer n : adj[v]) {
                    if (!visited[n]) {
                        DFSUtil(n, visited);
                    }
                }
            }

            boolean isConnected() {
                boolean visited[] = new boolean[V];
                int i;
                for (i = 0; i < V; i++) {
                    if (!adj[i].isEmpty())
                        break;
                }

                if (i == V)
                    return true;

                DFSUtil(i, visited);

                for (i = 0; i < V; i++) {
                    if (!visited[i] && adj[i].size() > 0) {
                        return false;
                    }
                }

                return true;
            }

            int isEulerian() {
                if (!isConnected()) {
                    return 0;
                }

                int odd = 0;
                for (int i = 0; i < V; i++) {
                    if (countDegrees(i) % 2 != 0) {
                        odd++;
                    }
                }

                if (odd > 2) {
                    return 0;
                }

                return (odd == 0) ? 2 : 1;
            }

            public static void main(String[] args) {
                Graph g = new Graph(4);
                g.addEdge(0, 1);
                g.addEdge(0, 2);
                g.addEdge(0, 3);
                g.addEdge(0, 1);
                g.addEdge(0, 3);

                g.addEdge(1, 2);

                g.addEdge(2, 3);

                int res = g.isEulerian();
                if (res == 0) {
                    System.out.println("Граф не является эйлеровым");
                } else if (res == 1) {
                    System.out.println("Граф имеет эйлеров цикл");
                } else {
                    System.out.println("Граф имеет эйлеров путь");
                }
            }
        }
    }
*/

    public static void main(String[] args) {
            Map<String, List<String>> graph = new HashMap<>();
            graph.put("0", new ArrayList<>());
           // graph.get("0").add("1");
        graph.get("0").add("1");
            graph.get("0").add("2");
            graph.get("0").add("3");
        graph.get("0").add("3");

            graph.put("1", new ArrayList<>());
            graph.get("1").add("2");

            graph.put("2", new ArrayList<>());
            graph.get("2").add("3");

            boolean hasEulerianPath = hasEulerianPath(graph);
            System.out.println("Has Eulerian Path: " + hasEulerianPath);
        }

        public static boolean hasEulerianPath(Map<String, List<String>> graph) {
            int oddDegreeCount = 0;
            for (List<String> neighbors : graph.values()) {
                if (neighbors.size() % 2 != 0) {
                    oddDegreeCount++;
                }
            }
            return oddDegreeCount == 0 || oddDegreeCount == 2;
        }
}


