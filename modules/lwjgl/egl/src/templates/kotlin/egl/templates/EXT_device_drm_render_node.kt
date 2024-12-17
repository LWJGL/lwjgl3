/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_device_drm_render_node = "EXTDeviceDRMRenderNode".nativeClassEGL("EXT_device_drm_render_node", postfix = EXT) {
    IntConstant(
        "DRM_RENDER_NODE_FILE_EXT"..0x3377
    )
}