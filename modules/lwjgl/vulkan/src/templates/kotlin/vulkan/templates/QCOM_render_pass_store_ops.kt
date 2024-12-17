/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_render_pass_store_ops = "QCOMRenderPassStoreOps".nativeClassVK("QCOM_render_pass_store_ops", type = "device", postfix = "QCOM") {
    IntConstant(
        "QCOM_RENDER_PASS_STORE_OPS_SPEC_VERSION".."2"
    )

    StringConstant(
        "QCOM_RENDER_PASS_STORE_OPS_EXTENSION_NAME".."VK_QCOM_render_pass_store_ops"
    )

    EnumConstant(
        "ATTACHMENT_STORE_OP_NONE_QCOM".."1000301000"
    )
}