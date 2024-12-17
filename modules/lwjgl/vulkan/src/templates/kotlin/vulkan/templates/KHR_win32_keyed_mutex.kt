/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_win32_keyed_mutex = "KHRWin32KeyedMutex".nativeClassVK("KHR_win32_keyed_mutex", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_WIN32_KEYED_MUTEX_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_WIN32_KEYED_MUTEX_EXTENSION_NAME".."VK_KHR_win32_keyed_mutex"
    )

    EnumConstant(
        "STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR".."1000075000"
    )
}