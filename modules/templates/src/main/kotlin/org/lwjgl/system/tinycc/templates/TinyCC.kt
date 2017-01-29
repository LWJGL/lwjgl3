/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.tinycc.templates

import org.lwjgl.generator.*
import org.lwjgl.system.tinycc.*

val TinyCC = "TinyCC".nativeClass(TINYCC_PACKAGE, prefix = "TCC", prefixMethod = "tcc_", binding = TINYCC_BINDING) {
	documentation = "Bindings to {@code libtcc}."

	EnumConstant(
		"Output types.",

		"OUTPUT_MEMORY".enum("output will be run in memory", "1"),
		"OUTPUT_EXE".enum("executable file", "2"),
		"OUTPUT_DLL".enum("dynamic library", "3"),
		"OUTPUT_OBJ".enum("object file", "4"),
		"OUTPUT_PREPROCESS".enum("only preprocess (used internally)", "5")
	)

	LongConstant(
		"May be passed to the {@code ptr} argument of the #relocate() function.",

		"RELOCATE_AUTO".."1"
	)

	TCCState_p(
		"tcc_new",
		"Creates a new TCC compilation context.",

		noPrefix = true
	)

	val context = TCCState_p.IN("s", "")

	void(
		"delete",
		"Frees a TCC compilation context.",

		context
	)

	void(
		"set_lib_path",
		"Sets {@code CONFIG_TCCDIR} at runtime.",

		context,
		const..charASCII_p.IN("path", "")
	)

	void(
		"set_error_func",
		"Sets error/warning display callback.",

		context,
		nullable..opaque_p.IN("error_opaque", ""),
		nullable..error_func.IN("error_func", "")
	)

	int(
		"set_options",
		"Set options as from command line (multiple supported).",

		context,
		const..charASCII_p.IN("str", "")
	)

	int(
		"add_include_path",
		"Adds include path.",

		context,
		const..charASCII_p.IN("pathname", "")
	)

	int(
		"add_sysinclude_path",
		"Adds in system include path.",

		context,
		const..charASCII_p.IN("pathname", "")
	)

	void(
		"define_symbol",
		"Defines preprocessor symbol {@code sym}. Can put optional value.",

		context,
		const..charASCII_p.IN("sym", ""),
		nullable..const..charASCII_p.IN("value", "")
	)

	void(
		"undefine_symbol",
		"Undefines preprocess symbol {@code sym}.",

		context,
		const..charASCII_p.IN("sym", "")
	)

	int(
		"add_file",
		"Asdd a file (C file, dll, object, library, ld script).",

		context,
		const..charASCII_p.IN("filename", ""),

		returnDoc = "-1 if error"
	)

	int(
		"compile_string",
		"Compiles a string containing a C source.",

		context,
		const..charASCII_p.IN("buf", ""),

		returnDoc = "-1 if error"
	)

	int(
		"set_output_type",
		"Sets output type. MUST BE CALLED before any compilation.",

		context,
		int.IN("output_type", "")
	)

	int(
		"add_library_path",
		"Equivalent to -Lpath option.",

		context,
		const..charASCII_p.IN("pathname", "")
	)

	int(
		"add_library",
		"The library name is the same as the argument of the '-l' option.",

		context,
		const..charASCII_p.IN("libraryname", "")
	)

	int(
		"add_symbol",
		"Adds a symbol to the compiled program.",

		context,
		const..charASCII_p.IN("name", ""),
		const..opaque_p.IN("val", "")
	)

	int(
		"output_file",
		"Outputs an executable, library or object file. DO NOT call #relocate() before.",

		context,
		const..charASCII_p.IN("filename", "")
	)

	int(
		"run",
		"Links and runs main() function and return its value. DO NOT call #relocate() before.",

		context,
		AutoSize("argv")..int.IN("argc", ""),
		char_pp.IN("argv", "")
	)

	int(
		"relocate",
		"Does all relocations (needed before using #get_symbol()).",

		context,
		nullable..opaque_p.IN(
			"ptr",
			"""
			possible values:
			${ul(
				"#RELOCATE_AUTO : Allocate and manage memory internally",
				"#NULL          : return required memory size for the step below",
				"memory address : copy code to memory passed by the caller"
			)}
			"""
		),

		returnDoc = "-1 if error"
	)

	opaque_p(
		"get_symbol",
		"Returns symbol value or #NULL if not found.",

		context,
		const..charASCII_p.IN("name", "")
	)
}