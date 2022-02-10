/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val KHR = "KHR"
val EXT = "EXT"

val ALTERA = "ALTERA"
val AMD = "AMD"
val APPLE = "APPLE"
val ARM = "ARM"
val IMG = "IMG"
val INTEL = "INTEL"
val NV = "NV"
val POCL = "POCL"
val QCOM = "QCOM"

val khr_3d_image_writes = EXT_FLAG.nativeClassCL("khr_3d_image_writes", KHR) {
    documentation =
        """
        When true, the $extensionName extension is supported.

        This extension adds support for kernel writes to 3D images.
        """
}

val khr_async_work_group_copy_fence = EXT_FLAG.nativeClassCL("khr_async_work_group_copy_fence", KHR) {
    documentation =
        """
        When true, the $extensionName extension is supported.

        The extension adds a new built-in function to OpenCL C to establish a memory synchronization ordering of asynchronous copies.
        """
}

val khr_byte_addressable_store = EXT_FLAG.nativeClassCL("khr_byte_addressable_store", KHR) {
    documentation =
        """
        When true, the $extensionName extension is supported.

        This extension eliminates the restriction of not allowing writes to a pointer (or array elements) of types less than 32-bit wide in kernel program.
        """
}

val khr_device_enqueue_local_arg_types = EXT_FLAG.nativeClassCL("khr_device_enqueue_local_arg_types", KHR) {
    documentation =
        """
        When true, the $extensionName extension is supported.

        This extension allows arguments to blocks passed to enqueue_kernel functions to be declared as a pointer to any type (built-in or user-defined) in
        local memory instead of just {@code local void *}.
        """
}

val khr_expect_assume = EXT_FLAG.nativeClassCL("khr_expect_assume", KHR) {
    documentation =
        """
        When true, the $extensionLink extension is supported.

        This extension adds mechanisms to provide information to the compiler that may improve the performance of some kernels. Specifically, this extension
        adds the ability to:
        ${ul(
            "Tell the compiler the <i>expected</i> value of a variable.",
            "Allow the compiler to <i>assume</i> a condition is true."
        )}

        These functions are not required for functional correctness.

        The initial version of this extension extends the OpenCL SPIR-V environment to support new instructions for offline compilation tool chains. Similar
        functionality may be provided by some OpenCL C online compilation tool chains, but formal support in OpenCL C is not required by the initial version of
        the extension.
        """
}

val khr_extended_async_copies = EXT_FLAG.nativeClassCL("khr_extended_async_copies", KHR) {
    documentation =
        """
        When true, the $extensionLink extension is supported.
        
        This extension augments built-in asynchronous copy functions to OpenCL C to support more patterns:
        ${ol(
            "for async copy between 2D source and 2D destination.",
            "for async copy between 3D source and 3D destination."
        )}
        """
}

val khr_extended_bit_ops = EXT_FLAG.nativeClassCL("khr_extended_bit_ops", KHR) {
    documentation =
        """
        When true, the $extensionLink extension is supported.
        
        This extension adds OpenCL C functions for performing extended bit operations. Specifically, the following functions are added:
        ${ul(
            "bitfield insert: insert bits from one source operand into another source operand.",
            "bitfield extract: extract bits from a source operand, with sign- or zero-extension.",
            "bit reverse: reverse the bits of a source operand."
        )}
        """
}

val khr_external_memory_dma_buf = EXT_FLAG.nativeClassCL("khr_external_memory_dma_buf", KHR) {
    documentation = "When true, the $extensionLink extension is supported."
}
val khr_external_memory_opaque_fd = EXT_FLAG.nativeClassCL("khr_external_memory_opaque_fd", KHR) {
    documentation = "When true, the $extensionLink extension is supported."
}
val khr_external_memory_win32 = EXT_FLAG.nativeClassCL("khr_external_memory_win32", KHR) {
    documentation = "When true, the $extensionLink extension is supported."
}

val khr_global_int32_base_atomics = EXT_FLAG.nativeClassCL("khr_global_int32_base_atomics", KHR) {
    documentation =
        """
        When true, the $extensionName extension is supported.

        This extension adds basic atomic operations on 32-bit integers in global memory.
        """
}
val khr_global_int32_extended_atomics = EXT_FLAG.nativeClassCL("khr_global_int32_extended_atomics", KHR) {
    documentation =
        """
        When true, the $extensionName extension is supported.

        This extension adds extended atomic operations on 32-bit integers in global memory.
        """
}

val khr_int64_base_atomics = EXT_FLAG.nativeClassCL("khr_int64_base_atomics", KHR) {
    documentation =
        """
        When true, the $extensionName extension is supported.

        This extension adds basic atomic operations on 64-bit integers in both global and local memory.
        """
}
val khr_int64_extended_atomics = EXT_FLAG.nativeClassCL("khr_int64_extended_atomics", KHR) {
    documentation =
        """
        When true, the $extensionName extension is supported.

        This extension adds extended atomic operations on 64-bit integers in both global and local memory.
        """
}

val khr_local_int32_base_atomics = EXT_FLAG.nativeClassCL("khr_local_int32_base_atomics", KHR) {
    documentation =
        """
        When true, the $extensionName extension is supported.

        This extension adds basic atomic operations on 32-bit integers in local memory.
        """
}
val khr_local_int32_extended_atomics = EXT_FLAG.nativeClassCL("khr_local_int32_extended_atomics", KHR) {
    documentation =
        """
        When true, the $extensionName extension is supported.

        This extension adds extended atomic operations on 32-bit integers in local memory.
        """
}

val khr_mipmap_image_writes = EXT_FLAG.nativeClassCL("khr_mipmap_image_writes", KHR) {
    documentation =
        """
        When true, the $extensionName extension is supported.

        This extension adds built-in functions that can be used to write a mip-mapped image in an OpenCL C program.
        """
}

val khr_select_fprounding_mode = EXT_FLAG.nativeClassCL("khr_select_fprounding_mode", KHR) {
    documentation =
        """
        When true, the $extensionName extension is supported.

        This extension adds support for specifying the rounding mode for an instruction or group of instructions in the program source.

        The appropriate rounding mode can be specified using {@code \#pragma OPENCL SELECT_ROUNDING_MODE} rounding-mode in the program source.

        The {@code \#pragma OPENCL SELECT_ROUNDING_MODE} sets the rounding mode for all instructions that operate on floating-point types (scalar or vector
        types) or produce floating-point values that follow this pragma in the program source until the next {@code \#pragma OPENCL SELECT_ROUNDING_MODE} is
        encountered. Note that the rounding mode specified for a block of code is known at compile time. Except where otherwise documented, the callee
        functions do not inherit the rounding mode of the caller function.

        If this extension is enabled, the {@code __ROUNDING_MODE__} preprocessor symbol shall be defined to be one of the following according to the current
        rounding mode:
        ${codeBlock("""
\#define __ROUNDING_MODE__ rte
\#define __ROUNDING_MODE__ rtz
\#define __ROUNDING_MODE__ rtp
\#define __ROUNDING_MODE__ rtz""")}
        The default rounding mode is round to nearest even. The built-in math functions, the common functions, and the geometric functions are implemented with
        the round to nearest even rounding mode.

        Various built-in conversions and the vstore_half and vstorea_halfn built-in functions that do not specify a rounding mode inherit the current rounding
        mode. Conversions from floating-point to integer type always use rtz mode, except where the user specifically asks for another rounding mode.

        Notes The above four rounding modes are defined by IEEE 754. Floating-point calculations may be carried out internally with extra precision and then
        rounded to fit into the destination type. Round to nearest even is currently the only rounding mode required by the OpenCL specification and is
        therefore the default rounding mode. In addition, only static selection of rounding mode is supported. Dynamically reconfiguring the rounding modes as
        specified by the IEEE 754 spec is not a requirement.
        """
}

val khr_srgb_image_writes = EXT_FLAG.nativeClassCL("khr_srgb_image_writes", KHR) {
    documentation =
        """
        When true, the $extensionName extension is supported.

        This extension enables kernels to write to sRGB images using the {@code write_imagef} built-in function. The sRGB image formats that may be written to
        will be returned by #GetSupportedImageFormats().

        When the image is an sRGB image, the {@code write_imagef} built-in function will perform the linear to sRGB conversion. Only the R, G, and B components
        are converted from linear to sRGB; the A component is written as-is.
        """
}

val khr_subgroup_ballot = EXT_FLAG.nativeClassCL("khr_subgroup_ballot", KHR) {
    documentation =
        """
        When true, the $extensionName extension is supported.

        This extension adds the ability to collect and operate on ballots from work items in the subgroup.
        """
}

val khr_subgroup_clustered_reduce = EXT_FLAG.nativeClassCL("khr_subgroup_clustered_reduce", KHR) {
    documentation =
        """
        When true, the $extensionName extension is supported.

        This extension adds support for clustered reductions that operate on a subset of work items in the subgroup.
        """
}

val khr_subgroup_extended_types = EXT_FLAG.nativeClassCL("khr_subgroup_extended_types", KHR) {
    documentation =
        """
        When true, the $extensionName extension is supported.

        This extension adds additional supported data types to the existing subgroup broadcast, scan, and reduction functions.
        """
}

val khr_subgroup_non_uniform_arithmetic = EXT_FLAG.nativeClassCL("khr_subgroup_non_uniform_arithmetic", KHR) {
    documentation =
        """
        When true, the $extensionName extension is supported.

        This extension adds the ability to use some subgroup functions within non-uniform flow control, including additional scan and reduction operators.
        """
}

val khr_subgroup_non_uniform_vote = EXT_FLAG.nativeClassCL("khr_subgroup_non_uniform_vote", KHR) {
    documentation =
        """
        When true, the $extensionName extension is supported.

        This extension adds the ability to elect a single work item from a subgroup to perform a task and to hold votes among work items in a subgroup.
        """
}

val khr_subgroup_shuffle_relative = EXT_FLAG.nativeClassCL("khr_subgroup_shuffle_relative", KHR) {
    documentation =
        """
        When true, the $extensionName extension is supported.

        This extension adds specialized ways to exchange data among work items in a subgroup that may perform better on some implementations.
        """
}

val khr_subgroup_shuffle = EXT_FLAG.nativeClassCL("khr_subgroup_shuffle", KHR) {
    documentation =
        """
        When true, the $extensionName extension is supported.

        This extension adds additional ways to exchange data among work items in a subgroup.
        """
}

val amd_compile_options = EXT_FLAG.nativeClassCL("amd_compile_options", AMD) {
    documentation =
        """
        When true, the $extensionLink extension is supported.

        This extension adds the following options, which are not part of the OpenCL specification:
        ${ul(
            """
            -g &ndash; This is an experimental feature that lets you use the GNU project debugger, GDB, to debug kernels on x86 CPUs running Linux or
            cygwin/minGW under Windows. This option does not affect the default optimization of the OpenCL code.
            """,
            "-O0 &ndash; Specifies to the compiler not to optimize. This is equivalent to the OpenCL standard option -cl-opt-disable.",
            "-f[no-]bin-source &ndash; Does [not] generate OpenCL source in the .source section. By default, the source is NOT generated.",
            "-f[no-]bin-llvmir &ndash; Does [not] generate LLVM IR in the .llvmir section. By default, LLVM IR IS generated.",
            "-f[no-]bin-amdil &ndash; Does [not] generate AMD IL in the .amdil section. By Default, AMD IL is NOT generated.",
            "-f[no-]bin-exe &ndash; Does [not] generate the executable (ISA) in .text section. By default, the executable IS generated.",
            "-f[no-]bin-hsail &ndash; Does [not] generate HSAIL/BRIG in the binary. By default, HSA IL/BRIG is NOT generated."
        )}
        To avoid source changes, there are two environment variables that can be used to change CL options during the runtime:
        ${ul(
            "AMD_OCL_BUILD_OPTIONS &ndash; Overrides the CL options specified in #BuildProgram().",
            "AMD_OCL_BUILD_OPTIONS_APPEND &ndash; Appends options to the options specified in #BuildProgram()."
        )}
        """
}
val amd_event_callback = EXT_FLAG.nativeClassCL("amd_event_callback", AMD) {
    documentation =
        """
        When true, the $extensionLink extension is supported.

        This extension provides the ability to register event callbacks for states other than #COMPLETE. The full set of event states are allowed:
        #QUEUED, #SUBMITTED, and #RUNNING.
        """
}
val amd_fp64 = EXT_FLAG.nativeClassCL("amd_fp64", AMD) {
    documentation =
        """
        When true, the $extensionLink extension is supported.

        This extension provides a subset of the functionality of that provided by the cl_khr_fp64 extension. When enabled, the compiler recognizes the double
        scalar and vector types, compiles expressions involving those types, and accepts calls to all builtin functions enabled by the cl_khr_fp64 extension.
        However, this extension does not guarantee that all cl_khr_fp64 built in functions are implemented and does not guarantee that the built in functions
        that have been implemented would be considered conformant to the cl_khr_fp64 extension.
        """
}
val amd_media_ops = EXT_FLAG.nativeClassCL("amd_media_ops", AMD) {
    documentation =
        """
        When true, the $extensionLink extension is supported.

        The directive when enabled adds the following built-in functions to the OpenCL language.
        ${codeBlock("""
Note: typen denote opencl scalar type {n = 1} and vector types {n = 4, 8, 16}.

Build-in Function
  uint  amd_pack(float4 src)
Description
  dst =   ((((uint)src.s0) & 0xff)      )
        + ((((uint)src.s1) & 0xff) <<  8)
        + ((((uint)src.s2) & 0xff) << 16)
        + ((((uint)src.s3) & 0xff) << 24)

Build-in Function
  floatn  amd_unpack3(unitn src)
Description
  dst.s0 = (float)((src.s0 >> 24) & 0xff)
  similar operation applied to other components of the vectors

Build-in Function
  floatn   amd_unpack2 (unitn src)
Description
  dst.s0 = (float)((src.s0 >> 16) & 0xff)
  similar operation applied to other components of the vectors

Build-in Function
  floatn   amd_unpack1 (unitn src)
Description
  dst.s0 = (float)((src.s0 >> 8) & 0xff)
  similar operation applied to other components of the vectors

Build-in Function
  floatn   amd_unpack0 (unitn src)
Description
  dst.s0 = (float)(src.s0 & 0xff)
  similar operation applied to other components of the vectors

Build-in Function
  uintn  amd_bitalign (uintn src0, uintn src1, uintn src2)
Description
  dst.s0 =  (uint) (((((long)src0.s0) << 32) | (long)src1.s0) >> (src2.s0 & 31))
  similar operation applied to other components of the vectors.


Build-in Function
  uintn  amd_bytealign (uintn src0, uintn src1, uintn src2)
Description
  dst.s0 =  (uint) (((((long)src0.s0) << 32) | (long)src1.s0) >> ((src2.s0 & 3)*8))
  similar operation applied to other components of the vectors

Build-in Function
  uintn  amd_lerp (uintn src0, uintn src1, uintn src2)
Description
  dst.s0 = (((((src0.s0 >>  0) & 0xff) + ((src1.s0 >>  0) & 0xff) + ((src2.s0 >>  0) & 1)) >> 1) <<  0) +
           (((((src0.s0 >>  8) & 0xff) + ((src1.s0 >>  8) & 0xff) + ((src2.s0 >>  8) & 1)) >> 1) <<  8) +
           (((((src0.s0 >> 16) & 0xff) + ((src1.s0 >> 16) & 0xff) + ((src2.s0 >> 16) & 1)) >> 1) << 16) +
           (((((src0.s0 >> 24) & 0xff) + ((src1.s0 >> 24) & 0xff) + ((src2.s0 >> 24) & 1)) >> 1) << 24);
  similar operation applied to other components of the vectors

Build-in Function
  uintn  amd_sad (uintn src0, uintn src1, uintn src2)
Description
  dst.s0 = src2.s0 +
           abs(((src0.s0 >>  0) & 0xff) - ((src1.s0 >>  0) & 0xff)) +
           abs(((src0.s0 >>  8) & 0xff) - ((src1.s0 >>  8) & 0xff)) +
           abs(((src0.s0 >> 16) & 0xff) - ((src1.s0 >> 16) & 0xff)) +
           abs(((src0.s0 >> 24) & 0xff) - ((src1.s0 >> 24) & 0xff));
  similar operation applied to other components of the vectors

Build-in Function
  uintn  amd_sadhi (uintn src0, uintn src1n, uintn src2)
Description
  dst.s0 = src2.s0 +
           (abs(((src0.s0 >>  0) & 0xff) - ((src1.s0 >>  0) & 0xff)) << 16) +
           (abs(((src0.s0 >>  8) & 0xff) - ((src1.s0 >>  8) & 0xff)) << 16) +
           (abs(((src0.s0 >> 16) & 0xff) - ((src1.s0 >> 16) & 0xff)) << 16) +
           (abs(((src0.s0 >> 24) & 0xff) - ((src1.s0 >> 24) & 0xff)) << 16);
  similar operation applied to other components of the vectors

Build-in Function
  uint  amd_sad4(uint4 src0, uint4 src1, uint src2)
Description
  dst   = src2   +
           abs(((src0.s0 >>  0) & 0xff) - ((src1.s0 >>  0) & 0xff)) +
           abs(((src0.s0 >>  8) & 0xff) - ((src1.s0 >>  8) & 0xff)) +
           abs(((src0.s0 >> 16) & 0xff) - ((src1.s0 >> 16) & 0xff)) +
           abs(((src0.s0 >> 24) & 0xff) - ((src1.s0 >> 24) & 0xff)) +
           abs(((src0.s1 >>  0) & 0xff) - ((src1.s0 >>  0) & 0xff)) +
           abs(((src0.s1 >>  8) & 0xff) - ((src1.s1 >>  8) & 0xff)) +
           abs(((src0.s1 >> 16) & 0xff) - ((src1.s1 >> 16) & 0xff)) +
           abs(((src0.s1 >> 24) & 0xff) - ((src1.s1 >> 24) & 0xff)) +
           abs(((src0.s2 >>  0) & 0xff) - ((src1.s2 >>  0) & 0xff)) +
           abs(((src0.s2 >>  8) & 0xff) - ((src1.s2 >>  8) & 0xff)) +
           abs(((src0.s2 >> 16) & 0xff) - ((src1.s2 >> 16) & 0xff)) +
           abs(((src0.s2 >> 24) & 0xff) - ((src1.s2 >> 24) & 0xff)) +
           abs(((src0.s3 >>  0) & 0xff) - ((src1.s3 >>  0) & 0xff)) +
           abs(((src0.s3 >>  8) & 0xff) - ((src1.s3 >>  8) & 0xff)) +
           abs(((src0.s3 >> 16) & 0xff) - ((src1.s3 >> 16) & 0xff)) +
           abs(((src0.s3 >> 24) & 0xff) - ((src1.s3 >> 24) & 0xff));""")}
        """
}
val amd_media_ops2 = EXT_FLAG.nativeClassCL("amd_media_ops2", AMD) {
    documentation =
        """
        When true, the $extensionLink extension is supported.

        The directive when enabled adds the following built-in functions to the OpenCL language.
        ${codeBlock("""
Note: typen denote open scalar type { n = 1 } and vector types { n = 2, 4, 8, 16 }.

Build-in Function
  uintn  amd_msad (uintn src0, uintn src1, uintn src2)
Description
  uchar4 src0u8 = as_uchar4(src0.s0);
  uchar4 src1u8 = as_uchar4(src1.s0);
  dst.s0 = src2.s0 +
           ((src1u8.s0 == 0) ? 0 : abs(src0u8.s0 - src1u8.s0)) +
           ((src1u8.s1 == 0) ? 0 : abs(src0u8.s1 - src1u8.s1)) +
           ((src1u8.s2 == 0) ? 0 : abs(src0u8.s2 - src1u8.s2)) +
           ((src1u8.s3 == 0) ? 0 : abs(src0u8.s3 - src1u8.s3));
  similar operation applied to other components of the vectors

Build-in Function
  ulongn amd_qsad (ulongn src0, uintn src1, ulongn src2)
Description
  uchar8 src0u8 = as_uchar8(src0.s0);
  ushort4 src2u16 = as_ushort4(src2.s0);
  ushort4 dstu16;
  dstu16.s0 = amd_sad(as_uint(src0u8.s0123), src1.s0, src2u16.s0);
  dstu16.s1 = amd_sad(as_uint(src0u8.s1234), src1.s0, src2u16.s1);
  dstu16.s2 = amd_sad(as_uint(src0u8.s2345), src1.s0, src2u16.s2);
  dstu16.s3 = amd_sad(as_uint(src0u8.s3456), src1.s0, src2u16.s3);
  dst.s0 = as_uint2(dstu16);
  similar operation applied to other components of the vectors

Build-in Function
  ulongn amd_mqsad (ulongn src0, uintn src1, ulongn src2)
Description
  uchar8 src0u8 = as_uchar8(src0.s0);
  ushort4 src2u16 = as_ushort4(src2.s0);
  ushort4 dstu16;
  dstu16.s0 = amd_msad(as_uint(src0u8.s0123), src1.s0, src2u16.s0);
  dstu16.s1 = amd_msad(as_uint(src0u8.s1234), src1.s0, src2u16.s1);
  dstu16.s2 = amd_msad(as_uint(src0u8.s2345), src1.s0, src2u16.s2);
  dstu16.s3 = amd_msad(as_uint(src0u8.s3456), src1.s0, src2u16.s3);
  dst.s0 = as_uint2(dstu16);
  similar operation applied to other components of the vectors

Build-in Function
  uintn  amd_sadw (uintn src0, uintn src1, uintn src2)
Description
  ushort2 src0u16 = as_ushort2(src0.s0);
  ushort2 src1u16 = as_ushort2(src1.s0);
  dst.s0 = src2.s0 +
           abs(src0u16.s0 - src1u16.s0) +
           abs(src0u16.s1 - src1u16.s1);
  similar operation applied to other components of the vectors

Build-in Function
  uintn  amd_sadd (uintn src0, uintn src1, uintn src2)
Description
  dst.s0 = src2.s0 +  abs(src0.s0 - src1.s0);
  similar operation applied to other components of the vectors

Built-in Function:
  uintn amd_bfm (uintn src0, uintn src1)
Description
  dst.s0 = ((1 << (src0.s0 & 0x1f)) - 1) << (src1.s0 & 0x1f);
  similar operation applied to other components of the vectors

Built-in Function:
  uintn amd_bfe (uintn src0, uintn src1, uintn src2)
Description
  NOTE: operator >> below represent logical right shift
  offset = src1.s0 & 31;
  width = src2.s0 & 31;
  if width = 0
      dst.s0 = 0;
  else if (offset + width) < 32
      dst.s0 = (src0.s0 << (32 - offset - width)) >> (32 - width);
  else
      dst.s0 = src0.s0 >> offset;
  similar operation applied to other components of the vectors

Built-in Function:
   intn amd_bfe (intn src0, uintn src1, uintn src2)
Description
  NOTE: operator >> below represent arithmetic right shift
  offset = src1.s0 & 31;
  width = src2.s0 & 31;
  if width = 0
      dst.s0 = 0;
  else if (offset + width) < 32
      dst.s0 = src0.s0 << (32-offset-width) >> 32-width;
  else
      dst.s0 = src0.s0 >> offset;
  similar operation applied to other components of the vectors

Built-in Function:
   intn amd_median3 (intn src0, intn src1, intn src2)
   uintn amd_median3 (uintn src0, uintn src1, uintn src2)
   floatn amd_median3 (floatn src0, floatn src1, floattn src2)
Description
   returns median of src0, src1, and src2

Built-in Function:
   intn amd_min3 (intn src0, intn src1, intn src2)
   uintn amd_min3 (uintn src0, uintn src1, uintn src2)
   floatn amd_min3 (floatn src0, floatn src1, floattn src2)
Description
   returns min of src0, src1, and src2

Built-in Function:
   intn amd_max3 (intn src0, intn src1, intn src2)
   uintn amd_max3 (uintn src0, uintn src1, uintn src2)
   floatn amd_max3 (floatn src0, floatn src1, floattn src2)
Description
   returns max of src0, src1, and src2""")}
        """
}
val amd_popcnt = EXT_FLAG.nativeClassCL("amd_popcnt", AMD) {
    documentation =
        """
        When true, the $extensionLink extension is supported.

        This extension introduces a “population count” function called popcnt. This extension was taken into core OpenCL 1.2, and the function was renamed
        popcount. The core 1.2 popcount function is identical to the AMD extension popcnt function.
        """
}
val amd_predefined_macros = EXT_FLAG.nativeClassCL("amd_predefined_macros", AMD) {
    documentation =
        """
        When true, the $extensionLink extension is supported.

        The following macros are predefined when compiling OpenCL™ C kernels. These macros are defined automatically based on the device for which the code is
        being compiled.

        <h5>GPU devices</h5>
        ${ul(
            "__Barts__",
            "__BeaverCreek__",
            "__Bheem__",
            "__Bonaire__",
            "__Caicos__",
            "__Capeverde__",
            "__Carrizo__",
            "__Cayman__",
            "__Cedar__",
            "__Cypress__",
            "__Devastator__",
            "__Hainan__",
            "__Iceland__",
            "__Juniper__",
            "__Kalindi__",
            "__Kauai__",
            "__Lombok__",
            "__Loveland__",
            "__Mullins__",
            "__Oland__",
            "__Pitcairn__",
            "__RV710__",
            "__RV730__",
            "__RV740__",
            "__RV770__",
            "__RV790__",
            "__Redwood__",
            "__Scrapper__",
            "__Spectre__",
            "__Spooky__",
            "__Tahiti__",
            "__Tonga__",
            "__Turks__",
            "__WinterPark__",
            "__GPU__"
        )}

        <h5>CPU devices</h5>
        ${ul(
            "__CPU__",
            "__X86__",
            "__X86_64__"
        )}
        Note that __GPU__ or __CPU__ are predefined whenever a GPU or CPU device is the compilation target.
        """
}
val amd_printf = EXT_FLAG.nativeClassCL("amd_printf", AMD) {
    documentation =
        """
        When true, the $extensionLink extension is supported.

        This extension adds the built-in function {@code printf(__constant char * restrict format, …);}

        This function writes output to the stdout stream associated with the host application. The format string is a character sequence that:
        ${ul(
            "is null-terminated and composed of zero and more directives,",
            "ordinary characters (i.e. not %), which are copied directly to the output stream unchanged, and",
            """
            conversion specifications, each of which can result in fetching zero or more arguments, converting them, and then writing the final result to the
            output stream.
            """
        )}
        The format string must be resolvable at compile time; thus, it cannot be dynamically created by the executing program. (Note that the use of variadic
        arguments in the built-in printf does not imply its use in other builtins; more importantly, it is not valid to use printf in user-defined functions or
        kernels.)

        The OpenCL C printf closely matches the definition found as part of the C99 standard. Note that conversions introduced in the format string with % are
        supported with the following guidelines:
        ${ul(
            """
            A 32-bit floating point argument is not converted to a 64-bit double, unless the extension cl_khr_fp64 is supported and enabled. This includes the
            double variants if cl_khr_fp64 is supported and defined in the corresponding compilation unit.
            """,
            "64-bit integer types can be printed using %ld / %lx / %lu.",
            "%lld / %llx / %llu are not supported and reserved for 128-bit integer types (long long).",
            """
            All OpenCL vector types can be explicitly passed and printed using the modifier vn, where n can be 2, 3, 4, 8, or 16. This modifier appears before
            the original conversion specifier for the vector’s component type (for example, to print a float4 %v4f). Since vn is a conversion specifier, it is
            valid to apply optional flags, such as field width and precision, just as it is when printing the component types. Since a vector is an aggregate
            type, the comma separator is used between the components: 0:1, … , n-2:n-1.
            """
        )}
        """
}
val amd_vec3 = EXT_FLAG.nativeClassCL("amd_vec3", AMD) {
    documentation =
        """
        When true, the $extensionLink extension is supported.

        This extension adds support for vectors with three elements: float3, short3, char3, etc. This data type was added to OpenCL 1.1 as a core feature.
        """
}

val APPLE_fp64_basic_ops = EXT_FLAG.nativeClassCL("APPLE_fp64_basic_ops", APPLE)

val arm_import_memory_host = EXT_FLAG.nativeClassCL("cl_arm_import_memory_host", ARM) {
    documentation = "When true, the $extensionLink extension is supported."
}
val arm_import_memory_dma_buf = EXT_FLAG.nativeClassCL("cl_arm_import_memory_dma_buf", ARM) {
    documentation = "When true, the $extensionLink extension is supported."
}
val arm_import_memory_protected = EXT_FLAG.nativeClassCL("cl_arm_import_memory_protected", ARM) {
    documentation = "When true, the $extensionLink extension is supported."
}
val arm_import_memory_android_hardware_buffer = EXT_FLAG.nativeClassCL("cl_arm_import_memory_android_hardware_buffer", ARM) {
    documentation = "When true, the $extensionLink extension is supported."
}

val arm_integer_dot_product_int8 = EXT_FLAG.nativeClassCL("arm_integer_dot_product_int8", ARM) {
    documentation = "When true, the ${extensionLink("arm_integer_dot_product", name = "cl_arm_integer_dot_product_int8")} extension is supported."
}
val arm_integer_dot_product_accumulate_int8 = EXT_FLAG.nativeClassCL("arm_integer_dot_product_accumulate_int8", ARM) {
    documentation = "When true, the ${extensionLink("arm_integer_dot_product", name = "cl_arm_integer_dot_product_accumulate_int8")} extension is supported."
}
val arm_integer_dot_product_accumulate_int16 = EXT_FLAG.nativeClassCL("arm_integer_dot_product_accumulate_int16", ARM) {
    documentation = "When true, the ${extensionLink("arm_integer_dot_product", name = "cl_arm_integer_dot_product_accumulate_int16")} extension is supported."
}
val arm_integer_dot_product_accumulate_saturate_int8 = EXT_FLAG.nativeClassCL("arm_integer_dot_product_accumulate_saturate_int8", ARM) {
    documentation = "When true, the ${extensionLink("arm_integer_dot_product", name = "cl_arm_integer_dot_product_accumulate_saturate_int8")} extension is supported."
}

val arm_non_uniform_work_group_size = EXT_FLAG.nativeClassCL("arm_non_uniform_work_group_size", ARM) {
    documentation =
        """
        When true, the $extensionLink extension is supported.
        
        This extension provides a way to enqueue kernels with local work-group sizes that are not integer factors of the global work-group size in OpenCL C 1.x
        languages.

        Such work-groups are referred to in the OpenCL 2.0 specification as non-uniform work-groups.

        To enable this extension the option {@code -cl-arm-non-uniform-work-group-size} must be provided in the options string when building a program from
        source using #BuildProgram(). Kernels created from such a program will be able to be enqueued via #EnqueueNDRangeKernel() with a non-uniform local
        work-group size.

        This feature is enabled by default in OpenCL C 2.0. See section 5.10 of the OpenCL 2.0 API specification. This section also details how kernels that
        are enqueued with non-uniform work-group sizes are divided into work groups.

        The built in function {@code get_local_size()} for kernels that have been built with this extension will take on the OpenCL 2.0 behaviour. See section
        6.13.1 of the OpenCL 2.0 C specification for details.
        """
}

val arm_thread_limit_hint = EXT_FLAG.nativeClassCL("arm_thread_limit_hint", ARM) {
    documentation =
        """
        When true, the $extensionLink extension is supported.
        
        This extension enables an application to provide a hint for the maximum number of threads allowed to run concurrently on a compute unit. This results
        in a limit in the threads used by a kernel instance on devices that support it, lowering pressure on caches.
        """
}

val intel_media_block_io = EXT_FLAG.nativeClassCL("intel_media_block_io", INTEL) {
    documentation =
        """
        This extension augments the block read/write functionality available in the Intel vendor extensions ${intel_subgroups.link} and
        ${extensionLink("intel_subgroups_short")} by the specification of additional built-in functions to facilitate the reading and writing of flexible 2D
        regions from images. This API allows for the explicit specification of the width and height of the image regions.

        While not required, this extension is most useful when the subgroup size is known at compile-time. The primary use case for this extension is to
        support the reading of the edge texels (or image elements) of neighboring macro-blocks as described in the Intel vendor extension
        ${intel_device_side_avc_motion_estimation.link}. When using the built-in functions from {@code cl_intel_device_ side_avc_motion_estimation} the
        subgroup size is implicitly fixed to 16. In other use cases the subgroup size may be fixed using the ${intel_required_subgroup_size.link} extension, if
        needed.
        """
}
val intel_printf = EXT_FLAG.nativeClassCL("intel_printf", INTEL)
val intel_spirv_device_side_avc_motion_estimation = EXT_FLAG.nativeClassCL("intel_spirv_device_side_avc_motion_estimation", INTEL) {
    documentation =
        """
        This extension defines how modules using the SPIR-V extension {@code SPV_INTEL_device_side_avc_motion_estimation} may behave in an OpenCL environment.

        Requires {@link CL21 OpenCL 2.1} and ${intel_device_side_avc_motion_estimation.link}.
        """
}
val intel_spirv_media_block_io = EXT_FLAG.nativeClassCL("intel_spirv_media_block_io", INTEL) {
    documentation =
        """
        This extension defines how modules using the SPIR-V extension {@code SPV_INTEL_media_block_io} may behave in an OpenCL environment.
        
        Requires {@link CL21 OpenCL 2.1} and ${extensionLink("intel_media_block_io")}.
        """
}
val intel_spirv_subgroups = EXT_FLAG.nativeClassCL("intel_spirv_subgroups", INTEL) {
    documentation =
        """
        This extension defines how modules using the SPIR-V extension {@code SPV_INTEL_subgroups} may behave in an OpenCL environment.

        Requires {@link CL21 OpenCL 2.1} and ${intel_subgroups.link}.
        """
}
val intel_subgroups_char = EXT_FLAG.nativeClassCL("intel_subgroups_char", INTEL) {
    documentation =
        """
        The goal of this extension is to allow programmers to improve the performance of applications operating on 8-bit data types by extending the subgroup
        functions described in the ${intel_subgroups.link} extension to support 8-bit integer data types (chars and uchars). Specifically, the extension:
        ${ul(
            "Extends the subgroup broadcast function to allow 8-bit integer values to be broadcast from one work item to all other work items in the subgroup.",
            "Extends the subgroup scan and reduction functions to operate on 8-bit integer data types.",
            "Extends the Intel subgroup shuffle functions to allow arbitrarily exchanging 8-bit integer values among work items in the subgroup.",
            "Extends the Intel subgroup block read and write functions to allow reading and writing 8-bit integer data from images and buffers."
        )}

        Requires {@link CL12 OpenCL 1.2} and ${intel_subgroups.link}.
        """
}
val intel_subgroups_long = EXT_FLAG.nativeClassCL("intel_subgroups_long", INTEL) {
    documentation =
        """
        The goal of this extension is to allow programmers to improve the performance of applications operating on 64-bit data types by extending the subgroup
        functions described in the ${intel_subgroups.link} extension to support 64-bit integer data types (longs and ulongs). Specifically, the extension:
        ${ul(
            "Extends the Intel subgroup block read and write functions to allow reading and writing 64-bit integer data from images and buffers."
        )}
        
        Note that {@code cl_intel_subgroups} and {@code cl_khr_subgroups} already support broadcasts, scans, and reductions for 64-bit integer types, and that
        {@code cl_intel_subgroups} already supports shuffles for 64-bit integer types.

        Requires {@link CL12 OpenCL 1.2} and ${intel_subgroups.link}.
        """
}
val intel_subgroups_short = EXT_FLAG.nativeClassCL("intel_subgroups_short", INTEL) {
    documentation =
        """
        The goal of this extension is to allow programmers to improve the performance of applications operating on 16-bit data types by extending the subgroup
        functions described in the ${intel_subgroups.link} extension to support 16-bit integer data types (shorts and ushorts). Specifically, the extension:
        ${ul(
            "Extends the subgroup broadcast function to allow 16-bit integer values to be broadcast from one work item to all other work items in the subgroup.",
            "Extends the subgroup scan and reduction functions to operate on 16-bit integer data types.",
            "Extends the Intel subgroup shuffle functions to allow arbitrarily exchanging 16-bit integer values among work items in the subgroup.",
            "Extends the Intel subgroup block read and write functions to allow reading and writing 16-bit integer data from images and buffers."
        )}

        Requires {@link CL12 OpenCL 1.2} and ${intel_subgroups.link}.
        """
}

val nv_compiler_options = EXT_FLAG.nativeClassCL("nv_compiler_options", NV) {
    documentation =
        """
        When true, the $extensionLink extension is supported.

        This extension allows the programmer to pass options to the PTX assembler allowing greater control over code generation.
        ${codeBlock(
            """
-cl-nv-maxrregcount <N>
    Passed on to ptxas as --maxrregcount <N>
        N is a positive integer.
    Specify the maximum number of registers that GPU functions can use.
    Until a function-specific limit, a higher value will generally increase
    the performance of individual GPU threads that execute this function.
    However, because thread registers are allocated from a global register
    pool on each GPU, a higher value of this option will also reduce the
    maximum thread block size, thereby reducing the amount of thread
    parallelism. Hence, a good maxrregcount value is the result of a
    trade-off.
    If this option is not specified, then no maximum is assumed. Otherwise
    the specified value will be rounded to the next multiple of 4 registers
    until the GPU specific maximum of 128 registers.

-cl-nv-opt-level <N>
    Passed on to ptxas as --opt-level <N>
        N is a positive integer, or 0 (no optimization).
    Specify optimization level.
    Default value:  3.

-cl-nv-verbose
    Passed on to ptxas as --verbose
    Enable verbose mode.
    Output will be reported in the build log (accessible through the
    callback parameter to clBuildProgram).""")}
        """
}
val nv_copy_opts = EXT_FLAG.nativeClassCL("nv_copy_opts", NV) {
    documentation = "When true, the $extensionLink extension is supported."
}
val nv_pragma_unroll = EXT_FLAG.nativeClassCL("nv_pragma_unroll", NV) {
    documentation =
        """
        When true, the $extensionLink extension is supported.

        <h5>Overview</h5>

        This extension extends the OpenCL C language with a hint that allows loops to be unrolled. This pragma must be used for a loop and can be used to
        specify full unrolling or partial unrolling by a certain amount. This is a hint and the compiler may ignore this pragma for any reason.

        <h5>Goals</h5>

        The principal goal of the pragma unroll is to improve the performance of loops via unrolling. Typically this enables other optimizations or improves
        instruction level parallelism of a thread.

        <h5>Details</h5>

        A user may specify that a loop in the source program be unrolled. This is done via a pragma. The syntax of this pragma is as follows

        {@code \#pragma unroll [unroll-factor]}

        The pragma unroll may optionally specify an unroll factor. The pragma must be placed immediately before the loop and only applies to that loop.

        If unroll factor is not specified then the compiler will try to do complete or full unrolling of the loop. If a loop unroll factor is specified the
        compiler will perform partial loop unrolling. The loop factor, if specified, must be a compile time non negative integer constant.

        A loop unroll factor of 1 means that the compiler should not unroll the loop.

        A complete unroll specification has no effect if the trip count of the loop is not compile-time computable.
        """
}