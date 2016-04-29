package dk.statsbiblioteket.bazel;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class BazelFileType extends LanguageFileType {
    public static final BazelFileType INSTANCE = new BazelFileType();

    private BazelFileType() {
        super(BazelLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Bazel file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Bazel BUILD file";
    }

    @NotNull
    @Override
    //TODO Bazel files are BUILD and WORKSPACE, no extension...
    public String getDefaultExtension() {
        return "BUILD";
    }

    //TODO file charset


    @Nullable
    @Override
    public Icon getIcon() {
        return BazelIcons.FILE;
    }
}