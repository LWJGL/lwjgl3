/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.io.PrintWriter
import java.util.ArrayList

class StructRegistry {

	class object {
		val INSTANCE = StructRegistry()

		fun generate() {
			INSTANCE.structs.forEach {
				try {
					generate(it)
				} catch (e: Exception) {
					throw RuntimeException("Uncaught exception while generating struct: ${it.packageName}.${it.className}", e)
				}
			}
		}

		fun add(struct: Struct) {
			INSTANCE.structs add struct
		}

	}

	private val structs = ArrayList<Struct>()

}

open class StructMember(
	val nativeType: NativeType,
	val nativeName: String,
	val name: String
) {
	val offsetField: String
		get() = "${name.toUpperCase()}"

	fun offsetField(parentField: String): String {
		return if ( parentField.isEmpty() )
			offsetField
		else
			"${parentField}_${offsetField}"
	}

	fun method(parentMember: String): String {
		return if ( parentMember.isEmpty() )
			name
		else
			"$parentMember${name.substring(0, 1).toUpperCase()}${if ( 1 < name.size ) name.substring(1) else ""}"
	}
}

open class StructMemberArray(
	nativeType: PrimitiveType,
	nativeName: String,
	name: String,
	val size: Int
): StructMember(nativeType, nativeName, name)

class StructMemberCharArray(
	nativeType: CharType,
	nativeName: String,
	name: String,
	size: Int,
    val nullTerminated: Boolean
): StructMemberArray(nativeType, nativeName, name, size)

public class Struct(
	packageName: String,
	className: String,
	nativeSubPath: String = ""
): AbstractGeneratorTarget(packageName, className, nativeSubPath) {

	class object {
		private val bufferMethodMap = hashMapOf(
			"byte" to "",
			"char" to "Char",
			"short" to "Short",
			"int" to "Int",
			"long" to "Long",

			"float" to "Float",
			"double" to "Double"
		)
	}

	private val members = ArrayList<StructMember>()

	// We allow primitives as members
	public fun PrimitiveType.member(nativeName: String, name: String = nativeName) {
		members add StructMember(this, nativeName, name)
	}

	public fun PrimitiveType.member(nativeName: String, name: String = nativeName, size: Int) {
		members add StructMemberArray(this, nativeName, name, size)
	}

	// TODO: Kotlin bug - Removed nullTerminated = false default. If nullTerminated is omitted on the call site, the above function will be called instead.
	// TODO: Is nullTerminated ever false?
	public fun CharType.member(nativeName: String, name: String = nativeName, size: Int, nullTerminated: Boolean) {
		members add StructMemberCharArray(this, nativeName, name, size, nullTerminated)
	}

	// We allow pointers as members
	public fun PointerType.member(nativeName: String, name: String = nativeName) {
		members add StructMember(this, nativeName, name)
	}

	// We allow nested structs as members
	public fun StructType.member(nativeName: String, name: String = nativeName) {
		members add StructMember(this, nativeName, name)
	}

	override fun generateJava(writer: PrintWriter): Unit = writer.generateJavaImpl()
	private fun PrintWriter.generateJavaImpl() {
		print(HEADER)
		println("package $packageName;\n")

		println("import java.nio.*;\n")

		println("import org.lwjgl.*;")

		println("import static org.lwjgl.system.Checks.*;")
		println("import static org.lwjgl.system.MemoryUtil.*;\n")

		if ( documentation != null )
			println(documentation)
		println("public final class $className {\n")

		println("\tpublic static final int SIZEOF;")

		// Step 1: Member offset fields

		print("""
	/** The struct member offsets. */
	public static final int
""")
		generateOffsetFields(members)

		// Step 2: Member offset initialization

		print("""
	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(${members.size});

		SIZEOF = offsets(memAddress(offsets));

""")
		generateOffsetInit(members)
		println("\t}\n")

		println("\tprivate $className() {}")

		print("""
	private static native int offsets(long buffer);

	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

""")

		// Step 3: Setters
		generateSetters(members)

		println()

		// Step 4: Getters
		generateGetters(members)

		print("\n}")
	}

	private fun PrintWriter.generateOffsetFields(
		members: List<StructMember>,
		indentation: String = "\t\t",
		parentField: String = "",
		parentLastMember: Boolean = true
	) {
		for ( i in 0..members.lastIndex ) {
			val member = members[i]
			val field = member.offsetField(parentField)
			val lastMember = i == members.lastIndex

			println("$indentation$field${if ( parentLastMember && lastMember && !(member.nativeType is StructType) ) ';' else ','}")

			// Output nested field offsets
			if ( member.nativeType is StructType )
				generateOffsetFields(member.nativeType.definition.members, "$indentation\t", field, parentLastMember && lastMember)
		}
	}

	private fun PrintWriter.generateOffsetInit(
		members: List<StructMember>,
		indentation: String = "\t\t",
		parentStruct: String = "",
		parentField: String = ""
	) {
		for ( i in 0..members.lastIndex ) {
			val member = members[i]
			val field = member.offsetField(parentField)

			if ( parentStruct.isEmpty() )
				println("$indentation$field = offsets.get($i);")
			else
				println("$indentation$field = $parentField + $parentStruct.${member.offsetField};")

			// Output nested fields
			if ( member.nativeType is StructType ) {
				val nested = member.nativeType.definition
				val nestedStruct = if ( packageName.equals(nested.packageName) && !nested.className.equals(field) )
					nested.className
				else
					nested.packageName + "." + nested.className
				generateOffsetInit(nested.members, "$indentation\t", nestedStruct, field)
			}
		}
	}

	private fun PrintWriter.generateSetters(
		members: List<StructMember>,
		parentMember: String = "",
		parentField: String = ""
	) {
		members.forEach {
			val method = it.method(parentMember)
			val field = it.offsetField(parentField)

			if ( it.nativeType is StructType ) {
				generateSetters(it.nativeType.definition.members, method, field)
			} else {
				val param = it.name

				// Setter

				print("\tpublic static void ${method}Set(ByteBuffer struct, ")
				when {
					it is StructMemberArray -> {
						println("long $param, int bytes) { memCopy($param, memAddress(struct) + $field, bytes); }")
					} it.nativeType is PointerType || it.nativeType.mapping == PrimitiveMapping.PTR -> {
						println("long $param) { PointerBuffer.put(struct, struct.position() + $field, $param); }")
					} else -> {
						val javaType = it.nativeType.javaMethodType.getSimpleName()
						val bufferMethod = getBufferMethod(it, javaType)

						println(
							if ( javaType.equals("byte") || javaType.equals("short") )
								"int $param) { struct.put$bufferMethod(struct.position() + $field, ($javaType)$param); }"
							else
								"$javaType $param) { struct.put$bufferMethod(struct.position() + $field, $param); }"
						)
					}
				}

				// Alternative setters

				when {
					it is StructMemberArray -> {
						val array: StructMemberArray = it

						// TODO: We support primitive arrays only for now. Fix this if we ever need struct/pointer arrays
						val mapping = (array.nativeType as PrimitiveType).mapping as PrimitiveMapping
						val bytesPerElement = mapping.bytes

						println("\tpublic static void ${method}Set(ByteBuffer struct, ByteBuffer $param) {")
						if ( array is StructMemberCharArray ) {
							val charArray: StructMemberCharArray = array
							val charMapping = charArray.nativeType.mapping as CharMapping
							println("\t\tcheckNT${charMapping.bytes}($param);")
						}
						println("\t\tcheckBufferGT($param, ${array.size} * $bytesPerElement);")
						println("\t\t${method}Set(struct, memAddress($param), $param.remaining());")
						println("\t}")

						if ( array is StructMemberCharArray ) {
							val charArray: StructMemberCharArray = array
							var charMapping = charArray.nativeType.mapping as CharMapping
							println("\tpublic static void ${method}Set(ByteBuffer struct, CharSequence $param) { ByteBuffer buffer = memEncode${charMapping.charset}($param, ${charArray.nullTerminated}); ${method}Set(struct, memAddress(buffer), buffer.capacity()); }")
						}
					} it.nativeType is CharSequenceType -> {
						val csType: CharSequenceType = it.nativeType
						print("\tpublic static void ${method}Set(ByteBuffer struct, ByteBuffer $param) { ")
						val buffer = if ( csType.nullTerminated )
							"checkNT${csType.charMapping.bytes}($param)"
						else
							param
						println("${method}Set(struct, $param == null ? 0 : memAddress($buffer)); }")
						println("\tpublic static void ${method}Set(ByteBuffer struct, CharSequence $param) { ${method}Set(struct, $param == null ? 0 : memAddress(memEncode${csType.charMapping.charset}($param))); }")
					} it.nativeType is PointerType -> {
						val pType: PointerType = it.nativeType
						if ( pType.mapping != PointerMapping.NAKED_POINTER )
							println("\tpublic static void ${method}Set(ByteBuffer struct, ByteBuffer $param) { ${method}Set(struct, memAddress($param)); }")
					} else -> {}
				}
			}
		}
	}

	private fun PrintWriter.generateGetters(
		members: List<StructMember>,
		parentMember: String = "",
		parentField: String = ""
	) {
		members.forEach {
			val method = it.method(parentMember)
			val field = it.offsetField(parentField)

			if ( it.nativeType is StructType ) {
				generateGetters(it.nativeType.definition.members, method, field)
			} else {
				// Getter

				print("\tpublic static ")

				when {
					it is StructMemberArray -> {
						val param = (it as StructMemberArray).name
						println("void ${method}Get(ByteBuffer struct, long $param, int bytes) {")
						println("\t\tmemCopy(memAddress(struct) + $field, $param, bytes);")
						println("\t}")
					} it.nativeType is PointerType || it.nativeType.mapping == PrimitiveMapping.PTR -> {
						println("long ${method}Get(ByteBuffer struct) { return PointerBuffer.get(struct, struct.position() + $field); }")
					} else -> {
						val javaType = it.nativeType.javaMethodType.getSimpleName()
						val bufferMethod = getBufferMethod(it, javaType)

						print(
							if ( javaType.equals("byte") || javaType.equals("short") )
								"int ${method}Get(ByteBuffer struct) { return struct.get$bufferMethod("
							else
								"$javaType ${method}Get(ByteBuffer struct) { return struct.get$bufferMethod("
						)

						println("struct.position() + $field); }")
					}
				}

				// Alternative getters

				when {
					it is StructMemberArray -> {
						val array: StructMemberArray = it

						// TODO: We support primitive arrays only for now. Fix this if we ever need struct/pointer arrays
						val mapping = (array.nativeType as PrimitiveType).mapping as PrimitiveMapping
						val bytesPerElement = mapping.bytes

						val param = array.name

						println("\tpublic static void ${method}Getb(ByteBuffer struct, ByteBuffer $param) {")
						println("\t\tcheckBufferGT($param, ${array.size} * $bytesPerElement);")
						println("\t\t${method}Get(struct, memAddress($param), $param.remaining());")
						println("\t}")

						if ( array is StructMemberCharArray ) {
							val charArray: StructMemberCharArray = array
							val charMapping = charArray.nativeType.mapping as CharMapping
							println("\tpublic static String ${method}Gets(ByteBuffer struct) { return memDecode${charMapping.charset}(memByteBufferNT${charMapping.bytes}(memAddress(struct) + $field)); }")
							println("\tpublic static String ${method}Gets(ByteBuffer struct, int size) { return memDecode${charMapping.charset}(memByteBuffer(memAddress(struct) + $field, size)); }")
						}
					} it.nativeType is CharSequenceType -> {
						if ( it.nativeType.nullTerminated ) {
							println("\tpublic static ByteBuffer ${method}Getb(ByteBuffer struct) { long address = ${method}Get(struct); return address == 0 ? null : memByteBufferNT${it.nativeType.charMapping.bytes}(address); }")
							println("\tpublic static String ${method}Gets(ByteBuffer struct) { long address = ${method}Get(struct); return address == 0 ? null : memDecode${it.nativeType.charMapping.charset}(memByteBufferNT${it.nativeType.charMapping.bytes}(address)); }")
						} else {
							println("\tpublic static ByteBuffer ${method}Getb(ByteBuffer struct, int size) { long address = ${method}Get(struct); return address == 0 ? null : memByteBuffer(address, size); }")
							println("\tpublic static String ${method}Gets(ByteBuffer struct, int size) { long address = ${method}Get(struct); return address == 0 ? null : memDecode${it.nativeType.charMapping.charset}(memByteBuffer(address, size)); }")
						}
					} it.nativeType is PointerType -> {
						val pType: PointerType = it.nativeType
						if ( pType.mapping != PointerMapping.NAKED_POINTER )
							println("\tpublic static ByteBuffer ${method}Get(ByteBuffer struct, int size) { long address = ${method}Get(struct); return address == 0 ? null : memByteBuffer(address, size); }")
					} else -> {}
				}
			}
		}
	}

	private fun getBufferMethod(member: StructMember, javaType: String): String {
		val bufferMethod = bufferMethodMap[javaType]
		if ( bufferMethod == null )
			throw UnsupportedOperationException("Unsupported struct member java type: $className.${member.name} ($javaType)")

		return bufferMethod
	}

	override fun generateNative(writer: PrintWriter): Unit = writer.generateNativeImpl()
	private fun PrintWriter.generateNativeImpl() {
		print(HEADER)
		println("#include <jni.h>")
		println("#include <stddef.h>")

		nativePreamble.print(this)

		println()

		println("JNIEXPORT jint JNICALL Java_${nativeFileName}_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {")
		println("\tjint *buffer = (jint *)(intptr_t)bufferAddress;\n")
		for ( i in 0..members.lastIndex ) {
			println("\tbuffer[$i] = (jint)(offsetof($className, ${members[i].nativeName}));")
		}
		println("\n\treturn sizeof($className);")
		print("}")
	}

}

public fun struct(packageName: String, className: String, nativeSubPath: String = "", init: Struct.() -> Unit): Struct {
	val struct = Struct(packageName, className, nativeSubPath)
	struct.init()
	StructRegistry add struct
	return struct
}