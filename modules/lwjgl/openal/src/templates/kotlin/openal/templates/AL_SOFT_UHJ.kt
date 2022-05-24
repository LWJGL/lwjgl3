/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_UHJ = "SOFTUHJ".nativeClassAL("SOFT_UHJ") {
    documentation =
        """
        Native bindings to the $specLinkOpenALSoft extension.

        This extension adds support for UHJ channel formats and a Super Stereo (a.k.a. Stereo Enhance) processor.

        UHJ is a method of encoding surround sound from a first-order B-Format signal into a stereo-compatible signal. Such signals can be played as normal
        stereo (with more stable and wider stereo imaging than pan-pot mixing) or decoded back to surround sound, which makes it a decent choice where 3+
        channel surround sound isn't available or desirable. When decoded, a UHJ signal behaves like B-Format, which allows it to be rotated through
        AL_EXT_BFORMAT's source orientation property as with B-Format formats.

        The standard equation[1] for decoding UHJ to B-Format is:
        ${codeBlock("""
S = Left + Right
D = Left - Right

W = 0.981532*S + 0.197484*j(0.828331*D + 0.767820*T)
X = 0.418496*S - j(0.828331*D + 0.767820*T)
Y = 0.795968*D - 0.676392*T + j(0.186633*S)
Z = 1.023332*Q""")}

        where {@code j} is a wide-band +90 degree phase shift. 2-channel UHJ excludes the T and Q input channels, and 3-channel excludes the Q input channel.
        Be aware that the resulting W, X, Y, and Z signals are 3dB louder than their FuMa counterparts, and the implementation should account for that to
        properly balance it against other sounds.

        An alternative equation for decoding 2-channel-only UHJ is:
        ${codeBlock("""
S = Left + Right
D = Left - Right

W = 0.981532*S + j(0.163582*D)
X = 0.418496*S - j(0.828331*D)
Y = 0.762956*D + j(0.384230*S)""")}

        Which equation to use depends on the implementation and user preferences. It's relevant to note that the standard decoding equation is reversible with
        the encoding equation, meaning decoding UHJ to B-Format with the standard equation and then encoding B-Format to UHJ results in the original UHJ
        signal, even for 2-channel. The alternative 2-channel decoding equation does not result in the original UHJ signal when re- encoded.

        One additional note for decoding 2-channel UHJ is the resulting B-Format signal should pass through alternate shelf filters for frequency-dependent
        processing. For the standard equation, suitable shelf filters are given as:
        ${codeBlock("""
W:   LF = 0.661, HF = 1.000
X/Y: LF = 1.293, HF = 1.000""")}

        And for the alternative equation, suitable shelf filters are given as:
        ${codeBlock("""
W:   LF = 0.646, HF = 1.000
X/Y: LF = 1.263, HF = 1.000""")}

        3- and 4-channel UHJ should use the normal shelf filters for B-Format.

        Super Stereo (occasionally called Stereo Enhance) is a technique for processing a plain (non-UHJ) stereo signal to derive a B-Format signal. It's
        backed by the same functionality as UHJ decoding, making it an easy addition on top of UHJ support. Super Stereo has a variable width control, allowing
        the stereo soundfield to "wrap around" the listener while maintaining a stable center image (a more naive virtual speaker approach would cause the
        center image to collapse as the soundfield widens). Since this derives a B-Format signal like UHJ, it also allows such sources to be rotated through
        the source orientation property.
    
        There are various forms of Super Stereo, with varying equations, but a good suggested option is:
        ${codeBlock("""
S = Left + Right
D = Left - Right

W = 0.6098637*S - j(0.6896511*w*D)
X = 0.8624776*S + j(0.7626955*w*D)
Y = 1.6822415*w*D - j(0.2156194*S)""".trimIndent())}

        where {@code w} is a variable width factor, in the range {@code [0...0.7]}. As with UHJ, the resulting W, X, Y, and Z signals are 3dB louder than their
        FuMa counterparts. The normal shelf filters for playing B-Format should apply.
        """

    IntConstant(
        "Accepted by the {@code format} parameter of #BufferData().",

        "FORMAT_UHJ2CHN8_SOFT"..0x19A2,
        "FORMAT_UHJ2CHN16_SOFT"..0x19A3,
        "FORMAT_UHJ2CHN_FLOAT32_SOFT"..0x19A4,
        "FORMAT_UHJ3CHN8_SOFT"..0x19A5,
        "FORMAT_UHJ3CHN16_SOFT"..0x19A6,
        "FORMAT_UHJ3CHN_FLOAT32_SOFT"..0x19A7,
        "FORMAT_UHJ4CHN8_SOFT"..0x19A8,
        "FORMAT_UHJ4CHN16_SOFT"..0x19A9,
        "FORMAT_UHJ4CHN_FLOAT32_SOFT"..0x19AA
    )

    IntConstant(
        "Accepted by the {@code param} parameter of #Sourcei(), #Sourceiv(), #GetSourcei(), and #GetSourceiv().",

        "STEREO_MODE_SOFT"..0x19B0
    )

    IntConstant(
        "Accepted by the {@code param} parameter of #Sourcef(), #Sourcefv(), #GetSourcef(), and #GetSourcefv().",

        "SUPER_STEREO_WIDTH_SOFT"..0x19B1
    )

    IntConstant(
        "Accepted by the {@code value} parameter of #Sourcei() and #Sourceiv() for #STEREO_MODE_SOFT.",

        "NORMAL_SOFT"..0x0000,
        "SUPER_STEREO_SOFT"..0x0001
    )
}