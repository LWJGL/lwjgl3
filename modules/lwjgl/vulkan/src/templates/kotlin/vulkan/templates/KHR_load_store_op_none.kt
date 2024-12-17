/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_load_store_op_none = "KHRLoadStoreOpNone".nativeClassVK("KHR_load_store_op_none", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_LOAD_STORE_OP_NONE_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_LOAD_STORE_OP_NONE_EXTENSION_NAME".."VK_KHR_load_store_op_none"
    )

    EnumConstant(
        "ATTACHMENT_LOAD_OP_NONE_KHR".."1000400000"
    )

    EnumConstant(
        "ATTACHMENT_STORE_OP_NONE_KHR".."1000301000"
    )
}