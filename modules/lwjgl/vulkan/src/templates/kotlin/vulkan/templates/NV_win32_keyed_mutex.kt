/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_win32_keyed_mutex = "NVWin32KeyedMutex".nativeClassVK("NV_win32_keyed_mutex", type = "device", postfix = "NV") {
    IntConstant(
        "NV_WIN32_KEYED_MUTEX_SPEC_VERSION".."2"
    )

    StringConstant(
        "NV_WIN32_KEYED_MUTEX_EXTENSION_NAME".."VK_NV_win32_keyed_mutex"
    )

    EnumConstant(
        "STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_NV".."1000058000"
    )
}