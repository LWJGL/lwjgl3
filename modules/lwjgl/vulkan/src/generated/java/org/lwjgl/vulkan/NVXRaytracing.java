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
 * Rasterization has been the dominant method to produce interactive graphics, but increasing performance of graphics hardware has made raytracing a viable option for interactive rendering. Being able to integrate raytracing with traditional rasterization makes it easier for applications to incrementally add raytraced effects to existing applications or to do hybrid approaches with rasterization for primary visibility and raytracing for secondary queries.
 * 
 * <p>To enable raytracing, this extension adds a few different categories of new functionality:</p>
 * 
 * <ul>
 * <li>Acceleration structure objects and build commands</li>
 * <li>A new pipeline type with new shader domains</li>
 * <li>An indirection table to link shader groups with acceleration structure items</li>
 * </ul>
 * 
 * <p>This extension adds support for the following SPIR-V extension in Vulkan:</p>
 * 
 * <ul>
 * <li>SPV_NVX_raytracing</li>
 * </ul>
 * 
 * <h5>Sample Code</h5>
 * 
 * <p>Example ray generation GLSL shader</p>
 * 
 * <pre><code>
 * #version 450 core
 * #extension GL_NVX_raytracing : require
 * layout(set = 0, binding = 0, rgba8) uniform image2D image;
 * layout(set = 0, binding = 1) uniform accelerationStructureNVX as;
 * layout(location = 0) rayPayloadNVX float payload;
 * 
 * void main()
 * {
 *    vec4 col = vec4(0, 0, 0, 1);
 * 
 *    vec3 origin = vec3(float(gl_LaunchIDNVX.x)/float(gl_LaunchSizeNVX.x), float(gl_LaunchIDNVX.y)/float(gl_LaunchSizeNVX.y), 1.0);
 *    vec3 dir = vec3(0.0, 0.0, -1.0);
 * 
 *    traceNVX(as, 0, 0xff, 0, 1, 0, origin, 0.0, dir, 1000.0, 0);
 * 
 *    col.y = payload;
 * 
 *    imageStore(image, ivec2(gl_LaunchIDNVX.xy), col);
 * }</code></pre>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NVX_raytracing}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>166</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * <li>Requires {@link KHRGetMemoryRequirements2 VK_KHR_get_memory_requirements2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Eric Werness <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_NVX_raytracing:%20&amp;body=@ewerness%20">ewerness</a></li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-09-11</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires the <a target="_blank" href="https://www.khronos.org/registry/spir-v/extensions/NVX/SPV_NVX_raytracing.html">SPV_NVX_raytracing</a> SPIR-V extension.</li>
 * <li>This extension requires the <a target="_blank" href="https://github.com/KhronosGroup/GLSL/tree/master/extensions/NVX/GL_NVX_raytracing.txt">GL_NVX_raytracing</a> extension for GLSL source languages.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Eric Werness, NVIDIA</li>
 * <li>Ashwin Lele, NVIDIA</li>
 * <li>Robert Stepinski, NVIDIA</li>
 * <li>Nuno Subtil, NVIDIA</li>
 * <li>Christoph Kubisch, NVIDIA</li>
 * <li>Martin Stich, NVIDIA</li>
 * <li>Daniel Koch, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class NVXRaytracing {

    /** The extension specification version. */
    public static final int VK_NVX_RAYTRACING_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NVX_RAYTRACING_EXTENSION_NAME = "VK_NVX_raytracing";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_RAYTRACING_PIPELINE_CREATE_INFO_NVX STRUCTURE_TYPE_RAYTRACING_PIPELINE_CREATE_INFO_NVX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NVX STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NVX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_GEOMETRY_INSTANCE_NVX STRUCTURE_TYPE_GEOMETRY_INSTANCE_NVX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_GEOMETRY_NVX STRUCTURE_TYPE_GEOMETRY_NVX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NVX STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NVX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_GEOMETRY_AABB_NVX STRUCTURE_TYPE_GEOMETRY_AABB_NVX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NVX STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NVX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DESCRIPTOR_ACCELERATION_STRUCTURE_INFO_NVX STRUCTURE_TYPE_DESCRIPTOR_ACCELERATION_STRUCTURE_INFO_NVX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NVX STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NVX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAYTRACING_PROPERTIES_NVX STRUCTURE_TYPE_PHYSICAL_DEVICE_RAYTRACING_PROPERTIES_NVX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_HIT_SHADER_MODULE_CREATE_INFO_NVX STRUCTURE_TYPE_HIT_SHADER_MODULE_CREATE_INFO_NVX}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_RAYTRACING_PIPELINE_CREATE_INFO_NVX                 = 1000165000,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NVX              = 1000165001,
        VK_STRUCTURE_TYPE_GEOMETRY_INSTANCE_NVX                               = 1000165002,
        VK_STRUCTURE_TYPE_GEOMETRY_NVX                                        = 1000165003,
        VK_STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NVX                              = 1000165004,
        VK_STRUCTURE_TYPE_GEOMETRY_AABB_NVX                                   = 1000165005,
        VK_STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NVX         = 1000165006,
        VK_STRUCTURE_TYPE_DESCRIPTOR_ACCELERATION_STRUCTURE_INFO_NVX          = 1000165007,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NVX = 1000165008,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAYTRACING_PROPERTIES_NVX           = 1000165009,
        VK_STRUCTURE_TYPE_HIT_SHADER_MODULE_CREATE_INFO_NVX                   = 1000165010;

    /**
     * Extends {@code VkShaderStageFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_SHADER_STAGE_RAYGEN_BIT_NVX SHADER_STAGE_RAYGEN_BIT_NVX}</li>
     * <li>{@link #VK_SHADER_STAGE_ANY_HIT_BIT_NVX SHADER_STAGE_ANY_HIT_BIT_NVX}</li>
     * <li>{@link #VK_SHADER_STAGE_CLOSEST_HIT_BIT_NVX SHADER_STAGE_CLOSEST_HIT_BIT_NVX}</li>
     * <li>{@link #VK_SHADER_STAGE_MISS_BIT_NVX SHADER_STAGE_MISS_BIT_NVX}</li>
     * <li>{@link #VK_SHADER_STAGE_INTERSECTION_BIT_NVX SHADER_STAGE_INTERSECTION_BIT_NVX}</li>
     * <li>{@link #VK_SHADER_STAGE_CALLABLE_BIT_NVX SHADER_STAGE_CALLABLE_BIT_NVX}</li>
     * </ul>
     */
    public static final int
        VK_SHADER_STAGE_RAYGEN_BIT_NVX       = 0x100,
        VK_SHADER_STAGE_ANY_HIT_BIT_NVX      = 0x200,
        VK_SHADER_STAGE_CLOSEST_HIT_BIT_NVX  = 0x400,
        VK_SHADER_STAGE_MISS_BIT_NVX         = 0x800,
        VK_SHADER_STAGE_INTERSECTION_BIT_NVX = 0x1000,
        VK_SHADER_STAGE_CALLABLE_BIT_NVX     = 0x2000;

    /** Extends {@code VkPipelineStageFlagBits}. */
    public static final int VK_PIPELINE_STAGE_RAYTRACING_BIT_NVX = 0x200000;

    /** Extends {@code VkBufferUsageFlagBits}. */
    public static final int VK_BUFFER_USAGE_RAYTRACING_BIT_NVX = 0x400;

    /** Extends {@code VkPipelineBindPoint}. */
    public static final int VK_PIPELINE_BIND_POINT_RAYTRACING_NVX = 1000165000;

    /** Extends {@code VkDescriptorType}. */
    public static final int VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NVX = 1000165000;

    /**
     * Extends {@code VkAccessFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_NVX ACCESS_ACCELERATION_STRUCTURE_READ_BIT_NVX}</li>
     * <li>{@link #VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_NVX ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_NVX}</li>
     * </ul>
     */
    public static final int
        VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_NVX  = 0x200000,
        VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_NVX = 0x400000;

    /** Extends {@code VkQueryType}. */
    public static final int VK_QUERY_TYPE_COMPACTED_SIZE_NVX = 1000165000;

    /** Extends {@code VkPipelineCreateFlagBits}. */
    public static final int VK_PIPELINE_CREATE_DEFER_COMPILE_BIT_NVX = 0x20;

    /** Extends {@code VkObjectType}. */
    public static final int VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_NVX = 1000165000;

    /** Extends {@code VkDebugReportObjectTypeEXT}. */
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_ACCELERATION_STRUCTURE_NVX_EXT = 1000165000;

    /**
     * VkGeometryTypeNVX - Enum specifying which type of geometry is provided
     * 
     * <h5>Description</h5>
     * 
     * <pre><code>
     * typedef enum VkGeometryTypeNVX {
     *     VK_GEOMETRY_TYPE_TRIANGLES_NVX = 0,
     *     VK_GEOMETRY_TYPE_AABBS_NVX = 1,
     * } VkGeometryTypeNVX;</code></pre>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkGeometryNVX}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_GEOMETRY_TYPE_TRIANGLES_NVX GEOMETRY_TYPE_TRIANGLES_NVX}</li>
     * <li>{@link #VK_GEOMETRY_TYPE_AABBS_NVX GEOMETRY_TYPE_AABBS_NVX}</li>
     * </ul>
     */
    public static final int
        VK_GEOMETRY_TYPE_TRIANGLES_NVX = 0,
        VK_GEOMETRY_TYPE_AABBS_NVX     = 1;

    /**
     * VkGeometryFlagBitsNVX - Bitmask specifying additional parameters for a geometry
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkGeometryFlagsNVX}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_GEOMETRY_OPAQUE_BIT_NVX GEOMETRY_OPAQUE_BIT_NVX}</li>
     * <li>{@link #VK_GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_NVX GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_NVX}</li>
     * </ul>
     */
    public static final int
        VK_GEOMETRY_OPAQUE_BIT_NVX                          = 0x1,
        VK_GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_NVX = 0x2;

    /**
     * VkGeometryInstanceFlagBitsNVX
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_GEOMETRY_INSTANCE_TRIANGLE_CULL_DISABLE_BIT_NVX GEOMETRY_INSTANCE_TRIANGLE_CULL_DISABLE_BIT_NVX}</li>
     * <li>{@link #VK_GEOMETRY_INSTANCE_TRIANGLE_CULL_FLIP_WINDING_BIT_NVX GEOMETRY_INSTANCE_TRIANGLE_CULL_FLIP_WINDING_BIT_NVX}</li>
     * <li>{@link #VK_GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_NVX GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_NVX}</li>
     * <li>{@link #VK_GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_NVX GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_NVX}</li>
     * </ul>
     */
    public static final int
        VK_GEOMETRY_INSTANCE_TRIANGLE_CULL_DISABLE_BIT_NVX      = 0x1,
        VK_GEOMETRY_INSTANCE_TRIANGLE_CULL_FLIP_WINDING_BIT_NVX = 0x2,
        VK_GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_NVX               = 0x4,
        VK_GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_NVX            = 0x8;

    /**
     * VkAccelerationStructureTypeNVX
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_NVX ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_NVX}</li>
     * <li>{@link #VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_NVX ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_NVX}</li>
     * </ul>
     */
    public static final int
        VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_NVX    = 0,
        VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_NVX = 1;

    /**
     * VkBuildAccelerationStructureFlagBitsNVX - Bitmask specifying additional parameters for acceleration structure builds
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkBuildAccelerationStructureFlagsNVX}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_NVX BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_NVX}</li>
     * <li>{@link #VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_NVX BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_NVX}</li>
     * <li>{@link #VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_NVX BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_NVX}</li>
     * <li>{@link #VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_NVX BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_NVX}</li>
     * <li>{@link #VK_BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_NVX BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_NVX}</li>
     * </ul>
     */
    public static final int
        VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_NVX      = 0x1,
        VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_NVX  = 0x2,
        VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_NVX = 0x4,
        VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_NVX = 0x8,
        VK_BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_NVX        = 0x10;

    /**
     * VkCopyAccelerationStructureModeNVX - Acceleration structure copy mode
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_COPY_ACCELERATION_STRUCTURE_MODE_CLONE_NVX COPY_ACCELERATION_STRUCTURE_MODE_CLONE_NVX} creates a direct copy of the acceleration structure specified in {@code src} into the one specified by {@code dst}. The {@code dst} acceleration structure <b>must</b> have been created with the same parameters as {@code src}.</li>
     * <li>{@link #VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_NVX COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_NVX} creates a more compact version of an acceleration structure {@code src} into {@code dst}. The acceleration structure {@code dst} <b>must</b> have been created with a {@code compactedSize} corresponding to the one returned by {@code vkCmdWriteAccelerationStructurePropertiesNVX} after the build of the acceleration structure specified by {@code src}.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #vkCmdCopyAccelerationStructureNVX CmdCopyAccelerationStructureNVX}</p>
     */
    public static final int
        VK_COPY_ACCELERATION_STRUCTURE_MODE_CLONE_NVX   = 0,
        VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_NVX = 1;

    protected NVXRaytracing() {
        throw new UnsupportedOperationException();
    }

    static boolean checkCapsDevice(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_NVX_raytracing") && VK.checkExtension("VK_NVX_raytracing",
               VK.isSupported(provider, "vkCreateAccelerationStructureNVX", caps)
            && VK.isSupported(provider, "vkDestroyAccelerationStructureNVX", caps)
            && VK.isSupported(provider, "vkGetAccelerationStructureMemoryRequirementsNVX", caps)
            && VK.isSupported(provider, "vkGetAccelerationStructureScratchMemoryRequirementsNVX", caps)
            && VK.isSupported(provider, "vkBindAccelerationStructureMemoryNVX", caps)
            && VK.isSupported(provider, "vkCmdBuildAccelerationStructureNVX", caps)
            && VK.isSupported(provider, "vkCmdCopyAccelerationStructureNVX", caps)
            && VK.isSupported(provider, "vkCmdTraceRaysNVX", caps)
            && VK.isSupported(provider, "vkCreateRaytracingPipelinesNVX", caps)
            && VK.isSupported(provider, "vkGetRaytracingShaderHandlesNVX", caps)
            && VK.isSupported(provider, "vkGetAccelerationStructureHandleNVX", caps)
            && VK.isSupported(provider, "vkCmdWriteAccelerationStructurePropertiesNVX", caps)
            && VK.isSupported(provider, "vkCompileDeferredNVX", caps)
        );
    }

    // --- [ vkCreateAccelerationStructureNVX ] ---

    /** Unsafe version of: {@link #vkCreateAccelerationStructureNVX CreateAccelerationStructureNVX} */
    public static int nvkCreateAccelerationStructureNVX(VkDevice device, long pCreateInfo, long pAllocator, long pAccelerationStructure) {
        long __functionAddress = device.getCapabilities().vkCreateAccelerationStructureNVX;
        if (CHECKS) {
            check(__functionAddress);
            VkAccelerationStructureCreateInfoNVX.validate(pCreateInfo);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pAccelerationStructure);
    }

    /**
     * Create a new acceleration structure object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create acceleration structures, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreateAccelerationStructureNVX(
     *     VkDevice                                    device,
     *     const VkAccelerationStructureCreateInfoNVX* pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkAccelerationStructureNVX*                 pAccelerationStructure);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkAccelerationStructureCreateInfoNVX} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pAccelerationStructure} <b>must</b> be a valid pointer to a {@code VkAccelerationStructureNVX} handle</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAccelerationStructureCreateInfoNVX}, {@link VkAllocationCallbacks}</p>
     *
     * @param device                 the logical device that creates the buffer object.
     * @param pCreateInfo            a pointer to an instance of the {@link VkAccelerationStructureCreateInfoNVX} structure containing parameters affecting creation of the acceleration structure.
     * @param pAllocator             controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pAccelerationStructure points to a {@code VkAccelerationStructureNVX} handle in which the resulting acceleration structure object is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateAccelerationStructureNVX(VkDevice device, @NativeType("VkAccelerationStructureCreateInfoNVX const *") VkAccelerationStructureCreateInfoNVX pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkAccelerationStructureNVX *") LongBuffer pAccelerationStructure) {
        if (CHECKS) {
            check(pAccelerationStructure, 1);
        }
        return nvkCreateAccelerationStructureNVX(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pAccelerationStructure));
    }

    // --- [ vkDestroyAccelerationStructureNVX ] ---

    /** Unsafe version of: {@link #vkDestroyAccelerationStructureNVX DestroyAccelerationStructureNVX} */
    public static void nvkDestroyAccelerationStructureNVX(VkDevice device, long accelerationStructure, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyAccelerationStructureNVX;
        if (CHECKS) {
            check(__functionAddress);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        callPJPV(__functionAddress, device.address(), accelerationStructure, pAllocator);
    }

    /**
     * Destroy an acceleration structure object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To destroy an acceleration structure, call:</p>
     * 
     * <pre><code>
     * void vkDestroyAccelerationStructureNVX(
     *     VkDevice                                    device,
     *     VkAccelerationStructureNVX                  accelerationStructure,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code accelerationStructure} <b>must</b> be a valid {@code VkAccelerationStructureNVX} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code accelerationStructure} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param device                the logical device that destroys the buffer.
     * @param accelerationStructure the acceleration structure to destroy.
     * @param pAllocator            controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroyAccelerationStructureNVX(VkDevice device, @NativeType("VkAccelerationStructureNVX") long accelerationStructure, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyAccelerationStructureNVX(device, accelerationStructure, memAddressSafe(pAllocator));
    }

    // --- [ vkGetAccelerationStructureMemoryRequirementsNVX ] ---

    /** Unsafe version of: {@link #vkGetAccelerationStructureMemoryRequirementsNVX GetAccelerationStructureMemoryRequirementsNVX} */
    public static void nvkGetAccelerationStructureMemoryRequirementsNVX(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetAccelerationStructureMemoryRequirementsNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, device.address(), pInfo, pMemoryRequirements);
    }

    /**
     * Get acceleration structure memory requirements.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>An acceleration structure has both its own memory use and the scratch memory use required when building it.</p>
     * 
     * <p>To query the basic memory requirements call:</p>
     * 
     * <pre><code>
     * void vkGetAccelerationStructureMemoryRequirementsNVX(
     *     VkDevice                                    device,
     *     const VkAccelerationStructureMemoryRequirementsInfoNVX* pInfo,
     *     VkMemoryRequirements2KHR*                   pMemoryRequirements);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkAccelerationStructureMemoryRequirementsInfoNVX} structure</li>
     * <li>{@code pMemoryRequirements} <b>must</b> be a valid pointer to a {@link VkMemoryRequirements2KHR} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAccelerationStructureMemoryRequirementsInfoNVX}, {@link VkMemoryRequirements2KHR}</p>
     *
     * @param device              the logical device on which the acceleration structure was created.
     * @param pInfo               specifies the acceleration structure to get memory requirements for.
     * @param pMemoryRequirements returns the memory requirements.
     */
    public static void vkGetAccelerationStructureMemoryRequirementsNVX(VkDevice device, @NativeType("VkAccelerationStructureMemoryRequirementsInfoNVX const *") VkAccelerationStructureMemoryRequirementsInfoNVX pInfo, @NativeType("VkMemoryRequirements2KHR *") VkMemoryRequirements2KHR pMemoryRequirements) {
        nvkGetAccelerationStructureMemoryRequirementsNVX(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkGetAccelerationStructureScratchMemoryRequirementsNVX ] ---

    /** Unsafe version of: {@link #vkGetAccelerationStructureScratchMemoryRequirementsNVX GetAccelerationStructureScratchMemoryRequirementsNVX} */
    public static void nvkGetAccelerationStructureScratchMemoryRequirementsNVX(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetAccelerationStructureScratchMemoryRequirementsNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, device.address(), pInfo, pMemoryRequirements);
    }

    /**
     * Get acceleration structure scratch memory requirements.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the scratch memory requirements call:</p>
     * 
     * <pre><code>
     * void vkGetAccelerationStructureScratchMemoryRequirementsNVX(
     *     VkDevice                                    device,
     *     const VkAccelerationStructureMemoryRequirementsInfoNVX* pInfo,
     *     VkMemoryRequirements2KHR*                   pMemoryRequirements);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkAccelerationStructureMemoryRequirementsInfoNVX} structure</li>
     * <li>{@code pMemoryRequirements} <b>must</b> be a valid pointer to a {@link VkMemoryRequirements2KHR} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAccelerationStructureMemoryRequirementsInfoNVX}, {@link VkMemoryRequirements2KHR}</p>
     *
     * @param device              the logical device on which the acceleration structure was created.
     * @param pInfo               specifies the acceleration structure to get scratch memory requirements for.
     * @param pMemoryRequirements returns the memory requirements.
     */
    public static void vkGetAccelerationStructureScratchMemoryRequirementsNVX(VkDevice device, @NativeType("VkAccelerationStructureMemoryRequirementsInfoNVX const *") VkAccelerationStructureMemoryRequirementsInfoNVX pInfo, @NativeType("VkMemoryRequirements2KHR *") VkMemoryRequirements2KHR pMemoryRequirements) {
        nvkGetAccelerationStructureScratchMemoryRequirementsNVX(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkBindAccelerationStructureMemoryNVX ] ---

    /**
     * Unsafe version of: {@link #vkBindAccelerationStructureMemoryNVX BindAccelerationStructureMemoryNVX}
     *
     * @param bindInfoCount the number of elements in pBindInfos.
     */
    public static int nvkBindAccelerationStructureMemoryNVX(VkDevice device, int bindInfoCount, long pBindInfos) {
        long __functionAddress = device.getCapabilities().vkBindAccelerationStructureMemoryNVX;
        if (CHECKS) {
            check(__functionAddress);
            VkBindAccelerationStructureMemoryInfoNVX.validate(pBindInfos, bindInfoCount);
        }
        return callPPI(__functionAddress, device.address(), bindInfoCount, pBindInfos);
    }

    /**
     * Bind acceleration structure memory.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To attach memory to one or more acceleration structures at a time, call:</p>
     * 
     * <pre><code>
     * VkResult vkBindAccelerationStructureMemoryNVX(
     *     VkDevice                                    device,
     *     uint32_t                                    bindInfoCount,
     *     const VkBindAccelerationStructureMemoryInfoNVX* pBindInfos);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pBindInfos} <b>must</b> be a valid pointer to an array of {@code bindInfoCount} valid {@link VkBindAccelerationStructureMemoryInfoNVX} structures</li>
     * <li>{@code bindInfoCount} <b>must</b> be greater than 0</li>
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
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkBindAccelerationStructureMemoryInfoNVX}</p>
     *
     * @param device     the logical device that owns the acceleration structures and memory.
     * @param pBindInfos a pointer to an array of structures of type {@link VkBindAccelerationStructureMemoryInfoNVX}, describing images and memory to bind.
     */
    @NativeType("VkResult")
    public static int vkBindAccelerationStructureMemoryNVX(VkDevice device, @NativeType("VkBindAccelerationStructureMemoryInfoNVX const *") VkBindAccelerationStructureMemoryInfoNVX.Buffer pBindInfos) {
        return nvkBindAccelerationStructureMemoryNVX(device, pBindInfos.remaining(), pBindInfos.address());
    }

    // --- [ vkCmdBuildAccelerationStructureNVX ] ---

    /**
     * Unsafe version of: {@link #vkCmdBuildAccelerationStructureNVX CmdBuildAccelerationStructureNVX}
     *
     * @param geometryCount the number of geometries in the acceleration structure. This parameter <b>must</b> be 0 for top level acceleration structures.
     */
    public static void nvkCmdBuildAccelerationStructureNVX(VkCommandBuffer commandBuffer, int type, int instanceCount, long instanceData, long instanceOffset, int geometryCount, long pGeometries, int flags, int update, long dst, long src, long scratch, long scratchOffset) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBuildAccelerationStructureNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJPJJJJV(__functionAddress, commandBuffer.address(), type, instanceCount, instanceData, instanceOffset, geometryCount, pGeometries, flags, update, dst, src, scratch, scratchOffset);
    }

    /**
     * Build an acceleration structure.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To build an acceleration structure call:</p>
     * 
     * <pre><code>
     * void vkCmdBuildAccelerationStructureNVX(
     *     VkCommandBuffer                             commandBuffer,
     *     VkAccelerationStructureTypeNVX              type,
     *     uint32_t                                    instanceCount,
     *     VkBuffer                                    instanceData,
     *     VkDeviceSize                                instanceOffset,
     *     uint32_t                                    geometryCount,
     *     const VkGeometryNVX*                        pGeometries,
     *     VkBuildAccelerationStructureFlagsNVX        flags,
     *     VkBool32                                    update,
     *     VkAccelerationStructureNVX                  dst,
     *     VkAccelerationStructureNVX                  src,
     *     VkBuffer                                    scratch,
     *     VkDeviceSize                                scratchOffset);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code geometryCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceRaytracingPropertiesNVX}{@code ::maxGeometryCount}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code type} <b>must</b> be a valid {@code VkAccelerationStructureTypeNVX} value</li>
     * <li>If {@code instanceData} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code instanceData} <b>must</b> be a valid {@code VkBuffer} handle</li>
     * <li>If {@code geometryCount} is not 0, {@code pGeometries} <b>must</b> be a valid pointer to an array of {@code geometryCount} valid {@link VkGeometryNVX} structures</li>
     * <li>{@code flags} <b>must</b> be a valid combination of {@code VkBuildAccelerationStructureFlagBitsNVX} values</li>
     * <li>{@code dst} <b>must</b> be a valid {@code VkAccelerationStructureNVX} handle</li>
     * <li>If {@code src} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code src} <b>must</b> be a valid {@code VkAccelerationStructureNVX} handle</li>
     * <li>{@code scratch} <b>must</b> be a valid {@code VkBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>Each of {@code commandBuffer}, {@code dst}, {@code instanceData}, {@code scratch}, and {@code src} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td><td></td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkGeometryNVX}</p>
     *
     * @param type           the type of acceleration structure that is being built
     * @param instanceCount  the number of instances in the acceleration structure. This parameter <b>must</b> be 0 for bottom level acceleration structures.
     * @param instanceData   the buffer containing instance data that will be used to build the acceleration structure. This parameter <b>must</b> be NULL for bottom level acceleration structures.
     * @param instanceOffset the offset (relative to the start of {@code instanceData}) at which the instance data is located.
     * @param pGeometries    a pointer to an array of geometries used by bottom level acceleration structures. This parameter <b>must</b> be NULL for top level acceleration structures.
     * @param flags          a {@code vkBuildAccelerationStructureFlagBitsNVX} value that specifies additional parameters for the acceleration structure build.
     * @param update         specifies whether to update the {@code dst} acceleration structure with the data in {@code src}.
     * @param dst            points to the target acceleration structure for the build.
     * @param src            points to an existing acceleration structure that can be used to update the {@code dst} acceleration structure.
     * @param scratch        the {@code VkBuffer} that will be used as scratch memory for the build.
     * @param scratchOffset  the offset relative to the start of {@code scratch} that will be used as scratch memory
     */
    public static void vkCmdBuildAccelerationStructureNVX(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureTypeNVX") int type, @NativeType("uint32_t") int instanceCount, @NativeType("VkBuffer") long instanceData, @NativeType("VkDeviceSize") long instanceOffset, @Nullable @NativeType("VkGeometryNVX const *") VkGeometryNVX.Buffer pGeometries, @NativeType("VkBuildAccelerationStructureFlagsNVX") int flags, @NativeType("VkBool32") boolean update, @NativeType("VkAccelerationStructureNVX") long dst, @NativeType("VkAccelerationStructureNVX") long src, @NativeType("VkBuffer") long scratch, @NativeType("VkDeviceSize") long scratchOffset) {
        nvkCmdBuildAccelerationStructureNVX(commandBuffer, type, instanceCount, instanceData, instanceOffset, remainingSafe(pGeometries), memAddressSafe(pGeometries), flags, update ? 1 : 0, dst, src, scratch, scratchOffset);
    }

    // --- [ vkCmdCopyAccelerationStructureNVX ] ---

    /**
     * Copy an acceleration structure.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy an acceleration structure call:</p>
     * 
     * <pre><code>
     * void vkCmdCopyAccelerationStructureNVX(
     *     VkCommandBuffer                             commandBuffer,
     *     VkAccelerationStructureNVX                  dst,
     *     VkAccelerationStructureNVX                  src,
     *     VkCopyAccelerationStructureModeNVX          mode);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code dst} <b>must</b> be a valid {@code VkAccelerationStructureNVX} handle</li>
     * <li>{@code src} <b>must</b> be a valid {@code VkAccelerationStructureNVX} handle</li>
     * <li>{@code mode} <b>must</b> be a valid {@code VkCopyAccelerationStructureModeNVX} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>Each of {@code commandBuffer}, {@code dst}, and {@code src} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td><td></td></tr></tbody>
     * </table>
     *
     * @param dst  points to the target acceleration structure for the build
     * @param src  points to an existing acceleration structure that can be used to update the {@code dst} acceleration structure
     * @param mode a {@code VkCopyAccelerationStructureModeNVX} value that specifies additional operations to perform during the copy.
     */
    public static void vkCmdCopyAccelerationStructureNVX(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureNVX") long dst, @NativeType("VkAccelerationStructureNVX") long src, @NativeType("VkCopyAccelerationStructureModeNVX") int mode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyAccelerationStructureNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJV(__functionAddress, commandBuffer.address(), dst, src, mode);
    }

    // --- [ vkCmdTraceRaysNVX ] ---

    /**
     * Initialize a raytracing dispatch.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To dispatch a raytracing call use:</p>
     * 
     * <pre><code>
     * void vkCmdTraceRaysNVX(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBuffer                                    raygenShaderBindingTableBuffer,
     *     VkDeviceSize                                raygenShaderBindingOffset,
     *     VkBuffer                                    missShaderBindingTableBuffer,
     *     VkDeviceSize                                missShaderBindingOffset,
     *     VkDeviceSize                                missShaderBindingStride,
     *     VkBuffer                                    hitShaderBindingTableBuffer,
     *     VkDeviceSize                                hitShaderBindingOffset,
     *     VkDeviceSize                                hitShaderBindingStride,
     *     uint32_t                                    width,
     *     uint32_t                                    height);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>When the command is executed, a ray query of <code>width × height</code> rays is assembled.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code raygenShaderBindingTableBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
     * <li>{@code missShaderBindingTableBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
     * <li>{@code hitShaderBindingTableBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>Each of {@code commandBuffer}, {@code hitShaderBindingTableBuffer}, {@code missShaderBindingTableBuffer}, and {@code raygenShaderBindingTableBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td><td></td></tr></tbody>
     * </table>
     *
     * @param raygenShaderBindingTableBuffer the buffer object that holds the shader binding table data for the ray generation shader stage.
     * @param raygenShaderBindingOffset      the offset (relative to {@code raygenShaderBindingTableBuffer}) of the ray generation shader being used for the trace.
     * @param missShaderBindingTableBuffer   the buffer object that holds the shader binding table data for the miss shader stage.
     * @param missShaderBindingOffset        the offset (relative to {@code missShaderBindingTableBuffer}) of the miss shader being used for the trace.
     * @param missShaderBindingStride        the size of each shader binding table record in {@code missShaderBindingTableBuffer}
     * @param hitShaderBindingTableBuffer    the buffer object that holds the shader binding table data for the hit shader stages.
     * @param hitShaderBindingOffset         the offset (relative to {@code hitShaderBindingTableBuffer}) of the hit shader group being used for the trace.
     * @param hitShaderBindingStride         the size of each shader binding table record in {@code hitShaderBindingTableBuffer}
     * @param width                          the width of the ray trace query dimensions.
     * @param height                         height of the ray trace query dimensions.
     */
    public static void vkCmdTraceRaysNVX(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long raygenShaderBindingTableBuffer, @NativeType("VkDeviceSize") long raygenShaderBindingOffset, @NativeType("VkBuffer") long missShaderBindingTableBuffer, @NativeType("VkDeviceSize") long missShaderBindingOffset, @NativeType("VkDeviceSize") long missShaderBindingStride, @NativeType("VkBuffer") long hitShaderBindingTableBuffer, @NativeType("VkDeviceSize") long hitShaderBindingOffset, @NativeType("VkDeviceSize") long hitShaderBindingStride, @NativeType("uint32_t") int width, @NativeType("uint32_t") int height) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdTraceRaysNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJJJJJJJV(__functionAddress, commandBuffer.address(), raygenShaderBindingTableBuffer, raygenShaderBindingOffset, missShaderBindingTableBuffer, missShaderBindingOffset, missShaderBindingStride, hitShaderBindingTableBuffer, hitShaderBindingOffset, hitShaderBindingStride, width, height);
    }

    // --- [ vkCreateRaytracingPipelinesNVX ] ---

    /**
     * Unsafe version of: {@link #vkCreateRaytracingPipelinesNVX CreateRaytracingPipelinesNVX}
     *
     * @param createInfoCount the length of the {@code pCreateInfos} and {@code pPipelines} arrays.
     */
    public static int nvkCreateRaytracingPipelinesNVX(VkDevice device, long pipelineCache, int createInfoCount, long pCreateInfos, long pAllocator, long pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateRaytracingPipelinesNVX;
        if (CHECKS) {
            check(__functionAddress);
            VkRaytracingPipelineCreateInfoNVX.validate(pCreateInfos, createInfoCount);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        return callPJPPPI(__functionAddress, device.address(), pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines);
    }

    /**
     * Creates a new raytracing pipeline object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create raytracing pipelines, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreateRaytracingPipelinesNVX(
     *     VkDevice                                    device,
     *     VkPipelineCache                             pipelineCache,
     *     uint32_t                                    createInfoCount,
     *     const VkRaytracingPipelineCreateInfoNVX*    pCreateInfos,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkPipeline*                                 pPipelines);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>If {@code pipelineCache} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code pipelineCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
     * <li>{@code pCreateInfos} <b>must</b> be a valid pointer to an array of {@code createInfoCount} valid {@link VkRaytracingPipelineCreateInfoNVX} structures</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pPipelines} <b>must</b> be a valid pointer to an array of {@code createInfoCount} {@code VkPipeline} handles</li>
     * <li>{@code createInfoCount} <b>must</b> be greater than 0</li>
     * <li>If {@code pipelineCache} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link NVGLSLShader#VK_ERROR_INVALID_SHADER_NV ERROR_INVALID_SHADER_NV}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkRaytracingPipelineCreateInfoNVX}</p>
     *
     * @param device        the logical device that creates the raytracing pipelines.
     * @param pipelineCache either {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, indicating that pipeline caching is disabled; or the handle of a valid <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#pipelines-cache">pipeline cache</a> object, in which case use of that cache is enabled for the duration of the command.
     * @param pCreateInfos  an array of {@link VkRaytracingPipelineCreateInfoNVX} structures.
     * @param pAllocator    controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pPipelines    a pointer to an array in which the resulting compute pipeline objects are returned.
     */
    @NativeType("VkResult")
    public static int vkCreateRaytracingPipelinesNVX(VkDevice device, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkRaytracingPipelineCreateInfoNVX const *") VkRaytracingPipelineCreateInfoNVX.Buffer pCreateInfos, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") LongBuffer pPipelines) {
        if (CHECKS) {
            check(pPipelines, pCreateInfos.remaining());
        }
        return nvkCreateRaytracingPipelinesNVX(device, pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), memAddress(pPipelines));
    }

    // --- [ vkGetRaytracingShaderHandlesNVX ] ---

    /**
     * Unsafe version of: {@link #vkGetRaytracingShaderHandlesNVX GetRaytracingShaderHandlesNVX}
     *
     * @param dataSize the size in bytes of the buffer pointed to by pData.
     */
    public static int nvkGetRaytracingShaderHandlesNVX(VkDevice device, long pipeline, int firstGroup, int groupCount, long dataSize, long pData) {
        long __functionAddress = device.getCapabilities().vkGetRaytracingShaderHandlesNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(__functionAddress, device.address(), pipeline, firstGroup, groupCount, dataSize, pData);
    }

    /**
     * Query raytracing pipeline shader handles.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the opaque handles of shaders in the raytracing pipeline, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetRaytracingShaderHandlesNVX(
     *     VkDevice                                    device,
     *     VkPipeline                                  pipeline,
     *     uint32_t                                    firstGroup,
     *     uint32_t                                    groupCount,
     *     size_t                                      dataSize,
     *     void*                                       pData);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
     * <li>{@code pData} <b>must</b> be a valid pointer to an array of {@code dataSize} bytes</li>
     * <li>{@code dataSize} <b>must</b> be greater than 0</li>
     * <li>{@code pipeline} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     *
     * @param device   the logical device that contains the raytracing pipeline.
     * @param pipeline the raytracing pipeline object that contains the shaders.
     * @param pData    a pointer to a user-allocated buffer where the results will be written.
     */
    @NativeType("VkResult")
    public static int vkGetRaytracingShaderHandlesNVX(VkDevice device, @NativeType("VkPipeline") long pipeline, @NativeType("uint32_t") int firstGroup, @NativeType("uint32_t") int groupCount, @NativeType("void *") ByteBuffer pData) {
        return nvkGetRaytracingShaderHandlesNVX(device, pipeline, firstGroup, groupCount, pData.remaining(), memAddress(pData));
    }

    // --- [ vkGetAccelerationStructureHandleNVX ] ---

    /**
     * Unsafe version of: {@link #vkGetAccelerationStructureHandleNVX GetAccelerationStructureHandleNVX}
     *
     * @param dataSize the size in bytes of the buffer pointed to by {@code pData}.
     */
    public static int nvkGetAccelerationStructureHandleNVX(VkDevice device, long accelerationStructure, long dataSize, long pData) {
        long __functionAddress = device.getCapabilities().vkGetAccelerationStructureHandleNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(__functionAddress, device.address(), accelerationStructure, dataSize, pData);
    }

    /**
     * Get opaque acceleration structure handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To allow constructing geometry instances with device code if desired, we need to be able to query a opaque handle for an acceleration structure. This handle is a value of 8 bytes. To get this handle, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetAccelerationStructureHandleNVX(
     *     VkDevice                                    device,
     *     VkAccelerationStructureNVX                  accelerationStructure,
     *     size_t                                      dataSize,
     *     void*                                       pData);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code dataSize} <b>must</b> be large enough to contain the result of the query, as described above</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code accelerationStructure} <b>must</b> be a valid {@code VkAccelerationStructureNVX} handle</li>
     * <li>{@code pData} <b>must</b> be a valid pointer to an array of {@code dataSize} bytes</li>
     * <li>{@code dataSize} <b>must</b> be greater than 0</li>
     * <li>{@code accelerationStructure} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     *
     * @param device                the logical device that owns the acceleration structures.
     * @param accelerationStructure the acceleration structur.
     * @param pData                 a pointer to a user-allocated buffer where the results will be written
     */
    @NativeType("VkResult")
    public static int vkGetAccelerationStructureHandleNVX(VkDevice device, @NativeType("VkAccelerationStructureNVX") long accelerationStructure, @NativeType("void *") ByteBuffer pData) {
        return nvkGetAccelerationStructureHandleNVX(device, accelerationStructure, pData.remaining(), memAddress(pData));
    }

    // --- [ vkCmdWriteAccelerationStructurePropertiesNVX ] ---

    /**
     * Write acceleration structure result parameters to query results.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query acceleration structure size parameters call:</p>
     * 
     * <pre><code>
     * void vkCmdWriteAccelerationStructurePropertiesNVX(
     *     VkCommandBuffer                             commandBuffer,
     *     VkAccelerationStructureNVX                  accelerationStructure,
     *     VkQueryType                                 queryType,
     *     VkQueryPool                                 queryPool,
     *     uint32_t                                    query);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code queryType} <b>must</b> be VK_QUERY_TYPE_COMPACTED_SIZE_NVX</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code accelerationStructure} <b>must</b> be a valid {@code VkAccelerationStructureNVX} handle</li>
     * <li>{@code queryType} <b>must</b> be a valid {@code VkQueryType} value</li>
     * <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>Each of {@code accelerationStructure}, {@code commandBuffer}, and {@code queryPool} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td><td></td></tr></tbody>
     * </table>
     *
     * @param accelerationStructure points to an existing acceleration structure which has been built.
     * @param queryType             a {@code VkQueryType} value specifying the type of queries managed by the pool.
     * @param queryPool             the query pool that will manage the results of the query.
     * @param query                 the query index within the query pool that will contain the results.
     */
    public static void vkCmdWriteAccelerationStructurePropertiesNVX(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureNVX") long accelerationStructure, @NativeType("VkQueryType") int queryType, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int query) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteAccelerationStructurePropertiesNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJV(__functionAddress, commandBuffer.address(), accelerationStructure, queryType, queryPool, query);
    }

    // --- [ vkCompileDeferredNVX ] ---

    /**
     * Deferred compilation of shaders.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To compile a deferred shader in a pipeline call:</p>
     * 
     * <pre><code>
     * VkResult vkCompileDeferredNVX(
     *     VkDevice                                    device,
     *     VkPipeline                                  pipeline,
     *     uint32_t                                    shader);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code pipeline} <b>must</b> have been created with VK_PIPELINE_CREATE_DEFER_COMPILE_BIT_NVX.</li>
     * <li>{@code shader} <b>must</b> not have been called as a deferred compile before.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
     * <li>{@code pipeline} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     *
     * @param device   the logical device that contains the raytracing pipeline.
     * @param pipeline the raytracing pipeline object that contains the shaders.
     * @param shader   the index of the shader to compile.
     */
    @NativeType("VkResult")
    public static int vkCompileDeferredNVX(VkDevice device, @NativeType("VkPipeline") long pipeline, @NativeType("uint32_t") int shader) {
        long __functionAddress = device.getCapabilities().vkCompileDeferredNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(__functionAddress, device.address(), pipeline, shader);
    }

    /** Array version of: {@link #vkCreateAccelerationStructureNVX CreateAccelerationStructureNVX} */
    @NativeType("VkResult")
    public static int vkCreateAccelerationStructureNVX(VkDevice device, @NativeType("VkAccelerationStructureCreateInfoNVX const *") VkAccelerationStructureCreateInfoNVX pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkAccelerationStructureNVX *") long[] pAccelerationStructure) {
        long __functionAddress = device.getCapabilities().vkCreateAccelerationStructureNVX;
        if (CHECKS) {
            check(__functionAddress);
            check(pAccelerationStructure, 1);
            VkAccelerationStructureCreateInfoNVX.validate(pCreateInfo.address());
            if (pAllocator != null) { VkAllocationCallbacks.validate(pAllocator.address()); }
        }
        return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pAccelerationStructure);
    }

    /** Array version of: {@link #vkCreateRaytracingPipelinesNVX CreateRaytracingPipelinesNVX} */
    @NativeType("VkResult")
    public static int vkCreateRaytracingPipelinesNVX(VkDevice device, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkRaytracingPipelineCreateInfoNVX const *") VkRaytracingPipelineCreateInfoNVX.Buffer pCreateInfos, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") long[] pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateRaytracingPipelinesNVX;
        if (CHECKS) {
            check(__functionAddress);
            check(pPipelines, pCreateInfos.remaining());
            VkRaytracingPipelineCreateInfoNVX.validate(pCreateInfos.address(), pCreateInfos.remaining());
            if (pAllocator != null) { VkAllocationCallbacks.validate(pAllocator.address()); }
        }
        return callPJPPPI(__functionAddress, device.address(), pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), pPipelines);
    }

}