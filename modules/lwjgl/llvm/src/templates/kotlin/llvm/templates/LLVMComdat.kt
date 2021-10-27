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
    documentation = ""

    EnumConstant(
        "{@code LLVMComdatSelectionKind}",

        "AnyComdatSelectionKind".enum("The linker may choose any COMDAT.", "0"),
        "ExactMatchComdatSelectionKind".enum("The data referenced by the COMDAT must be the same."),
        "LargestComdatSelectionKind".enum("The linker will choose the largest COMDAT."),
        "NoDeduplicateComdatSelectionKind".enum("No deduplication is performed."),
        "SameSizeComdatSelectionKind".enum("The data referenced by the COMDAT must be the same size.")
    )

    LLVMComdatRef(
        "GetOrInsertComdat",
        "Return the {@code Comdat} in the module with the specified name. It is created if it didn't already exist.",

        LLVMModuleRef("M", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMComdatRef(
        "GetComdat",
        "Get the Comdat assigned to the given global object.",

        LLVMValueRef("V", "")
    )

    void(
        "SetComdat",
        "Assign the Comdat to the given global object.",

        LLVMValueRef("V", ""),
        LLVMComdatRef("C", "")
    )

    LLVMComdatSelectionKind(
        "GetComdatSelectionKind",
        "Get the conflict resolution selection kind for the Comdat.",

        LLVMComdatRef("C", "")
    )

    void(
        "SetComdatSelectionKind",
        "Set the conflict resolution selection kind for the Comdat.",

        LLVMComdatRef("C", ""),
        LLVMComdatSelectionKind("Kind", "")
    )
}