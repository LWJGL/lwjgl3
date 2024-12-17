/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_load_store_op_none = "EXTLoadStoreOpNone".nativeClassVK("EXT_load_store_op_none", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_LOAD_STORE_OP_NONE_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_LOAD_STORE_OP_NONE_EXTENSION_NAME".."VK_EXT_load_store_op_none"
    )

    EnumConstant(
        "ATTACHMENT_LOAD_OP_NONE_EXT".."1000400000"
    )

    EnumConstant(
        "ATTACHMENT_STORE_OP_NONE_EXT".."1000301000"
    )
}