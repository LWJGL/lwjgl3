/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal

import org.lwjgl.generator.*
import java.io.*

fun NativeClass.capName(core: String) =
    if (templateName.startsWith(prefixTemplate)) {
        if (prefix == core)
            "Open$core${templateName.substring(core.length)}"
        else
            templateName
    } else {
        "${prefixTemplate}_$templateName"
    }

private val NativeClass.isCore: Boolean get() = templateName.startsWith("ALC")

private const val ALC_CAP_CLASS = "ALCCapabilities"

val ALCBinding = Generator.register(object : APIBinding(
    Module.OPENAL,
    ALC_CAP_CLASS,
    APICapabilities.JAVA_CAPABILITIES
) {

    override fun shouldCheckFunctionAddress(function: Func): Boolean = function.nativeClass.templateName != "ALC10"

    override fun generateFunctionAddress(writer: PrintWriter, function: Func) {
        writer.println("\t\tlong $FUNCTION_ADDRESS = ALC.getICD().${function.name};")
    }

    private fun PrintWriter.checkExtensionFunctions(nativeClass: NativeClass) {
        val capName = nativeClass.capName("ALC")

        println("\n\tprivate boolean check_${nativeClass.templateName}(java.util.Set<String> ext) {")
        print("\t\treturn ext.contains(\"$capName\") && checkExtension(\"$capName\", checkFunctions(")
        nativeClass.printPointers(this, { it.name })
        println("));")
        println("\t}")
    }

    init {
        javaImport(
            "static org.lwjgl.system.APIUtil.*",
            "static org.lwjgl.system.Checks.*"
        )

        documentation = "Defines the capabilities of the OpenAL Context API."
    }

    override fun PrintWriter.generateJava() {
        generateJavaPreamble()
        println("public final class $ALC_CAP_CLASS {\n")

        val classes = super.getClasses("ALC")

        val addresses = classes
            .filter { it.hasNativeFunctions && it.prefix == "ALC" }
            .getFunctionPointers()

        println("\tpublic final long")
        println(addresses.map(Func::name).joinToString(",\n\t\t", prefix = "\t\t", postfix = ";\n"))

        classes.forEach {
            println(it.getCapabilityJavadoc())
            println("\tpublic final boolean ${it.capName("ALC")};")
        }

        println("\n\t$ALC_CAP_CLASS(FunctionProviderLocal provider, long device, Set<String> ext) {")

        println(addresses.joinToString("\n\t\t", prefix = "\t\t") { "${it.name} = provider.getFunctionAddress(${if (it.nativeClass.isCore) "" else "device, "}${it.functionAddress});" })

        for (extension in classes) {
            val capName = extension.capName("ALC")
            print(
                if (extension.hasNativeFunctions && extension.prefix == "ALC")
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

        apiLog("[ALC] " + extension + " was reported as available but an entry point is missing.");
        return false;
    }
""")

        for (extension in classes) {
            if (extension.hasNativeFunctions && extension.prefix == "ALC") {
                checkExtensionFunctions(extension)
            }
        }

        println("\n}")
    }

})

// DSL Extensions

fun String.nativeClassALC(templateName: String, prefix: String = "ALC", postfix: String = "", init: (NativeClass.() -> Unit)? = null) =
    nativeClass(Module.OPENAL, templateName, prefix = prefix, prefixTemplate = "ALC", postfix = postfix, binding = ALCBinding, init = init)