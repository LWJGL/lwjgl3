/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_packed_float.txt">GLX_EXT_fbconfig_packed_float</a> extension.
 * 
 * <p>This extension adds a new 3-component floating-point texture format that fits within a single 32-bit word.  This format stores 5 bits of biased exponent
 * per component in the same manner as 16-bit floating-point formats, but rather than 10 mantissa bits, the red, green, and blue components have 6, 6, and
 * 5 bits respectively. Each mantissa is assumed to have an implied leading one except in the denorm exponent case.  There is no sign bit so only
 * non-negative values can be represented.  Positive infinity, positive denorms, and positive NaN values are representable.  The value of the fourth
 * component returned by a texture fetch is always 1.0.</p>
 * 
 * <p>This extension also provides support for rendering into an unsigned floating-point rendering format with the assumption that the texture format
 * described above could also be advertised as an unsigned floating-point format for rendering.</p>
 * 
 * <p>The extension also provides a pixel external format for specifying packed float values directly.</p>
 * 
 * <p>Requires {@link GLX13 GLX 1.3}.</p>
 */
public final class GLXEXTFBConfigPackedFloat {

    /** Accepted as values of the {@code render_type} arguments in the {@link GLX13#glXCreateNewContext CreateNewContext} and {@link GLX#glXCreateContext CreateContext} functions. */
    public static final int GLX_RGBA_UNSIGNED_FLOAT_TYPE_EXT = 0x20B1;

    /**
     * Returned by {@link GLX13#glXGetFBConfigAttrib GetFBConfigAttrib} (when {@code attribute} is set to GLX_RENDER_TYPE) and accepted by the {@code attrib_list} parameter of
     * {@link GLX13#glXChooseFBConfig ChooseFBConfig} (following the GLX_RENDER_TYPE token).
     */
    public static final int GLX_RGBA_UNSIGNED_FLOAT_BIT_EXT = 0x8;

    private GLXEXTFBConfigPackedFloat() {}

}