/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl

import org.lwjgl.generator.*
import java.io.*

val NativeClass.capName: String
    get() = if (templateName.startsWith(prefixTemplate)) templateName else "${prefixTemplate}_$templateName"

private const val CAPABILITIES_CLASS = "EGLCapabilities"

private val EGLBinding = Generator.register(object : APIBinding(
    Module.EGL,
    CAPABILITIES_CLASS,
    APICapabilities.JAVA_CAPABILITIES
) {

    override fun printCustomJavadoc(writer: PrintWriter, function: Func, documentation: String): Boolean {
        if (function.nativeClass.templateName.startsWith("EGL")) {
            writer.printOpenGLJavaDoc(documentation, function.nativeName)
            return true
        }
        return false
    }

    private fun PrintWriter.printOpenGLJavaDoc(documentation: String, function: String) {
        val link = url("https://www.khronos.org/registry/EGL/sdk/docs/man/html/$function.xhtml", "Reference Page")

        if (documentation.isEmpty())
            println("$t/** $link */")
        else {
            if (documentation.indexOf('\n') == -1) {
                println("$t/**")
                print("$t * ")
                print(documentation.substring("$t/** ".length, documentation.length - " */".length))
            } else {
                print(documentation.substring(0, documentation.length - "\n$t */".length))
            }
            print("\n$t * ")
            print("\n$t * @see $link")
            println("\n$t */")
        }
    }

    override fun shouldCheckFunctionAddress(function: Func): Boolean = function.nativeClass.templateName != "CL10"

    override fun generateFunctionAddress(writer: PrintWriter, function: Func) {
        writer.println("$t${t}long $FUNCTION_ADDRESS = EGL.getCapabilities().${function.name};")
    }

    private fun PrintWriter.checkExtensionFunctions(nativeClass: NativeClass) {
        val capName = nativeClass.capName

        println("\n${t}private boolean check_${nativeClass.templateName}(Set<String> ext) {")
        print("$t${t}return ext.contains(\"$capName\") && checkExtension(\"$capName\", checkFunctions(")
        nativeClass.printPointers(this, { it.name })
        println("));")
        println("$t}")
    }

    init {
        javaImport(
            "static org.lwjgl.system.APIUtil.*",
            "static org.lwjgl.system.Checks.*"
        )
        documentation = "Defines the capabilities of an EGLDisplay or the EGL client library."
    }

    override fun PrintWriter.generateJava() {
        generateJavaPreamble()
        println("public class $CAPABILITIES_CLASS {\n")

        val classes = super.getClasses("EGL")

        val addresses = classes.getFunctionPointers()

        println("${t}public final long")
        println(addresses.map(Func::name).joinToString(",\n$t$t", prefix = "$t$t", postfix = ";\n"))

        classes.forEach {
            println(it.getCapabilityJavadoc())
            println("${t}public final boolean ${it.capName};")
        }

        // Client constructor
        println("\n$t$CAPABILITIES_CLASS(FunctionProvider provider, Set<String> ext) {")
        println(addresses.joinToString(",\n$t$t$t", prefix = "$t${t}this(ext,\n$t$t$t", postfix = "\n$t$t);\n$t}") { "provider.getFunctionAddress(${it.functionAddress})" })

        // Display constructor
        println("\n$t$CAPABILITIES_CLASS(EGLCapabilities caps, Set<String> ext) {")
        println(addresses.joinToString(",\n$t$t$t", prefix = "$t${t}this(ext,\n$t$t$t", postfix = "\n$t$t);\n$t}") { "caps.${it.name}" })

        // Common constructor
        println("\n${t}private $CAPABILITIES_CLASS(Set<String> ext, long... functions) {")
        print(addresses.mapIndexed { i, function -> "${function.name} = functions[$i];" }.joinToString("\n$t$t", prefix = "$t$t", postfix = "\n"))
        for (extension in classes) {
            val capName = extension.capName
            print(
                if (extension.hasNativeFunctions)
                    "\n$t$t$capName = check_${extension.templateName}(ext);"
                else
                    "\n$t$t$capName = ext.contains(\"$capName\");"
            )
        }
        println("""
    }

    private static boolean checkExtension(String extension, boolean supported) {
        if (supported) {
            return true;
        }

        apiLog("[EGL] " + extension + " was reported as available but an entry point is missing.");
        return false;
    }""")

        for (extension in classes) {
            if (!extension.hasNativeFunctions) {
                continue
            }

            checkExtensionFunctions(extension)
        }

        println("\n}")
    }

})

fun String.nativeClassEGL(
    templateName: String,
    nativeSubPath: String = "",
    prefix: String = "EGL",
    prefixMethod: String = prefix.lowercase(),
    postfix: String = "",
    init: (NativeClass.() -> Unit)? = null
) = nativeClass(
    Module.EGL,
    templateName,
    nativeSubPath = nativeSubPath,
    prefix = prefix,
    prefixMethod = prefixMethod,
    postfix = postfix,
    binding = EGLBinding,
    init = init
)

private val REGISTRY_PATTERN = "([A-Z]+)_(\\w+)".toRegex()
val NativeClass.registryLink: String get() = (REGISTRY_PATTERN.matchEntire(templateName) ?: throw IllegalStateException("Non-standard extension name: $templateName"))
    .let {
        url("https://www.khronos.org/registry/EGL/extensions/${it.groupValues[1]}/EGL_$templateName.txt", templateName)
    }

fun NativeClass.registryLink(prefix: String, name: String): String = registryLinkTo(prefix, name, templateName)
private fun registryLinkTo(prefix: String, name: String, extensionName: String = "${prefix}_$name"): String =
    url("https://www.khronos.org/registry/EGL/extensions/$prefix/$name.txt", extensionName)

val NativeClass.core: String get() = "{@link ${this.className} EGL ${this.className[3]}.${this.className[4]}}"
val NativeClass.promoted: String get() = "Promoted to core in ${this.core}."