/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_automatic_layer_filter = "METAAutomaticLayerFilter".nativeClassXR("META_automatic_layer_filter", type = "instance", postfix = "META") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html\#XR_META_automatic_layer_filter">XR_META_automatic_layer_filter</a> extension.

        This extension defines a new flag in {@code XrCompositionLayerSettingsFlagBitsFB} that allows applications to provide a hint to the runtime to automatically toggle a layer filtering mechanism. The layer filtering helps alleviate visual quality artifacts such as blur and flicker.

        Note: The runtime <b>may</b> use any factors it wishes to apply a filter to the layer. These <b>may</b> include not only fixed factors such as screen resolution, HMD type, and swapchain resolution, but also dynamic ones such as layer pose and system-wide GPU utilization.
        """

    IntConstant(
        "The extension specification version.",

        "META_automatic_layer_filter_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "META_AUTOMATIC_LAYER_FILTER_EXTENSION_NAME".."XR_META_automatic_layer_filter"
    )

    EnumConstant(
        "Extends {@code XrCompositionLayerSettingsFlagBitsFB}.",

        "COMPOSITION_LAYER_SETTINGS_AUTO_LAYER_FILTER_BIT_META".enum(0x00000020)
    )
}