/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMComdat = "LLVMComdat".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    EnumConstant(
        "AnyComdatSelectionKind".enum("0"),
        "ExactMatchComdatSelectionKind".enum,
        "LargestComdatSelectionKind".enum,
        "NoDeduplicateComdatSelectionKind".enum,
        "SameSizeComdatSelectionKind".enum
    )

    LLVMComdatRef(
        "GetOrInsertComdat",

        LLVMModuleRef("M"),
        charUTF8.const.p("Name")
    )

    LLVMComdatRef(
        "GetComdat",

        LLVMValueRef("V")
    )

    void(
        "SetComdat",

        LLVMValueRef("V"),
        LLVMComdatRef("C")
    )

    LLVMComdatSelectionKind(
        "GetComdatSelectionKind",

        LLVMComdatRef("C")
    )

    void(
        "SetComdatSelectionKind",

        LLVMComdatRef("C"),
        LLVMComdatSelectionKind("Kind")
    )
}