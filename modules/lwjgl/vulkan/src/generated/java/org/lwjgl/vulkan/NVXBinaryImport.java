/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension allows applications to import CuBIN binaries and execute them.
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>There is currently no specification language written for this extension, so although it appears in the Vulkan headers, its interfaces are not summarized here.</p>
 * </div>
 * 
 * <h5>VK_NVX_binary_import</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NVX_binary_import}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>30</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Eric Werness <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NVX_binary_import]%20@ewerness-nv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NVX_binary_import%20extension%3E%3E">ewerness-nv</a></li>
 * <li>Liam Middlebrook <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NVX_binary_import]%20@liam-middlebrook%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NVX_binary_import%20extension%3E%3E">liam-middlebrook</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2021-04-09</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Eric Werness, NVIDIA</li>
 * <li>Liam Middlebrook, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class NVXBinaryImport {

    /** The extension specification version. */
    public static final int VK_NVX_BINARY_IMPORT_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NVX_BINARY_IMPORT_EXTENSION_NAME = "VK_NVX_binary_import";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_CU_MODULE_CREATE_INFO_NVX STRUCTURE_TYPE_CU_MODULE_CREATE_INFO_NVX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_CU_FUNCTION_CREATE_INFO_NVX STRUCTURE_TYPE_CU_FUNCTION_CREATE_INFO_NVX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_CU_LAUNCH_INFO_NVX STRUCTURE_TYPE_CU_LAUNCH_INFO_NVX}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_CU_MODULE_CREATE_INFO_NVX   = 1000029000,
        VK_STRUCTURE_TYPE_CU_FUNCTION_CREATE_INFO_NVX = 1000029001,
        VK_STRUCTURE_TYPE_CU_LAUNCH_INFO_NVX          = 1000029002;

    /**
     * Extends {@code VkObjectType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_OBJECT_TYPE_CU_MODULE_NVX OBJECT_TYPE_CU_MODULE_NVX}</li>
     * <li>{@link #VK_OBJECT_TYPE_CU_FUNCTION_NVX OBJECT_TYPE_CU_FUNCTION_NVX}</li>
     * </ul>
     */
    public static final int
        VK_OBJECT_TYPE_CU_MODULE_NVX   = 1000029000,
        VK_OBJECT_TYPE_CU_FUNCTION_NVX = 1000029001;

    /**
     * Extends {@code VkDebugReportObjectTypeEXT}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_CU_MODULE_NVX_EXT DEBUG_REPORT_OBJECT_TYPE_CU_MODULE_NVX_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_CU_FUNCTION_NVX_EXT DEBUG_REPORT_OBJECT_TYPE_CU_FUNCTION_NVX_EXT}</li>
     * </ul>
     */
    public static final int
        VK_DEBUG_REPORT_OBJECT_TYPE_CU_MODULE_NVX_EXT   = 1000029000,
        VK_DEBUG_REPORT_OBJECT_TYPE_CU_FUNCTION_NVX_EXT = 1000029001;

    protected NVXBinaryImport() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateCuModuleNVX ] ---

    public static int nvkCreateCuModuleNVX(VkDevice device, long pCreateInfo, long pAllocator, long pModule) {
        long __functionAddress = device.getCapabilities().vkCreateCuModuleNVX;
        if (CHECKS) {
            check(__functionAddress);
            VkCuModuleCreateInfoNVX.validate(pCreateInfo);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pModule, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateCuModuleNVX(VkDevice device, @NativeType("VkCuModuleCreateInfoNVX const *") VkCuModuleCreateInfoNVX pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkCuModuleNVX *") LongBuffer pModule) {
        if (CHECKS) {
            check(pModule, 1);
        }
        return nvkCreateCuModuleNVX(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pModule));
    }

    // --- [ vkCreateCuFunctionNVX ] ---

    public static int nvkCreateCuFunctionNVX(VkDevice device, long pCreateInfo, long pAllocator, long pFunction) {
        long __functionAddress = device.getCapabilities().vkCreateCuFunctionNVX;
        if (CHECKS) {
            check(__functionAddress);
            VkCuFunctionCreateInfoNVX.validate(pCreateInfo);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pFunction, __functionAddress);
    }

    @NativeType("VkResult")
    public static int vkCreateCuFunctionNVX(VkDevice device, @NativeType("VkCuFunctionCreateInfoNVX const *") VkCuFunctionCreateInfoNVX pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkCuFunctionNVX *") LongBuffer pFunction) {
        if (CHECKS) {
            check(pFunction, 1);
        }
        return nvkCreateCuFunctionNVX(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pFunction));
    }

    // --- [ vkDestroyCuModuleNVX ] ---

    public static void nvkDestroyCuModuleNVX(VkDevice device, long module, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyCuModuleNVX;
        if (CHECKS) {
            check(__functionAddress);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        callPJPV(device.address(), module, pAllocator, __functionAddress);
    }

    public static void vkDestroyCuModuleNVX(VkDevice device, @NativeType("VkCuModuleNVX") long module, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyCuModuleNVX(device, module, memAddressSafe(pAllocator));
    }

    // --- [ vkDestroyCuFunctionNVX ] ---

    public static void nvkDestroyCuFunctionNVX(VkDevice device, long function, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyCuFunctionNVX;
        if (CHECKS) {
            check(__functionAddress);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        callPJPV(device.address(), function, pAllocator, __functionAddress);
    }

    public static void vkDestroyCuFunctionNVX(VkDevice device, @NativeType("VkCuFunctionNVX") long function, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyCuFunctionNVX(device, function, memAddressSafe(pAllocator));
    }

    // --- [ vkCmdCuLaunchKernelNVX ] ---

    public static void nvkCmdCuLaunchKernelNVX(VkCommandBuffer commandBuffer, long pLaunchInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCuLaunchKernelNVX;
        if (CHECKS) {
            check(__functionAddress);
            VkCuLaunchInfoNVX.validate(pLaunchInfo);
        }
        callPPV(commandBuffer.address(), pLaunchInfo, __functionAddress);
    }

    public static void vkCmdCuLaunchKernelNVX(VkCommandBuffer commandBuffer, @NativeType("VkCuLaunchInfoNVX const *") VkCuLaunchInfoNVX pLaunchInfo) {
        nvkCmdCuLaunchKernelNVX(commandBuffer, pLaunchInfo.address());
    }

    /** Array version of: {@link #vkCreateCuModuleNVX CreateCuModuleNVX} */
    @NativeType("VkResult")
    public static int vkCreateCuModuleNVX(VkDevice device, @NativeType("VkCuModuleCreateInfoNVX const *") VkCuModuleCreateInfoNVX pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkCuModuleNVX *") long[] pModule) {
        long __functionAddress = device.getCapabilities().vkCreateCuModuleNVX;
        if (CHECKS) {
            check(__functionAddress);
            check(pModule, 1);
            VkCuModuleCreateInfoNVX.validate(pCreateInfo.address());
            if (pAllocator != null) { VkAllocationCallbacks.validate(pAllocator.address()); }
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pModule, __functionAddress);
    }

    /** Array version of: {@link #vkCreateCuFunctionNVX CreateCuFunctionNVX} */
    @NativeType("VkResult")
    public static int vkCreateCuFunctionNVX(VkDevice device, @NativeType("VkCuFunctionCreateInfoNVX const *") VkCuFunctionCreateInfoNVX pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkCuFunctionNVX *") long[] pFunction) {
        long __functionAddress = device.getCapabilities().vkCreateCuFunctionNVX;
        if (CHECKS) {
            check(__functionAddress);
            check(pFunction, 1);
            VkCuFunctionCreateInfoNVX.validate(pCreateInfo.address());
            if (pAllocator != null) { VkAllocationCallbacks.validate(pAllocator.address()); }
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pFunction, __functionAddress);
    }

}