/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_timeline_semaphore = "NVTimelineSemaphore".nativeClassGL("NV_timeline_semaphore", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The Vulkan API introduces the concept of timeline semaphores. This extension brings those concepts to the OpenGL API by adding a semaphore type to the
        semaphore object. In OpenGL, timeline semaphore signal and wait operations are similar to the corresponding operations on imported Direct3D 12 fences
        defined in EXT_external_objects_win32.

        Requires ${EXT_semaphore.link} or a version of OpenGL that incorporates it.

        """

    IntConstant(
        "Accepted by the {@code pname} parameter of SemaphoreParameterivNV and GetSemaphoreParameterivNV.",

        "SEMAPHORE_TYPE_NV"..0x95B3
    )

    IntConstant(
        "Accepted by the {@code param} parameter of SemaphoreParameterivNV and GetSemaphoreParameterivNV when {@code pname} parameter is SEMAPHORE_TYPE_NV.",

        "SEMAPHORE_TYPE_BINARY_NV"..0x95B4,
        "SEMAPHORE_TYPE_TIMELINE_NV"..0x95B5
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of SemaphoreParameterui64vNV and GetSemaphoreParameterui64vNV.",

        "TIMELINE_SEMAPHORE_VALUE_NV"..0x9595
    )

    IntConstant(
        "Accepted by the {@code pname} parameter to GetIntegerv, GetFloatv, GetDoublev, GetInteger64v, and GetBooleanv.",

        "MAX_TIMELINE_SEMAPHORE_VALUE_DIFFERENCE_NV"..0x95B6
    )

    void(
        "CreateSemaphoresNV",
        "",

        AutoSize("semaphores")..GLsizei("n", ""),
        ReturnParam..GLuint.p("semaphores", "")
    )

    void(
        "SemaphoreParameterivNV",
        "",

        GLuint("semaphore", ""),
        GLenum("pname", ""),
        Check(1)..GLint.const.p("params", "")
    )

    void(
        "GetSemaphoreParameterivNV",
        "",

        GLuint("semaphore", ""),
        GLenum("pname", ""),
        Check(1)..GLint.p("params", "")
    )
}