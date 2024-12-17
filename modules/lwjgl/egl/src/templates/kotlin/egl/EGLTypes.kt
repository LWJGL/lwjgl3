/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl

import org.lwjgl.generator.*

val noneTerminated = Terminated("EGL10.EGL_NONE") // EGL_NONE is not zero

// khrplatform.h
val khronos_uint64_t = IntegerType("khronos_uint64_t", PrimitiveMapping.LONG, unsigned = true)
val khronos_int64_t = IntegerType("khronos_int64_t", PrimitiveMapping.LONG)
val khronos_ssize_t = IntegerType("khronos_ssize_t", PrimitiveMapping.POINTER)
val khronos_utime_nanoseconds_t = typedef(khronos_uint64_t, "khronos_utime_nanoseconds_t")
val khronos_stime_nanoseconds_t = typedef(khronos_int64_t, "khronos_utime_nanoseconds_t")

// EGL 1.0
val EGLBoolean = PrimitiveType("EGLBoolean", PrimitiveMapping.BOOLEAN4)
val EGLint = IntegerType("EGLint", PrimitiveMapping.INT)

val EGLDisplay = "EGLDisplay".handle
val EGLNativeDisplayType = "EGLNativeDisplayType".handle
val EGLNativePixmapType = "EGLNativePixmapType".handle
val EGLNativeWindowType = "EGLNativeWindowType".handle
val EGLConfig = "EGLConfig".handle
val EGLSurface = "EGLSurface".handle
val EGLContext = "EGLContext".handle

val __eglMustCastToProperFunctionPointerType = "__eglMustCastToProperFunctionPointerType".handle

// EGL 1.2
val EGLenum = typedef(unsigned_int, "EGLenum")
val EGLClientBuffer = "EGLClientBuffer".handle

// EGL 1.5
val EGLSync = "EGLSync".handle
val EGLAttrib = typedef(intptr_t, "EGLAttrib")
val EGLTime = typedef(khronos_utime_nanoseconds_t, "EGLTime")
val EGLImage = "EGLImage".handle

// ANDROID_presentation_time
val EGLnsecsANDROID = typedef(khronos_stime_nanoseconds_t, "EGLnsecsANDROID")

// KHR_cl_event2
val EGLAttribKHR = typedef(intptr_t, "EGLAttribKHR")

// KHR_debug
val EGLObjectKHR = "EGLObjectKHR".handle
val EGLLabelKHR = "EGLLabelKHR".handle
val EGLDEBUGPROCKHR = Module.EGL.callback {
    void(
        "EGLDebugMessageKHRCallback",

        EGLenum("error"),
        charASCII.const.p("command"),
        EGLint("messageType"),
        EGLLabelKHR("threadLabel"),
        EGLLabelKHR("objectLabel"),
        nullable..charUTF8.const.p("message"),

        nativeType = "EGLDEBUGPROCKHR"
    ) {
        additionalCode = """
    /**
     * Converts the specified {@link EGLDebugMessageKHRCallback} argument to a String.
     *
     * <p>This method may only be used inside an EGLDebugMessageKHRCallback invocation.</p>
     *
     * @param command the EGLDebugMessageKHRCallback {@code command} argument
     *
     * @return the command as a String
     */
    public static String getCommand(long command) {
        return memASCII(command);
    }

    /**
     * Converts the specified {@link EGLDebugMessageKHRCallback} argument to a String.
     *
     * <p>This method may only be used inside an EGLDebugMessageKHRCallback invocation.</p>
     *
     * @param message the EGLDebugMessageKHRCallback {@code message} argument
     *
     * @return the message as a String
     */
    public static String getMessage(long message) {
        return memUTF8(message);
    }
    """
    }
}

// KHR_fence_sync
val EGLSyncKHR = "EGLSyncKHR".handle
val EGLTimeKHR = typedef(khronos_utime_nanoseconds_t, "EGLTimeKHR")

// KHR_image
val EGLImageKHR = "EGLImageKHR".handle

// KHR_stream
val EGLStreamKHR = "EGLStreamKHR".handle
val EGLuint64KHR = typedef(khronos_uint64_t, "EGLuint64KHR")

// KHR_stream_cross_process_fd
val EGLNativeFileDescriptorKHR = typedef(int, "EGLNativeFileDescriptorKHR")

// ANDROID_blob_cache
val EGLsizeiANDROID = typedef(khronos_ssize_t, "EGLsizeiANDROID")
val EGLSetBlobFuncANDROID = Module.EGL.callback {
    void(
        "EGLSetBlobFuncANDROID",

        void.const.p("key"),
        AutoSize("key")..EGLsizeiANDROID("keySize"),
        void.const.p("value"),
        AutoSize("value")..EGLsizeiANDROID("valueSize"),

        nativeType = "EGLSetBlobFuncANDROID"
    ) {
    }
}
val EGLGetBlobFuncANDROID = Module.EGL.callback {
    EGLsizeiANDROID(
        "EGLGetBlobFuncANDROID",

        void.const.p("key"),
        AutoSize("key")..EGLsizeiANDROID("keySize"),
        void.p("value"),
        AutoSize("value")..EGLsizeiANDROID("valueSize"),

        nativeType = "EGLGetBlobFuncANDROID"
    ) {
    }
}

// EXT_device_base
val EGLDeviceEXT = "EGLDeviceEXT".handle

// EXT_output_base
val EGLOutputLayerEXT = "EGLOutputLayerEXT".handle
val EGLOutputPortEXT = "EGLOutputPortEXT".handle

// HI_clientpixmap
val EGLClientPixmapHI = struct(Module.EGL, "EGLClientPixmapHI", nativeName = "struct EGLClientPixmapHI") {
    void.p("pData")
    EGLint("iWidth")
    EGLint("iHeight")
    EGLint("iStride")
}

// NV_sync
val EGLSyncNV = "EGLSyncNV".handle
val EGLTimeNV = typedef(khronos_utime_nanoseconds_t, "EGLTimeNV")

// NV_system_time
val EGLuint64NV = typedef(khronos_utime_nanoseconds_t, "EGLuint64NV")