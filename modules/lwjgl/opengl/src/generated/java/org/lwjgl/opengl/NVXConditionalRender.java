/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NVX/NVX_conditional_render.txt">NVX_conditional_render</a> extension.
 * 
 * <p>This extension provides support for conditional rendering based on the
 * results of an occlusion query.  This mechanism allows an application to
 * potentially reduce the latency between the completion of an occlusion
 * query and the rendering commands depending on its result.  It additionally
 * allows the decision of whether to render to be made without application
 * intervention.</p>
 * 
 * <p>Requires {@link GL15 OpenGL 1.5} or {@link ARBOcclusionQuery ARB_occlusion_query}</p>
 */
public class NVXConditionalRender {

    static { GL.initialize(); }

    protected NVXConditionalRender() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBeginConditionalRenderNVX ] ---

    public static native void glBeginConditionalRenderNVX(@NativeType("GLuint") int id);

    // --- [ glEndConditionalRenderNVX ] ---

    public static native void glEndConditionalRenderNVX();

}