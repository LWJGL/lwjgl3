/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public class OUI {

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #UI_USERMASK USERMASK} - 
     * these bits, starting at bit 24, can be safely assigned by the application, e.g. as item types, other event types, drop targets, etc. they can be
     * set and queried using uiSetFlags() and uiGetFlags()
     * </li>
     * <li>{@link #UI_ANY ANY} - a special mask passed to uiFindItem()</li>
     * </ul>
     */
    public static final int
        UI_USERMASK = 0xFF000000,
        UI_ANY      = 0xFFFFFFFF;

    /**
     * item states as returned by uiGetState()
     * 
     * <p>({@code UIitemState})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #UI_COLD COLD} - the item is inactive</li>
     * <li>{@link #UI_HOT HOT} - the item is inactive, but the cursor is hovering over this item</li>
     * <li>{@link #UI_ACTIVE ACTIVE} - the item is toggled, activated, focused (depends on item kind)</li>
     * <li>{@link #UI_FROZEN FROZEN} - the item is unresponsive</li>
     * </ul>
     */
    public static final int
        UI_COLD   = 0,
        UI_HOT    = 1,
        UI_ACTIVE = 2,
        UI_FROZEN = 3;

    /**
     * container flags to pass to uiSetBox()
     * 
     * <p>({@code UIboxFlags})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #UI_ROW ROW} - left to right</li>
     * <li>{@link #UI_COLUMN COLUMN} - top to bottom</li>
     * <li>{@link #UI_LAYOUT LAYOUT} - free layout</li>
     * <li>{@link #UI_FLEX FLEX} - flex model</li>
     * <li>{@link #UI_NOWRAP NOWRAP} - single-line</li>
     * <li>{@link #UI_WRAP WRAP} - multi-line, wrap left to right</li>
     * <li>{@link #UI_START START} - justify-content (start, end, center, space-between) at start of row/column</li>
     * <li>{@link #UI_MIDDLE MIDDLE} - at center of row/column</li>
     * <li>{@link #UI_END END} - at end of row/column</li>
     * <li>{@link #UI_JUSTIFY JUSTIFY} - insert spacing to stretch across whole row/column</li>
     * </ul>
     */
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

    /**
     * child layout flags to pass to uiSetLayout()
     * 
     * <p>({@code UIlayoutFlags})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #UI_LEFT LEFT} - anchor to left item or left side of parent</li>
     * <li>{@link #UI_TOP TOP} - anchor to top item or top side of parent</li>
     * <li>{@link #UI_RIGHT RIGHT} - anchor to right item or right side of parent</li>
     * <li>{@link #UI_DOWN DOWN} - anchor to bottom item or bottom side of parent</li>
     * <li>{@link #UI_HFILL HFILL} - anchor to both left and right item or parent borders</li>
     * <li>{@link #UI_VFILL VFILL} - anchor to both top and bottom item or parent borders</li>
     * <li>{@link #UI_HCENTER HCENTER} - center horizontally, with left margin as offset</li>
     * <li>{@link #UI_VCENTER VCENTER} - center vertically, with top margin as offset</li>
     * <li>{@link #UI_CENTER CENTER} - center in both directions, with left/top margin as offset</li>
     * <li>{@link #UI_FILL FILL} - anchor to all four directions</li>
     * <li>{@link #UI_BREAK BREAK} - 
     * when wrapping, put this element on a new line wrapping layout code auto-inserts UI_BREAK flags, drawing routines can read them with uiGetLayout()
     * </li>
     * </ul>
     */
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

    /**
     * event flags
     * 
     * <p>({@code UIevent})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #UI_BUTTON0_DOWN BUTTON0_DOWN} - on button 0 down</li>
     * <li>{@link #UI_BUTTON0_UP BUTTON0_UP} - on button 0 up when this event has a handler, uiGetState() will return UI_ACTIVE as long as button 0 is down.</li>
     * <li>{@link #UI_BUTTON0_HOT_UP BUTTON0_HOT_UP} - 
     * on button 0 up while item is hovered when this event has a handler, uiGetState() will return UI_ACTIVE when the cursor is hovering the items
     * rectangle; this is the behavior expected for buttons.
     * </li>
     * <li>{@link #UI_BUTTON0_CAPTURE BUTTON0_CAPTURE} - 
     * item is being captured (button 0 constantly pressed); when this event has a handler, uiGetState() will return UI_ACTIVE as long as button 0 is
     * down.
     * </li>
     * <li>{@link #UI_BUTTON2_DOWN BUTTON2_DOWN} - on button 2 down (right mouse button, usually triggers context menu)</li>
     * <li>{@link #UI_SCROLL SCROLL} - item has received a scrollwheel event the accumulated wheel offset can be queried with uiGetScroll()</li>
     * <li>{@link #UI_KEY_DOWN KEY_DOWN} - item is focused and has received a key-down event the respective key can be queried using uiGetKey() and uiGetModifier()</li>
     * <li>{@link #UI_KEY_UP KEY_UP} - item is focused and has received a key-up event the respective key can be queried using uiGetKey() and uiGetModifier()</li>
     * <li>{@link #UI_CHAR CHAR} - item is focused and has received a character event the respective character can be queried using uiGetKey()</li>
     * </ul>
     */
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

    static { LibNanoVG.initialize(); }

    protected OUI() {
        throw new UnsupportedOperationException();
    }

    // --- [ uiCreateContext ] ---

    /**
     * create a new UI context; call uiMakeCurrent() to make this context the current context. The context is managed by the client and must be released using
     * uiDestroyContext() item_capacity is the maximum of number of items that can be declared. buffer_capacity is the maximum total size of bytes that can be
     * allocated using uiAllocHandle(); you may pass 0 if you don't need to allocate handles. 4096 and (1 &lt; &lt;20) are good starting values.
     */
    @NativeType("UIcontext *")
    public static native long uiCreateContext(@NativeType("unsigned int") int item_capacity, @NativeType("unsigned int") int buffer_capacity);

    // --- [ uiMakeCurrent ] ---

    /** Unsafe version of: {@link #uiMakeCurrent MakeCurrent} */
    public static native void nuiMakeCurrent(long ctx);

    /** select an UI context as the current context; a context must always be selected before using any of the other UI functions */
    public static void uiMakeCurrent(@NativeType("UIcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nuiMakeCurrent(ctx);
    }

    // --- [ uiDestroyContext ] ---

    /** Unsafe version of: {@link #uiDestroyContext DestroyContext} */
    public static native void nuiDestroyContext(long ctx);

    /** release the memory of an UI context created with uiCreateContext(); if the context is the current context, the current context will be set to NULL */
    public static void uiDestroyContext(@NativeType("UIcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nuiDestroyContext(ctx);
    }

    // --- [ uiGetContext ] ---

    /** returns the currently selected context or NULL */
    @NativeType("UIcontext *")
    public static native long uiGetContext();

    // --- [ uiSetCursor ] ---

    /** sets the current cursor position (usually belonging to a mouse) to the screen coordinates at (x,y) */
    public static native void uiSetCursor(int x, int y);

    // --- [ uiGetCursor ] ---

    /** Unsafe version of: {@link #uiGetCursor GetCursor} */
    public static native void nuiGetCursor(long __result);

    /** returns the current cursor position in screen coordinates as set by uiSetCursor() */
    @NativeType("UIvec2")
    public static UIVec2 uiGetCursor(@NativeType("UIvec2") UIVec2 __result) {
        nuiGetCursor(__result.address());
        return __result;
    }

    // --- [ uiGetCursorDelta ] ---

    /** Unsafe version of: {@link #uiGetCursorDelta GetCursorDelta} */
    public static native void nuiGetCursorDelta(long __result);

    /** returns the offset of the cursor relative to the last call to uiProcess() */
    @NativeType("UIvec2")
    public static UIVec2 uiGetCursorDelta(@NativeType("UIvec2") UIVec2 __result) {
        nuiGetCursorDelta(__result.address());
        return __result;
    }

    // --- [ uiGetCursorStart ] ---

    /** Unsafe version of: {@link #uiGetCursorStart GetCursorStart} */
    public static native void nuiGetCursorStart(long __result);

    /** returns the beginning point of a drag operation. */
    @NativeType("UIvec2")
    public static UIVec2 uiGetCursorStart(@NativeType("UIvec2") UIVec2 __result) {
        nuiGetCursorStart(__result.address());
        return __result;
    }

    // --- [ uiGetCursorStartDelta ] ---

    /** Unsafe version of: {@link #uiGetCursorStartDelta GetCursorStartDelta} */
    public static native void nuiGetCursorStartDelta(long __result);

    /** returns the offset of the cursor relative to the beginning point of a drag operation. */
    @NativeType("UIvec2")
    public static UIVec2 uiGetCursorStartDelta(@NativeType("UIvec2") UIVec2 __result) {
        nuiGetCursorStartDelta(__result.address());
        return __result;
    }

    // --- [ uiSetButton ] ---

    /** Unsafe version of: {@link #uiSetButton SetButton} */
    public static native void nuiSetButton(int button, int mod, int enabled);

    /**
     * sets a mouse or gamepad button as pressed/released button is in the range 0..63 and maps to an application defined input source. mod is an application
     * defined set of flags for modifier keys enabled is 1 for pressed, 0 for released
     */
    public static void uiSetButton(@NativeType("unsigned int") int button, @NativeType("unsigned int") int mod, @NativeType("int") boolean enabled) {
        nuiSetButton(button, mod, enabled ? 1 : 0);
    }

    // --- [ uiGetButton ] ---

    /**
     * returns the current state of an application dependent input button as set by uiSetButton(). the function returns 1 if the button has been set to
     * pressed, 0 for released.
     */
    public static native int uiGetButton(@NativeType("unsigned int") int button);

    // --- [ uiGetClicks ] ---

    /** returns the number of chained clicks; 1 is a single click, 2 is a double click, etc. */
    public static native int uiGetClicks();

    // --- [ uiSetKey ] ---

    /** Unsafe version of: {@link #uiSetKey SetKey} */
    public static native void nuiSetKey(int key, int mod, int enabled);

    /**
     * sets a key as down/up; the key can be any application defined keycode mod is an application defined set of flags for modifier keys enabled is 1 for key
     * down, 0 for key up all key events are being buffered until the next call to uiProcess()
     */
    public static void uiSetKey(@NativeType("unsigned int") int key, @NativeType("unsigned int") int mod, @NativeType("int") boolean enabled) {
        nuiSetKey(key, mod, enabled ? 1 : 0);
    }

    // --- [ uiSetChar ] ---

    /**
     * sends a single character for text input; the character is usually in the unicode range, but can be application defined. all char events are being
     * buffered until the next call to uiProcess()
     */
    public static native void uiSetChar(@NativeType("unsigned int") int value);

    // --- [ uiSetScroll ] ---

    /** accumulates scroll wheel offsets for the current frame all offsets are being accumulated until the next call to uiProcess() */
    public static native void uiSetScroll(int x, int y);

    // --- [ uiGetScroll ] ---

    /** Unsafe version of: {@link #uiGetScroll GetScroll} */
    public static native void nuiGetScroll(long __result);

    /** returns the currently accumulated scroll wheel offsets for this frame */
    @NativeType("UIvec2")
    public static UIVec2 uiGetScroll(@NativeType("UIvec2") UIVec2 __result) {
        nuiGetScroll(__result.address());
        return __result;
    }

    // --- [ uiBeginLayout ] ---

    /**
     * clear the item buffer; uiBeginLayout() should be called before the first UI declaration for this frame to avoid concatenation of the same UI multiple
     * times. After the call, all previously declared item IDs are invalid, and all application dependent context data has been freed. uiBeginLayout() must be
     * followed by uiEndLayout().
     */
    public static native void uiBeginLayout();

    // --- [ uiEndLayout ] ---

    /**
     * layout all added items starting from the root item 0. after calling uiEndLayout(), no further modifications to the item tree should be done until the
     * next call to uiBeginLayout(). It is safe to immediately draw the items after a call to uiEndLayout(). this is an O(N) operation for N = number of
     * declared items.
     */
    public static native void uiEndLayout();

    // --- [ uiUpdateHotItem ] ---

    /** update the current hot item; this only needs to be called if items are kept for more than one frame and uiEndLayout() is not called */
    public static native void uiUpdateHotItem();

    // --- [ uiProcess ] ---

    /**
     * update the internal state according to the current cursor position and button states, and call all registered handlers. timestamp is the time in
     * milliseconds relative to the last call to uiProcess() and is used to estimate the threshold for double-clicks after calling uiProcess(), no further
     * modifications to the item tree should be done until the next call to uiBeginLayout(). Items should be drawn before a call to uiProcess() this is an
     * O(N) operation for N = number of declared items.
     */
    public static native void uiProcess(int timestamp);

    // --- [ uiClearState ] ---

    /**
     * reset the currently stored hot/active etc. handles; this should be called when a re-declaration of the UI changes the item indices, to avoid state
     * related glitches because item identities have changed.
     */
    public static native void uiClearState();

    // --- [ uiItem ] ---

    /** create a new UI item and return the new items ID. */
    public static native int uiItem();

    // --- [ uiSetFrozen ] ---

    /** Unsafe version of: {@link #uiSetFrozen SetFrozen} */
    public static native void nuiSetFrozen(int item, int enable);

    /**
     * set an items state to frozen; the UI will not recurse into frozen items when searching for hot or active items; subsequently, frozen items and their
     * child items will not cause mouse event notifications. The frozen state is not applied recursively; uiGetState() will report UI_COLD for child items.
     * Upon encountering a frozen item, the drawing routine needs to handle rendering of child items appropriately. see example.cpp for a demonstration.
     */
    public static void uiSetFrozen(int item, @NativeType("int") boolean enable) {
        nuiSetFrozen(item, enable ? 1 : 0);
    }

    // --- [ uiSetHandle ] ---

    /** set the application-dependent handle of an item. handle is an application defined 64-bit handle. If handle is NULL, the item will not be interactive. */
    public static native void uiSetHandle(int item, @NativeType("void *") long handle);

    // --- [ uiAllocHandle ] ---

    /** Unsafe version of: {@link #uiAllocHandle AllocHandle} */
    public static native long nuiAllocHandle(int item, int size);

    /**
     * allocate space for application-dependent context data and assign it as the handle to the item. The memory of the pointer is managed by the UI context
     * and released upon the next call to uiBeginLayout()
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer uiAllocHandle(int item, @NativeType("unsigned int") int size) {
        long __result = nuiAllocHandle(item, size);
        return memByteBufferSafe(__result, size);
    }

    // --- [ uiSetHandler ] ---

    /** Unsafe version of: {@link #uiSetHandler SetHandler} */
    public static native void nuiSetHandler(long handler);

    /** set the global handler callback for interactive items. the handler will be called for each item whose event flags are set using uiSetEvents. */
    public static void uiSetHandler(@NativeType("UIhandler") UIHandlerI handler) {
        nuiSetHandler(handler.address());
    }

    // --- [ uiSetEvents ] ---

    /** flags is a combination of UI_EVENT_* and designates for which events the handler should be called. */
    public static native void uiSetEvents(int item, @NativeType("unsigned int") int flags);

    // --- [ uiSetFlags ] ---

    /** flags is a user-defined set of flags defined by UI_USERMASK. */
    public static native void uiSetFlags(int item, @NativeType("unsigned int") int flags);

    // --- [ uiInsert ] ---

    /**
     * assign an item to a container. an item ID of 0 refers to the root item. the function returns the child item ID if the container has already added
     * items, the function searches for the last item and calls uiAppend() on it, which is an O(N) operation for N siblings. it is usually more efficient to
     * call uiInsert() for the first child, then chain additional siblings using uiAppend().
     */
    public static native int uiInsert(int item, int child);

    // --- [ uiAppend ] ---

    /** assign an item to the same container as another item sibling is inserted after item. */
    public static native int uiAppend(int item, int sibling);

    // --- [ uiInsertBack ] ---

    /**
     * insert child into container item like uiInsert(), but prepend it to the first child item, effectively putting it in the background. it is efficient to
     * call uiInsertBack() repeatedly in cases where drawing or layout order doesn't matter.
     */
    public static native int uiInsertBack(int item, int child);

    // --- [ uiInsertFront ] ---

    /** same as uiInsert() */
    public static native int uiInsertFront(int item, int child);

    // --- [ uiSetSize ] ---

    /** set the size of the item; a size of 0 indicates the dimension to be dynamic; if the size is set, the item can not expand beyond that size. */
    public static native void uiSetSize(int item, int w, int h);

    // --- [ uiSetLayout ] ---

    /** set the anchoring behavior of the item to one or multiple UIlayoutFlags */
    public static native void uiSetLayout(int item, @NativeType("unsigned int") int flags);

    // --- [ uiSetBox ] ---

    /** set the box model behavior of the item to one or multiple UIboxFlags */
    public static native void uiSetBox(int item, @NativeType("unsigned int") int flags);

    // --- [ uiSetMargins ] ---

    /** Unsafe version of: {@link #uiSetMargins SetMargins} */
    public static native void nuiSetMargins(int item, short l, short t, short r, short b);

    /**
     * set the left, top, right and bottom margins of an item; when the item is anchored to the parent or another item, the margin controls the distance from
     * the neighboring element.
     */
    public static void uiSetMargins(int item, @NativeType("short") int l, @NativeType("short") int t, @NativeType("short") int r, @NativeType("short") int b) {
        nuiSetMargins(item, (short)l, (short)t, (short)r, (short)b);
    }

    // --- [ uiFocus ] ---

    /** set item as recipient of all keyboard events; if item is -1, no item will be focused. */
    public static native void uiFocus(int item);

    // --- [ uiFirstChild ] ---

    /**
     * returns the first child item of a container item. If the item is not a container or does not contain any items, -1 is returned. if item is 0, the first
     * child item of the root item will be returned.
     */
    public static native int uiFirstChild(int item);

    // --- [ uiNextSibling ] ---

    /** returns an items next sibling in the list of the parent containers children. if item is 0 or the item is the last child item, -1 will be returned. */
    public static native int uiNextSibling(int item);

    // --- [ uiGetItemCount ] ---

    /** return the total number of allocated items */
    public static native int uiGetItemCount();

    // --- [ uiGetAllocSize ] ---

    /** return the total bytes that have been allocated by uiAllocHandle() */
    @NativeType("unsigned int")
    public static native int uiGetAllocSize();

    // --- [ uiGetState ] ---

    /**
     * return the current state of the item. This state is only valid after a call to uiProcess(). The returned value is one of UI_COLD, UI_HOT, UI_ACTIVE,
     * UI_FROZEN.
     */
    @NativeType("UIitemState")
    public static native int uiGetState(int item);

    // --- [ uiGetHandle ] ---

    /** return the application-dependent handle of the item as passed to uiSetHandle() or uiAllocHandle(). */
    @NativeType("void *")
    public static native long uiGetHandle(int item);

    // --- [ uiGetHotItem ] ---

    /** return the item that is currently under the cursor or -1 for none */
    public static native int uiGetHotItem();

    // --- [ uiGetFocusedItem ] ---

    /** return the item that is currently focused or -1 for none */
    public static native int uiGetFocusedItem();

    // --- [ uiFindItem ] ---

    /**
     * returns the topmost item containing absolute location (x,y), starting with item as parent, using a set of flags and masks as filter: if both flags and
     * mask are UI_ANY, the first topmost item is returned. if mask is UI_ANY, the first topmost item matching *any* of flags is returned. otherwise the first
     * item matching (item.flags & flags) == mask is returned. you may combine box, layout, event and user flags. frozen items will always be ignored.
     */
    public static native int uiFindItem(int item, int x, int y, @NativeType("unsigned int") int flags, @NativeType("unsigned int") int mask);

    // --- [ uiGetHandler ] ---

    /** Unsafe version of: {@link #uiGetHandler GetHandler} */
    public static native long nuiGetHandler();

    /** return the handler callback as passed to uiSetHandler() */
    @Nullable
    @NativeType("UIhandler")
    public static UIHandler uiGetHandler() {
        return UIHandler.createSafe(nuiGetHandler());
    }

    // --- [ uiGetEvents ] ---

    /** return the event flags for an item as passed to uiSetEvents() */
    @NativeType("unsigned int")
    public static native int uiGetEvents(int item);

    // --- [ uiGetFlags ] ---

    /** return the user-defined flags for an item as passed to uiSetFlags() */
    @NativeType("unsigned int")
    public static native int uiGetFlags(int item);

    // --- [ uiGetKey ] ---

    /** when handling a KEY_DOWN/KEY_UP event: the key that triggered this event */
    @NativeType("unsigned int")
    public static native int uiGetKey();

    // --- [ uiGetModifier ] ---

    /** when handling a keyboard or mouse event: the active modifier keys */
    @NativeType("unsigned int")
    public static native int uiGetModifier();

    // --- [ uiGetRect ] ---

    /** Unsafe version of: {@link #uiGetRect GetRect} */
    public static native void nuiGetRect(int item, long __result);

    /**
     * returns the items layout rectangle in absolute coordinates. If uiGetRect() is called before uiEndLayout(), the values of the returned rectangle are
     * undefined.
     */
    @NativeType("UIrect")
    public static UIRect uiGetRect(int item, @NativeType("UIrect") UIRect __result) {
        nuiGetRect(item, __result.address());
        return __result;
    }

    // --- [ uiContains ] ---

    /** returns 1 if an items absolute rectangle contains a given coordinate otherwise 0 */
    public static native int uiContains(int item, int x, int y);

    // --- [ uiGetWidth ] ---

    /** return the width of the item as set by uiSetSize() */
    public static native int uiGetWidth(int item);

    // --- [ uiGetHeight ] ---

    /** return the height of the item as set by uiSetSize() */
    public static native int uiGetHeight(int item);

    // --- [ uiGetLayout ] ---

    /** return the anchoring behavior as set by uiSetLayout() */
    @NativeType("unsigned int")
    public static native int uiGetLayout(int item);

    // --- [ uiGetBox ] ---

    /** return the box model as set by uiSetBox() */
    @NativeType("unsigned int")
    public static native int uiGetBox(int item);

    // --- [ uiGetMarginLeft ] ---

    /** return the left margin of the item as set with uiSetMargins() */
    public static native short uiGetMarginLeft(int item);

    // --- [ uiGetMarginTop ] ---

    /** return the top margin of the item as set with uiSetMargins() */
    public static native short uiGetMarginTop(int item);

    // --- [ uiGetMarginRight ] ---

    /** return the right margin of the item as set with uiSetMargins() */
    public static native short uiGetMarginRight(int item);

    // --- [ uiGetMarginDown ] ---

    /** return the bottom margin of the item as set with uiSetMargins() */
    public static native short uiGetMarginDown(int item);

    // --- [ uiRecoverItem ] ---

    /**
     * when uiBeginLayout() is called, the most recently declared items are retained. when uiEndLayout() completes, it matches the old item hierarchy to the
     * new one and attempts to map old items to new items as well as possible. when passed an item Id from the previous frame, uiRecoverItem() returns the
     * items new assumed Id, or -1 if the item could not be mapped. it is valid to pass -1 as item.
     */
    public static native int uiRecoverItem(int olditem);

    // --- [ uiRemapItem ] ---

    /**
     * in cases where it is important to recover old state over changes in the view, and the built-in remapping fails, the UI declaration can manually remap
     * old items to new IDs in cases where e.g. the previous item ID has been temporarily saved; uiRemapItem() would then be called after creating the new
     * item using uiItem().
     */
    public static native void uiRemapItem(int olditem, int newitem);

    // --- [ uiGetLastItemCount ] ---

    /** returns the number if items that have been allocated in the last frame */
    public static native int uiGetLastItemCount();

}