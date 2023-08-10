/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shading_language_include.txt">ARB_shading_language_include</a> extension.
 * 
 * <p>This extension introduces a {@code &#35;include} GLSL directive to allow reusing the same shader text in multiple shaders and defines the semantics and syntax of
 * the names allowed in {@code &#35;include} directives. It also defines API mechanisms to define the named string backing a {@code &#35;include}.</p>
 * 
 * <h3>Introduction</h3>
 * 
 * <p>The GLSL {@code &#35;include} mechanism looks up paths in a tree built through the OpenGL API. This appendix describes the syntax and semantic model of the tree and
 * paths into the tree. How the tree is used is up to users of the tree, like the OpenGL API or GLSL.</p>
 * 
 * <h3>The Tree</h3>
 * 
 * <p>The tree is a singly rooted hierarchy of tree locations. The root may have one or more child locations, and any location may in turn have its own
 * children. Except for the root, each location has exactly one parent; the root has no parent.</p>
 * 
 * <h3>Paths into the Tree</h3>
 * 
 * <p>The locations in the tree are created or looked up by path strings. The path string "/" locates the root of the tree. The path "/foo" locates the child
 * "foo" of the root. Formally, a valid path is a sequence of tokens delimited by the beginning of the string, by the path-separator forward slash ( / ),
 * and by the end of the string. The string "foo/bar" has two tokens; "foo" and "bar". The string "/foo/./bar" has 3 tokens; "foo", ".", and "bar". The
 * string "/foo/.." has two tokens; "foo" and "..". The string "/foo/.bar" has two tokens; "foo" and ".bar". A path is invalid if</p>
 * 
 * <ul>
 * <li>{@code path} contains any characters not listed in Section 3.1 "Character Set", or the double quote character, or angled brackets, or any white
 * space characters other than the space character.</li>
 * <li>{@code path} has consecutive forward slashes ( // ); "/foo//bar" is not valid (zero length tokens are not allowed).</li>
 * <li>{@code path} ends with a forward slash ( / )</li>
 * <li>{@code path} contains no characters.</li>
 * </ul>
 * 
 * <p>There are no path escape characters, so there is no way to get the forward slash delimiter within a single token.</p>
 * 
 * <p>When using a path to lookup a tree location, the path tokens are used to walk the tree. The initial location to start the walk is specified by the user
 * of the tree and is updated as follows by the tokens in the path. (Paths starting with "/" will start at the root.) Taken left to right:</p>
 * 
 * <p>The token ".." walks to the parent. Or, if already at the root, then the location remains at the root.</p>
 * 
 * <p>The token "." leaves the location unchanged.</p>
 * 
 * <p>Any other token is considered the name of a child of the current location, and walks to that child. (If there is no child of that name, this may result
 * in a failed lookup or in the child being created, as specified by the user of the tree for the operation being performed.)</p>
 * 
 * <h3>Associated Strings</h3>
 * 
 * <p>Each location in the tree can have an additional string associated with it (that a user like the {@code &#35;include} mechanism can use as an included string). This
 * is true even for locations that have children: "/foo/bar" can exist in the tree at the same time that "/foo" has an additional string associated with
 * it. Typically, when a path is used to find a location in the tree, it is for the purpose of returning this associated string.</p>
 * 
 * <p>Hence, the tree can be built from a collection of (path,string) pairs, where path is a string establishing the existence of a location in the tree and
 * string is the string associated with the node. Details of how to do this are specified by the user of the tree.</p>
 * 
 * <p>Requires GLSL 1.10.</p>
 */
public class ARBShadingLanguageInclude {

    static { GL.initialize(); }

    /** Accepted by the {@code type} parameter of NamedStringARB. */
    public static final int GL_SHADER_INCLUDE_ARB = 0x8DAE;

    /** Accepted by the {@code pname} parameter of GetNamedStringivARB. */
    public static final int
        GL_NAMED_STRING_LENGTH_ARB = 0x8DE9,
        GL_NAMED_STRING_TYPE_ARB   = 0x8DEA;

    protected ARBShadingLanguageInclude() {
        throw new UnsupportedOperationException();
    }

    // --- [ glNamedStringARB ] ---

    /**
     * Unsafe version of: {@link #glNamedStringARB NamedStringARB}
     *
     * @param namelen   the number of characters in {@code name}. If negative, {@code name} is considered to be a null-terminated string.
     * @param stringlen the number of characters in {@code string}. If negative, {@code string} is considered to be a null-terminated string.
     */
    public static native void nglNamedStringARB(int type, int namelen, long name, int stringlen, long string);

    /**
     * Specifies a string and its name. Such strings can be included by name in shaders during compilation, allowing reuse of the same code segments.
     * 
     * <p>After calling NamedStringARB, the contents of {@code string} are associated with the tree location corresponding to {@code name}. If a string is already
     * associated with that tree location, it will be replaced with the new {@code string}.</p>
     *
     * @param type   the string type. Must be:<br><table><tr><td>{@link #GL_SHADER_INCLUDE_ARB SHADER_INCLUDE_ARB}</td></tr></table>
     * @param name   the name associated with the string
     * @param string an arbitrary string of characters
     */
    public static void glNamedStringARB(@NativeType("GLenum") int type, @NativeType("GLchar const *") ByteBuffer name, @NativeType("GLchar const *") ByteBuffer string) {
        nglNamedStringARB(type, name.remaining(), memAddress(name), string.remaining(), memAddress(string));
    }

    /**
     * Specifies a string and its name. Such strings can be included by name in shaders during compilation, allowing reuse of the same code segments.
     * 
     * <p>After calling NamedStringARB, the contents of {@code string} are associated with the tree location corresponding to {@code name}. If a string is already
     * associated with that tree location, it will be replaced with the new {@code string}.</p>
     *
     * @param type   the string type. Must be:<br><table><tr><td>{@link #GL_SHADER_INCLUDE_ARB SHADER_INCLUDE_ARB}</td></tr></table>
     * @param name   the name associated with the string
     * @param string an arbitrary string of characters
     */
    public static void glNamedStringARB(@NativeType("GLenum") int type, @NativeType("GLchar const *") CharSequence name, @NativeType("GLchar const *") CharSequence string) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            nglNamedStringARB(type, nameEncodedLength, nameEncoded, stringEncodedLength, stringEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDeleteNamedStringARB ] ---

    /**
     * Unsafe version of: {@link #glDeleteNamedStringARB DeleteNamedStringARB}
     *
     * @param namelen the number of characters in {@code name}. If negative, {@code name} is considered to be a null-terminated string.
     */
    public static native void nglDeleteNamedStringARB(int namelen, long name);

    /**
     * Deletes a named string.
     *
     * @param name the name associated with the string
     */
    public static void glDeleteNamedStringARB(@NativeType("GLchar const *") ByteBuffer name) {
        nglDeleteNamedStringARB(name.remaining(), memAddress(name));
    }

    /**
     * Deletes a named string.
     *
     * @param name the name associated with the string
     */
    public static void glDeleteNamedStringARB(@NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            nglDeleteNamedStringARB(nameEncodedLength, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glCompileShaderIncludeARB ] ---

    /** Unsafe version of: {@link #glCompileShaderIncludeARB CompileShaderIncludeARB} */
    public static native void nglCompileShaderIncludeARB(int shader, int count, long path, long length);

    /**
     * Compiles a shader object.
     * 
     * <p>The ordered list of {@code path}s is used during compilation, together with the arguments of {@code &#35;include} directives in the shader source, to search for
     * named strings corresponding to the {@code &#35;include} directives. If a {@code &#35;include} directive does not correspond to a valid named string, compilation will fail.</p>
     *
     * @param shader the shader object compile
     * @param path   an ordered array of {@code count} pointers to optionally null-terminated character strings defining search paths
     * @param length an array {@code count} values with the number of characters in each string (the string length). If an element in {@code length} is negative, its
     *               accompanying string is null-terminated. If {@code length} is {@code NULL}, all strings in the {@code path} argument are considered null-terminated.
     */
    public static void glCompileShaderIncludeARB(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") PointerBuffer path, @Nullable @NativeType("GLint const *") IntBuffer length) {
        if (CHECKS) {
            checkSafe(length, path.remaining());
        }
        nglCompileShaderIncludeARB(shader, path.remaining(), memAddress(path), memAddressSafe(length));
    }

    // --- [ glIsNamedStringARB ] ---

    /**
     * Unsafe version of: {@link #glIsNamedStringARB IsNamedStringARB}
     *
     * @param namelen the number of characters in {@code name}. If negative, {@code name} is considered to be a null-terminated string.
     */
    public static native boolean nglIsNamedStringARB(int namelen, long name);

    /**
     * Returns {@link GL11#GL_TRUE TRUE} if the tree location corresponding to {@code name} has a string associated with it, and {@link GL11#GL_FALSE FALSE} if the tree location has no string
     * associated with it.
     *
     * @param name the name associated with the string
     */
    @NativeType("GLboolean")
    public static boolean glIsNamedStringARB(@NativeType("GLchar const *") ByteBuffer name) {
        return nglIsNamedStringARB(name.remaining(), memAddress(name));
    }

    /**
     * Returns {@link GL11#GL_TRUE TRUE} if the tree location corresponding to {@code name} has a string associated with it, and {@link GL11#GL_FALSE FALSE} if the tree location has no string
     * associated with it.
     *
     * @param name the name associated with the string
     */
    @NativeType("GLboolean")
    public static boolean glIsNamedStringARB(@NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            return nglIsNamedStringARB(nameEncodedLength, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetNamedStringARB ] ---

    /**
     * Unsafe version of: {@link #glGetNamedStringARB GetNamedStringARB}
     *
     * @param namelen the number of characters in {@code name}. If negative, {@code name} is considered to be a null-terminated string.
     * @param bufSize the maximum number of characters that may be written into {@code string}, including the null terminator
     */
    public static native void nglGetNamedStringARB(int namelen, long name, int bufSize, long stringlen, long string);

    /**
     * Returns in {@code string} the string corresponding to the specified {@code name}. The returned string will be null-terminated.
     *
     * @param name      the name associated with the string
     * @param stringlen a buffer in which to place the actual number of characters written into {@code string}, excluding the null terminator. If {@code NULL}, no length is
     *                  returned.
     * @param string    a buffer in which to place the returned string
     */
    public static void glGetNamedStringARB(@NativeType("GLchar const *") ByteBuffer name, @Nullable @NativeType("GLint *") IntBuffer stringlen, @NativeType("GLchar *") ByteBuffer string) {
        if (CHECKS) {
            checkSafe(stringlen, 1);
        }
        nglGetNamedStringARB(name.remaining(), memAddress(name), string.remaining(), memAddressSafe(stringlen), memAddress(string));
    }

    /**
     * Returns in {@code string} the string corresponding to the specified {@code name}. The returned string will be null-terminated.
     *
     * @param name      the name associated with the string
     * @param stringlen a buffer in which to place the actual number of characters written into {@code string}, excluding the null terminator. If {@code NULL}, no length is
     *                  returned.
     * @param string    a buffer in which to place the returned string
     */
    public static void glGetNamedStringARB(@NativeType("GLchar const *") CharSequence name, @Nullable @NativeType("GLint *") IntBuffer stringlen, @NativeType("GLchar *") ByteBuffer string) {
        if (CHECKS) {
            checkSafe(stringlen, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            nglGetNamedStringARB(nameEncodedLength, nameEncoded, string.remaining(), memAddressSafe(stringlen), memAddress(string));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Returns in {@code string} the string corresponding to the specified {@code name}. The returned string will be null-terminated.
     *
     * @param name    the name associated with the string
     * @param bufSize the maximum number of characters that may be written into {@code string}, including the null terminator
     */
    @NativeType("void")
    public static String glGetNamedStringARB(@NativeType("GLchar const *") CharSequence name, @NativeType("GLsizei") int bufSize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            IntBuffer stringlen = stack.ints(0);
            ByteBuffer string = stack.malloc(bufSize);
            nglGetNamedStringARB(nameEncodedLength, nameEncoded, bufSize, memAddress(stringlen), memAddress(string));
            return memUTF8(string, stringlen.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Returns in {@code string} the string corresponding to the specified {@code name}. The returned string will be null-terminated.
     *
     * @param name the name associated with the string
     */
    @NativeType("void")
    public static String glGetNamedStringARB(@NativeType("GLchar const *") CharSequence name) {
        return glGetNamedStringARB(name, glGetNamedStringiARB(name, GL_NAMED_STRING_LENGTH_ARB));
    }

    // --- [ glGetNamedStringivARB ] ---

    /**
     * Unsafe version of: {@link #glGetNamedStringivARB GetNamedStringivARB}
     *
     * @param namelen the number of characters in {@code name}. If negative, {@code name} is considered to be a null-terminated string.
     */
    public static native void nglGetNamedStringivARB(int namelen, long name, int pname, long params);

    /**
     * Returns properties of the named string whose tree location corresponds to {@code name}.
     *
     * @param name   the name associated with the string
     * @param pname  the parameter to query. One of:<br><table><tr><td>{@link #GL_NAMED_STRING_LENGTH_ARB NAMED_STRING_LENGTH_ARB}</td><td>{@link #GL_NAMED_STRING_TYPE_ARB NAMED_STRING_TYPE_ARB}</td></tr></table>
     * @param params a buffer in which to place the returned value
     */
    public static void glGetNamedStringivARB(@NativeType("GLchar const *") ByteBuffer name, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedStringivARB(name.remaining(), memAddress(name), pname, memAddress(params));
    }

    /**
     * Returns properties of the named string whose tree location corresponds to {@code name}.
     *
     * @param name   the name associated with the string
     * @param pname  the parameter to query. One of:<br><table><tr><td>{@link #GL_NAMED_STRING_LENGTH_ARB NAMED_STRING_LENGTH_ARB}</td><td>{@link #GL_NAMED_STRING_TYPE_ARB NAMED_STRING_TYPE_ARB}</td></tr></table>
     * @param params a buffer in which to place the returned value
     */
    public static void glGetNamedStringivARB(@NativeType("GLchar const *") CharSequence name, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            nglGetNamedStringivARB(nameEncodedLength, nameEncoded, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Returns properties of the named string whose tree location corresponds to {@code name}.
     *
     * @param name  the name associated with the string
     * @param pname the parameter to query. One of:<br><table><tr><td>{@link #GL_NAMED_STRING_LENGTH_ARB NAMED_STRING_LENGTH_ARB}</td><td>{@link #GL_NAMED_STRING_TYPE_ARB NAMED_STRING_TYPE_ARB}</td></tr></table>
     */
    @NativeType("void")
    public static int glGetNamedStringiARB(@NativeType("GLchar const *") CharSequence name, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            IntBuffer params = stack.callocInt(1);
            nglGetNamedStringivARB(nameEncodedLength, nameEncoded, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #glCompileShaderIncludeARB CompileShaderIncludeARB} */
    public static void glCompileShaderIncludeARB(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") PointerBuffer path, @Nullable @NativeType("GLint const *") int[] length) {
        long __functionAddress = GL.getICD().glCompileShaderIncludeARB;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, path.remaining());
        }
        callPPV(shader, path.remaining(), memAddress(path), length, __functionAddress);
    }

    /** Array version of: {@link #glGetNamedStringARB GetNamedStringARB} */
    public static void glGetNamedStringARB(@NativeType("GLchar const *") ByteBuffer name, @Nullable @NativeType("GLint *") int[] stringlen, @NativeType("GLchar *") ByteBuffer string) {
        long __functionAddress = GL.getICD().glGetNamedStringARB;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(stringlen, 1);
        }
        callPPPV(name.remaining(), memAddress(name), string.remaining(), stringlen, memAddress(string), __functionAddress);
    }

    /** Array version of: {@link #glGetNamedStringARB GetNamedStringARB} */
    public static void glGetNamedStringARB(@NativeType("GLchar const *") CharSequence name, @Nullable @NativeType("GLint *") int[] stringlen, @NativeType("GLchar *") ByteBuffer string) {
        long __functionAddress = GL.getICD().glGetNamedStringARB;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(stringlen, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            callPPPV(nameEncodedLength, nameEncoded, string.remaining(), stringlen, memAddress(string), __functionAddress);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #glGetNamedStringivARB GetNamedStringivARB} */
    public static void glGetNamedStringivARB(@NativeType("GLchar const *") ByteBuffer name, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedStringivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPPV(name.remaining(), memAddress(name), pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetNamedStringivARB GetNamedStringivARB} */
    public static void glGetNamedStringivARB(@NativeType("GLchar const *") CharSequence name, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedStringivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            callPPV(nameEncodedLength, nameEncoded, pname, params, __functionAddress);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}