/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/IMG/IMG_read_format.txt">IMG_read_format</a> extension.
 * 
 * <p>This extension is intended to supplement the GL_OES_read_format extension by adding support for more format/type combinations to be used when calling
 * ReadPixels. ReadPixels currently accepts one fixed format/type combination (format RGBA and type UNSIGNED_BYTE) for portability, and an implementation
 * specific format/type combination queried using the tokens IMPLEMENTATION_COLOR_READ_FORMAT_OES and IMPLEMENTATION_COLOR_READ_TYPE_OES
 * (GL_OES_read_format extension). This extension adds the following format/type combinations to those currently allowed to be returned by GetIntegerV:</p>
 * 
 * <pre><code>
 *     format                      type
 *     ------                      ----
 *     BGRA_IMG                    UNSIGNED_BYTE
 *     BGRA_IMG                    UNSIGNED_SHORT_4_4_4_4_REV_IMG</code></pre>
 * 
 * <p>E.g. Calling GetIntegerv with a {@code pname} parameter of IMPLEMENTATION_COLOR_READ_FORMAT_OES can now return BGRA, with the corresponding call to
 * GetIntegerv using a {@code pname} parameter of IMPLEMENTATION_COLOR_READ_TYPE_OES returning UNSIGNED_BYTE;</p>
 */
public final class IMGReadFormat {

    /** Accepted by the {@code format} parameter of ReadPixels. */
    public static final int
        GL_BGRA_IMG                       = 0x80E1,
        GL_UNSIGNED_SHORT_4_4_4_4_REV_IMG = 0x8365;

    private IMGReadFormat() {}

}