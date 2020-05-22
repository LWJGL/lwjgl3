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

    private fun PrintWriter.checkExtensionFunctions(nativeClass: NativeClass) {
        val capName = nativeClass.capName("AL")

        println("\n${t}private boolean check_${nativeClass.templateName}(java.util.Set<String> ext) {")
        print("$t${t}return ext.contains(\"$capName\") && checkExtension(\"$capName\", checkFunctions(")
        nativeClass.printPointers(this, { it.name })
        println("));")
        println("$t}")
    }

    init {
        javaImport(
            "org.lwjgl.*",
            "java.lang.reflect.Field",
            "java.util.List",
            "java.util.function.IntFunction",
            "static org.lwjgl.system.APIUtil.*",
            "static org.lwjgl.system.Checks.*"
        )

        documentation = "Defines the capabilities of an OpenAL context."
    }

    override fun PrintWriter.generateJava() {
        val classes = super.getClasses("AL")
        val addresses = classes.getFunctionPointers()

        generateJavaPreamble()
        println("""public final class $CAPABILITIES_CLASS {

    static final List<Field> ADDRESS_FIELDS = ThreadLocalUtil.getFieldsFromCapabilities($CAPABILITIES_CLASS.class, ${addresses.size});
""")

        println("${t}public final long")
        println(addresses.map(Func::name).joinToString(",\n$t$t", prefix = "$t$t", postfix = ";\n"))

        classes.forEach {
            println(it.getCapabilityJavadoc())
            println("${t}public final boolean ${it.capName("AL")};")
        }

        println("""
    /** Off-heap array of the above function addresses. */
    final PointerBuffer addresses;

    $CAPABILITIES_CLASS(FunctionProvider provider, Set<String> ext, IntFunction<PointerBuffer> bufferFactory) {"""
        )

        println(addresses.joinToString("\n$t$t", prefix = "$t$t") { "${it.name} = provider.getFunctionAddress(${it.functionAddress});" })

        for (extension in classes) {
            val capName = extension.capName("AL")
            print(
                if (extension.hasNativeFunctions)
                    "\n$t$t$capName = check_${extension.templateName}(ext);"
                else
                    "\n$t$t$capName = ext.contains(\"$capName\");"
            )
        }
        print("""

        addresses = ThreadLocalUtil.getAddressesFromCapabilities(this, ADDRESS_FIELDS, bufferFactory);
    }

    /** Returns the buffer of OpenAL function pointers. */
    public PointerBuffer getAddressBuffer() {
        return addresses;
    }

    private static boolean checkExtension(String extension, boolean supported) {
        if (supported) {
            return true;
        }

        apiLog("[AL] " + extension + " was reported as available but an entry point is missing.");
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

fun String.nativeClassAL(templateName: String, prefixTemplate: String = "AL", postfix: String = "", init: (NativeClass.() -> Unit)? = null) =
    nativeClass(Module.OPENAL, templateName, prefix = "AL", prefixTemplate = prefixTemplate, postfix = postfix, binding = ALBinding, init = init)

val NativeClass.specLinkOpenALSoft: String get() = url("http://kcat.strangesoft.net/openal-extensions/$templateName.txt", templateName)
val NativeClass.extensionName: String get() = "{@code ${prefixTemplate}_$templateName}"