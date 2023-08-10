/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_device_fault = "EXTDeviceFault".nativeClassVK("EXT_device_fault", type = "device", postfix = "EXT") {
    documentation =
        """
        Device loss can be triggered by a variety of issues, including invalid API usage, implementation errors, or hardware failures.

        This extension introduces a new command: #GetDeviceFaultInfoEXT(), which may be called subsequent to a #ERROR_DEVICE_LOST error code having been returned by the implementation. This command allows developers to query for additional information on GPU faults which may have caused device loss, and to generate binary crash dumps, which may be loaded into external tools for further diagnosis.

        <h5>VK_EXT_device_fault</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_device_fault}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>342</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Ralph Potter r_potter</li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_device_fault.adoc">VK_EXT_device_fault</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-03-10</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Ralph Potter, Samsung</li>
                <li>Stuart Smith, AMD</li>
                <li>Jan-Harald Fredriksen, ARM</li>
                <li>Mark Bellamy, ARM</li>
                <li>Andrew Ellem, Google</li>
                <li>Alex Walters, IMG</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Baldur Karlsson, Valve</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_DEVICE_FAULT_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "EXT_DEVICE_FAULT_EXTENSION_NAME".."VK_EXT_device_fault"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_EXT".."1000341000",
        "STRUCTURE_TYPE_DEVICE_FAULT_COUNTS_EXT".."1000341001",
        "STRUCTURE_TYPE_DEVICE_FAULT_INFO_EXT".."1000341002"
    )

    EnumConstant(
        """
        VkDeviceFaultAddressTypeEXT - Page fault access types

        <h5>Description</h5>
        <ul>
            <li>#DEVICE_FAULT_ADDRESS_TYPE_NONE_EXT specifies that ##VkDeviceFaultAddressInfoEXT does not describe a page fault, or an instruction address.</li>
            <li>#DEVICE_FAULT_ADDRESS_TYPE_READ_INVALID_EXT specifies that ##VkDeviceFaultAddressInfoEXT describes a page fault triggered by an invalid read operation.</li>
            <li>#DEVICE_FAULT_ADDRESS_TYPE_WRITE_INVALID_EXT specifies that ##VkDeviceFaultAddressInfoEXT describes a page fault triggered by an invalid write operation.</li>
            <li>#DEVICE_FAULT_ADDRESS_TYPE_EXECUTE_INVALID_EXT describes a page fault triggered by an attempt to execute non-executable memory.</li>
            <li>#DEVICE_FAULT_ADDRESS_TYPE_INSTRUCTION_POINTER_UNKNOWN_EXT specifies an instruction pointer value at the time the fault occurred. This may or may not be related to a fault.</li>
            <li>#DEVICE_FAULT_ADDRESS_TYPE_INSTRUCTION_POINTER_INVALID_EXT specifies an instruction pointer value associated with an invalid instruction fault.</li>
            <li>#DEVICE_FAULT_ADDRESS_TYPE_INSTRUCTION_POINTER_FAULT_EXT specifies an instruction pointer value associated with a fault.</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The instruction pointer values recorded may not identify the specific instruction(s) that triggered the fault. The relationship between the instruction pointer reported and triggering instruction will be vendor-specific.
        </div>

        <h5>See Also</h5>
        ##VkDeviceFaultAddressInfoEXT
        """,

        "DEVICE_FAULT_ADDRESS_TYPE_NONE_EXT".."0",
        "DEVICE_FAULT_ADDRESS_TYPE_READ_INVALID_EXT".."1",
        "DEVICE_FAULT_ADDRESS_TYPE_WRITE_INVALID_EXT".."2",
        "DEVICE_FAULT_ADDRESS_TYPE_EXECUTE_INVALID_EXT".."3",
        "DEVICE_FAULT_ADDRESS_TYPE_INSTRUCTION_POINTER_UNKNOWN_EXT".."4",
        "DEVICE_FAULT_ADDRESS_TYPE_INSTRUCTION_POINTER_INVALID_EXT".."5",
        "DEVICE_FAULT_ADDRESS_TYPE_INSTRUCTION_POINTER_FAULT_EXT".."6"
    )

    EnumConstant(
        """
        VkDeviceFaultVendorBinaryHeaderVersionEXT - Encode vendor binary crash dump version

        <h5>Description</h5>
        <ul>
            <li>#DEVICE_FAULT_VENDOR_BINARY_HEADER_VERSION_ONE_EXT specifies version one of the binary crash dump header.</li>
        </ul>

        <h5>See Also</h5>
        ##VkDeviceFaultVendorBinaryHeaderVersionOneEXT, #GetDeviceFaultInfoEXT()
        """,

        "DEVICE_FAULT_VENDOR_BINARY_HEADER_VERSION_ONE_EXT".."1"
    )

    VkResult(
        "GetDeviceFaultInfoEXT",
        """
        Reports diagnostic fault information on the specified logical device.

        <h5>C Specification</h5>
        To retrieve diagnostic information about faults that <b>may</b> have caused device loss, call:

        <pre><code>
￿VkResult vkGetDeviceFaultInfoEXT(
￿    VkDevice                                    device,
￿    VkDeviceFaultCountsEXT*                     pFaultCounts,
￿    VkDeviceFaultInfoEXT*                       pFaultInfo);</code></pre>

        <h5>Description</h5>
        If {@code pFaultInfo} is {@code NULL}, then the counts of corresponding additional fault information structures available are returned in the {@code addressInfoCount} and {@code vendorInfoCount} members of {@code pFaultCounts}. Additionally, the size of any vendor-specific binary crash dump is returned in the {@code vendorBinarySize} member of {@code pFaultCounts}.

        If {@code pFaultInfo} is not {@code NULL}, {@code pFaultCounts} <b>must</b> point to a ##VkDeviceFaultCountsEXT structure with each structure count or size member ({@code addressInfoCount}, {@code vendorInfoCount}, {@code vendorBinarySize}) set by the user to the number of elements in the corresponding output array member of {@code pFaultInfo} ({@code pAddressInfos} and {@code pVendorInfos}), or to the size of the output buffer in bytes ({@code pVendorBinaryData}). On return, each structure count member is overwritten with the number of structures actually written to the corresponding output array member of {@code pFaultInfo}. Similarly, {@code vendorBinarySize} is overwritten with the number of bytes actually written to the {@code pVendorBinaryData} member of {@code pFaultInfo}.

        If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-deviceFaultVendorBinary">vendor-specific crash dumps</a> feature is not enabled, then implementations <b>must</b> set {@code pFaultCounts}-&gt;vendorBinarySize to zero and <b>must</b> not modify {@code pFaultInfo}-&gt;pVendorBinaryData.

        If any {@code pFaultCounts} structure count member is less than the number of corresponding fault properties available, at most structure count ({@code addressInfoCount}, {@code vendorInfoCount}) elements will be written to the associated {@code pFaultInfo} output array. Similarly, if {@code vendorBinarySize} is less than the size in bytes of the available crash dump data, at most {@code vendorBinarySize} elements will be written to {@code pVendorBinaryData}.

        If {@code pFaultInfo} is {@code NULL}, then subsequent calls to #GetDeviceFaultInfoEXT() for the same {@code device} <b>must</b> return identical values in the {@code addressInfoCount}, {@code vendorInfoCount} and {@code vendorBinarySize} members of {@code pFaultCounts}.

        If {@code pFaultInfo} is not {@code NULL}, then subsequent calls to #GetDeviceFaultInfoEXT() for the same {@code device} <b>must</b> return identical values in the output members of {@code pFaultInfo} ({@code pAddressInfos}, {@code pVendorInfos}, {@code pVendorBinaryData}), up to the limits described by the structure count and buffer size members of {@code pFaultCounts} ({@code addressInfoCount}, {@code vendorInfoCount}, {@code vendorBinarySize}). If the sizes of the output members of {@code pFaultInfo} increase for a subsequent call to #GetDeviceFaultInfoEXT(), then supplementary information <b>may</b> be returned in the additional available space.

        If any {@code pFaultCounts} structure count member is smaller than the number of corresponding fault properties available, or if {@code pFaultCounts}-&gt;vendorBinarySize is smaller than the size in bytes of the generated binary crash dump data, #INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available properties were returned.

        If {@code pFaultCounts}-&gt;vendorBinarySize is less than what is necessary to store the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vendor-binary-crash-dumps">binary crash dump header</a>, nothing will be written to {@code pFaultInfo}-&gt;pVendorBinaryData and zero will be written to {@code pFaultCounts}-&gt;vendorBinarySize.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code device} <b>must</b> be in the <em>lost</em> state</li>
            <li>If the value referenced by {@code pFaultCounts→addressInfoCount} is not 0, and {@code pFaultInfo→pAddressInfos} is not {@code NULL}, {@code pFaultInfo→pAddressInfos} must be a valid pointer to an array of {@code pFaultCounts→addressInfoCount} ##VkDeviceFaultAddressInfoEXT structures</li>
            <li>If the value referenced by {@code pFaultCounts→vendorInfoCount} is not 0, and {@code pFaultInfo→pVendorInfos} is not {@code NULL}, {@code pFaultInfo→pVendorInfos} must be a valid pointer to an array of {@code pFaultCounts→vendorInfoCount} ##VkDeviceFaultVendorInfoEXT structures</li>
            <li>If the value referenced by {@code pFaultCounts→vendorBinarySize} is not 0, and {@code pFaultInfo→pVendorBinaryData} is not {@code NULL}, {@code pFaultInfo→pVendorBinaryData} must be a valid pointer to an array of {@code pFaultCounts→vendorBinarySize} bytes</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pFaultCounts} <b>must</b> be a valid pointer to a ##VkDeviceFaultCountsEXT structure</li>
            <li>If {@code pFaultInfo} is not {@code NULL}, {@code pFaultInfo} <b>must</b> be a valid pointer to a ##VkDeviceFaultInfoEXT structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#INCOMPLETE</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkDeviceFaultCountsEXT, ##VkDeviceFaultInfoEXT
        """,

        VkDevice("device", "the logical device from which to query the diagnostic fault information."),
        VkDeviceFaultCountsEXT.p("pFaultCounts", "a pointer to a ##VkDeviceFaultCountsEXT structure in which counts for structures describing additional fault information are returned."),
        nullable..VkDeviceFaultInfoEXT.p("pFaultInfo", "{@code NULL} or a pointer to a ##VkDeviceFaultInfoEXT structure in which fault information is returned.")
    )
}