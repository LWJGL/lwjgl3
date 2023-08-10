/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/OVR/OVR_multiview.txt">OVR_multiview</a> extension.
 * 
 * <p>The method of stereo rendering supported in OpenGL is currently achieved by rendering to the two eye buffers sequentially. This typically incurs double
 * the application and driver overhead, despite the fact that the command streams and render states are almost identical.</p>
 * 
 * <p>This extension seeks to address the inefficiency of sequential multiview rendering by adding a means to render to multiple elements of a 2D texture
 * array simultaneously. In multiview rendering, draw calls are instanced into each corresponding element of the texture array. The vertex program uses a
 * new {@code gl_ViewID_OVR} variable to compute per-view values, typically the vertex position and view-dependent variables like reflection.</p>
 * 
 * <p>The formulation of this extension is high level in order to allow implementation freedom. On existing hardware, applications and drivers can realize
 * the benefits of a single scene traversal, even if all GPU work is fully duplicated per-view. But future support could enable simultaneous rendering via
 * multi-GPU, tile-based architectures could sort geometry into tiles for multiple views in a single pass, and the implementation could even choose to
 * interleave at the fragment level for better texture cache utilization and more coherent fragment shader branching.</p>
 * 
 * <p>The most obvious use case in this model is to support two simultaneous views: one view for each eye. However, we also anticipate a usage where two
 * views are rendered per eye, where one has a wide field of view and the other has a narrow one. The nature of wide field of view planar projection is
 * that the sample density can become unacceptably low in the view direction. By rendering two inset eye views per eye, we can get the required sample
 * density in the center of projection without wasting samples, memory, and time by oversampling in the periphery.</p>
 */
public class OVRMultiview {

    static { GLES.initialize(); }

    /** Accepted by the {@code pname} parameter of {@link GLES20#glGetFramebufferAttachmentParameteriv GetFramebufferAttachmentParameteriv}. */
    public static final int
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR       = 0x9630,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR = 0x9632;

    /** Accepted by the {@code pname} parameter of GetIntegerv. */
    public static final int GL_MAX_VIEWS_OVR = 0x9631;

    /** Returned by {@link GLES20#glCheckFramebufferStatus CheckFramebufferStatus}. */
    public static final int GL_FRAMEBUFFER_INCOMPLETE_VIEW_TARGETS_OVR = 0x9633;

    protected OVRMultiview() {
        throw new UnsupportedOperationException();
    }

    // --- [ glFramebufferTextureMultiviewOVR ] ---

    public static native void glFramebufferTextureMultiviewOVR(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int baseViewIndex, @NativeType("GLsizei") int numViews);

}