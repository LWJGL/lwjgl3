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
    IntConstant(
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

        "Disassembler_ReferenceType_In_ARM64_ADRP".."0x100000001L",
        "Disassembler_ReferenceType_In_ARM64_ADDXri".."0x100000002L",
        "Disassembler_ReferenceType_In_ARM64_LDRXui".."0x100000003L",
        "Disassembler_ReferenceType_In_ARM64_LDRXl".."0x100000004L",
        "Disassembler_ReferenceType_In_ARM64_ADR".."0x100000005L"
    )

    IntConstant(
        "Disassembler_Option_UseMarkup".."1",
        "Disassembler_Option_PrintImmHex".."2",
        "Disassembler_Option_AsmPrinterVariant".."4",
        "Disassembler_Option_SetInstrComments".."8",
        "Disassembler_Option_PrintLatency".."16",
        "Disassembler_Option_Color".."32"
    )

    LLVMDisasmContextRef(
        "CreateDisasm",

        charUTF8.const.p("TripleName"),
        nullable..opaque_p("DisInfo"),
        int("TagType"),
        nullable..LLVMOpInfoCallback("GetOpInfo"),
        nullable..LLVMSymbolLookupCallback("SymbolLookUp")
    )

    LLVMDisasmContextRef(
        "CreateDisasmCPU",

        charUTF8.const.p("Triple"),
        charUTF8.const.p("CPU"),
        nullable..opaque_p("DisInfo"),
        int("TagType"),
        nullable..LLVMOpInfoCallback("GetOpInfo"),
        nullable..LLVMSymbolLookupCallback("SymbolLookUp")
    )

    LLVMDisasmContextRef(
        "CreateDisasmCPUFeatures",

        charUTF8.const.p("Triple"),
        charUTF8.const.p("CPU"),
        charUTF8.const.p("Features"),
        nullable..opaque_p("DisInfo"),
        int("TagType"),
        nullable..LLVMOpInfoCallback("GetOpInfo"),
        nullable..LLVMSymbolLookupCallback("SymbolLookUp")
    )

    int(
        "SetDisasmOptions",

        LLVMDisasmContextRef("DC"),
        uint64_t("Options")
    )

    void(
        "DisasmDispose",

        LLVMDisasmContextRef("DC")
    )

    size_t(
        "DisasmInstruction",

        LLVMDisasmContextRef("DC"),
        uint8_t.p("Bytes"),
        AutoSize("Bytes")..uint64_t("BytesSize"),
        uint64_t("PC"),
        charUTF8.p("OutString"),
        AutoSize("OutString")..size_t("OutStringSize")
    )
}