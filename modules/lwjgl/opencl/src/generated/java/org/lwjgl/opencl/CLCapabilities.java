/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;
import java.util.Set;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;

/**
 * Defines the capabilities of an OpenCL platform or device.
 * 
 * <p>The instance returned by {@link CL#createPlatformCapabilities} exposes the functionality present on either the platform or any of its devices.
 * This is unlike the {@link CL10#CL_PLATFORM_EXTENSIONS PLATFORM_EXTENSIONS} string, which returns only platform functionality, supported across all platform devices.</p>
 * 
 * <p>The instance returned by {@link CL#createDeviceCapabilities} exposes only the functionality available on that particular device.</p>
 */
public class CLCapabilities {

    public final long
        clGetPlatformIDs,
        clGetPlatformInfo,
        clGetDeviceIDs,
        clGetDeviceInfo,
        clCreateContext,
        clCreateContextFromType,
        clRetainContext,
        clReleaseContext,
        clGetContextInfo,
        clCreateCommandQueue,
        clRetainCommandQueue,
        clReleaseCommandQueue,
        clGetCommandQueueInfo,
        clCreateBuffer,
        clEnqueueReadBuffer,
        clEnqueueWriteBuffer,
        clEnqueueCopyBuffer,
        clEnqueueMapBuffer,
        clCreateImage2D,
        clCreateImage3D,
        clGetSupportedImageFormats,
        clEnqueueReadImage,
        clEnqueueWriteImage,
        clEnqueueCopyImage,
        clEnqueueCopyImageToBuffer,
        clEnqueueCopyBufferToImage,
        clEnqueueMapImage,
        clGetImageInfo,
        clRetainMemObject,
        clReleaseMemObject,
        clEnqueueUnmapMemObject,
        clGetMemObjectInfo,
        clCreateSampler,
        clRetainSampler,
        clReleaseSampler,
        clGetSamplerInfo,
        clCreateProgramWithSource,
        clCreateProgramWithBinary,
        clRetainProgram,
        clReleaseProgram,
        clBuildProgram,
        clUnloadCompiler,
        clGetProgramInfo,
        clGetProgramBuildInfo,
        clCreateKernel,
        clCreateKernelsInProgram,
        clRetainKernel,
        clReleaseKernel,
        clSetKernelArg,
        clGetKernelInfo,
        clGetKernelWorkGroupInfo,
        clEnqueueNDRangeKernel,
        clEnqueueTask,
        clEnqueueNativeKernel,
        clWaitForEvents,
        clGetEventInfo,
        clRetainEvent,
        clReleaseEvent,
        clEnqueueMarker,
        clEnqueueBarrier,
        clEnqueueWaitForEvents,
        clGetEventProfilingInfo,
        clFlush,
        clFinish,
        clGetExtensionFunctionAddress,
        clCreateFromGLBuffer,
        clCreateFromGLTexture2D,
        clCreateFromGLTexture3D,
        clCreateFromGLRenderbuffer,
        clGetGLObjectInfo,
        clGetGLTextureInfo,
        clEnqueueAcquireGLObjects,
        clEnqueueReleaseGLObjects,
        clCreateSubBuffer,
        clSetMemObjectDestructorCallback,
        clEnqueueReadBufferRect,
        clEnqueueWriteBufferRect,
        clEnqueueCopyBufferRect,
        clCreateUserEvent,
        clSetUserEventStatus,
        clSetEventCallback,
        clGetExtensionFunctionAddressForPlatform,
        clRetainDevice,
        clReleaseDevice,
        clCreateSubDevices,
        clCreateImage,
        clCreateProgramWithBuiltInKernels,
        clCompileProgram,
        clLinkProgram,
        clUnloadPlatformCompiler,
        clGetKernelArgInfo,
        clEnqueueFillBuffer,
        clEnqueueFillImage,
        clEnqueueMigrateMemObjects,
        clEnqueueMarkerWithWaitList,
        clEnqueueBarrierWithWaitList,
        clCreateFromGLTexture,
        clCreateCommandQueueWithProperties,
        clCreatePipe,
        clGetPipeInfo,
        clSVMAlloc,
        clSVMFree,
        clEnqueueSVMFree,
        clEnqueueSVMMemcpy,
        clEnqueueSVMMemFill,
        clEnqueueSVMMap,
        clEnqueueSVMUnmap,
        clSetKernelArgSVMPointer,
        clSetKernelExecInfo,
        clCreateSamplerWithProperties,
        clSetDefaultDeviceCommandQueue,
        clGetDeviceAndHostTimer,
        clGetHostTimer,
        clCreateProgramWithIL,
        clCloneKernel,
        clGetKernelSubGroupInfo,
        clEnqueueSVMMigrateMem,
        clSetProgramReleaseCallback,
        clSetProgramSpecializationConstant,
        clSetContextDestructorCallback,
        clCreateBufferWithProperties,
        clCreateImageWithProperties,
        clTrackLiveObjectsAltera,
        clReportLiveObjectsAltera,
        clEnqueueWaitSignalAMD,
        clEnqueueWriteSignalAMD,
        clEnqueueMakeBuffersResidentAMD,
        clCreateCommandQueueWithPropertiesAPPLE,
        clLogMessagesToSystemLogAPPLE,
        clLogMessagesToStdoutAPPLE,
        clLogMessagesToStderrAPPLE,
        clGetGLContextInfoAPPLE,
        clImportMemoryARM,
        clReleaseDeviceEXT,
        clRetainDeviceEXT,
        clCreateSubDevicesEXT,
        clEnqueueMigrateMemObjectEXT,
        clEnqueueGenerateMipmapIMG,
        clCreateAcceleratorINTEL,
        clRetainAcceleratorINTEL,
        clReleaseAcceleratorINTEL,
        clGetAcceleratorInfoINTEL,
        clCreateBufferWithPropertiesINTEL,
        clGetSupportedGLTextureFormatsINTEL,
        clGetSupportedVA_APIMediaSurfaceFormatsINTEL,
        clHostMemAllocINTEL,
        clDeviceMemAllocINTEL,
        clSharedMemAllocINTEL,
        clMemFreeINTEL,
        clMemBlockingFreeINTEL,
        clGetMemAllocInfoINTEL,
        clSetKernelArgMemPointerINTEL,
        clEnqueueMemFillINTEL,
        clEnqueueMemcpyINTEL,
        clEnqueueMigrateMemINTEL,
        clEnqueueMemAdviseINTEL,
        clGetDeviceIDsFromVA_APIMediaAdapterINTEL,
        clCreateFromVA_APIMediaSurfaceINTEL,
        clEnqueueAcquireVA_APIMediaSurfacesINTEL,
        clEnqueueReleaseVA_APIMediaSurfacesINTEL,
        clCreateCommandBufferKHR,
        clRetainCommandBufferKHR,
        clReleaseCommandBufferKHR,
        clFinalizeCommandBufferKHR,
        clEnqueueCommandBufferKHR,
        clCommandBarrierWithWaitListKHR,
        clCommandCopyBufferKHR,
        clCommandCopyBufferRectKHR,
        clCommandCopyBufferToImageKHR,
        clCommandCopyImageKHR,
        clCommandCopyImageToBufferKHR,
        clCommandFillBufferKHR,
        clCommandFillImageKHR,
        clCommandNDRangeKernelKHR,
        clGetCommandBufferInfoKHR,
        clCreateCommandQueueWithPropertiesKHR,
        clCreateEventFromEGLSyncKHR,
        clCreateFromEGLImageKHR,
        clEnqueueAcquireEGLObjectsKHR,
        clEnqueueReleaseEGLObjectsKHR,
        clEnqueueAcquireExternalMemObjectsKHR,
        clEnqueueReleaseExternalMemObjectsKHR,
        clCreateEventFromGLsyncKHR,
        clGetGLContextInfoKHR,
        clCreateProgramWithILKHR,
        clCreateSemaphoreWithPropertiesKHR,
        clEnqueueWaitSemaphoresKHR,
        clEnqueueSignalSemaphoresKHR,
        clGetSemaphoreInfoKHR,
        clReleaseSemaphoreKHR,
        clRetainSemaphoreKHR,
        clGetKernelSubGroupInfoKHR,
        clGetKernelSuggestedLocalWorkSizeKHR,
        clTerminateContextKHR,
        clCreateBufferNV,
        clSetContentSizeBufferPoCL,
        clGetDeviceImageInfoQCOM;

    /** When true, {@link CL10} is supported. */
    public final boolean OpenCL10;
    /** When true, {@link CL10GL} is supported. */
    public final boolean OpenCL10GL;
    /** When true, {@link CL11} is supported. */
    public final boolean OpenCL11;
    /** When true, {@link CL12} is supported. */
    public final boolean OpenCL12;
    /** When true, {@link CL12GL} is supported. */
    public final boolean OpenCL12GL;
    /** When true, {@link CL20} is supported. */
    public final boolean OpenCL20;
    /** When true, {@link CL21} is supported. */
    public final boolean OpenCL21;
    /** When true, {@link CL22} is supported. */
    public final boolean OpenCL22;
    /** When true, {@link CL30} is supported. */
    public final boolean OpenCL30;
    /** When true, {@link ALTERACompilerMode} is supported. */
    public final boolean cl_altera_compiler_mode;
    /** When true, {@link ALTERADeviceTemperature} is supported. */
    public final boolean cl_altera_device_temperature;
    /** When true, {@link ALTERALiveObjectTracking} is supported. */
    public final boolean cl_altera_live_object_tracking;
    /** When true, {@link AMDBusAddressableMemory} is supported. */
    public final boolean cl_amd_bus_addressable_memory;
    /**
     * When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/amd/cl_amd_compile_options.txt">amd_compile_options</a> extension is supported.
     * 
     * <p>This extension adds the following options, which are not part of the OpenCL specification:</p>
     * 
     * <ul>
     * <li>-g &ndash; This is an experimental feature that lets you use the GNU project debugger, GDB, to debug kernels on x86 CPUs running Linux or
     * cygwin/minGW under Windows. This option does not affect the default optimization of the OpenCL code.</li>
     * <li>-O0 &ndash; Specifies to the compiler not to optimize. This is equivalent to the OpenCL standard option -cl-opt-disable.</li>
     * <li>-f[no-]bin-source &ndash; Does [not] generate OpenCL source in the .source section. By default, the source is NOT generated.</li>
     * <li>-f[no-]bin-llvmir &ndash; Does [not] generate LLVM IR in the .llvmir section. By default, LLVM IR IS generated.</li>
     * <li>-f[no-]bin-amdil &ndash; Does [not] generate AMD IL in the .amdil section. By Default, AMD IL is NOT generated.</li>
     * <li>-f[no-]bin-exe &ndash; Does [not] generate the executable (ISA) in .text section. By default, the executable IS generated.</li>
     * <li>-f[no-]bin-hsail &ndash; Does [not] generate HSAIL/BRIG in the binary. By default, HSA IL/BRIG is NOT generated.</li>
     * </ul>
     * 
     * <p>To avoid source changes, there are two environment variables that can be used to change CL options during the runtime:</p>
     * 
     * <ul>
     * <li>AMD_OCL_BUILD_OPTIONS &ndash; Overrides the CL options specified in {@link CL10#clBuildProgram BuildProgram}.</li>
     * <li>AMD_OCL_BUILD_OPTIONS_APPEND &ndash; Appends options to the options specified in {@link CL10#clBuildProgram BuildProgram}.</li>
     * </ul>
     */
    public final boolean cl_amd_compile_options;
    /** When true, {@link AMDDeviceAttributeQuery} is supported. */
    public final boolean cl_amd_device_attribute_query;
    /** When true, {@link AMDDeviceBoardName} is supported. */
    public final boolean cl_amd_device_board_name;
    /** When true, {@link AMDDevicePersistentMemory} is supported. */
    public final boolean cl_amd_device_persistent_memory;
    /** When true, {@link AMDDeviceProfilingTimerOffset} is supported. */
    public final boolean cl_amd_device_profiling_timer_offset;
    /** When true, {@link AMDDeviceTopology} is supported. */
    public final boolean cl_amd_device_topology;
    /**
     * When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/amd/cl_amd_event_callback.txt">amd_event_callback</a> extension is supported.
     * 
     * <p>This extension provides the ability to register event callbacks for states other than {@link CL10#CL_COMPLETE COMPLETE}. The full set of event states are allowed:
     * {@link CL10#CL_QUEUED QUEUED}, {@link CL10#CL_SUBMITTED SUBMITTED}, and {@link CL10#CL_RUNNING RUNNING}.</p>
     */
    public final boolean cl_amd_event_callback;
    /**
     * When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/amd/cl_amd_fp64.txt">amd_fp64</a> extension is supported.
     * 
     * <p>This extension provides a subset of the functionality of that provided by the cl_khr_fp64 extension. When enabled, the compiler recognizes the double
     * scalar and vector types, compiles expressions involving those types, and accepts calls to all builtin functions enabled by the cl_khr_fp64 extension.
     * However, this extension does not guarantee that all cl_khr_fp64 built in functions are implemented and does not guarantee that the built in functions
     * that have been implemented would be considered conformant to the cl_khr_fp64 extension.</p>
     */
    public final boolean cl_amd_fp64;
    /**
     * When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/amd/cl_amd_media_ops.txt">amd_media_ops</a> extension is supported.
     * 
     * <p>The directive when enabled adds the following built-in functions to the OpenCL language.</p>
     * 
     * <pre><code>
     * Note: typen denote opencl scalar type {n = 1} and vector types {n = 4, 8, 16}.
     * 
     * Build-in Function
     *   uint  amd_pack(float4 src)
     * Description
     *   dst =   ((((uint)src.s0) &amp; 0xff)      )
     *         + ((((uint)src.s1) &amp; 0xff) &lt;&lt;  8)
     *         + ((((uint)src.s2) &amp; 0xff) &lt;&lt; 16)
     *         + ((((uint)src.s3) &amp; 0xff) &lt;&lt; 24)
     * 
     * Build-in Function
     *   floatn  amd_unpack3(unitn src)
     * Description
     *   dst.s0 = (float)((src.s0 &gt;&gt; 24) &amp; 0xff)
     *   similar operation applied to other components of the vectors
     * 
     * Build-in Function
     *   floatn   amd_unpack2 (unitn src)
     * Description
     *   dst.s0 = (float)((src.s0 &gt;&gt; 16) &amp; 0xff)
     *   similar operation applied to other components of the vectors
     * 
     * Build-in Function
     *   floatn   amd_unpack1 (unitn src)
     * Description
     *   dst.s0 = (float)((src.s0 &gt;&gt; 8) &amp; 0xff)
     *   similar operation applied to other components of the vectors
     * 
     * Build-in Function
     *   floatn   amd_unpack0 (unitn src)
     * Description
     *   dst.s0 = (float)(src.s0 &amp; 0xff)
     *   similar operation applied to other components of the vectors
     * 
     * Build-in Function
     *   uintn  amd_bitalign (uintn src0, uintn src1, uintn src2)
     * Description
     *   dst.s0 =  (uint) (((((long)src0.s0) &lt;&lt; 32) | (long)src1.s0) &gt;&gt; (src2.s0 &amp; 31))
     *   similar operation applied to other components of the vectors.
     * 
     * 
     * Build-in Function
     *   uintn  amd_bytealign (uintn src0, uintn src1, uintn src2)
     * Description
     *   dst.s0 =  (uint) (((((long)src0.s0) &lt;&lt; 32) | (long)src1.s0) &gt;&gt; ((src2.s0 &amp; 3)*8))
     *   similar operation applied to other components of the vectors
     * 
     * Build-in Function
     *   uintn  amd_lerp (uintn src0, uintn src1, uintn src2)
     * Description
     *   dst.s0 = (((((src0.s0 &gt;&gt;  0) &amp; 0xff) + ((src1.s0 &gt;&gt;  0) &amp; 0xff) + ((src2.s0 &gt;&gt;  0) &amp; 1)) &gt;&gt; 1) &lt;&lt;  0) +
     *            (((((src0.s0 &gt;&gt;  8) &amp; 0xff) + ((src1.s0 &gt;&gt;  8) &amp; 0xff) + ((src2.s0 &gt;&gt;  8) &amp; 1)) &gt;&gt; 1) &lt;&lt;  8) +
     *            (((((src0.s0 &gt;&gt; 16) &amp; 0xff) + ((src1.s0 &gt;&gt; 16) &amp; 0xff) + ((src2.s0 &gt;&gt; 16) &amp; 1)) &gt;&gt; 1) &lt;&lt; 16) +
     *            (((((src0.s0 &gt;&gt; 24) &amp; 0xff) + ((src1.s0 &gt;&gt; 24) &amp; 0xff) + ((src2.s0 &gt;&gt; 24) &amp; 1)) &gt;&gt; 1) &lt;&lt; 24);
     *   similar operation applied to other components of the vectors
     * 
     * Build-in Function
     *   uintn  amd_sad (uintn src0, uintn src1, uintn src2)
     * Description
     *   dst.s0 = src2.s0 +
     *            abs(((src0.s0 &gt;&gt;  0) &amp; 0xff) - ((src1.s0 &gt;&gt;  0) &amp; 0xff)) +
     *            abs(((src0.s0 &gt;&gt;  8) &amp; 0xff) - ((src1.s0 &gt;&gt;  8) &amp; 0xff)) +
     *            abs(((src0.s0 &gt;&gt; 16) &amp; 0xff) - ((src1.s0 &gt;&gt; 16) &amp; 0xff)) +
     *            abs(((src0.s0 &gt;&gt; 24) &amp; 0xff) - ((src1.s0 &gt;&gt; 24) &amp; 0xff));
     *   similar operation applied to other components of the vectors
     * 
     * Build-in Function
     *   uintn  amd_sadhi (uintn src0, uintn src1n, uintn src2)
     * Description
     *   dst.s0 = src2.s0 +
     *            (abs(((src0.s0 &gt;&gt;  0) &amp; 0xff) - ((src1.s0 &gt;&gt;  0) &amp; 0xff)) &lt;&lt; 16) +
     *            (abs(((src0.s0 &gt;&gt;  8) &amp; 0xff) - ((src1.s0 &gt;&gt;  8) &amp; 0xff)) &lt;&lt; 16) +
     *            (abs(((src0.s0 &gt;&gt; 16) &amp; 0xff) - ((src1.s0 &gt;&gt; 16) &amp; 0xff)) &lt;&lt; 16) +
     *            (abs(((src0.s0 &gt;&gt; 24) &amp; 0xff) - ((src1.s0 &gt;&gt; 24) &amp; 0xff)) &lt;&lt; 16);
     *   similar operation applied to other components of the vectors
     * 
     * Build-in Function
     *   uint  amd_sad4(uint4 src0, uint4 src1, uint src2)
     * Description
     *   dst   = src2   +
     *            abs(((src0.s0 &gt;&gt;  0) &amp; 0xff) - ((src1.s0 &gt;&gt;  0) &amp; 0xff)) +
     *            abs(((src0.s0 &gt;&gt;  8) &amp; 0xff) - ((src1.s0 &gt;&gt;  8) &amp; 0xff)) +
     *            abs(((src0.s0 &gt;&gt; 16) &amp; 0xff) - ((src1.s0 &gt;&gt; 16) &amp; 0xff)) +
     *            abs(((src0.s0 &gt;&gt; 24) &amp; 0xff) - ((src1.s0 &gt;&gt; 24) &amp; 0xff)) +
     *            abs(((src0.s1 &gt;&gt;  0) &amp; 0xff) - ((src1.s0 &gt;&gt;  0) &amp; 0xff)) +
     *            abs(((src0.s1 &gt;&gt;  8) &amp; 0xff) - ((src1.s1 &gt;&gt;  8) &amp; 0xff)) +
     *            abs(((src0.s1 &gt;&gt; 16) &amp; 0xff) - ((src1.s1 &gt;&gt; 16) &amp; 0xff)) +
     *            abs(((src0.s1 &gt;&gt; 24) &amp; 0xff) - ((src1.s1 &gt;&gt; 24) &amp; 0xff)) +
     *            abs(((src0.s2 &gt;&gt;  0) &amp; 0xff) - ((src1.s2 &gt;&gt;  0) &amp; 0xff)) +
     *            abs(((src0.s2 &gt;&gt;  8) &amp; 0xff) - ((src1.s2 &gt;&gt;  8) &amp; 0xff)) +
     *            abs(((src0.s2 &gt;&gt; 16) &amp; 0xff) - ((src1.s2 &gt;&gt; 16) &amp; 0xff)) +
     *            abs(((src0.s2 &gt;&gt; 24) &amp; 0xff) - ((src1.s2 &gt;&gt; 24) &amp; 0xff)) +
     *            abs(((src0.s3 &gt;&gt;  0) &amp; 0xff) - ((src1.s3 &gt;&gt;  0) &amp; 0xff)) +
     *            abs(((src0.s3 &gt;&gt;  8) &amp; 0xff) - ((src1.s3 &gt;&gt;  8) &amp; 0xff)) +
     *            abs(((src0.s3 &gt;&gt; 16) &amp; 0xff) - ((src1.s3 &gt;&gt; 16) &amp; 0xff)) +
     *            abs(((src0.s3 &gt;&gt; 24) &amp; 0xff) - ((src1.s3 &gt;&gt; 24) &amp; 0xff));</code></pre>
     */
    public final boolean cl_amd_media_ops;
    /**
     * When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/amd/cl_amd_media_ops2.txt">amd_media_ops2</a> extension is supported.
     * 
     * <p>The directive when enabled adds the following built-in functions to the OpenCL language.</p>
     * 
     * <pre><code>
     * Note: typen denote open scalar type { n = 1 } and vector types { n = 2, 4, 8, 16 }.
     * 
     * Build-in Function
     *   uintn  amd_msad (uintn src0, uintn src1, uintn src2)
     * Description
     *   uchar4 src0u8 = as_uchar4(src0.s0);
     *   uchar4 src1u8 = as_uchar4(src1.s0);
     *   dst.s0 = src2.s0 +
     *            ((src1u8.s0 == 0) ? 0 : abs(src0u8.s0 - src1u8.s0)) +
     *            ((src1u8.s1 == 0) ? 0 : abs(src0u8.s1 - src1u8.s1)) +
     *            ((src1u8.s2 == 0) ? 0 : abs(src0u8.s2 - src1u8.s2)) +
     *            ((src1u8.s3 == 0) ? 0 : abs(src0u8.s3 - src1u8.s3));
     *   similar operation applied to other components of the vectors
     * 
     * Build-in Function
     *   ulongn amd_qsad (ulongn src0, uintn src1, ulongn src2)
     * Description
     *   uchar8 src0u8 = as_uchar8(src0.s0);
     *   ushort4 src2u16 = as_ushort4(src2.s0);
     *   ushort4 dstu16;
     *   dstu16.s0 = amd_sad(as_uint(src0u8.s0123), src1.s0, src2u16.s0);
     *   dstu16.s1 = amd_sad(as_uint(src0u8.s1234), src1.s0, src2u16.s1);
     *   dstu16.s2 = amd_sad(as_uint(src0u8.s2345), src1.s0, src2u16.s2);
     *   dstu16.s3 = amd_sad(as_uint(src0u8.s3456), src1.s0, src2u16.s3);
     *   dst.s0 = as_uint2(dstu16);
     *   similar operation applied to other components of the vectors
     * 
     * Build-in Function
     *   ulongn amd_mqsad (ulongn src0, uintn src1, ulongn src2)
     * Description
     *   uchar8 src0u8 = as_uchar8(src0.s0);
     *   ushort4 src2u16 = as_ushort4(src2.s0);
     *   ushort4 dstu16;
     *   dstu16.s0 = amd_msad(as_uint(src0u8.s0123), src1.s0, src2u16.s0);
     *   dstu16.s1 = amd_msad(as_uint(src0u8.s1234), src1.s0, src2u16.s1);
     *   dstu16.s2 = amd_msad(as_uint(src0u8.s2345), src1.s0, src2u16.s2);
     *   dstu16.s3 = amd_msad(as_uint(src0u8.s3456), src1.s0, src2u16.s3);
     *   dst.s0 = as_uint2(dstu16);
     *   similar operation applied to other components of the vectors
     * 
     * Build-in Function
     *   uintn  amd_sadw (uintn src0, uintn src1, uintn src2)
     * Description
     *   ushort2 src0u16 = as_ushort2(src0.s0);
     *   ushort2 src1u16 = as_ushort2(src1.s0);
     *   dst.s0 = src2.s0 +
     *            abs(src0u16.s0 - src1u16.s0) +
     *            abs(src0u16.s1 - src1u16.s1);
     *   similar operation applied to other components of the vectors
     * 
     * Build-in Function
     *   uintn  amd_sadd (uintn src0, uintn src1, uintn src2)
     * Description
     *   dst.s0 = src2.s0 +  abs(src0.s0 - src1.s0);
     *   similar operation applied to other components of the vectors
     * 
     * Built-in Function:
     *   uintn amd_bfm (uintn src0, uintn src1)
     * Description
     *   dst.s0 = ((1 &lt;&lt; (src0.s0 &amp; 0x1f)) - 1) &lt;&lt; (src1.s0 &amp; 0x1f);
     *   similar operation applied to other components of the vectors
     * 
     * Built-in Function:
     *   uintn amd_bfe (uintn src0, uintn src1, uintn src2)
     * Description
     *   NOTE: operator &gt;&gt; below represent logical right shift
     *   offset = src1.s0 &amp; 31;
     *   width = src2.s0 &amp; 31;
     *   if width = 0
     *       dst.s0 = 0;
     *   else if (offset + width) &lt; 32
     *       dst.s0 = (src0.s0 &lt;&lt; (32 - offset - width)) &gt;&gt; (32 - width);
     *   else
     *       dst.s0 = src0.s0 &gt;&gt; offset;
     *   similar operation applied to other components of the vectors
     * 
     * Built-in Function:
     *    intn amd_bfe (intn src0, uintn src1, uintn src2)
     * Description
     *   NOTE: operator &gt;&gt; below represent arithmetic right shift
     *   offset = src1.s0 &amp; 31;
     *   width = src2.s0 &amp; 31;
     *   if width = 0
     *       dst.s0 = 0;
     *   else if (offset + width) &lt; 32
     *       dst.s0 = src0.s0 &lt;&lt; (32-offset-width) &gt;&gt; 32-width;
     *   else
     *       dst.s0 = src0.s0 &gt;&gt; offset;
     *   similar operation applied to other components of the vectors
     * 
     * Built-in Function:
     *    intn amd_median3 (intn src0, intn src1, intn src2)
     *    uintn amd_median3 (uintn src0, uintn src1, uintn src2)
     *    floatn amd_median3 (floatn src0, floatn src1, floattn src2)
     * Description
     *    returns median of src0, src1, and src2
     * 
     * Built-in Function:
     *    intn amd_min3 (intn src0, intn src1, intn src2)
     *    uintn amd_min3 (uintn src0, uintn src1, uintn src2)
     *    floatn amd_min3 (floatn src0, floatn src1, floattn src2)
     * Description
     *    returns min of src0, src1, and src2
     * 
     * Built-in Function:
     *    intn amd_max3 (intn src0, intn src1, intn src2)
     *    uintn amd_max3 (uintn src0, uintn src1, uintn src2)
     *    floatn amd_max3 (floatn src0, floatn src1, floattn src2)
     * Description
     *    returns max of src0, src1, and src2</code></pre>
     */
    public final boolean cl_amd_media_ops2;
    /** When true, {@link AMDOfflineDevices} is supported. */
    public final boolean cl_amd_offline_devices;
    /**
     * When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/amd/cl_amd_popcnt.txt">amd_popcnt</a> extension is supported.
     * 
     * <p>This extension introduces a “population count” function called popcnt. This extension was taken into core OpenCL 1.2, and the function was renamed
     * popcount. The core 1.2 popcount function is identical to the AMD extension popcnt function.</p>
     */
    public final boolean cl_amd_popcnt;
    /**
     * When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/amd/cl_amd_predefined_macros.txt">amd_predefined_macros</a> extension is supported.
     * 
     * <p>The following macros are predefined when compiling OpenCL™ C kernels. These macros are defined automatically based on the device for which the code is
     * being compiled.</p>
     * 
     * <h5>GPU devices</h5>
     * 
     * <ul>
     * <li>__Barts__</li>
     * <li>__BeaverCreek__</li>
     * <li>__Bheem__</li>
     * <li>__Bonaire__</li>
     * <li>__Caicos__</li>
     * <li>__Capeverde__</li>
     * <li>__Carrizo__</li>
     * <li>__Cayman__</li>
     * <li>__Cedar__</li>
     * <li>__Cypress__</li>
     * <li>__Devastator__</li>
     * <li>__Hainan__</li>
     * <li>__Iceland__</li>
     * <li>__Juniper__</li>
     * <li>__Kalindi__</li>
     * <li>__Kauai__</li>
     * <li>__Lombok__</li>
     * <li>__Loveland__</li>
     * <li>__Mullins__</li>
     * <li>__Oland__</li>
     * <li>__Pitcairn__</li>
     * <li>__RV710__</li>
     * <li>__RV730__</li>
     * <li>__RV740__</li>
     * <li>__RV770__</li>
     * <li>__RV790__</li>
     * <li>__Redwood__</li>
     * <li>__Scrapper__</li>
     * <li>__Spectre__</li>
     * <li>__Spooky__</li>
     * <li>__Tahiti__</li>
     * <li>__Tonga__</li>
     * <li>__Turks__</li>
     * <li>__WinterPark__</li>
     * <li>__GPU__</li>
     * </ul>
     * 
     * <h5>CPU devices</h5>
     * 
     * <ul>
     * <li>__CPU__</li>
     * <li>__X86__</li>
     * <li>__X86_64__</li>
     * </ul>
     * 
     * <p>Note that __GPU__ or __CPU__ are predefined whenever a GPU or CPU device is the compilation target.</p>
     */
    public final boolean cl_amd_predefined_macros;
    /**
     * When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/amd/cl_amd_printf.txt">amd_printf</a> extension is supported.
     * 
     * <p>This extension adds the built-in function {@code printf(__constant char * restrict format, …);}</p>
     * 
     * <p>This function writes output to the stdout stream associated with the host application. The format string is a character sequence that:</p>
     * 
     * <ul>
     * <li>is null-terminated and composed of zero and more directives,</li>
     * <li>ordinary characters (i.e. not %), which are copied directly to the output stream unchanged, and</li>
     * <li>conversion specifications, each of which can result in fetching zero or more arguments, converting them, and then writing the final result to the
     * output stream.</li>
     * </ul>
     * 
     * <p>The format string must be resolvable at compile time; thus, it cannot be dynamically created by the executing program. (Note that the use of variadic
     * arguments in the built-in printf does not imply its use in other builtins; more importantly, it is not valid to use printf in user-defined functions or
     * kernels.)</p>
     * 
     * <p>The OpenCL C printf closely matches the definition found as part of the C99 standard. Note that conversions introduced in the format string with % are
     * supported with the following guidelines:</p>
     * 
     * <ul>
     * <li>A 32-bit floating point argument is not converted to a 64-bit double, unless the extension cl_khr_fp64 is supported and enabled. This includes the
     * double variants if cl_khr_fp64 is supported and defined in the corresponding compilation unit.</li>
     * <li>64-bit integer types can be printed using %ld / %lx / %lu.</li>
     * <li>%lld / %llx / %llu are not supported and reserved for 128-bit integer types (long long).</li>
     * <li>All OpenCL vector types can be explicitly passed and printed using the modifier vn, where n can be 2, 3, 4, 8, or 16. This modifier appears before
     * the original conversion specifier for the vector’s component type (for example, to print a float4 %v4f). Since vn is a conversion specifier, it is
     * valid to apply optional flags, such as field width and precision, just as it is when printing the component types. Since a vector is an aggregate
     * type, the comma separator is used between the components: 0:1, … , n-2:n-1.</li>
     * </ul>
     */
    public final boolean cl_amd_printf;
    /**
     * When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/amd/cl_amd_vec3.txt">amd_vec3</a> extension is supported.
     * 
     * <p>This extension adds support for vectors with three elements: float3, short3, char3, etc. This data type was added to OpenCL 1.1 as a core feature.</p>
     */
    public final boolean cl_amd_vec3;
    /** When true, {@link APPLEBiasedFixedPointImageFormats} is supported. */
    public final boolean cl_APPLE_biased_fixed_point_image_formats;
    /** When true, {@link APPLECommandQueuePriority} is supported. */
    public final boolean cl_APPLE_command_queue_priority;
    /** When true, {@link APPLECommandQueueSelectComputeUnits} is supported. */
    public final boolean cl_APPLE_command_queue_select_compute_units;
    /** When true, {@link APPLEContextLoggingFunctions} is supported. */
    public final boolean cl_APPLE_ContextLoggingFunctions;
    /** When true, {@link APPLEFixedAlphaChannelOrders} is supported. */
    public final boolean cl_APPLE_fixed_alpha_channel_orders;
    /** When true, {@code APPLE_fp64_basic_ops} is supported. */
    public final boolean cl_APPLE_fp64_basic_ops;
    /** When true, {@link APPLEGLSharing} is supported. */
    public final boolean cl_APPLE_gl_sharing;
    /** When true, {@link APPLEQueryKernelNames} is supported. */
    public final boolean cl_APPLE_query_kernel_names;
    /** When true, {@link ARMControlledKernelTermination} is supported. */
    public final boolean cl_arm_controlled_kernel_termination;
    /** When true, {@link ARMCoreID} is supported. */
    public final boolean cl_arm_core_id;
    /** When true, {@link ARMImportMemory} is supported. */
    public final boolean cl_arm_import_memory;
    /** When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/arm/cl_arm_integer_dot_product.txt">cl_arm_integer_dot_product_accumulate_int16</a> extension is supported. */
    public final boolean cl_arm_integer_dot_product_accumulate_int16;
    /** When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/arm/cl_arm_integer_dot_product.txt">cl_arm_integer_dot_product_accumulate_int8</a> extension is supported. */
    public final boolean cl_arm_integer_dot_product_accumulate_int8;
    /** When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/arm/cl_arm_integer_dot_product.txt">cl_arm_integer_dot_product_accumulate_saturate_int8</a> extension is supported. */
    public final boolean cl_arm_integer_dot_product_accumulate_saturate_int8;
    /** When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/arm/cl_arm_integer_dot_product.txt">cl_arm_integer_dot_product_int8</a> extension is supported. */
    public final boolean cl_arm_integer_dot_product_int8;
    /** When true, {@link ARMJobSlotSelection} is supported. */
    public final boolean cl_arm_job_slot_selection;
    /**
     * When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/arm/cl_arm_non_uniform_work_group_size.txt">arm_non_uniform_work_group_size</a> extension is supported.
     * 
     * <p>This extension provides a way to enqueue kernels with local work-group sizes that are not integer factors of the global work-group size in OpenCL C 1.x
     * languages.</p>
     * 
     * <p>Such work-groups are referred to in the OpenCL 2.0 specification as non-uniform work-groups.</p>
     * 
     * <p>To enable this extension the option {@code -cl-arm-non-uniform-work-group-size} must be provided in the options string when building a program from
     * source using {@link CL10#clBuildProgram BuildProgram}. Kernels created from such a program will be able to be enqueued via {@link CL10#clEnqueueNDRangeKernel EnqueueNDRangeKernel} with a non-uniform local
     * work-group size.</p>
     * 
     * <p>This feature is enabled by default in OpenCL C 2.0. See section 5.10 of the OpenCL 2.0 API specification. This section also details how kernels that
     * are enqueued with non-uniform work-group sizes are divided into work groups.</p>
     * 
     * <p>The built in function {@code get_local_size()} for kernels that have been built with this extension will take on the OpenCL 2.0 behaviour. See section
     * 6.13.1 of the OpenCL 2.0 C specification for details.</p>
     */
    public final boolean cl_arm_non_uniform_work_group_size;
    /** When true, {@link ARMPrintf} is supported. */
    public final boolean cl_arm_printf;
    /** When true, {@link ARMProtectedMemoryAllocation} is supported. */
    public final boolean cl_arm_protected_memory_allocation;
    /** When true, {@link ARMSchedulingControls} is supported. */
    public final boolean cl_arm_scheduling_controls;
    /**
     * When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/arm/cl_arm_thread_limit_hint.txt">arm_thread_limit_hint</a> extension is supported.
     * 
     * <p>This extension enables an application to provide a hint for the maximum number of threads allowed to run concurrently on a compute unit. This results
     * in a limit in the threads used by a kernel instance on devices that support it, lowering pressure on caches.</p>
     */
    public final boolean cl_arm_thread_limit_hint;
    /** When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/cl/cl_cl_arm_import_memory_android_hardware_buffer.txt">cl_arm_import_memory_android_hardware_buffer</a> extension is supported. */
    public final boolean cl_cl_arm_import_memory_android_hardware_buffer;
    /** When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/cl/cl_cl_arm_import_memory_dma_buf.txt">cl_arm_import_memory_dma_buf</a> extension is supported. */
    public final boolean cl_cl_arm_import_memory_dma_buf;
    /** When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/cl/cl_cl_arm_import_memory_host.txt">cl_arm_import_memory_host</a> extension is supported. */
    public final boolean cl_cl_arm_import_memory_host;
    /** When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/cl/cl_cl_arm_import_memory_protected.txt">cl_arm_import_memory_protected</a> extension is supported. */
    public final boolean cl_cl_arm_import_memory_protected;
    /** When true, {@link EXTAtomicCounters32} is supported. */
    public final boolean cl_ext_atomic_counters_32;
    /** When true, {@link EXTAtomicCounters64} is supported. */
    public final boolean cl_ext_atomic_counters_64;
    /** When true, {@link EXTCXXForOpencl} is supported. */
    public final boolean cl_ext_cxx_for_opencl;
    /** When true, {@link EXTDeviceFission} is supported. */
    public final boolean cl_ext_device_fission;
    /** When true, {@link EXTFloatAtomics} is supported. */
    public final boolean cl_ext_float_atomics;
    /** When true, {@link EXTMigrateMemobject} is supported. */
    public final boolean cl_ext_migrate_memobject;
    /** When true, {@link IMGCachedAllocations} is supported. */
    public final boolean cl_img_cached_allocations;
    /** When true, {@link IMGGenerateMipmap} is supported. */
    public final boolean cl_img_generate_mipmap;
    /** When true, {@link IMGMemProperties} is supported. */
    public final boolean cl_img_mem_properties;
    /** When true, {@link IMGYUVImage} is supported. */
    public final boolean cl_img_yuv_image;
    /** When true, {@link INTELAccelerator} is supported. */
    public final boolean cl_intel_accelerator;
    /** When true, {@link INTELAdvancedMotionEstimation} is supported. */
    public final boolean cl_intel_advanced_motion_estimation;
    /** When true, {@link INTELCommandQueueFamilies} is supported. */
    public final boolean cl_intel_command_queue_families;
    /** When true, {@link INTELCreateBufferWithProperties} is supported. */
    public final boolean cl_intel_create_buffer_with_properties;
    /** When true, {@link INTELDeviceAttributeQuery} is supported. */
    public final boolean cl_intel_device_attribute_query;
    /** When true, {@link INTELDevicePartitionByNames} is supported. */
    public final boolean cl_intel_device_partition_by_names;
    /** When true, {@link INTELDeviceSideAVCMotionEstimation} is supported. */
    public final boolean cl_intel_device_side_avc_motion_estimation;
    /** When true, {@link INTELDriverDiagnostics} is supported. */
    public final boolean cl_intel_driver_diagnostics;
    /** When true, {@link INTELEGLImageYUV} is supported. */
    public final boolean cl_intel_egl_image_yuv;
    /** When true, {@link INTELExecByLocalThread} is supported. */
    public final boolean cl_intel_exec_by_local_thread;
    /**
     * This extension augments the block read/write functionality available in the Intel vendor extensions {@link INTELSubgroups intel_subgroups} and
     * <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/intel/cl_intel_subgroups_short.txt">intel_media_block_io</a> by the specification of additional built-in functions to facilitate the reading and writing of flexible 2D
     * regions from images. This API allows for the explicit specification of the width and height of the image regions.
     * 
     * <p>While not required, this extension is most useful when the subgroup size is known at compile-time. The primary use case for this extension is to
     * support the reading of the edge texels (or image elements) of neighboring macro-blocks as described in the Intel vendor extension
     * {@link INTELDeviceSideAVCMotionEstimation intel_device_side_avc_motion_estimation}. When using the built-in functions from {@code cl_intel_device_ side_avc_motion_estimation} the
     * subgroup size is implicitly fixed to 16. In other use cases the subgroup size may be fixed using the {@link INTELRequiredSubgroupSize intel_required_subgroup_size} extension, if
     * needed.</p>
     */
    public final boolean cl_intel_media_block_io;
    /** When true, {@link INTELMemAllocBufferLocation} is supported. */
    public final boolean cl_intel_mem_alloc_buffer_location;
    /** When true, {@link INTELMemChannelProperty} is supported. */
    public final boolean cl_intel_mem_channel_property;
    /** When true, {@link INTELMemForceHostMemory} is supported. */
    public final boolean cl_intel_mem_force_host_memory;
    /** When true, {@link INTELMotionEstimation} is supported. */
    public final boolean cl_intel_motion_estimation;
    /** When true, {@link INTELPackedYUV} is supported. */
    public final boolean cl_intel_packed_yuv;
    /** When true, {@link INTELPlanarYUV} is supported. */
    public final boolean cl_intel_planar_yuv;
    /** When true, {@code intel_printf} is supported. */
    public final boolean cl_intel_printf;
    /** When true, {@link INTELRequiredSubgroupSize} is supported. */
    public final boolean cl_intel_required_subgroup_size;
    /** When true, {@link INTELSharingFormatQuery} is supported. */
    public final boolean cl_intel_sharing_format_query;
    /** When true, {@link INTELSimultaneousSharing} is supported. */
    public final boolean cl_intel_simultaneous_sharing;
    /**
     * This extension defines how modules using the SPIR-V extension {@code SPV_INTEL_device_side_avc_motion_estimation} may behave in an OpenCL environment.
     * 
     * <p>Requires {@link CL21 OpenCL 2.1} and {@link INTELDeviceSideAVCMotionEstimation intel_device_side_avc_motion_estimation}.</p>
     */
    public final boolean cl_intel_spirv_device_side_avc_motion_estimation;
    /**
     * This extension defines how modules using the SPIR-V extension {@code SPV_INTEL_media_block_io} may behave in an OpenCL environment.
     * 
     * <p>Requires {@link CL21 OpenCL 2.1} and <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/intel/cl_intel_media_block_io.txt">intel_spirv_media_block_io</a>.</p>
     */
    public final boolean cl_intel_spirv_media_block_io;
    /**
     * This extension defines how modules using the SPIR-V extension {@code SPV_INTEL_subgroups} may behave in an OpenCL environment.
     * 
     * <p>Requires {@link CL21 OpenCL 2.1} and {@link INTELSubgroups intel_subgroups}.</p>
     */
    public final boolean cl_intel_spirv_subgroups;
    /** When true, {@link INTELSubgroups} is supported. */
    public final boolean cl_intel_subgroups;
    /**
     * The goal of this extension is to allow programmers to improve the performance of applications operating on 8-bit data types by extending the subgroup
     * functions described in the {@link INTELSubgroups intel_subgroups} extension to support 8-bit integer data types (chars and uchars). Specifically, the extension:
     * 
     * <ul>
     * <li>Extends the subgroup broadcast function to allow 8-bit integer values to be broadcast from one work item to all other work items in the subgroup.</li>
     * <li>Extends the subgroup scan and reduction functions to operate on 8-bit integer data types.</li>
     * <li>Extends the Intel subgroup shuffle functions to allow arbitrarily exchanging 8-bit integer values among work items in the subgroup.</li>
     * <li>Extends the Intel subgroup block read and write functions to allow reading and writing 8-bit integer data from images and buffers.</li>
     * </ul>
     * 
     * <p>Requires {@link CL12 OpenCL 1.2} and {@link INTELSubgroups intel_subgroups}.</p>
     */
    public final boolean cl_intel_subgroups_char;
    /**
     * The goal of this extension is to allow programmers to improve the performance of applications operating on 64-bit data types by extending the subgroup
     * functions described in the {@link INTELSubgroups intel_subgroups} extension to support 64-bit integer data types (longs and ulongs). Specifically, the extension:
     * 
     * <ul>
     * <li>Extends the Intel subgroup block read and write functions to allow reading and writing 64-bit integer data from images and buffers.</li>
     * </ul>
     * 
     * <p>Note that {@code cl_intel_subgroups} and {@code cl_khr_subgroups} already support broadcasts, scans, and reductions for 64-bit integer types, and that
     * {@code cl_intel_subgroups} already supports shuffles for 64-bit integer types.</p>
     * 
     * <p>Requires {@link CL12 OpenCL 1.2} and {@link INTELSubgroups intel_subgroups}.</p>
     */
    public final boolean cl_intel_subgroups_long;
    /**
     * The goal of this extension is to allow programmers to improve the performance of applications operating on 16-bit data types by extending the subgroup
     * functions described in the {@link INTELSubgroups intel_subgroups} extension to support 16-bit integer data types (shorts and ushorts). Specifically, the extension:
     * 
     * <ul>
     * <li>Extends the subgroup broadcast function to allow 16-bit integer values to be broadcast from one work item to all other work items in the subgroup.</li>
     * <li>Extends the subgroup scan and reduction functions to operate on 16-bit integer data types.</li>
     * <li>Extends the Intel subgroup shuffle functions to allow arbitrarily exchanging 16-bit integer values among work items in the subgroup.</li>
     * <li>Extends the Intel subgroup block read and write functions to allow reading and writing 16-bit integer data from images and buffers.</li>
     * </ul>
     * 
     * <p>Requires {@link CL12 OpenCL 1.2} and {@link INTELSubgroups intel_subgroups}.</p>
     */
    public final boolean cl_intel_subgroups_short;
    /** When true, {@link INTELUnifiedSharedMemory} is supported. */
    public final boolean cl_intel_unified_shared_memory;
    /** When true, {@link INTELVAAPIMediaSharing} is supported. */
    public final boolean cl_intel_va_api_media_sharing;
    /**
     * When true, the <strong>khr_3d_image_writes</strong> extension is supported.
     * 
     * <p>This extension adds support for kernel writes to 3D images.</p>
     */
    public final boolean cl_khr_3d_image_writes;
    /**
     * When true, the <strong>khr_async_work_group_copy_fence</strong> extension is supported.
     * 
     * <p>The extension adds a new built-in function to OpenCL C to establish a memory synchronization ordering of asynchronous copies.</p>
     */
    public final boolean cl_khr_async_work_group_copy_fence;
    /**
     * When true, the <strong>khr_byte_addressable_store</strong> extension is supported.
     * 
     * <p>This extension eliminates the restriction of not allowing writes to a pointer (or array elements) of types less than 32-bit wide in kernel program.</p>
     */
    public final boolean cl_khr_byte_addressable_store;
    /** When true, {@link KHRCommandBuffer} is supported. */
    public final boolean cl_khr_command_buffer;
    /** When true, {@link KHRCreateCommandQueue} is supported. */
    public final boolean cl_khr_create_command_queue;
    /** When true, {@link KHRDepthImages} is supported. */
    public final boolean cl_khr_depth_images;
    /**
     * When true, the <strong>khr_device_enqueue_local_arg_types</strong> extension is supported.
     * 
     * <p>This extension allows arguments to blocks passed to enqueue_kernel functions to be declared as a pointer to any type (built-in or user-defined) in
     * local memory instead of just {@code local void *}.</p>
     */
    public final boolean cl_khr_device_enqueue_local_arg_types;
    /** When true, {@link KHRDeviceUUID} is supported. */
    public final boolean cl_khr_device_uuid;
    /** When true, {@link KHREGLEvent} is supported. */
    public final boolean cl_khr_egl_event;
    /** When true, {@link KHREGLImage} is supported. */
    public final boolean cl_khr_egl_image;
    /**
     * When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/khr/cl_khr_expect_assume.txt">khr_expect_assume</a> extension is supported.
     * 
     * <p>This extension adds mechanisms to provide information to the compiler that may improve the performance of some kernels. Specifically, this extension
     * adds the ability to:</p>
     * 
     * <ul>
     * <li>Tell the compiler the <i>expected</i> value of a variable.</li>
     * <li>Allow the compiler to <i>assume</i> a condition is true.</li>
     * </ul>
     * 
     * <p>These functions are not required for functional correctness.</p>
     * 
     * <p>The initial version of this extension extends the OpenCL SPIR-V environment to support new instructions for offline compilation tool chains. Similar
     * functionality may be provided by some OpenCL C online compilation tool chains, but formal support in OpenCL C is not required by the initial version of
     * the extension.</p>
     */
    public final boolean cl_khr_expect_assume;
    /**
     * When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/khr/cl_khr_extended_async_copies.txt">khr_extended_async_copies</a> extension is supported.
     * 
     * <p>This extension augments built-in asynchronous copy functions to OpenCL C to support more patterns:</p>
     * 
     * <ol>
     * <li>for async copy between 2D source and 2D destination.</li>
     * <li>for async copy between 3D source and 3D destination.</li>
     * </ol>
     */
    public final boolean cl_khr_extended_async_copies;
    /**
     * When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/khr/cl_khr_extended_bit_ops.txt">khr_extended_bit_ops</a> extension is supported.
     * 
     * <p>This extension adds OpenCL C functions for performing extended bit operations. Specifically, the following functions are added:</p>
     * 
     * <ul>
     * <li>bitfield insert: insert bits from one source operand into another source operand.</li>
     * <li>bitfield extract: extract bits from a source operand, with sign- or zero-extension.</li>
     * <li>bit reverse: reverse the bits of a source operand.</li>
     * </ul>
     */
    public final boolean cl_khr_extended_bit_ops;
    /** When true, {@link KHRExtendedVersioning} is supported. */
    public final boolean cl_khr_extended_versioning;
    /** When true, {@link KHRExternalMemory} is supported. */
    public final boolean cl_khr_external_memory;
    /** When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/khr/cl_khr_external_memory_dma_buf.txt">khr_external_memory_dma_buf</a> extension is supported. */
    public final boolean cl_khr_external_memory_dma_buf;
    /** When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/khr/cl_khr_external_memory_opaque_fd.txt">khr_external_memory_opaque_fd</a> extension is supported. */
    public final boolean cl_khr_external_memory_opaque_fd;
    /** When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/khr/cl_khr_external_memory_win32.txt">khr_external_memory_win32</a> extension is supported. */
    public final boolean cl_khr_external_memory_win32;
    /** When true, {@link KHRExternalSemaphore} is supported. */
    public final boolean cl_khr_external_semaphore;
    /** When true, {@link KHRFP16} is supported. */
    public final boolean cl_khr_fp16;
    /** When true, {@link KHRFP64} is supported. */
    public final boolean cl_khr_fp64;
    /** When true, {@link KHRGLDepthImages} is supported. */
    public final boolean cl_khr_gl_depth_images;
    /** When true, {@link KHRGLEvent} is supported. */
    public final boolean cl_khr_gl_event;
    /** When true, {@link KHRGLMSAASharing} is supported. */
    public final boolean cl_khr_gl_msaa_sharing;
    /** When true, {@link KHRGLSharing} is supported. */
    public final boolean cl_khr_gl_sharing;
    /**
     * When true, the <strong>khr_global_int32_base_atomics</strong> extension is supported.
     * 
     * <p>This extension adds basic atomic operations on 32-bit integers in global memory.</p>
     */
    public final boolean cl_khr_global_int32_base_atomics;
    /**
     * When true, the <strong>khr_global_int32_extended_atomics</strong> extension is supported.
     * 
     * <p>This extension adds extended atomic operations on 32-bit integers in global memory.</p>
     */
    public final boolean cl_khr_global_int32_extended_atomics;
    /** When true, {@link KHRICD} is supported. */
    public final boolean cl_khr_icd;
    /** When true, {@link KHRILProgram} is supported. */
    public final boolean cl_khr_il_program;
    /** When true, {@link KHRImage2DFromBuffer} is supported. */
    public final boolean cl_khr_image2d_from_buffer;
    /** When true, {@link KHRInitializeMemory} is supported. */
    public final boolean cl_khr_initialize_memory;
    /**
     * When true, the <strong>khr_int64_base_atomics</strong> extension is supported.
     * 
     * <p>This extension adds basic atomic operations on 64-bit integers in both global and local memory.</p>
     */
    public final boolean cl_khr_int64_base_atomics;
    /**
     * When true, the <strong>khr_int64_extended_atomics</strong> extension is supported.
     * 
     * <p>This extension adds extended atomic operations on 64-bit integers in both global and local memory.</p>
     */
    public final boolean cl_khr_int64_extended_atomics;
    /** When true, {@link KHRIntegerDotProduct} is supported. */
    public final boolean cl_khr_integer_dot_product;
    /**
     * When true, the <strong>khr_local_int32_base_atomics</strong> extension is supported.
     * 
     * <p>This extension adds basic atomic operations on 32-bit integers in local memory.</p>
     */
    public final boolean cl_khr_local_int32_base_atomics;
    /**
     * When true, the <strong>khr_local_int32_extended_atomics</strong> extension is supported.
     * 
     * <p>This extension adds extended atomic operations on 32-bit integers in local memory.</p>
     */
    public final boolean cl_khr_local_int32_extended_atomics;
    /** When true, {@link KHRMipmapImage} is supported. */
    public final boolean cl_khr_mipmap_image;
    /**
     * When true, the <strong>khr_mipmap_image_writes</strong> extension is supported.
     * 
     * <p>This extension adds built-in functions that can be used to write a mip-mapped image in an OpenCL C program.</p>
     */
    public final boolean cl_khr_mipmap_image_writes;
    /** When true, {@link KHRPCIBusInfo} is supported. */
    public final boolean cl_khr_pci_bus_info;
    /** When true, {@link KHRPriorityHints} is supported. */
    public final boolean cl_khr_priority_hints;
    /**
     * When true, the <strong>khr_select_fprounding_mode</strong> extension is supported.
     * 
     * <p>This extension adds support for specifying the rounding mode for an instruction or group of instructions in the program source.</p>
     * 
     * <p>The appropriate rounding mode can be specified using {@code #pragma OPENCL SELECT_ROUNDING_MODE} rounding-mode in the program source.</p>
     * 
     * <p>The {@code #pragma OPENCL SELECT_ROUNDING_MODE} sets the rounding mode for all instructions that operate on floating-point types (scalar or vector
     * types) or produce floating-point values that follow this pragma in the program source until the next {@code #pragma OPENCL SELECT_ROUNDING_MODE} is
     * encountered. Note that the rounding mode specified for a block of code is known at compile time. Except where otherwise documented, the callee
     * functions do not inherit the rounding mode of the caller function.</p>
     * 
     * <p>If this extension is enabled, the {@code __ROUNDING_MODE__} preprocessor symbol shall be defined to be one of the following according to the current
     * rounding mode:</p>
     * 
     * <pre><code>
     * #define __ROUNDING_MODE__ rte
     * #define __ROUNDING_MODE__ rtz
     * #define __ROUNDING_MODE__ rtp
     * #define __ROUNDING_MODE__ rtz</code></pre>
     * 
     * <p>The default rounding mode is round to nearest even. The built-in math functions, the common functions, and the geometric functions are implemented with
     * the round to nearest even rounding mode.</p>
     * 
     * <p>Various built-in conversions and the vstore_half and vstorea_halfn built-in functions that do not specify a rounding mode inherit the current rounding
     * mode. Conversions from floating-point to integer type always use rtz mode, except where the user specifically asks for another rounding mode.</p>
     * 
     * <p>Notes The above four rounding modes are defined by IEEE 754. Floating-point calculations may be carried out internally with extra precision and then
     * rounded to fit into the destination type. Round to nearest even is currently the only rounding mode required by the OpenCL specification and is
     * therefore the default rounding mode. In addition, only static selection of rounding mode is supported. Dynamically reconfiguring the rounding modes as
     * specified by the IEEE 754 spec is not a requirement.</p>
     */
    public final boolean cl_khr_select_fprounding_mode;
    /** When true, {@link KHRSemaphore} is supported. */
    public final boolean cl_khr_semaphore;
    /** When true, {@link KHRSPIR} is supported. */
    public final boolean cl_khr_spir;
    /**
     * When true, the <strong>khr_srgb_image_writes</strong> extension is supported.
     * 
     * <p>This extension enables kernels to write to sRGB images using the {@code write_imagef} built-in function. The sRGB image formats that may be written to
     * will be returned by {@link CL10#clGetSupportedImageFormats GetSupportedImageFormats}.</p>
     * 
     * <p>When the image is an sRGB image, the {@code write_imagef} built-in function will perform the linear to sRGB conversion. Only the R, G, and B components
     * are converted from linear to sRGB; the A component is written as-is.</p>
     */
    public final boolean cl_khr_srgb_image_writes;
    /**
     * When true, the <strong>khr_subgroup_ballot</strong> extension is supported.
     * 
     * <p>This extension adds the ability to collect and operate on ballots from work items in the subgroup.</p>
     */
    public final boolean cl_khr_subgroup_ballot;
    /**
     * When true, the <strong>khr_subgroup_clustered_reduce</strong> extension is supported.
     * 
     * <p>This extension adds support for clustered reductions that operate on a subset of work items in the subgroup.</p>
     */
    public final boolean cl_khr_subgroup_clustered_reduce;
    /**
     * When true, the <strong>khr_subgroup_extended_types</strong> extension is supported.
     * 
     * <p>This extension adds additional supported data types to the existing subgroup broadcast, scan, and reduction functions.</p>
     */
    public final boolean cl_khr_subgroup_extended_types;
    /** When true, {@link KHRSubgroupNamedBarrier} is supported. */
    public final boolean cl_khr_subgroup_named_barrier;
    /**
     * When true, the <strong>khr_subgroup_non_uniform_arithmetic</strong> extension is supported.
     * 
     * <p>This extension adds the ability to use some subgroup functions within non-uniform flow control, including additional scan and reduction operators.</p>
     */
    public final boolean cl_khr_subgroup_non_uniform_arithmetic;
    /**
     * When true, the <strong>khr_subgroup_non_uniform_vote</strong> extension is supported.
     * 
     * <p>This extension adds the ability to elect a single work item from a subgroup to perform a task and to hold votes among work items in a subgroup.</p>
     */
    public final boolean cl_khr_subgroup_non_uniform_vote;
    /**
     * When true, the <strong>khr_subgroup_shuffle</strong> extension is supported.
     * 
     * <p>This extension adds additional ways to exchange data among work items in a subgroup.</p>
     */
    public final boolean cl_khr_subgroup_shuffle;
    /**
     * When true, the <strong>khr_subgroup_shuffle_relative</strong> extension is supported.
     * 
     * <p>This extension adds specialized ways to exchange data among work items in a subgroup that may perform better on some implementations.</p>
     */
    public final boolean cl_khr_subgroup_shuffle_relative;
    /** When true, {@link KHRSubgroups} is supported. */
    public final boolean cl_khr_subgroups;
    /** When true, {@link KHRSuggestedLocalWorkSize} is supported. */
    public final boolean cl_khr_suggested_local_work_size;
    /** When true, {@link KHRTerminateContext} is supported. */
    public final boolean cl_khr_terminate_context;
    /** When true, {@link KHRThrottleHints} is supported. */
    public final boolean cl_khr_throttle_hints;
    /**
     * When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/nv/cl_nv_compiler_options.txt">nv_compiler_options</a> extension is supported.
     * 
     * <p>This extension allows the programmer to pass options to the PTX assembler allowing greater control over code generation.</p>
     * 
     * <pre><code>
     * -cl-nv-maxrregcount &lt;N&gt;
     *     Passed on to ptxas as --maxrregcount &lt;N&gt;
     *         N is a positive integer.
     *     Specify the maximum number of registers that GPU functions can use.
     *     Until a function-specific limit, a higher value will generally increase
     *     the performance of individual GPU threads that execute this function.
     *     However, because thread registers are allocated from a global register
     *     pool on each GPU, a higher value of this option will also reduce the
     *     maximum thread block size, thereby reducing the amount of thread
     *     parallelism. Hence, a good maxrregcount value is the result of a
     *     trade-off.
     *     If this option is not specified, then no maximum is assumed. Otherwise
     *     the specified value will be rounded to the next multiple of 4 registers
     *     until the GPU specific maximum of 128 registers.
     * 
     * -cl-nv-opt-level &lt;N&gt;
     *     Passed on to ptxas as --opt-level &lt;N&gt;
     *         N is a positive integer, or 0 (no optimization).
     *     Specify optimization level.
     *     Default value:  3.
     * 
     * -cl-nv-verbose
     *     Passed on to ptxas as --verbose
     *     Enable verbose mode.
     *     Output will be reported in the build log (accessible through the
     *     callback parameter to clBuildProgram).</code></pre>
     */
    public final boolean cl_nv_compiler_options;
    /** When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/nv/cl_nv_copy_opts.txt">nv_copy_opts</a> extension is supported. */
    public final boolean cl_nv_copy_opts;
    /** When true, {@link NVCreateBuffer} is supported. */
    public final boolean cl_nv_create_buffer;
    /** When true, {@link NVDeviceAttributeQuery} is supported. */
    public final boolean cl_nv_device_attribute_query;
    /**
     * When true, the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/nv/cl_nv_pragma_unroll.txt">nv_pragma_unroll</a> extension is supported.
     * 
     * <h5>Overview</h5>
     * 
     * <p>This extension extends the OpenCL C language with a hint that allows loops to be unrolled. This pragma must be used for a loop and can be used to
     * specify full unrolling or partial unrolling by a certain amount. This is a hint and the compiler may ignore this pragma for any reason.</p>
     * 
     * <h5>Goals</h5>
     * 
     * <p>The principal goal of the pragma unroll is to improve the performance of loops via unrolling. Typically this enables other optimizations or improves
     * instruction level parallelism of a thread.</p>
     * 
     * <h5>Details</h5>
     * 
     * <p>A user may specify that a loop in the source program be unrolled. This is done via a pragma. The syntax of this pragma is as follows</p>
     * 
     * <p>{@code #pragma unroll [unroll-factor]}</p>
     * 
     * <p>The pragma unroll may optionally specify an unroll factor. The pragma must be placed immediately before the loop and only applies to that loop.</p>
     * 
     * <p>If unroll factor is not specified then the compiler will try to do complete or full unrolling of the loop. If a loop unroll factor is specified the
     * compiler will perform partial loop unrolling. The loop factor, if specified, must be a compile time non negative integer constant.</p>
     * 
     * <p>A loop unroll factor of 1 means that the compiler should not unroll the loop.</p>
     * 
     * <p>A complete unroll specification has no effect if the trip count of the loop is not compile-time computable.</p>
     */
    public final boolean cl_nv_pragma_unroll;
    /** When true, {@link pocl_content_size} is supported. */
    public final boolean cl_pocl_content_size;
    /** When true, {@link QCOMEXTHostPtr} is supported. */
    public final boolean cl_qcom_ext_host_ptr;
    /** When true, {@link QCOMEXTHostPtrIOCoherent} is supported. */
    public final boolean cl_qcom_ext_host_ptr_iocoherent;

    CLCapabilities(FunctionProvider provider, Set<String> ext) {
        this(ext,
            provider.getFunctionAddress("clGetPlatformIDs"),
            provider.getFunctionAddress("clGetPlatformInfo"),
            provider.getFunctionAddress("clGetDeviceIDs"),
            provider.getFunctionAddress("clGetDeviceInfo"),
            provider.getFunctionAddress("clCreateContext"),
            provider.getFunctionAddress("clCreateContextFromType"),
            provider.getFunctionAddress("clRetainContext"),
            provider.getFunctionAddress("clReleaseContext"),
            provider.getFunctionAddress("clGetContextInfo"),
            provider.getFunctionAddress("clCreateCommandQueue"),
            provider.getFunctionAddress("clRetainCommandQueue"),
            provider.getFunctionAddress("clReleaseCommandQueue"),
            provider.getFunctionAddress("clGetCommandQueueInfo"),
            provider.getFunctionAddress("clCreateBuffer"),
            provider.getFunctionAddress("clEnqueueReadBuffer"),
            provider.getFunctionAddress("clEnqueueWriteBuffer"),
            provider.getFunctionAddress("clEnqueueCopyBuffer"),
            provider.getFunctionAddress("clEnqueueMapBuffer"),
            provider.getFunctionAddress("clCreateImage2D"),
            provider.getFunctionAddress("clCreateImage3D"),
            provider.getFunctionAddress("clGetSupportedImageFormats"),
            provider.getFunctionAddress("clEnqueueReadImage"),
            provider.getFunctionAddress("clEnqueueWriteImage"),
            provider.getFunctionAddress("clEnqueueCopyImage"),
            provider.getFunctionAddress("clEnqueueCopyImageToBuffer"),
            provider.getFunctionAddress("clEnqueueCopyBufferToImage"),
            provider.getFunctionAddress("clEnqueueMapImage"),
            provider.getFunctionAddress("clGetImageInfo"),
            provider.getFunctionAddress("clRetainMemObject"),
            provider.getFunctionAddress("clReleaseMemObject"),
            provider.getFunctionAddress("clEnqueueUnmapMemObject"),
            provider.getFunctionAddress("clGetMemObjectInfo"),
            provider.getFunctionAddress("clCreateSampler"),
            provider.getFunctionAddress("clRetainSampler"),
            provider.getFunctionAddress("clReleaseSampler"),
            provider.getFunctionAddress("clGetSamplerInfo"),
            provider.getFunctionAddress("clCreateProgramWithSource"),
            provider.getFunctionAddress("clCreateProgramWithBinary"),
            provider.getFunctionAddress("clRetainProgram"),
            provider.getFunctionAddress("clReleaseProgram"),
            provider.getFunctionAddress("clBuildProgram"),
            provider.getFunctionAddress("clUnloadCompiler"),
            provider.getFunctionAddress("clGetProgramInfo"),
            provider.getFunctionAddress("clGetProgramBuildInfo"),
            provider.getFunctionAddress("clCreateKernel"),
            provider.getFunctionAddress("clCreateKernelsInProgram"),
            provider.getFunctionAddress("clRetainKernel"),
            provider.getFunctionAddress("clReleaseKernel"),
            provider.getFunctionAddress("clSetKernelArg"),
            provider.getFunctionAddress("clGetKernelInfo"),
            provider.getFunctionAddress("clGetKernelWorkGroupInfo"),
            provider.getFunctionAddress("clEnqueueNDRangeKernel"),
            provider.getFunctionAddress("clEnqueueTask"),
            provider.getFunctionAddress("clEnqueueNativeKernel"),
            provider.getFunctionAddress("clWaitForEvents"),
            provider.getFunctionAddress("clGetEventInfo"),
            provider.getFunctionAddress("clRetainEvent"),
            provider.getFunctionAddress("clReleaseEvent"),
            provider.getFunctionAddress("clEnqueueMarker"),
            provider.getFunctionAddress("clEnqueueBarrier"),
            provider.getFunctionAddress("clEnqueueWaitForEvents"),
            provider.getFunctionAddress("clGetEventProfilingInfo"),
            provider.getFunctionAddress("clFlush"),
            provider.getFunctionAddress("clFinish"),
            provider.getFunctionAddress("clGetExtensionFunctionAddress"),
            provider.getFunctionAddress("clCreateFromGLBuffer"),
            provider.getFunctionAddress("clCreateFromGLTexture2D"),
            provider.getFunctionAddress("clCreateFromGLTexture3D"),
            provider.getFunctionAddress("clCreateFromGLRenderbuffer"),
            provider.getFunctionAddress("clGetGLObjectInfo"),
            provider.getFunctionAddress("clGetGLTextureInfo"),
            provider.getFunctionAddress("clEnqueueAcquireGLObjects"),
            provider.getFunctionAddress("clEnqueueReleaseGLObjects"),
            provider.getFunctionAddress("clCreateSubBuffer"),
            provider.getFunctionAddress("clSetMemObjectDestructorCallback"),
            provider.getFunctionAddress("clEnqueueReadBufferRect"),
            provider.getFunctionAddress("clEnqueueWriteBufferRect"),
            provider.getFunctionAddress("clEnqueueCopyBufferRect"),
            provider.getFunctionAddress("clCreateUserEvent"),
            provider.getFunctionAddress("clSetUserEventStatus"),
            provider.getFunctionAddress("clSetEventCallback"),
            provider.getFunctionAddress("clGetExtensionFunctionAddressForPlatform"),
            provider.getFunctionAddress("clRetainDevice"),
            provider.getFunctionAddress("clReleaseDevice"),
            provider.getFunctionAddress("clCreateSubDevices"),
            provider.getFunctionAddress("clCreateImage"),
            provider.getFunctionAddress("clCreateProgramWithBuiltInKernels"),
            provider.getFunctionAddress("clCompileProgram"),
            provider.getFunctionAddress("clLinkProgram"),
            provider.getFunctionAddress("clUnloadPlatformCompiler"),
            provider.getFunctionAddress("clGetKernelArgInfo"),
            provider.getFunctionAddress("clEnqueueFillBuffer"),
            provider.getFunctionAddress("clEnqueueFillImage"),
            provider.getFunctionAddress("clEnqueueMigrateMemObjects"),
            provider.getFunctionAddress("clEnqueueMarkerWithWaitList"),
            provider.getFunctionAddress("clEnqueueBarrierWithWaitList"),
            provider.getFunctionAddress("clCreateFromGLTexture"),
            provider.getFunctionAddress("clCreateCommandQueueWithProperties"),
            provider.getFunctionAddress("clCreatePipe"),
            provider.getFunctionAddress("clGetPipeInfo"),
            provider.getFunctionAddress("clSVMAlloc"),
            provider.getFunctionAddress("clSVMFree"),
            provider.getFunctionAddress("clEnqueueSVMFree"),
            provider.getFunctionAddress("clEnqueueSVMMemcpy"),
            provider.getFunctionAddress("clEnqueueSVMMemFill"),
            provider.getFunctionAddress("clEnqueueSVMMap"),
            provider.getFunctionAddress("clEnqueueSVMUnmap"),
            provider.getFunctionAddress("clSetKernelArgSVMPointer"),
            provider.getFunctionAddress("clSetKernelExecInfo"),
            provider.getFunctionAddress("clCreateSamplerWithProperties"),
            provider.getFunctionAddress("clSetDefaultDeviceCommandQueue"),
            provider.getFunctionAddress("clGetDeviceAndHostTimer"),
            provider.getFunctionAddress("clGetHostTimer"),
            provider.getFunctionAddress("clCreateProgramWithIL"),
            provider.getFunctionAddress("clCloneKernel"),
            provider.getFunctionAddress("clGetKernelSubGroupInfo"),
            provider.getFunctionAddress("clEnqueueSVMMigrateMem"),
            provider.getFunctionAddress("clSetProgramReleaseCallback"),
            provider.getFunctionAddress("clSetProgramSpecializationConstant"),
            provider.getFunctionAddress("clSetContextDestructorCallback"),
            provider.getFunctionAddress("clCreateBufferWithProperties"),
            provider.getFunctionAddress("clCreateImageWithProperties"),
            provider.getFunctionAddress("clTrackLiveObjectsAltera"),
            provider.getFunctionAddress("clReportLiveObjectsAltera"),
            provider.getFunctionAddress("clEnqueueWaitSignalAMD"),
            provider.getFunctionAddress("clEnqueueWriteSignalAMD"),
            provider.getFunctionAddress("clEnqueueMakeBuffersResidentAMD"),
            provider.getFunctionAddress("clCreateCommandQueueWithPropertiesAPPLE"),
            provider.getFunctionAddress("clLogMessagesToSystemLogAPPLE"),
            provider.getFunctionAddress("clLogMessagesToStdoutAPPLE"),
            provider.getFunctionAddress("clLogMessagesToStderrAPPLE"),
            provider.getFunctionAddress("clGetGLContextInfoAPPLE"),
            provider.getFunctionAddress("clImportMemoryARM"),
            provider.getFunctionAddress("clReleaseDeviceEXT"),
            provider.getFunctionAddress("clRetainDeviceEXT"),
            provider.getFunctionAddress("clCreateSubDevicesEXT"),
            provider.getFunctionAddress("clEnqueueMigrateMemObjectEXT"),
            provider.getFunctionAddress("clEnqueueGenerateMipmapIMG"),
            provider.getFunctionAddress("clCreateAcceleratorINTEL"),
            provider.getFunctionAddress("clRetainAcceleratorINTEL"),
            provider.getFunctionAddress("clReleaseAcceleratorINTEL"),
            provider.getFunctionAddress("clGetAcceleratorInfoINTEL"),
            provider.getFunctionAddress("clCreateBufferWithPropertiesINTEL"),
            provider.getFunctionAddress("clGetSupportedGLTextureFormatsINTEL"),
            provider.getFunctionAddress("clGetSupportedVA_APIMediaSurfaceFormatsINTEL"),
            provider.getFunctionAddress("clHostMemAllocINTEL"),
            provider.getFunctionAddress("clDeviceMemAllocINTEL"),
            provider.getFunctionAddress("clSharedMemAllocINTEL"),
            provider.getFunctionAddress("clMemFreeINTEL"),
            provider.getFunctionAddress("clMemBlockingFreeINTEL"),
            provider.getFunctionAddress("clGetMemAllocInfoINTEL"),
            provider.getFunctionAddress("clSetKernelArgMemPointerINTEL"),
            provider.getFunctionAddress("clEnqueueMemFillINTEL"),
            provider.getFunctionAddress("clEnqueueMemcpyINTEL"),
            provider.getFunctionAddress("clEnqueueMigrateMemINTEL"),
            provider.getFunctionAddress("clEnqueueMemAdviseINTEL"),
            provider.getFunctionAddress("clGetDeviceIDsFromVA_APIMediaAdapterINTEL"),
            provider.getFunctionAddress("clCreateFromVA_APIMediaSurfaceINTEL"),
            provider.getFunctionAddress("clEnqueueAcquireVA_APIMediaSurfacesINTEL"),
            provider.getFunctionAddress("clEnqueueReleaseVA_APIMediaSurfacesINTEL"),
            provider.getFunctionAddress("clCreateCommandBufferKHR"),
            provider.getFunctionAddress("clRetainCommandBufferKHR"),
            provider.getFunctionAddress("clReleaseCommandBufferKHR"),
            provider.getFunctionAddress("clFinalizeCommandBufferKHR"),
            provider.getFunctionAddress("clEnqueueCommandBufferKHR"),
            provider.getFunctionAddress("clCommandBarrierWithWaitListKHR"),
            provider.getFunctionAddress("clCommandCopyBufferKHR"),
            provider.getFunctionAddress("clCommandCopyBufferRectKHR"),
            provider.getFunctionAddress("clCommandCopyBufferToImageKHR"),
            provider.getFunctionAddress("clCommandCopyImageKHR"),
            provider.getFunctionAddress("clCommandCopyImageToBufferKHR"),
            provider.getFunctionAddress("clCommandFillBufferKHR"),
            provider.getFunctionAddress("clCommandFillImageKHR"),
            provider.getFunctionAddress("clCommandNDRangeKernelKHR"),
            provider.getFunctionAddress("clGetCommandBufferInfoKHR"),
            provider.getFunctionAddress("clCreateCommandQueueWithPropertiesKHR"),
            provider.getFunctionAddress("clCreateEventFromEGLSyncKHR"),
            provider.getFunctionAddress("clCreateFromEGLImageKHR"),
            provider.getFunctionAddress("clEnqueueAcquireEGLObjectsKHR"),
            provider.getFunctionAddress("clEnqueueReleaseEGLObjectsKHR"),
            provider.getFunctionAddress("clEnqueueAcquireExternalMemObjectsKHR"),
            provider.getFunctionAddress("clEnqueueReleaseExternalMemObjectsKHR"),
            provider.getFunctionAddress("clCreateEventFromGLsyncKHR"),
            provider.getFunctionAddress("clGetGLContextInfoKHR"),
            provider.getFunctionAddress("clCreateProgramWithILKHR"),
            provider.getFunctionAddress("clCreateSemaphoreWithPropertiesKHR"),
            provider.getFunctionAddress("clEnqueueWaitSemaphoresKHR"),
            provider.getFunctionAddress("clEnqueueSignalSemaphoresKHR"),
            provider.getFunctionAddress("clGetSemaphoreInfoKHR"),
            provider.getFunctionAddress("clReleaseSemaphoreKHR"),
            provider.getFunctionAddress("clRetainSemaphoreKHR"),
            provider.getFunctionAddress("clGetKernelSubGroupInfoKHR"),
            provider.getFunctionAddress("clGetKernelSuggestedLocalWorkSizeKHR"),
            provider.getFunctionAddress("clTerminateContextKHR"),
            provider.getFunctionAddress("clCreateBufferNV"),
            provider.getFunctionAddress("clSetContentSizeBufferPoCL"),
            provider.getFunctionAddress("clGetDeviceImageInfoQCOM")
        );
    }

    CLCapabilities(CLCapabilities caps, Set<String> ext) {
        this(ext,
            caps.clGetPlatformIDs,
            caps.clGetPlatformInfo,
            caps.clGetDeviceIDs,
            caps.clGetDeviceInfo,
            caps.clCreateContext,
            caps.clCreateContextFromType,
            caps.clRetainContext,
            caps.clReleaseContext,
            caps.clGetContextInfo,
            caps.clCreateCommandQueue,
            caps.clRetainCommandQueue,
            caps.clReleaseCommandQueue,
            caps.clGetCommandQueueInfo,
            caps.clCreateBuffer,
            caps.clEnqueueReadBuffer,
            caps.clEnqueueWriteBuffer,
            caps.clEnqueueCopyBuffer,
            caps.clEnqueueMapBuffer,
            caps.clCreateImage2D,
            caps.clCreateImage3D,
            caps.clGetSupportedImageFormats,
            caps.clEnqueueReadImage,
            caps.clEnqueueWriteImage,
            caps.clEnqueueCopyImage,
            caps.clEnqueueCopyImageToBuffer,
            caps.clEnqueueCopyBufferToImage,
            caps.clEnqueueMapImage,
            caps.clGetImageInfo,
            caps.clRetainMemObject,
            caps.clReleaseMemObject,
            caps.clEnqueueUnmapMemObject,
            caps.clGetMemObjectInfo,
            caps.clCreateSampler,
            caps.clRetainSampler,
            caps.clReleaseSampler,
            caps.clGetSamplerInfo,
            caps.clCreateProgramWithSource,
            caps.clCreateProgramWithBinary,
            caps.clRetainProgram,
            caps.clReleaseProgram,
            caps.clBuildProgram,
            caps.clUnloadCompiler,
            caps.clGetProgramInfo,
            caps.clGetProgramBuildInfo,
            caps.clCreateKernel,
            caps.clCreateKernelsInProgram,
            caps.clRetainKernel,
            caps.clReleaseKernel,
            caps.clSetKernelArg,
            caps.clGetKernelInfo,
            caps.clGetKernelWorkGroupInfo,
            caps.clEnqueueNDRangeKernel,
            caps.clEnqueueTask,
            caps.clEnqueueNativeKernel,
            caps.clWaitForEvents,
            caps.clGetEventInfo,
            caps.clRetainEvent,
            caps.clReleaseEvent,
            caps.clEnqueueMarker,
            caps.clEnqueueBarrier,
            caps.clEnqueueWaitForEvents,
            caps.clGetEventProfilingInfo,
            caps.clFlush,
            caps.clFinish,
            caps.clGetExtensionFunctionAddress,
            caps.clCreateFromGLBuffer,
            caps.clCreateFromGLTexture2D,
            caps.clCreateFromGLTexture3D,
            caps.clCreateFromGLRenderbuffer,
            caps.clGetGLObjectInfo,
            caps.clGetGLTextureInfo,
            caps.clEnqueueAcquireGLObjects,
            caps.clEnqueueReleaseGLObjects,
            caps.clCreateSubBuffer,
            caps.clSetMemObjectDestructorCallback,
            caps.clEnqueueReadBufferRect,
            caps.clEnqueueWriteBufferRect,
            caps.clEnqueueCopyBufferRect,
            caps.clCreateUserEvent,
            caps.clSetUserEventStatus,
            caps.clSetEventCallback,
            caps.clGetExtensionFunctionAddressForPlatform,
            caps.clRetainDevice,
            caps.clReleaseDevice,
            caps.clCreateSubDevices,
            caps.clCreateImage,
            caps.clCreateProgramWithBuiltInKernels,
            caps.clCompileProgram,
            caps.clLinkProgram,
            caps.clUnloadPlatformCompiler,
            caps.clGetKernelArgInfo,
            caps.clEnqueueFillBuffer,
            caps.clEnqueueFillImage,
            caps.clEnqueueMigrateMemObjects,
            caps.clEnqueueMarkerWithWaitList,
            caps.clEnqueueBarrierWithWaitList,
            caps.clCreateFromGLTexture,
            caps.clCreateCommandQueueWithProperties,
            caps.clCreatePipe,
            caps.clGetPipeInfo,
            caps.clSVMAlloc,
            caps.clSVMFree,
            caps.clEnqueueSVMFree,
            caps.clEnqueueSVMMemcpy,
            caps.clEnqueueSVMMemFill,
            caps.clEnqueueSVMMap,
            caps.clEnqueueSVMUnmap,
            caps.clSetKernelArgSVMPointer,
            caps.clSetKernelExecInfo,
            caps.clCreateSamplerWithProperties,
            caps.clSetDefaultDeviceCommandQueue,
            caps.clGetDeviceAndHostTimer,
            caps.clGetHostTimer,
            caps.clCreateProgramWithIL,
            caps.clCloneKernel,
            caps.clGetKernelSubGroupInfo,
            caps.clEnqueueSVMMigrateMem,
            caps.clSetProgramReleaseCallback,
            caps.clSetProgramSpecializationConstant,
            caps.clSetContextDestructorCallback,
            caps.clCreateBufferWithProperties,
            caps.clCreateImageWithProperties,
            caps.clTrackLiveObjectsAltera,
            caps.clReportLiveObjectsAltera,
            caps.clEnqueueWaitSignalAMD,
            caps.clEnqueueWriteSignalAMD,
            caps.clEnqueueMakeBuffersResidentAMD,
            caps.clCreateCommandQueueWithPropertiesAPPLE,
            caps.clLogMessagesToSystemLogAPPLE,
            caps.clLogMessagesToStdoutAPPLE,
            caps.clLogMessagesToStderrAPPLE,
            caps.clGetGLContextInfoAPPLE,
            caps.clImportMemoryARM,
            caps.clReleaseDeviceEXT,
            caps.clRetainDeviceEXT,
            caps.clCreateSubDevicesEXT,
            caps.clEnqueueMigrateMemObjectEXT,
            caps.clEnqueueGenerateMipmapIMG,
            caps.clCreateAcceleratorINTEL,
            caps.clRetainAcceleratorINTEL,
            caps.clReleaseAcceleratorINTEL,
            caps.clGetAcceleratorInfoINTEL,
            caps.clCreateBufferWithPropertiesINTEL,
            caps.clGetSupportedGLTextureFormatsINTEL,
            caps.clGetSupportedVA_APIMediaSurfaceFormatsINTEL,
            caps.clHostMemAllocINTEL,
            caps.clDeviceMemAllocINTEL,
            caps.clSharedMemAllocINTEL,
            caps.clMemFreeINTEL,
            caps.clMemBlockingFreeINTEL,
            caps.clGetMemAllocInfoINTEL,
            caps.clSetKernelArgMemPointerINTEL,
            caps.clEnqueueMemFillINTEL,
            caps.clEnqueueMemcpyINTEL,
            caps.clEnqueueMigrateMemINTEL,
            caps.clEnqueueMemAdviseINTEL,
            caps.clGetDeviceIDsFromVA_APIMediaAdapterINTEL,
            caps.clCreateFromVA_APIMediaSurfaceINTEL,
            caps.clEnqueueAcquireVA_APIMediaSurfacesINTEL,
            caps.clEnqueueReleaseVA_APIMediaSurfacesINTEL,
            caps.clCreateCommandBufferKHR,
            caps.clRetainCommandBufferKHR,
            caps.clReleaseCommandBufferKHR,
            caps.clFinalizeCommandBufferKHR,
            caps.clEnqueueCommandBufferKHR,
            caps.clCommandBarrierWithWaitListKHR,
            caps.clCommandCopyBufferKHR,
            caps.clCommandCopyBufferRectKHR,
            caps.clCommandCopyBufferToImageKHR,
            caps.clCommandCopyImageKHR,
            caps.clCommandCopyImageToBufferKHR,
            caps.clCommandFillBufferKHR,
            caps.clCommandFillImageKHR,
            caps.clCommandNDRangeKernelKHR,
            caps.clGetCommandBufferInfoKHR,
            caps.clCreateCommandQueueWithPropertiesKHR,
            caps.clCreateEventFromEGLSyncKHR,
            caps.clCreateFromEGLImageKHR,
            caps.clEnqueueAcquireEGLObjectsKHR,
            caps.clEnqueueReleaseEGLObjectsKHR,
            caps.clEnqueueAcquireExternalMemObjectsKHR,
            caps.clEnqueueReleaseExternalMemObjectsKHR,
            caps.clCreateEventFromGLsyncKHR,
            caps.clGetGLContextInfoKHR,
            caps.clCreateProgramWithILKHR,
            caps.clCreateSemaphoreWithPropertiesKHR,
            caps.clEnqueueWaitSemaphoresKHR,
            caps.clEnqueueSignalSemaphoresKHR,
            caps.clGetSemaphoreInfoKHR,
            caps.clReleaseSemaphoreKHR,
            caps.clRetainSemaphoreKHR,
            caps.clGetKernelSubGroupInfoKHR,
            caps.clGetKernelSuggestedLocalWorkSizeKHR,
            caps.clTerminateContextKHR,
            caps.clCreateBufferNV,
            caps.clSetContentSizeBufferPoCL,
            caps.clGetDeviceImageInfoQCOM
        );
    }

    private CLCapabilities(Set<String> ext, long... functions) {
        clGetPlatformIDs = functions[0];
        clGetPlatformInfo = functions[1];
        clGetDeviceIDs = functions[2];
        clGetDeviceInfo = functions[3];
        clCreateContext = functions[4];
        clCreateContextFromType = functions[5];
        clRetainContext = functions[6];
        clReleaseContext = functions[7];
        clGetContextInfo = functions[8];
        clCreateCommandQueue = functions[9];
        clRetainCommandQueue = functions[10];
        clReleaseCommandQueue = functions[11];
        clGetCommandQueueInfo = functions[12];
        clCreateBuffer = functions[13];
        clEnqueueReadBuffer = functions[14];
        clEnqueueWriteBuffer = functions[15];
        clEnqueueCopyBuffer = functions[16];
        clEnqueueMapBuffer = functions[17];
        clCreateImage2D = functions[18];
        clCreateImage3D = functions[19];
        clGetSupportedImageFormats = functions[20];
        clEnqueueReadImage = functions[21];
        clEnqueueWriteImage = functions[22];
        clEnqueueCopyImage = functions[23];
        clEnqueueCopyImageToBuffer = functions[24];
        clEnqueueCopyBufferToImage = functions[25];
        clEnqueueMapImage = functions[26];
        clGetImageInfo = functions[27];
        clRetainMemObject = functions[28];
        clReleaseMemObject = functions[29];
        clEnqueueUnmapMemObject = functions[30];
        clGetMemObjectInfo = functions[31];
        clCreateSampler = functions[32];
        clRetainSampler = functions[33];
        clReleaseSampler = functions[34];
        clGetSamplerInfo = functions[35];
        clCreateProgramWithSource = functions[36];
        clCreateProgramWithBinary = functions[37];
        clRetainProgram = functions[38];
        clReleaseProgram = functions[39];
        clBuildProgram = functions[40];
        clUnloadCompiler = functions[41];
        clGetProgramInfo = functions[42];
        clGetProgramBuildInfo = functions[43];
        clCreateKernel = functions[44];
        clCreateKernelsInProgram = functions[45];
        clRetainKernel = functions[46];
        clReleaseKernel = functions[47];
        clSetKernelArg = functions[48];
        clGetKernelInfo = functions[49];
        clGetKernelWorkGroupInfo = functions[50];
        clEnqueueNDRangeKernel = functions[51];
        clEnqueueTask = functions[52];
        clEnqueueNativeKernel = functions[53];
        clWaitForEvents = functions[54];
        clGetEventInfo = functions[55];
        clRetainEvent = functions[56];
        clReleaseEvent = functions[57];
        clEnqueueMarker = functions[58];
        clEnqueueBarrier = functions[59];
        clEnqueueWaitForEvents = functions[60];
        clGetEventProfilingInfo = functions[61];
        clFlush = functions[62];
        clFinish = functions[63];
        clGetExtensionFunctionAddress = functions[64];
        clCreateFromGLBuffer = functions[65];
        clCreateFromGLTexture2D = functions[66];
        clCreateFromGLTexture3D = functions[67];
        clCreateFromGLRenderbuffer = functions[68];
        clGetGLObjectInfo = functions[69];
        clGetGLTextureInfo = functions[70];
        clEnqueueAcquireGLObjects = functions[71];
        clEnqueueReleaseGLObjects = functions[72];
        clCreateSubBuffer = functions[73];
        clSetMemObjectDestructorCallback = functions[74];
        clEnqueueReadBufferRect = functions[75];
        clEnqueueWriteBufferRect = functions[76];
        clEnqueueCopyBufferRect = functions[77];
        clCreateUserEvent = functions[78];
        clSetUserEventStatus = functions[79];
        clSetEventCallback = functions[80];
        clGetExtensionFunctionAddressForPlatform = functions[81];
        clRetainDevice = functions[82];
        clReleaseDevice = functions[83];
        clCreateSubDevices = functions[84];
        clCreateImage = functions[85];
        clCreateProgramWithBuiltInKernels = functions[86];
        clCompileProgram = functions[87];
        clLinkProgram = functions[88];
        clUnloadPlatformCompiler = functions[89];
        clGetKernelArgInfo = functions[90];
        clEnqueueFillBuffer = functions[91];
        clEnqueueFillImage = functions[92];
        clEnqueueMigrateMemObjects = functions[93];
        clEnqueueMarkerWithWaitList = functions[94];
        clEnqueueBarrierWithWaitList = functions[95];
        clCreateFromGLTexture = functions[96];
        clCreateCommandQueueWithProperties = functions[97];
        clCreatePipe = functions[98];
        clGetPipeInfo = functions[99];
        clSVMAlloc = functions[100];
        clSVMFree = functions[101];
        clEnqueueSVMFree = functions[102];
        clEnqueueSVMMemcpy = functions[103];
        clEnqueueSVMMemFill = functions[104];
        clEnqueueSVMMap = functions[105];
        clEnqueueSVMUnmap = functions[106];
        clSetKernelArgSVMPointer = functions[107];
        clSetKernelExecInfo = functions[108];
        clCreateSamplerWithProperties = functions[109];
        clSetDefaultDeviceCommandQueue = functions[110];
        clGetDeviceAndHostTimer = functions[111];
        clGetHostTimer = functions[112];
        clCreateProgramWithIL = functions[113];
        clCloneKernel = functions[114];
        clGetKernelSubGroupInfo = functions[115];
        clEnqueueSVMMigrateMem = functions[116];
        clSetProgramReleaseCallback = functions[117];
        clSetProgramSpecializationConstant = functions[118];
        clSetContextDestructorCallback = functions[119];
        clCreateBufferWithProperties = functions[120];
        clCreateImageWithProperties = functions[121];
        clTrackLiveObjectsAltera = functions[122];
        clReportLiveObjectsAltera = functions[123];
        clEnqueueWaitSignalAMD = functions[124];
        clEnqueueWriteSignalAMD = functions[125];
        clEnqueueMakeBuffersResidentAMD = functions[126];
        clCreateCommandQueueWithPropertiesAPPLE = functions[127];
        clLogMessagesToSystemLogAPPLE = functions[128];
        clLogMessagesToStdoutAPPLE = functions[129];
        clLogMessagesToStderrAPPLE = functions[130];
        clGetGLContextInfoAPPLE = functions[131];
        clImportMemoryARM = functions[132];
        clReleaseDeviceEXT = functions[133];
        clRetainDeviceEXT = functions[134];
        clCreateSubDevicesEXT = functions[135];
        clEnqueueMigrateMemObjectEXT = functions[136];
        clEnqueueGenerateMipmapIMG = functions[137];
        clCreateAcceleratorINTEL = functions[138];
        clRetainAcceleratorINTEL = functions[139];
        clReleaseAcceleratorINTEL = functions[140];
        clGetAcceleratorInfoINTEL = functions[141];
        clCreateBufferWithPropertiesINTEL = functions[142];
        clGetSupportedGLTextureFormatsINTEL = functions[143];
        clGetSupportedVA_APIMediaSurfaceFormatsINTEL = functions[144];
        clHostMemAllocINTEL = functions[145];
        clDeviceMemAllocINTEL = functions[146];
        clSharedMemAllocINTEL = functions[147];
        clMemFreeINTEL = functions[148];
        clMemBlockingFreeINTEL = functions[149];
        clGetMemAllocInfoINTEL = functions[150];
        clSetKernelArgMemPointerINTEL = functions[151];
        clEnqueueMemFillINTEL = functions[152];
        clEnqueueMemcpyINTEL = functions[153];
        clEnqueueMigrateMemINTEL = functions[154];
        clEnqueueMemAdviseINTEL = functions[155];
        clGetDeviceIDsFromVA_APIMediaAdapterINTEL = functions[156];
        clCreateFromVA_APIMediaSurfaceINTEL = functions[157];
        clEnqueueAcquireVA_APIMediaSurfacesINTEL = functions[158];
        clEnqueueReleaseVA_APIMediaSurfacesINTEL = functions[159];
        clCreateCommandBufferKHR = functions[160];
        clRetainCommandBufferKHR = functions[161];
        clReleaseCommandBufferKHR = functions[162];
        clFinalizeCommandBufferKHR = functions[163];
        clEnqueueCommandBufferKHR = functions[164];
        clCommandBarrierWithWaitListKHR = functions[165];
        clCommandCopyBufferKHR = functions[166];
        clCommandCopyBufferRectKHR = functions[167];
        clCommandCopyBufferToImageKHR = functions[168];
        clCommandCopyImageKHR = functions[169];
        clCommandCopyImageToBufferKHR = functions[170];
        clCommandFillBufferKHR = functions[171];
        clCommandFillImageKHR = functions[172];
        clCommandNDRangeKernelKHR = functions[173];
        clGetCommandBufferInfoKHR = functions[174];
        clCreateCommandQueueWithPropertiesKHR = functions[175];
        clCreateEventFromEGLSyncKHR = functions[176];
        clCreateFromEGLImageKHR = functions[177];
        clEnqueueAcquireEGLObjectsKHR = functions[178];
        clEnqueueReleaseEGLObjectsKHR = functions[179];
        clEnqueueAcquireExternalMemObjectsKHR = functions[180];
        clEnqueueReleaseExternalMemObjectsKHR = functions[181];
        clCreateEventFromGLsyncKHR = functions[182];
        clGetGLContextInfoKHR = functions[183];
        clCreateProgramWithILKHR = functions[184];
        clCreateSemaphoreWithPropertiesKHR = functions[185];
        clEnqueueWaitSemaphoresKHR = functions[186];
        clEnqueueSignalSemaphoresKHR = functions[187];
        clGetSemaphoreInfoKHR = functions[188];
        clReleaseSemaphoreKHR = functions[189];
        clRetainSemaphoreKHR = functions[190];
        clGetKernelSubGroupInfoKHR = functions[191];
        clGetKernelSuggestedLocalWorkSizeKHR = functions[192];
        clTerminateContextKHR = functions[193];
        clCreateBufferNV = functions[194];
        clSetContentSizeBufferPoCL = functions[195];
        clGetDeviceImageInfoQCOM = functions[196];

        OpenCL10 = check_CL10(ext);
        OpenCL10GL = check_CL10GL(ext);
        OpenCL11 = check_CL11(ext);
        OpenCL12 = check_CL12(ext);
        OpenCL12GL = check_CL12GL(ext);
        OpenCL20 = check_CL20(ext);
        OpenCL21 = check_CL21(ext);
        OpenCL22 = check_CL22(ext);
        OpenCL30 = check_CL30(ext);
        cl_altera_compiler_mode = ext.contains("cl_altera_compiler_mode");
        cl_altera_device_temperature = ext.contains("cl_altera_device_temperature");
        cl_altera_live_object_tracking = check_altera_live_object_tracking(ext);
        cl_amd_bus_addressable_memory = check_amd_bus_addressable_memory(ext);
        cl_amd_compile_options = ext.contains("cl_amd_compile_options");
        cl_amd_device_attribute_query = ext.contains("cl_amd_device_attribute_query");
        cl_amd_device_board_name = ext.contains("cl_amd_device_board_name");
        cl_amd_device_persistent_memory = ext.contains("cl_amd_device_persistent_memory");
        cl_amd_device_profiling_timer_offset = ext.contains("cl_amd_device_profiling_timer_offset");
        cl_amd_device_topology = ext.contains("cl_amd_device_topology");
        cl_amd_event_callback = ext.contains("cl_amd_event_callback");
        cl_amd_fp64 = ext.contains("cl_amd_fp64");
        cl_amd_media_ops = ext.contains("cl_amd_media_ops");
        cl_amd_media_ops2 = ext.contains("cl_amd_media_ops2");
        cl_amd_offline_devices = ext.contains("cl_amd_offline_devices");
        cl_amd_popcnt = ext.contains("cl_amd_popcnt");
        cl_amd_predefined_macros = ext.contains("cl_amd_predefined_macros");
        cl_amd_printf = ext.contains("cl_amd_printf");
        cl_amd_vec3 = ext.contains("cl_amd_vec3");
        cl_APPLE_biased_fixed_point_image_formats = ext.contains("cl_APPLE_biased_fixed_point_image_formats");
        cl_APPLE_command_queue_priority = check_APPLE_command_queue_priority(ext);
        cl_APPLE_command_queue_select_compute_units = check_APPLE_command_queue_select_compute_units(ext);
        cl_APPLE_ContextLoggingFunctions = check_APPLE_ContextLoggingFunctions(ext);
        cl_APPLE_fixed_alpha_channel_orders = ext.contains("cl_APPLE_fixed_alpha_channel_orders");
        cl_APPLE_fp64_basic_ops = ext.contains("cl_APPLE_fp64_basic_ops");
        cl_APPLE_gl_sharing = check_APPLE_gl_sharing(ext);
        cl_APPLE_query_kernel_names = ext.contains("cl_APPLE_query_kernel_names");
        cl_arm_controlled_kernel_termination = ext.contains("cl_arm_controlled_kernel_termination");
        cl_arm_core_id = ext.contains("cl_arm_core_id");
        cl_arm_import_memory = check_arm_import_memory(ext);
        cl_arm_integer_dot_product_accumulate_int16 = ext.contains("cl_arm_integer_dot_product_accumulate_int16");
        cl_arm_integer_dot_product_accumulate_int8 = ext.contains("cl_arm_integer_dot_product_accumulate_int8");
        cl_arm_integer_dot_product_accumulate_saturate_int8 = ext.contains("cl_arm_integer_dot_product_accumulate_saturate_int8");
        cl_arm_integer_dot_product_int8 = ext.contains("cl_arm_integer_dot_product_int8");
        cl_arm_job_slot_selection = ext.contains("cl_arm_job_slot_selection");
        cl_arm_non_uniform_work_group_size = ext.contains("cl_arm_non_uniform_work_group_size");
        cl_arm_printf = ext.contains("cl_arm_printf");
        cl_arm_protected_memory_allocation = ext.contains("cl_arm_protected_memory_allocation");
        cl_arm_scheduling_controls = ext.contains("cl_arm_scheduling_controls");
        cl_arm_thread_limit_hint = ext.contains("cl_arm_thread_limit_hint");
        cl_cl_arm_import_memory_android_hardware_buffer = ext.contains("cl_cl_arm_import_memory_android_hardware_buffer");
        cl_cl_arm_import_memory_dma_buf = ext.contains("cl_cl_arm_import_memory_dma_buf");
        cl_cl_arm_import_memory_host = ext.contains("cl_cl_arm_import_memory_host");
        cl_cl_arm_import_memory_protected = ext.contains("cl_cl_arm_import_memory_protected");
        cl_ext_atomic_counters_32 = ext.contains("cl_ext_atomic_counters_32");
        cl_ext_atomic_counters_64 = ext.contains("cl_ext_atomic_counters_64");
        cl_ext_cxx_for_opencl = ext.contains("cl_ext_cxx_for_opencl");
        cl_ext_device_fission = check_ext_device_fission(ext);
        cl_ext_float_atomics = ext.contains("cl_ext_float_atomics");
        cl_ext_migrate_memobject = check_ext_migrate_memobject(ext);
        cl_img_cached_allocations = ext.contains("cl_img_cached_allocations");
        cl_img_generate_mipmap = check_img_generate_mipmap(ext);
        cl_img_mem_properties = ext.contains("cl_img_mem_properties");
        cl_img_yuv_image = ext.contains("cl_img_yuv_image");
        cl_intel_accelerator = check_intel_accelerator(ext);
        cl_intel_advanced_motion_estimation = ext.contains("cl_intel_advanced_motion_estimation");
        cl_intel_command_queue_families = ext.contains("cl_intel_command_queue_families");
        cl_intel_create_buffer_with_properties = check_intel_create_buffer_with_properties(ext);
        cl_intel_device_attribute_query = ext.contains("cl_intel_device_attribute_query");
        cl_intel_device_partition_by_names = ext.contains("cl_intel_device_partition_by_names");
        cl_intel_device_side_avc_motion_estimation = ext.contains("cl_intel_device_side_avc_motion_estimation");
        cl_intel_driver_diagnostics = ext.contains("cl_intel_driver_diagnostics");
        cl_intel_egl_image_yuv = ext.contains("cl_intel_egl_image_yuv");
        cl_intel_exec_by_local_thread = ext.contains("cl_intel_exec_by_local_thread");
        cl_intel_media_block_io = ext.contains("cl_intel_media_block_io");
        cl_intel_mem_alloc_buffer_location = ext.contains("cl_intel_mem_alloc_buffer_location");
        cl_intel_mem_channel_property = ext.contains("cl_intel_mem_channel_property");
        cl_intel_mem_force_host_memory = ext.contains("cl_intel_mem_force_host_memory");
        cl_intel_motion_estimation = ext.contains("cl_intel_motion_estimation");
        cl_intel_packed_yuv = ext.contains("cl_intel_packed_yuv");
        cl_intel_planar_yuv = ext.contains("cl_intel_planar_yuv");
        cl_intel_printf = ext.contains("cl_intel_printf");
        cl_intel_required_subgroup_size = ext.contains("cl_intel_required_subgroup_size");
        cl_intel_sharing_format_query = check_intel_sharing_format_query(ext);
        cl_intel_simultaneous_sharing = ext.contains("cl_intel_simultaneous_sharing");
        cl_intel_spirv_device_side_avc_motion_estimation = ext.contains("cl_intel_spirv_device_side_avc_motion_estimation");
        cl_intel_spirv_media_block_io = ext.contains("cl_intel_spirv_media_block_io");
        cl_intel_spirv_subgroups = ext.contains("cl_intel_spirv_subgroups");
        cl_intel_subgroups = ext.contains("cl_intel_subgroups");
        cl_intel_subgroups_char = ext.contains("cl_intel_subgroups_char");
        cl_intel_subgroups_long = ext.contains("cl_intel_subgroups_long");
        cl_intel_subgroups_short = ext.contains("cl_intel_subgroups_short");
        cl_intel_unified_shared_memory = check_intel_unified_shared_memory(ext);
        cl_intel_va_api_media_sharing = check_intel_va_api_media_sharing(ext);
        cl_khr_3d_image_writes = ext.contains("cl_khr_3d_image_writes");
        cl_khr_async_work_group_copy_fence = ext.contains("cl_khr_async_work_group_copy_fence");
        cl_khr_byte_addressable_store = ext.contains("cl_khr_byte_addressable_store");
        cl_khr_command_buffer = check_khr_command_buffer(ext);
        cl_khr_create_command_queue = check_khr_create_command_queue(ext);
        cl_khr_depth_images = ext.contains("cl_khr_depth_images");
        cl_khr_device_enqueue_local_arg_types = ext.contains("cl_khr_device_enqueue_local_arg_types");
        cl_khr_device_uuid = ext.contains("cl_khr_device_uuid");
        cl_khr_egl_event = check_khr_egl_event(ext);
        cl_khr_egl_image = check_khr_egl_image(ext);
        cl_khr_expect_assume = ext.contains("cl_khr_expect_assume");
        cl_khr_extended_async_copies = ext.contains("cl_khr_extended_async_copies");
        cl_khr_extended_bit_ops = ext.contains("cl_khr_extended_bit_ops");
        cl_khr_extended_versioning = check_khr_extended_versioning(ext);
        cl_khr_external_memory = check_khr_external_memory(ext);
        cl_khr_external_memory_dma_buf = ext.contains("cl_khr_external_memory_dma_buf");
        cl_khr_external_memory_opaque_fd = ext.contains("cl_khr_external_memory_opaque_fd");
        cl_khr_external_memory_win32 = ext.contains("cl_khr_external_memory_win32");
        cl_khr_external_semaphore = ext.contains("cl_khr_external_semaphore");
        cl_khr_fp16 = ext.contains("cl_khr_fp16");
        cl_khr_fp64 = ext.contains("cl_khr_fp64");
        cl_khr_gl_depth_images = ext.contains("cl_khr_gl_depth_images");
        cl_khr_gl_event = check_khr_gl_event(ext);
        cl_khr_gl_msaa_sharing = ext.contains("cl_khr_gl_msaa_sharing");
        cl_khr_gl_sharing = check_khr_gl_sharing(ext);
        cl_khr_global_int32_base_atomics = ext.contains("cl_khr_global_int32_base_atomics");
        cl_khr_global_int32_extended_atomics = ext.contains("cl_khr_global_int32_extended_atomics");
        cl_khr_icd = ext.contains("cl_khr_icd");
        cl_khr_il_program = check_khr_il_program(ext);
        cl_khr_image2d_from_buffer = ext.contains("cl_khr_image2d_from_buffer");
        cl_khr_initialize_memory = ext.contains("cl_khr_initialize_memory");
        cl_khr_int64_base_atomics = ext.contains("cl_khr_int64_base_atomics");
        cl_khr_int64_extended_atomics = ext.contains("cl_khr_int64_extended_atomics");
        cl_khr_integer_dot_product = ext.contains("cl_khr_integer_dot_product");
        cl_khr_local_int32_base_atomics = ext.contains("cl_khr_local_int32_base_atomics");
        cl_khr_local_int32_extended_atomics = ext.contains("cl_khr_local_int32_extended_atomics");
        cl_khr_mipmap_image = ext.contains("cl_khr_mipmap_image");
        cl_khr_mipmap_image_writes = ext.contains("cl_khr_mipmap_image_writes");
        cl_khr_pci_bus_info = ext.contains("cl_khr_pci_bus_info");
        cl_khr_priority_hints = ext.contains("cl_khr_priority_hints");
        cl_khr_select_fprounding_mode = ext.contains("cl_khr_select_fprounding_mode");
        cl_khr_semaphore = check_khr_semaphore(ext);
        cl_khr_spir = ext.contains("cl_khr_spir");
        cl_khr_srgb_image_writes = ext.contains("cl_khr_srgb_image_writes");
        cl_khr_subgroup_ballot = ext.contains("cl_khr_subgroup_ballot");
        cl_khr_subgroup_clustered_reduce = ext.contains("cl_khr_subgroup_clustered_reduce");
        cl_khr_subgroup_extended_types = ext.contains("cl_khr_subgroup_extended_types");
        cl_khr_subgroup_named_barrier = ext.contains("cl_khr_subgroup_named_barrier");
        cl_khr_subgroup_non_uniform_arithmetic = ext.contains("cl_khr_subgroup_non_uniform_arithmetic");
        cl_khr_subgroup_non_uniform_vote = ext.contains("cl_khr_subgroup_non_uniform_vote");
        cl_khr_subgroup_shuffle = ext.contains("cl_khr_subgroup_shuffle");
        cl_khr_subgroup_shuffle_relative = ext.contains("cl_khr_subgroup_shuffle_relative");
        cl_khr_subgroups = check_khr_subgroups(ext);
        cl_khr_suggested_local_work_size = check_khr_suggested_local_work_size(ext);
        cl_khr_terminate_context = check_khr_terminate_context(ext);
        cl_khr_throttle_hints = ext.contains("cl_khr_throttle_hints");
        cl_nv_compiler_options = ext.contains("cl_nv_compiler_options");
        cl_nv_copy_opts = ext.contains("cl_nv_copy_opts");
        cl_nv_create_buffer = check_nv_create_buffer(ext);
        cl_nv_device_attribute_query = ext.contains("cl_nv_device_attribute_query");
        cl_nv_pragma_unroll = ext.contains("cl_nv_pragma_unroll");
        cl_pocl_content_size = check_pocl_content_size(ext);
        cl_qcom_ext_host_ptr = check_qcom_ext_host_ptr(ext);
        cl_qcom_ext_host_ptr_iocoherent = ext.contains("cl_qcom_ext_host_ptr_iocoherent");
    }

    private static boolean checkExtension(String extension, boolean supported) {
        if (supported) {
            return true;
        }

        apiLog("[CL] " + extension + " was reported as available but an entry point is missing.");
        return false;
    }

    private boolean check_CL10(Set<String> ext) {
        return ext.contains("OpenCL10") && checkExtension("OpenCL10", checkFunctions(
            clGetPlatformIDs, clGetPlatformInfo, clGetDeviceIDs, clGetDeviceInfo, clCreateContext, clCreateContextFromType, clRetainContext, clReleaseContext, 
            clGetContextInfo, clCreateCommandQueue, clRetainCommandQueue, clReleaseCommandQueue, clGetCommandQueueInfo, clCreateBuffer, clEnqueueReadBuffer, 
            clEnqueueWriteBuffer, clEnqueueCopyBuffer, clEnqueueMapBuffer, clCreateImage2D, clCreateImage3D, clGetSupportedImageFormats, clEnqueueReadImage, 
            clEnqueueWriteImage, clEnqueueCopyImage, clEnqueueCopyImageToBuffer, clEnqueueCopyBufferToImage, clEnqueueMapImage, clGetImageInfo, 
            clRetainMemObject, clReleaseMemObject, clEnqueueUnmapMemObject, clGetMemObjectInfo, clCreateSampler, clRetainSampler, clReleaseSampler, 
            clGetSamplerInfo, clCreateProgramWithSource, clCreateProgramWithBinary, clRetainProgram, clReleaseProgram, clBuildProgram, clUnloadCompiler, 
            clGetProgramInfo, clGetProgramBuildInfo, clCreateKernel, clCreateKernelsInProgram, clRetainKernel, clReleaseKernel, clSetKernelArg, clGetKernelInfo, 
            clGetKernelWorkGroupInfo, clEnqueueNDRangeKernel, clEnqueueTask, clEnqueueNativeKernel, clWaitForEvents, clGetEventInfo, clRetainEvent, 
            clReleaseEvent, clEnqueueMarker, clEnqueueBarrier, clEnqueueWaitForEvents, clGetEventProfilingInfo, clFlush, clFinish, 
            clGetExtensionFunctionAddress
        ));
    }

    private boolean check_CL10GL(Set<String> ext) {
        return ext.contains("OpenCL10GL") && checkExtension("OpenCL10GL", checkFunctions(
            clCreateFromGLBuffer, clCreateFromGLTexture2D, clCreateFromGLTexture3D, clCreateFromGLRenderbuffer, clGetGLObjectInfo, clGetGLTextureInfo, 
            clEnqueueAcquireGLObjects, clEnqueueReleaseGLObjects
        ));
    }

    private boolean check_CL11(Set<String> ext) {
        return ext.contains("OpenCL11") && checkExtension("OpenCL11", checkFunctions(
            clCreateSubBuffer, clSetMemObjectDestructorCallback, clEnqueueReadBufferRect, clEnqueueWriteBufferRect, clEnqueueCopyBufferRect, clCreateUserEvent, 
            clSetUserEventStatus, clSetEventCallback
        ));
    }

    private boolean check_CL12(Set<String> ext) {
        return ext.contains("OpenCL12") && checkExtension("OpenCL12", checkFunctions(
            clGetExtensionFunctionAddressForPlatform, clRetainDevice, clReleaseDevice, clCreateSubDevices, clCreateImage, clCreateProgramWithBuiltInKernels, 
            clCompileProgram, clLinkProgram, clUnloadPlatformCompiler, clGetKernelArgInfo, clEnqueueFillBuffer, clEnqueueFillImage, clEnqueueMigrateMemObjects, 
            clEnqueueMarkerWithWaitList, clEnqueueBarrierWithWaitList
        ));
    }

    private boolean check_CL12GL(Set<String> ext) {
        return ext.contains("OpenCL12GL") && checkExtension("OpenCL12GL", checkFunctions(
            clCreateFromGLTexture
        ));
    }

    private boolean check_CL20(Set<String> ext) {
        return ext.contains("OpenCL20") && checkExtension("OpenCL20", checkFunctions(
            clCreateCommandQueueWithProperties, clCreatePipe, clGetPipeInfo, clSVMAlloc, clSVMFree, clEnqueueSVMFree, clEnqueueSVMMemcpy, clEnqueueSVMMemFill, 
            clEnqueueSVMMap, clEnqueueSVMUnmap, clSetKernelArgSVMPointer, clSetKernelExecInfo, clCreateSamplerWithProperties
        ));
    }

    private boolean check_CL21(Set<String> ext) {
        return ext.contains("OpenCL21") && checkExtension("OpenCL21", checkFunctions(
            clSetDefaultDeviceCommandQueue, clGetDeviceAndHostTimer, clGetHostTimer, clCreateProgramWithIL, clCloneKernel, clGetKernelSubGroupInfo, 
            clEnqueueSVMMigrateMem
        ));
    }

    private boolean check_CL22(Set<String> ext) {
        return ext.contains("OpenCL22") && checkExtension("OpenCL22", checkFunctions(
            clSetProgramReleaseCallback, clSetProgramSpecializationConstant
        ));
    }

    private boolean check_CL30(Set<String> ext) {
        return ext.contains("OpenCL30") && checkExtension("OpenCL30", checkFunctions(
            clSetContextDestructorCallback, clCreateBufferWithProperties, clCreateImageWithProperties
        ));
    }

    private boolean check_altera_live_object_tracking(Set<String> ext) {
        return ext.contains("cl_altera_live_object_tracking") && checkExtension("cl_altera_live_object_tracking", checkFunctions(
            clTrackLiveObjectsAltera, clReportLiveObjectsAltera
        ));
    }

    private boolean check_amd_bus_addressable_memory(Set<String> ext) {
        return ext.contains("cl_amd_bus_addressable_memory") && checkExtension("cl_amd_bus_addressable_memory", checkFunctions(
            clEnqueueWaitSignalAMD, clEnqueueWriteSignalAMD, clEnqueueMakeBuffersResidentAMD
        ));
    }

    private boolean check_APPLE_command_queue_priority(Set<String> ext) {
        return ext.contains("cl_APPLE_command_queue_priority") && checkExtension("cl_APPLE_command_queue_priority", checkFunctions(
            clCreateCommandQueueWithPropertiesAPPLE
        ));
    }

    private boolean check_APPLE_command_queue_select_compute_units(Set<String> ext) {
        return ext.contains("cl_APPLE_command_queue_select_compute_units") && checkExtension("cl_APPLE_command_queue_select_compute_units", checkFunctions(
            clCreateCommandQueueWithPropertiesAPPLE
        ));
    }

    private boolean check_APPLE_ContextLoggingFunctions(Set<String> ext) {
        return ext.contains("cl_APPLE_ContextLoggingFunctions") && checkExtension("cl_APPLE_ContextLoggingFunctions", checkFunctions(
            clLogMessagesToSystemLogAPPLE, clLogMessagesToStdoutAPPLE, clLogMessagesToStderrAPPLE
        ));
    }

    private boolean check_APPLE_gl_sharing(Set<String> ext) {
        return ext.contains("cl_APPLE_gl_sharing") && checkExtension("cl_APPLE_gl_sharing", checkFunctions(
            clGetGLContextInfoAPPLE
        ));
    }

    private boolean check_arm_import_memory(Set<String> ext) {
        return ext.contains("cl_arm_import_memory") && checkExtension("cl_arm_import_memory", checkFunctions(
            clImportMemoryARM
        ));
    }

    private boolean check_ext_device_fission(Set<String> ext) {
        return ext.contains("cl_ext_device_fission") && checkExtension("cl_ext_device_fission", checkFunctions(
            clReleaseDeviceEXT, clRetainDeviceEXT, clCreateSubDevicesEXT
        ));
    }

    private boolean check_ext_migrate_memobject(Set<String> ext) {
        return ext.contains("cl_ext_migrate_memobject") && checkExtension("cl_ext_migrate_memobject", checkFunctions(
            clEnqueueMigrateMemObjectEXT
        ));
    }

    private boolean check_img_generate_mipmap(Set<String> ext) {
        return ext.contains("cl_img_generate_mipmap") && checkExtension("cl_img_generate_mipmap", checkFunctions(
            clEnqueueGenerateMipmapIMG
        ));
    }

    private boolean check_intel_accelerator(Set<String> ext) {
        return ext.contains("cl_intel_accelerator") && checkExtension("cl_intel_accelerator", checkFunctions(
            clCreateAcceleratorINTEL, clRetainAcceleratorINTEL, clReleaseAcceleratorINTEL, clGetAcceleratorInfoINTEL
        ));
    }

    private boolean check_intel_create_buffer_with_properties(Set<String> ext) {
        return ext.contains("cl_intel_create_buffer_with_properties") && checkExtension("cl_intel_create_buffer_with_properties", checkFunctions(
            clCreateBufferWithPropertiesINTEL
        ));
    }

    private boolean check_intel_sharing_format_query(Set<String> ext) {
        return ext.contains("cl_intel_sharing_format_query") && checkExtension("cl_intel_sharing_format_query", checkFunctions(
            clGetSupportedGLTextureFormatsINTEL, clGetSupportedVA_APIMediaSurfaceFormatsINTEL
        ));
    }

    private boolean check_intel_unified_shared_memory(Set<String> ext) {
        return ext.contains("cl_intel_unified_shared_memory") && checkExtension("cl_intel_unified_shared_memory", checkFunctions(
            clHostMemAllocINTEL, clDeviceMemAllocINTEL, clSharedMemAllocINTEL, clMemFreeINTEL, clMemBlockingFreeINTEL, clGetMemAllocInfoINTEL, 
            clSetKernelArgMemPointerINTEL, clEnqueueMemFillINTEL, clEnqueueMemcpyINTEL, clEnqueueMigrateMemINTEL, clEnqueueMemAdviseINTEL
        ));
    }

    private boolean check_intel_va_api_media_sharing(Set<String> ext) {
        return ext.contains("cl_intel_va_api_media_sharing") && checkExtension("cl_intel_va_api_media_sharing", checkFunctions(
            clGetDeviceIDsFromVA_APIMediaAdapterINTEL, clCreateFromVA_APIMediaSurfaceINTEL, clEnqueueAcquireVA_APIMediaSurfacesINTEL, 
            clEnqueueReleaseVA_APIMediaSurfacesINTEL
        ));
    }

    private boolean check_khr_command_buffer(Set<String> ext) {
        return ext.contains("cl_khr_command_buffer") && checkExtension("cl_khr_command_buffer", checkFunctions(
            clCreateCommandBufferKHR, clRetainCommandBufferKHR, clReleaseCommandBufferKHR, clFinalizeCommandBufferKHR, clEnqueueCommandBufferKHR, 
            clCommandBarrierWithWaitListKHR, clCommandCopyBufferKHR, clCommandCopyBufferRectKHR, clCommandCopyBufferToImageKHR, clCommandCopyImageKHR, 
            clCommandCopyImageToBufferKHR, clCommandFillBufferKHR, clCommandFillImageKHR, clCommandNDRangeKernelKHR, clGetCommandBufferInfoKHR
        ));
    }

    private boolean check_khr_create_command_queue(Set<String> ext) {
        return ext.contains("cl_khr_create_command_queue") && checkExtension("cl_khr_create_command_queue", checkFunctions(
            clCreateCommandQueueWithPropertiesKHR
        ));
    }

    private boolean check_khr_egl_event(Set<String> ext) {
        return ext.contains("cl_khr_egl_event") && checkExtension("cl_khr_egl_event", checkFunctions(
            clCreateEventFromEGLSyncKHR
        ));
    }

    private boolean check_khr_egl_image(Set<String> ext) {
        return ext.contains("cl_khr_egl_image") && checkExtension("cl_khr_egl_image", checkFunctions(
            clCreateFromEGLImageKHR, clEnqueueAcquireEGLObjectsKHR, clEnqueueReleaseEGLObjectsKHR
        ));
    }

    private boolean check_khr_extended_versioning(Set<String> ext) {
        return ext.contains("cl_khr_extended_versioning") && checkExtension("cl_khr_extended_versioning", checkFunctions(
            
        ));
    }

    private boolean check_khr_external_memory(Set<String> ext) {
        return ext.contains("cl_khr_external_memory") && checkExtension("cl_khr_external_memory", checkFunctions(
            clEnqueueAcquireExternalMemObjectsKHR, clEnqueueReleaseExternalMemObjectsKHR
        ));
    }

    private boolean check_khr_gl_event(Set<String> ext) {
        return ext.contains("cl_khr_gl_event") && checkExtension("cl_khr_gl_event", checkFunctions(
            clCreateEventFromGLsyncKHR
        ));
    }

    private boolean check_khr_gl_sharing(Set<String> ext) {
        return ext.contains("cl_khr_gl_sharing") && checkExtension("cl_khr_gl_sharing", checkFunctions(
            clGetGLContextInfoKHR
        ));
    }

    private boolean check_khr_il_program(Set<String> ext) {
        return ext.contains("cl_khr_il_program") && checkExtension("cl_khr_il_program", checkFunctions(
            clCreateProgramWithILKHR
        ));
    }

    private boolean check_khr_semaphore(Set<String> ext) {
        return ext.contains("cl_khr_semaphore") && checkExtension("cl_khr_semaphore", checkFunctions(
            clCreateSemaphoreWithPropertiesKHR, clEnqueueWaitSemaphoresKHR, clEnqueueSignalSemaphoresKHR, clGetSemaphoreInfoKHR, clReleaseSemaphoreKHR, 
            clRetainSemaphoreKHR
        ));
    }

    private boolean check_khr_subgroups(Set<String> ext) {
        return ext.contains("cl_khr_subgroups") && checkExtension("cl_khr_subgroups", checkFunctions(
            clGetKernelSubGroupInfoKHR
        ));
    }

    private boolean check_khr_suggested_local_work_size(Set<String> ext) {
        return ext.contains("cl_khr_suggested_local_work_size") && checkExtension("cl_khr_suggested_local_work_size", checkFunctions(
            clGetKernelSuggestedLocalWorkSizeKHR
        ));
    }

    private boolean check_khr_terminate_context(Set<String> ext) {
        return ext.contains("cl_khr_terminate_context") && checkExtension("cl_khr_terminate_context", checkFunctions(
            clTerminateContextKHR
        ));
    }

    private boolean check_nv_create_buffer(Set<String> ext) {
        return ext.contains("cl_nv_create_buffer") && checkExtension("cl_nv_create_buffer", checkFunctions(
            clCreateBufferNV
        ));
    }

    private boolean check_pocl_content_size(Set<String> ext) {
        return ext.contains("cl_pocl_content_size") && checkExtension("cl_pocl_content_size", checkFunctions(
            clSetContentSizeBufferPoCL
        ));
    }

    private boolean check_qcom_ext_host_ptr(Set<String> ext) {
        return ext.contains("cl_qcom_ext_host_ptr") && checkExtension("cl_qcom_ext_host_ptr", checkFunctions(
            clGetDeviceImageInfoQCOM
        ));
    }

}
