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
 * {@code VK_KHR_maintenance4} adds a collection of minor features, none of which would warrant an entire extension of their own.
 * 
 * <p>The new features are as follows:</p>
 * 
 * <ul>
 * <li>Allow the application to destroy their {@code VkPipelineLayout} object immediately after it was used to create another object. It is no longer necessary to keep its handle valid while the created object is in use.</li>
 * <li>Add a new <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#limits-maxBufferSize">{@code maxBufferSize}</a> implementation-defined limit for the maximum size {@code VkBuffer} that <b>can</b> be created.</li>
 * <li>Add support for the SPIR-V 1.2 {@code LocalSizeId} execution mode, which can be used as an alternative to {@code LocalSize} to specify the local workgroup size with specialization constants.</li>
 * <li>Add a guarantee that images created with identical creation parameters will always have the same alignment requirements.</li>
 * <li>Add new {@link #vkGetDeviceBufferMemoryRequirementsKHR GetDeviceBufferMemoryRequirementsKHR}, {@link #vkGetDeviceImageMemoryRequirementsKHR GetDeviceImageMemoryRequirementsKHR}, and {@link #vkGetDeviceImageSparseMemoryRequirementsKHR GetDeviceImageSparseMemoryRequirementsKHR} to allow the application to query the image memory requirements without having to create an image object and query it.</li>
 * <li>Relax the requirement that push constants must be initialized before they are dynamically accessed.</li>
 * <li>Relax the interface matching rules to allow a larger output vector to match with a smaller input vector, with additional values being discarded.</li>
 * </ul>
 * 
 * <h5>VK_KHR_maintenance4</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_maintenance4}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>414</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.1</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Piers Daniell <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_maintenance4]%20@pdaniell-nv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_maintenance4%20extension%3E%3E">pdaniell-nv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2021-08-18</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires SPIR-V 1.2 for {@code LocalSizeId}</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Lionel Duc, NVIDIA</li>
 * <li>Jason Ekstrand, Intel</li>
 * <li>Spencer Fricke, Samsung</li>
 * <li>Tobias Hector, AMD</li>
 * <li>Lionel Landwerlin, Intel</li>
 * <li>Graeme Leese, Broadcom</li>
 * <li>Tom Olson, Arm</li>
 * <li>Stu Smith, AMD</li>
 * </ul></dd>
 * </dl>
 */
public class KHRMaintenance4 {

    /** The extension specification version. */
    public static final int VK_KHR_MAINTENANCE_4_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_MAINTENANCE_4_EXTENSION_NAME = "VK_KHR_maintenance4";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS_KHR STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS_KHR STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES_KHR   = 1000413000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES_KHR = 1000413001,
        VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS_KHR        = 1000413002,
        VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS_KHR         = 1000413003;

    protected KHRMaintenance4() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetDeviceBufferMemoryRequirementsKHR ] ---

    /** Unsafe version of: {@link #vkGetDeviceBufferMemoryRequirementsKHR GetDeviceBufferMemoryRequirementsKHR} */
    public static void nvkGetDeviceBufferMemoryRequirementsKHR(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDeviceBufferMemoryRequirementsKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkDeviceBufferMemoryRequirementsKHR.validate(pInfo);
        }
        callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    /**
     * Returns the memory requirements for specified Vulkan object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To determine the memory requirements for a buffer resource without creating an object, call:</p>
     * 
     * <pre><code>
     * void vkGetDeviceBufferMemoryRequirementsKHR(
     *     VkDevice                                    device,
     *     const VkDeviceBufferMemoryRequirementsKHR*  pInfo,
     *     VkMemoryRequirements2*                      pMemoryRequirements);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkDeviceBufferMemoryRequirementsKHR} structure</li>
     * <li>{@code pMemoryRequirements} <b>must</b> be a valid pointer to a {@link VkMemoryRequirements2} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDeviceBufferMemoryRequirementsKHR}, {@link VkMemoryRequirements2}</p>
     *
     * @param device              the logical device intended to own the buffer.
     * @param pInfo               a pointer to a {@link VkDeviceBufferMemoryRequirementsKHR} structure containing parameters required for the memory requirements query.
     * @param pMemoryRequirements a pointer to a {@link VkMemoryRequirements2} structure in which the memory requirements of the buffer object are returned.
     */
    public static void vkGetDeviceBufferMemoryRequirementsKHR(VkDevice device, @NativeType("VkDeviceBufferMemoryRequirementsKHR const *") VkDeviceBufferMemoryRequirementsKHR pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetDeviceBufferMemoryRequirementsKHR(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkGetDeviceImageMemoryRequirementsKHR ] ---

    /** Unsafe version of: {@link #vkGetDeviceImageMemoryRequirementsKHR GetDeviceImageMemoryRequirementsKHR} */
    public static void nvkGetDeviceImageMemoryRequirementsKHR(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDeviceImageMemoryRequirementsKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkDeviceImageMemoryRequirementsKHR.validate(pInfo);
        }
        callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    /**
     * Returns the memory requirements for specified Vulkan object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To determine the memory requirements for an image resource without creating an object, call:</p>
     * 
     * <pre><code>
     * void vkGetDeviceImageMemoryRequirementsKHR(
     *     VkDevice                                    device,
     *     const VkDeviceImageMemoryRequirementsKHR*   pInfo,
     *     VkMemoryRequirements2*                      pMemoryRequirements);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkDeviceImageMemoryRequirementsKHR} structure</li>
     * <li>{@code pMemoryRequirements} <b>must</b> be a valid pointer to a {@link VkMemoryRequirements2} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDeviceImageMemoryRequirementsKHR}, {@link VkMemoryRequirements2}</p>
     *
     * @param device              the logical device intended to own the image.
     * @param pInfo               a pointer to a {@link VkDeviceImageMemoryRequirementsKHR} structure containing parameters required for the memory requirements query.
     * @param pMemoryRequirements a pointer to a {@link VkMemoryRequirements2} structure in which the memory requirements of the image object are returned.
     */
    public static void vkGetDeviceImageMemoryRequirementsKHR(VkDevice device, @NativeType("VkDeviceImageMemoryRequirementsKHR const *") VkDeviceImageMemoryRequirementsKHR pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetDeviceImageMemoryRequirementsKHR(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkGetDeviceImageSparseMemoryRequirementsKHR ] ---

    /**
     * Unsafe version of: {@link #vkGetDeviceImageSparseMemoryRequirementsKHR GetDeviceImageSparseMemoryRequirementsKHR}
     *
     * @param pSparseMemoryRequirementCount a pointer to an integer related to the number of sparse memory requirements available or queried, as described below.
     */
    public static void nvkGetDeviceImageSparseMemoryRequirementsKHR(VkDevice device, long pInfo, long pSparseMemoryRequirementCount, long pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDeviceImageSparseMemoryRequirementsKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkDeviceImageMemoryRequirementsKHR.validate(pInfo);
        }
        callPPPPV(device.address(), pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements, __functionAddress);
    }

    /**
     * Query the memory requirements for a sparse image.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To determine the sparse memory requirements for an image resource without creating an object, call:</p>
     * 
     * <pre><code>
     * void vkGetDeviceImageSparseMemoryRequirementsKHR(
     *     VkDevice                                    device,
     *     const VkDeviceImageMemoryRequirementsKHR*   pInfo,
     *     uint32_t*                                   pSparseMemoryRequirementCount,
     *     VkSparseImageMemoryRequirements2*           pSparseMemoryRequirements);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkDeviceImageMemoryRequirementsKHR} structure</li>
     * <li>{@code pSparseMemoryRequirementCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pSparseMemoryRequirementCount} is not 0, and {@code pSparseMemoryRequirements} is not {@code NULL}, {@code pSparseMemoryRequirements} <b>must</b> be a valid pointer to an array of {@code pSparseMemoryRequirementCount} {@link VkSparseImageMemoryRequirements2} structures</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDeviceImageMemoryRequirementsKHR}, {@link VkSparseImageMemoryRequirements2}</p>
     *
     * @param device                        the logical device intended to own the image.
     * @param pInfo                         a pointer to a {@link VkDeviceImageMemoryRequirementsKHR} structure containing parameters required for the memory requirements query.
     * @param pSparseMemoryRequirementCount a pointer to an integer related to the number of sparse memory requirements available or queried, as described below.
     * @param pSparseMemoryRequirements     either {@code NULL} or a pointer to an array of {@link VkSparseImageMemoryRequirements2} structures.
     */
    public static void vkGetDeviceImageSparseMemoryRequirementsKHR(VkDevice device, @NativeType("VkDeviceImageMemoryRequirementsKHR const *") VkDeviceImageMemoryRequirementsKHR pInfo, @NativeType("uint32_t *") IntBuffer pSparseMemoryRequirementCount, @Nullable @NativeType("VkSparseImageMemoryRequirements2 *") VkSparseImageMemoryRequirements2.Buffer pSparseMemoryRequirements) {
        if (CHECKS) {
            check(pSparseMemoryRequirementCount, 1);
            checkSafe(pSparseMemoryRequirements, pSparseMemoryRequirementCount.get(pSparseMemoryRequirementCount.position()));
        }
        nvkGetDeviceImageSparseMemoryRequirementsKHR(device, pInfo.address(), memAddress(pSparseMemoryRequirementCount), memAddressSafe(pSparseMemoryRequirements));
    }

    /** Array version of: {@link #vkGetDeviceImageSparseMemoryRequirementsKHR GetDeviceImageSparseMemoryRequirementsKHR} */
    public static void vkGetDeviceImageSparseMemoryRequirementsKHR(VkDevice device, @NativeType("VkDeviceImageMemoryRequirementsKHR const *") VkDeviceImageMemoryRequirementsKHR pInfo, @NativeType("uint32_t *") int[] pSparseMemoryRequirementCount, @Nullable @NativeType("VkSparseImageMemoryRequirements2 *") VkSparseImageMemoryRequirements2.Buffer pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDeviceImageSparseMemoryRequirementsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pSparseMemoryRequirementCount, 1);
            checkSafe(pSparseMemoryRequirements, pSparseMemoryRequirementCount[0]);
            VkDeviceImageMemoryRequirementsKHR.validate(pInfo.address());
        }
        callPPPPV(device.address(), pInfo.address(), pSparseMemoryRequirementCount, memAddressSafe(pSparseMemoryRequirements), __functionAddress);
    }

}