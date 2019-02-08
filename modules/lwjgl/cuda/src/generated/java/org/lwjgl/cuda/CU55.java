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

import static org.lwjgl.cuda.CUDA.*;

/** Contains bindings to <a href="https://docs.nvidia.com/cuda/cuda-driver-api/index.html">CUDA Driver API</a>. */
public class CU55 extends CU50 {

    /**
     * Device code formats. ({@code CUjitInputType})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_JIT_INPUT_CUBIN JIT_INPUT_CUBIN} - 
     * Compiled device-class-specific device code
     * 
     * <p>Applicable options: none</p>
     * </li>
     * <li>{@link #CU_JIT_INPUT_PTX JIT_INPUT_PTX} - 
     * PTX source code.
     * 
     * <p>Applicable options: PTX compiler options</p>
     * </li>
     * <li>{@link #CU_JIT_INPUT_FATBINARY JIT_INPUT_FATBINARY} - 
     * Bundle of multiple cubins and/or PTX of some device code.
     * 
     * <p>Applicable options: PTX compiler options, {@link CU#CU_JIT_FALLBACK_STRATEGY JIT_FALLBACK_STRATEGY}</p>
     * </li>
     * <li>{@link #CU_JIT_INPUT_OBJECT JIT_INPUT_OBJECT} - 
     * Host object with embedded device code.
     * 
     * <p>Applicable options: PTX compiler options, {@link CU#CU_JIT_FALLBACK_STRATEGY JIT_FALLBACK_STRATEGY}</p>
     * </li>
     * <li>{@link #CU_JIT_INPUT_LIBRARY JIT_INPUT_LIBRARY} - 
     * Archive of host objects with embedded device code.
     * 
     * <p>Applicable options: PTX compiler options, {@link CU#CU_JIT_FALLBACK_STRATEGY JIT_FALLBACK_STRATEGY}</p>
     * </li>
     * </ul>
     */
    public static final int
        CU_JIT_INPUT_CUBIN     = 0,
        CU_JIT_INPUT_PTX       = 1,
        CU_JIT_INPUT_FATBINARY = 2,
        CU_JIT_INPUT_OBJECT    = 3,
        CU_JIT_INPUT_LIBRARY   = 4;

    protected CU55() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code CU.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            LinkCreate   = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_VERSION("cuLinkCreate", 2)),
            LinkAddData  = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_VERSION("cuLinkAddData", 2)),
            LinkAddFile  = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_VERSION("cuLinkAddFile", 2)),
            LinkComplete = apiGetFunctionAddress(CU.getLibrary(), "cuLinkComplete"),
            LinkDestroy  = apiGetFunctionAddress(CU.getLibrary(), "cuLinkDestroy");

    }

    // --- [ cuLinkCreate ] ---

    public static int ncuLinkCreate(int numOptions, long options, long optionValues, long stateOut) {
        long __functionAddress = Functions.LinkCreate;
        return callPPPI(numOptions, options, optionValues, stateOut, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuLinkCreate(@Nullable @NativeType("CUjit_option *") IntBuffer options, @Nullable @NativeType("void **") PointerBuffer optionValues, @NativeType("CUlinkState *") PointerBuffer stateOut) {
        if (CHECKS) {
            checkSafe(optionValues, remainingSafe(options));
            check(stateOut, 1);
        }
        return ncuLinkCreate(remainingSafe(options), memAddressSafe(options), memAddressSafe(optionValues), memAddress(stateOut));
    }

    // --- [ cuLinkAddData ] ---

    public static int ncuLinkAddData(long state, int type, long data, long size, long name, int numOptions, long options, long optionValues) {
        long __functionAddress = Functions.LinkAddData;
        if (CHECKS) {
            check(state);
        }
        return callPPPPPPI(state, type, data, size, name, numOptions, options, optionValues, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuLinkAddData(@NativeType("CUlinkState") long state, @NativeType("CUjitInputType") int type, @NativeType("void *") ByteBuffer data, @NativeType("char const *") ByteBuffer name, @Nullable @NativeType("CUjit_option *") IntBuffer options, @Nullable @NativeType("void **") PointerBuffer optionValues) {
        if (CHECKS) {
            checkNT1(name);
            checkSafe(optionValues, remainingSafe(options));
        }
        return ncuLinkAddData(state, type, memAddress(data), data.remaining(), memAddress(name), remainingSafe(options), memAddressSafe(options), memAddressSafe(optionValues));
    }

    @NativeType("CUresult")
    public static int cuLinkAddData(@NativeType("CUlinkState") long state, @NativeType("CUjitInputType") int type, @NativeType("void *") ByteBuffer data, @NativeType("char const *") CharSequence name, @Nullable @NativeType("CUjit_option *") IntBuffer options, @Nullable @NativeType("void **") PointerBuffer optionValues) {
        if (CHECKS) {
            checkSafe(optionValues, remainingSafe(options));
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return ncuLinkAddData(state, type, memAddress(data), data.remaining(), nameEncoded, remainingSafe(options), memAddressSafe(options), memAddressSafe(optionValues));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ cuLinkAddFile ] ---

    public static int ncuLinkAddFile(long state, int type, long path, int numOptions, long options, long optionValues) {
        long __functionAddress = Functions.LinkAddFile;
        if (CHECKS) {
            check(state);
        }
        return callPPPPI(state, type, path, numOptions, options, optionValues, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuLinkAddFile(@NativeType("CUlinkState") long state, @NativeType("CUjitInputType") int type, @NativeType("char const *") ByteBuffer path, @Nullable @NativeType("CUjit_option *") IntBuffer options, @Nullable @NativeType("void **") PointerBuffer optionValues) {
        if (CHECKS) {
            checkNT1(path);
            checkSafe(optionValues, remainingSafe(options));
        }
        return ncuLinkAddFile(state, type, memAddress(path), remainingSafe(options), memAddressSafe(options), memAddressSafe(optionValues));
    }

    @NativeType("CUresult")
    public static int cuLinkAddFile(@NativeType("CUlinkState") long state, @NativeType("CUjitInputType") int type, @NativeType("char const *") CharSequence path, @Nullable @NativeType("CUjit_option *") IntBuffer options, @Nullable @NativeType("void **") PointerBuffer optionValues) {
        if (CHECKS) {
            checkSafe(optionValues, remainingSafe(options));
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(path, true);
            long pathEncoded = stack.getPointerAddress();
            return ncuLinkAddFile(state, type, pathEncoded, remainingSafe(options), memAddressSafe(options), memAddressSafe(optionValues));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ cuLinkComplete ] ---

    public static int ncuLinkComplete(long state, long cubinOut, long sizeOut) {
        long __functionAddress = Functions.LinkComplete;
        if (CHECKS) {
            check(state);
        }
        return callPPPI(state, cubinOut, sizeOut, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuLinkComplete(@NativeType("CUlinkState") long state, @NativeType("void **") PointerBuffer cubinOut, @NativeType("size_t *") PointerBuffer sizeOut) {
        if (CHECKS) {
            check(cubinOut, 1);
            check(sizeOut, 1);
        }
        return ncuLinkComplete(state, memAddress(cubinOut), memAddress(sizeOut));
    }

    // --- [ cuLinkDestroy ] ---

    @NativeType("CUresult")
    public static int cuLinkDestroy(@NativeType("CUlinkState") long state) {
        long __functionAddress = Functions.LinkDestroy;
        if (CHECKS) {
            check(state);
        }
        return callPI(state, __functionAddress);
    }

}