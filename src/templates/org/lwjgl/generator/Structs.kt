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

private val ANONYMOUS = "*"

public class Struct(
	packageName: String,
	className: String,
	nativeSubPath: String = "",
	/** true: the Struct is a typedef to a struct declaration. false: it is the struct declaration itself, so we need to prepend the struct keyword. */
    val globalIdentifier: Boolean = true
): GeneratorTarget(packageName, className, nativeSubPath) {

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

	val nativeName: String
		get() = if ( globalIdentifier ) className else "struct $className"

	private val struct = className.toLowerCase()

	private val members = ArrayList<StructMember>()

	// We allow primitives as members
	public fun PrimitiveType.member(nativeName: String, name: String = nativeName) {
		members add StructMember(this, nativeName, name)
	}

	// We allow primitive arrays as members
	public fun PrimitiveType.member(nativeName: String, name: String = nativeName, size: Int) {
		members add StructMemberArray(this, nativeName, name, size)
	}

	// TODO: Kotlin bug - Removed nullTerminated = false default. If nullTerminated is omitted on the call site, the above function will be called instead.
	// TODO: Is nullTerminated ever false?
	// We allow character arrays as members
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

	val StructMember.isNestedStruct: Boolean
		get() = nativeType is StructType && !(nativeType as StructType).includesPointer

	val StructMember.nestedMembers: ArrayList<StructMember>
		get() = (nativeType as StructType).definition.members

	override fun generateJava(writer: PrintWriter): Unit = writer.generateJavaImpl()
	private fun PrintWriter.generateJavaImpl() {
		print(HEADER)
		println("package $packageName;\n")

		println("import java.nio.*;\n")

		println("import org.lwjgl.*;")

		println("import static org.lwjgl.system.Checks.*;")
		println("import static org.lwjgl.system.MemoryUtil.*;\n")

		preamble.printJava(this)

		if ( documentation != null )
			println(documentation)
		println("public final class $className {")

		print("""
	/** The struct size in bytes. */
	public static final int SIZEOF;
""")

		// Step 1: Member offset fields

		print("""
	/** The struct member offsets. */
	public static final int
""")
		generateOffsetFields(members)

		// Step 2: Member offset initialization

		print("""
	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(${getMemberCount(members)});

		SIZEOF = offsets(memAddress(offsets));

""")
		generateOffsetInit(members)
		println("\t}\n")

		println("\tprivate $className() {}")

		print("""
	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }
""")

		// Step: 3: Constructors
		generateConstructor(
			"Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values.",
			members, generateConstructorArguments, generateConstructorSetters
		)
		if ( generateAlternativeConstructor(members) ) {
			generateConstructor(
				"Alternative virtual constructor.",
				members, generateAlternativeConstructorArguments, generateAlternativeConstructorSetters, ConstructorMode.ALTER1
			)
			if ( members any { it is StructMemberCharArray || it.nativeType is CharSequenceType } )
				generateConstructor(
					"Alternative virtual constructor.",
					members, generateAlternativeConstructorArguments, generateAlternativeConstructorSetters, ConstructorMode.ALTER2
				)
		}

		println();

		// Step 4: Setters
		generateSetters(members)

		println()

		// Step 5: Getters
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

			println("$indentation$field${if ( parentLastMember && lastMember && !member.isNestedStruct ) ';' else ','}")

			// Output nested field offsets
			if ( member.isNestedStruct )
				generateOffsetFields(member.nestedMembers, "$indentation\t", field, parentLastMember && lastMember)
		}
	}

	private fun getMemberCount(members: List<StructMember>): Int {
		var count = members.size
		for ( member in members ) {
			if ( member.nativeType.name identityEquals ANONYMOUS )
				count += getMemberCount((member.nativeType as StructType).definition.members) // recursion
		}
		return count
	}

	private fun PrintWriter.generateOffsetInit(
		members: List<StructMember>,
		indentation: String = "\t\t",
		parentStruct: StructMember? = null,
		parentField: String = "",
	    offset: Int = 0
	): Int {
		val parentPrefix = if ( parentStruct == null ) "" else {
			val nested = (parentStruct.nativeType as StructType).definition
			if ( packageName.equals(nested.packageName) && !nested.className.equals(parentField) )
				nested.className
			else
				nested.packageName + "." + nested.className
		}

		var index = offset
		for ( i in 0..members.lastIndex ) {
			val member = members[i]
			val field = member.offsetField(parentField)

			if ( parentStruct == null || parentStruct.nativeType.name identityEquals ANONYMOUS ) {
				println("$indentation$field = offsets.get($index);")
				index++
			} else
				println("$indentation$field = $parentField + $parentPrefix.${member.offsetField};")

			// Output nested fields
			if ( member.isNestedStruct )
				index = generateOffsetInit(member.nestedMembers, "$indentation\t", member, field, index) // recursion
		}
		return index
	}

	enum class ConstructorMode {
		NORMAL
		ALTER1
		ALTER2
	}

	private fun PrintWriter.generateConstructor(
		javaDoc: String,
		members: List<StructMember>,
		generateArguments: PrintWriter.(List<StructMember>, String, ConstructorMode, Boolean) -> Unit,
		generateSetters: PrintWriter.(List<StructMember>, String) -> Unit,
	    mode: ConstructorMode = ConstructorMode.NORMAL
	) {
		print("""
	/** $javaDoc */
	public static ByteBuffer malloc(
""")
		generateArguments(members, "", mode, true)
		println("""
	) {
		ByteBuffer $struct = malloc();
""")
		generateSetters(members, "")
		print("""
		return $struct;
	}
""")
	}

	private val generateConstructorArguments: PrintWriter.(List<StructMember>, String, ConstructorMode, Boolean) -> Unit = { (members, parentMember, mode, first) ->
		var firstParam = first
		members.forEach {
			val method = it.method(parentMember)

			if ( it.isNestedStruct ) {
				generateConstructorArguments(it.nestedMembers, method, mode, firstParam)
				firstParam = false
			} else {
				if ( firstParam )
					firstParam = false
				else
					println(",")

				print("\t\t")

				val param = if ( parentMember.isEmpty() ) it.name else "${parentMember}_${it.name}"

				when {
					it is StructMemberArray ->
						{
							println("long $param,")
							print("\t\tint ${param}Bytes")
						}
					it.nativeType is PointerType || it.nativeType.mapping == PrimitiveMapping.PTR ->
						{
							print("long $param")
						}
					else ->
						{
							val javaType = it.nativeType.javaMethodType.getSimpleName()
							print(
								if ( javaType.equals("byte") || javaType.equals("short") )
									"int $param"
								else
									"$javaType $param"
							)
						}
				}
			}
		}
	}

	private val generateConstructorSetters: PrintWriter.(List<StructMember>, String) -> Unit = { (members, parentMember) ->
		members.forEach {
			val method = it.method(parentMember)

			if ( it.isNestedStruct ) {
				generateConstructorSetters(it.nestedMembers, method)
			} else {
				val param = if ( parentMember.isEmpty() ) it.name else "${parentMember}_${it.name}"

				when {
					it is StructMemberArray ->
						{
							println("\t\t${method}Set($struct, $param, ${param}Bytes);")
						}
					else ->
						{
							println("\t\t${method}Set($struct, $param);")
						}
				}
			}
		}
	}

	private val generateAlternativeConstructor: (List<StructMember>) -> Boolean = { (members) ->
		members any {
			if ( it.isNestedStruct )
				generateAlternativeConstructor(it.nestedMembers)
			else
				it is StructMemberArray || it.nativeType is CharSequenceType || (it.nativeType is PointerType && (it.nativeType as PointerType).mapping != PointerMapping.NAKED_POINTER)
		}
	}

	private val generateAlternativeConstructorArguments: PrintWriter.(List<StructMember>, String, ConstructorMode, Boolean) -> Unit = {(members, parentMember, mode, first) ->
		var firstParam = first
		members.forEach {
			val method = it.method(parentMember)

			if ( it.isNestedStruct ) {
				generateAlternativeConstructorArguments(it.nestedMembers, method, mode, firstParam)
				firstParam = false
			} else {
				if ( firstParam )
					firstParam = false
				else
					println(",")

				print("\t\t")

				val param = if ( parentMember.isEmpty() ) it.name else "${parentMember}_${it.name}"

				when {
					it is StructMemberArray ->
						{
							print(
								if ( it is StructMemberCharArray && mode == ConstructorMode.ALTER2 )
									"CharSequence $param"
								else
									"ByteBuffer $param"
							)
						}
					it.nativeType is CharSequenceType && mode == ConstructorMode.ALTER2 ->
						{
							print("CharSequence $param")
						}
					it.nativeType is PointerType && (it.nativeType as PointerType).mapping != PointerMapping.NAKED_POINTER ->
						{
							print("ByteBuffer $param")
						}
					else ->
						{
							val javaType = it.nativeType.javaMethodType.getSimpleName()
							print(
								if ( javaType.equals("byte") || javaType.equals("short") )
									"int $param"
								else
									"$javaType $param"
							)
						}
				}
			}
		}
	}

	private val generateAlternativeConstructorSetters: PrintWriter.(List<StructMember>, String) -> Unit = {(members, parentMember) ->
		members.forEach {
			val method = it.method(parentMember)

			if ( it.isNestedStruct ) {
				generateAlternativeConstructorSetters(it.nestedMembers, method)
			} else {
				val param = if ( parentMember.isEmpty() ) it.name else "${parentMember}_${it.name}"
				println("\t\t${method}Set($struct, $param);")
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

			if ( it.isNestedStruct ) {
				generateSetters(it.nestedMembers, method, field)
			} else {
				val param = it.name

				// Setter

				print("\tpublic static void ${method}Set(ByteBuffer $struct, ")
				when {
					it is StructMemberArray ->
						{
							println("long $param, int bytes) { memCopy($param, memAddress($struct) + $field, bytes); }")
						}
					it.nativeType is PointerType || it.nativeType.mapping == PrimitiveMapping.PTR ->
						{
							println("long $param) { PointerBuffer.put($struct, $struct.position() + $field, $param); }")
						}
					else ->
						{
							val javaType = it.nativeType.javaMethodType.getSimpleName()
							val bufferMethod = getBufferMethod(it, javaType)

							println(
								if ( javaType.equals("byte") || javaType.equals("short") )
									"int $param) { $struct.put$bufferMethod($struct.position() + $field, ($javaType)$param); }"
								else
									"$javaType $param) { $struct.put$bufferMethod($struct.position() + $field, $param); }"
							)
						}
				}

				// Alternative setters

				when {
					it is StructMemberArray ->
						{
							val array: StructMemberArray = it

							// TODO: We support primitive arrays only for now. Fix this if we ever need struct/pointer arrays
							val mapping = (array.nativeType as PrimitiveType).mapping as PrimitiveMapping
							val bytesPerElement = mapping.bytes

							println("\tpublic static void ${method}Set(ByteBuffer $struct, ByteBuffer $param) {")
							if ( array is StructMemberCharArray ) {
								val charArray: StructMemberCharArray = array
								val charMapping = charArray.nativeType.mapping as CharMapping
								println("\t\tcheckNT${charMapping.bytes}($param);")
							}
							println("\t\tcheckBufferGT($param, ${array.size} * $bytesPerElement);")
							println("\t\t${method}Set($struct, memAddress($param), $param.remaining());")
							println("\t}")

							if ( array is StructMemberCharArray ) {
								val charArray: StructMemberCharArray = array
								var charMapping = charArray.nativeType.mapping as CharMapping
								println("\tpublic static void ${method}Set(ByteBuffer $struct, CharSequence $param) { ByteBuffer buffer = memEncode${charMapping.charset}($param, ${charArray.nullTerminated}); ${method}Set($struct, memAddress(buffer), buffer.capacity()); }")
							}
						}
					it.nativeType is CharSequenceType ->
						{
							val csType: CharSequenceType = it.nativeType
							print("\tpublic static void ${method}Set(ByteBuffer $struct, ByteBuffer $param) { ")
							val buffer = if ( csType.nullTerminated )
								"checkNT${csType.charMapping.bytes}($param)"
							else
								param
							println("${method}Set($struct, $param == null ? 0 : memAddress($buffer)); }")
							println("\tpublic static void ${method}Set(ByteBuffer $struct, CharSequence $param) { ${method}Set($struct, $param == null ? 0 : memAddress(memEncode${csType.charMapping.charset}($param))); }")
						}
					it.nativeType is PointerType && (it.nativeType as PointerType).mapping != PointerMapping.NAKED_POINTER ->
						{
							println("\tpublic static void ${method}Set(ByteBuffer $struct, ByteBuffer $param) { ${method}Set($struct, memAddress($param)); }")
						}
					else ->
						{
						}
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

			if ( it.isNestedStruct ) {
				generateGetters(it.nestedMembers, method, field)
			} else {
				// Getter

				print("\tpublic static ")

				when {
					it is StructMemberArray ->
						{
							val param = (it as StructMemberArray).name
							println("void ${method}Get(ByteBuffer $struct, long $param, int bytes) {")
							println("\t\tmemCopy(memAddress($struct) + $field, $param, bytes);")
							println("\t}")
						}
					it.nativeType is PointerType || it.nativeType.mapping == PrimitiveMapping.PTR ->
						{
							println("long ${method}Get(ByteBuffer $struct) { return PointerBuffer.get($struct, $struct.position() + $field); }")
						}
					else ->
						{
							val javaType = it.nativeType.javaMethodType.getSimpleName()
							val bufferMethod = getBufferMethod(it, javaType)

							val convertToInt = javaType.equals("byte") || javaType.equals("short");

							print(
								if ( convertToInt )
									"int ${method}Get(ByteBuffer $struct) { return $struct.get$bufferMethod("
								else
									"$javaType ${method}Get(ByteBuffer $struct) { return $struct.get$bufferMethod("
							)

							print("$struct.position() + $field)")
							if ( convertToInt && it.nativeType is IntegerType && it.nativeType.unsigned ) {
								print(" & 0x")
								for ( i in 1..(it.nativeType.mapping as PrimitiveMapping).bytes )
									print("FF")
							}
							println("; }")
						}
				}

				// Alternative getters

				when {
					it is StructMemberArray ->
						{
							val array: StructMemberArray = it

							// TODO: We support primitive arrays only for now. Fix this if we ever need struct/pointer arrays
							val mapping = (array.nativeType as PrimitiveType).mapping as PrimitiveMapping
							val bytesPerElement = mapping.bytes

							val param = array.name

							println("\tpublic static void ${method}Getb(ByteBuffer $struct, ByteBuffer $param) {")
							println("\t\tcheckBufferGT($param, ${array.size} * $bytesPerElement);")
							println("\t\t${method}Get($struct, memAddress($param), $param.remaining());")
							println("\t}")

							if ( array is StructMemberCharArray ) {
								val charArray: StructMemberCharArray = array
								val charMapping = charArray.nativeType.mapping as CharMapping
								if ( charArray.nullTerminated ) {
									println("\tpublic static String ${method}Gets(ByteBuffer $struct) { return memDecode${charMapping.charset}($struct, memStrLen${charMapping.bytes}($struct, $field), $field); }")
									println("\tpublic static String ${method}Gets(ByteBuffer $struct, int size) { return memDecode${charMapping.charset}($struct, size, $field); }")
								} else
									println("\tpublic static String ${method}Gets(ByteBuffer $struct) { return memDecode${charMapping.charset}($struct, ${charArray.size}, $field); }")
							}
						}
					it.nativeType is CharSequenceType ->
						{
							if ( it.nativeType.nullTerminated ) {
								println("\tpublic static ByteBuffer ${method}Getb(ByteBuffer $struct) { long address = ${method}Get($struct); return address == 0 ? null : memByteBufferNT${it.nativeType.charMapping.bytes}(address); }")
								println("\tpublic static String ${method}Gets(ByteBuffer $struct) { long address = ${method}Get($struct); return address == 0 ? null : memDecode${it.nativeType.charMapping.charset}(memByteBufferNT${it.nativeType.charMapping.bytes}(address)); }")
							} else {
								println("\tpublic static ByteBuffer ${method}Getb(ByteBuffer $struct, int size) { long address = ${method}Get($struct); return address == 0 ? null : memByteBuffer(address, size); }")
								println("\tpublic static String ${method}Gets(ByteBuffer $struct, int size) { long address = ${method}Get($struct); return address == 0 ? null : memDecode${it.nativeType.charMapping.charset}(memByteBuffer(address, size)); }")
							}
						}
					it.nativeType is PointerType && (it.nativeType as PointerType).mapping != PointerMapping.NAKED_POINTER ->
						{
							println("\tpublic static ByteBuffer ${method}Get(ByteBuffer $struct, int size) { long address = ${method}Get($struct); return address == 0 ? null : memByteBuffer(address, size); }")
						}
					else ->
						{
						}
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
		println("#include \"common_tools.h\"")
		println("#include <stddef.h>")

		preamble.printNative(this)

		println()

		println("JNIEXPORT jint JNICALL Java_${nativeFileNameJNI}_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {")
		println("\tjint *buffer = (jint *)(intptr_t)bufferAddress;\n")

		generateNativeMembers(members)

		println("\n\treturn sizeof($nativeName);")
		print("}")
	}

	private fun PrintWriter.generateNativeMembers(members: List<StructMember>, offset: Int = 0, prefix: String = ""): Int {
		var index = offset
		for ( i in 0..members.lastIndex ) {
			println("\tbuffer[$index] = (jint)(offsetof($nativeName, $prefix${members[i].nativeName}));")
			index++

			if ( members[i].isNestedStruct ) {
				// Output anonymous inner structs
				val structType = members[i].nativeType as StructType
				if ( structType.name identityEquals ANONYMOUS )
					index = generateNativeMembers(structType.definition.members, index, prefix = "${members[i].nativeName}." ) // recursion
			}
		}

		return index
	}

}

public fun struct(packageName: String, className: String, nativeSubPath: String = "", globalIdentifier: Boolean = true, init: Struct.() -> Unit): Struct {
	val struct = Struct(packageName, className, nativeSubPath, globalIdentifier)
	struct.init()
	StructRegistry add struct
	return struct
}

/** Anonymous member struct definition. Mostly useful for union of structs. */
public fun Struct.struct(init: Struct.() -> Unit): StructType {
	val struct = Struct(ANONYMOUS, ANONYMOUS)
	struct.init()
	return StructType(struct)
}