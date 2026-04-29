package com.graph.example;

class CityFlightGraph {

    String[] cities;      // Store city names (New York, Chicago, etc.)
    int[][] adj;          // Stores destination indices
    int[][] price;        // Stores ticket price
    int[] sizes;          // Tracks number of connections per city
    int vertices;

    // Constructor
    CityFlightGraph(int v, int maxEdges) {
        vertices = v;
        cities = new String[v];
        adj = new int[v][maxEdges];
        price = new int[v][maxEdges];
        sizes = new int[v];
    }

    // ================= ADD CITY =================
    // Assign city name to index
    void addCity(int index, String name) {
        cities[index] = name;
    }

    // ================= GET INDEX =================
    // Convert city name → index
    int getIndex(String city) {
        for (int i = 0; i < vertices; i++) {
            if (cities[i].equals(city)) {
                return i;
            }
        }
        return -1; // not found
    }

    // ================= ADD FLIGHT =================
    // Directed graph (one-way flight)
    void addFlight(String from, String to, int cost) {
        int u = getIndex(from);
        int v = getIndex(to);
        
        if(u==-1 || v==-1) {
        	System.out.println("City not present");
        }else {
        	// store destination and price
            adj[u][sizes[u]] = v;
            price[u][sizes[u]] = cost;
            sizes[u]++;	
            System.out.println(from+" connected to "+to+" with price "+cost);
        }
        
    }

    // ================= PRINT GRAPH =================
    void printGraph() {
        System.out.println("\n✈️ Flight Network:");
        for (int i = 0; i < vertices; i++) {
            System.out.print(cities[i] + " -> ");

            for (int j = 0; j < sizes[i]; j++) {
                System.out.print("(" + cities[adj[i][j]] + ", $" + price[i][j] + ") ");
            }
            System.out.println();
        }
    }

    // ================= BFS =================
    // Find minimum number of stops (not price)
    void minStops(String startCity) {

        int start = getIndex(startCity);

        boolean[] visited = new boolean[vertices];
        int[] stops = new int[vertices];
        int[] queue = new int[vertices];

        int front = 0, rear = 0;

        visited[start] = true;
        queue[rear++] = start;

        while (front < rear) {

            int node = queue[front++];

            for (int i = 0; i < sizes[node]; i++) {

                int next = adj[node][i];

                if (!visited[next]) {
                    visited[next] = true;

                    // number of stops increases by 1
                    stops[next] = stops[node] + 1;

                    queue[rear++] = next;
                }
            }
        }

        System.out.println("\n🛫 Minimum Stops from " + startCity);
        for (int i = 0; i < vertices; i++) {
            System.out.println("To " + cities[i] + " = " + stops[i]);
        }
    }

    // ================= DFS =================
    // Explore all possible routes
    void dfs(int node, boolean[] visited) {

        visited[node] = true;
        System.out.print(cities[node] + " ");

        for (int i = 0; i < sizes[node]; i++) {
            int next = adj[node][i];

            if (!visited[next]) {
                dfs(next, visited);
            }
        }
    }

    void exploreRoutes(String startCity) {
        boolean[] visited = new boolean[vertices];

        System.out.print("\n🌍 DFS Exploration: ");
        dfs(getIndex(startCity), visited);
    }

    // ================= CONNECTED COMPONENT =================
    // Find disconnected city groups
    void findGroups() {

        boolean[] visited = new boolean[vertices];
        int count = 0;

        for (int i = 0; i < vertices; i++) {

            if (!visited[i]) {
                count++;

                System.out.print("\nGroup " + count + ": ");
                dfs(i, visited);
            }
        }

        System.out.println("\nTotal Groups: " + count);
    }

    // ================= CYCLE DETECTION =================
    // Detect round-trip loops
    boolean detectCycleUtil(int node, boolean[] visited, boolean[] recStack) {

        visited[node] = true;
        recStack[node] = true;

        for (int i = 0; i < sizes[node]; i++) {

            int next = adj[node][i];

            // if not visited → go deeper
            if (!visited[next] && detectCycleUtil(next, visited, recStack)) {
                return true;
            }
            // if already in recursion stack → cycle
            else if (recStack[next]) {
                return true;
            }
        }

        recStack[node] = false;
        return false;
    }

    boolean hasCycle() {

        boolean[] visited = new boolean[vertices];
        boolean[] recStack = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (detectCycleUtil(i, visited, recStack)) {
                return true;
            }
        }
        return false;
    }
}

class CityFlightApp {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    CityFlightGraph g = new CityFlightGraph(6, 5);
        // Add Cities
        g.addCity(0, "New York");
        g.addCity(1, "Los Angeles");
        g.addCity(2, "Chicago");
        g.addCity(3, "Dallas");
        g.addCity(4, "Atlanta");
        g.addCity(5, "Seattle");
        
        // Add Flights (Directed + Price)
        	g.addFlight("New York", "Los Angeles", 300);	// uni-diectional 
        g.addFlight("A", "Los Angeles", 300);
        	g.addFlight("New York", "Chicago", 150);
        g.addFlight("Chicago", "Dallas", 120);
        g.addFlight("Dallas", "Atlanta", 100);
        g.addFlight("Atlanta", "Los Angeles", 180);
        g.addFlight("Los Angeles", "Seattle", 200);
        g.addFlight("Seattle", "New York", 350); // cycle

        
        g.printGraph();
        
        g.minStops("New York");       	// BFS
	
        g.exploreRoutes("New York");  // DFS
        g.findGroups();               // Components
        
        System.out.println("\n Cycle Exists: " + g.hasCycle());
	}

}

