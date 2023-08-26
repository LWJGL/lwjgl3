/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * typedef of eglGetProcAddress.
 * 
 * <h5>C Specification</h5>
 * 
 * <pre><code>
 * typedef void *(*PFN_xrEglGetProcAddressMNDX)(const char *name);</code></pre>
 * 
 * <h5>Description</h5>
 * 
 * <p>eglGetProcAddress returns the address of the client API or EGL function named by procname. For details please see <a href="https://registry.khronos.org/EGL/sdk/docs/man/html/eglGetProcAddress.xhtml">https://registry.khronos.org/EGL/sdk/docs/man/html/eglGetProcAddress.xhtml</a></p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrGraphicsBindingEGLMNDX}</p>
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void * (*{@link #invoke}) (
 *     char const *name
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("PFN_xrEglGetProcAddressMNDX")
public interface XrEglGetProcAddressMNDXI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_pointer,
        ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args))
        );
        apiClosureRetP(ret, __result);
    }

    /**
     * typedef of eglGetProcAddress.
     *
     * @param name specifies the name of the function to return.
     */
    @NativeType("void *") long invoke(@NativeType("char const *") long name);

}