/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMError = "LLVMError".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    IntConstant("ErrorSuccess".."0")

    LLVMErrorTypeId(
        "GetErrorTypeId",

        LLVMErrorRef("Err")
    )

    void(
        "ConsumeError",

        LLVMErrorRef("Err")
    )

    IgnoreMissing..void(
        "CantFail",

        LLVMErrorRef("Err")
    )

    MustBeDisposed..charUTF8.p(
        "GetErrorMessage",

        LLVMErrorRef("Err")
    )

    void(
        "DisposeErrorMessage",

        Unsafe..char.p("ErrMsg")
    )

    LLVMErrorTypeId(
        "GetStringErrorTypeId",

        void()
    )

    IgnoreMissing..LLVMErrorRef(
        "CreateStringError",

        charUTF8.const.p("ErrMsg")
    )
}