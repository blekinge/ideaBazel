package dk.statsbiblioteket.bazel;

import com.intellij.lang.Language;

public class BazelLanguage extends Language {
    public static final BazelLanguage INSTANCE = new BazelLanguage();

    private BazelLanguage() {
        super("Bazel");
    }
}