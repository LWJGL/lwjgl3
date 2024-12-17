/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_primitive_topology_list_restart = "EXTPrimitiveTopologyListRestart".nativeClassVK("EXT_primitive_topology_list_restart", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_PRIMITIVE_TOPOLOGY_LIST_RESTART_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_PRIMITIVE_TOPOLOGY_LIST_RESTART_EXTENSION_NAME".."VK_EXT_primitive_topology_list_restart"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVE_TOPOLOGY_LIST_RESTART_FEATURES_EXT".."1000356000"
    )
}