/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public class OUI {

    static { LibNanoVG.initialize(); }

    public static final int
        UI_USERMASK = 0xFF000000,
        UI_ANY      = 0xFFFFFFFF;

    public static final int
        UI_COLD   = 0,
        UI_HOT    = 1,
        UI_ACTIVE = 2,
        UI_FROZEN = 3;

    public static final int
        UI_ROW     = 0x002,
        UI_COLUMN  = 0x003,
        UI_LAYOUT  = 0x000,
        UI_FLEX    = 0x002,
        UI_NOWRAP  = 0x000,
        UI_WRAP    = 0x004,
        UI_START   = 0x008,
        UI_MIDDLE  = 0x000,
        UI_END     = 0x010,
        UI_JUSTIFY = 0x018;

    public static final int
        UI_LEFT    = 0x020,
        UI_TOP     = 0x040,
        UI_RIGHT   = 0x080,
        UI_DOWN    = 0x100,
        UI_HFILL   = 0x0a0,
        UI_VFILL   = 0x140,
        UI_HCENTER = 0x000,
        UI_VCENTER = 0x000,
        UI_CENTER  = 0x000,
        UI_FILL    = 0x1e0,
        UI_BREAK   = 0x200;

    public static final int
        UI_BUTTON0_DOWN    = 0x0400,
        UI_BUTTON0_UP      = 0x0800,
        UI_BUTTON0_HOT_UP  = 0x1000,
        UI_BUTTON0_CAPTURE = 0x2000,
        UI_BUTTON2_DOWN    = 0x4000,
        UI_SCROLL          = 0x8000,
        UI_KEY_DOWN        = 0x10000,
        UI_KEY_UP          = 0x20000,
        UI_CHAR            = 0x40000;

    protected OUI() {
        throw new UnsupportedOperationException();
    }

    // --- [ uiCreateContext ] ---

    /** {@code UIcontext * uiCreateContext(unsigned int item_capacity, unsigned int buffer_capacity)} */
    @NativeType("UIcontext *")
    public static native long uiCreateContext(@NativeType("unsigned int") int item_capacity, @NativeType("unsigned int") int buffer_capacity);

    // --- [ uiMakeCurrent ] ---

    /** {@code void uiMakeCurrent(UIcontext * ctx)} */
    public static native void uiMakeCurrent(@NativeType("UIcontext *") long ctx);

    // --- [ uiDestroyContext ] ---

    /** {@code void uiDestroyContext(UIcontext * ctx)} */
    public static native void nuiDestroyContext(long ctx);

    /** {@code void uiDestroyContext(UIcontext * ctx)} */
    public static void uiDestroyContext(@NativeType("UIcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nuiDestroyContext(ctx);
    }

    // --- [ uiGetContext ] ---

    /** {@code UIcontext * uiGetContext(void)} */
    @NativeType("UIcontext *")
    public static native long uiGetContext();

    // --- [ uiSetCursor ] ---

    /** {@code void uiSetCursor(int x, int y)} */
    public static native void uiSetCursor(int x, int y);

    // --- [ uiGetCursor ] ---

    /** {@code UIvec2 uiGetCursor(void)} */
    public static native void nuiGetCursor(long __result);

    /** {@code UIvec2 uiGetCursor(void)} */
    @NativeType("UIvec2")
    public static UIVec2 uiGetCursor(@NativeType("UIvec2") UIVec2 __result) {
        nuiGetCursor(__result.address());
        return __result;
    }

    // --- [ uiGetCursorDelta ] ---

    /** {@code UIvec2 uiGetCursorDelta(void)} */
    public static native void nuiGetCursorDelta(long __result);

    /** {@code UIvec2 uiGetCursorDelta(void)} */
    @NativeType("UIvec2")
    public static UIVec2 uiGetCursorDelta(@NativeType("UIvec2") UIVec2 __result) {
        nuiGetCursorDelta(__result.address());
        return __result;
    }

    // --- [ uiGetCursorStart ] ---

    /** {@code UIvec2 uiGetCursorStart(void)} */
    public static native void nuiGetCursorStart(long __result);

    /** {@code UIvec2 uiGetCursorStart(void)} */
    @NativeType("UIvec2")
    public static UIVec2 uiGetCursorStart(@NativeType("UIvec2") UIVec2 __result) {
        nuiGetCursorStart(__result.address());
        return __result;
    }

    // --- [ uiGetCursorStartDelta ] ---

    /** {@code UIvec2 uiGetCursorStartDelta(void)} */
    public static native void nuiGetCursorStartDelta(long __result);

    /** {@code UIvec2 uiGetCursorStartDelta(void)} */
    @NativeType("UIvec2")
    public static UIVec2 uiGetCursorStartDelta(@NativeType("UIvec2") UIVec2 __result) {
        nuiGetCursorStartDelta(__result.address());
        return __result;
    }

    // --- [ uiSetButton ] ---

    /** {@code void uiSetButton(unsigned int button, unsigned int mod, int enabled)} */
    public static native void nuiSetButton(int button, int mod, int enabled);

    /** {@code void uiSetButton(unsigned int button, unsigned int mod, int enabled)} */
    public static void uiSetButton(@NativeType("unsigned int") int button, @NativeType("unsigned int") int mod, @NativeType("int") boolean enabled) {
        nuiSetButton(button, mod, enabled ? 1 : 0);
    }

    // --- [ uiGetButton ] ---

    /** {@code int uiGetButton(unsigned int button)} */
    public static native int nuiGetButton(int button);

    /** {@code int uiGetButton(unsigned int button)} */
    @NativeType("int")
    public static boolean uiGetButton(@NativeType("unsigned int") int button) {
        return nuiGetButton(button) != 0;
    }

    // --- [ uiGetClicks ] ---

    /** {@code int uiGetClicks(void)} */
    public static native int uiGetClicks();

    // --- [ uiSetKey ] ---

    /** {@code void uiSetKey(unsigned int key, unsigned int mod, int enabled)} */
    public static native void nuiSetKey(int key, int mod, int enabled);

    /** {@code void uiSetKey(unsigned int key, unsigned int mod, int enabled)} */
    public static void uiSetKey(@NativeType("unsigned int") int key, @NativeType("unsigned int") int mod, @NativeType("int") boolean enabled) {
        nuiSetKey(key, mod, enabled ? 1 : 0);
    }

    // --- [ uiSetChar ] ---

    /** {@code void uiSetChar(unsigned int value)} */
    public static native void uiSetChar(@NativeType("unsigned int") int value);

    // --- [ uiSetScroll ] ---

    /** {@code void uiSetScroll(int x, int y)} */
    public static native void uiSetScroll(int x, int y);

    // --- [ uiGetScroll ] ---

    /** {@code UIvec2 uiGetScroll(void)} */
    public static native void nuiGetScroll(long __result);

    /** {@code UIvec2 uiGetScroll(void)} */
    @NativeType("UIvec2")
    public static UIVec2 uiGetScroll(@NativeType("UIvec2") UIVec2 __result) {
        nuiGetScroll(__result.address());
        return __result;
    }

    // --- [ uiBeginLayout ] ---

    /** {@code void uiBeginLayout(void)} */
    public static native void uiBeginLayout();

    // --- [ uiEndLayout ] ---

    /** {@code void uiEndLayout(void)} */
    public static native void uiEndLayout();

    // --- [ uiUpdateHotItem ] ---

    /** {@code void uiUpdateHotItem(void)} */
    public static native void uiUpdateHotItem();

    // --- [ uiProcess ] ---

    /** {@code void uiProcess(int timestamp)} */
    public static native void uiProcess(int timestamp);

    // --- [ uiClearState ] ---

    /** {@code void uiClearState(void)} */
    public static native void uiClearState();

    // --- [ uiItem ] ---

    /** {@code int uiItem(void)} */
    public static native int uiItem();

    // --- [ uiSetFrozen ] ---

    /** {@code void uiSetFrozen(int item, int enable)} */
    public static native void nuiSetFrozen(int item, int enable);

    /** {@code void uiSetFrozen(int item, int enable)} */
    public static void uiSetFrozen(int item, @NativeType("int") boolean enable) {
        nuiSetFrozen(item, enable ? 1 : 0);
    }

    // --- [ uiSetHandle ] ---

    /** {@code void uiSetHandle(int item, void * handle)} */
    public static native void uiSetHandle(int item, @NativeType("void *") long handle);

    // --- [ uiAllocHandle ] ---

    /** {@code void * uiAllocHandle(int item, unsigned int size)} */
    public static native long nuiAllocHandle(int item, int size);

    /** {@code void * uiAllocHandle(int item, unsigned int size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer uiAllocHandle(int item, @NativeType("unsigned int") int size) {
        long __result = nuiAllocHandle(item, size);
        return memByteBufferSafe(__result, size);
    }

    // --- [ uiSetHandler ] ---

    /** {@code void uiSetHandler(UIhandler handler)} */
    public static native void nuiSetHandler(long handler);

    /** {@code void uiSetHandler(UIhandler handler)} */
    public static void uiSetHandler(@NativeType("UIhandler") UIHandlerI handler) {
        nuiSetHandler(handler.address());
    }

    // --- [ uiSetEvents ] ---

    /** {@code void uiSetEvents(int item, unsigned int flags)} */
    public static native void uiSetEvents(int item, @NativeType("unsigned int") int flags);

    // --- [ uiSetFlags ] ---

    /** {@code void uiSetFlags(int item, unsigned int flags)} */
    public static native void uiSetFlags(int item, @NativeType("unsigned int") int flags);

    // --- [ uiInsert ] ---

    /** {@code int uiInsert(int item, int child)} */
    public static native int uiInsert(int item, int child);

    // --- [ uiAppend ] ---

    /** {@code int uiAppend(int item, int sibling)} */
    public static native int uiAppend(int item, int sibling);

    // --- [ uiInsertBack ] ---

    /** {@code int uiInsertBack(int item, int child)} */
    public static native int uiInsertBack(int item, int child);

    // --- [ uiInsertFront ] ---

    /** {@code int uiInsertFront(int item, int child)} */
    public static native int uiInsertFront(int item, int child);

    // --- [ uiSetSize ] ---

    /** {@code void uiSetSize(int item, int w, int h)} */
    public static native void uiSetSize(int item, int w, int h);

    // --- [ uiSetLayout ] ---

    /** {@code void uiSetLayout(int item, unsigned int flags)} */
    public static native void uiSetLayout(int item, @NativeType("unsigned int") int flags);

    // --- [ uiSetBox ] ---

    /** {@code void uiSetBox(int item, unsigned int flags)} */
    public static native void uiSetBox(int item, @NativeType("unsigned int") int flags);

    // --- [ uiSetMargins ] ---

    /** {@code void uiSetMargins(int item, short l, short t, short r, short b)} */
    public static native void nuiSetMargins(int item, short l, short t, short r, short b);

    /** {@code void uiSetMargins(int item, short l, short t, short r, short b)} */
    public static void uiSetMargins(int item, @NativeType("short") int l, @NativeType("short") int t, @NativeType("short") int r, @NativeType("short") int b) {
        nuiSetMargins(item, (short)l, (short)t, (short)r, (short)b);
    }

    // --- [ uiFocus ] ---

    /** {@code void uiFocus(int item)} */
    public static native void uiFocus(int item);

    // --- [ uiFirstChild ] ---

    /** {@code int uiFirstChild(int item)} */
    public static native int uiFirstChild(int item);

    // --- [ uiNextSibling ] ---

    /** {@code int uiNextSibling(int item)} */
    public static native int uiNextSibling(int item);

    // --- [ uiGetItemCount ] ---

    /** {@code int uiGetItemCount(void)} */
    public static native int uiGetItemCount();

    // --- [ uiGetAllocSize ] ---

    /** {@code unsigned int uiGetAllocSize(void)} */
    @NativeType("unsigned int")
    public static native int uiGetAllocSize();

    // --- [ uiGetState ] ---

    /** {@code UIitemState uiGetState(int item)} */
    @NativeType("UIitemState")
    public static native int uiGetState(int item);

    // --- [ uiGetHandle ] ---

    /** {@code void * uiGetHandle(int item)} */
    @NativeType("void *")
    public static native long uiGetHandle(int item);

    // --- [ uiGetHotItem ] ---

    /** {@code int uiGetHotItem(void)} */
    public static native int uiGetHotItem();

    // --- [ uiGetFocusedItem ] ---

    /** {@code int uiGetFocusedItem(void)} */
    public static native int uiGetFocusedItem();

    // --- [ uiFindItem ] ---

    /** {@code int uiFindItem(int item, int x, int y, unsigned int flags, unsigned int mask)} */
    public static native int uiFindItem(int item, int x, int y, @NativeType("unsigned int") int flags, @NativeType("unsigned int") int mask);

    // --- [ uiGetHandler ] ---

    /** {@code UIhandler uiGetHandler(void)} */
    public static native long nuiGetHandler();

    /** {@code UIhandler uiGetHandler(void)} */
    @NativeType("UIhandler")
    public static @Nullable UIHandler uiGetHandler() {
        return UIHandler.createSafe(nuiGetHandler());
    }

    // --- [ uiGetEvents ] ---

    /** {@code unsigned int uiGetEvents(int item)} */
    @NativeType("unsigned int")
    public static native int uiGetEvents(int item);

    // --- [ uiGetFlags ] ---

    /** {@code unsigned int uiGetFlags(int item)} */
    @NativeType("unsigned int")
    public static native int uiGetFlags(int item);

    // --- [ uiGetKey ] ---

    /** {@code unsigned int uiGetKey(void)} */
    @NativeType("unsigned int")
    public static native int uiGetKey();

    // --- [ uiGetModifier ] ---

    /** {@code unsigned int uiGetModifier(void)} */
    @NativeType("unsigned int")
    public static native int uiGetModifier();

    // --- [ uiGetRect ] ---

    /** {@code UIrect uiGetRect(int item)} */
    public static native void nuiGetRect(int item, long __result);

    /** {@code UIrect uiGetRect(int item)} */
    @NativeType("UIrect")
    public static UIRect uiGetRect(int item, @NativeType("UIrect") UIRect __result) {
        nuiGetRect(item, __result.address());
        return __result;
    }

    // --- [ uiContains ] ---

    /** {@code int uiContains(int item, int x, int y)} */
    public static native int nuiContains(int item, int x, int y);

    /** {@code int uiContains(int item, int x, int y)} */
    @NativeType("int")
    public static boolean uiContains(int item, int x, int y) {
        return nuiContains(item, x, y) != 0;
    }

    // --- [ uiGetWidth ] ---

    /** {@code int uiGetWidth(int item)} */
    public static native int uiGetWidth(int item);

    // --- [ uiGetHeight ] ---

    /** {@code int uiGetHeight(int item)} */
    public static native int uiGetHeight(int item);

    // --- [ uiGetLayout ] ---

    /** {@code unsigned int uiGetLayout(int item)} */
    @NativeType("unsigned int")
    public static native int uiGetLayout(int item);

    // --- [ uiGetBox ] ---

    /** {@code unsigned int uiGetBox(int item)} */
    @NativeType("unsigned int")
    public static native int uiGetBox(int item);

    // --- [ uiGetMarginLeft ] ---

    /** {@code short uiGetMarginLeft(int item)} */
    public static native short uiGetMarginLeft(int item);

    // --- [ uiGetMarginTop ] ---

    /** {@code short uiGetMarginTop(int item)} */
    public static native short uiGetMarginTop(int item);

    // --- [ uiGetMarginRight ] ---

    /** {@code short uiGetMarginRight(int item)} */
    public static native short uiGetMarginRight(int item);

    // --- [ uiGetMarginDown ] ---

    /** {@code short uiGetMarginDown(int item)} */
    public static native short uiGetMarginDown(int item);

    // --- [ uiRecoverItem ] ---

    /** {@code int uiRecoverItem(int olditem)} */
    public static native int uiRecoverItem(int olditem);

    // --- [ uiRemapItem ] ---

    /** {@code void uiRemapItem(int olditem, int newitem)} */
    public static native void uiRemapItem(int olditem, int newitem);

    // --- [ uiGetLastItemCount ] ---

    /** {@code int uiGetLastItemCount(void)} */
    public static native int uiGetLastItemCount();

}