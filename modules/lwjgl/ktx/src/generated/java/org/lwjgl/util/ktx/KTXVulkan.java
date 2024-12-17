/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import org.jspecify.annotations.*;

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
            VulkanTexture_Destruct               = apiGetFunctionAddress(KTX.getLibrary(), "ktxVulkanTexture_Destruct"),
            VulkanDeviceInfo_CreateEx            = apiGetFunctionAddress(KTX.getLibrary(), "ktxVulkanDeviceInfo_CreateEx"),
            VulkanDeviceInfo_Create              = apiGetFunctionAddress(KTX.getLibrary(), "ktxVulkanDeviceInfo_Create"),
            VulkanDeviceInfo_Construct           = apiGetFunctionAddress(KTX.getLibrary(), "ktxVulkanDeviceInfo_Construct"),
            VulkanDeviceInfo_ConstructEx         = apiGetFunctionAddress(KTX.getLibrary(), "ktxVulkanDeviceInfo_ConstructEx"),
            VulkanDeviceInfo_Destruct            = apiGetFunctionAddress(KTX.getLibrary(), "ktxVulkanDeviceInfo_Destruct"),
            VulkanDeviceInfo_Destroy             = apiGetFunctionAddress(KTX.getLibrary(), "ktxVulkanDeviceInfo_Destroy"),
            Texture_VkUploadEx_WithSuballocator  = apiGetFunctionAddress(KTX.getLibrary(), "ktxTexture_VkUploadEx_WithSuballocator"),
            Texture_VkUploadEx                   = apiGetFunctionAddress(KTX.getLibrary(), "ktxTexture_VkUploadEx"),
            Texture_VkUpload                     = apiGetFunctionAddress(KTX.getLibrary(), "ktxTexture_VkUpload"),
            Texture1_VkUploadEx_WithSuballocator = apiGetFunctionAddress(KTX.getLibrary(), "ktxTexture1_VkUploadEx_WithSuballocator"),
            Texture1_VkUploadEx                  = apiGetFunctionAddress(KTX.getLibrary(), "ktxTexture1_VkUploadEx"),
            Texture1_VkUpload                    = apiGetFunctionAddress(KTX.getLibrary(), "ktxTexture1_VkUpload"),
            Texture2_VkUploadEx_WithSuballocator = apiGetFunctionAddress(KTX.getLibrary(), "ktxTexture2_VkUploadEx_WithSuballocator"),
            Texture2_VkUploadEx                  = apiGetFunctionAddress(KTX.getLibrary(), "ktxTexture2_VkUploadEx"),
            Texture2_VkUpload                    = apiGetFunctionAddress(KTX.getLibrary(), "ktxTexture2_VkUpload"),
            Texture_GetVkFormat                  = apiGetFunctionAddress(KTX.getLibrary(), "ktxTexture_GetVkFormat"),
            Texture1_GetVkFormat                 = apiGetFunctionAddress(KTX.getLibrary(), "ktxTexture1_GetVkFormat"),
            Texture2_GetVkFormat                 = apiGetFunctionAddress(KTX.getLibrary(), "ktxTexture2_GetVkFormat");

    }

    protected KTXVulkan() {
        throw new UnsupportedOperationException();
    }

    // --- [ ktxVulkanTexture_Destruct ] ---

    /** {@code void ktxVulkanTexture_Destruct(ktxVulkanTexture * This, VkDevice device, VkAllocationCallbacks const * pAllocator)} */
    public static void nktxVulkanTexture_Destruct(long This, long device, long pAllocator) {
        long __functionAddress = Functions.VulkanTexture_Destruct;
        callPPPV(This, device, pAllocator, __functionAddress);
    }

    /** {@code void ktxVulkanTexture_Destruct(ktxVulkanTexture * This, VkDevice device, VkAllocationCallbacks const * pAllocator)} */
    public static void ktxVulkanTexture_Destruct(@NativeType("ktxVulkanTexture *") ktxVulkanTexture This, VkDevice device, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nktxVulkanTexture_Destruct(This.address(), device.address(), memAddressSafe(pAllocator));
    }

    // --- [ ktxVulkanDeviceInfo_CreateEx ] ---

    /** {@code ktxVulkanDeviceInfo * ktxVulkanDeviceInfo_CreateEx(VkInstance instance, VkPhysicalDevice physicalDevice, VkDevice device, VkQueue queue, VkCommandPool cmdPool, VkAllocationCallbacks const * pAllocator, ktxVulkanFunctions const * pFunctions)} */
    public static long nktxVulkanDeviceInfo_CreateEx(long instance, long physicalDevice, long device, long queue, long cmdPool, long pAllocator, long pFunctions) {
        long __functionAddress = Functions.VulkanDeviceInfo_CreateEx;
        if (CHECKS) {
            ktxVulkanFunctions.validate(pFunctions);
        }
        return callPPPPJPPP(instance, physicalDevice, device, queue, cmdPool, pAllocator, pFunctions, __functionAddress);
    }

    /** {@code ktxVulkanDeviceInfo * ktxVulkanDeviceInfo_CreateEx(VkInstance instance, VkPhysicalDevice physicalDevice, VkDevice device, VkQueue queue, VkCommandPool cmdPool, VkAllocationCallbacks const * pAllocator, ktxVulkanFunctions const * pFunctions)} */
    @NativeType("ktxVulkanDeviceInfo *")
    public static @Nullable ktxVulkanDeviceInfo ktxVulkanDeviceInfo_CreateEx(VkInstance instance, VkPhysicalDevice physicalDevice, VkDevice device, VkQueue queue, @NativeType("VkCommandPool") long cmdPool, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("ktxVulkanFunctions const *") ktxVulkanFunctions pFunctions) {
        long __result = nktxVulkanDeviceInfo_CreateEx(instance.address(), physicalDevice.address(), device.address(), queue.address(), cmdPool, memAddressSafe(pAllocator), pFunctions.address());
        return ktxVulkanDeviceInfo.createSafe(__result);
    }

    // --- [ ktxVulkanDeviceInfo_Create ] ---

    /** {@code ktxVulkanDeviceInfo * ktxVulkanDeviceInfo_Create(VkPhysicalDevice physicalDevice, VkDevice device, VkQueue queue, VkCommandPool cmdPool, VkAllocationCallbacks const * pAllocator)} */
    public static long nktxVulkanDeviceInfo_Create(long physicalDevice, long device, long queue, long cmdPool, long pAllocator) {
        long __functionAddress = Functions.VulkanDeviceInfo_Create;
        return callPPPJPP(physicalDevice, device, queue, cmdPool, pAllocator, __functionAddress);
    }

    /** {@code ktxVulkanDeviceInfo * ktxVulkanDeviceInfo_Create(VkPhysicalDevice physicalDevice, VkDevice device, VkQueue queue, VkCommandPool cmdPool, VkAllocationCallbacks const * pAllocator)} */
    @NativeType("ktxVulkanDeviceInfo *")
    public static @Nullable ktxVulkanDeviceInfo ktxVulkanDeviceInfo_Create(VkPhysicalDevice physicalDevice, VkDevice device, VkQueue queue, @NativeType("VkCommandPool") long cmdPool, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        long __result = nktxVulkanDeviceInfo_Create(physicalDevice.address(), device.address(), queue.address(), cmdPool, memAddressSafe(pAllocator));
        return ktxVulkanDeviceInfo.createSafe(__result);
    }

    // --- [ ktxVulkanDeviceInfo_Construct ] ---

    /** {@code KTX_error_code ktxVulkanDeviceInfo_Construct(ktxVulkanDeviceInfo * This, VkPhysicalDevice physicalDevice, VkDevice device, VkQueue queue, VkCommandPool cmdPool, VkAllocationCallbacks const * pAllocator)} */
    public static int nktxVulkanDeviceInfo_Construct(long This, long physicalDevice, long device, long queue, long cmdPool, long pAllocator) {
        long __functionAddress = Functions.VulkanDeviceInfo_Construct;
        return callPPPPJPI(This, physicalDevice, device, queue, cmdPool, pAllocator, __functionAddress);
    }

    /** {@code KTX_error_code ktxVulkanDeviceInfo_Construct(ktxVulkanDeviceInfo * This, VkPhysicalDevice physicalDevice, VkDevice device, VkQueue queue, VkCommandPool cmdPool, VkAllocationCallbacks const * pAllocator)} */
    @NativeType("KTX_error_code")
    public static int ktxVulkanDeviceInfo_Construct(@NativeType("ktxVulkanDeviceInfo *") ktxVulkanDeviceInfo This, VkPhysicalDevice physicalDevice, VkDevice device, VkQueue queue, @NativeType("VkCommandPool") long cmdPool, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        return nktxVulkanDeviceInfo_Construct(This.address(), physicalDevice.address(), device.address(), queue.address(), cmdPool, memAddressSafe(pAllocator));
    }

    // --- [ ktxVulkanDeviceInfo_ConstructEx ] ---

    /** {@code KTX_error_code ktxVulkanDeviceInfo_ConstructEx(ktxVulkanDeviceInfo * This, VkInstance instance, VkPhysicalDevice physicalDevice, VkDevice device, VkQueue queue, VkCommandPool cmdPool, VkAllocationCallbacks const * pAllocator, ktxVulkanFunctions const * pFunctions)} */
    public static int nktxVulkanDeviceInfo_ConstructEx(long This, long instance, long physicalDevice, long device, long queue, long cmdPool, long pAllocator, long pFunctions) {
        long __functionAddress = Functions.VulkanDeviceInfo_ConstructEx;
        if (CHECKS) {
            ktxVulkanFunctions.validate(pFunctions);
        }
        return callPPPPPJPPI(This, instance, physicalDevice, device, queue, cmdPool, pAllocator, pFunctions, __functionAddress);
    }

    /** {@code KTX_error_code ktxVulkanDeviceInfo_ConstructEx(ktxVulkanDeviceInfo * This, VkInstance instance, VkPhysicalDevice physicalDevice, VkDevice device, VkQueue queue, VkCommandPool cmdPool, VkAllocationCallbacks const * pAllocator, ktxVulkanFunctions const * pFunctions)} */
    @NativeType("KTX_error_code")
    public static int ktxVulkanDeviceInfo_ConstructEx(@NativeType("ktxVulkanDeviceInfo *") ktxVulkanDeviceInfo This, VkInstance instance, VkPhysicalDevice physicalDevice, VkDevice device, VkQueue queue, @NativeType("VkCommandPool") long cmdPool, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("ktxVulkanFunctions const *") ktxVulkanFunctions pFunctions) {
        return nktxVulkanDeviceInfo_ConstructEx(This.address(), instance.address(), physicalDevice.address(), device.address(), queue.address(), cmdPool, memAddressSafe(pAllocator), pFunctions.address());
    }

    // --- [ ktxVulkanDeviceInfo_Destruct ] ---

    /** {@code void ktxVulkanDeviceInfo_Destruct(ktxVulkanDeviceInfo * This)} */
    public static void nktxVulkanDeviceInfo_Destruct(long This) {
        long __functionAddress = Functions.VulkanDeviceInfo_Destruct;
        callPV(This, __functionAddress);
    }

    /** {@code void ktxVulkanDeviceInfo_Destruct(ktxVulkanDeviceInfo * This)} */
    public static void ktxVulkanDeviceInfo_Destruct(@NativeType("ktxVulkanDeviceInfo *") ktxVulkanDeviceInfo This) {
        nktxVulkanDeviceInfo_Destruct(This.address());
    }

    // --- [ ktxVulkanDeviceInfo_Destroy ] ---

    /** {@code void ktxVulkanDeviceInfo_Destroy(ktxVulkanDeviceInfo * This)} */
    public static void nktxVulkanDeviceInfo_Destroy(long This) {
        long __functionAddress = Functions.VulkanDeviceInfo_Destroy;
        callPV(This, __functionAddress);
    }

    /** {@code void ktxVulkanDeviceInfo_Destroy(ktxVulkanDeviceInfo * This)} */
    public static void ktxVulkanDeviceInfo_Destroy(@NativeType("ktxVulkanDeviceInfo *") ktxVulkanDeviceInfo This) {
        nktxVulkanDeviceInfo_Destroy(This.address());
    }

    // --- [ ktxTexture_VkUploadEx_WithSuballocator ] ---

    /** {@code KTX_error_code ktxTexture_VkUploadEx_WithSuballocator(ktxTexture * This, ktxVulkanDeviceInfo * vdi, ktxVulkanTexture * vkTexture, VkImageTiling tiling, VkImageUsageFlags usageFlags, VkImageLayout finalLayout, ktxVulkanTexture_subAllocatorCallbacks * subAllocatorCallbacks)} */
    public static int nktxTexture_VkUploadEx_WithSuballocator(long This, long vdi, long vkTexture, int tiling, int usageFlags, int finalLayout, long subAllocatorCallbacks) {
        long __functionAddress = Functions.Texture_VkUploadEx_WithSuballocator;
        return callPPPPI(This, vdi, vkTexture, tiling, usageFlags, finalLayout, subAllocatorCallbacks, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture_VkUploadEx_WithSuballocator(ktxTexture * This, ktxVulkanDeviceInfo * vdi, ktxVulkanTexture * vkTexture, VkImageTiling tiling, VkImageUsageFlags usageFlags, VkImageLayout finalLayout, ktxVulkanTexture_subAllocatorCallbacks * subAllocatorCallbacks)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture_VkUploadEx_WithSuballocator(@NativeType("ktxTexture *") ktxTexture This, @NativeType("ktxVulkanDeviceInfo *") ktxVulkanDeviceInfo vdi, @NativeType("ktxVulkanTexture *") ktxVulkanTexture vkTexture, @NativeType("VkImageTiling") int tiling, @NativeType("VkImageUsageFlags") int usageFlags, @NativeType("VkImageLayout") int finalLayout, @NativeType("ktxVulkanTexture_subAllocatorCallbacks *") ktxVulkanTexture_subAllocatorCallbacks subAllocatorCallbacks) {
        return nktxTexture_VkUploadEx_WithSuballocator(This.address(), vdi.address(), vkTexture.address(), tiling, usageFlags, finalLayout, subAllocatorCallbacks.address());
    }

    // --- [ ktxTexture_VkUploadEx ] ---

    /** {@code KTX_error_code ktxTexture_VkUploadEx(ktxTexture * This, ktxVulkanDeviceInfo * vdi, ktxVulkanTexture * vkTexture, VkImageTiling tiling, VkImageUsageFlags usageFlags, VkImageLayout finalLayout)} */
    public static int nktxTexture_VkUploadEx(long This, long vdi, long vkTexture, int tiling, int usageFlags, int finalLayout) {
        long __functionAddress = Functions.Texture_VkUploadEx;
        return callPPPI(This, vdi, vkTexture, tiling, usageFlags, finalLayout, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture_VkUploadEx(ktxTexture * This, ktxVulkanDeviceInfo * vdi, ktxVulkanTexture * vkTexture, VkImageTiling tiling, VkImageUsageFlags usageFlags, VkImageLayout finalLayout)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture_VkUploadEx(@NativeType("ktxTexture *") ktxTexture This, @NativeType("ktxVulkanDeviceInfo *") ktxVulkanDeviceInfo vdi, @NativeType("ktxVulkanTexture *") ktxVulkanTexture vkTexture, @NativeType("VkImageTiling") int tiling, @NativeType("VkImageUsageFlags") int usageFlags, @NativeType("VkImageLayout") int finalLayout) {
        return nktxTexture_VkUploadEx(This.address(), vdi.address(), vkTexture.address(), tiling, usageFlags, finalLayout);
    }

    // --- [ ktxTexture_VkUpload ] ---

    /** {@code KTX_error_code ktxTexture_VkUpload(ktxTexture * texture, ktxVulkanDeviceInfo * vdi, ktxVulkanTexture * vkTexture)} */
    public static int nktxTexture_VkUpload(long texture, long vdi, long vkTexture) {
        long __functionAddress = Functions.Texture_VkUpload;
        return callPPPI(texture, vdi, vkTexture, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture_VkUpload(ktxTexture * texture, ktxVulkanDeviceInfo * vdi, ktxVulkanTexture * vkTexture)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture_VkUpload(@NativeType("ktxTexture *") ktxTexture texture, @NativeType("ktxVulkanDeviceInfo *") ktxVulkanDeviceInfo vdi, @NativeType("ktxVulkanTexture *") ktxVulkanTexture vkTexture) {
        return nktxTexture_VkUpload(texture.address(), vdi.address(), vkTexture.address());
    }

    // --- [ ktxTexture1_VkUploadEx_WithSuballocator ] ---

    /** {@code KTX_error_code ktxTexture1_VkUploadEx_WithSuballocator(ktxTexture1 * This, ktxVulkanDeviceInfo * vdi, ktxVulkanTexture * vkTexture, VkImageTiling tiling, VkImageUsageFlags usageFlags, VkImageLayout finalLayout, ktxVulkanTexture_subAllocatorCallbacks * subAllocatorCallbacks)} */
    public static int nktxTexture1_VkUploadEx_WithSuballocator(long This, long vdi, long vkTexture, int tiling, int usageFlags, int finalLayout, long subAllocatorCallbacks) {
        long __functionAddress = Functions.Texture1_VkUploadEx_WithSuballocator;
        return callPPPPI(This, vdi, vkTexture, tiling, usageFlags, finalLayout, subAllocatorCallbacks, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture1_VkUploadEx_WithSuballocator(ktxTexture1 * This, ktxVulkanDeviceInfo * vdi, ktxVulkanTexture * vkTexture, VkImageTiling tiling, VkImageUsageFlags usageFlags, VkImageLayout finalLayout, ktxVulkanTexture_subAllocatorCallbacks * subAllocatorCallbacks)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture1_VkUploadEx_WithSuballocator(@NativeType("ktxTexture1 *") ktxTexture1 This, @NativeType("ktxVulkanDeviceInfo *") ktxVulkanDeviceInfo vdi, @NativeType("ktxVulkanTexture *") ktxVulkanTexture vkTexture, @NativeType("VkImageTiling") int tiling, @NativeType("VkImageUsageFlags") int usageFlags, @NativeType("VkImageLayout") int finalLayout, @NativeType("ktxVulkanTexture_subAllocatorCallbacks *") ktxVulkanTexture_subAllocatorCallbacks subAllocatorCallbacks) {
        return nktxTexture1_VkUploadEx_WithSuballocator(This.address(), vdi.address(), vkTexture.address(), tiling, usageFlags, finalLayout, subAllocatorCallbacks.address());
    }

    // --- [ ktxTexture1_VkUploadEx ] ---

    /** {@code KTX_error_code ktxTexture1_VkUploadEx(ktxTexture1 * This, ktxVulkanDeviceInfo * vdi, ktxVulkanTexture * vkTexture, VkImageTiling tiling, VkImageUsageFlags usageFlags, VkImageLayout finalLayout)} */
    public static int nktxTexture1_VkUploadEx(long This, long vdi, long vkTexture, int tiling, int usageFlags, int finalLayout) {
        long __functionAddress = Functions.Texture1_VkUploadEx;
        return callPPPI(This, vdi, vkTexture, tiling, usageFlags, finalLayout, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture1_VkUploadEx(ktxTexture1 * This, ktxVulkanDeviceInfo * vdi, ktxVulkanTexture * vkTexture, VkImageTiling tiling, VkImageUsageFlags usageFlags, VkImageLayout finalLayout)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture1_VkUploadEx(@NativeType("ktxTexture1 *") ktxTexture1 This, @NativeType("ktxVulkanDeviceInfo *") ktxVulkanDeviceInfo vdi, @NativeType("ktxVulkanTexture *") ktxVulkanTexture vkTexture, @NativeType("VkImageTiling") int tiling, @NativeType("VkImageUsageFlags") int usageFlags, @NativeType("VkImageLayout") int finalLayout) {
        return nktxTexture1_VkUploadEx(This.address(), vdi.address(), vkTexture.address(), tiling, usageFlags, finalLayout);
    }

    // --- [ ktxTexture1_VkUpload ] ---

    /** {@code KTX_error_code ktxTexture1_VkUpload(ktxTexture1 * texture, ktxVulkanDeviceInfo * vdi, ktxVulkanTexture * vkTexture)} */
    public static int nktxTexture1_VkUpload(long texture, long vdi, long vkTexture) {
        long __functionAddress = Functions.Texture1_VkUpload;
        return callPPPI(texture, vdi, vkTexture, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture1_VkUpload(ktxTexture1 * texture, ktxVulkanDeviceInfo * vdi, ktxVulkanTexture * vkTexture)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture1_VkUpload(@NativeType("ktxTexture1 *") ktxTexture1 texture, @NativeType("ktxVulkanDeviceInfo *") ktxVulkanDeviceInfo vdi, @NativeType("ktxVulkanTexture *") ktxVulkanTexture vkTexture) {
        return nktxTexture1_VkUpload(texture.address(), vdi.address(), vkTexture.address());
    }

    // --- [ ktxTexture2_VkUploadEx_WithSuballocator ] ---

    /** {@code KTX_error_code ktxTexture2_VkUploadEx_WithSuballocator(ktxTexture2 * This, ktxVulkanDeviceInfo * vdi, ktxVulkanTexture * vkTexture, VkImageTiling tiling, VkImageUsageFlags usageFlags, VkImageLayout finalLayout, ktxVulkanTexture_subAllocatorCallbacks * subAllocatorCallbacks)} */
    public static int nktxTexture2_VkUploadEx_WithSuballocator(long This, long vdi, long vkTexture, int tiling, int usageFlags, int finalLayout, long subAllocatorCallbacks) {
        long __functionAddress = Functions.Texture2_VkUploadEx_WithSuballocator;
        return callPPPPI(This, vdi, vkTexture, tiling, usageFlags, finalLayout, subAllocatorCallbacks, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture2_VkUploadEx_WithSuballocator(ktxTexture2 * This, ktxVulkanDeviceInfo * vdi, ktxVulkanTexture * vkTexture, VkImageTiling tiling, VkImageUsageFlags usageFlags, VkImageLayout finalLayout, ktxVulkanTexture_subAllocatorCallbacks * subAllocatorCallbacks)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture2_VkUploadEx_WithSuballocator(@NativeType("ktxTexture2 *") ktxTexture2 This, @NativeType("ktxVulkanDeviceInfo *") ktxVulkanDeviceInfo vdi, @NativeType("ktxVulkanTexture *") ktxVulkanTexture vkTexture, @NativeType("VkImageTiling") int tiling, @NativeType("VkImageUsageFlags") int usageFlags, @NativeType("VkImageLayout") int finalLayout, @NativeType("ktxVulkanTexture_subAllocatorCallbacks *") ktxVulkanTexture_subAllocatorCallbacks subAllocatorCallbacks) {
        return nktxTexture2_VkUploadEx_WithSuballocator(This.address(), vdi.address(), vkTexture.address(), tiling, usageFlags, finalLayout, subAllocatorCallbacks.address());
    }

    // --- [ ktxTexture2_VkUploadEx ] ---

    /** {@code KTX_error_code ktxTexture2_VkUploadEx(ktxTexture2 * This, ktxVulkanDeviceInfo * vdi, ktxVulkanTexture * vkTexture, VkImageTiling tiling, VkImageUsageFlags usageFlags, VkImageLayout finalLayout)} */
    public static int nktxTexture2_VkUploadEx(long This, long vdi, long vkTexture, int tiling, int usageFlags, int finalLayout) {
        long __functionAddress = Functions.Texture2_VkUploadEx;
        return callPPPI(This, vdi, vkTexture, tiling, usageFlags, finalLayout, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture2_VkUploadEx(ktxTexture2 * This, ktxVulkanDeviceInfo * vdi, ktxVulkanTexture * vkTexture, VkImageTiling tiling, VkImageUsageFlags usageFlags, VkImageLayout finalLayout)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture2_VkUploadEx(@NativeType("ktxTexture2 *") ktxTexture2 This, @NativeType("ktxVulkanDeviceInfo *") ktxVulkanDeviceInfo vdi, @NativeType("ktxVulkanTexture *") ktxVulkanTexture vkTexture, @NativeType("VkImageTiling") int tiling, @NativeType("VkImageUsageFlags") int usageFlags, @NativeType("VkImageLayout") int finalLayout) {
        return nktxTexture2_VkUploadEx(This.address(), vdi.address(), vkTexture.address(), tiling, usageFlags, finalLayout);
    }

    // --- [ ktxTexture2_VkUpload ] ---

    /** {@code KTX_error_code ktxTexture2_VkUpload(ktxTexture2 * texture, ktxVulkanDeviceInfo * vdi, ktxVulkanTexture * vkTexture)} */
    public static int nktxTexture2_VkUpload(long texture, long vdi, long vkTexture) {
        long __functionAddress = Functions.Texture2_VkUpload;
        return callPPPI(texture, vdi, vkTexture, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture2_VkUpload(ktxTexture2 * texture, ktxVulkanDeviceInfo * vdi, ktxVulkanTexture * vkTexture)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture2_VkUpload(@NativeType("ktxTexture2 *") ktxTexture2 texture, @NativeType("ktxVulkanDeviceInfo *") ktxVulkanDeviceInfo vdi, @NativeType("ktxVulkanTexture *") ktxVulkanTexture vkTexture) {
        return nktxTexture2_VkUpload(texture.address(), vdi.address(), vkTexture.address());
    }

    // --- [ ktxTexture_GetVkFormat ] ---

    /** {@code VkFormat ktxTexture_GetVkFormat(ktxTexture * This)} */
    public static int nktxTexture_GetVkFormat(long This) {
        long __functionAddress = Functions.Texture_GetVkFormat;
        return callPI(This, __functionAddress);
    }

    /** {@code VkFormat ktxTexture_GetVkFormat(ktxTexture * This)} */
    @NativeType("VkFormat")
    public static int ktxTexture_GetVkFormat(@NativeType("ktxTexture *") ktxTexture This) {
        return nktxTexture_GetVkFormat(This.address());
    }

    // --- [ ktxTexture1_GetVkFormat ] ---

    /** {@code VkFormat ktxTexture1_GetVkFormat(ktxTexture1 * This)} */
    public static int nktxTexture1_GetVkFormat(long This) {
        long __functionAddress = Functions.Texture1_GetVkFormat;
        return callPI(This, __functionAddress);
    }

    /** {@code VkFormat ktxTexture1_GetVkFormat(ktxTexture1 * This)} */
    @NativeType("VkFormat")
    public static int ktxTexture1_GetVkFormat(@NativeType("ktxTexture1 *") ktxTexture1 This) {
        return nktxTexture1_GetVkFormat(This.address());
    }

    // --- [ ktxTexture2_GetVkFormat ] ---

    /** {@code VkFormat ktxTexture2_GetVkFormat(ktxTexture2 * This)} */
    public static int nktxTexture2_GetVkFormat(long This) {
        long __functionAddress = Functions.Texture2_GetVkFormat;
        return callPI(This, __functionAddress);
    }

    /** {@code VkFormat ktxTexture2_GetVkFormat(ktxTexture2 * This)} */
    @NativeType("VkFormat")
    public static int ktxTexture2_GetVkFormat(@NativeType("ktxTexture2 *") ktxTexture2 This) {
        return nktxTexture2_GetVkFormat(This.address());
    }

}