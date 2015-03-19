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

	val nativeType: CallbackType get() = CallbackType(this)

	var functionDoc: String = ""

	private var callConventionSystem: Boolean = false
	val CALL_CONVENTION_SYSTEM: Boolean
		get() {
			// warning: getter with side-effects
			$callConventionSystem = true
			return true
		}

	private val signatureJava: String = signature.sequence().map {
		"${it.nativeMethodType} ${it.name}"
	}.join(", ")

	val NativeType.ffi: String
		get() = when ( this ) {
			is PointerType   -> "ffi_type_pointer"
			is PrimitiveType -> when ( mapping ) {
				PrimitiveMapping.PTR    -> "ffi_type_pointer"
				PrimitiveMapping.FLOAT  -> "ffi_type_float"
				PrimitiveMapping.DOUBLE -> "ffi_type_double"
				else                    -> "ffi_type_${if ( (this as IntegerType).unsigned ) "u" else "s" }int${(mapping as PrimitiveMapping).bytes * 8}"
			}
			else             -> if ( mapping === TypeMapping.VOID) "ffi_type_void" else throw IllegalArgumentException("Unsupported callback native type: $this")
		}

	val NativeType.callbackType: String
		get() = when ( this ) {
			is PointerType   -> "Ptr"
			is PrimitiveType -> when ( mapping ) {
				PrimitiveMapping.PTR -> "Ptr"
				else                 -> mapping.javaMethodType.getSimpleName().upperCaseFirst
			}
			else             -> if ( mapping === TypeMapping.VOID) "Void" else throw IllegalArgumentException("Unsupported callback return type: $this")
		}

	val NativeType.memType: String
		get() = if ( this is PointerType || mapping === PrimitiveMapping.PTR)
			"Address"
		else
			(mapping as PrimitiveMapping).javaMethodType.getSimpleName().upperCaseFirst

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

	private static final ByteBuffer    CIF  = FFICIF.malloc();
	private static final PointerBuffer ARGS = BufferUtils.createPointerBuffer(${signature.size()});

	static {
${signature.sequence().withIndex().map {
			"\t\tARGS.put(${it.index}, ${it.value.nativeType.ffi});"
		}.join("\n")}

		int status = ffi_prep_cif(CIF, CALL_CONVENTION_${if ( $callConventionSystem ) "SYSTEM" else "DEFAULT"}, ${returns.ffi}, ARGS);
		if ( status != FFI_OK )
			throw new IllegalStateException(String.format("Failed to prepare $className callback interface. Status: 0x%X", status));
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
	protected ${returns.javaMethodType} callback(long args) {
		""")
		if ( returns.mapping != TypeMapping.VOID )
			print("return ")
		print("""invoke(
${signature.sequence().withIndex().map {
			"\t\t\tmemGet${it.value.nativeType.memType}(memGetAddress(POINTER_SIZE * ${it.index} + args))"
		}.join(",\n")}
		);
	}
""")
		print(functionDoc)
		print("""
	public abstract ${returns.javaMethodType} invoke($signatureJava);

	/** A functional interface for {@link $className}. */
	public interface SAM {
		${returns.javaMethodType} invoke($signatureJava);
	}

}""")
	}

	fun generateCallbackSAM(writer: PrintWriter) {
		writer.print(
			"""     /**
	 * Creates a {@link $className} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link $className} instance
	 */
	public static $className $className(final $className.SAM sam) {
		return new $className() {
			@Override
			public ${returns.javaMethodType} invoke($signatureJava) {
				""")
		if ( returns.mapping != TypeMapping.VOID )
			writer.print("return ")
		writer.print("""sam.invoke(${signature.sequence().map { it.name }.join(", ")});
			}
		};
	}

""")
	}
}

fun callback(
	packageName: String,
	returns: NativeType,
	className: String,
	functionDoc: String,
	vararg signature: Parameter,
	returnDoc: String = "",
	since: String = "",
	samConstructor: String? = null,
	init: (CallbackFunction.() -> Unit)? = null
): CallbackFunction {
	val callback = CallbackFunction(packageName, className, returns, *signature)
	if ( init != null )
		callback.init()
	callback.functionDoc = callback.toJavaDoc(functionDoc, signature.sequence(), returns, returnDoc, since)
	Generator.register(callback, samConstructor)
	return callback
}