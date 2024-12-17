/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class LLVMRemarks {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            RemarkStringGetData             = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemarkStringGetData"),
            RemarkStringGetLen              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemarkStringGetLen"),
            RemarkDebugLocGetSourceFilePath = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemarkDebugLocGetSourceFilePath"),
            RemarkDebugLocGetSourceLine     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemarkDebugLocGetSourceLine"),
            RemarkDebugLocGetSourceColumn   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemarkDebugLocGetSourceColumn"),
            RemarkArgGetKey                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemarkArgGetKey"),
            RemarkArgGetValue               = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemarkArgGetValue"),
            RemarkArgGetDebugLoc            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemarkArgGetDebugLoc"),
            RemarkEntryDispose              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemarkEntryDispose"),
            RemarkEntryGetType              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemarkEntryGetType"),
            RemarkEntryGetPassName          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemarkEntryGetPassName"),
            RemarkEntryGetRemarkName        = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemarkEntryGetRemarkName"),
            RemarkEntryGetFunctionName      = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemarkEntryGetFunctionName"),
            RemarkEntryGetDebugLoc          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemarkEntryGetDebugLoc"),
            RemarkEntryGetHotness           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemarkEntryGetHotness"),
            RemarkEntryGetNumArgs           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemarkEntryGetNumArgs"),
            RemarkEntryGetFirstArg          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemarkEntryGetFirstArg"),
            RemarkEntryGetNextArg           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemarkEntryGetNextArg"),
            RemarkParserCreateYAML          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemarkParserCreateYAML"),
            RemarkParserCreateBitstream     = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMRemarkParserCreateBitstream"),
            RemarkParserGetNext             = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemarkParserGetNext"),
            RemarkParserHasError            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemarkParserHasError"),
            RemarkParserGetErrorMessage     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemarkParserGetErrorMessage"),
            RemarkParserDispose             = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemarkParserDispose"),
            RemarkVersion                   = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMRemarkVersion");

    }

    public static final int REMARKS_API_VERSION = 1;

    public static final int
        LLVMRemarkTypeUnknown           = 0,
        LLVMRemarkTypePassed            = 1,
        LLVMRemarkTypeMissed            = 2,
        LLVMRemarkTypeAnalysis          = 3,
        LLVMRemarkTypeAnalysisFPCommute = 4,
        LLVMRemarkTypeAnalysisAliasing  = 5,
        LLVMRemarkTypeFailure           = 6;

    protected LLVMRemarks() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMRemarkStringGetData ] ---

    /** {@code char const * LLVMRemarkStringGetData(LLVMRemarkStringRef String)} */
    public static long nLLVMRemarkStringGetData(long String) {
        long __functionAddress = Functions.RemarkStringGetData;
        if (CHECKS) {
            check(String);
        }
        return invokePP(String, __functionAddress);
    }

    /** {@code char const * LLVMRemarkStringGetData(LLVMRemarkStringRef String)} */
    @NativeType("char const *")
    public static @Nullable String LLVMRemarkStringGetData(@NativeType("LLVMRemarkStringRef") long String) {
        long __result = nLLVMRemarkStringGetData(String);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMRemarkStringGetLen ] ---

    /** {@code uint32_t LLVMRemarkStringGetLen(LLVMRemarkStringRef String)} */
    @NativeType("uint32_t")
    public static int LLVMRemarkStringGetLen(@NativeType("LLVMRemarkStringRef") long String) {
        long __functionAddress = Functions.RemarkStringGetLen;
        if (CHECKS) {
            check(String);
        }
        return invokePI(String, __functionAddress);
    }

    // --- [ LLVMRemarkDebugLocGetSourceFilePath ] ---

    /** {@code LLVMRemarkStringRef LLVMRemarkDebugLocGetSourceFilePath(LLVMRemarkDebugLocRef DL)} */
    @NativeType("LLVMRemarkStringRef")
    public static long LLVMRemarkDebugLocGetSourceFilePath(@NativeType("LLVMRemarkDebugLocRef") long DL) {
        long __functionAddress = Functions.RemarkDebugLocGetSourceFilePath;
        if (CHECKS) {
            check(DL);
        }
        return invokePP(DL, __functionAddress);
    }

    // --- [ LLVMRemarkDebugLocGetSourceLine ] ---

    /** {@code uint32_t LLVMRemarkDebugLocGetSourceLine(LLVMRemarkDebugLocRef DL)} */
    @NativeType("uint32_t")
    public static int LLVMRemarkDebugLocGetSourceLine(@NativeType("LLVMRemarkDebugLocRef") long DL) {
        long __functionAddress = Functions.RemarkDebugLocGetSourceLine;
        if (CHECKS) {
            check(DL);
        }
        return invokePI(DL, __functionAddress);
    }

    // --- [ LLVMRemarkDebugLocGetSourceColumn ] ---

    /** {@code uint32_t LLVMRemarkDebugLocGetSourceColumn(LLVMRemarkDebugLocRef DL)} */
    @NativeType("uint32_t")
    public static int LLVMRemarkDebugLocGetSourceColumn(@NativeType("LLVMRemarkDebugLocRef") long DL) {
        long __functionAddress = Functions.RemarkDebugLocGetSourceColumn;
        if (CHECKS) {
            check(DL);
        }
        return invokePI(DL, __functionAddress);
    }

    // --- [ LLVMRemarkArgGetKey ] ---

    /** {@code LLVMRemarkStringRef LLVMRemarkArgGetKey(LLVMRemarkArgRef Arg)} */
    @NativeType("LLVMRemarkStringRef")
    public static long LLVMRemarkArgGetKey(@NativeType("LLVMRemarkArgRef") long Arg) {
        long __functionAddress = Functions.RemarkArgGetKey;
        if (CHECKS) {
            check(Arg);
        }
        return invokePP(Arg, __functionAddress);
    }

    // --- [ LLVMRemarkArgGetValue ] ---

    /** {@code LLVMRemarkStringRef LLVMRemarkArgGetValue(LLVMRemarkArgRef Arg)} */
    @NativeType("LLVMRemarkStringRef")
    public static long LLVMRemarkArgGetValue(@NativeType("LLVMRemarkArgRef") long Arg) {
        long __functionAddress = Functions.RemarkArgGetValue;
        if (CHECKS) {
            check(Arg);
        }
        return invokePP(Arg, __functionAddress);
    }

    // --- [ LLVMRemarkArgGetDebugLoc ] ---

    /** {@code LLVMRemarkDebugLocRef LLVMRemarkArgGetDebugLoc(LLVMRemarkArgRef Arg)} */
    @NativeType("LLVMRemarkDebugLocRef")
    public static long LLVMRemarkArgGetDebugLoc(@NativeType("LLVMRemarkArgRef") long Arg) {
        long __functionAddress = Functions.RemarkArgGetDebugLoc;
        if (CHECKS) {
            check(Arg);
        }
        return invokePP(Arg, __functionAddress);
    }

    // --- [ LLVMRemarkEntryDispose ] ---

    /** {@code void LLVMRemarkEntryDispose(LLVMRemarkEntryRef Remark)} */
    public static void LLVMRemarkEntryDispose(@NativeType("LLVMRemarkEntryRef") long Remark) {
        long __functionAddress = Functions.RemarkEntryDispose;
        if (CHECKS) {
            check(Remark);
        }
        invokePV(Remark, __functionAddress);
    }

    // --- [ LLVMRemarkEntryGetType ] ---

    /** {@code enum LLVMRemarkType LLVMRemarkEntryGetType(LLVMRemarkEntryRef Remark)} */
    @NativeType("enum LLVMRemarkType")
    public static int LLVMRemarkEntryGetType(@NativeType("LLVMRemarkEntryRef") long Remark) {
        long __functionAddress = Functions.RemarkEntryGetType;
        if (CHECKS) {
            check(Remark);
        }
        return invokePI(Remark, __functionAddress);
    }

    // --- [ LLVMRemarkEntryGetPassName ] ---

    /** {@code LLVMRemarkStringRef LLVMRemarkEntryGetPassName(LLVMRemarkEntryRef Remark)} */
    @NativeType("LLVMRemarkStringRef")
    public static long LLVMRemarkEntryGetPassName(@NativeType("LLVMRemarkEntryRef") long Remark) {
        long __functionAddress = Functions.RemarkEntryGetPassName;
        if (CHECKS) {
            check(Remark);
        }
        return invokePP(Remark, __functionAddress);
    }

    // --- [ LLVMRemarkEntryGetRemarkName ] ---

    /** {@code LLVMRemarkStringRef LLVMRemarkEntryGetRemarkName(LLVMRemarkEntryRef Remark)} */
    @NativeType("LLVMRemarkStringRef")
    public static long LLVMRemarkEntryGetRemarkName(@NativeType("LLVMRemarkEntryRef") long Remark) {
        long __functionAddress = Functions.RemarkEntryGetRemarkName;
        if (CHECKS) {
            check(Remark);
        }
        return invokePP(Remark, __functionAddress);
    }

    // --- [ LLVMRemarkEntryGetFunctionName ] ---

    /** {@code LLVMRemarkStringRef LLVMRemarkEntryGetFunctionName(LLVMRemarkEntryRef Remark)} */
    @NativeType("LLVMRemarkStringRef")
    public static long LLVMRemarkEntryGetFunctionName(@NativeType("LLVMRemarkEntryRef") long Remark) {
        long __functionAddress = Functions.RemarkEntryGetFunctionName;
        if (CHECKS) {
            check(Remark);
        }
        return invokePP(Remark, __functionAddress);
    }

    // --- [ LLVMRemarkEntryGetDebugLoc ] ---

    /** {@code LLVMRemarkDebugLocRef LLVMRemarkEntryGetDebugLoc(LLVMRemarkEntryRef Remark)} */
    @NativeType("LLVMRemarkDebugLocRef")
    public static long LLVMRemarkEntryGetDebugLoc(@NativeType("LLVMRemarkEntryRef") long Remark) {
        long __functionAddress = Functions.RemarkEntryGetDebugLoc;
        if (CHECKS) {
            check(Remark);
        }
        return invokePP(Remark, __functionAddress);
    }

    // --- [ LLVMRemarkEntryGetHotness ] ---

    /** {@code uint64_t LLVMRemarkEntryGetHotness(LLVMRemarkEntryRef Remark)} */
    @NativeType("uint64_t")
    public static long LLVMRemarkEntryGetHotness(@NativeType("LLVMRemarkEntryRef") long Remark) {
        long __functionAddress = Functions.RemarkEntryGetHotness;
        if (CHECKS) {
            check(Remark);
        }
        return invokePJ(Remark, __functionAddress);
    }

    // --- [ LLVMRemarkEntryGetNumArgs ] ---

    /** {@code uint32_t LLVMRemarkEntryGetNumArgs(LLVMRemarkEntryRef Remark)} */
    @NativeType("uint32_t")
    public static int LLVMRemarkEntryGetNumArgs(@NativeType("LLVMRemarkEntryRef") long Remark) {
        long __functionAddress = Functions.RemarkEntryGetNumArgs;
        if (CHECKS) {
            check(Remark);
        }
        return invokePI(Remark, __functionAddress);
    }

    // --- [ LLVMRemarkEntryGetFirstArg ] ---

    /** {@code LLVMRemarkArgRef LLVMRemarkEntryGetFirstArg(LLVMRemarkEntryRef Remark)} */
    @NativeType("LLVMRemarkArgRef")
    public static long LLVMRemarkEntryGetFirstArg(@NativeType("LLVMRemarkEntryRef") long Remark) {
        long __functionAddress = Functions.RemarkEntryGetFirstArg;
        if (CHECKS) {
            check(Remark);
        }
        return invokePP(Remark, __functionAddress);
    }

    // --- [ LLVMRemarkEntryGetNextArg ] ---

    /** {@code LLVMRemarkArgRef LLVMRemarkEntryGetNextArg(LLVMRemarkArgRef It, LLVMRemarkEntryRef Remark)} */
    @NativeType("LLVMRemarkArgRef")
    public static long LLVMRemarkEntryGetNextArg(@NativeType("LLVMRemarkArgRef") long It, @NativeType("LLVMRemarkEntryRef") long Remark) {
        long __functionAddress = Functions.RemarkEntryGetNextArg;
        if (CHECKS) {
            check(It);
            check(Remark);
        }
        return invokePPP(It, Remark, __functionAddress);
    }

    // --- [ LLVMRemarkParserCreateYAML ] ---

    /** {@code LLVMRemarkParserRef LLVMRemarkParserCreateYAML(void const * Buf, uint64_t Size)} */
    public static long nLLVMRemarkParserCreateYAML(long Buf, long Size) {
        long __functionAddress = Functions.RemarkParserCreateYAML;
        return invokePJP(Buf, Size, __functionAddress);
    }

    /** {@code LLVMRemarkParserRef LLVMRemarkParserCreateYAML(void const * Buf, uint64_t Size)} */
    @NativeType("LLVMRemarkParserRef")
    public static long LLVMRemarkParserCreateYAML(@NativeType("void const *") ByteBuffer Buf) {
        return nLLVMRemarkParserCreateYAML(memAddress(Buf), Buf.remaining());
    }

    // --- [ LLVMRemarkParserCreateBitstream ] ---

    /** {@code LLVMRemarkParserRef LLVMRemarkParserCreateBitstream(void const * Buf, uint64_t Size)} */
    public static long nLLVMRemarkParserCreateBitstream(long Buf, long Size) {
        long __functionAddress = Functions.RemarkParserCreateBitstream;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePJP(Buf, Size, __functionAddress);
    }

    /** {@code LLVMRemarkParserRef LLVMRemarkParserCreateBitstream(void const * Buf, uint64_t Size)} */
    @NativeType("LLVMRemarkParserRef")
    public static long LLVMRemarkParserCreateBitstream(@NativeType("void const *") ByteBuffer Buf) {
        return nLLVMRemarkParserCreateBitstream(memAddress(Buf), Buf.remaining());
    }

    // --- [ LLVMRemarkParserGetNext ] ---

    /** {@code LLVMRemarkEntryRef LLVMRemarkParserGetNext(LLVMRemarkParserRef Parser)} */
    @NativeType("LLVMRemarkEntryRef")
    public static long LLVMRemarkParserGetNext(@NativeType("LLVMRemarkParserRef") long Parser) {
        long __functionAddress = Functions.RemarkParserGetNext;
        if (CHECKS) {
            check(Parser);
        }
        return invokePP(Parser, __functionAddress);
    }

    // --- [ LLVMRemarkParserHasError ] ---

    /** {@code LLVMBool LLVMRemarkParserHasError(LLVMRemarkParserRef Parser)} */
    @NativeType("LLVMBool")
    public static boolean LLVMRemarkParserHasError(@NativeType("LLVMRemarkParserRef") long Parser) {
        long __functionAddress = Functions.RemarkParserHasError;
        if (CHECKS) {
            check(Parser);
        }
        return invokePI(Parser, __functionAddress) != 0;
    }

    // --- [ LLVMRemarkParserGetErrorMessage ] ---

    /** {@code char const * LLVMRemarkParserGetErrorMessage(LLVMRemarkParserRef Parser)} */
    public static long nLLVMRemarkParserGetErrorMessage(long Parser) {
        long __functionAddress = Functions.RemarkParserGetErrorMessage;
        if (CHECKS) {
            check(Parser);
        }
        return invokePP(Parser, __functionAddress);
    }

    /** {@code char const * LLVMRemarkParserGetErrorMessage(LLVMRemarkParserRef Parser)} */
    @NativeType("char const *")
    public static @Nullable String LLVMRemarkParserGetErrorMessage(@NativeType("LLVMRemarkParserRef") long Parser) {
        long __result = nLLVMRemarkParserGetErrorMessage(Parser);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMRemarkParserDispose ] ---

    /** {@code void LLVMRemarkParserDispose(LLVMRemarkParserRef Parser)} */
    public static void LLVMRemarkParserDispose(@NativeType("LLVMRemarkParserRef") long Parser) {
        long __functionAddress = Functions.RemarkParserDispose;
        if (CHECKS) {
            check(Parser);
        }
        invokePV(Parser, __functionAddress);
    }

    // --- [ LLVMRemarkVersion ] ---

    /** {@code uint32_t LLVMRemarkVersion(void)} */
    @NativeType("uint32_t")
    public static int LLVMRemarkVersion() {
        long __functionAddress = Functions.RemarkVersion;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeI(__functionAddress);
    }

}