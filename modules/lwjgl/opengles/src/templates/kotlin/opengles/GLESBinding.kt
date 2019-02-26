/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles

import org.lwjgl.generator.*
import org.lwjgl.generator.Generator.Companion.register
import java.io.*

val NativeClass.capName: String
    get() = if (templateName.startsWith(prefixTemplate)) templateName else "${prefixTemplate}_$templateName"

private const val CAPABILITIES_CLASS = "GLESCapabilities"

private val GLESBinding = register(object : APIBinding(
    Module.OPENGLES,
    CAPABILITIES_CLASS,
    APICapabilities.JNI_CAPABILITIES
) {

    private val classes by lazy { super.getClasses("GLES") }

    private val functions by lazy { classes.getFunctionPointers() }

    private val functionOrdinals by lazy {
        val ordinals = HashMap<String, Int>(512)
        var i = 0
        functions.asSequence()
            .forEach {
                ordinals[it.name] = i++
            }
        ordinals
    }

    override fun getFunctionOrdinal(function: Func) = functionOrdinals[function.name]!!

    override fun printCustomJavadoc(writer: PrintWriter, function: Func, documentation: String): Boolean {
        if (function.nativeClass.templateName.startsWith("GLES")) {
            writer.printOpenGLJavaDoc(documentation, function.nativeName)
            return true
        }
        return false
    }

    private val VECTOR_SUFFIX = "^gl(\\w+?)[ILP]?(?:Matrix)?\\d+(x\\d+)?N?u?(?:[bsifd]|i64)_?v?$".toRegex()
    private val VECTOR_SUFFIX2 = "^gl(?:(Get)n?)?(\\w+?)[ILP]?\\d*N?u?(?:[bsifd]|i64)v$".toRegex()
    private val NAMED = "^gl(\\w+?)?Named([A-Z]\\w*)$".toRegex()

    private fun PrintWriter.printOpenGLJavaDoc(documentation: String, function: String) {
        val page = VECTOR_SUFFIX.find(function).let {
            if (it == null)
                function
            else
                "gl${it.groupValues[1]}"
        }.let { page ->
            VECTOR_SUFFIX2.find(page).let {
                if (it == null)
                    page
                else
                    "gl${it.groupValues[1]}${it.groupValues[2]}"
            }
        }.let { page ->
            NAMED.find(page).let {
                if (it == null)
                    page
                else
                    "gl${it.groupValues[1]}${it.groupValues[2]}"
            }
        }

        val link = url("http://docs.gl/es3/$page", "Reference Page")

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

    override fun shouldCheckFunctionAddress(function: Func): Boolean = function.nativeClass.templateName != "GLES20"

    override fun generateFunctionAddress(writer: PrintWriter, function: Func) {
        writer.println("$t${t}long $FUNCTION_ADDRESS = GLES.getICD().${function.name};")
    }

    private val EXTENSION_NAME = "[A-Za-z0-9_]+".toRegex()

    override fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass) {
        print("\n${t}static boolean isAvailable($CAPABILITIES_CLASS caps")
        if (nativeClass.functions.any { it.has<DependsOn>() }) print(", java.util.Set<String> ext")
        println(") {")

        val printPointer = { func: Func ->
            if (func.has<DependsOn>())
                "${func.get<DependsOn>().reference.let { if (EXTENSION_NAME.matches(it)) "ext.contains(\"$it\")" else it }} ? caps.${func.name} : -1L"
            else
                "caps.${func.name}"
        }

        print("$t${t}return checkFunctions(")
        nativeClass.printPointers(this, printPointer) { !it.has(IgnoreMissing) }
        println(");")
        println("$t}")
    }

    init {
        javaImport(
            "org.lwjgl.*",
            "static org.lwjgl.system.APIUtil.*",
            "static org.lwjgl.system.MemoryUtil.*"
        )

        documentation = "Defines the capabilities of an OpenGL ES context."
    }

    override fun PrintWriter.generateJava() {
        generateJavaPreamble()
        println("public final class $CAPABILITIES_CLASS {\n")

        println("${t}public final long")
        println(functions
            .map(Func::name)
            .joinToString(",\n$t$t", prefix = "$t$t", postfix = ";\n"))

        classes.forEach {
            println(it.getCapabilityJavadoc())
            println("${t}public final boolean ${it.capName};")
        }

        print("""
    /** Off-heap array of the above function addresses. */
    final PointerBuffer addresses;

    $CAPABILITIES_CLASS(FunctionProvider provider, Set<String> ext) {
""")

        println(functions.joinToString(prefix = "$t$t", separator = "\n$t$t") { "${it.name} = provider.getFunctionAddress(${it.functionAddress});" })

        for (extension in classes) {
            val capName = extension.capName
            if (extension.hasNativeFunctions) {
                print("\n$t$t$capName = ext.contains(\"$capName\") && checkExtension(\"$capName\", ${if (capName == extension.className) "$packageName.${extension.className}" else extension.className}.isAvailable(this")
                if (extension.functions.any { it.has<DependsOn>() }) print(", ext")
                print("));")
            } else
                print("\n$t$t$capName = ext.contains(\"$capName\");")
        }
        print("""

        addresses = ThreadLocalUtil.getAddressesFromCapabilities(this);
    }

    boolean hasDSA(Set<String> ext) {
        return ext.contains("GL_ARB_direct_state_access") || ext.contains("GL_EXT_direct_state_access");
    }

    private static boolean checkExtension(String extension, boolean supported) {
        if (supported) {
            return true;
        }

        apiLog("[GLES] " + extension + " was reported as available but an entry point is missing.");
        return false;
    }

}""")
    }

})

fun String.nativeClassGLES(
    templateName: String,
    nativeSubPath: String = "",
    prefix: String = "GL",
    prefixMethod: String = prefix.toLowerCase(),
    postfix: String = "",
    init: NativeClass.() -> Unit
) = nativeClass(
    Module.OPENGLES,
    templateName,
    nativeSubPath = nativeSubPath,
    prefix = prefix,
    prefixMethod = prefixMethod,
    postfix = postfix,
    binding = GLESBinding,
    init = {
        init()
        if (!skipNative) {
            nativeImport("opengles.h")
        }
    }
)

val NativeClass.capLink: String get() = "{@link $CAPABILITIES_CLASS\\#$capName $templateName}"

private val REGISTRY_PATTERN = "([A-Z]+)_\\w+".toRegex()
val NativeClass.registryLink: String
    get() = url("https://www.khronos.org/registry/OpenGL/extensions/${if (postfix.isNotEmpty()) postfix else {
        (REGISTRY_PATTERN.matchEntire(templateName) ?: throw IllegalStateException("Non-standard extension name: $templateName")).groups[1]!!.value
    }}/$templateName.txt", templateName)

fun NativeClass.registryLink(spec: String): String =
    url("https://www.khronos.org/registry/OpenGL/extensions/$postfix/$spec.txt", templateName)

fun registryLinkTo(group: String, name: String): String = "${group}_$name".let {
    url("https://www.khronos.org/registry/OpenGL/extensions/$group/$it.txt", it)
}

val NativeClass.core: String get() = "{@link ${this.className} GLES ${this.className[4]}.${this.className[5]}}"
val NativeClass.promoted: String get() = "Promoted to core in ${this.core}."