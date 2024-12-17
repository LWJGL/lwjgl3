/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMTarget = "LLVMTarget".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    EnumConstant(
        "BigEndian".enum("0"),
        "LittleEndian".enum
    )

    LLVMTargetDataRef(
        "GetModuleDataLayout",

        LLVMModuleRef("M")
    )

    void(
        "SetModuleDataLayout",

        LLVMModuleRef("M"),
        LLVMTargetDataRef("DL")
    )

    LLVMTargetDataRef(
        "CreateTargetData",

        charUTF8.const.p("StringRep")
    )

    void(
        "DisposeTargetData",

        LLVMTargetDataRef("TD")
    )

    void(
        "AddTargetLibraryInfo",

        LLVMTargetLibraryInfoRef("TLI"),
        LLVMPassManagerRef("PM")
    )

    charUTF8.p(
        "CopyStringRepOfTargetData",

        LLVMTargetDataRef("TD")
    )

    LLVMByteOrdering(
        "ByteOrder",

        LLVMTargetDataRef("TD")
    )

    unsigned_int(
        "PointerSize",

        LLVMTargetDataRef("TD")
    )

    unsigned_int(
        "PointerSizeForAS",

        LLVMTargetDataRef("TD"),
        unsigned_int("AS")
    )

    LLVMTypeRef(
        "IntPtrType",

        LLVMTargetDataRef("TD")
    )

    LLVMTypeRef(
        "IntPtrTypeForAS",

        LLVMTargetDataRef("TD"),
        unsigned_int("AS")
    )

    LLVMTypeRef(
        "IntPtrTypeInContext",

        LLVMContextRef("C"),
        LLVMTargetDataRef("TD")
    )

    LLVMTypeRef(
        "IntPtrTypeForASInContext",

        LLVMContextRef("C"),
        LLVMTargetDataRef("TD"),
        unsigned_int("AS")
    )

    unsigned_long_long(
        "SizeOfTypeInBits",

        LLVMTargetDataRef("TD"),
        LLVMTypeRef("Ty")
    )

    unsigned_long_long(
        "StoreSizeOfType",

        LLVMTargetDataRef("TD"),
        LLVMTypeRef("Ty")
    )

    unsigned_long_long(
        "ABISizeOfType",

        LLVMTargetDataRef("TD"),
        LLVMTypeRef("Ty")
    )

    unsigned_int(
        "ABIAlignmentOfType",

        LLVMTargetDataRef("TD"),
        LLVMTypeRef("Ty")
    )

    unsigned_int(
        "CallFrameAlignmentOfType",

        LLVMTargetDataRef("TD"),
        LLVMTypeRef("Ty")
    )

    unsigned_int(
        "PreferredAlignmentOfType",

        LLVMTargetDataRef("TD"),
        LLVMTypeRef("Ty")
    )

    unsigned_int(
        "PreferredAlignmentOfGlobal",

        LLVMTargetDataRef("TD"),
        LLVMValueRef("GlobalVar")
    )

    unsigned_int(
        "ElementAtOffset",

        LLVMTargetDataRef("TD"),
        LLVMTypeRef("StructTy"),
        unsigned_long_long("Offset")
    )

    unsigned_long_long(
        "OffsetOfElement",

        LLVMTargetDataRef("TD"),
        LLVMTypeRef("StructTy"),
        unsigned_int("Element")
    )
}