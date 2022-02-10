/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_mem_alloc_buffer_location = "INTELMemAllocBufferLocation".nativeClassCL("intel_mem_alloc_buffer_location", INTEL) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        On some devices, global memory may be partitioned into disjoint regions. This may be to enable control over specific characteristics such as available
        bandwidths on memory interfaces, or performance on types of access patterns.

        This extension allows a user to explicitly specify the partition/region of global memory in which an allocation should reside, by passing an
        implementation defined numerical ID that identifies the region to the allocation function.

        Requires ${CL30.link} or ${intel_create_buffer_with_properties.link}.
        """

    IntConstant(
        """
        Accepted property for the {@code properties} parameter to #CreateBufferWithPropertiesINTEL(), #CreateBufferWithProperties(), #DeviceMemAllocINTEL()),
        #SharedMemAllocINTEL(), #HostMemAllocINTEL() to specify requested global memory type ID.
        
        It can be passed into #GetMemAllocInfoINTEL() to get the buffer location of allocated usm memory, as well as #GetMemObjectInfo() to get buffer location
        of the buffer. If no property was specified, then the ID corresponding to default global memory is returned.
        """,

        "MEM_ALLOC_BUFFER_LOCATION_INTEL"..0x419E
    )
}