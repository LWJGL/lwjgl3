/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val ClangBuildSystem = "ClangBuildSystem".nativeClass(
    Module.LLVM,
    prefixConstant = "CX",
    prefixMethod = "clang_",
    binding = CLANG_BINDING_DELEGATE
) {
    unsigned_long_long("getBuildSessionTimestamp", "Return the timestamp for use with Clang's {@code -fbuild-session-timestamp=} option.", void())

    CXVirtualFileOverlay(
        "VirtualFileOverlay_create",
        "Create a {@code CXVirtualFileOverlay} object. Must be disposed with #VirtualFileOverlay_dispose().",

        unsigned_int("options", "is reserved, always pass 0")
    )

    CXErrorCode(
        "VirtualFileOverlay_addFileMapping",
        "Map an absolute virtual file path to an absolute real one. The virtual path must be canonicalized (not contain \".\"/\"..\").",

        CXVirtualFileOverlay("overlay", ""),
        charASCII.const.p("virtualPath", ""),
        charASCII.const.p("realPath", ""),

        returnDoc = "0 for success, non-zero to indicate an error"
    )

    CXErrorCode(
        "VirtualFileOverlay_setCaseSensitivity",
        """
        Set the case sensitivity for the {@code CXVirtualFileOverlay} object. The {@code CXVirtualFileOverlay} object is case-sensitive by default, this option
        can be used to override the default.
        """,

        CXVirtualFileOverlay("overlay", ""),
        int("caseSensitive", ""),

        returnDoc = "0 for success, non-zero to indicate an error"
    )

    CXErrorCode(
        "VirtualFileOverlay_writeToBuffer",
        "Write out the {@code CXVirtualFileOverlay} object to a char buffer.",

        CXVirtualFileOverlay("overlay", ""),
        unsigned_int("options", "is reserved, always pass 0"),
        Check(1)..char.p.p("out_buffer_ptr", "pointer to receive the buffer pointer, which should be disposed using #free()"),
        Check(1)..unsigned_int.p("out_buffer_size", "pointer to receive the buffer size"),

        returnDoc = "0 for success, non-zero to indicate an error"
    )

    void(
        "free",
        "Free memory allocated by libclang, such as the buffer returned by #VirtualFileOverlay_writeToBuffer() or #ModuleMapDescriptor_writeToBuffer().",

        Unsafe..void.p("buffer", "memory pointer to free")
    )

    void(
        "VirtualFileOverlay_dispose",
        "Dispose a {@code CXVirtualFileOverlay} object.",

        CXVirtualFileOverlay("overlay", "")
    )

    CXModuleMapDescriptor(
        "ModuleMapDescriptor_create",
        "Create a {@code CXModuleMapDescriptor} object. Must be disposed with #ModuleMapDescriptor_dispose().",

        unsigned_int("options", "is reserved, always pass 0")
    )

    CXErrorCode(
        "ModuleMapDescriptor_setFrameworkModuleName",
        "Sets the framework module name that the module.map describes.",

        CXModuleMapDescriptor("descriptor", ""),
        charUTF8.const.p("name", ""),

        returnDoc = "0 for success, non-zero to indicate an error"
    )

    CXErrorCode(
        "ModuleMapDescriptor_setUmbrellaHeader",
        "Sets the umbrella header name that the module.map describes.",

        CXModuleMapDescriptor("descriptor", ""),
        charUTF8.const.p("name", ""),

        returnDoc = "0 for success, non-zero to indicate an error"
    )

    CXErrorCode(
        "ModuleMapDescriptor_writeToBuffer",
        "Write out the {@code CXModuleMapDescriptor} object to a char buffer.",

        CXModuleMapDescriptor("descriptor", ""),
        unsigned_int("options", "is reserved, always pass 0"),
        Check(1)..char.p.p("out_buffer_ptr", "pointer to receive the buffer pointer, which should be disposed using #free()"),
        Check(1)..unsigned_int.p("out_buffer_size", "pointer to receive the buffer size"),

        returnDoc = "0 for success, non-zero to indicate an error"
    )

    void(
        "ModuleMapDescriptor_dispose",
        "Dispose a {@code CXModuleMapDescriptor} object.",

        CXModuleMapDescriptor("descriptor", "")
    )
}