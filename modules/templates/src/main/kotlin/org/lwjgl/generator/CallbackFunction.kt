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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

""")
		preamble.printJava(this)

		val documentation = super.documentation
		if ( documentation != null )
			print(processDocumentation(documentation).toJavaDoc(indentation = ""))
		print("""
@FunctionalInterface
${access.modifier}interface $className extends Callback.${returns.mapping.jniSignature} {

	/** Creates a {@code $className} instance from the specified function pointer. */
	static $className create(long functionPointer) {
		return functionPointer == NULL ? null : new ${className}Handle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code $className} instance that delegates to the specified {@code $className} instance. */
	static $className create($className sam) {
		return new ${className}Handle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(${
		signature.asSequence().map { it.nativeType.dyncall }.joinToString("")
		})${returns.dyncall}", ${callConvention != "DEFAULT"});
	}

	@Override
	default ${returns.nativeMethodType} callback(long args) {
		""")
		if ( returns.mapping != TypeMapping.VOID )
			print("return ")
		print("""invoke(
${signature.asSequence().map {
			"\t\t\tdcbArg${it.nativeType.argType}(args)${when (it.nativeType.mapping) {
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
	${returns.nativeMethodType} invoke($signatureJava);
""")

		if ( additionalCode.isNotEmpty() ) {
			print("\n\t")
			print(additionalCode.trim())
			println()
		}

		print("""
}

final class ${className}Handle extends Pointer.Default implements $className {

	private final $className delegate;

	${className}Handle(long functionPointer, $className delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public ${returns.nativeMethodType} invoke($signatureJava) {
		${if ( returns.mapping != TypeMapping.VOID ) "return " else ""}delegate.invoke(${signature.asSequence().map { it.name }.joinToString(", ")});
	}

}""")
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
