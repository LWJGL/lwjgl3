/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*
import opengl.*

val CL12GL = "CL12GL".dependsOn(Module.OPENGL, Module.OPENGLES)?.nativeClassCL("CL12GL") {
    documentation = "The OpenCL 1.2 OpenGL interoperability functionality."

    IntConstant(
        "cl_gl_object_type",

        "GL_OBJECT_TEXTURE_2D_ARRAY"..0x200E,
        "GL_OBJECT_TEXTURE1D"..0x200F,
        "GL_OBJECT_TEXTURE1D_ARRAY"..0x2010,
        "GL_OBJECT_TEXTURE_BUFFER"..0x2011
    )

    cl_mem(
        "CreateFromGLTexture",
        """
        Creates one of the following:
        ${ul(
            "an OpenCL 2D image object from an OpenGL 2D texture object or a single face of an OpenGL cubemap texture object,",
            "an OpenCL 2D image array object from an OpenGL 2D texture array object,",
            "an OpenCL 1D image object from an OpenGL 1D texture object,",
            "an OpenCL 1D image buffer object from an OpenGL texture buffer object,",
            "an OpenCL 1D image array object from an OpenGL 1D texture array object,",
            "an OpenCL 3D image object from an OpenGL 3D texture object."
        )}

        If the state of a GL texture object is modified through the GL API (e.g. {@code glTexImage2D}, {@code glTexImage3D} or the values of the texture
        parameters {@code GL_TEXTURE_BASE_LEVEL} or {@code GL_TEXTURE_MAX_LEVEL} are modified) while there exists a corresponding CL image object, subsequent
        use of the CL image object will result in undefined behavior.

        The #RetainMemObject() and #ReleaseMemObject() functions can be used to retain and release the image objects.
        """,

        cl_context.IN("context", "a valid OpenCL context created from an OpenGL context"),
        cl_mem_flags.IN(
            "flags",
            "a bit-field that is used to specify usage information",
            "#MEM_READ_ONLY #MEM_WRITE_ONLY #MEM_READ_WRITE"
        ),
        GLenum.IN(
            "texture_target",
            "defines the image type of {@code texture}. No reference to a bound GL texture object is made or implied by this parameter.",
            """
            GL_TEXTURE_1D GL_TEXTURE_1D_ARRAY GL_TEXTURE_BUFFER GL_TEXTURE_2D GL_TEXTURE_2D_ARRAY GL_TEXTURE_3D
            GL_TEXTURE_CUBE_MAP_POSITIVE_X GL_TEXTURE_CUBE_MAP_POSITIVE_Y GL_TEXTURE_CUBE_MAP_POSITIVE_Z GL_TEXTURE_CUBE_MAP_NEGATIVE_X
            GL_TEXTURE_CUBE_MAP_NEGATIVE_Y GL_TEXTURE_CUBE_MAP_NEGATIVE_Z GL_TEXTURE_RECTANGLE
            """
        ),
        GLint.IN(
            "miplevel",
            """
            the mipmap level to be used. Implementations may return $INVALID_OPERATION for {@code miplevel} values &gt; 0. If
            {@code texture_target} is {@code GL_TEXTURE_BUFFER}, {@code miplevel} must be 0.
            """
        ),
        GLuint.IN(
            "texture",
            """
            the name of a GL 1D, 2D, 3D, 1D array, 2D array, cubemap, rectangle or buffer texture object. The texture object must be a complete texture as per
            OpenGL rules on texture completeness. The texture format and dimensions defined by OpenGL for the specified {@code miplevel} of the texture will be
            used to create the OpenCL image memory object. Only GL texture objects with an internal format that maps to appropriate OpenCL image channel order
            and data type may be used to create the OpenCL image memory object.
            """
        ),
        ERROR_RET,

        returnDoc =
        """
        a valid non-zero OpenCL image object and $errcode_ret is set to $SUCCESS if the image object is created successfully. Otherwise, it returns a #NULL
        value with one of the following error values returned in $errcode_ret:
        ${ul(
            "$INVALID_CONTEXT if {@code context} is not a valid context or was not created from a GL context.",
            """
            $INVALID_VALUE if values specified in {@code flags} are not valid or if value specified in {@code texture_target} is not one of the
            values specified in the description of {@code texture_target}.
            """,
            """
            $INVALID_MIP_LEVEL if {@code miplevel} is less than the value of {@code level}<sub>base</sub> (for OpenGL implementations) or zero (for
            OpenGL ES implementations); or greater than the value of {@code q} (for both OpenGL and OpenGL ES).
            """,
            """
            $INVALID_MIP_LEVEL if {@code miplevel} is greather than zero and the OpenGL implementation does not support creating from non-zero mipmap
            levels.
            """,
            """
            $INVALID_GL_OBJECT if {@code texture} is not a GL texture object whose type matches {@code texture_target}, if the specified {@code miplevel}
            of texture is not defined, or if the width or height of the specified {@code miplevel} is zero.
            """,
            "$INVALID_IMAGE_FORMAT_DESCRIPTOR if the OpenGL texture internal format does not map to a supported OpenCL image format.",
            "$INVALID_OPERATION if {@code texture} is a GL texture object created with a border width value greater than zero.",
            OORE,
            OOHME
        )}
        """
    )
}