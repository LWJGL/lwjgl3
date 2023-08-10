/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Vulkan SC requires offline compilation of pipelines. In order to support this, the pipeline state is represented in a <a href="https://github.com/KhronosGroup/VulkanSC-Docs/wiki/JSON-schema">JSON schema</a> that is read by an offline tool for compilation.
 * 
 * <p>One method of developing a Vulkan SC application is to author a Vulkan application and use a layer to record and serialize the pipeline state and shaders for offline compilation. Each pipeline is represented by a separate JSON file, and can be identified with a {@code pipelineIdentifier}.</p>
 * 
 * <p>Once the pipelines have been compiled by the offline pipeline cache compiler, the Vulkan SC application can then use this {@code pipelineIdentifier} for identifying the pipeline via Vulkan SC’s {@code VkPipelineIdentifierInfo} structure.</p>
 * 
 * <p>This extension allows the Vulkan application to query the {@code pipelineIdentifier} associated with each pipeline so that the application can store this with its pipeline metadata and the Vulkan SC application will then use to map the same state to an entry in the Vulkan SC pipeline cache.</p>
 * 
 * <p>It is expected that this extension will initially be implemented in the json generation layer, although we can envision that there might be future uses for it in native Vulkan drivers as well.</p>
 * 
 * <h5>VK_EXT_pipeline_properties</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_pipeline_properties}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>373</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Mukund Keshava <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_pipeline_properties]%20@mkeshavanv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_pipeline_properties%20extension*">mkeshavanv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2022-04-19</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Mukund Keshava, NVIDIA</li>
 * <li>Daniel Koch, NVIDIA</li>
 * <li>Mark Bellamy, Arm</li>
 * </ul></dd>
 * </dl>
 */
public class EXTPipelineProperties {

    /** The extension specification version. */
    public static final int VK_EXT_PIPELINE_PROPERTIES_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_PIPELINE_PROPERTIES_EXTENSION_NAME = "VK_EXT_pipeline_properties";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_PROPERTIES_IDENTIFIER_EXT STRUCTURE_TYPE_PIPELINE_PROPERTIES_IDENTIFIER_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROPERTIES_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROPERTIES_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_INFO_EXT STRUCTURE_TYPE_PIPELINE_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PIPELINE_PROPERTIES_IDENTIFIER_EXT               = 1000372000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROPERTIES_FEATURES_EXT = 1000372001,
        VK_STRUCTURE_TYPE_PIPELINE_INFO_EXT                                = 1000372001;

    protected EXTPipelineProperties() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPipelinePropertiesEXT ] ---

    /** Unsafe version of: {@link #vkGetPipelinePropertiesEXT GetPipelinePropertiesEXT} */
    public static int nvkGetPipelinePropertiesEXT(VkDevice device, long pPipelineInfo, long pPipelineProperties) {
        long __functionAddress = device.getCapabilities().vkGetPipelinePropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pPipelineInfo, pPipelineProperties, __functionAddress);
    }

    /**
     * Query pipeline properties.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the pipeline properties call:</p>
     * 
     * <pre><code>
     * VkResult vkGetPipelinePropertiesEXT(
     *     VkDevice                                    device,
     *     const VkPipelineInfoEXT*                    pPipelineInfo,
     *     VkBaseOutStructure*                         pPipelineProperties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>To query a pipeline’s {@code pipelineIdentifier} pass a {@link VkPipelinePropertiesIdentifierEXT} structure in {@code pPipelineProperties}. Each pipeline is associated with a {@code pipelineIdentifier} and the identifier is implementation specific.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The {@code pipeline} member of {@code pPipelineInfo} must have been created with {@code device}</li>
     * <li>{@code pPipelineProperties} <b>must</b> be a valid pointer to a {@link VkPipelinePropertiesIdentifierEXT} structure</li>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-pipelinePropertiesIdentifier">{@code pipelinePropertiesIdentifier}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pPipelineInfo} <b>must</b> be a valid pointer to a valid {@link VkPipelineInfoEXT} structure</li>
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
     * <p>{@link VkBaseOutStructure}, {@link VkPipelineInfoEXT}</p>
     *
     * @param device              the logical device that created the pipeline.
     * @param pPipelineInfo       a pointer to a {@link VkPipelineInfoEXT} structure which describes the pipeline being queried.
     * @param pPipelineProperties a pointer to a {@link VkBaseOutStructure} structure in which the pipeline properties will be written.
     */
    @NativeType("VkResult")
    public static int vkGetPipelinePropertiesEXT(VkDevice device, @NativeType("VkPipelineInfoEXT const *") VkPipelineInfoEXT pPipelineInfo, @Nullable @NativeType("VkBaseOutStructure *") VkBaseOutStructure pPipelineProperties) {
        return nvkGetPipelinePropertiesEXT(device, pPipelineInfo.address(), memAddressSafe(pPipelineProperties));
    }

}