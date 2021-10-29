/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMDisassembler = "LLVMDisassembler".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    documentation = ""

    IntConstant(
        "",

        "Disassembler_VariantKind_None".."0",
        "Disassembler_VariantKind_ARM_HI16".."1",
        "Disassembler_VariantKind_ARM_LO16".."2",
        "Disassembler_VariantKind_ARM64_PAGE".."1",
        "Disassembler_VariantKind_ARM64_PAGEOFF".."2",
        "Disassembler_VariantKind_ARM64_GOTPAGE".."3",
        "Disassembler_VariantKind_ARM64_GOTPAGEOFF".."4",
        "Disassembler_VariantKind_ARM64_TLVP".."5",
        "Disassembler_VariantKind_ARM64_TLVOFF".."6",
        "Disassembler_ReferenceType_InOut_None".."0",
        "Disassembler_ReferenceType_In_Branch".."1",
        "Disassembler_ReferenceType_In_PCrel_Load".."2",
        "Disassembler_ReferenceType_Out_SymbolStub".."1",
        "Disassembler_ReferenceType_Out_LitPool_SymAddr".."2",
        "Disassembler_ReferenceType_Out_LitPool_CstrAddr".."3",
        "Disassembler_ReferenceType_Out_Objc_CFString_Ref".."4",
        "Disassembler_ReferenceType_Out_Objc_Message".."5",
        "Disassembler_ReferenceType_Out_Objc_Message_Ref".."6",
        "Disassembler_ReferenceType_Out_Objc_Selector_Ref".."7",
        "Disassembler_ReferenceType_Out_Objc_Class_Ref".."8",
        "Disassembler_ReferenceType_DeMangled_Name".."9"
    )

    LongConstant(
        "", 

        "Disassembler_ReferenceType_In_ARM64_ADRP".."0x100000001L",
        "Disassembler_ReferenceType_In_ARM64_ADDXri".."0x100000002L",
        "Disassembler_ReferenceType_In_ARM64_LDRXui".."0x100000003L",
        "Disassembler_ReferenceType_In_ARM64_LDRXl".."0x100000004L",
        "Disassembler_ReferenceType_In_ARM64_ADR".."0x100000005L"
    )

    IntConstant(
        "",

        "Disassembler_Option_UseMarkup".."1",
        "Disassembler_Option_PrintImmHex".."2",
        "Disassembler_Option_AsmPrinterVariant".."4",
        "Disassembler_Option_SetInstrComments".."8",
        "Disassembler_Option_PrintLatency".."16"
    )

    LLVMDisasmContextRef(
        "CreateDisasm",
        """
        Create a disassembler for the {@code TripleName}.

        Symbolic disassembly is supported by passing a block of information in the {@code DisInfo} parameter and specifying the {@code TagType} and callback
        functions as described above. These can all be passed as #NULL. If successful, this returns a disassembler context. If not, it returns #NULL. This
        function is equivalent to calling #CreateDisasmCPUFeatures() with an empty CPU name and feature set.
        """,

        charUTF8.const.p("TripleName", ""),
        nullable..opaque_p("DisInfo", ""),
        int("TagType", ""),
        nullable..LLVMOpInfoCallback("GetOpInfo", ""),
        nullable..LLVMSymbolLookupCallback("SymbolLookUp", "")
    )

    LLVMDisasmContextRef(
        "CreateDisasmCPU",
        """
        Create a disassembler for the {@code TripleName} and a specific CPU.

        Symbolic disassembly is supported by passing a block of information in the {@code DisInfo} parameter and specifying the {@code TagType} and callback
        functions as described above. These can all be passed as #NULL. If successful, this returns a disassembler context. If not, it returns #NULL. This
        function is equivalent to calling #CreateDisasmCPUFeatures() with an empty feature set.
        """,

        charUTF8.const.p("Triple", ""),
        charUTF8.const.p("CPU", ""),
        nullable..opaque_p("DisInfo", ""),
        int("TagType", ""),
        nullable..LLVMOpInfoCallback("GetOpInfo", ""),
        nullable..LLVMSymbolLookupCallback("SymbolLookUp", "")
    )

    LLVMDisasmContextRef(
        "CreateDisasmCPUFeatures",
        """
        Create a disassembler for the {@code TripleName}, a specific CPU and specific feature string.

        Symbolic disassembly is supported by passing a block of information in the {@code DisInfo} parameter and specifying the {@code TagType} and callback
        functions as described above. These can all be passed as #NULL. If successful, this returns a disassembler context. If not, it returns #NULL.
        """,

        charUTF8.const.p("Triple", ""),
        charUTF8.const.p("CPU", ""),
        charUTF8.const.p("Features", ""),
        nullable..opaque_p("DisInfo", ""),
        int("TagType", ""),
        nullable..LLVMOpInfoCallback("GetOpInfo", ""),
        nullable..LLVMSymbolLookupCallback("SymbolLookUp", "")
    )

    int(
        "SetDisasmOptions",
        "Set the disassembler's options.  Returns 1 if it can set the {@code Options} and 0 otherwise.",

        LLVMDisasmContextRef("DC", ""),
        uint64_t("Options", "")
    )

    void(
        "DisasmDispose",
        "Dispose of a disassembler context.",

        LLVMDisasmContextRef("DC", "")
    )

    size_t(
        "DisasmInstruction",
        """
        Disassemble a single instruction using the disassembler context specified in the parameter DC.

        The bytes of the instruction are specified in the parameter {@code Bytes}, and contains at least {@code BytesSize} number of bytes. The instruction is
        at the address specified by the {@code PC} parameter. If a valid instruction can be disassembled, its string is returned indirectly in
        {@code OutString} whose size is specified in the parameter {@code OutStringSize}. This function returns the number of bytes in the instruction or zero
        if there was no valid instruction.
        """,

        LLVMDisasmContextRef("DC", ""),
        uint8_t.p("Bytes", ""),
        AutoSize("Bytes")..uint64_t("BytesSize", ""),
        uint64_t("PC", ""),
        charUTF8.p("OutString", ""),
        AutoSize("OutString")..size_t("OutStringSize", "")
    )
}