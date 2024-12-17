/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MSFT_perception_anchor_interop = "MSFTPerceptionAnchorInterop".nativeClassXR("MSFT_perception_anchor_interop", type = "instance", postfix = "MSFT") {
    IntConstant(
        "MSFT_perception_anchor_interop_SPEC_VERSION".."1"
    )

    StringConstant(
        "MSFT_PERCEPTION_ANCHOR_INTEROP_EXTENSION_NAME".."XR_MSFT_perception_anchor_interop"
    )

    XrResult(
        "CreateSpatialAnchorFromPerceptionAnchorMSFT",

        XrSession("session"),
        IUnknown.p("perceptionAnchor"),
        Check(1)..XrSpatialAnchorMSFT.p("anchor")
    )

    XrResult(
        "TryGetPerceptionAnchorFromSpatialAnchorMSFT",

        XrSession("session"),
        XrSpatialAnchorMSFT("anchor"),
        Check(1)..IUnknown.p.p("perceptionAnchor")
    )
}