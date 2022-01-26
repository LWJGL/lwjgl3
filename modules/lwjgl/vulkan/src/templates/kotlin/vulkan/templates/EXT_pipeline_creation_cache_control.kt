/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_pipeline_creation_cache_control = "EXTPipelineCreationCacheControl".nativeClassVK("EXT_pipeline_creation_cache_control", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension adds flags to stext:Vk*PipelineCreateInfo and ##VkPipelineCacheCreateInfo structures with the aim of improving the predictability of pipeline creation cost. The goal is to provide information about potentially expensive hazards within the client driver during pipeline creation to the application before carrying them out rather than after.

        <h5>Background</h5>
        Pipeline creation is a costly operation, and the explicit nature of the Vulkan design means that cost is not hidden from the developer. Applications are also expected to schedule, prioritize, and load balance all calls for pipeline creation. It is strongly advised that applications create pipelines sufficiently ahead of their usage. Failure to do so will result in an unresponsive application, intermittent stuttering, or other poor user experiences. Proper usage of pipeline caches and/or derivative pipelines help mitigate this but is not assured to eliminate disruption in all cases. In the event that an ahead-of-time creation is not possible, considerations should be taken to ensure that the current execution context is suitable for the workload of pipeline creation including possible shader compilation.

        Applications making API calls to create a pipeline must be prepared for any of the following to occur:

        <ul>
            <li>OS/kernel calls to be made by the ICD</li>
            <li>Internal memory allocation not tracked by the {@code pAllocator} passed to {@code vkCreate*Pipelines}</li>
            <li>Internal thread synchronization or yielding of the current thread’s core</li>
            <li>Extremely long (multi-millisecond+), blocking, compilation times</li>
            <li>Arbitrary call stacks depths and stack memory usage</li>
        </ul>

        The job or task based game engines that are being developed to take advantage of explicit graphics APIs like Vulkan may behave exceptionally poorly if any of the above scenarios occur. However, most game engines are already built to “{@code stream}” in assets dynamically as the user plays the game. By adding control by way of {@code VkPipelineCreateFlags}, we can require an ICD to report back a failure in critical execution paths rather than forcing an unexpected wait.

        Applications can prevent unexpected compilation by setting #PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_EXT on stext:Vk*PipelineCreateInfo{@code ::flags}. When set, an ICD must not attempt pipeline or shader compilation to create the pipeline object. The ICD will return the result #PIPELINE_COMPILE_REQUIRED_EXT. An ICD may still return a valid {@code VkPipeline} object by either re-using existing pre-compiled objects such as those from a pipeline cache, or derivative pipelines.

        By default {@code vkCreate*Pipelines} calls must attempt to create all pipelines before returning. Setting #PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT_EXT on stext:Vk*PipelineCreateInfo{@code ::flags} can be used as an escape hatch for batched pipeline creates.

        Hidden locks also add to the unpredictability of the cost of pipeline creation. The most common case of locks inside the stext:vkCreate*Pipelines is internal synchronization of the {@code VkPipelineCache} object. #PIPELINE_CACHE_CREATE_EXTERNALLY_SYNCHRONIZED_BIT_EXT can be set when calling #CreatePipelineCache() to state the cache is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-threadingbehavior">externally synchronized</a>.

        The hope is that armed with this information application and engine developers can leverage existing asset streaming systems to recover from "just-in-time" pipeline creation stalls.

        <h5>Promotion to Vulkan 1.3</h5>
        Functionality in this extension is included in core Vulkan 1.3, with the EXT suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <h5>VK_EXT_pipeline_creation_cache_control</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_pipeline_creation_cache_control}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>298</dd>

            <dt><b>Revision</b></dt>
            <dd>3</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.3-promotions">Vulkan 1.3</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Gregory Grebe <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_pipeline_creation_cache_control]%20@grgrebe_amd%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_pipeline_creation_cache_control%20extension%3E%3E">grgrebe_amd</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2020-03-23</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.3 Core</li>
            </ul></dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Gregory Grebe, AMD</li>
                <li>Tobias Hector, AMD</li>
                <li>Matthaeus Chajdas, AMD</li>
                <li>Mitch Singer, AMD</li>
                <li>Spencer Fricke, Samsung Electronics</li>
                <li>Stuart Smith, Imagination Technologies</li>
                <li>Jeff Bolz, NVIDIA Corporation</li>
                <li>Daniel Koch, NVIDIA Corporation</li>
                <li>Dan Ginsburg, Valve Corporation</li>
                <li>Jeff Leger, QUALCOMM</li>
                <li>Michal Pietrasiuk, Intel</li>
                <li>Jan-Harald Fredriksen, Arm Limited</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_PIPELINE_CREATION_CACHE_CONTROL_SPEC_VERSION".."3"
    )

    StringConstant(
        "The extension name.",

        "EXT_PIPELINE_CREATION_CACHE_CONTROL_EXTENSION_NAME".."VK_EXT_pipeline_creation_cache_control"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES_EXT".."1000297000"
    )

    EnumConstant(
        "Extends {@code VkPipelineCreateFlagBits}.",

        "PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_EXT".enum(0x00000100),
        "PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT_EXT".enum(0x00000200)
    )

    EnumConstant(
        "Extends {@code VkResult}.",

        "PIPELINE_COMPILE_REQUIRED_EXT".."1000297000",
        "ERROR_PIPELINE_COMPILE_REQUIRED_EXT".."1000297000"
    )

    EnumConstant(
        "Extends {@code VkPipelineCacheCreateFlagBits}.",

        "PIPELINE_CACHE_CREATE_EXTERNALLY_SYNCHRONIZED_BIT_EXT".enum(0x00000001)
    )
}