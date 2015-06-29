/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_program_interface_query = "ARBProgramInterfaceQuery".nativeClassGL("ARB_program_interface_query") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension provides a single unified set of query commands that can be used by applications to determine properties of various interfaces and
		resources used by program objects to communicate with application code, fixed-function OpenGL pipeline stages, and other programs. In unextended OpenGL
		4.2, there is a separate set of query commands for each different type of interface or resource used by the program. These different sets of queries are
		structured nearly identically, but the queries for some interfaces have limited capability (e.g., there is no ability to enumerate fragment shader
		outputs).

		With the single set of query commands provided by this extension, a consistent set of queries is available for all interfaces, and a new interface can
		be added without having to introduce a completely new set of query commands. These queries are intended to provide a superset of the capabilities
		provided by similar queries in OpenGL 4.2, and should allow for the deprecation of the existing queries.

		This extension defines two terms: interfaces and active resources. Each interface of a program object provides a way for the program to communicate with
		application code, fixed-function OpenGL pipeline stages, and other programs. Examples of interfaces for a program object include inputs (receiving
		values from vertex attributes or outputs of other programs), outputs (sending values to other programs or per-fragment operations), uniforms (receiving
		values from API calls), uniform blocks (receiving values from bound buffer objects), subroutines and subroutine uniforms (receiving API calls to
		indicate functions to call during program execution), and atomic counter buffers (holding values to be manipulated by atomic counter shader functions).
		Each interface of a program has a set of active resources used by the program. For example, the resources of a program's input interface includes all
		active input variables used by the first stage of the program. The resources of a program's uniform block interface consists of the set of uniform
		blocks with at least one member used by any shader in the program.

		Requires ${GL20.core}. ${GL43.promoted}
		"""

	IntConstant(
		"""
		Accepted by the {@code programInterface} parameter of GetProgramInterfaceiv, GetProgramResourceIndex, GetProgramResourceName, GetProgramResourceiv,
		GetProgramResourceLocation, and GetProgramResourceLocationIndex.
		""",

		"UNIFORM" _ 0x92E1,
		"UNIFORM_BLOCK" _ 0x92E2,
		"PROGRAM_INPUT" _ 0x92E3,
		"PROGRAM_OUTPUT" _ 0x92E4,
		"BUFFER_VARIABLE" _ 0x92E5,
		"SHADER_STORAGE_BLOCK" _ 0x92E6,
		"VERTEX_SUBROUTINE" _ 0x92E8,
		"TESS_CONTROL_SUBROUTINE" _ 0x92E9,
		"TESS_EVALUATION_SUBROUTINE" _ 0x92EA,
		"GEOMETRY_SUBROUTINE" _ 0x92EB,
		"FRAGMENT_SUBROUTINE" _ 0x92EC,
		"COMPUTE_SUBROUTINE" _ 0x92ED,
		"VERTEX_SUBROUTINE_UNIFORM" _ 0x92EE,
		"TESS_CONTROL_SUBROUTINE_UNIFORM" _ 0x92EF,
		"TESS_EVALUATION_SUBROUTINE_UNIFORM" _ 0x92F0,
		"GEOMETRY_SUBROUTINE_UNIFORM" _ 0x92F1,
		"FRAGMENT_SUBROUTINE_UNIFORM" _ 0x92F2,
		"COMPUTE_SUBROUTINE_UNIFORM" _ 0x92F3,
		"TRANSFORM_FEEDBACK_VARYING" _ 0x92F4
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetProgramInterfaceiv.",

		"ACTIVE_RESOURCES" _ 0x92F5,
		"MAX_NAME_LENGTH" _ 0x92F6,
		"MAX_NUM_ACTIVE_VARIABLES" _ 0x92F7,
		"MAX_NUM_COMPATIBLE_SUBROUTINES" _ 0x92F8
	)

	IntConstant(
		"Accepted in the {@code props} array of GetProgramResourceiv.",

		"NAME_LENGTH" _ 0x92F9,
		"TYPE" _ 0x92FA,
		"ARRAY_SIZE" _ 0x92FB,
		"OFFSET" _ 0x92FC,
		"BLOCK_INDEX" _ 0x92FD,
		"ARRAY_STRIDE" _ 0x92FE,
		"MATRIX_STRIDE" _ 0x92FF,
		"IS_ROW_MAJOR" _ 0x9300,
		"ATOMIC_COUNTER_BUFFER_INDEX" _ 0x9301,
		"BUFFER_BINDING" _ 0x9302,
		"BUFFER_DATA_SIZE" _ 0x9303,
		"NUM_ACTIVE_VARIABLES" _ 0x9304,
		"ACTIVE_VARIABLES" _ 0x9305,
		"REFERENCED_BY_VERTEX_SHADER" _ 0x9306,
		"REFERENCED_BY_TESS_CONTROL_SHADER" _ 0x9307,
		"REFERENCED_BY_TESS_EVALUATION_SHADER" _ 0x9308,
		"REFERENCED_BY_GEOMETRY_SHADER" _ 0x9309,
		"REFERENCED_BY_FRAGMENT_SHADER" _ 0x930A,
		"REFERENCED_BY_COMPUTE_SHADER" _ 0x930B,
		"TOP_LEVEL_ARRAY_SIZE" _ 0x930C,
		"TOP_LEVEL_ARRAY_STRIDE" _ 0x930D,
		"LOCATION" _ 0x930E,
		"LOCATION_INDEX" _ 0x930F,
		"IS_PER_PATCH" _ 0x92E7
	)

	GL43 reuse "GetProgramInterfaceiv"
	GL43 reuse "GetProgramResourceIndex"
	GL43 reuse "GetProgramResourceName"
	GL43 reuse "GetProgramResourceiv"
	GL43 reuse "GetProgramResourceLocation"
	GL43 reuse "GetProgramResourceLocationIndex"
}