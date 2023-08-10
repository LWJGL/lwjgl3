/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/QCOM/QCOM_shader_framebuffer_fetch_noncoherent.txt">QCOM_shader_framebuffer_fetch_noncoherent</a> extension.
 * 
 * <p>Existing extensions such as {@link EXTShaderFramebufferFetch EXT_shader_framebuffer_fetch} and ARM_shader_framebuffer_fetch_depth_stencil allow fragment shaders to read existing
 * framebuffer color or depth/stencil data as input. This extension adds support for reading those same inputs with relaxed coherency requirements. This
 * mode can avoid expensive per-primitive flushes of the pixel pipeline and may offer performance improvements in some implementations.</p>
 * 
 * <p>When the relaxed coherency mode is enabled, reads of the framebuffer data by the fragment shader will guarantee defined results only if each sample is
 * touched no more than once in any single rendering pass. The command {@link #glFramebufferFetchBarrierQCOM FramebufferFetchBarrierQCOM} is provided to indicate a boundary between passes.</p>
 */
public class QCOMShaderFramebufferFetchNoncoherent {

    static { GLES.initialize(); }

    protected QCOMShaderFramebufferFetchNoncoherent() {
        throw new UnsupportedOperationException();
    }

    // --- [ glFramebufferFetchBarrierQCOM ] ---

    public static native void glFramebufferFetchBarrierQCOM();

}