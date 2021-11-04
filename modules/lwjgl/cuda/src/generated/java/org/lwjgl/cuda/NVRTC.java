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

    private static final SharedLibrary NVRTC          = CUDA.getToolkitLibrary(NVRTC.class, Configuration.CUDA_NVRTC_LIBRARY_NAME, "nvrtc");
    private static final SharedLibrary NVRTC_BUILTINS = CUDA.getToolkitLibrary(NVRTC.class, Configuration.CUDA_NVRTC_BUILTINS_LIBRARY_NAME, "nvrtc-builtins");

    /** Contains the function pointers loaded from the NVRTC {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetErrorString       = apiGetFunctionAddress(NVRTC, "nvrtcGetErrorString"),
            Version              = apiGetFunctionAddress(NVRTC, "nvrtcVersion"),
            GetNumSupportedArchs = NVRTC.getFunctionAddress("nvrtcGetNumSupportedArchs"),
            GetSupportedArchs    = NVRTC.getFunctionAddress("nvrtcGetSupportedArchs"),
            CreateProgram        = apiGetFunctionAddress(NVRTC, "nvrtcCreateProgram"),
            DestroyProgram       = apiGetFunctionAddress(NVRTC, "nvrtcDestroyProgram"),
            CompileProgram       = apiGetFunctionAddress(NVRTC, "nvrtcCompileProgram"),
            GetPTXSize           = apiGetFunctionAddress(NVRTC, "nvrtcGetPTXSize"),
            GetPTX               = apiGetFunctionAddress(NVRTC, "nvrtcGetPTX"),
            GetCUBINSize         = NVRTC.getFunctionAddress("nvrtcGetCUBINSize"),
            GetCUBIN             = NVRTC.getFunctionAddress("nvrtcGetCUBIN"),
            GetNVVMSize          = NVRTC.getFunctionAddress("nvrtcGetNVVMSize"),
            GetNVVM              = NVRTC.getFunctionAddress("nvrtcGetNVVM"),
            GetProgramLogSize    = apiGetFunctionAddress(NVRTC, "nvrtcGetProgramLogSize"),
            GetProgramLog        = apiGetFunctionAddress(NVRTC, "nvrtcGetProgramLog"),
            AddNameExpression    = apiGetFunctionAddress(NVRTC, "nvrtcAddNameExpression"),
            GetLoweredName       = apiGetFunctionAddress(NVRTC, "nvrtcGetLoweredName");

    }

    /** Returns the NVRTC {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return NVRTC;
    }

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

    // --- [ nvrtcGetErrorString ] ---

    /** Unsafe version of: {@link #nvrtcGetErrorString GetErrorString} */
    public static long nnvrtcGetErrorString(int result) {
        long __functionAddress = Functions.GetErrorString;
        return callP(result, __functionAddress);
    }

    /**
     * A helper function that returns a string describing the given {@code nvrtcResult} code, e.g., {@link #NVRTC_SUCCESS SUCCESS} to {@code "NVRTC_SUCCESS"}.
     * 
     * <p>For unrecognized enumeration values, it returns {@code "NVRTC_ERROR unknown"}.</p>
     *
     * @param result CUDA Runtime Compilation API result code
     *
     * @return message string for the given {@code nvrtcResult} code
     */
    @Nullable
    @NativeType("char const *")
    public static String nvrtcGetErrorString(@NativeType("nvrtcResult") int result) {
        long __result = nnvrtcGetErrorString(result);
        return memASCIISafe(__result);
    }

    // --- [ nvrtcVersion ] ---

    /** Unsafe version of: {@link #nvrtcVersion Version} */
    public static int nnvrtcVersion(long major, long minor) {
        long __functionAddress = Functions.Version;
        return callPPI(major, minor, __functionAddress);
    }

    /**
     * Sets the output parameters {@code major} and {@code minor} with the CUDA Runtime Compilation version number.
     *
     * @param major CUDA Runtime Compilation major version number
     * @param minor CUDA Runtime Compilation minor version number
     */
    @NativeType("nvrtcResult")
    public static int nvrtcVersion(@NativeType("int *") IntBuffer major, @NativeType("int *") IntBuffer minor) {
        if (CHECKS) {
            check(major, 1);
            check(minor, 1);
        }
        return nnvrtcVersion(memAddress(major), memAddress(minor));
    }

    // --- [ nvrtcGetNumSupportedArchs ] ---

    /** Unsafe version of: {@link #nvrtcGetNumSupportedArchs GetNumSupportedArchs} */
    public static int nnvrtcGetNumSupportedArchs(long numArchs) {
        long __functionAddress = Functions.GetNumSupportedArchs;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(numArchs, __functionAddress);
    }

    /**
     * Sets the output parameter {@code numArchs} with the number of architectures supported by NVRTC.
     * 
     * <p>This can then be used to pass an array to {@link #nvrtcGetSupportedArchs GetSupportedArchs} to get the supported architectures.</p>
     *
     * @param numArchs number of supported architectures
     */
    @NativeType("nvrtcResult")
    public static int nvrtcGetNumSupportedArchs(@NativeType("int *") IntBuffer numArchs) {
        if (CHECKS) {
            check(numArchs, 1);
        }
        return nnvrtcGetNumSupportedArchs(memAddress(numArchs));
    }

    // --- [ nvrtcGetSupportedArchs ] ---

    /** Unsafe version of: {@link #nvrtcGetSupportedArchs GetSupportedArchs} */
    public static int nnvrtcGetSupportedArchs(long supportedArchs) {
        long __functionAddress = Functions.GetSupportedArchs;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(supportedArchs, __functionAddress);
    }

    /**
     * Populates the array passed via the output parameter {@code supportedArchs} with the architectures supported by NVRTC.
     * 
     * <p>The array is sorted in the ascending order. The size of the array to be passed can be determined using {@link #nvrtcGetNumSupportedArchs GetNumSupportedArchs}.</p>
     *
     * @param supportedArchs sorted array of supported architectures
     */
    @NativeType("nvrtcResult")
    public static int nvrtcGetSupportedArchs(@NativeType("int *") IntBuffer supportedArchs) {
        return nnvrtcGetSupportedArchs(memAddress(supportedArchs));
    }

    // --- [ nvrtcCreateProgram ] ---

    /**
     * Unsafe version of: {@link #nvrtcCreateProgram CreateProgram}
     *
     * @param numHeaders number of headers used. {@code numHeaders} must be greater than or equal to 0.
     */
    public static int nnvrtcCreateProgram(long prog, long src, long name, int numHeaders, long headers, long includeNames) {
        long __functionAddress = Functions.CreateProgram;
        return callPPPPPI(prog, src, name, numHeaders, headers, includeNames, __functionAddress);
    }

    /**
     * Creates an instance of {@code nvrtcProgram} with the given input parameters, and sets the output parameter {@code prog} with it.
     *
     * @param prog         CUDA Runtime Compilation program
     * @param src          CUDA program source
     * @param name         CUDA program name. {@code name} can be {@code NULL}; {@code "default_program"} is used when {@code name} is {@code NULL} or "".
     * @param headers      sources of the headers. {@code headers} can be {@code NULL} when {@code numHeaders} is 0.
     * @param includeNames name of each header by which they can be included in the CUDA program source. {@code includeNames} can be {@code NULL} when {@code numHeaders} is 0.
     */
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

    /**
     * Creates an instance of {@code nvrtcProgram} with the given input parameters, and sets the output parameter {@code prog} with it.
     *
     * @param prog         CUDA Runtime Compilation program
     * @param src          CUDA program source
     * @param name         CUDA program name. {@code name} can be {@code NULL}; {@code "default_program"} is used when {@code name} is {@code NULL} or "".
     * @param headers      sources of the headers. {@code headers} can be {@code NULL} when {@code numHeaders} is 0.
     * @param includeNames name of each header by which they can be included in the CUDA program source. {@code includeNames} can be {@code NULL} when {@code numHeaders} is 0.
     */
    @NativeType("nvrtcResult")
    public static int nvrtcCreateProgram(@NativeType("nvrtcProgram *") PointerBuffer prog, @NativeType("char const *") CharSequence src, @Nullable @NativeType("char const *") CharSequence name, @Nullable @NativeType("char const * const *") PointerBuffer headers, @Nullable @NativeType("char const * const *") PointerBuffer includeNames) {
        if (CHECKS) {
            check(prog, 1);
            checkSafe(includeNames, remainingSafe(headers));
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(src, true);
            long srcEncoded = stack.getPointerAddress();
            stack.nUTF8Safe(name, true);
            long nameEncoded = name == null ? NULL : stack.getPointerAddress();
            return nnvrtcCreateProgram(memAddress(prog), srcEncoded, nameEncoded, remainingSafe(headers), memAddressSafe(headers), memAddressSafe(includeNames));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvrtcDestroyProgram ] ---

    /** Unsafe version of: {@link #nvrtcDestroyProgram DestroyProgram} */
    public static int nnvrtcDestroyProgram(long prog) {
        long __functionAddress = Functions.DestroyProgram;
        return callPI(prog, __functionAddress);
    }

    /**
     * Destroys the given program.
     *
     * @param prog CUDA Runtime Compilation program
     */
    @NativeType("nvrtcResult")
    public static int nvrtcDestroyProgram(@NativeType("nvrtcProgram *") PointerBuffer prog) {
        if (CHECKS) {
            check(prog, 1);
        }
        return nnvrtcDestroyProgram(memAddress(prog));
    }

    // --- [ nvrtcCompileProgram ] ---

    /**
     * Unsafe version of: {@link #nvrtcCompileProgram CompileProgram}
     *
     * @param numOptions number of compiler options passed
     */
    public static int nnvrtcCompileProgram(long prog, int numOptions, long options) {
        long __functionAddress = Functions.CompileProgram;
        if (CHECKS) {
            check(prog);
        }
        return callPPI(prog, numOptions, options, __functionAddress);
    }

    /**
     * Compiles the given program.
     * 
     * <p>It supports compile options listed in {@code options}.</p>
     *
     * @param prog    CUDA Runtime Compilation program
     * @param options compiler options in the form of C string array. {@code options} can be {@code NULL} when {@code numOptions} is 0.
     */
    @NativeType("nvrtcResult")
    public static int nvrtcCompileProgram(@NativeType("nvrtcProgram") long prog, @Nullable @NativeType("char const * const *") PointerBuffer options) {
        return nnvrtcCompileProgram(prog, remainingSafe(options), memAddressSafe(options));
    }

    // --- [ nvrtcGetPTXSize ] ---

    /** Unsafe version of: {@link #nvrtcGetPTXSize GetPTXSize} */
    public static int nnvrtcGetPTXSize(long prog, long ptxSizeRet) {
        long __functionAddress = Functions.GetPTXSize;
        if (CHECKS) {
            check(prog);
        }
        return callPPI(prog, ptxSizeRet, __functionAddress);
    }

    /**
     * Sets {@code ptxSizeRet} with the size of the PTX generated by the previous compilation of {@code prog} (including the trailing {@code NULL}).
     *
     * @param prog       CUDA Runtime Compilation program
     * @param ptxSizeRet size of the generated PTX (including the trailing {@code NULL})
     */
    @NativeType("nvrtcResult")
    public static int nvrtcGetPTXSize(@NativeType("nvrtcProgram") long prog, @NativeType("size_t *") PointerBuffer ptxSizeRet) {
        if (CHECKS) {
            check(ptxSizeRet, 1);
        }
        return nnvrtcGetPTXSize(prog, memAddress(ptxSizeRet));
    }

    // --- [ nvrtcGetPTX ] ---

    /** Unsafe version of: {@link #nvrtcGetPTX GetPTX} */
    public static int nnvrtcGetPTX(long prog, long ptx) {
        long __functionAddress = Functions.GetPTX;
        if (CHECKS) {
            check(prog);
        }
        return callPPI(prog, ptx, __functionAddress);
    }

    /**
     * Stores the PTX generated by the previous compilation of {@code prog} in the memory pointed by {@code ptx}.
     *
     * @param prog CUDA Runtime Compilation program
     * @param ptx  compiled result
     */
    @NativeType("nvrtcResult")
    public static int nvrtcGetPTX(@NativeType("nvrtcProgram") long prog, @NativeType("char *") ByteBuffer ptx) {
        return nnvrtcGetPTX(prog, memAddress(ptx));
    }

    // --- [ nvrtcGetCUBINSize ] ---

    /** Unsafe version of: {@link #nvrtcGetCUBINSize GetCUBINSize} */
    public static int nnvrtcGetCUBINSize(long prog, long cubinSizeRet) {
        long __functionAddress = Functions.GetCUBINSize;
        if (CHECKS) {
            check(__functionAddress);
            check(prog);
        }
        return callPPI(prog, cubinSizeRet, __functionAddress);
    }

    /**
     * Sets {@code cubinSizeRet} with the size of the {@code cubin} generated by the previous compilation of {@code prog}.
     * 
     * <p>The value of {@code cubinSizeRet} is set to 0 if the value specified to {@code -arch} is a virtual architecture instead of an actual architecture.</p>
     *
     * @param prog         CUDA Runtime Compilation program
     * @param cubinSizeRet size of the generated cubin
     */
    @NativeType("nvrtcResult")
    public static int nvrtcGetCUBINSize(@NativeType("nvrtcProgram") long prog, @NativeType("size_t *") PointerBuffer cubinSizeRet) {
        if (CHECKS) {
            check(cubinSizeRet, 1);
        }
        return nnvrtcGetCUBINSize(prog, memAddress(cubinSizeRet));
    }

    // --- [ nvrtcGetCUBIN ] ---

    /** Unsafe version of: {@link #nvrtcGetCUBIN GetCUBIN} */
    public static int nnvrtcGetCUBIN(long prog, long cubin) {
        long __functionAddress = Functions.GetCUBIN;
        if (CHECKS) {
            check(__functionAddress);
            check(prog);
        }
        return callPPI(prog, cubin, __functionAddress);
    }

    /**
     * Stores the {@code cubin} generated by the previous compilation of {@code prog} in the memory pointed by {@code cubin}.
     * 
     * <p>No {@code cubin} is available if the value specified to {@code -arch} is a virtual architecture instead of an actual architecture.</p>
     *
     * @param prog  CUDA Runtime Compilation program
     * @param cubin compiled and assembled result
     */
    @NativeType("nvrtcResult")
    public static int nvrtcGetCUBIN(@NativeType("nvrtcProgram") long prog, @NativeType("char *") ByteBuffer cubin) {
        return nnvrtcGetCUBIN(prog, memAddress(cubin));
    }

    // --- [ nvrtcGetNVVMSize ] ---

    /** Unsafe version of: {@link #nvrtcGetNVVMSize GetNVVMSize} */
    public static int nnvrtcGetNVVMSize(long prog, long nvvmSizeRet) {
        long __functionAddress = Functions.GetNVVMSize;
        if (CHECKS) {
            check(__functionAddress);
            check(prog);
        }
        return callPPI(prog, nvvmSizeRet, __functionAddress);
    }

    /**
     * Sets {@code nvvmSizeRet} with the size of the NVVM generated by the previous compilation of {@code prog}.
     * 
     * <p>The value of {@code nvvmSizeRet} is set to 0 if the program was not compiled with {@code -dlto}.</p>
     *
     * @param prog        CUDA Runtime Compilation program
     * @param nvvmSizeRet size of the generated NVVM
     */
    @NativeType("nvrtcResult")
    public static int nvrtcGetNVVMSize(@NativeType("nvrtcProgram") long prog, @NativeType("size_t *") PointerBuffer nvvmSizeRet) {
        if (CHECKS) {
            check(nvvmSizeRet, 1);
        }
        return nnvrtcGetNVVMSize(prog, memAddress(nvvmSizeRet));
    }

    // --- [ nvrtcGetNVVM ] ---

    /** Unsafe version of: {@link #nvrtcGetNVVM GetNVVM} */
    public static int nnvrtcGetNVVM(long prog, long nvvm) {
        long __functionAddress = Functions.GetNVVM;
        if (CHECKS) {
            check(__functionAddress);
            check(prog);
        }
        return callPPI(prog, nvvm, __functionAddress);
    }

    /**
     * Stores the NVVM generated by the previous compilation of {@code prog} in the memory pointed by {@code nvvm}.
     * 
     * <p>The program must have been compiled with {@code -dlto}, otherwise will return an error.</p>
     *
     * @param prog CUDA Runtime Compilation program
     * @param nvvm compiled result
     */
    @NativeType("nvrtcResult")
    public static int nvrtcGetNVVM(@NativeType("nvrtcProgram") long prog, @NativeType("char *") ByteBuffer nvvm) {
        return nnvrtcGetNVVM(prog, memAddress(nvvm));
    }

    // --- [ nvrtcGetProgramLogSize ] ---

    /** Unsafe version of: {@link #nvrtcGetProgramLogSize GetProgramLogSize} */
    public static int nnvrtcGetProgramLogSize(long prog, long logSizeRet) {
        long __functionAddress = Functions.GetProgramLogSize;
        if (CHECKS) {
            check(prog);
        }
        return callPPI(prog, logSizeRet, __functionAddress);
    }

    /**
     * Sets {@code logSizeRet} with the size of the log generated by the previous compilation of {@code prog} (including the trailing {@code NULL}).
     * 
     * <p>Note that compilation log may be generated with warnings and informative messages, even when the compilation of {@code prog} succeeds.</p>
     *
     * @param prog       CUDA Runtime Compilation program
     * @param logSizeRet size of the compilation log (including the trailing {@code NULL})
     */
    @NativeType("nvrtcResult")
    public static int nvrtcGetProgramLogSize(@NativeType("nvrtcProgram") long prog, @NativeType("size_t *") PointerBuffer logSizeRet) {
        if (CHECKS) {
            check(logSizeRet, 1);
        }
        return nnvrtcGetProgramLogSize(prog, memAddress(logSizeRet));
    }

    // --- [ nvrtcGetProgramLog ] ---

    /** Unsafe version of: {@link #nvrtcGetProgramLog GetProgramLog} */
    public static int nnvrtcGetProgramLog(long prog, long log) {
        long __functionAddress = Functions.GetProgramLog;
        if (CHECKS) {
            check(prog);
        }
        return callPPI(prog, log, __functionAddress);
    }

    /**
     * Stores the log generated by the previous compilation of {@code prog} in the memory pointed by {@code log}.
     *
     * @param prog CUDA Runtime Compilation program
     * @param log  compilation log
     */
    @NativeType("nvrtcResult")
    public static int nvrtcGetProgramLog(@NativeType("nvrtcProgram") long prog, @NativeType("char *") ByteBuffer log) {
        return nnvrtcGetProgramLog(prog, memAddress(log));
    }

    // --- [ nvrtcAddNameExpression ] ---

    /** Unsafe version of: {@link #nvrtcAddNameExpression AddNameExpression} */
    public static int nnvrtcAddNameExpression(long prog, long name_expression) {
        long __functionAddress = Functions.AddNameExpression;
        if (CHECKS) {
            check(prog);
        }
        return callPPI(prog, name_expression, __functionAddress);
    }

    /**
     * Notes the given name expression denoting the address of a {@code __global__} function or {@code __device__}/{@code __constant__} variable.
     * 
     * <p>The identical name expression string must be provided on a subsequent call to {@link #nvrtcGetLoweredName GetLoweredName} to extract the lowered name.</p>
     *
     * @param prog            CUDA Runtime Compilation program
     * @param name_expression constant expression denoting the address of a {@code __global__} function or {@code __device__}/{@code __constant__} variable
     */
    @NativeType("nvrtcResult")
    public static int nvrtcAddNameExpression(@NativeType("nvrtcProgram") long prog, @NativeType("char const * const") ByteBuffer name_expression) {
        if (CHECKS) {
            checkNT1(name_expression);
        }
        return nnvrtcAddNameExpression(prog, memAddress(name_expression));
    }

    /**
     * Notes the given name expression denoting the address of a {@code __global__} function or {@code __device__}/{@code __constant__} variable.
     * 
     * <p>The identical name expression string must be provided on a subsequent call to {@link #nvrtcGetLoweredName GetLoweredName} to extract the lowered name.</p>
     *
     * @param prog            CUDA Runtime Compilation program
     * @param name_expression constant expression denoting the address of a {@code __global__} function or {@code __device__}/{@code __constant__} variable
     */
    @NativeType("nvrtcResult")
    public static int nvrtcAddNameExpression(@NativeType("nvrtcProgram") long prog, @NativeType("char const * const") CharSequence name_expression) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name_expression, true);
            long name_expressionEncoded = stack.getPointerAddress();
            return nnvrtcAddNameExpression(prog, name_expressionEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvrtcGetLoweredName ] ---

    /** Unsafe version of: {@link #nvrtcGetLoweredName GetLoweredName} */
    public static int nnvrtcGetLoweredName(long prog, long name_expression, long lowered_name) {
        long __functionAddress = Functions.GetLoweredName;
        if (CHECKS) {
            check(prog);
        }
        return callPPPI(prog, name_expression, lowered_name, __functionAddress);
    }

    /**
     * Extracts the lowered (mangled) name for a {@code __global__} function or {@code __device__}/{@code __constant__} variable, and updates
     * {@code *lowered_name} to point to it.
     * 
     * <p>The memory containing the name is released when the NVRTC program is destroyed by {@link #nvrtcDestroyProgram DestroyProgram}. The identical name expression must have been
     * previously provided to {@link #nvrtcAddNameExpression AddNameExpression}.</p>
     *
     * @param prog            CUDA Runtime Compilation program
     * @param name_expression constant expression denoting the address of a {@code __global__} function or {@code __device__}/{@code __constant__} variable
     * @param lowered_name    initialized by the function to point to a C string containing the lowered (mangled) name corresponding to the provided name expression
     */
    @NativeType("nvrtcResult")
    public static int nvrtcGetLoweredName(@NativeType("nvrtcProgram") long prog, @NativeType("char const * const") ByteBuffer name_expression, @NativeType("char const **") PointerBuffer lowered_name) {
        if (CHECKS) {
            checkNT1(name_expression);
            check(lowered_name, 1);
        }
        return nnvrtcGetLoweredName(prog, memAddress(name_expression), memAddress(lowered_name));
    }

    /**
     * Extracts the lowered (mangled) name for a {@code __global__} function or {@code __device__}/{@code __constant__} variable, and updates
     * {@code *lowered_name} to point to it.
     * 
     * <p>The memory containing the name is released when the NVRTC program is destroyed by {@link #nvrtcDestroyProgram DestroyProgram}. The identical name expression must have been
     * previously provided to {@link #nvrtcAddNameExpression AddNameExpression}.</p>
     *
     * @param prog            CUDA Runtime Compilation program
     * @param name_expression constant expression denoting the address of a {@code __global__} function or {@code __device__}/{@code __constant__} variable
     * @param lowered_name    initialized by the function to point to a C string containing the lowered (mangled) name corresponding to the provided name expression
     */
    @NativeType("nvrtcResult")
    public static int nvrtcGetLoweredName(@NativeType("nvrtcProgram") long prog, @NativeType("char const * const") CharSequence name_expression, @NativeType("char const **") PointerBuffer lowered_name) {
        if (CHECKS) {
            check(lowered_name, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name_expression, true);
            long name_expressionEncoded = stack.getPointerAddress();
            return nnvrtcGetLoweredName(prog, name_expressionEncoded, memAddress(lowered_name));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}