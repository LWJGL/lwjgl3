/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal

import org.lwjgl.generator.*
import java.io.*

private const val CAPABILITIES_CLASS = "ALCapabilities"

private val ALBinding = Generator.register(object : APIBinding(
    Module.OPENAL,
    CAPABILITIES_CLASS,
    APICapabilities.JAVA_CAPABILITIES
) {

    override fun shouldCheckFunctionAddress(function: Func): Boolean = function.nativeClass.templateName != "AL10"

    override fun generateFunctionAddress(writer: PrintWriter, function: Func) {
        writer.println("$t${t}long $FUNCTION_ADDRESS = AL.getICD().${function.name};")
    }

    override fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass) {
        println("\n${t}static boolean isAvailable($CAPABILITIES_CLASS caps) {")
        print("$t${t}return checkFunctions(")
        nativeClass.printPointers(this, { "caps.${it.name}" })
        println(");")
        println("$t}")
    }

    init {
        javaImport(
            "org.lwjgl.*",
            "static org.lwjgl.system.APIUtil.*"
        )

        documentation = "Defines the capabilities of an OpenAL context."
    }

    override fun PrintWriter.generateJava() {
        generateJavaPreamble()
        println("public final class $CAPABILITIES_CLASS {\n")

        val classes = super.getClasses("AL")

        val addresses = classes.getFunctionPointers()

        println("${t}public final long")
        println(addresses.map(Func::name).joinToString(",\n$t$t", prefix = "$t$t", postfix = ";\n"))

        classes.forEach {
            println(it.getCapabilityJavadoc())
            println("${t}public final boolean ${it.capName("AL")};")
        }

        println("""
    /** Off-heap array of the above function addresses. */
    final PointerBuffer addresses;

    $CAPABILITIES_CLASS(FunctionProvider provider, Set<String> ext) {""")

        println(addresses.joinToString("\n$t$t", prefix = "$t$t") { "${it.name} = provider.getFunctionAddress(${it.functionAddress});" })

        for (extension in classes) {
            val capName = extension.capName("AL")
            print("\n$t$t$capName = ext.contains(\"$capName\")")
            if (extension.hasNativeFunctions)
                print(" && checkExtension(\"$capName\", ${if (capName == extension.className) "$packageName.${extension.className}" else extension.className}.isAvailable(this))")
            print(";")
        }
        print("""

        addresses = ThreadLocalUtil.getAddressesFromCapabilities(this);
    }

    private static boolean checkExtension(String extension, boolean supported) {
        if (supported) {
            return true;
        }

        apiLog("[AL] " + extension + " was reported as available but an entry point is missing.");
        return false;
    }

}""")
    }

})

// DSL Extensions

fun String.nativeClassAL(templateName: String, prefixTemplate: String = "AL", postfix: String = "", init: (NativeClass.() -> Unit)? = null) =
    nativeClass(Module.OPENAL, templateName, prefix = "AL", prefixTemplate = prefixTemplate, postfix = postfix, binding = ALBinding, init = init)

val NativeClass.specLinkOpenALSoft: String get() = url("http://kcat.strangesoft.net/openal-extensions/$templateName.txt", templateName)
val NativeClass.extensionName: String get() = "{@code ${prefixTemplate}_$templateName}"