package day17.momento;

public class GameState {
    private int score;
    private int level;

    public void setState(int score, int level) {
        this.score = score;
        this.level = level;
        System.out.println("GameState updated: Score = " + score + ", Level = " + level);
    }

    public Momento save() {
        System.out.println("Saving game state...");
        return new Momento(score, level);
    }

   public void restore(Momento momento) {
        this.score = momento.getScore();
        this.level = momento.getLevel();

        System.out.println("GameState restored: Score = " + score + ", Level = " + level);
    }

    public static class Momento{
        private final int score;
        private final int level;

        public Momento(int score, int level) {
            this.score = score;
            this.level = level;
        }

        public int getScore() {
            return score;
        }

        public int getLevel() {
            return level;
        }
    }

}
