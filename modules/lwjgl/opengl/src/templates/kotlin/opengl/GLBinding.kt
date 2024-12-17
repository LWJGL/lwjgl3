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
        LinkedHashMap<String, Int>().also { functionOrdinals ->
            classes.asSequence()
                .filter { !it.isCore && it.hasNativeFunctions }
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

    private val Sequence<Func>.hasDeprecated: Boolean
        get() = this.any { it has DeprecatedGL }

    override fun shouldCheckFunctionAddress(function: Func): Boolean = function.nativeClass.templateName != "GL11" || function has DeprecatedGL

    override fun generateFunctionAddress(writer: PrintWriter, function: Func) {
        writer.println("$t${t}long $FUNCTION_ADDRESS = GL.getICD().${function.name};")
    }

    private val EXTENSION_NAME = "[A-Za-z0-9_]+".toRegex()

    private fun getFunctionDependencyExpression(func: Func) = func.get<DependsOn>()
        .reference
        .let { expression ->
            if (EXTENSION_NAME.matches(expression))
                "ext.contains(\"$expression\")"
            else
                expression
        }.let {
            if (func has DeprecatedGL) {
                "!fc || ${if (it.contains(' ')) "($it)" else it}"
            } else {
                it
            }
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
            } else {
                index.toString()
            }
        }, filter)
        print("},")
        nativeClass.printPointers(this, { "\"${it.name}\"" }, filter)
        print(")")
    }

    private fun PrintWriter.checkExtensionFunctions(nativeClass: NativeClass) {
        if (nativeClass.isCore) {
            return
        }

        val capName = nativeClass.capName
        val hasDeprecated = nativeClass.functions.hasDeprecated

        print("\n${t}private static boolean check_${nativeClass.templateName}(FunctionProvider provider, PointerBuffer caps, Set<String> ext")
        if (hasDeprecated) print(", boolean fc")
        print(""") {
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

        print("\n\n$t${t}return (")
        if (hasDeprecated) {
            print("(fc || ")
            printCheckFunctions(nativeClass, dependencies) {
                it has DeprecatedGL && !it.has<DependsOn>()
            }
            print(") && ")
        }
        printCheckFunctions(nativeClass, dependencies, if (hasDeprecated)
            { it -> (!it.has(DeprecatedGL) || it.has<DependsOn>()) && !it.has(IgnoreMissing) }
        else
            { it -> !it.has(IgnoreMissing) })
        println(") || reportMissing(\"GL\", \"$capName\");")
        println("$t}")
    }

    private fun PrintWriter.checkExtensionPresent(core: String, extension: String) {
        println("""${t}private static boolean $extension(Set<String> ext) { return ext.contains("OpenGL$core") || ext.contains("GL_$extension"); }""")
    }

    init {
        javaImport(
            "org.lwjgl.*",
            "java.util.function.IntFunction",
            "static org.lwjgl.system.APIUtil.*",
            "static org.lwjgl.system.Checks.*",
            "static org.lwjgl.system.MemoryUtil.*"
        )

    }

    override fun PrintWriter.generateJava() {
        generateJavaPreamble()
        println("""public final class $CAPABILITIES_CLASS {

    static final int ADDRESS_BUFFER_SIZE = ${functions.size};""")

        val functionSet = LinkedHashSet<String>()
        classes.asSequence()
            .filter { !it.isCore && it.hasNativeFunctions }
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

    $CAPABILITIES_CLASS(FunctionProvider provider, Set<String> ext, boolean fc, IntFunction<PointerBuffer> bufferFactory) {
        forwardCompatible = fc;

        PointerBuffer caps = bufferFactory.apply(ADDRESS_BUFFER_SIZE);""")

        for (extension in classes) {
            if (extension.isCore) {
                continue
            }
            val capName = extension.capName
            if (extension.hasNativeFunctions) {
                print("\n$t$t$capName = check_${extension.templateName}(provider, caps, ext")
                if (extension.functions.hasDeprecated) print(", fc")
                print(");")
            } else
                print("\n$t$t$capName = ext.contains(\"$capName\");")
        }

        println()
        functionOrdinals.forEach { (it, index) ->
            print("\n$t$t$it = caps.get($index);")
        }

        print("""

        addresses = ThreadLocalUtil.setupAddressBuffer(caps);
    }

    /** Returns the buffer of OpenGL function pointers. */
    public PointerBuffer getAddressBuffer() {
        return addresses;
    }

    /** Ensures that the lwjgl_opengl shared library has been loaded. */
    public static void initialize() {
        // intentionally empty to trigger static initializer
    }
""")

        for (extension in classes) {
            if (extension.isCore || !extension.hasNativeFunctions) {
                continue
            }

            checkExtensionFunctions(extension)
        }

        println("""
    private static boolean hasDSA(Set<String> ext) {
        return ext.contains("GL45") || ext.contains("GL_ARB_direct_state_access") || ext.contains("GL_EXT_direct_state_access");
    }
""")

        // TODO: some are unused
        checkExtensionPresent("30", "ARB_framebuffer_object")
        checkExtensionPresent("30", "ARB_map_buffer_range")
        checkExtensionPresent("30", "ARB_vertex_array_object")
        checkExtensionPresent("31", "ARB_copy_buffer")
        checkExtensionPresent("31", "ARB_texture_buffer_object") // TextureBuffer
        checkExtensionPresent("31", "ARB_uniform_buffer_object") // TransformFeedbackBufferBase, TransformFeedbackBufferRange
        checkExtensionPresent("33", "ARB_instanced_arrays")
        checkExtensionPresent("33", "ARB_sampler_objects")
        checkExtensionPresent("40", "ARB_transform_feedback2")
        checkExtensionPresent("41", "ARB_vertex_attrib_64bit")
        checkExtensionPresent("41", "ARB_separate_shader_objects")
        checkExtensionPresent("42", "ARB_texture_storage")
        checkExtensionPresent("43", "ARB_texture_storage_multisample")
        checkExtensionPresent("43", "ARB_vertex_attrib_binding")
        checkExtensionPresent("43", "ARB_invalidate_subdata")
        checkExtensionPresent("43", "ARB_texture_buffer_range")
        checkExtensionPresent("43", "ARB_clear_buffer_object")
        checkExtensionPresent("43", "ARB_framebuffer_no_attachments")
        checkExtensionPresent("44", "ARB_buffer_storage")
        checkExtensionPresent("44", "ARB_clear_texture")
        checkExtensionPresent("44", "ARB_multi_bind")
        checkExtensionPresent("44", "ARB_query_buffer_object")

        println("\n}")
    }

})

// DSL Extensions

fun String.nativeClassGL(
    templateName: String,
    prefix: String = "GL",
    prefixMethod: String = prefix.lowercase(),
    postfix: String = "",
    init: (NativeClass.() -> Unit)? = null
) = nativeClass(
    Module.OPENGL,
    templateName,
    prefix = prefix,
    prefixMethod = prefixMethod,
    postfix = postfix,
    binding = GLBinding,
    init = {
        if (init != null) {
            init()
        }
        if (!skipNative) {
            nativeImport("opengl.h")
        }
    }
)