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
    binding = LLVM_BINDING_DELEGATE,
    library = LLVM_LIBRARY
) {
    documentation = ""

    IntConstant("", "ErrorSuccess".."0")

    LLVMErrorTypeId(
        "GetErrorTypeId",
        "Returns the type id for the given error instance, which must be a failure value (i.e. non-null).",

        LLVMErrorRef("Err", "")
    )

    void(
        "ConsumeError",
        """
        Dispose of the given error without handling it.

        This operation consumes the error, and the given {@code LLVMErrorRef} value is not usable once this call returns. Note: This method <b>only</b> needs
        to be called if the error is not being passed to some other consuming operation, e.g. #GetErrorMessage().
        """,

        LLVMErrorRef("Err", "")
    )

    // TODO: make this return memByteBufferNT1. NullTerminated function modifier?
    charUTF8.p(
        "GetErrorMessage",
        """
        Returns the given string's error message.

        This operation consumes the error, and the given {@code LLVMErrorRef} value is not usable once this call returns. The caller is responsible for
        disposing of the string by calling #DisposeErrorMessage().
        """,

        LLVMErrorRef("Err", "")
    )

    void(
        "DisposeErrorMessage",
        "Dispose of the given error message.",

        Unsafe..char.p("ErrMsg", "")
    )

    LLVMErrorTypeId(
        "GetStringErrorTypeId",
        "Returns the type id for llvm {@code StringError}.",

        void()
    )
}