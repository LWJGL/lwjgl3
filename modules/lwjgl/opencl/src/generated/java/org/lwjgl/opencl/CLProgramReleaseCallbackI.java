/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@link CL22#clSetProgramReleaseCallback SetProgramReleaseCallback} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     cl_program program,
 *     void *user_data
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void (*) (cl_program, void *)")
public interface CLProgramReleaseCallbackI extends CallbackI.V {

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
     * Will be called after destructors (if any) for program scope global variables (if any) are called and before the program is released.
     *
     * @param program   the program object whose destructors are being called. When the user callback is called by the implementation, this program object is no longer valid.
     *                  {@code program} is only provided for reference purposes.
     * @param user_data the user-specified value that was passed when calling {@link CL22#clSetProgramReleaseCallback SetProgramReleaseCallback}
     */
    void invoke(@NativeType("cl_program") long program, @NativeType("void *") long user_data);

}