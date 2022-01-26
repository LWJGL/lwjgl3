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
 * <p>There is currently no specification language written for this extension. The links to APIs defined by the extension are to stubs that only include generated content such as API declarations and implicit valid usage statements.</p>
 * </div>
 * 
 * <h5>Stub API References</h5>
 * 
 * <p>There is currently no specification language written for this type. This section acts only as placeholder and to avoid dead links in the specification and reference pages.</p>
 * 
 * <pre><code>
 * VK_DEFINE_NON_DISPATCHABLE_HANDLE(VkCuFunctionNVX)</code></pre>
 * 
 * <p>There is currently no specification language written for this type. This section acts only as placeholder and to avoid dead links in the specification and reference pages.</p>
 * 
 * <pre><code>
 * VK_DEFINE_NON_DISPATCHABLE_HANDLE(VkCuModuleNVX)</code></pre>
 * 
 * <p>There is currently no specification language written for this command. This section acts only as placeholder and to avoid dead links in the specification and reference pages.</p>
 * 
 * <pre><code>
 * VkResult vkCreateCuFunctionNVX(
 *     VkDevice                                    device,
 *     const VkCuFunctionCreateInfoNVX*            pCreateInfo,
 *     const VkAllocationCallbacks*                pAllocator,
 *     VkCuFunctionNVX*                            pFunction);</code></pre>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
 * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkCuFunctionCreateInfoNVX} structure</li>
 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
 * <li>{@code pFunction} <b>must</b> be a valid pointer to a {@code VkCuFunctionNVX} handle</li>
 * </ul>
 * 
 * <h5>Return Codes</h5>
 * 
 * <dl>
 * <dt>On success, this command returns</dt>
 * <dd><ul>
 * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
 * </ul></dd>
 * <dt>On failure, this command returns</dt>
 * <dd><ul>
 * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
 * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
 * </ul></dd>
 * </dl>
 * 
 * <p>There is currently no specification language written for this type. This section acts only as placeholder and to avoid dead links in the specification and reference pages.</p>
 * 
 * <pre><code>
 * typedef struct VkCuFunctionCreateInfoNVX {
 *     VkStructureType    sType;
 *     const void*        pNext;
 *     VkCuModuleNVX      module;
 *     const char*        pName;
 * } VkCuFunctionCreateInfoNVX;</code></pre>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link #VK_STRUCTURE_TYPE_CU_FUNCTION_CREATE_INFO_NVX STRUCTURE_TYPE_CU_FUNCTION_CREATE_INFO_NVX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code module} <b>must</b> be a valid {@code VkCuModuleNVX} handle</li>
 * <li>{@code pName} <b>must</b> be a null-terminated UTF-8 string</li>
 * </ul>
 * 
 * <p>There is currently no specification language written for this command. This section acts only as placeholder and to avoid dead links in the specification and reference pages.</p>
 * 
 * <pre><code>
 * void vkDestroyCuFunctionNVX(
 *     VkDevice                                    device,
 *     VkCuFunctionNVX                             function,
 *     const VkAllocationCallbacks*                pAllocator);</code></pre>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
 * <li>{@code function} <b>must</b> be a valid {@code VkCuFunctionNVX} handle</li>
 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
 * <li>{@code function} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
 * </ul>
 * 
 * <p>There is currently no specification language written for this command. This section acts only as placeholder and to avoid dead links in the specification and reference pages.</p>
 * 
 * <pre><code>
 * VkResult vkCreateCuModuleNVX(
 *     VkDevice                                    device,
 *     const VkCuModuleCreateInfoNVX*              pCreateInfo,
 *     const VkAllocationCallbacks*                pAllocator,
 *     VkCuModuleNVX*                              pModule);</code></pre>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
 * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkCuModuleCreateInfoNVX} structure</li>
 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
 * <li>{@code pModule} <b>must</b> be a valid pointer to a {@code VkCuModuleNVX} handle</li>
 * </ul>
 * 
 * <h5>Return Codes</h5>
 * 
 * <dl>
 * <dt>On success, this command returns</dt>
 * <dd><ul>
 * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
 * </ul></dd>
 * <dt>On failure, this command returns</dt>
 * <dd><ul>
 * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
 * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
 * </ul></dd>
 * </dl>
 * 
 * <p>There is currently no specification language written for this type. This section acts only as placeholder and to avoid dead links in the specification and reference pages.</p>
 * 
 * <pre><code>
 * typedef struct VkCuModuleCreateInfoNVX {
 *     VkStructureType    sType;
 *     const void*        pNext;
 *     size_t             dataSize;
 *     const void*        pData;
 * } VkCuModuleCreateInfoNVX;</code></pre>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link #VK_STRUCTURE_TYPE_CU_MODULE_CREATE_INFO_NVX STRUCTURE_TYPE_CU_MODULE_CREATE_INFO_NVX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code pData} <b>must</b> be a valid pointer to an array of {@code dataSize} bytes</li>
 * <li>{@code dataSize} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <p>There is currently no specification language written for this command. This section acts only as placeholder and to avoid dead links in the specification and reference pages.</p>
 * 
 * <pre><code>
 * void vkDestroyCuModuleNVX(
 *     VkDevice                                    device,
 *     VkCuModuleNVX                               module,
 *     const VkAllocationCallbacks*                pAllocator);</code></pre>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
 * <li>{@code module} <b>must</b> be a valid {@code VkCuModuleNVX} handle</li>
 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
 * <li>{@code module} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
 * </ul>
 * 
 * <p>There is currently no specification language written for this command. This section acts only as placeholder and to avoid dead links in the specification and reference pages.</p>
 * 
 * <pre><code>
 * void vkCmdCuLaunchKernelNVX(
 *     VkCommandBuffer                             commandBuffer,
 *     const VkCuLaunchInfoNVX*                    pLaunchInfo);</code></pre>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
 * <li>{@code pLaunchInfo} <b>must</b> be a valid pointer to a valid {@link VkCuLaunchInfoNVX} structure</li>
 * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
 * </ul>
 * 
 * <h5>Host Synchronization</h5>
 * 
 * <ul>
 * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
 * </ul>
 * 
 * <h5>Command Properties</h5>
 * 
 * <table class="lwjgl">
 * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td></tr></tbody>
 * </table>
 * 
 * <p>There is currently no specification language written for this type. This section acts only as placeholder and to avoid dead links in the specification and reference pages.</p>
 * 
 * <pre><code>
 * typedef struct VkCuLaunchInfoNVX {
 *     VkStructureType        sType;
 *     const void*            pNext;
 *     VkCuFunctionNVX        function;
 *     uint32_t               gridDimX;
 *     uint32_t               gridDimY;
 *     uint32_t               gridDimZ;
 *     uint32_t               blockDimX;
 *     uint32_t               blockDimY;
 *     uint32_t               blockDimZ;
 *     uint32_t               sharedMemBytes;
 *     size_t                 paramCount;
 *     const void* const *    pParams;
 *     size_t                 extraCount;
 *     const void* const *    pExtras;
 * } VkCuLaunchInfoNVX;</code></pre>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link #VK_STRUCTURE_TYPE_CU_LAUNCH_INFO_NVX STRUCTURE_TYPE_CU_LAUNCH_INFO_NVX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code function} <b>must</b> be a valid {@code VkCuFunctionNVX} handle</li>
 * <li>If {@code paramCount} is not 0, {@code pParams} <b>must</b> be a valid pointer to an array of {@code paramCount} bytes</li>
 * <li>If {@code extraCount} is not 0, {@code pExtras} <b>must</b> be a valid pointer to an array of {@code extraCount} bytes</li>
 * </ul>
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

    /** Unsafe version of: {@link #vkCreateCuModuleNVX CreateCuModuleNVX} */
    public static int nvkCreateCuModuleNVX(VkDevice device, long pCreateInfo, long pAllocator, long pModule) {
        long __functionAddress = device.getCapabilities().vkCreateCuModuleNVX;
        if (CHECKS) {
            check(__functionAddress);
            VkCuModuleCreateInfoNVX.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pModule, __functionAddress);
    }

    /**
     * Stub description of vkCreateCuModuleNVX.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>There is currently no specification language written for this command. This section acts only as placeholder and to avoid dead links in the specification and reference pages.</p>
     * 
     * <pre><code>
     * VkResult vkCreateCuModuleNVX(
     *     VkDevice                                    device,
     *     const VkCuModuleCreateInfoNVX*              pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkCuModuleNVX*                              pModule);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkCuModuleCreateInfoNVX} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pModule} <b>must</b> be a valid pointer to a {@code VkCuModuleNVX} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkCuModuleCreateInfoNVX}</p>
     */
    @NativeType("VkResult")
    public static int vkCreateCuModuleNVX(VkDevice device, @NativeType("VkCuModuleCreateInfoNVX const *") VkCuModuleCreateInfoNVX pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkCuModuleNVX *") LongBuffer pModule) {
        if (CHECKS) {
            check(pModule, 1);
        }
        return nvkCreateCuModuleNVX(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pModule));
    }

    // --- [ vkCreateCuFunctionNVX ] ---

    /** Unsafe version of: {@link #vkCreateCuFunctionNVX CreateCuFunctionNVX} */
    public static int nvkCreateCuFunctionNVX(VkDevice device, long pCreateInfo, long pAllocator, long pFunction) {
        long __functionAddress = device.getCapabilities().vkCreateCuFunctionNVX;
        if (CHECKS) {
            check(__functionAddress);
            VkCuFunctionCreateInfoNVX.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pFunction, __functionAddress);
    }

    /**
     * Stub description of vkCreateCuFunctionNVX.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>There is currently no specification language written for this command. This section acts only as placeholder and to avoid dead links in the specification and reference pages.</p>
     * 
     * <pre><code>
     * VkResult vkCreateCuFunctionNVX(
     *     VkDevice                                    device,
     *     const VkCuFunctionCreateInfoNVX*            pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkCuFunctionNVX*                            pFunction);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkCuFunctionCreateInfoNVX} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pFunction} <b>must</b> be a valid pointer to a {@code VkCuFunctionNVX} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkCuFunctionCreateInfoNVX}</p>
     */
    @NativeType("VkResult")
    public static int vkCreateCuFunctionNVX(VkDevice device, @NativeType("VkCuFunctionCreateInfoNVX const *") VkCuFunctionCreateInfoNVX pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkCuFunctionNVX *") LongBuffer pFunction) {
        if (CHECKS) {
            check(pFunction, 1);
        }
        return nvkCreateCuFunctionNVX(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pFunction));
    }

    // --- [ vkDestroyCuModuleNVX ] ---

    /** Unsafe version of: {@link #vkDestroyCuModuleNVX DestroyCuModuleNVX} */
    public static void nvkDestroyCuModuleNVX(VkDevice device, long module, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyCuModuleNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), module, pAllocator, __functionAddress);
    }

    /**
     * Stub description of vkDestroyCuModuleNVX.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>There is currently no specification language written for this command. This section acts only as placeholder and to avoid dead links in the specification and reference pages.</p>
     * 
     * <pre><code>
     * void vkDestroyCuModuleNVX(
     *     VkDevice                                    device,
     *     VkCuModuleNVX                               module,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code module} <b>must</b> be a valid {@code VkCuModuleNVX} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code module} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     */
    public static void vkDestroyCuModuleNVX(VkDevice device, @NativeType("VkCuModuleNVX") long module, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyCuModuleNVX(device, module, memAddressSafe(pAllocator));
    }

    // --- [ vkDestroyCuFunctionNVX ] ---

    /** Unsafe version of: {@link #vkDestroyCuFunctionNVX DestroyCuFunctionNVX} */
    public static void nvkDestroyCuFunctionNVX(VkDevice device, long function, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyCuFunctionNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), function, pAllocator, __functionAddress);
    }

    /**
     * Stub description of vkDestroyCuFunctionNVX.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>There is currently no specification language written for this command. This section acts only as placeholder and to avoid dead links in the specification and reference pages.</p>
     * 
     * <pre><code>
     * void vkDestroyCuFunctionNVX(
     *     VkDevice                                    device,
     *     VkCuFunctionNVX                             function,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code function} <b>must</b> be a valid {@code VkCuFunctionNVX} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code function} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     */
    public static void vkDestroyCuFunctionNVX(VkDevice device, @NativeType("VkCuFunctionNVX") long function, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyCuFunctionNVX(device, function, memAddressSafe(pAllocator));
    }

    // --- [ vkCmdCuLaunchKernelNVX ] ---

    /** Unsafe version of: {@link #vkCmdCuLaunchKernelNVX CmdCuLaunchKernelNVX} */
    public static void nvkCmdCuLaunchKernelNVX(VkCommandBuffer commandBuffer, long pLaunchInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCuLaunchKernelNVX;
        if (CHECKS) {
            check(__functionAddress);
            VkCuLaunchInfoNVX.validate(pLaunchInfo);
        }
        callPPV(commandBuffer.address(), pLaunchInfo, __functionAddress);
    }

    /**
     * Stub description of vkCmdCuLaunchKernelNVX.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>There is currently no specification language written for this command. This section acts only as placeholder and to avoid dead links in the specification and reference pages.</p>
     * 
     * <pre><code>
     * void vkCmdCuLaunchKernelNVX(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkCuLaunchInfoNVX*                    pLaunchInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pLaunchInfo} <b>must</b> be a valid pointer to a valid {@link VkCuLaunchInfoNVX} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCuLaunchInfoNVX}</p>
     */
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
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pFunction, __functionAddress);
    }

}