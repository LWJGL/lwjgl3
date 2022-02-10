/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val CL30 = "CL30".nativeClassCL("CL30") {
    extends = CL22
    documentation = "The core OpenCL 3.0 functionality."

    IntConstant(
        "OpenCL Version.",

        "VERSION_3_0".."1"
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetPlatformInfo(), returns a {@code cl_version} value.

        Returns the detailed (major, minor, patch) version supported by the platform. The major and minor version numbers returned must match those returned
        via #PLATFORM_VERSION.
        """,

        "PLATFORM_NUMERIC_VERSION"..0x0906
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetPlatformInfo(), returns a {@code cl_name_version[]} value.

        Returns an array of description (name and version) structures that lists all the extensions supported by the platform. The same extension name must not
        be reported more than once. The list of extensions reported must match the list reported via #PLATFORM_EXTENSIONS.        
        """,

        "PLATFORM_EXTENSIONS_WITH_VERSION"..0x0907
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_version} value.

        Returns the detailed (major, minor, patch) version supported by the device. The major and minor version numbers returned must match those returned via
        #DEVICE_VERSION.
        """,

        "DEVICE_NUMERIC_VERSION"..0x105E
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_name_version[]} value.

        Returns an array of description (name and version) structures. The same extension name must not be reported more than once. The list of extensions
        reported must match the list reported via #DEVICE_EXTENSIONS. See {@code CL_DEVICE_EXTENSIONS} for a list of extensions that are required to be
        reported for a given OpenCL version.        
        """,

        "DEVICE_EXTENSIONS_WITH_VERSION"..0x1060
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_name_version[]} value.

        Returns an array of descriptions (name and version) for all supported intermediate languages. Intermediate languages with the same name may be reported
        more than once but each name and major/minor version combination may only be reported once. The list of intermediate languages reported must match the
        list reported via #DEVICE_IL_VERSION.

        For an OpenCL 2.1 or 2.2 device, at least one version of SPIR-V must be reported.
        """,

        "DEVICE_ILS_WITH_VERSION"..0x1061
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_name_version[]} value.

        Returns an array of descriptions for the built-in kernels supported by the device. Each built-in kernel may only be reported once. The list of reported
        kernels must match the list returned via #DEVICE_BUILT_IN_KERNELS.
        """,

        "DEVICE_BUILT_IN_KERNELS_WITH_VERSION"..0x1062
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_device_atomic_capabilities} value.

        Describes the various memory orders and scopes that the device supports for atomic memory operations. This is a bit-field that describes a combination
        of the following values:
        ${ul(
            "#DEVICE_ATOMIC_ORDER_RELAXED - Support for the relaxed memory order.",
            "#DEVICE_ATOMIC_ORDER_ACQ_REL - Support for the acquire, release, and acquire-release memory orders.",
            "#DEVICE_ATOMIC_ORDER_SEQ_CST - Support for the sequentially consistent memory order."
        )}

        Because atomic memory orders are hierarchical, a device that supports a strong memory order must also support all weaker memory orders.
        ${ul(
            "#DEVICE_ATOMIC_SCOPE_WORK_ITEM - Support for memory ordering constraints that apply to a single work item.",
            "#DEVICE_ATOMIC_SCOPE_WORK_GROUP - Support for memory ordering constraints that apply to all work-items in a work-group.",
            "#DEVICE_ATOMIC_SCOPE_DEVICE - Support for memory ordering constraints that apply to all work-items executing on the device.",
            """
            #DEVICE_ATOMIC_SCOPE_ALL_DEVICES - Support for memory ordering constraints that apply to all work-items executing across all devices that can share
            SVM memory with each other and the host process.
            """
        )}

        Because atomic scopes are hierarchical, a device that supports a wide scope must also support all narrower scopes, except for the work-item scope, which is a special case.

        The mandated minimum capability is:
        ${codeBlock("""
CL_DEVICE_ATOMIC_ORDER_RELAXED |
CL_DEVICE_ATOMIC_SCOPE_WORK_GROUP
        """)}
        """,

        "DEVICE_ATOMIC_MEMORY_CAPABILITIES"..0x1063
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_device_atomic_capabilities} value.

        Describes the various memory orders and scopes that the device supports for atomic fence operations. This is a bit-field that has the same set of
        possible values as described for #DEVICE_ATOMIC_MEMORY_CAPABILITIES.

        The mandated minimum capability is:
        ${codeBlock("""
CL_DEVICE_ATOMIC_ORDER_RELAXED |
CL_DEVICE_ATOMIC_ORDER_ACQ_REL |
CL_DEVICE_ATOMIC_SCOPE_WORK_GROUP            
        """)}
        """,

        "DEVICE_ATOMIC_FENCE_CAPABILITIES"..0x1064
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_bool} value.

        Is #TRUE if the device supports non-uniform work groups, and #FALSE otherwise.
        """,

        "DEVICE_NON_UNIFORM_WORK_GROUP_SUPPORT"..0x1065
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_name_version[]} value.

        Returns an array of name, version descriptions listing all the versions of OpenCL C supported by the compiler for the device. In each returned
        description structure, the name field is required to be "OpenCL C". The list may include both newer non-backwards compatible OpenCL C versions, such as
        OpenCL C 3.0, and older OpenCL C versions with mandatory backwards compatibility. The version returned by #DEVICE_OPENCL_C_VERSION is required to be
        present in the list.

        For devices that support compilation from OpenCL C source:

        Because OpenCL 3.0 is backwards compatible with OpenCL C 1.2, and OpenCL C 1.2 is backwards compatible with OpenCL C 1.1 and OpenCL C 1.0, support for
        at least OpenCL C 3.0, OpenCL C 1.2, OpenCL C 1.1, and OpenCL C 1.0 is required for an OpenCL 3.0 device.

        Support for OpenCL C 2.0, OpenCL C 1.2, OpenCL C 1.1, and OpenCL C 1.0 is required for an OpenCL 2.0, OpenCL 2.1, or OpenCL 2.2 device.

        Support for OpenCL C 1.2, OpenCL C 1.1, and OpenCL C 1.0 is required for an OpenCL 1.2 device.

        Support for OpenCL C 1.1 and OpenCL C 1.0 is required for an OpenCL 1.1 device.

        Support for at least OpenCL C 1.0 is required for an OpenCL 1.0 device.

        For devices that do not support compilation from OpenCL C source, this query may return an empty array.
        """,

        "DEVICE_OPENCL_C_ALL_VERSIONS"..0x1066
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code size_t} value.

        Returns the preferred multiple of work-group size for the given device. This is a performance hint intended as a guide when specifying the local work
        size argument to #EnqueueNDRangeKernel().

        (Refer also to #GetKernelWorkGroupInfo() where #KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE can return a different value to
        {@code CL_DEVICE_PREFERRED_WORK_GROUP_SIZE_MULTIPLE} which may be more optimal.)
        """,

        "DEVICE_PREFERRED_WORK_GROUP_SIZE_MULTIPLE"..0x1067
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_bool} value.

        Is #TRUE if the device supports work group collective functions e.g. {@code work_group_broadcast}, {@code work_group_reduce}, and
        {@code work_group_scan}, and #FALSE otherwise.
        """,

        "DEVICE_WORK_GROUP_COLLECTIVE_FUNCTIONS_SUPPORT"..0x1068
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_bool} value.

        Is #TRUE if the device supports the generic address space and its associated built-in functions, and #FALSE otherwise.
        """,

        "DEVICE_GENERIC_ADDRESS_SPACE_SUPPORT"..0x1069
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_name_version[]} value.

        Returns an array of optional OpenCL C features supported by the compiler for the device alongside the OpenCL C version that introduced the feature
        macro. For example, if a compiler supports an OpenCL C 3.0 feature, the returned name will be the full name of the OpenCL C feature macro, and the
        returned version will be 3.0.0.

        For devices that do not support compilation from OpenCL C source, this query may return an empty array.
        """,

        "DEVICE_OPENCL_C_FEATURES"..0x106F
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_device_device_enqueue_capabilities} value.

        Describes device-side enqueue capabilities of the device. This is a bit-field that describes one or more of the following values:
        ${ul(
            "#DEVICE_QUEUE_SUPPORTED - Device supports device-side enqueue and on-device queues.",
            "#DEVICE_QUEUE_REPLACEABLE_DEFAULT - Device supports a replaceable default on-device queue."
        )}
        
        If {@code CL_DEVICE_QUEUE_REPLACEABLE_DEFAULT} is set, {@code CL_DEVICE_QUEUE_SUPPORTED} must also be set.

        Devices that set {@code CL_DEVICE_QUEUE_SUPPORTED} for {@code CL_DEVICE_DEVICE_ENQUEUE_CAPABILITIES} must also return #TRUE for
        #DEVICE_GENERIC_ADDRESS_SPACE_SUPPORT.
        """,

        "DEVICE_DEVICE_ENQUEUE_CAPABILITIES"..0x1070
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code cl_bool} value.

        Is #TRUE if the device supports pipes, and CL_FALSE otherwise.

        Devices that return #TRUE for {@code CL_DEVICE_PIPE_SUPPORT} must also return {@code CL_TRUE} for #DEVICE_GENERIC_ADDRESS_SPACE_SUPPORT.
        """,

        "DEVICE_PIPE_SUPPORT"..0x1071
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetDeviceInfo(), returns a {@code char[]} value.

        Returns the latest version of the conformance test suite that this device has fully passed in accordance with the official conformance process.
        """,

        "DEVICE_LATEST_CONFORMANCE_VERSION_PASSED"..0x1072
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetCommandQueueInfo(), returns a {@code cl_queue_properties[]} value.

        Return the properties argument specified in #CreateCommandQueueWithProperties().

        If the properties argument specified in {@code clCreateCommandQueueWithProperties} used to create {@code command_queue} was not #NULL, the
        implementation must return the values specified in the properties argument in the same order and without including additional properties.

        If {@code command_queue} was created using #CreateCommandQueue(), or if the properties argument specified in {@code clCreateCommandQueueWithProperties}
        was #NULL, the implementation must return {@code param_value_size_ret} equal to 0, indicating that there are no properties to be returned.
        """,

        "QUEUE_PROPERTIES_ARRAY"..0x1098
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetMemObjectInfo(), returns a {@code cl_mem_properties[]} value.

        Return the {@code properties} argument specified in #CreateBufferWithProperties() or #CreateImageWithProperties().

        If the {@code properties} argument specified in {@code clCreateBufferWithProperties} or {@code clCreateImageWithProperties} used to create
        {@code memobj} was not #NULL, the implementation must return the values specified in the {@code properties} argument in the same order and without
        including additional properties.

        If {@code memobj} was created using #CreateBuffer(), #CreateSubBuffer(), #CreateImage(), #CreateImage2D(), or #CreateImage3D(), or if the
        {@code properties} argument specified in {@code clCreateBufferWithProperties} or {@code clCreateImageWithProperties} was #NULL, the implementation must
        return {@code param_value_size_ret} equal to 0, indicating that there are no properties to be returned.        
        """,

        "MEM_PROPERTIES"..0x110A
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetPipeInfo(), returns a {@code cl_pipe_properties[]} value.

        Return the {@code properties} argument specified in #CreatePipe().

        If the {@code properties} argument specified in {@code clCreatePipe} used to create pipe was not #NULL, the implementation must return the values
        specified in the {@code properties} argument in the same order and without including additional properties.

        If the {@code properties} argument specified in {@code clCreatePipe} used to create pipe was #NULL, the implementation must return
        {@code param_value_size_ret} equal to 0, indicating that there are no properties to be returned.
        """,

        "PIPE_PROPERTIES"..0x1122
    )

    IntConstant(
        """
        Accepted as the {@code param_name} parameter of #GetSamplerInfo(), returns a {@code cl_sampler_properties[]} value.

        Return the {@code properties} argument specified in #CreateSamplerWithProperties().

        If the {@code properties} argument specified in {@code clCreateSamplerWithProperties} used to create sampler was not #NULL, the implementation must
        return the values specified in the {@code properties} argument in the same order and without including additional properties.

        If {@code sampler} was created using #CreateSampler(), or if the {@code properties} argument specified in {@code clCreateSamplerWithProperties} was
        #NULL, the implementation must return {@code param_value_size_ret} equal to 0, indicating that there are no properties to be returned.
        """,

        "SAMPLER_PROPERTIES"..0x1158
    )

    IntConstant(
        "{@code cl_command_type}",

        "COMMAND_SVM_MIGRATE_MEM"..0x120E
    )

    IntConstant(
        "{@code cl_device_atomic_capabilities} - bitfield",

        "DEVICE_ATOMIC_ORDER_RELAXED".."(1 << 0)",
        "DEVICE_ATOMIC_ORDER_ACQ_REL".."(1 << 1)",
        "DEVICE_ATOMIC_ORDER_SEQ_CST".."(1 << 2)",
        "DEVICE_ATOMIC_SCOPE_WORK_ITEM".."(1 << 3)",
        "DEVICE_ATOMIC_SCOPE_WORK_GROUP".."(1 << 4)",
        "DEVICE_ATOMIC_SCOPE_DEVICE".."(1 << 5)",
        "DEVICE_ATOMIC_SCOPE_ALL_DEVICES".."(1 << 6)"
    )

    IntConstant(
        "{@code cl_device_device_enqueue_capabilities} - bitfield",

        "DEVICE_QUEUE_SUPPORTED".."(1 << 0)",
        "DEVICE_QUEUE_REPLACEABLE_DEFAULT".."(1 << 1)"
    )

    IntConstant(
        "{@code cl_version} constants",

        "VERSION_MAJOR_BITS".."10",
        "VERSION_MINOR_BITS".."10",
        "VERSION_PATCH_BITS".."12",

        "VERSION_MAJOR_MASK".."((1 << CL_VERSION_MAJOR_BITS) - 1)",
        "VERSION_MINOR_MASK".."((1 << CL_VERSION_MINOR_BITS) - 1)",
        "VERSION_PATCH_MASK".."((1 << CL_VERSION_PATCH_BITS) - 1)",
    )

    macro(expression = "version >>> (CL_VERSION_MINOR_BITS + CL_VERSION_PATCH_BITS)")..uint32_t(
        "CL_VERSION_MAJOR",
        "Extracts the {@code major} version from a packed {@code cl_version}.",

        uint32_t("version", "a packed {@code cl_version}"),

        noPrefix = true
    )

    macro(expression = "(version >>> CL_VERSION_PATCH_BITS) & CL_VERSION_MINOR_MASK")..uint32_t(
        "CL_VERSION_MINOR",
        "Extracts the {@code minor} version from a packed {@code cl_version}.",

        uint32_t("version", "a packed {@code cl_version}"),

        noPrefix = true
    )

    macro(expression = "version & CL_VERSION_PATCH_MASK")..uint32_t(
        "CL_VERSION_PATCH",
        "Extracts the {@code patch} version from a packed {@code cl_version}.",

        uint32_t("version", "a packed {@code cl_version}"),

        noPrefix = true
    )

    macro(expression = """((major & CL_VERSION_MAJOR_MASK) << (CL_VERSION_MINOR_BITS + CL_VERSION_PATCH_BITS)) |
               ((minor & CL_VERSION_MINOR_MASK) << CL_VERSION_PATCH_BITS) |
               (patch & CL_VERSION_PATCH_MASK)""")..uint32_t(
        "CL_MAKE_VERSION",
        "Returns a packed {@code cl_version} from a major, minor and patch version.",

        uint32_t("major", "the major version"),
        uint32_t("minor", "the minor version"),
        uint32_t("patch", "the patch version"),

        noPrefix = true
    )

    cl_int(
        "SetContextDestructorCallback",
        """
        Registers a callback function with a context that is called when the context is destroyed.
        
        Each call to {@code clSetContextDestructorCallback} registers the specified callback function on a destructor callback stack associated with context.
        The registered callback functions are called in the reverse order in which they were registered. If a context callback function was specified when
        context was created, it will not be called after any context destructor callback is called. Therefore, the context destructor callback provides a
        mechanism for an application to safely re-use or free any {@code user_data} specified for the context callback function when context was created.
        """,

        cl_context("context", "specifies the OpenCL context to register the callback to"),
        cl_context_destructor_callback(
            "pfn_notify",
            """
            the callback function to register.

            This callback function may be called asynchronously by the OpenCL implementation. It is the application’s responsibility to ensure that the
            callback function is thread-safe.
            """
        ),
        nullable..opaque_p("user_data", "will be passed as the {@code user_data} argument when {@code pfn_notify} is called. {@code user_data} can be #NULL."),

        returnDoc =
        """
        #SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
        ${ul(
            ICE,
            "$INVALID_VALUE if {@code pfn_notify} is #NULL.",
            OORE,
            OOHME
        )}
        """
    )

    cl_mem(
        "CreateBufferWithProperties",
        """
        Creates a buffer object with additional properties.
        
        If {@code clCreateBufferWithProperties} is called with #MEM_USE_HOST_PTR set in its {@code flags} argument, the contents of the memory pointed to by
        {@code host_ptr} at the time of the {@code clCreateBufferWithProperties} call define the initial contents of the buffer object.

        If {@code clCreateBufferWithProperties} is called with a pointer returned by #SVMAlloc() as its {@code host_ptr} argument, and
        {@code CL_MEM_USE_HOST_PTR} is set in its {@code flags} argument, {@code clCreateBufferWithProperties} will succeed and return a valid non-zero buffer
        object as long as the {@code size} argument is no larger than the size argument passed in the original {@code clSVMAlloc} call. The new buffer object
        returned has the shared memory as the underlying storage. Locations in the buffers underlying shared memory can be operated on using atomic operations
        to the devices level of support as defined in the memory model.
        """,

        cl_context("context", "a valid OpenCL context used to create the buffer object"),
        nullable..NullTerminated..cl_mem_properties.const.p(
            "properties",
            """
            an optional list of properties for the buffer object and their corresponding values.

            The list is terminated with the special property 0. If no properties are required, {@code properties} may be #NULL.
            """
        ),
        cl_mem_flags(
            "flags",
            "a bit-field that is used to specify allocation and usage information about the image memory object being created",
            """
            #MEM_READ_WRITE #MEM_WRITE_ONLY #MEM_READ_ONLY #MEM_USE_HOST_PTR #MEM_ALLOC_HOST_PTR #MEM_COPY_HOST_PTR #MEM_HOST_WRITE_ONLY #MEM_HOST_READ_ONLY
            #MEM_HOST_NO_ACCESS"
            """
        ),
        AutoSize("host_ptr")..size_t("size", "the size in bytes of the buffer memory object to be allocated"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..optional..void.p(
            "host_ptr",
            """
            a pointer to the buffer data that may already be allocated by the application.

            The size of the buffer that {@code host_ptr} points to must be greater than or equal to {@code size} bytes.
            """
        ),
        ERROR_RET,

        returnDoc =
        """
        a valid non-zero buffer object and $errcode_ret is set to $SUCCESS if the buffer object is created successfully. Otherwise, it returns a #NULL value
        with one of the following error values returned in $errcode_ret:
        ${ul(
            ICE,
            """
            $INVALID_PROPERTY if a property name in {@code properties} is not a supported property name, if the value specified for a supported property name
            is not valid, or if the same property name is specified more than once.
            """,
            "$INVALID_VALUE if values specified in {@code flags} are not valid.",
            "$INVALID_BUFFER_SIZE if {@code size} is 0 or if {@code size} is greater than #DEVICE_MAX_MEM_ALLOC_SIZE for all devices in context.",
            """
            $INVALID_HOST_PTR if {@code host_ptr} is #NULL and #MEM_USE_HOST_PTR or #MEM_COPY_HOST_PTR are set in {@code flags} or if {@code host_ptr} is not
            #NULL but #MEM_COPY_HOST_PTR or #MEM_USE_HOST_PTR are not set in {@code flags}.
            """,
            "#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for buffer object.",
            OORE,
            OOHME
        )}
        """
    )

    cl_mem(
        "CreateImageWithProperties",
        """
        Creates an image object with additional properties.
        
        For a 3D image or 2D image array, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent 2D image slices or 2D images
        respectively. Each 2D image is a linear sequence of adjacent scanlines. Each scanline is a linear sequence of image elements.
        
        For a 2D image, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent scanlines. Each scanline is a linear sequence
        of image elements.

        For a 1D image array, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent 1D images. Each 1D image is stored as a
        single scanline which is a linear sequence of adjacent elements.

        For 1D image or 1D image buffer, the image data specified by {@code host_ptr} is stored as a single scanline which is a linear sequence of adjacent
        elements.
        """,

        cl_context("context", "a valid OpenCL context used to create the image object"),
        nullable..NullTerminated..cl_mem_properties.const.p(
            "properties",
            """
            an optional list of properties for the image object and their corresponding values.
            
            The list is terminated with the special property 0. If no properties are required, properties may be #NULL.
            """
        ),
        cl_mem_flags(
            "flags",
            """
            a bit-field that is used to specify allocation and usage information about the image memory object being created.
            
            For all image types except #MEM_OBJECT_IMAGE1D_BUFFER, if the value specified for {@code flags} is 0, the default is used which is #MEM_READ_WRITE.

            For {@code CL_MEM_OBJECT_IMAGE1D_BUFFER} image type, or an image created from another memory object (image or buffer), if the
            {@code CL_MEM_READ_WRITE}, #MEM_READ_ONLY or #MEM_WRITE_ONLY values are not specified in {@code flags}, they are inherited from the corresponding
            memory access qualifiers associated with {@code mem_object}. The #MEM_USE_HOST_PTR, #MEM_ALLOC_HOST_PTR and #MEM_COPY_HOST_PTR values cannot be
            specified in {@code flags} but are inherited from the corresponding memory access qualifiers associated with {@code mem_object}. If
            {@code CL_MEM_COPY_HOST_PTR} is specified in the memory access qualifier values associated with {@code mem_object} it does not imply any additional
            copies when the image is created from {@code mem_object}. If the #MEM_HOST_WRITE_ONLY, #MEM_HOST_READ_ONLY or #MEM_HOST_NO_ACCESS values are not
            specified in {@code flags}, they are inherited from the corresponding memory access qualifiers associated with {@code mem_object}.
            """,
            """
            #MEM_READ_WRITE #MEM_WRITE_ONLY #MEM_READ_ONLY #MEM_USE_HOST_PTR #MEM_ALLOC_HOST_PTR #MEM_COPY_HOST_PTR #MEM_HOST_WRITE_ONLY
            #MEM_HOST_READ_ONLY #MEM_HOST_NO_ACCESS
            """
        ),
        cl_image_format.const.p(
            "image_format",
            """
            a pointer to a structure that describes format properties of the image to be allocated.

            A 1D image buffer or 2D image can be created from a buffer by specifying a buffer object in the {@code image_desc→mem_object}. A 2D image can be
            created from another 2D image object by specifying an image object in the {@code image_desc→mem_object}.
            """
        ),
        cl_image_desc.const.p("image_desc", "a pointer to a structure that describes type and dimensions of the image to be allocated"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT
        )..Unsafe..nullable..void.p(
            "host_ptr",
            """
            a pointer to the image data that may already be allocated by the application.

            Refer to table below for a description of how large the buffer that {@code host_ptr} points to must be.
            ${table(
                tr(th("ImageType"), th("Size of buffer that {@code host_ptr} points to")),

                tr(td("#MEM_OBJECT_IMAGE1D"), td("&ge; {@code image_row_pitch}")),
                tr(td("#MEM_OBJECT_IMAGE1D_BUFFER"), td("&ge; {@code image_row_pitch}")),
                tr(td("#MEM_OBJECT_IMAGE2D"), td("&ge; {@code image_row_pitch * image_height}")),
                tr(td("#MEM_OBJECT_IMAGE3D"), td("&ge; {@code image_slice_pitch * image_depth}")),
                tr(td("#MEM_OBJECT_IMAGE1D_ARRAY"), td("&ge; {@code image_slice_pitch * image_array_size}")),
                tr(td("#MEM_OBJECT_IMAGE2D_ARRAY"), td("&ge; {@code image_slice_pitch * image_array_size}"))
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
            """
            $INVALID_PROPERTY if a property name in {@code properties} is not a supported property name, if the value specified for a supported property name
            is not valid, or if the same property name is specified more than once.
            """,
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
            #INVALID_VALUE if an image is being created from another memory object (buffer or image) under one of the following circumstances:
            ${ol(
                """
                {@code mem_object} was created with {@code CL_MEM_WRITE_ONLY} and {@code flags} specifies {@code CL_MEM_READ_WRITE} or
                {@code CL_MEM_READ_ONLY},
                """,
                "{@code mem_object} was created with {@code CL_MEM_READ_ONLY} and flags specifies {@code CL_MEM_READ_WRITE} or {@code CL_MEM_WRITE_ONLY},",
                "{@code flags} specifies {@code CL_MEM_USE_HOST_PTR} or {@code CL_MEM_ALLOC_HOST_PTR} or {@code CL_MEM_COPY_HOST_PTR}."
            )} 
            """,
            """
            #INVALID_VALUE if an image is being created from another memory object (buffer or image) and {@code mem_object} was created with
            {@code CL_MEM_HOST_WRITE_ONLY} and {@code flags} specifies {@code CL_MEM_HOST_READ_ONLY}, or if {@code mem_object} was created with
            {@code CL_MEM_HOST_READ_ONLY} and {@code flags} specifies {@code CL_MEM_HOST_WRITE_ONLY}, or if {@code mem_object} was created with
            {@code CL_MEM_HOST_NO_ACCESS} and {@code flags} specifies {@code CL_MEM_HOST_READ_ONLY} or {@code CL_MEM_HOST_WRITE_ONLY}.
            """,
            "#IMAGE_FORMAT_NOT_SUPPORTED if there are no devices in context that support {@code image_format}.",
            "#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for image object.",
            "#INVALID_OPERATION if there are no devices in context that support images.",
            OORE,
            OOHME
        )}
        """
    )
}
