/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/GLX_EXT_visual_info.txt">GLX_EXT_visual_info</a> extension.
 * 
 * <p>This extension allows the user to request a particular X visual type to be associated with a GLX visual, and allows the user to query the X visual type
 * underlying a GLX visual.</p>
 * 
 * <p>In addition, this extension provides a means to request a visual with a transparent pixel and to query whether a visual supports a transparent pixel
 * value and the value of the transparent pixel. Note that the notion of level and transparent pixels are orthogonal as both layer 1 and layer 0 visuals
 * may or may not have a transparent pixel value.</p>
 */
public final class GLXEXTVisualInfo {

    /** Accepted by the {@code attrib} parameter of {@link GLX#glXGetConfig GetConfig}, and by the {@code attrib_list} parameter of {@link GLX#glXChooseVisual ChooseVisual}. */
    public static final int
        GLX_X_VISUAL_TYPE_EXT           = 0x22,
        GLX_TRANSPARENT_TYPE_EXT        = 0x23,
        GLX_TRANSPARENT_INDEX_VALUE_EXT = 0x24,
        GLX_TRANSPARENT_RED_VALUE_EXT   = 0x25,
        GLX_TRANSPARENT_GREEN_VALUE_EXT = 0x26,
        GLX_TRANSPARENT_BLUE_VALUE_EXT  = 0x27,
        GLX_TRANSPARENT_ALPHA_VALUE_EXT = 0x28;

    /**
     * Returned by {@link GLX#glXGetConfig GetConfig}, and accepted by the {@code attrib_list} parameter of {@link GLX#glXChooseVisual ChooseVisual} (following the
     * {@link #GLX_X_VISUAL_TYPE_EXT X_VISUAL_TYPE_EXT} token).
     */
    public static final int
        GLX_TRUE_COLOR_EXT   = 0x8002,
        GLX_DIRECT_COLOR_EXT = 0x8003,
        GLX_PSEUDO_COLOR_EXT = 0x8004,
        GLX_STATIC_COLOR_EXT = 0x8005,
        GLX_GRAY_SCALE_EXT   = 0x8006,
        GLX_STATIC_GRAY_EXT  = 0x8007;

    /**
     * Returned by {@link GLX#glXGetConfig GetConfig}, and accepted by the {@code attrib_list} parameter of {@link GLX#glXChooseVisual ChooseVisual} (following the
     * {@link #GLX_TRANSPARENT_TYPE_EXT TRANSPARENT_TYPE_EXT} token).
     */
    public static final int
        GLX_NONE_EXT              = 0x8000,
        GLX_TRANSPARENT_RGB_EXT   = 0x8008,
        GLX_TRANSPARENT_INDEX_EXT = 0x8009;

    private GLXEXTVisualInfo() {}

}