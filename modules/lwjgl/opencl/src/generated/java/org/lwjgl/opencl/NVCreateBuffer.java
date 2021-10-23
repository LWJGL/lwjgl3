/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/nv/cl_nv_create_buffer.txt">nv_create_buffer</a> extension. */
public class NVCreateBuffer {

    public static final int
        CL_MEM_LOCATION_HOST_NV = (1 << 0),
        CL_MEM_PINNED_NV        = (1 << 1);

    protected NVCreateBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ clCreateBufferNV ] ---

    /**
     * Unsafe version of: {@link #clCreateBufferNV CreateBufferNV}
     *
     * @param size the size in bytes of the buffer memory object to be allocated
     */
    public static long nclCreateBufferNV(long context, long flags, long flags_NV, long size, long host_ptr, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferNV;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPJJPPPP(context, flags, flags_NV, size, host_ptr, errcode_ret, __functionAddress);
    }

    /**
     * @param context     a valid OpenCL context used to create the buffer object
     * @param flags       a bit-field that is used to specify allocation and usage information such as the memory area that should be used to allocate the buffer object and
     *                    how it will be used. If value specified for flags is 0, the default is used which is {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}. One of:<br><table><tr><td>{@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param size        the size in bytes of the buffer memory object to be allocated
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     */
    @NativeType("cl_mem")
    public static long clCreateBufferNV(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_flags_NV") long flags_NV, @NativeType("size_t") long size, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferNV(context, flags, flags_NV, size, NULL, memAddressSafe(errcode_ret));
    }

    /**
     * @param context     a valid OpenCL context used to create the buffer object
     * @param flags       a bit-field that is used to specify allocation and usage information such as the memory area that should be used to allocate the buffer object and
     *                    how it will be used. If value specified for flags is 0, the default is used which is {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}. One of:<br><table><tr><td>{@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param host_ptr    a pointer to the buffer data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be
     *                    &#x2265; {@code size} bytes.
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     */
    @NativeType("cl_mem")
    public static long clCreateBufferNV(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_flags_NV") long flags_NV, @NativeType("void *") ByteBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferNV(context, flags, flags_NV, host_ptr.remaining(), memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * @param context     a valid OpenCL context used to create the buffer object
     * @param flags       a bit-field that is used to specify allocation and usage information such as the memory area that should be used to allocate the buffer object and
     *                    how it will be used. If value specified for flags is 0, the default is used which is {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}. One of:<br><table><tr><td>{@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param host_ptr    a pointer to the buffer data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be
     *                    &#x2265; {@code size} bytes.
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     */
    @NativeType("cl_mem")
    public static long clCreateBufferNV(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_flags_NV") long flags_NV, @NativeType("void *") ShortBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferNV(context, flags, flags_NV, Integer.toUnsignedLong(host_ptr.remaining()) << 1, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * @param context     a valid OpenCL context used to create the buffer object
     * @param flags       a bit-field that is used to specify allocation and usage information such as the memory area that should be used to allocate the buffer object and
     *                    how it will be used. If value specified for flags is 0, the default is used which is {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}. One of:<br><table><tr><td>{@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param host_ptr    a pointer to the buffer data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be
     *                    &#x2265; {@code size} bytes.
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     */
    @NativeType("cl_mem")
    public static long clCreateBufferNV(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_flags_NV") long flags_NV, @NativeType("void *") IntBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferNV(context, flags, flags_NV, Integer.toUnsignedLong(host_ptr.remaining()) << 2, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * @param context     a valid OpenCL context used to create the buffer object
     * @param flags       a bit-field that is used to specify allocation and usage information such as the memory area that should be used to allocate the buffer object and
     *                    how it will be used. If value specified for flags is 0, the default is used which is {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}. One of:<br><table><tr><td>{@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param host_ptr    a pointer to the buffer data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be
     *                    &#x2265; {@code size} bytes.
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     */
    @NativeType("cl_mem")
    public static long clCreateBufferNV(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_flags_NV") long flags_NV, @NativeType("void *") FloatBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferNV(context, flags, flags_NV, Integer.toUnsignedLong(host_ptr.remaining()) << 2, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * @param context     a valid OpenCL context used to create the buffer object
     * @param flags       a bit-field that is used to specify allocation and usage information such as the memory area that should be used to allocate the buffer object and
     *                    how it will be used. If value specified for flags is 0, the default is used which is {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}. One of:<br><table><tr><td>{@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param host_ptr    a pointer to the buffer data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be
     *                    &#x2265; {@code size} bytes.
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     */
    @NativeType("cl_mem")
    public static long clCreateBufferNV(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_flags_NV") long flags_NV, @NativeType("void *") DoubleBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferNV(context, flags, flags_NV, Integer.toUnsignedLong(host_ptr.remaining()) << 3, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /** Array version of: {@link #clCreateBufferNV CreateBufferNV} */
    @NativeType("cl_mem")
    public static long clCreateBufferNV(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_flags_NV") long flags_NV, @NativeType("void *") ByteBuffer host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferNV;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJJPPPP(context, flags, flags_NV, (long)host_ptr.remaining(), memAddress(host_ptr), errcode_ret, __functionAddress);
    }

    /** Array version of: {@link #clCreateBufferNV CreateBufferNV} */
    @NativeType("cl_mem")
    public static long clCreateBufferNV(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_flags_NV") long flags_NV, @NativeType("void *") short[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferNV;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJJPPPP(context, flags, flags_NV, Integer.toUnsignedLong(host_ptr.length) << 1, host_ptr, errcode_ret, __functionAddress);
    }

    /** Array version of: {@link #clCreateBufferNV CreateBufferNV} */
    @NativeType("cl_mem")
    public static long clCreateBufferNV(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_flags_NV") long flags_NV, @NativeType("void *") int[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferNV;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJJPPPP(context, flags, flags_NV, Integer.toUnsignedLong(host_ptr.length) << 2, host_ptr, errcode_ret, __functionAddress);
    }

    /** Array version of: {@link #clCreateBufferNV CreateBufferNV} */
    @NativeType("cl_mem")
    public static long clCreateBufferNV(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_flags_NV") long flags_NV, @NativeType("void *") float[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferNV;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJJPPPP(context, flags, flags_NV, Integer.toUnsignedLong(host_ptr.length) << 2, host_ptr, errcode_ret, __functionAddress);
    }

    /** Array version of: {@link #clCreateBufferNV CreateBufferNV} */
    @NativeType("cl_mem")
    public static long clCreateBufferNV(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_flags_NV") long flags_NV, @NativeType("void *") double[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferNV;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJJPPPP(context, flags, flags_NV, Integer.toUnsignedLong(host_ptr.length) << 3, host_ptr, errcode_ret, __functionAddress);
    }

}