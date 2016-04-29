package dk.statsbiblioteket.bazel;

import com.intellij.openapi.fileTypes.ExactFileNameMatcher;
import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.model.fileTypes.FileNameMatcherFactory;

public class BazelFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(BazelFileType.INSTANCE, "BUILD");
        fileTypeConsumer.consume(BazelFileType.INSTANCE, new ExactFileNameMatcher("BUILD",false));
    }
}