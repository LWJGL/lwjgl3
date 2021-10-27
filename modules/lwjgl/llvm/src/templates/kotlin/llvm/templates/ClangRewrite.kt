/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val ClangRewrite = "ClangRewrite".nativeClass(
    Module.LLVM,
    prefixConstant = "CX",
    prefixMethod = "clang_CXRewriter_",
    binding = CLANG_BINDING
) {
    nativeImport("clang-c/Rewrite.h")
    documentation = "Requires Clang 12 or higher."

    IgnoreMissing..CXRewriter(
        "create",
        "Create {@code CXRewriter}.",

        CXTranslationUnit("TU", "")
    )

    IgnoreMissing..void(
        "insertTextBefore",
        "Insert the specified string at the specified location in the original buffer.",

        CXRewriter("Rew", ""),
        CXSourceLocation("Loc", ""),
        charUTF8.const.p("Insert", "")
    )

    IgnoreMissing..void(
        "replaceText",
        "Replace the specified range of characters in the input with the specified replacement.",

        CXRewriter("Rew", ""),
        CXSourceRange("ToBeReplaced", ""),
        charUTF8.const.p("Replacement", "")
    )

    IgnoreMissing..void(
        "removeText",
        "Remove the specified range.",

        CXRewriter("Rew", ""),
        CXSourceRange("ToBeRemoved", "")
    )

    IgnoreMissing..intb(
        "overwriteChangedFiles",
        "Save all changed files to disk.",

        CXRewriter("Rew", ""),

        returnDoc = "1 if any files were not saved successfully, returns 0 otherwise"
    )

    IgnoreMissing..void(
        "writeMainFileToStdOut",
        "Write out rewritten version of the main file to {@code stdout}.",

        CXRewriter("Rew", "")
    )

    IgnoreMissing..void(
        "dispose",
        "Free the given {@code CXRewriter}.",

        CXRewriter("Rew", "")
    )
}