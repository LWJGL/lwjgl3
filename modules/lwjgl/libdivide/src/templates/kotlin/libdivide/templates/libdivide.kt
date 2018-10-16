/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package libdivide.templates

import org.lwjgl.generator.*
import libdivide.*

val libdivide = "LibDivide".nativeClass(Module.LIBDIVIDE, prefixConstant = "LIBDIVIDE_", prefixMethod = "libdivide_", library = LIBDIVIDE_LIBRARY) {
    nativeImport("libdivide.h")
    javaImport("static org.lwjgl.system.MathUtil.*")
    documentation =
        """
        Native bindings to ${url("https://libdivide.com/", "libdivide")}.

        libdivide allows you to replace expensive integer divides with comparatively cheap multiplication and bitshifts. Compilers usually do this, but
        only when the divisor is known at compile time. libdivide allows you to take advantage of it at runtime. The result is that integer division can become
        faster - a lot faster.

        <b>LWJGL</b>: This is a hybrid implementation. Divider generation &amp; recovery methods use standard JNI bindings. All {@code *_do} &amp;
        {@code *_get_algorithm} functions have been ported to pure Java. This eliminates the JNI overhead and enables the JVM to inline and further optimize
        these methods.
        """

    EnumConstant(
        "",
        
        "32_SHIFT_MASK".enum(0x1F),
        "64_SHIFT_MASK".enum(0x3F),
        "ADD_MARKER".enum(0x40),
        "U32_SHIFT_PATH".enum(0x80),
        "U64_SHIFT_PATH".enum(0x80),
        "S32_SHIFT_PATH".enum(0x20),
        "NEGATIVE_DIVISOR".enum(0x80)
    )

    libdivide_s32_t("s32_gen", "", int32_t.IN("y", ""))
    libdivide_u32_t("u32_gen", "", uint32_t.IN("y", ""))
    libdivide_s64_t("s64_gen", "", int64_t.IN("y", ""))
    libdivide_u64_t("u64_gen", "", uint64_t.IN("y", ""))

    libdivide_s32_branchfree_t("s32_branchfree_gen", "", int32_t.IN("y", ""))
    libdivide_u32_branchfree_t("u32_branchfree_gen", "", uint32_t.IN("y", ""))
    libdivide_s64_branchfree_t("s64_branchfree_gen", "", int64_t.IN("y", ""))
    libdivide_u64_branchfree_t("u64_branchfree_gen", "", uint64_t.IN("y", ""))

    NativeName("libdivide_s32_do")..internal..int32_t("s32_do_ref", "", int32_t.IN("numer", ""), libdivide_s32_t.const.p.IN("denom", ""))
    customMethod(
        """
    private static int libdivide__mullhi_s32(int x, int y) {
        return (int)(((long)x * (long)y) >> 32);
    }

    public static int libdivide_s32_do(@NativeType("int32_t") int numer, @NativeType("struct libdivide_s32_t const *") LibDivideS32 denom) {
        byte more = denom.more();
        if ((more & LIBDIVIDE_S32_SHIFT_PATH) != 0) {
            int  sign    = more >> 7;
            int  shifter = (byte)(more & LIBDIVIDE_32_SHIFT_MASK);
            int  q       = (numer + ((numer >> 31) & ((1 << shifter) - 1)));
            q >>= shifter;
            q = (q ^ sign) - sign;
            return q;
        } else {
            int uq = libdivide__mullhi_s32(denom.magic(), numer);
            if ((more & LIBDIVIDE_ADD_MARKER) != 0) {
                // must be arithmetic shift and then sign extend
                int sign = more >> 7;
                // q += (more < 0 ? -numer : numer), casts to avoid UB
                uq += (numer ^ sign) - sign;
            }
            int q = uq;
            q >>= more & LIBDIVIDE_32_SHIFT_MASK;
            q += (q < 0 ? 1 : 0);
            return q;
        }
    }""")

    NativeName("libdivide_u32_do")..internal..uint32_t("u32_do_ref", "", uint32_t.IN("numer", ""), libdivide_u32_t.const.p.IN("denom", ""))
    customMethod(
        """
    private static int libdivide__mullhi_u32(int x, int y) {
        return (int)(((x & 0xFFFF_FFFFL) * (y & 0xFFFF_FFFFL)) >>> 32);
    }

    public static int libdivide_u32_do(@NativeType("uint32_t") int numer, @NativeType("struct libdivide_u32_t const *") LibDivideU32 denom) {
        byte more = denom.more();
        if ((more & LIBDIVIDE_U32_SHIFT_PATH) != 0) {
            return numer >>> (more & LIBDIVIDE_32_SHIFT_MASK);
        }
        else {
            int q = libdivide__mullhi_u32(denom.magic(), numer);
            if ((more & LIBDIVIDE_ADD_MARKER) != 0) {
                int t = ((numer - q) >>> 1) + q;
                return t >>> (more & LIBDIVIDE_32_SHIFT_MASK);
            }
            else {
                // all upper bits are 0 - don't need to mask them off
                return q >>> more;
            }
        }
    }""")

    NativeName("libdivide_s64_do")..internal..int64_t("s64_do_ref", "", int64_t.IN("numer", ""), libdivide_s64_t.const.p.IN("denom", ""))
    customMethod(
        """
    public static long libdivide_s64_do(@NativeType("int64_t") long numer, @NativeType("struct libdivide_s64_t const *") LibDivideS64 denom) {
        byte more = denom.more();
        long magic = denom.magic();
        if (magic == 0L) { //shift path
            int shifter = more & LIBDIVIDE_64_SHIFT_MASK;
            long q = numer + ((numer >> 63) & ((1L << shifter) - 1L));
            q >>= shifter;
            // must be arithmetic shift and then sign-extend
            long shiftMask = more >> 7;
            q = (q ^ shiftMask) - shiftMask;
            return q;
        } else {
            long uq = mathMultiplyHighS64(magic, numer);
            if ((more & LIBDIVIDE_ADD_MARKER) != 0) {
                // must be arithmetic shift and then sign extend
                long sign = more >> 7;
                uq += (numer ^ sign) - sign;
            }
            long q = uq;
            q >>= more & LIBDIVIDE_64_SHIFT_MASK;
            q += (q < 0 ? 1 : 0);
            return q;
        }
    }""")

    NativeName("libdivide_u64_do")..internal..uint64_t("u64_do_ref", "", uint64_t.IN("y", ""), libdivide_u64_t.const.p.IN("denom", ""))
    customMethod(
        """
    public static long libdivide_u64_do(@NativeType("uint64_t") long numer, @NativeType("struct libdivide_u64_t const *") LibDivideU64 denom) {
        byte more = denom.more();
        if ((more & LIBDIVIDE_U64_SHIFT_PATH) != 0) {
            return numer >>> (more & LIBDIVIDE_64_SHIFT_MASK);
        } else {
            long q = mathMultiplyHighU64(denom.magic(), numer);
            if ((more & LIBDIVIDE_ADD_MARKER) != 0) {
                long t = ((numer - q) >>> 1) + q;
                return t >>> (more & LIBDIVIDE_64_SHIFT_MASK);
            } else {
                // all upper bits are 0 - don't need to mask them off
                return q >>> more;
            }
        }
    }""")

    NativeName("libdivide_s32_branchfree_do")..internal..int32_t("s32_branchfree_do_ref", "", int32_t.IN("numer", ""), libdivide_s32_branchfree_t.const.p.IN("denom", ""))
    customMethod(
        """
    public static int libdivide_s32_branchfree_do(@NativeType("int32_t") int numer, @NativeType("struct libdivide_s32_branchfree_t const *") LibDivideS32BranchFree denom) {
        byte more = denom.more();
        int shift = more & LIBDIVIDE_32_SHIFT_MASK;
        // must be arithmetic shift and then sign extend
        int sign = more >> 7;
        int magic = denom.magic();
        int q = libdivide__mullhi_s32(magic, numer);
        q += numer;

        // If q is non-negative, we have nothing to do
        // If q is negative, we want to add either (2**shift)-1 if d is a power of
        // 2, or (2**shift) if it is not a power of 2
        int is_power_of_2 = (more & LIBDIVIDE_S32_SHIFT_PATH) >>> 5;
        int q_sign = q >> 31;
        q += q_sign & ((1 << shift) - is_power_of_2);

        // Now arithmetic right shift
        q >>= shift;

        // Negate if needed
        q = (q ^ sign) - sign;

        return q;
    }""")

    NativeName("libdivide_u32_branchfree_do")..internal..uint32_t("u32_branchfree_do_ref", "", uint32_t.IN("numer", ""), libdivide_u32_branchfree_t.const.p.IN("denom", ""))
    customMethod(
        """
    public static int libdivide_u32_branchfree_do(@NativeType("uint32_t") int numer, @NativeType("struct libdivide_u32_branchfree_t const *") LibDivideU32BranchFree denom) {
        int q = libdivide__mullhi_u32(denom.magic(), numer);
        int t = ((numer - q) >>> 1) + q;
        return t >>> denom.more();
    }""")

    NativeName("libdivide_s64_branchfree_do")..internal..int64_t("s64_branchfree_do_ref", "", int64_t.IN("numer", ""), libdivide_s64_branchfree_t.const.p.IN("denom", ""))
    customMethod(
        """
    public static long libdivide_s64_branchfree_do(@NativeType("int64_t") long numer, @NativeType("struct libdivide_s64_branchfree_t const *") LibDivideS64BranchFree denom) {
        byte more = denom.more();
        int shift = more & LIBDIVIDE_64_SHIFT_MASK;
        // must be arithmetic shift and then sign extend
        long sign = more >> 7;
        long magic = denom.magic();
        long q = mathMultiplyHighS64(magic, numer);
        q += numer;

        // If q is non-negative, we have nothing to do.
        // If q is negative, we want to add either (2**shift)-1 if d is a power of
        // 2, or (2**shift) if it is not a power of 2.
        int is_power_of_2 = magic == 0 ? 1 : 0;
        long q_sign = q >> 63;
        q += q_sign & ((1L << shift) - is_power_of_2);

        // Arithmetic right shift
        q >>= shift;

        // Negate if needed
        q = (q ^ sign) - sign;
        return q;
    }""")

    NativeName("libdivide_u64_branchfree_do")..internal..uint64_t("u64_branchfree_do_ref", "", uint64_t.IN("y", ""), libdivide_u64_branchfree_t.const.p.IN("denom", ""))
    customMethod(
        """
    public static long libdivide_u64_branchfree_do(@NativeType("uint64_t") long numer, @NativeType("struct libdivide_u64_branchfree_t const *") LibDivideU64BranchFree denom) {
        long q = mathMultiplyHighU64(denom.magic(), numer);
        long t = ((numer - q) >>> 1) + q;
        return t >>> denom.more();
    }""")

    int32_t("s32_recover", "", libdivide_s32_t.const.p.IN("denom", ""))
    uint32_t("u32_recover", "", libdivide_u32_t.const.p.IN("denom", ""))
    int64_t("s64_recover", "", libdivide_s64_t.const.p.IN("denom", ""))
    uint64_t("u64_recover", "", libdivide_u64_t.const.p.IN("denom", ""))

    int32_t("s32_branchfree_recover", "", libdivide_s32_branchfree_t.const.p.IN("denom", ""))
    uint32_t("u32_branchfree_recover", "", libdivide_u32_branchfree_t.const.p.IN("denom", ""))
    int64_t("s64_branchfree_recover", "", libdivide_s64_branchfree_t.const.p.IN("denom", ""))
    uint64_t("u64_branchfree_recover", "", libdivide_u64_branchfree_t.const.p.IN("denom", ""))

    //int("u32_get_algorithm", "", libdivide_u32_t.const.p.IN("denom", ""))
    //uint32_t("u32_do_alg0", "", uint32_t.IN("numer", ""), libdivide_u32_t.const.p.IN("denom", ""))
    //uint32_t("u32_do_alg1", "", uint32_t.IN("numer", ""), libdivide_u32_t.const.p.IN("denom", ""))
    //uint32_t("u32_do_alg2", "", uint32_t.IN("numer", ""), libdivide_u32_t.const.p.IN("denom", ""))
    customMethod(
        """
    public static int libdivide_u32_get_algorithm(@NativeType("struct libdivide_u32_t const *") LibDivideU32 denom) {
        byte more = denom.more();
        if ((more & LIBDIVIDE_U32_SHIFT_PATH) != 0) return 0;
        else if ((more & LIBDIVIDE_ADD_MARKER) == 0) return 1;
        else return 2;
    }

    public static int libdivide_u32_do_alg0(@NativeType("uint32_t") int numer, @NativeType("struct libdivide_u32_t const *") LibDivideU32 denom) {
        return numer >>> (denom.more() & LIBDIVIDE_32_SHIFT_MASK);
    }

    public static int libdivide_u32_do_alg1(@NativeType("uint32_t") int numer, @NativeType("struct libdivide_u32_t const *") LibDivideU32 denom) {
        int q = libdivide__mullhi_u32(denom.magic(), numer);
        return q >>> denom.more();
    }

    public static int libdivide_u32_do_alg2(@NativeType("uint32_t") int numer, @NativeType("struct libdivide_u32_t const *") LibDivideU32 denom) {
        // denom->add != 0
        int q = libdivide__mullhi_u32(denom.magic(), numer);
        int t = ((numer - q) >>> 1) + q;
        // Note that this mask is typically free. Only the low bits are meaningful
        // to a shift, so compilers can optimize out this AND.
        return t >>> (denom.more() & LIBDIVIDE_32_SHIFT_MASK);
    }""")

    //int("u64_get_algorithm", "", libdivide_u64_t.const.p.IN("denom", ""))
    //uint64_t("u64_do_alg0", "", uint64_t.IN("numer", ""), libdivide_u64_t.const.p.IN("denom", ""))
    //uint64_t("u64_do_alg1", "", uint64_t.IN("numer", ""), libdivide_u64_t.const.p.IN("denom", ""))
    //uint64_t("u64_do_alg2", "", uint64_t.IN("numer", ""), libdivide_u64_t.const.p.IN("denom", ""))
    customMethod(
        """
    public static int libdivide_u64_get_algorithm(@NativeType("struct libdivide_u64_t const *") LibDivideU64 denom) {
        byte more = denom.more();
        if ((more & LIBDIVIDE_U64_SHIFT_PATH) != 0) return 0;
        else if ((more & LIBDIVIDE_ADD_MARKER) == 0) return 1;
        else return 2;
    }

    public static long libdivide_u64_do_alg0(@NativeType("uint64_t") long numer, @NativeType("struct libdivide_u64_t const *") LibDivideU64 denom) {
        return numer >>> (denom.more() & LIBDIVIDE_64_SHIFT_MASK);
    }

    public static long libdivide_u64_do_alg1(@NativeType("uint64_t") long numer, @NativeType("struct libdivide_u64_t const *") LibDivideU64 denom) {
        long q = mathMultiplyHighU64(denom.magic(), numer);
        return q >>> denom.more();
    }

    public static long libdivide_u64_do_alg2(@NativeType("uint64_t") long numer, @NativeType("struct libdivide_u64_t const *") LibDivideU64 denom) {
        long q = mathMultiplyHighU64(denom.magic(), numer);
        long t = ((numer - q) >>> 1) + q;
        return t >>> (denom.more() & LIBDIVIDE_64_SHIFT_MASK);
    }""")

    //int("s32_get_algorithm", "", libdivide_s32_t.const.p.IN("denom", ""))
    //int32_t("s32_do_alg0", "", int32_t.IN("numer", ""), libdivide_s32_t.const.p.IN("denom", ""))
    //int32_t("s32_do_alg1", "", int32_t.IN("numer", ""), libdivide_s32_t.const.p.IN("denom", ""))
    //int32_t("s32_do_alg2", "", int32_t.IN("numer", ""), libdivide_s32_t.const.p.IN("denom", ""))
    //int32_t("s32_do_alg3", "", int32_t.IN("numer", ""), libdivide_s32_t.const.p.IN("denom", ""))
    //int32_t("s32_do_alg4", "", int32_t.IN("numer", ""), libdivide_s32_t.const.p.IN("denom", ""))
    customMethod(
        """
    public static int libdivide_s32_get_algorithm(@NativeType("struct libdivide_s32_t const *") LibDivideS32 denom) {
        byte more = denom.more();
        boolean positiveDivisor = (more & LIBDIVIDE_NEGATIVE_DIVISOR) == 0;
        if ((more & LIBDIVIDE_S32_SHIFT_PATH) != 0) return (positiveDivisor ? 0 : 1);
        else if ((more & LIBDIVIDE_ADD_MARKER) != 0) return (positiveDivisor ? 2 : 3);
        else return 4;
    }

    public static int libdivide_s32_do_alg0(@NativeType("int32_t") int numer, @NativeType("struct libdivide_s32_t const *") LibDivideS32 denom) {
        int shifter = denom.more() & LIBDIVIDE_32_SHIFT_MASK;
        int q = numer + ((numer >> 31) & ((1 << shifter) - 1));
        return q >> shifter;
    }

    public static int libdivide_s32_do_alg1(@NativeType("int32_t") int numer, @NativeType("struct libdivide_s32_t const *") LibDivideS32 denom) {
        int shifter = denom.more() & LIBDIVIDE_32_SHIFT_MASK;
        int q = numer + ((numer >> 31) & ((1 << shifter) - 1));
        return - (q >> shifter);
    }

    public static int libdivide_s32_do_alg2(@NativeType("int32_t") int numer, @NativeType("struct libdivide_s32_t const *") LibDivideS32 denom) {
        int q = libdivide__mullhi_s32(denom.magic(), numer);
        q += numer;
        q >>= denom.more() & LIBDIVIDE_32_SHIFT_MASK;
        q += (q < 0 ? 1 : 0);
        return q;
    }

    public static int libdivide_s32_do_alg3(@NativeType("int32_t") int numer, @NativeType("struct libdivide_s32_t const *") LibDivideS32 denom) {
        int q = libdivide__mullhi_s32(denom.magic(), numer);
        q -= numer;
        q >>= denom.more() & LIBDIVIDE_32_SHIFT_MASK;
        q += (q < 0 ? 1 : 0);
        return q;
    }

    public static int libdivide_s32_do_alg4(@NativeType("int32_t") int numer, @NativeType("struct libdivide_s32_t const *") LibDivideS32 denom) {
        int q = libdivide__mullhi_s32(denom.magic(), numer);
        q >>= denom.more() & LIBDIVIDE_32_SHIFT_MASK;
        q += (q < 0 ? 1 : 0);
        return q;
    }""")

    //int("s64_get_algorithm", "", libdivide_s64_t.const.p.IN("denom", ""))
    //int64_t("s64_do_alg0", "", int64_t.IN("numer", ""), libdivide_s64_t.const.p.IN("denom", ""))
    //int64_t("s64_do_alg1", "", int64_t.IN("numer", ""), libdivide_s64_t.const.p.IN("denom", ""))
    //int64_t("s64_do_alg2", "", int64_t.IN("numer", ""), libdivide_s64_t.const.p.IN("denom", ""))
    //int64_t("s64_do_alg3", "", int64_t.IN("numer", ""), libdivide_s64_t.const.p.IN("denom", ""))
    //int64_t("s64_do_alg4", "", int64_t.IN("numer", ""), libdivide_s64_t.const.p.IN("denom", ""))
    customMethod(
        """
    public static int libdivide_s64_get_algorithm(@NativeType("struct libdivide_s64_t const *") LibDivideS64 denom) {
        byte more = denom.more();
        boolean positiveDivisor = (more & LIBDIVIDE_NEGATIVE_DIVISOR) == 0;
        if (denom.magic() == 0) return (positiveDivisor ? 0 : 1); // shift path
        else if ((more & LIBDIVIDE_ADD_MARKER) != 0) return (positiveDivisor ? 2 : 3);
        else return 4;
    }

    public static long libdivide_s64_do_alg0(@NativeType("int64_t") long numer, @NativeType("struct libdivide_s64_t const *") LibDivideS64 denom) {
        int shifter = denom.more() & LIBDIVIDE_64_SHIFT_MASK;
        long q = numer + ((numer >> 63) & ((1L << shifter) - 1L));
        return q >> shifter;
    }

    public static long libdivide_s64_do_alg1(@NativeType("int64_t") long numer, @NativeType("struct libdivide_s64_t const *") LibDivideS64 denom) {
        // denom->shifter != -1 && demo->shiftMask != 0
        int shifter = denom.more() & LIBDIVIDE_64_SHIFT_MASK;
        long q = numer + ((numer >> 63) & ((1L << shifter) - 1L));
        return - (q >> shifter);
    }

    public static long libdivide_s64_do_alg2(@NativeType("int64_t") long numer, @NativeType("struct libdivide_s64_t const *") LibDivideS64 denom) {
        long q = mathMultiplyHighS64(denom.magic(), numer);
        q += numer;
        q >>= denom.more() & LIBDIVIDE_64_SHIFT_MASK;
        q += (q < 0 ? 1 : 0);
        return q;
    }

    public static long libdivide_s64_do_alg3(@NativeType("int64_t") long numer, @NativeType("struct libdivide_s64_t const *") LibDivideS64 denom) {
        long q = mathMultiplyHighS64(denom.magic(), numer);
        q -= numer;
        q >>= denom.more() & LIBDIVIDE_64_SHIFT_MASK;
        q += (q < 0 ? 1 : 0);
        return q;
    }

    public static long libdivide_s64_do_alg4(@NativeType("int64_t") long numer, @NativeType("struct libdivide_s64_t const *") LibDivideS64 denom) {
        long q = mathMultiplyHighS64(denom.magic(), numer);
        q >>= denom.more() & LIBDIVIDE_64_SHIFT_MASK;
        q += (q < 0 ? 1 : 0);
        return q;
    }""")

}