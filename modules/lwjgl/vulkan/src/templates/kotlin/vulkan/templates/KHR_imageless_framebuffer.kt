/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_imageless_framebuffer = "KHRImagelessFramebuffer".nativeClassVK("KHR_imageless_framebuffer", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_IMAGELESS_FRAMEBUFFER_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_IMAGELESS_FRAMEBUFFER_EXTENSION_NAME".."VK_KHR_imageless_framebuffer"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES_KHR".."1000108000",
        "STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO_KHR".."1000108001",
        "STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO_KHR".."1000108002",
        "STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO_KHR".."1000108003"
    )

    EnumConstant(
        "FRAMEBUFFER_CREATE_IMAGELESS_BIT_KHR".enum(0x00000001)
    )
}