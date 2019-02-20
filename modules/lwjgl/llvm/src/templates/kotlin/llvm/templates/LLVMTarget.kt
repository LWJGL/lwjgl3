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
    documentation = ""

    EnumConstant(
        "{@code enum LLVMByteOrdering}",

        "BigEndian".enum("", "0"),
        "LittleEndian".enum
    )

    LLVMTargetDataRef(
        "GetModuleDataLayout",
        "Obtain the data layout for a module.",

        LLVMModuleRef("M", "")
    )

    void(
        "SetModuleDataLayout",
        "Set the data layout for a module.",

        LLVMModuleRef("M", ""),
        LLVMTargetDataRef("DL", "")
    )

    LLVMTargetDataRef(
        "CreateTargetData",
        "Creates target data from a target layout string. See the constructor {@code llvm::DataLayout::DataLayout}.",

        charUTF8.const.p("StringRep", "")
    )

    void(
        "DisposeTargetData",
        "Deallocates a {@code TargetData}. See the destructor {@code llvm::DataLayout::~DataLayout}.",

        LLVMTargetDataRef("TD", "")
    )

    void(
        "AddTargetLibraryInfo",
        """
        Adds target library information to a pass manager. This does not take ownership of the target library info. See the method
        {@code llvm::PassManagerBase::add}.
        """,

        LLVMTargetLibraryInfoRef("TLI", ""),
        LLVMPassManagerRef("PM", "")
    )

    charUTF8.p(
        "CopyStringRepOfTargetData",
        """
        Converts target data to a target layout string. The string must be disposed with #DisposeMessage(). See the constructor
        {@code llvm::DataLayout::DataLayout}.
        """,

        LLVMTargetDataRef("TD", "")
    )

    LLVMByteOrdering(
        "ByteOrder",
        "Returns the byte order of a target, either #BigEndian or #LittleEndian. See the method {@code llvm::DataLayout::isLittleEndian}.",

        LLVMTargetDataRef("TD", "")
    )

    unsigned_int(
        "PointerSize",
        "Returns the pointer size in bytes for a target. See the method {@code llvm::DataLayout::getPointerSize}.",

        LLVMTargetDataRef("TD", "")
    )

    unsigned_int(
        "PointerSizeForAS",
        "Returns the pointer size in bytes for a target for a specified address space. See the method {@code llvm::DataLayout::getPointerSize}.",

        LLVMTargetDataRef("TD", ""),
        unsigned_int("AS", "")
    )

    LLVMTypeRef(
        "IntPtrType",
        "Returns the integer type that is the same size as a pointer on a target. See the method {@code llvm::DataLayout::getIntPtrType}.",

        LLVMTargetDataRef("TD", "")
    )

    LLVMTypeRef(
        "IntPtrTypeForAS",
        """
        Returns the integer type that is the same size as a pointer on a target. This version allows the address space to be specified. See the method
        {@code llvm::DataLayout::getIntPtrType}.
        """,

        LLVMTargetDataRef("TD", ""),
        unsigned_int("AS", "")
    )

    LLVMTypeRef(
        "IntPtrTypeInContext",
        "Returns the integer type that is the same size as a pointer on a target. See the method {@code llvm::DataLayout::getIntPtrType}.",

        LLVMContextRef("C", ""),
        LLVMTargetDataRef("TD", "")
    )

    LLVMTypeRef(
        "IntPtrTypeForASInContext",
        """
        Returns the integer type that is the same size as a pointer on a target. This version allows the address space to be specified. See the method
        {@code llvm::DataLayout::getIntPtrType}.
        """,

        LLVMContextRef("C", ""),
        LLVMTargetDataRef("TD", ""),
        unsigned_int("AS", "")
    )

    unsigned_long_long(
        "SizeOfTypeInBits",
        "Computes the size of a type in bytes for a target. See the method {@code llvm::DataLayout::getTypeSizeInBits}.",

        LLVMTargetDataRef("TD", ""),
        LLVMTypeRef("Ty", "")
    )

    unsigned_long_long(
        "StoreSizeOfType",
        "Computes the storage size of a type in bytes for a target. See the method {@code llvm::DataLayout::getTypeStoreSize}.",

        LLVMTargetDataRef("TD", ""),
        LLVMTypeRef("Ty", "")
    )

    unsigned_long_long(
        "ABISizeOfType",
        "Computes the ABI size of a type in bytes for a target. See the method {@code llvm::DataLayout::getTypeAllocSize}.",

        LLVMTargetDataRef("TD", ""),
        LLVMTypeRef("Ty", "")
    )

    unsigned_int(
        "ABIAlignmentOfType",
        "Computes the ABI alignment of a type in bytes for a target. See the method {@code llvm::DataLayout::getTypeABISize}.",

        LLVMTargetDataRef("TD", ""),
        LLVMTypeRef("Ty", "")
    )

    unsigned_int(
        "CallFrameAlignmentOfType",
        "Computes the call frame alignment of a type in bytes for a target. See the method {@code llvm::DataLayout::getTypeABISize}.",

        LLVMTargetDataRef("TD", ""),
        LLVMTypeRef("Ty", "")
    )

    unsigned_int(
        "PreferredAlignmentOfType",
        "Computes the preferred alignment of a type in bytes for a target. See the method {@code llvm::DataLayout::getTypeABISize}.",

        LLVMTargetDataRef("TD", ""),
        LLVMTypeRef("Ty", "")
    )

    unsigned_int(
        "PreferredAlignmentOfGlobal",
        "Computes the preferred alignment of a global variable in bytes for a target. See the method {@code llvm::DataLayout::getPreferredAlignment}.",

        LLVMTargetDataRef("TD", ""),
        LLVMValueRef("GlobalVar", "")
    )

    unsigned_int(
        "ElementAtOffset",
        "Computes the structure element that contains the byte offset for a target. See the method {@code llvm::StructLayout::getElementContainingOffset}.",

        LLVMTargetDataRef("TD", ""),
        LLVMTypeRef("StructTy", ""),
        unsigned_long_long("Offset", "")
    )

    unsigned_long_long(
        "OffsetOfElement",
        "Computes the byte offset of the indexed struct element for a target. See the method {@code llvm::StructLayout::getElementContainingOffset}.",

        LLVMTargetDataRef("TD", ""),
        LLVMTypeRef("StructTy", ""),
        unsigned_int("Element", "")
    )
}