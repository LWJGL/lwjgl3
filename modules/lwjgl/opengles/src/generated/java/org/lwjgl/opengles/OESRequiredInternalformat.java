/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_required_internalformat.txt">OES_required_internalformat</a> extension.
 * 
 * <p>The ES 1.1 API allows an implementation to store texture data internally with arbitrary precision, regardless of the format and type of the data
 * supplied by the application. Similarly, ES allows an implementation to choose an arbitrary precision for the internal storage of image data allocated
 * by glRenderbufferStorageOES.</p>
 * 
 * <p>While this allows flexibility for implementations, it does mean that an application does not have a reliable means to request the implementation
 * maintain a specific precision or to find out what precision the implementation will maintain for a given texture or renderbuffer image.</p>
 * 
 * <p>For reference, "Desktop" OpenGL uses the {@code internalformat} argument to glTexImage*, glCopyTexImage* and glRenderbufferStorageEXT as a hint,
 * defining the particular base format and precision that the application wants the implementation to maintain when storing the image data. Further, the
 * application can choose an {@code internalformat} with a different base internal format than the source format specified by {@code format}. The
 * implementation is not required to exactly match the precision specified by {@code internalformat} when choosing an internal storage precision, but it
 * is required to match the base internal format of {@code internalformat}.</p>
 * 
 * <p>In addition, ES 1.1 does not allow an implementation to fail a request to glTexImage2D for any of the legal {@code format} and {@code type}, even if
 * the implementation does not natively support data stored in that external {@code format} and {@code type}. However, there are no additional requirements
 * placed on the implementation. The ES implementation is free to store the texture data with lower precision than originally specified, for instance.
 * Further, since ES removes the ability to query the texture object to find out what internal format it chose, there is no way for the application to
 * find out that this has happened.</p>
 * 
 * <p>This extension addresses the situation in two ways:</p>
 * 
 * <ol>
 * <li>This extension introduces the ability for an application to specify the desired "sized" internal formats for texture image allocation.</li>
 * <li>This extension guarantees to maintain at least the specified precision of all available sized internal formats.</li>
 * </ol>
 * 
 * <p>An implementation that exports this extension is committing to support all of the legal values for {@code internalformat}, subject to the extension
 * dependencies described herein. That is to say, the implementation is guaranteeing that choosing an {@code internalformat} argument with a value from
 * these tables will not cause an image allocation request to fail. Furthermore, it is guaranteeing that for any sized internal format, the renderbuffer
 * or texture data will be stored with at least the precision prescribed by the sized internal format.</p>
 */
public final class OESRequiredInternalformat {

    /** Accepted by the {@code internalformat} argument of TexImage2D, TexImage3DOES, and CopyTexImage2D. */
    public static final int
        GL_ALPHA8_OES            = 0x803C,
        GL_LUMINANCE8_OES        = 0x8040,
        GL_LUMINANCE8_ALPHA8_OES = 0x8045,
        GL_LUMINANCE4_ALPHA4_OES = 0x8043,
        GL_RGB565_OES            = 0x8D62,
        GL_RGB8_OES              = 0x8051,
        GL_RGBA4_OES             = 0x8056,
        GL_RGB5_A1_OES           = 0x8057,
        GL_RGBA8_OES             = 0x8058,
        GL_DEPTH_COMPONENT16_OES = 0x81A5,
        GL_DEPTH_COMPONENT24_OES = 0x81A6,
        GL_DEPTH_COMPONENT32_OES = 0x81A7,
        GL_DEPTH24_STENCIL8_OES  = 0x88F0,
        GL_RGB10_EXT             = 0x8052,
        GL_RGB10_A2_EXT          = 0x8059;

    private OESRequiredInternalformat() {}

}