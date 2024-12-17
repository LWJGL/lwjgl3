/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_draw_vulkan_image = "NVDrawVulkanImage".nativeClassGL("NV_draw_vulkan_image", postfix = NV) {
    void(
        "DrawVkImageNV",

        GLuint64("vkImage"),
        GLuint("sampler"),
        GLfloat("x0"),
        GLfloat("y0"),
        GLfloat("x1"),
        GLfloat("y1"),
        GLfloat("z"),
        GLfloat("s0"),
        GLfloat("t0"),
        GLfloat("s1"),
        GLfloat("t1")
    )

    VULKANPROCNV(
        "GetVkProcAddrNV",

        GLcharASCII.const.p("name")
    )

    void(
        "WaitVkSemaphoreNV",

        GLuint64("vkSemaphore")
    )

    void(
        "SignalVkSemaphoreNV",

        GLuint64("vkSemaphore")
    )

    void(
        "SignalVkFenceNV",

        GLuint64("vkFence")
    )

}