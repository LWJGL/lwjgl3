/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMLinker = "LLVMLinker".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    documentation = ""

    EnumConstant(
        """
        This enum is provided for backwards-compatibility only. It has no effect.

        ({@code LLVMLinkerMode})
        """,

        "LinkerDestroySource".enum("This is the default behavior.", "0"),
        "LinkerPreserveSource_Removed".enum("This option has been deprecated and should not be used.")
    )

    LLVMBool(
        "LinkModules2",
        """
        Links the source module into the destination module.

        The source module is destroyed. The return value is true if an error occurred, false otherwise. Use the diagnostic handler to get any diagnostic
        message.
        """,

        LLVMModuleRef("Dest", ""),
        LLVMModuleRef("Src", "")
    )
}