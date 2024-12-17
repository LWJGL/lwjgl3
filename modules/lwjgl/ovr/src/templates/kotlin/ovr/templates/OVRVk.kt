/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package ovr.templates

import org.lwjgl.generator.*
import ovr.*
import vulkan.*

val OVRVk = "OVRVk".dependsOn(Module.VULKAN)?.nativeClass(Module.OVR, prefixMethod = "ovr_", prefixConstant = "ovr") {
    includeOVRCAPI_VK()
    javaImport("org.lwjgl.vulkan.*")

    val session = ovrSession("session")

    val GetInstanceExtensionsVk = ovrResult(
        "GetInstanceExtensionsVk",

        ovrGraphicsLuid("luid"),
        charASCII.p("extensionNames"),
        AutoSize("extensionNames")..Check(1)..uint32_t.p("inoutExtensionNamesSize")
    )

    ovrResult(
        "GetDeviceExtensionsVk",

        GetInstanceExtensionsVk["luid"],
        GetInstanceExtensionsVk["extensionNames"],
        GetInstanceExtensionsVk["inoutExtensionNamesSize"]
    )

    ovrResult(
        "GetSessionPhysicalDeviceVk",

        session,
        ovrGraphicsLuid("luid"),
        VkInstance("instance"),
        Check(1)..VkPhysicalDevice.p("out_physicalDevice")
    )

    ovrResult(
        "SetSynchronizationQueueVk",

        session,
        VkQueue("queue")
    )

    ovrResult(
        "CreateTextureSwapChainVk",

        session,
        VkDevice("device"),
        ovrTextureSwapChainDesc.const.p("desc"),
        Check(1)..ovrTextureSwapChain.p("out_TextureSwapChain")
    )

    ovrResult(
        "GetTextureSwapChainBufferVk",

        session,
        ovrTextureSwapChain("chain"),
        int("index"),
        Check(1)..VkImage.p("out_Image")
    )

    ovrResult(
        "CreateMirrorTextureWithOptionsVk",

        session,
        VkDevice("device"),
        ovrMirrorTextureDesc.const.p("desc"),
        Check(1)..ovrMirrorTexture.p("out_MirrorTexture")
    )

    ovrResult(
        "GetMirrorTextureBufferVk",

        session,
        ovrMirrorTexture("mirrorTexture"),
        Check(1)..VkImage.p("out_Image")
    )
}