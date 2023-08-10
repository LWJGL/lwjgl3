/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_read_format_bgra.txt">EXT_read_format_bgra</a> extension.
 * 
 * <p>This extension is intended to supplement the GL_OES_read_format extension by adding support for more format/type combinations to be used when calling
 * ReadPixels. ReadPixels currently accepts one fixed format/type combination (format RGBA and type UNSIGNED_BYTE) for portability, and an implementation
 * specific format/type combination queried using the tokens IMPLEMENTATION_COLOR_READ_FORMAT_OES and IMPLEMENTATION_COLOR_READ_TYPE_OES
 * (GL_OES_read_format extension). This extension adds the following format/type combinations to those currently allowed to be returned by GetIntegerV:</p>
 * 
 * <pre><code>
 *     format                      type
 *     ------                      ----
 *     BGRA_EXT                    UNSIGNED_BYTE
 *     BGRA_EXT                    UNSIGNED_SHORT_4_4_4_4_REV_EXT
 *     BGRA_EXT                    UNSIGNED_SHORT_1_5_5_5_REV_EXT</code></pre>
 * 
 * <p>E.g. Calling GetIntegerv with a {@code pname} parameter of IMPLEMENTATION_COLOR_READ_FORMAT_OES can now return BGRA_EXT, with the corresponding call to
 * GetIntegerv using a {@code pname} parameter of IMPLEMENTATION_COLOR_READ_TYPE_OES returning UNSIGNED_BYTE;</p>
 */
public final class EXTReadFormatBGRA {

    /** Accepted by the {@code format} parameter of ReadPixels. */
    public static final int GL_BGRA_EXT = 0x80E1;

    /** Accepted by the {@code type} parameter of ReadPixels. */
    public static final int
        GL_UNSIGNED_SHORT_4_4_4_4_REV_EXT = 0x8365,
        GL_UNSIGNED_SHORT_1_5_5_5_REV_EXT = 0x8366;

    private EXTReadFormatBGRA() {}

}