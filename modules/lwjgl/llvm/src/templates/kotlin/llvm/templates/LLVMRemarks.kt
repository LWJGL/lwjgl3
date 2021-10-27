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
    documentation = "Requires LLVM 9 or higher."

    IntConstant("", "REMARKS_API_VERSION".."1").noPrefix()

    EnumConstant(
        "The type of the emitted remark. ({@code enum LLVMRemarkType})",

        "RemarkTypeUnknown".enum("", "0"),
        "RemarkTypePassed".enum,
        "RemarkTypeMissed".enum,
        "RemarkTypeAnalysis".enum,
        "RemarkTypeAnalysisFPCommute".enum,
        "RemarkTypeAnalysisAliasing".enum,
        "RemarkTypeFailure".enum
    )

    charUTF8.const.p(
        "RemarkStringGetData",
        "Returns the buffer holding the string.",

        LLVMRemarkStringRef("String", "")
    )

    uint32_t(
        "RemarkStringGetLen",
        "Returns the size of the string.",

        LLVMRemarkStringRef("String", "")
    )

    LLVMRemarkStringRef(
        "RemarkDebugLocGetSourceFilePath",
        "Return the path to the source file for a debug location.",

        LLVMRemarkDebugLocRef("DL", "")
    )

    uint32_t(
        "RemarkDebugLocGetSourceLine",
        "Return the line in the source file for a debug location.",

        LLVMRemarkDebugLocRef("DL", "")
    )

    uint32_t(
        "RemarkDebugLocGetSourceColumn",
        "Return the column in the source file for a debug location.",

        LLVMRemarkDebugLocRef("DL", "")
    )

    LLVMRemarkStringRef(
        "RemarkArgGetKey",
        "Returns the key of an argument. The key defines what the value is, and the same key can appear multiple times in the list of arguments.",

        LLVMRemarkArgRef("Arg", "")
    )

    LLVMRemarkStringRef(
        "RemarkArgGetValue",
        "Returns the value of an argument. This is a string that can contain newlines.",

        LLVMRemarkArgRef("Arg", "")
    )

    LLVMRemarkDebugLocRef(
        "RemarkArgGetDebugLoc",
        """
        Returns the debug location that is attached to the value of this argument.

        If there is no debug location, the return value will be #NULL.
        """,

        LLVMRemarkArgRef("Arg", "")
    )

    void(
        "RemarkEntryDispose",
        "Free the resources used by the remark entry.",

        LLVMRemarkEntryRef("Remark", "")
    )

    LLVMRemarkType(
        "RemarkEntryGetType",
        "The type of the remark. For example, it can allow users to only keep the missed optimizations from the compiler.",

        LLVMRemarkEntryRef("Remark", "")
    )

    LLVMRemarkStringRef(
        "RemarkEntryGetPassName",
        "Get the name of the pass that emitted this remark.",

        LLVMRemarkEntryRef("Remark", "")
    )

    LLVMRemarkStringRef(
        "RemarkEntryGetRemarkName",
        "Get an identifier of the remark.",

        LLVMRemarkEntryRef("Remark", "")
    )

    LLVMRemarkStringRef(
        "RemarkEntryGetFunctionName",
        "Get the name of the function being processed when the remark was emitted.",

        LLVMRemarkEntryRef("Remark", "")
    )

    LLVMRemarkDebugLocRef(
        "RemarkEntryGetDebugLoc",
        """
        Returns the debug location that is attached to this remark.

        If there is no debug location, the return value will be #NULL.
        """,

        LLVMRemarkEntryRef("Remark", "")
    )

    uint64_t(
        "RemarkEntryGetHotness",
        """
        Return the hotness of the remark.

        A hotness of {@code 0} means this value is not set.
        """,

        LLVMRemarkEntryRef("Remark", "")
    )

    uint32_t(
        "RemarkEntryGetNumArgs",
        "The number of arguments the remark holds.",

        LLVMRemarkEntryRef("Remark", "")
    )

    LLVMRemarkArgRef(
        "RemarkEntryGetFirstArg",
        """
        Get a new iterator to iterate over a remark's argument.

        If there are no arguments in {@code Remark}, the return value will be #NULL.

        The lifetime of the returned value is bound to the lifetime of {@code Remark}.
        """,

        LLVMRemarkEntryRef("Remark", "")
    )

    LLVMRemarkArgRef(
        "RemarkEntryGetNextArg",
        """
        Get the next argument in {@code Remark} from the position of {@code It}.

        Returns #NULL if there are no more arguments available.

        The lifetime of the returned value is bound to the lifetime of {@code Remark}.
        """,

        LLVMRemarkArgRef("It", ""),
        LLVMRemarkEntryRef("Remark", "")
    )

    LLVMRemarkParserRef(
        "RemarkParserCreateYAML",
        """
        Creates a remark parser that can be used to parse the buffer located in {@code Buf} of size {@code Size} bytes.

        {@code Buf} cannot be #NULL.

        This function should be paired with #RemarkParserDispose() to avoid leaking resources.
        """,

        void.const.p("Buf", ""),
        AutoSize("Buf")..uint64_t("Size", "")
    )

    IgnoreMissing..LLVMRemarkParserRef(
        "RemarkParserCreateBitstream",
        """
        Creates a remark parser that can be used to parse the buffer located in {@code Buf} of size {@code Size} bytes.

        {@code Buf} cannot be #NULL.

        This function should be paired with #RemarkParserDispose() to avoid leaking resources.
        """,

        void.const.p("Buf", ""),
        AutoSize("Buf")..uint64_t("Size", ""),

        since = "10"
    )

    LLVMRemarkEntryRef(
        "RemarkParserGetNext",
        """
        Returns the next remark in the file.

        The value pointed to by the return value needs to be disposed using a call to #RemarkEntryDispose().

        All the entries in the returned value that are of {@code LLVMRemarkStringRef} type will become invalidated once a call to #RemarkParserDispose() is
        made.

        If the parser reaches the end of the buffer, the return value will be #NULL.

        In the case of an error, the return value will be #NULL, and:
        ${ul(
            "#RemarkParserHasError() will return {@code 1}.",
            "#RemarkParserGetErrorMessage() will return a descriptive error message."
        )}

        An error may occur if:
        ${ul(
            "An argument is invalid.",
            "There is a parsing error. This can occur on things like malformed YAML.",
            "There is a {@code Remark} semantic error. This can occur on well-formed files with missing or extra fields."
        )}

        Here is a quick example of the usage:
        ${codeBlock("""
LLVMRemarkParserRef Parser = LLVMRemarkParserCreateYAML(Buf, Size);
LLVMRemarkEntryRef Remark = NULL;
while ((Remark = LLVMRemarkParserGetNext(Parser))) {
    // use Remark
    LLVMRemarkEntryDispose(Remark); // Release memory.
}
bool HasError = LLVMRemarkParserHasError(Parser);
LLVMRemarkParserDispose(Parser);""")}
        """,

        LLVMRemarkParserRef("Parser", "")
    )

    LLVMBool(
        "RemarkParserHasError",
        "Returns {@code 1} if the parser encountered an error while parsing the buffer.",

        LLVMRemarkParserRef("Parser", "")
    )

    charUTF8.const.p(
        "RemarkParserGetErrorMessage",
        """
        Returns a null-terminated string containing an error message.

        In case of no error, the result is #NULL.

        The memory of the string is bound to the lifetime of {@code Parser}. If #RemarkParserDispose() is called, the memory of the string will be released.
        """,

        LLVMRemarkParserRef("Parser", "")
    )

    void(
        "RemarkParserDispose",
        "Releases all the resources used by {@code Parser}.",

        LLVMRemarkParserRef("Parser", "")
    )

    // build bug?
    IgnoreMissing..uint32_t(
        "RemarkVersion",
        "Returns the version of the remarks library.",

        void()
    )
}
