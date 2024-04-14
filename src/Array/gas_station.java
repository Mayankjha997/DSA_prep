package Array;

public class gas_station {

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int total_gas = 0;
        int total_cost = 0;
        int start_station = 0;
        int n = gas.length;
        int tank = 0;
        for(int i = 0; i < n ; i++)
        {
            total_gas+=gas[i];
            total_cost+=cost[i];
            tank+= gas[i] - cost[i];
            if(tank < 0)
            {
                start_station = i + 1;
                tank =0;
            }
        }
        if(total_gas < total_cost)
        {
            return -1;
        }
        else
            return start_station;

    }

    public static void main(String[] args) {

        int[] gas1 = {1, 2, 3, 4, 5};
        int[] cost1 = {3, 4, 5, 1, 2};
        System.out.println(canCompleteCircuit(gas1,cost1)); // Output: 3
    }
}

