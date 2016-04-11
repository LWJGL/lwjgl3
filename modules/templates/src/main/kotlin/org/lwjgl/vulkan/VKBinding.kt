/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan

import org.lwjgl.generator.*
import java.io.PrintWriter
import java.util.*
import java.util.regex.Pattern

private val NativeClass.capName: String
	get() = if ( templateName.startsWith(prefix) ) {
		if ( prefix == "VK" )
			"Vulkan${templateName.substring(2)}"
		else
			templateName
	} else {
		"${prefixTemplate}_$templateName"
	}

private val CAPABILITIES_CLASS = "VKCapabilities"

val VK_BINDING = Generator.register(object : APIBinding(VULKAN_PACKAGE, CAPABILITIES_CLASS) {

	override val hasCapabilities: Boolean get() = true
	override val hasParameterCapabilities: Boolean = true

	private val VKCorePattern = Pattern.compile("VK[1-9][0-9]")
	override fun printCustomJavadoc(writer: PrintWriter, function: NativeClassFunction, documentation: String): Boolean {
		if ( VKCorePattern.matcher(function.nativeClass.className).matches() ) {
			writer.print("\t/**\n\t * <p>${url("https://www.khronos.org/registry/vulkan/specs/1.0/man/html/${function.name}.html", "Khronos Reference Page")}</p>\n\t * \n")
			if ( documentation.indexOf('\n') == -1 ) {
				writer.print("\t * ")
				writer.println(documentation.substring("\t/** ".length, documentation.length - 3))
				writer.println("\t */")
			} else
				writer.println(documentation.substring("\t/**\n".length))

			return true
		}
		return false
	}

	override fun shouldCheckFunctionAddress(function: NativeClassFunction): Boolean = function.nativeClass.templateName != "VK10"

	override fun generateFunctionAddress(writer: PrintWriter, function: NativeClassFunction) {
		writer.print("\t\tlong $FUNCTION_ADDRESS = ")
		writer.println(if ( function has Capabilities )
			"${function[Capabilities].expression}.${function.name};"
		else
			"${function.getParams() { it.nativeType is ObjectType }.first().name}.getCapabilities().${function.name};")
	}

	override fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass) {
		println("\n\tstatic boolean isAvailable($CAPABILITIES_CLASS caps) {")
		print("\t\treturn checkFunctions(")
		nativeClass.printPointers(this, { "caps.${it.name}" })
		println(");")
		println("\t}")
	}

	override fun PrintWriter.generateContent() {
		println("/** Defines the capabilities of a Vulkan {@code VkInstance} or {@code VkDevice}. */")
		println("public class $CAPABILITIES_CLASS {\n")

		val classes = super.getClasses { o1, o2 ->
			// Core functionality first, extensions after
			val isVK1 = o1.templateName.startsWith("VK")
			val isVK2 = o2.templateName.startsWith("VK")

			if ( isVK1 xor isVK2 )
				(if ( isVK1 ) -1 else 1)
			else
				o1.templateName.compareTo(o2.templateName, ignoreCase = true)
		}

		val classesWithFunctions = classes.filter { it.hasNativeFunctions }

		val addresses = classesWithFunctions
			.map { it.functions }
			.flatten()
			.toSortedSet(Comparator<NativeClassFunction> { o1, o2 -> o1.name.compareTo(o2.name) })

		println("\tpublic final long")
		println(addresses.map { it.name }.joinToString(",\n\t\t", prefix = "\t\t", postfix = ";\n"))

		println("""
	/** The Vulkan API version number. */
	public final int apiVersion;
""")

		classes.forEach {
			val documentation = it.documentation
			if ( documentation != null )
				println((if ( it.hasBody ) "When true, {@link ${it.className}} is supported." else documentation).toJavaDoc())
			println("\tpublic final boolean ${it.capName};")
		}

		println("""
	$CAPABILITIES_CLASS(FunctionProvider provider, int apiVersion, Set<String> ext) {
		this.apiVersion = apiVersion;
""")

		println(addresses.map { "${it.name} = provider.getFunctionAddress(${it.nativeName});" }.joinToString("\n\t\t", prefix = "\t\t", postfix = "\n"))

		for (extension in classes) {
			val capName = extension.capName
			print("\t\t$capName = ext.contains(\"${extension.capName}\")")
			if ( extension.hasNativeFunctions )
				print(" && VK.checkExtension(\"$capName\", ${if ( capName == extension.className ) "$VULKAN_PACKAGE.${extension.className}" else extension.className}.isAvailable(this))")
			println(";")
		}
		println("\t}")
		print("\n}")
	}

})

// DSL Extensions

val GlobalCommand = Capabilities("VK.getGlobalCommands()")

fun String.nativeClassVK(
	templateName: String,
	nativeSubPath: String = "",
	prefix: String = "VK",
	prefixMethod: String = prefix.toLowerCase(),
	postfix: String = "",
	init: (NativeClass.() -> Unit)? = null
) = nativeClass(
	VULKAN_PACKAGE,
	templateName,
	nativeSubPath = nativeSubPath,
	prefix = prefix,
	prefixMethod = prefixMethod,
	postfix = postfix,
	binding = VK_BINDING,
	init = init
)

val must = "<b>must</b>"
val mustnot = "<b>must not</b>"
val should = "<b>should</b>"
val shouldnot = "<b>should not</b>"
val may = "<b>may</b>"
val can = "<b>can</b>"
val cannot = "<b>cannot</b>"

val ConstantBlock<EnumValue>.enumLinks: String
	get() = javaDocLinks.let {
		it.indexOf("_BEGIN_RANGE ").let { index ->
			if ( index == -1 )
				it
			else
				it.substring(0, it.lastIndexOf(' ', index))
		}
	}

fun note(javadoc: String, title: String = "Note") =
	""" <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>$title</h5>
	$javadoc
	</div>"""

fun man(page: String, version: String = "1.0", link: String = "Khronos Reference Page") =
	"<a href=\"https://www.khronos.org/registry/vulkan/specs/$version/man/html/$page.html\">$link</a>"
fun spec(anchor: String, version: String = "1.0-wsi_extensions", link: String = "Vulkan Specification") =
	"<a href=\"https://www.khronos.org/registry/vulkan/specs/$version/xhtml/vkspec.html\\#$anchor\">$link</a>"

private val STRUCTURE_TYPE_REGEX = "([a-z])([A-Z])".toRegex()
internal fun Struct.sType(struct: Struct) = VkStructureType.member("sType", "the type of this structure. Must be: #STRUCTURE_TYPE_${struct
	.className
	.substring(2)
	.replace(STRUCTURE_TYPE_REGEX, "$1_$2")
	.toUpperCase()
}")
internal fun Struct.pNext() = nullable.."const void".p.member("pNext", "reserved for use by extensions")