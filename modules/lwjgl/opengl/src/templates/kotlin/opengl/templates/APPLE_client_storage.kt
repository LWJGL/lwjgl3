/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val APPLE_client_storage = "APPLEClientStorage".nativeClassGL("APPLE_client_storage") {
    IntConstant(
        "UNPACK_CLIENT_STORAGE_APPLE"..0x85B2
    )
}