/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

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
public abstract class XrEglGetProcAddressMNDX extends Callback implements XrEglGetProcAddressMNDXI {

    /**
     * Creates a {@code XrEglGetProcAddressMNDX} instance from the specified function pointer.
     *
     * @return the new {@code XrEglGetProcAddressMNDX}
     */
    public static XrEglGetProcAddressMNDX create(long functionPointer) {
        XrEglGetProcAddressMNDXI instance = Callback.get(functionPointer);
        return instance instanceof XrEglGetProcAddressMNDX
            ? (XrEglGetProcAddressMNDX)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static XrEglGetProcAddressMNDX createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code XrEglGetProcAddressMNDX} instance that delegates to the specified {@code XrEglGetProcAddressMNDXI} instance. */
    public static XrEglGetProcAddressMNDX create(XrEglGetProcAddressMNDXI instance) {
        return instance instanceof XrEglGetProcAddressMNDX
            ? (XrEglGetProcAddressMNDX)instance
            : new Container(instance.address(), instance);
    }

    protected XrEglGetProcAddressMNDX() {
        super(CIF);
    }

    XrEglGetProcAddressMNDX(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends XrEglGetProcAddressMNDX {

        private final XrEglGetProcAddressMNDXI delegate;

        Container(long functionPointer, XrEglGetProcAddressMNDXI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long name) {
            return delegate.invoke(name);
        }

    }

}