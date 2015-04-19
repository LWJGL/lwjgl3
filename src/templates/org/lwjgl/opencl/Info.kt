/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl

import org.lwjgl.generator.*
import org.lwjgl.opencl.InfoQueryType.*
import java.util.EnumSet

enum class InfoQueryType {
	BOOLEAN
	INT
	LONG
	POINTER
	STRING_ASCII
	STRING_UTF8
}

fun info() {
	Generator.register(
		CustomClass(OPENCL_PACKAGE, "Info", {
			javaImport(
				"org.lwjgl.PointerBuffer",
				"static org.lwjgl.opencl.CL10.*",
				"static org.lwjgl.opencl.CL12.*",
				"static org.lwjgl.opencl.CL20.*"
			)
			if ( Module.OPENGL.enabled )
				javaImport("static org.lwjgl.opencl.CL10GL.*")

			documentation =
			"""
			This class provides methods that can be used to query information about OpenCL objects. These methods are similar to the corresponding
			{@code clGet&lt;Type&gt;Info} function for each object type, except that only a single value is returned. Which one of these methods should be used
			depends on the type of the information being queried.
			"""
		}) {
			print(
				"""public final class Info {

	private Info() {
	}
"""
			)

			open [data] class ObjectType(
				val source: String,
				val name: String,
				val types: EnumSet<InfoQueryType>,
				val info: String = name,
				val param: String = name.toLowerCase()
			) {
				open fun getQueryImpl(field: String, info: String) =
					"""private static final InfoQuery $field = new InfoQuery() {
		@Override
		protected int get(long pointer, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
			return nclGet${info}Info(pointer, param_name, param_value_size, param_value, param_value_size_ret);
		}
	};"""
				open val args: String get() = "long $param, int param_name"
				open val argsPass: String get() = "$param, param_name"
			}

			class ObjectTypeCustom(
				source: String,
				name: String,
				types: EnumSet<InfoQueryType>,
				info: String = name,
				param: String = name.toLowerCase(),
			    val argName: String,
			    val argType: String,
			    val queryType: String
			): ObjectType(source, name, types, info, param) {
				override fun getQueryImpl(field: String, info: String) =
					"""private static final $queryType $field = new $queryType() {
		@Override
		protected int get(long pointer, $argType arg, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
			return nclGet${info}Info(pointer, arg, param_name, param_value_size, param_value, param_value_size_ret);
		}
	};"""
				override val args: String get() = "long $param, $argType $argName, int param_name"
				override val argsPass: String get() = "$param, $argName, param_name"
			}

			// Defines the info queries we'll generate and which types will be supported for each one.
			// This list should be updated whenever a new OpenCL version is released.
			val objects = arrayListOf(
				ObjectType("CL10", "Platform", EnumSet.of(STRING_ASCII, STRING_UTF8)),
				ObjectType("CL10", "Device", EnumSet.allOf(javaClass<InfoQueryType>())),
				ObjectType("CL10", "Context", EnumSet.of(INT, POINTER)),
				ObjectType("CL10", "Command Queue", EnumSet.of(INT, POINTER), "CommandQueue", "command_queue"),
				ObjectType("CL10", "Mem Object", EnumSet.of(BOOLEAN, INT, LONG, POINTER), "MemObject", "memobj"),
				ObjectType("CL10", "Image", EnumSet.of(INT, POINTER)),
				ObjectType("CL20", "Pipe", EnumSet.of(INT)),
				ObjectType("CL10", "Program", EnumSet.of(INT, POINTER, STRING_ASCII, STRING_UTF8)),
				ObjectTypeCustom(
					"CL10", "Program Build", EnumSet.of(INT, POINTER, STRING_ASCII, STRING_UTF8), "ProgramBuild", "program",
					argName = "device", argType = "long", queryType = "InfoQueryObject"
				),
				ObjectType("CL10", "Kernel", EnumSet.of(INT, POINTER, STRING_ASCII, STRING_UTF8)),
				ObjectTypeCustom(
					"CL10", "Kernel WorkGroup", EnumSet.of(LONG, POINTER), "KernelWorkGroup", "kernel",
				    argName = "device", argType = "long", queryType = "InfoQueryObject"
				),
				ObjectTypeCustom(
					"CL12", "Kernel Arg", EnumSet.of(INT, LONG, STRING_ASCII, STRING_UTF8), "KernelArg", "kernel",
					argName = "arg_indx", argType = "int", queryType = "InfoQueryInt"
				),
				ObjectType("CL10", "Sampler", EnumSet.of(BOOLEAN, INT, POINTER)),
				ObjectType("CL10", "Event", EnumSet.of(INT, POINTER)),
				ObjectType("CL10", "Event Profiling", EnumSet.of(LONG), "EventProfiling", "event")
			)
			if ( Module.OPENGL.enabled )
				objects add ObjectType("CL10GL", "GL Texture", EnumSet.of(INT), "GLTexture", "memobj")

			for ( obj in objects ) {
				val (source, name, types, info) = obj
				val QUERY = name.replace(' ', '_').toUpperCase()
				val link = "{@link $source#clGet${info}Info Get${info}Info}"

				print(
					"""
	// ------------------------------------
	// $name ($source.clGet${info}Info)
	// ------------------------------------

	${obj.getQueryImpl(QUERY, info)}
"""
				)

				if ( types.contains(BOOLEAN) ) {
					print(
						"""
	/** Single boolean value version of: $link */
	public static boolean clGet${info}InfoBoolean(${obj.args}) { return $QUERY.getBoolean(${obj.argsPass}); }
"""
					)
				}

				if ( types.contains(INT) ) {
					print(
						"""
	/** Single int value version of: $link */
	public static int clGet${info}InfoInt(${obj.args}) { return $QUERY.getInt(${obj.argsPass}); }
"""
					)
				}

				if ( types.contains(LONG) ) {
					print(
						"""
	/** Single long value version of: $link */
	public static long clGet${info}InfoLong(${obj.args}) { return $QUERY.getLong(${obj.argsPass}); }
"""
					)
				}

				if ( types.contains(POINTER) ) {
					print(
						"""
	/** Single pointer value version of: $link */
	public static long clGet${info}InfoPointer(${obj.args}) { return $QUERY.getPointer(${obj.argsPass}); }

	/** PointBuffer version of: $link */
	public static int clGet${info}InfoPointers(${obj.args}, PointerBuffer target) { return $QUERY.getPointers(${obj.argsPass}, target); }
"""
					)
				}

				if ( types.contains(STRING_ASCII) ) {
					print(
						"""
	/** String version of: $link */
	public static String clGet${info}InfoStringASCII(${obj.args}) { return $QUERY.getStringASCII(${obj.argsPass}); }

	/** String with explicit length version of: $link*/
	public static String clGet${info}InfoStringASCII(${obj.args}, int param_value_size) { return $QUERY.getStringASCII(${obj.argsPass}, param_value_size); }
"""
					)
				}

				if ( types.contains(STRING_UTF8) ) {
					print(
						"""
	/** UTF-8 string version of: $link */
	public static String clGet${info}InfoStringUTF8(${obj.args}) { return $QUERY.getStringUTF8(${obj.argsPass}); }

	/** UTF-8 string with explicit length version of: $link */
	public static String clGet${info}InfoStringUTF8(${obj.args}, int param_value_size) { return $QUERY.getStringUTF8(${obj.argsPass}, param_value_size); }
"""
					)
				}
			}

			print("\n}")
		}
	)
}