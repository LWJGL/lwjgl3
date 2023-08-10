/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_clip_cull_distance.txt">EXT_clip_cull_distance</a> extension.
 * 
 * <p>This extension adds support for hardware clip planes and cull distances to OpenGL ES.</p>
 */
public final class EXTClipCullDistance {

    /** Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetInteger64v, and GetFloatv. */
    public static final int
        GL_MAX_CLIP_DISTANCES_EXT                   = 0xD32,
        GL_MAX_CULL_DISTANCES_EXT                   = 0x82F9,
        GL_MAX_COMBINED_CLIP_AND_CULL_DISTANCES_EXT = 0x82FA;

    /** Accepted by the {@code pname} parameters of Enable, Disable and IsEnabled. */
    public static final int
        GL_CLIP_DISTANCE0_EXT = 0x3000,
        GL_CLIP_DISTANCE1_EXT = 0x3001,
        GL_CLIP_DISTANCE2_EXT = 0x3002,
        GL_CLIP_DISTANCE3_EXT = 0x3003,
        GL_CLIP_DISTANCE4_EXT = 0x3004,
        GL_CLIP_DISTANCE5_EXT = 0x3005,
        GL_CLIP_DISTANCE6_EXT = 0x3006,
        GL_CLIP_DISTANCE7_EXT = 0x3007;

    private EXTClipCullDistance() {}

}