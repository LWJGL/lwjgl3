/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_hp_mixed_reality_controller = "EXTHPMixedRealityController".nativeClassXR("EXT_hp_mixed_reality_controller", type = "instance", postfix = "EXT") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_EXT_hp_mixed_reality_controller">XR_EXT_hp_mixed_reality_controller</a> extension.

        This extension added a new interaction profile path for the HP Reverb G2 Controllers:

        <ul>
            <li>pathname:/interaction_profiles/hp/mixed_reality_controller</li>
        </ul>

        Valid for the user paths

        <ul>
            <li>pathname:/user/hand/left</li>
            <li>pathname:/user/hand/right</li>
        </ul>

        Supported component paths:

        <ul>
            <li>
                On /user/hand/left only
                <ul>
                    <li>subpathname:/input/x/click</li>
                    <li>subpathname:/input/y/click</li>
                </ul>
            </li>
            <li>
                On /user/hand/right only
                <ul>
                    <li>subpathname:/input/a/click</li>
                    <li>subpathname:/input/b/click</li>
                </ul>
            </li>
            <li>
                On both hands
                <ul>
                    <li>subpathname:/input/menu/click</li>
                    <li>subpathname:/input/squeeze/value</li>
                    <li>subpathname:/input/trigger/value</li>
                    <li>subpathname:/input/thumbstick/x</li>
                    <li>subpathname:/input/thumbstick/y</li>
                    <li>subpathname:/input/thumbstick/click</li>
                    <li>subpathname:/input/grip/pose</li>
                    <li>subpathname:/input/aim/pose</li>
                    <li>subpathname:/output/haptic</li>
                </ul>
            </li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        When the {@link EXTPalmPose XR_EXT_palm_pose} extension is available and enabled, this interaction profile <b>must</b> also support

        <ul>
            <li>subpathname:/input/palm_ext/pose</li>
        </ul>
        </div>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        When the {@link EXTHandInteraction XR_EXT_hand_interaction} extension is available and enabled, this interaction profile <b>must</b> also support

        <ul>
            <li>subpathname:/input/pinch_ext/pose</li>
            <li>subpathname:/input/poke_ext/pose</li>
        </ul>
        </div>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_hp_mixed_reality_controller_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_HP_MIXED_REALITY_CONTROLLER_EXTENSION_NAME".."XR_EXT_hp_mixed_reality_controller"
    )
}