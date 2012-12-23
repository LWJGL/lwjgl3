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

	protected val classes: List<NativeClass>
		get() {
			// Sort by className, else we depend on the Kotlin compiler generating
			// namespace methods in consistent order (which it does not atm).
			Collections.sort(_classes, object : Comparator<NativeClass> {
				public override fun compare(o1: NativeClass, o2: NativeClass): Int = o1.className.compareTo(o2.className)
				public override fun equals(obj: Any?): Boolean = false
			})
			return _classes
		}

	fun addCapabilities(clazz: NativeClass) {
		_classes add clazz
	}

	open fun generateFunctionAddress(writer: PrintWriter, function: Function) {
		writer.println("\t\tlong $FUNCTION_ADDRESS = Functions.getInstance().${function.name};")
	}

	abstract fun generateCapabilities(writer: PrintWriter)

}

public class NativeClass(
	packageName: String,
	className: String,
	public val templateName: String = className,
	public val prefix: String = "",
	public val postfix: String = "",
	val functionProvider: FunctionProvider?
): AbstractGeneratorTarget(packageName, className) {

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

		if ( functionProvider != null )
			generateFunctionsClass()

		print("}")
	}

	private fun PrintWriter.generateFunctionsClass() {
		println("\tpublic static final class Functions {\n")

		if ( !functions.isEmpty() ) {
			println("\t\tpublic final long")
			for ( i in functions.indices ) {
				print("\t\t\t${functions[i].name}")
				if ( i == functions.lastIndex )
					println(";")
				else
					println(",")
			}
		}

		println("\n\t\tpublic Functions(final FunctionProvider provider) {")
		functions.forEach {
			println("\t\t\t${it.name} = provider.getFunctionAddress(\"${it.name}\");")
		}
		println("\t\t}")

		println("\n\t\tpublic static Functions getInstance() {")
		println("\t\t\treturn GLContext.getCapabilities().funcs${className};")
		println("\t\t}")

		/*public fun isSupported(): Boolean {
			return glCopyBufferSubData != 0
		}*/

		println("\n\t\tpublic boolean isSupported() {")
		println("\t\t\treturn")
		for ( i in functions.indices ) {
			print("\t\t\t\t${functions[i].name} != 0L")
			if ( i == functions.lastIndex )
				println(";")
			else
				println(" &&")
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
	prefix: String = "",
	postfix: String = "",
	functionProvider: FunctionProvider? = null,
	init: NativeClass.() -> Unit
): NativeClass {
	val ext = NativeClass(packageName, this, templateName, prefix, postfix, functionProvider)
	ext.init()
	return ext
}