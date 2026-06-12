package exam;

public class Student {
    private String name;
    private int score;

    public Student(String name) {
        this.name = name;
    }

    public void setScore(int score) throws ScoreException {
        if(score < 0 || score > 100) {
            throw new ScoreException("점수는 0~100 사이여야 합니다. 입력값: " + score);
        }
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}