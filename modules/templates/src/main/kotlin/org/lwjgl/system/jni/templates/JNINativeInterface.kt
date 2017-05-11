/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.jni.templates

import org.lwjgl.generator.*
import org.lwjgl.system.jni.*

val JNINativeInterface = "JNINativeInterface".nativeClass(JNI_PACKAGE, prefix = "JNI", prefixMethod = "") {
    javaImport("java.lang.reflect.*")
    documentation =
        """
        Bindings to the Java Native Interface (JNI).

        The JNI is a native programming interface. It allows Java code that runs inside a Java Virtual Machine (VM) to interoperate with applications and
        libraries written in other programming languages, such as C, C++, and assembly.

        The most important benefit of the JNI is that it imposes no restrictions on the implementation of the underlying Java VM. Therefore, Java VM vendors
        can add support for the JNI without affecting other parts of the VM. Programmers can write one version of a native application or library and expect it
        to work with all Java VMs supporting the JNI.

        LWJGL: Only functions that can reasonably be called from Java are exposed.
        """

    IntConstant(
        "JNI versions.",

        "VERSION_1_1"..0x00010001,
        "VERSION_1_2"..0x00010002,
        "VERSION_1_4"..0x00010004,
        "VERSION_1_6"..0x00010006,
        "VERSION_1_8"..0x00010008,
        "VERSION_9"..0x00090000
    )

    EnumConstant(
        "{@code jobjectRefType}: Return values from #GetObjectRefType().",

        "JNIInvalidRefType".."0",
        "JNILocalRefType".."1",
        "JNIGlobalRefType".."2",
        "JNIWeakGlobalRefType".."3"
    ).noPrefix()

    IntConstant(
        "jboolean constants.",

        "FALSE".."0",
        "TRUE".."1"
    )

    EnumConstant(
        "Possible return values for JNI functions.",

        "OK".enum("success ", "0"),
        "ERR".enum("unknown error ", "(-1)"),
        "EDETACHED".enum("thread detached from the VM ", "(-2)"),
        "EVERSION".enum("JNI version error ", "(-3)"),
        "ENOMEM".enum("not enough memory ", "(-4)"),
        "EEXIST".enum("VM already created ", "(-5)"),
        "EINVAL".enum("invalid arguments ", "(-6)")
    )

    IntConstant(
        "Used in {@code ReleaseScalarArrayElements}.",

        "COMMIT".."1",
        "ABORT".."2"
    )

    jint(
        "GetVersion",
        "Returns the version of the native method interface.",

        JNI_ENV,

        returnDoc = "the major version number in the higher 16 bits and the minor version number in the lower 16 bits"
    )

    jmethodID(
        "FromReflectedMethod",
        "Converts a ##Method or ##Constructor object to a method ID.",

        JNI_ENV,
        java_lang_reflect_Method.IN("method", "")
    )

    jfieldID(
        "FromReflectedField",
        "Converts a ##Field to a field ID.",

        JNI_ENV,
        java_lang_reflect_Field.IN("field", "")
    )

    java_lang_reflect_Method(
        "ToReflectedMethod",
        "Converts a method ID derived from {@code cls} to a ##Method or ##Constructor object.",

        JNI_ENV,
        jclass.IN("cls", ""),
        jmethodID.IN("methodID", ""),
        jboolean.IN("isStatic", "must be set to #TRUE if the method ID refers to a static field, and # FALSE otherwise")
    )

    java_lang_reflect_Method(
        "ToReflectedField",
        "Converts a field ID derived from {@code cls} to a ##Field object.",

        JNI_ENV,
        jclass.IN("cls", ""),
        jfieldID.IN("fieldID", ""),
        jboolean.IN("isStatic", "must be set to #TRUE if {@code fieldID} refers to a static field, and #FALSE otherwise")
    )

    opaque_p(
        "NewGlobalRef",
        """
        Creates a new global reference to the object referred to by the {@code obj} argument. The {@code obj} argument may be a global or local reference.
        Global references must be explicitly disposed of by calling #DeleteGlobalRef().
        """,

        JNI_ENV,
        jobject.IN("obj", "a global or local reference"),

        returnDoc = "a global reference, or #NULL if the system runs out of memory"
    )

    void(
        "DeleteGlobalRef",
        "Deletes the global reference pointed to by {@code globalRef}.",

        JNI_ENV,
        opaque_p.IN("globalRef", "a global reference")
    )

    fun ArrayElementsRoutines(name: String, elementType: PrimitiveType, arrayType: NativeType) {
        elementType.p(
            "Get${name}ArrayElements",
            """
            Returns the body of the primitive array. The result is valid until the #Release${name}ArrayElements() function is called. Since the returned array
            may be a copy of the Java array, changes made to the returned array will not necessarily be reflected in the original array until
            #Release${name}ArrayElements() is called.

            If {@code isCopy} is not #NULL, then {@code *isCopy} is set to #TRUE if a copy is made; or it is set to #FALSE if no copy is made.
            """,

            JNI_ENV,
            AutoSizeResult("\$original.length")..arrayType.IN("array", "the primitive array"),
            Check(1)..nullable..jboolean.p.OUT("isCopy", "a pointer to a boolean"),

            returnDoc = "a pointer to the array elements, or #NULL if the operation fails"
        )

        OffHeapOnly..void(
            "Release${name}ArrayElements",
            """
            Informs the VM that the native code no longer needs access to {@code elems}. The {@code elems} argument is a pointer derived from array using the
            #Get${name}ArrayElements() function. If necessary, this function copies back all changes made to elems to the original array.

            The {@code mode} argument provides information on how the array buffer should be released. {@code mode} has no effect if {@code elems} is not a
            copy of the elements in array. Otherwise, mode has the following impact, as shown in the following table:
            ${table(
                tr(th("mode"), th("actions")),
                tr(td("0"), td("copy back the content and free the elems buffer")),
                tr(td("#COMMIT"), td("copy back the content but do not free the elems buffer")),
                tr(td("#ABORT"), td("free the buffer without copying back the possible changes"))
            )}
            In most cases, programmers pass “0” to the mode argument to ensure consistent behavior for both pinned and copied arrays. The other options give
            the programmer more control over memory management and should be used with extreme care.
            """,

            JNI_ENV,
            arrayType.IN("array", "a Java array object"),
            Unsafe..elementType.p.IN("elems", "a pointer to array elements"),
            jint.IN("mode", "the release mode", "0 #COMMIT #ABORT")
        )
    }

    ArrayElementsRoutines("Boolean", jboolean, jbooleanArray)
    ArrayElementsRoutines("Byte", jbyte, jbyteArray)
    ArrayElementsRoutines("Char", jchar, jcharArray)
    ArrayElementsRoutines("Short", jshort, jshortArray)
    ArrayElementsRoutines("Int", jint, jintArray)
    ArrayElementsRoutines("Long", jlong, jlongArray)
    ArrayElementsRoutines("Float", jfloat, jfloatArray)
    ArrayElementsRoutines("Double", jdouble, jdoubleArray)

    fun ArrayRegionRoutines(name: String, elementType: PrimitiveType, arrayType: NativeType) {
        OffHeapOnly..void(
            "Get${name}ArrayRegion",
            "Copies a region of a primitive array into a buffer.",

            JNI_ENV,
            arrayType.IN("array", "a Java array"),
            jsize.IN("start", "the starting index"),
            AutoSize("buf")..jsize.IN("len", "the number of elements to be copied"),
            elementType.p.OUT("buf", "the destination buffer")
        )

        OffHeapOnly..void(
            "Set${name}ArrayRegion",
            "Copies back a region of a primitive array from a buffer.",

            JNI_ENV,
            arrayType.IN("array", "a Java array"),
            jsize.IN("start", "the starting index"),
            AutoSize("buf")..jsize.IN("len", "the number of elements to be copied"),
            const..elementType.p.IN("buf", "the source buffer")
        )
    }

    ArrayRegionRoutines("Boolean", jboolean, jbooleanArray)
    ArrayRegionRoutines("Byte", jbyte, jbyteArray)
    ArrayRegionRoutines("Char", jchar, jcharArray)
    ArrayRegionRoutines("Short", jshort, jshortArray)
    ArrayRegionRoutines("Int", jint, jintArray)
    ArrayRegionRoutines("Long", jlong, jlongArray)
    ArrayRegionRoutines("Float", jfloat, jfloatArray)
    ArrayRegionRoutines("Double", jdouble, jdoubleArray)

    jint(
        "RegisterNatives",
        """
        Registers native methods with the class specified by the {@code targetClass} argument. The methods parameter specifies an array of JNINativeMethod
        structures that contain the names, signatures, and function pointers of the native methods. The name and signature fields of the ##JNINativeMethod
        structure are pointers to modified UTF-8 strings. The {@code nMethods} parameter specifies the number of native methods in the array.
        """,

        JNI_ENV,
        jclass.IN("targetClass", ""),
        const..JNINativeMethod_p.IN("methods", "the native methods in the class"),
        AutoSize("methods")..jint.IN("nMethods", "the number of native methods in the class"),

        returnDoc = "“0” on success; returns a negative value on failure"
    )

    jint(
        "UnregisterNatives",
        """
        Unregisters native methods of a class. The class goes back to the state before it was linked or registered with its native method functions.

        This function should not be used in normal native code. Instead, it provides special programs a way to reload and relink native libraries.
        """,

        JNI_ENV,
        jclass.IN("targetClass", "a Java class object"),

        returnDoc = "“0” on success; returns a negative value on failure"
    )

    jint(
        "GetJavaVM",
        """
        Returns the Java VM interface (used in the Invocation API) associated with the current thread. The result is placed at the location pointed to by the
        second argument, {@code vm}.
        """,

        JNI_ENV,
        Check(1)..JavaVM.p.p.OUT("vm", "a pointer to where the result should be placed")
    )

    void(
        "GetStringRegion",
        "Copies {@code len} number of Unicode characters beginning at offset {@code start} to the given buffer {@code buf}.",

        JNI_ENV,
        jstring.IN("str", ""),
        jsize.IN("start", ""),
        AutoSize("buf")..jsize.IN("len", ""),
        jchar.p.OUT("buf", "")
    )

    void(
        "GetStringUTFRegion",
        """
        Translates {@code len} number of Unicode characters beginning at offset start into modified UTF-8 encoding and place the result in the given buffer
        {@code buf}.
        """,

        JNI_ENV,
        jstring.IN("str", ""),
        jsize.IN("start", ""),
        jsize.IN("len", ""),
        Check("len")..char.p.OUT("buf", "")
    )

    opaque_p(
        "NewWeakGlobalRef",
        """
        Creates a new weak global reference. Returns #NULL if {@code obj} refers to null, or if the VM runs out of memory. If the VM runs out of memory, an
        {@code OutOfMemoryError} will be thrown.
        """,

        JNI_ENV,
        jobject.IN("obj", "")
    )

    void(
        "DeleteWeakGlobalRef",
        "Delete the VM resources needed for the given weak global reference.",

        JNI_ENV,
        opaque_p.IN("weakGlobalRef", "")
    )

    java_nio_ByteBuffer(
        "NewDirectByteBuffer",
        """
        Allocates and returns a direct {@code java.nio.ByteBuffer} referring to the block of memory starting at the memory address address and extending
        capacity bytes.

        Native code that calls this function and returns the resulting byte-buffer object to Java-level code should ensure that the buffer refers to a valid
        region of memory that is accessible for reading and, if appropriate, writing. An attempt to access an invalid memory location from Java code will
        either return an arbitrary value, have no visible effect, or cause an unspecified exception to be thrown.
        """,

        JNI_ENV,
        opaque_p.IN("address", "the starting address of the memory region (must not be #NULL)"),
        jlong.IN("capacity", "the size in bytes of the memory region (must be positive)"),

        returnDoc =
        """
        a local reference to the newly-instantiated {@code java.nio.ByteBuffer} object. Returns #NULL if an exception occurs, or if JNI access to direct
        buffers is not supported by this virtual machine.
        """
    )

    opaque_p(
        "GetDirectBufferAddress",
        """
        Fetches and returns the starting address of the memory region referenced by the given direct {@code java.nio.Buffer}.

        This function allows native code to access the same memory region that is accessible to Java code via the buffer object.
        """,

        JNI_ENV,
        java_nio_Buffer.IN("buf", "a direct {@code java.nio.Buffer} object (must not be #NULL)"),

        returnDoc =
        """
        the starting address of the memory region referenced by the buffer. Returns #NULL if the memory region is undefined, if the given object is not a
        direct {@code java.nio.Buffer}, or if JNI access to direct buffers is not supported by this virtual machine.
        """
    )

    jobjectRefType(
        "GetObjectRefType",
        """
        Returns the type of the object referred to by the {@code obj} argument. The argument {@code obj} can either be a local, global or weak global
        reference.
        """,

        JNI_ENV,
        jobject.IN("obj", "a local, global or weak global reference")
    )
}