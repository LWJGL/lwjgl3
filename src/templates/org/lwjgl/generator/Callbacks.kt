/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.io.PrintWriter
import java.util.ArrayList

class CallbackRegistry {

	class object {
		val INSTANCE = CallbackRegistry()

		fun generate() {
			INSTANCE.callbacks.forEach {
				try {
					generate(it)
				} catch (e: Exception) {
					throw RuntimeException("Uncaught exception while generating callback function: ${it.packageName}.${it.name}", e)
				}
			}
		}

		fun add(callback: CallbackFunction) {
			INSTANCE.callbacks add callback
		}
	}

	private val callbacks = ArrayList<CallbackFunction>()

}

public class CallbackFunction(
	returns: ReturnValue,
	name: String,
	documentation: String,
	parameters: Array<Parameter>,
	override val packageName: String,
	val convention: String,
	val async: Boolean
): Function(returns, name, documentation, *parameters), GeneratorTarget {

	class object {
		private val EMPTY_NATIVE_IMPORTS: MutableList<String> = ArrayList(0)
	}

	override val className: String = name
	override val nativeSubPath: String = ""

	private var _nativeImports = EMPTY_NATIVE_IMPORTS;
	protected override val nativeImports: List<String>
		get() = _nativeImports

	override fun generateJava(writer: PrintWriter): Unit = writer.generateJavaImpl()
	private fun PrintWriter.generateJavaImpl() {
		print(HEADER)
		println("package $packageName;\n")

		println("import java.lang.reflect.Method;\n")

		println("import static org.lwjgl.system.APIUtil.*;\n")

		println(documentation.toJavaDoc(indentation = ""))

		println("public abstract class $className {\n")

		// Step 1: Generate callback function pointer
		print("\tpublic static final long CALLBACK = setup(apiCallbackMethod($className.class")
		parameters.values()
			.filter { !it.has(CALLBACK_DATA) }
			.forEach { print(", ${it.nativeMethodType}.class") }

		println("));\n")

		// Step 2: Generate callback setup method
		println("\tprivate static native long setup(Method callback);\n")

		// Step 3: Generate callback method
		println("The callback method.".toJavaDoc(parameters.values()))
		print("\tpublic abstract int invoke(")
		printList(parameters) {
			if ( it has CALLBACK_DATA )
				null
			else
				"${it.nativeType.nativeMethodType.getSimpleName()} ${it.name}"
		}
		println(");\n")

		print("}")
	}

	override fun generateNative(writer: PrintWriter): Unit = writer.generateNativeImpl()
	private fun PrintWriter.generateNativeImpl() {
		print(HEADER)
		println("#include \"common_tools.h\"")
		nativeImports.forEach {
			println("#include $it")
		}

		println("\nstatic jmethodID ${className}Invoke;\n")

		print("static ${returns.nativeMethodType} CALLBACK $className(")
		printList(parameters) {
			it.asNativeFunctionParam
		}
		println(") {")

		if ( async )
			println("\tJNIEnv *env = attachCurrentThread();")
		else
			println("\tJNIEnv *env = getThreadEnv();")

		print('\t')
		if ( !returns.isVoid ) {
			val retTypeCast = if ( returns.nativeType is PointerType )
				"(${returns.nativeMethodType})(intptr_t)"
			else
				"(${returns.nativeMethodType})"

			print(
				if ( async )
					"${returns.nativeMethodType} __result = $retTypeCast"
				else
					"return $retTypeCast"
			)
		}
		print("(*env)->Call")

		val methodType: String
		methodType = when ( returns.jniFunctionType ) {
			"void" -> "Void"
			"jobject" -> "Object"
			"jboolean" -> "Boolean"
			"jbyte" -> "Byte"
			"jchar" -> "Char"
			"jshort" -> "Short"
			"jint" -> "Int"
			"jlong" -> "Long"
			"jfloat" -> "Float"
			"jdouble" -> "Double"
			else -> throw UnsupportedOperationException("Unsupported callback function return type: ${returns.jniFunctionType}")
		}

		val userDataParam = parameters.values().filter {
			it.has(CALLBACK_DATA)
		}.first()

		print("${methodType}Method(env, (jobject)${userDataParam.name}, ${className}Invoke")
		if ( parameters.values().size > 1 ) {
			parameters.values().filter {
				!it.has(CALLBACK_DATA)
			}.forEach {
				print(", ")
				if ( it.nativeType is PointerType ) {
					print("(jlong)(intptr_t)")
				}
				print(it.name)
			}
		}
		println(");")

		if ( async ) {
			println("\tdetachCurrentThread();")
			if ( !returns.isVoid )
				println("\treturn __result;")
		}
		println("}\n")

		println("JNIEXPORT jlong JNICALL Java_${nativeFileName}_setup(JNIEnv *env, jclass clazz, jobject method) {")
		println("\t${className}Invoke = (*env)->FromReflectedMethod(env, method);")
		println("\treturn (jlong)(intptr_t)&$className;")
		print("}")
	}

	fun nativeImport(vararg files: String): CallbackFunction {
		_nativeImports = ArrayList(files.size)

		files.forEach {
			if ( it.startsWith('<') )
				_nativeImports add it
			else
				_nativeImports add "\"$it\""
		}

		return this
	}

}