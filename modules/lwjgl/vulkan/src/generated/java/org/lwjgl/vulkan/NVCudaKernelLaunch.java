/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Interoperability between APIs can sometimes create additional overhead depending on the platform used. This extension targets deployment of existing CUDA kernels via Vulkan, with a way to directly upload PTX kernels and dispatch the kernels from Vulkan’s command buffer without the need to use interoperability between the Vulkan and CUDA contexts. However, we do encourage actual development using the native CUDA runtime for the purpose of debugging and profiling.
 * 
 * <p>The application will first have to create a CUDA module using {@link #vkCreateCudaModuleNV CreateCudaModuleNV} then create the CUDA function entry point with {@link #vkCreateCudaFunctionNV CreateCudaFunctionNV}.</p>
 * 
 * <p>Then in order to dispatch this function, the application will create a command buffer where it will launch the kernel with {@link #vkCmdCudaLaunchKernelNV CmdCudaLaunchKernelNV}.</p>
 * 
 * <p>When done, the application will then destroy the function handle, as well as the CUDA module handle with {@link #vkDestroyCudaFunctionNV DestroyCudaFunctionNV} and {@link #vkDestroyCudaModuleNV DestroyCudaModuleNV}.</p>
 * 
 * <p>To reduce the impact of compilation time, this extension offers the capability to return a binary cache from the PTX that was provided. For this, a first query for the required cache size is made with {@link #vkGetCudaModuleCacheNV GetCudaModuleCacheNV} with a {@code NULL} pointer to a buffer and with a valid pointer receiving the size; then another call of the same function with a valid pointer to a buffer to retrieve the data. The resulting cache could then be used later for further runs of this application by sending this cache instead of the PTX code (using the same {@link #vkCreateCudaModuleNV CreateCudaModuleNV}), thus significantly speeding up the initialization of the CUDA module.</p>
 * 
 * <p>As with {@code VkPipelineCache}, the binary cache depends on the hardware architecture. The application must assume the cache might fail, and need to handle falling back to the original PTX code as necessary. Most often, the cache will succeed if the same GPU driver and architecture is used between the cache generation from PTX and the use of this cache. In the event of a new driver version, or if using a different GPU architecture, the cache is likely to become invalid.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_cuda_kernel_launch}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>308</dd>
 * <dt><b>Revision</b></dt>
 * <dd><ul>
 * <li>This is a <em>provisional</em> extension and <b>must</b> be used with caution. See the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#boilerplate-provisional-header">description</a> of provisional header files for enablement and stability details.</li>
 * </ul></dd>
 * <dt><b>API Interactions</b></dt>
 * <dd><ul>
 * <li>Interacts with VK_EXT_debug_report</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Tristan Lorach <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_cuda_kernel_launch]%20@tlorach%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_cuda_kernel_launch%20extension*">tlorach</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2020-09-30</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Eric Werness, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class NVCudaKernelLaunch {

    /** The extension specification version. */
    public static final int VK_NV_CUDA_KERNEL_LAUNCH_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_NV_CUDA_KERNEL_LAUNCH_EXTENSION_NAME = "VK_NV_cuda_kernel_launch";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_CUDA_MODULE_CREATE_INFO_NV STRUCTURE_TYPE_CUDA_MODULE_CREATE_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_CUDA_FUNCTION_CREATE_INFO_NV STRUCTURE_TYPE_CUDA_FUNCTION_CREATE_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_FEATURES_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_PROPERTIES_NV}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_CUDA_MODULE_CREATE_INFO_NV                       = 1000307000,
        VK_STRUCTURE_TYPE_CUDA_FUNCTION_CREATE_INFO_NV                     = 1000307001,
        VK_STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV                              = 1000307002,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_FEATURES_NV   = 1000307003,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_PROPERTIES_NV = 1000307004;

    /**
     * Extends {@code VkObjectType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_OBJECT_TYPE_CUDA_MODULE_NV OBJECT_TYPE_CUDA_MODULE_NV}</li>
     * <li>{@link #VK_OBJECT_TYPE_CUDA_FUNCTION_NV OBJECT_TYPE_CUDA_FUNCTION_NV}</li>
     * </ul>
     */
    public static final int
        VK_OBJECT_TYPE_CUDA_MODULE_NV   = 1000307000,
        VK_OBJECT_TYPE_CUDA_FUNCTION_NV = 1000307001;

    /**
     * Extends {@code VkDebugReportObjectTypeEXT}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_CUDA_MODULE_NV_EXT DEBUG_REPORT_OBJECT_TYPE_CUDA_MODULE_NV_EXT}</li>
     * <li>{@link #VK_DEBUG_REPORT_OBJECT_TYPE_CUDA_FUNCTION_NV_EXT DEBUG_REPORT_OBJECT_TYPE_CUDA_FUNCTION_NV_EXT}</li>
     * </ul>
     */
    public static final int
        VK_DEBUG_REPORT_OBJECT_TYPE_CUDA_MODULE_NV_EXT   = 1000307000,
        VK_DEBUG_REPORT_OBJECT_TYPE_CUDA_FUNCTION_NV_EXT = 1000307001;

    protected NVCudaKernelLaunch() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateCudaModuleNV ] ---

    /** Unsafe version of: {@link #vkCreateCudaModuleNV CreateCudaModuleNV} */
    public static int nvkCreateCudaModuleNV(VkDevice device, long pCreateInfo, long pAllocator, long pModule) {
        long __functionAddress = device.getCapabilities().vkCreateCudaModuleNV;
        if (CHECKS) {
            check(__functionAddress);
            VkCudaModuleCreateInfoNV.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pModule, __functionAddress);
    }

    /**
     * Creates a new CUDA module object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create a CUDA module, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreateCudaModuleNV(
     *     VkDevice                                    device,
     *     const VkCudaModuleCreateInfoNV*             pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkCudaModuleNV*                             pModule);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Once a CUDA module has been created, the application <b>may</b> create the function entry point, which <b>must</b> refer to one function in the module.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkCudaModuleCreateInfoNV} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pModule} <b>must</b> be a valid pointer to a {@code VkCudaModuleNV} handle</li>
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
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkCudaModuleCreateInfoNV}</p>
     *
     * @param device      the logical device that creates the shader module.
     * @param pCreateInfo a pointer to a {@link VkCudaModuleCreateInfoNV} structure.
     * @param pAllocator  controls host memory allocation as described in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pModule     a pointer to a {@code VkCudaModuleNV} handle in which the resulting CUDA module object is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateCudaModuleNV(VkDevice device, @NativeType("VkCudaModuleCreateInfoNV const *") VkCudaModuleCreateInfoNV pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkCudaModuleNV *") LongBuffer pModule) {
        if (CHECKS) {
            check(pModule, 1);
        }
        return nvkCreateCudaModuleNV(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pModule));
    }

    // --- [ vkGetCudaModuleCacheNV ] ---

    /**
     * Unsafe version of: {@link #vkGetCudaModuleCacheNV GetCudaModuleCacheNV}
     *
     * @param pCacheSize a pointer containing the amount of bytes to be copied in {@code pCacheData}
     */
    public static int nvkGetCudaModuleCacheNV(VkDevice device, long module, long pCacheSize, long pCacheData) {
        long __functionAddress = device.getCapabilities().vkGetCudaModuleCacheNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), module, pCacheSize, pCacheData, __functionAddress);
    }

    /**
     * Get CUDA module cache.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To get the CUDA module cache call:</p>
     * 
     * <pre><code>
     * VkResult vkGetCudaModuleCacheNV(
     *     VkDevice                                    device,
     *     VkCudaModuleNV                              module,
     *     size_t*                                     pCacheSize,
     *     void*                                       pCacheData);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pCacheData} is {@code NULL}, then the size of the binary cache, in bytes, is returned in {@code pCacheSize}. Otherwise, {@code pCacheSize} <b>must</b> point to a variable set by the application to the size of the buffer, in bytes, pointed to by {@code pCacheData}, and on return the variable is overwritten with the amount of data actually written to {@code pCacheData}. If {@code pCacheSize} is less than the size of the binary shader code, nothing is written to {@code pCacheData}, and {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link VK10#VK_SUCCESS SUCCESS}.</p>
     * 
     * <p>The returned cache <b>may</b> then be used later for further initialization of the CUDA module, by sending this cache <em>instead</em> of the PTX code when using {@link #vkCreateCudaModuleNV CreateCudaModuleNV}.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Using the binary cache instead of the original PTX code <b>should</b> significantly speed up initialization of the CUDA module, given that the whole compilation and validation will not be necessary.</p>
     * 
     * <p>As with {@code VkPipelineCache}, the binary cache depends on the specific implementation. The application <b>must</b> assume the cache upload might fail in many circumstances and thus <b>may</b> have to get ready for falling back to the original PTX code if necessary. Most often, the cache <b>may</b> succeed if the same device driver and architecture is used between the cache generation from PTX and the use of this cache. In the event of a new driver version or if using a different device architecture, this cache <b>may</b> become invalid.</p>
     * </div>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code module} <b>must</b> be a valid {@code VkCudaModuleNV} handle</li>
     * <li>{@code pCacheSize} <b>must</b> be a valid pointer to a {@code size_t} value</li>
     * <li>If the value referenced by {@code pCacheSize} is not 0, and {@code pCacheData} is not {@code NULL}, {@code pCacheData} <b>must</b> be a valid pointer to an array of {@code pCacheSize} bytes</li>
     * <li>{@code module} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link VK10#VK_INCOMPLETE INCOMPLETE}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * </ul></dd>
     * </dl>
     *
     * @param device     the logical device that destroys the Function.
     * @param module     the CUDA module.
     * @param pCacheSize a pointer containing the amount of bytes to be copied in {@code pCacheData}
     * @param pCacheData a pointer to a buffer in which to copy the binary cache
     */
    @NativeType("VkResult")
    public static int vkGetCudaModuleCacheNV(VkDevice device, @NativeType("VkCudaModuleNV") long module, @NativeType("size_t *") PointerBuffer pCacheSize, @NativeType("void *") @Nullable ByteBuffer pCacheData) {
        if (CHECKS) {
            check(pCacheSize, 1);
            checkSafe(pCacheData, pCacheSize.get(pCacheSize.position()));
        }
        return nvkGetCudaModuleCacheNV(device, module, memAddress(pCacheSize), memAddressSafe(pCacheData));
    }

    // --- [ vkCreateCudaFunctionNV ] ---

    /** Unsafe version of: {@link #vkCreateCudaFunctionNV CreateCudaFunctionNV} */
    public static int nvkCreateCudaFunctionNV(VkDevice device, long pCreateInfo, long pAllocator, long pFunction) {
        long __functionAddress = device.getCapabilities().vkCreateCudaFunctionNV;
        if (CHECKS) {
            check(__functionAddress);
            VkCudaFunctionCreateInfoNV.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pFunction, __functionAddress);
    }

    /**
     * Creates a new CUDA function object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create a CUDA function, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreateCudaFunctionNV(
     *     VkDevice                                    device,
     *     const VkCudaFunctionCreateInfoNV*           pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkCudaFunctionNV*                           pFunction);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkCudaFunctionCreateInfoNV} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pFunction} <b>must</b> be a valid pointer to a {@code VkCudaFunctionNV} handle</li>
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
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkCudaFunctionCreateInfoNV}</p>
     *
     * @param device      the logical device that creates the shader module.
     * @param pCreateInfo a pointer to a {@link VkCudaFunctionCreateInfoNV} structure.
     * @param pAllocator  controls host memory allocation as described in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pFunction   a pointer to a {@code VkCudaFunctionNV} handle in which the resulting CUDA function object is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateCudaFunctionNV(VkDevice device, @NativeType("VkCudaFunctionCreateInfoNV const *") VkCudaFunctionCreateInfoNV pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkCudaFunctionNV *") LongBuffer pFunction) {
        if (CHECKS) {
            check(pFunction, 1);
        }
        return nvkCreateCudaFunctionNV(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pFunction));
    }

    // --- [ vkDestroyCudaModuleNV ] ---

    /** Unsafe version of: {@link #vkDestroyCudaModuleNV DestroyCudaModuleNV} */
    public static void nvkDestroyCudaModuleNV(VkDevice device, long module, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyCudaModuleNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), module, pAllocator, __functionAddress);
    }

    /**
     * Destroy a CUDA module.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To destroy a CUDA shader module, call:</p>
     * 
     * <pre><code>
     * void vkDestroyCudaModuleNV(
     *     VkDevice                                    device,
     *     VkCudaModuleNV                              module,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code module} <b>must</b> be a valid {@code VkCudaModuleNV} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code module} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param device     the logical device that destroys the shader module.
     * @param module     the handle of the CUDA module to destroy.
     * @param pAllocator controls host memory allocation as described in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroyCudaModuleNV(VkDevice device, @NativeType("VkCudaModuleNV") long module, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyCudaModuleNV(device, module, memAddressSafe(pAllocator));
    }

    // --- [ vkDestroyCudaFunctionNV ] ---

    /** Unsafe version of: {@link #vkDestroyCudaFunctionNV DestroyCudaFunctionNV} */
    public static void nvkDestroyCudaFunctionNV(VkDevice device, long function, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyCudaFunctionNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), function, pAllocator, __functionAddress);
    }

    /**
     * Destroy a CUDA function.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To destroy a CUDA function handle, call:</p>
     * 
     * <pre><code>
     * void vkDestroyCudaFunctionNV(
     *     VkDevice                                    device,
     *     VkCudaFunctionNV                            function,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code function} <b>must</b> be a valid {@code VkCudaFunctionNV} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code function} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param device     the logical device that destroys the Function.
     * @param function   the handle of the CUDA function to destroy.
     * @param pAllocator controls host memory allocation as described in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroyCudaFunctionNV(VkDevice device, @NativeType("VkCudaFunctionNV") long function, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyCudaFunctionNV(device, function, memAddressSafe(pAllocator));
    }

    // --- [ vkCmdCudaLaunchKernelNV ] ---

    /** Unsafe version of: {@link #vkCmdCudaLaunchKernelNV CmdCudaLaunchKernelNV} */
    public static void nvkCmdCudaLaunchKernelNV(VkCommandBuffer commandBuffer, long pLaunchInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCudaLaunchKernelNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pLaunchInfo, __functionAddress);
    }

    /**
     * Dispatch compute work items.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To record a CUDA kernel launch, call:</p>
     * 
     * <pre><code>
     * void vkCmdCudaLaunchKernelNV(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkCudaLaunchInfoNV*                   pLaunchInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>When the command is executed, a global workgroup consisting of <code>gridDimX × gridDimY × gridDimZ</code> local workgroups is assembled.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pLaunchInfo} <b>must</b> be a valid pointer to a valid {@link VkCudaLaunchInfoNV} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>Action</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCudaLaunchInfoNV}</p>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param pLaunchInfo   a pointer to a {@link VkCudaLaunchInfoNV} structure in which the grid (similar to workgroup) dimension, function handle and related arguments are defined.
     */
    public static void vkCmdCudaLaunchKernelNV(VkCommandBuffer commandBuffer, @NativeType("VkCudaLaunchInfoNV const *") VkCudaLaunchInfoNV pLaunchInfo) {
        nvkCmdCudaLaunchKernelNV(commandBuffer, pLaunchInfo.address());
    }

    /** Array version of: {@link #vkCreateCudaModuleNV CreateCudaModuleNV} */
    @NativeType("VkResult")
    public static int vkCreateCudaModuleNV(VkDevice device, @NativeType("VkCudaModuleCreateInfoNV const *") VkCudaModuleCreateInfoNV pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkCudaModuleNV *") long[] pModule) {
        long __functionAddress = device.getCapabilities().vkCreateCudaModuleNV;
        if (CHECKS) {
            check(__functionAddress);
            check(pModule, 1);
            VkCudaModuleCreateInfoNV.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pModule, __functionAddress);
    }

    /** Array version of: {@link #vkCreateCudaFunctionNV CreateCudaFunctionNV} */
    @NativeType("VkResult")
    public static int vkCreateCudaFunctionNV(VkDevice device, @NativeType("VkCudaFunctionCreateInfoNV const *") VkCudaFunctionCreateInfoNV pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkCudaFunctionNV *") long[] pFunction) {
        long __functionAddress = device.getCapabilities().vkCreateCudaFunctionNV;
        if (CHECKS) {
            check(__functionAddress);
            check(pFunction, 1);
            VkCudaFunctionCreateInfoNV.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pFunction, __functionAddress);
    }

}