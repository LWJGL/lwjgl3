/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.ovr.templates

import org.lwjgl.generator.*
import org.lwjgl.ovr.*
import org.lwjgl.vulkan.*

val OVRVk = "OVRVk".dependsOn(Binding.VULKAN)?.nativeClass(packageName = OVR_PACKAGE, prefixMethod = "ovr_", prefixConstant = "ovr", library = OVR_LIBRARY) {
    includeOVRCAPI_VK()
    javaImport("org.lwjgl.vulkan.*")

    documentation =
        """
        Native bindings to libOVR, using the ${url("https://developer.oculus.com/", "Oculus SDK")} C API.

        This class contains Vulkan specific functionality.
        """

    val session = ovrSession.IN("session", "an {@code ovrSession} previously returned by #Create()")

    ovrResult(
        "GetSessionPhysicalDeviceVk",
        """
        Finds {@code VkPhysicalDevice} matching {@code ovrGraphicsLuid}.

        ${code(
            """
            This function enumerates the current physical devices and returns the one matching the {@code luid}. It must be called at least once prior to any
            #CreateTextureSwapChainVk() or #CreateMirrorTextureWithOptionsVk() calls, and the instance must remain valid for the lifetime of the returned
            objects. It is assumed the {@code VkDevice} created by the application will be for the returned physical device.
            """
        )}
        """,

        session,
        ovrGraphicsLuid.IN("luid", "the {@code luid} returned from #Create()"),
        VkInstance.IN("instance", "a {@code VkInstance} to search for matching {@code luids} in"),
        Check(1)..VkPhysicalDevice.p.OUT("out_physicalDevice", "returns the {@code VkPhysicalDevice} matching the instance and {@code luid}"),

        returnDoc = "an {@code ovrResult} indicating success or failure. In the case of failure, use #GetLastErrorInfo() to get more information."
    )

    ovrResult(
        "SetSynchonizationQueueVk",
        """
        Selects {@code VkQueue} to block on till rendering is complete.

        ${code(
            """
            The queue may be changed at any time but only the value at the time #SubmitFrame() is called will be used. {@code ovr_SetSynchonizationQueueVk}
            must be called with a valid {@code VkQueue} created on the same {@code VkDevice} the texture sets were created on prior to the first call to
            #SubmitFrame(). An internally created {@code VkFence} object will be signalled by the completion of operations on queue and waited on to
            synchronize the VR compositor.
            """
        )}
        """,

        session,
        VkQueue.IN("queue", "a {@code VkQueue} to add a {@code VkFence} operation to and wait on"),

        returnDoc = "an {@code ovrResult} indicating success or failure. In the case of failure, use #GetLastErrorInfo() to get more information."
    )

    ovrResult(
        "CreateTextureSwapChainVk",
        """
        Creates Texture Swap Chain suitable for use with Vulkan.

        ${note(
        """
            The texture format provided in {@code desc} should be thought of as the format the distortion-compositor will use for the
            {@code ShaderResourceView} when reading the contents of the texture. To that end, it is highly recommended that the application requests texture
            swapchain formats that are in sRGB-space (e.g. #OVR_FORMAT_R8G8B8A8_UNORM_SRGB) as the compositor does sRGB-correct rendering. As such, the
            compositor relies on the GPU's hardware sampler to do the sRGB-to-linear conversion. If the application still prefers to render to a linear format
            (e.g. #OVR_FORMAT_R8G8B8A8_UNORM) while handling the linear-to-gamma conversion via SPIRV code, then the application must still request the
            corresponding sRGB format and also use the #TextureMisc_DX_Typeless flag in the {@code ovrTextureSwapChainDesc}'s {@code Flag} field. This will
            allow the application to create a {@code RenderTargetView} that is the desired linear format while the compositor continues to treat it as sRGB.
            Failure to do so will cause the compositor to apply unexpected gamma conversions leading to gamma-curve artifacts. The #TextureMisc_DX_Typeless
            flag for depth buffer formats (e.g. #OVR_FORMAT_D32_FLOAT) is ignored as they are always converted to be typeless.
            """
        )}
        """,

        session,
        VkDevice.IN("device", "the application's {@code VkDevice} to create resources with"),
        const..ovrTextureSwapChainDesc_p.IN("desc", "specifies requested texture properties. See notes for more info about texture format."),
        Check(1)..ovrTextureSwapChain_p.OUT(
            "out_TextureSwapChain",
            """
            returns the created {@code ovrTextureSwapChain}, which will be valid upon a successful return value, else it will be #NULL. This texture chain must
            be eventually destroyed via #DestroyTextureSwapChain() before destroying the session with #Destroy().
            """
        ),

        returnDoc = "an {@code ovrResult} indicating success or failure. In the case of failure, use #GetLastErrorInfo() to get more information."
    )

    ovrResult(
        "GetTextureSwapChainBufferVk",
        "Gets a specific {@code VkImage} within the chain.",

        session,
        ovrTextureSwapChain.IN("chain", "an {@code ovrTextureSwapChain} previously returned by #CreateTextureSwapChainVk()"),
        int.IN(
            "index",
            """
            the index within the chain to retrieve. Must be between 0 and length (see #GetTextureSwapChainLength()), or may pass -1 to get the buffer at the
            {@code CurrentIndex} location (saving a call to #GetTextureSwapChainCurrentIndex()).
            """
        ),
        Check(1)..VkImage.p.OUT("out_Image", ""),

        returnDoc = "an {@code ovrResult} indicating success or failure. In the case of failure, use #GetLastErrorInfo() to get more information."
    )

    ovrResult(
        "CreateMirrorTextureWithOptionsVk",
        """
        Creates Mirror Texture which is auto-refreshed to mirror Rift contents produced by this application.

        A second call to {@code ovr_CreateMirrorTextureWithOptionsVk} for a given {@code ovrSession} before destroying the first one is not supported and will
        result in an error return.

        ${note(
            """
            The texture format provided in {@code desc} should be thought of as the format the compositor will use for the {@code VkImageView} when writing
            into mirror texture. To that end, it is highly recommended that the application requests a mirror texture format that is in sRGB-space (e.g.
            #OVR_FORMAT_R8G8B8A8_UNORM_SRGB) as the compositor does sRGB-correct rendering. If however the application wants to still read the mirror texture
            as a linear format (e.g. #OVR_FORMAT_R8G8B8A8_UNORM) and handle the sRGB-to-linear conversion in SPIRV code, then it is recommended the application
            still requests an sRGB format and also use the #TextureMisc_DX_Typeless flag in the {@code ovrMirrorTextureDesc}'s {@code Flags} field. This will
            allow the application to bind a {@code ShaderResourceView} that is a linear format while the compositor continues to treat is as sRGB. Failure to
            do so will cause the compositor to apply unexpected gamma conversions leading to gamma-curve artifacts.
            """
        )}
        """,

        session,
        VkDevice.IN("device", "the {@code VkDevice} to create resources with"),
        const..ovrMirrorTextureDesc_p.IN("desc", "specifies requested texture properties. See notes for more info about texture format."),
        Check(1)..ovrMirrorTexture_p.OUT(
            "out_MirrorTexture",
            """
            returns the created {@code ovrMirrorTexture}, which will be valid upon a successful return value, else it will be #NULL. This texture must be
            eventually destroyed via #DestroyMirrorTexture() before destroying the session with #Destroy().
            """
        ),

        returnDoc = "an {@code ovrResult} indicating success or failure. In the case of failure, use #GetLastErrorInfo() to get more information."
    )

    ovrResult(
        "GetMirrorTextureBufferVk",
        "Gets the underlying mirror {@code VkImage}.",

        session,
        ovrMirrorTexture.IN("mirrorTexture", "an {@code ovrMirrorTexture} previously returned by #CreateMirrorTextureWithOptionsVk()"),
        Check(1)..VkImage.p.OUT("out_Image", "returns the {@code VkImage} pointer retrieved"),

        returnDoc = "an {@code ovrResult} indicating success or failure. In the case of failure, use #GetLastErrorInfo() to get more information."
    )
}