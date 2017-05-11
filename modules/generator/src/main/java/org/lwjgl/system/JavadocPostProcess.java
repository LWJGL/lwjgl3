/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;

/**
 * Processes the "Field Summary" section of Javadoc-generated HTML files, to group contiguous fields having the same
 * Javadoc comment.
 */
public final class JavadocPostProcess {

    private JavadocPostProcess() {
    }

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            throw new IllegalArgumentException("Root directory not specified.");
        }

        Path root = Paths.get(args[0]);
        if (!Files.isDirectory(root)) {
            throw new IllegalArgumentException("Invalid root directory specified.");
        }

        process(root);
    }

    private static void process(Path root) {
        try {
            int count = Files
                .find(root, 1, (path, basicFileAttributes) -> Files.isRegularFile(path) && path.toString().endsWith(".html"))
                .mapToInt(path -> {
                    try {
                        String html = new String(Files.readAllBytes(path), "UTF-8");

                        String processed = BlockListPostProcess.process(FieldSummaryPostProcess.process(html));
                        if (processed != html) {
                            try (Writer w = Files.newBufferedWriter(path, Charset.forName("UTF-8"))) {
                                w.write(processed);
                            }
                            return 1;
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    return 0;
                })
                .sum();

            if (count != 0) {
                System.out.println("PROCESSED: " + root + " (" + count + " files)");
            }

            Files
                .find(root, 1, (path, basicFileAttributes) -> path != root && Files.isDirectory(path))
                .forEach(JavadocPostProcess::process);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}