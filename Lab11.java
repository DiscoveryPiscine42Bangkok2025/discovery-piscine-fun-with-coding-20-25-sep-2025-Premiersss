class Lab11 {

    public static void q2_toi0_68_02_024(int[] leap_distances, int[] track, int dist) {
        String[] animals = {"Rabbit", "Monkey", "Frog"};
        int[] scores = new int[animals.length];

        for (int i = 0; i < animals.length; i++) {
            int current_position = 0;
            int current_score = 0;
            while (current_position <= dist) {
                current_score += track[current_position];
                current_position += leap_distances[i];
            }
            scores[i] = current_score;
        }

    }
}