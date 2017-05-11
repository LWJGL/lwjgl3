/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl

import org.lwjgl.generator.*

val EGL_PACKAGE = "org.lwjgl.egl"

val noneTerminated = Terminated("EGL10.EGL_NONE") // EGL_NONE is not zero

// khrplatform.h
val khronos_uint64_t = IntegerType("khronos_uint64_t", PrimitiveMapping.LONG, unsigned = true)
val khronos_int64_t = IntegerType("khronos_int64_t", PrimitiveMapping.LONG)
val khronos_ssize_t = IntegerType("khronos_ssize_t", PrimitiveMapping.POINTER)
val khronos_utime_nanoseconds_t = typedef(khronos_uint64_t, "khronos_utime_nanoseconds_t")
val khronos_stime_nanoseconds_t = typedef(khronos_int64_t, "khronos_utime_nanoseconds_t")

// EGL 1.0
val EGLBoolean = PrimitiveType("EGLBoolean", PrimitiveMapping.BOOLEAN4)
val EGLBoolean_p = EGLBoolean.p
val EGLint = IntegerType("EGLint", PrimitiveMapping.INT)
val EGLint_p = EGLint.p

val EGLDisplay = "EGLDisplay".opaque_p
val EGLNativeDisplayType = "EGLNativeDisplayType".opaque_p
val EGLNativePixmapType = "EGLNativePixmapType".opaque_p
val EGLNativeWindowType = "EGLNativeWindowType".opaque_p
val EGLConfig = "EGLConfig".opaque_p
val EGLSurface = "EGLSurface".opaque_p
val EGLContext = "EGLContext".opaque_p

val EGLNativeDisplayType_p = EGLNativeDisplayType.p
val EGLNativePixmapType_p = EGLNativePixmapType.p
val EGLNativeWindowType_p = EGLNativeWindowType.p
val EGLConfig_p = EGLConfig.p

val __eglMustCastToProperFunctionPointerType = "__eglMustCastToProperFunctionPointerType".opaque_p

// EGL 1.2
val EGLenum = typedef(unsigned_int, "EGLenum")
val EGLClientBuffer = "EGLClientBuffer".opaque_p

// EGL 1.5
val EGLSync = "EGLSync".opaque_p
val EGLAttrib = typedef(intptr_t, "EGLAttrib")
val EGLAttrib_p = EGLAttrib.p
val EGLTime = typedef(khronos_utime_nanoseconds_t, "EGLTime")
val EGLImage = "EGLImage".opaque_p

// ANDROID_presentation_time
val EGLnsecsANDROID = typedef(khronos_stime_nanoseconds_t, "EGLnsecsANDROID")

// KHR_cl_event2
val EGLAttribKHR = typedef(intptr_t, "EGLAttribKHR")
val EGLAttribKHR_p = EGLAttribKHR.p

// KHR_debug
val EGLObjectKHR = "EGLObjectKHR".opaque_p
val EGLLabelKHR = "EGLLabelKHR".opaque_p
val EGLDEBUGPROCKHR = "EGLDEBUGPROCKHR".callback(
    EGL_PACKAGE, void, "EGLDebugMessageKHRCallback",
    "Will be called when a debug message is generated.",
    EGLenum.IN("error", "will contain an EGL error code, or #SUCCESS, as applicable"),
    const..charASCII_p.IN("command", "will contain a pointer to a string. Example \"eglBindApi\"."),
    EGLint.IN("messageType", "will contain one of the debug message types"),
    EGLLabelKHR.IN(
        "threadLabel",
        """
        will contain the label attached to the current thread. The {@code threadLabel} will be #NULL if not set by the application. If the message is from an
        internal thread, the label will be #NULL.
        """
    ),
    EGLLabelKHR.IN(
        "objectLabel",
        """
        will contain the label attached to the primary object of the message; Labels will be #NULL if not set by the application. The primary object should
        be the object the function operates on, see table 13.2 which provides the recommended mapping between functions and their primary object. This
        {@code objectLabel} may be #NULL even though the application labeled the object. This is because it is possible an error was raised while executing
        the command before the primary object was validated, therefore its label can not be included in the callback.
        """
    ),
    nullable..const..charUTF8_p.IN(
        "message",
        """
        will contain a platform specific debug string message; This string should provide added information to the application developer regarding the
        condition that generated the message. The format of a message is implementation-defined, although it should represent a concise description of the
        event that caused the message to be generated. Message strings can be #NULL and should not be assumed otherwise.
        """
    )
) {
    documentation = "Instances of this interface may be passed to the #DebugMessageControlKHR() method."
    useSystemCallConvention()
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

// KHR_fence_sync
val EGLSyncKHR = "EGLSyncKHR".opaque_p
val EGLTimeKHR = typedef(khronos_utime_nanoseconds_t, "EGLTimeKHR")
val EGLTimeKHR_p = EGLTimeKHR.p

// KHR_image
val EGLImageKHR = "EGLImageKHR".opaque_p

// KHR_stream
val EGLStreamKHR = "EGLStreamKHR".opaque_p
val EGLuint64KHR = typedef(khronos_uint64_t, "EGLuint64KHR")
val EGLuint64KHR_p = EGLuint64KHR.p

// KHR_stream_cross_process_fd
val EGLNativeFileDescriptorKHR = typedef(int, "EGLNativeFileDescriptorKHR")

// ANDROID_blob_cache
val EGLsizeiANDROID = typedef(khronos_ssize_t, "EGLsizeiANDROID")
val EGLSetBlobFuncANDROID = "EGLSetBlobFuncANDROID".callback(
    EGL_PACKAGE, void, "EGLSetBlobFuncANDROID", "",
    const..void_p.IN("key", ""),
    AutoSize("key")..EGLsizeiANDROID.IN("keySize", ""),
    const..void_p.IN("value", ""),
    AutoSize("value")..EGLsizeiANDROID.IN("valueSize", "")
) {
    documentation = "Instances of this interface may be passed to the #SetBlobCacheFuncsANDROID() method."
}
val EGLGetBlobFuncANDROID = "EGLGetBlobFuncANDROID".callback(
    EGL_PACKAGE, EGLsizeiANDROID, "EGLGetBlobFuncANDROID", "",
    const..void_p.IN("key", ""),
    AutoSize("key")..EGLsizeiANDROID.IN("keySize", ""),
    void_p.IN("value", ""),
    AutoSize("value")..EGLsizeiANDROID.IN("valueSize", "")
) {
    documentation = "Instances of this interface may be passed to the #SetBlobCacheFuncsANDROID() method."
}

// EXT_device_base
val EGLDeviceEXT = "EGLDeviceEXT".opaque_p
val EGLDeviceEXT_p = EGLDeviceEXT.p

// EXT_output_base
val EGLOutputLayerEXT = "EGLOutputLayerEXT".opaque_p
val EGLOutputLayerEXT_p = EGLOutputLayerEXT.p
val EGLOutputPortEXT = "EGLOutputPortEXT".opaque_p
val EGLOutputPortEXT_p = EGLOutputPortEXT.p

// HI_clientpixmap
val EGLClientPixmapHI_p = struct(EGL_PACKAGE, "EGLClientPixmapHI", nativeName = "struct EGLClientPixmapHI") {
    documentation =
        """
        Specifies the width, height, stride, format and memory pointer of the pixmap to be used by the function #CreatePixmapSurfaceHI() to
        create the {@code PixmapSurface}.
        """

    void_p.member(
        "pData",
        """
        pointer to a memory buffer allocated by the application that will contain the result of the drawing operations. It is up to the application to ensure
        that the buffer size corresponds to {@code iHeight * iStride * sizeof(pixel)}.
    """)
    EGLint.member("iWidth", "width of the buffer in pixels")
    EGLint.member(
        "iHeight",
        """
        height of the buffer in pixels. The height of the buffer can be negative; in that case the result of the drawing operations will be vertically swapped.
        When positive, {@code pData} will point at the bottom-left corner of the image; when negative, to the top-left corner.
        """
    )
    EGLint.member("iStride", "stride of the buffer, in pixels. It is important to note that each row of the buffer must start on 32-bit boundaries.")
}.p

// NV_sync
val EGLSyncNV = "EGLSyncNV".opaque_p
val EGLTimeNV = typedef(khronos_utime_nanoseconds_t, "EGLTimeNV")

// NV_system_time
val EGLuint64NV = typedef(khronos_utime_nanoseconds_t, "EGLuint64NV")