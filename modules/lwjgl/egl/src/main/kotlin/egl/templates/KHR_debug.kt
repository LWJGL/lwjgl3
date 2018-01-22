/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val KHR_debug = "KHRDebug".nativeClassEGL("KHR_debug", postfix = KHR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows EGL to notify applications when various events occur that may be useful during application development and debugging.

        These events are represented in the form of debug messages with a human-readable string representation. Examples of debug events include errors due to
        incorrect use of the EGL API, warnings of undefined behavior, and performance warnings.

        The "type" of the message roughly identifies the nature of the event that caused the message. Examples include input errors, performance information,
        or warnings about undefined behavior.

        Messages are communicated to the application through an application- defined callback function that is called by the EGL implementation on each debug
        message. The motivation for the callback routine is to free application developers from actively having to query whether an EGL error, or any other
        debuggable event has happened after each call to a EGL function. With a callback, developers can keep their code free of debug checks, set breakpoints
        in the callback function, and only have to react to messages as they occur. The callback also offers much more information than just an error code.

        To control the volume of debug output, types of messages can be enabled or disabled. The mechanism is controlled by attributes passed to EGL. The state
        of the message type control can be queried.

        Debug output can be enabled and disabled by changing the callback function. #NULL will disable the feature while a valid function pointer will enable
        it.

        Finally, this extension defines a mechanism for EGL applications to label their objects (contexts, surfaces, syncs, etc.) with a pointer to an
        application provided structure. This pointer can be a descriptive string, identifier or pointer to a structure. This enables the application to
        associate the EGL object with application information. EGL will not interpret this pointer as a string or any other meaning - just attach to the object
        and pass back in the callback when that object is the primary object of an event.
        """

    IntConstant(
        "Tokens accepted by the {@code objectType} parameter of function #LabelObjectKHR().",

        "OBJECT_THREAD_KHR"..0x33B0,
        "OBJECT_DISPLAY_KHR"..0x33B1,
        "OBJECT_CONTEXT_KHR"..0x33B2,
        "OBJECT_SURFACE_KHR"..0x33B3,
        "OBJECT_IMAGE_KHR"..0x33B4,
        "OBJECT_SYNC_KHR"..0x33B5,
        "OBJECT_STREAM_KHR"..0x33B6
    )

    IntConstant(
        """
        Tokens provided by the {@code messageType} parameter of EGLDEBUGPROCKHR or the attributes input to #DebugMessageControlKHR() or attribute of
        #QueryDebugKHR().
        """,

        "DEBUG_MSG_CRITICAL_KHR"..0x33B9,
        "DEBUG_MSG_ERROR_KHR"..0x33BA,
        "DEBUG_MSG_WARN_KHR"..0x33BB,
        "DEBUG_MSG_INFO_KHR"..0x33BC
    )

    IntConstant(
        "Tokens provided by the input attribute to eglQueryDebugKHR.",

        "DEBUG_CALLBACK_KHR"..0x33B8
    )

    EGLint(
        "DebugMessageControlKHR",
        "",

        EGLDEBUGPROCKHR.IN("callback", ""),
        nullable..noneTerminated..const..EGLAttrib_p.IN("attrib_list", "")
    )

    EGLBoolean(
        "QueryDebugKHR",
        "",

        EGLint.IN("attribute", ""),
        Check(1)..EGLAttrib_p.OUT("value", "")
    )

    EGLint(
        "LabelObjectKHR",
        "",

        EGLDisplay.IN("display", ""),
        EGLenum.IN("objectType", ""),
        EGLObjectKHR.IN("object", ""),
        EGLLabelKHR.IN("label", "")
    )
}