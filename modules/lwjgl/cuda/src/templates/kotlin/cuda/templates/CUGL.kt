/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package cuda.templates

import cuda.*
import org.lwjgl.generator.*

val CUGL = "CUGL".nativeClass(Module.CUDA, prefix = "CU", binding = NVCUDA_BINDING_DELEGATE) {
    javaImport("static org.lwjgl.cuda.CUDA.*")

    EnumConstant(
        "GL_DEVICE_LIST_ALL".enum(0x01),
        "GL_DEVICE_LIST_CURRENT_FRAME".enum,
        "GL_DEVICE_LIST_NEXT_FRAME".enum
    )

    EnumConstant(
        "GL_MAP_RESOURCE_FLAGS_NONE".enum(0x01),
        "GL_MAP_RESOURCE_FLAGS_READ_ONLY".enum,
        "GL_MAP_RESOURCE_FLAGS_WRITE_DISCARD".enum
    )

    CUresult(
        "GraphicsGLRegisterBuffer",

        Check(1)..CUgraphicsResource.p("pCudaResource"),
        GLuint("buffer"),
        unsigned_int("Flags")
    )

    CUresult(
        "GraphicsGLRegisterImage",

        Check(1)..CUgraphicsResource.p("pCudaResource"),
        GLuint("image"),
        GLenum("target"),
        unsigned_int("Flags")
    )

    IgnoreMissing..CUresult(
        "GLGetDevices",

        Check(1)..unsigned_int.p("pCudaDeviceCount"),
        CUdevice.p("pCudaDevices"),
        AutoSize("pCudaDevices")..unsigned_int("cudaDeviceCount"),
        CUGLDeviceList("deviceList")
    ).versioned()

    CUresult(
        "GLCtxCreate",

        Check(1)..CUcontext.p("pCtx"),
        unsigned_int("Flags"),
        CUdevice("device")
    ).versioned()

    CUresult(
        "GLInit",

        void()
    )

    CUresult(
        "GLRegisterBufferObject",

        GLuint("buffer")
    )

    CUresult(
        "GLMapBufferObject",

        Check(1)..CUdeviceptr.p("dptr"),
        Check(1)..size_t.p("size"),
        GLuint("buffer")
    ).ptds(2)

    CUresult(
        "GLUnmapBufferObject",

        GLuint("buffer")
    )

    CUresult(
        "GLUnregisterBufferObject",

        GLuint("buffer")
    )

    CUresult(
        "GLSetBufferObjectMapFlags",

        GLuint("buffer"),
        unsigned_int("Flags")
    )

    CUresult(
        "GLMapBufferObjectAsync",

        Check(1)..CUdeviceptr.p("dptr"),
        Check(1)..size_t.p("size"),
        GLuint("buffer"),
        nullable..CUstream("hStream")
    ).ptsz(2)

    CUresult(
        "GLUnmapBufferObjectAsync",

        GLuint("buffer"),
        nullable..CUstream("hStream")
    )
}