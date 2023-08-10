/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_copy_image.txt">OES_copy_image</a> extension.
 * 
 * <p>This extension enables efficient image data transfer between image objects (i.e. textures and renderbuffers) without the need to bind the objects or
 * otherwise configure the rendering pipeline.</p>
 * 
 * <p>This is accomplised by adding a new entry-point CopyImageSubData, which takes a named source and destination.</p>
 * 
 * <p>CopyImageSubData does not perform general-purpose conversions such as scaling, resizing, blending, color-space, or format conversions. It should be
 * considered to operate in a manner similar to a CPU memcpy, but using the GPU for the copy.</p>
 * 
 * <p>CopyImageSubData supports copies between images with different internal formats, if the formats are compatible as described in this extension.</p>
 * 
 * <p>CopyImageSubData also supports copying between compressed and uncompressed images if the compressed block / uncompressed texel sizes are the same.</p>
 * 
 * <p>Requires {@link GLES30 GLES 3.0}.</p>
 */
public class OESCopyImage {

    static { GLES.initialize(); }

    protected OESCopyImage() {
        throw new UnsupportedOperationException();
    }

    // --- [ glCopyImageSubDataOES ] ---

    public static native void glCopyImageSubDataOES(@NativeType("GLuint") int srcName, @NativeType("GLenum") int srcTarget, @NativeType("GLint") int srcLevel, @NativeType("GLint") int srcX, @NativeType("GLint") int srcY, @NativeType("GLint") int srcZ, @NativeType("GLuint") int dstName, @NativeType("GLenum") int dstTarget, @NativeType("GLint") int dstLevel, @NativeType("GLint") int dstX, @NativeType("GLint") int dstY, @NativeType("GLint") int dstZ, @NativeType("GLsizei") int srcWidth, @NativeType("GLsizei") int srcHeight, @NativeType("GLsizei") int srcDepth);

}