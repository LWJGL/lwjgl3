/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Contains bindings to <a href="https://docs.nvidia.com/cuda/nvrtc/index.html">NVRTC</a>, a runtime compilation library for CUDA C++. */
public class NVRTC {

    /**
     * The enumerated type {@code nvrtcResult} defines API call result codes.
     * 
     * <p>NVRTC API functions return {@code nvrtcResult} to indicate the call result.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NVRTC_SUCCESS SUCCESS}</li>
     * <li>{@link #NVRTC_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link #NVRTC_ERROR_PROGRAM_CREATION_FAILURE ERROR_PROGRAM_CREATION_FAILURE}</li>
     * <li>{@link #NVRTC_ERROR_INVALID_INPUT ERROR_INVALID_INPUT}</li>
     * <li>{@link #NVRTC_ERROR_INVALID_PROGRAM ERROR_INVALID_PROGRAM}</li>
     * <li>{@link #NVRTC_ERROR_INVALID_OPTION ERROR_INVALID_OPTION}</li>
     * <li>{@link #NVRTC_ERROR_COMPILATION ERROR_COMPILATION}</li>
     * <li>{@link #NVRTC_ERROR_BUILTIN_OPERATION_FAILURE ERROR_BUILTIN_OPERATION_FAILURE}</li>
     * <li>{@link #NVRTC_ERROR_NO_NAME_EXPRESSIONS_AFTER_COMPILATION ERROR_NO_NAME_EXPRESSIONS_AFTER_COMPILATION}</li>
     * <li>{@link #NVRTC_ERROR_NO_LOWERED_NAMES_BEFORE_COMPILATION ERROR_NO_LOWERED_NAMES_BEFORE_COMPILATION}</li>
     * <li>{@link #NVRTC_ERROR_NAME_EXPRESSION_NOT_VALID ERROR_NAME_EXPRESSION_NOT_VALID}</li>
     * <li>{@link #NVRTC_ERROR_INTERNAL_ERROR ERROR_INTERNAL_ERROR}</li>
     * </ul>
     */
    public static final int
        NVRTC_SUCCESS                                     = 0,
        NVRTC_ERROR_OUT_OF_MEMORY                         = 1,
        NVRTC_ERROR_PROGRAM_CREATION_FAILURE              = 2,
        NVRTC_ERROR_INVALID_INPUT                         = 3,
        NVRTC_ERROR_INVALID_PROGRAM                       = 4,
        NVRTC_ERROR_INVALID_OPTION                        = 5,
        NVRTC_ERROR_COMPILATION                           = 6,
        NVRTC_ERROR_BUILTIN_OPERATION_FAILURE             = 7,
        NVRTC_ERROR_NO_NAME_EXPRESSIONS_AFTER_COMPILATION = 8,
        NVRTC_ERROR_NO_LOWERED_NAMES_BEFORE_COMPILATION   = 9,
        NVRTC_ERROR_NAME_EXPRESSION_NOT_VALID             = 10,
        NVRTC_ERROR_INTERNAL_ERROR                        = 11;

    protected NVRTC() {
        throw new UnsupportedOperationException();
    }

    private static final SharedLibrary NVRTC          = CUDA.getToolkitLibrary(NVRTC.class, Configuration.CUDA_NVRTC_LIBRARY_NAME, "nvrtc");
    private static final SharedLibrary NVRTC_BUILTINS = CUDA.getToolkitLibrary(NVRTC.class, Configuration.CUDA_NVRTC_BUILTINS_LIBRARY_NAME, "nvrtc-builtins");

    /** Contains the function pointers loaded from the NVRTC {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetErrorString    = apiGetFunctionAddress(NVRTC, "nvrtcGetErrorString"),
            Version           = apiGetFunctionAddress(NVRTC, "nvrtcVersion"),
            CreateProgram     = apiGetFunctionAddress(NVRTC, "nvrtcCreateProgram"),
            DestroyProgram    = apiGetFunctionAddress(NVRTC, "nvrtcDestroyProgram"),
            CompileProgram    = apiGetFunctionAddress(NVRTC, "nvrtcCompileProgram"),
            GetPTXSize        = apiGetFunctionAddress(NVRTC, "nvrtcGetPTXSize"),
            GetPTX            = apiGetFunctionAddress(NVRTC, "nvrtcGetPTX"),
            GetProgramLogSize = apiGetFunctionAddress(NVRTC, "nvrtcGetProgramLogSize"),
            GetProgramLog     = apiGetFunctionAddress(NVRTC, "nvrtcGetProgramLog"),
            AddNameExpression = apiGetFunctionAddress(NVRTC, "nvrtcAddNameExpression"),
            GetLoweredName    = apiGetFunctionAddress(NVRTC, "nvrtcGetLoweredName");

    }

    /** Returns the NVRTC {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return NVRTC;
    }

    // --- [ nvrtcGetErrorString ] ---

    public static long nnvrtcGetErrorString(int result) {
        long __functionAddress = Functions.GetErrorString;
        return callP(result, __functionAddress);
    }

    @Nullable
    @NativeType("char const *")
    public static String nvrtcGetErrorString(@NativeType("nvrtcResult") int result) {
        long __result = nnvrtcGetErrorString(result);
        return memASCIISafe(__result);
    }

    // --- [ nvrtcVersion ] ---

    public static int nnvrtcVersion(long major, long minor) {
        long __functionAddress = Functions.Version;
        return callPPI(major, minor, __functionAddress);
    }

    @NativeType("nvrtcResult")
    public static int nvrtcVersion(@NativeType("int *") IntBuffer major, @NativeType("int *") IntBuffer minor) {
        if (CHECKS) {
            check(major, 1);
            check(minor, 1);
        }
        return nnvrtcVersion(memAddress(major), memAddress(minor));
    }

    // --- [ nvrtcCreateProgram ] ---

    public static int nnvrtcCreateProgram(long prog, long src, long name, int numHeaders, long headers, long includeNames) {
        long __functionAddress = Functions.CreateProgram;
        return callPPPPPI(prog, src, name, numHeaders, headers, includeNames, __functionAddress);
    }

    @NativeType("nvrtcResult")
    public static int nvrtcCreateProgram(@NativeType("nvrtcProgram *") PointerBuffer prog, @NativeType("char const *") ByteBuffer src, @Nullable @NativeType("char const *") ByteBuffer name, @Nullable @NativeType("char const * const *") PointerBuffer headers, @Nullable @NativeType("char const * const *") PointerBuffer includeNames) {
        if (CHECKS) {
            check(prog, 1);
            checkNT1(src);
            checkNT1Safe(name);
            checkSafe(includeNames, remainingSafe(headers));
        }
        return nnvrtcCreateProgram(memAddress(prog), memAddress(src), memAddressSafe(name), remainingSafe(headers), memAddressSafe(headers), memAddressSafe(includeNames));
    }

    @NativeType("nvrtcResult")
    public static int nvrtcCreateProgram(@NativeType("nvrtcProgram *") PointerBuffer prog, @NativeType("char const *") CharSequence src, @Nullable @NativeType("char const *") CharSequence name, @Nullable @NativeType("char const * const *") PointerBuffer headers, @Nullable @NativeType("char const * const *") PointerBuffer includeNames) {
        if (CHECKS) {
            check(prog, 1);
            checkSafe(includeNames, remainingSafe(headers));
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(src, true);
            long srcEncoded = stack.getPointerAddress();
            stack.nASCIISafe(name, true);
            long nameEncoded = name == null ? NULL : stack.getPointerAddress();
            return nnvrtcCreateProgram(memAddress(prog), srcEncoded, nameEncoded, remainingSafe(headers), memAddressSafe(headers), memAddressSafe(includeNames));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvrtcDestroyProgram ] ---

    public static int nnvrtcDestroyProgram(long prog) {
        long __functionAddress = Functions.DestroyProgram;
        return callPI(prog, __functionAddress);
    }

    @NativeType("nvrtcResult")
    public static int nvrtcDestroyProgram(@NativeType("nvrtcProgram *") PointerBuffer prog) {
        if (CHECKS) {
            check(prog, 1);
        }
        return nnvrtcDestroyProgram(memAddress(prog));
    }

    // --- [ nvrtcCompileProgram ] ---

    public static int nnvrtcCompileProgram(long prog, int numOptions, long options) {
        long __functionAddress = Functions.CompileProgram;
        if (CHECKS) {
            check(prog);
        }
        return callPPI(prog, numOptions, options, __functionAddress);
    }

    @NativeType("nvrtcResult")
    public static int nvrtcCompileProgram(@NativeType("nvrtcProgram") long prog, @Nullable @NativeType("char const * const *") PointerBuffer options) {
        return nnvrtcCompileProgram(prog, remainingSafe(options), memAddressSafe(options));
    }

    // --- [ nvrtcGetPTXSize ] ---

    public static int nnvrtcGetPTXSize(long prog, long ptxSizeRet) {
        long __functionAddress = Functions.GetPTXSize;
        if (CHECKS) {
            check(prog);
        }
        return callPPI(prog, ptxSizeRet, __functionAddress);
    }

    @NativeType("nvrtcResult")
    public static int nvrtcGetPTXSize(@NativeType("nvrtcProgram") long prog, @NativeType("size_t *") PointerBuffer ptxSizeRet) {
        if (CHECKS) {
            check(ptxSizeRet, 1);
        }
        return nnvrtcGetPTXSize(prog, memAddress(ptxSizeRet));
    }

    // --- [ nvrtcGetPTX ] ---

    public static int nnvrtcGetPTX(long prog, long ptx) {
        long __functionAddress = Functions.GetPTX;
        if (CHECKS) {
            check(prog);
        }
        return callPPI(prog, ptx, __functionAddress);
    }

    @NativeType("nvrtcResult")
    public static int nvrtcGetPTX(@NativeType("nvrtcProgram") long prog, @NativeType("char *") ByteBuffer ptx) {
        return nnvrtcGetPTX(prog, memAddress(ptx));
    }

    // --- [ nvrtcGetProgramLogSize ] ---

    public static int nnvrtcGetProgramLogSize(long prog, long logSizeRet) {
        long __functionAddress = Functions.GetProgramLogSize;
        if (CHECKS) {
            check(prog);
        }
        return callPPI(prog, logSizeRet, __functionAddress);
    }

    @NativeType("nvrtcResult")
    public static int nvrtcGetProgramLogSize(@NativeType("nvrtcProgram") long prog, @NativeType("size_t *") PointerBuffer logSizeRet) {
        if (CHECKS) {
            check(logSizeRet, 1);
        }
        return nnvrtcGetProgramLogSize(prog, memAddress(logSizeRet));
    }

    // --- [ nvrtcGetProgramLog ] ---

    public static int nnvrtcGetProgramLog(long prog, long log) {
        long __functionAddress = Functions.GetProgramLog;
        if (CHECKS) {
            check(prog);
        }
        return callPPI(prog, log, __functionAddress);
    }

    @NativeType("nvrtcResult")
    public static int nvrtcGetProgramLog(@NativeType("nvrtcProgram") long prog, @NativeType("char *") ByteBuffer log) {
        return nnvrtcGetProgramLog(prog, memAddress(log));
    }

    // --- [ nvrtcAddNameExpression ] ---

    public static int nnvrtcAddNameExpression(long prog, long name_expression) {
        long __functionAddress = Functions.AddNameExpression;
        if (CHECKS) {
            check(prog);
        }
        return callPPI(prog, name_expression, __functionAddress);
    }

    @NativeType("nvrtcResult")
    public static int nvrtcAddNameExpression(@NativeType("nvrtcProgram") long prog, @NativeType("char const * const") ByteBuffer name_expression) {
        if (CHECKS) {
            checkNT1(name_expression);
        }
        return nnvrtcAddNameExpression(prog, memAddress(name_expression));
    }

    @NativeType("nvrtcResult")
    public static int nvrtcAddNameExpression(@NativeType("nvrtcProgram") long prog, @NativeType("char const * const") CharSequence name_expression) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name_expression, true);
            long name_expressionEncoded = stack.getPointerAddress();
            return nnvrtcAddNameExpression(prog, name_expressionEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvrtcGetLoweredName ] ---

    public static int nnvrtcGetLoweredName(long prog, long name_expression, long lowered_name) {
        long __functionAddress = Functions.GetLoweredName;
        if (CHECKS) {
            check(prog);
        }
        return callPPPI(prog, name_expression, lowered_name, __functionAddress);
    }

    @NativeType("nvrtcResult")
    public static int nvrtcGetLoweredName(@NativeType("nvrtcProgram") long prog, @NativeType("char const * const") ByteBuffer name_expression, @NativeType("char const **") PointerBuffer lowered_name) {
        if (CHECKS) {
            checkNT1(name_expression);
            check(lowered_name, 1);
        }
        return nnvrtcGetLoweredName(prog, memAddress(name_expression), memAddress(lowered_name));
    }

    @NativeType("nvrtcResult")
    public static int nvrtcGetLoweredName(@NativeType("nvrtcProgram") long prog, @NativeType("char const * const") CharSequence name_expression, @NativeType("char const **") PointerBuffer lowered_name) {
        if (CHECKS) {
            check(lowered_name, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name_expression, true);
            long name_expressionEncoded = stack.getPointerAddress();
            return nnvrtcGetLoweredName(prog, name_expressionEncoded, memAddress(lowered_name));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}