/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_device_drm_render_node = "EXTDeviceDRMRenderNode".nativeClassEGL("EXT_device_drm_render_node", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The {@code EGL_EXT_device_drm} extension provided a method for applications to query the DRM device node file associated with a given
        {@code EGLDeviceEXT} object. However, it was not clear whether it referred to the primary or render device node. This extension adds an enum to refer
        explicitly to the render device node and defines the existing #DRM_DEVICE_FILE_EXT as explicitly refering to the primary device node.
        
        Requires ${EXT_device_query.link}.
        """

    IntConstant(
        "Accepted as the {@code name} parameter of #QueryDeviceStringEXT().",

        "DRM_RENDER_NODE_FILE_EXT"..0x3377
    )
}