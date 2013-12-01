/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.io.PrintWriter
import java.util.ArrayList
import java.util.Collections
import java.util.Comparator

public val INSTANCE: String = "__instance"
public val EXT_FLAG: String = ""

public val NULL: String = "{@code NULL}"

public abstract class FunctionProvider(
	packageName: String,
	className: String
): CustomClass(packageName, className) {

	{
		javaImport(
			"org.lwjgl.system.*",
		    "java.util.Set"
		)
	}

	private val _classes: MutableList<NativeClass> = ArrayList<NativeClass>()

	protected fun getClasses(
		comparator: (NativeClass, NativeClass) -> Int = {(o1, o2) -> o1.templateName compareTo o2.templateName }
	): List<NativeClass> {
		val classes = ArrayList<NativeClass>(_classes)
		Collections.sort(classes, object: Comparator<NativeClass> { // TODO: Kotlin bug: Can't use SAM conversion on JDK 8
			suppress("PARAMETER_NAME_CHANGED_ON_OVERRIDE")
			override fun compare(o1: NativeClass, o2: NativeClass): Int = comparator(o1, o2)
		})
		return classes
	}

	fun addCapabilities(clazz: NativeClass) {
		_classes add clazz
	}

	/** If true, different platforms/devices/contexts return different function addresses. */
	open val isLocal: Boolean = false // GL & CL are global, AL is local

	/** If false, a capabilities instance is not available in the current thread or process. A parameter must provide the instance. */
	open val hasCurrentCapabilities: Boolean = true // GL has thread-local capabilities, AL has process-wide capabilities (unless ALC_EXT_thread_local_context is used), CL has the ICD.

	open fun generateFunctionAddress(writer: PrintWriter, function: NativeClassFunction) {
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
			writer.println("\t\t${function.nativeClass.className} $INSTANCE = getInstance($instanceParameter);")
			writer.println("\t\tlong $FUNCTION_ADDRESS = $INSTANCE.${function.addressName};")
		} else
			writer.println("\t\tlong $FUNCTION_ADDRESS = getInstance($instanceParameter).${function.addressName};")
	}

	open fun printFunctionsParams(writer: PrintWriter, nativeClass: NativeClass) {
	}
	open fun getFunctionAddressCall(function: NativeClassFunction): String = "provider.getFunctionAddress(\"${function.name}\")"

	protected fun PrintWriter.printPointers(
		functions: List<NativeClassFunction>,
		printPointer: (func: NativeClassFunction) -> String = { "funcs.${it.simpleName}" }
	) {
		print("\n\t\t\t")

		var lineSize = 12
		for ( (i, func) in functions.withIndices() ) {
			val pointer = printPointer(func)

			lineSize += pointer.size
			if ( 160 <= lineSize ) {
				print("\n\t\t\t")
				lineSize = 12 + pointer.size
			}

			print(pointer)
			if ( i < functions.lastIndex ) {
				print(", ")
				lineSize += 2
			}
		}

		print("\n\t\t")
	}

	abstract fun PrintWriter.generateFunctionGetters(nativeClass: NativeClass)

}
// TODO: Remove if KT-457 or KT-1183 are fixed.
private fun FunctionProvider.generateFunctionGetters(writer: PrintWriter, nativeClass: NativeClass): Unit = writer.generateFunctionGetters(nativeClass)

public class NativeClass(
	packageName: String,
	className: String,
	nativeSubPath: String,
	public val templateName: String = className,
	public val prefix: String,
	public val prefixMethod: String,
	public val prefixConstant: String,
	public val prefixTemplate: String,
	public val postfix: String,
	val functionProvider: FunctionProvider?
): GeneratorTargetNative(packageName, className, nativeSubPath) {

	private val constantBlocks = ArrayList<ConstantBlock<out Any>>()

	private val _functions = ArrayList<NativeClassFunction>()
	public val functions: List<NativeClassFunction>
		get() = _functions

	val hasBody: Boolean
		get() = !constantBlocks.isEmpty() || hasNativeFunctions

	val hasNativeFunctions: Boolean
		get() = !functions.isEmpty()

	override fun PrintWriter.generateJava() {
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

					if ( it.hasParam { it has returnValue || it has SingleValue || it.isAutoSizeResultOut || it has PointerArray } )
						needsAPIUtil = true
				}

				if ( needsPointer )
					println("import static org.lwjgl.Pointer.*;")
				println("import static org.lwjgl.system.MemoryUtil.*;")
				if ( needsAPIUtil )
					println("import static org.lwjgl.system.APIUtil.*;")
			}
			println()
		}

		preamble.printJava(this)

		if ( documentation != null )
			println(documentation)
		println("${access.modifier}final class $className {\n")

		constantBlocks.forEach {
			it.generate(this)
		}

		if ( functionProvider != null && !functions.isEmpty() ) {
			generateFunctionAddresses(functionProvider)
			functionProvider.generateFunctionGetters(this, this@NativeClass)
		} else
			println("\tprivate $className() {}\n")

		functions.forEach {
			println("\t// --- [ ${it.name} ] ---\n")
			try {
				it.generateMethods(this)
			} catch (e: Exception) {
				throw RuntimeException("Uncaught exception while generating method: $className.${it.name}", e)
			}
		}

		print("}")
	}

	private fun PrintWriter.generateFunctionAddresses(functionProvider: FunctionProvider) {
		println("\t/** Function address. */")
		println("\t@JavadocExclude")
		print("\tpublic final long")
		if ( functions.size == 1 ) {
			println(" ${functions[0].addressName};")
		} else {
			println()
			for ( i in functions.indices ) {
				print("\t\t${functions[i].addressName}")
				println(if ( i == functions.lastIndex ) ";" else ",")
			}
		}

		for ( func in functions ) {
			func.getParams { it has Callback }.forEach {
				val cb = it[Callback]
				if ( cb.storeInFunctions )
					println("\n\tlong ref${cb.procClass};")
			}
		}

		println("\n\t@JavadocExclude")
		print("\t${access.modifier}$className(FunctionProvider${if ( functionProvider.isLocal ) "Local" else ""} provider")
		functionProvider.printFunctionsParams(this, this@NativeClass)
		println(") {")
		functions.forEach {
			println("\t\t${it.addressName} = ${functionProvider.getFunctionAddressCall(it)};")
		}
		println("\t}\n")
	}

	override fun PrintWriter.generateNative() {
		print(HEADER)
		println("#include \"common_tools.h\"")

		preamble.printNative(this)

		if ( functionProvider != null ) {
			// Generate typedefs for casting the function pointers
			println()
			functions.forEach {
				it.generateFunctionDefinition(this)
			}
		}

		println("\nEXTERN_C_ENTER")

		functions.forEach {
			println()
			it.generateFunction(this)
		}

		println("\nEXTERN_C_EXIT")
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
			simpleName = name,
			documentation = documentation.toJavaDoc(parameters.iterator(), returnDoc),
			nativeClass = this@NativeClass,
			parameters = *parameters
		)

		_functions add func
		return func
	}

	// Javadoc DSL extensions

	fun String.link(name: String) = this.link(name, if ( name.endsWith(')') ) prefixMethod else prefixConstant)
	val String.link: String
		get() {
			val hash = this.indexOf('#')
			return if ( hash == -1 ) "".link(this) else this.substring(0, hash).link(this.substring(hash + 1))
		}

	val String.links: ConstantBlock.Links
		get() = this.toConstantLinks(prefixConstant)

	fun ConstantBlock.Links.plus(links: String) = this + links.links
	fun String.plus(links: ConstantBlock.Links) = this.links + links // TODO: Kotlin bug, this doesn't take priority over the native one. See GL20#glGetVertexAttribiv

	fun NativeType.IN(name: String, javadoc: String, links: String) = IN(name, javadoc, links.links)

}

// DSL extensions

public fun String.nativeClass(
	packageName: String,
	templateName: String = this,
	nativeSubPath: String = "",
	prefix: String = "",
	prefixMethod: String = prefix.toLowerCase(),
	prefixConstant: String = if ( prefix.isEmpty() || prefix.endsWith('_') ) prefix else "${prefix}_",
	prefixTemplate: String = prefix,
	postfix: String = "",
	functionProvider: FunctionProvider? = null,
	init: (NativeClass.() -> Unit)? = null
): NativeClass {
	val ext = NativeClass(packageName, this, nativeSubPath, templateName, prefix, prefixMethod, prefixConstant, prefixTemplate, postfix, functionProvider)
	if ( init != null )
		ext.init()

	if ( functionProvider != null )
		functionProvider.addCapabilities(ext)

	return ext
}