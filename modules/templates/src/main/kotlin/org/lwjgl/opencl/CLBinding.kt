/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl

import org.lwjgl.generator.*
import java.io.*

private val NativeClass.capName: String
    get() = if (templateName.startsWith(prefix)) {
        if (prefix == "CL")
            "OpenCL${templateName.substring(2)}"
        else
            templateName
    } else {
        "${prefixTemplate}_$templateName"
    }

private val CAPABILITIES_CLASS = "CLCapabilities"

private val CLBinding = Generator.register(object : APIBinding(
    OPENCL_PACKAGE,
    CAPABILITIES_CLASS,
    APICapabilities.JAVA_CAPABILITIES
) {

    override fun printCustomJavadoc(writer: PrintWriter, function: Func, documentation: String): Boolean {
        if (function.nativeClass.templateName.startsWith("CL")) {
            writer.printOpenGLJavaDoc(documentation, function.nativeName, if (function.has<DeprecatedCL>()) function.get<DeprecatedCL>().after else "2.1")
            return true
        }
        return false
    }

    private fun PrintWriter.printOpenGLJavaDoc(documentation: String, function: String, version: String) {
        val link = url("https://www.khronos.org/registry/OpenCL/sdk/$version/docs/man/xhtml/$function.html", "Reference Page")
        val injectedJavaDoc =
            if (version != "2.1")
                "$link - <em>This function is deprecated after OpenCL $version</em>"
            else
                link

        if (documentation.isEmpty())
            println("$t/** $injectedJavaDoc */")
        else {
            print("$t/**\n$t * <p>$injectedJavaDoc</p>\n$t * \n")
            if (documentation.indexOf('\n') == -1) {
                print("$t * ")
                println(documentation.substring("$t/** ".length, documentation.length - 3))
                println("$t */")
            } else {
                println(documentation.substring("$t/**\n".length))
            }
        }
    }

    override fun shouldCheckFunctionAddress(function: Func): Boolean = function.nativeClass.templateName != "CL10"

    override fun generateFunctionAddress(writer: PrintWriter, function: Func) {
        writer.println("$t${t}long $FUNCTION_ADDRESS = CL.getICD().${function.name};")
    }

    override fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass) {
        println("\n${t}static boolean isAvailable($CAPABILITIES_CLASS caps) {")
        print("$t${t}return checkFunctions(")
        nativeClass.printPointers(this, { "caps.${it.name}" })
        println(");")
        println("$t}")
    }

    init {
        documentation =
            """
            Defines the capabilities of an OpenCL platform or device.

            The instance returned by {@link CL\#createPlatformCapabilities} exposes the functionality present on either the platform or any of its devices.
            This is unlike the #PLATFORM_EXTENSIONS string, which returns only platform functionality, supported across all platform devices.

            The instance returned by {@link CL\#createDeviceCapabilities} exposes only the functionality available on that particular device.
            """
    }

    override fun PrintWriter.generateJava() {
        generateJavaPreamble()
        println("public class $CAPABILITIES_CLASS {\n")

        val classes = super.getClasses { o1, o2 ->
            // Core functionality first, extensions after
            val isCL1 = o1.templateName.startsWith("CL")
            val isCL2 = o2.templateName.startsWith("CL")

            if (isCL1 xor isCL2)
                (if (isCL1) -1 else 1)
            else
                o1.templateName.compareTo(o2.templateName, ignoreCase = true)
        }

        val classesWithFunctions = classes.filter { it.hasNativeFunctions }

        val addresses = classesWithFunctions
            .map { it.functions }
            .flatten()
            .toSortedSet(Comparator<Func> { o1, o2 -> o1.name.compareTo(o2.name) })

        println("${t}public final long")
        println(addresses.map(Func::name).joinToString(",\n$t$t", prefix = "$t$t", postfix = ";\n"))

        classes.forEach {
            println(it.getCapabilityJavadoc())
            println("${t}public final boolean ${it.capName};")
        }

        // ICD/Platform constructor
        println("\n$t$CAPABILITIES_CLASS(FunctionProvider provider, Set<String> ext) {")
        println(addresses.map { "provider.getFunctionAddress(${it.functionAddress})" }.joinToString(",\n$t$t$t", prefix = "$t${t}this(ext,\n$t$t$t", postfix = "\n$t$t);\n$t}"))

        // Device constructor
        println("\n$t$CAPABILITIES_CLASS(CLCapabilities caps, Set<String> ext) {")
        println(addresses.map { "caps.${it.name}" }.joinToString(",\n$t$t$t", prefix = "$t${t}this(ext,\n$t$t$t", postfix = "\n$t$t);\n$t}"))

        // Common constructor
        println("\n${t}private $CAPABILITIES_CLASS(Set<String> ext, long... functions) {")
        println(addresses.mapIndexed { i, function -> "${function.name} = functions[$i];" }.joinToString("\n$t$t", prefix = "$t$t", postfix = "\n"))
        for (extension in classes) {
            val capName = extension.capName
            print("$t$t$capName = ext.contains(\"$capName\")")
            if (extension.hasNativeFunctions)
                print(" && CL.checkExtension(\"$capName\", ${if (capName == extension.className) "$OPENCL_PACKAGE.${extension.className}" else extension.className}.isAvailable(this))")
            println(";")
        }
        println("$t}")

        print("\n}")
    }

})

// DSL Extensions

fun String.nativeClassCL(templateName: String, postfix: String = "", init: (NativeClass.() -> Unit)? = null) =
    nativeClass("org.lwjgl.opencl", templateName, prefix = "CL", postfix = postfix, prefixTemplate = "cl", binding = CLBinding, init = init)

val NativeClass.extensionLink: String
    get() = extensionLink(templateName)

fun NativeClass.extensionLink(
    txt: String,
    prefix: String = txt.substring(0, txt.indexOf('_')),
    name: String = templateName
) = url("http://www.khronos.org/registry/cl/extensions/$prefix/cl_$txt.txt", name)

val NativeClass.extensionName: String
    get() = "<strong>$templateName</strong>"