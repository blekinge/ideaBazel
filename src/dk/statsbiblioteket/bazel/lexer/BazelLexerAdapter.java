package dk.statsbiblioteket.bazel.lexer;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class BazelLexerAdapter extends FlexAdapter {
    public BazelLexerAdapter() {
        super(new BazelLexer((Reader) null));
    }
}