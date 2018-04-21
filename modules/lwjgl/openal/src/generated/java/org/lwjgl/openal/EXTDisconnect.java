/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

/**
 * Native bindings to the {@code ALC_EXT_disconnect} extension.
 * 
 * <p>In OpenAL, there is no way to know if a device has been lost, nor is there a spec-approved means to deal with this properly. While most people are
 * using either PCI audio cards or a chip welded to their motherboard, there are many devices that are more dynamic in nature, such as USB and Firewire
 * based-units. Such units may lose external power seperate from the system, or may have their cables unplugged at runtime. The OS may reassign the
 * hardware to a higher-priority process. If nothing else, a user may unplug the hardware without a proper shutdown (or properly shut them down at the OS
 * level and not within the application).</p>
 * 
 * <p>Other audio "devices" may vanish, too, such as the network connection that hosts a remote audio device like esound, nas, or arts.</p>
 * 
 * <p>In these cases, the OpenAL spec says nothing, which we must assume means that all resulting behaviour is totally undefined, including everything from
 * continued function without audio output to a crash within the AL.</p>
 * 
 * <p>This extension, ALC_EXT_disconnect, strives to define AL behaviour in these cases and give the application a means to discover and deal with total
 * device failure.</p>
 * 
 * <h3>Device disconnect</h3>
 * 
 * <p>If a device is unplugged, lost or otherwise damaged beyond functioning, the device is flagged as "disconnected" and the ALCdevice handle is considered
 * a "zombie" device.</p>
 * 
 * <p>When a device is disconnected, the implementation will, in most respects, keep processing as normal. For example, even though there is no longer any
 * output when a USB audio device is removed, setting and querying state on the Listener should keep functioning as expected.</p>
 * 
 * <p>All sources in the {@link AL10#AL_PLAYING PLAYING} state will immediately progress to {@link AL10#AL_STOPPED STOPPED} upon disconnect of their containing device. Any source started after the
 * disconnect will immediately progress to {@link AL10#AL_STOPPED STOPPED}. As in any stopped source, this also means that queued buffers all go to {@link AL10#AL_PROCESSED PROCESSED} as well. Sources
 * that are in the {@link AL10#AL_PAUSED PAUSED} or {@link AL10#AL_INITIAL INITIAL} state do not change on disconnect, but will follow this behaviour if the application later tries to promote them to
 * the {@link AL10#AL_PLAYING PLAYING} state.</p>
 * 
 * <p>Zombie devices may not have new contexts created on them; {@link ALC10#alcCreateContext CreateContext} will fail, returning a {@code NULL} pointer, if the specified device has been
 * disconnected.</p>
 * 
 * <p>The application may determine if a device has been disconnected by using the {@link #ALC_CONNECTED CONNECTED} token with {@link ALC10#alcGetIntegerv GetIntegerv}. When a device has been
 * disconnected, the application is permitted to close the zombie device's handle in the normal way, and may choose to open a new device.</p>
 * 
 * <p>Applications that use {@link #ALC_CONNECTED CONNECTED} are encouraged to query it with relative frequency. A game, for example, should call it once per rendering frame, per
 * device. A device may become disconnected at any time without warning.</p>
 * 
 * <p>Once a device is disconnected, it will never become reconnected. Even if the user plugs the device back in, the application must close the existing
 * zombie device handle and reopen it with {@code alc*OpenDevice()}.</p>
 * 
 * <p>If device enumeration is available via ALC_ENUMERATION_EXT, ALC_ENUMERATE_ALL_EXT, or AL 1.1, the list of devices may change between calls as devices
 * become disconnected and reconnected. To prevent race conditions, the pointer to device list strings provided to the application will remain valid until
 * the next call to {@link ALC10#alcGetString GetString}. The implementation may either cache the result of the previous request or perform a complete device redetection
 * during the {@link ALC10#alcGetString GetString} call. As such, enumeration may not be a "fast call" and should not be called in time-sensitive code. If capture devices
 * are available via ALC_EXT_capture or AL 1.1, disconnection management can be used with both output and capture devices. A disconnected capture device
 * will continue to function, but will not report a larger number in the {@link ALC11#ALC_CAPTURE_SAMPLES CAPTURE_SAMPLES} query. If the capture device had reported some number of
 * samples were available but the samples were not transferred from the device to the AL at the time of disconnect, the AL should feed the application
 * that amount of silence in the {@link ALC11#alcCaptureSamples CaptureSamples} call. Future queries of {@link ALC11#ALC_CAPTURE_SAMPLES CAPTURE_SAMPLES} should report zero samples available.</p>
 */
public final class EXTDisconnect {

    /** {@code ALC_EXT_disconnect} tokens. */
    public static final int ALC_CONNECTED = 0x313;

    private EXTDisconnect() {}

}