/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val altera_live_object_tracking = "ALTERALiveObjectTracking".nativeClassCL("altera_live_object_tracking", ALTERA) {
    void(
        "TrackLiveObjectsAltera",

        cl_platform_id("platform")
    )

    void(
        "ReportLiveObjectsAltera",

        cl_platform_id("platform"),
        cl_report_live_objects_altera_callback("report_fn"),
        opaque_p("user_data")
    )
}