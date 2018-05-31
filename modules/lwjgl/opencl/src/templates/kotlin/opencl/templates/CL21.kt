/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val CL21 = "CL21".nativeClassCL("CL21") {
    extends = CL20
    documentation = "The core OpenCL 2.1 functionality."

    IntConstant(
        "OpenCL Version.",

        "VERSION_2_1".."1"
    )

    IntConstant(
        "cl_platform_info",

        "PLATFORM_HOST_TIMER_RESOLUTION"..0x0905
    )

    IntConstant(
        "cl_device_info",

        "DEVICE_IL_VERSION"..0x105B,
        "DEVICE_MAX_NUM_SUB_GROUPS"..0x105C,
        "DEVICE_SUB_GROUP_INDEPENDENT_FORWARD_PROGRESS"..0x105D
    )

    IntConstant(
        "cl_command_queue_info",

        "QUEUE_DEVICE_DEFAULT"..0x1095
    )

    IntConstant(
        "cl_channel_type",

        "UNORM_INT_101010_2"..0x10E0
    )


    IntConstant(
        "cl_program_info",

        "PROGRAM_IL"..0x1169
    )

    val GetKernelSubGroupInfoA = IntConstant(
        "cl_kernel_info",

        "KERNEL_MAX_NUM_SUB_GROUPS"..0x11B9,
        "KERNEL_COMPILE_NUM_SUB_GROUPS"..0x11BA
    ).javaDocLinks

    val GetKernelSubGroupInfoB = IntConstant(
        "cl_kernel_sub_group_info",

        "KERNEL_MAX_SUB_GROUP_SIZE_FOR_NDRANGE"..0x2033,
        "KERNEL_SUB_GROUP_COUNT_FOR_NDRANGE"..0x2034,
        "KERNEL_LOCAL_SIZE_FOR_SUB_GROUP_COUNT"..0x11B8
    ).javaDocLinks

    cl_int(
        "SetDefaultDeviceCommandQueue",
        "Replaces a default device command queue created with #CreateCommandQueueWithProperties() and the #QUEUE_ON_DEVICE_DEFAULT flag.",

        cl_context.IN("context", "a valid OpenCL context"),
        cl_device_id.IN("device", "a OpenCL device associated with {@code context}"),
        cl_command_queue.IN("command_queue", "a valid command-queue for {@code device}"),

        returnDoc =
        """
        $SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
        ${ul(
            ICE,
            "$INVALID_DEVICE if {@code device} is not a valid device or is not associated with {@code context}.",
            ICQE,
            OORE,
            OOHME
        )}
        """
    )

    cl_int(
        "GetDeviceAndHostTimer",
        """
        Returns a reasonably synchronized pair of timestamps from the device timer and the host timer as seen by device. Implementations may need to execute
        this query with a high latency in order to provide reasonable synchronization of the timestamps. The host timestamp and device timestamp returned by
        this function and #GetHostTimer() each have an implementation defined timebase. The timestamps will always be in their respective timebases regardless
        of which query function is used. The timestamp returned from #GetEventProfilingInfo() for an event on a device and a device timestamp queried from
        the same device will always be in the same timebase.
        """,

        cl_device_id.IN("device", "a device returned by #GetDeviceIDs()"),
        Check(1)..cl_ulong.p.OUT(
            "device_timestamp",
            """
            will be updated with the value of the device timer in nanoseconds. The resolution of the timer is the same as the device profiling timer returned
            by #GetDeviceInfo() and the #DEVICE_PROFILING_TIMER_RESOLUTION query.
            """
        ),
        Check(1)..cl_ulong.p.OUT(
            "host_timestamp",
            """
            will be updated with the value of the host timer in nanoseconds at the closest possible point in time to that at which {@code device_timestamp} was
            returned. The resolution of the timer may be queried via #GetPlatformInfo() and the flag #PLATFORM_HOST_TIMER_RESOLUTION.
            """
        ),

        returnDoc =
        """
        $SUCCESS with a time value in {@code host_timestamp} if provided. Otherwise, it returns one of the following errors:
        ${ul(
            "$INVALID_DEVICE if {@code device} is not a valid OpenCL device.",
            "$INVALID_VALUE if {@code host_timestamp} or {@code device_timestamp} is #NULL.",
            OORE,
            OOHME
        )}
        """
    )

    cl_int(
        "GetHostTimer",
        """
        Returns the current value of the host clock as seen by device. This value is in the same timebase as the {@code host_timestamp} returned from
        #GetDeviceAndHostTimer(). The implementation will return with as low a latency as possible to allow a correlation with a subsequent application sampled
        time. The host timestamp and device timestamp returned by this function and #GetDeviceAndHostTimer() each have an implementation defined timebase. The
        timestamps will always be in their respective timebases regardless of which query function is used. The timestamp returned from
        #GetEventProfilingInfo() for an event on a device and a device timestamp queried from the same device will always be in the same timebase.
        """,

        cl_device_id.IN("device", "a device returned by #GetDeviceIDs()"),
        Check(1)..cl_ulong.p.OUT(
            "host_timestamp",
            """
            will be updated with the value of the current timer in nanoseconds. The resolution of the timer may be queried via #GetPlatformInfo() and the
            flag #PLATFORM_HOST_TIMER_RESOLUTION.
            """
        ),

        returnDoc =
        """
        $SUCCESS with a time value in {@code host_timestamp} if provided. Otherwise, it returns one of the following errors:
        ${ul(
            "$INVALID_DEVICE if {@code device} is not a valid OpenCL device.",
            "$INVALID_VALUE if {@code host_timestamp} is #NULL.",
            OORE,
            OOHME
        )}
        """
    )

    cl_program(
        "CreateProgramWithIL",
        "Creates a program object for a context, and loads the IL pointed to by {@code il} and with length in bytes {@code length} into the program object.",

        cl_context.IN("context", "a valid OpenCL context"),
        void.const.p.IN("il", "a pointer to a {@code length}-byte block of memory containing SPIR-V or an implementation-defined intermediate language"),
        AutoSize("il")..size_t.IN("length", "the number of bytes in {@code il}"),
        ERROR_RET,

        returnDoc =
        """
        a valid non-zero program object and {@code errcode_ret} is set to $SUCCESS if the program object is created successfully. Otherwise, it returns a #NULL
        value with one of the following error values returned in {@code errcode_ret}:
        ${ul(
            ICE,
            "$INVALID_VALUE if {@code il} is #NULL or if {@code length} is zero.",
            """
            $INVALID_VALUE if the {@code length}-byte memory pointed to by {@code il} does not contain well-formed intermediate language input that can be
            consumed by the OpenCL runtime.""",
            OORE,
            OOHME
        )}
        """
    )

    cl_kernel(
        "CloneKernel",
        """
        Makes a shallow copy of the kernel object, its arguments and any information passed to the kernel object using #SetKernelExecInfo(). If the kernel
        object was ready to be enqueued before copying it, the clone of the kernel object is ready to enqueue.

        The returned kernel object is an exact copy of {@code source_kernel}, with one caveat: the reference count on the returned kernel object is set as if
        it had been returned by #CreateKernel(). The reference count of {@code source_kernel} will not be changed.

        The resulting kernel will be in the same state as if #CreateKernel() is called to create the resultant kernel with the same arguments as those used
        to create {@code source_kernel}, the latest call to #SetKernelArg() or #SetKernelArgSVMPointer() for each argument index applied to kernel and
        the last call to #SetKernelExecInfo() for each value of the param name parameter are applied to the new kernel object.

        All arguments of the new kernel object must be intact and it may be correctly used in the same situations as kernel except those that assume a
        pre-existing reference count. Setting arguments on the new kernel object will not affect {@code source_kernel} except insofar as the argument points to
        a shared underlying entity and in that situation behavior is as if two kernel objects had been created and the same argument applied to each. Only the
        data stored in the kernel object is copied; data referenced by the kernel's arguments are not copied. For example, if a buffer or pointer argument is
        set on a kernel object, the pointer is copied but the underlying memory allocation is not.
        """,

        cl_kernel.IN(
            "source_kernel",
            "a valid {@code cl_kernel} object that will be copied. {@code source_kernel} will not be modified in any way by this function."
        ),
        ERROR_RET,

        returnDoc =
        """
        a valid non-zero kernel object and {@code errcode_ret} is set to $SUCCESS if the kernel is successfully copied. Otherwise it returns a #NULL value with
        one of the following error values returned in {@code errcode_ret}:
        ${ul(
            "$INVALID_KERNEL if {@code source_kernel} is not a valid kernel object.",
            OORE,
            OOHME
        )}
        """
    )

    cl_int(
        "GetKernelSubGroupInfo",
        "Returns information about the kernel object.",

        cl_kernel.IN("kernel", "the kernel object being queried"),
        nullable..cl_device_id.IN(
            "device",
            """
            a specific device in the list of devices associated with {@code kernel}. The list of devices is the list of devices in the OpenCL context that is
            associated with {@code kernel}. If the list of devices associated with kernel is a single device, device can be a #NULL value.
            """
        ),
        cl_kernel_sub_group_info.IN("param_name", "the information to query", "$GetKernelSubGroupInfoA $GetKernelSubGroupInfoB"),
        AutoSize("input_value")..size_t.IN("input_value_size", "the size in bytes of memory pointed to by {@code input_value}"),
        nullable..void.const.p.IN(
            "input_value",
            "a pointer to memory where the appropriate parameterization of the query is passed from. If {@code input_value} is #NULL, it is ignored."
        ),
        PARAM_VALUE_SIZE,
        MultiType(PointerMapping.DATA_POINTER)..nullable..void.p.IN("param_value", param_value),
        PARAM_VALUE_SIZE_RET,

        returnDoc =
        """
        $SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
        ${ul(
            """
            $INVALID_DEVICE if {@code device} is not in the list of devices associated with {@code kernel} or if {@code device} is #NULL but there is more than
            one device associated with {@code kernel}.
            """,
            """
            $INVALID_VALUE if {@code param_name} is not valid, or if size in bytes specified by {@code param_value} is &lt; size of return type and
            {@code param_value} is not #NULL.
            """,
            """
            $INVALID_VALUE if {@code param_name} is {@code KERNEL_SUB_GROUP_SIZE_FOR_NDRANGE} and the size in bytes specified by {@code input_value_size} is not valid
            or if {@code input_value} is #NULL.
            """,
            "$INVALID_KERNEL if {@code kernel} is not a valid kernel object.",
            OORE,
            OOHME
        )}
        """
    )

    cl_int(
        "EnqueueSVMMigrateMem",
        """
        Enqueues a command to indicate which device a set of ranges of SVM allocations should be associated with. Once the event returned by
        {@code clEnqueueSVMMigrateMem} has become #COMPLETE, the ranges specified by svm pointers and sizes have been successfully migrated to the device
        associated with command queue.

        The user is responsible for managing the event dependencies associated with this command in order to avoid overlapping access to SVM allocations.
        Improperly specified event dependencies passed to {@code clEnqueueSVMMigrateMem} could result in undefined results.
        """,

        cl_command_queue.IN(
            "command_queue",
            "a valid host command queue. The specified set of allocation ranges will be migrated to the OpenCL device associated with {@code command_queue}."
        ),
        AutoSize("svm_pointers", "sizes")..cl_uint.IN(
            "num_svm_pointers",
            """
            the number of pointers in the specified {@code svm_pointers} array, and the number of sizes in the {@code sizes} array, if {@code sizes} is not
            #NULL.
            """
        ),
        void.const.p.p.IN(
            "svm_pointers",
            "a pointer to an array of pointers. Each pointer in this array must be within an allocation produced by a call to #SVMAlloc()."
        ),
        nullable..size_t.const.p.IN(
            "sizes",
            """
            an array of sizes. The pair {@code svm_pointers[i]} and {@code sizes[i]} together define the starting address and number of bytes in a range to be
            migrated. {@code sizes} may be #NULL indicating that every allocation containing any {@code svm_pointer[i]} is to be migrated. Also, if
            {@code sizes[i]} is zero, then the entire allocation containing {@code svm_pointer[i]} is migrated.
            """
        ),
        cl_mem_migration_flags.IN("flags", "a bit-field that is used to specify migration options"),
        NEWL,
        EWL,
        EVENT,

        returnDoc =
        """
        $SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
        ${ul(
            ICQE,
            "$INVALID_CONTEXT if the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same",
            "$INVALID_VALUE if {@code num_svm_pointers} is zero or {@code svm_pointers} is #NULL.",
            """
            $INVALID_VALUE if {@code sizes[i]} is non-zero range {@code [svm_pointers[i], svm_pointers[i]+sizes[i])} is not contained within an existing
            #SVMAlloc() allocation.
            """,
            IEWLE,
            OORE,
            OOHME
        )}
        """
    )
}