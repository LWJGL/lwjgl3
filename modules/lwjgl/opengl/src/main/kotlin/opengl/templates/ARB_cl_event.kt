/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*
import org.lwjgl.opengl.*

val ARB_cl_event = "ARBCLEvent".dependsOn(Binding.OPENCL)?.nativeClassGL("ARB_cl_event", postfix = ARB) {
    javaImport(
        "org.lwjgl.opencl.*"
    )

    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows creating OpenGL sync objects linked to OpenCL event objects, potentially improving efficiency of sharing images and buffers between
        the two APIs. The companion {@link org.lwjgl.opencl.KHRGLEvent cl_khr_gl_event} OpenCL extension provides the complementary functionality of creating an
        OpenCL event object from an OpenGL fence sync object.

        Requires ${GL32.core} or ${ARB_sync.link}. Requires an OpenCL implementation supporting sharing event objects with OpenGL.
        """

    IntConstant(
        "Returned in {@code values} for #GetSynciv() {@code pname} #OBJECT_TYPE.",

        "SYNC_CL_EVENT_ARB"..0x8240
    )

    IntConstant(
        "Returned in {@code values} for #GetSynciv() {@code pname} #SYNC_CONDITION.",

        "SYNC_CL_EVENT_COMPLETE_ARB"..0x8241
    )

    GLsync(
        "CreateSyncFromCLeventARB",
        """
        Creates a linked sync object. {@code context} and {@code event} must be handles to a valid OpenCL context and a valid event in that context,
        respectively. {@code context} must support sharing with GL, and must have been created with respect to the current GL context, or to a share group
        including the current GL context.

        The status of such a sync object depends on {@code event}. When the status of {@code event} is CL10#CL_QUEUED, CL10#CL_SUBMITTED, or CL10#CL_RUNNING,
        the status of the linked sync object will be #UNSIGNALED. When the status of {@code event} changes to CL10#CL_COMPLETE, the status of the linked
        sync object will become #SIGNALED.

        Creating a linked sync object places a reference on the linked OpenCL event object. When the sync object is deleted, the reference will be removed from
        the event object.
        """,

        cl_context.IN("context", "a valid OpenCL context"),
        cl_event.IN("event", "a valid OpenCL event"),
        GLbitfield.IN("flags", "must be 0 (placeholder for anticipated future extensions of sync object capabilities)")
    )
}