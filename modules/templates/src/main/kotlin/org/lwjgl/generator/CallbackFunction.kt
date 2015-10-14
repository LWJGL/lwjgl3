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
): GeneratorTarget(packageName, className) {

	var functionDoc: String = ""
	var additionalCode: String = ""

	private var callConvention = "DEFAULT"
	fun useSystemCallConvention() {
		callConvention = "SYSTEM"
	}

	private val signatureJava: String = signature.asSequence().map {
		"${it.nativeMethodType} ${it.name}"
	}.join(", ")

	val NativeType.ffi: String
		get() = when ( this ) {
			is PointerType   -> "ffi_type_pointer"
			is PrimitiveType -> when ( mapping ) {
				PrimitiveMapping.POINTER -> "ffi_type_pointer"
				PrimitiveMapping.FLOAT   -> "ffi_type_float"
				PrimitiveMapping.DOUBLE  -> "ffi_type_double"
				else                     -> "ffi_type_${if ( this !is IntegerType || this.unsigned ) "u" else "s" }int${(mapping as PrimitiveMapping).bytes * 8}"
			}
			else             -> if ( mapping === TypeMapping.VOID) "ffi_type_void" else throw IllegalArgumentException("Unsupported callback native type: $this")
		}

	val NativeType.callbackType: String
		get() = when ( this ) {
			is PointerType   -> "Ptr"
			is PrimitiveType -> when ( mapping ) {
				PrimitiveMapping.POINTER -> "Ptr"
				else                     -> mapping.javaMethodType.simpleName.upperCaseFirst
			}
			else             -> if ( mapping === TypeMapping.VOID) "Void" else throw IllegalArgumentException("Unsupported callback return type: $this")
		}

	val NativeType.memType: String
		get() = if ( this is PointerType || mapping === PrimitiveMapping.POINTER)
			"Address"
		else
			(mapping as PrimitiveMapping).javaMethodType.simpleName.upperCaseFirst

	override fun PrintWriter.generateJava() {
		print(HEADER)
		println("package $packageName;\n")

		print("""import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

""")
		preamble.printJava(this)

		val documentation = super.documentation
		if ( documentation != null )
			print(processDocumentation(documentation).toJavaDoc(indentation = ""))
		print("""
${access.modifier}abstract class $className extends Closure.${returns.callbackType} {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(${signature.size()});

	static {
		prepareCIF(
			"$className",
			CALL_CONVENTION_$callConvention,
			CIF, ${returns.ffi},
			ARGS, ${signature.asSequence().map { it.nativeType.ffi }.join()}
		);
	}

	protected $className() {
		super(CIF);
	}

	/**
	 * Will be called from a libffi closure invocation. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected ${returns.nativeMethodType.simpleName} callback(long args) {
		""")
		if ( returns.mapping != TypeMapping.VOID )
			print("return ")
		print("""invoke(
${signature.asSequence().withIndex().map {
			"\t\t\tmemGet${it.value.nativeType.memType}(memGetAddress(POINTER_SIZE * ${it.index} + args))"
		}.join(",\n")}
		);
	}

""")
		print(functionDoc)
		print("""
	public abstract ${returns.nativeMethodType.simpleName} invoke($signatureJava);

	/** A functional interface for {@link $className}. */
	public interface SAM {
		${returns.nativeMethodType.simpleName} invoke($signatureJava);
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
	public static $className create(final SAM sam) {
		return new $className() {
			@Override
			public ${returns.nativeMethodType.simpleName} invoke($signatureJava) {
				""")
		if ( returns.mapping != TypeMapping.VOID )
			print("return ")
		print("""sam.invoke(${signature.asSequence().map { it.name }.join(", ")});
			}
		};
	}
""")
		if ( additionalCode.isNotEmpty() )
			print(additionalCode)

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
	callback.functionDoc = callback.toJavaDoc(functionDoc, signature.asSequence(), returns, returnDoc, since)
	Generator.register(callback)
	return CallbackType(callback, this)
}
