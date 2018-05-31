/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

const val INVALID_IMAGE_DESCRIPTOR = "#INVALID_IMAGE_DESCRIPTOR"
const val INVALID_COMPILER_OPTIONS = "#INVALID_COMPILER_OPTIONS"
const val INVALID_LINKER_OPTIONS = "#INVALID_LINKER_OPTIONS"
const val INVALID_DEVICE_PARTITION_COUNT = "#INVALID_DEVICE_PARTITION_COUNT"

val CL12 = "CL12".nativeClassCL("CL12") {
    extends = CL11
    documentation = "The core OpenCL 1.2 functionality."

    IntConstant(
        "Error Codes.",

        "COMPILE_PROGRAM_FAILURE".."-15",
        "LINKER_NOT_AVAILABLE".."-16",
        "LINK_PROGRAM_FAILURE".."-17",
        "DEVICE_PARTITION_FAILED".."-18",
        "KERNEL_ARG_INFO_NOT_AVAILABLE".."-19",
        "INVALID_IMAGE_DESCRIPTOR".."-65",
        "INVALID_COMPILER_OPTIONS".."-66",
        "INVALID_LINKER_OPTIONS".."-67",
        "INVALID_DEVICE_PARTITION_COUNT".."-68"
    )

    IntConstant(
        "OpenCL Version.",

        "VERSION_1_2".."1"
    )

    IntConstant(
        "cl_bool",

        "BLOCKING".."CL10.CL_TRUE",
        "NON_BLOCKING".."CL10.CL_FALSE"
    )

    IntConstant(
        "cl_device_type - bitfield",

        "DEVICE_TYPE_CUSTOM".."1 << 4"
    )

    IntConstant(
        "cl_device_info",

        "DEVICE_DOUBLE_FP_CONFIG"..0x1032,
        "DEVICE_LINKER_AVAILABLE"..0x103E,
        "DEVICE_BUILT_IN_KERNELS"..0x103F,
        "DEVICE_IMAGE_MAX_BUFFER_SIZE"..0x1040,
        "DEVICE_IMAGE_MAX_ARRAY_SIZE"..0x1041,
        "DEVICE_PARENT_DEVICE"..0x1042,
        // TODO: DEVICE_PARTITION_MAX_COMPUTE_UNITS -> https://www.khronos.org/bugzilla/show_bug.cgi?id=580
        "DEVICE_PARTITION_MAX_SUB_DEVICES"..0x1043,
        "DEVICE_PARTITION_PROPERTIES"..0x1044,
        "DEVICE_PARTITION_AFFINITY_DOMAIN"..0x1045,
        "DEVICE_PARTITION_TYPE"..0x1046,
        "DEVICE_REFERENCE_COUNT"..0x1047,
        "DEVICE_PREFERRED_INTEROP_USER_SYNC"..0x1048,
        "DEVICE_PRINTF_BUFFER_SIZE"..0x1049
    )

    IntConstant(
        "cl_device_fp_config - bitfield",

        "FP_CORRECTLY_ROUNDED_DIVIDE_SQRT".."1 << 7"
    )

    IntConstant(
        "cl_context_properties",

        "CONTEXT_INTEROP_USER_SYNC"..0x1085
    )

    IntConstant(
        "cl_device_partition_property list null-terminator",

        "DEVICE_PARTITION_BY_COUNTS_LIST_END"..0x0
    )

    IntConstant(
        """
        Split the aggregate device into as many smaller aggregate devices as can be created, each containing {@code n} compute units. The value {@code n} is
        passed as the value accompanying this property. If {@code n} does not divide evenly into {@code DEVICE_PARTITION_MAX_COMPUTE_UNITS}, then the
        remaining compute units are not used.
        """,

        "DEVICE_PARTITION_EQUALLY"..0x1086
    )

    IntConstant(
        """
        This property is followed by a #DEVICE_PARTITION_BY_COUNTS_LIST_END terminated list of compute unit counts. For each nonzero count {@code m}
        in the list, a sub-device is created with {@code m} compute units in it.

        The number of non-zero count entries in the list may not exceed #DEVICE_PARTITION_MAX_SUB_DEVICES.

        The total number of compute units specified may not exceed {@code DEVICE_PARTITION_MAX_COMPUTE_UNITS}.
        """,

        "DEVICE_PARTITION_BY_COUNTS"..0x1087
    )

    IntConstant(
        """
        Split the device into smaller aggregate devices containing one or more compute units that all share part of a cache hierarchy. The value accompanying
        this property may be drawn from the following list:
        ${ul(
            "#DEVICE_AFFINITY_DOMAIN_NUMA &ndash; Split the device into sub-devices comprised of compute units that share a NUMA node.",
            "#DEVICE_AFFINITY_DOMAIN_L4_CACHE &ndash; Split the device into sub-devices comprised of compute units that share a level 4 data cache.",
            "#DEVICE_AFFINITY_DOMAIN_L3_CACHE &ndash; Split the device into sub-devices comprised of compute units that share a level 3 data cache.",
            "#DEVICE_AFFINITY_DOMAIN_L2_CACHE &ndash; Split the device into sub-devices comprised of compute units that share a level 2 data cache.",
            "#DEVICE_AFFINITY_DOMAIN_L1_CACHE &ndash; Split the device into sub-devices comprised of compute units that share a level 1 data cache.",
            """
            #DEVICE_AFFINITY_DOMAIN_NEXT_PARTITIONABLE &ndash; Split the device along the next partitionable affinity domain. The implementation
            shall find the first level along which the device or sub-device may be further subdivided in the order NUMA, L4, L3, L2, L1, and partition the
            device into sub-devices comprised of compute units that share memory subsystems at this level.
            """
        )}
        The user may determine what happened by calling #GetDeviceInfo()(#DEVICE_PARTITION_TYPE) on the sub-devices.
        """,

        "DEVICE_PARTITION_BY_AFFINITY_DOMAIN"..0x1088
    )

    IntConstant(
        "cl_device_affinity_domain",

        "DEVICE_AFFINITY_DOMAIN_NUMA".."1 << 0",
        "DEVICE_AFFINITY_DOMAIN_L4_CACHE".."1 << 1",
        "DEVICE_AFFINITY_DOMAIN_L3_CACHE".."1 << 2",
        "DEVICE_AFFINITY_DOMAIN_L2_CACHE".."1 << 3",
        "DEVICE_AFFINITY_DOMAIN_L1_CACHE".."1 << 4",
        "DEVICE_AFFINITY_DOMAIN_NEXT_PARTITIONABLE".."1 << 5"
    )

    IntConstant(
        "cl_mem_flags - bitfield",

        "MEM_HOST_WRITE_ONLY".."1 << 7",
        "MEM_HOST_READ_ONLY".."1 << 8",
        "MEM_HOST_NO_ACCESS".."1 << 9"
    )

    val MigrationFlags = IntConstant(
        "cl_mem_migration_flags - bitfield",

        "MIGRATE_MEM_OBJECT_HOST".."1 << 0",
        "MIGRATE_MEM_OBJECT_CONTENT_UNDEFINED".."1 << 1"
    ).javaDocLinks

    IntConstant(
        "cl_mem_object_type",

        "MEM_OBJECT_IMAGE2D_ARRAY"..0x10F3,
        "MEM_OBJECT_IMAGE1D"..0x10F4,
        "MEM_OBJECT_IMAGE1D_ARRAY"..0x10F5,
        "MEM_OBJECT_IMAGE1D_BUFFER"..0x10F6
    )

    IntConstant(
        "cl_image_info",

        "IMAGE_ARRAY_SIZE"..0x1117,
        "IMAGE_BUFFER"..0x1118,
        "IMAGE_NUM_MIP_LEVELS"..0x1119,
        "IMAGE_NUM_SAMPLES"..0x111A
    )

    IntConstant(
        "cl_map_flags - bitfield",

        "MAP_WRITE_INVALIDATE_REGION".."1 << 2"
    )

    IntConstant(
        "cl_program_info",

        "PROGRAM_NUM_KERNELS"..0x1167,
        "PROGRAM_KERNEL_NAMES"..0x1168
    )

    IntConstant(
        "cl_program_build_info",

        "PROGRAM_BINARY_TYPE"..0x1184
    )

    IntConstant(
        "cl_program_binary_type",

        "PROGRAM_BINARY_TYPE_NONE"..0x0,
        "PROGRAM_BINARY_TYPE_COMPILED_OBJECT"..0x1,
        "PROGRAM_BINARY_TYPE_LIBRARY"..0x2,
        "PROGRAM_BINARY_TYPE_EXECUTABLE"..0x4
    )

    IntConstant(
        "cl_kernel_info",

        "KERNEL_ATTRIBUTES"..0x1195
    )

    val KernelArgInfo = IntConstant(
        "cl_kernel_arg_info",

        "KERNEL_ARG_ADDRESS_QUALIFIER"..0x1196,
        "KERNEL_ARG_ACCESS_QUALIFIER"..0x1197,
        "KERNEL_ARG_TYPE_NAME"..0x1198,
        "KERNEL_ARG_TYPE_QUALIFIER"..0x1999,
        "KERNEL_ARG_NAME"..0x119A
    ).javaDocLinks

    IntConstant(
        "cl_kernel_arg_address_qualifier",

        "KERNEL_ARG_ADDRESS_GLOBAL"..0x119A,
        "KERNEL_ARG_ADDRESS_LOCAL"..0x119B,
        "KERNEL_ARG_ADDRESS_CONSTANT"..0x119C,
        "KERNEL_ARG_ADDRESS_PRIVATE"..0x119D
    )

    IntConstant(
        "cl_kernel_arg_access_qualifier",

        "KERNEL_ARG_ACCESS_READ_ONLY"..0x11A0,
        "KERNEL_ARG_ACCESS_WRITE_ONLY"..0x11A1,
        "KERNEL_ARG_ACCESS_READ_WRITE"..0x11A2,
        "KERNEL_ARG_ACCESS_NONE"..0x11A3
    )

    IntConstant(
        "cl_kernel_arg_type_qualifier",

        "KERNEL_ARG_TYPE_NONE".."0",
        "KERNEL_ARG_TYPE_CONST".."1 << 0",
        "KERNEL_ARG_TYPE_RESTRICT".."1 << 1",
        "KERNEL_ARG_TYPE_VOLATILE".."1 << 2"
    )

    IntConstant(
        "cl_kernel_work_group_info",

        "KERNEL_GLOBAL_WORK_SIZE"..0x11B5
    )

    IntConstant(
        "cl_command_type",

        "COMMAND_BARRIER"..0x1205,
        "COMMAND_MIGRATE_MEM_OBJECTS"..0x1206,
        "COMMAND_FILL_BUFFER"..0x1207,
        "COMMAND_FILL_IMAGE"..0x1208
    )

    opaque_p(
        "GetExtensionFunctionAddressForPlatform",
        """
        Returns the address of the extension function named by {@code funcname} for a given {@code platform}. The pointer returned should be cast to a function
        pointer type matching the extension function's definition defined in the appropriate extension specification and header file. A return value of #NULL
        indicates that the specified function does not exist for the implementation or platform is not a valid platform. A non-#NULL return value for
        {@code clGetExtensionFunctionAddressForPlatform} does not guarantee that an extension function is actually supported by the platform. The application
        must also make a corresponding query using ${code("clGetPlatformInfo(platform, CL_PLATFORM_EXTENSIONS, &hellip; )")} or
        ${code("clGetDeviceInfo(device, CL_DEVICE_EXTENSIONS, &hellip; )")} to determine if an extension is supported by the OpenCL implementation.

        {@code clGetExtensionFunctionAddressForPlatform} may not be queried for core (non-extension) functions in OpenCL. For functions that are queryable with
        {@code clGetExtensionFunctionAddressForPlatform}, implementations may choose to also export those functions statically from the object libraries
        implementing those functions. However, portable applications cannot rely on this behavior.
        """,

        cl_platform_id.IN("platform", "the platform to query"),
        cl_charASCII.const.p.IN("funcname", "the extension function name")
    )

    cl_int(
        "RetainDevice",
        """
        Increments the device reference count if {@code device} is a valid sub-device created by a call to #CreateSubDevices(). If {@code device} is a
        root level device i.e. a {@code cl_device_id} returned by #GetDeviceIDs(), the device reference count remains unchanged.
        """,

        cl_device_id.IN("device", "the device to retain"),

        returnDoc =
        """
        $SUCCESS if the function is executed successfully or the device is a root-level device. Otherwise, it returns one of the following errors:
        ${ul(
            "$INVALID_DEVICE if {@code device} is not a valid sub-device created by a call to #CreateSubDevices().",
            OORE,
            OOHME
        )}
        """
    )

    cl_int(
        "ReleaseDevice",
        """
        Decrements the device reference count if {@code device} is a valid sub-device created by a call to #CreateSubDevices(). If {@code device} is a
        root level device i.e. a {@code cl_device_id} returned by #GetDeviceIDs(), the device reference count remains unchanged.

        After the {@code device} reference count becomes zero and all the objects attached to {@code device} (such as command-queues) are released, the device
        object is deleted.
        """,

        cl_device_id.IN("device", "the device to release"),

        returnDoc =
        """
        $SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
        ${ul(
            "$INVALID_DEVICE if {@code device} is not a valid sub-device created by a call to #CreateSubDevices().",
            OORE,
            OOHME
        )}
        """
    )

    cl_int(
        "CreateSubDevices",
        """
        Creates an array of sub-devices that each reference a non-intersecting set of compute units within {@code in_device}, according to a partition scheme
        given by {@code properties}. The output sub-devices may be used in every way that the root (or parent) device can be used, including creating contexts,
        building programs, further calls to {@code clCreateSubDevices} and creating command-queues. When a command-queue is created against a sub-device, the
        commands enqueued on the queue are executed only on the sub-device.

        A few examples that describe how to specify partition properties in {@code properties} argument to {@code clCreateSubDevices} are given below:
        ${ul(
            """
            To partition a device containing 16 compute units into two sub-devices, each containing 8 compute units, pass the following in {@code properties}:<br>
            [ #DEVICE_PARTITION_EQUALLY, 8, 0 ]
            """,
            """
            To partition a device with four compute units into two sub-devices with one sub-device containing 3 compute units and the other sub-device 1 compute
            unit, pass the following in {@code properties} argument:<br>
            [ #DEVICE_PARTITION_BY_COUNTS, 3, 1, #DEVICE_PARTITION_BY_COUNTS_LIST_END, 0 ]
            """,
            """
            To split a device along the outermost cache line (if any), pass the following in {@code properties} argument:<br>
            [ #DEVICE_PARTITION_BY_AFFINITY_DOMAIN, #DEVICE_AFFINITY_DOMAIN_NEXT_PARTITIONABLE, 0 ]
            """
        )}
        """,

        cl_device_id.IN("in_device", "the device to be partitioned"),
        NullTerminated..cl_device_partition_property.const.p.IN(
            "properties",
            """
            specifies how {@code in_device} is to be partition described by a partition name and its corresponding value. Each partition name is immediately
            followed by the corresponding desired value. The list is terminated with 0. Only one partitioning scheme can be specified in {@code properties}.
            """,
            "#DEVICE_PARTITION_EQUALLY #DEVICE_PARTITION_BY_COUNTS #DEVICE_PARTITION_BY_AFFINITY_DOMAIN"
        ),
        AutoSize("out_devices")..cl_uint.IN(
            "num_devices",
            "the size of memory pointed to by {@code out_devices} specified as the number of {@code cl_device_id} entries."
        ),
        nullable..cl_device_id.p.OUT(
            "out_devices",
            """
            the buffer where the OpenCL sub-devices will be returned. If {@code out_devices} is #NULL, this argument is ignored. If {@code out_devices} is not
            #NULL, {@code num_devices} must be greater than or equal to the number of sub-devices that device may be partitioned into according to the
            partitioning scheme specified in {@code properties}.
            """
        ),
        Check(1)..nullable..cl_uint.p.OUT(
            "num_devices_ret",
            """
            the number of sub-devices that device may be partitioned into according to the partitioning scheme specified in {@code properties}. If {@code num_devices_ret}
            is #NULL, it is ignored.
            """
        ),

        returnDoc =
        """
        $SUCCESS if the partition is created successfully. Otherwise, it returns a #NULL value with the following error values returned in $errcode_ret:
        ${ul(
            "$INVALID_DEVICE if {@code in_device} is not valid.",
            """
            $INVALID_VALUE if values specified in {@code properties} are not valid or if values specified in {@code properties} are valid but not
            supported by the device.
            """,
            """
            $INVALID_VALUE if {@code out_devices} is not #NULL and {@code num_devices} is less than the number of sub-devices created by the
            partition scheme.
            """,
            "#DEVICE_PARTITION_FAILED if the partition name is supported by the implementation but {@code in_device} could not be further partitioned.",
            """
            $INVALID_DEVICE_PARTITION_COUNT if the partition name specified in {@code properties} is #DEVICE_PARTITION_BY_COUNTS and the
            number of sub-devices requested exceeds #DEVICE_PARTITION_MAX_SUB_DEVICES or the total number of compute units requested exceeds
            {@code DEVICE_PARTITION_MAX_COMPUTE_UNITS} for {@code in_device}, or the number of compute units requested for one or more sub-devices is less
            than zero or the number of sub-devices requested exceeds {@code DEVICE_PARTITION_MAX_COMPUTE_UNITS} for {@code in_device}.
            """,
            OORE,
            OOHME
        )}
        """
    )

    cl_mem(
        "CreateImage",
        """
        Creates a 1D image, 1D image buffer, 1D image array, 2D image, 2D image array or 3D image object.

        For a 3D image or 2D image array, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent 2D image slices or 2D images
        respectively. Each 2D image is a linear sequence of adjacent scanlines. Each scanline is a linear sequence of image elements.

        For a 2D image, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent scanlines. Each scanline is a linear sequence of
        image elements.

        For a 1D image array, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent 1D images respectively. Each 1D image or
        1D image buffer is a single scanline which is a linear sequence of adjacent elements.
        """,

        cl_context.IN("context", "a valid OpenCL context on which the image object is to be created"),
        cl_mem_flags.IN(
            "flags",
            """
            a bit-field that is used to specify allocation and usage information about the image memory object being created.

            For all image types except #MEM_OBJECT_IMAGE1D_BUFFER, if value specified for {@code flags} is 0, the default is used which is
            #MEM_READ_WRITE.

            For #MEM_OBJECT_IMAGE1D_BUFFER image type, if the #MEM_READ_WRITE, #MEM_READ_ONLY or #MEM_WRITE_ONLY
            values are not specified in {@code flags}, they are inherited from the corresponding memory access qualifers associated with buffer. The
            #MEM_USE_HOST_PTR, #MEM_ALLOC_HOST_PTR and #MEM_COPY_HOST_PTR values cannot be specified in {@code flags}
            but are inherited from the corresponding memory access qualifiers associated with buffer. If #MEM_COPY_HOST_PTR is specified in the
            memory access qualifier values associated with buffer it does not imply any additional copies when the sub-buffer is created from buffer. If the
            #MEM_HOST_WRITE_ONLY, #MEM_HOST_READ_ONLY or #MEM_HOST_NO_ACCESS values are not specified in {@code flags}, they
            are inherited from the corresponding memory access qualifiers associated with buffer.
            """,
            """
            #MEM_READ_WRITE #MEM_WRITE_ONLY #MEM_READ_ONLY #MEM_USE_HOST_PTR #MEM_ALLOC_HOST_PTR #MEM_COPY_HOST_PTR #MEM_HOST_WRITE_ONLY
            #MEM_HOST_READ_ONLY #MEM_HOST_NO_ACCESS
            """
        ),
        cl_image_format.const.p.IN(
            "image_format",
            "a pointer to a ##CLImageFormat structure that describes format properties of the image to be allocated"
        ),
        cl_image_desc.const.p.IN(
            "image_desc",
            "a pointer to a ##CLImageDesc structure that describes type and dimensions of the image to be allocated"
        ),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT
        )..Unsafe..nullable..void.p.IN(
            "host_ptr",
            """
            a pointer to the image data that may already be allocated by the application. Refer to table below for a description of how large the buffer that
            {@code host_ptr} points to must be.
            ${table(
                tr(th("ImageType"), th("Size of buffer that {@code host_ptr} points to")),

                tr(td("#MEM_OBJECT_IMAGE1D"), td("&#x2265; {@code image_row_pitch}")),
                tr(td("#MEM_OBJECT_IMAGE1D_BUFFER"), td("&#x2265; {@code image_row_pitch}")),
                tr(td("#MEM_OBJECT_IMAGE2D"), td("&#x2265; {@code image_row_pitch * image_height}")),
                tr(td("#MEM_OBJECT_IMAGE3D"), td("&#x2265; {@code image_slice_pitch * image_depth}")),
                tr(td("#MEM_OBJECT_IMAGE1D_ARRAY"), td("&#x2265; {@code image_slice_pitch * image_array_size}")),
                tr(td("#MEM_OBJECT_IMAGE2D_ARRAY"), td("&#x2265; {@code image_slice_pitch * image_array_size}"))
            )}
            """
        ),
        ERROR_RET,

        returnDoc =
        """
        a valid non-zero image object and the $errcode_ret is set to $SUCCESS if the image object is created successfully. Otherwise, it returns a #NULL
        value with one of the following error values returned in $errcode_ret:
        ${ul(
            ICE,
            "$INVALID_VALUE if values specified in {@code flags} are not valid.",
            "#INVALID_IMAGE_FORMAT_DESCRIPTOR if values specified in {@code image_format} are not valid or if {@code image_format} is #NULL.",
            """
            #INVALID_IMAGE_FORMAT_DESCRIPTOR if a 2D image is created from a buffer and the row pitch and base address alignment does not follow the rules
            described for creating a 2D image from a buffer.
            """,
            "#INVALID_IMAGE_FORMAT_DESCRIPTOR if a 2D image is created from a 2D image object and the rules described above are not followed.",
            "#INVALID_IMAGE_DESCRIPTOR if values specified in {@code image_desc} are not valid or if {@code image_desc} is #NULL.",
            "#INVALID_IMAGE_SIZE if image dimensions specified in {@code image_desc} exceed the maximum image dimensions for all devices in context.",
            """
            $INVALID_HOST_PTR if {@code host_ptr} is #NULL and #MEM_USE_HOST_PTR or #MEM_COPY_HOST_PTR are set in flags or if {@code host_ptr} is not
            #NULL but #MEM_COPY_HOST_PTR or #MEM_USE_HOST_PTR are not set in flags.
            """,
            """
            #INVALID_VALUE if an image buffer is being created and the buffer object was created with #MEM_WRITE_ONLY and flags specifies
            #MEM_READ_WRITE or #MEM_READ_ONLY, or if the buffer object was created with #MEM_READ_ONLY and flags specifies #MEM_READ_WRITE or
            #MEM_WRITE_ONLY, or if flags specifies #MEM_USE_HOST_PTR or #MEM_ALLOC_HOST_PTR or #MEM_COPY_HOST_PTR.
            """,
            """
            #INVALID_VALUE if an image buffer is being created or an image is being created from another memory object (image or buffer) and the
            {@code mem_object} object was created with #MEM_HOST_WRITE_ONLY and flags specifies #MEM_HOST_READ_ONLY, or if {@code mem_object} was created with
            #MEM_HOST_READ_ONLY and flags specifies #MEM_HOST_WRITE_ONLY, or if {@code mem_object} was created with #MEM_HOST_NO_ACCESS and flags specifies
            #MEM_HOST_READ_ONLY or #MEM_HOST_WRITE_ONLY.
            """,
            "#IMAGE_FORMAT_NOT_SUPPORTED if the {@code image_format} is not supported.",
            "#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for image object.",
            "#INVALID_OPERATION if there are no devices in context that support images.",
            OORE,
            OOHME
        )}
        """
    )

    cl_program(
        "CreateProgramWithBuiltInKernels",
        "Creates a program object for a context, and loads the information related to the built-in kernels into a program object.",

        cl_context.IN("context", "a valid OpenCL context"),
        AutoSize("device_list")..cl_uint.IN("num_devices", "the number of devices listed in {@code device_list}"),
        SingleValue("device")..cl_device_id.const.p.IN(
            "device_list",
            """
            a pointer to a list of devices that are in {@code context}. {@code device_list} must be a non-#NULL value. The built-in kernels are loaded for
            devices specified in this list.

            The devices associated with the program object will be the list of devices specified by {@code device_list}. The list of devices specified by
            {@code device_list} must be devices associated with {@code context}.
            """
        ),
        cl_charASCII.const.p.IN("kernel_names", "a semi-colon separated list of built-in kernel names"),
        ERROR_RET,

        returnDoc =
        """
        a valid non-zero program object and $errcode_ret is set to $SUCCESS if the program object is created successfully. Otherwise, it returns a #NULL
        value with one of the following error values returned in $errcode_ret:
        ${ul(
            ICE,
            "$INVALID_VALUE if {@code device_list} is #NULL or {@code num_devices} is zero.",
            """
            $INVALID_VALUE if {@code kernel_names} is #NULL or {@code kernel_names} contains a kernel name that is not supported by any of the
            devices in {@code device_list}.
            """,
            "$INVALID_DEVICE if devices listed in {@code device_list} are not in the list of devices associated with {@code context}.",
            OORE,
            OOHME
        )}
        """
    )

    cl_int(
        "CompileProgram",
        """
        Compiles a program's source for all the devices or a specific device(s) in the OpenCL context associated with {@code program}. The pre-processor runs
        before the program sources are compiled. The compiled binary is built for all devices associated with {@code program} or the list of devices specified.
        The compiled binary can be queried using #GetProgramInfo()(program, #PROGRAM_BINARIES, &hellip;) and can be specified
        to #CreateProgramWithBinary() to create a new program object.
        """,

        cl_program.IN("program", "the program object that is the compilation target"),
        AutoSize("device_list")..cl_uint.IN("num_devices", "the number of devices listed in {@code device_list}"),
        nullable..cl_device_id.const.p.IN(
            "device_list",
            """
            a pointer to a list of devices associated with {@code program}. If {@code device_list} is a #NULL value, the compile is performed for all devices
            associated with program. If {@code device_list} is a non-#NULL value, the compile is performed for devices specified in this list.
            """
        ),
        cl_charASCII.const.p.IN(
            "options",
            "a pointer to a null-terminated string of characters that describes the compilation options to be used for building the program executable"
        ),
        AutoSize("input_headers", "header_include_names")..cl_uint.IN(
            "num_input_headers",
            "the number of programs that describe headers in the array referenced by {@code input_headers}"
        ),
        nullable..cl_program.const.p.IN(
            "input_headers",
            "an array of program embedded headers created with #CreateProgramWithSource()"
        ),
        nullable..cl_charASCII.const.p.p.IN(
            "header_include_names",
            """
            an array that has a one to one correspondence with {@code input_headers}. Each entry in {@code header_include_names} specifies the include name used
            by source in program that comes from an embedded header. The corresponding entry in {@code input_headers} identifies the program object which
            contains the header source to be used. The embedded headers are first searched before the headers in the list of directories specified by the –I
            compile option. If multiple entries in {@code header_include_names} refer to the same header name, the first one encountered will be used.
            """
        ),
        nullable..cl_program_callback.IN(
            "pfn_notify",
            """
            a function pointer to a notification routine. The notification routine is a callback function that an application can register and which will be
            called when the program executable has been built (successfully or unsuccessfully).

            If {@code pfn_notify} is not #NULL, {@code clCompileProgram} does not need to wait for the compiler to complete and can return immediately once the
            compilation can begin. The compilation can begin if the context, program whose sources are being compiled, list of devices, input headers, programs
            that describe input headers and compiler options specified are all valid and appropriate host and device resources needed to perform the compile are
            available.

            If {@code pfn_notify} is #NULL, {@code clCompileProgram} does not return until the compiler has completed. This callback function may be called
            asynchronously by the OpenCL implementation. It is the application's responsibility to ensure that the callback function is thread-safe.
            """
        ),
        nullable..opaque_p.IN("user_data", "will be passed as an argument when {@code pfn_notify} is called. {@code user_data} can be #NULL."),

        returnDoc =
        """
        $SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
        ${ul(
            "$INVALID_PROGRAM if {@code program} is not a valid program object.",
            """
            $INVALID_VALUE if {@code device_list} is #NULL and {@code num_devices} is greater than zero, or if {@code device_list} is not #NULL
            and {@code num_devices} is zero.
            """,
            """
            $INVALID_VALUE if {@code num_input_headers} is zero and {@code header_include_names} or {@code input_headers} are not #NULL or if
            {@code num_input_headers} is not zero and {@code header_include_names} or {@code input_headers} are #NULL.
            """,
            "$INVALID_VALUE if {@code pfn_notify} is #NULL but {@code user_data} is not #NULL.",
            "$INVALID_DEVICE if OpenCL devices listed in {@code device_list} are not in the list of devices associated with program.",
            "$INVALID_COMPILER_OPTIONS if the compiler options specified by options are invalid.",
            """
            $INVALID_OPERATION if the compilation or build of a program executable for any of the devices listed in {@code device_list} by a
            previous call to {@code clCompileProgram} or #BuildProgram() for program has not completed.
            """,
            "#COMPILER_NOT_AVAILABLE if a compiler is not available i.e. #DEVICE_COMPILER_AVAILABLE is set to $FALSE.",
            """
            #COMPILE_PROGRAM_FAILURE if there is a failure to compile the program source. This error will be returned if {@code clCompileProgram}
            does not return until the compile has completed.
            """,
            "$INVALID_OPERATION if there are kernel objects attached to {@code program}.",
            "$INVALID_OPERATION if {@code program} has no source i.e. it has not been created with #CreateProgramWithSource().",
            OORE,
            OOHME
        )}
        """
    )

    cl_program(
        "LinkProgram",
        """
        Links a set of compiled program objects and libraries for all the devices or a specific device(s) in the OpenCL context and creates an executable.
        {@code clLinkProgram} creates a new program object which contains this executable. The executable binary can be queried using
        #GetProgramInfo()(program, #PROGRAM_BINARIES, &hellip;) and can be specified to #CreateProgramWithBinary() to
        create a new program object.

        The devices associated with the returned program object will be the list of devices specified by {@code device_list} or if {@code device_list} is #NULL
        it will be the list of devices associated with context.
        """,

        cl_context.IN("context", "a valid OpenCL context"),
        AutoSize("device_list")..cl_uint.IN("num_devices", "the number of devices listed in {@code device_list}"),
        nullable..cl_device_id.const.p.IN(
            "device_list",
            """
            a pointer to a list of devices that are in {@code context}. If {@code device_list} is a #NULL value, the link is performed for all devices
            associated with {@code context} for which a compiled object is available. If {@code device_list} is a non-#NULL value, the link is performed for
            devices specified in this list for which a compiled object is available.
            """
        ),
        cl_charASCII.const.p.IN(
            "options",
            "a pointer to a null-terminated string of characters that describes the link options to be used for building the program executable"
        ),
        AutoSize("input_programs")..cl_uint.IN(
            "num_input_programs",
            "the number of programs in array referenced by {@code input_programs}"
        ),
        SingleValue("input_program")..nullable..cl_program.const.p.IN(
            "input_programs",
            """
            an array of program objects that are compiled binaries or libraries that are to be linked to create the program executable. For each device in
            {@code device_list} or if {@code device_list} is #NULL the list of devices associated with {@code context}, the following cases occur:
            ${ul(
                """
                All programs specified by {@code input_programs} contain a compiled binary or library for the device. In this case, a link is performed to
                generate a program executable for this device.
                """,
                """
                None of the programs contain a compiled binary or library for that device. In this case, no link is performed and there will be no program
                executable generated for this device.
                """,
                "All other cases will return a $INVALID_OPERATION error."
            )}
            """
        ),
        nullable..cl_program_callback.IN(
            "pfn_notify",
            """
            a function pointer to a notification routine. The notification routine is a callback function that an application can register and which will be
            called when the program executable has been built (successfully or unsuccessfully).

            If {@code pfn_notify} is not #NULL, {@code clLinkProgram} does not need to wait for the linker to complete and can return immediately once the
            linking operation can begin. Once the linker has completed, the {@code pfn_notify} callback function is called which returns the program object
            returned by {@code clLinkProgram}. The application can query the link status and log for this program object. This callback function may be called
            asynchronously by the OpenCL implementation. It is the application's responsibility to ensure that the callback function is thread-safe.

            If {@code pfn_notify} is #NULL, {@code clLinkProgram} does not return until the linker has completed.
            """
        ),
        nullable..opaque_p.IN("user_data", "will be passed as an argument when {@code pfn_notify} is called. {@code user_data} can be #NULL."),

        returnDoc =
        """
        a valid non-zero program object, if the linking operation can begin. The linking operation can begin if the context, list of devices, input programs and
        linker options specified are all valid and appropriate host and device resources needed to perform the link are available.

        If {@code pfn_notify} is #NULL, the $errcode_ret will be set to $SUCCESS if the link operation was successful and #LINK_PROGRAM_FAILURE if
        there is a failure to link the compiled binaries and/or libraries.

        If {@code pfn_notify} is not #NULL, {@code clLinkProgram} does not have to wait until the linker to complete and can return $SUCCESS in $errcode_ret
        if the linking operation can begin. The {@code pfn_notify} callback function will return a $SUCCESS or #LINK_PROGRAM_FAILURE if the
        linking operation was successful or not.

        Otherwise {@code clLinkProgram} returns a #NULL program object with an appropriate error in $errcode_ret. The application should query the linker status
        of this program object to check if the link was successful or not. The list of errors that can be returned are:
        ${ul(
            ICE,
            """
            $INVALID_VALUE if {@code device_list} is #NULL and {@code num_devices} is greater than zero, or if {@code device_list} is not #NULL
            and {@code num_devices} is zero.
            """,
            """
            $INVALID_VALUE if {@code num_input_programs} is zero and {@code input_programs} is #NULL or if {@code num_input_programs} is zero and
            {@code input_programs} is not #NULL or if {@code num_input_programs} is not zero and {@code input_programs} is #NULL.
            """,
            "$INVALID_PROGRAM if programs specified in {@code input_programs} are not valid program objects.",
            "$INVALID_VALUE if {@code pfn_notify} is #NULL but {@code user_data} is not #NULL.",
            "$INVALID_DEVICE if OpenCL devices listed in {@code device_list} are not in the list of devices associated with {@code context}.",
            "$INVALID_LINKER_OPTIONS if the linker options specified by {@code options} are invalid.",
            """
            $INVALID_OPERATION if the compilation or build of a program executable for any of the devices listed in {@code device_list} by a
            previous call to #CompileProgram() or #BuildProgram() for program has not completed.
            """,
            """
            $INVALID_OPERATION if the rules for devices containing compiled binaries or libraries as described in {@code input_programs} argument
            above are not followed.
            """,
            "#LINKER_NOT_AVAILABLE if a linker is not available i.e. #DEVICE_LINKER_AVAILABLE is set to $FALSE.",
            "#LINK_PROGRAM_FAILURE if there is a failure to link the compiled binaries and/or libraries.",
            OORE,
            OOHME
        )}
        """
    )

    cl_int(
        "UnloadPlatformCompiler",
        """
        Allows the implementation to release the resources allocated by the OpenCL compiler for platform. This is a hint from the application and does not
        guarantee that the compiler will not be used in the future or that the compiler will actually be unloaded by the implementation. Calls to
        #BuildProgram(), #CompileProgram() or #LinkProgram() after {@code clUnloadPlatformCompiler} will reload the compiler, if necessary, to build the
        appropriate program executable.
        """,

        cl_platform_id.IN("platform", "the platform for which to unload the compiler"),

        returnDoc =
        """
        $SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
        ${ul(
            "$INVALID_PLATFORM if {@code platform} is not a valid platform."
        )}
        """
    )

    cl_int(
        "GetKernelArgInfo",
        """
        Returns information about the arguments of a kernel. Kernel argument information is only available if the program object associated with kernel is
        created with #CreateProgramWithSource() and the program executable is built with the {@code -cl-kernel-arg-info} option specified in options
        argument to #BuildProgram() or #CompileProgram().
        """,

        cl_kernel.IN("kernel", "specifies the kernel object being queried"),
        cl_uint.IN(
            "arg_indx",
            """
            the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
            the total number of arguments declared by a kernel.
            """
        ),
        cl_kernel_arg_info.IN("param_name", "the argument information to query", KernelArgInfo),
        PARAM_VALUE_SIZE,
        MultiType(PointerMapping.DATA_INT, PointerMapping.DATA_LONG)..nullable..void.p.IN("param_value", param_value),
        PARAM_VALUE_SIZE_RET,

        returnDoc =
        """
        $SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
        ${ul(
            "$INVALID_ARG_INDEX if {@code arg_indx} is not a valid argument index.",
            """
            $INVALID_VALUE if {@code param_name} is not valid, or if size in bytes specified by {@code param_value} size is &lt; size of return
            type and {@code param_value} is not #NULL.
            """,
            "#KERNEL_ARG_INFO_NOT_AVAILABLE if the argument information is not available for {@code kernel}.",
            "$INVALID_KERNEL if {@code kernel} is a not a valid kernel object."
        )}
        """
    )

    cl_int(
        "EnqueueFillBuffer",
        """
        Enqueues a command to fill a buffer object with a pattern of a given pattern size. The usage information which indicates whether the memory object can
        be read or written by a kernel and/or the host and is given by the {@code cl_mem_flags} argument value specified when buffer is created is ignored by
        {@code clEnqueueFillBuffer}.
        """,

        cl_command_queue.IN(
            "command_queue",
            "the command-queue in which the fill command will be queued. The OpenCL context associated with {@code command_queue} and {@code buffer} must be the same."
        ),
        cl_mem.IN("buffer", "a valid buffer object"),
        void.const.p.IN(
            "pattern",
            """
            pointer to the data pattern of size {@code pattern_size} in bytes. {@code pattern} will be used to fill a region in buffer starting at {@code offset}
            and is {@code size} bytes in size. The data pattern must be a scalar or vector integer or floating-point data type supported by OpenCL. For example,
            if buffer is to be filled with a pattern of {@code float4} values, then pattern will be a pointer to a {@code cl_float4} value and {@code pattern_size}
            will be {@code sizeof(cl_float4)}. The maximum value of {@code pattern_size} is the size of the largest integer or floating-point vector data type
            supported by the OpenCL device. The memory associated with {@code pattern} can be reused or freed after the function returns.
            """
        ),
        AutoSize("pattern")..size_t.IN("pattern_size", "the pattern size"),
        size_t.IN("offset", "the location in bytes of the region being filled in {@code buffer} and must be a multiple of {@code pattern_size}"),
        size_t.IN("size", "the size in bytes of region being filled in {@code buffer} and must be a multiple of {@code pattern_size}"),
        NEWL,
        EWL,
        EVENT,

        returnDoc =
        """
        $SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
        ${ul(
            ICQE,
            """
            $INVALID_CONTEXT if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context
            associated with {@code command_queue} and events in {@code event_wait_list} are not the same.
            """,
            "$INVALID_MEM_OBJECT if {@code buffer} is not a valid buffer object.",
            "$INVALID_VALUE if {@code offset} or {@code offset + size} require accessing elements outside the buffer buffer object respectively.",
            """
            $INVALID_VALUE if {@code pattern} is #NULL or if {@code pattern_size} is 0 or if {@code pattern_size} is not one of
            {@code [1, 2, 4, 8, 16, 32, 64, 128]}.
            """,
            "$INVALID_VALUE if {@code offset} and {@code size} are not a multiple of {@code pattern_size}.",
            IEWLE,
            MSBOE("buffer"),
            "#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for data store associated with {@code buffer}.",
            OORE,
            OOHME
        )}
        """
    )

    cl_int(
        "EnqueueFillImage",
        """
        Enqueues a command to fill an image object with a specified color. The usage information which indicates whether the memory object can be read or
        written by a kernel and/or the host and is given by the {@code cl_mem_flags} argument value specified when image is created is ignored by
        {@code clEnqueueFillImage}.
        """,

        cl_command_queue.IN(
            "command_queue",
            "the command-queue in which the fill command will be queued. The OpenCL context associated with {@code command_queue} and {@code image} must be the same."
        ),
        cl_mem.IN("image", "a valid image object"),
        MultiType(
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT
        )..Check(4 x 4)..void.const.p.IN(
            "fill_color",
            """
            the fill color. The fill color is a four component RGBA floating-point color value if the {@code image} channel data type is not an unnormalized
            signed and unsigned integer type, is a four component signed integer value if the {@code image} channel data type is an unnormalized signed integer
            type and is a four component unsigned integer value if the {@code image} channel data type is an unnormalized unsigned integer type. The fill color
            will be converted to the appropriate image channel format and order associated with {@code image}.
            """
        ),
        Check(1)..size_t.const.p.IN(
            "origin",
            """
            the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the {@code (x)}
            offset and the image index in the 1D image array. If image is a 2D image object, {@code origin[2]} must be 0. If image is a 1D image or 1D image
            buffer object, {@code origin[1]} and {@code origin[2]} must be 0. If image is a 1D image array object, {@code origin[2]} must be 0. If image is a 1D
            image array object, {@code origin[1]} describes the image index in the 1D image array. If image is a 2D image array object, {@code origin[2]}
            describes the image index in the 2D image array.
            """
        ),
        Check(1)..size_t.const.p.IN(
            "region",
            """
            the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and the number
            of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If image is a 2D
            image object, {@code region[2]} must be 1. If image is a 1D image or 1D image buffer object, {@code region[1]} and {@code region[2]} must be 1. If
            image is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot be 0.
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
            """
            $INVALID_CONTEXT if the context associated with {@code command_queue} and {@code image} are not the same or if the context associated
            with {@code command_queue} and events in {@code event_wait_list} are not the same.
            """,
            "$INVALID_MEM_OBJECT if {@code image} is not a valid image object.",
            "$INVALID_VALUE if {@code fill_color} is #NULL.",
            "$INVALID_VALUE if the region being filled as specified by {@code origin} and {@code region} is out of bounds or if {@code ptr} is a #NULL value.",
            "$INVALID_VALUE if values in {@code origin} and {@code region} do not follow rules described in the argument description for {@code origin} and {@code region}.",
            IEWLE,
            "$INVALID_IMAGE_SIZE if image dimensions (image width, height, specified or compute row and/or slice pitch) for image are not supported by device associated with queue.",
            "#IMAGE_FORMAT_NOT_SUPPORTED if image format (image channel order and data type) for image are not supported by device associated with queue.",
            "#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for data store associated with {@code image}.",
            OORE,
            OOHME
        )}
        """
    )

    cl_int(
        "EnqueueMigrateMemObjects",
        """
        Enqueues a command to indicate which device a set of memory objects should be associated with. Typically, memory objects are implicitly migrated to a
        device for which enqueued commands, using the memory object, are targeted. {@code clEnqueueMigrateMemObjects} allows this migration to be explicitly
        performed ahead of the dependent commands. This allows a user to preemptively change the association of a memory object, through regular command queue
        scheduling, in order to prepare for another upcoming command. This also permits an application to overlap the placement of memory objects with other
        unrelated operations before these memory objects are needed potentially hiding transfer latencies. Once the event, returned from {@code clEnqueueMigrateMemObjects},
        has been marked #COMPLETE the memory objects specified in {@code mem_objects} have been successfully migrated to the device associated
        with {@code command_queue}. The migrated memory object shall remain resident on the device until another command is enqueued that either implicitly or
        explicitly migrates it away.

        {@code clEnqueueMigrateMemObjects} can also be used to direct the initial placement of a memory object, after creation, possibly avoiding the initial
        overhead of instantiating the object on the first enqueued command to use it.

        The user is responsible for managing the event dependencies, associated with this command, in order to avoid overlapping access to memory objects.
        Improperly specified event dependencies passed to {@code clEnqueueMigrateMemObjects} could result in undefined results.
        """,

        cl_command_queue.IN(
            "command_queue",
            """
            a valid command-queue. The specified set of memory objects in {@code mem_objects} will be migrated to the OpenCL device associated with
            {@code command_queue} or to the host if the #MIGRATE_MEM_OBJECT_HOST has been specified.
            """
        ),
        AutoSize("mem_objects")..cl_uint.IN("num_mem_objects", "the number of memory objects specified in {@code mem_objects}"),
        cl_mem.const.p.IN("mem_objects", "a pointer to a list of memory objects"),
        cl_mem_migration_flags.IN("flags", "a bit-field that is used to specify migration options", MigrationFlags),
        NEWL,
        EWL,
        EVENT,

        returnDoc =
        """
        $SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
        ${ul(
            ICQE,
            """
            $INVALID_CONTEXT if the context associated with {@code command_queue} and memory objects in {@code mem_objects} are not the same or
            if the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.
            """,
            "$INVALID_MEM_OBJECT if any of the memory objects in {@code mem_objects} is not a valid memory object.",
            "$INVALID_VALUE if {@code num_mem_objects} is zero or if {@code mem_objects} is #NULL.",
            "$INVALID_VALUE if {@code flags} is not 0 or is not any of the values described in the table above.",
            IEWLE,
            "#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for the specified set of memory objects in {@code mem_objects}.",
            OORE,
            OOHME
        )}
        """
    )

    cl_int(
        "EnqueueMarkerWithWaitList",
        """
        Enqueues a marker command which waits for either a list of events to complete, or if the list is empty it waits for all commands previously enqueued in
        {@code command_queue} to complete before it completes. This command returns an event which can be waited on, i.e. this event can be waited on to insure
        that all events either in the {@code event_wait_list} or all previously enqueued commands, queued before this command to {@code command_queue}, have
        completed.
        """,

        cl_command_queue.IN("command_queue", "a valid command-queue"),
        NEWL,
        EWL,
        EVENT,

        returnDoc =
        """
        $SUCCESS if the function is successfully executed. Otherwise, it returns one of the following errors:
        ${ul(
            ICQE,
            "$INVALID_CONTEXT if context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.",
            IEWLE,
            OORE,
            OOHME
        )}
        """
    )

    cl_int(
        "EnqueueBarrierWithWaitList",
        """
        enqueues a barrier command which waits for either a list of events to complete, or if the list is empty it waits for all commands previously enqueued in
        {@code command_queue} to complete before it completes. This command blocks command execution, that is, any following commands enqueued after it do not
        execute until it completes. This command returns an event which can be waited on, i.e. this event can be waited on to insure that all events either in
        the {@code event_wait_list} or all previously enqueued commands, queued before this command to {@code command_queue}, have completed.
        """,

        cl_command_queue.IN("command_queue", "a valid command-queue"),
        NEWL,
        EWL,
        EVENT,

        returnDoc =
        """
        $SUCCESS if the function is successfully executed. Otherwise, it returns one of the following errors:
        ${ul(
            ICQE,
            "$INVALID_CONTEXT if context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.",
            IEWLE,
            OORE,
            OOHME
        )}
        """
    )
}