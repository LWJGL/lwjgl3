/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class LLVMObject {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CreateBinary                          = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMCreateBinary"),
            DisposeBinary                         = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDisposeBinary"),
            BinaryCopyMemoryBuffer                = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMBinaryCopyMemoryBuffer"),
            BinaryGetType                         = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMBinaryGetType"),
            MachOUniversalBinaryCopyObjectForArch = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMMachOUniversalBinaryCopyObjectForArch"),
            ObjectFileCopySectionIterator         = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMObjectFileCopySectionIterator"),
            ObjectFileIsSectionIteratorAtEnd      = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMObjectFileIsSectionIteratorAtEnd"),
            ObjectFileCopySymbolIterator          = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMObjectFileCopySymbolIterator"),
            ObjectFileIsSymbolIteratorAtEnd       = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMObjectFileIsSymbolIteratorAtEnd"),
            DisposeSectionIterator                = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDisposeSectionIterator"),
            MoveToNextSection                     = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMMoveToNextSection"),
            MoveToContainingSection               = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMMoveToContainingSection"),
            DisposeSymbolIterator                 = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDisposeSymbolIterator"),
            MoveToNextSymbol                      = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMMoveToNextSymbol"),
            GetSectionName                        = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMGetSectionName"),
            GetSectionSize                        = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMGetSectionSize"),
            GetSectionContents                    = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMGetSectionContents"),
            GetSectionAddress                     = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMGetSectionAddress"),
            GetSectionContainsSymbol              = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMGetSectionContainsSymbol"),
            GetRelocations                        = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMGetRelocations"),
            DisposeRelocationIterator             = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDisposeRelocationIterator"),
            IsRelocationIteratorAtEnd             = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMIsRelocationIteratorAtEnd"),
            MoveToNextRelocation                  = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMMoveToNextRelocation"),
            GetSymbolName                         = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMGetSymbolName"),
            GetSymbolAddress                      = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMGetSymbolAddress"),
            GetSymbolSize                         = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMGetSymbolSize"),
            GetRelocationOffset                   = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMGetRelocationOffset"),
            GetRelocationSymbol                   = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMGetRelocationSymbol"),
            GetRelocationType                     = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMGetRelocationType"),
            GetRelocationTypeName                 = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMGetRelocationTypeName"),
            GetRelocationValueString              = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMGetRelocationValueString"),
            CreateObjectFile                      = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMCreateObjectFile"),
            DisposeObjectFile                     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDisposeObjectFile"),
            GetSections                           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetSections"),
            IsSectionIteratorAtEnd                = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMIsSectionIteratorAtEnd"),
            GetSymbols                            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetSymbols"),
            IsSymbolIteratorAtEnd                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMIsSymbolIteratorAtEnd");

    }

    public static final int
        LLVMBinaryTypeArchive              = 0,
        LLVMBinaryTypeMachOUniversalBinary = 1,
        LLVMBinaryTypeCOFFImportFile       = 2,
        LLVMBinaryTypeIR                   = 3,
        LLVMBinaryTypeWinRes               = 4,
        LLVMBinaryTypeCOFF                 = 5,
        LLVMBinaryTypeELF32L               = 6,
        LLVMBinaryTypeELF32B               = 7,
        LLVMBinaryTypeELF64L               = 8,
        LLVMBinaryTypeELF64B               = 9,
        LLVMBinaryTypeMachO32L             = 10,
        LLVMBinaryTypeMachO32B             = 11,
        LLVMBinaryTypeMachO64L             = 12,
        LLVMBinaryTypeMachO64B             = 13,
        LLVMBinaryTypeWasm                 = 14,
        LLVMBinaryTypeOffload              = 15;

    protected LLVMObject() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMCreateBinary ] ---

    /** {@code LLVMBinaryRef LLVMCreateBinary(LLVMMemoryBufferRef MemBuf, LLVMContextRef Context, char ** ErrorMessage)} */
    public static long nLLVMCreateBinary(long MemBuf, long Context, long ErrorMessage) {
        long __functionAddress = Functions.CreateBinary;
        if (CHECKS) {
            check(__functionAddress);
            check(MemBuf);
        }
        return invokePPPP(MemBuf, Context, ErrorMessage, __functionAddress);
    }

    /** {@code LLVMBinaryRef LLVMCreateBinary(LLVMMemoryBufferRef MemBuf, LLVMContextRef Context, char ** ErrorMessage)} */
    @NativeType("LLVMBinaryRef")
    public static long LLVMCreateBinary(@NativeType("LLVMMemoryBufferRef") long MemBuf, @NativeType("LLVMContextRef") long Context, @NativeType("char **") PointerBuffer ErrorMessage) {
        if (CHECKS) {
            check(ErrorMessage, 1);
        }
        return nLLVMCreateBinary(MemBuf, Context, memAddress(ErrorMessage));
    }

    // --- [ LLVMDisposeBinary ] ---

    /** {@code void LLVMDisposeBinary(LLVMBinaryRef BR)} */
    public static void LLVMDisposeBinary(@NativeType("LLVMBinaryRef") long BR) {
        long __functionAddress = Functions.DisposeBinary;
        if (CHECKS) {
            check(__functionAddress);
            check(BR);
        }
        invokePV(BR, __functionAddress);
    }

    // --- [ LLVMBinaryCopyMemoryBuffer ] ---

    /** {@code LLVMMemoryBufferRef LLVMBinaryCopyMemoryBuffer(LLVMBinaryRef BR)} */
    @NativeType("LLVMMemoryBufferRef")
    public static long LLVMBinaryCopyMemoryBuffer(@NativeType("LLVMBinaryRef") long BR) {
        long __functionAddress = Functions.BinaryCopyMemoryBuffer;
        if (CHECKS) {
            check(__functionAddress);
            check(BR);
        }
        return invokePP(BR, __functionAddress);
    }

    // --- [ LLVMBinaryGetType ] ---

    /** {@code LLVMBinaryType LLVMBinaryGetType(LLVMBinaryRef BR)} */
    @NativeType("LLVMBinaryType")
    public static int LLVMBinaryGetType(@NativeType("LLVMBinaryRef") long BR) {
        long __functionAddress = Functions.BinaryGetType;
        if (CHECKS) {
            check(__functionAddress);
            check(BR);
        }
        return invokePI(BR, __functionAddress);
    }

    // --- [ LLVMMachOUniversalBinaryCopyObjectForArch ] ---

    /** {@code LLVMBinaryRef LLVMMachOUniversalBinaryCopyObjectForArch(LLVMBinaryRef BR, char const * Arch, size_t ArchLen, char ** ErrorMessage)} */
    public static long nLLVMMachOUniversalBinaryCopyObjectForArch(long BR, long Arch, long ArchLen, long ErrorMessage) {
        long __functionAddress = Functions.MachOUniversalBinaryCopyObjectForArch;
        if (CHECKS) {
            check(__functionAddress);
            check(BR);
        }
        return invokePPPPP(BR, Arch, ArchLen, ErrorMessage, __functionAddress);
    }

    /** {@code LLVMBinaryRef LLVMMachOUniversalBinaryCopyObjectForArch(LLVMBinaryRef BR, char const * Arch, size_t ArchLen, char ** ErrorMessage)} */
    @NativeType("LLVMBinaryRef")
    public static long LLVMMachOUniversalBinaryCopyObjectForArch(@NativeType("LLVMBinaryRef") long BR, @NativeType("char const *") ByteBuffer Arch, @NativeType("char **") PointerBuffer ErrorMessage) {
        if (CHECKS) {
            check(ErrorMessage, 1);
        }
        return nLLVMMachOUniversalBinaryCopyObjectForArch(BR, memAddress(Arch), Arch.remaining(), memAddress(ErrorMessage));
    }

    /** {@code LLVMBinaryRef LLVMMachOUniversalBinaryCopyObjectForArch(LLVMBinaryRef BR, char const * Arch, size_t ArchLen, char ** ErrorMessage)} */
    @NativeType("LLVMBinaryRef")
    public static long LLVMMachOUniversalBinaryCopyObjectForArch(@NativeType("LLVMBinaryRef") long BR, @NativeType("char const *") CharSequence Arch, @NativeType("char **") PointerBuffer ErrorMessage) {
        if (CHECKS) {
            check(ErrorMessage, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int ArchEncodedLength = stack.nUTF8(Arch, false);
            long ArchEncoded = stack.getPointerAddress();
            return nLLVMMachOUniversalBinaryCopyObjectForArch(BR, ArchEncoded, ArchEncodedLength, memAddress(ErrorMessage));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMObjectFileCopySectionIterator ] ---

    /** {@code LLVMSectionIteratorRef LLVMObjectFileCopySectionIterator(LLVMBinaryRef BR)} */
    @NativeType("LLVMSectionIteratorRef")
    public static long LLVMObjectFileCopySectionIterator(@NativeType("LLVMBinaryRef") long BR) {
        long __functionAddress = Functions.ObjectFileCopySectionIterator;
        if (CHECKS) {
            check(__functionAddress);
            check(BR);
        }
        return invokePP(BR, __functionAddress);
    }

    // --- [ LLVMObjectFileIsSectionIteratorAtEnd ] ---

    /** {@code LLVMBool LLVMObjectFileIsSectionIteratorAtEnd(LLVMBinaryRef BR, LLVMSectionIteratorRef SI)} */
    @NativeType("LLVMBool")
    public static boolean LLVMObjectFileIsSectionIteratorAtEnd(@NativeType("LLVMBinaryRef") long BR, @NativeType("LLVMSectionIteratorRef") long SI) {
        long __functionAddress = Functions.ObjectFileIsSectionIteratorAtEnd;
        if (CHECKS) {
            check(__functionAddress);
            check(BR);
            check(SI);
        }
        return invokePPI(BR, SI, __functionAddress) != 0;
    }

    // --- [ LLVMObjectFileCopySymbolIterator ] ---

    /** {@code LLVMSymbolIteratorRef LLVMObjectFileCopySymbolIterator(LLVMBinaryRef BR)} */
    @NativeType("LLVMSymbolIteratorRef")
    public static long LLVMObjectFileCopySymbolIterator(@NativeType("LLVMBinaryRef") long BR) {
        long __functionAddress = Functions.ObjectFileCopySymbolIterator;
        if (CHECKS) {
            check(__functionAddress);
            check(BR);
        }
        return invokePP(BR, __functionAddress);
    }

    // --- [ LLVMObjectFileIsSymbolIteratorAtEnd ] ---

    /** {@code LLVMBool LLVMObjectFileIsSymbolIteratorAtEnd(LLVMBinaryRef BR, LLVMSymbolIteratorRef SI)} */
    @NativeType("LLVMBool")
    public static boolean LLVMObjectFileIsSymbolIteratorAtEnd(@NativeType("LLVMBinaryRef") long BR, @NativeType("LLVMSymbolIteratorRef") long SI) {
        long __functionAddress = Functions.ObjectFileIsSymbolIteratorAtEnd;
        if (CHECKS) {
            check(__functionAddress);
            check(BR);
            check(SI);
        }
        return invokePPI(BR, SI, __functionAddress) != 0;
    }

    // --- [ LLVMDisposeSectionIterator ] ---

    /** {@code void LLVMDisposeSectionIterator(LLVMSectionIteratorRef SI)} */
    public static void LLVMDisposeSectionIterator(@NativeType("LLVMSectionIteratorRef") long SI) {
        long __functionAddress = Functions.DisposeSectionIterator;
        if (CHECKS) {
            check(__functionAddress);
            check(SI);
        }
        invokePV(SI, __functionAddress);
    }

    // --- [ LLVMMoveToNextSection ] ---

    /** {@code void LLVMMoveToNextSection(LLVMSectionIteratorRef SI)} */
    public static void LLVMMoveToNextSection(@NativeType("LLVMSectionIteratorRef") long SI) {
        long __functionAddress = Functions.MoveToNextSection;
        if (CHECKS) {
            check(__functionAddress);
            check(SI);
        }
        invokePV(SI, __functionAddress);
    }

    // --- [ LLVMMoveToContainingSection ] ---

    /** {@code void LLVMMoveToContainingSection(LLVMSectionIteratorRef Sect, LLVMSymbolIteratorRef Sym)} */
    public static void LLVMMoveToContainingSection(@NativeType("LLVMSectionIteratorRef") long Sect, @NativeType("LLVMSymbolIteratorRef") long Sym) {
        long __functionAddress = Functions.MoveToContainingSection;
        if (CHECKS) {
            check(__functionAddress);
            check(Sect);
            check(Sym);
        }
        invokePPV(Sect, Sym, __functionAddress);
    }

    // --- [ LLVMDisposeSymbolIterator ] ---

    /** {@code void LLVMDisposeSymbolIterator(LLVMSymbolIteratorRef SI)} */
    public static void LLVMDisposeSymbolIterator(@NativeType("LLVMSymbolIteratorRef") long SI) {
        long __functionAddress = Functions.DisposeSymbolIterator;
        if (CHECKS) {
            check(__functionAddress);
            check(SI);
        }
        invokePV(SI, __functionAddress);
    }

    // --- [ LLVMMoveToNextSymbol ] ---

    /** {@code void LLVMMoveToNextSymbol(LLVMSymbolIteratorRef SI)} */
    public static void LLVMMoveToNextSymbol(@NativeType("LLVMSymbolIteratorRef") long SI) {
        long __functionAddress = Functions.MoveToNextSymbol;
        if (CHECKS) {
            check(__functionAddress);
            check(SI);
        }
        invokePV(SI, __functionAddress);
    }

    // --- [ LLVMGetSectionName ] ---

    /** {@code char const * LLVMGetSectionName(LLVMSectionIteratorRef SI)} */
    public static long nLLVMGetSectionName(long SI) {
        long __functionAddress = Functions.GetSectionName;
        if (CHECKS) {
            check(__functionAddress);
            check(SI);
        }
        return invokePP(SI, __functionAddress);
    }

    /** {@code char const * LLVMGetSectionName(LLVMSectionIteratorRef SI)} */
    @NativeType("char const *")
    public static @Nullable String LLVMGetSectionName(@NativeType("LLVMSectionIteratorRef") long SI) {
        long __result = nLLVMGetSectionName(SI);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMGetSectionSize ] ---

    /** {@code uint64_t LLVMGetSectionSize(LLVMSectionIteratorRef SI)} */
    @NativeType("uint64_t")
    public static long LLVMGetSectionSize(@NativeType("LLVMSectionIteratorRef") long SI) {
        long __functionAddress = Functions.GetSectionSize;
        if (CHECKS) {
            check(__functionAddress);
            check(SI);
        }
        return invokePJ(SI, __functionAddress);
    }

    // --- [ LLVMGetSectionContents ] ---

    /** {@code char const * LLVMGetSectionContents(LLVMSectionIteratorRef SI)} */
    public static long nLLVMGetSectionContents(long SI) {
        long __functionAddress = Functions.GetSectionContents;
        if (CHECKS) {
            check(__functionAddress);
            check(SI);
        }
        return invokePP(SI, __functionAddress);
    }

    /** {@code char const * LLVMGetSectionContents(LLVMSectionIteratorRef SI)} */
    @NativeType("char const *")
    public static @Nullable String LLVMGetSectionContents(@NativeType("LLVMSectionIteratorRef") long SI) {
        long __result = nLLVMGetSectionContents(SI);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMGetSectionAddress ] ---

    /** {@code uint64_t LLVMGetSectionAddress(LLVMSectionIteratorRef SI)} */
    @NativeType("uint64_t")
    public static long LLVMGetSectionAddress(@NativeType("LLVMSectionIteratorRef") long SI) {
        long __functionAddress = Functions.GetSectionAddress;
        if (CHECKS) {
            check(__functionAddress);
            check(SI);
        }
        return invokePJ(SI, __functionAddress);
    }

    // --- [ LLVMGetSectionContainsSymbol ] ---

    /** {@code LLVMBool LLVMGetSectionContainsSymbol(LLVMSectionIteratorRef SI, LLVMSymbolIteratorRef Sym)} */
    @NativeType("LLVMBool")
    public static boolean LLVMGetSectionContainsSymbol(@NativeType("LLVMSectionIteratorRef") long SI, @NativeType("LLVMSymbolIteratorRef") long Sym) {
        long __functionAddress = Functions.GetSectionContainsSymbol;
        if (CHECKS) {
            check(__functionAddress);
            check(SI);
            check(Sym);
        }
        return invokePPI(SI, Sym, __functionAddress) != 0;
    }

    // --- [ LLVMGetRelocations ] ---

    /** {@code LLVMRelocationIteratorRef LLVMGetRelocations(LLVMSectionIteratorRef Section)} */
    @NativeType("LLVMRelocationIteratorRef")
    public static long LLVMGetRelocations(@NativeType("LLVMSectionIteratorRef") long Section) {
        long __functionAddress = Functions.GetRelocations;
        if (CHECKS) {
            check(__functionAddress);
            check(Section);
        }
        return invokePP(Section, __functionAddress);
    }

    // --- [ LLVMDisposeRelocationIterator ] ---

    /** {@code void LLVMDisposeRelocationIterator(LLVMRelocationIteratorRef RI)} */
    public static void LLVMDisposeRelocationIterator(@NativeType("LLVMRelocationIteratorRef") long RI) {
        long __functionAddress = Functions.DisposeRelocationIterator;
        if (CHECKS) {
            check(__functionAddress);
            check(RI);
        }
        invokePV(RI, __functionAddress);
    }

    // --- [ LLVMIsRelocationIteratorAtEnd ] ---

    /** {@code LLVMBool LLVMIsRelocationIteratorAtEnd(LLVMSectionIteratorRef Section, LLVMRelocationIteratorRef RI)} */
    @NativeType("LLVMBool")
    public static boolean LLVMIsRelocationIteratorAtEnd(@NativeType("LLVMSectionIteratorRef") long Section, @NativeType("LLVMRelocationIteratorRef") long RI) {
        long __functionAddress = Functions.IsRelocationIteratorAtEnd;
        if (CHECKS) {
            check(__functionAddress);
            check(Section);
            check(RI);
        }
        return invokePPI(Section, RI, __functionAddress) != 0;
    }

    // --- [ LLVMMoveToNextRelocation ] ---

    /** {@code void LLVMMoveToNextRelocation(LLVMRelocationIteratorRef RI)} */
    public static void LLVMMoveToNextRelocation(@NativeType("LLVMRelocationIteratorRef") long RI) {
        long __functionAddress = Functions.MoveToNextRelocation;
        if (CHECKS) {
            check(__functionAddress);
            check(RI);
        }
        invokePV(RI, __functionAddress);
    }

    // --- [ LLVMGetSymbolName ] ---

    /** {@code char const * LLVMGetSymbolName(LLVMSymbolIteratorRef SI)} */
    public static long nLLVMGetSymbolName(long SI) {
        long __functionAddress = Functions.GetSymbolName;
        if (CHECKS) {
            check(__functionAddress);
            check(SI);
        }
        return invokePP(SI, __functionAddress);
    }

    /** {@code char const * LLVMGetSymbolName(LLVMSymbolIteratorRef SI)} */
    @NativeType("char const *")
    public static @Nullable String LLVMGetSymbolName(@NativeType("LLVMSymbolIteratorRef") long SI) {
        long __result = nLLVMGetSymbolName(SI);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMGetSymbolAddress ] ---

    /** {@code uint64_t LLVMGetSymbolAddress(LLVMSymbolIteratorRef SI)} */
    @NativeType("uint64_t")
    public static long LLVMGetSymbolAddress(@NativeType("LLVMSymbolIteratorRef") long SI) {
        long __functionAddress = Functions.GetSymbolAddress;
        if (CHECKS) {
            check(__functionAddress);
            check(SI);
        }
        return invokePJ(SI, __functionAddress);
    }

    // --- [ LLVMGetSymbolSize ] ---

    /** {@code uint64_t LLVMGetSymbolSize(LLVMSymbolIteratorRef SI)} */
    @NativeType("uint64_t")
    public static long LLVMGetSymbolSize(@NativeType("LLVMSymbolIteratorRef") long SI) {
        long __functionAddress = Functions.GetSymbolSize;
        if (CHECKS) {
            check(__functionAddress);
            check(SI);
        }
        return invokePJ(SI, __functionAddress);
    }

    // --- [ LLVMGetRelocationOffset ] ---

    /** {@code uint64_t LLVMGetRelocationOffset(LLVMRelocationIteratorRef RI)} */
    @NativeType("uint64_t")
    public static long LLVMGetRelocationOffset(@NativeType("LLVMRelocationIteratorRef") long RI) {
        long __functionAddress = Functions.GetRelocationOffset;
        if (CHECKS) {
            check(__functionAddress);
            check(RI);
        }
        return invokePJ(RI, __functionAddress);
    }

    // --- [ LLVMGetRelocationSymbol ] ---

    /** {@code LLVMSymbolIteratorRef LLVMGetRelocationSymbol(LLVMRelocationIteratorRef RI)} */
    @NativeType("LLVMSymbolIteratorRef")
    public static long LLVMGetRelocationSymbol(@NativeType("LLVMRelocationIteratorRef") long RI) {
        long __functionAddress = Functions.GetRelocationSymbol;
        if (CHECKS) {
            check(__functionAddress);
            check(RI);
        }
        return invokePP(RI, __functionAddress);
    }

    // --- [ LLVMGetRelocationType ] ---

    /** {@code uint64_t LLVMGetRelocationType(LLVMRelocationIteratorRef RI)} */
    @NativeType("uint64_t")
    public static long LLVMGetRelocationType(@NativeType("LLVMRelocationIteratorRef") long RI) {
        long __functionAddress = Functions.GetRelocationType;
        if (CHECKS) {
            check(__functionAddress);
            check(RI);
        }
        return invokePJ(RI, __functionAddress);
    }

    // --- [ LLVMGetRelocationTypeName ] ---

    /** {@code char const * LLVMGetRelocationTypeName(LLVMRelocationIteratorRef RI)} */
    public static long nLLVMGetRelocationTypeName(long RI) {
        long __functionAddress = Functions.GetRelocationTypeName;
        if (CHECKS) {
            check(__functionAddress);
            check(RI);
        }
        return invokePP(RI, __functionAddress);
    }

    /** {@code char const * LLVMGetRelocationTypeName(LLVMRelocationIteratorRef RI)} */
    @NativeType("char const *")
    public static @Nullable String LLVMGetRelocationTypeName(@NativeType("LLVMRelocationIteratorRef") long RI) {
        long __result = nLLVMGetRelocationTypeName(RI);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMGetRelocationValueString ] ---

    /** {@code char const * LLVMGetRelocationValueString(LLVMRelocationIteratorRef RI)} */
    public static long nLLVMGetRelocationValueString(long RI) {
        long __functionAddress = Functions.GetRelocationValueString;
        if (CHECKS) {
            check(__functionAddress);
            check(RI);
        }
        return invokePP(RI, __functionAddress);
    }

    /** {@code char const * LLVMGetRelocationValueString(LLVMRelocationIteratorRef RI)} */
    @NativeType("char const *")
    public static @Nullable String LLVMGetRelocationValueString(@NativeType("LLVMRelocationIteratorRef") long RI) {
        long __result = nLLVMGetRelocationValueString(RI);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMCreateObjectFile ] ---

    /** {@code LLVMObjectFileRef LLVMCreateObjectFile(LLVMMemoryBufferRef MemBuf)} */
    @NativeType("LLVMObjectFileRef")
    public static long LLVMCreateObjectFile(@NativeType("LLVMMemoryBufferRef") long MemBuf) {
        long __functionAddress = Functions.CreateObjectFile;
        if (CHECKS) {
            check(MemBuf);
        }
        return invokePP(MemBuf, __functionAddress);
    }

    // --- [ LLVMDisposeObjectFile ] ---

    /** {@code void LLVMDisposeObjectFile(LLVMObjectFileRef ObjectFile)} */
    public static void LLVMDisposeObjectFile(@NativeType("LLVMObjectFileRef") long ObjectFile) {
        long __functionAddress = Functions.DisposeObjectFile;
        if (CHECKS) {
            check(ObjectFile);
        }
        invokePV(ObjectFile, __functionAddress);
    }

    // --- [ LLVMGetSections ] ---

    /** {@code LLVMSectionIteratorRef LLVMGetSections(LLVMObjectFileRef ObjectFile)} */
    @NativeType("LLVMSectionIteratorRef")
    public static long LLVMGetSections(@NativeType("LLVMObjectFileRef") long ObjectFile) {
        long __functionAddress = Functions.GetSections;
        if (CHECKS) {
            check(ObjectFile);
        }
        return invokePP(ObjectFile, __functionAddress);
    }

    // --- [ LLVMIsSectionIteratorAtEnd ] ---

    /** {@code LLVMBool LLVMIsSectionIteratorAtEnd(LLVMObjectFileRef ObjectFile, LLVMSectionIteratorRef SI)} */
    @NativeType("LLVMBool")
    public static boolean LLVMIsSectionIteratorAtEnd(@NativeType("LLVMObjectFileRef") long ObjectFile, @NativeType("LLVMSectionIteratorRef") long SI) {
        long __functionAddress = Functions.IsSectionIteratorAtEnd;
        if (CHECKS) {
            check(ObjectFile);
            check(SI);
        }
        return invokePPI(ObjectFile, SI, __functionAddress) != 0;
    }

    // --- [ LLVMGetSymbols ] ---

    /** {@code LLVMSymbolIteratorRef LLVMGetSymbols(LLVMObjectFileRef ObjectFile)} */
    @NativeType("LLVMSymbolIteratorRef")
    public static long LLVMGetSymbols(@NativeType("LLVMObjectFileRef") long ObjectFile) {
        long __functionAddress = Functions.GetSymbols;
        if (CHECKS) {
            check(ObjectFile);
        }
        return invokePP(ObjectFile, __functionAddress);
    }

    // --- [ LLVMIsSymbolIteratorAtEnd ] ---

    /** {@code LLVMBool LLVMIsSymbolIteratorAtEnd(LLVMObjectFileRef ObjectFile, LLVMSymbolIteratorRef SI)} */
    @NativeType("LLVMBool")
    public static boolean LLVMIsSymbolIteratorAtEnd(@NativeType("LLVMObjectFileRef") long ObjectFile, @NativeType("LLVMSymbolIteratorRef") long SI) {
        long __functionAddress = Functions.IsSymbolIteratorAtEnd;
        if (CHECKS) {
            check(ObjectFile);
            check(SI);
        }
        return invokePPI(ObjectFile, SI, __functionAddress) != 0;
    }

}