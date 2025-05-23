/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

import java.io.*
import java.nio.file.*

internal const val HEADER = """/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
"""

internal val JAVA_KEYWORDS = setOf(
    // Java keywords
    "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue", "default", "do", "double", "else", "enum",
    "extends", "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "package",
    "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient",
    "try", "void", "volatile", "while"
)

// Character sequence used for alignment
const val t = "    " // 4 spaces

internal class Preamble {

    companion object {
        data class NativeDefine(
            val expression: String,
            val beforeIncludes: Boolean
        )

        private val EMPTY_IMPORTS = ArrayList<String>(0)
        private val EMPTY_DIRECTIVES = ArrayList<NativeDefine>(0)
    }

    private var javaImports: MutableList<String> = EMPTY_IMPORTS

    private var nativeImports: MutableList<String> = EMPTY_IMPORTS
    private var nativeDirectives: MutableList<NativeDefine> = EMPTY_DIRECTIVES

    internal val hasNativeDirectives get() = nativeImports.isNotEmpty() || nativeDirectives.isNotEmpty()

    fun javaImport(vararg classes: String) {
        if (javaImports === EMPTY_IMPORTS)
            javaImports = ArrayList(classes.size)

        classes.forEach {
            javaImports.add(it)
        }
    }

    fun nativeImport(vararg files: String) {
        if (nativeImports === EMPTY_IMPORTS)
            nativeImports = ArrayList(files.size)

        files.forEach {
            nativeImports.add(if (it.startsWith('<'))
                it
            else
                "\"$it\"")
        }
    }

    fun nativeDirective(expression: String, beforeIncludes: Boolean) {
        if (nativeDirectives === EMPTY_DIRECTIVES)
            nativeDirectives = ArrayList()

        nativeDirectives.add(NativeDefine(expression, beforeIncludes))
    }

    fun printJava(writer: PrintWriter) {
        if (javaImports.isEmpty())
            return

        fun List<String>.print() = this.forEach { writer.println("import $it;") }

        val static = javaImports.filter { it.startsWith("static ") }
        if (static.isNotEmpty() && static.size < javaImports.size) {
            // Separate plain from static imports
            javaImports.filter { !it.startsWith("static ") }.print()
            writer.println()
            static.print()
        } else
            javaImports.print()

        writer.println()
    }

    internal fun printNative(writer: PrintWriter) {
        nativeDirectives.filter { it.beforeIncludes }.forEach {
            writer.println(it.expression)
        }

        writer.println("#include \"common_tools.h\"")
        nativeImports.forEach {
            writer.println("#include $it")
        }

        nativeDirectives.filter { !it.beforeIncludes }.forEach {
            writer.println(it.expression)
        }
    }

}

private val JNI_UNDERSCORE_ESCAPE_PATTERN = "_".toRegex()

internal val String.asJNIName
    get() = if (this.indexOf('_') == -1)
        this
    else
        this.replace(JNI_UNDERSCORE_ESCAPE_PATTERN, "_1")

enum class Access(val modifier: String) {
    PUBLIC("public "),
    INTERNAL(""),
    PRIVATE("private ")
}

@DslMarker
annotation class GeneratorDslMarker

@GeneratorDslMarker
abstract class GeneratorTarget(
    val module: Module,
    val className: String
) {

    companion object {
        private val LINKS = Pair(
            """\p{javaJavaIdentifierStart}\p{javaJavaIdentifierPart}*(?:\.\p{javaJavaIdentifierStart}\p{javaJavaIdentifierPart}*)*""",
            """\p{javaJavaIdentifierPart}+""" // Must match tokens like GL_3_BYTES (the link is #3_BYTES)
        ).let { (JAVA, NATIVE) -> """($JAVA)?(?<!&)([@\\]?#{1,2})($NATIVE+(?:\((?:(?:, )?$JAVA)*\))?)""".toRegex() }
    }

    internal open fun getSourceFileName(): String? {
        // Nasty hack to retrieve the source file that defines this template, without having to specify it explictly.
        // This enables incremental builds to work even with arbitrary file names or when multiple templates are bundled
        // in the same file (e.g. ExtensionFlags).
        try {
            throw RuntimeException()
        } catch (t: Throwable) {
            return t.stackTrace.asSequence()
                .filter { !it.className.startsWith("org.lwjgl.generator.") }
                .mapNotNull { it.fileName }
                .filter { it.endsWith(".kt") && !(this is NativeClass && it.endsWith("Binding.kt")) }
                .firstOrNull()
        }
    }

    internal var lmt: Long = 0L
    internal val sourceFile = getSourceFileName()
    internal open fun getLastModified(root: String, fileName: String): Long {
        val path = Paths.get(root, fileName)
        if (Files.isRegularFile(path)) {
            return path.lastModified
        }

        // Kotlin upper-cases the first letter of the file name, try lower-casing it.
        // This is necessary on case-sensitive file systems.
        val lc = Paths.get(root, "${fileName[0].lowercaseChar()}${fileName.substring(1)}")
        if (Files.isRegularFile(lc)) {
            return lc.lastModified
        }

        throw IllegalStateException("The source file for template ${module.packageKotlin}.$className does not exist ($path).")
    }

    var subpackage: String? = null
    val packageName get() = if (subpackage == null) module.packageName else "${module.packageName}.$subpackage"

    var access = Access.PUBLIC
        set(access) {
            require(access !== Access.PRIVATE) {
                "The private access modifier is illegal on top-level classes."
            }
            field = access
        }

    internal val preamble = Preamble()

    fun <T : GeneratorTarget> T.javaImport(vararg classes: String): T {
        preamble.javaImport(*classes)
        return this
    }

    fun <T : GeneratorTarget> T.nativeDirective(expression: String, beforeIncludes: Boolean = false): T {
        preamble.nativeDirective(expression, beforeIncludes)
        return this
    }

    infix fun Int.x(other: Int) = this * other

    protected fun PrintWriter.generateJavaPreamble() {
        print(HEADER)
        println("package $packageName;\n")

        preamble.printJava(this)
    }

    abstract fun PrintWriter.generateJava()

    open fun processDocumentation(documentation: String, forcePackage: Boolean = false): String {
        return processDocumentation(documentation, "", "", forcePackage)
    }

    open fun getFieldLink(field: String): String? = null
    open fun getMethodLink(method: String): String? = null

    protected fun processDocumentation(
        documentation: String,
        prefixConstant: String,
        prefixMethod: String,
        forcePackage: Boolean = false,
        javadocLinkWrap: Boolean = true
    ) = documentation.replace(LINKS) { match ->
        /*
        # - normal link, apply prefix
        ## - custom link, do not transform
        @# or @## - like above, but add "see " in front
        \# - escape, replace with #
         */
        val linkMethod = match.groupValues[2]
        if (linkMethod[0] == '\\') {
            match.value.replace("\\#", "#")
        } else {
            var className = match.groupValues[1]
            var classElement = match.groupValues[3]

            if (classElement == "NULL")
                return@replace "{@code NULL}"

            val linkType = if (classElement.endsWith(')')) LinkType.METHOD else LinkType.FIELD
            var prefix = if (linkType === LinkType.FIELD) prefixConstant else prefixMethod

            linkMethod.count { it == '#' }.let { hashes ->
                if (hashes == 1) {
                    if (className.isEmpty()) {
                        val qualifiedLink = if (linkType === LinkType.FIELD)
                            getFieldLink(classElement) ?: Generator.tokens[module]!![classElement]
                        else
                            classElement.substring(0, classElement.lastIndexOf('(')).let {
                                getMethodLink(it) ?: Generator.functions[module]!![it]
                            }

                        if (qualifiedLink != null) {
                            val hashIndex = qualifiedLink.indexOf('#')

                            className = qualifiedLink.substring(0, hashIndex)
                            if (forcePackage)
                                className = "$packageName.$className"

                            prefix = qualifiedLink.substring(hashIndex + 1, qualifiedLink.length - if (linkType === LinkType.FIELD)
                                classElement.length
                            else
                                classElement.lastIndexOf('(') + 2
                            )
                        } else {
                            throw IllegalStateException("Failed to resolve link: ${match.value} in ${this.className}")
                        }
                    } else {
                        if (classElement.startsWith(prefix))
                            classElement = classElement.substring(prefix.length)
                        else
                            prefix = ""
                    }
                    linkType.create(this.className, prefix, className, classElement, if (this is NativeClass) this.postfix else "", !javadocLinkWrap)
                } else if (hashes == 2 && className.isEmpty() && linkType === LinkType.FIELD)
                    classElement
                else
                    throw IllegalStateException("Unsupported link syntax: ${match.value} in ${this.className}")
            }.let {
                val link = if (javadocLinkWrap) "{@link $it}" else it
                if (linkMethod[0] == '@')
                    "see $link"
                else
                    link
            }
        }
    }

    private enum class LinkType {
        FIELD {
            override fun create(sourceName: String, sourcePrefix: String, className: String?, classElement: String, postfix: String, skipAlias: Boolean): String {
                val source = if (className == null || className == sourceName) "" else className

                return "$source#$sourcePrefix$classElement${if (skipAlias || sourcePrefix.isEmpty()) "" else " $classElement"}"
            }
        },
        METHOD {
            override fun create(sourceName: String, sourcePrefix: String, className: String?, classElement: String, postfix: String, skipAlias: Boolean): String {
                val source = if (className == null || className == sourceName) "" else className

                val parentheses = classElement.indexOf('(')
                check(parentheses != -1) {
                    "Invalid method link: $this#$sourcePrefix$classElement"
                }

                val name = classElement.substring(0, parentheses)

                val hasParams = parentheses < classElement.length - 2
                return "$source#$sourcePrefix$name${if (hasParams) classElement.substring(parentheses) else ""}${when {
                    hasParams || skipAlias || sourcePrefix.isEmpty()
                         -> ""
                    else -> " $name"
                }}"
            }
        };

        abstract fun create(sourceName: String, sourcePrefix: String, className: String?, classElement: String, postfix: String, skipAlias: Boolean): String
    }

}

abstract class GeneratorTargetNative(
    module: Module,
    className: String,
    val nativeSubPath: String = ""
) : GeneratorTarget(module, className) {

    internal val nativeFileName
        get() = "${this.packageName.replace('.', '_')}_${this.className}"

    internal val nativeFileNameJNI = packageName
        .splitToSequence('.')
        .plus(className)
        .map { it.asJNIName }
        .joinToString("_")

    open val skipNative = false
    var cpp = false

    fun <T : GeneratorTargetNative> T.nativeImport(vararg files: String): T {
        preamble.nativeImport(*files)
        return this
    }

    protected fun PrintWriter.generateNativePreamble() {
        print(HEADER)
        preamble.printNative(this)
    }

    abstract fun PrintWriter.generateNative()

}

// ------------------------------------

fun packageInfo(
    module: Module,
    documentation: String
) {
    Generator.register(object : GeneratorTarget(module, "package-info") {
        override fun PrintWriter.generateJava() {
            print(HEADER)
            println()
            println(processDocumentation(documentation, forcePackage = true).toJavaDoc(indentation = ""))
            println("""@org.jspecify.annotations.NullMarked
package $packageName;
""")
        }
    })
}