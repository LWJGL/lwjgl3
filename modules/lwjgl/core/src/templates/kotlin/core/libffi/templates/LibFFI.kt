/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.libffi.templates

import org.lwjgl.generator.*
import core.libffi.*

fun LibFFI() = "LibFFI".nativeClass(Module.CORE_LIBFFI, prefix = "FFI_") {
    nativeDirective("""
DISABLE_WARNINGS()
#define FFI_STATIC_BUILD
#include "ffi.h"
ENABLE_WARNINGS()
typedef void (*FFI_FN_TYPE)(void);
typedef void (*FFI_CLOSURE_FUN)(ffi_cif*, void*, void**, void*);

#ifndef HAS_FFI_WIN64
#define FFI_WIN64 -1
#endif
#ifndef HAS_FFI_GNUW64
#define FFI_GNUW64 -1
#endif
#ifndef HAS_FFI_UNIX64
#define FFI_UNIX64 -1
#endif
#ifndef HAS_FFI_EFI64
#define FFI_EFI64 -1
#endif
#ifndef HAS_FFI_SYSV
#define FFI_SYSV -1
#endif
#ifndef HAS_FFI_STDCALL
#define FFI_STDCALL -1
#endif
#ifndef HAS_FFI_THISCALL
#define FFI_THISCALL -1
#endif
#ifndef HAS_FFI_FASTCALL
#define FFI_FASTCALL -1
#endif
#ifndef HAS_FFI_MS_CDECL
#define FFI_MS_CDECL -1
#endif
#ifndef HAS_FFI_PASCAL
#define FFI_PASCAL -1
#endif
#ifndef HAS_FFI_REGISTER
#define FFI_REGISTER -1
#endif
#ifndef HAS_FFI_VFP
#define FFI_VFP -1
#endif""")

    StringConstant("VERSION_STRING".."3.5.0")
    IntConstant("VERSION_NUMBER"..30500)

    ShortConstant(
        "TYPE_VOID".."0",
        "TYPE_INT".."1",
        "TYPE_FLOAT".."2",
        "TYPE_DOUBLE".."3",
        "TYPE_LONGDOUBLE".."FFI_TYPE_DOUBLE()",
        "TYPE_UINT8".."5",
        "TYPE_SINT8".."6",
        "TYPE_UINT16".."7",
        "TYPE_SINT16".."8",
        "TYPE_UINT32".."9",
        "TYPE_SINT32".."10",
        "TYPE_UINT64".."11",
        "TYPE_SINT64".."12",
        "TYPE_STRUCT".."13",
        "TYPE_POINTER".."14"
    )

    macro(variable=true)..private..short(
        "FFI_TYPE_DOUBLE",

        void(),
        noPrefix = true
    )

    EnumConstant(
        "FIRST_ABI".enum("FFI_FIRST_ABI()"),

        "WIN64".enum("FFI_WIN64()"),
        "GNUW64".enum("FFI_GNUW64()"),
        "UNIX64".enum("FFI_UNIX64()"),
        "EFI64".enum("FFI_EFI64()"),
        "SYSV".enum("FFI_SYSV()"),
        "STDCALL".enum("FFI_STDCALL()"),
        "THISCALL".enum("FFI_THISCALL()"),
        "FASTCALL".enum("FFI_FASTCALL()"),
        "MS_CDECL".enum("FFI_MS_CDECL()"),
        "PASCAL".enum("FFI_PASCAL()"),
        "REGISTER".enum("FFI_REGISTER()"),
        "VFP".enum("FFI_VFP()"),

        "LAST_ABI".enum("FFI_LAST_ABI()"),
        "DEFAULT_ABI".enum("FFI_DEFAULT_ABI()")
    )

    macro(variable=true)..private..int("FFI_WIN64", void(), noPrefix = true)
    macro(variable=true)..private..int("FFI_GNUW64", void(), noPrefix = true)
    macro(variable=true)..private..int("FFI_UNIX64", void(), noPrefix = true)
    macro(variable=true)..private..int("FFI_EFI64", void(), noPrefix = true)
    macro(variable=true)..private..int("FFI_SYSV", void(), noPrefix = true)
    macro(variable=true)..private..int("FFI_STDCALL", void(), noPrefix = true)
    macro(variable=true)..private..int("FFI_THISCALL", void(), noPrefix = true)
    macro(variable=true)..private..int("FFI_FASTCALL", void(), noPrefix = true)
    macro(variable=true)..private..int("FFI_MS_CDECL", void(), noPrefix = true)
    macro(variable=true)..private..int("FFI_PASCAL", void(), noPrefix = true)
    macro(variable=true)..private..int("FFI_REGISTER", void(), noPrefix = true)
    macro(variable=true)..private..int("FFI_VFP", void(), noPrefix = true)

    macro(variable=true)..private..int("FFI_FIRST_ABI", void(), noPrefix = true)
    macro(variable=true)..private..int("FFI_LAST_ABI", void(), noPrefix = true)
    macro(variable=true)..private..int("FFI_DEFAULT_ABI", void(), noPrefix = true)

    EnumConstant(
        "OK".enum,
        "BAD_TYPEDEF".enum,
        "BAD_ABI".enum,
        "BAD_ARGTYPE".enum
    )

    macro..Address..ffi_type.p("type_void", void())

    macro..Address..ffi_type.p("type_uint8", void())
    macro..Address..ffi_type.p("type_sint8", void())
    macro..Address..ffi_type.p("type_uint16", void())
    macro..Address..ffi_type.p("type_sint16", void())
    macro..Address..ffi_type.p("type_uint32", void())
    macro..Address..ffi_type.p("type_sint32", void())
    macro..Address..ffi_type.p("type_uint64", void())
    macro..Address..ffi_type.p("type_sint64", void())

    macro..Address..ffi_type.p("type_uchar", void())
    macro..Address..ffi_type.p("type_schar", void())
    macro..Address..ffi_type.p("type_ushort", void())
    macro..Address..ffi_type.p("type_sshort", void())
    macro..Address..ffi_type.p("type_uint", void())
    macro..Address..ffi_type.p("type_sint", void())
    macro..Address..ffi_type.p("type_ulong", void())
    macro..Address..ffi_type.p("type_slong", void())

    macro..Address..ffi_type.p("type_float", void())
    macro..Address..ffi_type.p("type_double", void())
    macro..Address..ffi_type.p("type_longdouble", void())

    macro..Address..ffi_type.p("type_pointer", void())

    charASCII.const.p(
        "get_version",

        void()
    )

    unsigned_long(
        "get_version_number",

        void()
    )

    unsigned_int(
        "get_default_abi",

        void()
    )

    ffi_status(
        "prep_cif",

        ffi_cif.p("cif"),
        ffi_abi("abi"),
        AutoSize("atypes")..unsigned_int("nargs"),
        ffi_type.p("rtype"),
        nullable..ffi_type.p.p("atypes")
    )

    ffi_status(
        "prep_cif_var",

        ffi_cif.p("cif"),
        ffi_abi("abi"),
        unsigned_int("nfixedargs"),
        AutoSize("atypes")..unsigned_int("ntotalargs"),
        ffi_type.p("rtype"),
        ffi_type.p.p("atypes")
    )

    void(
        "call",

        ffi_cif.p("cif"),
        FFI_FN_TYPE("fn"),
        Unsafe..nullable..void.p("rvalue"),
        Unsafe..nullable..void.p.p("avalues")
    )

    ffi_status(
        "get_struct_offsets",

        ffi_abi("abi"),
        ffi_type.p("struct_type"),
        Unsafe..nullable..size_t.p("offsets")
    )

    size_t(
        "get_closure_size",

        void()
    )

    ffi_closure.p(
        "closure_alloc",

        size_t("size"),
        Check(1)..void.p.p("code")
    )

    void(
        "closure_free",

        ffi_closure.p("writable")
    )

    ffi_status(
        "prep_closure_loc",

        ffi_closure.p("closure"),
        ffi_cif.p("cif"),
        FFI_CLOSURE_FUN("fun"),
        nullable..opaque_p("user_data"),
        opaque_p("codeloc")
    )
}