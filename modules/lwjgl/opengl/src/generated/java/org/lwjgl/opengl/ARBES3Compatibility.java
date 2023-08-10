/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_ES3_compatibility.txt">ARB_ES3_compatibility</a> extension.
 * 
 * <p>This extension adds support for features of OpenGL ES 3.0 that are missing from OpenGL 3.x. Enabling these features will ease the process of porting
 * applications from OpenGL ES 3.0 to OpenGL. These features include conservative boolean occlusion queries, primitive restart with a fixed index, the
 * OpenGL ES Shading Language 3.00 specification, and the dependencies stated below.</p>
 * 
 * <p>Requires {@link GL33 OpenGL 3.3}, {@link ARBES2Compatibility ARB_ES2_compatibility}, {@link ARBInvalidateSubdata ARB_invalidate_subdata} and {@link ARBTextureStorage ARB_texture_storage}. Promoted to core in {@link GL43 OpenGL 4.3}.</p>
 */
public final class ARBES3Compatibility {

    /** Accepted by the {@code internalformat} parameter of CompressedTexImage2D. */
    public static final int
        GL_COMPRESSED_RGB8_ETC2                      = 0x9274,
        GL_COMPRESSED_SRGB8_ETC2                     = 0x9275,
        GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2  = 0x9276,
        GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9277,
        GL_COMPRESSED_RGBA8_ETC2_EAC                 = 0x9278,
        GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC          = 0x9279,
        GL_COMPRESSED_R11_EAC                        = 0x9270,
        GL_COMPRESSED_SIGNED_R11_EAC                 = 0x9271,
        GL_COMPRESSED_RG11_EAC                       = 0x9272,
        GL_COMPRESSED_SIGNED_RG11_EAC                = 0x9273;

    /** Accepted by the {@code target} parameter of Enable and Disable. */
    public static final int GL_PRIMITIVE_RESTART_FIXED_INDEX = 0x8D69;

    /** Accepted by the {@code target} parameter of BeginQuery, EndQuery, GetQueryIndexediv and GetQueryiv. */
    public static final int GL_ANY_SAMPLES_PASSED_CONSERVATIVE = 0x8D6A;

    /** Accepted by the {@code value} parameter of the GetInteger functions. */
    public static final int GL_MAX_ELEMENT_INDEX = 0x8D6B;

    private ARBES3Compatibility() {}

}