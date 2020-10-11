/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val CL20 = "CL20".nativeClassCL("CL20") {
    extends = CL12
    documentation = "The core OpenCL 2.0 functionality."

    IntConstant(
        "OpenCL Version.",

        "VERSION_2_0".."1"
    )

    IntConstant(
        "Error Codes",

        "INVALID_PIPE_SIZE".."-69",
        "INVALID_DEVICE_QUEUE".."-70"
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_command_queue_properties} value.

        Describes the on host command-queue properties supported by the device. This is a bitfield that describes one or more of the following values:
        ${ul(
            "#QUEUE_OUT_OF_ORDER_EXEC_MODE_ENABLE",
            "#QUEUE_PROFILING_ENABLE"
        )}
        The mandated minimum capability is: {@code CL_QUEUE_PROFILING_ENABLE}.
        """,

        "DEVICE_QUEUE_ON_HOST_PROPERTIES"..0x102A
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_uint} value.

        The row pitch alignment size in pixels for images created from a buffer. The value returned must be a power of 2. If the device does not support
        images, this value should be 0.
        """,

        "DEVICE_IMAGE_PITCH_ALIGNMENT"..0x104A
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_uint} value.

        This query should be used when an image is created from a buffer which was created using #MEM_USE_HOST_PTR. The value returned must be a
        power of 2.

        This query specifies the minimum alignment in pixels of the {@code host_ptr} specified to #CreateBuffer(). If the device does not support
        images, this value should be 0.
        """,

        "DEVICE_IMAGE_BASE_ADDRESS_ALIGNMENT"..0x104B
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_uint} value.

        Max number of image objects arguments of a kernel declared with the {@code write_only} or {@code read_write} qualifier.

        Support for read-write image arguments is required for an OpenCL 2.0, 2.1, or 2.2 device if #DEVICE_IMAGE_SUPPORT is #TRUE.

        The minimum value is 64 if the device supports read-write images arguments, and must be 0 for devices that do not support read-write images.
        """,

        "DEVICE_MAX_READ_WRITE_IMAGE_ARGS"..0x104C
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code size_t} value.

        The maximum number of bytes of storage that may be allocated for any single variable in program scope or inside a function in an OpenCL kernel language
        declared in the global address space.

        Support for program scope global variables is required for an OpenCL 2.0, 2.1, or 2.2 device. The minimum value is 64 KB if the device supports program
        scope global variables, and must be 0 for devices that do not support program scope global variables.
        """,

        "DEVICE_MAX_GLOBAL_VARIABLE_SIZE"..0x104D
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_command_queue_properties} value.

        Describes the on device command-queue properties supported by the device. This is a bitfield that describes one or more of the following values:
        ${ul(
            "#QUEUE_OUT_OF_ORDER_EXEC_MODE_ENABLE",
            "#QUEUE_PROFILING_ENABLE"
        )}

        Support for on-device queues is required for an OpenCL 2.0, 2.1, or 2.2 device. When on-device queues are supported, the mandated minimum capability
        is:
        ${codeBlock("""
        CL_QUEUE_OUT_OF_ORDER_EXEC_MODE_ENABLE |
        CL_QUEUE_PROFILING_ENABLE.    
        """)}
        Must be 0 for devices that do not support on-device queues.
        """,

        "DEVICE_QUEUE_ON_DEVICE_PROPERTIES"..0x104E
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_uint} value.

        The preferred size of the device queue, in bytes. Applications should use this size for the device queue to ensure good performance.

        The minimum value is 16 KB for devices supporting on-device queues, and must be 0 for devices that do not support on-device queues.
        """,

        "DEVICE_QUEUE_ON_DEVICE_PREFERRED_SIZE"..0x104F
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_uint} value.

        The maximum size of the device queue in bytes.

        The minimum value is 256 KB for the full profile and 64 KB for the embedded profile for devices supporting on-device queues, and must be 0 for devices
        that do not support on-device queues.
        """,

        "DEVICE_QUEUE_ON_DEVICE_MAX_SIZE"..0x1050
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_uint} value.

        The maximum number of device queues that can be created for this device in a single context.

        The minimum value is 1 for devices supporting on-device queues, and must be 0 for devices that do not support on-device queues.
        """,

        "DEVICE_MAX_ON_DEVICE_QUEUES"..0x1051
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_uint} value.

        The maximum number of events in use by a device queue. These refer to events returned by the {@code enqueue_} built-in functions to a device queue or
        user events returned by the {@code create_user_event} built-in function that have not been released.

        The minimum value is 1024 for devices supporting on-device queues, and must be 0 for devices that do not support on-device queues.
        """,

        "DEVICE_MAX_ON_DEVICE_EVENTS"..0x1052
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_device_svm_capabilities} value.

        Describes the various shared virtual memory (SVM) memory allocation types the device supports. This is a bit-field that describes a combination of the
        following values:
        ${ul(
            """
            #DEVICE_SVM_COARSE_GRAIN_BUFFER - Support for coarse-grain buffer sharing using #SVMAlloc(). Memory consistency is guaranteed at synchronization
            points and the host must use calls to #EnqueueMapBuffer() and #EnqueueUnmapMemObject().
            """,
            """
            #DEVICE_SVM_FINE_GRAIN_BUFFER - Support for fine-grain buffer sharing using {@code clSVMAlloc}. Memory consistency is guaranteed at synchronization
            points without need for {@code clEnqueueMapBuffer} and {@code clEnqueueUnmapMemObject}.
            """,
            """
            #DEVICE_SVM_FINE_GRAIN_SYSTEM - Support for sharing the host’s entire virtual memory including memory allocated using malloc. Memory consistency is
            guaranteed at synchronization points.
            """,
            """
            #DEVICE_SVM_ATOMICS - Support for the OpenCL 2.0 atomic operations that provide memory consistency across the host and all OpenCL devices
            supporting fine-grain SVM allocations.
            """
        )}
        The mandated minimum capability for an OpenCL 2.0, 2.1, or 2.2 device is {@code CL_DEVICE_SVM_COARSE_GRAIN_BUFFER}.

        For other device versions there is no mandated minimum capability.
        """,

        "DEVICE_SVM_CAPABILITIES"..0x1053
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code size_t} value.

        Maximum preferred total size, in bytes, of all program variables in the global address space. This is a performance hint. An implementation may place
        such variables in storage with optimized device access. This query returns the capacity of such storage. The minimum value is 0.
        """,

        "DEVICE_GLOBAL_VARIABLE_PREFERRED_TOTAL_SIZE"..0x1054
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_uint} value.

        The maximum number of pipe objects that can be passed as arguments to a kernel. The minimum value is 16 for devices supporting pipes, and must be 0 for
        devices that do not support pipes.
        """,

        "DEVICE_MAX_PIPE_ARGS"..0x1055
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_uint} value.

        The maximum number of reservations that can be active for a pipe per work-item in a kernel. A work-group reservation is counted as one reservation per
        work-item. The minimum value is 1 for devices supporting pipes, and must be 0 for devices that do not support pipes.
        """,

        "DEVICE_PIPE_MAX_ACTIVE_RESERVATIONS"..0x1056
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_uint} value.

        The maximum size of pipe packet in bytes.

        Support for pipes is required for an OpenCL 2.0, 2.1, or 2.2 device. The minimum value is 1024 bytes if the device supports pipes, and must be 0 for
        devices that do not support pipes.
        """,

        "DEVICE_PIPE_MAX_PACKET_SIZE"..0x1057
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_uint} value.

        Returns the value representing the preferred alignment in bytes for OpenCL 2.0 fine-grained SVM atomic types. This query can return 0 which indicates
        that the preferred alignment is aligned to the natural size of the type.
        """,

        "DEVICE_PREFERRED_PLATFORM_ATOMIC_ALIGNMENT"..0x1058
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_uint} value.

        Returns the value representing the preferred alignment in bytes for OpenCL 2.0 atomic types to global memory. This query can return 0 which indicates
        that the preferred alignment is aligned to the natural size of the type.
        """,

        "DEVICE_PREFERRED_GLOBAL_ATOMIC_ALIGNMENT"..0x1059
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_uint} value.

        Returns the value representing the preferred alignment in bytes for OpenCL 2.0 atomic types to local memory. This query can return 0 which indicates
        that the preferred alignment is aligned to the natural size of the type.
        """,

        "DEVICE_PREFERRED_LOCAL_ATOMIC_ALIGNMENT"..0x105A
    )

    IntConstant(
        "cl_command_queue_properties",

        "QUEUE_ON_DEVICE".."1 << 2",
        "QUEUE_ON_DEVICE_DEFAULT".."1 << 3"
    )

    IntConstant(
        "cl_device_svm_capabilities",

        "DEVICE_SVM_COARSE_GRAIN_BUFFER".."1 << 0",
        "DEVICE_SVM_FINE_GRAIN_BUFFER".."1 << 1",
        "DEVICE_SVM_FINE_GRAIN_SYSTEM".."1 << 2",
        "DEVICE_SVM_ATOMICS".."1 << 3"
    )

    IntConstant(
        """
        Accepted {@code cl_uint} value for the {@code properties} parameter to #CreateCommandQueueWithProperties().

        Specifies the size of the device queue in bytes.

        This can only be specified if #QUEUE_ON_DEVICE is set in #QUEUE_PROPERTIES. This must be a value &le; #DEVICE_QUEUE_ON_DEVICE_MAX_SIZE.

        For best performance, this should be &le; #DEVICE_QUEUE_ON_DEVICE_PREFERRED_SIZE.

        If {@code CL_QUEUE_SIZE} is not specified, the device queue is created with {@code CL_DEVICE_QUEUE_ON_DEVICE_PREFERRED_SIZE} as the size of the queue.
        """,

        "QUEUE_SIZE"..0x1094
    )

    IntConstant(
        """
        SVM memory flag accepted by #SVMAlloc().
        
        This specifies that the application wants the OpenCL implementation to do a fine-grained allocation.
        """,

        "MEM_SVM_FINE_GRAIN_BUFFER".."1 << 10"
    )

    IntConstant(
        """
        SVM memory flag accepted by #SVMAlloc().
        
        This flag is valid only if #MEM_SVM_FINE_GRAIN_BUFFER is specified in flags. It is used to indicate that SVM atomic operations can control visibility
        of memory accesses in this SVM buffer.
        """,

        "MEM_SVM_ATOMICS".."1 << 11"
    )

    IntConstant(
        """
        This flag is only used by #GetSupportedImageFormats() to query image formats that may be both read from and written to by the same kernel instance. To
        create a memory object that may be read from and written to use #MEM_READ_WRITE.
        """,

        "MEM_KERNEL_READ_AND_WRITE".."1 << 12"
    )

    IntConstant(
        "cl_mem_object_type",

        "MEM_OBJECT_PIPE"..0x10F7
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetMemObjectInfo(), returns a {@code cl_bool} value.

        Return #TRUE if {@code memobj} is a buffer object that was created with #MEM_USE_HOST_PTR or is a sub-buffer object of a buffer object that was created
        with {@code CL_MEM_USE_HOST_PTR} and the {@code host_ptr} specified when the buffer object was created is a SVM pointer; otherwise returns #FALSE.
        """,

        "MEM_USES_SVM_POINTER"..0x1109
    )

    IntConstant(
        "cl_channel_order",

        "sRGB"..0x10BF,
        "sRGBx"..0x10C0,
        "sRGBA"..0x10C1,
        "sBGRA"..0x10C2,
        "ABGR"..0x10C3
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetPipeInfo(), returns a {@code cl_uint} value.

        Return pipe packet size specified when {@code pipe} is created with #CreatePipe().
        """,

        "PIPE_PACKET_SIZE"..0x1120
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetPipeInfo(), returns a {@code cl_uint} value.

        Return max. number of packets specified when {@code pipe} is created with #CreatePipe().
        """,

        "PIPE_MAX_PACKETS"..0x1121
    )

    IntConstant(
        "cl_sampler_info",

        "SAMPLER_MIP_FILTER_MODE"..0x1155,
        "SAMPLER_LOD_MIN"..0x1156,
        "SAMPLER_LOD_MAX"..0x1157
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetProgramBuildInfo(), returns a {@code size_t} value.

        The total amount of storage, in bytes, used by program variables in the global address space.
        """,

        "PROGRAM_BUILD_GLOBAL_VARIABLE_TOTAL_SIZE"..0x1185
    )

    IntConstant(
        "cl_kernel_arg_type_qualifier",

        "KERNEL_ARG_TYPE_PIPE".."1 << 3"
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #SetKernelExecInfo(), returns a {@code void*[]} value.

        SVM pointers must reference locations contained entirely within buffers that are passed to kernel as arguments, or that are passed through the
        execution information.

        Non-argument SVM buffers must be specified by passing pointers to those buffers via {@code clSetKernelExecInfo} for coarse-grain and fine-grain buffer
        SVM allocations but not for finegrain system SVM allocations.
        """,

        "KERNEL_EXEC_INFO_SVM_PTRS"..0x11B6
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #SetKernelExecInfo(), returns a {@code cl_bool} value.

        This flag indicates whether the kernel uses pointers that are fine grain system SVM allocations. These fine grain system SVM pointers may be passed as
        arguments or defined in SVM buffers that are passed as arguments to kernel.
        """,

        "KERNEL_EXEC_INFO_SVM_FINE_GRAIN_SYSTEM"..0x11B7
    )

    IntConstant(
        "cl_command_type",

        "COMMAND_SVM_FREE"..0x1209,
        "COMMAND_SVM_MEMCPY"..0x120A,
        "COMMAND_SVM_MEMFILL"..0x120B,
        "COMMAND_SVM_MAP"..0x120C,
        "COMMAND_SVM_UNMAP"..0x120D
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetEventProfilingInfo(), returns a {@code cl_ulong} value.

        A 64-bit value that describes the current device time counter in nanoseconds when the command identified by event and any child commands enqueued by
        this command on the device have finished execution.
        """,

        "PROFILING_COMMAND_COMPLETE"..0x1284
    )

    cl_command_queue(
        "CreateCommandQueueWithProperties",
        """
        Creates a host or device command-queue on a specific device.

        OpenCL objects such as memory, program and kernel objects are created using a context. Operations on these objects are performed using a command-queue.
        The command-queue can be used to queue a set of operations (referred to as commands) in order. Having multiple command-queues allows applications to
        queue multiple independent commands without requiring synchronization. Note that this should work as long as these objects are not being shared. Sharing
        of objects across multiple command-queues will require the application to perform appropriate synchronization.
        """,

        cl_context("context", "a valid OpenCL context"),
        cl_device_id(
            "device",
            """
            a device associated with context. It can either be in the list of devices specified when context is created using #CreateContext() or have the same
            device type as device type specified when context is created using #CreateContextFromType().
            """
        ),
        nullable..NullTerminated..cl_queue_properties.const.p(
            "properties",
            """
            a list of properties for the command-queue and their corresponding values. Each property name is immediately followed by the corresponding desired
            value. The list is terminated with {@code 0}. If a supported property and its value is not specified in properties, its default value will be used.
            {@code properties} can be #NULL in which case the default values for supported command-queue properties will be used.
            """,
            "#QUEUE_PROPERTIES #QUEUE_SIZE"
        ),
        ERROR_RET,

        returnDoc =
        """
        a valid non-zero command-queue and $errcode_ret is set to $SUCCESS if the command-queue is created successfully. Otherwise, it returns a #NULL value
        with one of the following error values returned in $errcode_ret:
        ${ul(
            ICE,
            "$INVALID_DEVICE if {@code device} is not a valid device or is not associated with {@code context}.",
            "$INVALID_VALUE if values specified in {@code properties} are not valid.",
            "$INVALID_QUEUE_PROPERTIES if values specified in {@code properties} are valid but are not supported by the device.",
            OORE,
            OOHME
        )}
        """
    )

    cl_mem(
        "CreatePipe",
        "Creates a pipe object.",

        cl_context("context", "a valid OpenCL context used to create the pipe object"),
        cl_mem_flags(
            "flags",
            """
            a bit-field that is used to specify allocation and usage information such as the memory arena that should be used to allocate the pipe object and
            how it will be used. If value specified for flags is 0, the default is used which is #MEM_READ_WRITE.
            """
        ),
        cl_uint("pipe_packet_size", "the size in bytes of a pipe packet"),
        cl_uint("pipe_max_packets", "the pipe capacity by specifying the maximum number of packets the pipe can hold"),
        nullable..NullTerminated..cl_pipe_properties.const.p(
            "properties",
            """
            a list of properties for the pipe and their corresponding values. Each property name is immediately followed by the corresponding desired value. The
            list is terminated with {@code 0}. In OpenCL 2.0, {@code properties} must be #NULL.
            """
        ),
        ERROR_RET,

        returnDoc =
        """
        a valid non-zero pipe object and $errcode_ret is set to $SUCCESS if the pipe object is created successfully. Otherwise, it returns a #NULL value with
        one of the following error values returned in $errcode_ret:
        ${ul(
            ICE,
            "$INVALID_VALUE if values specified in {@code flags} are invalid.",
            "$INVALID_VALUE if {@code properties} is not #NULL.",
            """
            #INVALID_PIPE_SIZE if {@code pipe_packet_size} is {@code 0} or the {@code pipe_packet_size} exceeds #DEVICE_PIPE_MAX_PACKET_SIZE
            value for all devices in {@code context} or if {@code pipe_max_packets} is {@code 0}.
            """,
            "#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for the pipe object.",
            OORE,
            OOHME
        )}
        """
    )

    cl_int(
        "GetPipeInfo",
        "Queries information specific to a pipe object.",

        cl_mem("pipe", "the pipe object being queried"),
        cl_pipe_info("param_name", "the information to query"),
        PARAM_VALUE_SIZE,
        MultiType(PointerMapping.DATA_INT)..nullable..void.p("param_value", param_value),
        PARAM_VALUE_SIZE_RET,

        returnDoc =
        """
        $SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
        ${ul(
            """
            $INVALID_VALUE if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type and
            {@code param_value} is not #NULL.
            """,
            "$INVALID_MEM_OBJECT if {@code pipe} is not a valid pipe object.",
            OORE,
            OOHME
        )}
        """
    )

    void.p(
        "SVMAlloc",
        """
        Allocates a shared virtual memory buffer (referred to as a SVM buffer) that can be shared by the host and all devices in an OpenCL context that support
        shared virtual memory.

        If #MEM_SVM_FINE_GRAIN_BUFFER is not specified, the buffer can be created as a coarse grained SVM allocation. Similarly, if
        #MEM_SVM_ATOMICS is not specified, the buffer can be created without support for the OpenCL 2.0 SVM atomic operations.

        Calling {@code SVMAlloc} does not itself provide consistency for the shared memory region. When the host can't use the SVM atomic operations, it must
        rely on OpenCL's guaranteed memory consistency at synchronization points. To initialize a buffer to be shared with a kernel, the host can create the
        buffer and use the resulting virtual memory pointer to initialize the buffer's contents.

        For SVM to be used efficiently, the host and any devices sharing a buffer containing virtual memory pointers should have the same endianness. If the
        context passed to {@code SVMAlloc} has devices with mixed endianness and the OpenCL implementation is unable to implement SVM because of that mixed
        endianness, {@code SVMAlloc} will fail and return #NULL.

        Although SVM is generally not supported for image objects, #CreateImage() may create an image from a buffer (a 1D image from a buffer
        or a 2D image from buffer) if the buffer specified in its image description parameter is a SVM buffer. Such images have a linear memory representation
        so their memory can be shared using SVM. However, fine grained sharing and atomics are not supported for image reads and writes in a kernel.

        If #CreateBuffer() is called with a pointer returned by {@code SVMAlloc} as its {@code host_ptr} argument, and
        #MEM_USE_HOST_PTR is set in its {@code flags} argument, {@code CreateBuffer} will succeed and return a valid non-zero buffer object as
        long as the {@code size} argument to {@code CreateBuffer} is no larger than the {@code size} argument passed in the original {@code SVMAlloc} call. The
        new buffer object returned has the shared memory as the underlying storage. Locations in the buffer's underlying shared memory can be operated on using,
        e.g., atomic operations if the device supports them.
        """,

        cl_context("context", "a valid OpenCL context used to create the SVM buffer"),
        cl_svm_mem_flags(
            "flags",
            "a bit-field that is used to specify allocation and usage information",
            "#MEM_READ_WRITE #MEM_WRITE_ONLY #MEM_READ_ONLY #MEM_SVM_FINE_GRAIN_BUFFER #MEM_SVM_ATOMICS"
        ),
        AutoSizeResult..size_t("size", "the size in bytes of the SVM buffer to be allocated"),
        unsigned_int(
            "alignment",
            """
            the minimum alignment in bytes that is required for the newly created buffer's memory region. It must be a power of two up to the largest data type
            supported by the OpenCL device. For the full profile, the largest data type is {@code long16}. For the embedded profile, it is {@code long16} if the
            device supports 64-bit integers; otherwise it is {@code int16}. If alignment is {@code 0}, a default alignment will be used that is equal to the
            size of largest data type supported by the OpenCL implementation.
            """
        ),

        returnDoc =
        """
        a valid non-#NULL shared virtual memory address if the SVM buffer is successfully allocated. Otherwise, like {@code malloc}, it returns a #NULL pointer
        value. {@code SVMAlloc} will fail if:
        ${ul(
            "{@code context} is not a valid context.",
            "{@code flags} does not contain #MEM_SVM_FINE_GRAIN_BUFFER but does contain #MEM_SVM_ATOMICS.",
            "Values specified in {@code flags} do not follow rules for supported values.",
            "#MEM_SVM_FINE_GRAIN_BUFFER or #MEM_SVM_ATOMICS is specified in flags and these are not supported by at least one device in context.",
            "The values specified in {@code flags} are not valid.",
            "{@code size} is {@code 0} or &gt; #DEVICE_MAX_MEM_ALLOC_SIZE value for any device in context.",
            "{@code alignment} is not a power of two or the OpenCL implementation cannot support the specified alignment for at least one device in context.",
            "There was a failure to allocate resources."
        )}
        """
    )

    void(
        "SVMFree",
        """
        Frees a shared virtual memory buffer allocated using #SVMAlloc().

        Note that {@code SVMFree} does not wait for previously enqueued commands that may be using {@code svm_pointer} to finish before freeing
        {@code svm_pointer}. It is the responsibility of the application to make sure that enqueued commands that use {@code svm_pointer} have finished before
        freeing {@code svm_pointer}. This can be done by enqueuing a blocking operation such as #Finish(), #WaitForEvents(),
        #EnqueueReadBuffer() or by registering a callback with the events associated with enqueued commands and when the last enqueued command
        has finished freeing {@code svm_pointer}.

        The behavior of using {@code svm_pointer} after it has been freed is undefined. In addition, if a buffer object is created using
        #CreateBuffer() with {@code svm_pointer}, the buffer object must first be released before the {@code svm_pointer} is freed.
        """,

        cl_context("context", "a valid OpenCL context used to create the SVM buffer"),
        Unsafe..void.p("svm_pointer", "must be the value returned by a call to #SVMAlloc(). If a #NULL pointer is passed in {@code svm_pointer}, no action occurs.")
    )

    cl_int(
        "EnqueueSVMFree",
        "Enqueues a command to free the shared virtual memory buffer allocated using #SVMAlloc() or a shared system memory pointer.",

        cl_command_queue("command_queue", "a valid host command-queue"),
        AutoSize("svm_pointers")..cl_uint("num_svm_pointers", "the number of pointers in the {@code svm_pointers} array"),
        void.p.p(
            "svm_pointers",
            """
            the shared virtual memory pointers to be freed. Each pointer in {@code svm_pointers} that was allocated using #SVMAlloc() must have been allocated
            from the same context from which {@code command_queue} was created. The memory associated with {@code svm_pointers} can be reused or freed after the
            function returns.
            """
        ),
        nullable..cl_svmfree_callback(
            "pfn_free_func",
            """
            the callback function to be called to free the SVM pointers. If pfn_free_func is #NULL, all pointers specified in {@code svm_pointers} must be
            allocated using #SVMAlloc() and the OpenCL implementation will free these SVM pointers. {@code pfn_free_func} must be a valid callback function if any
            SVM pointer to be freed is a shared system memory pointer i.e. not allocated using #SVMAlloc(). If {@code pfn_free_func} is a valid callback function,
            the OpenCL implementation will call {@code pfn_free_func} to free all the SVM pointers specified in {@code svm_pointers}.
            """
        ),
        nullable..opaque_p("user_data", "will be passed as the {@code user_data} argument when {@code pfn_free_func} is called. {@code user_data} can be #NULL."),
        NEWL,
        EWL,
        EVENT,

        returnDoc =
        """
        $SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
        ${ul(
            ICQE,
            """
            $INVALID_VALUE if {@code num_svm_pointers} is {@code 0} or if {@code svm_pointers} is #NULL or if any of the pointers specified in
            {@code svm_pointers} array is #NULL.
            """,
            IEWLE,
            OORE,
            OOHME
        )}
        """
    )

    cl_int(
        "EnqueueSVMMemcpy",
        """
        Enqueues a command to do a {@code memcpy} operation.

        If {@code dst_ptr} and/or {@code src_ptr} are allocated using #SVMAlloc() then they must be allocated from the same context from which
        {@code command_queue} was created. Otherwise the behavior is undefined.
        """,

        cl_command_queue("command_queue", "the host command-queue in which the read / write command will be queued"),
        cl_bool(
            "blocking_copy",
            """
            indicates if the copy operation is <em>blocking</em> or <em>non-blocking</em>.

            If {@code blocking_copy} is $TRUE i.e. the copy command is blocking, {@code EnqueueSVMMemcpy} does not return until the buffer data has been copied
            into memory pointed to by {@code dst_ptr}.

            If {@code blocking_copy} is $FALSE i.e. the copy command is non-blocking, {@code EnqueueSVMMemcpy} queues a non-blocking copy command and returns.
            The contents of the buffer that {@code dst_ptr} point to cannot be used until the copy command has completed. The event argument returns an event
            object which can be used to query the execution status of the read command. When the copy command has completed, the contents of the buffer that
            {@code dst_ptr} points to can be used by the application.
            """
        ),
        void.p("dst_ptr", "the pointer to a memory region where data is copied to"),
        void.const.p("src_ptr", "the pointer to a memory region where data is copied from"),
        AutoSize("src_ptr", "dst_ptr")..size_t("size", "the size in bytes of data being copied"),
        NEWL,
        EWL,
        EVENT,

        returnDoc =
        """
        $SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
        ${ul(
            ICQE,
            "$INVALID_CONTEXT if the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.",
            IEWLE,
            ESEFEIWLE("copy"),
            "$INVALID_VALUE if {@code dst_ptr} or {@code src_ptr} are #NULL.",
            "$INVALID_VALUE if {@code size} is {@code 0}.",
            "#MEM_COPY_OVERLAP if the values specified for {@code dst_ptr}, {@code src_ptr} and {@code size} result in an overlapping copy.",
            OORE,
            OOHME
        )}
        """
    )

    cl_int(
        "EnqueueSVMMemFill",
        "Enqueues a command to fill a region in memory with a pattern of a given pattern size.",

        cl_command_queue("command_queue", "the host command-queue in which the fill command will be queued"),
        void.p(
            "svm_ptr",
            """
            a pointer to a memory region that will be filled with pattern. It must be aligned to {@code pattern_size} bytes. If {@code svm_ptr} is allocated
            using #SVMAlloc() then it must be allocated from the same context from which {@code command_queue} was created. Otherwise the behavior is undefined.
            """
        ),
        void.const.p(
            "pattern",
            """
            a pointer to the data pattern of size {@code pattern_size} in bytes. {@code pattern} will be used to fill a region in buffer starting at
            {@code svm_ptr} and is {@code size} bytes in size. The data pattern must be a scalar or vector integer or floating-point data type supported by
            OpenCL. For example, if region pointed to by {@code svm_ptr} is to be filled with a pattern of float4 values, then pattern will be a pointer to a
            {@code cl_float4} value and {@code pattern_size} will be {@code sizeof(cl_float4)}. The maximum value of {@code pattern_size} is the size of the
            largest integer or floating-point vector data type supported by the OpenCL device. The memory associated with pattern can be reused or freed after
            the function returns.
            """
        ),
        AutoSize("pattern")..size_t("pattern_size", "the size of the {@code pattern} array, in bytes"),
        AutoSize("svm_ptr")..size_t("size", "the size in bytes of region being filled starting with {@code svm_ptr} and must be a multiple of {@code pattern_size}"),
        NEWL,
        EWL,
        EVENT,

        returnDoc =
        """
        $SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
        ${ul(
            ICQE,
            "$INVALID_CONTEXT if the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.",
            "$INVALID_VALUE if {@code svm_ptr} is #NULL.",
            "$INVALID_VALUE if {@code svm_ptr} is not aligned to {@code pattern_size} bytes.",
            """
            $INVALID_VALUE if {@code pattern} is #NULL or if {@code pattern_size} is {@code 0} or if {@code pattern_size} is not one of
            {@code &#123;1, 2, 4, 8, 16, 32, 64, 128&#125;}.
            """,
            "$INVALID_VALUE if {@code size} is {@code 0} or is not a multiple of {@code pattern_size}.",
            IEWLE,
            OORE,
            OOHME
        )}
        """
    )

    cl_int(
        "EnqueueSVMMap",
        """
        Enqueues a command that will allow the host to update a region of a SVM buffer. Note that since we are enqueuing a command with a SVM buffer, the region
        is already mapped in the host address space.
        """,

        cl_command_queue("command_queue", "a valid host command-queue"),
        cl_bool(
            "blocking_map",
            """
            indicates if the map operation is blocking or non-blocking.

            If {@code blocking_map} is $TRUE, {@code EnqueueSVMMap} does not return until the application can access the contents of the SVM region specified by
            {@code svm_ptr} and {@code size} on the host.

            If {@code blocking_map} is $FALSE i.e. map operation is non-blocking, the region specified by {@code svm_ptr} and {@code size} cannot be used until
            the map command has completed. The event argument returns an event object which can be used to query the execution status of the map command. When
            the map command is completed, the application can access the contents of the region specified by {@code svm_ptr} and {@code size}.
            """
        ),
        cl_map_flags("map_flags", "a bit-field"),
        void.p(
            "svm_ptr",
            """
            a pointer to a memory region and {@code size} in bytes that will be updated by the host. If {@code svm_ptr} is allocated using #SVMAlloc() then it
            must be allocated from the same context from which {@code command_queue} was created. Otherwise the behavior is undefined.
            """
        ),
        AutoSize("svm_ptr")..size_t("size", "the size of the memory region to map, in bytes"),
        NEWL,
        EWL,
        EVENT,

        returnDoc =
        """
        $SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
        ${ul(
            ICQE,
            "$INVALID_CONTEXT if context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.",
            "$INVALID_VALUE if {@code svm_ptr} is #NULL.",
            "$INVALID_VALUE if {@code size} is {@code 0} or if values specified in {@code map_flags} are not valid.",
            IEWLE,
            ESEFEIWLE("map"),
            OORE,
            OOHME
        )}
        """
    )

    cl_int(
        "EnqueueSVMUnmap",
        """
        Enqueues a command to indicate that the host has completed updating the region given by {@code svm_ptr} and which was specified in a previous call to
        #EnqueueSVMMap().
        """,

        cl_command_queue("command_queue", "a valid host command-queue"),
        Unsafe..void.p(
            "svm_ptr",
            """
            a pointer that was specified in a previous call to #EnqueueSVMMap(). If {@code svm_ptr} is allocated using #SVMAlloc() then it must be allocated from
            the same context from which {@code command_queue} was created. Otherwise the behavior is undefined.
            """
        ),
        NEWL,
        EWL,
        EVENT,

        returnDoc =
        """
        $SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
        ${ul(
            ICQE,
            "$INVALID_CONTEXT if context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.",
            "$INVALID_VALUE if {@code svm_ptr} is #NULL.",
            IEWLE,
            OORE,
            OOHME
        )}
        """
    )

    cl_int(
        "SetKernelArgSVMPointer",
        "Set a SVM pointer as the argument value for a specific argument of a kernel.",

        cl_kernel("kernel", "a valid kernel object"),
        cl_uint(
            "arg_index",
            """
            the argument index. Arguments to the kernel are referred by indices that go from {@code 0} for the leftmost argument to {@code n - 1}, where
            {@code n} is the total number of arguments declared by a kernel.
            """
        ),
        Unsafe..void.const.p(
            "arg_value",
            """
            the SVM pointer that should be used as the argument value for argument specified by {@code arg_index}. The SVM pointer specified is the value used
            by all API calls that enqueue kernel (#EnqueueNDRangeKernel()) until the argument value is changed by a call to
            {@code SetKernelArgSVMPointer} for {@code kernel}. The SVM pointer can only be used for arguments that are declared to be a pointer to global or
            constant memory. The SVM pointer value must be aligned according to the argument's type. For example, if the argument is declared to be
            {@code global float4 *p}, the SVM pointer value passed for {@code p} must be at a minimum aligned to a {@code float4}. The SVM pointer value
            specified as the argument value can be the pointer returned by #SVMAlloc() or can be a pointer + offset into the SVM region.
            """
        ),

        returnDoc =
        """
        $SUCCESS if the function was executed successfully. Otherwise, it returns one of the following errors:
        ${ul(
            "$INVALID_KERNEL if {@code kernel} is not a valid kernel object.",
            "$INVALID_ARG_INDEX if {@code arg_index} is not a valid argument index.",
            "$INVALID_ARG_VALUE if {@code arg_value} specified is not a valid value.",
            OORE,
            OOHME
        )}
        """
    )

    cl_int(
        "SetKernelExecInfo",
        """
        Can be used to pass additional information other than argument values to a kernel.

        NOTES

        1. Coarse-grain or fine-grain buffer SVM pointers used by a kernel which are not passed as a kernel arguments must be specified using
        {@code SetKernelExecInfo} with #KERNEL_EXEC_INFO_SVM_PTRS. For example, if SVM buffer A contains a pointer to another SVM buffer B, and the
        kernel dereferences that pointer, then a pointer to B must either be passed as an argument in the call to that kernel or it must be made available to
        the kernel using {@code SetKernelExecInfo}. For example, we might pass extra SVM pointers as follows:

        {@code clSetKernelExecInfo(kernel, CL_KERNEL_EXEC_INFO_SVM_PTRS, num_ptrs * sizeof(void *), extra_svm_ptr_list);}

        Here {@code num_ptrs} specifies the number of additional SVM pointers while {@code extra_svm_ptr_list} specifies a pointer to memory containing those
        SVM pointers. When calling {@code SetKernelExecInfo} with #KERNEL_EXEC_INFO_SVM_PTRS to specify pointers to non-argument SVM buffers as extra
        arguments to a kernel, each of these pointers can be the SVM pointer returned by #SVMAlloc() or can be a pointer + offset into the SVM region. It is
        sufficient to provide one pointer for each SVM buffer used.

        2. #KERNEL_EXEC_INFO_SVM_FINE_GRAIN_SYSTEM is used to indicate whether SVM pointers used by a kernel will refer to system allocations or not.

        #KERNEL_EXEC_INFO_SVM_FINE_GRAIN_SYSTEM = $FALSE indicates that the OpenCL implementation may assume that system pointers are not passed as
        kernel arguments and are not stored inside SVM allocations passed as kernel arguments.

        #KERNEL_EXEC_INFO_SVM_FINE_GRAIN_SYSTEM = $TRUE indicates that the OpenCL implementation must assume that system pointers might be passed as
        kernel arguments and/or stored inside SVM allocations passed as kernel arguments. In this case, if the device to which the kernel is enqueued does not
        support system SVM pointers, #EnqueueNDRangeKernel() will return a $INVALID_OPERATION error. If none of the devices in the context
        associated with kernel support fine-grain system SVM allocations, {@code SetKernelExecInfo} will return a $INVALID_OPERATION error.

        If {@code SetKernelExecInfo} has not been called with a value for #KERNEL_EXEC_INFO_SVM_FINE_GRAIN_SYSTEM, the default value is used for this
        kernel attribute. The default value depends on whether the device on which the kernel is enqueued supports fine-grain system SVM allocations. If so, the
        default value used is $TRUE (system pointers might be passed); otherwise, the default is $FALSE.
        """,

        cl_kernel("kernel", "the kernel object being queried"),
        cl_kernel_exec_info(
            "param_name",
            "the information to be passed to {@code kernel}",
            "#KERNEL_EXEC_INFO_SVM_PTRS #KERNEL_EXEC_INFO_SVM_FINE_GRAIN_SYSTEM"
        ),
        AutoSize("param_value")..size_t("param_value_size", "the size in bytes of the memory pointed to by {@code param_value}"),
        MultiType(PointerMapping.DATA_POINTER, PointerMapping.DATA_INT)..void.const.p("param_value", "a pointer to memory where the appropriate values determined by {@code param_name} are specified"),

        returnDoc =
        """
        $SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
        ${ul(
            "$INVALID_KERNEL if {@code kernel} is a not a valid kernel object.",
            "$INVALID_VALUE if {@code param_name} is not valid, if {@code param_value} is #NULL or if the size specified by {@code param_value_size} is not valid.",
            """
            $INVALID_OPERATION if {@code param_name} = #KERNEL_EXEC_INFO_SVM_FINE_GRAIN_SYSTEM and {@code param_value} = $TRUE but no devices in
            context associated with kernel support fine-grain system SVM allocations.
            """,
            OORE,
            OOHME
        )}
        """
    )

    cl_sampler(
        "CreateSamplerWithProperties",
        "Creates a sampler object.",

        cl_context("context", "a valid OpenCL context"),
        nullable..NullTerminated..cl_sampler_properties.const.p(
            "sampler_properties",
            """
            a list of sampler property names and their corresponding values. Each sampler property name is immediately followed by the corresponding desired
            value. The list is terminated with {@code 0}. If a supported property and its value is not specified in {@code sampler_properties}, its default
            value will be used. {@code sampler_properties} can be #NULL in which case the default values for supported sampler properties will be used.
            """
        ),
        ERROR_RET,

        returnDoc =
        """
        a valid non-zero sampler object and $errcode_ret is set to $SUCCESS if the sampler object is created successfully. Otherwise, it returns a #NULL value
        with one of the following error values returned in $errcode_ret:
        ${ul(
            ICE,
            """
            $INVALID_VALUE if the property name in {@code sampler_properties} is not a supported property name, if the value specified for a supported property
            name is not valid, or if the same property name is specified more than once.
            """,
            "$INVALID_OPERATION if images are not supported by any device associated with context.",
            OORE,
            OOHME
        )}
        """
    )
}
