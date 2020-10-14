/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@link CL30#clSetContextDestructorCallback SetContextDestructorCallback} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     cl_context context,
 *     void *user_data
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void (*) (cl_context, void *)")
public interface CLContextDestructorCallbackI extends CallbackI.V {

    String SIGNATURE = Callback.__stdcall("(pp)v");

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgPointer(args)
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