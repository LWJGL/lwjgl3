/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.vulkan.*;

public class OVRVk {

    static { LibOVR.initialize(); }

    protected OVRVk() {
        throw new UnsupportedOperationException();
    }

    // --- [ ovr_GetInstanceExtensionsVk ] ---

    /** {@code ovrResult ovr_GetInstanceExtensionsVk(ovrGraphicsLuid luid, char * extensionNames, uint32_t * inoutExtensionNamesSize)} */
    public static native int novr_GetInstanceExtensionsVk(long luid, long extensionNames, long inoutExtensionNamesSize);

    /** {@code ovrResult ovr_GetInstanceExtensionsVk(ovrGraphicsLuid luid, char * extensionNames, uint32_t * inoutExtensionNamesSize)} */
    @NativeType("ovrResult")
    public static int ovr_GetInstanceExtensionsVk(@NativeType("ovrGraphicsLuid") OVRGraphicsLuid luid, @NativeType("char *") ByteBuffer extensionNames, @NativeType("uint32_t *") IntBuffer inoutExtensionNamesSize) {
        if (CHECKS) {
            check(inoutExtensionNamesSize, 1);
            check(extensionNames, inoutExtensionNamesSize.get(inoutExtensionNamesSize.position()));
        }
        return novr_GetInstanceExtensionsVk(luid.address(), memAddress(extensionNames), memAddress(inoutExtensionNamesSize));
    }

    // --- [ ovr_GetDeviceExtensionsVk ] ---

    /** {@code ovrResult ovr_GetDeviceExtensionsVk(ovrGraphicsLuid luid, char * extensionNames, uint32_t * inoutExtensionNamesSize)} */
    public static native int novr_GetDeviceExtensionsVk(long luid, long extensionNames, long inoutExtensionNamesSize);

    /** {@code ovrResult ovr_GetDeviceExtensionsVk(ovrGraphicsLuid luid, char * extensionNames, uint32_t * inoutExtensionNamesSize)} */
    @NativeType("ovrResult")
    public static int ovr_GetDeviceExtensionsVk(@NativeType("ovrGraphicsLuid") OVRGraphicsLuid luid, @NativeType("char *") ByteBuffer extensionNames, @NativeType("uint32_t *") IntBuffer inoutExtensionNamesSize) {
        if (CHECKS) {
            check(inoutExtensionNamesSize, 1);
            check(extensionNames, inoutExtensionNamesSize.get(inoutExtensionNamesSize.position()));
        }
        return novr_GetDeviceExtensionsVk(luid.address(), memAddress(extensionNames), memAddress(inoutExtensionNamesSize));
    }

    // --- [ ovr_GetSessionPhysicalDeviceVk ] ---

    /** {@code ovrResult ovr_GetSessionPhysicalDeviceVk(ovrSession session, ovrGraphicsLuid luid, VkInstance instance, VkPhysicalDevice * out_physicalDevice)} */
    public static native int novr_GetSessionPhysicalDeviceVk(long session, long luid, long instance, long out_physicalDevice);

    /** {@code ovrResult ovr_GetSessionPhysicalDeviceVk(ovrSession session, ovrGraphicsLuid luid, VkInstance instance, VkPhysicalDevice * out_physicalDevice)} */
    @NativeType("ovrResult")
    public static int ovr_GetSessionPhysicalDeviceVk(@NativeType("ovrSession") long session, @NativeType("ovrGraphicsLuid") OVRGraphicsLuid luid, VkInstance instance, @NativeType("VkPhysicalDevice *") PointerBuffer out_physicalDevice) {
        if (CHECKS) {
            check(session);
            check(out_physicalDevice, 1);
        }
        return novr_GetSessionPhysicalDeviceVk(session, luid.address(), instance.address(), memAddress(out_physicalDevice));
    }

    // --- [ ovr_SetSynchronizationQueueVk ] ---

    /** {@code ovrResult ovr_SetSynchronizationQueueVk(ovrSession session, VkQueue queue)} */
    public static native int novr_SetSynchronizationQueueVk(long session, long queue);

    /** {@code ovrResult ovr_SetSynchronizationQueueVk(ovrSession session, VkQueue queue)} */
    @NativeType("ovrResult")
    public static int ovr_SetSynchronizationQueueVk(@NativeType("ovrSession") long session, VkQueue queue) {
        if (CHECKS) {
            check(session);
        }
        return novr_SetSynchronizationQueueVk(session, queue.address());
    }

    // --- [ ovr_CreateTextureSwapChainVk ] ---

    /** {@code ovrResult ovr_CreateTextureSwapChainVk(ovrSession session, VkDevice device, ovrTextureSwapChainDesc const * desc, ovrTextureSwapChain * out_TextureSwapChain)} */
    public static native int novr_CreateTextureSwapChainVk(long session, long device, long desc, long out_TextureSwapChain);

    /** {@code ovrResult ovr_CreateTextureSwapChainVk(ovrSession session, VkDevice device, ovrTextureSwapChainDesc const * desc, ovrTextureSwapChain * out_TextureSwapChain)} */
    @NativeType("ovrResult")
    public static int ovr_CreateTextureSwapChainVk(@NativeType("ovrSession") long session, VkDevice device, @NativeType("ovrTextureSwapChainDesc const *") OVRTextureSwapChainDesc desc, @NativeType("ovrTextureSwapChain *") PointerBuffer out_TextureSwapChain) {
        if (CHECKS) {
            check(session);
            check(out_TextureSwapChain, 1);
        }
        return novr_CreateTextureSwapChainVk(session, device.address(), desc.address(), memAddress(out_TextureSwapChain));
    }

    // --- [ ovr_GetTextureSwapChainBufferVk ] ---

    /** {@code ovrResult ovr_GetTextureSwapChainBufferVk(ovrSession session, ovrTextureSwapChain chain, int index, VkImage * out_Image)} */
    public static native int novr_GetTextureSwapChainBufferVk(long session, long chain, int index, long out_Image);

    /** {@code ovrResult ovr_GetTextureSwapChainBufferVk(ovrSession session, ovrTextureSwapChain chain, int index, VkImage * out_Image)} */
    @NativeType("ovrResult")
    public static int ovr_GetTextureSwapChainBufferVk(@NativeType("ovrSession") long session, @NativeType("ovrTextureSwapChain") long chain, int index, @NativeType("VkImage *") LongBuffer out_Image) {
        if (CHECKS) {
            check(session);
            check(chain);
            check(out_Image, 1);
        }
        return novr_GetTextureSwapChainBufferVk(session, chain, index, memAddress(out_Image));
    }

    // --- [ ovr_CreateMirrorTextureWithOptionsVk ] ---

    /** {@code ovrResult ovr_CreateMirrorTextureWithOptionsVk(ovrSession session, VkDevice device, ovrMirrorTextureDesc const * desc, ovrMirrorTexture * out_MirrorTexture)} */
    public static native int novr_CreateMirrorTextureWithOptionsVk(long session, long device, long desc, long out_MirrorTexture);

    /** {@code ovrResult ovr_CreateMirrorTextureWithOptionsVk(ovrSession session, VkDevice device, ovrMirrorTextureDesc const * desc, ovrMirrorTexture * out_MirrorTexture)} */
    @NativeType("ovrResult")
    public static int ovr_CreateMirrorTextureWithOptionsVk(@NativeType("ovrSession") long session, VkDevice device, @NativeType("ovrMirrorTextureDesc const *") OVRMirrorTextureDesc desc, @NativeType("ovrMirrorTexture *") PointerBuffer out_MirrorTexture) {
        if (CHECKS) {
            check(session);
            check(out_MirrorTexture, 1);
        }
        return novr_CreateMirrorTextureWithOptionsVk(session, device.address(), desc.address(), memAddress(out_MirrorTexture));
    }

    // --- [ ovr_GetMirrorTextureBufferVk ] ---

    /** {@code ovrResult ovr_GetMirrorTextureBufferVk(ovrSession session, ovrMirrorTexture mirrorTexture, VkImage * out_Image)} */
    public static native int novr_GetMirrorTextureBufferVk(long session, long mirrorTexture, long out_Image);

    /** {@code ovrResult ovr_GetMirrorTextureBufferVk(ovrSession session, ovrMirrorTexture mirrorTexture, VkImage * out_Image)} */
    @NativeType("ovrResult")
    public static int ovr_GetMirrorTextureBufferVk(@NativeType("ovrSession") long session, @NativeType("ovrMirrorTexture") long mirrorTexture, @NativeType("VkImage *") LongBuffer out_Image) {
        if (CHECKS) {
            check(session);
            check(mirrorTexture);
            check(out_Image, 1);
        }
        return novr_GetMirrorTextureBufferVk(session, mirrorTexture, memAddress(out_Image));
    }

    /** {@code ovrResult ovr_GetInstanceExtensionsVk(ovrGraphicsLuid luid, char * extensionNames, uint32_t * inoutExtensionNamesSize)} */
    public static native int novr_GetInstanceExtensionsVk(long luid, long extensionNames, int[] inoutExtensionNamesSize);

    /** {@code ovrResult ovr_GetInstanceExtensionsVk(ovrGraphicsLuid luid, char * extensionNames, uint32_t * inoutExtensionNamesSize)} */
    @NativeType("ovrResult")
    public static int ovr_GetInstanceExtensionsVk(@NativeType("ovrGraphicsLuid") OVRGraphicsLuid luid, @NativeType("char *") ByteBuffer extensionNames, @NativeType("uint32_t *") int[] inoutExtensionNamesSize) {
        if (CHECKS) {
            check(inoutExtensionNamesSize, 1);
            check(extensionNames, inoutExtensionNamesSize[0]);
        }
        return novr_GetInstanceExtensionsVk(luid.address(), memAddress(extensionNames), inoutExtensionNamesSize);
    }

    /** {@code ovrResult ovr_GetDeviceExtensionsVk(ovrGraphicsLuid luid, char * extensionNames, uint32_t * inoutExtensionNamesSize)} */
    public static native int novr_GetDeviceExtensionsVk(long luid, long extensionNames, int[] inoutExtensionNamesSize);

    /** {@code ovrResult ovr_GetDeviceExtensionsVk(ovrGraphicsLuid luid, char * extensionNames, uint32_t * inoutExtensionNamesSize)} */
    @NativeType("ovrResult")
    public static int ovr_GetDeviceExtensionsVk(@NativeType("ovrGraphicsLuid") OVRGraphicsLuid luid, @NativeType("char *") ByteBuffer extensionNames, @NativeType("uint32_t *") int[] inoutExtensionNamesSize) {
        if (CHECKS) {
            check(inoutExtensionNamesSize, 1);
            check(extensionNames, inoutExtensionNamesSize[0]);
        }
        return novr_GetDeviceExtensionsVk(luid.address(), memAddress(extensionNames), inoutExtensionNamesSize);
    }

    /** {@code ovrResult ovr_GetTextureSwapChainBufferVk(ovrSession session, ovrTextureSwapChain chain, int index, VkImage * out_Image)} */
    public static native int novr_GetTextureSwapChainBufferVk(long session, long chain, int index, long[] out_Image);

    /** {@code ovrResult ovr_GetTextureSwapChainBufferVk(ovrSession session, ovrTextureSwapChain chain, int index, VkImage * out_Image)} */
    @NativeType("ovrResult")
    public static int ovr_GetTextureSwapChainBufferVk(@NativeType("ovrSession") long session, @NativeType("ovrTextureSwapChain") long chain, int index, @NativeType("VkImage *") long[] out_Image) {
        if (CHECKS) {
            check(session);
            check(chain);
            check(out_Image, 1);
        }
        return novr_GetTextureSwapChainBufferVk(session, chain, index, out_Image);
    }

    /** {@code ovrResult ovr_GetMirrorTextureBufferVk(ovrSession session, ovrMirrorTexture mirrorTexture, VkImage * out_Image)} */
    public static native int novr_GetMirrorTextureBufferVk(long session, long mirrorTexture, long[] out_Image);

    /** {@code ovrResult ovr_GetMirrorTextureBufferVk(ovrSession session, ovrMirrorTexture mirrorTexture, VkImage * out_Image)} */
    @NativeType("ovrResult")
    public static int ovr_GetMirrorTextureBufferVk(@NativeType("ovrSession") long session, @NativeType("ovrMirrorTexture") long mirrorTexture, @NativeType("VkImage *") long[] out_Image) {
        if (CHECKS) {
            check(session);
            check(mirrorTexture);
            check(out_Image, 1);
        }
        return novr_GetMirrorTextureBufferVk(session, mirrorTexture, out_Image);
    }

}