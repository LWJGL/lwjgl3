/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.libc;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to locale.h. */
public class LibCLocale {

    static { Library.initialize(); }

    protected LibCLocale() {
        throw new UnsupportedOperationException();
    }

    // --- [ LC_ALL ] ---

    private static native int LC_ALL();

    /** Selects the entire C locale. */
    public static final int LC_ALL = LC_ALL();

    // --- [ LC_COLLATE ] ---

    private static native int LC_COLLATE();

    /** Selects the collation category of the C locale. */
    public static final int LC_COLLATE = LC_COLLATE();

    // --- [ LC_CTYPE ] ---

    private static native int LC_CTYPE();

    /** Selects the character classification category of the C locale. */
    public static final int LC_CTYPE = LC_CTYPE();

    // --- [ LC_MONETARY ] ---

    private static native int LC_MONETARY();

    /** Selects the monetary formatting category of the C locale. */
    public static final int LC_MONETARY = LC_MONETARY();

    // --- [ LC_NUMERIC ] ---

    private static native int LC_NUMERIC();

    /** Selects the numeric formatting category of the C locale. */
    public static final int LC_NUMERIC = LC_NUMERIC();

    // --- [ LC_TIME ] ---

    private static native int LC_TIME();

    /** Selects the time formatting category of the C locale. */
    public static final int LC_TIME = LC_TIME();

    // --- [ setlocale ] ---

    /** Unsafe version of: {@link #setlocale} */
    public static native long nsetlocale(int category, long locale);

    /**
     * Gets and sets the current C locale.
     * 
     * <p>The {@code setlocale} function installs the specified system locale or its portion as the new C locale. The modifications remain in effect and
     * influences the execution of all locale-sensitive C library functions until the next call to {@code setlocale}. If {@code locale} is a null pointer,
     * {@code setlocale} queries the current C locale without modifying it.</p>
     *
     * @param category the locale category identifier, may by null. One of:<br><table><tr><td>{@link #LC_ALL}</td><td>{@link #LC_COLLATE}</td><td>{@link #LC_CTYPE}</td><td>{@link #LC_MONETARY}</td><td>{@link #LC_NUMERIC}</td><td>{@link #LC_TIME}</td></tr></table>
     * @param locale   system-specific locale identifier. Can be "" for the user-preferred locale or "C" for the minimal locale.
     *
     * @return a pointer to a narrow null-terminated string identifying the C locale after applying the changes, if any, or null pointer on failure.
     *         
     *         <p>A copy of the returned string along with the category used in this call to {@code setlocale} may be used later in the program to restore the locale
     *         back to the state at the end of this call.</p>
     */
    @Nullable
    @NativeType("char *")
    public static String setlocale(int category, @NativeType("char const *") ByteBuffer locale) {
        if (CHECKS) {
            checkNT1(locale);
        }
        long __result = nsetlocale(category, memAddress(locale));
        return memASCIISafe(__result);
    }

    /**
     * Gets and sets the current C locale.
     * 
     * <p>The {@code setlocale} function installs the specified system locale or its portion as the new C locale. The modifications remain in effect and
     * influences the execution of all locale-sensitive C library functions until the next call to {@code setlocale}. If {@code locale} is a null pointer,
     * {@code setlocale} queries the current C locale without modifying it.</p>
     *
     * @param category the locale category identifier, may by null. One of:<br><table><tr><td>{@link #LC_ALL}</td><td>{@link #LC_COLLATE}</td><td>{@link #LC_CTYPE}</td><td>{@link #LC_MONETARY}</td><td>{@link #LC_NUMERIC}</td><td>{@link #LC_TIME}</td></tr></table>
     * @param locale   system-specific locale identifier. Can be "" for the user-preferred locale or "C" for the minimal locale.
     *
     * @return a pointer to a narrow null-terminated string identifying the C locale after applying the changes, if any, or null pointer on failure.
     *         
     *         <p>A copy of the returned string along with the category used in this call to {@code setlocale} may be used later in the program to restore the locale
     *         back to the state at the end of this call.</p>
     */
    @Nullable
    @NativeType("char *")
    public static String setlocale(int category, @NativeType("char const *") CharSequence locale) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(locale, true);
            long localeEncoded = stack.getPointerAddress();
            long __result = nsetlocale(category, localeEncoded);
            return memASCIISafe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}