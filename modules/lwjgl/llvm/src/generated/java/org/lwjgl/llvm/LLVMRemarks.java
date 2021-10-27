/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Requires LLVM 9 or higher. */
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
            RemarkParserCreateBitstream     = LLVMCore.getLibrary().getFunctionAddress("LLVMRemarkParserCreateBitstream"),
            RemarkParserGetNext             = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemarkParserGetNext"),
            RemarkParserHasError            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemarkParserHasError"),
            RemarkParserGetErrorMessage     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemarkParserGetErrorMessage"),
            RemarkParserDispose             = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMRemarkParserDispose"),
            RemarkVersion                   = LLVMCore.getLibrary().getFunctionAddress("LLVMRemarkVersion");

    }

    public static final int REMARKS_API_VERSION = 1;

    /**
     * The type of the emitted remark. ({@code enum LLVMRemarkType})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMRemarkTypeUnknown RemarkTypeUnknown}</li>
     * <li>{@link #LLVMRemarkTypePassed RemarkTypePassed}</li>
     * <li>{@link #LLVMRemarkTypeMissed RemarkTypeMissed}</li>
     * <li>{@link #LLVMRemarkTypeAnalysis RemarkTypeAnalysis}</li>
     * <li>{@link #LLVMRemarkTypeAnalysisFPCommute RemarkTypeAnalysisFPCommute}</li>
     * <li>{@link #LLVMRemarkTypeAnalysisAliasing RemarkTypeAnalysisAliasing}</li>
     * <li>{@link #LLVMRemarkTypeFailure RemarkTypeFailure}</li>
     * </ul>
     */
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

    /** Unsafe version of: {@link #LLVMRemarkStringGetData RemarkStringGetData} */
    public static long nLLVMRemarkStringGetData(long String) {
        long __functionAddress = Functions.RemarkStringGetData;
        if (CHECKS) {
            check(String);
        }
        return invokePP(String, __functionAddress);
    }

    /** Returns the buffer holding the string. */
    @Nullable
    @NativeType("char const *")
    public static String LLVMRemarkStringGetData(@NativeType("LLVMRemarkStringRef") long String) {
        long __result = nLLVMRemarkStringGetData(String);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMRemarkStringGetLen ] ---

    /** Returns the size of the string. */
    @NativeType("uint32_t")
    public static int LLVMRemarkStringGetLen(@NativeType("LLVMRemarkStringRef") long String) {
        long __functionAddress = Functions.RemarkStringGetLen;
        if (CHECKS) {
            check(String);
        }
        return invokePI(String, __functionAddress);
    }

    // --- [ LLVMRemarkDebugLocGetSourceFilePath ] ---

    /** Return the path to the source file for a debug location. */
    @NativeType("LLVMRemarkStringRef")
    public static long LLVMRemarkDebugLocGetSourceFilePath(@NativeType("LLVMRemarkDebugLocRef") long DL) {
        long __functionAddress = Functions.RemarkDebugLocGetSourceFilePath;
        if (CHECKS) {
            check(DL);
        }
        return invokePP(DL, __functionAddress);
    }

    // --- [ LLVMRemarkDebugLocGetSourceLine ] ---

    /** Return the line in the source file for a debug location. */
    @NativeType("uint32_t")
    public static int LLVMRemarkDebugLocGetSourceLine(@NativeType("LLVMRemarkDebugLocRef") long DL) {
        long __functionAddress = Functions.RemarkDebugLocGetSourceLine;
        if (CHECKS) {
            check(DL);
        }
        return invokePI(DL, __functionAddress);
    }

    // --- [ LLVMRemarkDebugLocGetSourceColumn ] ---

    /** Return the column in the source file for a debug location. */
    @NativeType("uint32_t")
    public static int LLVMRemarkDebugLocGetSourceColumn(@NativeType("LLVMRemarkDebugLocRef") long DL) {
        long __functionAddress = Functions.RemarkDebugLocGetSourceColumn;
        if (CHECKS) {
            check(DL);
        }
        return invokePI(DL, __functionAddress);
    }

    // --- [ LLVMRemarkArgGetKey ] ---

    /** Returns the key of an argument. The key defines what the value is, and the same key can appear multiple times in the list of arguments. */
    @NativeType("LLVMRemarkStringRef")
    public static long LLVMRemarkArgGetKey(@NativeType("LLVMRemarkArgRef") long Arg) {
        long __functionAddress = Functions.RemarkArgGetKey;
        if (CHECKS) {
            check(Arg);
        }
        return invokePP(Arg, __functionAddress);
    }

    // --- [ LLVMRemarkArgGetValue ] ---

    /** Returns the value of an argument. This is a string that can contain newlines. */
    @NativeType("LLVMRemarkStringRef")
    public static long LLVMRemarkArgGetValue(@NativeType("LLVMRemarkArgRef") long Arg) {
        long __functionAddress = Functions.RemarkArgGetValue;
        if (CHECKS) {
            check(Arg);
        }
        return invokePP(Arg, __functionAddress);
    }

    // --- [ LLVMRemarkArgGetDebugLoc ] ---

    /**
     * Returns the debug location that is attached to the value of this argument.
     * 
     * <p>If there is no debug location, the return value will be {@code NULL}.</p>
     */
    @NativeType("LLVMRemarkDebugLocRef")
    public static long LLVMRemarkArgGetDebugLoc(@NativeType("LLVMRemarkArgRef") long Arg) {
        long __functionAddress = Functions.RemarkArgGetDebugLoc;
        if (CHECKS) {
            check(Arg);
        }
        return invokePP(Arg, __functionAddress);
    }

    // --- [ LLVMRemarkEntryDispose ] ---

    /** Free the resources used by the remark entry. */
    public static void LLVMRemarkEntryDispose(@NativeType("LLVMRemarkEntryRef") long Remark) {
        long __functionAddress = Functions.RemarkEntryDispose;
        if (CHECKS) {
            check(Remark);
        }
        invokePV(Remark, __functionAddress);
    }

    // --- [ LLVMRemarkEntryGetType ] ---

    /** The type of the remark. For example, it can allow users to only keep the missed optimizations from the compiler. */
    @NativeType("enum LLVMRemarkType")
    public static int LLVMRemarkEntryGetType(@NativeType("LLVMRemarkEntryRef") long Remark) {
        long __functionAddress = Functions.RemarkEntryGetType;
        if (CHECKS) {
            check(Remark);
        }
        return invokePI(Remark, __functionAddress);
    }

    // --- [ LLVMRemarkEntryGetPassName ] ---

    /** Get the name of the pass that emitted this remark. */
    @NativeType("LLVMRemarkStringRef")
    public static long LLVMRemarkEntryGetPassName(@NativeType("LLVMRemarkEntryRef") long Remark) {
        long __functionAddress = Functions.RemarkEntryGetPassName;
        if (CHECKS) {
            check(Remark);
        }
        return invokePP(Remark, __functionAddress);
    }

    // --- [ LLVMRemarkEntryGetRemarkName ] ---

    /** Get an identifier of the remark. */
    @NativeType("LLVMRemarkStringRef")
    public static long LLVMRemarkEntryGetRemarkName(@NativeType("LLVMRemarkEntryRef") long Remark) {
        long __functionAddress = Functions.RemarkEntryGetRemarkName;
        if (CHECKS) {
            check(Remark);
        }
        return invokePP(Remark, __functionAddress);
    }

    // --- [ LLVMRemarkEntryGetFunctionName ] ---

    /** Get the name of the function being processed when the remark was emitted. */
    @NativeType("LLVMRemarkStringRef")
    public static long LLVMRemarkEntryGetFunctionName(@NativeType("LLVMRemarkEntryRef") long Remark) {
        long __functionAddress = Functions.RemarkEntryGetFunctionName;
        if (CHECKS) {
            check(Remark);
        }
        return invokePP(Remark, __functionAddress);
    }

    // --- [ LLVMRemarkEntryGetDebugLoc ] ---

    /**
     * Returns the debug location that is attached to this remark.
     * 
     * <p>If there is no debug location, the return value will be {@code NULL}.</p>
     */
    @NativeType("LLVMRemarkDebugLocRef")
    public static long LLVMRemarkEntryGetDebugLoc(@NativeType("LLVMRemarkEntryRef") long Remark) {
        long __functionAddress = Functions.RemarkEntryGetDebugLoc;
        if (CHECKS) {
            check(Remark);
        }
        return invokePP(Remark, __functionAddress);
    }

    // --- [ LLVMRemarkEntryGetHotness ] ---

    /**
     * Return the hotness of the remark.
     * 
     * <p>A hotness of {@code 0} means this value is not set.</p>
     */
    @NativeType("uint64_t")
    public static long LLVMRemarkEntryGetHotness(@NativeType("LLVMRemarkEntryRef") long Remark) {
        long __functionAddress = Functions.RemarkEntryGetHotness;
        if (CHECKS) {
            check(Remark);
        }
        return invokePJ(Remark, __functionAddress);
    }

    // --- [ LLVMRemarkEntryGetNumArgs ] ---

    /** The number of arguments the remark holds. */
    @NativeType("uint32_t")
    public static int LLVMRemarkEntryGetNumArgs(@NativeType("LLVMRemarkEntryRef") long Remark) {
        long __functionAddress = Functions.RemarkEntryGetNumArgs;
        if (CHECKS) {
            check(Remark);
        }
        return invokePI(Remark, __functionAddress);
    }

    // --- [ LLVMRemarkEntryGetFirstArg ] ---

    /**
     * Get a new iterator to iterate over a remark's argument.
     * 
     * <p>If there are no arguments in {@code Remark}, the return value will be {@code NULL}.</p>
     * 
     * <p>The lifetime of the returned value is bound to the lifetime of {@code Remark}.</p>
     */
    @NativeType("LLVMRemarkArgRef")
    public static long LLVMRemarkEntryGetFirstArg(@NativeType("LLVMRemarkEntryRef") long Remark) {
        long __functionAddress = Functions.RemarkEntryGetFirstArg;
        if (CHECKS) {
            check(Remark);
        }
        return invokePP(Remark, __functionAddress);
    }

    // --- [ LLVMRemarkEntryGetNextArg ] ---

    /**
     * Get the next argument in {@code Remark} from the position of {@code It}.
     * 
     * <p>Returns {@code NULL} if there are no more arguments available.</p>
     * 
     * <p>The lifetime of the returned value is bound to the lifetime of {@code Remark}.</p>
     */
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

    /** Unsafe version of: {@link #LLVMRemarkParserCreateYAML RemarkParserCreateYAML} */
    public static long nLLVMRemarkParserCreateYAML(long Buf, long Size) {
        long __functionAddress = Functions.RemarkParserCreateYAML;
        return invokePJP(Buf, Size, __functionAddress);
    }

    /**
     * Creates a remark parser that can be used to parse the buffer located in {@code Buf} of size {@code Size} bytes.
     * 
     * <p>{@code Buf} cannot be {@code NULL}.</p>
     * 
     * <p>This function should be paired with {@link #LLVMRemarkParserDispose RemarkParserDispose} to avoid leaking resources.</p>
     */
    @NativeType("LLVMRemarkParserRef")
    public static long LLVMRemarkParserCreateYAML(@NativeType("void const *") ByteBuffer Buf) {
        return nLLVMRemarkParserCreateYAML(memAddress(Buf), Buf.remaining());
    }

    // --- [ LLVMRemarkParserCreateBitstream ] ---

    /** Unsafe version of: {@link #LLVMRemarkParserCreateBitstream RemarkParserCreateBitstream} */
    public static long nLLVMRemarkParserCreateBitstream(long Buf, long Size) {
        long __functionAddress = Functions.RemarkParserCreateBitstream;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePJP(Buf, Size, __functionAddress);
    }

    /**
     * Creates a remark parser that can be used to parse the buffer located in {@code Buf} of size {@code Size} bytes.
     * 
     * <p>{@code Buf} cannot be {@code NULL}.</p>
     * 
     * <p>This function should be paired with {@link #LLVMRemarkParserDispose RemarkParserDispose} to avoid leaking resources.</p>
     *
     * @since 10
     */
    @NativeType("LLVMRemarkParserRef")
    public static long LLVMRemarkParserCreateBitstream(@NativeType("void const *") ByteBuffer Buf) {
        return nLLVMRemarkParserCreateBitstream(memAddress(Buf), Buf.remaining());
    }

    // --- [ LLVMRemarkParserGetNext ] ---

    /**
     * Returns the next remark in the file.
     * 
     * <p>The value pointed to by the return value needs to be disposed using a call to {@link #LLVMRemarkEntryDispose RemarkEntryDispose}.</p>
     * 
     * <p>All the entries in the returned value that are of {@code LLVMRemarkStringRef} type will become invalidated once a call to {@link #LLVMRemarkParserDispose RemarkParserDispose} is
     * made.</p>
     * 
     * <p>If the parser reaches the end of the buffer, the return value will be {@code NULL}.</p>
     * 
     * <p>In the case of an error, the return value will be {@code NULL}, and:</p>
     * 
     * <ul>
     * <li>{@link #LLVMRemarkParserHasError RemarkParserHasError} will return {@code 1}.</li>
     * <li>{@link #LLVMRemarkParserGetErrorMessage RemarkParserGetErrorMessage} will return a descriptive error message.</li>
     * </ul>
     * 
     * <p>An error may occur if:</p>
     * 
     * <ul>
     * <li>An argument is invalid.</li>
     * <li>There is a parsing error. This can occur on things like malformed YAML.</li>
     * <li>There is a {@code Remark} semantic error. This can occur on well-formed files with missing or extra fields.</li>
     * </ul>
     * 
     * <p>Here is a quick example of the usage:</p>
     * 
     * <pre><code>
     * LLVMRemarkParserRef Parser = LLVMRemarkParserCreateYAML(Buf, Size);
     * LLVMRemarkEntryRef Remark = NULL;
     * while ((Remark = LLVMRemarkParserGetNext(Parser))) {
     *     // use Remark
     *     LLVMRemarkEntryDispose(Remark); // Release memory.
     * }
     * bool HasError = LLVMRemarkParserHasError(Parser);
     * LLVMRemarkParserDispose(Parser);</code></pre>
     */
    @NativeType("LLVMRemarkEntryRef")
    public static long LLVMRemarkParserGetNext(@NativeType("LLVMRemarkParserRef") long Parser) {
        long __functionAddress = Functions.RemarkParserGetNext;
        if (CHECKS) {
            check(Parser);
        }
        return invokePP(Parser, __functionAddress);
    }

    // --- [ LLVMRemarkParserHasError ] ---

    /** Returns {@code 1} if the parser encountered an error while parsing the buffer. */
    @NativeType("LLVMBool")
    public static boolean LLVMRemarkParserHasError(@NativeType("LLVMRemarkParserRef") long Parser) {
        long __functionAddress = Functions.RemarkParserHasError;
        if (CHECKS) {
            check(Parser);
        }
        return invokePI(Parser, __functionAddress) != 0;
    }

    // --- [ LLVMRemarkParserGetErrorMessage ] ---

    /** Unsafe version of: {@link #LLVMRemarkParserGetErrorMessage RemarkParserGetErrorMessage} */
    public static long nLLVMRemarkParserGetErrorMessage(long Parser) {
        long __functionAddress = Functions.RemarkParserGetErrorMessage;
        if (CHECKS) {
            check(Parser);
        }
        return invokePP(Parser, __functionAddress);
    }

    /**
     * Returns a null-terminated string containing an error message.
     * 
     * <p>In case of no error, the result is {@code NULL}.</p>
     * 
     * <p>The memory of the string is bound to the lifetime of {@code Parser}. If {@link #LLVMRemarkParserDispose RemarkParserDispose} is called, the memory of the string will be released.</p>
     */
    @Nullable
    @NativeType("char const *")
    public static String LLVMRemarkParserGetErrorMessage(@NativeType("LLVMRemarkParserRef") long Parser) {
        long __result = nLLVMRemarkParserGetErrorMessage(Parser);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMRemarkParserDispose ] ---

    /** Releases all the resources used by {@code Parser}. */
    public static void LLVMRemarkParserDispose(@NativeType("LLVMRemarkParserRef") long Parser) {
        long __functionAddress = Functions.RemarkParserDispose;
        if (CHECKS) {
            check(Parser);
        }
        invokePV(Parser, __functionAddress);
    }

    // --- [ LLVMRemarkVersion ] ---

    /** Returns the version of the remarks library. */
    @NativeType("uint32_t")
    public static int LLVMRemarkVersion() {
        long __functionAddress = Functions.RemarkVersion;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeI(__functionAddress);
    }

}