/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val KHR_context_flush_control = "KHRContextFlushControl".nativeClassGL("KHR_context_flush_control") {
    documentation =
        """
        Native bindings to the $registryLink extension.

        OpenGL and OpenGL ES have long supported multiple contexts. The semantics of switching contexts is generally left to window system binding APIs such as
        WGL, GLX and EGL. Most of these APIs (if not all) specify that when the current context for a thread is changed, the outgoing context performs an
        implicit flush of any commands that have been issued to that point. OpenGL and OpenGL ES define a flush as sending any pending commands for execution
        and that this action will result in their completion in finite time.

        This behavior has subtle consequences. For example, if an application is rendering to the front buffer and switches contexts, it may assume that any
        rendering performed thus far will eventually be visible to the user. With recent introduction of shared memory buffers, there become inumerable ways in
        which applications may observe side effects of an implicit flush (or lack thereof).

        In general, a full flush is not the desired behavior of the application. Nonetheless, applications that switch contexts frequently suffer the
        performance consequences of this unless implementations make special considerations for them, which is generally untenable.

        This extension allows querying the context flush behavior.

        ${GL45.promoted}
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetIntegerv, GetFloatv, GetBooleanv GetDoublev and GetInteger64v.",

        "CONTEXT_RELEASE_BEHAVIOR"..0x82FB
    )

    IntConstant(
        "Returned in {@code data} by GetIntegerv, GetFloatv, GetBooleanv GetDoublev and GetInteger64v when {@code pname} is #CONTEXT_RELEASE_BEHAVIOR.",

        "CONTEXT_RELEASE_BEHAVIOR_FLUSH"..0x82FC
    )
}

val GLX_ARB_context_flush_control = "GLXARBContextFlushControl".nativeClassGLX("GLX_ARB_context_flush_control", ARB) {
    documentation =
        """
        Native bindings to the ${registryLink("KHR", "context_flush_control")} extension.

        The GLX version of ##KHRContextFlushControl. This extension adds new context creation parameters the allow an application to specify the behavior
        that is desired when a context is made non-current, and specifically to opt out of the implicit flush behavior.
        """

    IntConstant(
        "Accepted as an attribute name in the {@code *attrib_list} argument to GLXARBCreateContext#glXCreateContextAttribsARB().",

        "CONTEXT_RELEASE_BEHAVIOR_ARB"..0x2097
    )

    IntConstant(
        """
        Accepted as an attribute value for #CONTEXT_RELEASE_BEHAVIOR_ARB in the {@code *attrib_list} argument to
        GLXARBCreateContext#glXCreateContextAttribsARB().
        """,

        "CONTEXT_RELEASE_BEHAVIOR_NONE_ARB"..0x0000,
        "CONTEXT_RELEASE_BEHAVIOR_FLUSH_ARB"..0x2098
    )
}

val WGL_ARB_context_flush_control = "WGLARBContextFlushControl".nativeClassWGL("WGL_ARB_context_flush_control", ARB) {
    documentation =
        """
        Native bindings to the ${registryLink("KHR", "context_flush_control")} extension.

        The WGL version of ##KHRContextFlushControl. This extension adds new context creation parameters the allow an application to specify the behavior
        that is desired when a context is made non-current, and specifically to opt out of the implicit flush behavior.
        """

    IntConstant(
        "Accepted as an attribute name in the {@code *attrib_list} argument to WGLARBCreateContext#wglCreateContextAttribsARB().",

        "CONTEXT_RELEASE_BEHAVIOR_ARB"..0x2097
    )

    IntConstant(
        """
        Accepted as an attribute value for #CONTEXT_RELEASE_BEHAVIOR_ARB in the {@code *attrib_list} argument to
        WGLARBCreateContext#wglCreateContextAttribsARB().
        """,

        "CONTEXT_RELEASE_BEHAVIOR_NONE_ARB"..0x0000,
        "CONTEXT_RELEASE_BEHAVIOR_FLUSH_ARB"..0x2098
    )
}