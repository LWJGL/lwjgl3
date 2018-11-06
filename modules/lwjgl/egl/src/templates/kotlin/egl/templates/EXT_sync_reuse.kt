/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_sync_reuse = "EXTSyncReuse".nativeClassEGL("EXT_sync_reuse", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The original {@code EGLSync} extensions separated sync objects into two types: fence sync objects signaled by one time events in an API command
        pipeline; and reusable sync objects signaled by commands which can be issued again and again. However, this conflates reusability of the event
        triggering a sync object with the {@code EGLSync} object itself.

        Although the event associated with a fence sync object will only occur once, there is no reason that it can't be replaced with a new event. Doing so
        would avoid unnecessary allocation and free operations in an application that repeatedly waits for events. With the current interfaces, such
        applications must constantly create and destroy new {@code EGLSync} objects.

        This extension allows all sync objects to be reusable. When a sync object is in the signaled state, it can be reset back to an unsignaled state,
        regenerating or reevaluating the events that trigger them. For fence sync objects, this means generating a new fence in the current API. For OpenCL
        event sync objects, this means waiting for a new OpenCL event handle. This mechanism also allows sync objects to be created in the signaled state with
        no associated fence/event, and have one applied later. Thus all {@code EGLSyncs} required by an application can be allocated up front, before any
        rendering operations have begun.

        Requires ${EGL15.core} or ${EGL14.core} with ${KHR_fence_sync.link}.
        """

    EGLBoolean(
        "UnsignalSyncEXT",
        "",

        EGLDisplay("dpy", ""),
        EGLSync("sync", ""),
        nullable..noneTerminated..EGLAttrib.const.p("attrib_list", "")
    )
}