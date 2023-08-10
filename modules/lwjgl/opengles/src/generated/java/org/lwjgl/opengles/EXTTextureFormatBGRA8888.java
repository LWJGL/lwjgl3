/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_format_BGRA8888.txt">EXT_texture_format_BGRA8888</a> extension.
 * 
 * <p>This extension provides an additional format and type combination for use when specifying texture data.  The current allowed combinations are:</p>
 * 
 * <pre><code>
 *     Internal Format     External Format Type                    Bytes per Pixel
 *     ---------------     --------------- ----                    ---------------
 *     RGBA                RGBA             UNSIGNED_BYTE          4
 *     RGB                 RGB              UNSIGNED_BYTE          3
 *     RGBA                RGBA             UNSIGNED_SHORT_4_4_4_4 2
 *     RGBA                RGBA             UNSIGNED_SHORT_5_5_5_1 2
 *     RGB                 RGB              UNSIGNED_SHORT_5_6_5   2
 *     LUMINANCE_ALPHA     LUMINANCE_ALPHA  UNSIGNED_BYTE          2
 *     LUMINANCE           LUMINANCE        UNSIGNED_BYTE          1
 *     ALPHA               ALPHA            UNSIGNED_BYTE          1</code></pre>
 * 
 * <p>This table is extended to include format BGRA_EXT and type UNSIGNED_BYTE:</p>
 * 
 * <pre><code>
 * Internal Format     External Format Type                    Bytes per Pixel
 * ---------------     --------------- ----                    ---------------
 * BGRA_EXT            BGRA_EXT        UNSIGNED_BYTE           4
 * RGBA                RGBA            UNSIGNED_BYTE           4
 * RGB                 RGB             UNSIGNED_BYTE           3
 * RGBA                RGBA            UNSIGNED_SHORT_4_4_4_4  2
 * RGBA                RGBA            UNSIGNED_SHORT_5_5_5_1  2
 * RGB                 RGB             UNSIGNED_SHORT_5_6_5    2
 * LUMINANCE_ALPHA     LUMINANCE_ALPHA UNSIGNED_BYTE           2
 * LUMINANCE           LUMINANCE       UNSIGNED_BYTE           1
 * ALPHA               ALPHA           UNSIGNED_BYTE           1</code></pre>
 */
public final class EXTTextureFormatBGRA8888 {

    /** Accepted by the {@code format} and {@code internalformat} parameters of TexImage2D and the {@code format} parameter of TexSubImage2D. */
    public static final int GL_BGRA_EXT = 0x80E1;

    private EXTTextureFormatBGRA8888() {}

}