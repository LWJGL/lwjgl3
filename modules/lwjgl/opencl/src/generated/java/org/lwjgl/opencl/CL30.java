/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The core OpenCL 3.0 functionality. */
public class CL30 extends CL22 {

    /** OpenCL Version. */
    public static final int CL_VERSION_3_0 = 1;

    /**
     * Accepted as the {@code param_name} parameter of {@link CL10#clGetPlatformInfo GetPlatformInfo}, returns a {@code cl_version} value.
     * 
     * <p>Returns the detailed (major, minor, patch) version supported by the platform. The major and minor version numbers returned must match those returned
     * via {@link CL10#CL_PLATFORM_VERSION PLATFORM_VERSION}.</p>
     */
    public static final int CL_PLATFORM_NUMERIC_VERSION = 0x906;

    /**
     * Accepted as the {@code param_name} parameter of {@link CL10#clGetPlatformInfo GetPlatformInfo}, returns a {@code cl_name_version[]} value.
     * 
     * <p>Returns an array of description (name and version) structures that lists all the extensions supported by the platform. The same extension name must not
     * be reported more than once. The list of extensions reported must match the list reported via {@link CL10#CL_PLATFORM_EXTENSIONS PLATFORM_EXTENSIONS}.</p>
     */
    public static final int CL_PLATFORM_EXTENSIONS_WITH_VERSION = 0x907;

    /**
     * Accepted as the {@code param_name} parameter of {@link CL10#clGetDeviceInfo GetDeviceInfo}, returns a {@code cl_version} value.
     * 
     * <p>Returns the detailed (major, minor, patch) version supported by the device. The major and minor version numbers returned must match those returned via
     * {@link CL10#CL_DEVICE_VERSION DEVICE_VERSION}.</p>
     */
    public static final int CL_DEVICE_NUMERIC_VERSION = 0x105E;

    /**
     * Accepted as the {@code param_name} parameter of {@link CL10#clGetDeviceInfo GetDeviceInfo}, returns a {@code cl_name_version[]} value.
     * 
     * <p>Returns an array of description (name and version) structures. The same extension name must not be reported more than once. The list of extensions
     * reported must match the list reported via {@link CL10#CL_DEVICE_EXTENSIONS DEVICE_EXTENSIONS}. See {@code CL_DEVICE_EXTENSIONS} for a list of extensions that are required to be
     * reported for a given OpenCL version.</p>
     */
    public static final int CL_DEVICE_EXTENSIONS_WITH_VERSION = 0x1060;

    /**
     * Accepted as the {@code param_name} parameter of {@link CL10#clGetDeviceInfo GetDeviceInfo}, returns a {@code cl_name_version[]} value.
     * 
     * <p>Returns an array of descriptions (name and version) for all supported intermediate languages. Intermediate languages with the same name may be reported
     * more than once but each name and major/minor version combination may only be reported once. The list of intermediate languages reported must match the
     * list reported via {@link CL21#CL_DEVICE_IL_VERSION DEVICE_IL_VERSION}.</p>
     * 
     * <p>For an OpenCL 2.1 or 2.2 device, at least one version of SPIR-V must be reported.</p>
     */
    public static final int CL_DEVICE_ILS_WITH_VERSION = 0x1061;

    /**
     * Accepted as the {@code param_name} parameter of {@link CL10#clGetDeviceInfo GetDeviceInfo}, returns a {@code cl_name_version[]} value.
     * 
     * <p>Returns an array of descriptions for the built-in kernels supported by the device. Each built-in kernel may only be reported once. The list of reported
     * kernels must match the list returned via {@link CL12#CL_DEVICE_BUILT_IN_KERNELS DEVICE_BUILT_IN_KERNELS}.</p>
     */
    public static final int CL_DEVICE_BUILT_IN_KERNELS_WITH_VERSION = 0x1062;

    /**
     * Accepted as the {@code param_name} parameter of {@link CL10#clGetDeviceInfo GetDeviceInfo}, returns a {@code cl_device_atomic_capabilities} value.
     * 
     * <p>Describes the various memory orders and scopes that the device supports for atomic memory operations. This is a bit-field that describes a combination
     * of the following values:</p>
     * 
     * <ul>
     * <li>{@link #CL_DEVICE_ATOMIC_ORDER_RELAXED DEVICE_ATOMIC_ORDER_RELAXED} - Support for the relaxed memory order.</li>
     * <li>{@link #CL_DEVICE_ATOMIC_ORDER_ACQ_REL DEVICE_ATOMIC_ORDER_ACQ_REL} - Support for the acquire, release, and acquire-release memory orders.</li>
     * <li>{@link #CL_DEVICE_ATOMIC_ORDER_SEQ_CST DEVICE_ATOMIC_ORDER_SEQ_CST} - Support for the sequentially consistent memory order.</li>
     * </ul>
     * 
     * <p>Because atomic memory orders are hierarchical, a device that supports a strong memory order must also support all weaker memory orders.</p>
     * 
     * <ul>
     * <li>{@link #CL_DEVICE_ATOMIC_SCOPE_WORK_ITEM DEVICE_ATOMIC_SCOPE_WORK_ITEM} - Support for memory ordering constraints that apply to a single work item.</li>
     * <li>{@link #CL_DEVICE_ATOMIC_SCOPE_WORK_GROUP DEVICE_ATOMIC_SCOPE_WORK_GROUP} - Support for memory ordering constraints that apply to all work-items in a work-group.</li>
     * <li>{@link #CL_DEVICE_ATOMIC_SCOPE_DEVICE DEVICE_ATOMIC_SCOPE_DEVICE} - Support for memory ordering constraints that apply to all work-items executing on the device.</li>
     * <li>{@link #CL_DEVICE_ATOMIC_SCOPE_ALL_DEVICES DEVICE_ATOMIC_SCOPE_ALL_DEVICES} - Support for memory ordering constraints that apply to all work-items executing across all devices that can share
     * SVM memory with each other and the host process.</li>
     * </ul>
     * 
     * <p>Because atomic scopes are hierarchical, a device that supports a wide scope must also support all narrower scopes, except for the work-item scope, which is a special case.</p>
     * 
     * <p>The mandated minimum capability is:</p>
     * 
     * <pre><code>
     * CL_DEVICE_ATOMIC_ORDER_RELAXED |
     * CL_DEVICE_ATOMIC_SCOPE_WORK_GROUP</code></pre>
     */
    public static final int CL_DEVICE_ATOMIC_MEMORY_CAPABILITIES = 0x1063;

    /**
     * Accepted as the {@code param_name} parameter of {@link CL10#clGetDeviceInfo GetDeviceInfo}, returns a {@code cl_device_atomic_capabilities} value.
     * 
     * <p>Describes the various memory orders and scopes that the device supports for atomic fence operations. This is a bit-field that has the same set of
     * possible values as described for {@link #CL_DEVICE_ATOMIC_MEMORY_CAPABILITIES DEVICE_ATOMIC_MEMORY_CAPABILITIES}.</p>
     * 
     * <p>The mandated minimum capability is:</p>
     * 
     * <pre><code>
     * CL_DEVICE_ATOMIC_ORDER_RELAXED |
     * CL_DEVICE_ATOMIC_ORDER_ACQ_REL |
     * CL_DEVICE_ATOMIC_SCOPE_WORK_GROUP            </code></pre>
     */
    public static final int CL_DEVICE_ATOMIC_FENCE_CAPABILITIES = 0x1064;

    /**
     * Accepted as the {@code param_name} parameter of {@link CL10#clGetDeviceInfo GetDeviceInfo}, returns a {@code cl_bool} value.
     * 
     * <p>Is {@link CL10#CL_TRUE TRUE} if the device supports non-uniform work groups, and {@link CL10#CL_FALSE FALSE} otherwise.</p>
     */
    public static final int CL_DEVICE_NON_UNIFORM_WORK_GROUP_SUPPORT = 0x1065;

    /**
     * Accepted as the {@code param_name} parameter of {@link CL10#clGetDeviceInfo GetDeviceInfo}, returns a {@code cl_name_version[]} value.
     * 
     * <p>Returns an array of name, version descriptions listing all the versions of OpenCL C supported by the compiler for the device. In each returned
     * description structure, the name field is required to be "OpenCL C". The list may include both newer non-backwards compatible OpenCL C versions, such as
     * OpenCL C 3.0, and older OpenCL C versions with mandatory backwards compatibility. The version returned by {@link CL11#CL_DEVICE_OPENCL_C_VERSION DEVICE_OPENCL_C_VERSION} is required to be
     * present in the list.</p>
     * 
     * <p>For devices that support compilation from OpenCL C source:</p>
     * 
     * <p>Because OpenCL 3.0 is backwards compatible with OpenCL C 1.2, and OpenCL C 1.2 is backwards compatible with OpenCL C 1.1 and OpenCL C 1.0, support for
     * at least OpenCL C 3.0, OpenCL C 1.2, OpenCL C 1.1, and OpenCL C 1.0 is required for an OpenCL 3.0 device.</p>
     * 
     * <p>Support for OpenCL C 2.0, OpenCL C 1.2, OpenCL C 1.1, and OpenCL C 1.0 is required for an OpenCL 2.0, OpenCL 2.1, or OpenCL 2.2 device.</p>
     * 
     * <p>Support for OpenCL C 1.2, OpenCL C 1.1, and OpenCL C 1.0 is required for an OpenCL 1.2 device.</p>
     * 
     * <p>Support for OpenCL C 1.1 and OpenCL C 1.0 is required for an OpenCL 1.1 device.</p>
     * 
     * <p>Support for at least OpenCL C 1.0 is required for an OpenCL 1.0 device.</p>
     * 
     * <p>For devices that do not support compilation from OpenCL C source, this query may return an empty array.</p>
     */
    public static final int CL_DEVICE_OPENCL_C_ALL_VERSIONS = 0x1066;

    /**
     * Accepted as the {@code param_name} parameter of {@link CL10#clGetDeviceInfo GetDeviceInfo}, returns a {@code size_t} value.
     * 
     * <p>Returns the preferred multiple of work-group size for the given device. This is a performance hint intended as a guide when specifying the local work
     * size argument to {@link CL10#clEnqueueNDRangeKernel EnqueueNDRangeKernel}.</p>
     * 
     * <p>(Refer also to {@link CL10#clGetKernelWorkGroupInfo GetKernelWorkGroupInfo} where {@link CL11#CL_KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE} can return a different value to
     * {@code CL_DEVICE_PREFERRED_WORK_GROUP_SIZE_MULTIPLE} which may be more optimal.)</p>
     */
    public static final int CL_DEVICE_PREFERRED_WORK_GROUP_SIZE_MULTIPLE = 0x1067;

    /**
     * Accepted as the {@code param_name} parameter of {@link CL10#clGetDeviceInfo GetDeviceInfo}, returns a {@code cl_bool} value.
     * 
     * <p>Is {@link CL10#CL_TRUE TRUE} if the device supports work group collective functions e.g. {@code work_group_broadcast}, {@code work_group_reduce}, and
     * {@code work_group_scan}, and {@link CL10#CL_FALSE FALSE} otherwise.</p>
     */
    public static final int CL_DEVICE_WORK_GROUP_COLLECTIVE_FUNCTIONS_SUPPORT = 0x1068;

    /**
     * Accepted as the {@code param_name} parameter of {@link CL10#clGetDeviceInfo GetDeviceInfo}, returns a {@code cl_bool} value.
     * 
     * <p>Is {@link CL10#CL_TRUE TRUE} if the device supports the generic address space and its associated built-in functions, and {@link CL10#CL_FALSE FALSE} otherwise.</p>
     */
    public static final int CL_DEVICE_GENERIC_ADDRESS_SPACE_SUPPORT = 0x1069;

    /**
     * Accepted as the {@code param_name} parameter of {@link CL10#clGetDeviceInfo GetDeviceInfo}, returns a {@code cl_name_version[]} value.
     * 
     * <p>Returns an array of optional OpenCL C features supported by the compiler for the device alongside the OpenCL C version that introduced the feature
     * macro. For example, if a compiler supports an OpenCL C 3.0 feature, the returned name will be the full name of the OpenCL C feature macro, and the
     * returned version will be 3.0.0.</p>
     * 
     * <p>For devices that do not support compilation from OpenCL C source, this query may return an empty array.</p>
     */
    public static final int CL_DEVICE_OPENCL_C_FEATURES = 0x106F;

    /**
     * Accepted as the {@code param_name} parameter of {@link CL10#clGetDeviceInfo GetDeviceInfo}, returns a {@code cl_device_device_enqueue_capabilities} value.
     * 
     * <p>Describes device-side enqueue capabilities of the device. This is a bit-field that describes one or more of the following values:</p>
     * 
     * <ul>
     * <li>{@link #CL_DEVICE_QUEUE_SUPPORTED DEVICE_QUEUE_SUPPORTED} - Device supports device-side enqueue and on-device queues.</li>
     * <li>{@link #CL_DEVICE_QUEUE_REPLACEABLE_DEFAULT DEVICE_QUEUE_REPLACEABLE_DEFAULT} - Device supports a replaceable default on-device queue.</li>
     * </ul>
     * 
     * <p>If {@code CL_DEVICE_QUEUE_REPLACEABLE_DEFAULT} is set, {@code CL_DEVICE_QUEUE_SUPPORTED} must also be set.</p>
     * 
     * <p>Devices that set {@code CL_DEVICE_QUEUE_SUPPORTED} for {@code CL_DEVICE_DEVICE_ENQUEUE_CAPABILITIES} must also return {@link CL10#CL_TRUE TRUE} for
     * {@link #CL_DEVICE_GENERIC_ADDRESS_SPACE_SUPPORT DEVICE_GENERIC_ADDRESS_SPACE_SUPPORT}.</p>
     */
    public static final int CL_DEVICE_DEVICE_ENQUEUE_CAPABILITIES = 0x1070;

    /**
     * Accepted as the {@code param_name} parameter of {@link CL10#clGetDeviceInfo GetDeviceInfo}, returns a {@code cl_bool} value.
     * 
     * <p>Is {@link CL10#CL_TRUE TRUE} if the device supports pipes, and CL_FALSE otherwise.</p>
     * 
     * <p>Devices that return {@link CL10#CL_TRUE TRUE} for {@code CL_DEVICE_PIPE_SUPPORT} must also return {@code CL_TRUE} for {@link #CL_DEVICE_GENERIC_ADDRESS_SPACE_SUPPORT DEVICE_GENERIC_ADDRESS_SPACE_SUPPORT}.</p>
     */
    public static final int CL_DEVICE_PIPE_SUPPORT = 0x1071;

    /**
     * Accepted as the {@code param_name} parameter of {@link CL10#clGetDeviceInfo GetDeviceInfo}, returns a {@code char[]} value.
     * 
     * <p>Returns the latest version of the conformance test suite that this device has fully passed in accordance with the official conformance process.</p>
     */
    public static final int CL_DEVICE_LATEST_CONFORMANCE_VERSION_PASSED = 0x1072;

    /**
     * Accepted as the {@code param_name} parameter of {@link CL10#clGetCommandQueueInfo GetCommandQueueInfo}, returns a {@code cl_queue_properties[]} value.
     * 
     * <p>Return the properties argument specified in {@link CL20#clCreateCommandQueueWithProperties CreateCommandQueueWithProperties}.</p>
     * 
     * <p>If the properties argument specified in {@code clCreateCommandQueueWithProperties} used to create {@code command_queue} was not {@code NULL}, the
     * implementation must return the values specified in the properties argument in the same order and without including additional properties.</p>
     * 
     * <p>If {@code command_queue} was created using {@link CL10#clCreateCommandQueue CreateCommandQueue}, or if the properties argument specified in {@code clCreateCommandQueueWithProperties}
     * was {@code NULL}, the implementation must return {@code param_value_size_ret} equal to 0, indicating that there are no properties to be returned.</p>
     */
    public static final int CL_QUEUE_PROPERTIES_ARRAY = 0x1098;

    /**
     * Accepted as the {@code param_name} parameter of {@link CL10#clGetMemObjectInfo GetMemObjectInfo}, returns a {@code cl_mem_properties[]} value.
     * 
     * <p>Return the {@code properties} argument specified in {@link #clCreateBufferWithProperties CreateBufferWithProperties} or {@link #clCreateImageWithProperties CreateImageWithProperties}.</p>
     * 
     * <p>If the {@code properties} argument specified in {@code clCreateBufferWithProperties} or {@code clCreateImageWithProperties} used to create
     * {@code memobj} was not {@code NULL}, the implementation must return the values specified in the {@code properties} argument in the same order and without
     * including additional properties.</p>
     * 
     * <p>If {@code memobj} was created using {@link CL10#clCreateBuffer CreateBuffer}, {@link CL11#clCreateSubBuffer CreateSubBuffer}, {@link CL12#clCreateImage CreateImage}, {@link CL10#clCreateImage2D CreateImage2D}, or {@link CL10#clCreateImage3D CreateImage3D}, or if the
     * {@code properties} argument specified in {@code clCreateBufferWithProperties} or {@code clCreateImageWithProperties} was {@code NULL}, the implementation must
     * return {@code param_value_size_ret} equal to 0, indicating that there are no properties to be returned.</p>
     */
    public static final int CL_MEM_PROPERTIES = 0x110A;

    /**
     * Accepted as the {@code param_name} parameter of {@link CL20#clGetPipeInfo GetPipeInfo}, returns a {@code cl_pipe_properties[]} value.
     * 
     * <p>Return the {@code properties} argument specified in {@link CL20#clCreatePipe CreatePipe}.</p>
     * 
     * <p>If the {@code properties} argument specified in {@code clCreatePipe} used to create pipe was not {@code NULL}, the implementation must return the values
     * specified in the {@code properties} argument in the same order and without including additional properties.</p>
     * 
     * <p>If the {@code properties} argument specified in {@code clCreatePipe} used to create pipe was {@code NULL}, the implementation must return
     * {@code param_value_size_ret} equal to 0, indicating that there are no properties to be returned.</p>
     */
    public static final int CL_PIPE_PROPERTIES = 0x1122;

    /**
     * Accepted as the {@code param_name} parameter of {@link CL10#clGetSamplerInfo GetSamplerInfo}, returns a {@code cl_sampler_properties[]} value.
     * 
     * <p>Return the {@code properties} argument specified in {@link CL20#clCreateSamplerWithProperties CreateSamplerWithProperties}.</p>
     * 
     * <p>If the {@code properties} argument specified in {@code clCreateSamplerWithProperties} used to create sampler was not {@code NULL}, the implementation must
     * return the values specified in the {@code properties} argument in the same order and without including additional properties.</p>
     * 
     * <p>If {@code sampler} was created using {@link CL10#clCreateSampler CreateSampler}, or if the {@code properties} argument specified in {@code clCreateSamplerWithProperties} was
     * {@code NULL}, the implementation must return {@code param_value_size_ret} equal to 0, indicating that there are no properties to be returned.</p>
     */
    public static final int CL_SAMPLER_PROPERTIES = 0x1158;

    /** {@code cl_command_type} */
    public static final int CL_COMMAND_SVM_MIGRATE_MEM = 0x120E;

    /** {@code cl_device_atomic_capabilities} - bitfield */
    public static final int
        CL_DEVICE_ATOMIC_ORDER_RELAXED     = (1 << 0),
        CL_DEVICE_ATOMIC_ORDER_ACQ_REL     = (1 << 1),
        CL_DEVICE_ATOMIC_ORDER_SEQ_CST     = (1 << 2),
        CL_DEVICE_ATOMIC_SCOPE_WORK_ITEM   = (1 << 3),
        CL_DEVICE_ATOMIC_SCOPE_WORK_GROUP  = (1 << 4),
        CL_DEVICE_ATOMIC_SCOPE_DEVICE      = (1 << 5),
        CL_DEVICE_ATOMIC_SCOPE_ALL_DEVICES = (1 << 6);

    /** {@code cl_device_device_enqueue_capabilities} - bitfield */
    public static final int
        CL_DEVICE_QUEUE_SUPPORTED           = (1 << 0),
        CL_DEVICE_QUEUE_REPLACEABLE_DEFAULT = (1 << 1);

    /** {@code cl_version} constants */
    public static final int
        CL_VERSION_MAJOR_BITS = 10,
        CL_VERSION_MINOR_BITS = 10,
        CL_VERSION_PATCH_BITS = 12,
        CL_VERSION_MAJOR_MASK = ((1 << CL_VERSION_MAJOR_BITS) - 1),
        CL_VERSION_MINOR_MASK = ((1 << CL_VERSION_MINOR_BITS) - 1),
        CL_VERSION_PATCH_MASK = ((1 << CL_VERSION_PATCH_BITS) - 1);

    protected CL30() {
        throw new UnsupportedOperationException();
    }

    // --- [ CL_VERSION_MAJOR ] ---

    /**
     * Extracts the {@code major} version from a packed {@code cl_version}.
     *
     * @param version a packed {@code cl_version}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/CL_VERSION_MAJOR.html">Reference Page</a>
     */
    @NativeType("uint32_t")
    public static int CL_VERSION_MAJOR(@NativeType("uint32_t") int version) {
        return version >>> (CL_VERSION_MINOR_BITS + CL_VERSION_PATCH_BITS);
    }

    // --- [ CL_VERSION_MINOR ] ---

    /**
     * Extracts the {@code minor} version from a packed {@code cl_version}.
     *
     * @param version a packed {@code cl_version}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/CL_VERSION_MINOR.html">Reference Page</a>
     */
    @NativeType("uint32_t")
    public static int CL_VERSION_MINOR(@NativeType("uint32_t") int version) {
        return (version >>> CL_VERSION_PATCH_BITS) & CL_VERSION_MINOR_MASK;
    }

    // --- [ CL_VERSION_PATCH ] ---

    /**
     * Extracts the {@code patch} version from a packed {@code cl_version}.
     *
     * @param version a packed {@code cl_version}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/CL_VERSION_PATCH.html">Reference Page</a>
     */
    @NativeType("uint32_t")
    public static int CL_VERSION_PATCH(@NativeType("uint32_t") int version) {
        return version & CL_VERSION_PATCH_MASK;
    }

    // --- [ CL_MAKE_VERSION ] ---

    /**
     * Returns a packed {@code cl_version} from a major, minor and patch version.
     *
     * @param major the major version
     * @param minor the minor version
     * @param patch the patch version
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/CL_MAKE_VERSION.html">Reference Page</a>
     */
    @NativeType("uint32_t")
    public static int CL_MAKE_VERSION(@NativeType("uint32_t") int major, @NativeType("uint32_t") int minor, @NativeType("uint32_t") int patch) {
        return ((major & CL_VERSION_MAJOR_MASK) << (CL_VERSION_MINOR_BITS + CL_VERSION_PATCH_BITS)) |
               ((minor & CL_VERSION_MINOR_MASK) << CL_VERSION_PATCH_BITS) |
               (patch & CL_VERSION_PATCH_MASK);
    }

    // --- [ clSetContextDestructorCallback ] ---

    /** Unsafe version of: {@link #clSetContextDestructorCallback SetContextDestructorCallback} */
    public static int nclSetContextDestructorCallback(long context, long pfn_notify, long user_data) {
        long __functionAddress = CL.getICD().clSetContextDestructorCallback;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPPI(context, pfn_notify, user_data, __functionAddress);
    }

    /**
     * Registers a callback function with a context that is called when the context is destroyed.
     * 
     * <p>Each call to {@code clSetContextDestructorCallback} registers the specified callback function on a destructor callback stack associated with context.
     * The registered callback functions are called in the reverse order in which they were registered. If a context callback function was specified when
     * context was created, it will not be called after any context destructor callback is called. Therefore, the context destructor callback provides a
     * mechanism for an application to safely re-use or free any {@code user_data} specified for the context callback function when context was created.</p>
     *
     * @param context    specifies the OpenCL context to register the callback to
     * @param pfn_notify the callback function to register.
     *                   
     *                   <p>This callback function may be called asynchronously by the OpenCL implementation. It is the application’s responsibility to ensure that the
     *                   callback function is thread-safe.</p>
     * @param user_data  will be passed as the {@code user_data} argument when {@code pfn_notify} is called. {@code user_data} can be {@code NULL}.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code pfn_notify} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetContextDestructorCallback.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetContextDestructorCallback(@NativeType("cl_context") long context, @NativeType("void (*) (cl_context, void *)") CLContextDestructorCallbackI pfn_notify, @NativeType("void *") long user_data) {
        return nclSetContextDestructorCallback(context, pfn_notify.address(), user_data);
    }

    // --- [ clCreateBufferWithProperties ] ---

    /**
     * Unsafe version of: {@link #clCreateBufferWithProperties CreateBufferWithProperties}
     *
     * @param size the size in bytes of the buffer memory object to be allocated
     */
    public static long nclCreateBufferWithProperties(long context, long properties, long flags, long size, long host_ptr, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferWithProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPJPPPP(context, properties, flags, size, host_ptr, errcode_ret, __functionAddress);
    }

    /**
     * Creates a buffer object with additional properties.
     * 
     * <p>If {@code clCreateBufferWithProperties} is called with {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} set in its {@code flags} argument, the contents of the memory pointed to by
     * {@code host_ptr} at the time of the {@code clCreateBufferWithProperties} call define the initial contents of the buffer object.</p>
     * 
     * <p>If {@code clCreateBufferWithProperties} is called with a pointer returned by {@link CL20#clSVMAlloc SVMAlloc} as its {@code host_ptr} argument, and
     * {@code CL_MEM_USE_HOST_PTR} is set in its {@code flags} argument, {@code clCreateBufferWithProperties} will succeed and return a valid non-zero buffer
     * object as long as the {@code size} argument is no larger than the size argument passed in the original {@code clSVMAlloc} call. The new buffer object
     * returned has the shared memory as the underlying storage. Locations in the buffers underlying shared memory can be operated on using atomic operations
     * to the devices level of support as defined in the memory model.</p>
     *
     * @param context     a valid OpenCL context used to create the buffer object
     * @param properties  an optional list of properties for the buffer object and their corresponding values.
     *                    
     *                    <p>The list is terminated with the special property 0. If no properties are required, {@code properties} may be {@code NULL}.</p>
     * @param flags       a bit-field that is used to specify allocation and usage information about the image memory object being created. One of:<br><table><tr><td>{@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}"</td></tr></table>
     * @param size        the size in bytes of the buffer memory object to be allocated
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero buffer object and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the buffer object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL11#CL_INVALID_PROPERTY INVALID_PROPERTY} if a property name in {@code properties} is not a supported property name, if the value specified for a supported property name
     *         is not valid, or if the same property name is specified more than once.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link CL10#CL_INVALID_BUFFER_SIZE INVALID_BUFFER_SIZE} if {@code size} is 0 or if {@code size} is greater than {@link CL10#CL_DEVICE_MAX_MEM_ALLOC_SIZE DEVICE_MAX_MEM_ALLOC_SIZE} for all devices in context.</li>
     *         <li>{@link CL10#CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in {@code flags} or if {@code host_ptr} is not
     *         {@code NULL} but {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in {@code flags}.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for buffer object.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateBufferWithProperties.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateBufferWithProperties(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties const *") LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("size_t") long size, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferWithProperties(context, memAddressSafe(properties), flags, size, NULL, memAddressSafe(errcode_ret));
    }

    /**
     * Creates a buffer object with additional properties.
     * 
     * <p>If {@code clCreateBufferWithProperties} is called with {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} set in its {@code flags} argument, the contents of the memory pointed to by
     * {@code host_ptr} at the time of the {@code clCreateBufferWithProperties} call define the initial contents of the buffer object.</p>
     * 
     * <p>If {@code clCreateBufferWithProperties} is called with a pointer returned by {@link CL20#clSVMAlloc SVMAlloc} as its {@code host_ptr} argument, and
     * {@code CL_MEM_USE_HOST_PTR} is set in its {@code flags} argument, {@code clCreateBufferWithProperties} will succeed and return a valid non-zero buffer
     * object as long as the {@code size} argument is no larger than the size argument passed in the original {@code clSVMAlloc} call. The new buffer object
     * returned has the shared memory as the underlying storage. Locations in the buffers underlying shared memory can be operated on using atomic operations
     * to the devices level of support as defined in the memory model.</p>
     *
     * @param context     a valid OpenCL context used to create the buffer object
     * @param properties  an optional list of properties for the buffer object and their corresponding values.
     *                    
     *                    <p>The list is terminated with the special property 0. If no properties are required, {@code properties} may be {@code NULL}.</p>
     * @param flags       a bit-field that is used to specify allocation and usage information about the image memory object being created. One of:<br><table><tr><td>{@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}"</td></tr></table>
     * @param host_ptr    a pointer to the buffer data that may already be allocated by the application.
     *                    
     *                    <p>The size of the buffer that {@code host_ptr} points to must be greater than or equal to {@code size} bytes.</p>
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero buffer object and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the buffer object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL11#CL_INVALID_PROPERTY INVALID_PROPERTY} if a property name in {@code properties} is not a supported property name, if the value specified for a supported property name
     *         is not valid, or if the same property name is specified more than once.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link CL10#CL_INVALID_BUFFER_SIZE INVALID_BUFFER_SIZE} if {@code size} is 0 or if {@code size} is greater than {@link CL10#CL_DEVICE_MAX_MEM_ALLOC_SIZE DEVICE_MAX_MEM_ALLOC_SIZE} for all devices in context.</li>
     *         <li>{@link CL10#CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in {@code flags} or if {@code host_ptr} is not
     *         {@code NULL} but {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in {@code flags}.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for buffer object.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateBufferWithProperties.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateBufferWithProperties(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties const *") LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") ByteBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferWithProperties(context, memAddressSafe(properties), flags, host_ptr.remaining(), memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * Creates a buffer object with additional properties.
     * 
     * <p>If {@code clCreateBufferWithProperties} is called with {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} set in its {@code flags} argument, the contents of the memory pointed to by
     * {@code host_ptr} at the time of the {@code clCreateBufferWithProperties} call define the initial contents of the buffer object.</p>
     * 
     * <p>If {@code clCreateBufferWithProperties} is called with a pointer returned by {@link CL20#clSVMAlloc SVMAlloc} as its {@code host_ptr} argument, and
     * {@code CL_MEM_USE_HOST_PTR} is set in its {@code flags} argument, {@code clCreateBufferWithProperties} will succeed and return a valid non-zero buffer
     * object as long as the {@code size} argument is no larger than the size argument passed in the original {@code clSVMAlloc} call. The new buffer object
     * returned has the shared memory as the underlying storage. Locations in the buffers underlying shared memory can be operated on using atomic operations
     * to the devices level of support as defined in the memory model.</p>
     *
     * @param context     a valid OpenCL context used to create the buffer object
     * @param properties  an optional list of properties for the buffer object and their corresponding values.
     *                    
     *                    <p>The list is terminated with the special property 0. If no properties are required, {@code properties} may be {@code NULL}.</p>
     * @param flags       a bit-field that is used to specify allocation and usage information about the image memory object being created. One of:<br><table><tr><td>{@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}"</td></tr></table>
     * @param host_ptr    a pointer to the buffer data that may already be allocated by the application.
     *                    
     *                    <p>The size of the buffer that {@code host_ptr} points to must be greater than or equal to {@code size} bytes.</p>
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero buffer object and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the buffer object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL11#CL_INVALID_PROPERTY INVALID_PROPERTY} if a property name in {@code properties} is not a supported property name, if the value specified for a supported property name
     *         is not valid, or if the same property name is specified more than once.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link CL10#CL_INVALID_BUFFER_SIZE INVALID_BUFFER_SIZE} if {@code size} is 0 or if {@code size} is greater than {@link CL10#CL_DEVICE_MAX_MEM_ALLOC_SIZE DEVICE_MAX_MEM_ALLOC_SIZE} for all devices in context.</li>
     *         <li>{@link CL10#CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in {@code flags} or if {@code host_ptr} is not
     *         {@code NULL} but {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in {@code flags}.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for buffer object.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateBufferWithProperties.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateBufferWithProperties(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties const *") LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") ShortBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferWithProperties(context, memAddressSafe(properties), flags, Integer.toUnsignedLong(host_ptr.remaining()) << 1, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * Creates a buffer object with additional properties.
     * 
     * <p>If {@code clCreateBufferWithProperties} is called with {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} set in its {@code flags} argument, the contents of the memory pointed to by
     * {@code host_ptr} at the time of the {@code clCreateBufferWithProperties} call define the initial contents of the buffer object.</p>
     * 
     * <p>If {@code clCreateBufferWithProperties} is called with a pointer returned by {@link CL20#clSVMAlloc SVMAlloc} as its {@code host_ptr} argument, and
     * {@code CL_MEM_USE_HOST_PTR} is set in its {@code flags} argument, {@code clCreateBufferWithProperties} will succeed and return a valid non-zero buffer
     * object as long as the {@code size} argument is no larger than the size argument passed in the original {@code clSVMAlloc} call. The new buffer object
     * returned has the shared memory as the underlying storage. Locations in the buffers underlying shared memory can be operated on using atomic operations
     * to the devices level of support as defined in the memory model.</p>
     *
     * @param context     a valid OpenCL context used to create the buffer object
     * @param properties  an optional list of properties for the buffer object and their corresponding values.
     *                    
     *                    <p>The list is terminated with the special property 0. If no properties are required, {@code properties} may be {@code NULL}.</p>
     * @param flags       a bit-field that is used to specify allocation and usage information about the image memory object being created. One of:<br><table><tr><td>{@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}"</td></tr></table>
     * @param host_ptr    a pointer to the buffer data that may already be allocated by the application.
     *                    
     *                    <p>The size of the buffer that {@code host_ptr} points to must be greater than or equal to {@code size} bytes.</p>
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero buffer object and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the buffer object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL11#CL_INVALID_PROPERTY INVALID_PROPERTY} if a property name in {@code properties} is not a supported property name, if the value specified for a supported property name
     *         is not valid, or if the same property name is specified more than once.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link CL10#CL_INVALID_BUFFER_SIZE INVALID_BUFFER_SIZE} if {@code size} is 0 or if {@code size} is greater than {@link CL10#CL_DEVICE_MAX_MEM_ALLOC_SIZE DEVICE_MAX_MEM_ALLOC_SIZE} for all devices in context.</li>
     *         <li>{@link CL10#CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in {@code flags} or if {@code host_ptr} is not
     *         {@code NULL} but {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in {@code flags}.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for buffer object.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateBufferWithProperties.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateBufferWithProperties(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties const *") LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") IntBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferWithProperties(context, memAddressSafe(properties), flags, Integer.toUnsignedLong(host_ptr.remaining()) << 2, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * Creates a buffer object with additional properties.
     * 
     * <p>If {@code clCreateBufferWithProperties} is called with {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} set in its {@code flags} argument, the contents of the memory pointed to by
     * {@code host_ptr} at the time of the {@code clCreateBufferWithProperties} call define the initial contents of the buffer object.</p>
     * 
     * <p>If {@code clCreateBufferWithProperties} is called with a pointer returned by {@link CL20#clSVMAlloc SVMAlloc} as its {@code host_ptr} argument, and
     * {@code CL_MEM_USE_HOST_PTR} is set in its {@code flags} argument, {@code clCreateBufferWithProperties} will succeed and return a valid non-zero buffer
     * object as long as the {@code size} argument is no larger than the size argument passed in the original {@code clSVMAlloc} call. The new buffer object
     * returned has the shared memory as the underlying storage. Locations in the buffers underlying shared memory can be operated on using atomic operations
     * to the devices level of support as defined in the memory model.</p>
     *
     * @param context     a valid OpenCL context used to create the buffer object
     * @param properties  an optional list of properties for the buffer object and their corresponding values.
     *                    
     *                    <p>The list is terminated with the special property 0. If no properties are required, {@code properties} may be {@code NULL}.</p>
     * @param flags       a bit-field that is used to specify allocation and usage information about the image memory object being created. One of:<br><table><tr><td>{@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}"</td></tr></table>
     * @param host_ptr    a pointer to the buffer data that may already be allocated by the application.
     *                    
     *                    <p>The size of the buffer that {@code host_ptr} points to must be greater than or equal to {@code size} bytes.</p>
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero buffer object and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the buffer object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL11#CL_INVALID_PROPERTY INVALID_PROPERTY} if a property name in {@code properties} is not a supported property name, if the value specified for a supported property name
     *         is not valid, or if the same property name is specified more than once.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link CL10#CL_INVALID_BUFFER_SIZE INVALID_BUFFER_SIZE} if {@code size} is 0 or if {@code size} is greater than {@link CL10#CL_DEVICE_MAX_MEM_ALLOC_SIZE DEVICE_MAX_MEM_ALLOC_SIZE} for all devices in context.</li>
     *         <li>{@link CL10#CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in {@code flags} or if {@code host_ptr} is not
     *         {@code NULL} but {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in {@code flags}.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for buffer object.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateBufferWithProperties.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateBufferWithProperties(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties const *") LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") FloatBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferWithProperties(context, memAddressSafe(properties), flags, Integer.toUnsignedLong(host_ptr.remaining()) << 2, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * Creates a buffer object with additional properties.
     * 
     * <p>If {@code clCreateBufferWithProperties} is called with {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} set in its {@code flags} argument, the contents of the memory pointed to by
     * {@code host_ptr} at the time of the {@code clCreateBufferWithProperties} call define the initial contents of the buffer object.</p>
     * 
     * <p>If {@code clCreateBufferWithProperties} is called with a pointer returned by {@link CL20#clSVMAlloc SVMAlloc} as its {@code host_ptr} argument, and
     * {@code CL_MEM_USE_HOST_PTR} is set in its {@code flags} argument, {@code clCreateBufferWithProperties} will succeed and return a valid non-zero buffer
     * object as long as the {@code size} argument is no larger than the size argument passed in the original {@code clSVMAlloc} call. The new buffer object
     * returned has the shared memory as the underlying storage. Locations in the buffers underlying shared memory can be operated on using atomic operations
     * to the devices level of support as defined in the memory model.</p>
     *
     * @param context     a valid OpenCL context used to create the buffer object
     * @param properties  an optional list of properties for the buffer object and their corresponding values.
     *                    
     *                    <p>The list is terminated with the special property 0. If no properties are required, {@code properties} may be {@code NULL}.</p>
     * @param flags       a bit-field that is used to specify allocation and usage information about the image memory object being created. One of:<br><table><tr><td>{@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}"</td></tr></table>
     * @param host_ptr    a pointer to the buffer data that may already be allocated by the application.
     *                    
     *                    <p>The size of the buffer that {@code host_ptr} points to must be greater than or equal to {@code size} bytes.</p>
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero buffer object and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the buffer object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL11#CL_INVALID_PROPERTY INVALID_PROPERTY} if a property name in {@code properties} is not a supported property name, if the value specified for a supported property name
     *         is not valid, or if the same property name is specified more than once.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link CL10#CL_INVALID_BUFFER_SIZE INVALID_BUFFER_SIZE} if {@code size} is 0 or if {@code size} is greater than {@link CL10#CL_DEVICE_MAX_MEM_ALLOC_SIZE DEVICE_MAX_MEM_ALLOC_SIZE} for all devices in context.</li>
     *         <li>{@link CL10#CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in {@code flags} or if {@code host_ptr} is not
     *         {@code NULL} but {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in {@code flags}.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for buffer object.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateBufferWithProperties.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateBufferWithProperties(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties const *") LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") DoubleBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferWithProperties(context, memAddressSafe(properties), flags, Integer.toUnsignedLong(host_ptr.remaining()) << 3, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    // --- [ clCreateImageWithProperties ] ---

    /** Unsafe version of: {@link #clCreateImageWithProperties CreateImageWithProperties} */
    public static long nclCreateImageWithProperties(long context, long properties, long flags, long image_format, long image_desc, long host_ptr, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImageWithProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPJPPPPP(context, properties, flags, image_format, image_desc, host_ptr, errcode_ret, __functionAddress);
    }

    /**
     * Creates an image object with additional properties.
     * 
     * <p>For a 3D image or 2D image array, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent 2D image slices or 2D images
     * respectively. Each 2D image is a linear sequence of adjacent scanlines. Each scanline is a linear sequence of image elements.</p>
     * 
     * <p>For a 2D image, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent scanlines. Each scanline is a linear sequence
     * of image elements.</p>
     * 
     * <p>For a 1D image array, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent 1D images. Each 1D image is stored as a
     * single scanline which is a linear sequence of adjacent elements.</p>
     * 
     * <p>For 1D image or 1D image buffer, the image data specified by {@code host_ptr} is stored as a single scanline which is a linear sequence of adjacent
     * elements.</p>
     *
     * @param context      a valid OpenCL context used to create the image object
     * @param properties   an optional list of properties for the image object and their corresponding values.
     *                     
     *                     <p>The list is terminated with the special property 0. If no properties are required, properties may be {@code NULL}.</p>
     * @param flags        a bit-field that is used to specify allocation and usage information about the image memory object being created.
     *                     
     *                     <p>For all image types except {@link CL12#CL_MEM_OBJECT_IMAGE1D_BUFFER MEM_OBJECT_IMAGE1D_BUFFER}, if the value specified for {@code flags} is 0, the default is used which is {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}.</p>
     *                     
     *                     <p>For {@code CL_MEM_OBJECT_IMAGE1D_BUFFER} image type, or an image created from another memory object (image or buffer), if the
     *                     {@code CL_MEM_READ_WRITE}, {@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY} or {@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} values are not specified in {@code flags}, they are inherited from the corresponding
     *                     memory access qualifiers associated with {@code mem_object}. The {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, {@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR} and {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} values cannot be
     *                     specified in {@code flags} but are inherited from the corresponding memory access qualifiers associated with {@code mem_object}. If
     *                     {@code CL_MEM_COPY_HOST_PTR} is specified in the memory access qualifier values associated with {@code mem_object} it does not imply any additional
     *                     copies when the image is created from {@code mem_object}. If the {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}, {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS} values are not
     *                     specified in {@code flags}, they are inherited from the corresponding memory access qualifiers associated with {@code mem_object}. One of:<br></p><table><tr><td>{@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param image_format a pointer to a structure that describes format properties of the image to be allocated.
     *                     
     *                     <p>A 1D image buffer or 2D image can be created from a buffer by specifying a buffer object in the {@code image_desc→mem_object}. A 2D image can be
     *                     created from another 2D image object by specifying an image object in the {@code image_desc→mem_object}.</p>
     * @param image_desc   a pointer to a structure that describes type and dimensions of the image to be allocated
     * @param host_ptr     a pointer to the image data that may already be allocated by the application.
     *                     
     *                     <p>Refer to table below for a description of how large the buffer that {@code host_ptr} points to must be.</p>
     *                     
     *                     <table class=striped>
     *                     <tr><th>ImageType</th><th>Size of buffer that {@code host_ptr} points to</th></tr>
     *                     <tr><td>{@link CL12#CL_MEM_OBJECT_IMAGE1D MEM_OBJECT_IMAGE1D}</td><td>&ge; {@code image_row_pitch}</td></tr>
     *                     <tr><td>{@link CL12#CL_MEM_OBJECT_IMAGE1D_BUFFER MEM_OBJECT_IMAGE1D_BUFFER}</td><td>&ge; {@code image_row_pitch}</td></tr>
     *                     <tr><td>{@link CL10#CL_MEM_OBJECT_IMAGE2D MEM_OBJECT_IMAGE2D}</td><td>&ge; {@code image_row_pitch * image_height}</td></tr>
     *                     <tr><td>{@link CL10#CL_MEM_OBJECT_IMAGE3D MEM_OBJECT_IMAGE3D}</td><td>&ge; {@code image_slice_pitch * image_depth}</td></tr>
     *                     <tr><td>{@link CL12#CL_MEM_OBJECT_IMAGE1D_ARRAY MEM_OBJECT_IMAGE1D_ARRAY}</td><td>&ge; {@code image_slice_pitch * image_array_size}</td></tr>
     *                     <tr><td>{@link CL12#CL_MEM_OBJECT_IMAGE2D_ARRAY MEM_OBJECT_IMAGE2D_ARRAY}</td><td>&ge; {@code image_slice_pitch * image_array_size}</td></tr>
     *                     </table>
     * @param errcode_ret  will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero image object and the {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the image object is created successfully. Otherwise, it returns a {@code NULL}
     *         value with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL11#CL_INVALID_PROPERTY INVALID_PROPERTY} if a property name in {@code properties} is not a supported property name, if the value specified for a supported property name
     *         is not valid, or if the same property name is specified more than once.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if values specified in {@code image_format} are not valid or if {@code image_format} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if a 2D image is created from a buffer and the row pitch and base address alignment does not follow the rules
     *         described for creating a 2D image from a buffer.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if a 2D image is created from a 2D image object and the rules described above are not followed.</li>
     *         <li>{@link CL12#CL_INVALID_IMAGE_DESCRIPTOR INVALID_IMAGE_DESCRIPTOR} if values specified in {@code image_desc} are not valid or if {@code image_desc} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions specified in {@code image_desc} exceed the maximum image dimensions for all devices in context.</li>
     *         <li>{@link CL10#CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in flags or if {@code host_ptr} is not
     *         {@code NULL} but {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in flags.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if an image is being created from another memory object (buffer or image) under one of the following circumstances:
     *         
     *         <ol>
     *         <li>{@code mem_object} was created with {@code CL_MEM_WRITE_ONLY} and {@code flags} specifies {@code CL_MEM_READ_WRITE} or
     *         {@code CL_MEM_READ_ONLY},</li>
     *         <li>{@code mem_object} was created with {@code CL_MEM_READ_ONLY} and flags specifies {@code CL_MEM_READ_WRITE} or {@code CL_MEM_WRITE_ONLY},</li>
     *         <li>{@code flags} specifies {@code CL_MEM_USE_HOST_PTR} or {@code CL_MEM_ALLOC_HOST_PTR} or {@code CL_MEM_COPY_HOST_PTR}.</li>
     *         </ol></li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if an image is being created from another memory object (buffer or image) and {@code mem_object} was created with
     *         {@code CL_MEM_HOST_WRITE_ONLY} and {@code flags} specifies {@code CL_MEM_HOST_READ_ONLY}, or if {@code mem_object} was created with
     *         {@code CL_MEM_HOST_READ_ONLY} and {@code flags} specifies {@code CL_MEM_HOST_WRITE_ONLY}, or if {@code mem_object} was created with
     *         {@code CL_MEM_HOST_NO_ACCESS} and {@code flags} specifies {@code CL_MEM_HOST_READ_ONLY} or {@code CL_MEM_HOST_WRITE_ONLY}.</li>
     *         <li>{@link CL10#CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if there are no devices in context that support {@code image_format}.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for image object.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if there are no devices in context that support images.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateImageWithProperties.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateImageWithProperties(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties const *") LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @Nullable @NativeType("void *") ByteBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImageWithProperties(context, memAddressSafe(properties), flags, image_format.address(), image_desc.address(), memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * Creates an image object with additional properties.
     * 
     * <p>For a 3D image or 2D image array, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent 2D image slices or 2D images
     * respectively. Each 2D image is a linear sequence of adjacent scanlines. Each scanline is a linear sequence of image elements.</p>
     * 
     * <p>For a 2D image, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent scanlines. Each scanline is a linear sequence
     * of image elements.</p>
     * 
     * <p>For a 1D image array, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent 1D images. Each 1D image is stored as a
     * single scanline which is a linear sequence of adjacent elements.</p>
     * 
     * <p>For 1D image or 1D image buffer, the image data specified by {@code host_ptr} is stored as a single scanline which is a linear sequence of adjacent
     * elements.</p>
     *
     * @param context      a valid OpenCL context used to create the image object
     * @param properties   an optional list of properties for the image object and their corresponding values.
     *                     
     *                     <p>The list is terminated with the special property 0. If no properties are required, properties may be {@code NULL}.</p>
     * @param flags        a bit-field that is used to specify allocation and usage information about the image memory object being created.
     *                     
     *                     <p>For all image types except {@link CL12#CL_MEM_OBJECT_IMAGE1D_BUFFER MEM_OBJECT_IMAGE1D_BUFFER}, if the value specified for {@code flags} is 0, the default is used which is {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}.</p>
     *                     
     *                     <p>For {@code CL_MEM_OBJECT_IMAGE1D_BUFFER} image type, or an image created from another memory object (image or buffer), if the
     *                     {@code CL_MEM_READ_WRITE}, {@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY} or {@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} values are not specified in {@code flags}, they are inherited from the corresponding
     *                     memory access qualifiers associated with {@code mem_object}. The {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, {@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR} and {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} values cannot be
     *                     specified in {@code flags} but are inherited from the corresponding memory access qualifiers associated with {@code mem_object}. If
     *                     {@code CL_MEM_COPY_HOST_PTR} is specified in the memory access qualifier values associated with {@code mem_object} it does not imply any additional
     *                     copies when the image is created from {@code mem_object}. If the {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}, {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS} values are not
     *                     specified in {@code flags}, they are inherited from the corresponding memory access qualifiers associated with {@code mem_object}. One of:<br></p><table><tr><td>{@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param image_format a pointer to a structure that describes format properties of the image to be allocated.
     *                     
     *                     <p>A 1D image buffer or 2D image can be created from a buffer by specifying a buffer object in the {@code image_desc→mem_object}. A 2D image can be
     *                     created from another 2D image object by specifying an image object in the {@code image_desc→mem_object}.</p>
     * @param image_desc   a pointer to a structure that describes type and dimensions of the image to be allocated
     * @param host_ptr     a pointer to the image data that may already be allocated by the application.
     *                     
     *                     <p>Refer to table below for a description of how large the buffer that {@code host_ptr} points to must be.</p>
     *                     
     *                     <table class=striped>
     *                     <tr><th>ImageType</th><th>Size of buffer that {@code host_ptr} points to</th></tr>
     *                     <tr><td>{@link CL12#CL_MEM_OBJECT_IMAGE1D MEM_OBJECT_IMAGE1D}</td><td>&ge; {@code image_row_pitch}</td></tr>
     *                     <tr><td>{@link CL12#CL_MEM_OBJECT_IMAGE1D_BUFFER MEM_OBJECT_IMAGE1D_BUFFER}</td><td>&ge; {@code image_row_pitch}</td></tr>
     *                     <tr><td>{@link CL10#CL_MEM_OBJECT_IMAGE2D MEM_OBJECT_IMAGE2D}</td><td>&ge; {@code image_row_pitch * image_height}</td></tr>
     *                     <tr><td>{@link CL10#CL_MEM_OBJECT_IMAGE3D MEM_OBJECT_IMAGE3D}</td><td>&ge; {@code image_slice_pitch * image_depth}</td></tr>
     *                     <tr><td>{@link CL12#CL_MEM_OBJECT_IMAGE1D_ARRAY MEM_OBJECT_IMAGE1D_ARRAY}</td><td>&ge; {@code image_slice_pitch * image_array_size}</td></tr>
     *                     <tr><td>{@link CL12#CL_MEM_OBJECT_IMAGE2D_ARRAY MEM_OBJECT_IMAGE2D_ARRAY}</td><td>&ge; {@code image_slice_pitch * image_array_size}</td></tr>
     *                     </table>
     * @param errcode_ret  will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero image object and the {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the image object is created successfully. Otherwise, it returns a {@code NULL}
     *         value with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL11#CL_INVALID_PROPERTY INVALID_PROPERTY} if a property name in {@code properties} is not a supported property name, if the value specified for a supported property name
     *         is not valid, or if the same property name is specified more than once.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if values specified in {@code image_format} are not valid or if {@code image_format} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if a 2D image is created from a buffer and the row pitch and base address alignment does not follow the rules
     *         described for creating a 2D image from a buffer.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if a 2D image is created from a 2D image object and the rules described above are not followed.</li>
     *         <li>{@link CL12#CL_INVALID_IMAGE_DESCRIPTOR INVALID_IMAGE_DESCRIPTOR} if values specified in {@code image_desc} are not valid or if {@code image_desc} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions specified in {@code image_desc} exceed the maximum image dimensions for all devices in context.</li>
     *         <li>{@link CL10#CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in flags or if {@code host_ptr} is not
     *         {@code NULL} but {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in flags.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if an image is being created from another memory object (buffer or image) under one of the following circumstances:
     *         
     *         <ol>
     *         <li>{@code mem_object} was created with {@code CL_MEM_WRITE_ONLY} and {@code flags} specifies {@code CL_MEM_READ_WRITE} or
     *         {@code CL_MEM_READ_ONLY},</li>
     *         <li>{@code mem_object} was created with {@code CL_MEM_READ_ONLY} and flags specifies {@code CL_MEM_READ_WRITE} or {@code CL_MEM_WRITE_ONLY},</li>
     *         <li>{@code flags} specifies {@code CL_MEM_USE_HOST_PTR} or {@code CL_MEM_ALLOC_HOST_PTR} or {@code CL_MEM_COPY_HOST_PTR}.</li>
     *         </ol></li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if an image is being created from another memory object (buffer or image) and {@code mem_object} was created with
     *         {@code CL_MEM_HOST_WRITE_ONLY} and {@code flags} specifies {@code CL_MEM_HOST_READ_ONLY}, or if {@code mem_object} was created with
     *         {@code CL_MEM_HOST_READ_ONLY} and {@code flags} specifies {@code CL_MEM_HOST_WRITE_ONLY}, or if {@code mem_object} was created with
     *         {@code CL_MEM_HOST_NO_ACCESS} and {@code flags} specifies {@code CL_MEM_HOST_READ_ONLY} or {@code CL_MEM_HOST_WRITE_ONLY}.</li>
     *         <li>{@link CL10#CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if there are no devices in context that support {@code image_format}.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for image object.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if there are no devices in context that support images.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateImageWithProperties.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateImageWithProperties(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties const *") LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @Nullable @NativeType("void *") ShortBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImageWithProperties(context, memAddressSafe(properties), flags, image_format.address(), image_desc.address(), memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * Creates an image object with additional properties.
     * 
     * <p>For a 3D image or 2D image array, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent 2D image slices or 2D images
     * respectively. Each 2D image is a linear sequence of adjacent scanlines. Each scanline is a linear sequence of image elements.</p>
     * 
     * <p>For a 2D image, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent scanlines. Each scanline is a linear sequence
     * of image elements.</p>
     * 
     * <p>For a 1D image array, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent 1D images. Each 1D image is stored as a
     * single scanline which is a linear sequence of adjacent elements.</p>
     * 
     * <p>For 1D image or 1D image buffer, the image data specified by {@code host_ptr} is stored as a single scanline which is a linear sequence of adjacent
     * elements.</p>
     *
     * @param context      a valid OpenCL context used to create the image object
     * @param properties   an optional list of properties for the image object and their corresponding values.
     *                     
     *                     <p>The list is terminated with the special property 0. If no properties are required, properties may be {@code NULL}.</p>
     * @param flags        a bit-field that is used to specify allocation and usage information about the image memory object being created.
     *                     
     *                     <p>For all image types except {@link CL12#CL_MEM_OBJECT_IMAGE1D_BUFFER MEM_OBJECT_IMAGE1D_BUFFER}, if the value specified for {@code flags} is 0, the default is used which is {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}.</p>
     *                     
     *                     <p>For {@code CL_MEM_OBJECT_IMAGE1D_BUFFER} image type, or an image created from another memory object (image or buffer), if the
     *                     {@code CL_MEM_READ_WRITE}, {@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY} or {@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} values are not specified in {@code flags}, they are inherited from the corresponding
     *                     memory access qualifiers associated with {@code mem_object}. The {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, {@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR} and {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} values cannot be
     *                     specified in {@code flags} but are inherited from the corresponding memory access qualifiers associated with {@code mem_object}. If
     *                     {@code CL_MEM_COPY_HOST_PTR} is specified in the memory access qualifier values associated with {@code mem_object} it does not imply any additional
     *                     copies when the image is created from {@code mem_object}. If the {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}, {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS} values are not
     *                     specified in {@code flags}, they are inherited from the corresponding memory access qualifiers associated with {@code mem_object}. One of:<br></p><table><tr><td>{@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param image_format a pointer to a structure that describes format properties of the image to be allocated.
     *                     
     *                     <p>A 1D image buffer or 2D image can be created from a buffer by specifying a buffer object in the {@code image_desc→mem_object}. A 2D image can be
     *                     created from another 2D image object by specifying an image object in the {@code image_desc→mem_object}.</p>
     * @param image_desc   a pointer to a structure that describes type and dimensions of the image to be allocated
     * @param host_ptr     a pointer to the image data that may already be allocated by the application.
     *                     
     *                     <p>Refer to table below for a description of how large the buffer that {@code host_ptr} points to must be.</p>
     *                     
     *                     <table class=striped>
     *                     <tr><th>ImageType</th><th>Size of buffer that {@code host_ptr} points to</th></tr>
     *                     <tr><td>{@link CL12#CL_MEM_OBJECT_IMAGE1D MEM_OBJECT_IMAGE1D}</td><td>&ge; {@code image_row_pitch}</td></tr>
     *                     <tr><td>{@link CL12#CL_MEM_OBJECT_IMAGE1D_BUFFER MEM_OBJECT_IMAGE1D_BUFFER}</td><td>&ge; {@code image_row_pitch}</td></tr>
     *                     <tr><td>{@link CL10#CL_MEM_OBJECT_IMAGE2D MEM_OBJECT_IMAGE2D}</td><td>&ge; {@code image_row_pitch * image_height}</td></tr>
     *                     <tr><td>{@link CL10#CL_MEM_OBJECT_IMAGE3D MEM_OBJECT_IMAGE3D}</td><td>&ge; {@code image_slice_pitch * image_depth}</td></tr>
     *                     <tr><td>{@link CL12#CL_MEM_OBJECT_IMAGE1D_ARRAY MEM_OBJECT_IMAGE1D_ARRAY}</td><td>&ge; {@code image_slice_pitch * image_array_size}</td></tr>
     *                     <tr><td>{@link CL12#CL_MEM_OBJECT_IMAGE2D_ARRAY MEM_OBJECT_IMAGE2D_ARRAY}</td><td>&ge; {@code image_slice_pitch * image_array_size}</td></tr>
     *                     </table>
     * @param errcode_ret  will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero image object and the {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the image object is created successfully. Otherwise, it returns a {@code NULL}
     *         value with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL11#CL_INVALID_PROPERTY INVALID_PROPERTY} if a property name in {@code properties} is not a supported property name, if the value specified for a supported property name
     *         is not valid, or if the same property name is specified more than once.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if values specified in {@code image_format} are not valid or if {@code image_format} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if a 2D image is created from a buffer and the row pitch and base address alignment does not follow the rules
     *         described for creating a 2D image from a buffer.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if a 2D image is created from a 2D image object and the rules described above are not followed.</li>
     *         <li>{@link CL12#CL_INVALID_IMAGE_DESCRIPTOR INVALID_IMAGE_DESCRIPTOR} if values specified in {@code image_desc} are not valid or if {@code image_desc} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions specified in {@code image_desc} exceed the maximum image dimensions for all devices in context.</li>
     *         <li>{@link CL10#CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in flags or if {@code host_ptr} is not
     *         {@code NULL} but {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in flags.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if an image is being created from another memory object (buffer or image) under one of the following circumstances:
     *         
     *         <ol>
     *         <li>{@code mem_object} was created with {@code CL_MEM_WRITE_ONLY} and {@code flags} specifies {@code CL_MEM_READ_WRITE} or
     *         {@code CL_MEM_READ_ONLY},</li>
     *         <li>{@code mem_object} was created with {@code CL_MEM_READ_ONLY} and flags specifies {@code CL_MEM_READ_WRITE} or {@code CL_MEM_WRITE_ONLY},</li>
     *         <li>{@code flags} specifies {@code CL_MEM_USE_HOST_PTR} or {@code CL_MEM_ALLOC_HOST_PTR} or {@code CL_MEM_COPY_HOST_PTR}.</li>
     *         </ol></li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if an image is being created from another memory object (buffer or image) and {@code mem_object} was created with
     *         {@code CL_MEM_HOST_WRITE_ONLY} and {@code flags} specifies {@code CL_MEM_HOST_READ_ONLY}, or if {@code mem_object} was created with
     *         {@code CL_MEM_HOST_READ_ONLY} and {@code flags} specifies {@code CL_MEM_HOST_WRITE_ONLY}, or if {@code mem_object} was created with
     *         {@code CL_MEM_HOST_NO_ACCESS} and {@code flags} specifies {@code CL_MEM_HOST_READ_ONLY} or {@code CL_MEM_HOST_WRITE_ONLY}.</li>
     *         <li>{@link CL10#CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if there are no devices in context that support {@code image_format}.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for image object.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if there are no devices in context that support images.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateImageWithProperties.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateImageWithProperties(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties const *") LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @Nullable @NativeType("void *") IntBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImageWithProperties(context, memAddressSafe(properties), flags, image_format.address(), image_desc.address(), memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * Creates an image object with additional properties.
     * 
     * <p>For a 3D image or 2D image array, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent 2D image slices or 2D images
     * respectively. Each 2D image is a linear sequence of adjacent scanlines. Each scanline is a linear sequence of image elements.</p>
     * 
     * <p>For a 2D image, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent scanlines. Each scanline is a linear sequence
     * of image elements.</p>
     * 
     * <p>For a 1D image array, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent 1D images. Each 1D image is stored as a
     * single scanline which is a linear sequence of adjacent elements.</p>
     * 
     * <p>For 1D image or 1D image buffer, the image data specified by {@code host_ptr} is stored as a single scanline which is a linear sequence of adjacent
     * elements.</p>
     *
     * @param context      a valid OpenCL context used to create the image object
     * @param properties   an optional list of properties for the image object and their corresponding values.
     *                     
     *                     <p>The list is terminated with the special property 0. If no properties are required, properties may be {@code NULL}.</p>
     * @param flags        a bit-field that is used to specify allocation and usage information about the image memory object being created.
     *                     
     *                     <p>For all image types except {@link CL12#CL_MEM_OBJECT_IMAGE1D_BUFFER MEM_OBJECT_IMAGE1D_BUFFER}, if the value specified for {@code flags} is 0, the default is used which is {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}.</p>
     *                     
     *                     <p>For {@code CL_MEM_OBJECT_IMAGE1D_BUFFER} image type, or an image created from another memory object (image or buffer), if the
     *                     {@code CL_MEM_READ_WRITE}, {@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY} or {@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} values are not specified in {@code flags}, they are inherited from the corresponding
     *                     memory access qualifiers associated with {@code mem_object}. The {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, {@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR} and {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} values cannot be
     *                     specified in {@code flags} but are inherited from the corresponding memory access qualifiers associated with {@code mem_object}. If
     *                     {@code CL_MEM_COPY_HOST_PTR} is specified in the memory access qualifier values associated with {@code mem_object} it does not imply any additional
     *                     copies when the image is created from {@code mem_object}. If the {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}, {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS} values are not
     *                     specified in {@code flags}, they are inherited from the corresponding memory access qualifiers associated with {@code mem_object}. One of:<br></p><table><tr><td>{@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param image_format a pointer to a structure that describes format properties of the image to be allocated.
     *                     
     *                     <p>A 1D image buffer or 2D image can be created from a buffer by specifying a buffer object in the {@code image_desc→mem_object}. A 2D image can be
     *                     created from another 2D image object by specifying an image object in the {@code image_desc→mem_object}.</p>
     * @param image_desc   a pointer to a structure that describes type and dimensions of the image to be allocated
     * @param host_ptr     a pointer to the image data that may already be allocated by the application.
     *                     
     *                     <p>Refer to table below for a description of how large the buffer that {@code host_ptr} points to must be.</p>
     *                     
     *                     <table class=striped>
     *                     <tr><th>ImageType</th><th>Size of buffer that {@code host_ptr} points to</th></tr>
     *                     <tr><td>{@link CL12#CL_MEM_OBJECT_IMAGE1D MEM_OBJECT_IMAGE1D}</td><td>&ge; {@code image_row_pitch}</td></tr>
     *                     <tr><td>{@link CL12#CL_MEM_OBJECT_IMAGE1D_BUFFER MEM_OBJECT_IMAGE1D_BUFFER}</td><td>&ge; {@code image_row_pitch}</td></tr>
     *                     <tr><td>{@link CL10#CL_MEM_OBJECT_IMAGE2D MEM_OBJECT_IMAGE2D}</td><td>&ge; {@code image_row_pitch * image_height}</td></tr>
     *                     <tr><td>{@link CL10#CL_MEM_OBJECT_IMAGE3D MEM_OBJECT_IMAGE3D}</td><td>&ge; {@code image_slice_pitch * image_depth}</td></tr>
     *                     <tr><td>{@link CL12#CL_MEM_OBJECT_IMAGE1D_ARRAY MEM_OBJECT_IMAGE1D_ARRAY}</td><td>&ge; {@code image_slice_pitch * image_array_size}</td></tr>
     *                     <tr><td>{@link CL12#CL_MEM_OBJECT_IMAGE2D_ARRAY MEM_OBJECT_IMAGE2D_ARRAY}</td><td>&ge; {@code image_slice_pitch * image_array_size}</td></tr>
     *                     </table>
     * @param errcode_ret  will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero image object and the {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the image object is created successfully. Otherwise, it returns a {@code NULL}
     *         value with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL11#CL_INVALID_PROPERTY INVALID_PROPERTY} if a property name in {@code properties} is not a supported property name, if the value specified for a supported property name
     *         is not valid, or if the same property name is specified more than once.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if values specified in {@code image_format} are not valid or if {@code image_format} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if a 2D image is created from a buffer and the row pitch and base address alignment does not follow the rules
     *         described for creating a 2D image from a buffer.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if a 2D image is created from a 2D image object and the rules described above are not followed.</li>
     *         <li>{@link CL12#CL_INVALID_IMAGE_DESCRIPTOR INVALID_IMAGE_DESCRIPTOR} if values specified in {@code image_desc} are not valid or if {@code image_desc} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions specified in {@code image_desc} exceed the maximum image dimensions for all devices in context.</li>
     *         <li>{@link CL10#CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in flags or if {@code host_ptr} is not
     *         {@code NULL} but {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in flags.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if an image is being created from another memory object (buffer or image) under one of the following circumstances:
     *         
     *         <ol>
     *         <li>{@code mem_object} was created with {@code CL_MEM_WRITE_ONLY} and {@code flags} specifies {@code CL_MEM_READ_WRITE} or
     *         {@code CL_MEM_READ_ONLY},</li>
     *         <li>{@code mem_object} was created with {@code CL_MEM_READ_ONLY} and flags specifies {@code CL_MEM_READ_WRITE} or {@code CL_MEM_WRITE_ONLY},</li>
     *         <li>{@code flags} specifies {@code CL_MEM_USE_HOST_PTR} or {@code CL_MEM_ALLOC_HOST_PTR} or {@code CL_MEM_COPY_HOST_PTR}.</li>
     *         </ol></li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if an image is being created from another memory object (buffer or image) and {@code mem_object} was created with
     *         {@code CL_MEM_HOST_WRITE_ONLY} and {@code flags} specifies {@code CL_MEM_HOST_READ_ONLY}, or if {@code mem_object} was created with
     *         {@code CL_MEM_HOST_READ_ONLY} and {@code flags} specifies {@code CL_MEM_HOST_WRITE_ONLY}, or if {@code mem_object} was created with
     *         {@code CL_MEM_HOST_NO_ACCESS} and {@code flags} specifies {@code CL_MEM_HOST_READ_ONLY} or {@code CL_MEM_HOST_WRITE_ONLY}.</li>
     *         <li>{@link CL10#CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if there are no devices in context that support {@code image_format}.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for image object.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if there are no devices in context that support images.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateImageWithProperties.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateImageWithProperties(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties const *") LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @Nullable @NativeType("void *") FloatBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImageWithProperties(context, memAddressSafe(properties), flags, image_format.address(), image_desc.address(), memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * Array version of: {@link #clCreateBufferWithProperties CreateBufferWithProperties}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateBufferWithProperties.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateBufferWithProperties(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties const *") long[] properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") ByteBuffer host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferWithProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPP(context, properties, flags, (long)host_ptr.remaining(), memAddress(host_ptr), errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateBufferWithProperties CreateBufferWithProperties}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateBufferWithProperties.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateBufferWithProperties(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties const *") long[] properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") short[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferWithProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPP(context, properties, flags, Integer.toUnsignedLong(host_ptr.length) << 1, host_ptr, errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateBufferWithProperties CreateBufferWithProperties}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateBufferWithProperties.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateBufferWithProperties(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties const *") long[] properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") int[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferWithProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPP(context, properties, flags, Integer.toUnsignedLong(host_ptr.length) << 2, host_ptr, errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateBufferWithProperties CreateBufferWithProperties}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateBufferWithProperties.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateBufferWithProperties(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties const *") long[] properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") float[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferWithProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPP(context, properties, flags, Integer.toUnsignedLong(host_ptr.length) << 2, host_ptr, errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateBufferWithProperties CreateBufferWithProperties}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateBufferWithProperties.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateBufferWithProperties(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties const *") long[] properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") double[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferWithProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPP(context, properties, flags, Integer.toUnsignedLong(host_ptr.length) << 3, host_ptr, errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateImageWithProperties CreateImageWithProperties}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateImageWithProperties.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateImageWithProperties(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties const *") long[] properties, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @Nullable @NativeType("void *") ByteBuffer host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImageWithProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPPP(context, properties, flags, image_format.address(), image_desc.address(), memAddressSafe(host_ptr), errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateImageWithProperties CreateImageWithProperties}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateImageWithProperties.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateImageWithProperties(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties const *") long[] properties, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @Nullable @NativeType("void *") short[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImageWithProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPPP(context, properties, flags, image_format.address(), image_desc.address(), host_ptr, errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateImageWithProperties CreateImageWithProperties}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateImageWithProperties.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateImageWithProperties(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties const *") long[] properties, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @Nullable @NativeType("void *") int[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImageWithProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPPP(context, properties, flags, image_format.address(), image_desc.address(), host_ptr, errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateImageWithProperties CreateImageWithProperties}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateImageWithProperties.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateImageWithProperties(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties const *") long[] properties, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @Nullable @NativeType("void *") float[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImageWithProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPPP(context, properties, flags, image_format.address(), image_desc.address(), host_ptr, errcode_ret, __functionAddress);
    }

}