/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The OpenCL 1.2 OpenGL interoperability functionality. */
public class CL12GL extends CL10GL {

    /** cl_gl_object_type */
    public static final int
        CL_GL_OBJECT_TEXTURE_2D_ARRAY = 0x200E,
        CL_GL_OBJECT_TEXTURE1D        = 0x200F,
        CL_GL_OBJECT_TEXTURE1D_ARRAY  = 0x2010,
        CL_GL_OBJECT_TEXTURE_BUFFER   = 0x2011;

    protected CL12GL() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(CLCapabilities caps) {
        return checkFunctions(
            caps.clCreateFromGLTexture
        );
    }

    // --- [ clCreateFromGLTexture ] ---

    /** Unsafe version of: {@link #clCreateFromGLTexture CreateFromGLTexture} */
    public static long nclCreateFromGLTexture(long context, long flags, int texture_target, int miplevel, int texture, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateFromGLTexture;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPJPP(__functionAddress, context, flags, texture_target, miplevel, texture, errcode_ret);
    }

    /**
     * Creates one of the following:
     * 
     * <ul>
     * <li>an OpenCL 2D image object from an OpenGL 2D texture object or a single face of an OpenGL cubemap texture object,</li>
     * <li>an OpenCL 2D image array object from an OpenGL 2D texture array object,</li>
     * <li>an OpenCL 1D image object from an OpenGL 1D texture object,</li>
     * <li>an OpenCL 1D image buffer object from an OpenGL texture buffer object,</li>
     * <li>an OpenCL 1D image array object from an OpenGL 1D texture array object,</li>
     * <li>an OpenCL 3D image object from an OpenGL 3D texture object.</li>
     * </ul>
     * 
     * <p>If the state of a GL texture object is modified through the GL API (e.g. {@code glTexImage2D}, {@code glTexImage3D} or the values of the texture
     * parameters {@code GL_TEXTURE_BASE_LEVEL} or {@code GL_TEXTURE_MAX_LEVEL} are modified) while there exists a corresponding CL image object, subsequent
     * use of the CL image object will result in undefined behavior.</p>
     * 
     * <p>The {@link CL10#clRetainMemObject RetainMemObject} and {@link CL10#clReleaseMemObject ReleaseMemObject} functions can be used to retain and release the image objects.</p>
     *
     * @param context        a valid OpenCL context created from an OpenGL context
     * @param flags          a bit-field that is used to specify usage information. One of:<br><table><tr><td>{@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}</td></tr></table>
     * @param texture_target defines the image type of {@code texture}. No reference to a bound GL texture object is made or implied by this parameter. One of:<br><table><tr><td>GL_TEXTURE_1D</td><td>GL_TEXTURE_1D_ARRAY</td><td>GL_TEXTURE_BUFFER</td></tr><tr><td>GL_TEXTURE_2D</td><td>GL_TEXTURE_2D_ARRAY</td><td>GL_TEXTURE_3D</td></tr><tr><td>GL_TEXTURE_CUBE_MAP_POSITIVE_X</td><td>GL_TEXTURE_CUBE_MAP_POSITIVE_Y</td><td>GL_TEXTURE_CUBE_MAP_POSITIVE_Z</td></tr><tr><td>GL_TEXTURE_CUBE_MAP_NEGATIVE_X</td><td>GL_TEXTURE_CUBE_MAP_NEGATIVE_Y</td><td>GL_TEXTURE_CUBE_MAP_NEGATIVE_Z</td></tr><tr><td>GL_TEXTURE_RECTANGLE</td></tr></table>
     * @param miplevel       the mipmap level to be used. Implementations may return {@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} for {@code miplevel} values &gt; 0. If
     *                       {@code texture_target} is {@code GL_TEXTURE_BUFFER}, {@code miplevel} must be 0.
     * @param texture        the name of a GL 1D, 2D, 3D, 1D array, 2D array, cubemap, rectangle or buffer texture object. The texture object must be a complete texture as per
     *                       OpenGL rules on texture completeness. The texture format and dimensions defined by OpenGL for the specified {@code miplevel} of the texture will be
     *                       used to create the OpenCL image memory object. Only GL texture objects with an internal format that maps to appropriate OpenCL image channel order
     *                       and data type may be used to create the OpenCL image memory object.
     * @param errcode_ret    will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero OpenCL image object and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the image object is created successfully. Otherwise, it returns a {@code NULL}
     *         value with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context or was not created from a GL context.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid or if value specified in {@code texture_target} is not one of the
     *         values specified in the description of {@code texture_target}.</li>
     *         <li>{@link CL10GL#CL_INVALID_MIP_LEVEL INVALID_MIP_LEVEL} if {@code miplevel} is less than the value of {@code level}<sub>base</sub> (for OpenGL implementations) or zero (for
     *         OpenGL ES implementations); or greater than the value of {@code q} (for both OpenGL and OpenGL ES).</li>
     *         <li>{@link CL10GL#CL_INVALID_MIP_LEVEL INVALID_MIP_LEVEL} if {@code miplevel} is greather than zero and the OpenGL implementation does not support creating from non-zero mipmap
     *         levels.</li>
     *         <li>{@link CL10GL#CL_INVALID_GL_OBJECT INVALID_GL_OBJECT} if {@code texture} is not a GL texture object whose type matches {@code texture_target}, if the specified {@code miplevel}
     *         of texture is not defined, or if the width or height of the specified {@code miplevel} is zero.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if the OpenGL texture internal format does not map to a supported OpenCL image format.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if {@code texture} is a GL texture object created with a border width value greater than zero.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateFromGLTexture.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateFromGLTexture(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("GLenum") int texture_target, @NativeType("GLint") int miplevel, @NativeType("GLuint") int texture, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateFromGLTexture(context, flags, texture_target, miplevel, texture, memAddressSafe(errcode_ret));
    }

    /**
     * Array version of: {@link #clCreateFromGLTexture CreateFromGLTexture}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateFromGLTexture.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateFromGLTexture(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("GLenum") int texture_target, @NativeType("GLint") int miplevel, @NativeType("GLuint") int texture, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateFromGLTexture;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPP(__functionAddress, context, flags, texture_target, miplevel, texture, errcode_ret);
    }

}