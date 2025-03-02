/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SDLTray {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CreateTray             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateTray"),
            SetTrayIcon            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTrayIcon"),
            SetTrayTooltip         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTrayTooltip"),
            CreateTrayMenu         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateTrayMenu"),
            CreateTraySubmenu      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateTraySubmenu"),
            GetTrayMenu            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTrayMenu"),
            GetTraySubmenu         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTraySubmenu"),
            GetTrayEntries         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTrayEntries"),
            RemoveTrayEntry        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RemoveTrayEntry"),
            InsertTrayEntryAt      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_InsertTrayEntryAt"),
            SetTrayEntryLabel      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTrayEntryLabel"),
            GetTrayEntryLabel      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTrayEntryLabel"),
            SetTrayEntryChecked    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTrayEntryChecked"),
            GetTrayEntryChecked    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTrayEntryChecked"),
            SetTrayEntryEnabled    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTrayEntryEnabled"),
            GetTrayEntryEnabled    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTrayEntryEnabled"),
            SetTrayEntryCallback   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTrayEntryCallback"),
            ClickTrayEntry         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ClickTrayEntry"),
            DestroyTray            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroyTray"),
            GetTrayEntryParent     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTrayEntryParent"),
            GetTrayMenuParentEntry = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTrayMenuParentEntry"),
            GetTrayMenuParentTray  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTrayMenuParentTray"),
            UpdateTrays            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_UpdateTrays");

    }

    public static final int
        SDL_TRAYENTRY_BUTTON   = 0x00000001,
        SDL_TRAYENTRY_CHECKBOX = 0x00000002,
        SDL_TRAYENTRY_SUBMENU  = 0x00000004,
        SDL_TRAYENTRY_DISABLED = 0x80000000,
        SDL_TRAYENTRY_CHECKED  = 0x40000000;

    protected SDLTray() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_CreateTray ] ---

    /** {@code SDL_Tray * SDL_CreateTray(SDL_Surface * icon, char const * tooltip)} */
    public static long nSDL_CreateTray(long icon, long tooltip) {
        long __functionAddress = Functions.CreateTray;
        return invokePPP(icon, tooltip, __functionAddress);
    }

    /** {@code SDL_Tray * SDL_CreateTray(SDL_Surface * icon, char const * tooltip)} */
    @NativeType("SDL_Tray *")
    public static long SDL_CreateTray(@NativeType("SDL_Surface *") SDL_Surface.@Nullable Buffer icon, @NativeType("char const *") @Nullable ByteBuffer tooltip) {
        if (CHECKS) {
            checkSafe(icon, 1);
            checkNT1Safe(tooltip);
        }
        return nSDL_CreateTray(memAddressSafe(icon), memAddressSafe(tooltip));
    }

    /** {@code SDL_Tray * SDL_CreateTray(SDL_Surface * icon, char const * tooltip)} */
    @NativeType("SDL_Tray *")
    public static long SDL_CreateTray(@NativeType("SDL_Surface *") SDL_Surface.@Nullable Buffer icon, @NativeType("char const *") @Nullable CharSequence tooltip) {
        if (CHECKS) {
            checkSafe(icon, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(tooltip, true);
            long tooltipEncoded = tooltip == null ? NULL : stack.getPointerAddress();
            return nSDL_CreateTray(memAddressSafe(icon), tooltipEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetTrayIcon ] ---

    /** {@code void SDL_SetTrayIcon(SDL_Tray * tray, SDL_Surface * icon)} */
    public static void nSDL_SetTrayIcon(long tray, long icon) {
        long __functionAddress = Functions.SetTrayIcon;
        if (CHECKS) {
            check(tray);
        }
        invokePPV(tray, icon, __functionAddress);
    }

    /** {@code void SDL_SetTrayIcon(SDL_Tray * tray, SDL_Surface * icon)} */
    public static void SDL_SetTrayIcon(@NativeType("SDL_Tray *") long tray, @NativeType("SDL_Surface *") @Nullable SDL_Surface icon) {
        nSDL_SetTrayIcon(tray, memAddressSafe(icon));
    }

    // --- [ SDL_SetTrayTooltip ] ---

    /** {@code void SDL_SetTrayTooltip(SDL_Tray * tray, char const * tooltip)} */
    public static void nSDL_SetTrayTooltip(long tray, long tooltip) {
        long __functionAddress = Functions.SetTrayTooltip;
        if (CHECKS) {
            check(tray);
        }
        invokePPV(tray, tooltip, __functionAddress);
    }

    /** {@code void SDL_SetTrayTooltip(SDL_Tray * tray, char const * tooltip)} */
    public static void SDL_SetTrayTooltip(@NativeType("SDL_Tray *") long tray, @NativeType("char const *") @Nullable ByteBuffer tooltip) {
        if (CHECKS) {
            checkNT1Safe(tooltip);
        }
        nSDL_SetTrayTooltip(tray, memAddressSafe(tooltip));
    }

    /** {@code void SDL_SetTrayTooltip(SDL_Tray * tray, char const * tooltip)} */
    public static void SDL_SetTrayTooltip(@NativeType("SDL_Tray *") long tray, @NativeType("char const *") @Nullable CharSequence tooltip) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(tooltip, true);
            long tooltipEncoded = tooltip == null ? NULL : stack.getPointerAddress();
            nSDL_SetTrayTooltip(tray, tooltipEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_CreateTrayMenu ] ---

    /** {@code SDL_TrayMenu * SDL_CreateTrayMenu(SDL_Tray * tray)} */
    @NativeType("SDL_TrayMenu *")
    public static long SDL_CreateTrayMenu(@NativeType("SDL_Tray *") long tray) {
        long __functionAddress = Functions.CreateTrayMenu;
        if (CHECKS) {
            check(tray);
        }
        return invokePP(tray, __functionAddress);
    }

    // --- [ SDL_CreateTraySubmenu ] ---

    /** {@code SDL_TrayMenu * SDL_CreateTraySubmenu(SDL_TrayEntry * entry)} */
    @NativeType("SDL_TrayMenu *")
    public static long SDL_CreateTraySubmenu(@NativeType("SDL_TrayEntry *") long entry) {
        long __functionAddress = Functions.CreateTraySubmenu;
        if (CHECKS) {
            check(entry);
        }
        return invokePP(entry, __functionAddress);
    }

    // --- [ SDL_GetTrayMenu ] ---

    /** {@code SDL_TrayMenu * SDL_GetTrayMenu(SDL_Tray * tray)} */
    @NativeType("SDL_TrayMenu *")
    public static long SDL_GetTrayMenu(@NativeType("SDL_Tray *") long tray) {
        long __functionAddress = Functions.GetTrayMenu;
        if (CHECKS) {
            check(tray);
        }
        return invokePP(tray, __functionAddress);
    }

    // --- [ SDL_GetTraySubmenu ] ---

    /** {@code SDL_TrayMenu * SDL_GetTraySubmenu(SDL_TrayEntry * entry)} */
    @NativeType("SDL_TrayMenu *")
    public static long SDL_GetTraySubmenu(@NativeType("SDL_TrayEntry *") long entry) {
        long __functionAddress = Functions.GetTraySubmenu;
        if (CHECKS) {
            check(entry);
        }
        return invokePP(entry, __functionAddress);
    }

    // --- [ SDL_GetTrayEntries ] ---

    /** {@code SDL_TrayEntry const ** SDL_GetTrayEntries(SDL_TrayMenu * menu, int * count)} */
    public static long nSDL_GetTrayEntries(long menu, long count) {
        long __functionAddress = Functions.GetTrayEntries;
        if (CHECKS) {
            check(menu);
        }
        return invokePPP(menu, count, __functionAddress);
    }

    /** {@code SDL_TrayEntry const ** SDL_GetTrayEntries(SDL_TrayMenu * menu, int * count)} */
    @NativeType("SDL_TrayEntry const **")
    public static @Nullable PointerBuffer SDL_GetTrayEntries(@NativeType("SDL_TrayMenu *") long menu) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetTrayEntries(menu, memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_RemoveTrayEntry ] ---

    /** {@code void SDL_RemoveTrayEntry(SDL_TrayEntry * entry)} */
    public static void SDL_RemoveTrayEntry(@NativeType("SDL_TrayEntry *") long entry) {
        long __functionAddress = Functions.RemoveTrayEntry;
        if (CHECKS) {
            check(entry);
        }
        invokePV(entry, __functionAddress);
    }

    // --- [ SDL_InsertTrayEntryAt ] ---

    /** {@code SDL_TrayEntry * SDL_InsertTrayEntryAt(SDL_TrayMenu * menu, int pos, char const * label, SDL_TrayEntryFlags flags)} */
    public static long nSDL_InsertTrayEntryAt(long menu, int pos, long label, int flags) {
        long __functionAddress = Functions.InsertTrayEntryAt;
        if (CHECKS) {
            check(menu);
        }
        return invokePPP(menu, pos, label, flags, __functionAddress);
    }

    /** {@code SDL_TrayEntry * SDL_InsertTrayEntryAt(SDL_TrayMenu * menu, int pos, char const * label, SDL_TrayEntryFlags flags)} */
    @NativeType("SDL_TrayEntry *")
    public static long SDL_InsertTrayEntryAt(@NativeType("SDL_TrayMenu *") long menu, int pos, @NativeType("char const *") @Nullable ByteBuffer label, @NativeType("SDL_TrayEntryFlags") int flags) {
        if (CHECKS) {
            checkNT1Safe(label);
        }
        return nSDL_InsertTrayEntryAt(menu, pos, memAddressSafe(label), flags);
    }

    /** {@code SDL_TrayEntry * SDL_InsertTrayEntryAt(SDL_TrayMenu * menu, int pos, char const * label, SDL_TrayEntryFlags flags)} */
    @NativeType("SDL_TrayEntry *")
    public static long SDL_InsertTrayEntryAt(@NativeType("SDL_TrayMenu *") long menu, int pos, @NativeType("char const *") @Nullable CharSequence label, @NativeType("SDL_TrayEntryFlags") int flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? NULL : stack.getPointerAddress();
            return nSDL_InsertTrayEntryAt(menu, pos, labelEncoded, flags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetTrayEntryLabel ] ---

    /** {@code void SDL_SetTrayEntryLabel(SDL_TrayEntry * entry, char const * label)} */
    public static void nSDL_SetTrayEntryLabel(long entry, long label) {
        long __functionAddress = Functions.SetTrayEntryLabel;
        if (CHECKS) {
            check(entry);
        }
        invokePPV(entry, label, __functionAddress);
    }

    /** {@code void SDL_SetTrayEntryLabel(SDL_TrayEntry * entry, char const * label)} */
    public static void SDL_SetTrayEntryLabel(@NativeType("SDL_TrayEntry *") long entry, @NativeType("char const *") @Nullable ByteBuffer label) {
        if (CHECKS) {
            checkNT1Safe(label);
        }
        nSDL_SetTrayEntryLabel(entry, memAddressSafe(label));
    }

    /** {@code void SDL_SetTrayEntryLabel(SDL_TrayEntry * entry, char const * label)} */
    public static void SDL_SetTrayEntryLabel(@NativeType("SDL_TrayEntry *") long entry, @NativeType("char const *") @Nullable CharSequence label) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? NULL : stack.getPointerAddress();
            nSDL_SetTrayEntryLabel(entry, labelEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetTrayEntryLabel ] ---

    /** {@code char const * SDL_GetTrayEntryLabel(SDL_TrayEntry * entry)} */
    public static long nSDL_GetTrayEntryLabel(long entry) {
        long __functionAddress = Functions.GetTrayEntryLabel;
        if (CHECKS) {
            check(entry);
        }
        return invokePP(entry, __functionAddress);
    }

    /** {@code char const * SDL_GetTrayEntryLabel(SDL_TrayEntry * entry)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetTrayEntryLabel(@NativeType("SDL_TrayEntry *") long entry) {
        long __result = nSDL_GetTrayEntryLabel(entry);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_SetTrayEntryChecked ] ---

    /** {@code void SDL_SetTrayEntryChecked(SDL_TrayEntry * entry, bool checked)} */
    public static void SDL_SetTrayEntryChecked(@NativeType("SDL_TrayEntry *") long entry, @NativeType("bool") boolean checked) {
        long __functionAddress = Functions.SetTrayEntryChecked;
        if (CHECKS) {
            check(entry);
        }
        invokePV(entry, checked, __functionAddress);
    }

    // --- [ SDL_GetTrayEntryChecked ] ---

    /** {@code bool SDL_GetTrayEntryChecked(SDL_TrayEntry * entry)} */
    @NativeType("bool")
    public static boolean SDL_GetTrayEntryChecked(@NativeType("SDL_TrayEntry *") long entry) {
        long __functionAddress = Functions.GetTrayEntryChecked;
        if (CHECKS) {
            check(entry);
        }
        return invokePZ(entry, __functionAddress);
    }

    // --- [ SDL_SetTrayEntryEnabled ] ---

    /** {@code void SDL_SetTrayEntryEnabled(SDL_TrayEntry * entry, bool enabled)} */
    public static void SDL_SetTrayEntryEnabled(@NativeType("SDL_TrayEntry *") long entry, @NativeType("bool") boolean enabled) {
        long __functionAddress = Functions.SetTrayEntryEnabled;
        if (CHECKS) {
            check(entry);
        }
        invokePV(entry, enabled, __functionAddress);
    }

    // --- [ SDL_GetTrayEntryEnabled ] ---

    /** {@code bool SDL_GetTrayEntryEnabled(SDL_TrayEntry * entry)} */
    @NativeType("bool")
    public static boolean SDL_GetTrayEntryEnabled(@NativeType("SDL_TrayEntry *") long entry) {
        long __functionAddress = Functions.GetTrayEntryEnabled;
        if (CHECKS) {
            check(entry);
        }
        return invokePZ(entry, __functionAddress);
    }

    // --- [ SDL_SetTrayEntryCallback ] ---

    /** {@code void SDL_SetTrayEntryCallback(SDL_TrayEntry * entry, SDL_TrayCallback callback, void * userdata)} */
    public static void nSDL_SetTrayEntryCallback(long entry, long callback, long userdata) {
        long __functionAddress = Functions.SetTrayEntryCallback;
        if (CHECKS) {
            check(entry);
        }
        invokePPPV(entry, callback, userdata, __functionAddress);
    }

    /** {@code void SDL_SetTrayEntryCallback(SDL_TrayEntry * entry, SDL_TrayCallback callback, void * userdata)} */
    public static void SDL_SetTrayEntryCallback(@NativeType("SDL_TrayEntry *") long entry, @NativeType("SDL_TrayCallback") @Nullable SDL_TrayCallbackI callback, @NativeType("void *") long userdata) {
        nSDL_SetTrayEntryCallback(entry, memAddressSafe(callback), userdata);
    }

    // --- [ SDL_ClickTrayEntry ] ---

    /** {@code void SDL_ClickTrayEntry(SDL_TrayEntry * entry)} */
    public static void SDL_ClickTrayEntry(@NativeType("SDL_TrayEntry *") long entry) {
        long __functionAddress = Functions.ClickTrayEntry;
        if (CHECKS) {
            check(entry);
        }
        invokePV(entry, __functionAddress);
    }

    // --- [ SDL_DestroyTray ] ---

    /** {@code void SDL_DestroyTray(SDL_Tray * tray)} */
    public static void SDL_DestroyTray(@NativeType("SDL_Tray *") long tray) {
        long __functionAddress = Functions.DestroyTray;
        if (CHECKS) {
            check(tray);
        }
        invokePV(tray, __functionAddress);
    }

    // --- [ SDL_GetTrayEntryParent ] ---

    /** {@code SDL_TrayMenu * SDL_GetTrayEntryParent(SDL_TrayEntry * entry)} */
    @NativeType("SDL_TrayMenu *")
    public static long SDL_GetTrayEntryParent(@NativeType("SDL_TrayEntry *") long entry) {
        long __functionAddress = Functions.GetTrayEntryParent;
        if (CHECKS) {
            check(entry);
        }
        return invokePP(entry, __functionAddress);
    }

    // --- [ SDL_GetTrayMenuParentEntry ] ---

    /** {@code SDL_TrayEntry * SDL_GetTrayMenuParentEntry(SDL_TrayMenu * menu)} */
    @NativeType("SDL_TrayEntry *")
    public static long SDL_GetTrayMenuParentEntry(@NativeType("SDL_TrayMenu *") long menu) {
        long __functionAddress = Functions.GetTrayMenuParentEntry;
        if (CHECKS) {
            check(menu);
        }
        return invokePP(menu, __functionAddress);
    }

    // --- [ SDL_GetTrayMenuParentTray ] ---

    /** {@code SDL_Tray * SDL_GetTrayMenuParentTray(SDL_TrayMenu * menu)} */
    @NativeType("SDL_Tray *")
    public static long SDL_GetTrayMenuParentTray(@NativeType("SDL_TrayMenu *") long menu) {
        long __functionAddress = Functions.GetTrayMenuParentTray;
        if (CHECKS) {
            check(menu);
        }
        return invokePP(menu, __functionAddress);
    }

    // --- [ SDL_UpdateTrays ] ---

    /** {@code void SDL_UpdateTrays(void)} */
    public static void SDL_UpdateTrays() {
        long __functionAddress = Functions.UpdateTrays;
        invokeV(__functionAddress);
    }

}