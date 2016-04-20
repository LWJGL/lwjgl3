/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.io.PrintWriter

class CallbackFunction(
	packageName: String,
	className: String,
	val returns: NativeType,
	vararg val signature: Parameter
) : GeneratorTarget(packageName, className) {

	var functionDoc: (CallbackFunction) -> String = { "" }
	var additionalCode: String = ""

	private var callConvention = "DEFAULT"
	fun useSystemCallConvention() {
		callConvention = "SYSTEM"
	}

	private val signatureJava: String = signature.asSequence().map {
		"${if ( it.nativeType.mapping == PrimitiveMapping.BOOLEAN4 ) "boolean" else it.nativeType.nativeMethodType} ${it.name}"
	}.joinToString(", ")

	val NativeType.dyncall: Char
		get() = when ( this ) {
			is PointerType   -> 'p'
			is PrimitiveType -> when (mapping) {
				PrimitiveMapping.BOOLEAN -> 'B'
				PrimitiveMapping.BYTE    -> 'c'
				PrimitiveMapping.SHORT   -> 's'
				PrimitiveMapping.BOOLEAN4,
				PrimitiveMapping.INT     -> 'i'
				PrimitiveMapping.LONG    -> 'l'
				PrimitiveMapping.POINTER -> 'p'
				PrimitiveMapping.FLOAT   -> 'f'
				PrimitiveMapping.DOUBLE  -> 'd'
				else                     -> throw IllegalArgumentException("Unsupported callback native type: $this")
			}
			else             -> if (mapping === TypeMapping.VOID) 'v' else throw IllegalArgumentException("Unsupported callback native type: $this")
		}

	val NativeType.argType: String
		get() = if ( this is PointerType || mapping === PrimitiveMapping.POINTER )
			"Pointer"
		else if (mapping == PrimitiveMapping.BOOLEAN)
			"Bool"
		else
			(mapping as PrimitiveMapping).javaMethodType.simpleName.upperCaseFirst

	override fun PrintWriter.generateJava() {
		print(HEADER)
		println("package $packageName;\n")

		print("""import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

""")
		preamble.printJava(this)

		val documentation = super.documentation
		if ( documentation != null )
			print(processDocumentation(documentation).toJavaDoc(indentation = ""))
		print("""
${access.modifier}abstract class $className extends Callback.${returns.mapping.jniSignature} {

	private static final long CLASSPATH = apiCallbackText("$packageName.$className");

	protected $className() {
		super(CALL_CONVENTION_$callConvention + "(${signature.asSequence().map { it.nativeType.dyncall }.joinToString("")})${returns.dyncall}", CLASSPATH);
	}

	/**
	 * Will be called from native code. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected ${returns.nativeMethodType} callback(long args) {
		""")
		if ( returns.mapping != TypeMapping.VOID )
			print("return ")
		print("""invoke(
${signature.asSequence().withIndex().map {
			"\t\t\tdcbArg${it.value.nativeType.argType}(args)${when ( it.value.nativeType.mapping ) {
				PrimitiveMapping.BOOLEAN,
				PrimitiveMapping.BOOLEAN4 -> " != 0"
				else                      -> ""
			}}"
		}.joinToString(",\n")}
		);
	}

""")
		print(functionDoc(this@CallbackFunction))
		print("""
	public abstract ${returns.nativeMethodType} invoke($signatureJava);

	/** A functional interface for {@link $className}. */
	public interface SAM {
		${returns.nativeMethodType} invoke($signatureJava);
	}
""")

		print("""
	/**
	 * Creates a {@link $className} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link $className} instance
	 */
	public static $className create(SAM sam) {
		return new $className() {
			@Override
			public ${returns.nativeMethodType} invoke($signatureJava) {
				""")
		if ( returns.mapping != TypeMapping.VOID )
			print("return ")
		print("""sam.invoke(${signature.asSequence().map { it.name }.joinToString(", ")});
			}
		};
	}
""")
		if ( additionalCode.isNotEmpty() ) {
			print("\n\t")
			print(additionalCode.trim())
			println()
		}

		print("\n}")
	}
}

fun String.callback(
	packageName: String,
	returns: NativeType,
	className: String,
	functionDoc: String,
	vararg signature: Parameter,
	returnDoc: String = "",
	since: String = "",
	init: (CallbackFunction.() -> Unit)? = null
): CallbackType {
	val callback = CallbackFunction(packageName, className, returns, *signature)
	if ( init != null )
		callback.init()
	callback.functionDoc = { it -> it.toJavaDoc(it.processDocumentation(functionDoc), it.signature.asSequence(), it.returns, returnDoc, since) }
	Generator.register(callback)
	return CallbackType(callback, this)
}
