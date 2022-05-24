/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC_SOFT_reopen_device = "SOFTReopenDevice".nativeClassALC("SOFT_reopen_device") {
    documentation =
        """
        Native bindings to the $specLinkOpenALSoft extension.

        This extension provides a mechanism for applications to move the output of a device from one endpoint to another. Standard OpenAL devices are
        associated with an output on the system upon being opened, but if the endpoint should no longer be the desired output, there is no method for the
        application to easily change it. The only option for the application is to delete all AL objects, destroy the context, close the device handle, open a
        new device, and reload/recreate the necessary resources. A method to more simply move the device with its existing resources to a different output is
        easier, requiring less management from the application.
        """

    ALCboolean(
        "ReopenDeviceSOFT",
        """
        Once a playback device is opened, it becomes associated with a particular output endpoint. When this output is no longer the desired output, the
        playback device can be reopened to re-associate it with a potentially different output endpoint using {@code alcReopenDeviceSOFT}.
        """,

        ALCdevice.p("device", "a non-#NULL handle for an existing device"),
        ALCcharUTF8.const.p("deviceName", "the device name to open, or #NULL for the default (same as would be passed to #OpenDevice())"),
        nullable..NullTerminated..ALCint.const.p(
            "attribs",
            "an attribute list to configure the device with, with the same attribute list that would be passed to #CreateContext()."
        )
    )
}