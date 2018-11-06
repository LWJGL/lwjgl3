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
        """
        The enumerated type {@code nvrtcResult} defines API call result codes.
        
        NVRTC API functions return {@code nvrtcResult} to indicate the call result.
        """,
        
        "SUCCESS".."0",
        "ERROR_OUT_OF_MEMORY".."1",
        "ERROR_PROGRAM_CREATION_FAILURE".."2",
        "ERROR_INVALID_INPUT".."3",
        "ERROR_INVALID_PROGRAM".."4",
        "ERROR_INVALID_OPTION".."5",
        "ERROR_COMPILATION".."6",
        "ERROR_BUILTIN_OPERATION_FAILURE".."7",
        "ERROR_NO_NAME_EXPRESSIONS_AFTER_COMPILATION".."8",
        "ERROR_NO_LOWERED_NAMES_BEFORE_COMPILATION".."9",
        "ERROR_NAME_EXPRESSION_NOT_VALID".."10",
        "ERROR_INTERNAL_ERROR".."11"
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

    nvrtcResult(
        "CreateProgram",
        "",

        Check(1)..nvrtcProgram.p("prog", ""),
        charASCII.const.p("src", ""),
        nullable..charASCII.const.p("name", ""),
        AutoSize("headers", "includeNames")..int("numHeaders", ""),
        nullable..char.const.p.const.p("headers", ""),
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
        charASCII.const.p.const("name_expression", "")
    )

    nvrtcResult(
        "GetLoweredName",
        "",

        nvrtcProgram("prog", ""),
        charASCII.const.p.const("name_expression", ""),
        Check(1)..charASCII.const.p.p("lowered_name", "")
    )
}