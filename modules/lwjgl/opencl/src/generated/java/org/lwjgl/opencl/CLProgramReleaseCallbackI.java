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
public interface CLProgramReleaseCallbackI extends CallbackI {

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
     * Will be called after destructors (if any) for program scope global variables (if any) are called and before the program is released.
     *
     * @param program   the program object whose destructors are being called. When the user callback is called by the implementation, this program object is no longer valid.
     *                  {@code program} is only provided for reference purposes.
     * @param user_data the user-specified value that was passed when calling {@link CL22#clSetProgramReleaseCallback SetProgramReleaseCallback}
     */
    void invoke(@NativeType("cl_program") long program, @NativeType("void *") long user_data);

}