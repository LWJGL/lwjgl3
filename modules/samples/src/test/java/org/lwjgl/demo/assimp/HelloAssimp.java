/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.assimp;

import org.lwjgl.assimp.*;

import java.util.*;

import static org.lwjgl.assimp.Assimp.*;

public final class HelloAssimp {

    private HelloAssimp() {
    }

    public static void main(String[] args) {
        System.out.println(aiGetLegalString());
        System.out.println("aiGetVersionMajor() = " + aiGetVersionMajor());
        System.out.println("aiGetVersionMinor() = " + aiGetVersionMinor());
        System.out.println("aiGetVersionRevision() = " + aiGetVersionRevision());
        System.out.println("aiGetCompileFlags() = " + aiGetCompileFlags());

        long c = aiGetImportFormatCount();
        System.out.println("\nImport formats:");

        for (int i = 0; i < c; i++) {
            AIImporterDesc desc = Objects.requireNonNull(aiGetImportFormatDescription(i));
            System.out.println("\t" + (i + 1) + ". " + desc.mNameString() + " (" + desc.mFileExtensionsString() + ")");
        }

        c = aiGetExportFormatCount();
        System.out.println("\nExport formats:");

        for (int i = 0; i < c; i++) {
            AIExportFormatDesc desc = Objects.requireNonNull(aiGetExportFormatDescription(i));
            System.out.println("\t" + (i + 1) + ". " + desc.descriptionString() + " (" + desc.fileExtensionString() + ")");
        }
    }

}