/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_present_mode_fifo_latest_ready = "EXTPresentModeFifoLatestReady".nativeClassVK("EXT_present_mode_fifo_latest_ready", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_PRESENT_MODE_FIFO_LATEST_READY_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_PRESENT_MODE_FIFO_LATEST_READY_EXTENSION_NAME".."VK_EXT_present_mode_fifo_latest_ready"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_MODE_FIFO_LATEST_READY_FEATURES_EXT".."1000361000"
    )

    EnumConstant(
        "PRESENT_MODE_FIFO_LATEST_READY_EXT".."1000361000"
    )
}