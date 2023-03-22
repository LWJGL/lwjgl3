/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package cuda.templates

import cuda.*
import org.lwjgl.generator.*

val NVRTC = "NVRTC".nativeClass(Module.CUDA, prefix = "NVRTC", binding = NVRTC_BINDING) {
    documentation =
        "Contains bindings to <a href=\"https://docs.nvidia.com/cuda/nvrtc/index.html\">NVRTC</a>, a runtime compilation library for CUDA C++."

    EnumConstant(
        "{@code nvrtcResult}",

        "SUCCESS".enum("", "0"),
        "ERROR_OUT_OF_MEMORY".enum,
        "ERROR_PROGRAM_CREATION_FAILURE".enum,
        "ERROR_INVALID_INPUT".enum,
        "ERROR_INVALID_PROGRAM".enum,
        "ERROR_INVALID_OPTION".enum,
        "ERROR_COMPILATION".enum,
        "ERROR_BUILTIN_OPERATION_FAILURE".enum,
        "ERROR_NO_NAME_EXPRESSIONS_AFTER_COMPILATION".enum,
        "ERROR_NO_LOWERED_NAMES_BEFORE_COMPILATION".enum,
        "ERROR_NAME_EXPRESSION_NOT_VALID".enum,
        "ERROR_INTERNAL_ERROR".enum,
        "ERROR_TIME_FILE_WRITE_FAILED".enum
    )

    charASCII.const.p(
        "GetErrorString",
        "",

        nvrtcResult("result", "")
    )

    nvrtcResult(
        "Version",
        "",

        Check(1)..int.p("major", ""),
        Check(1)..int.p("minor", "")
    )

    IgnoreMissing..nvrtcResult(
        "GetNumSupportedArchs",
        "",

        Check(1)..int.p("numArchs", "")
    )

    IgnoreMissing..nvrtcResult(
        "GetSupportedArchs",
        "",

        Unsafe..int.p("supportedArchs", "")
    )

    nvrtcResult(
        "CreateProgram",
        "",

        Check(1)..nvrtcProgram.p("prog", ""),
        charUTF8.const.p("src", ""),
        nullable..charUTF8.const.p("name", ""),
        AutoSize("headers", "includeNames")..int("numHeaders", ""),
        nullable..charUTF8.const.p.const.p("headers", ""),
        nullable..char.const.p.const.p("includeNames", "")
    )

    nvrtcResult(
        "DestroyProgram",
        "",

        Check(1)..nvrtcProgram.p("prog", "")
    )

    nvrtcResult(
        "CompileProgram",
        "",

        nvrtcProgram("prog", ""),
        AutoSize("options")..int("numOptions", ""),
        nullable..charASCII.const.p.const.p("options", "")
    )

    nvrtcResult(
        "GetPTXSize",
        "",

        nvrtcProgram("prog", ""),
        Check(1)..size_t.p("ptxSizeRet", "")
    )

    nvrtcResult(
        "GetPTX",
        "",

        nvrtcProgram("prog", ""),
        Unsafe..char.p("ptx", "")
    )

    IgnoreMissing..nvrtcResult(
        "GetCUBINSize",
        "",

        nvrtcProgram("prog", ""),
        Check(1)..size_t.p("cubinSizeRet", "")
    )

    IgnoreMissing..nvrtcResult(
        "GetCUBIN",
        "",

        nvrtcProgram("prog", ""),
        Unsafe..char.p("cubin", "")
    )

    IgnoreMissing..nvrtcResult(
        "GetNVVMSize",
        "",

        nvrtcProgram("prog", ""),
        Check(1)..size_t.p("nvvmSizeRet", ""),
    )

    IgnoreMissing..nvrtcResult(
        "GetNVVM",
        "",

        nvrtcProgram("prog", ""),
        Unsafe..char.p("nvvm", "")
    )

    IgnoreMissing..nvrtcResult(
        "GetLTOIRSize",
        "",

        nvrtcProgram("prog", ""),
        Check(1)..size_t.p("LTOIRSizeRet", "")
    )

    IgnoreMissing..nvrtcResult(
        "GetLTOIR",
        "",

        nvrtcProgram("prog", ""),
        Unsafe..char.p("LTOIR", "")
    )

    IgnoreMissing..nvrtcResult(
        "GetOptiXIRSize",
        "",

        nvrtcProgram("prog", ""),
        Check(1)..size_t.p("optixirSizeRet", "")
    )

    IgnoreMissing..nvrtcResult(
        "GetOptiXIR",
        "",

        nvrtcProgram("prog", ""),
        Unsafe..char.p("optixir", "")
    )

    nvrtcResult(
        "GetProgramLogSize",
        "",

        nvrtcProgram("prog", ""),
        Check(1)..size_t.p("logSizeRet", "")
    )

    nvrtcResult(
        "GetProgramLog",
        "",

        nvrtcProgram("prog", ""),
        Unsafe..char.p("log", "")
    )

    nvrtcResult(
        "AddNameExpression",
        "",

        nvrtcProgram("prog", ""),
        charUTF8.const.p.const("name_expression", ""),

        returnDoc = ""
    )

    nvrtcResult(
        "GetLoweredName",
        "",

        nvrtcProgram("prog", ""),
        charUTF8.const.p.const("name_expression", ""),
        Check(1)..charUTF8.const.p.p("lowered_name", "")
    )
}