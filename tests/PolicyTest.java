package io.portfolio;

public final class PolicyTest {
    public static void main(String[] args) {
        var signalcase_1 = new Policy.Signal(60, 96, 18, 7, 7);
        if (Policy.score(signalcase_1) != 130) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_1).equals("review")) throw new AssertionError("decision mismatch");
        var signalcase_2 = new Policy.Signal(65, 104, 24, 12, 13);
        if (Policy.score(signalcase_2) != 116) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_2).equals("review")) throw new AssertionError("decision mismatch");
        var signalcase_3 = new Policy.Signal(68, 88, 21, 20, 4);
        if (Policy.score(signalcase_3) != 68) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_3).equals("review")) throw new AssertionError("decision mismatch");
    }
}
