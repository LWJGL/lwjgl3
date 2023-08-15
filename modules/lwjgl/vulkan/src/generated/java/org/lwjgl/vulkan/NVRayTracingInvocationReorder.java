/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * The ray tracing pipeline API provides some ability to reorder for locality, but it is useful to have more control over how the reordering happens and what information is included in the reordering. The shader API provides a hit object to contain result information from the hit which can be used as part of the explicit sorting plus options that contain an integer for hint bits to use to add more locality.
 * 
 * <h5>HLSL Mapping</h5>
 * 
 * <p>HLSL does not provide this functionality natively yet.</p>
 * 
 * <p>However, it is possible to use this functionality via <a href="https://github.com/microsoft/DirectXShaderCompiler/wiki/GL_EXT_spirv_intrinsics-for-SPIR-V-code-gen">SPIR-V Intrinsics</a>.</p>
 * 
 * <p>The codes for shader invocation reorder are obtained from <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_shader_invocation_reorder.html">this page</a>:</p>
 * 
 * <pre><code>
 * #define ShaderInvocationReorderNV 5383
 * #define HitObjectAttributeNV 5385
 * 
 * #define OpHitObjectRecordHitMotionNV 5249
 * #define OpHitObjectRecordHitWithIndexMotionNV 5250
 * #define OpHitObjectRecordMissMotionNV 5251
 * #define OpHitObjectGetWorldToObjectNV 5252
 * #define OpHitObjectGetObjectToWorldNV 5253
 * #define OpHitObjectGetObjectRayDirectionNV 5254
 * #define OpHitObjectGetObjectRayOriginNV 5255
 * #define OpHitObjectTraceRayMotionNV 5256
 * #define OpHitObjectGetShaderRecordBufferHandleNV 5257
 * #define OpHitObjectGetShaderBindingTableRecordIndexNV 5258
 * #define OpHitObjectRecordEmptyNV 5259
 * #define OpHitObjectTraceRayNV 5260
 * #define OpHitObjectRecordHitNV 5261
 * #define OpHitObjectRecordHitWithIndexNV 5262
 * #define OpHitObjectRecordMissNV 5263
 * #define OpHitObjectExecuteShaderNV 5264
 * #define OpHitObjectGetCurrentTimeNV 5265
 * #define OpHitObjectGetAttributesNV 5266
 * #define OpHitObjectGetHitKindNV 5267
 * #define OpHitObjectGetPrimitiveIndexNV 5268
 * #define OpHitObjectGetGeometryIndexNV 5269
 * #define OpHitObjectGetInstanceIdNV 5270
 * #define OpHitObjectGetInstanceCustomIndexNV 5271
 * #define OpHitObjectGetWorldRayDirectionNV 5272
 * #define OpHitObjectGetWorldRayOriginNV 5273
 * #define OpHitObjectGetRayTMaxNV 5274
 * #define OpHitObjectGetRayTMinNV 5275
 * #define OpHitObjectIsEmptyNV 5276
 * #define OpHitObjectIsHitNV 5277
 * #define OpHitObjectIsMissNV 5278
 * #define OpReorderThreadWithHitObjectNV 5279
 * #define OpReorderThreadWithHintNV 5280
 * #define OpTypeHitObjectNV 5281</code></pre>
 * 
 * <p>The capability and extension need to be added:</p>
 * 
 * <pre><code>
 * [[vk::ext_capability(ShaderInvocationReorderNV)]]
 * [[vk::ext_extension("SPV_NV_shader_invocation_reorder")]]</code></pre>
 * 
 * <p>The creation of the {@code HitObject} type can be done like this:</p>
 * 
 * <pre><code>
 * [[vk::ext_type_def(HitObjectAttributeNV, OpTypeHitObjectNV)]]
 * void createHitObjectNV();
 * #define HitObjectNV vk::ext_type&lt;HitObjectAttributeNV&gt;</code></pre>
 * 
 * <p>The payload:</p>
 * 
 * <ul>
 * <li>must be global</li>
 * <li>needs the {@code RayPayloadKHR} attribute as an extra storage class</li>
 * </ul>
 * 
 * <pre><code>
 * struct [raypayload] HitPayload
 * {
 *   float hitT : write(closesthit, miss) : read(caller);
 *   int instanceIndex : write(closesthit) : read(caller);
 *   float3 pos : write(closesthit) : read(caller);
 *   float3 nrm : write(closesthit) : read(caller);
 * };
 * 
 * #define RayPayloadKHR 5338
 * [[vk::ext_storage_class(RayPayloadKHR)]] static HitPayload payload;</code></pre>
 * 
 * <p>Here is the declaration of a few invocation reordering functions:</p>
 * 
 * <pre><code>
 * [[vk::ext_instruction(OpHitObjectRecordEmptyNV)]]
 * void hitObjectRecordEmptyNV([[vk::ext_reference]] HitObjectNV hitObject);
 * 
 * [[vk::ext_instruction(OpHitObjectTraceRayNV)]]
 * void hitObjectTraceRayNV(
 *     [[vk::ext_reference]] HitObjectNV hitObject,
 *     RaytracingAccelerationStructure as,
 *     uint RayFlags,
 *     uint CullMask,
 *     uint SBTOffset,
 *     uint SBTStride,
 *     uint MissIndex,
 *     float3 RayOrigin,
 *     float RayTmin,
 *     float3 RayDirection,
 *     float RayTMax,
 *     [[vk::ext_reference]] [[vk::ext_storage_class(RayPayloadKHR)]] HitPayload payload
 *   );
 * 
 * [[vk::ext_instruction(OpReorderThreadWithHintNV)]]
 * void reorderThreadWithHintNV(int Hint, int Bits);
 * 
 * [[vk::ext_instruction(OpReorderThreadWithHitObjectNV)]]
 * void reorderThreadWithHitObjectNV([[vk::ext_reference]] HitObjectNV hitObject);
 * 
 * [[vk::ext_instruction(OpHitObjectExecuteShaderNV)]]
 * void hitObjectExecuteShaderNV([[vk::ext_reference]] HitObjectNV hitObject, [[vk::ext_reference]] [[vk::ext_storage_class(RayPayloadKHR)]] HitPayload payload);
 * 
 * [[vk::ext_instruction(OpHitObjectIsHitNV)]]
 * bool hitObjectIsHitNV([[vk::ext_reference]] HitObjectNV hitObject);</code></pre>
 * 
 * <p>Using the function in the code, can be done like this</p>
 * 
 * <pre><code>
 *   if (USE_SER == 1)
 *   {
 *     createHitObjectNV();
 *     HitObjectNV hObj; //  hitObjectNV hObj;
 *     hitObjectRecordEmptyNV(hObj); //Initialize to an empty hit object
 *     hitObjectTraceRayNV(hObj, topLevelAS, rayFlags, 0xFF, 0, 0, 0, r.Origin, 0.0, r.Direction, INFINITE, payload);
 *     reorderThreadWithHitObjectNV(hObj);
 *     hitObjectExecuteShaderNV(hObj, payload);
 *   }</code></pre>
 * 
 * <p>Note:</p>
 * 
 * <ul>
 * <li>createHitObjectNV() needs to be call at least once. This can be also done in the main entry of the shader.</li>
 * <li>Function with a payload parameter, needs to have the payload struct defined before. There are no templated declaration of the function.</li>
 * </ul>
 * 
 * <h5>VK_NV_ray_tracing_invocation_reorder</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_ray_tracing_invocation_reorder}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>491</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRRayTracingPipeline VK_KHR_ray_tracing_pipeline}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Eric Werness <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_ray_tracing_invocation_reorder]%20@ewerness-nv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_ray_tracing_invocation_reorder%20extension*">ewerness-nv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2022-11-02</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_shader_invocation_reorder.html">{@code SPV_NV_shader_invocation_reorder}</a></li>
 * <li>This extension provides API support for <a href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/nv/GLSL_NV_shader_invocation_reorder.txt">{@code GL_NV_shader_invocation_reorder}</a></li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Eric Werness, NVIDIA</li>
 * <li>Ashwin Lele, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public final class NVRayTracingInvocationReorder {

    /** The extension specification version. */
    public static final int VK_NV_RAY_TRACING_INVOCATION_REORDER_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NV_RAY_TRACING_INVOCATION_REORDER_EXTENSION_NAME = "VK_NV_ray_tracing_invocation_reorder";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_FEATURES_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_NV}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_FEATURES_NV   = 1000490000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_NV = 1000490001;

    /**
     * VkRayTracingInvocationReorderModeNV - Enum providing a hint on how the application <b>may</b> reorder
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_RAY_TRACING_INVOCATION_REORDER_MODE_NONE_NV RAY_TRACING_INVOCATION_REORDER_MODE_NONE_NV} indicates that the implementation is likely to not reorder at reorder calls.</li>
     * <li>{@link #VK_RAY_TRACING_INVOCATION_REORDER_MODE_REORDER_NV RAY_TRACING_INVOCATION_REORDER_MODE_REORDER_NV} indicates that the implementation is likely to reorder at reorder calls.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV}</p>
     */
    public static final int
        VK_RAY_TRACING_INVOCATION_REORDER_MODE_NONE_NV    = 0,
        VK_RAY_TRACING_INVOCATION_REORDER_MODE_REORDER_NV = 1;

    private NVRayTracingInvocationReorder() {}

}