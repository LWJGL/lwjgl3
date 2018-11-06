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

        AutoSize("options", "optionValues")..unsigned_int("numOptions", ""),
        nullable..CUjit_option.p("options", ""),
        nullable..void.p.p("optionValues", ""),
        Check(1)..CUlinkState.p("stateOut", "")
    ).versioned()

    CUresult(
        "LinkAddData",
        "",

        CUlinkState("state", ""),
        CUjitInputType("type", ""),
        void.p("data", ""),
        AutoSize("data")..size_t("size", ""),
        charASCII.const.p("name", ""),
        AutoSize("options", "optionValues")..unsigned_int("numOptions", ""),
        nullable..CUjit_option.p("options", ""),
        nullable..void.p.p("optionValues", "")
    ).versioned()

    CUresult(
        "LinkAddFile",
        "",

        CUlinkState("state", ""),
        CUjitInputType("type", ""),
        charASCII.const.p("path", ""),
        AutoSize("options", "optionValues")..unsigned_int("numOptions", ""),
        nullable..CUjit_option.p("options", ""),
        nullable..void.p.p("optionValues", "")
    ).versioned()

    CUresult(
        "LinkComplete",
        "",

        CUlinkState("state", ""),
        Check(1)..void.p.p("cubinOut", ""),
        Check(1)..size_t.p("sizeOut", "")
    )

    CUresult(
        "LinkDestroy",
        "",

        CUlinkState("state", "")
    )
}