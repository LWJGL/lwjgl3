/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_fragment_program = "ARBFragmentProgram".nativeClassGL("ARB_fragment_program", postfix = ARB) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		Unextended OpenGL mandates a certain set of configurable per- fragment computations defining texture application, texture environment, color sum, and
		fog operations. Several extensions have added further per-fragment computations to OpenGL. For example, extensions have defined new texture environment
		capabilities (ARB_texture_env_add, ${ARB_texture_env_combine.link}, ${ARB_texture_env_dot3.link}, ARB_texture_env_crossbar), per-fragment depth
		comparisons (${ARB_depth_texture.link}, ${ARB_shadow.link}, ${ARB_shadow_ambient.link}, ${EXT_shadow_funcs.link}), per-fragment lighting
		(${registryLinkTo("EXT", "fragment_lighting")}, ${registryLinkTo("EXT", "light_texture")}), and environment mapped bump mapping
		(${registryLinkTo("ATI", "envmap_bumpmap")}).

		Each such extension adds a small set of relatively inflexible per-fragment computations.

		This inflexibility is in contrast to the typical flexibility provided by the underlying programmable floating point engines (whether micro-coded
		fragment engines, DSPs, or CPUs) that are traditionally used to implement OpenGL's texturing computations. The purpose of this extension is to expose to
		the OpenGL application writer a significant degree of per-fragment programmability for computing fragment parameters.

		For the purposes of discussing this extension, a fragment program is a sequence of floating-point 4-component vector operations that determines how a
		set of program parameters (not specific to an individual fragment) and an input set of per-fragment parameters are transformed to a set of per-fragment
		result parameters.

		The per-fragment computations for standard OpenGL given a particular set of texture and fog application modes (along with any state for extensions
		defining per-fragment computations) is, in essence, a fragment program. However, the sequence of operations is defined implicitly by the current OpenGL
		state settings rather than defined explicitly as a sequence of instructions.

		This extension provides an explicit mechanism for defining fragment program instruction sequences for application-defined fragment programs. In order to
		define such fragment programs, this extension defines a fragment programming model including a floating-point 4-component vector instruction set and a
		relatively large set of floating-point 4-component registers.

		The extension's fragment programming model is designed for efficient hardware implementation and to support a wide variety of fragment programs. By
		design, the entire set of existing fragment programs defined by existing OpenGL per-fragment computation extensions can be implemented using the
		extension's fragment programming model.

		<b>LWJGL</b>: This extension defines many functions and tokens that are also defined in ${ARB_vertex_program.link}. Since these two extensions are often
		used together, the common functionality has only been exposed by ${ARB_vertex_program.link}, to avoid static import conflicts.
		"""

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev, and by the {@code target} parameter of ProgramStringARB, BindProgramARB, ProgramEnvParameter4[df][v]ARB, ProgramLocalParameter4[df][v]ARB,
		GetProgramEnvParameter[df]vARB, GetProgramLocalParameter[df]vARB, GetProgramivARB and GetProgramStringARB.
		""",

		"FRAGMENT_PROGRAM_ARB" _ 0x8804
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetProgramivARB.",

		"PROGRAM_ALU_INSTRUCTIONS_ARB" _ 0x8805,
		"PROGRAM_TEX_INSTRUCTIONS_ARB" _ 0x8806,
		"PROGRAM_TEX_INDIRECTIONS_ARB" _ 0x8807,
		"PROGRAM_NATIVE_ALU_INSTRUCTIONS_ARB" _ 0x8808,
		"PROGRAM_NATIVE_TEX_INSTRUCTIONS_ARB" _ 0x8809,
		"PROGRAM_NATIVE_TEX_INDIRECTIONS_ARB" _ 0x880A,
		"MAX_PROGRAM_ALU_INSTRUCTIONS_ARB" _ 0x880B,
		"MAX_PROGRAM_TEX_INSTRUCTIONS_ARB" _ 0x880C,
		"MAX_PROGRAM_TEX_INDIRECTIONS_ARB" _ 0x880D,
		"MAX_PROGRAM_NATIVE_ALU_INSTRUCTIONS_ARB" _ 0x880E,
		"MAX_PROGRAM_NATIVE_TEX_INSTRUCTIONS_ARB" _ 0x880F,
		"MAX_PROGRAM_NATIVE_TEX_INDIRECTIONS_ARB" _ 0x8810
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"MAX_TEXTURE_COORDS_ARB" _ 0x8871,
		"MAX_TEXTURE_IMAGE_UNITS_ARB" _ 0x8872
	)

}