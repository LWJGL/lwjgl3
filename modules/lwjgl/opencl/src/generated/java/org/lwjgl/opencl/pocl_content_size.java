/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class pocl_content_size {

    protected pocl_content_size() {
        throw new UnsupportedOperationException();
    }

    // --- [ clSetContentSizeBufferPoCL ] ---

    /** {@code cl_int clSetContentSizeBufferPoCL(cl_mem buffer, cl_mem content_size_buffer)} */
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