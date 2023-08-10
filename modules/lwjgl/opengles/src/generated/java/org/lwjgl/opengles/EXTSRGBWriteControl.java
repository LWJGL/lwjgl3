/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_sRGB_write_control.txt">EXT_sRGB_write_control</a> extension.
 * 
 * <p>This extension's intent is to expose new functionality which allows an application the ability to decide if the conversion from linear space to sRGB is
 * necessary by enabling or disabling this conversion at framebuffer write or blending time. An application which passes non-linear vector data to a
 * shader may not want the color conversion occurring, and by disabling conversion the application can be simplified, sometimes in very significant and
 * more optimal ways.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0} and {@link EXTSRGB EXT_sRGB} or {@link GLES30 GLES 3.0}.</p>
 */
public final class EXTSRGBWriteControl {

    /**
     * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetFloatv, GetIntegerv and
     * GetInteger64v.
     */
    public static final int GL_FRAMEBUFFER_SRGB_EXT = 0x8DB9;

    private EXTSRGBWriteControl() {}

}