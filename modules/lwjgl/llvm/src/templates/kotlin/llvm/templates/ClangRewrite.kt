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
    binding = CLANG_BINDING_DELEGATE
) {
    nativeImport("clang-c/Rewrite.h")
    IgnoreMissing..CXRewriter(
        "create",

        CXTranslationUnit("TU")
    )

    IgnoreMissing..void(
        "insertTextBefore",

        CXRewriter("Rew"),
        CXSourceLocation("Loc"),
        charUTF8.const.p("Insert")
    )

    IgnoreMissing..void(
        "replaceText",

        CXRewriter("Rew"),
        CXSourceRange("ToBeReplaced"),
        charUTF8.const.p("Replacement")
    )

    IgnoreMissing..void(
        "removeText",

        CXRewriter("Rew"),
        CXSourceRange("ToBeRemoved")
    )

    IgnoreMissing..intb(
        "overwriteChangedFiles",

        CXRewriter("Rew")
    )

    IgnoreMissing..void(
        "writeMainFileToStdOut",

        CXRewriter("Rew")
    )

    IgnoreMissing..void(
        "dispose",

        CXRewriter("Rew")
    )
}