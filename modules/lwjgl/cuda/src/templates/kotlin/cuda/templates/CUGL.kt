/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package cuda.templates

import cuda.*
import org.lwjgl.generator.*

val CUGL = "CUGL".nativeClass(Module.CUDA, prefix = "CU", binding = NVCUDA_BINDING_DELEGATE) {
    javaImport("static org.lwjgl.cuda.CUDA.*")
    documentation =
        """
        Contains bindings to <a href="https://docs.nvidia.com/cuda/cuda-driver-api/group__CUDA__GL.html\#group__CUDA__GL">CUDA Driver OpenGL
        Interoperability API</a>.
        """

    EnumConstant(
        "Flags to map or unmap a resource. ({@code CUGLmap_flags})",

        "GL_MAP_RESOURCE_FLAGS_NONE".enum("", 0x01),
        "GL_MAP_RESOURCE_FLAGS_READ_ONLY".enum,
        "GL_MAP_RESOURCE_FLAGS_WRITE_DISCARD".enum
    )

    CUresult(
        "GraphicsGLRegisterBuffer",
        "",

        Check(1)..CUgraphicsResource.p.OUT("pCudaResource", ""),
        GLuint.IN("buffer", ""),
        unsigned_int.IN("Flags", "")
    )

    CUresult(
        "GraphicsGLRegisterImage",
        "",

        Check(1)..CUgraphicsResource.p.OUT("pCudaResource", ""),
        GLuint.IN("image", ""),
        GLenum.IN("target", ""),
        unsigned_int.IN("Flags", "")
    )

    CUresult(
        "GLCtxCreate",
        "",

        Check(1)..CUcontext.p.OUT("pCtx", ""),
        unsigned_int.IN("Flags", ""),
        CUdevice.IN("device", "")
    ).versioned()

    CUresult(
        "GLInit",
        ""
    )

    CUresult(
        "GLRegisterBufferObject",
        "",

        GLuint.IN("buffer", "")
    )

    CUresult(
        "GLMapBufferObject",
        "",

        Check(1)..CUdeviceptr.p.OUT("dptr", ""),
        Check(1)..size_t.p.OUT("size", ""),
        GLuint.IN("buffer", "")
    ).ptds(2)

    CUresult(
        "GLUnmapBufferObject",
        "",

        GLuint.IN("buffer", "")
    )

    CUresult(
        "GLUnregisterBufferObject",
        "",

        GLuint.IN("buffer", "")
    )

    CUresult(
        "GLSetBufferObjectMapFlags",
        "",

        GLuint.IN("buffer", ""),
        unsigned_int.IN("Flags", "")
    )

    CUresult(
        "GLMapBufferObjectAsync",
        "",

        Check(1)..CUdeviceptr.p.OUT("dptr", ""),
        Check(1)..size_t.p.OUT("size", ""),
        GLuint.IN("buffer", ""),
        nullable..CUstream.IN("hStream", "")
    ).ptsz(2)

    CUresult(
        "GLUnmapBufferObjectAsync",
        "",

        GLuint.IN("buffer", ""),
        nullable..CUstream.IN("hStream", "")
    )
}