/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension adds a mechanism to provide feedback to an application about pipeline creation, with the specific goal of allowing a feedback loop between build systems and in-the-field application executions to ensure effective pipeline caches are shipped to customers.
 * 
 * <h5>Examples</h5>
 * 
 * <p>None.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_pipeline_creation_feedback}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>193</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jean-Francois Roy <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_EXT_pipeline_creation_feedback:%20&amp;body=@jfroy%20">jfroy</a></li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2019-03-12</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jean-Francois Roy, Google</li>
 * <li>Hai Nguyen, Google</li>
 * <li>Andrew Ellem, Google</li>
 * <li>Bob Fraser, Google</li>
 * <li>Sujeevan Rajayogam, Google</li>
 * <li>Jan-Harald Fredriksen, ARM</li>
 * <li>Jeff Leger, Qualcomm Technologies, Inc.</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Daniel Koch, NVIDIA</li>
 * <li>Neil Henning, AMD</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTPipelineCreationFeedback {

    /** The extension specification version. */
    public static final int VK_EXT_PIPELINE_CREATION_FEEDBACK_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_PIPELINE_CREATION_FEEDBACK_EXTENSION_NAME = "VK_EXT_pipeline_creation_feedback";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO_EXT = 1000192000;

    /**
     * VkPipelineCreationFeedbackFlagBitsEXT - Bitmask specifying pipeline or pipeline stage creation feedback
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_CREATION_FEEDBACK_VALID_BIT_EXT PIPELINE_CREATION_FEEDBACK_VALID_BIT_EXT} indicates that the feedback information is valid.</li>
     * <li>{@link #VK_PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT_EXT PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT_EXT} indicates that a readily usable pipeline or pipeline stage was found in the {@code pipelineCache} specified by the application in the pipeline creation command.
     * An implementation <b>should</b> set the {@link #VK_PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT_EXT PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT_EXT} bit if it was able to avoid the large majority of pipeline or pipeline stage creation work by using the {@code pipelineCache} parameter of {@link VK10#vkCreateGraphicsPipelines CreateGraphicsPipelines}, {@link NVRayTracing#vkCreateRayTracingPipelinesNV CreateRayTracingPipelinesNV}, or {@link VK10#vkCreateComputePipelines CreateComputePipelines}. When an implementation sets this bit for the entire pipeline, it <b>may</b> leave it unset for any stage.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Implementations are encouraged to provide a meaningful signal to applications using this bit. The intention is to communicate to the application that the pipeline or pipeline stage was created "as fast as it gets" using the pipeline cache provided by the application. If an implementation uses an internal cache, it is discouraged from setting this bit as the feedback would be unactionable.</p>
     * </div>
     * </li>
     * <li>{@link #VK_PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT_EXT PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT_EXT} indicates that the base pipeline specified by the {@code basePipelineHandle} or {@code basePipelineIndex} member of the stext:Vk*PipelineCreateInfo structure was used to accelerate the creation of the pipeline.
     * An implementation <b>should</b> set the {@link #VK_PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT_EXT PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT_EXT} bit if it was able to avoid a significant amount of work by using the base pipeline.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>While "significant amount of work" is subjective, implementations are encouraged to provide a meaningful signal to applications using this bit. For example, a 1% reduction in duration may not warrant setting this bit, while a 50% reduction would.</p>
     * </div>
     * </li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPipelineCreationFeedbackCreateInfoEXT}, {@link VkPipelineCreationFeedbackEXT}, {@code VkPipelineCreationFeedbackFlagsEXT}</p>
     */
    public static final int
        VK_PIPELINE_CREATION_FEEDBACK_VALID_BIT_EXT                          = 0x1,
        VK_PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT_EXT = 0x2,
        VK_PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT_EXT     = 0x4;

    private EXTPipelineCreationFeedback() {}

}