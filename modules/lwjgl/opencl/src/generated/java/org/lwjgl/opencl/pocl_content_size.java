/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/pocl/cl_pocl_content_size.txt">pocl_content_size</a> extension.
 * 
 * <p>This extension provides a way to to indicate a buffer which will hold the number of meaningful bytes in another buffer, after kernel execution.</p>
 * 
 * <p>The implementation can use this as an optimization hint, to internally optimize buffer transfers in scenarios with kernels producing dynamic data
 * sizes, by not transferring the bytes that were not written to.</p>
 */
public class pocl_content_size {

    protected pocl_content_size() {
        throw new UnsupportedOperationException();
    }

    // --- [ clSetContentSizeBufferPoCL ] ---

    /**
     * Used to indicate that the buffer {@code content_size_buffer} will hold the meaningful byte count of the content of buffer buffer.
     * 
     * <p>The user is responsible for maintaining the correct meaningful byte count (the implementation does not update the {@code content_size_buffer}).</p>
     *
     * @param buffer              a valid {@code cl_mem} object of {@link CL10#CL_MEM_OBJECT_BUFFER MEM_OBJECT_BUFFER} type.
     * @param content_size_buffer a valid {@code cl_mem} object of {@link CL10#CL_MEM_OBJECT_BUFFER MEM_OBJECT_BUFFER} type. {@code content_size_buffer} must be at least 64bits large. The meaningful byte count is
     *                            stored as 64bit unsigned integer, little endian.
     */
    @NativeType("cl_int")
    public static int clSetContentSizeBufferPoCL(@NativeType("cl_mem") long buffer, @NativeType("cl_mem") long content_size_buffer) {
        long __functionAddress = CL.getICD().clSetContentSizeBufferPoCL;
        if (CHECKS) {
            check(__functionAddress);
            check(buffer);
            check(content_size_buffer);
        }
        return callPPI(buffer, content_size_buffer, __functionAddress);
    }

}