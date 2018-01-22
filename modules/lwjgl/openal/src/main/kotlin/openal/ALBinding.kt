/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal

import org.lwjgl.generator.*
import java.io.*

private val CAPABILITIES_CLASS = "ALCapabilities"

private val ALBinding = Generator.register(object : APIBinding(
    OPENAL_PACKAGE,
    CAPABILITIES_CLASS,
    APICapabilities.JAVA_CAPABILITIES,
    callingConvention = CallingConvention.DEFAULT
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

        val classes = super.getClasses { o1, o2 ->
            val isAL1 = o1.templateName.startsWith("AL")
            val isAL2 = o2.templateName.startsWith("AL")

            if (isAL1 xor isAL2)
                (if (isAL1) -1 else 1)
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
            println("${t}public final boolean ${it.capName("AL")};")
        }

        println("""
    /** Off-heap array of the above function addresses. */
    final PointerBuffer addresses;

    $CAPABILITIES_CLASS(FunctionProvider provider, Set<String> ext) {""")

        println(addresses.map { "${it.name} = provider.getFunctionAddress(${it.functionAddress});" }.joinToString("\n$t$t", prefix = "$t$t"))

        for (extension in classes) {
            val capName = extension.capName("AL")
            print("\n$t$t$capName = ext.contains(\"$capName\")")
            if (extension.hasNativeFunctions)
                print(" && checkExtension(\"$capName\", ${if (capName == extension.className) "$OPENAL_PACKAGE.${extension.className}" else extension.className}.isAvailable(this))")
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
    nativeClass(OPENAL_PACKAGE, templateName, prefix = "AL", prefixTemplate = prefixTemplate, postfix = postfix, binding = ALBinding, init = init)

val NativeClass.specLinkOpenALSoft: String get() = url("http://kcat.strangesoft.net/openal-extensions/$templateName.txt", templateName)
val NativeClass.extensionName: String get() = "{@code ${prefixTemplate}_$templateName}"