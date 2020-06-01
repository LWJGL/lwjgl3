/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl

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

private const val CAPABILITIES_CLASS = "CLCapabilities"

private val CLBinding = Generator.register(object : APIBinding(
    Module.OPENCL,
    CAPABILITIES_CLASS,
    APICapabilities.JAVA_CAPABILITIES
) {

    override fun printCustomJavadoc(writer: PrintWriter, function: Func, documentation: String): Boolean {
        if (function.nativeClass.templateName.startsWith("CL")) {
            writer.printOpenCLJavaDoc(documentation, function.nativeName, if (function.has<DeprecatedCL>()) function.get<DeprecatedCL>().after else "2.1") // TODO: update to 2.2 when available
            return true
        }
        return false
    }

    private fun PrintWriter.printOpenCLJavaDoc(documentation: String, function: String, version: String) {
        val link = url("https://www.khronos.org/registry/OpenCL/sdk/$version/docs/man/xhtml/$function.html", "Reference Page")
        val injectedJavaDoc =
            if (version != "2.1")
                "$link - <em>This function is deprecated after OpenCL $version</em>"
            else
                link

        if (documentation.isEmpty())
            println("$t/** $injectedJavaDoc */")
        else {
            if (documentation.indexOf('\n') == -1) {
                println("$t/**")
                print("$t * ")
                print(documentation.substring("$t/** ".length, documentation.length - " */".length))
            } else {
                print(documentation.substring(0, documentation.length - "\n$t */".length))
            }
            print("\n$t * ")
            print("\n$t * @see $injectedJavaDoc")
            println("\n$t */")
        }
    }

    override fun shouldCheckFunctionAddress(function: Func): Boolean = function.nativeClass.templateName != "CL10"

    override fun generateFunctionAddress(writer: PrintWriter, function: Func) {
        writer.println("$t${t}long $FUNCTION_ADDRESS = CL.getICD().${function.name};")
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

        val classes = super.getClasses("CL")

        val addresses = classes.getFunctionPointers()

        println("${t}public final long")
        println(addresses.map(Func::name).joinToString(",\n$t$t", prefix = "$t$t", postfix = ";\n"))

        classes.forEach {
            println(it.getCapabilityJavadoc())
            println("${t}public final boolean ${it.capName};")
        }

        // ICD/Platform constructor
        println("\n$t$CAPABILITIES_CLASS(FunctionProvider provider, Set<String> ext) {")
        println(addresses.joinToString(",\n$t$t$t", prefix = "$t${t}this(ext,\n$t$t$t", postfix = "\n$t$t);\n$t}") {
            "provider.getFunctionAddress(${it.functionAddress})"
        })

        // Device constructor
        println("\n$t$CAPABILITIES_CLASS(CLCapabilities caps, Set<String> ext) {")
        println(addresses.joinToString(",\n$t$t$t", prefix = "$t${t}this(ext,\n$t$t$t", postfix = "\n$t$t);\n$t}") {
            "caps.${it.name}"
        })

        // Common constructor
        println("\n${t}private $CAPABILITIES_CLASS(Set<String> ext, long... functions) {")
        println(addresses.mapIndexed { i, function -> "${function.name} = functions[$i];" }.joinToString("\n$t$t", prefix = "$t$t"))
        for (extension in classes) {
            val capName = extension.capName
            print(
                if (extension.hasNativeFunctions)
                    "\n$t$t$capName = check_${extension.templateName}(ext);"
                else
                    "\n$t$t$capName = ext.contains(\"$capName\");"
            )
        }
        print("""
    }

    private static boolean checkExtension(String extension, boolean supported) {
        if (supported) {
            return true;
        }

        apiLog("[CL] " + extension + " was reported as available but an entry point is missing.");
        return false;
    }
""")

        for (extension in classes) {
            if (!extension.hasNativeFunctions) {
                continue
            }

            checkExtensionFunctions(extension)
        }

        println("\n}")
    }

})

// DSL Extensions

fun String.nativeClassCL(templateName: String, postfix: String = "", init: (NativeClass.() -> Unit)? = null) =
    nativeClass(Module.OPENCL, templateName, prefix = "CL", postfix = postfix, prefixTemplate = "cl", binding = CLBinding, init = init)

val NativeClass.extensionLink: String
    get() = extensionLink(templateName)

fun NativeClass.extensionLink(
    txt: String,
    prefix: String = txt.substring(0, txt.indexOf('_')),
    name: String = templateName
) = url("http://www.khronos.org/registry/OpenCL/extensions/$prefix/cl_$txt.txt", name)

val NativeClass.extensionName: String
    get() = "<strong>$templateName</strong>"