/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package remotery.templates

import org.lwjgl.generator.*
import remotery.*

val RemoteryVulkan = "RemoteryVulkan".nativeClass(Module.REMOTERY, prefix = "RMT_") {
    remoteryIncludes("h")
    nativeImport("<vulkan/vulkan.h>")

    void(
        "BindVulkan",

        "VkInstance".handle("instance"),
        "VkPhysicalDevice".handle("physical_device"),
        "VkDevice".handle("device"),
        "VkQueue".handle("queue"),
        rmtVulkanFunctions.const.p("funcs"),
        Check(1)..rmtVulkanBind.p.p("out_bind")
    )

    void(
        "UnbindVulkan",

        rmtVulkanBind.p("bind")
    )

    Code(
        nativeCall = "${t}_rmt_BeginVulkanSample(bind, command_buffer, name, hash_cache);"
    )..void(
        "BeginVulkanSample",

        rmtVulkanBind.p("bind"),
        "VkCommandBuffer".handle("command_buffer"),
        rmtPStr("name"),
        Check(1)..nullable..rmtU32.p("hash_cache")
    )

    void("EndVulkanSample")
}