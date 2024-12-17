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
    unsigned_long_long("getBuildSessionTimestamp", void())

    CXVirtualFileOverlay(
        "VirtualFileOverlay_create",

        unsigned_int("options")
    )

    CXErrorCode(
        "VirtualFileOverlay_addFileMapping",

        CXVirtualFileOverlay("overlay"),
        charASCII.const.p("virtualPath"),
        charASCII.const.p("realPath")
    )

    CXErrorCode(
        "VirtualFileOverlay_setCaseSensitivity",

        CXVirtualFileOverlay("overlay"),
        int("caseSensitive")
    )

    CXErrorCode(
        "VirtualFileOverlay_writeToBuffer",

        CXVirtualFileOverlay("overlay"),
        unsigned_int("options"),
        Check(1)..char.p.p("out_buffer_ptr"),
        Check(1)..unsigned_int.p("out_buffer_size")
    )

    void(
        "free",

        Unsafe..void.p("buffer")
    )

    void(
        "VirtualFileOverlay_dispose",

        CXVirtualFileOverlay("overlay")
    )

    CXModuleMapDescriptor(
        "ModuleMapDescriptor_create",

        unsigned_int("options")
    )

    CXErrorCode(
        "ModuleMapDescriptor_setFrameworkModuleName",

        CXModuleMapDescriptor("descriptor"),
        charUTF8.const.p("name")
    )

    CXErrorCode(
        "ModuleMapDescriptor_setUmbrellaHeader",

        CXModuleMapDescriptor("descriptor"),
        charUTF8.const.p("name")
    )

    CXErrorCode(
        "ModuleMapDescriptor_writeToBuffer",

        CXModuleMapDescriptor("descriptor"),
        unsigned_int("options"),
        Check(1)..char.p.p("out_buffer_ptr"),
        Check(1)..unsigned_int.p("out_buffer_size")
    )

    void(
        "ModuleMapDescriptor_dispose",

        CXModuleMapDescriptor("descriptor")
    )
}