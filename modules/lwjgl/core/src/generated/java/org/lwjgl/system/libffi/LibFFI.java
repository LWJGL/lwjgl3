/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.libffi;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public class LibFFI {

    static { Library.initialize(); }

    public static final String FFI_VERSION_STRING = "3.5.0";

    public static final int FFI_VERSION_NUMBER = 0x7724;

    public static final short
        FFI_TYPE_VOID       = 0,
        FFI_TYPE_INT        = 1,
        FFI_TYPE_FLOAT      = 2,
        FFI_TYPE_DOUBLE     = 3,
        FFI_TYPE_LONGDOUBLE = FFI_TYPE_DOUBLE(),
        FFI_TYPE_UINT8      = 5,
        FFI_TYPE_SINT8      = 6,
        FFI_TYPE_UINT16     = 7,
        FFI_TYPE_SINT16     = 8,
        FFI_TYPE_UINT32     = 9,
        FFI_TYPE_SINT32     = 10,
        FFI_TYPE_UINT64     = 11,
        FFI_TYPE_SINT64     = 12,
        FFI_TYPE_STRUCT     = 13,
        FFI_TYPE_POINTER    = 14;

    public static final int
        FFI_FIRST_ABI   = FFI_FIRST_ABI(),
        FFI_WIN64       = FFI_WIN64(),
        FFI_GNUW64      = FFI_GNUW64(),
        FFI_UNIX64      = FFI_UNIX64(),
        FFI_EFI64       = FFI_EFI64(),
        FFI_SYSV        = FFI_SYSV(),
        FFI_STDCALL     = FFI_STDCALL(),
        FFI_THISCALL    = FFI_THISCALL(),
        FFI_FASTCALL    = FFI_FASTCALL(),
        FFI_MS_CDECL    = FFI_MS_CDECL(),
        FFI_PASCAL      = FFI_PASCAL(),
        FFI_REGISTER    = FFI_REGISTER(),
        FFI_VFP         = FFI_VFP(),
        FFI_LAST_ABI    = FFI_LAST_ABI(),
        FFI_DEFAULT_ABI = FFI_DEFAULT_ABI();

    public static final int
        FFI_OK          = 0,
        FFI_BAD_TYPEDEF = 1,
        FFI_BAD_ABI     = 2,
        FFI_BAD_ARGTYPE = 3;

    protected LibFFI() {
        throw new UnsupportedOperationException();
    }

    // --- [ FFI_TYPE_DOUBLE ] ---

    /** {@code short FFI_TYPE_DOUBLE(void)} */
    private static native short FFI_TYPE_DOUBLE();

    // --- [ FFI_WIN64 ] ---

    /** {@code int FFI_WIN64(void)} */
    private static native int FFI_WIN64();

    // --- [ FFI_GNUW64 ] ---

    /** {@code int FFI_GNUW64(void)} */
    private static native int FFI_GNUW64();

    // --- [ FFI_UNIX64 ] ---

    /** {@code int FFI_UNIX64(void)} */
    private static native int FFI_UNIX64();

    // --- [ FFI_EFI64 ] ---

    /** {@code int FFI_EFI64(void)} */
    private static native int FFI_EFI64();

    // --- [ FFI_SYSV ] ---

    /** {@code int FFI_SYSV(void)} */
    private static native int FFI_SYSV();

    // --- [ FFI_STDCALL ] ---

    /** {@code int FFI_STDCALL(void)} */
    private static native int FFI_STDCALL();

    // --- [ FFI_THISCALL ] ---

    /** {@code int FFI_THISCALL(void)} */
    private static native int FFI_THISCALL();

    // --- [ FFI_FASTCALL ] ---

    /** {@code int FFI_FASTCALL(void)} */
    private static native int FFI_FASTCALL();

    // --- [ FFI_MS_CDECL ] ---

    /** {@code int FFI_MS_CDECL(void)} */
    private static native int FFI_MS_CDECL();

    // --- [ FFI_PASCAL ] ---

    /** {@code int FFI_PASCAL(void)} */
    private static native int FFI_PASCAL();

    // --- [ FFI_REGISTER ] ---

    /** {@code int FFI_REGISTER(void)} */
    private static native int FFI_REGISTER();

    // --- [ FFI_VFP ] ---

    /** {@code int FFI_VFP(void)} */
    private static native int FFI_VFP();

    // --- [ FFI_FIRST_ABI ] ---

    /** {@code int FFI_FIRST_ABI(void)} */
    private static native int FFI_FIRST_ABI();

    // --- [ FFI_LAST_ABI ] ---

    /** {@code int FFI_LAST_ABI(void)} */
    private static native int FFI_LAST_ABI();

    // --- [ FFI_DEFAULT_ABI ] ---

    /** {@code int FFI_DEFAULT_ABI(void)} */
    private static native int FFI_DEFAULT_ABI();

    // --- [ ffi_type_void ] ---

    private static native long nffi_type_void();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_void() {
        long __result = nffi_type_void();
        return FFIType.create(__result);
    }

    /** {@code ffi_type * ffi_type_void(void)} */
    public static final FFIType ffi_type_void = ffi_type_void();

    // --- [ ffi_type_uint8 ] ---

    private static native long nffi_type_uint8();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_uint8() {
        long __result = nffi_type_uint8();
        return FFIType.create(__result);
    }

    /** {@code ffi_type * ffi_type_uint8(void)} */
    public static final FFIType ffi_type_uint8 = ffi_type_uint8();

    // --- [ ffi_type_sint8 ] ---

    private static native long nffi_type_sint8();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_sint8() {
        long __result = nffi_type_sint8();
        return FFIType.create(__result);
    }

    /** {@code ffi_type * ffi_type_sint8(void)} */
    public static final FFIType ffi_type_sint8 = ffi_type_sint8();

    // --- [ ffi_type_uint16 ] ---

    private static native long nffi_type_uint16();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_uint16() {
        long __result = nffi_type_uint16();
        return FFIType.create(__result);
    }

    /** {@code ffi_type * ffi_type_uint16(void)} */
    public static final FFIType ffi_type_uint16 = ffi_type_uint16();

    // --- [ ffi_type_sint16 ] ---

    private static native long nffi_type_sint16();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_sint16() {
        long __result = nffi_type_sint16();
        return FFIType.create(__result);
    }

    /** {@code ffi_type * ffi_type_sint16(void)} */
    public static final FFIType ffi_type_sint16 = ffi_type_sint16();

    // --- [ ffi_type_uint32 ] ---

    private static native long nffi_type_uint32();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_uint32() {
        long __result = nffi_type_uint32();
        return FFIType.create(__result);
    }

    /** {@code ffi_type * ffi_type_uint32(void)} */
    public static final FFIType ffi_type_uint32 = ffi_type_uint32();

    // --- [ ffi_type_sint32 ] ---

    private static native long nffi_type_sint32();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_sint32() {
        long __result = nffi_type_sint32();
        return FFIType.create(__result);
    }

    /** {@code ffi_type * ffi_type_sint32(void)} */
    public static final FFIType ffi_type_sint32 = ffi_type_sint32();

    // --- [ ffi_type_uint64 ] ---

    private static native long nffi_type_uint64();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_uint64() {
        long __result = nffi_type_uint64();
        return FFIType.create(__result);
    }

    /** {@code ffi_type * ffi_type_uint64(void)} */
    public static final FFIType ffi_type_uint64 = ffi_type_uint64();

    // --- [ ffi_type_sint64 ] ---

    private static native long nffi_type_sint64();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_sint64() {
        long __result = nffi_type_sint64();
        return FFIType.create(__result);
    }

    /** {@code ffi_type * ffi_type_sint64(void)} */
    public static final FFIType ffi_type_sint64 = ffi_type_sint64();

    // --- [ ffi_type_uchar ] ---

    private static native long nffi_type_uchar();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_uchar() {
        long __result = nffi_type_uchar();
        return FFIType.create(__result);
    }

    /** {@code ffi_type * ffi_type_uchar(void)} */
    public static final FFIType ffi_type_uchar = ffi_type_uchar();

    // --- [ ffi_type_schar ] ---

    private static native long nffi_type_schar();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_schar() {
        long __result = nffi_type_schar();
        return FFIType.create(__result);
    }

    /** {@code ffi_type * ffi_type_schar(void)} */
    public static final FFIType ffi_type_schar = ffi_type_schar();

    // --- [ ffi_type_ushort ] ---

    private static native long nffi_type_ushort();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_ushort() {
        long __result = nffi_type_ushort();
        return FFIType.create(__result);
    }

    /** {@code ffi_type * ffi_type_ushort(void)} */
    public static final FFIType ffi_type_ushort = ffi_type_ushort();

    // --- [ ffi_type_sshort ] ---

    private static native long nffi_type_sshort();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_sshort() {
        long __result = nffi_type_sshort();
        return FFIType.create(__result);
    }

    /** {@code ffi_type * ffi_type_sshort(void)} */
    public static final FFIType ffi_type_sshort = ffi_type_sshort();

    // --- [ ffi_type_uint ] ---

    private static native long nffi_type_uint();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_uint() {
        long __result = nffi_type_uint();
        return FFIType.create(__result);
    }

    /** {@code ffi_type * ffi_type_uint(void)} */
    public static final FFIType ffi_type_uint = ffi_type_uint();

    // --- [ ffi_type_sint ] ---

    private static native long nffi_type_sint();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_sint() {
        long __result = nffi_type_sint();
        return FFIType.create(__result);
    }

    /** {@code ffi_type * ffi_type_sint(void)} */
    public static final FFIType ffi_type_sint = ffi_type_sint();

    // --- [ ffi_type_ulong ] ---

    private static native long nffi_type_ulong();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_ulong() {
        long __result = nffi_type_ulong();
        return FFIType.create(__result);
    }

    /** {@code ffi_type * ffi_type_ulong(void)} */
    public static final FFIType ffi_type_ulong = ffi_type_ulong();

    // --- [ ffi_type_slong ] ---

    private static native long nffi_type_slong();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_slong() {
        long __result = nffi_type_slong();
        return FFIType.create(__result);
    }

    /** {@code ffi_type * ffi_type_slong(void)} */
    public static final FFIType ffi_type_slong = ffi_type_slong();

    // --- [ ffi_type_float ] ---

    private static native long nffi_type_float();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_float() {
        long __result = nffi_type_float();
        return FFIType.create(__result);
    }

    /** {@code ffi_type * ffi_type_float(void)} */
    public static final FFIType ffi_type_float = ffi_type_float();

    // --- [ ffi_type_double ] ---

    private static native long nffi_type_double();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_double() {
        long __result = nffi_type_double();
        return FFIType.create(__result);
    }

    /** {@code ffi_type * ffi_type_double(void)} */
    public static final FFIType ffi_type_double = ffi_type_double();

    // --- [ ffi_type_longdouble ] ---

    private static native long nffi_type_longdouble();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_longdouble() {
        long __result = nffi_type_longdouble();
        return FFIType.create(__result);
    }

    /** {@code ffi_type * ffi_type_longdouble(void)} */
    public static final FFIType ffi_type_longdouble = ffi_type_longdouble();

    // --- [ ffi_type_pointer ] ---

    private static native long nffi_type_pointer();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_pointer() {
        long __result = nffi_type_pointer();
        return FFIType.create(__result);
    }

    /** {@code ffi_type * ffi_type_pointer(void)} */
    public static final FFIType ffi_type_pointer = ffi_type_pointer();

    // --- [ ffi_get_version ] ---

    /** {@code char const * ffi_get_version(void)} */
    public static native long nffi_get_version();

    /** {@code char const * ffi_get_version(void)} */
    @NativeType("char const *")
    public static @Nullable String ffi_get_version() {
        long __result = nffi_get_version();
        return memASCIISafe(__result);
    }

    // --- [ ffi_get_version_number ] ---

    /** {@code unsigned long ffi_get_version_number(void)} */
    @NativeType("unsigned long")
    public static native long ffi_get_version_number();

    // --- [ ffi_get_default_abi ] ---

    /** {@code unsigned int ffi_get_default_abi(void)} */
    @NativeType("unsigned int")
    public static native int ffi_get_default_abi();

    // --- [ ffi_prep_cif ] ---

    /** {@code ffi_status ffi_prep_cif(ffi_cif * cif, ffi_abi abi, unsigned int nargs, ffi_type * rtype, ffi_type ** atypes)} */
    public static native int nffi_prep_cif(long cif, int abi, int nargs, long rtype, long atypes);

    /** {@code ffi_status ffi_prep_cif(ffi_cif * cif, ffi_abi abi, unsigned int nargs, ffi_type * rtype, ffi_type ** atypes)} */
    @NativeType("ffi_status")
    public static int ffi_prep_cif(@NativeType("ffi_cif *") FFICIF cif, @NativeType("ffi_abi") int abi, @NativeType("ffi_type *") FFIType rtype, @NativeType("ffi_type **") @Nullable PointerBuffer atypes) {
        return nffi_prep_cif(cif.address(), abi, remainingSafe(atypes), rtype.address(), memAddressSafe(atypes));
    }

    // --- [ ffi_prep_cif_var ] ---

    /** {@code ffi_status ffi_prep_cif_var(ffi_cif * cif, ffi_abi abi, unsigned int nfixedargs, unsigned int ntotalargs, ffi_type * rtype, ffi_type ** atypes)} */
    public static native int nffi_prep_cif_var(long cif, int abi, int nfixedargs, int ntotalargs, long rtype, long atypes);

    /** {@code ffi_status ffi_prep_cif_var(ffi_cif * cif, ffi_abi abi, unsigned int nfixedargs, unsigned int ntotalargs, ffi_type * rtype, ffi_type ** atypes)} */
    @NativeType("ffi_status")
    public static int ffi_prep_cif_var(@NativeType("ffi_cif *") FFICIF cif, @NativeType("ffi_abi") int abi, @NativeType("unsigned int") int nfixedargs, @NativeType("ffi_type *") FFIType rtype, @NativeType("ffi_type **") PointerBuffer atypes) {
        return nffi_prep_cif_var(cif.address(), abi, nfixedargs, atypes.remaining(), rtype.address(), memAddress(atypes));
    }

    // --- [ ffi_call ] ---

    /** {@code void ffi_call(ffi_cif * cif, FFI_FN_TYPE fn, void * rvalue, void ** avalues)} */
    public static native void nffi_call(long cif, long fn, long rvalue, long avalues);

    /** {@code void ffi_call(ffi_cif * cif, FFI_FN_TYPE fn, void * rvalue, void ** avalues)} */
    public static void ffi_call(@NativeType("ffi_cif *") FFICIF cif, @NativeType("FFI_FN_TYPE") long fn, @NativeType("void *") @Nullable ByteBuffer rvalue, @NativeType("void **") @Nullable PointerBuffer avalues) {
        if (CHECKS) {
            check(fn);
        }
        nffi_call(cif.address(), fn, memAddressSafe(rvalue), memAddressSafe(avalues));
    }

    // --- [ ffi_get_struct_offsets ] ---

    /** {@code ffi_status ffi_get_struct_offsets(ffi_abi abi, ffi_type * struct_type, size_t * offsets)} */
    public static native int nffi_get_struct_offsets(int abi, long struct_type, long offsets);

    /** {@code ffi_status ffi_get_struct_offsets(ffi_abi abi, ffi_type * struct_type, size_t * offsets)} */
    @NativeType("ffi_status")
    public static int ffi_get_struct_offsets(@NativeType("ffi_abi") int abi, @NativeType("ffi_type *") FFIType struct_type, @NativeType("size_t *") @Nullable PointerBuffer offsets) {
        return nffi_get_struct_offsets(abi, struct_type.address(), memAddressSafe(offsets));
    }

    // --- [ ffi_get_closure_size ] ---

    /** {@code size_t ffi_get_closure_size(void)} */
    @NativeType("size_t")
    public static native long ffi_get_closure_size();

    // --- [ ffi_closure_alloc ] ---

    /** {@code ffi_closure * ffi_closure_alloc(size_t size, void ** code)} */
    public static native long nffi_closure_alloc(long size, long code);

    /** {@code ffi_closure * ffi_closure_alloc(size_t size, void ** code)} */
    @NativeType("ffi_closure *")
    public static @Nullable FFIClosure ffi_closure_alloc(@NativeType("size_t") long size, @NativeType("void **") PointerBuffer code) {
        if (CHECKS) {
            check(code, 1);
        }
        long __result = nffi_closure_alloc(size, memAddress(code));
        return FFIClosure.createSafe(__result);
    }

    // --- [ ffi_closure_free ] ---

    /** {@code void ffi_closure_free(ffi_closure * writable)} */
    public static native void nffi_closure_free(long writable);

    /** {@code void ffi_closure_free(ffi_closure * writable)} */
    public static void ffi_closure_free(@NativeType("ffi_closure *") FFIClosure writable) {
        nffi_closure_free(writable.address());
    }

    // --- [ ffi_prep_closure_loc ] ---

    /** {@code ffi_status ffi_prep_closure_loc(ffi_closure * closure, ffi_cif * cif, FFI_CLOSURE_FUN fun, void * user_data, void * codeloc)} */
    public static native int nffi_prep_closure_loc(long closure, long cif, long fun, long user_data, long codeloc);

    /** {@code ffi_status ffi_prep_closure_loc(ffi_closure * closure, ffi_cif * cif, FFI_CLOSURE_FUN fun, void * user_data, void * codeloc)} */
    @NativeType("ffi_status")
    public static int ffi_prep_closure_loc(@NativeType("ffi_closure *") FFIClosure closure, @NativeType("ffi_cif *") FFICIF cif, @NativeType("FFI_CLOSURE_FUN") long fun, @NativeType("void *") long user_data, @NativeType("void *") long codeloc) {
        if (CHECKS) {
            check(fun);
            check(codeloc);
        }
        return nffi_prep_closure_loc(closure.address(), cif.address(), fun, user_data, codeloc);
    }

}