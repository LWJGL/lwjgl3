/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/GLX_NV_multigpu_context.txt">GLX_NV_multigpu_context</a> extension.
 * 
 * <p>This extension allows the creation of an OpenGL context in a multi-GPU environment with a specified multi-GPU strategy (known as SLI mode) which takes
 * precedence over process-wide multi-GPU mode settings.</p>
 * 
 * <p>The multi-GPU mode denotes vendor specific techniques to allow distributed rendering on multiple GPUs, further called AFR (alternate frame rendering)
 * and Multicast (as defined in NV_gpu_multicast).</p>
 * 
 * <p>OpenGL supports multiple contexts. The semantics of switching contexts is generally left to window system binding APIs such as WGL, GLX and EGL. The
 * extension {@code GLX_NV_multigpu_context} allows to specify a preferred multi-GPU rendering mode per context, thus context switching can also switch
 * the current multi-GPU rendering mode.</p>
 * 
 * <p>In addition to the modes described above, this extension allows creating contexts in single mode to force all rendering to be done on a single GPU, and
 * multi-display multicast mode to allow multicast rendering on a multi-display configuration where displays attached to multiple GPUs are linked together
 * in a desktop configuration spanning multiple GPUs.</p>
 * 
 * <p>The implementation is platform dependent and the actual multi-GPU rendering mode of the created context may vary on different hardware and operation
 * system platforms.</p>
 * 
 * <p>Requires {@link GLX14 GLX14} and {@link GLXARBCreateContext GLX_ARB_create_context}.</p>
 */
public final class GLXNVMultiGPUContext {

    /** Accepted as an attribute name in the {@code *attrib_list} argument to {@link GLXARBCreateContext#glXCreateContextAttribsARB CreateContextAttribsARB}. */
    public static final int GLX_CONTEXT_MULTIGPU_ATTRIB_NV = 0x20AA;

    /**
     * Accepted as an attribute value for {@link #GLX_CONTEXT_MULTIGPU_ATTRIB_NV CONTEXT_MULTIGPU_ATTRIB_NV} in the {@code *attrib_list} argument to
     * {@link GLXARBCreateContext#glXCreateContextAttribsARB CreateContextAttribsARB}.
     */
    public static final int
        GLX_CONTEXT_MULTIGPU_ATTRIB_SINGLE_NV                  = 0x20AB,
        GLX_CONTEXT_MULTIGPU_ATTRIB_AFR_NV                     = 0x20AC,
        GLX_CONTEXT_MULTIGPU_ATTRIB_MULTICAST_NV               = 0x20AD,
        GLX_CONTEXT_MULTIGPU_ATTRIB_MULTI_DISPLAY_MULTICAST_NV = 0x20AE;

    private GLXNVMultiGPUContext() {}

}