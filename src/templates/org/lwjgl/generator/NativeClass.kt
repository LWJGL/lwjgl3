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
import java.util.HashMap

public val INSTANCE: String = "__instance"
public val EXT_FLAG: String = ""

public val NULL: String = "{@code NULL}"

public abstract class FunctionProvider {

	private val _classes: MutableList<NativeClass> = ArrayList<NativeClass>()

	protected fun getClasses(
		comparator: Comparator<NativeClass> = object : Comparator<NativeClass> {
			public override fun compare(o1: NativeClass, o2: NativeClass): Int = o1.templateName.compareTo(o2.templateName)
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
	open val hasCurrentCapabilities: Boolean = true // GL has thread-local capabilities, AL has process-wide capabilities (unless ALC_EXT_thread_local_context is used), CL depends on the parameters.

	open fun generateFunctionAddress(writer: PrintWriter, function: Function) {
		val instanceParameter = if ( hasCurrentCapabilities )
			""
		else if ( function has Capabilities ) {
			val caps = function[Capabilities]
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

		if ( function has Capabilities && function[Capabilities].override ) {
			if ( !instanceParameter.equals(FUNCTION_ADDRESS) ) // Skip if we have an explicit FUNCTION_ADDRESS parameter.
				writer.println("\t\tlong $FUNCTION_ADDRESS = $instanceParameter;")
		} else if ( function.hasParam { it has Callback && it[Callback].storeInFunctions } ) {
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
	public val prefixMethod: String,
	public val prefixTemplate: String,
	public val postfix: String,
	val functionProvider: FunctionProvider?
): GeneratorTarget(packageName, className, nativeSubPath) {

	private val constantBlocks = ArrayList<ConstantBlock<out Any>>()

	private val _functions = ArrayList<NativeClassFunction>()
	public val functions: List<NativeClassFunction>
		get() = _functions

	val hasBody: Boolean
		get() = !constantBlocks.isEmpty() || hasNativeFunctions

	val hasNativeFunctions: Boolean
		get() = !functions.isEmpty()

	private val javaDocs = HashMap<String, String>()

	fun setJavaDoc(ref: String, javaDoc: String) {
		javaDocs[ref] = javaDoc
	}
	fun getJavaDoc(ref: String): String = javaDocs[ref]!!

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
				var needsPointer = false
				var needsAPIUtil = false
				functions forEach {
					if ( it.hasParam { it.nativeType.mapping == PointerMapping.DATA_POINTER } )
						needsPointer = true

					if ( it.hasParam { it has returnValue || it has SingleValue || it has autoSizeResult || it has PointerArray } )
						needsAPIUtil = true
				}

				if ( needsPointer )
					println("import static org.lwjgl.Pointer.*;")
				println("import static org.lwjgl.system.MemoryUtil.*;")
				if ( needsAPIUtil )
					println("import static org.lwjgl.system.APIUtil.*;")
			}
			println()
			preamble.printJava(this)
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
			func.getParams { it has Callback }.forEach {
				val cb = it[Callback]
				if ( cb.storeInFunctions )
					println("\n\t\tlong ${cb.procClass};")
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

		preamble.printNative(this)

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

	fun NativeType.func(name: String, documentation: String, vararg parameters: Parameter, returnDoc: String = "") = ReturnValue(this).func(name, documentation, *parameters, returnDoc = returnDoc)
	fun ReturnValue.func(name: String, documentation: String, vararg parameters: Parameter, returnDoc: String = ""): NativeClassFunction {
		val func = NativeClassFunction(
			returns = this,
			name = "$prefixMethod$name",
			documentation = documentation.toJavaDoc(parameters.iterator(), returnDoc),
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
	prefixMethod: String = prefix.toLowerCase(),
	prefixTemplate: String = prefix,
	postfix: String = "",
	functionProvider: FunctionProvider? = null,
	init: (NativeClass.() -> Unit)? = null
): NativeClass {
	val ext = NativeClass(packageName, this, nativeSubPath, templateName, prefix, prefixMethod, prefixTemplate, postfix, functionProvider)
	if ( init != null )
		ext.init()

	if ( functionProvider != null )
		functionProvider.addCapabilities(ext)

	return ext
}