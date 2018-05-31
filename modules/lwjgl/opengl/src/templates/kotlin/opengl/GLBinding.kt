/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl

import org.lwjgl.generator.*
import java.io.*

val NativeClass.capName: String
    get() = if (templateName.startsWith(prefixTemplate)) {
        if (prefix == "GL")
            "OpenGL${templateName.substring(2)}"
        else
            templateName
    } else {
        "${prefixTemplate}_$templateName"
    }

private val CORE_PATTERN = "GL\\d\\dC".toRegex()
val NativeClass.isCore: Boolean
    get() = CORE_PATTERN.matches(templateName)

private const val CAPABILITIES_CLASS = "GLCapabilities"

private object BufferOffsetTransform : FunctionTransform<Parameter>, SkipCheckFunctionTransform {
    override fun transformDeclaration(param: Parameter, original: String) = "long ${param.name}"
    override fun transformCall(param: Parameter, original: String) = param.name
}

val GLBinding = Generator.register(object : APIBinding(
    Module.OPENGL,
    CAPABILITIES_CLASS,
    APICapabilities.JNI_CAPABILITIES
) {

    private val classes by lazy { super.getClasses("GL") }

    private val functions by lazy {
        classes
            .asSequence()
            .filter { it.hasNativeFunctions }
            .flatMap { it.functions.asSequence() }
            .filter { !it.has<Reuse>() }
            .toList()
    }

    private val functionOrdinals by lazy {
        functions.asSequence()
            .mapIndexed { index, func -> func.name to index }
            .toMap()
    }

    override fun getFunctionOrdinal(function: Func) = functionOrdinals[function.name]!!

    override fun generateAlternativeMethods(writer: PrintWriter, function: Func, transforms: MutableMap<QualifiedType, Transform>) {
        val boParams = function.getParams { it.has<BufferObject>() && it.nativeType.mapping != PrimitiveMapping.POINTER && it.nativeType !is ArrayType<*> }
        if (boParams.any()) {
            boParams.forEach { transforms[it] = BufferOffsetTransform }
            function.generateAlternativeMethod(writer, function.name, transforms)
            boParams.forEach { transforms.remove(it) }
        }
    }

    override fun printCustomJavadoc(writer: PrintWriter, function: Func, documentation: String): Boolean {
        if (function.nativeClass.templateName.startsWith("GL")) {
            writer.printOpenGLJavaDoc(documentation, function.nativeName, function has DeprecatedGL)
            return true
        }
        return false
    }

    private val VECTOR_SUFFIX = "^gl(\\w+?)[ILP]?(?:Matrix)?\\d+(x\\d+)?N?u?(?:[bsifd]|i64)_?v?$".toRegex()
    private val VECTOR_SUFFIX2 = "^gl(?:(Get)n?)?(\\w+?)[ILP]?\\d*N?u?(?:[bsifd]|i64)v$".toRegex()
    private val NAMED = "^gl(\\w+?)?Named([A-Z]\\w*)$".toRegex()

    private fun PrintWriter.printOpenGLJavaDoc(documentation: String, function: String, deprecated: Boolean) {
        val page = VECTOR_SUFFIX.find(function).let {
            if (it == null)
                function
            else
                "gl${it.groupValues[1]}"
        }.let { page ->
            VECTOR_SUFFIX2.find(page).let {
                when {
                    it == null                  -> page
                    page == "glScissorIndexedv" -> "glScissorIndexed"
                    else                        -> "gl${it.groupValues[1]}${it.groupValues[2]}"
                }
            }
        }.let { page ->
            NAMED.find(page).let {
                if (it == null)
                    page
                else
                    "gl${it.groupValues[1]}${it.groupValues[2]}"
            }
        }

        val link = url("http://docs.gl/gl${if (deprecated) "3" else "4"}/$page", "Reference Page")
        val injectedJavaDoc =
            if (deprecated)
                "$link - <em>This function is deprecated and unavailable in the Core profile</em>"
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

    private val Sequence<Func>.hasDeprecated: Boolean
        get() = this.any { it has DeprecatedGL }

    override fun shouldCheckFunctionAddress(function: Func): Boolean = function.nativeClass.templateName != "GL11" || function has DeprecatedGL

    override fun generateFunctionAddress(writer: PrintWriter, function: Func) {
        writer.println("$t${t}long $FUNCTION_ADDRESS = GL.getICD().${function.name};")
    }

    private val EXTENSION_NAME = "[A-Za-z0-9_]+".toRegex()

    override fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass) {
        if (nativeClass.isCore) {
            return
        }

        val hasDeprecated = nativeClass.functions.hasDeprecated

        print("\n${t}static boolean isAvailable($CAPABILITIES_CLASS caps")
        if (nativeClass.functions.any { it.has<DependsOn>() }) print(", java.util.Set<String> ext")
        if (hasDeprecated) print(", boolean fc")
        println(") {")
        print("$t${t}return ")

        val printPointer = { func: Func ->
            if (func.has<DependsOn>())
                "${func.get<DependsOn>().reference.let { if (EXTENSION_NAME.matches(it)) "ext.contains(\"$it\")" else it }} ? caps.${func.name} : -1L"
            else
                "caps.${func.name}"
        }

        if (hasDeprecated) {
            print("(fc || checkFunctions(")
            nativeClass.printPointers(this, printPointer) { it has DeprecatedGL && !it.has<DependsOn>() }
            print(")) && ")
        }

        print("checkFunctions(")
        if (hasDeprecated)
            nativeClass.printPointers(this, printPointer) { (!it.has(DeprecatedGL) || it.has<DependsOn>()) && !it.has(IgnoreMissing) }
        else
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

        documentation = "Defines the capabilities of an OpenGL context."
    }

    override fun PrintWriter.generateJava() {
        generateJavaPreamble()
        println("public final class $CAPABILITIES_CLASS {\n")

        println("${t}public final long")
        println(functions
            .map(Func::name)
            .joinToString(",\n$t$t", prefix = "$t$t", postfix = ";\n"))

        classes.asSequence()
            .filter { !it.isCore }
            .forEach {
                println(it.getCapabilityJavadoc())
                println("${t}public final boolean ${it.capName};")
            }

        println("""
    /** When true, deprecated functions are not available. */
    public final boolean forwardCompatible;

    /** Off-heap array of the above function addresses. */
    final PointerBuffer addresses;

    $CAPABILITIES_CLASS(FunctionProvider provider, Set<String> ext, boolean fc) {
        forwardCompatible = fc;
""")

        println(functions.joinToString(prefix = "$t$t", separator = "\n$t$t") {
            if (it has DeprecatedGL && !it.has<DependsOn>())
                "${it.name} = getFunctionAddress(fc, provider, ${it.functionAddress});"
            else
                "${it.name} = provider.getFunctionAddress(${it.functionAddress});"
        })

        for (extension in classes) {
            if (extension.isCore) {
                continue
            }
            val capName = extension.capName
            if (extension.hasNativeFunctions) {
                print("\n$t$t$capName = ext.contains(\"$capName\") && checkExtension(\"$capName\", ${if (capName == extension.className) "$packageName.${extension.className}" else extension.className}.isAvailable(this")
                if (extension.functions.any { it.has<DependsOn>() }) print(", ext")
                if (extension.functions.hasDeprecated) print(", fc")
                print("));")
            } else
                print("\n$t$t$capName = ext.contains(\"$capName\");")
        }
        print("""

        addresses = ThreadLocalUtil.getAddressesFromCapabilities(this);
    }

    boolean hasDSA(Set<String> ext) {
        return ext.contains("GL45") || ext.contains("GL_ARB_direct_state_access") || ext.contains("GL_EXT_direct_state_access");
    }

    private static long getFunctionAddress(boolean fc, FunctionProvider provider, String functionName) {
        return fc ? NULL : provider.getFunctionAddress(functionName);
    }

    private static boolean checkExtension(String extension, boolean supported) {
        if (supported) {
            return true;
        }

        apiLog("[GL] " + extension + " was reported as available but an entry point is missing.");
        return false;
    }

}""")
    }

})

// DSL Extensions

fun String.nativeClassGL(
    templateName: String,
    prefix: String = "GL",
    prefixMethod: String = prefix.toLowerCase(),
    postfix: String = "",
    init: NativeClass.() -> Unit
) = nativeClass(
    Module.OPENGL,
    templateName,
    prefix = prefix,
    prefixMethod = prefixMethod,
    postfix = postfix,
    binding = GLBinding,
    library = "GL.initialize();",
    init = {
        init()
        if (!skipNative) {
            nativeImport("opengl.h")
        }
    }
)

private val REGISTRY_PATTERN = "([A-Z]+)_\\w+".toRegex()
val NativeClass.registryLink: String
    get() = url("https://www.khronos.org/registry/OpenGL/extensions/${if (postfix.isNotEmpty()) postfix else {
        (REGISTRY_PATTERN.matchEntire(templateName) ?: throw IllegalStateException("Non-standard extension name: $templateName")).groups[1]!!.value
    }}/$templateName.txt", templateName)

fun NativeClass.registryLink(group: String, name: String): String =
    url("https://www.khronos.org/registry/OpenGL/extensions/$group/${group}_$name.txt", templateName)
fun NativeClass.registryLink(spec: String): String =
    url("https://www.khronos.org/registry/OpenGL/extensions/$postfix/$spec.txt", templateName)

fun registryLinkTo(group: String, name: String): String = "${group}_$name".let {
    url("https://www.khronos.org/registry/OpenGL/extensions/$group/$it.txt", it)
}

val NativeClass.core: String get() = "{@link ${this.className} OpenGL ${this.className[2]}.${this.className[3]}}"
val NativeClass.glx: String get() = "{@link ${this.className} GLX ${this.className[3]}.${this.className[4]}}"
val NativeClass.promoted: String get() = "Promoted to core in ${this.core}."