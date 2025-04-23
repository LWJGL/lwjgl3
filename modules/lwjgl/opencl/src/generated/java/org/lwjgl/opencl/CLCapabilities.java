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
        clSetKernelArgDevicePointerEXT,
        clReleaseDeviceEXT,
        clRetainDeviceEXT,
        clCreateSubDevicesEXT,
        clGetImageRequirementsInfoEXT,
        clEnqueueMigrateMemObjectEXT,
        clCancelCommandsIMG,
        clEnqueueGenerateMipmapIMG,
        clEnqueueAcquireGrallocObjectsIMG,
        clEnqueueReleaseGrallocObjectsIMG,
        clCreateAcceleratorINTEL,
        clRetainAcceleratorINTEL,
        clReleaseAcceleratorINTEL,
        clGetAcceleratorInfoINTEL,
        clCreateBufferWithPropertiesINTEL,
        clEnqueueReadHostPipeINTEL,
        clEnqueueWriteHostPipeINTEL,
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
        clCommandSVMMemcpyKHR,
        clCommandSVMMemFillKHR,
        clRemapCommandBufferKHR,
        clUpdateMutableCommandsKHR,
        clGetMutableCommandInfoKHR,
        clCreateCommandQueueWithPropertiesKHR,
        clCreateEventFromEGLSyncKHR,
        clCreateFromEGLImageKHR,
        clEnqueueAcquireEGLObjectsKHR,
        clEnqueueReleaseEGLObjectsKHR,
        clEnqueueAcquireExternalMemObjectsKHR,
        clEnqueueReleaseExternalMemObjectsKHR,
        clReImportSemaphoreSyncFdKHR,
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
        clGetICDLoaderInfoOCLICD,
        clCreateBufferNV,
        clSetContentSizeBufferPoCL,
        clGetDeviceImageInfoQCOM,
        clSetPerfHintQCOM;

    /** When true, {@code CL10} is supported. */
    public final boolean OpenCL10;
    /** When true, {@code CL10GL} is supported. */
    public final boolean OpenCL10GL;
    /** When true, {@code CL11} is supported. */
    public final boolean OpenCL11;
    /** When true, {@code CL12} is supported. */
    public final boolean OpenCL12;
    /** When true, {@code CL12GL} is supported. */
    public final boolean OpenCL12GL;
    /** When true, {@code CL20} is supported. */
    public final boolean OpenCL20;
    /** When true, {@code CL21} is supported. */
    public final boolean OpenCL21;
    /** When true, {@code CL22} is supported. */
    public final boolean OpenCL22;
    /** When true, {@code CL30} is supported. */
    public final boolean OpenCL30;
    /** When true, {@code altera_compiler_mode} is supported. */
    public final boolean cl_altera_compiler_mode;
    /** When true, {@code altera_device_temperature} is supported. */
    public final boolean cl_altera_device_temperature;
    /** When true, {@code altera_live_object_tracking} is supported. */
    public final boolean cl_altera_live_object_tracking;
    /** When true, {@code amd_bus_addressable_memory} is supported. */
    public final boolean cl_amd_bus_addressable_memory;
    /** When true, {@code amd_compile_options} is supported. */
    public final boolean cl_amd_compile_options;
    /** When true, {@code amd_device_attribute_query} is supported. */
    public final boolean cl_amd_device_attribute_query;
    /** When true, {@code amd_device_board_name} is supported. */
    public final boolean cl_amd_device_board_name;
    /** When true, {@code amd_device_persistent_memory} is supported. */
    public final boolean cl_amd_device_persistent_memory;
    /** When true, {@code amd_device_profiling_timer_offset} is supported. */
    public final boolean cl_amd_device_profiling_timer_offset;
    /** When true, {@code amd_device_topology} is supported. */
    public final boolean cl_amd_device_topology;
    /** When true, {@code amd_event_callback} is supported. */
    public final boolean cl_amd_event_callback;
    /** When true, {@code amd_fp64} is supported. */
    public final boolean cl_amd_fp64;
    /** When true, {@code amd_media_ops} is supported. */
    public final boolean cl_amd_media_ops;
    /** When true, {@code amd_media_ops2} is supported. */
    public final boolean cl_amd_media_ops2;
    /** When true, {@code amd_offline_devices} is supported. */
    public final boolean cl_amd_offline_devices;
    /** When true, {@code amd_popcnt} is supported. */
    public final boolean cl_amd_popcnt;
    /** When true, {@code amd_predefined_macros} is supported. */
    public final boolean cl_amd_predefined_macros;
    /** When true, {@code amd_printf} is supported. */
    public final boolean cl_amd_printf;
    /** When true, {@code amd_vec3} is supported. */
    public final boolean cl_amd_vec3;
    /** When true, {@code APPLE_biased_fixed_point_image_formats} is supported. */
    public final boolean cl_APPLE_biased_fixed_point_image_formats;
    /** When true, {@code APPLE_command_queue_priority} is supported. */
    public final boolean cl_APPLE_command_queue_priority;
    /** When true, {@code APPLE_command_queue_select_compute_units} is supported. */
    public final boolean cl_APPLE_command_queue_select_compute_units;
    /** When true, {@code APPLE_ContextLoggingFunctions} is supported. */
    public final boolean cl_APPLE_ContextLoggingFunctions;
    /** When true, {@code APPLE_fixed_alpha_channel_orders} is supported. */
    public final boolean cl_APPLE_fixed_alpha_channel_orders;
    /** When true, {@code APPLE_fp64_basic_ops} is supported. */
    public final boolean cl_APPLE_fp64_basic_ops;
    /** When true, {@code APPLE_gl_sharing} is supported. */
    public final boolean cl_APPLE_gl_sharing;
    /** When true, {@code APPLE_query_kernel_names} is supported. */
    public final boolean cl_APPLE_query_kernel_names;
    /** When true, {@code arm_controlled_kernel_termination} is supported. */
    public final boolean cl_arm_controlled_kernel_termination;
    /** When true, {@code arm_core_id} is supported. */
    public final boolean cl_arm_core_id;
    /** When true, {@code arm_import_memory} is supported. */
    public final boolean cl_arm_import_memory;
    /** When true, {@code arm_integer_dot_product_accumulate_int16} is supported. */
    public final boolean cl_arm_integer_dot_product_accumulate_int16;
    /** When true, {@code arm_integer_dot_product_accumulate_int8} is supported. */
    public final boolean cl_arm_integer_dot_product_accumulate_int8;
    /** When true, {@code arm_integer_dot_product_accumulate_saturate_int8} is supported. */
    public final boolean cl_arm_integer_dot_product_accumulate_saturate_int8;
    /** When true, {@code arm_integer_dot_product_int8} is supported. */
    public final boolean cl_arm_integer_dot_product_int8;
    /** When true, {@code arm_job_slot_selection} is supported. */
    public final boolean cl_arm_job_slot_selection;
    /** When true, {@code arm_non_uniform_work_group_size} is supported. */
    public final boolean cl_arm_non_uniform_work_group_size;
    /** When true, {@code arm_printf} is supported. */
    public final boolean cl_arm_printf;
    /** When true, {@code arm_protected_memory_allocation} is supported. */
    public final boolean cl_arm_protected_memory_allocation;
    /** When true, {@code arm_scheduling_controls} is supported. */
    public final boolean cl_arm_scheduling_controls;
    /** When true, {@code arm_thread_limit_hint} is supported. */
    public final boolean cl_arm_thread_limit_hint;
    /** When true, {@code cl_arm_import_memory_android_hardware_buffer} is supported. */
    public final boolean cl_cl_arm_import_memory_android_hardware_buffer;
    /** When true, {@code cl_arm_import_memory_dma_buf} is supported. */
    public final boolean cl_cl_arm_import_memory_dma_buf;
    /** When true, {@code cl_arm_import_memory_host} is supported. */
    public final boolean cl_cl_arm_import_memory_host;
    /** When true, {@code cl_arm_import_memory_protected} is supported. */
    public final boolean cl_cl_arm_import_memory_protected;
    /** When true, {@code ext_atomic_counters_32} is supported. */
    public final boolean cl_ext_atomic_counters_32;
    /** When true, {@code ext_atomic_counters_64} is supported. */
    public final boolean cl_ext_atomic_counters_64;
    /** When true, {@code ext_buffer_device_address} is supported. */
    public final boolean cl_ext_buffer_device_address;
    /** When true, {@code ext_cxx_for_opencl} is supported. */
    public final boolean cl_ext_cxx_for_opencl;
    /** When true, {@code ext_device_fission} is supported. */
    public final boolean cl_ext_device_fission;
    /** When true, {@code ext_float_atomics} is supported. */
    public final boolean cl_ext_float_atomics;
    /** When true, {@code ext_image_from_buffer} is supported. */
    public final boolean cl_ext_image_from_buffer;
    /** When true, {@code ext_image_raw10_raw12} is supported. */
    public final boolean cl_ext_image_raw10_raw12;
    /** When true, {@code ext_image_requirements_info} is supported. */
    public final boolean cl_ext_image_requirements_info;
    /** When true, {@code ext_image_unorm_int_2_101010} is supported. */
    public final boolean cl_ext_image_unorm_int_2_101010;
    /** When true, {@code ext_immutable_memory_objects} is supported. */
    public final boolean cl_ext_immutable_memory_objects;
    /** When true, {@code ext_migrate_memobject} is supported. */
    public final boolean cl_ext_migrate_memobject;
    /** When true, {@code img_bitwise_ops} is supported. */
    public final boolean cl_img_bitwise_ops;
    /** When true, {@code img_cached_allocations} is supported. */
    public final boolean cl_img_cached_allocations;
    /** When true, {@code img_cancel_command} is supported. */
    public final boolean cl_img_cancel_command;
    /** When true, {@code img_generate_mipmap} is supported. */
    public final boolean cl_img_generate_mipmap;
    /** When true, {@code img_matrix_multiply} is supported. */
    public final boolean cl_img_matrix_multiply;
    /** When true, {@code img_mem_properties} is supported. */
    public final boolean cl_img_mem_properties;
    /** When true, {@code img_memory_management} is supported. */
    public final boolean cl_img_memory_management;
    /** When true, {@code img_swap_ops} is supported. */
    public final boolean cl_img_swap_ops;
    /** When true, {@code img_use_gralloc_ptr} is supported. */
    public final boolean cl_img_use_gralloc_ptr;
    /** When true, {@code img_yuv_image} is supported. */
    public final boolean cl_img_yuv_image;
    /** When true, {@code intel_accelerator} is supported. */
    public final boolean cl_intel_accelerator;
    /** When true, {@code intel_advanced_motion_estimation} is supported. */
    public final boolean cl_intel_advanced_motion_estimation;
    /** When true, {@code intel_bfloat16_conversions} is supported. */
    public final boolean cl_intel_bfloat16_conversions;
    /** When true, {@code intel_command_queue_families} is supported. */
    public final boolean cl_intel_command_queue_families;
    /** When true, {@code intel_create_buffer_with_properties} is supported. */
    public final boolean cl_intel_create_buffer_with_properties;
    /** When true, {@code intel_create_mem_object_properties} is supported. */
    public final boolean cl_intel_create_mem_object_properties;
    /** When true, {@code intel_device_attribute_query} is supported. */
    public final boolean cl_intel_device_attribute_query;
    /** When true, {@code intel_device_partition_by_names} is supported. */
    public final boolean cl_intel_device_partition_by_names;
    /** When true, {@code intel_device_side_avc_motion_estimation} is supported. */
    public final boolean cl_intel_device_side_avc_motion_estimation;
    /** When true, {@code intel_driver_diagnostics} is supported. */
    public final boolean cl_intel_driver_diagnostics;
    /** When true, {@code intel_egl_image_yuv} is supported. */
    public final boolean cl_intel_egl_image_yuv;
    /** When true, {@code intel_exec_by_local_thread} is supported. */
    public final boolean cl_intel_exec_by_local_thread;
    /** When true, {@code intel_media_block_io} is supported. */
    public final boolean cl_intel_media_block_io;
    /** When true, {@code intel_mem_alloc_buffer_location} is supported. */
    public final boolean cl_intel_mem_alloc_buffer_location;
    /** When true, {@code intel_mem_channel_property} is supported. */
    public final boolean cl_intel_mem_channel_property;
    /** When true, {@code intel_mem_force_host_memory} is supported. */
    public final boolean cl_intel_mem_force_host_memory;
    /** When true, {@code intel_motion_estimation} is supported. */
    public final boolean cl_intel_motion_estimation;
    /** When true, {@code intel_packed_yuv} is supported. */
    public final boolean cl_intel_packed_yuv;
    /** When true, {@code intel_planar_yuv} is supported. */
    public final boolean cl_intel_planar_yuv;
    /** When true, {@code intel_printf} is supported. */
    public final boolean cl_intel_printf;
    /** When true, {@code intel_program_scope_host_pipe} is supported. */
    public final boolean cl_intel_program_scope_host_pipe;
    /** When true, {@code intel_queue_no_sync_operations} is supported. */
    public final boolean cl_intel_queue_no_sync_operations;
    /** When true, {@code intel_required_subgroup_size} is supported. */
    public final boolean cl_intel_required_subgroup_size;
    /** When true, {@code intel_sharing_format_query} is supported. */
    public final boolean cl_intel_sharing_format_query;
    /** When true, {@code intel_simultaneous_sharing} is supported. */
    public final boolean cl_intel_simultaneous_sharing;
    /** When true, {@code intel_spirv_device_side_avc_motion_estimation} is supported. */
    public final boolean cl_intel_spirv_device_side_avc_motion_estimation;
    /** When true, {@code intel_spirv_media_block_io} is supported. */
    public final boolean cl_intel_spirv_media_block_io;
    /** When true, {@code intel_spirv_subgroups} is supported. */
    public final boolean cl_intel_spirv_subgroups;
    /** When true, {@code intel_split_work_group_barrier} is supported. */
    public final boolean cl_intel_split_work_group_barrier;
    /** When true, {@code intel_subgroup_2d_block_io} is supported. */
    public final boolean cl_intel_subgroup_2d_block_io;
    /** When true, {@code intel_subgroup_buffer_prefetch} is supported. */
    public final boolean cl_intel_subgroup_buffer_prefetch;
    /** When true, {@code intel_subgroup_local_block_io} is supported. */
    public final boolean cl_intel_subgroup_local_block_io;
    /** When true, {@code intel_subgroup_matrix_multiply_accumulate} is supported. */
    public final boolean cl_intel_subgroup_matrix_multiply_accumulate;
    /** When true, {@code intel_subgroup_split_matrix_multiply_accumulate} is supported. */
    public final boolean cl_intel_subgroup_split_matrix_multiply_accumulate;
    /** When true, {@code intel_subgroups} is supported. */
    public final boolean cl_intel_subgroups;
    /** When true, {@code intel_subgroups_char} is supported. */
    public final boolean cl_intel_subgroups_char;
    /** When true, {@code intel_subgroups_long} is supported. */
    public final boolean cl_intel_subgroups_long;
    /** When true, {@code intel_subgroups_short} is supported. */
    public final boolean cl_intel_subgroups_short;
    /** When true, {@code intel_unified_shared_memory} is supported. */
    public final boolean cl_intel_unified_shared_memory;
    /** When true, {@code intel_va_api_media_sharing} is supported. */
    public final boolean cl_intel_va_api_media_sharing;
    /** When true, {@code khr_3d_image_writes} is supported. */
    public final boolean cl_khr_3d_image_writes;
    /** When true, {@code khr_async_work_group_copy_fence} is supported. */
    public final boolean cl_khr_async_work_group_copy_fence;
    /** When true, {@code khr_byte_addressable_store} is supported. */
    public final boolean cl_khr_byte_addressable_store;
    /** When true, {@code khr_command_buffer} is supported. */
    public final boolean cl_khr_command_buffer;
    /** When true, {@code khr_command_buffer_multi_device} is supported. */
    public final boolean cl_khr_command_buffer_multi_device;
    /** When true, {@code khr_command_buffer_mutable_dispatch} is supported. */
    public final boolean cl_khr_command_buffer_mutable_dispatch;
    /** When true, {@code khr_create_command_queue} is supported. */
    public final boolean cl_khr_create_command_queue;
    /** When true, {@code khr_depth_images} is supported. */
    public final boolean cl_khr_depth_images;
    /** When true, {@code khr_device_enqueue_local_arg_types} is supported. */
    public final boolean cl_khr_device_enqueue_local_arg_types;
    /** When true, {@code khr_device_uuid} is supported. */
    public final boolean cl_khr_device_uuid;
    /** When true, {@code khr_egl_event} is supported. */
    public final boolean cl_khr_egl_event;
    /** When true, {@code khr_egl_image} is supported. */
    public final boolean cl_khr_egl_image;
    /** When true, {@code khr_expect_assume} is supported. */
    public final boolean cl_khr_expect_assume;
    /** When true, {@code khr_extended_async_copies} is supported. */
    public final boolean cl_khr_extended_async_copies;
    /** When true, {@code khr_extended_bit_ops} is supported. */
    public final boolean cl_khr_extended_bit_ops;
    /** When true, {@code khr_extended_versioning} is supported. */
    public final boolean cl_khr_extended_versioning;
    /** When true, {@code khr_external_memory} is supported. */
    public final boolean cl_khr_external_memory;
    /** When true, {@code khr_external_memory_dma_buf} is supported. */
    public final boolean cl_khr_external_memory_dma_buf;
    /** When true, {@code khr_external_memory_opaque_fd} is supported. */
    public final boolean cl_khr_external_memory_opaque_fd;
    /** When true, {@code khr_external_memory_win32} is supported. */
    public final boolean cl_khr_external_memory_win32;
    /** When true, {@code khr_external_semaphore} is supported. */
    public final boolean cl_khr_external_semaphore;
    /** When true, {@code khr_external_semaphore_opaque_fd} is supported. */
    public final boolean cl_khr_external_semaphore_opaque_fd;
    /** When true, {@code khr_external_semaphore_sync_fd} is supported. */
    public final boolean cl_khr_external_semaphore_sync_fd;
    /** When true, {@code khr_external_semaphore_win32} is supported. */
    public final boolean cl_khr_external_semaphore_win32;
    /** When true, {@code khr_fp16} is supported. */
    public final boolean cl_khr_fp16;
    /** When true, {@code khr_fp64} is supported. */
    public final boolean cl_khr_fp64;
    /** When true, {@code khr_gl_depth_images} is supported. */
    public final boolean cl_khr_gl_depth_images;
    /** When true, {@code khr_gl_event} is supported. */
    public final boolean cl_khr_gl_event;
    /** When true, {@code khr_gl_msaa_sharing} is supported. */
    public final boolean cl_khr_gl_msaa_sharing;
    /** When true, {@code khr_gl_sharing} is supported. */
    public final boolean cl_khr_gl_sharing;
    /** When true, {@code khr_global_int32_base_atomics} is supported. */
    public final boolean cl_khr_global_int32_base_atomics;
    /** When true, {@code khr_global_int32_extended_atomics} is supported. */
    public final boolean cl_khr_global_int32_extended_atomics;
    /** When true, {@code khr_icd} is supported. */
    public final boolean cl_khr_icd;
    /** When true, {@code khr_il_program} is supported. */
    public final boolean cl_khr_il_program;
    /** When true, {@code khr_image2d_from_buffer} is supported. */
    public final boolean cl_khr_image2d_from_buffer;
    /** When true, {@code khr_initialize_memory} is supported. */
    public final boolean cl_khr_initialize_memory;
    /** When true, {@code khr_int64_base_atomics} is supported. */
    public final boolean cl_khr_int64_base_atomics;
    /** When true, {@code khr_int64_extended_atomics} is supported. */
    public final boolean cl_khr_int64_extended_atomics;
    /** When true, {@code khr_integer_dot_product} is supported. */
    public final boolean cl_khr_integer_dot_product;
    /** When true, {@code khr_kernel_clock} is supported. */
    public final boolean cl_khr_kernel_clock;
    /** When true, {@code khr_local_int32_base_atomics} is supported. */
    public final boolean cl_khr_local_int32_base_atomics;
    /** When true, {@code khr_local_int32_extended_atomics} is supported. */
    public final boolean cl_khr_local_int32_extended_atomics;
    /** When true, {@code khr_mipmap_image} is supported. */
    public final boolean cl_khr_mipmap_image;
    /** When true, {@code khr_mipmap_image_writes} is supported. */
    public final boolean cl_khr_mipmap_image_writes;
    /** When true, {@code khr_pci_bus_info} is supported. */
    public final boolean cl_khr_pci_bus_info;
    /** When true, {@code khr_priority_hints} is supported. */
    public final boolean cl_khr_priority_hints;
    /** When true, {@code khr_select_fprounding_mode} is supported. */
    public final boolean cl_khr_select_fprounding_mode;
    /** When true, {@code khr_semaphore} is supported. */
    public final boolean cl_khr_semaphore;
    /** When true, {@code khr_spir} is supported. */
    public final boolean cl_khr_spir;
    /** When true, {@code khr_spirv_extended_debug_info} is supported. */
    public final boolean cl_khr_spirv_extended_debug_info;
    /** When true, {@code khr_spirv_linkonce_odr} is supported. */
    public final boolean cl_khr_spirv_linkonce_odr;
    /** When true, {@code khr_spirv_no_integer_wrap_decoration} is supported. */
    public final boolean cl_khr_spirv_no_integer_wrap_decoration;
    /** When true, {@code khr_srgb_image_writes} is supported. */
    public final boolean cl_khr_srgb_image_writes;
    /** When true, {@code khr_subgroup_ballot} is supported. */
    public final boolean cl_khr_subgroup_ballot;
    /** When true, {@code khr_subgroup_clustered_reduce} is supported. */
    public final boolean cl_khr_subgroup_clustered_reduce;
    /** When true, {@code khr_subgroup_extended_types} is supported. */
    public final boolean cl_khr_subgroup_extended_types;
    /** When true, {@code khr_subgroup_named_barrier} is supported. */
    public final boolean cl_khr_subgroup_named_barrier;
    /** When true, {@code khr_subgroup_non_uniform_arithmetic} is supported. */
    public final boolean cl_khr_subgroup_non_uniform_arithmetic;
    /** When true, {@code khr_subgroup_non_uniform_vote} is supported. */
    public final boolean cl_khr_subgroup_non_uniform_vote;
    /** When true, {@code khr_subgroup_rotate} is supported. */
    public final boolean cl_khr_subgroup_rotate;
    /** When true, {@code khr_subgroup_shuffle} is supported. */
    public final boolean cl_khr_subgroup_shuffle;
    /** When true, {@code khr_subgroup_shuffle_relative} is supported. */
    public final boolean cl_khr_subgroup_shuffle_relative;
    /** When true, {@code khr_subgroups} is supported. */
    public final boolean cl_khr_subgroups;
    /** When true, {@code khr_suggested_local_work_size} is supported. */
    public final boolean cl_khr_suggested_local_work_size;
    /** When true, {@code khr_terminate_context} is supported. */
    public final boolean cl_khr_terminate_context;
    /** When true, {@code khr_throttle_hints} is supported. */
    public final boolean cl_khr_throttle_hints;
    /** When true, {@code khr_work_group_uniform_arithmetic} is supported. */
    public final boolean cl_khr_work_group_uniform_arithmetic;
    /** When true, {@code loader_info} is supported. */
    public final boolean cl_loader_info;
    /** When true, {@code nv_compiler_options} is supported. */
    public final boolean cl_nv_compiler_options;
    /** When true, {@code nv_copy_opts} is supported. */
    public final boolean cl_nv_copy_opts;
    /** When true, {@code nv_create_buffer} is supported. */
    public final boolean cl_nv_create_buffer;
    /** When true, {@code nv_device_attribute_query} is supported. */
    public final boolean cl_nv_device_attribute_query;
    /** When true, {@code nv_pragma_unroll} is supported. */
    public final boolean cl_nv_pragma_unroll;
    /** When true, {@code pocl_content_size} is supported. */
    public final boolean cl_pocl_content_size;
    /** When true, {@code qcom_ext_host_ptr} is supported. */
    public final boolean cl_qcom_ext_host_ptr;
    /** When true, {@code qcom_ext_host_ptr_iocoherent} is supported. */
    public final boolean cl_qcom_ext_host_ptr_iocoherent;
    /** When true, {@code qcom_perf_hint} is supported. */
    public final boolean cl_qcom_perf_hint;

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
            provider.getFunctionAddress("clSetKernelArgDevicePointerEXT"),
            provider.getFunctionAddress("clReleaseDeviceEXT"),
            provider.getFunctionAddress("clRetainDeviceEXT"),
            provider.getFunctionAddress("clCreateSubDevicesEXT"),
            provider.getFunctionAddress("clGetImageRequirementsInfoEXT"),
            provider.getFunctionAddress("clEnqueueMigrateMemObjectEXT"),
            provider.getFunctionAddress("clCancelCommandsIMG"),
            provider.getFunctionAddress("clEnqueueGenerateMipmapIMG"),
            provider.getFunctionAddress("clEnqueueAcquireGrallocObjectsIMG"),
            provider.getFunctionAddress("clEnqueueReleaseGrallocObjectsIMG"),
            provider.getFunctionAddress("clCreateAcceleratorINTEL"),
            provider.getFunctionAddress("clRetainAcceleratorINTEL"),
            provider.getFunctionAddress("clReleaseAcceleratorINTEL"),
            provider.getFunctionAddress("clGetAcceleratorInfoINTEL"),
            provider.getFunctionAddress("clCreateBufferWithPropertiesINTEL"),
            provider.getFunctionAddress("clEnqueueReadHostPipeINTEL"),
            provider.getFunctionAddress("clEnqueueWriteHostPipeINTEL"),
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
            provider.getFunctionAddress("clCommandSVMMemcpyKHR"),
            provider.getFunctionAddress("clCommandSVMMemFillKHR"),
            provider.getFunctionAddress("clRemapCommandBufferKHR"),
            provider.getFunctionAddress("clUpdateMutableCommandsKHR"),
            provider.getFunctionAddress("clGetMutableCommandInfoKHR"),
            provider.getFunctionAddress("clCreateCommandQueueWithPropertiesKHR"),
            provider.getFunctionAddress("clCreateEventFromEGLSyncKHR"),
            provider.getFunctionAddress("clCreateFromEGLImageKHR"),
            provider.getFunctionAddress("clEnqueueAcquireEGLObjectsKHR"),
            provider.getFunctionAddress("clEnqueueReleaseEGLObjectsKHR"),
            provider.getFunctionAddress("clEnqueueAcquireExternalMemObjectsKHR"),
            provider.getFunctionAddress("clEnqueueReleaseExternalMemObjectsKHR"),
            provider.getFunctionAddress("clReImportSemaphoreSyncFdKHR"),
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
            provider.getFunctionAddress("clGetICDLoaderInfoOCLICD"),
            provider.getFunctionAddress("clCreateBufferNV"),
            provider.getFunctionAddress("clSetContentSizeBufferPoCL"),
            provider.getFunctionAddress("clGetDeviceImageInfoQCOM"),
            provider.getFunctionAddress("clSetPerfHintQCOM")
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
            caps.clSetKernelArgDevicePointerEXT,
            caps.clReleaseDeviceEXT,
            caps.clRetainDeviceEXT,
            caps.clCreateSubDevicesEXT,
            caps.clGetImageRequirementsInfoEXT,
            caps.clEnqueueMigrateMemObjectEXT,
            caps.clCancelCommandsIMG,
            caps.clEnqueueGenerateMipmapIMG,
            caps.clEnqueueAcquireGrallocObjectsIMG,
            caps.clEnqueueReleaseGrallocObjectsIMG,
            caps.clCreateAcceleratorINTEL,
            caps.clRetainAcceleratorINTEL,
            caps.clReleaseAcceleratorINTEL,
            caps.clGetAcceleratorInfoINTEL,
            caps.clCreateBufferWithPropertiesINTEL,
            caps.clEnqueueReadHostPipeINTEL,
            caps.clEnqueueWriteHostPipeINTEL,
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
            caps.clCommandSVMMemcpyKHR,
            caps.clCommandSVMMemFillKHR,
            caps.clRemapCommandBufferKHR,
            caps.clUpdateMutableCommandsKHR,
            caps.clGetMutableCommandInfoKHR,
            caps.clCreateCommandQueueWithPropertiesKHR,
            caps.clCreateEventFromEGLSyncKHR,
            caps.clCreateFromEGLImageKHR,
            caps.clEnqueueAcquireEGLObjectsKHR,
            caps.clEnqueueReleaseEGLObjectsKHR,
            caps.clEnqueueAcquireExternalMemObjectsKHR,
            caps.clEnqueueReleaseExternalMemObjectsKHR,
            caps.clReImportSemaphoreSyncFdKHR,
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
            caps.clGetICDLoaderInfoOCLICD,
            caps.clCreateBufferNV,
            caps.clSetContentSizeBufferPoCL,
            caps.clGetDeviceImageInfoQCOM,
            caps.clSetPerfHintQCOM
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
        clSetKernelArgDevicePointerEXT = functions[133];
        clReleaseDeviceEXT = functions[134];
        clRetainDeviceEXT = functions[135];
        clCreateSubDevicesEXT = functions[136];
        clGetImageRequirementsInfoEXT = functions[137];
        clEnqueueMigrateMemObjectEXT = functions[138];
        clCancelCommandsIMG = functions[139];
        clEnqueueGenerateMipmapIMG = functions[140];
        clEnqueueAcquireGrallocObjectsIMG = functions[141];
        clEnqueueReleaseGrallocObjectsIMG = functions[142];
        clCreateAcceleratorINTEL = functions[143];
        clRetainAcceleratorINTEL = functions[144];
        clReleaseAcceleratorINTEL = functions[145];
        clGetAcceleratorInfoINTEL = functions[146];
        clCreateBufferWithPropertiesINTEL = functions[147];
        clEnqueueReadHostPipeINTEL = functions[148];
        clEnqueueWriteHostPipeINTEL = functions[149];
        clGetSupportedGLTextureFormatsINTEL = functions[150];
        clGetSupportedVA_APIMediaSurfaceFormatsINTEL = functions[151];
        clHostMemAllocINTEL = functions[152];
        clDeviceMemAllocINTEL = functions[153];
        clSharedMemAllocINTEL = functions[154];
        clMemFreeINTEL = functions[155];
        clMemBlockingFreeINTEL = functions[156];
        clGetMemAllocInfoINTEL = functions[157];
        clSetKernelArgMemPointerINTEL = functions[158];
        clEnqueueMemFillINTEL = functions[159];
        clEnqueueMemcpyINTEL = functions[160];
        clEnqueueMigrateMemINTEL = functions[161];
        clEnqueueMemAdviseINTEL = functions[162];
        clGetDeviceIDsFromVA_APIMediaAdapterINTEL = functions[163];
        clCreateFromVA_APIMediaSurfaceINTEL = functions[164];
        clEnqueueAcquireVA_APIMediaSurfacesINTEL = functions[165];
        clEnqueueReleaseVA_APIMediaSurfacesINTEL = functions[166];
        clCreateCommandBufferKHR = functions[167];
        clRetainCommandBufferKHR = functions[168];
        clReleaseCommandBufferKHR = functions[169];
        clFinalizeCommandBufferKHR = functions[170];
        clEnqueueCommandBufferKHR = functions[171];
        clCommandBarrierWithWaitListKHR = functions[172];
        clCommandCopyBufferKHR = functions[173];
        clCommandCopyBufferRectKHR = functions[174];
        clCommandCopyBufferToImageKHR = functions[175];
        clCommandCopyImageKHR = functions[176];
        clCommandCopyImageToBufferKHR = functions[177];
        clCommandFillBufferKHR = functions[178];
        clCommandFillImageKHR = functions[179];
        clCommandNDRangeKernelKHR = functions[180];
        clGetCommandBufferInfoKHR = functions[181];
        clCommandSVMMemcpyKHR = functions[182];
        clCommandSVMMemFillKHR = functions[183];
        clRemapCommandBufferKHR = functions[184];
        clUpdateMutableCommandsKHR = functions[185];
        clGetMutableCommandInfoKHR = functions[186];
        clCreateCommandQueueWithPropertiesKHR = functions[187];
        clCreateEventFromEGLSyncKHR = functions[188];
        clCreateFromEGLImageKHR = functions[189];
        clEnqueueAcquireEGLObjectsKHR = functions[190];
        clEnqueueReleaseEGLObjectsKHR = functions[191];
        clEnqueueAcquireExternalMemObjectsKHR = functions[192];
        clEnqueueReleaseExternalMemObjectsKHR = functions[193];
        clReImportSemaphoreSyncFdKHR = functions[194];
        clCreateEventFromGLsyncKHR = functions[195];
        clGetGLContextInfoKHR = functions[196];
        clCreateProgramWithILKHR = functions[197];
        clCreateSemaphoreWithPropertiesKHR = functions[198];
        clEnqueueWaitSemaphoresKHR = functions[199];
        clEnqueueSignalSemaphoresKHR = functions[200];
        clGetSemaphoreInfoKHR = functions[201];
        clReleaseSemaphoreKHR = functions[202];
        clRetainSemaphoreKHR = functions[203];
        clGetKernelSubGroupInfoKHR = functions[204];
        clGetKernelSuggestedLocalWorkSizeKHR = functions[205];
        clTerminateContextKHR = functions[206];
        clGetICDLoaderInfoOCLICD = functions[207];
        clCreateBufferNV = functions[208];
        clSetContentSizeBufferPoCL = functions[209];
        clGetDeviceImageInfoQCOM = functions[210];
        clSetPerfHintQCOM = functions[211];

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
        cl_ext_buffer_device_address = check_ext_buffer_device_address(ext);
        cl_ext_cxx_for_opencl = ext.contains("cl_ext_cxx_for_opencl");
        cl_ext_device_fission = check_ext_device_fission(ext);
        cl_ext_float_atomics = ext.contains("cl_ext_float_atomics");
        cl_ext_image_from_buffer = ext.contains("cl_ext_image_from_buffer");
        cl_ext_image_raw10_raw12 = ext.contains("cl_ext_image_raw10_raw12");
        cl_ext_image_requirements_info = check_ext_image_requirements_info(ext);
        cl_ext_image_unorm_int_2_101010 = ext.contains("cl_ext_image_unorm_int_2_101010");
        cl_ext_immutable_memory_objects = ext.contains("cl_ext_immutable_memory_objects");
        cl_ext_migrate_memobject = check_ext_migrate_memobject(ext);
        cl_img_bitwise_ops = ext.contains("cl_img_bitwise_ops");
        cl_img_cached_allocations = ext.contains("cl_img_cached_allocations");
        cl_img_cancel_command = check_img_cancel_command(ext);
        cl_img_generate_mipmap = check_img_generate_mipmap(ext);
        cl_img_matrix_multiply = ext.contains("cl_img_matrix_multiply");
        cl_img_mem_properties = ext.contains("cl_img_mem_properties");
        cl_img_memory_management = ext.contains("cl_img_memory_management");
        cl_img_swap_ops = ext.contains("cl_img_swap_ops");
        cl_img_use_gralloc_ptr = check_img_use_gralloc_ptr(ext);
        cl_img_yuv_image = ext.contains("cl_img_yuv_image");
        cl_intel_accelerator = check_intel_accelerator(ext);
        cl_intel_advanced_motion_estimation = ext.contains("cl_intel_advanced_motion_estimation");
        cl_intel_bfloat16_conversions = ext.contains("cl_intel_bfloat16_conversions");
        cl_intel_command_queue_families = ext.contains("cl_intel_command_queue_families");
        cl_intel_create_buffer_with_properties = check_intel_create_buffer_with_properties(ext);
        cl_intel_create_mem_object_properties = ext.contains("cl_intel_create_mem_object_properties");
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
        cl_intel_program_scope_host_pipe = check_intel_program_scope_host_pipe(ext);
        cl_intel_queue_no_sync_operations = ext.contains("cl_intel_queue_no_sync_operations");
        cl_intel_required_subgroup_size = ext.contains("cl_intel_required_subgroup_size");
        cl_intel_sharing_format_query = check_intel_sharing_format_query(ext);
        cl_intel_simultaneous_sharing = ext.contains("cl_intel_simultaneous_sharing");
        cl_intel_spirv_device_side_avc_motion_estimation = ext.contains("cl_intel_spirv_device_side_avc_motion_estimation");
        cl_intel_spirv_media_block_io = ext.contains("cl_intel_spirv_media_block_io");
        cl_intel_spirv_subgroups = ext.contains("cl_intel_spirv_subgroups");
        cl_intel_split_work_group_barrier = ext.contains("cl_intel_split_work_group_barrier");
        cl_intel_subgroup_2d_block_io = ext.contains("cl_intel_subgroup_2d_block_io");
        cl_intel_subgroup_buffer_prefetch = ext.contains("cl_intel_subgroup_buffer_prefetch");
        cl_intel_subgroup_local_block_io = ext.contains("cl_intel_subgroup_local_block_io");
        cl_intel_subgroup_matrix_multiply_accumulate = ext.contains("cl_intel_subgroup_matrix_multiply_accumulate");
        cl_intel_subgroup_split_matrix_multiply_accumulate = ext.contains("cl_intel_subgroup_split_matrix_multiply_accumulate");
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
        cl_khr_command_buffer_multi_device = check_khr_command_buffer_multi_device(ext);
        cl_khr_command_buffer_mutable_dispatch = check_khr_command_buffer_mutable_dispatch(ext);
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
        cl_khr_external_semaphore_opaque_fd = ext.contains("cl_khr_external_semaphore_opaque_fd");
        cl_khr_external_semaphore_sync_fd = check_khr_external_semaphore_sync_fd(ext);
        cl_khr_external_semaphore_win32 = ext.contains("cl_khr_external_semaphore_win32");
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
        cl_khr_kernel_clock = ext.contains("cl_khr_kernel_clock");
        cl_khr_local_int32_base_atomics = ext.contains("cl_khr_local_int32_base_atomics");
        cl_khr_local_int32_extended_atomics = ext.contains("cl_khr_local_int32_extended_atomics");
        cl_khr_mipmap_image = ext.contains("cl_khr_mipmap_image");
        cl_khr_mipmap_image_writes = ext.contains("cl_khr_mipmap_image_writes");
        cl_khr_pci_bus_info = ext.contains("cl_khr_pci_bus_info");
        cl_khr_priority_hints = ext.contains("cl_khr_priority_hints");
        cl_khr_select_fprounding_mode = ext.contains("cl_khr_select_fprounding_mode");
        cl_khr_semaphore = check_khr_semaphore(ext);
        cl_khr_spir = ext.contains("cl_khr_spir");
        cl_khr_spirv_extended_debug_info = ext.contains("cl_khr_spirv_extended_debug_info");
        cl_khr_spirv_linkonce_odr = ext.contains("cl_khr_spirv_linkonce_odr");
        cl_khr_spirv_no_integer_wrap_decoration = ext.contains("cl_khr_spirv_no_integer_wrap_decoration");
        cl_khr_srgb_image_writes = ext.contains("cl_khr_srgb_image_writes");
        cl_khr_subgroup_ballot = ext.contains("cl_khr_subgroup_ballot");
        cl_khr_subgroup_clustered_reduce = ext.contains("cl_khr_subgroup_clustered_reduce");
        cl_khr_subgroup_extended_types = ext.contains("cl_khr_subgroup_extended_types");
        cl_khr_subgroup_named_barrier = ext.contains("cl_khr_subgroup_named_barrier");
        cl_khr_subgroup_non_uniform_arithmetic = ext.contains("cl_khr_subgroup_non_uniform_arithmetic");
        cl_khr_subgroup_non_uniform_vote = ext.contains("cl_khr_subgroup_non_uniform_vote");
        cl_khr_subgroup_rotate = ext.contains("cl_khr_subgroup_rotate");
        cl_khr_subgroup_shuffle = ext.contains("cl_khr_subgroup_shuffle");
        cl_khr_subgroup_shuffle_relative = ext.contains("cl_khr_subgroup_shuffle_relative");
        cl_khr_subgroups = check_khr_subgroups(ext);
        cl_khr_suggested_local_work_size = check_khr_suggested_local_work_size(ext);
        cl_khr_terminate_context = check_khr_terminate_context(ext);
        cl_khr_throttle_hints = ext.contains("cl_khr_throttle_hints");
        cl_khr_work_group_uniform_arithmetic = ext.contains("cl_khr_work_group_uniform_arithmetic");
        cl_loader_info = check_loader_info(ext);
        cl_nv_compiler_options = ext.contains("cl_nv_compiler_options");
        cl_nv_copy_opts = ext.contains("cl_nv_copy_opts");
        cl_nv_create_buffer = check_nv_create_buffer(ext);
        cl_nv_device_attribute_query = ext.contains("cl_nv_device_attribute_query");
        cl_nv_pragma_unroll = ext.contains("cl_nv_pragma_unroll");
        cl_pocl_content_size = check_pocl_content_size(ext);
        cl_qcom_ext_host_ptr = check_qcom_ext_host_ptr(ext);
        cl_qcom_ext_host_ptr_iocoherent = ext.contains("cl_qcom_ext_host_ptr_iocoherent");
        cl_qcom_perf_hint = check_qcom_perf_hint(ext);
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

    private boolean check_ext_buffer_device_address(Set<String> ext) {
        return ext.contains("cl_ext_buffer_device_address") && checkExtension("cl_ext_buffer_device_address", checkFunctions(
            clSetKernelArgDevicePointerEXT
        ));
    }

    private boolean check_ext_device_fission(Set<String> ext) {
        return ext.contains("cl_ext_device_fission") && checkExtension("cl_ext_device_fission", checkFunctions(
            clReleaseDeviceEXT, clRetainDeviceEXT, clCreateSubDevicesEXT
        ));
    }

    private boolean check_ext_image_requirements_info(Set<String> ext) {
        return ext.contains("cl_ext_image_requirements_info") && checkExtension("cl_ext_image_requirements_info", checkFunctions(
            clGetImageRequirementsInfoEXT
        ));
    }

    private boolean check_ext_migrate_memobject(Set<String> ext) {
        return ext.contains("cl_ext_migrate_memobject") && checkExtension("cl_ext_migrate_memobject", checkFunctions(
            clEnqueueMigrateMemObjectEXT
        ));
    }

    private boolean check_img_cancel_command(Set<String> ext) {
        return ext.contains("cl_img_cancel_command") && checkExtension("cl_img_cancel_command", checkFunctions(
            clCancelCommandsIMG
        ));
    }

    private boolean check_img_generate_mipmap(Set<String> ext) {
        return ext.contains("cl_img_generate_mipmap") && checkExtension("cl_img_generate_mipmap", checkFunctions(
            clEnqueueGenerateMipmapIMG
        ));
    }

    private boolean check_img_use_gralloc_ptr(Set<String> ext) {
        return ext.contains("cl_img_use_gralloc_ptr") && checkExtension("cl_img_use_gralloc_ptr", checkFunctions(
            clEnqueueAcquireGrallocObjectsIMG, clEnqueueReleaseGrallocObjectsIMG
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

    private boolean check_intel_program_scope_host_pipe(Set<String> ext) {
        return ext.contains("cl_intel_program_scope_host_pipe") && checkExtension("cl_intel_program_scope_host_pipe", checkFunctions(
            clEnqueueReadHostPipeINTEL, clEnqueueWriteHostPipeINTEL
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
            clCommandCopyImageToBufferKHR, clCommandFillBufferKHR, clCommandFillImageKHR, clCommandNDRangeKernelKHR, clGetCommandBufferInfoKHR, 
            clCommandSVMMemcpyKHR, clCommandSVMMemFillKHR
        ));
    }

    private boolean check_khr_command_buffer_multi_device(Set<String> ext) {
        return ext.contains("cl_khr_command_buffer_multi_device") && checkExtension("cl_khr_command_buffer_multi_device", checkFunctions(
            clRemapCommandBufferKHR
        ));
    }

    private boolean check_khr_command_buffer_mutable_dispatch(Set<String> ext) {
        return ext.contains("cl_khr_command_buffer_mutable_dispatch") && checkExtension("cl_khr_command_buffer_mutable_dispatch", checkFunctions(
            clUpdateMutableCommandsKHR, clGetMutableCommandInfoKHR
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

    private boolean check_khr_external_semaphore_sync_fd(Set<String> ext) {
        return ext.contains("cl_khr_external_semaphore_sync_fd") && checkExtension("cl_khr_external_semaphore_sync_fd", checkFunctions(
            clReImportSemaphoreSyncFdKHR
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

    private boolean check_loader_info(Set<String> ext) {
        return ext.contains("cl_loader_info") && checkExtension("cl_loader_info", checkFunctions(
            clGetICDLoaderInfoOCLICD
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

    private boolean check_qcom_perf_hint(Set<String> ext) {
        return ext.contains("cl_qcom_perf_hint") && checkExtension("cl_qcom_perf_hint", checkFunctions(
            clSetPerfHintQCOM
        ));
    }

}
