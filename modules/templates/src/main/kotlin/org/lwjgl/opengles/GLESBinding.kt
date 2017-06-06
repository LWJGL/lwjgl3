/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles

import org.lwjgl.generator.*
import java.io.*

val NativeClass.capName: String
    get() = if (templateName.startsWith(prefixTemplate)) templateName else "${prefixTemplate}_$templateName"

private val CAPABILITIES_CLASS = "GLESCapabilities"

private object BufferOffsetTransform : FunctionTransform<Parameter>, SkipCheckFunctionTransform {
    override fun transformDeclaration(param: Parameter, original: String) = "long ${param.name}"
    override fun transformCall(param: Parameter, original: String) = param.name
}

private val GLESBinding = Generator.register(object : APIBinding(
    GLES_PACKAGE,
    CAPABILITIES_CLASS,
    APICapabilities.JNI_CAPABILITIES
) {

    private val classes: List<NativeClass> by lazy {
        super.getClasses { o1, o2 ->
            // Core functionality first, extensions after
            val isGLES1 = o1.templateName.startsWith("GLES")
            val isGLES2 = o2.templateName.startsWith("GLES")

            if (isGLES1 xor isGLES2)
                (if (isGLES1) -1 else 1)
            else
                o1.templateName.compareTo(o2.templateName, ignoreCase = true)
        }
    }

    private val functions: java.util.SortedSet<Func> by lazy {
        classes
            .filter { it.hasNativeFunctions }
            .map { it.functions }
            .flatten()
            .toSortedSet(Comparator<Func> { o1, o2 -> o1.name.compareTo(o2.name) })
    }

    private val functionOrdinals: Map<String, Int> by lazy {
        val ordinals = HashMap<String, Int>(512)
        var i = 0
        functions.asSequence()
            .forEach {
                ordinals[it.name] = i++
            }
        ordinals
    }

    override fun getFunctionOrdinal(function: Func) = functionOrdinals[function.name]!!

    override fun generateAlternativeMethods(writer: PrintWriter, function: Func, transforms: MutableMap<QualifiedType, Transform>) {
        val boParams = function.getParams { it.has<BufferObject>() && it.nativeType.mapping != PrimitiveMapping.POINTER && it.nativeType !is ArrayType }
        if (boParams.any()) {
            boParams.forEach { transforms[it] = BufferOffsetTransform }
            function.generateAlternativeMethod(writer, function.name, transforms)
            boParams.forEach { transforms.remove(it) }
        }
    }

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
            print("$t/**\n$t * <p>$link</p>\n$t * \n")
            if (documentation.indexOf('\n') == -1) {
                print("$t * ")
                println(documentation.substring("$t/** ".length, documentation.length - 3))
                println("$t */")
            } else {
                println(documentation.substring("$t/**\n".length))
            }
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

        println(functions.map { "${it.name} = provider.getFunctionAddress(${it.functionAddress});" }.joinToString(prefix = "$t$t", separator = "\n$t$t"))

        for (extension in classes) {
            val capName = extension.capName
            if (extension.hasNativeFunctions) {
                print("\n$t$t$capName = ext.contains(\"$capName\") && checkExtension(\"$capName\", ${if (capName == extension.className) "$GLES_PACKAGE.${extension.className}" else extension.className}.isAvailable(this")
                if (extension.functions.any { it.has<DependsOn>() }) print(", ext")
                print("));")
            } else
                print("\n$t$t$capName = ext.contains(\"$capName\");")
        }
        print("""

        addresses = ThreadLocalUtil.getAddressesFromCapabilities(this);
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
    GLES_PACKAGE,
    templateName,
    nativeSubPath = nativeSubPath,
    prefix = prefix,
    prefixMethod = prefixMethod,
    postfix = postfix,
    binding = GLESBinding,
    library = "GLES.initialize();",
    init = {
        init()
        if (functions.any())
            nativeImport("opengles.h")
    }
)

val NativeClass.capLink: String get() = "{@link $CAPABILITIES_CLASS\\#$capName $templateName}"

private val REGISTRY_PATTERN = "([A-Z]+)_(\\w+)".toRegex()
val NativeClass.registryLink: String get() = (REGISTRY_PATTERN.matchEntire(templateName) ?: throw IllegalStateException("Non-standard extension name: $templateName"))
    .let {
        url("https://www.khronos.org/registry/gles/extensions/${it.groupValues[1]}/$templateName.txt", templateName)
    }

fun NativeClass.registryLink(prefix: String, name: String): String =
    url("https://www.khronos.org/registry/gles/extensions/$prefix/$name.txt", templateName)

val NativeClass.core: String get() = "{@link ${this.className} GLES ${this.className[4]}.${this.className[5]}}"
val NativeClass.promoted: String get() = "Promoted to core in ${this.core}."