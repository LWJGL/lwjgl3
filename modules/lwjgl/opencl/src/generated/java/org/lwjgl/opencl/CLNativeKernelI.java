/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * Instances of this interface may be passed to the {@link CL10#clEnqueueNativeKernel EnqueueNativeKernel} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     void *args
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void (*) (void *)")
public interface CLNativeKernelI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_void,
        ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args))
        );
    }

    /**
     * Will be called by the OpenCL using {@link CL10#clEnqueueNativeKernel EnqueueNativeKernel}.
     *
     * @param args a pointer to the arguments list
     */
    void invoke(@NativeType("void *") long args);

}