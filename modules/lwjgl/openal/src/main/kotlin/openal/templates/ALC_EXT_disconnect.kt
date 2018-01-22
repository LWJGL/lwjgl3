/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val ALC_EXT_disconnect = "EXTDisconnect".nativeClassALC("EXT_disconnect") {
    documentation =
        """
        Native bindings to the $extensionName extension.

        In OpenAL, there is no way to know if a device has been lost, nor is there a spec-approved means to deal with this properly. While most people are
        using either PCI audio cards or a chip welded to their motherboard, there are many devices that are more dynamic in nature, such as USB and Firewire
        based-units. Such units may lose external power seperate from the system, or may have their cables unplugged at runtime. The OS may reassign the
        hardware to a higher-priority process. If nothing else, a user may unplug the hardware without a proper shutdown (or properly shut them down at the OS
        level and not within the application).

        Other audio "devices" may vanish, too, such as the network connection that hosts a remote audio device like esound, nas, or arts.

        In these cases, the OpenAL spec says nothing, which we must assume means that all resulting behaviour is totally undefined, including everything from
        continued function without audio output to a crash within the AL.

        This extension, ALC_EXT_disconnect, strives to define AL behaviour in these cases and give the application a means to discover and deal with total
        device failure.

        <h3>Device disconnect</h3>

        If a device is unplugged, lost or otherwise damaged beyond functioning, the device is flagged as "disconnected" and the ALCdevice handle is considered
        a "zombie" device.

        When a device is disconnected, the implementation will, in most respects, keep processing as normal. For example, even though there is no longer any
        output when a USB audio device is removed, setting and querying state on the Listener should keep functioning as expected.

        All sources in the #PLAYING state will immediately progress to #STOPPED upon disconnect of their containing device. Any source started after the
        disconnect will immediately progress to #STOPPED. As in any stopped source, this also means that queued buffers all go to #PROCESSED as well. Sources
        that are in the #PAUSED or #INITIAL state do not change on disconnect, but will follow this behaviour if the application later tries to promote them to
        the #PLAYING state.

        Zombie devices may not have new contexts created on them; #CreateContext() will fail, returning a #NULL pointer, if the specified device has been
        disconnected.

        The application may determine if a device has been disconnected by using the #CONNECTED token with ALC10#alcGetIntegerv(). When a device has been
        disconnected, the application is permitted to close the zombie device's handle in the normal way, and may choose to open a new device.

        Applications that use #CONNECTED are encouraged to query it with relative frequency. A game, for example, should call it once per rendering frame, per
        device. A device may become disconnected at any time without warning.

        Once a device is disconnected, it will never become reconnected. Even if the user plugs the device back in, the application must close the existing
        zombie device handle and reopen it with {@code alc*OpenDevice()}.

        If device enumeration is available via ALC_ENUMERATION_EXT, ALC_ENUMERATE_ALL_EXT, or AL 1.1, the list of devices may change between calls as devices
        become disconnected and reconnected. To prevent race conditions, the pointer to device list strings provided to the application will remain valid until
        the next call to ALC10#alcGetString(). The implementation may either cache the result of the previous request or perform a complete device redetection
        during the ALC10#alcGetString() call. As such, enumeration may not be a "fast call" and should not be called in time-sensitive code. If capture devices
        are available via ALC_EXT_capture or AL 1.1, disconnection management can be used with both output and capture devices. A disconnected capture device
        will continue to function, but will not report a larger number in the #CAPTURE_SAMPLES query. If the capture device had reported some number of
        samples were available but the samples were not transferred from the device to the AL at the time of disconnect, the AL should feed the application
        that amount of silence in the #CaptureSamples() call. Future queries of #CAPTURE_SAMPLES should report zero samples available.
        """

    IntConstant(
        "$extensionName tokens.",

        "CONNECTED"..0x313
    )
}