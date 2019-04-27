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

public class LLVMOptRemarks {

    public static final int OPT_REMARKS_API_VERSION = 0;

    protected LLVMOptRemarks() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            OptRemarkParserCreate          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOptRemarkParserCreate"),
            OptRemarkParserGetNext         = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOptRemarkParserGetNext"),
            OptRemarkParserHasError        = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOptRemarkParserHasError"),
            OptRemarkParserGetErrorMessage = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOptRemarkParserGetErrorMessage"),
            OptRemarkParserDispose         = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOptRemarkParserDispose"),
            OptRemarkVersion               = LLVMCore.getLibrary().getFunctionAddress("LLVMOptRemarkVersion");

    }

    // --- [ LLVMOptRemarkParserCreate ] ---

    /** Unsafe version of: {@link #LLVMOptRemarkParserCreate OptRemarkParserCreate} */
    public static long nLLVMOptRemarkParserCreate(long Buf, long Size) {
        long __functionAddress = Functions.OptRemarkParserCreate;
        return invokePJP(Buf, Size, __functionAddress);
    }

    /**
     * Creates a remark parser that can be used to read and parse the buffer located in {@code Buf} of size {@code Size}.
     * 
     * <p>{@code Buf} cannot be {@code NULL}.</p>
     * 
     * <p>This function should be paired with {@link #LLVMOptRemarkParserDispose OptRemarkParserDispose} to avoid leaking resources.</p>
     */
    @NativeType("LLVMOptRemarkParserRef")
    public static long LLVMOptRemarkParserCreate(@NativeType("void const *") ByteBuffer Buf) {
        return nLLVMOptRemarkParserCreate(memAddress(Buf), Buf.remaining());
    }

    // --- [ LLVMOptRemarkParserGetNext ] ---

    /** Unsafe version of: {@link #LLVMOptRemarkParserGetNext OptRemarkParserGetNext} */
    public static long nLLVMOptRemarkParserGetNext(long Parser) {
        long __functionAddress = Functions.OptRemarkParserGetNext;
        if (CHECKS) {
            check(Parser);
        }
        return invokePP(Parser, __functionAddress);
    }

    /**
     * Returns the next remark in the file.
     * 
     * <p>The value pointed to by the return value is invalidated by the next call to {@link #LLVMOptRemarkParserGetNext OptRemarkParserGetNext}.</p>
     * 
     * <p>If the parser reaches the end of the buffer, the return value will be {@code NULL}.</p>
     * 
     * <p>In the case of an error, the return value will be {@code NULL}, and:</p>
     * 
     * <ol>
     * <li>{@link #LLVMOptRemarkParserHasError OptRemarkParserHasError} will return {@code 1}.</li>
     * <li>{@link #LLVMOptRemarkParserGetErrorMessage OptRemarkParserGetErrorMessage} will return a descriptive error message.</li>
     * </ol>
     * 
     * <p>An error may occur if:</p>
     * 
     * <ol>
     * <li>An argument is invalid.</li>
     * <li>There is a YAML parsing error. This type of error aborts parsing immediately and returns {@code 1}. It can occur on malformed YAML.</li>
     * <li>Remark parsing error. If this type of error occurs, the parser won't call the handler and will continue to the next one. It can occur on malformed
     * remarks, like missing or extra fields in the file.</li>
     * </ol>
     * 
     * <p>Here is a quick example of the usage:</p>
     * 
     * <pre><code>
     * LLVMOptRemarkParserRef Parser = LLVMOptRemarkParserCreate(Buf, Size);
     * LLVMOptRemarkEntry *Remark = NULL;
     * while ((Remark == LLVMOptRemarkParserGetNext(Parser))) {
     *   // use Remark
     * }
     * bool HasError = LLVMOptRemarkParserHasError(Parser);
     * LLVMOptRemarkParserDispose(Parser);</code></pre>
     */
    @Nullable
    @NativeType("LLVMOptRemarkEntry *")
    public static LLVMOptRemarkEntry LLVMOptRemarkParserGetNext(@NativeType("LLVMOptRemarkParserRef") long Parser) {
        long __result = nLLVMOptRemarkParserGetNext(Parser);
        return LLVMOptRemarkEntry.createSafe(__result);
    }

    // --- [ LLVMOptRemarkParserHasError ] ---

    /** Returns {@code 1} if the parser encountered an error while parsing the buffer. */
    @NativeType("LLVMBool")
    public static boolean LLVMOptRemarkParserHasError(@NativeType("LLVMOptRemarkParserRef") long Parser) {
        long __functionAddress = Functions.OptRemarkParserHasError;
        if (CHECKS) {
            check(Parser);
        }
        return invokePI(Parser, __functionAddress) != 0;
    }

    // --- [ LLVMOptRemarkParserGetErrorMessage ] ---

    /** Unsafe version of: {@link #LLVMOptRemarkParserGetErrorMessage OptRemarkParserGetErrorMessage} */
    public static long nLLVMOptRemarkParserGetErrorMessage(long Parser) {
        long __functionAddress = Functions.OptRemarkParserGetErrorMessage;
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
     * <p>The memory of the string is bound to the lifetime of {@code Parser}. If {@link #LLVMOptRemarkParserDispose OptRemarkParserDispose} is called, the memory of the string will be
     * released.</p>
     */
    @Nullable
    @NativeType("char const *")
    public static String LLVMOptRemarkParserGetErrorMessage(@NativeType("LLVMOptRemarkParserRef") long Parser) {
        long __result = nLLVMOptRemarkParserGetErrorMessage(Parser);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMOptRemarkParserDispose ] ---

    /** Releases all the resources used by {@code Parser}. */
    public static void LLVMOptRemarkParserDispose(@NativeType("LLVMOptRemarkParserRef") long Parser) {
        long __functionAddress = Functions.OptRemarkParserDispose;
        if (CHECKS) {
            check(Parser);
        }
        invokePV(Parser, __functionAddress);
    }

    // --- [ LLVMOptRemarkVersion ] ---

    /**
     * Returns the version of the opt-remarks dylib.
     *
     * @since 8.0
     */
    @NativeType("uint32_t")
    public static int LLVMOptRemarkVersion() {
        long __functionAddress = Functions.OptRemarkVersion;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeI(__functionAddress);
    }

}