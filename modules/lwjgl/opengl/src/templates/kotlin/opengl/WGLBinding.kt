/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl

import org.lwjgl.generator.*
import java.io.*

private const val CAPABILITIES_CLASS = "WGLCapabilities"

val WGLBinding = Generator.register(object : APIBinding(
    Module.OPENGL,
    CAPABILITIES_CLASS,
    APICapabilities.JAVA_CAPABILITIES
) {

    override fun generateFunctionAddress(writer: PrintWriter, function: Func) {
        writer.println("$t${t}long $FUNCTION_ADDRESS = GL.getCapabilitiesWGL().${function.name};")
    }

    private fun PrintWriter.checkExtensionFunctions(nativeClass: NativeClass) {
        val capName = nativeClass.capName

        println("\n${t}private boolean check_${nativeClass.templateName}(java.util.Set<String> ext) {")
        print("$t${t}return ext.contains(\"$capName\") && checkExtension(\"$capName\", checkFunctions(")
        nativeClass.printPointers(this, { it.name }) { !(it has IgnoreMissing) }
        println("));")
        println("$t}")
    }

    init {
        javaImport(
            "static org.lwjgl.system.APIUtil.*",
            "static org.lwjgl.system.Checks.*"
        )

        documentation = "Defines the WGL capabilities of an OpenGL device."
    }

    override fun PrintWriter.generateJava() {
        generateJavaPreamble()
        println("public final class $CAPABILITIES_CLASS {\n")

        val classes = getClasses("WGL")

        val addresses = classes.getFunctionPointers()

        println("${t}public final long")
        println(addresses.map(Func::name).joinToString(",\n$t$t", prefix = "$t$t", postfix = ";\n")
        )

        classes.forEach {
            println(it.getCapabilityJavadoc())
            println("${t}public final boolean ${it.capName};")
        }

        println("\n$t$CAPABILITIES_CLASS(FunctionProvider provider, Set<String> ext) {")

        println(
            addresses.joinToString(prefix = "$t$t", separator = "\n$t$t") {
                "${it.name} = provider.getFunctionAddress(${it.functionAddress});"
            }
        )

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

        apiLog("[WGL] " + extension + " was reported as available but an entry point is missing.");
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

fun String.nativeClassWGL(templateName: String, postfix: String = "", init: (NativeClass.() -> Unit)? = null) = nativeClass(
    Module.OPENGL,
    templateName,
    prefix = "WGL",
    postfix = postfix,
    binding = WGLBinding,
    init = init
)