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
 * Instances of this interface may be passed to the {@link CL11#clSetEventCallback SetEventCallback} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     cl_event event,
 *     cl_int event_command_exec_status,
 *     void *user_data
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void (*) (cl_event, cl_int, void *)")
public interface CLEventCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_void,
        ffi_type_pointer, ffi_type_sint32, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE))
        );
    }

    /**
     * Will be called when the execution status of the command associated with {@code event} changes to an execution status equal or past the status specified by
     * {@code command_exec_status}.
     *
     * @param event                     the event
     * @param event_command_exec_status represents the execution status of command for which this callback function is invoked. If the callback is called as the result of the command
     *                                  associated with event being abnormally terminated, an appropriate error code for the error that caused the termination will be passed to
     *                                  {@code event_command_exec_status} instead.
     * @param user_data                 the user-specified value that was passed when calling {@link CL11#clSetEventCallback SetEventCallback}
     */
    void invoke(@NativeType("cl_event") long event, @NativeType("cl_int") int event_command_exec_status, @NativeType("void *") long user_data);

}