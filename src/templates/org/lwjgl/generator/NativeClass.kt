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

	open fun generateFunctionAddress(writer: PrintWriter, function: Function) {
		writer.println("\t\tlong $FUNCTION_ADDRESS = getInstance().${function.name};")
	}

	abstract fun generateFunctionGetters(writer: PrintWriter, nativeClass: NativeClass)
	abstract fun generateCapabilities(writer: PrintWriter)

}

public class NativeClass(
	packageName: String,
	className: String,
	nativeSubPath: String,
	public val templateName: String = className,
	public val prefix: String,
	public val postfix: String,
	val functionProvider: FunctionProvider?
): AbstractGeneratorTarget(packageName, className, nativeSubPath) {

	private val constantBlocks = ArrayList<ConstantBlock<out Any>>();
	private val functions = ArrayList<NativeClassFunction>();

	val hasNativeFunctions: Boolean
		get() = !functions.isEmpty() // TODO: Check for 100% alternate without native or reuse

	override fun generateJava(writer: PrintWriter): Unit = writer.generateJavaImpl()
	private fun PrintWriter.generateJavaImpl() {
		print(HEADER)
		println("package $packageName;\n")

		println("import org.lwjgl.*;")
		println("import org.lwjgl.system.*;\n")

		println("import java.nio.*;\n")

		println("import static org.lwjgl.system.APIUtil.*;")
		println("import static org.lwjgl.system.Checks.*;")
		println("import static org.lwjgl.system.MemoryUtil.*;\n")

		if ( documentation != null )
			println(documentation)
		println("public final class $className {\n")

		constantBlocks.forEach {
			it.generate(this)
		}

		println("\tprivate $className() {}\n")

		functions.forEach {
			println("\t// --- [ ${it.name} ] ---\n")
			it.generateMethods(this)
		}

		if ( functionProvider != null && !functions.isEmpty() ) {
			functionProvider.generateFunctionGetters(this, this@NativeClass)
			generateFunctionsClass()
		}

		print("}")
	}

	private fun PrintWriter.generateFunctionsClass() {
		println("\t/** The {@link FunctionMap} class for {@code ${className}}. */")
		println("\tpublic static final class Functions implements FunctionMap {\n")

		var funcIndent: String

		print("\t\tpublic final long")
		if ( functions.size == 1 ) {
			funcIndent = " "
		} else {
			println()
			funcIndent = "\t\t\t"
		}

		for ( i in functions.indices ) {
			print("$funcIndent${functions[i].name}")
			println(if ( i == functions.lastIndex ) ";" else ",")
		}

		println("\n\t\tpublic Functions(final FunctionProvider provider) {")
		functions.forEach {
			println("\t\t\t${it.name} = provider.getFunctionAddress(\"${it.name}\");")
		}
		println("\t\t}")

		println("\n\t\tpublic boolean isSupported() {")
		print("\t\t\treturn")
		if ( 1 < functions.size ) {
			println()
			funcIndent = "\t\t\t\t"
		}

		for ( i in functions.indices ) {
			print("$funcIndent${functions[i].name} != 0L")
			println(if ( i == functions.lastIndex ) ";" else " &&")
		}
		println("\t\t}")

		println("\n\t}\n")
	}

	override fun generateNative(writer: PrintWriter): Unit = writer.generateNativeImpl()
	private fun PrintWriter.generateNativeImpl() {
		print(HEADER)
		println("#include <jni.h>")
		nativeImports.forEach {
			println("#include $it")
		}

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

	fun NativeType.func(name: String, documentation: String, vararg parameters: Parameter) = addFunction(ReturnValue(this), name, documentation.toJavaDoc(*parameters), *parameters)

	fun ReturnValue.func(name: String, documentation: String, vararg parameters: Parameter) = addFunction(this, name, documentation.toJavaDoc(*parameters), *parameters)

	private fun addFunction(returns: ReturnValue, name: String, documentation: String, vararg parameters: Parameter): NativeClassFunction {
		val func = NativeClassFunction(
			returns = returns,
			name = if ( prefix.isEmpty() ) name else "${prefix.toLowerCase()}$name",
			documentation = documentation,
			nativeClass = this@NativeClass,
			parameters = *parameters
		)

		functions add func
		return func
	}

}

// DSL extensions

public fun String.nativeClass(
	packageName: String,
	templateName: String = this,
	nativeSubPath: String = "",
	prefix: String = "",
	postfix: String = "",
	functionProvider: FunctionProvider? = null,
	init: NativeClass.() -> Unit
): NativeClass {
	val ext = NativeClass(packageName, this, nativeSubPath, templateName, prefix, postfix, functionProvider)
	ext.init()
	return ext
}