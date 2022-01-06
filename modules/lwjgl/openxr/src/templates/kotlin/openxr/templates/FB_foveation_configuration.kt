/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_foveation_configuration = "FBFoveationConfiguration".nativeClassXR("FB_foveation_configuration", type = "instance", postfix = "FB") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "FB_foveation_configuration_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_FOVEATION_CONFIGURATION_EXTENSION_NAME".."XR_FB_foveation_configuration"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_FOVEATION_LEVEL_PROFILE_CREATE_INFO_FB".."1000115000"
    )

    EnumConstant(
        """
        XrFoveationLevelFB - Foveation levels

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#FOVEATION_LEVEL_NONE_FB — No foveation</li>
            <li>#FOVEATION_LEVEL_LOW_FB — Less foveation (higher periphery visual fidelity, lower performance)</li>
            <li>#FOVEATION_LEVEL_MEDIUM_FB — Medium foveation (medium periphery visual fidelity, medium performance)</li>
            <li>#FOVEATION_LEVEL_HIGH_FB — High foveation (lower periphery visual fidelity, higher performance)</li>
        </ul>

        <h5>See Also</h5>
        ##XrFoveationLevelProfileCreateInfoFB
        """,

        "FOVEATION_LEVEL_NONE_FB".."0",
        "FOVEATION_LEVEL_LOW_FB".."1",
        "FOVEATION_LEVEL_MEDIUM_FB".."2",
        "FOVEATION_LEVEL_HIGH_FB".."3"
    )

    EnumConstant(
        """
        XrFoveationDynamicFB - Dynamic foveation settings

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#FOVEATION_DYNAMIC_DISABLED_FB — Static foveation at the maximum desired level</li>
            <li>#FOVEATION_DYNAMIC_LEVEL_ENABLED_FB — Dynamic changing foveation based on performance headroom available up to the maximum desired level</li>
        </ul>

        <h5>See Also</h5>
        ##XrFoveationLevelProfileCreateInfoFB
        """,

        "FOVEATION_DYNAMIC_DISABLED_FB".."0",
        "FOVEATION_DYNAMIC_LEVEL_ENABLED_FB".."1"
    )
}