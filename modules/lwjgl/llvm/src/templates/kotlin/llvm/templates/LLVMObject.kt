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

    LLVMObjectFileRef(
        "CreateObjectFile",
        "ObjectFile creation",

        LLVMMemoryBufferRef("MemBuf", "")
    )

    void(
        "DisposeObjectFile",
        "",

        LLVMObjectFileRef("ObjectFile", "")
    )

    LLVMSectionIteratorRef(
        "GetSections",
        "ObjectFile Section iterators",

        LLVMObjectFileRef("ObjectFile", "")
    )

    void(
        "DisposeSectionIterator",
        "",

        LLVMSectionIteratorRef("SI", "")
    )

    LLVMBool(
        "IsSectionIteratorAtEnd",
        "",

        LLVMObjectFileRef("ObjectFile", ""),
        LLVMSectionIteratorRef("SI", "")
    )

    void(
        "MoveToNextSection",
        "",

        LLVMSectionIteratorRef("SI", "")
    )

    void(
        "MoveToContainingSection",
        "",

        LLVMSectionIteratorRef("Sect", ""),
        LLVMSymbolIteratorRef("Sym", "")
    )

    LLVMSymbolIteratorRef(
        "GetSymbols",
        "ObjectFile Symbol iterators",

        LLVMObjectFileRef("ObjectFile", "")
    )

    void(
        "DisposeSymbolIterator",
        "",

        LLVMSymbolIteratorRef("SI", "")
    )

    LLVMBool(
        "IsSymbolIteratorAtEnd",
        "",

        LLVMObjectFileRef("ObjectFile", ""),
        LLVMSymbolIteratorRef("SI", "")
    )

    void(
        "MoveToNextSymbol",
        "",

        LLVMSymbolIteratorRef("SI", "")
    )

    charUTF8.const.p(
        "GetSectionName",
        "SectionRef accessors",

        LLVMSectionIteratorRef("SI", "")
    )

    uint64_t(
        "GetSectionSize",
        "",

        LLVMSectionIteratorRef("SI", "")
    )

    charUTF8.const.p(
        "GetSectionContents",
        "",

        LLVMSectionIteratorRef("SI", "")
    )

    uint64_t(
        "GetSectionAddress",
        "",

        LLVMSectionIteratorRef("SI", "")
    )

    LLVMBool(
        "GetSectionContainsSymbol",
        "",

        LLVMSectionIteratorRef("SI", ""),
        LLVMSymbolIteratorRef("Sym", "")
    )

    LLVMRelocationIteratorRef(
        "GetRelocations",
        "Section Relocation iterators",

        LLVMSectionIteratorRef("Section", "")
    )

    void(
        "DisposeRelocationIterator",
        "",

        LLVMRelocationIteratorRef("RI", "")
    )

    LLVMBool(
        "IsRelocationIteratorAtEnd",
        "",

        LLVMSectionIteratorRef("Section", ""),
        LLVMRelocationIteratorRef("RI", "")
    )

    void(
        "MoveToNextRelocation",
        "",

        LLVMRelocationIteratorRef("RI", "")
    )

    charUTF8.const.p(
        "GetSymbolName",
        "SymbolRef accessors",

        LLVMSymbolIteratorRef("SI", "")
    )

    uint64_t(
        "GetSymbolAddress",
        "",

        LLVMSymbolIteratorRef("SI", "")
    )

    uint64_t(
        "GetSymbolSize",
        "",

        LLVMSymbolIteratorRef("SI", "")
    )

    uint64_t(
        "GetRelocationOffset",
        "RelocationRef accessors",

        LLVMRelocationIteratorRef("RI", "")
    )

    LLVMSymbolIteratorRef(
        "GetRelocationSymbol",
        "",

        LLVMRelocationIteratorRef("RI", "")
    )

    uint64_t(
        "GetRelocationType",
        "",

        LLVMRelocationIteratorRef("RI", "")
    )

    charUTF8.const.p(
        "GetRelocationTypeName",
        "Caller takes ownership of returned string.",

        LLVMRelocationIteratorRef("RI", "")
    )

    charUTF8.const.p(
        "GetRelocationValueString",
        "Caller takes ownership of returned string.",

        LLVMRelocationIteratorRef("RI", "")
    )
}