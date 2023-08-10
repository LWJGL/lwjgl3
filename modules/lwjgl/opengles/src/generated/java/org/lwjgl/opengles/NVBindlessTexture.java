/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_bindless_texture.txt">NV_bindless_texture</a> extension.
 * 
 * <p>This extension allows OpenGL applications to access texture objects in shaders without first binding each texture to one of a limited number of texture
 * image units. Using this extension, an application can query a 64-bit unsigned integer texture handle for each texture that it wants to access and then
 * use that handle directly in GLSL or assembly-based shaders. The ability to access textures without having to bind and/or re-bind them is similar to the
 * capability provided by the NV_shader_buffer_load extension that allows shaders to access buffer objects without binding them. In both cases, these
 * extensions significantly reduce the amount of API and internal GL driver overhead needed to manage resource bindings.</p>
 * 
 * <p>This extension also provides similar capability for the image load, store, and atomic functionality provided by OpenGL 4.2, OpenGL ES 3.1 and the
 * ARB_shader_image_load_store and EXT_shader_image_load_store extensions, where a texture can be accessed without first binding it to an image unit. An
 * image handle can be extracted from a texture object using an API with a set of parameters similar to those for BindImageTextureEXT.</p>
 * 
 * <p>This extension adds no new data types to GLSL. Instead, it uses existing sampler and image data types and allows them to be populated with texture and
 * image handles. This extension does permit sampler and image data types to be used in more contexts than in unextended GLSL 4.00. In particular, sampler
 * and image types may be used as shader inputs/outputs, temporary variables, and uniform block members, and may be assigned to by shader code.
 * Constructors are provided to convert 64-bit unsigned integer values to and from sampler and image data types. Additionally, new APIs are provided to
 * load values for sampler and image uniforms with 64-bit handle inputs. The use of existing integer-based Uniform* APIs is still permitted, in which case
 * the integer specified will identify a texture image or image unit. For samplers and images with values specified as texture image or image units, the
 * GL implemenation will translate the unit number to an internal handle as required.</p>
 * 
 * <p>To access texture or image resources using handles, the handles must first be made resident. Accessing a texture or image by handle without first
 * making it resident can result in undefined results, including program termination. Since the amount of texture memory required by an application may
 * exceed the amount of memory available to the system, this extension provides API calls allowing applications to manage overall texture memory
 * consumption by making a texture resident and non-resident as required.</p>
 * 
 * <p>Requires {@link GLES30 GLES 3.0}.</p>
 */
public class NVBindlessTexture {

    static { GLES.initialize(); }

    protected NVBindlessTexture() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetTextureHandleNV ] ---

    @NativeType("GLuint64")
    public static native long glGetTextureHandleNV(@NativeType("GLuint") int texture);

    // --- [ glGetTextureSamplerHandleNV ] ---

    @NativeType("GLuint64")
    public static native long glGetTextureSamplerHandleNV(@NativeType("GLuint") int texture, @NativeType("GLuint") int sampler);

    // --- [ glMakeTextureHandleResidentNV ] ---

    public static native void glMakeTextureHandleResidentNV(@NativeType("GLuint64") long handle);

    // --- [ glMakeTextureHandleNonResidentNV ] ---

    public static native void glMakeTextureHandleNonResidentNV(@NativeType("GLuint64") long handle);

    // --- [ glGetImageHandleNV ] ---

    @NativeType("GLuint64")
    public static native long glGetImageHandleNV(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLboolean") boolean layered, @NativeType("GLint") int layer, @NativeType("GLenum") int format);

    // --- [ glMakeImageHandleResidentNV ] ---

    public static native void glMakeImageHandleResidentNV(@NativeType("GLuint64") long handle, @NativeType("GLenum") int access);

    // --- [ glMakeImageHandleNonResidentNV ] ---

    public static native void glMakeImageHandleNonResidentNV(@NativeType("GLuint64") long handle);

    // --- [ glUniformHandleui64NV ] ---

    public static native void glUniformHandleui64NV(@NativeType("GLint") int location, @NativeType("GLuint64") long value);

    // --- [ glUniformHandleui64vNV ] ---

    public static native void nglUniformHandleui64vNV(int location, int count, long values);

    public static void glUniformHandleui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64 const *") LongBuffer values) {
        nglUniformHandleui64vNV(location, values.remaining(), memAddress(values));
    }

    // --- [ glProgramUniformHandleui64NV ] ---

    public static native void glProgramUniformHandleui64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64") long value);

    // --- [ glProgramUniformHandleui64vNV ] ---

    public static native void nglProgramUniformHandleui64vNV(int program, int location, int count, long values);

    public static void glProgramUniformHandleui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 const *") LongBuffer values) {
        nglProgramUniformHandleui64vNV(program, location, values.remaining(), memAddress(values));
    }

    // --- [ glIsTextureHandleResidentNV ] ---

    @NativeType("GLboolean")
    public static native boolean glIsTextureHandleResidentNV(@NativeType("GLuint64") long handle);

    // --- [ glIsImageHandleResidentNV ] ---

    @NativeType("GLboolean")
    public static native boolean glIsImageHandleResidentNV(@NativeType("GLuint64") long handle);

    /** Array version of: {@link #glUniformHandleui64vNV UniformHandleui64vNV} */
    public static void glUniformHandleui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64 const *") long[] values) {
        long __functionAddress = GLES.getICD().glUniformHandleui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, values.length, values, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniformHandleui64vNV ProgramUniformHandleui64vNV} */
    public static void glProgramUniformHandleui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 const *") long[] values) {
        long __functionAddress = GLES.getICD().glProgramUniformHandleui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, values.length, values, __functionAddress);
    }

}