/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val ANGLE_d3d_share_handle_client_buffer = "ANGLED3DShareHandleClientBuffer".nativeClassEGL("ANGLE_d3d_share_handle_client_buffer", postfix = ANGLE) {
    IntConstant("D3D_TEXTURE_2D_SHARE_HANDLE_ANGLE"..0x3200)
}