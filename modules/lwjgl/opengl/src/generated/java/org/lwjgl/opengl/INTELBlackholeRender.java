/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/INTEL/INTEL_blackhole_render.txt">INTEL_blackhole_render</a> extension.
 * 
 * <p>The purpose of this extension is to allow an application to disable all rendering operations emitted to the GPU through the OpenGL rendering commands
 * ({@code Draw*}, {@code DispatchCompute*}, {@code BlitFramebuffer}, etc...). Changes to the OpenGL pipeline are not affected.</p>
 * 
 * <p>New preprocessor {@code #defines} are added to the OpenGL Shading Language:</p>
 * 
 * <pre><code>
 * #define GL_INTEL_blackhole_render 1</code></pre>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0}.</p>
 */
public final class INTELBlackholeRender {

    /** Accepted by the {@code target} parameter of Enable, Disable, IsEnabled. */
    public static final int GL_BLACKHOLE_RENDER_INTEL = 0x83FC;

    private INTELBlackholeRender() {}

}