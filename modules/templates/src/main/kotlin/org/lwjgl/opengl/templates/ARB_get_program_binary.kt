/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_get_program_binary = "ARBGetProgramBinary".nativeClassGL("ARB_get_program_binary") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension introduces new commands to retrieve and set the binary representation of a program object. #GetProgramBinary() allows an application to
		cache compiled and linked programs to avoid compiling and linking when used again. This may even allow the GL itself to act as an offline compiler. The
		resulting program binary can be reloaded into the GL via #ProgramBinary(). This is a very useful path for applications that wish to remain portable by
		shipping pure GLSL source shaders, yet would like to avoid the cost of compiling their shaders at runtime. Instead an application can supply its GLSL
		source shaders during first application run, or even during installation. The application then compiles and links its shaders and reads back the program
		binaries. On subsequent runs, only the program binaries need be supplied.

		#ProgramBinary() may also accept binaries in vendor-specific formats produced by specialized offline compilation tools. This extension does not add any
		such formats, but allows for them in further extensions. Though the level of optimization may not be identical -- the offline shader compiler may have
		the luxury of more aggressive optimization at its disposal -- program binaries generated online by the GL are interchangeable with those generated
		offline by an SDK tool.

		Requires ${GL30.core}. ${GL41.promoted}
		"""

	IntConstant(
		"Accepted by the {@code pname} parameter of ProgramParameteri and GetProgramiv.",

		"PROGRAM_BINARY_RETRIEVABLE_HINT" _ 0x8257
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetProgramiv.",

		"PROGRAM_BINARY_LENGTH" _ 0x8741
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv and GetDoublev.",

		"NUM_PROGRAM_BINARY_FORMATS" _ 0x87FE,
		"PROGRAM_BINARY_FORMATS" _ 0x87FF
	)

	GL41 reuse "GetProgramBinary"
	GL41 reuse "ProgramBinary"
	GL41 reuse "ProgramParameteri"
}