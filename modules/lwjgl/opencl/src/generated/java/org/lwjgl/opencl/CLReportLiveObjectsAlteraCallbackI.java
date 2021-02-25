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
 * Instances of this interface may be passed to the {@link ALTERALiveObjectTracking#clReportLiveObjectsAltera ReportLiveObjectsAltera} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     void *user_data,
 *     void *obj_ptr,
 *     char const *type_name,
 *     cl_uint refcount
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void (*) (void *, void *, char const *, cl_uint)")
public interface CLReportLiveObjectsAlteraCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_void,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_uint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE))
        );
    }

    /**
     * Reports a live OpenCL API object.
     *
     * @param user_data the {@code user_data} argument specified to {@link ALTERALiveObjectTracking#clReportLiveObjectsAltera ReportLiveObjectsAltera}
     * @param obj_ptr   a pointer to the live object
     * @param type_name a C string corresponding to the OpenCL API object type. For example, a leaked {@code cl_mem} object will have "cl_mem" as its type string.
     * @param refcount  an instantaneous reference count for the object. Consider it to be immediately stale.
     */
    void invoke(@NativeType("void *") long user_data, @NativeType("void *") long obj_ptr, @NativeType("char const *") long type_name, @NativeType("cl_uint") int refcount);

}