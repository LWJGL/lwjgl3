/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_shader_atomic_counters = "ARBShaderAtomicCounters".nativeClassGL("ARB_shader_atomic_counters") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension provides a set of atomic counters.

		This extension provides GLSL built-in functions to query and increment/decrement these atomic counters.

		This enables a shader to write to unique offsets (append to a buffer object) or read from unique offsets (consume from a buffer object).

		Opaque handles to atomic counters are declared at global scope and are qualified with the uniform qualifier.

		Unlike other user-defined uniforms declared at global scope, they take NO storage from the default partition, they have NO location, and they may NOT be
		set with the Uniform* commands. Atomic counters may also NOT be grouped into uniform blocks.

		Active atomic counters can be discovered by the commands GL31#GetUniformIndices(), GL31#GetActiveUniformName(), GL20#GetActiveUniform() and
		GL31#GetActiveUniformsiv().

		Like samplers, the opaque handles of the atomic counters and are ONLY used in some GLSL built-in functions.

		The atomic counters pointed to by the opaque handles are bound to buffer binding points and buffer offsets through the layout qualifiers in the shading
		language, or they are implicitly assigned by the compiler.

		Through the OpenGL API, buffer objects may be bound to these binding points with GL30#BindBufferBase() or GL30#BindBufferRange().

		The contents of the atomic counters are stored in the buffer objects. The contents of atomic counters may be set and queried with buffer object
		manipulation functions (e.g. BufferData, BufferSubData, MapBuffer or MapBufferRange).

		Requires ${GL30.core}. ${GL42.promoted}
		"""

	IntConstant(
		"Accepted by the {@code target} parameter of BindBufferBase and BindBufferRange.",

		"ATOMIC_COUNTER_BUFFER" _ 0x92C0
	)

	IntConstant(
		"""
		Accepted by the {@code pname} parameter of GetBooleani_v, GetIntegeri_v, GetFloati_v, GetDoublei_v, GetInteger64i_v, GetBooleanv, GetIntegerv,
		GetInteger64v, GetFloatv, GetDoublev, and GetActiveAtomicCounterBufferiv.
		""",

		"ATOMIC_COUNTER_BUFFER_BINDING" _ 0x92C1
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetIntegeri_64v.",

		"ATOMIC_COUNTER_BUFFER_START" _ 0x92C2,
		"ATOMIC_COUNTER_BUFFER_SIZE" _ 0x92C3
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetActiveAtomicCounterBufferiv.",

		"ATOMIC_COUNTER_BUFFER_DATA_SIZE" _ 0x92C4,
		"ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS" _ 0x92C5,
		"ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES" _ 0x92C6,
		"ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER" _ 0x92C7,
		"ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER" _ 0x92C8,
		"ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER" _ 0x92C9,
		"ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER" _ 0x92CA,
		"ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER" _ 0x92CB
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.",

		"MAX_VERTEX_ATOMIC_COUNTER_BUFFERS" _ 0x92CC,
		"MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS" _ 0x92CD,
		"MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS" _ 0x92CE,
		"MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS" _ 0x92CF,
		"MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS" _ 0x92D0,
		"MAX_COMBINED_ATOMIC_COUNTER_BUFFERS" _ 0x92D1,
		"MAX_VERTEX_ATOMIC_COUNTERS" _ 0x92D2,
		"MAX_TESS_CONTROL_ATOMIC_COUNTERS" _ 0x92D3,
		"MAX_TESS_EVALUATION_ATOMIC_COUNTERS" _ 0x92D4,
		"MAX_GEOMETRY_ATOMIC_COUNTERS" _ 0x92D5,
		"MAX_FRAGMENT_ATOMIC_COUNTERS" _ 0x92D6,
		"MAX_COMBINED_ATOMIC_COUNTERS" _ 0x92D7,
		"MAX_ATOMIC_COUNTER_BUFFER_SIZE" _ 0x92D8,
		"MAX_ATOMIC_COUNTER_BUFFER_BINDINGS" _ 0x92DC
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetProgramiv.",

		"ACTIVE_ATOMIC_COUNTER_BUFFERS" _ 0x92D9
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetActiveUniformsiv.",

		"UNIFORM_ATOMIC_COUNTER_BUFFER_INDEX" _ 0x92DA
	)

	IntConstant(
		"Returned in {@code params} by GetActiveUniform and GetActiveUniformsiv.",

		"UNSIGNED_INT_ATOMIC_COUNTER" _ 0x92DB
	)

	GL42 reuse "GetActiveAtomicCounterBufferiv"
}