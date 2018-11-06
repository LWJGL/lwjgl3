/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC_SOFT_device_clock = "SOFTDeviceClock".nativeClassALC("SOFT_device_clock") {
    documentation =
        """
        Native bindings to the $specLinkOpenALSoft extension.

        This extension allows applications to query the timing clock from the audio device. This clock lets applications measure the passage of time as the
        audio device sees it, which may be slightly different than the system clock's tick rate (the infamous timer drift).

        If the ${ALC_SOFT_pause_device.link} extension is available, the device clock does not increment while the device playback is paused. It is
        implementation-defined whether or not the device clock increments while no contexts are allocated. The initial clock time value of an opened device is
        also implementation-defined, except that it must not be negative and should be low enough to avoid wrapping during program execution.

        Requires ${AL_SOFT_source_latency.link}
        """

    IntConstant(
        "Accepted as the {@code pname} parameter of #GetInteger64vSOFT().",

        "DEVICE_CLOCK_SOFT"..0x1600,
        "DEVICE_LATENCY_SOFT"..0x1601,
        "DEVICE_CLOCK_LATENCY_SOFT"..0x1602
    )

    IntConstant(
        """
        Accepted as the {@code param} parameter of #GetSourcei64vSOFT().

        Returns the playback position, expressed in fixed-point samples, along with the device clock, expressed in nanoseconds. This attribute is read-only.

        The first value in the returned vector is the sample offset, which is a 32.32 fixed-point value. The whole number is stored in the upper 32 bits and
        the fractional component is in the lower 32 bits. The value is similar to that returned by #SAMPLE_OFFSET, just with more precision.

        The second value is the device clock, in nanoseconds. This updates at the same rate as the offset, and both are measured atomically with respect to one
        another.
        """,

        "AL_SAMPLE_OFFSET_CLOCK_SOFT"..0x1202
    ).noPrefix()

    IntConstant(
        """
        Accepted as the {@code param} parameter of #GetSourcedvSOFT().

        Returns the playback position, along with the device clock, both expressed in seconds. This attribute is read-only.

        The first value in the returned vector is the offset in seconds. The value is similar to that returned by #SEC_OFFSET, just with more precision.

        The second value is the device clock, in seconds. This updates at the same rate as the offset, and both are measured atomically with respect to one
        another. Be aware that this value may be subtly different from the other device clock queries due to the variable precision of floating-point values.
        """,

        "AL_SEC_OFFSET_CLOCK_SOFT"..0x1203
    ).noPrefix()

    ALCvoid(
        "GetInteger64vSOFT",
        """
        Accepts all the same #GetIntegerv() queries, in addition to some new ones.

        Note that the size parameter is the number of {@code ALCint64SOFT} elements in the buffer provided, not the number of bytes.
        """,

        nullable..ALCdevice.p("device", ""),
        ALCenum(
            "pname",
            """
            ${table(
                tr(
                    td("#DEVICE_CLOCK_SOFT"), td("The audio device clock time, expressed in nanoseconds. #NULL is an invalid device.")
                ),
                tr(
                    td("#DEVICE_LATENCY_SOFT"), td(
                        """
                        The current audio device latency, in nanoseconds. This is effectively the delay for the samples rendered at the the device's current
                        clock time fromreaching the physical output. #NULL is an invalid device.
                        """
                    )
                ),
                tr(
                    td("#DEVICE_CLOCK_LATENCY_SOFT"), td(
                        """
                        Expects a destination size of 2, and provides both the audio device clock time and latency, both in nanoseconds. The two values are
                        measured atomically with respect to one another (i.e. the latency value was measured at the same time the device clock value was
                        retrieved). #NULL is an invalid device.
                        """
                    )
                )
            )}
            """
        ),
        AutoSize("values")..ALsizei("size", ""),
        ReturnParam..ALCint64SOFT.p("values", "")
    )
}