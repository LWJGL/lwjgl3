/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl

import org.lwjgl.generator.*
import java.io.*

private const val CAPABILITIES_CLASS = "GLXCapabilities"

val GLXBinding = Generator.register(object : APIBinding(
    Module.OPENGL,
    CAPABILITIES_CLASS,
    APICapabilities.JAVA_CAPABILITIES
) {

    override fun generateFunctionAddress(writer: PrintWriter, function: Func) {
        writer.println("$t${t}long $FUNCTION_ADDRESS = GL.getCapabilitiesGLXClient().${function.name};")
    }

    override fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass) {
        println("\n${t}static boolean isAvailable($CAPABILITIES_CLASS caps) {")
        print("$t${t}return ")

        print("checkFunctions(")
        nativeClass.printPointers(this, { "caps.${it.name}" }) { !(it has IgnoreMissing) }
        println(");")
        println("$t}")
    }

    init {
        javaImport("static org.lwjgl.system.APIUtil.*")

        documentation = "Defines the GLX capabilities of a connection."
    }

    override fun PrintWriter.generateJava() {
        generateJavaPreamble()
        println("public final class $CAPABILITIES_CLASS {\n")

        val classes = getClasses("GLX")

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
            print(if (extension.hasNativeFunctions)
                "\n$t$t$capName = ext.contains(\"$capName\") && checkExtension(\"$capName\", ${if (capName == extension.className) "$packageName.${extension.className}" else extension.className}.isAvailable(this));"
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

        apiLog("[GLX] " + extension + " was reported as available but an entry point is missing.");
        return false;
    }

}""")
    }

})

fun String.nativeClassGLX(templateName: String, postfix: String = "", init: (NativeClass.() -> Unit)? = null) = nativeClass(
    Module.OPENGL,
    templateName,
    prefix = "GLX",
    prefixMethod = "glX",
    postfix = postfix,
    binding = GLXBinding,
    init = init
)