package dk.statsbiblioteket.bazel.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import dk.statsbiblioteket.bazel.BazelFileType;
import dk.statsbiblioteket.bazel.BazelLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class BazelFile extends PsiFileBase {
    public BazelFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, BazelLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return BazelFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Bazel File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}