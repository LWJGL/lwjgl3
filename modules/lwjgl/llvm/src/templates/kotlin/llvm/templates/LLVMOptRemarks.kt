/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMOptRemarks = "LLVMOptRemarks".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    documentation = ""

    IntConstant("", "OPT_REMARKS_API_VERSION".."0").noPrefix()

    LLVMOptRemarkParserRef(
        "OptRemarkParserCreate",
        """
        Creates a remark parser that can be used to read and parse the buffer located in {@code Buf} of size {@code Size}.

        {@code Buf} cannot be #NULL.

        This function should be paired with #OptRemarkParserDispose() to avoid leaking resources.
        """,

        void.const.p("Buf", ""),
        AutoSize("Buf")..uint64_t("Size", "")
    )

    LLVMOptRemarkEntry.p(
        "OptRemarkParserGetNext",
        """
        Returns the next remark in the file.

        The value pointed to by the return value is invalidated by the next call to #OptRemarkParserGetNext().

        If the parser reaches the end of the buffer, the return value will be #NULL.

        In the case of an error, the return value will be #NULL, and:

        ${ol(
            "#OptRemarkParserHasError() will return {@code 1}.",
            "#OptRemarkParserGetErrorMessage() will return a descriptive error message."
        )}

        An error may occur if:

        ${ol(
            "An argument is invalid.",
            "There is a YAML parsing error. This type of error aborts parsing immediately and returns {@code 1}. It can occur on malformed YAML.",
            """
            Remark parsing error. If this type of error occurs, the parser won't call the handler and will continue to the next one. It can occur on malformed
            remarks, like missing or extra fields in the file.
            """
        )}

        Here is a quick example of the usage:

        ${codeBlock("""
LLVMOptRemarkParserRef Parser = LLVMOptRemarkParserCreate(Buf, Size);
LLVMOptRemarkEntry *Remark = NULL;
while ((Remark == LLVMOptRemarkParserGetNext(Parser))) {
  // use Remark
}
bool HasError = LLVMOptRemarkParserHasError(Parser);
LLVMOptRemarkParserDispose(Parser);""")}
        """,

        LLVMOptRemarkParserRef("Parser", "")
    )

    LLVMBool(
        "OptRemarkParserHasError",
        "Returns {@code 1} if the parser encountered an error while parsing the buffer.",

        LLVMOptRemarkParserRef("Parser", "")
    )

    charUTF8.const.p(
        "OptRemarkParserGetErrorMessage",
        """
        Returns a null-terminated string containing an error message.

        In case of no error, the result is #NULL.

        The memory of the string is bound to the lifetime of {@code Parser}. If #OptRemarkParserDispose() is called, the memory of the string will be
        released.
        """,

        LLVMOptRemarkParserRef("Parser", "")
    )

    void(
        "OptRemarkParserDispose",
        "Releases all the resources used by {@code Parser}.",

        LLVMOptRemarkParserRef("Parser", "")
    )

    IgnoreMissing..uint32_t(
        "OptRemarkVersion",
        "Returns the version of the opt-remarks dylib.",

        void(),

        since = "8.0"
    )
}