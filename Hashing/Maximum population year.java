
class Solution {
    public int maximumPopulation(int[][] logs) {

        int[] years = new int[101];

        for (int[] log : logs) {
            years[log[0] - 1950]++;
            years[log[1] - 1950]--;
        }

        int maxPopulation = 0;
        int population = 0;
        int answer = 1950;

        for (int i = 0; i < 101; i++) {
            population += years[i];

            if (population > maxPopulation) {
                maxPopulation = population;
                answer = 1950 + i;
            }
        }

        return answer;
    }
}
