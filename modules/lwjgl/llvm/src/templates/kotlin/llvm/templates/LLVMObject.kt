/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMObject = "LLVMObject".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    EnumConstant(
        "BinaryTypeArchive".enum("0"),
        "BinaryTypeMachOUniversalBinary".enum,
        "BinaryTypeCOFFImportFile".enum,
        "BinaryTypeIR".enum,
        "BinaryTypeWinRes".enum,
        "BinaryTypeCOFF".enum,
        "BinaryTypeELF32L".enum,
        "BinaryTypeELF32B".enum,
        "BinaryTypeELF64L".enum,
        "BinaryTypeELF64B".enum,
        "BinaryTypeMachO32L".enum,
        "BinaryTypeMachO32B".enum,
        "BinaryTypeMachO64L".enum,
        "BinaryTypeMachO64B".enum,
        "BinaryTypeWasm".enum,
        "BinaryTypeOffload".enum
    )

    IgnoreMissing..LLVMBinaryRef(
        "CreateBinary",

        LLVMMemoryBufferRef("MemBuf"),
        nullable..LLVMContextRef("Context"),
        Check(1)..charUTF8.p.p("ErrorMessage")
    )

    IgnoreMissing..void(
        "DisposeBinary",

        LLVMBinaryRef("BR")
    )

    IgnoreMissing..LLVMMemoryBufferRef(
        "BinaryCopyMemoryBuffer",

        LLVMBinaryRef("BR")
    )

    IgnoreMissing..LLVMBinaryType(
        "BinaryGetType",

        LLVMBinaryRef("BR")
    )

    IgnoreMissing..LLVMBinaryRef(
        "MachOUniversalBinaryCopyObjectForArch",

        LLVMBinaryRef("BR"),
        charUTF8.const.p("Arch"),
        AutoSize("Arch")..size_t("ArchLen"),
        Check(1)..charUTF8.p.p("ErrorMessage")
    )

    IgnoreMissing..LLVMSectionIteratorRef(
        "ObjectFileCopySectionIterator",

        LLVMBinaryRef("BR")
    )

    IgnoreMissing..LLVMBool(
        "ObjectFileIsSectionIteratorAtEnd",

        LLVMBinaryRef("BR"),
        LLVMSectionIteratorRef("SI")
    )

    IgnoreMissing..LLVMSymbolIteratorRef(
        "ObjectFileCopySymbolIterator",

        LLVMBinaryRef("BR")
    )

    IgnoreMissing..LLVMBool(
        "ObjectFileIsSymbolIteratorAtEnd",

        LLVMBinaryRef("BR"),
        LLVMSymbolIteratorRef("SI")
    )

    IgnoreMissing..void(
        "DisposeSectionIterator",

        LLVMSectionIteratorRef("SI")
    )

    IgnoreMissing..void(
        "MoveToNextSection",

        LLVMSectionIteratorRef("SI")
    )

    IgnoreMissing..void(
        "MoveToContainingSection",

        LLVMSectionIteratorRef("Sect"),
        LLVMSymbolIteratorRef("Sym")
    )

    IgnoreMissing..void(
        "DisposeSymbolIterator",

        LLVMSymbolIteratorRef("SI")
    )

    IgnoreMissing..void(
        "MoveToNextSymbol",

        LLVMSymbolIteratorRef("SI")
    )

    IgnoreMissing..charUTF8.const.p(
        "GetSectionName",

        LLVMSectionIteratorRef("SI")
    )

    IgnoreMissing..uint64_t(
        "GetSectionSize",

        LLVMSectionIteratorRef("SI")
    )

    IgnoreMissing..charUTF8.const.p(
        "GetSectionContents",

        LLVMSectionIteratorRef("SI")
    )

    IgnoreMissing..uint64_t(
        "GetSectionAddress",

        LLVMSectionIteratorRef("SI")
    )

    IgnoreMissing..LLVMBool(
        "GetSectionContainsSymbol",

        LLVMSectionIteratorRef("SI"),
        LLVMSymbolIteratorRef("Sym")
    )

    IgnoreMissing..LLVMRelocationIteratorRef(
        "GetRelocations",

        LLVMSectionIteratorRef("Section")
    )

    IgnoreMissing..void(
        "DisposeRelocationIterator",

        LLVMRelocationIteratorRef("RI")
    )

    IgnoreMissing..LLVMBool(
        "IsRelocationIteratorAtEnd",

        LLVMSectionIteratorRef("Section"),
        LLVMRelocationIteratorRef("RI")
    )

    IgnoreMissing..void(
        "MoveToNextRelocation",

        LLVMRelocationIteratorRef("RI")
    )

    IgnoreMissing..charUTF8.const.p(
        "GetSymbolName",

        LLVMSymbolIteratorRef("SI")
    )

    IgnoreMissing..uint64_t(
        "GetSymbolAddress",

        LLVMSymbolIteratorRef("SI")
    )

    IgnoreMissing..uint64_t(
        "GetSymbolSize",

        LLVMSymbolIteratorRef("SI")
    )

    IgnoreMissing..uint64_t(
        "GetRelocationOffset",

        LLVMRelocationIteratorRef("RI")
    )

    IgnoreMissing..LLVMSymbolIteratorRef(
        "GetRelocationSymbol",

        LLVMRelocationIteratorRef("RI")
    )

    IgnoreMissing..uint64_t(
        "GetRelocationType",

        LLVMRelocationIteratorRef("RI")
    )

    IgnoreMissing..charUTF8.const.p(
        "GetRelocationTypeName",

        LLVMRelocationIteratorRef("RI")
    )

    IgnoreMissing..charUTF8.const.p(
        "GetRelocationValueString",

        LLVMRelocationIteratorRef("RI")
    )

    LLVMObjectFileRef(
        "CreateObjectFile",

        LLVMMemoryBufferRef("MemBuf")
    )

    void(
        "DisposeObjectFile",

        LLVMObjectFileRef("ObjectFile")
    )

    LLVMSectionIteratorRef(
        "GetSections",

        LLVMObjectFileRef("ObjectFile")
    )

    LLVMBool(
        "IsSectionIteratorAtEnd",

        LLVMObjectFileRef("ObjectFile"),
        LLVMSectionIteratorRef("SI")
    )

    LLVMSymbolIteratorRef(
        "GetSymbols",

        LLVMObjectFileRef("ObjectFile")
    )

    LLVMBool(
        "IsSymbolIteratorAtEnd",

        LLVMObjectFileRef("ObjectFile"),
        LLVMSymbolIteratorRef("SI")
    )
}