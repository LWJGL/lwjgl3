/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/GLX_EXT_visual_rating.txt">GLX_EXT_visual_rating</a> extension.
 * 
 * <p>This extension allows servers to identify a particular GLX visual as undesirable. A new visual attribute is introduced, providing a way for servers to
 * specify caveats (e.g., slow) for a visual. The attribute  may be queried using {@link GLX#glXGetConfig GetConfig}, and can therefore be used by
 * application-specific visual selection routines. The new attribute is also used by {@link GLX#glXChooseVisual ChooseVisual} to discriminate against visuals with
 * caveats.</p>
 * 
 * <p>This extension allows servers to export visuals with improved features or image quality, but lower performance or greater system burden, without having
 * to have these visuals selected preferentially.  It is intended to insure that most applications get the "right" visual, not that all applications do.</p>
 */
public final class GLXEXTVisualRating {

    /** Accepted by the {@code attribute} parameter of {@link GLX#glXGetConfig GetConfig} and by the {@code attrib_list} parameter of {@link GLX#glXChooseVisual ChooseVisual}. */
    public static final int GLX_VISUAL_CAVEAT_EXT = 0x20;

    /**
     * Returned by the {@code value} parameter of {@link GLX#glXGetConfig GetConfig} (when {@code attribute} is set to {@link #GLX_VISUAL_CAVEAT_EXT VISUAL_CAVEAT_EXT}) and accepted by the {@code attrib_list}
     * parameter of {@link GLX#glXChooseVisual ChooseVisual} (following the {@link #GLX_VISUAL_CAVEAT_EXT VISUAL_CAVEAT_EXT} token).
     */
    public static final int
        GLX_NONE_EXT                  = 0x8000,
        GLX_SLOW_VISUAL_EXT           = 0x8001,
        GLX_NON_CONFORMANT_VISUAL_EXT = 0x800D;

    private GLXEXTVisualRating() {}

}