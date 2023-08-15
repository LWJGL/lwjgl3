/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_displacement_micromap = "NVDisplacementMicromap".nativeClassVK("NV_displacement_micromap", type = "device", postfix = "NV") {
    documentation =
        """
        Ray tracing can very efficiently render from geometry which has very fine detail, but when using only a basic triangle representation, memory consumption can be an issue. This extension adds the ability to add a <em>displacement map</em> to add more detail to triangles in an acceleration structure with an efficient in-memory format. The format is externally visible to allow the application to compress its internal geometry representations into the compressed format ahead of time. This format adds displacements along a defined vector to subtriangle vertices which are subdivided from the main triangles.

        This extension provides:

        <ul>
            <li>a new {@code VkMicromapTypeEXT} format for the displacement micromap,</li>
            <li>a structure to extend ##VkAccelerationStructureGeometryTrianglesDataKHR to attach a displacement micromap to the geometry of the acceleration structure,</li>
            <li>enums extending {@code VkBuildAccelerationStructureFlagBitsKHR} to allow for updates.</li>
        </ul>

        <h5>VK_NV_displacement_micromap</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_displacement_micromap}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>398</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link EXTOpacityMicromap VK_EXT_opacity_micromap}

            <ul>
                <li>This is a <em>provisional</em> extension and <b>must</b> be used with caution. See the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#boilerplate-provisional-header">description</a> of provisional header files for enablement and stability details.</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Christoph Kubisch <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_displacement_micromap]%20@pixeljetstream%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_displacement_micromap%20extension*">pixeljetstream</a></li>
                <li>Eric Werness <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_displacement_micromap]%20@ewerness-nv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_displacement_micromap%20extension*">ewerness-nv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-03-17</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd>TBD</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Christoph Kubisch, NVIDIA</li>
                <li>Eric Werness, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_DISPLACEMENT_MICROMAP_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "NV_DISPLACEMENT_MICROMAP_EXTENSION_NAME".."VK_NV_displacement_micromap"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DISPLACEMENT_MICROMAP_FEATURES_NV".."1000397000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DISPLACEMENT_MICROMAP_PROPERTIES_NV".."1000397001",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_DISPLACEMENT_MICROMAP_NV".."1000397002"
    )

    EnumConstant(
        "Extends {@code VkPipelineCreateFlagBits}.",

        "PIPELINE_CREATE_RAY_TRACING_DISPLACEMENT_MICROMAP_BIT_NV".enum(0x10000000)
    )

    EnumConstant(
        "Extends {@code VkBuildAccelerationStructureFlagBitsKHR}.",

        "BUILD_ACCELERATION_STRUCTURE_ALLOW_DISPLACEMENT_MICROMAP_UPDATE_NV".enum(0x00000200)
    )

    EnumConstant(
        "Extends {@code VkMicromapTypeEXT}.",

        "MICROMAP_TYPE_DISPLACEMENT_MICROMAP_NV".."1000397000"
    )

    EnumConstant(
        """
        VkDisplacementMicromapFormatNV - Format enum for displacement micromaps

        <h5>Description</h5>
        <ul>
            <li>#DISPLACEMENT_MICROMAP_FORMAT_64_TRIANGLES_64_BYTES_NV indicates that the given micromap format encodes 64 micro-triangles worth of displacements in 64 bytes as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#displacement-micromap-encoding">Displacement Micromap Encoding</a>.</li>
            <li>#DISPLACEMENT_MICROMAP_FORMAT_256_TRIANGLES_128_BYTES_NV indicates that the given micromap format encodes 256 micro-triangles worth of displacements in 128 bytes as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#displacement-micromap-encoding">Displacement Micromap Encoding</a>.</li>
            <li>#DISPLACEMENT_MICROMAP_FORMAT_1024_TRIANGLES_128_BYTES_NV indicates that the given micromap format encodes 1024 micro-triangles worth of displacements in 128 bytes as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#displacement-micromap-encoding">Displacement Micromap Encoding</a>.</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        For compactness, these values are stored as 16-bit in some structures.
        </div>
        """,

        "DISPLACEMENT_MICROMAP_FORMAT_64_TRIANGLES_64_BYTES_NV".."1",
        "DISPLACEMENT_MICROMAP_FORMAT_256_TRIANGLES_128_BYTES_NV".."2",
        "DISPLACEMENT_MICROMAP_FORMAT_1024_TRIANGLES_128_BYTES_NV".."3"
    )
}