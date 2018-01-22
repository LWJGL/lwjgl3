/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val ANDROID_create_native_client_buffer = "ANDROIDCreateNativeClientBuffer".nativeClassEGL("ANDROID_create_native_client_buffer", postfix = ANDROID) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows creating an {@code EGLClientBuffer} backed by an Android window buffer ({@code struct ANativeWindowBuffer}) which can be later
        used to create an {@code EGLImage}.
        """

    IntConstant(
        "The usage bits of the buffer data.",
        "NATIVE_BUFFER_USAGE_ANDROID"..0x3143
    )

    IntConstant(
        """
        Indicates that the created buffer must have a hardware-protected path to external display sink. If a hardware-protected path is not available, then
        either don't composite only this buffer (preferred) to the external sink, or (less desirable) do not route the entire composition to the external sink.
        """,
        "NATIVE_BUFFER_USAGE_PROTECTED_BIT_ANDROID"..0x00000001
    )

    IntConstant(
        "The buffer will be used to create a renderbuffer. This flag must not be set if #NATIVE_BUFFER_USAGE_TEXTURE_BIT_ANDROID is set.",
        "NATIVE_BUFFER_USAGE_RENDERBUFFER_BIT_ANDROID"..0x00000002
    )

    IntConstant(
        "The buffer will be used to create a texture. This flag must not be set if #NATIVE_BUFFER_USAGE_RENDERBUFFER_BIT_ANDROID is set.",
        "NATIVE_BUFFER_USAGE_TEXTURE_BIT_ANDROID"..0x00000004
    )


    EGLClientBuffer(
        "CreateNativeClientBufferANDROID",
        """
        May be used to create an {@code EGLClientBuffer} backed by an {@code ANativeWindowBuffer} struct. EGL implementations must guarantee that the lifetime
        of the returned {@code EGLClientBuffer} is at least as long as the {@code EGLImage(s)} it is bound to; the {@code EGLClientBuffer} must be destroyed no
        earlier than when all of its associated {@code EGLImages} are destroyed by #DestroyImageKHR().
        """,

        nullable..noneTerminated..const..EGLint_p.IN(
            "attrib_list",
            """
            a list of attribute-value pairs which is used to specify the dimensions, format, and usage of the underlying buffer structure. If it is non-#NULL,
            the last attribute specified in the list must be #NONE.
            """
        )
    )
}