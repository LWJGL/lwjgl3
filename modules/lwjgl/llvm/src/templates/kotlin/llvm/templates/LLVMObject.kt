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
    documentation = ""

    EnumConstant(
        "{@code LLVMBinaryType}",

        "BinaryTypeArchive".enum("", "0"),
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
        """
        Create a binary file from the given memory buffer.

        The exact type of the binary file will be inferred automatically, and the appropriate implementation selected. The context may be #NULL except if the
        resulting file is an LLVM IR file.

        The memory buffer is not consumed by this function. It is the responsibilty of the caller to free it with #DisposeMemoryBuffer().

        If #NULL is returned, the {@code ErrorMessage} parameter is populated with the error's description. It is then the caller's responsibility to free this
        message by calling #DisposeMessage().
        """,

        LLVMMemoryBufferRef("MemBuf", ""),
        nullable..LLVMContextRef("Context", ""),
        Check(1)..charUTF8.p.p("ErrorMessage", "")
    )

    IgnoreMissing..void(
        "DisposeBinary",
        """
        Dispose of a binary file.

        The binary file does not own its backing buffer. It is the responsibilty of the caller to free it with #DisposeMemoryBuffer().
        """,

        LLVMBinaryRef("BR", "")
    )

    IgnoreMissing..LLVMMemoryBufferRef(
        "BinaryCopyMemoryBuffer",
        """
        Retrieves a copy of the memory buffer associated with this object file.

        The returned buffer is merely a shallow copy and does not own the actual backing buffer of the binary. Nevertheless, it is the responsibility of the
        caller to free it with #DisposeMemoryBuffer().
        """,

        LLVMBinaryRef("BR", "")
    )

    IgnoreMissing..LLVMBinaryType(
        "BinaryGetType",
        "Retrieve the specific type of a binary.",

        LLVMBinaryRef("BR", "")
    )

    IgnoreMissing..LLVMBinaryRef(
        "MachOUniversalBinaryCopyObjectForArch",
        """
        For a Mach-O universal binary file, retrieves the object file corresponding to the given architecture if it is present as a slice.

        If #NULL is returned, the {@code ErrorMessage} parameter is populated with the error's description. It is then the caller's responsibility to free this
        message by calling #DisposeMessage().

        It is the responsiblity of the caller to free the returned object file by calling #DisposeBinary().
        """,

        LLVMBinaryRef("BR", ""),
        charUTF8.const.p("Arch", ""),
        AutoSize("Arch")..size_t("ArchLen", ""),
        Check(1)..charUTF8.p.p("ErrorMessage", "")
    )

    IgnoreMissing..LLVMSectionIteratorRef(
        "ObjectFileCopySectionIterator",
        """
        Retrieve a copy of the section iterator for this object file.

        If there are no sections, the result is #NULL.

        The returned iterator is merely a shallow copy. Nevertheless, it is the responsibility of the caller to free it with #DisposeSectionIterator().
        """,

        LLVMBinaryRef("BR", "")
    )

    IgnoreMissing..LLVMBool(
        "ObjectFileIsSectionIteratorAtEnd",
        "Returns whether the given section iterator is at the end.",

        LLVMBinaryRef("BR", ""),
        LLVMSectionIteratorRef("SI", "")
    )

    IgnoreMissing..LLVMSymbolIteratorRef(
        "ObjectFileCopySymbolIterator",
        """
        Retrieve a copy of the symbol iterator for this object file.

        If there are no symbols, the result is #NULL.

        The returned iterator is merely a shallow copy. Nevertheless, it is the responsibility of the caller to free it with #DisposeSymbolIterator().
        """,

        LLVMBinaryRef("BR", "")
    )

    IgnoreMissing..LLVMBool(
        "ObjectFileIsSymbolIteratorAtEnd",
        "Returns whether the given symbol iterator is at the end.",

        LLVMBinaryRef("BR", ""),
        LLVMSymbolIteratorRef("SI", "")
    )

    IgnoreMissing..void(
        "DisposeSectionIterator",
        "",

        LLVMSectionIteratorRef("SI", "")
    )

    IgnoreMissing..void(
        "MoveToNextSection",
        "",

        LLVMSectionIteratorRef("SI", "")
    )

    IgnoreMissing..void(
        "MoveToContainingSection",
        "",

        LLVMSectionIteratorRef("Sect", ""),
        LLVMSymbolIteratorRef("Sym", "")
    )

    IgnoreMissing..void(
        "DisposeSymbolIterator",
        "",

        LLVMSymbolIteratorRef("SI", "")
    )

    IgnoreMissing..void(
        "MoveToNextSymbol",
        "",

        LLVMSymbolIteratorRef("SI", "")
    )

    IgnoreMissing..charUTF8.const.p(
        "GetSectionName",
        "",

        LLVMSectionIteratorRef("SI", "")
    )

    IgnoreMissing..uint64_t(
        "GetSectionSize",
        "",

        LLVMSectionIteratorRef("SI", "")
    )

    IgnoreMissing..charUTF8.const.p(
        "GetSectionContents",
        "",

        LLVMSectionIteratorRef("SI", "")
    )

    IgnoreMissing..uint64_t(
        "GetSectionAddress",
        "",

        LLVMSectionIteratorRef("SI", "")
    )

    IgnoreMissing..LLVMBool(
        "GetSectionContainsSymbol",
        "",

        LLVMSectionIteratorRef("SI", ""),
        LLVMSymbolIteratorRef("Sym", "")
    )

    IgnoreMissing..LLVMRelocationIteratorRef(
        "GetRelocations",
        "",

        LLVMSectionIteratorRef("Section", "")
    )

    IgnoreMissing..void(
        "DisposeRelocationIterator",
        "",

        LLVMRelocationIteratorRef("RI", "")
    )

    IgnoreMissing..LLVMBool(
        "IsRelocationIteratorAtEnd",
        "",

        LLVMSectionIteratorRef("Section", ""),
        LLVMRelocationIteratorRef("RI", "")
    )

    IgnoreMissing..void(
        "MoveToNextRelocation",
        "",

        LLVMRelocationIteratorRef("RI", "")
    )

    IgnoreMissing..charUTF8.const.p(
        "GetSymbolName",
        "",

        LLVMSymbolIteratorRef("SI", "")
    )

    IgnoreMissing..uint64_t(
        "GetSymbolAddress",
        "",

        LLVMSymbolIteratorRef("SI", "")
    )

    IgnoreMissing..uint64_t(
        "GetSymbolSize",
        "",

        LLVMSymbolIteratorRef("SI", "")
    )

    IgnoreMissing..uint64_t(
        "GetRelocationOffset",
        "",

        LLVMRelocationIteratorRef("RI", "")
    )

    IgnoreMissing..LLVMSymbolIteratorRef(
        "GetRelocationSymbol",
        "",

        LLVMRelocationIteratorRef("RI", "")
    )

    IgnoreMissing..uint64_t(
        "GetRelocationType",
        "",

        LLVMRelocationIteratorRef("RI", "")
    )

    IgnoreMissing..charUTF8.const.p(
        "GetRelocationTypeName",
        "",

        LLVMRelocationIteratorRef("RI", "")
    )

    IgnoreMissing..charUTF8.const.p(
        "GetRelocationValueString",
        "",

        LLVMRelocationIteratorRef("RI", "")
    )

    LLVMObjectFileRef(
        "CreateObjectFile",
        "Deprecated: use #CreateBinary() instead.",

        LLVMMemoryBufferRef("MemBuf", "")
    )

    void(
        "DisposeObjectFile",
        "Deprecated: use #DisposeBinary() instead.",

        LLVMObjectFileRef("ObjectFile", "")
    )

    LLVMSectionIteratorRef(
        "GetSections",
        "Deprecated: Use #ObjectFileCopySectionIterator() instead.",

        LLVMObjectFileRef("ObjectFile", "")
    )

    LLVMBool(
        "IsSectionIteratorAtEnd",
        "Deprecated: Use #ObjectFileIsSectionIteratorAtEnd() instead.",

        LLVMObjectFileRef("ObjectFile", ""),
        LLVMSectionIteratorRef("SI", "")
    )

    LLVMSymbolIteratorRef(
        "GetSymbols",
        "Deprecated: Use #ObjectFileCopySymbolIterator() instead.",

        LLVMObjectFileRef("ObjectFile", "")
    )

    LLVMBool(
        "IsSymbolIteratorAtEnd",
        "Deprecated: Use #ObjectFileIsSymbolIteratorAtEnd() instead.",

        LLVMObjectFileRef("ObjectFile", ""),
        LLVMSymbolIteratorRef("SI", "")
    )
}