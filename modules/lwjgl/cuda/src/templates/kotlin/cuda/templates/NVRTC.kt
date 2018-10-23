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

        nvrtcResult.IN("result", "")
    )

    nvrtcResult(
        "Version",
        "",

        Check(1)..int.p.OUT("major", ""),
        Check(1)..int.p.OUT("minor", "")
    )

    nvrtcResult(
        "CreateProgram",
        "",

        Check(1)..nvrtcProgram.p.OUT("prog", ""),
        charASCII.const.p.IN("src", ""),
        nullable..charASCII.const.p.IN("name", ""),
        AutoSize("headers", "includeNames")..int.IN("numHeaders", ""),
        nullable..char.const.p.const.p.IN("headers", ""),
        nullable..char.const.p.const.p.IN("includeNames", "")
    )

    nvrtcResult(
        "DestroyProgram",
        "",

        Check(1)..nvrtcProgram.p.IN("prog", "")
    )

    nvrtcResult(
        "CompileProgram",
        "",

        nvrtcProgram.IN("prog", ""),
        AutoSize("options")..int.IN("numOptions", ""),
        nullable..charASCII.const.p.const.p.IN("options", "")
    )

    nvrtcResult(
        "GetPTXSize",
        "",

        nvrtcProgram.IN("prog", ""),
        Check(1)..size_t.p.OUT("ptxSizeRet", "")
    )

    nvrtcResult(
        "GetPTX",
        "",

        nvrtcProgram.IN("prog", ""),
        charASCII.p.OUT("ptx", "")
    )

    nvrtcResult(
        "GetProgramLogSize",
        "",

        nvrtcProgram.IN("prog", ""),
        Check(1)..size_t.p.OUT("logSizeRet", "")
    )

    nvrtcResult(
        "GetProgramLog",
        "",

        nvrtcProgram.IN("prog", ""),
        charASCII.p.OUT("log", "")
    )

    nvrtcResult(
        "AddNameExpression",
        "",

        nvrtcProgram.IN("prog", ""),
        charASCII.const.p.const.IN("name_expression", "")
    )

    nvrtcResult(
        "GetLoweredName",
        "",

        nvrtcProgram.IN("prog", ""),
        charASCII.const.p.const.IN("name_expression", ""),
        Check(1)..charASCII.const.p.p.IN("lowered_name", "")
    )
}