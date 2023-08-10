/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/APPLE/APPLE_clip_distance.txt">APPLE_clip_distance</a> extension.
 * 
 * <p>This extension adds support for hardware clip planes to OpenGL ES 2.0 and 3.0. These were present in OpenGL ES 1.1, but were removed to better match
 * certain hardware. Since they're useful for certain applications, notable CAD, we return them here.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public final class APPLEClipDistance {

    /** ccepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetInteger64v, and GetFloatv. */
    public static final int GL_MAX_CLIP_DISTANCES_APPLE = 0xD32;

    /** Accepted by the {@code pname} parameters of Enable, Disable and IsEnabled. */
    public static final int
        GL_CLIP_DISTANCE0_APPLE = 0x3000,
        GL_CLIP_DISTANCE1_APPLE = 0x3001,
        GL_CLIP_DISTANCE2_APPLE = 0x3002,
        GL_CLIP_DISTANCE3_APPLE = 0x3003,
        GL_CLIP_DISTANCE4_APPLE = 0x3004,
        GL_CLIP_DISTANCE5_APPLE = 0x3005,
        GL_CLIP_DISTANCE6_APPLE = 0x3006,
        GL_CLIP_DISTANCE7_APPLE = 0x3007;

    private APPLEClipDistance() {}

}