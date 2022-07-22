/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_palm_pose = "EXTPalmPose".nativeClassXR("EXT_palm_pose", type = "instance", postfix = "EXT") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "EXT_palm_pose_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "EXT_PALM_POSE_EXTENSION_NAME".."XR_EXT_palm_pose"
    )
}