/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.vulkan.*;

public class KTXVulkan {

    /** Contains the function pointers loaded from {@code KTX.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            VulkanTexture_Destruct       = apiGetFunctionAddress(KTX.getLibrary(), "ktxVulkanTexture_Destruct"),
            VulkanDeviceInfo_CreateEx    = apiGetFunctionAddress(KTX.getLibrary(), "ktxVulkanDeviceInfo_CreateEx"),
            VulkanDeviceInfo_Create      = apiGetFunctionAddress(KTX.getLibrary(), "ktxVulkanDeviceInfo_Create"),
            VulkanDeviceInfo_Construct   = apiGetFunctionAddress(KTX.getLibrary(), "ktxVulkanDeviceInfo_Construct"),
            VulkanDeviceInfo_ConstructEx = apiGetFunctionAddress(KTX.getLibrary(), "ktxVulkanDeviceInfo_ConstructEx"),
            VulkanDeviceInfo_Destruct    = apiGetFunctionAddress(KTX.getLibrary(), "ktxVulkanDeviceInfo_Destruct"),
            VulkanDeviceInfo_Destroy     = apiGetFunctionAddress(KTX.getLibrary(), "ktxVulkanDeviceInfo_Destroy"),
            Texture_VkUploadEx           = apiGetFunctionAddress(KTX.getLibrary(), "ktxTexture_VkUploadEx"),
            Texture_VkUpload             = apiGetFunctionAddress(KTX.getLibrary(), "ktxTexture_VkUpload"),
            Texture1_VkUploadEx          = apiGetFunctionAddress(KTX.getLibrary(), "ktxTexture1_VkUploadEx"),
            Texture1_VkUpload            = apiGetFunctionAddress(KTX.getLibrary(), "ktxTexture1_VkUpload"),
            Texture2_VkUploadEx          = apiGetFunctionAddress(KTX.getLibrary(), "ktxTexture2_VkUploadEx"),
            Texture2_VkUpload            = apiGetFunctionAddress(KTX.getLibrary(), "ktxTexture2_VkUpload"),
            Texture_GetVkFormat          = apiGetFunctionAddress(KTX.getLibrary(), "ktxTexture_GetVkFormat"),
            Texture1_GetVkFormat         = apiGetFunctionAddress(KTX.getLibrary(), "ktxTexture1_GetVkFormat"),
            Texture2_GetVkFormat         = apiGetFunctionAddress(KTX.getLibrary(), "ktxTexture2_GetVkFormat");

    }

    protected KTXVulkan() {
        throw new UnsupportedOperationException();
    }

    // --- [ ktxVulkanTexture_Destruct ] ---

    public static void nktxVulkanTexture_Destruct(long This, long device, long pAllocator) {
        long __functionAddress = Functions.VulkanTexture_Destruct;
        callPPPV(This, device, pAllocator, __functionAddress);
    }

    public static void ktxVulkanTexture_Destruct(@NativeType("ktxVulkanTexture *") ktxVulkanTexture This, VkDevice device, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nktxVulkanTexture_Destruct(This.address(), device.address(), memAddressSafe(pAllocator));
    }

    // --- [ ktxVulkanDeviceInfo_CreateEx ] ---

    public static long nktxVulkanDeviceInfo_CreateEx(long instance, long physicalDevice, long device, long queue, long cmdPool, long pAllocator, long pFunctions) {
        long __functionAddress = Functions.VulkanDeviceInfo_CreateEx;
        if (CHECKS) {
            ktxVulkanFunctions.validate(pFunctions);
        }
        return callPPPPJPPP(instance, physicalDevice, device, queue, cmdPool, pAllocator, pFunctions, __functionAddress);
    }

    @Nullable
    @NativeType("ktxVulkanDeviceInfo *")
    public static ktxVulkanDeviceInfo ktxVulkanDeviceInfo_CreateEx(VkInstance instance, VkPhysicalDevice physicalDevice, VkDevice device, VkQueue queue, @NativeType("VkCommandPool") long cmdPool, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("ktxVulkanFunctions const *") ktxVulkanFunctions pFunctions) {
        long __result = nktxVulkanDeviceInfo_CreateEx(instance.address(), physicalDevice.address(), device.address(), queue.address(), cmdPool, memAddressSafe(pAllocator), pFunctions.address());
        return ktxVulkanDeviceInfo.createSafe(__result);
    }

    // --- [ ktxVulkanDeviceInfo_Create ] ---

    public static long nktxVulkanDeviceInfo_Create(long physicalDevice, long device, long queue, long cmdPool, long pAllocator) {
        long __functionAddress = Functions.VulkanDeviceInfo_Create;
        return callPPPJPP(physicalDevice, device, queue, cmdPool, pAllocator, __functionAddress);
    }

    @Nullable
    @NativeType("ktxVulkanDeviceInfo *")
    public static ktxVulkanDeviceInfo ktxVulkanDeviceInfo_Create(VkPhysicalDevice physicalDevice, VkDevice device, VkQueue queue, @NativeType("VkCommandPool") long cmdPool, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        long __result = nktxVulkanDeviceInfo_Create(physicalDevice.address(), device.address(), queue.address(), cmdPool, memAddressSafe(pAllocator));
        return ktxVulkanDeviceInfo.createSafe(__result);
    }

    // --- [ ktxVulkanDeviceInfo_Construct ] ---

    public static int nktxVulkanDeviceInfo_Construct(long This, long physicalDevice, long device, long queue, long cmdPool, long pAllocator) {
        long __functionAddress = Functions.VulkanDeviceInfo_Construct;
        return callPPPPJPI(This, physicalDevice, device, queue, cmdPool, pAllocator, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxVulkanDeviceInfo_Construct(@NativeType("ktxVulkanDeviceInfo *") ktxVulkanDeviceInfo This, VkPhysicalDevice physicalDevice, VkDevice device, VkQueue queue, @NativeType("VkCommandPool") long cmdPool, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        return nktxVulkanDeviceInfo_Construct(This.address(), physicalDevice.address(), device.address(), queue.address(), cmdPool, memAddressSafe(pAllocator));
    }

    // --- [ ktxVulkanDeviceInfo_ConstructEx ] ---

    public static int nktxVulkanDeviceInfo_ConstructEx(long This, long instance, long physicalDevice, long device, long queue, long cmdPool, long pAllocator, long pFunctions) {
        long __functionAddress = Functions.VulkanDeviceInfo_ConstructEx;
        if (CHECKS) {
            ktxVulkanFunctions.validate(pFunctions);
        }
        return callPPPPPJPPI(This, instance, physicalDevice, device, queue, cmdPool, pAllocator, pFunctions, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxVulkanDeviceInfo_ConstructEx(@NativeType("ktxVulkanDeviceInfo *") ktxVulkanDeviceInfo This, VkInstance instance, VkPhysicalDevice physicalDevice, VkDevice device, VkQueue queue, @NativeType("VkCommandPool") long cmdPool, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("ktxVulkanFunctions const *") ktxVulkanFunctions pFunctions) {
        return nktxVulkanDeviceInfo_ConstructEx(This.address(), instance.address(), physicalDevice.address(), device.address(), queue.address(), cmdPool, memAddressSafe(pAllocator), pFunctions.address());
    }

    // --- [ ktxVulkanDeviceInfo_Destruct ] ---

    public static void nktxVulkanDeviceInfo_Destruct(long This) {
        long __functionAddress = Functions.VulkanDeviceInfo_Destruct;
        callPV(This, __functionAddress);
    }

    public static void ktxVulkanDeviceInfo_Destruct(@NativeType("ktxVulkanDeviceInfo *") ktxVulkanDeviceInfo This) {
        nktxVulkanDeviceInfo_Destruct(This.address());
    }

    // --- [ ktxVulkanDeviceInfo_Destroy ] ---

    public static void nktxVulkanDeviceInfo_Destroy(long This) {
        long __functionAddress = Functions.VulkanDeviceInfo_Destroy;
        callPV(This, __functionAddress);
    }

    public static void ktxVulkanDeviceInfo_Destroy(@NativeType("ktxVulkanDeviceInfo *") ktxVulkanDeviceInfo This) {
        nktxVulkanDeviceInfo_Destroy(This.address());
    }

    // --- [ ktxTexture_VkUploadEx ] ---

    public static int nktxTexture_VkUploadEx(long This, long vdi, long vkTexture, int tiling, int usageFlags, int finalLayout) {
        long __functionAddress = Functions.Texture_VkUploadEx;
        return callPPPI(This, vdi, vkTexture, tiling, usageFlags, finalLayout, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture_VkUploadEx(@NativeType("ktxTexture *") ktxTexture This, @NativeType("ktxVulkanDeviceInfo *") ktxVulkanDeviceInfo vdi, @NativeType("ktxVulkanTexture *") ktxVulkanTexture vkTexture, @NativeType("VkImageTiling") int tiling, @NativeType("VkImageUsageFlags") int usageFlags, @NativeType("VkImageLayout") int finalLayout) {
        return nktxTexture_VkUploadEx(This.address(), vdi.address(), vkTexture.address(), tiling, usageFlags, finalLayout);
    }

    // --- [ ktxTexture_VkUpload ] ---

    public static int nktxTexture_VkUpload(long texture, long vdi, long vkTexture) {
        long __functionAddress = Functions.Texture_VkUpload;
        return callPPPI(texture, vdi, vkTexture, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture_VkUpload(@NativeType("ktxTexture *") ktxTexture texture, @NativeType("ktxVulkanDeviceInfo *") ktxVulkanDeviceInfo vdi, @NativeType("ktxVulkanTexture *") ktxVulkanTexture vkTexture) {
        return nktxTexture_VkUpload(texture.address(), vdi.address(), vkTexture.address());
    }

    // --- [ ktxTexture1_VkUploadEx ] ---

    public static int nktxTexture1_VkUploadEx(long This, long vdi, long vkTexture, int tiling, int usageFlags, int finalLayout) {
        long __functionAddress = Functions.Texture1_VkUploadEx;
        return callPPPI(This, vdi, vkTexture, tiling, usageFlags, finalLayout, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture1_VkUploadEx(@NativeType("ktxTexture1 *") ktxTexture1 This, @NativeType("ktxVulkanDeviceInfo *") ktxVulkanDeviceInfo vdi, @NativeType("ktxVulkanTexture *") ktxVulkanTexture vkTexture, @NativeType("VkImageTiling") int tiling, @NativeType("VkImageUsageFlags") int usageFlags, @NativeType("VkImageLayout") int finalLayout) {
        return nktxTexture1_VkUploadEx(This.address(), vdi.address(), vkTexture.address(), tiling, usageFlags, finalLayout);
    }

    // --- [ ktxTexture1_VkUpload ] ---

    public static int nktxTexture1_VkUpload(long texture, long vdi, long vkTexture) {
        long __functionAddress = Functions.Texture1_VkUpload;
        return callPPPI(texture, vdi, vkTexture, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture1_VkUpload(@NativeType("ktxTexture1 *") ktxTexture1 texture, @NativeType("ktxVulkanDeviceInfo *") ktxVulkanDeviceInfo vdi, @NativeType("ktxVulkanTexture *") ktxVulkanTexture vkTexture) {
        return nktxTexture1_VkUpload(texture.address(), vdi.address(), vkTexture.address());
    }

    // --- [ ktxTexture2_VkUploadEx ] ---

    public static int nktxTexture2_VkUploadEx(long This, long vdi, long vkTexture, int tiling, int usageFlags, int finalLayout) {
        long __functionAddress = Functions.Texture2_VkUploadEx;
        return callPPPI(This, vdi, vkTexture, tiling, usageFlags, finalLayout, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture2_VkUploadEx(@NativeType("ktxTexture2 *") ktxTexture2 This, @NativeType("ktxVulkanDeviceInfo *") ktxVulkanDeviceInfo vdi, @NativeType("ktxVulkanTexture *") ktxVulkanTexture vkTexture, @NativeType("VkImageTiling") int tiling, @NativeType("VkImageUsageFlags") int usageFlags, @NativeType("VkImageLayout") int finalLayout) {
        return nktxTexture2_VkUploadEx(This.address(), vdi.address(), vkTexture.address(), tiling, usageFlags, finalLayout);
    }

    // --- [ ktxTexture2_VkUpload ] ---

    public static int nktxTexture2_VkUpload(long texture, long vdi, long vkTexture) {
        long __functionAddress = Functions.Texture2_VkUpload;
        return callPPPI(texture, vdi, vkTexture, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture2_VkUpload(@NativeType("ktxTexture2 *") ktxTexture2 texture, @NativeType("ktxVulkanDeviceInfo *") ktxVulkanDeviceInfo vdi, @NativeType("ktxVulkanTexture *") ktxVulkanTexture vkTexture) {
        return nktxTexture2_VkUpload(texture.address(), vdi.address(), vkTexture.address());
    }

    // --- [ ktxTexture_GetVkFormat ] ---

    public static int nktxTexture_GetVkFormat(long This) {
        long __functionAddress = Functions.Texture_GetVkFormat;
        return callPI(This, __functionAddress);
    }

    @NativeType("VkFormat")
    public static int ktxTexture_GetVkFormat(@NativeType("ktxTexture *") ktxTexture This) {
        return nktxTexture_GetVkFormat(This.address());
    }

    // --- [ ktxTexture1_GetVkFormat ] ---

    public static int nktxTexture1_GetVkFormat(long This) {
        long __functionAddress = Functions.Texture1_GetVkFormat;
        return callPI(This, __functionAddress);
    }

    @NativeType("VkFormat")
    public static int ktxTexture1_GetVkFormat(@NativeType("ktxTexture1 *") ktxTexture1 This) {
        return nktxTexture1_GetVkFormat(This.address());
    }

    // --- [ ktxTexture2_GetVkFormat ] ---

    public static int nktxTexture2_GetVkFormat(long This) {
        long __functionAddress = Functions.Texture2_GetVkFormat;
        return callPI(This, __functionAddress);
    }

    @NativeType("VkFormat")
    public static int ktxTexture2_GetVkFormat(@NativeType("ktxTexture2 *") ktxTexture2 This) {
        return nktxTexture2_GetVkFormat(This.address());
    }

}