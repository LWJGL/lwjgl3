/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/OVR/OVR_multiview_multisampled_render_to_texture.txt">OVR_multiview_multisampled_render_to_texture</a> extension.
 * 
 * <p>This extension brings to multiview rendering the functionality originally introduced in {@link EXTMultisampledRenderToTexture EXT_multisampled_render_to_texture}. Essentially this
 * just means adding one new function for multisample multiview array attachments in the framebuffer object.</p>
 */
public class OVRMultiviewMultisampledRenderToTexture {

    static { GLES.initialize(); }

    protected OVRMultiviewMultisampledRenderToTexture() {
        throw new UnsupportedOperationException();
    }

    // --- [ glFramebufferTextureMultisampleMultiviewOVR ] ---

    /**
     * Operates similarly to {@link OVRMultiview#glFramebufferTextureMultiviewOVR FramebufferTextureMultiviewOVR}, except that it also enables multisampled rendering into the images of a
     * non-multisampled texture object similarly to {@link EXTMultisampledRenderToTexture#glFramebufferTexture2DMultisampleEXT FramebufferTexture2DMultisampleEXT}.
     */
    public static native void glFramebufferTextureMultisampleMultiviewOVR(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLsizei") int samples, @NativeType("GLint") int baseViewIndex, @NativeType("GLsizei") int numViews);

}