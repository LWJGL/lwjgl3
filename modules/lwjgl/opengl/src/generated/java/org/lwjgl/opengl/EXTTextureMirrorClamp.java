/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_mirror_clamp.txt">EXT_texture_mirror_clamp</a> extension.
 * 
 * <p>EXT_texture_mirror_clamp extends the set of texture wrap modes to include three modes ({@link #GL_MIRROR_CLAMP_EXT MIRROR_CLAMP_EXT}, {@link #GL_MIRROR_CLAMP_TO_EDGE_EXT MIRROR_CLAMP_TO_EDGE_EXT},
 * {@link #GL_MIRROR_CLAMP_TO_BORDER_EXT MIRROR_CLAMP_TO_BORDER_EXT}) that effectively use a texture map twice as large as the original image in which the additional half of the new image is
 * a mirror image of the original image.</p>
 * 
 * <p>This new mode relaxes the need to generate images whose opposite edges match by using the original image to generate a matching "mirror image". This
 * mode allows the texture to be mirrored only once in the negative s, t, and r directions.</p>
 */
public final class EXTTextureMirrorClamp {

    /**
     * Accepted by the {@code param} parameter of TexParameteri and TexParameterf, and by the {@code params} parameter of TexParameteriv and TexParameterfv,
     * when their {@code pname} parameter is TEXTURE_WRAP_S, TEXTURE_WRAP_T, or TEXTURE_WRAP_R.
     */
    public static final int
        GL_MIRROR_CLAMP_EXT           = 0x8742,
        GL_MIRROR_CLAMP_TO_EDGE_EXT   = 0x8743,
        GL_MIRROR_CLAMP_TO_BORDER_EXT = 0x8912;

    private EXTTextureMirrorClamp() {}

}