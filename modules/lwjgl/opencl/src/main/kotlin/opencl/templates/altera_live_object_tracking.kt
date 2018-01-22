/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val altera_live_object_tracking = "ALTERALiveObjectTracking".nativeClassCL("altera_live_object_tracking", ALTERA) {
    documentation =
        """
        Native bindings to the $extensionName extension.

        This extension specifies an API for debugging OpenCL API object leaks in user applications. It provides a mechanism for tracking all live API objects,
        and for enumerating them on demand.

        The OpenCL runtime API generates and uses many kinds of objects such as contexts, programs, kernels, memory objects, command queues, and events.

        It is very easy for an application to lose track of what objects it has created but not yet fully released. Forgetting to fully release an object after
        use may result in undesirable behaviour, such as increased memory use or even command scheduler lockup. This problem gets much worse when new objects
        leak each time through an application loop.

        This extension defines two runtime API methods.

        The first method specifies a future interest in enumerating all the live objects in the runtime API. Live object tracking is a debugging feature which
        may increase memory use and runtime of the application. So it should be explicitly requested.

        Ideally, the request to begin tracking live objects should occur as early as possible in the program, so that no leaked objects escape undetected.

        The second method requests an enumeration of those objects via a callback mechanism.
        """

    void(
        "TrackLiveObjectsAltera",
        """
        Registers a future interest in enumerating all the live objects in the runtime API. Registering such an interest may itself increase memory use and
        runtime, which is why is must be explicitly requested.

        Behaviour is unspecified if the {@code clTrackLiveObjectsAltera} method is called before the the first call to #GetPlatformIDs().
        """,

        cl_platform_id.IN("platform", "the platform ID")
    )

    void(
        "ReportLiveObjectsAltera",
        """
        Requests an enumeration of all live objects in the runtime. The enumeration is performed by calling the callback function once for each live object in
        some implementation-defined sequence (i.e. not concurrently).
        """,

        cl_platform_id.IN("platform", "the platform for which live objects are being tracked"),
        cl_report_live_objects_altera_callback.IN("report_fn", "the callback function"),
        opaque_p.IN("user_data", "a pointer to user data that will be passed to {@code report_fn}")
    )
}