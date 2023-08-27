/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val VALVE_descriptor_set_host_mapping = "VALVEDescriptorSetHostMapping".nativeClassVK("VALVE_descriptor_set_host_mapping", type = "device", postfix = "VALVE") {
    documentation =
        """
        This extension allows applications to directly query a host pointer for a {@code VkDescriptorSet} which <b>can</b> be used to copy descriptors between descriptor sets without the use of an API command. Memory offsets and sizes for descriptors <b>can</b> be queried from a {@code VkDescriptorSetLayout} as well.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        There is currently no specification language written for this extension. The links to APIs defined by the extension are to stubs that only include generated content such as API declarations and implicit valid usage statements.
        </div>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        This extension is only intended for use in specific embedded environments with known implementation details, and is therefore undocumented.
        </div>

        <h5>Stub API References</h5>
        There is currently no specification language written for this command. This section acts only as placeholder and to avoid dead links in the specification and reference pages.

        <pre><code>
￿void vkGetDescriptorSetLayoutHostMappingInfoVALVE(
￿    VkDevice                                    device,
￿    const VkDescriptorSetBindingReferenceVALVE* pBindingReference,
￿    VkDescriptorSetLayoutHostMappingInfoVALVE*  pHostMapping);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pBindingReference} <b>must</b> be a valid pointer to a valid ##VkDescriptorSetBindingReferenceVALVE structure</li>
            <li>{@code pHostMapping} <b>must</b> be a valid pointer to a ##VkDescriptorSetLayoutHostMappingInfoVALVE structure</li>
        </ul>

        There is currently no specification language written for this command. This section acts only as placeholder and to avoid dead links in the specification and reference pages.

        <pre><code>
￿void vkGetDescriptorSetHostMappingVALVE(
￿    VkDevice                                    device,
￿    VkDescriptorSet                             descriptorSet,
￿    void**                                      ppData);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code descriptorSet} <b>must</b> be a valid {@code VkDescriptorSet} handle</li>
            <li>{@code ppData} <b>must</b> be a valid pointer to a pointer value</li>
            <li>{@code descriptorSet} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        There is currently no specification language written for this type. This section acts only as placeholder and to avoid dead links in the specification and reference pages.

        <pre><code>
￿typedef struct VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE {
￿    VkStructureType    sType;
￿    void*              pNext;
￿    VkBool32           descriptorSetHostMapping;
￿} VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE;</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_SET_HOST_MAPPING_FEATURES_VALVE</li>
        </ul>

        There is currently no specification language written for this type. This section acts only as placeholder and to avoid dead links in the specification and reference pages.

        <pre><code>
￿typedef struct VkDescriptorSetBindingReferenceVALVE {
￿    VkStructureType          sType;
￿    const void*              pNext;
￿    VkDescriptorSetLayout    descriptorSetLayout;
￿    uint32_t                 binding;
￿} VkDescriptorSetBindingReferenceVALVE;</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DESCRIPTOR_SET_BINDING_REFERENCE_VALVE</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code descriptorSetLayout} <b>must</b> be a valid {@code VkDescriptorSetLayout} handle</li>
        </ul>

        There is currently no specification language written for this type. This section acts only as placeholder and to avoid dead links in the specification and reference pages.

        <pre><code>
￿typedef struct VkDescriptorSetLayoutHostMappingInfoVALVE {
￿    VkStructureType    sType;
￿    void*              pNext;
￿    size_t             descriptorOffset;
￿    uint32_t           descriptorSize;
￿} VkDescriptorSetLayoutHostMappingInfoVALVE;</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>VK_VALVE_descriptor_set_host_mapping</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_VALVE_descriptor_set_host_mapping}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>421</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>

            <dt><b>Special Use</b></dt>
            <dd><ul>
                <li><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#extendingvulkan-compatibility-specialuse">D3D support</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Hans-Kristian Arntzen <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_VALVE_descriptor_set_host_mapping]%20@HansKristian-Work%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_VALVE_descriptor_set_host_mapping%20extension*">HansKristian-Work</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2022-02-22</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Hans-Kristian Arntzen, Valve</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "VALVE_DESCRIPTOR_SET_HOST_MAPPING_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "VALVE_DESCRIPTOR_SET_HOST_MAPPING_EXTENSION_NAME".."VK_VALVE_descriptor_set_host_mapping"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_SET_HOST_MAPPING_FEATURES_VALVE".."1000420000",
        "STRUCTURE_TYPE_DESCRIPTOR_SET_BINDING_REFERENCE_VALVE".."1000420001",
        "STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE".."1000420002"
    )

    void(
        "GetDescriptorSetLayoutHostMappingInfoVALVE",
        """
        Stub description of vkGetDescriptorSetLayoutHostMappingInfoVALVE.

        <h5>C Specification</h5>
        There is currently no specification language written for this command. This section acts only as placeholder and to avoid dead links in the specification and reference pages.

        <pre><code>
￿void vkGetDescriptorSetLayoutHostMappingInfoVALVE(
￿    VkDevice                                    device,
￿    const VkDescriptorSetBindingReferenceVALVE* pBindingReference,
￿    VkDescriptorSetLayoutHostMappingInfoVALVE*  pHostMapping);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pBindingReference} <b>must</b> be a valid pointer to a valid ##VkDescriptorSetBindingReferenceVALVE structure</li>
            <li>{@code pHostMapping} <b>must</b> be a valid pointer to a ##VkDescriptorSetLayoutHostMappingInfoVALVE structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkDescriptorSetBindingReferenceVALVE, ##VkDescriptorSetLayoutHostMappingInfoVALVE
        """,

        VkDevice("device", ""),
        VkDescriptorSetBindingReferenceVALVE.const.p("pBindingReference", ""),
        VkDescriptorSetLayoutHostMappingInfoVALVE.p("pHostMapping", "")
    )

    void(
        "GetDescriptorSetHostMappingVALVE",
        """
        Stub description of vkGetDescriptorSetHostMappingVALVE.

        <h5>C Specification</h5>
        There is currently no specification language written for this command. This section acts only as placeholder and to avoid dead links in the specification and reference pages.

        <pre><code>
￿void vkGetDescriptorSetHostMappingVALVE(
￿    VkDevice                                    device,
￿    VkDescriptorSet                             descriptorSet,
￿    void**                                      ppData);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code descriptorSet} <b>must</b> be a valid {@code VkDescriptorSet} handle</li>
            <li>{@code ppData} <b>must</b> be a valid pointer to a pointer value</li>
            <li>{@code descriptorSet} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>
        """,

        VkDevice("device", ""),
        VkDescriptorSet("descriptorSet", ""),
        Check(1)..void.p.p("ppData", "")
    )
}