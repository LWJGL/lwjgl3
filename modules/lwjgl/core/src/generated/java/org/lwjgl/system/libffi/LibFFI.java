/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.libffi;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://sourceware.org/libffi">libffi</a> library.
 * 
 * <p>The foreign function interface provides a mechanism by which a function can generate a call to another function at runtime without requiring knowledge
 * of the called function's interface at compile time. This enables use of native libraries that LWJGL does not provide bindings for.</p>
 * 
 * <p>libffi assumes that you have a pointer to the function you wish to call and that you know the number and types of arguments to pass it, as well as the
 * return type of the function.</p>
 * 
 * <p>The first thing you must do is create an {@link FFICIF} object that matches the signature of the function you wish to call. This is a separate step
 * because it is common to make multiple calls using a single {@link FFICIF}. The {@code cif} in {@code ffi_cif} stands for Call InterFace. To prepare a
 * call interface object, use the function {@link #ffi_prep_cif prep_cif}. To call a function using an initialized {@code ffi_cif}, use the {@link #ffi_call call} function.</p>
 */
public class LibFFI {

    static { Library.initialize(); }

    /** Types used to create custom {@link FFICIF}. */
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

    /**
     * ABI enumeration.
     * 
     * <p><b>LWJGL note</b>: ABIs that are not applicable to the current platform will have a value of -1 and should not be used.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FFI_FIRST_ABI FIRST_ABI}</li>
     * <li>{@link #FFI_WIN64 WIN64}</li>
     * <li>{@link #FFI_GNUW64 GNUW64}</li>
     * <li>{@link #FFI_UNIX64 UNIX64}</li>
     * <li>{@link #FFI_EFI64 EFI64}</li>
     * <li>{@link #FFI_SYSV SYSV}</li>
     * <li>{@link #FFI_STDCALL STDCALL}</li>
     * <li>{@link #FFI_THISCALL THISCALL}</li>
     * <li>{@link #FFI_FASTCALL FASTCALL}</li>
     * <li>{@link #FFI_MS_CDECL MS_CDECL}</li>
     * <li>{@link #FFI_PASCAL PASCAL}</li>
     * <li>{@link #FFI_REGISTER REGISTER}</li>
     * <li>{@link #FFI_VFP VFP}</li>
     * <li>{@link #FFI_LAST_ABI LAST_ABI}</li>
     * <li>{@link #FFI_DEFAULT_ABI DEFAULT_ABI}</li>
     * </ul>
     */
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

    /**
     * Status codes.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FFI_OK OK}</li>
     * <li>{@link #FFI_BAD_TYPEDEF BAD_TYPEDEF}</li>
     * <li>{@link #FFI_BAD_ABI BAD_ABI}</li>
     * <li>{@link #FFI_BAD_ARGTYPE BAD_ARGTYPE}</li>
     * </ul>
     */
    public static final int
        FFI_OK          = 0,
        FFI_BAD_TYPEDEF = 1,
        FFI_BAD_ABI     = 2,
        FFI_BAD_ARGTYPE = 3;

    protected LibFFI() {
        throw new UnsupportedOperationException();
    }

    // --- [ FFI_TYPE_DOUBLE ] ---

    /** The double type. */
    private static native short FFI_TYPE_DOUBLE();

    // --- [ FFI_WIN64 ] ---

    private static native int FFI_WIN64();

    // --- [ FFI_GNUW64 ] ---

    private static native int FFI_GNUW64();

    // --- [ FFI_UNIX64 ] ---

    private static native int FFI_UNIX64();

    // --- [ FFI_EFI64 ] ---

    private static native int FFI_EFI64();

    // --- [ FFI_SYSV ] ---

    private static native int FFI_SYSV();

    // --- [ FFI_STDCALL ] ---

    private static native int FFI_STDCALL();

    // --- [ FFI_THISCALL ] ---

    private static native int FFI_THISCALL();

    // --- [ FFI_FASTCALL ] ---

    private static native int FFI_FASTCALL();

    // --- [ FFI_MS_CDECL ] ---

    private static native int FFI_MS_CDECL();

    // --- [ FFI_PASCAL ] ---

    private static native int FFI_PASCAL();

    // --- [ FFI_REGISTER ] ---

    private static native int FFI_REGISTER();

    // --- [ FFI_VFP ] ---

    private static native int FFI_VFP();

    // --- [ FFI_FIRST_ABI ] ---

    private static native int FFI_FIRST_ABI();

    // --- [ FFI_LAST_ABI ] ---

    private static native int FFI_LAST_ABI();

    // --- [ FFI_DEFAULT_ABI ] ---

    private static native int FFI_DEFAULT_ABI();

    // --- [ ffi_type_void ] ---

    private static native long nffi_type_void();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_void() {
        long __result = nffi_type_void();
        return FFIType.create(__result);
    }

    /** The {@code ffi_type_void} struct. */
    public static final FFIType ffi_type_void = ffi_type_void();

    // --- [ ffi_type_uint8 ] ---

    private static native long nffi_type_uint8();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_uint8() {
        long __result = nffi_type_uint8();
        return FFIType.create(__result);
    }

    /** The {@code ffi_type_uint8} struct. */
    public static final FFIType ffi_type_uint8 = ffi_type_uint8();

    // --- [ ffi_type_sint8 ] ---

    private static native long nffi_type_sint8();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_sint8() {
        long __result = nffi_type_sint8();
        return FFIType.create(__result);
    }

    /** The {@code ffi_type_sint8} struct. */
    public static final FFIType ffi_type_sint8 = ffi_type_sint8();

    // --- [ ffi_type_uint16 ] ---

    private static native long nffi_type_uint16();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_uint16() {
        long __result = nffi_type_uint16();
        return FFIType.create(__result);
    }

    /** The {@code ffi_type_uint16} struct. */
    public static final FFIType ffi_type_uint16 = ffi_type_uint16();

    // --- [ ffi_type_sint16 ] ---

    private static native long nffi_type_sint16();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_sint16() {
        long __result = nffi_type_sint16();
        return FFIType.create(__result);
    }

    /** The {@code ffi_type_sint16} struct. */
    public static final FFIType ffi_type_sint16 = ffi_type_sint16();

    // --- [ ffi_type_uint32 ] ---

    private static native long nffi_type_uint32();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_uint32() {
        long __result = nffi_type_uint32();
        return FFIType.create(__result);
    }

    /** The {@code ffi_type_uint32} struct. */
    public static final FFIType ffi_type_uint32 = ffi_type_uint32();

    // --- [ ffi_type_sint32 ] ---

    private static native long nffi_type_sint32();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_sint32() {
        long __result = nffi_type_sint32();
        return FFIType.create(__result);
    }

    /** The {@code ffi_type_sint32} struct. */
    public static final FFIType ffi_type_sint32 = ffi_type_sint32();

    // --- [ ffi_type_uint64 ] ---

    private static native long nffi_type_uint64();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_uint64() {
        long __result = nffi_type_uint64();
        return FFIType.create(__result);
    }

    /** The {@code ffi_type_uint64} struct. */
    public static final FFIType ffi_type_uint64 = ffi_type_uint64();

    // --- [ ffi_type_sint64 ] ---

    private static native long nffi_type_sint64();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_sint64() {
        long __result = nffi_type_sint64();
        return FFIType.create(__result);
    }

    /** The {@code ffi_type_sint64} struct. */
    public static final FFIType ffi_type_sint64 = ffi_type_sint64();

    // --- [ ffi_type_uchar ] ---

    private static native long nffi_type_uchar();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_uchar() {
        long __result = nffi_type_uchar();
        return FFIType.create(__result);
    }

    /** The {@code ffi_type_uchar} struct. */
    public static final FFIType ffi_type_uchar = ffi_type_uchar();

    // --- [ ffi_type_schar ] ---

    private static native long nffi_type_schar();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_schar() {
        long __result = nffi_type_schar();
        return FFIType.create(__result);
    }

    /** The {@code ffi_type_schar} struct. */
    public static final FFIType ffi_type_schar = ffi_type_schar();

    // --- [ ffi_type_ushort ] ---

    private static native long nffi_type_ushort();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_ushort() {
        long __result = nffi_type_ushort();
        return FFIType.create(__result);
    }

    /** The {@code ffi_type_ushort} struct. */
    public static final FFIType ffi_type_ushort = ffi_type_ushort();

    // --- [ ffi_type_sshort ] ---

    private static native long nffi_type_sshort();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_sshort() {
        long __result = nffi_type_sshort();
        return FFIType.create(__result);
    }

    /** The {@code ffi_type_sshort} struct. */
    public static final FFIType ffi_type_sshort = ffi_type_sshort();

    // --- [ ffi_type_uint ] ---

    private static native long nffi_type_uint();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_uint() {
        long __result = nffi_type_uint();
        return FFIType.create(__result);
    }

    /** The {@code ffi_type_uint} struct. */
    public static final FFIType ffi_type_uint = ffi_type_uint();

    // --- [ ffi_type_sint ] ---

    private static native long nffi_type_sint();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_sint() {
        long __result = nffi_type_sint();
        return FFIType.create(__result);
    }

    /** The {@code ffi_type_sint} struct. */
    public static final FFIType ffi_type_sint = ffi_type_sint();

    // --- [ ffi_type_ulong ] ---

    private static native long nffi_type_ulong();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_ulong() {
        long __result = nffi_type_ulong();
        return FFIType.create(__result);
    }

    /** The {@code ffi_type_ulong} struct. */
    public static final FFIType ffi_type_ulong = ffi_type_ulong();

    // --- [ ffi_type_slong ] ---

    private static native long nffi_type_slong();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_slong() {
        long __result = nffi_type_slong();
        return FFIType.create(__result);
    }

    /** The {@code ffi_type_slong} struct. */
    public static final FFIType ffi_type_slong = ffi_type_slong();

    // --- [ ffi_type_float ] ---

    private static native long nffi_type_float();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_float() {
        long __result = nffi_type_float();
        return FFIType.create(__result);
    }

    /** The {@code ffi_type_float} struct. */
    public static final FFIType ffi_type_float = ffi_type_float();

    // --- [ ffi_type_double ] ---

    private static native long nffi_type_double();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_double() {
        long __result = nffi_type_double();
        return FFIType.create(__result);
    }

    /** The {@code ffi_type_double} struct. */
    public static final FFIType ffi_type_double = ffi_type_double();

    // --- [ ffi_type_longdouble ] ---

    private static native long nffi_type_longdouble();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_longdouble() {
        long __result = nffi_type_longdouble();
        return FFIType.create(__result);
    }

    /** The {@code ffi_type_longdouble} struct. */
    public static final FFIType ffi_type_longdouble = ffi_type_longdouble();

    // --- [ ffi_type_pointer ] ---

    private static native long nffi_type_pointer();

    @NativeType("ffi_type *")
    private static FFIType ffi_type_pointer() {
        long __result = nffi_type_pointer();
        return FFIType.create(__result);
    }

    /** The {@code ffi_type_pointer} struct. */
    public static final FFIType ffi_type_pointer = ffi_type_pointer();

    // --- [ ffi_prep_cif ] ---

    /**
     * Unsafe version of: {@link #ffi_prep_cif prep_cif}
     *
     * @param nargs the number of arguments that this function accepts
     */
    public static native int nffi_prep_cif(long cif, int abi, int nargs, long rtype, long atypes);

    /**
     * Initializes the specified Call Interface (CIF) according to the given parameters.
     * 
     * <p>The resulting {@code ffi_cif} holds pointers to all the {@code ffi_type} objects that were used during initialization. You must ensure that these type
     * objects have a lifetime at least as long as that of the {@code ffi_cif}.</p>
     *
     * @param cif    the {@code ffi_cif} structure to prepare
     * @param abi    the ABI to use; normally {@link #FFI_DEFAULT_ABI DEFAULT_ABI} is what you want. One of:<br><table><tr><td>{@link #FFI_FIRST_ABI FIRST_ABI}</td><td>{@link #FFI_WIN64 WIN64}</td><td>{@link #FFI_GNUW64 GNUW64}</td><td>{@link #FFI_UNIX64 UNIX64}</td><td>{@link #FFI_EFI64 EFI64}</td><td>{@link #FFI_SYSV SYSV}</td><td>{@link #FFI_STDCALL STDCALL}</td><td>{@link #FFI_THISCALL THISCALL}</td><td>{@link #FFI_FASTCALL FASTCALL}</td><td>{@link #FFI_MS_CDECL MS_CDECL}</td><td>{@link #FFI_PASCAL PASCAL}</td></tr><tr><td>{@link #FFI_REGISTER REGISTER}</td><td>{@link #FFI_VFP VFP}</td><td>{@link #FFI_LAST_ABI LAST_ABI}</td><td>{@link #FFI_DEFAULT_ABI DEFAULT_ABI}</td></tr></table>
     * @param rtype  a pointer to an {@code ffi_type} structure that describes the return type of the function
     * @param atypes a vector of {@code ffi_type} pointers. {@code atypes} must have {@code nargs} elements. If {@code nargs} is 0, this argument is ignored.
     *
     * @return a status code, of type {@code ffi_status}.
     *         
     *         <p>This will be either {@link #FFI_OK OK} if everything worked properly; {@link #FFI_BAD_TYPEDEF BAD_TYPEDEF} if one of the {@code ffi_type} objects is incorrect; or {@link #FFI_BAD_ABI BAD_ABI} if the ABI
     *         parameter is invalid.</p>
     */
    @NativeType("ffi_status")
    public static int ffi_prep_cif(@NativeType("ffi_cif *") FFICIF cif, @NativeType("ffi_abi") int abi, @NativeType("ffi_type *") FFIType rtype, @Nullable @NativeType("ffi_type **") PointerBuffer atypes) {
        return nffi_prep_cif(cif.address(), abi, remainingSafe(atypes), rtype.address(), memAddressSafe(atypes));
    }

    // --- [ ffi_prep_cif_var ] ---

    /**
     * Unsafe version of: {@link #ffi_prep_cif_var prep_cif_var}
     *
     * @param ntotalargs the total number of arguments, including variadic and fixed arguments
     */
    public static native int nffi_prep_cif_var(long cif, int abi, int nfixedargs, int ntotalargs, long rtype, long atypes);

    /**
     * Initializes the specified Call Interface (CIF) according to the given parameters for a call to a variadic function.
     * 
     * <p>Different CIF's must be prepped for calls to the same function when different numbers of arguments are passed. A call to {@code ffi_prep_cif_var} with
     * {@code nfixedargs == ntotalargs} is NOT equivalent to a call to {@link #ffi_prep_cif prep_cif}.</p>
     * 
     * <p>The resulting {@code ffi_cif} holds pointers to all the {@code ffi_type} objects that were used during initialization. You must ensure that these type
     * objects have a lifetime at least as long as that of the {@code ffi_cif}.</p>
     *
     * @param cif        the {@code ffi_cif} structure to prepare
     * @param abi        the ABI to use; normally {@link #FFI_DEFAULT_ABI DEFAULT_ABI} is what you want. One of:<br><table><tr><td>{@link #FFI_FIRST_ABI FIRST_ABI}</td><td>{@link #FFI_WIN64 WIN64}</td><td>{@link #FFI_GNUW64 GNUW64}</td><td>{@link #FFI_UNIX64 UNIX64}</td><td>{@link #FFI_EFI64 EFI64}</td><td>{@link #FFI_SYSV SYSV}</td><td>{@link #FFI_STDCALL STDCALL}</td><td>{@link #FFI_THISCALL THISCALL}</td><td>{@link #FFI_FASTCALL FASTCALL}</td><td>{@link #FFI_MS_CDECL MS_CDECL}</td><td>{@link #FFI_PASCAL PASCAL}</td></tr><tr><td>{@link #FFI_REGISTER REGISTER}</td><td>{@link #FFI_VFP VFP}</td><td>{@link #FFI_LAST_ABI LAST_ABI}</td><td>{@link #FFI_DEFAULT_ABI DEFAULT_ABI}</td></tr></table>
     * @param nfixedargs the number of fixed arguments, prior to any variadic arguments. It must be greater than zero.
     * @param rtype      a pointer to an {@code ffi_type} structure that describes the return type of the function
     * @param atypes     a vector of {@code ffi_type} pointers. {@code atypes} must have {@code ntotalargs} elements.
     *
     * @return a status code, of type {@code ffi_status}.
     *         
     *         <p>This will be either {@link #FFI_OK OK} if everything worked properly; {@link #FFI_BAD_TYPEDEF BAD_TYPEDEF} if one of the {@code ffi_type} objects is incorrect; or {@link #FFI_BAD_ABI BAD_ABI} if the ABI
     *         parameter is invalid.</p>
     */
    @NativeType("ffi_status")
    public static int ffi_prep_cif_var(@NativeType("ffi_cif *") FFICIF cif, @NativeType("ffi_abi") int abi, @NativeType("unsigned int") int nfixedargs, @NativeType("ffi_type *") FFIType rtype, @NativeType("ffi_type **") PointerBuffer atypes) {
        return nffi_prep_cif_var(cif.address(), abi, nfixedargs, atypes.remaining(), rtype.address(), memAddress(atypes));
    }

    // --- [ ffi_call ] ---

    /** Unsafe version of: {@link #ffi_call call} */
    public static native void nffi_call(long cif, long fn, long rvalue, long avalues);

    /**
     * Calls the function {@code fn} according to the description given in {@code cif}.
     * 
     * <p>{@code cif} must have already been prepared using {@link #ffi_prep_cif prep_cif}.</p>
     *
     * @param cif     a {@link FFICIF} structure. It must be initialized with {@link #ffi_prep_cif prep_cif} or {@link #ffi_prep_cif_var prep_cif_var} before it is used with {@code ffi_call}.
     * @param fn      the function to call
     * @param rvalue  a pointer to a chunk of memory that will hold the result of the function call.
     *                
     *                <p>This must be large enough to hold the result, no smaller than the system register size (generally 32 or 64 bits), and must be suitably aligned; it
     *                is the caller's responsibility to ensure this. If CIF declares that the function returns {@code void} (using {@link #ffi_type_void type_void}), then {@code rvalue} is
     *                ignored.</p>
     *                
     *                <p>In most situations, libffi will handle promotion according to the ABI. However, for historical reasons, there is a special case with return values
     *                that must be handled by your code. In particular, for integral (not {@code struct}) types that are narrower than the system register size, the
     *                return value will be widened by libffi. libffi provides a type, {@code ffi_arg}, that can be used as the return type. For example, if the CIF was
     *                defined with a return type of {@code char}, libffi will try to store a full {@code ffi_arg} into the return value.</p>
     * @param avalues a vector of {@code void *} pointers that point to the memory locations holding the argument values for a call.
     *                
     *                <p>If {@code cif} declares that the function has no arguments (i.e., {@code nargs} was 0), then {@code avalues} is ignored. Note that argument values
     *                may be modified by the callee (for instance, structs passed by value); the burden of copying pass-by-value arguments is placed on the caller.</p>
     *                
     *                <p>Note that while the return value must be register-sized, arguments should exactly match their declared type. For example, if an argument is a
     *                {@code short}, then the entry in {@code avalues} should point to an object declared as {@code short}; but if the return type is {@code short}, then
     *                {@code rvalue} should point to an object declared as a larger type - usually {@code ffi_arg}.</p>
     */
    public static void ffi_call(@NativeType("ffi_cif *") FFICIF cif, @NativeType("FFI_FN_TYPE") long fn, @Nullable @NativeType("void *") ByteBuffer rvalue, @Nullable @NativeType("void **") PointerBuffer avalues) {
        if (CHECKS) {
            check(fn);
        }
        nffi_call(cif.address(), fn, memAddressSafe(rvalue), memAddressSafe(avalues));
    }

    // --- [ ffi_get_struct_offsets ] ---

    /** Unsafe version of: {@link #ffi_get_struct_offsets get_struct_offsets} */
    public static native int nffi_get_struct_offsets(int abi, long struct_type, long offsets);

    /**
     * Computes the offset of each element of the given structure type.
     *
     * @param abi     the ABI to use; this is needed because in some cases the layout depends on the ABI
     * @param offsets an out parameter. The caller is responsible for providing enough space for all the results to be written - one element per element type in
     *                {@code struct_type}. If {@code offsets} is {@code NULL}, then the type will be laid out but not otherwise modified. This can be useful for accessing the
     *                type's size or layout.
     *
     * @return returns {@link #FFI_OK OK} on success; {@link #FFI_BAD_ABI BAD_ABI} if {@code abi} is invalid; or {@link #FFI_BAD_TYPEDEF BAD_TYPEDEF} if {@code struct_type} is invalid in some way. Note that only
     *         {@code FFI_STRUCT} types are valid here.
     */
    @NativeType("ffi_status")
    public static int ffi_get_struct_offsets(@NativeType("ffi_abi") int abi, @NativeType("ffi_type *") FFIType struct_type, @Nullable @NativeType("size_t *") PointerBuffer offsets) {
        return nffi_get_struct_offsets(abi, struct_type.address(), memAddressSafe(offsets));
    }

    // --- [ ffi_closure_alloc ] ---

    /** Unsafe version of: {@link #ffi_closure_alloc closure_alloc} */
    public static native long nffi_closure_alloc(long size, long code);

    /**
     * Allocates a chunk of memory holding {@code size} bytes.
     * 
     * <p>Returns a pointer to the writable address, and sets {@code *code} to the corresponding executable address.</p>
     *
     * @param size the number of bytes to allocate. Should be sufficient to hold an {@code ffi_closure} object ({@link FFIClosure#SIZEOF}).
     * @param code a buffer in which to place the returned executable address
     *
     * @return a pointer to the writable address
     */
    @Nullable
    @NativeType("ffi_closure *")
    public static FFIClosure ffi_closure_alloc(@NativeType("size_t") long size, @NativeType("void **") PointerBuffer code) {
        if (CHECKS) {
            check(code, 1);
        }
        long __result = nffi_closure_alloc(size, memAddress(code));
        return FFIClosure.createSafe(__result);
    }

    // --- [ ffi_closure_free ] ---

    /** Unsafe version of: {@link #ffi_closure_free closure_free} */
    public static native void nffi_closure_free(long writable);

    /**
     * Frees memory allocated using {@link #ffi_closure_alloc closure_alloc}.
     *
     * @param writable the address of an {@link FFIClosure} structure
     */
    public static void ffi_closure_free(@NativeType("ffi_closure *") FFIClosure writable) {
        nffi_closure_free(writable.address());
    }

    // --- [ ffi_prep_closure_loc ] ---

    /** Unsafe version of: {@link #ffi_prep_closure_loc prep_closure_loc} */
    public static native int nffi_prep_closure_loc(long closure, long cif, long fun, long user_data, long codeloc);

    /**
     * Prepares a closure function.
     * 
     * <p>After calling {@code ffi_prep_closure_loc,} you can cast {@code codeloc} to the appropriate pointer-to-function type.</p>
     *
     * @param closure   the address of an {@code ffi_closure} object; this is the writable address returned by {@link #ffi_closure_alloc closure_alloc}.
     * @param cif       the {@code ffi_cif} describing the function parameters
     * @param fun       the function which will be called when the closure is invoked. It is called with the arguments:
     *                  
     *                  <ul>
     *                  <li>{@code cif} - The {@code ffi_cif} passed to {@code ffi_prep_closure_loc}.</li>
     *                  <li>{@code ret} - a pointer to the memory used for the function's return value.
     *                  
     *                  <p>If the function is declared as returning {@code void}, then this value is garbage and should not be used.</p>
     *                  
     *                  <p>Otherwise, {@code fun} must fill the object to which this points, following the same special promotion behavior as {@code ffi_call}. That is,
     *                  in most cases, {@code ret} points to an object of exactly the size of the type specified when {@code cif} was constructed. However, integral
     *                  types narrower than the system register size are widened. In these cases your program may assume that {@code ret} points to an {@code ffi_arg}
     *                  object.</p></li>
     *                  <li>{@code args} - a vector of pointers to memory holding the arguments to the function.</li>
     *                  <li>{@code user_data} - the same USER_DATA that was passed to {@code ffi_prep_closure_loc}.</li>
     *                  </ul>
     * @param user_data an arbitrary datum that is passed, uninterpreted, to your closure function
     * @param codeloc   the executable address returned by {@link #ffi_closure_alloc closure_alloc}.
     *
     * @return {@link #FFI_OK OK} if everything went ok, and one of the other {@code ffi_status} values on error
     */
    @NativeType("ffi_status")
    public static int ffi_prep_closure_loc(@NativeType("ffi_closure *") FFIClosure closure, @NativeType("ffi_cif *") FFICIF cif, @NativeType("FFI_CLOSURE_FUN") long fun, @NativeType("void *") long user_data, @NativeType("void *") long codeloc) {
        if (CHECKS) {
            check(fun);
            check(codeloc);
        }
        return nffi_prep_closure_loc(closure.address(), cif.address(), fun, user_data, codeloc);
    }

}