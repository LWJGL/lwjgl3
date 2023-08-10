/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_abgr.txt">EXT_abgr</a> extension.
 * 
 * <p>EXT_abgr extends the list of host-memory color formats. Specifically, it provides a reverse-order alternative to image format RGBA. The ABGR component
 * order matches the cpack Iris GL format on big-endian machines.</p>
 */
public final class EXTABGR {

    /** Accepted by the {@code format} parameter of DrawPixels, GetTexImage, ReadPixels, TexImage1D, and TexImage2D. */
    public static final int GL_ABGR_EXT = 0x8000;

    private EXTABGR() {}

}