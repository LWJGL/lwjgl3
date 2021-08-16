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
        LinkedHashMap<String, Int>().also { functionOrdinals ->
            classes.asSequence()
                .filter { it.hasNativeFunctions }
                .forEach {
                    it.functions.asSequence()
                        .forEach { cmd ->
                            if (!cmd.has<Macro>() && !functionOrdinals.contains(cmd.name)) {
                                functionOrdinals[cmd.name] = functionOrdinals.size
                            }
                        }
                }
        }
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

    private fun getFunctionDependencyExpression(func: Func) = func.get<DependsOn>()
        .reference
        .let { expression ->
            if (EXTENSION_NAME.matches(expression))
                "ext.contains(\"$expression\")"
            else
                expression
        }

    private fun PrintWriter.printCheckFunctions(
        nativeClass: NativeClass,
        dependencies: LinkedHashMap<String, Int>,
        filter: (Func) -> Boolean
    ) {
        print("checkFunctions(provider, caps, new int[] {")
        nativeClass.printPointers(this, { func ->
            val index = functionOrdinals[func.name]
            if (func.has<DependsOn>()) {
                "flag${dependencies[getFunctionDependencyExpression(func)]} + $index"
            } else{
                index.toString()
            }
        }, filter)
        print("},")
        nativeClass.printPointers(this, { "\"${it.name}\"" }, filter)
        print(")")
    }

    private fun PrintWriter.checkExtensionFunctions(nativeClass: NativeClass) {
        val capName = nativeClass.capName

        print("""
    private static boolean check_${nativeClass.templateName}(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("$capName")) {
            return false;
        }""")
        val dependencies = nativeClass.functions
            .filter { it.has<DependsOn>() }
            .map(::getFunctionDependencyExpression)
            .foldIndexed(LinkedHashMap<String, Int>()) { index, map, expression ->
                if (!map.containsKey(expression)) {
                    map[expression] = index
                }
                map
            }
        if (dependencies.isNotEmpty()) {
            println()
            dependencies.forEach { (expression, index) ->
                print("\n$t${t}int flag$index = $expression ? 0 : Integer.MIN_VALUE;")
            }
        }

        print("\n\n$t${t}return ")
        printCheckFunctions(nativeClass, dependencies) { it-> !it.has(IgnoreMissing) }
        println(" || reportMissing(\"GLES\", \"$capName\");")
        println("$t}")
    }

    init {
        javaImport(
            "org.lwjgl.*",
            "java.util.function.IntFunction",
            "static org.lwjgl.system.APIUtil.*",
            "static org.lwjgl.system.Checks.*"
        )

        documentation = "Defines the capabilities of an OpenGL ES context."
    }

    override fun PrintWriter.generateJava() {
        generateJavaPreamble()
        println("""public final class $CAPABILITIES_CLASS {

    static final int ADDRESS_BUFFER_SIZE = ${functions.size};""")

        val functionSet = LinkedHashSet<String>()
        classes.asSequence()
            .filter { it.hasNativeFunctions }
            .forEach {
                val functions = it.functions.asSequence()
                    .filter { cmd ->
                        if (!cmd.has<Macro>()) {
                            if (functionSet.add(cmd.name)) {
                                return@filter true
                            }
                        }
                        false
                    }
                    .joinToString(",\n$t$t") { cmd -> cmd.name }

                if (functions.isNotEmpty()) {
                    println("\n$t// ${it.templateName}")
                    println("${t}public final long")
                    println("$t$t$functions;")
                }
            }

        println()

        classes.forEach {
            println(it.getCapabilityJavadoc())
            println("${t}public final boolean ${it.capName};")
        }

        print("""
    /** Off-heap array of the above function addresses. */
    final PointerBuffer addresses;

    $CAPABILITIES_CLASS(FunctionProvider provider, Set<String> ext, IntFunction<PointerBuffer> bufferFactory) {
        PointerBuffer caps = bufferFactory.apply(ADDRESS_BUFFER_SIZE);
""")

        for (extension in classes) {
            val capName = extension.capName
            print(
                if (extension.hasNativeFunctions)
                    "\n$t$t$capName = check_${extension.templateName}(provider, caps, ext);"
                else
                    "\n$t$t$capName = ext.contains(\"$capName\");"
            )
        }

        println()
        functionOrdinals.forEach { (it, index) ->
            print("\n$t$t$it = caps.get($index);")
        }

        print("""

        addresses = ThreadLocalUtil.setupAddressBuffer(caps);
    }

    /** Returns the buffer of OpenGL ES function pointers. */
    public PointerBuffer getAddressBuffer() {
        return addresses;
    }
""")

        for (extension in classes) {
            if (!extension.hasNativeFunctions) {
                continue
            }

            checkExtensionFunctions(extension)
        }

        println("""
    private static boolean hasDSA(Set<String> ext) {
        return ext.contains("GL_ARB_direct_state_access") || ext.contains("GL_EXT_direct_state_access");
    }

}""")
    }

})

fun String.nativeClassGLES(
    templateName: String,
    nativeSubPath: String = "",
    prefix: String = "GL",
    prefixMethod: String = prefix.lowercase(),
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