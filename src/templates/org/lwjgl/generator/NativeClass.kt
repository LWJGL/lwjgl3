/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.io.PrintWriter
import java.util.ArrayList
import java.util.TreeSet
import java.util.Collections
import java.util.Comparator

public val INSTANCE: String = "__instance"

public abstract class FunctionProvider {

	private val _classes: MutableList<NativeClass> = ArrayList<NativeClass>()

	protected fun getClasses(
		comparator: Comparator<NativeClass> = object : Comparator<NativeClass> {
			public override fun compare(o1: NativeClass, o2: NativeClass): Int = o1.className.compareTo(o2.className)
			public override fun equals(obj: Any?): Boolean = false
		}
	): List<NativeClass> {
		val classes = ArrayList<NativeClass>(_classes)
		Collections.sort(classes, comparator)
		return classes
	}

	fun addCapabilities(clazz: NativeClass) {
		_classes add clazz
	}

	/** If true, different platforms/devices/contexts return different function addresses. */
	open val isLocal: Boolean = false // GL is global, AL/CL are local

	/** If false, a capabilities instance is not available in the current thread or process. A parameter must provide the instance. */
	open val hasCurrentCapabilities: Boolean = true // GL has thread-local capabilities, AL has process-wide capabilities (unless ALC_EXT_thread_local_context is useD), CL depends on the parameters.

	open fun generateFunctionAddress(writer: PrintWriter, function: Function) {
		val instanceParameter = if ( hasCurrentCapabilities )
			""
		else {
			if ( function has Capabilities.CLASS ) {
				val caps = function[Capabilities.CLASS]
				if ( caps.statement != null )
					writer.println("\t\t${caps.statement};")
				caps.expression
			} else {
				try {
					// Use the first ObjectType parameters
					function.getParams() { it.nativeType is ObjectType }.next().name
				} catch (e: Exception) {
					throw IllegalStateException("Neither a Capabilities modifier nor an object parameter were found on function ${function.name}")
				}
			}
		}

		if ( function has Capabilities.CLASS && function[Capabilities.CLASS].override )
			writer.println("\t\tlong $FUNCTION_ADDRESS = $instanceParameter;")
		else if ( function.hasParam { it has Callback.CLASS } ) {
			writer.println("\t\tFunctions $INSTANCE = getInstance($instanceParameter);")
			writer.println("\t\tlong $FUNCTION_ADDRESS = $INSTANCE.${function.name};")
		} else
			writer.println("\t\tlong $FUNCTION_ADDRESS = getInstance($instanceParameter).${function.name};")
	}

	open fun printFunctionsParams(writer: PrintWriter, nativeClass: NativeClass) {}
	open fun getFunctionAddressCall(function: NativeClassFunction): String = "provider.getFunctionAddress(\"${function.name}\")"

	abstract fun generateFunctionGetters(writer: PrintWriter, nativeClass: NativeClass)
	abstract fun generateCapabilities(writer: PrintWriter)

}

public class NativeClass(
	packageName: String,
	className: String,
	nativeSubPath: String,
	public val templateName: String = className,
	public val prefix: String,
	public val prefixTemplate: String,
	public val postfix: String,
	val functionProvider: FunctionProvider?
): AbstractGeneratorTarget(packageName, className, nativeSubPath) {

	private val constantBlocks = ArrayList<ConstantBlock<out Any>>()

	private val _functions = ArrayList<NativeClassFunction>()
	public val functions: List<NativeClassFunction>
		get() = _functions

	val hasNativeFunctions: Boolean
		get() = !functions.isEmpty() // TODO: Check for 100% alternate without native or reuse

	override fun generateJava(writer: PrintWriter): Unit = writer.generateJavaImpl()
	private fun PrintWriter.generateJavaImpl() {
		print(HEADER)
		println("package $packageName;\n")

		if ( !functions.isEmpty() ) {
			println("import org.lwjgl.*;")
			println("import org.lwjgl.system.*;\n")

			val hasNIO = functions.any { it.returns.isBufferPointer || it.hasParam { it.isBufferPointer } }

			if ( hasNIO )
				println("import java.nio.*;\n")

			println("import static org.lwjgl.system.Checks.*;")
			if ( hasNIO ) {
				println("import static org.lwjgl.system.MemoryUtil.*;")
				if ( functions.any { it.hasParam { it has returnValue || it has SingleValue.CLASS || it has autoSizeResult } } )
					println("import static org.lwjgl.system.APIUtil.*;")
			}
			println()
		}

		if ( documentation != null )
			println(documentation)
		println("public final class $className {\n")

		constantBlocks.forEach {
			it.generate(this)
		}

		println("\tprivate $className() {}\n")

		functions.forEach {
			println("\t// --- [ ${it.name} ] ---\n")
			try {
				it.generateMethods(this)
			} catch (e: Exception) {
				throw RuntimeException("Uncaught exception while generating method: $className.${it.name}", e)
			}
		}

		if ( functionProvider != null && !functions.isEmpty() ) {
			functionProvider.generateFunctionGetters(this, this@NativeClass)
			generateFunctionsClass(functionProvider)
		}

		print("}")
	}

	private fun PrintWriter.generateFunctionsClass(functionProvider: FunctionProvider) {
		println("\t/** The {@link FunctionMap} class for {@code ${className}}. */")
		println("\tpublic static final class Functions implements FunctionMap {\n")

		print("\t\tpublic final long")
		if ( functions.size == 1 ) {
			println(" ${functions[0].name};")
		} else {
			println()
			for ( i in functions.indices ) {
				print("\t\t\t${functions[i].name}")
				println(if ( i == functions.lastIndex ) ";" else ",")
			}
		}

		for ( func in functions ) {
			func.getParams { it has Callback.CLASS }.forEach {
				println("\n\t\tlong ${it[Callback.CLASS].procClass};")
			}
		}

		print("\n\t\tpublic Functions(FunctionProvider${if ( functionProvider.isLocal ) "Local" else ""} provider")
		functionProvider.printFunctionsParams(this, this@NativeClass)
		println(") {")
		functions.forEach {
			println("\t\t\t${it.name} = ${functionProvider.getFunctionAddressCall(it)};")
		}
		println("\t\t}")
		println("\n\t}\n")
	}

	override fun generateNative(writer: PrintWriter): Unit = writer.generateNativeImpl()
	private fun PrintWriter.generateNativeImpl() {
		print(HEADER)
		println("#include <jni.h>")

		nativePreamble.print(this)

		if ( functionProvider != null ) {
			// Generate typedefs for casting the function pointers
			println()
			functions.forEach {
				it.generateFunctionDefinition(this)
			}
		}

		var first = true
		functions.forEach {
			if ( first ) {
				println()
				first = false
			} else
				println("\n")
			it.generateFunction(this)
		}
	}

	// DSL extensions

	fun <T> ConstantType<T>.block(documentation: String, vararg constants: Constant<T>): ConstantBlock<T> {
		val block = ConstantBlock<T>(this@NativeClass, this, documentation.toJavaDoc(), *constants)
		constantBlocks add block
		return block
	}

	fun NativeType.func(name: String, documentation: String, vararg parameters: Parameter) = ReturnValue(this).func(name, documentation, *parameters)
	fun ReturnValue.func(name: String, documentation: String, vararg parameters: Parameter): NativeClassFunction {
		val func = NativeClassFunction(
			returns = this,
			name = if ( prefix.isEmpty() ) name else "${prefix.toLowerCase()}$name",
			documentation = documentation.toJavaDoc(parameters.iterator()),
			nativeClass = this@NativeClass,
			parameters = *parameters
		)

		_functions add func
		return func
	}

}

// DSL extensions

public fun String.nativeClass(
	packageName: String,
	templateName: String = this,
	nativeSubPath: String = "",
	prefix: String = "",
	prefixTemplate: String = prefix,
	postfix: String = "",
	functionProvider: FunctionProvider? = null,
	init: NativeClass.() -> Unit
): NativeClass {
	val ext = NativeClass(packageName, this, nativeSubPath, templateName, prefix, prefixTemplate, postfix, functionProvider)
	ext.init()

	if ( functionProvider != null )
		functionProvider.addCapabilities(ext)

	return ext
}