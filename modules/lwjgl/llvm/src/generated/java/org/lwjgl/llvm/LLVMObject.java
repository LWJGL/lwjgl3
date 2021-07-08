/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class LLVMObject {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CreateObjectFile          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMCreateObjectFile"),
            DisposeObjectFile         = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDisposeObjectFile"),
            GetSections               = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetSections"),
            DisposeSectionIterator    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDisposeSectionIterator"),
            IsSectionIteratorAtEnd    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMIsSectionIteratorAtEnd"),
            MoveToNextSection         = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMMoveToNextSection"),
            MoveToContainingSection   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMMoveToContainingSection"),
            GetSymbols                = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetSymbols"),
            DisposeSymbolIterator     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDisposeSymbolIterator"),
            IsSymbolIteratorAtEnd     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMIsSymbolIteratorAtEnd"),
            MoveToNextSymbol          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMMoveToNextSymbol"),
            GetSectionName            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetSectionName"),
            GetSectionSize            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetSectionSize"),
            GetSectionContents        = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetSectionContents"),
            GetSectionAddress         = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetSectionAddress"),
            GetSectionContainsSymbol  = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetSectionContainsSymbol"),
            GetRelocations            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetRelocations"),
            DisposeRelocationIterator = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDisposeRelocationIterator"),
            IsRelocationIteratorAtEnd = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMIsRelocationIteratorAtEnd"),
            MoveToNextRelocation      = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMMoveToNextRelocation"),
            GetSymbolName             = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetSymbolName"),
            GetSymbolAddress          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetSymbolAddress"),
            GetSymbolSize             = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetSymbolSize"),
            GetRelocationOffset       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetRelocationOffset"),
            GetRelocationSymbol       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetRelocationSymbol"),
            GetRelocationType         = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetRelocationType"),
            GetRelocationTypeName     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetRelocationTypeName"),
            GetRelocationValueString  = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetRelocationValueString");

    }

    protected LLVMObject() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMCreateObjectFile ] ---

    /** ObjectFile creation */
    @NativeType("LLVMObjectFileRef")
    public static long LLVMCreateObjectFile(@NativeType("LLVMMemoryBufferRef") long MemBuf) {
        long __functionAddress = Functions.CreateObjectFile;
        if (CHECKS) {
            check(MemBuf);
        }
        return invokePP(MemBuf, __functionAddress);
    }

    // --- [ LLVMDisposeObjectFile ] ---

    public static void LLVMDisposeObjectFile(@NativeType("LLVMObjectFileRef") long ObjectFile) {
        long __functionAddress = Functions.DisposeObjectFile;
        if (CHECKS) {
            check(ObjectFile);
        }
        invokePV(ObjectFile, __functionAddress);
    }

    // --- [ LLVMGetSections ] ---

    /** ObjectFile Section iterators */
    @NativeType("LLVMSectionIteratorRef")
    public static long LLVMGetSections(@NativeType("LLVMObjectFileRef") long ObjectFile) {
        long __functionAddress = Functions.GetSections;
        if (CHECKS) {
            check(ObjectFile);
        }
        return invokePP(ObjectFile, __functionAddress);
    }

    // --- [ LLVMDisposeSectionIterator ] ---

    public static void LLVMDisposeSectionIterator(@NativeType("LLVMSectionIteratorRef") long SI) {
        long __functionAddress = Functions.DisposeSectionIterator;
        if (CHECKS) {
            check(SI);
        }
        invokePV(SI, __functionAddress);
    }

    // --- [ LLVMIsSectionIteratorAtEnd ] ---

    @NativeType("LLVMBool")
    public static boolean LLVMIsSectionIteratorAtEnd(@NativeType("LLVMObjectFileRef") long ObjectFile, @NativeType("LLVMSectionIteratorRef") long SI) {
        long __functionAddress = Functions.IsSectionIteratorAtEnd;
        if (CHECKS) {
            check(ObjectFile);
            check(SI);
        }
        return invokePPI(ObjectFile, SI, __functionAddress) != 0;
    }

    // --- [ LLVMMoveToNextSection ] ---

    public static void LLVMMoveToNextSection(@NativeType("LLVMSectionIteratorRef") long SI) {
        long __functionAddress = Functions.MoveToNextSection;
        if (CHECKS) {
            check(SI);
        }
        invokePV(SI, __functionAddress);
    }

    // --- [ LLVMMoveToContainingSection ] ---

    public static void LLVMMoveToContainingSection(@NativeType("LLVMSectionIteratorRef") long Sect, @NativeType("LLVMSymbolIteratorRef") long Sym) {
        long __functionAddress = Functions.MoveToContainingSection;
        if (CHECKS) {
            check(Sect);
            check(Sym);
        }
        invokePPV(Sect, Sym, __functionAddress);
    }

    // --- [ LLVMGetSymbols ] ---

    /** ObjectFile Symbol iterators */
    @NativeType("LLVMSymbolIteratorRef")
    public static long LLVMGetSymbols(@NativeType("LLVMObjectFileRef") long ObjectFile) {
        long __functionAddress = Functions.GetSymbols;
        if (CHECKS) {
            check(ObjectFile);
        }
        return invokePP(ObjectFile, __functionAddress);
    }

    // --- [ LLVMDisposeSymbolIterator ] ---

    public static void LLVMDisposeSymbolIterator(@NativeType("LLVMSymbolIteratorRef") long SI) {
        long __functionAddress = Functions.DisposeSymbolIterator;
        if (CHECKS) {
            check(SI);
        }
        invokePV(SI, __functionAddress);
    }

    // --- [ LLVMIsSymbolIteratorAtEnd ] ---

    @NativeType("LLVMBool")
    public static boolean LLVMIsSymbolIteratorAtEnd(@NativeType("LLVMObjectFileRef") long ObjectFile, @NativeType("LLVMSymbolIteratorRef") long SI) {
        long __functionAddress = Functions.IsSymbolIteratorAtEnd;
        if (CHECKS) {
            check(ObjectFile);
            check(SI);
        }
        return invokePPI(ObjectFile, SI, __functionAddress) != 0;
    }

    // --- [ LLVMMoveToNextSymbol ] ---

    public static void LLVMMoveToNextSymbol(@NativeType("LLVMSymbolIteratorRef") long SI) {
        long __functionAddress = Functions.MoveToNextSymbol;
        if (CHECKS) {
            check(SI);
        }
        invokePV(SI, __functionAddress);
    }

    // --- [ LLVMGetSectionName ] ---

    /** Unsafe version of: {@link #LLVMGetSectionName GetSectionName} */
    public static long nLLVMGetSectionName(long SI) {
        long __functionAddress = Functions.GetSectionName;
        if (CHECKS) {
            check(SI);
        }
        return invokePP(SI, __functionAddress);
    }

    /** SectionRef accessors */
    @Nullable
    @NativeType("char const *")
    public static String LLVMGetSectionName(@NativeType("LLVMSectionIteratorRef") long SI) {
        long __result = nLLVMGetSectionName(SI);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMGetSectionSize ] ---

    @NativeType("uint64_t")
    public static long LLVMGetSectionSize(@NativeType("LLVMSectionIteratorRef") long SI) {
        long __functionAddress = Functions.GetSectionSize;
        if (CHECKS) {
            check(SI);
        }
        return invokePJ(SI, __functionAddress);
    }

    // --- [ LLVMGetSectionContents ] ---

    public static long nLLVMGetSectionContents(long SI) {
        long __functionAddress = Functions.GetSectionContents;
        if (CHECKS) {
            check(SI);
        }
        return invokePP(SI, __functionAddress);
    }

    @Nullable
    @NativeType("char const *")
    public static String LLVMGetSectionContents(@NativeType("LLVMSectionIteratorRef") long SI) {
        long __result = nLLVMGetSectionContents(SI);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMGetSectionAddress ] ---

    @NativeType("uint64_t")
    public static long LLVMGetSectionAddress(@NativeType("LLVMSectionIteratorRef") long SI) {
        long __functionAddress = Functions.GetSectionAddress;
        if (CHECKS) {
            check(SI);
        }
        return invokePJ(SI, __functionAddress);
    }

    // --- [ LLVMGetSectionContainsSymbol ] ---

    @NativeType("LLVMBool")
    public static boolean LLVMGetSectionContainsSymbol(@NativeType("LLVMSectionIteratorRef") long SI, @NativeType("LLVMSymbolIteratorRef") long Sym) {
        long __functionAddress = Functions.GetSectionContainsSymbol;
        if (CHECKS) {
            check(SI);
            check(Sym);
        }
        return invokePPI(SI, Sym, __functionAddress) != 0;
    }

    // --- [ LLVMGetRelocations ] ---

    /** Section Relocation iterators */
    @NativeType("LLVMRelocationIteratorRef")
    public static long LLVMGetRelocations(@NativeType("LLVMSectionIteratorRef") long Section) {
        long __functionAddress = Functions.GetRelocations;
        if (CHECKS) {
            check(Section);
        }
        return invokePP(Section, __functionAddress);
    }

    // --- [ LLVMDisposeRelocationIterator ] ---

    public static void LLVMDisposeRelocationIterator(@NativeType("LLVMRelocationIteratorRef") long RI) {
        long __functionAddress = Functions.DisposeRelocationIterator;
        if (CHECKS) {
            check(RI);
        }
        invokePV(RI, __functionAddress);
    }

    // --- [ LLVMIsRelocationIteratorAtEnd ] ---

    @NativeType("LLVMBool")
    public static boolean LLVMIsRelocationIteratorAtEnd(@NativeType("LLVMSectionIteratorRef") long Section, @NativeType("LLVMRelocationIteratorRef") long RI) {
        long __functionAddress = Functions.IsRelocationIteratorAtEnd;
        if (CHECKS) {
            check(Section);
            check(RI);
        }
        return invokePPI(Section, RI, __functionAddress) != 0;
    }

    // --- [ LLVMMoveToNextRelocation ] ---

    public static void LLVMMoveToNextRelocation(@NativeType("LLVMRelocationIteratorRef") long RI) {
        long __functionAddress = Functions.MoveToNextRelocation;
        if (CHECKS) {
            check(RI);
        }
        invokePV(RI, __functionAddress);
    }

    // --- [ LLVMGetSymbolName ] ---

    /** Unsafe version of: {@link #LLVMGetSymbolName GetSymbolName} */
    public static long nLLVMGetSymbolName(long SI) {
        long __functionAddress = Functions.GetSymbolName;
        if (CHECKS) {
            check(SI);
        }
        return invokePP(SI, __functionAddress);
    }

    /** SymbolRef accessors */
    @Nullable
    @NativeType("char const *")
    public static String LLVMGetSymbolName(@NativeType("LLVMSymbolIteratorRef") long SI) {
        long __result = nLLVMGetSymbolName(SI);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMGetSymbolAddress ] ---

    @NativeType("uint64_t")
    public static long LLVMGetSymbolAddress(@NativeType("LLVMSymbolIteratorRef") long SI) {
        long __functionAddress = Functions.GetSymbolAddress;
        if (CHECKS) {
            check(SI);
        }
        return invokePJ(SI, __functionAddress);
    }

    // --- [ LLVMGetSymbolSize ] ---

    @NativeType("uint64_t")
    public static long LLVMGetSymbolSize(@NativeType("LLVMSymbolIteratorRef") long SI) {
        long __functionAddress = Functions.GetSymbolSize;
        if (CHECKS) {
            check(SI);
        }
        return invokePJ(SI, __functionAddress);
    }

    // --- [ LLVMGetRelocationOffset ] ---

    /** RelocationRef accessors */
    @NativeType("uint64_t")
    public static long LLVMGetRelocationOffset(@NativeType("LLVMRelocationIteratorRef") long RI) {
        long __functionAddress = Functions.GetRelocationOffset;
        if (CHECKS) {
            check(RI);
        }
        return invokePJ(RI, __functionAddress);
    }

    // --- [ LLVMGetRelocationSymbol ] ---

    @NativeType("LLVMSymbolIteratorRef")
    public static long LLVMGetRelocationSymbol(@NativeType("LLVMRelocationIteratorRef") long RI) {
        long __functionAddress = Functions.GetRelocationSymbol;
        if (CHECKS) {
            check(RI);
        }
        return invokePP(RI, __functionAddress);
    }

    // --- [ LLVMGetRelocationType ] ---

    @NativeType("uint64_t")
    public static long LLVMGetRelocationType(@NativeType("LLVMRelocationIteratorRef") long RI) {
        long __functionAddress = Functions.GetRelocationType;
        if (CHECKS) {
            check(RI);
        }
        return invokePJ(RI, __functionAddress);
    }

    // --- [ LLVMGetRelocationTypeName ] ---

    /** Unsafe version of: {@link #LLVMGetRelocationTypeName GetRelocationTypeName} */
    public static long nLLVMGetRelocationTypeName(long RI) {
        long __functionAddress = Functions.GetRelocationTypeName;
        if (CHECKS) {
            check(RI);
        }
        return invokePP(RI, __functionAddress);
    }

    /** Caller takes ownership of returned string. */
    @Nullable
    @NativeType("char const *")
    public static String LLVMGetRelocationTypeName(@NativeType("LLVMRelocationIteratorRef") long RI) {
        long __result = nLLVMGetRelocationTypeName(RI);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMGetRelocationValueString ] ---

    /** Unsafe version of: {@link #LLVMGetRelocationValueString GetRelocationValueString} */
    public static long nLLVMGetRelocationValueString(long RI) {
        long __functionAddress = Functions.GetRelocationValueString;
        if (CHECKS) {
            check(RI);
        }
        return invokePP(RI, __functionAddress);
    }

    /** Caller takes ownership of returned string. */
    @Nullable
    @NativeType("char const *")
    public static String LLVMGetRelocationValueString(@NativeType("LLVMRelocationIteratorRef") long RI) {
        long __result = nLLVMGetRelocationValueString(RI);
        return memUTF8Safe(__result);
    }

}