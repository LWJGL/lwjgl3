/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_compute_shader = "ARBComputeShader".nativeClassGL("ARB_compute_shader") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		Recent graphics hardware has become extremely powerful and a strong desire to harness this power for work (both graphics and non-graphics) that does not
		fit the traditional graphics pipeline well has emerged. To address this, this extension adds a new single-stage program type known as a compute program.
		This program may contain one or more compute shaders which may be launched in a manner that is essentially stateless. This allows arbitrary workloads to
		be sent to the graphics hardware with minimal disturbance to the GL state machine.

		In most respects, a compute program is identical to a traditional OpenGL program object, with similar status, uniforms, and other such properties. It
		has access to many of the same resources as fragment and other shader types, such as textures, image variables, atomic counters, and so on. However, it
		has no predefined inputs nor any fixed-function outputs. It cannot be part of a pipeline and its visible side effects are through its actions on images
		and atomic counters.

		OpenCL is another solution for using graphics processors as generalized compute devices. This extension addresses a different need. For example, OpenCL
		is designed to be usable on a wide range of devices ranging from CPUs, GPUs, and DSPs through to FPGAs. While one could implement GL on these types of
		devices, the target here is clearly GPUs. Another difference is that OpenCL is more full featured and includes features such as multiple devices,
		asynchronous queues and strict IEEE semantics for floating point operations. This extension follows the semantics of OpenGL - implicitly synchronous,
		in-order operation with single-device, single queue logical architecture and somewhat more relaxed numerical precision requirements. Although not as
		feature rich, this extension offers several advantages for applications that can tolerate the omission of these features. Compute shaders are written in
		GLSL, for example and so code may be shared between compute and other shader types. Objects are created and owned by the same context as the rest of the
		GL, and therefore no interoperability API is required and objects may be freely used by both compute and graphics simultaneously without acquire-release
		semantics or object type translation.

		Requires ${GL42.core}. ${GL43.promoted}
		"""

	IntConstant(
		"Accepted by the {@code type} parameter of CreateShader and returned in the {@code params} parameter by GetShaderiv.",

		"COMPUTE_SHADER" _ 0x91B9
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetFloatv, GetDoublev and GetInteger64v.",

		"MAX_COMPUTE_UNIFORM_BLOCKS" _ 0x91BB,
		"MAX_COMPUTE_TEXTURE_IMAGE_UNITS" _ 0x91BC,
		"MAX_COMPUTE_IMAGE_UNIFORMS" _ 0x91BD,
		"MAX_COMPUTE_SHARED_MEMORY_SIZE" _ 0x8262,
		"MAX_COMPUTE_UNIFORM_COMPONENTS" _ 0x8263,
		"MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS" _ 0x8264,
		"MAX_COMPUTE_ATOMIC_COUNTERS" _ 0x8265,
		"MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS" _ 0x8266,
		"MAX_COMPUTE_WORK_GROUP_INVOCATIONS" _ 0x90EB
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetIntegeri_v, GetBooleani_v, GetFloati_v, GetDoublei_v and GetInteger64i_v.",

		"MAX_COMPUTE_WORK_GROUP_COUNT" _ 0x91BE,
		"MAX_COMPUTE_WORK_GROUP_SIZE" _ 0x91BF
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetProgramiv.",

		"COMPUTE_WORK_GROUP_SIZE" _ 0x8267
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetActiveUniformBlockiv.",

		"UNIFORM_BLOCK_REFERENCED_BY_COMPUTE_SHADER" _ 0x90EC
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetActiveAtomicCounterBufferiv.",

		"ATOMIC_COUNTER_BUFFER_REFERENCED_BY_COMPUTE_SHADER" _ 0x90ED
	)

	IntConstant(
		"Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, and GetBufferPointerv.",

		"DISPATCH_INDIRECT_BUFFER" _ 0x90EE
	)

	IntConstant(
		"Accepted by the {@code value} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev.",

		"DISPATCH_INDIRECT_BUFFER_BINDING" _ 0x90EF
	)

	IntConstant(
		"Accepted by the {@code stages} parameter of UseProgramStages.",

		"COMPUTE_SHADER_BIT" _ 0x00000020
	)

	GL43 reuse "DispatchCompute"
	GL43 reuse "DispatchComputeIndirect"
}