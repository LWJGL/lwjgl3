/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/GLX_ARB_get_proc_address.txt">GLX_ARB_get_proc_address</a> extension.
 * 
 * <p>This extension adds a function to return the address of GLX and GL extension functions, given the function name. This is necessary with (for example)
 * heterogenous implementations where hardware drivers may implement extension functions not known to the link library; a similar situation on Windows
 * implementations resulted in the {@code wglGetProcAddress} function.</p>
 */
public class GLXARBGetProcAddress {

    protected GLXARBGetProcAddress() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXGetProcAddressARB ] ---

    /** Unsafe version of: {@link #glXGetProcAddressARB GetProcAddressARB} */
    public static long nglXGetProcAddressARB(long procName) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetProcAddressARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPP(procName, __functionAddress);
    }

    /**
     * Returns the address of the extension function named by procName. The pointer returned should be cast to a function pointer type matching the extension
     * function's definition in that extension specification. A return value of {@code NULL} indicates that the specified function does not exist for the
     * implementation.
     * 
     * <p>A non-{@code NULL} return value for {@code glXGetProcAddressARB} does not guarantee that an extension function is actually supported at runtime. The client
     * must must also query {@link GL11C#glGetString GetString}({@link GL11#GL_EXTENSIONS}) or {@link GLX11#glXQueryExtensionsString QueryExtensionsString} to determine if an extension is supported by a particular
     * context.</p>
     * 
     * <p>GL function pointers returned by {@code glXGetProcAddressARB} are independent of the currently bound context and may be used by any context which
     * supports the extension.</p>
     * 
     * <p>{@code glXGetProcAddressARB} may be queried for all of the following functions:</p>
     * 
     * <ul>
     * <li>All GL and GLX extension functions supported by the implementation (whether those extensions are supported by the current context or not).</li>
     * <li>All core (non-extension) functions in GL and GLX from version 1.0 up to and including the versions of those specifications supported by the
     * implementation, as determined by {@link GL11C#glGetString GetString}({@link GL11#GL_VERSION}) and {@link GLX#glXQueryVersion QueryVersion} queries.</li>
     * </ul>
     *
     * @param procName the function name to query
     */
    @NativeType("void *")
    public static long glXGetProcAddressARB(@NativeType("GLchar const *") ByteBuffer procName) {
        if (CHECKS) {
            checkNT1(procName);
        }
        return nglXGetProcAddressARB(memAddress(procName));
    }

    /**
     * Returns the address of the extension function named by procName. The pointer returned should be cast to a function pointer type matching the extension
     * function's definition in that extension specification. A return value of {@code NULL} indicates that the specified function does not exist for the
     * implementation.
     * 
     * <p>A non-{@code NULL} return value for {@code glXGetProcAddressARB} does not guarantee that an extension function is actually supported at runtime. The client
     * must must also query {@link GL11C#glGetString GetString}({@link GL11#GL_EXTENSIONS}) or {@link GLX11#glXQueryExtensionsString QueryExtensionsString} to determine if an extension is supported by a particular
     * context.</p>
     * 
     * <p>GL function pointers returned by {@code glXGetProcAddressARB} are independent of the currently bound context and may be used by any context which
     * supports the extension.</p>
     * 
     * <p>{@code glXGetProcAddressARB} may be queried for all of the following functions:</p>
     * 
     * <ul>
     * <li>All GL and GLX extension functions supported by the implementation (whether those extensions are supported by the current context or not).</li>
     * <li>All core (non-extension) functions in GL and GLX from version 1.0 up to and including the versions of those specifications supported by the
     * implementation, as determined by {@link GL11C#glGetString GetString}({@link GL11#GL_VERSION}) and {@link GLX#glXQueryVersion QueryVersion} queries.</li>
     * </ul>
     *
     * @param procName the function name to query
     */
    @NativeType("void *")
    public static long glXGetProcAddressARB(@NativeType("GLchar const *") CharSequence procName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(procName, true);
            long procNameEncoded = stack.getPointerAddress();
            return nglXGetProcAddressARB(procNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}