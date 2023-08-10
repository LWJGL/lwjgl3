/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/GLX_ARB_create_context.txt">GLX_ARB_create_context</a> extension.
 * 
 * <p>With the advent of new versions of OpenGL which deprecate features and/or break backward compatibility with older versions, there is a need and desire
 * to indicate at context creation which interface will be used. These extensions add a new context creation routine with attributes specifying the GL
 * version and context properties requested for the context, and additionally add an attribute specifying the GL profile requested for a context of OpenGL
 * 3.2 or later. It also allows making an OpenGL 3.0 or later context current without providing a default framebuffer.</p>
 * 
 * <p>Requires {@link GLX14 GLX 1.4}.</p>
 */
public class GLXARBCreateContext {

    /** Accepted as an attribute name in {@code attrib_list}. */
    public static final int
        GLX_CONTEXT_MAJOR_VERSION_ARB = 0x2091,
        GLX_CONTEXT_MINOR_VERSION_ARB = 0x2092,
        GLX_CONTEXT_FLAGS_ARB         = 0x2094;

    /** Accepted as bits in the attribute value for {@link #GLX_CONTEXT_FLAGS_ARB CONTEXT_FLAGS_ARB} in {@code attrib_list}. */
    public static final int
        GLX_CONTEXT_DEBUG_BIT_ARB              = 0x1,
        GLX_CONTEXT_FORWARD_COMPATIBLE_BIT_ARB = 0x2;

    protected GLXARBCreateContext() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXCreateContextAttribsARB ] ---

    /** Unsafe version of: {@link #glXCreateContextAttribsARB CreateContextAttribsARB} */
    public static long nglXCreateContextAttribsARB(long display, long config, long share_context, int direct, long attrib_list) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXCreateContextAttribsARB;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(config);
        }
        return callPPPPP(display, config, share_context, direct, attrib_list, __functionAddress);
    }

    /**
     * Creates an OpenGL rendering context.
     * 
     * <p>If {@code glXCreateContextAttribsARB} succeeds, it initializes the context to the initial state defined by the OpenGL specification, and returns a
     * handle to it. This handle can be used to render to any GLX surface (window, pixmap, or pbuffer) compatible with {@code config}, subject to constraints
     * imposed by the OpenGL API version of the context.</p>
     * 
     * <p>If {@code share_context} is not {@code NULL}, then all shareable data (excluding OpenGL texture objects named 0) will be shared by {@code share_context}, all
     * other contexts {@code share_context} already shares with, and the newly created context. An arbitrary number of {@code GLXContexts} can share data in
     * this fashion. The server context state for all sharing contexts must exist in a single address space.</p>
     *
     * @param display       the connection to the X server
     * @param config        the {@code GLXFBConfig}
     * @param share_context if not {@code NULL}, then all shareable data (excluding OpenGL texture objects named 0) will be shared by {@code share_context}, all other contexts
     *                      {@code share_context} already shares with, and the newly created context. An arbitrary number of GLXContexts can share data in this fashion. The
     *                      server context state for all sharing contexts must exist in a single address space.
     * @param direct        direct rendering is requested if {@code direct} is {@code True}, and indirect rendering if {@code direct} is {@code False}. If
     *                      {@code direct} is {@code True}, the implementation may nonetheless create an indirect rendering context if any of the following conditions hold:
     *                      
     *                      <ul>
     *                      <li>The implementation does not support direct rendering.</li>
     *                      <li>{@code display} is not a local X server.</li>
     *                      <li>Implementation-dependent limits on the number of direct rendering contexts that can be supported simultaneously are exceeded.</li>
     *                      </ul>
     *                      
     *                      <p>Use {@link GLX#glXIsDirect IsDirect} to determine whether or not a request for a direct rendering context succeeded.</p>
     * @param attrib_list   an optional list of attributes for the context, terminated with {@code None}
     */
    @NativeType("GLXContext")
    public static long glXCreateContextAttribsARB(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config, @NativeType("GLXContext") long share_context, @NativeType("Bool") boolean direct, @Nullable @NativeType("int const *") IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list);
        }
        return nglXCreateContextAttribsARB(display, config, share_context, direct ? 1 : 0, memAddressSafe(attrib_list));
    }

    /** Array version of: {@link #glXCreateContextAttribsARB CreateContextAttribsARB} */
    @NativeType("GLXContext")
    public static long glXCreateContextAttribsARB(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config, @NativeType("GLXContext") long share_context, @NativeType("Bool") boolean direct, @Nullable @NativeType("int const *") int[] attrib_list) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXCreateContextAttribsARB;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(config);
            checkNTSafe(attrib_list);
        }
        return callPPPPP(display, config, share_context, direct ? 1 : 0, attrib_list, __functionAddress);
    }

}