/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.libffi

import org.lwjgl.generator.*

val ffi_abi = "ffi_abi".enumType
val ffi_status = "ffi_status".enumType

val FFI_FN_TYPE = "FFI_FN_TYPE".handle

val ffi_type = struct(Module.CORE_LIBFFI, "FFIType", nativeName = "ffi_type") {
    documentation = "Contains information about a libffi type."

    size_t("size", "set by libffi; you should initialize it to zero.")
    unsigned_short("alignment", "set by libffi; you should initialize it to zero.")
    unsigned_short("type", "for a structure, this should be set to #TYPE_STRUCT.")
    nullable.."ffi_type".handle.p(
        "elements",
        "a null-terminated array of pointers to {@code ffi_type} objects. There is one element per field of the struct."
    )
}

val ffi_cif = struct(Module.CORE_LIBFFI, "FFICIF", nativeName = "ffi_cif", nativeLayout = true, mutable = false) {
    documentation = "Contains information about a libffi call interface."
    nativeDirective("""
DISABLE_WARNINGS()
#include "ffi.h"
ENABLE_WARNINGS()""")

    ffi_abi("abi", "")
    unsigned("nargs", "")
    ffi_type.p.p("arg_types", "")
    ffi_type.p("rtype", "")
    unsigned("bytes", "")
    unsigned("flags", "")
}

// Closures

val ffi_closure = struct(Module.CORE_LIBFFI, "FFIClosure", nativeName = "ffi_closure", nativeLayout = true, mutable = false) {
    documentation = "The libffi closure structure."
    nativeDirective("""
DISABLE_WARNINGS()
#include "ffi.h"
ENABLE_WARNINGS()""")

    ffi_cif.p("cif", "a pointer to an {@code ffi_cif} structure")
    "void (*)(ffi_cif*,void*,void**,void*)".handle("fun", "a pointer to a function")
    opaque_p("user_data", "a pointer to user-specified data")
}
val FFI_CLOSURE_FUN = "FFI_CLOSURE_FUN".handle