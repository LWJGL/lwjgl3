/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_effect_target = "SOFTEffectTarget".nativeClassAL("SOFT_effect_target") {
    documentation =
        """
        Native bindings to the $specLinkOpenALSoft extension.

        This extension provides a method to reroute the output of an auxiliary effect slot to the input of another auxiliary effect slot. By default, an effect
        slot's output is added to the main output along side other effect slots and each source's direct path. This makes it impossible to, for example, apply
        an equalizer effect to the output of a chorus effect since the chorus and equalizer effects are processed separately.

        Retargeting an effect slot's output to another effect slot allows chaining multiple effects to create results that aren't possible with standard EFX.
        """

    IntConstant(
        """
        Specifies the target effect slot for this effect slot's output.

        The rendered output of this effect slot is added to the input of the specified target effect slot, which will be subsequently processed by the target
        effect slot's effect. Specifying #EFFECTSLOT_NULL for the ID reverts the effect slot's output back to the main output.

        An effect slot that is the target of another effect slot cannot be deleted or an #INVALID_OPERATION error will be generated. An effect slot cannot be
        set as a target if it would feed its own input through 0 or more other effect slots, or an {@code AL_INVALID_OPERATION} error will be generated.
        """,

        "EFFECTSLOT_TARGET_SOFT"..0x199C
    )
}