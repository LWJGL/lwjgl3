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

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/intel/cl_intel_create_buffer_with_properties.txt">intel_create_buffer_with_properties</a> extension.
 * 
 * <p>This extension allows OpenCL 1.x and 2.x devices to support the {@code clCreateBufferWithProperties} API that was added in OpenCL 3.0. This allows
 * older OpenCL implementations to support other optional extensions or features that use the {@code clCreateBufferWithProperties} API to specify
 * additional buffer properties, without recreating the API that is already part of OpenCL 3.0.</p>
 */
public class INTELCreateBufferWithProperties {

    protected INTELCreateBufferWithProperties() {
        throw new UnsupportedOperationException();
    }

    // --- [ clCreateBufferWithPropertiesINTEL ] ---

    /**
     * Unsafe version of: {@link #clCreateBufferWithPropertiesINTEL CreateBufferWithPropertiesINTEL}
     *
     * @param size the size in bytes of the buffer memory object to be allocated
     */
    public static long nclCreateBufferWithPropertiesINTEL(long context, long properties, long flags, long size, long host_ptr, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferWithPropertiesINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPJPPPP(context, properties, flags, size, host_ptr, errcode_ret, __functionAddress);
    }

    /**
     * @param context     a valid OpenCL context used to create the buffer object
     * @param properties  an optional list of properties for the buffer object and their corresponding values.
     *                    
     *                    <p>Each property name is immediately followed by the corresponding desired value. The list is terminated with the special property 0. If no properties
     *                    are required, properties may be {@code NULL}. This extension does not define any optional properties for buffers.</p>
     * @param flags       a bit-field that is used to specify allocation and usage information such as the memory arena that should be used to allocate the buffer object and
     *                    how it will be used
     * @param size        the size in bytes of the buffer memory object to be allocated
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero buffer object and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the buffer object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if a property name in properties is not a supported property name, if the value specified for a supported property name is not valid, or if the same property name is specified more than once.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in flags are not valid as defined in table 5.3.</li>
     *         <li>{@link CL10#CL_INVALID_BUFFER_SIZE INVALID_BUFFER_SIZE} if size is 0.</li>
     *         <li>{@link CL10#CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in flags or if {@code host_ptr} is not {@code NULL} but
     *         {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in flags.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for buffer object.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     */
    @NativeType("cl_mem")
    public static long clCreateBufferWithPropertiesINTEL(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties_intel const *") LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("size_t") long size, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferWithPropertiesINTEL(context, memAddressSafe(properties), flags, size, NULL, memAddressSafe(errcode_ret));
    }

    /**
     * @param context     a valid OpenCL context used to create the buffer object
     * @param properties  an optional list of properties for the buffer object and their corresponding values.
     *                    
     *                    <p>Each property name is immediately followed by the corresponding desired value. The list is terminated with the special property 0. If no properties
     *                    are required, properties may be {@code NULL}. This extension does not define any optional properties for buffers.</p>
     * @param flags       a bit-field that is used to specify allocation and usage information such as the memory arena that should be used to allocate the buffer object and
     *                    how it will be used
     * @param host_ptr    a pointer to the buffer data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be
     *                    greater than or equal to {@code size} bytes.
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero buffer object and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the buffer object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if a property name in properties is not a supported property name, if the value specified for a supported property name is not valid, or if the same property name is specified more than once.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in flags are not valid as defined in table 5.3.</li>
     *         <li>{@link CL10#CL_INVALID_BUFFER_SIZE INVALID_BUFFER_SIZE} if size is 0.</li>
     *         <li>{@link CL10#CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in flags or if {@code host_ptr} is not {@code NULL} but
     *         {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in flags.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for buffer object.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     */
    @NativeType("cl_mem")
    public static long clCreateBufferWithPropertiesINTEL(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties_intel const *") LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") ByteBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferWithPropertiesINTEL(context, memAddressSafe(properties), flags, host_ptr.remaining(), memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * @param context     a valid OpenCL context used to create the buffer object
     * @param properties  an optional list of properties for the buffer object and their corresponding values.
     *                    
     *                    <p>Each property name is immediately followed by the corresponding desired value. The list is terminated with the special property 0. If no properties
     *                    are required, properties may be {@code NULL}. This extension does not define any optional properties for buffers.</p>
     * @param flags       a bit-field that is used to specify allocation and usage information such as the memory arena that should be used to allocate the buffer object and
     *                    how it will be used
     * @param host_ptr    a pointer to the buffer data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be
     *                    greater than or equal to {@code size} bytes.
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero buffer object and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the buffer object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if a property name in properties is not a supported property name, if the value specified for a supported property name is not valid, or if the same property name is specified more than once.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in flags are not valid as defined in table 5.3.</li>
     *         <li>{@link CL10#CL_INVALID_BUFFER_SIZE INVALID_BUFFER_SIZE} if size is 0.</li>
     *         <li>{@link CL10#CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in flags or if {@code host_ptr} is not {@code NULL} but
     *         {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in flags.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for buffer object.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     */
    @NativeType("cl_mem")
    public static long clCreateBufferWithPropertiesINTEL(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties_intel const *") LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") ShortBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferWithPropertiesINTEL(context, memAddressSafe(properties), flags, Integer.toUnsignedLong(host_ptr.remaining()) << 1, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * @param context     a valid OpenCL context used to create the buffer object
     * @param properties  an optional list of properties for the buffer object and their corresponding values.
     *                    
     *                    <p>Each property name is immediately followed by the corresponding desired value. The list is terminated with the special property 0. If no properties
     *                    are required, properties may be {@code NULL}. This extension does not define any optional properties for buffers.</p>
     * @param flags       a bit-field that is used to specify allocation and usage information such as the memory arena that should be used to allocate the buffer object and
     *                    how it will be used
     * @param host_ptr    a pointer to the buffer data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be
     *                    greater than or equal to {@code size} bytes.
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero buffer object and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the buffer object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if a property name in properties is not a supported property name, if the value specified for a supported property name is not valid, or if the same property name is specified more than once.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in flags are not valid as defined in table 5.3.</li>
     *         <li>{@link CL10#CL_INVALID_BUFFER_SIZE INVALID_BUFFER_SIZE} if size is 0.</li>
     *         <li>{@link CL10#CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in flags or if {@code host_ptr} is not {@code NULL} but
     *         {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in flags.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for buffer object.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     */
    @NativeType("cl_mem")
    public static long clCreateBufferWithPropertiesINTEL(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties_intel const *") LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") IntBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferWithPropertiesINTEL(context, memAddressSafe(properties), flags, Integer.toUnsignedLong(host_ptr.remaining()) << 2, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * @param context     a valid OpenCL context used to create the buffer object
     * @param properties  an optional list of properties for the buffer object and their corresponding values.
     *                    
     *                    <p>Each property name is immediately followed by the corresponding desired value. The list is terminated with the special property 0. If no properties
     *                    are required, properties may be {@code NULL}. This extension does not define any optional properties for buffers.</p>
     * @param flags       a bit-field that is used to specify allocation and usage information such as the memory arena that should be used to allocate the buffer object and
     *                    how it will be used
     * @param host_ptr    a pointer to the buffer data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be
     *                    greater than or equal to {@code size} bytes.
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero buffer object and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the buffer object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if a property name in properties is not a supported property name, if the value specified for a supported property name is not valid, or if the same property name is specified more than once.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in flags are not valid as defined in table 5.3.</li>
     *         <li>{@link CL10#CL_INVALID_BUFFER_SIZE INVALID_BUFFER_SIZE} if size is 0.</li>
     *         <li>{@link CL10#CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in flags or if {@code host_ptr} is not {@code NULL} but
     *         {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in flags.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for buffer object.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     */
    @NativeType("cl_mem")
    public static long clCreateBufferWithPropertiesINTEL(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties_intel const *") LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") FloatBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferWithPropertiesINTEL(context, memAddressSafe(properties), flags, Integer.toUnsignedLong(host_ptr.remaining()) << 2, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * @param context     a valid OpenCL context used to create the buffer object
     * @param properties  an optional list of properties for the buffer object and their corresponding values.
     *                    
     *                    <p>Each property name is immediately followed by the corresponding desired value. The list is terminated with the special property 0. If no properties
     *                    are required, properties may be {@code NULL}. This extension does not define any optional properties for buffers.</p>
     * @param flags       a bit-field that is used to specify allocation and usage information such as the memory arena that should be used to allocate the buffer object and
     *                    how it will be used
     * @param host_ptr    a pointer to the buffer data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be
     *                    greater than or equal to {@code size} bytes.
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero buffer object and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the buffer object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if a property name in properties is not a supported property name, if the value specified for a supported property name is not valid, or if the same property name is specified more than once.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in flags are not valid as defined in table 5.3.</li>
     *         <li>{@link CL10#CL_INVALID_BUFFER_SIZE INVALID_BUFFER_SIZE} if size is 0.</li>
     *         <li>{@link CL10#CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in flags or if {@code host_ptr} is not {@code NULL} but
     *         {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in flags.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for buffer object.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     */
    @NativeType("cl_mem")
    public static long clCreateBufferWithPropertiesINTEL(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties_intel const *") LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") DoubleBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferWithPropertiesINTEL(context, memAddressSafe(properties), flags, Integer.toUnsignedLong(host_ptr.remaining()) << 3, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /** Array version of: {@link #clCreateBufferWithPropertiesINTEL CreateBufferWithPropertiesINTEL} */
    @NativeType("cl_mem")
    public static long clCreateBufferWithPropertiesINTEL(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties_intel const *") long[] properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") ByteBuffer host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferWithPropertiesINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPP(context, properties, flags, (long)host_ptr.remaining(), memAddress(host_ptr), errcode_ret, __functionAddress);
    }

    /** Array version of: {@link #clCreateBufferWithPropertiesINTEL CreateBufferWithPropertiesINTEL} */
    @NativeType("cl_mem")
    public static long clCreateBufferWithPropertiesINTEL(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties_intel const *") long[] properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") short[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferWithPropertiesINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPP(context, properties, flags, Integer.toUnsignedLong(host_ptr.length) << 1, host_ptr, errcode_ret, __functionAddress);
    }

    /** Array version of: {@link #clCreateBufferWithPropertiesINTEL CreateBufferWithPropertiesINTEL} */
    @NativeType("cl_mem")
    public static long clCreateBufferWithPropertiesINTEL(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties_intel const *") long[] properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") int[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferWithPropertiesINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPP(context, properties, flags, Integer.toUnsignedLong(host_ptr.length) << 2, host_ptr, errcode_ret, __functionAddress);
    }

    /** Array version of: {@link #clCreateBufferWithPropertiesINTEL CreateBufferWithPropertiesINTEL} */
    @NativeType("cl_mem")
    public static long clCreateBufferWithPropertiesINTEL(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties_intel const *") long[] properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") float[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferWithPropertiesINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPP(context, properties, flags, Integer.toUnsignedLong(host_ptr.length) << 2, host_ptr, errcode_ret, __functionAddress);
    }

    /** Array version of: {@link #clCreateBufferWithPropertiesINTEL CreateBufferWithPropertiesINTEL} */
    @NativeType("cl_mem")
    public static long clCreateBufferWithPropertiesINTEL(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties_intel const *") long[] properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") double[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferWithPropertiesINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPP(context, properties, flags, Integer.toUnsignedLong(host_ptr.length) << 3, host_ptr, errcode_ret, __functionAddress);
    }

}