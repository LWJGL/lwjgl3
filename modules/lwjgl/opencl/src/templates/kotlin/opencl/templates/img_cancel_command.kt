/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val img_cancel_command = "IMGCancelCommand".nativeClassCL("img_cancel_command", IMG) {
    IntConstant(
        "CANCELLED_IMG".."-1126",
    )

    cl_int(
        "CancelCommandsIMG",

        nullable..cl_event.const.p("event_list"),
        AutoSize("event_list")..size_t("num_events_in_list")
    )
}