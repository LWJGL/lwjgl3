/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMRemarks = "LLVMRemarks".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    IntConstant("REMARKS_API_VERSION".."1").noPrefix()

    EnumConstant(
        "RemarkTypeUnknown".enum("0"),
        "RemarkTypePassed".enum,
        "RemarkTypeMissed".enum,
        "RemarkTypeAnalysis".enum,
        "RemarkTypeAnalysisFPCommute".enum,
        "RemarkTypeAnalysisAliasing".enum,
        "RemarkTypeFailure".enum
    )

    charUTF8.const.p(
        "RemarkStringGetData",

        LLVMRemarkStringRef("String")
    )

    uint32_t(
        "RemarkStringGetLen",

        LLVMRemarkStringRef("String")
    )

    LLVMRemarkStringRef(
        "RemarkDebugLocGetSourceFilePath",

        LLVMRemarkDebugLocRef("DL")
    )

    uint32_t(
        "RemarkDebugLocGetSourceLine",

        LLVMRemarkDebugLocRef("DL")
    )

    uint32_t(
        "RemarkDebugLocGetSourceColumn",

        LLVMRemarkDebugLocRef("DL")
    )

    LLVMRemarkStringRef(
        "RemarkArgGetKey",

        LLVMRemarkArgRef("Arg")
    )

    LLVMRemarkStringRef(
        "RemarkArgGetValue",

        LLVMRemarkArgRef("Arg")
    )

    LLVMRemarkDebugLocRef(
        "RemarkArgGetDebugLoc",

        LLVMRemarkArgRef("Arg")
    )

    void(
        "RemarkEntryDispose",

        LLVMRemarkEntryRef("Remark")
    )

    LLVMRemarkType(
        "RemarkEntryGetType",

        LLVMRemarkEntryRef("Remark")
    )

    LLVMRemarkStringRef(
        "RemarkEntryGetPassName",

        LLVMRemarkEntryRef("Remark")
    )

    LLVMRemarkStringRef(
        "RemarkEntryGetRemarkName",

        LLVMRemarkEntryRef("Remark")
    )

    LLVMRemarkStringRef(
        "RemarkEntryGetFunctionName",

        LLVMRemarkEntryRef("Remark")
    )

    LLVMRemarkDebugLocRef(
        "RemarkEntryGetDebugLoc",

        LLVMRemarkEntryRef("Remark")
    )

    uint64_t(
        "RemarkEntryGetHotness",

        LLVMRemarkEntryRef("Remark")
    )

    uint32_t(
        "RemarkEntryGetNumArgs",

        LLVMRemarkEntryRef("Remark")
    )

    LLVMRemarkArgRef(
        "RemarkEntryGetFirstArg",

        LLVMRemarkEntryRef("Remark")
    )

    LLVMRemarkArgRef(
        "RemarkEntryGetNextArg",

        LLVMRemarkArgRef("It"),
        LLVMRemarkEntryRef("Remark")
    )

    LLVMRemarkParserRef(
        "RemarkParserCreateYAML",

        void.const.p("Buf"),
        AutoSize("Buf")..uint64_t("Size")
    )

    IgnoreMissing..LLVMRemarkParserRef(
        "RemarkParserCreateBitstream",

        void.const.p("Buf"),
        AutoSize("Buf")..uint64_t("Size")
    )

    LLVMRemarkEntryRef(
        "RemarkParserGetNext",

        LLVMRemarkParserRef("Parser")
    )

    LLVMBool(
        "RemarkParserHasError",

        LLVMRemarkParserRef("Parser")
    )

    charUTF8.const.p(
        "RemarkParserGetErrorMessage",

        LLVMRemarkParserRef("Parser")
    )

    void(
        "RemarkParserDispose",

        LLVMRemarkParserRef("Parser")
    )

    // build bug?
    IgnoreMissing..uint32_t(
        "RemarkVersion",

        void()
    )
}
