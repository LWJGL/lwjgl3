/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package cuda.templates

import cuda.*
import org.lwjgl.generator.*

val CU55 = "CU55".nativeClass(Module.CUDA, prefix = "CU", binding = NVCUDA_BINDING_DELEGATE) {
    javaImport("static org.lwjgl.cuda.CUDA.*")
    extends = CU50
    documentation = "Contains bindings to <a href=\"https://docs.nvidia.com/cuda/cuda-driver-api/index.html\">CUDA Driver API</a>."

    EnumConstant(
        "Device code formats. ({@code CUjitInputType})",

        "JIT_INPUT_CUBIN".enum(
            """
            Compiled device-class-specific device code

            Applicable options: none
            """,
            "0"
        ),

        "JIT_INPUT_PTX".enum(
            """
            PTX source code.

            Applicable options: PTX compiler options
            """
        ),

        "JIT_INPUT_FATBINARY".enum(
            """
            Bundle of multiple cubins and/or PTX of some device code.

            Applicable options: PTX compiler options, #JIT_FALLBACK_STRATEGY
            """
        ),

        "JIT_INPUT_OBJECT".enum(
            """
            Host object with embedded device code.

            Applicable options: PTX compiler options, #JIT_FALLBACK_STRATEGY
            """
        ),

        "JIT_INPUT_LIBRARY".enum(
            """
            Archive of host objects with embedded device code.

            Applicable options: PTX compiler options, #JIT_FALLBACK_STRATEGY
            """
        )
    )

    CUresult(
        "LinkCreate",
        "",

        AutoSize("options", "optionValues")..unsigned_int.IN("numOptions", ""),
        nullable..CUjit_option.p.IN("options", ""),
        nullable..void.p.p.IN("optionValues", ""),
        Check(1)..CUlinkState.p.OUT("stateOut", "")
    ).versioned()

    CUresult(
        "LinkAddData",
        "",

        CUlinkState.IN("state", ""),
        CUjitInputType.IN("type", ""),
        void.p.IN("data", ""),
        AutoSize("data")..size_t.IN("size", ""),
        charASCII.const.p.IN("name", ""),
        AutoSize("options", "optionValues")..unsigned_int.IN("numOptions", ""),
        nullable..CUjit_option.p.IN("options", ""),
        nullable..void.p.p.IN("optionValues", "")
    ).versioned()

    CUresult(
        "LinkAddFile",
        "",

        CUlinkState.IN("state", ""),
        CUjitInputType.IN("type", ""),
        charASCII.const.p.IN("path", ""),
        AutoSize("options", "optionValues")..unsigned_int.IN("numOptions", ""),
        nullable..CUjit_option.p.IN("options", ""),
        nullable..void.p.p.IN("optionValues", "")
    ).versioned()

    CUresult(
        "LinkComplete",
        "",

        CUlinkState.IN("state", ""),
        Check(1)..void.p.p.OUT("cubinOut", ""),
        Check(1)..size_t.p.OUT("sizeOut", "")
    )

    CUresult(
        "LinkDestroy",
        "",

        CUlinkState.IN("state", "")
    )
}