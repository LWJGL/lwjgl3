/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_unified_shared_memory = "INTELUnifiedSharedMemory".nativeClassCL("intel_unified_shared_memory", INTEL) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        This extension adds "Unified Shared Memory" (USM) to OpenCL. Unified Shared Memory provides:
        ${ul(
            """
            Easier integration into existing code bases by representing OpenCL allocations as pointers rather than handles (`cl_mems`), with full support for
            pointer arithmetic into allocations.
            """,
            "Fine-grain control over ownership and accessibility of OpenCL allocations, to optimally choose between performance and programmer convenience.",
            "A simpler programming model, by automatically migrating some allocations between OpenCL devices and the host."
        )}

        While Unified Shared Memory (USM) shares many features with Shared Virtual Memory (SVM), Unified Shared Memory provides a different mix of capabilities
        and control. Specifically:
        ${ul(
            "The matrix of USM capabilities supports combinations of features beyond the SVM capability queries.",
            """
            USM provides explicit control over memory placement and migration by supporting host allocations with wide visibility, devices allocations for best
            performance, and shared allocations that may migrate between devices and the host.
            """,
            """
            USM allocations may be associated with both a device and a context. The USM allocation APIs support additional memory flags and optional properties
            to affect how memory is allocated and migrated.
            """,
            """
            There is no need for APIs to map or unmap USM allocations, because host accessible USM allocations do not need to be mapped or unmapped to access
            the contents of a USM allocation on the host.
            """,
            """
            An application may indicate that a kernel may access categories of USM allocations indirectly, without passing a set of all indirectly accessed USM
            allocations to the kernel, improving usability and reducing driver overhead for kernels that access many USM allocations.
            """,
            "USM adds API functions to query properties of a USM allocation and to provide memory advice for an allocation."
        )}

        Unified Shared Memory and Shared Virtual Memory can and will coexist for many implementations. All implementations that support Shared Virtual Memory
        may support at least some types of Unified Shared Memory.

        Requires ${CL20.link}.
        """

    IntConstant(
        "Accepted value for the {@code param_name} parameter to #GetDeviceInfo() to query the Unified Shared Memory capabilities of an OpenCL device.",

        "DEVICE_HOST_MEM_CAPABILITIES_INTEL"..0x4190,
        "DEVICE_DEVICE_MEM_CAPABILITIES_INTEL"..0x4191,
        "DEVICE_SINGLE_DEVICE_SHARED_MEM_CAPABILITIES_INTEL"..0x4192,
        "DEVICE_CROSS_DEVICE_SHARED_MEM_CAPABILITIES_INTEL"..0x4193,
        "DEVICE_SHARED_SYSTEM_MEM_CAPABILITIES_INTEL"..0x4194
    )

    IntConstant(
        """
        Bitfield type and bits describing the Unified Shared Memory capabilities of an OpenCL device.
        ({@code cl_device_unified_shared_memory_capabilities_intel})
        """,

        "UNIFIED_SHARED_MEMORY_ACCESS_INTEL".."1 << 0",
        "UNIFIED_SHARED_MEMORY_ATOMIC_ACCESS_INTEL".."1 << 1",
        "UNIFIED_SHARED_MEMORY_CONCURRENT_ACCESS_INTEL".."1 << 2",
        "UNIFIED_SHARED_MEMORY_CONCURRENT_ATOMIC_ACCESS_INTEL".."1 << 3"
    )

    IntConstant(
        "Enumerant value requesting optional allocation properties for a Unified Shared Memory allocation.",

        "MEM_ALLOC_FLAGS_INTEL"..0x4195
    )

    EnumConstant(
        "Bitfield type and bits describing optional allocation properties for a Unified Shared Memory allocation. ({@code cl_mem_alloc_flags_intel})",

        "MEM_ALLOC_WRITE_COMBINED_INTEL".enum(
            """
            Request write combined (WC) memory.

            Write combined memory may improve performance in some cases, however write combined memory must be used with care since it may hurt performance in
            other cases or use different coherency protocols than non-write combined memory.
            """,
            "1 << 0"
        ),
        "MEM_ALLOC_INITIAL_PLACEMENT_DEVICE_INTEL".enum(
            """
            Request the implementation to optimize for first access being done by the device.

            This flag is valid only for #SharedMemAllocINTEL(). This flag does not affect functionality and is purely a performance hint.
            """,
            "1 << 1"
        ),
        "MEM_ALLOC_INITIAL_PLACEMENT_HOST_INTEL".enum(
            """
            Request the implementation to optimize for first access being done by the host.

            This flag is valid only for #SharedMemAllocINTEL(). This flag does not affect functionality and is purely a performance hint.

            {@code CL_MEM_ALLOC_INITIAL_PLACEMENT_DEVICE_INTEL} and {@code CL_MEM_ALLOC_INITIAL_PLACEMENT_HOST_INTEL} are mutually exclusive.
            """,
            "1 << 2"
        )
    )

    val MemInfoIntel = IntConstant(
        """
        Enumeration type and values for the {@code param_name} parameter to #GetMemAllocInfoINTEL() to query information about a Unified Shared Memory
        allocation. ({@code cl_mem_info_intel})

        Optional allocation properties may also be queried using {@code clGetMemAllocInfoINTEL}.
        """,

        "MEM_ALLOC_TYPE_INTEL"..0x419A,
        "MEM_ALLOC_BASE_PTR_INTEL"..0x419B,
        "MEM_ALLOC_SIZE_INTEL"..0x419C,
        "MEM_ALLOC_DEVICE_INTEL"..0x419D
    ).javaDocLinks

    IntConstant(
        """
        Enumeration type and values describing the type of Unified Shared Memory allocation. Returned by #GetMemAllocInfoINTEL() when {@code param_name} is
        #MEM_ALLOC_TYPE_INTEL. ({@code cl_unified_shared_memory_type_intel})
        """,

        "MEM_TYPE_UNKNOWN_INTEL"..0x4196,
        "MEM_TYPE_HOST_INTEL"..0x4197,
        "MEM_TYPE_DEVICE_INTEL"..0x4198,
        "MEM_TYPE_SHARED_INTEL"..0x4199
    )

    IntConstant(
        """
        Accepted value for the {@code param_name} parameter to #SetKernelExecInfo() to specify that the kernel may indirectly access Unified Shared Memory
        allocations of the specified type.
        """,

        "KERNEL_EXEC_INFO_INDIRECT_HOST_ACCESS_INTEL"..0x4200,
        "KERNEL_EXEC_INFO_INDIRECT_DEVICE_ACCESS_INTEL"..0x4201,
        "KERNEL_EXEC_INFO_INDIRECT_SHARED_ACCESS_INTEL"..0x4202
    )

    IntConstant(
        """
        Accepted value for the {@code param_name} parameter to #SetKernelExecInfo() to specify a set of Unified Shared Memory allocations that the kernel may
        indirectly access.
        """,

        "KERNEL_EXEC_INFO_USM_PTRS_INTEL"..0x4203
    )

    IntConstant(
        "New return values from #GetEventInfo() when {@code param_name} is #EVENT_COMMAND_TYPE.",

        "COMMAND_MEMFILL_INTEL"..0x4204,
        "COMMAND_MEMCPY_INTEL"..0x4205,
        "COMMAND_MIGRATEMEM_INTEL"..0x4206,
        "COMMAND_MEMADVISE_INTEL"..0x4207
    )

    void.p(
        "HostMemAllocINTEL",
        "Allocates host Unified Shared Memory.",

        cl_context("context", "a valid OpenCL context used to allocate the host memory"),
        nullable..NullTerminated..cl_mem_properties_intel.const.p(
            "properties",
            """
            an optional list of allocation properties and their corresponding values.

            The list is terminated with the special property {@code 0}. If no allocation properties are required, {@code properties} may be #NULL.
            """
        ),
        AutoSizeResult..size_t("size", "the size in bytes of the requested host allocation"),
        cl_uint(
            "alignment",
            """
            the minimum alignment in bytes for the requested host allocation.

            It must be a power of two and must be equal to or smaller than the size of the largest data type supported by any OpenCL device in {@code context}.
            If {@code alignment} is {@code 0}, a default alignment will be used that is equal to the size of the largest data type supported by any OpenCL
            device in {@code context}.
            """
        ),
        ERROR_RET,

        returnDoc =
        """
        a valid non-#NULL address and #SUCCESS will be returned in {@code errcode_ret} if the host Unified Shared Memory is allocated successfully. Otherwise,
        #NULL will be returned, and {@code errcode_ret} will be set to one of the following error values:
        ${ul(
            ICE,
            """
            #INVALID_OPERATION if #DEVICE_HOST_MEM_CAPABILITIES_INTEL is zero for all devices in {@code context}, indicating that no devices in {@code context}
            support host Unified Shared Memory allocations.
            """,
            "#INVALID_VALUE if {@code alignment} is not zero or a power of two.",
            """
            #INVALID_VALUE if {@code alignment} is greater than the size of the largest data type supported by any OpenCL device in {@code context} that
            supports host Unified Shared Memory allocations.
            """,
            """
            #INVALID_PROPERTY if a memory property name in {@code properties} is not a supported property name, if the value specified for a supported property
            name is not valid, or if the same property name is specified more than once.
            """,
            "#INVALID_PROPERTY if either the #MEM_ALLOC_INITIAL_PLACEMENT_DEVICE_INTEL or #MEM_ALLOC_INITIAL_PLACEMENT_HOST_INTEL flags are specified.",
            """
            #INVALID_BUFFER_SIZE if {@code size} is zero or greater than #DEVICE_MAX_MEM_ALLOC_SIZE for any OpenCL device in {@code context} that supports host
            Unified Shared Memory allocations.
            """,
            OORE,
            OOHME     
        )}
        """
    )

    void.p(
        "DeviceMemAllocINTEL",
        "Allocates Unified Shared Memory specific to an OpenCL device.",

        cl_context("context", "a valid OpenCL context used to allocate the device memory"),
        cl_device_id("device", "a valid OpenCL device ID to associate with the allocation"),
        nullable..NullTerminated..cl_mem_properties_intel.const.p(
            "properties",
            """
            an optional list of allocation properties and their corresponding values.

            The list is terminated with the special property {@code 0}. If no allocation properties are required, {@code properties} may be #NULL.
            """
        ),
        AutoSizeResult..size_t("size", "the size in bytes of the requested device allocation"),
        cl_uint(
            "alignment",
            """
            the minimum alignment in bytes for the requested device allocation.

            It must be a power of two and must be equal to or smaller than the size of the largest data type supported by {@code device}. If {@code alignment}
            is {@code 0}, a default alignment will be used that is equal to the size of largest data type supported by {@code device}.
            """
        ),
        ERROR_RET,

        returnDoc =
        """
        a valid non-#NULL address and #SUCCESS will be returned in {@code errcode_ret} if the device Unified Shared Memory is allocated successfully.
        Otherwise, #NULL will be returned, and {@code errcode_ret} will be set to one of the following error values:
        ${ul(
            ICE,
            "#INVALID_DEVICE if {@code device} is not a valid device or is not associated with {@code context}.",
            """
            #INVALID_OPERATION` if #DEVICE_DEVICE_MEM_CAPABILITIES_INTEL is zero for {@code device}, indicating that {@code device} does not support device
            Unified Shared Memory allocations.
            """,
            "#INVALID_VALUE if {@code alignment} is not zero or a power of two.",
            "#INVALID_VALUE if {@code alignment} is greater than the size of the largest data type supported by {@code device}.",
            """
            #INVALID_PROPERTY if a memory property name in {@code properties} is not a supported property name, if the value specified for a supported property
            name is not valid, or if the same property name is specified more than once.
            """,
            "#INVALID_PROPERTY if either the #MEM_ALLOC_INITIAL_PLACEMENT_DEVICE_INTEL or #MEM_ALLOC_INITIAL_PLACEMENT_HOST_INTEL flags are specified.",
            "#INVALID_BUFFER_SIZE if {@code size} is zero or greater than #DEVICE_MAX_MEM_ALLOC_SIZE for {@code device}.",
            OORE,
            OOHME
        )}
        """
    )

    void.p(
        "SharedMemAllocINTEL",
        """
        Allocates Unified Shared Memory with shared ownership between the host and the specified OpenCL device.

        If the specified OpenCL device supports cross-device access capabilities, the allocation is also accessible by other OpenCL devices in the context that
        have cross-device access capabilities.
        """,

        cl_context("context", "a valid OpenCL context used to allocate the Unified Shared Memory"),
        nullable..cl_device_id(
            "device",
            """
            an optional OpenCL device ID to associate with the allocation.

            If {@code device is} #NULL then the allocation is not associated with any device. Allocations with no associated device are accessible by the host
            and OpenCL devices in the context that have cross-device access capabilities.
            """
        ),
        nullable..NullTerminated..cl_mem_properties_intel.const.p(
            "properties",
            """
            an optional list of allocation properties and their corresponding values.

            The list is terminated with the special property {@code 0}. If no allocation properties are required, {@code properties} may be #NULL.
            """
        ),
        AutoSizeResult..size_t("size", "the size in bytes of the requested device allocation"),
        cl_uint(
            "alignment",
            """
            the minimum alignment in bytes for the requested shared allocation.

            It must be a power of two and must be equal to or smaller than the size of the largest data type supported by {@code device}. If {@code alignment}
            is {@code 0}, a default alignment will be used that is equal to the size of largest data type supported by {@code device}. If {@code device} is
            #NULL, {@code alignment} must be a power of two equal to or smaller than the size of the largest data type supported by any OpenCL device in
            {@code context}, and the default alignment will be equal to the size of the largest data type supported by any OpenCL device in {@code context}.
            """
        ),
        ERROR_RET,

        returnDoc =
        """
        a valid non-#NULL address and #SUCCESS will be returned in {@code errcode_ret} if the shared Unified Shared Memory is allocated successfully.
        Otherwise, #NULL will be returned, and {@code errcode_ret} will be set to one of the following error values:
        ${ul(
            ICE,
            "#INVALID_DEVICE if {@code device} is not #NULL and is either not a valid device or is not associated with {@code context}.",
            """
            #INVALID_OPERATION if {@code device} is not #NULL and #DEVICE_SINGLE_DEVICE_SHARED_MEM_CAPABILITIES_INTEL and 
            #DEVICE_CROSS_DEVICE_SHARED_MEM_CAPABILITIES_INTEL are both zero, indicating that {@code device} does not support shared Unified Shared Memory
            allocations, or if {@code device} is #NULL and no devices in {@code context} support shared Unified Shared Memory allocations.
            """,
            "#INVALID_VALUE if {@code alignment} is not zero or a power of two.",
            """
            #INVALID_VALUE if {@code device} is not #NULL and {@code alignment} is greater than the size of the largest data type supported by {@code device},
            or if {@code device} is #NULL and {@code alignment} is greater than the size of the largest data type supported by any OpenCL device in
            {@code context} that supports shared Unified Shared Memory allocations.
            """,
            """
            #INVALID_PROPERTY if a memory property name in {@code properties} is not a supported property name, if the value specified for a supported property
            name is not valid, or if the same property name is specified more than once.
            """,
            "#INVALID_PROPERTY if both #MEM_ALLOC_INITIAL_PLACEMENT_DEVICE_INTEL and #MEM_ALLOC_INITIAL_PLACEMENT_HOST_INTEL flags are specified.",
            """
            #INVALID_BUFFER_SIZE if {@code size} is zero, or if {@code device} is not #NULL and {@code size} is greater than #DEVICE_MAX_MEM_ALLOC_SIZE for
            {@code device}, or if {@code device} is #NULL and {@code size} is greater than #DEVICE_MAX_MEM_ALLOC_SIZE for any device in {@code context} that
            supports shared Unified Shared Memory allocations.
            """,
            OORE,
            OOHME
        )}
        """
    )

    cl_int(
        "MemFreeINTEL",
        """
        Frees a Unified Shared Memory allocation.

        Note that {@code clMemFreeINTEL} may not wait for previously enqueued commands that may be using {@code ptr} to finish before freeing {@code ptr}. It
        is the responsibility of the application to make sure enqueued commands that use {@code ptr} are complete before freeing {@code ptr}. Applications
        should take particular care freeing memory allocations with kernels that may access memory indirectly, since a kernel with indirect memory access
        counts as using all memory allocations of the specified type or types.

        To wait for previously enqueued commands to finish that may be using {@code ptr} before freeing {@code ptr}, use the #MemBlockingFreeINTEL() function
        instead.
        """,

        cl_context("context", "a valid OpenCL context used to free the Unified Shared Memory allocation"),
        Unsafe..nullable..void.p(
            "ptr",
            """
            the Unified Shared Memory allocation to free.

            It must be a value returned by #HostMemAllocINTEL(), #DeviceMemAllocINTEL(), or #SharedMemAllocINTEL(), or a #NULL pointer. If {@code ptr} is
            #NULL then no action occurs.
            """
        ),

        returnDoc =
        """
        #SUCCESS if the function executes successfully. Otherwise, they will return one of the following error values:
        ${ul(
            ICE,
            """
            #INVALID_VALUE if {@code ptr} is not a value returned by #HostMemAllocINTEL(), #DeviceMemAllocINTEL(), #SharedMemAllocINTEL(), or a #NULL pointer.
            """,
            OORE,
            OOHME
        )}
        """
    )

    cl_int(
        "MemBlockingFreeINTEL",
        "Frees a Unified Shared Memory allocation.",

        cl_context("context", "a valid OpenCL context used to free the Unified Shared Memory allocation"),
        Unsafe..nullable..void.p(
            "ptr",
            """
            the Unified Shared Memory allocation to free.

            It must be a value returned by #HostMemAllocINTEL(), #DeviceMemAllocINTEL(), or #SharedMemAllocINTEL(), or a #NULL pointer. If {@code ptr} is
            #NULL then no action occurs.
            """
        ),

        returnDoc =
        """
        #SUCCESS if the function executes successfully. Otherwise, they will return one of the following error values:
        ${ul(
            ICE,
            """
            #INVALID_VALUE if {@code ptr} is not a value returned by #HostMemAllocINTEL(), #DeviceMemAllocINTEL(), #SharedMemAllocINTEL(), or a #NULL pointer.
            """,
            OORE,
            OOHME
        )}
        """
    )

    cl_int(
        "GetMemAllocInfoINTEL",
        "Queries information about a Unified Shared Memory allocation.",

        cl_context("context", "a valid OpenCL context to query for information about the Unified Shared Memory allocation"),
        Unsafe..void.const.p(
            "ptr",
            """
            a pointer into a Unified Shared Memory allocation to query.

            {@code ptr need not be a value} returned by #HostMemAllocINTEL(), #DeviceMemAllocINTEL(), or #SharedMemAllocINTEL(), but the query may be faster if
            it is.
            """
        ),
        cl_mem_info_intel("param_name", "the information to query", MemInfoIntel),
        PARAM_VALUE_SIZE,
        MultiType(
            PointerMapping.DATA_INT,
            PointerMapping.DATA_POINTER
        )..nullable..void.p(
            "param_value",
            """
            a pointer to memory where the appropriate result being queried is returned.

            If {@code param_value} is #NULL, it is ignored.
            """
        ),
        PARAM_VALUE_SIZE_RET,

        returnDoc =
        """
        #SUCCESS if the function is executed successfully. Otherwise, it will return one of the following error values:
        ${ul(
            ICE,
            "#INVALID_VALUE if {@code param_name} is not a valid Unified Shared Memory allocation query.",
            "#INVALID_VALUE` if {@code param_value} is not #NULL and {@code param_value_size} is smaller than the size of the query return type.",
            OORE,
            OOHME
        )}
        """
    )

    cl_int(
        "SetKernelArgMemPointerINTEL",
        "Sets a pointer into a Unified Shared Memory allocation as an argument to a kernel.",

        cl_kernel("kernel", "a valid kernel object"),
        cl_uint(
            "arg_index",
            """
            the argument index to set.

            Arguments to the kernel are referred to by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is the total number
            of arguments declared by a kernel.
            """
        ),
        MultiTypeAll..Unsafe..void.const.p(
            "arg_value",
            """
            the pointer value that should be used as the argument specified by {@code arg_index}.

            The pointer value will be used as the argument by all API calls that enqueue a kernel until the argument value is set to a different pointer value
            by a subsequent call. A pointer into Unified Shared Memory allocation may only be set as an argument value for an argument declared to be a pointer
            to {@code global} or {@code constant} memory. For devices supporting shared system allocations, any pointer value is valid. Otherwise, the pointer
            value must be #NULL or must point into a Unified Shared Memory allocation returned by #HostMemAllocINTEL(), #DeviceMemAllocINTEL(), or
            #SharedMemAllocINTEL().
            """
        ),

        returnDoc =
        """
        #SUCCESS if the function is executed successfully. Otherwise, it will return one of the following errors:
        ${ul(
            "#INVALID_KERNEL if {@code kernel} is not a valid kernel object.",
            "#INVALID_ARG_INDEX if {@code arg_index} is not a valid argument index.",
            "#INVALID_ARG_VALUE if {@code arg_value} is not a valid argument value.",
            OORE,
            OOHME
        )}
        """
    )

    cl_int(
        "EnqueueMemFillINTEL",
        "Fills a region of a memory with the specified pattern.",

        cl_command_queue(
            "command_queue",
            """
            a valid host command queue.

            The memory fill command will be queued for execution on the device associated with {@code command_queue}.
            """
        ),
        void.p(
            "dst_ptr",
            """
            a pointer to the start of the memory region to fill.

            The Unified Shared Memory allocation pointed to by {@code dst_ptr} must be valid for the context associated with {@code command_queue}, must be
            accessible by the device associated with {@code command_queue}, and must be aligned to {@code pattern_size} bytes.
            """
        ),
        void.const.p(
            "pattern",
            """
            a pointer to the value to write to the Unified Shared Memory region.

            The memory associated with {@code pattern} can be reused or freed after the function returns.
            """
        ),
        AutoSize("pattern")..size_t(
            "pattern_size",
            """
            the size of of the value to write to the Unified Shared Memory region, in bytes.

            Must be a power of two and must be less than or equal to the size of the largest integer or floating-point vector data type supported by the
            device.
            """
        ),
        AutoSize("dst_ptr")..size_t("size", "the size of the memory region to set, in bytes"),
        NEWL,
        EWL,
        EVENT,

        returnDoc =
        """
        #SUCCESS if the command is queued successfully. Otherwise, it will return one of the following errors:
        ${ul(
            "#INVALID_COMMAND_QUEUE if {@code command_queue} is not a valid host command-queue.",
            "#INVALID_CONTEXT if the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.",
            "#INVALID_VALUE if {@code dst_ptr} is #NULL, or if {@code dst_ptr} is not aligned to {@code pattern_size} bytes.",
            "#INVALID_VALUE if {@code pattern} is #NULL.",
            """
            #INVALID_VALUE if {@code pattern_size} is not a power of two or is greater than the size of the largest integer or floating-point vector data type
            supported by the device associated with {@code command_queue}.
            """,
            "#INVALID_VALUE if {@code size} is not a multiple of {@code pattern_size}.",
            """
            #INVALID_EVENT_WAIT_LIST if {@code event_wait_list} is #NULL and {@code num_events_in_wait_list} is greater than zero, or if
            {@code event_wait_list} is not #NULL and {@code num_events_in_wait_list} is zero, or if event objects in {@code event_wait_list} are not valid
            events.
            """,
            OORE,
            OOHME
        )}
        """
    )

    cl_int(
        "EnqueueMemcpyINTEL",
        "Copies a region of memory from one location to another.",

        cl_command_queue(
            "command_queue",
            """
            a valid host command queue.

            The memory copy command will be queued for execution on the device associated with {@code command_queue}.
            """
        ),
        cl_bool(
            "blocking",
            """
            indicates if the copy operation is blocking or non-blocking.

            If {@code blocking is} #TRUE, the copy command is blocking, and the function will not return until the copy command is complete. Otherwise, if
            {@code blocking} is #FALSE, the copy command is non-blocking, and the contents of the {@code dst_ptr} cannot be used nor can the contents of the
            {@code src_ptr} be overwritten until the copy command is complete.
            """
        ),
        Check("size")..void.p(
            "dst_ptr",
            """
            a pointer to the start of the memory region to copy to.

            If {@code dst_ptr} is a pointer into a Unified Shared Memory allocation it must be valid for the context associated with {@code command_queue}.
            """
        ),
        Check("size")..void.const.p(
            "src_ptr",
            """
            a pointer to the start of the memory region to copy from.

            If {@code src_ptr is} a pointer into a Unified Shared Memory allocation it must be valid for the context associated with {@code command_queue}.
            """
        ),
        size_t("size", "the size of the memory region to copy, in bytes"),
        NEWL,
        EWL,
        EVENT,

        returnDoc =
        """
        #SUCCESS if the command is queued successfully. Otherwise, it will return one of the following errors:
        ${ul(
            "#INVALID_COMMAND_QUEUE if {@code command_queue} is not a valid host command-queue.",
            "#INVALID_CONTEXT if the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.",
            "#INVALID_VALUE if either {@code dst_ptr} or {@code src_ptr} are #NULL.",
            """
            #INVALID_EVENT_WAIT_LIST if {@code event_wait_list} is #NULL and {@code num_events_in_wait_list} is greater than zero, or if
            {@code event_wait_list} is not #NULL and {@code num_events_in_wait_list} is zero, or if event objects in {@code event_wait_list} are not valid
            events.
            """,
            """
            #EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST if the copy operation is blocking and the execution status of any of the events in
            {@code event_wait_list} is a negative integer value.
            """,
            "#MEM_COPY_OVERLAP if the values specified for {@code dst_ptr}, {@code src_ptr} and {@code size} result in an overlapping copy.",
            OORE,
            OOHME
        )}
        """
    )

    cl_int(
        "EnqueueMigrateMemINTEL",
        """
        Explicitly migrates a region of a shared Unified Shared Memory allocation to the device associated with {@code command_queue}.

        This is a hint that may improve performance and is not required for correctness. Memory migration may not be supported for all allocation types for all
        devices. If memory migration is not supported for the specified memory range then the migration hint may be ignored. Memory migration may only be
        supported at a device-specific granularity, such as a page boundary. In this case, the memory range may be expanded such that the start and end of the
        range satisfy the granularity requirements.
        """,

        cl_command_queue(
            "command_queue",
            """
            a valid host command queue.

            The memory migration command will be queued for execution on the device associated with {@code command_queue}.
            """
        ),
        void.const.p("ptr", "a pointer to the start of the shared Unified Shared Memory allocation to migrate"),
        AutoSize("ptr")..size_t("size", "the size of the memory region to migrate"),
        cl_mem_migration_flags("flags", "a bit-field that is used to specify memory migration options"),
        NEWL,
        EWL,
        EVENT,

        returnDoc =
        """
        #SUCCESS if the command is queued successfully. Otherwise, it will return one of the following errors:
        ${ul(
            "#INVALID_COMMAND_QUEUE if {@code command_queue} is not a valid host command-queue.",
            "#INVALID_CONTEXT if the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.",
            "#INVALID_VALUE if {@code flags} is zero or is not a supported combination of memory migration flags.",
            """
            #INVALID_EVENT_WAIT_LIST if {@code event_wait_list} is #NULL and {@code num_events_in_wait_list} is greater than zero, or if
            {@code event_wait_list} is not #NULL and {@code num_events_in_wait_list} is zero, or if event objects in {@code event_wait_list} are not valid
            events.
            """,
            OORE,
            OOHME
        )}
        """
    )

    cl_int(
        "EnqueueMemAdviseINTEL",
        """
        Provides advice about a region of a shared Unified Shared Memory allocation.

        Memory advice is a performance hint only and is not required for correctness.  Providing memory advice hints may override driver heuristics that
        control shared memory behavior. Not all memory advice hints may be supported for all allocation types for all devices. If a memory advice hint is not
        supported by the device it will be ignored. Memory advice hints may only be supported at a device-specific granularity, such as at a page boundary. In
        this case, the memory range may be expanded such that the start and end of the range satisfy the granularity requirements.
        """,

        cl_command_queue(
            "command_queue",
            """
            a valid host command queue.

            The memory advice hints will be queued for the device associated with {@code command_queue}.
            """
        ),
        void.const.p("ptr", "a pointer to the start of the shared Unified Shared Memory allocation"),
        AutoSize("ptr")..size_t("size", "the size of the memory region"),
        cl_mem_advice_intel("advice", "a bit-field describing the memory advice hints for the region"),
        NEWL,
        EWL,
        EVENT,

        returnDoc =
        """
        #SUCCESS if the command is queued successfully. Otherwise, it will return one of the following errors:
        ${ul(
            "#INVALID_COMMAND_QUEUE if {@code command_queue} is not a valid host command-queue.",
            "#INVALID_CONTEXT if the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.",
            "#INVALID_VALUE if {@code advice} is not supported advice for the device associated with {@code command_queue}.",
            """
            #INVALID_EVENT_WAIT_LIST if {@code event_wait_list} is #NULL and {@code num_events_in_wait_list} is greater than zero, or if
            {@code event_wait_list} is not #NULL and {@code num_events_in_wait_list} is zero, or if event objects in {@code event_wait_list} are not valid
            events.
            """,
            OORE,
            OOHME
        )}
        """
    )
}