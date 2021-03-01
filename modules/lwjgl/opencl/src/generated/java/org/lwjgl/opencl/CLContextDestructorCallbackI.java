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
 * Instances of this interface may be passed to the {@link CL30#clSetContextDestructorCallback SetContextDestructorCallback} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     cl_context context,
 *     void *user_data
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void (*) (cl_context, void *)")
public interface CLContextDestructorCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_void,
        ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
    }

    /**
     * Will be called when a context is destroyed.
     *
     * @param context   the OpenCL context being deleted.
     *                  
     *                  <p>When the callback function is called by the implementation, this context is no longer valid. {@code context} is only provided for reference purposes.</p>
     * @param user_data the user-specified value that was passed when calling {@link CL30#clSetContextDestructorCallback SetContextDestructorCallback}
     */
    void invoke(@NativeType("cl_context") long context, @NativeType("void *") long user_data);

}