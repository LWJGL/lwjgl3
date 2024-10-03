/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ML_view_configuration_depth_range_change = "MLViewConfigurationDepthRangeChange".nativeClassXR("ML_view_configuration_depth_range_change", type = "instance", postfix = "ML") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html\#XR_ML_view_configuration_depth_range_change">XR_ML_view_configuration_depth_range_change</a> extension.

        There is a desire for runtimes to be able to inform applications of changes in clipping planes during the lifetime of an {@code XrInstance}.
        """

    IntConstant(
        "The extension specification version.",

        "ML_view_configuration_depth_range_change_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "ML_VIEW_CONFIGURATION_DEPTH_RANGE_CHANGE_EXTENSION_NAME".."XR_ML_view_configuration_depth_range_change"
    )
}