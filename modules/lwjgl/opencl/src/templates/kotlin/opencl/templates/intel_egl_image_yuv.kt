/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_egl_image_yuv = "INTELEGLImageYUV".dependsOn(Module.EGL)?.nativeClassCL("intel_egl_image_yuv", INTEL) {
    IntConstant(
        "EGL_YUV_PLANE_INTEL"..0x4107
    )
}