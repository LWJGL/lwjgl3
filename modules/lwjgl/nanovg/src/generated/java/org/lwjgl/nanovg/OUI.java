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

    static { LibNanoVG.initialize(); }

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #UI_USERMASK USERMASK} - 
     * these bits, starting at bit 24, can be safely assigned by the application, e.g. as item types, other event types, drop targets, etc.
     * 
     * <p>They can be set and queried using {@link #uiSetFlags SetFlags} and {@link #uiGetFlags GetFlags}.</p>
     * </li>
     * <li>{@link #UI_ANY ANY} - a special mask passed to {@link #uiFindItem FindItem}</li>
     * </ul>
     */
    public static final int
        UI_USERMASK = 0xFF000000,
        UI_ANY      = 0xFFFFFFFF;

    /**
     * Item states as returned by {@link #uiGetState GetState}. ({@code UIitemState})
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
     * Container flags to pass to {@link #uiSetBox SetBox}. ({@code UIboxFlags})
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
     * Child layout flags to pass to {@link #uiSetLayout SetLayout}. ({@code UIlayoutFlags})
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
     * when wrapping, put this element on a new line.
     * 
     * <p>Wrapping layout code auto-inserts {@code UI_BREAK} flags, drawing routines can read them with {@link #uiGetLayout GetLayout}.</p>
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
     * Event flags. ({@code UIevent})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #UI_BUTTON0_DOWN BUTTON0_DOWN} - on button 0 down</li>
     * <li>{@link #UI_BUTTON0_UP BUTTON0_UP} - on button 0 up when this event has a handler, {@link #uiGetState GetState} will return {@link #UI_ACTIVE ACTIVE} as long as button 0 is down</li>
     * <li>{@link #UI_BUTTON0_HOT_UP BUTTON0_HOT_UP} - 
     * on button 0 up while item is hovered when this event has a handler, {@link #uiGetState GetState} will return {@link #UI_ACTIVE ACTIVE} when the cursor is hovering the items
     * rectangle; this is the behavior expected for buttons
     * </li>
     * <li>{@link #UI_BUTTON0_CAPTURE BUTTON0_CAPTURE} - item is being captured (button 0 constantly pressed); when this event has a handler, {@link #uiGetState GetState} will return {@link #UI_ACTIVE ACTIVE} as long as button 0 is down</li>
     * <li>{@link #UI_BUTTON2_DOWN BUTTON2_DOWN} - on button 2 down (right mouse button, usually triggers context menu)</li>
     * <li>{@link #UI_SCROLL SCROLL} - item has received a scrollwheel event the accumulated wheel offset can be queried with {@link #uiGetScroll GetScroll}</li>
     * <li>{@link #UI_KEY_DOWN KEY_DOWN} - item is focused and has received a key-down event the respective key can be queried using {@link #uiGetKey GetKey} and {@link #uiGetModifier GetModifier}</li>
     * <li>{@link #UI_KEY_UP KEY_UP} - item is focused and has received a key-up event the respective key can be queried using {@link #uiGetKey GetKey} and {@link #uiGetModifier GetModifier}</li>
     * <li>{@link #UI_CHAR CHAR} - item is focused and has received a character event the respective character can be queried using {@link #uiGetKey GetKey}</li>
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

    protected OUI() {
        throw new UnsupportedOperationException();
    }

    // --- [ uiCreateContext ] ---

    /**
     * Creates a new UI context; call {@link #uiMakeCurrent MakeCurrent} to make this context the current context.
     * 
     * <p>The context is managed by the client and must be released using {@link #uiDestroyContext DestroyContext}.</p>
     *
     * @param item_capacity   the maximum number of items that can be declared. 4096 is a good starting value.
     * @param buffer_capacity the maximum total size of bytes that can be allocated using {@link #uiAllocHandle AllocHandle}; you may pass 0 if you don't need to allocate handles. {@code (1<<20)}
     *                        is a good starting value.
     */
    @NativeType("UIcontext *")
    public static native long uiCreateContext(@NativeType("unsigned int") int item_capacity, @NativeType("unsigned int") int buffer_capacity);

    // --- [ uiMakeCurrent ] ---

    /** Selects an UI context as the current context; a context must always be selected before using any of the other UI functions. */
    public static native void uiMakeCurrent(@NativeType("UIcontext *") long ctx);

    // --- [ uiDestroyContext ] ---

    /** Unsafe version of: {@link #uiDestroyContext DestroyContext} */
    public static native void nuiDestroyContext(long ctx);

    /** Releases the memory of an UI context created with {@link #uiCreateContext CreateContext}; if the context is the current context, the current context will be set to {@code NULL}. */
    public static void uiDestroyContext(@NativeType("UIcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nuiDestroyContext(ctx);
    }

    // --- [ uiGetContext ] ---

    /** Returns the currently selected context or {@code NULL}. */
    @NativeType("UIcontext *")
    public static native long uiGetContext();

    // --- [ uiSetCursor ] ---

    /** Sets the current cursor position (usually belonging to a mouse) to the screen coordinates at {@code (x,y)}. */
    public static native void uiSetCursor(int x, int y);

    // --- [ uiGetCursor ] ---

    /** Unsafe version of: {@link #uiGetCursor GetCursor} */
    public static native void nuiGetCursor(long __result);

    /** Returns the current cursor position in screen coordinates as set by {@link #uiSetCursor SetCursor}. */
    @NativeType("UIvec2")
    public static UIVec2 uiGetCursor(@NativeType("UIvec2") UIVec2 __result) {
        nuiGetCursor(__result.address());
        return __result;
    }

    // --- [ uiGetCursorDelta ] ---

    /** Unsafe version of: {@link #uiGetCursorDelta GetCursorDelta} */
    public static native void nuiGetCursorDelta(long __result);

    /** Returns the offset of the cursor relative to the last call to {@link #uiProcess Process}. */
    @NativeType("UIvec2")
    public static UIVec2 uiGetCursorDelta(@NativeType("UIvec2") UIVec2 __result) {
        nuiGetCursorDelta(__result.address());
        return __result;
    }

    // --- [ uiGetCursorStart ] ---

    /** Unsafe version of: {@link #uiGetCursorStart GetCursorStart} */
    public static native void nuiGetCursorStart(long __result);

    /** Returns the beginning point of a drag operation. */
    @NativeType("UIvec2")
    public static UIVec2 uiGetCursorStart(@NativeType("UIvec2") UIVec2 __result) {
        nuiGetCursorStart(__result.address());
        return __result;
    }

    // --- [ uiGetCursorStartDelta ] ---

    /** Unsafe version of: {@link #uiGetCursorStartDelta GetCursorStartDelta} */
    public static native void nuiGetCursorStartDelta(long __result);

    /** Returns the offset of the cursor relative to the beginning point of a drag operation. */
    @NativeType("UIvec2")
    public static UIVec2 uiGetCursorStartDelta(@NativeType("UIvec2") UIVec2 __result) {
        nuiGetCursorStartDelta(__result.address());
        return __result;
    }

    // --- [ uiSetButton ] ---

    /** Unsafe version of: {@link #uiSetButton SetButton} */
    public static native void nuiSetButton(int button, int mod, int enabled);

    /**
     * Sets a mouse or gamepad button as pressed/released button is in the range {@code 0..63} and maps to an application defined input source.
     *
     * @param mod     an application defined set of flags for modifier keys
     * @param enabled is 1 for pressed, 0 for released
     */
    public static void uiSetButton(@NativeType("unsigned int") int button, @NativeType("unsigned int") int mod, @NativeType("int") boolean enabled) {
        nuiSetButton(button, mod, enabled ? 1 : 0);
    }

    // --- [ uiGetButton ] ---

    /** Unsafe version of: {@link #uiGetButton GetButton} */
    public static native int nuiGetButton(int button);

    /**
     * Returns the current state of an application dependent input button as set by {@link #uiSetButton SetButton}.
     *
     * @return 1 if the button has been set to pressed, 0 for released
     */
    @NativeType("int")
    public static boolean uiGetButton(@NativeType("unsigned int") int button) {
        return nuiGetButton(button) != 0;
    }

    // --- [ uiGetClicks ] ---

    /** Returns the number of chained clicks; 1 is a single click, 2 is a double click, etc. */
    public static native int uiGetClicks();

    // --- [ uiSetKey ] ---

    /** Unsafe version of: {@link #uiSetKey SetKey} */
    public static native void nuiSetKey(int key, int mod, int enabled);

    /**
     * Sets a key as down/up; the key can be any application defined {@code keycode}.
     * 
     * <p>All key events are being buffered until the next call to {@link #uiProcess Process}.</p>
     *
     * @param mod     an application defined set of flags for modifier keys
     * @param enabled 1 for key down, 0 for key up
     */
    public static void uiSetKey(@NativeType("unsigned int") int key, @NativeType("unsigned int") int mod, @NativeType("int") boolean enabled) {
        nuiSetKey(key, mod, enabled ? 1 : 0);
    }

    // --- [ uiSetChar ] ---

    /**
     * Sends a single character for text input; the character is usually in the unicode range, but can be application defined.
     * 
     * <p>All char events are being buffered until the next call to {@link #uiProcess Process}.</p>
     */
    public static native void uiSetChar(@NativeType("unsigned int") int value);

    // --- [ uiSetScroll ] ---

    /**
     * Accumulates scroll wheel offsets for the current frame.
     * 
     * <p>All offsets are being accumulated until the next call to {@link #uiProcess Process}.</p>
     */
    public static native void uiSetScroll(int x, int y);

    // --- [ uiGetScroll ] ---

    /** Unsafe version of: {@link #uiGetScroll GetScroll} */
    public static native void nuiGetScroll(long __result);

    /** Returns the currently accumulated scroll wheel offsets for this frame */
    @NativeType("UIvec2")
    public static UIVec2 uiGetScroll(@NativeType("UIvec2") UIVec2 __result) {
        nuiGetScroll(__result.address());
        return __result;
    }

    // --- [ uiBeginLayout ] ---

    /**
     * Clears the item buffer.
     * 
     * <p>{@code uiBeginLayout()} should be called before the first UI declaration for this frame to avoid concatenation of the same UI multiple times. After the
     * call, all previously declared item IDs are invalid, and all application dependent context data has been freed.</p>
     * 
     * <p>{@code uiBeginLayout()} must be followed by {@link #uiEndLayout EndLayout}.</p>
     */
    public static native void uiBeginLayout();

    // --- [ uiEndLayout ] ---

    /**
     * Layout all added items starting from the root item 0.
     * 
     * <p>After calling {@code uiEndLayout()}, no further modifications to the item tree should be done until the next call to {@link #uiBeginLayout BeginLayout}. It is safe to
     * immediately draw the items after a call to {@code uiEndLayout()}.</p>
     * 
     * <p>This is an {@code O(N)} operation for {@code N = number of declared items}.</p>
     */
    public static native void uiEndLayout();

    // --- [ uiUpdateHotItem ] ---

    /** Updates the current hot item; this only needs to be called if items are kept for more than one frame and {@link #uiEndLayout EndLayout} is not called. */
    public static native void uiUpdateHotItem();

    // --- [ uiProcess ] ---

    /**
     * Updates the internal state according to the current cursor position and button states, and call all registered handlers.
     * 
     * <p>No further modifications to the item tree should be done until the next call to {@link #uiBeginLayout BeginLayout}. Items should be drawn before a call to
     * {@code uiProcess()}.</p>
     * 
     * <p>This is an {@code O(N)} operation for {@code N = number of declared items}.</p>
     *
     * @param timestamp the time in milliseconds relative to the last call to {@code uiProcess()} and is used to estimate the threshold for double-clicks after calling
     *                  {@code uiProcess()}.
     */
    public static native void uiProcess(int timestamp);

    // --- [ uiClearState ] ---

    /**
     * Resets the currently stored hot/active etc. handles.
     * 
     * <p>This should be called when a re-declaration of the UI changes the item indices, to avoid state related glitches because item identities have changed.</p>
     */
    public static native void uiClearState();

    // --- [ uiItem ] ---

    /** Creates a new UI item and return the new item's ID. */
    public static native int uiItem();

    // --- [ uiSetFrozen ] ---

    /** Unsafe version of: {@link #uiSetFrozen SetFrozen} */
    public static native void nuiSetFrozen(int item, int enable);

    /**
     * Sets an items state to frozen.
     * 
     * <p>The UI will not recurse into frozen items when searching for hot or active items; subsequently, frozen items and their child items will not cause mouse
     * event notifications. The frozen state is not applied recursively; {@link #uiGetState GetState} will report {@link #UI_COLD COLD} for child items. Upon encountering a frozen item, the
     * drawing routine needs to handle rendering of child items appropriately.</p>
     */
    public static void uiSetFrozen(int item, @NativeType("int") boolean enable) {
        nuiSetFrozen(item, enable ? 1 : 0);
    }

    // --- [ uiSetHandle ] ---

    /**
     * Sets the application-dependent handle of an item.
     *
     * @param handle an application defined 64-bit handle. If {@code NULL}, the item will not be interactive.
     */
    public static native void uiSetHandle(int item, @NativeType("void *") long handle);

    // --- [ uiAllocHandle ] ---

    /** Unsafe version of: {@link #uiAllocHandle AllocHandle} */
    public static native long nuiAllocHandle(int item, int size);

    /**
     * Allocates space for application-dependent context data and assign it as the handle to the item.
     * 
     * <p>The memory of the pointer is managed by the UI context and released upon the next call to {@link #uiBeginLayout BeginLayout}.</p>
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

    /**
     * Sets the global handler callback for interactive items.
     * 
     * <p>The handler will be called for each item whose event flags are set using {@link #uiSetEvents SetEvents}.</p>
     */
    public static void uiSetHandler(@NativeType("UIhandler") UIHandlerI handler) {
        nuiSetHandler(handler.address());
    }

    // --- [ uiSetEvents ] ---

    /** @param flags designates for which events the handler should be called. One or more of:<br><table><tr><td>{@link #UI_BUTTON0_DOWN BUTTON0_DOWN}</td><td>{@link #UI_BUTTON0_UP BUTTON0_UP}</td><td>{@link #UI_BUTTON0_HOT_UP BUTTON0_HOT_UP}</td><td>{@link #UI_BUTTON0_CAPTURE BUTTON0_CAPTURE}</td><td>{@link #UI_BUTTON2_DOWN BUTTON2_DOWN}</td><td>{@link #UI_SCROLL SCROLL}</td><td>{@link #UI_KEY_DOWN KEY_DOWN}</td><td>{@link #UI_KEY_UP KEY_UP}</td></tr><tr><td>{@link #UI_CHAR CHAR}</td></tr></table> */
    public static native void uiSetEvents(int item, @NativeType("unsigned int") int flags);

    // --- [ uiSetFlags ] ---

    /** @param flags a user-defined set of flags defined by {@link #UI_USERMASK USERMASK} */
    public static native void uiSetFlags(int item, @NativeType("unsigned int") int flags);

    // --- [ uiInsert ] ---

    /**
     * Assigns an item to a container.
     * 
     * <p>An item ID of 0 refers to the root item. The function searches for the last item and calls {@link #uiAppend Append} on it, which is an {@code O(N)} operation for
     * {@code N} siblings. It is usually more efficient to call {@code uiInser}t() for the first child, then chain additional siblings using
     * {@code uiAppend()}.</p>
     *
     * @return the child item ID if the container has already added items
     */
    public static native int uiInsert(int item, int child);

    // --- [ uiAppend ] ---

    /**
     * Assigns an item to the same container as another item.
     *
     * @param sibling inserted after {@code item}
     */
    public static native int uiAppend(int item, int sibling);

    // --- [ uiInsertBack ] ---

    /**
     * Inserts child into container item like {@link #uiInsert Insert}, but prepend it to the first child item, effectively putting it in the background.
     * 
     * <p>It is efficient to call {@code uiInsertBack()} repeatedly in cases where drawing or layout order doesn't matter.</p>
     */
    public static native int uiInsertBack(int item, int child);

    // --- [ uiInsertFront ] ---

    /** Same as {@link #uiInsert Insert}. */
    public static native int uiInsertFront(int item, int child);

    // --- [ uiSetSize ] ---

    /**
     * Sets the size of the item.
     * 
     * <p>A size of 0 indicates the dimension to be dynamic; if the size is set, the item can not expand beyond that size.</p>
     */
    public static native void uiSetSize(int item, int w, int h);

    // --- [ uiSetLayout ] ---

    /**
     * Sets the anchoring behavior of the item to one or multiple {@code UIlayoutFlags}.
     *
     * @param flags one or more of:<br><table><tr><td>{@link #UI_LEFT LEFT}</td><td>{@link #UI_TOP TOP}</td><td>{@link #UI_RIGHT RIGHT}</td><td>{@link #UI_DOWN DOWN}</td><td>{@link #UI_HFILL HFILL}</td><td>{@link #UI_VFILL VFILL}</td><td>{@link #UI_HCENTER HCENTER}</td><td>{@link #UI_VCENTER VCENTER}</td><td>{@link #UI_CENTER CENTER}</td><td>{@link #UI_FILL FILL}</td><td>{@link #UI_BREAK BREAK}</td></tr></table>
     */
    public static native void uiSetLayout(int item, @NativeType("unsigned int") int flags);

    // --- [ uiSetBox ] ---

    /**
     * Sets the box model behavior of the item to one or multiple {@code UIboxFlags}.
     *
     * @param flags one or more of:<br><table><tr><td>{@link #UI_ROW ROW}</td><td>{@link #UI_COLUMN COLUMN}</td><td>{@link #UI_LAYOUT LAYOUT}</td><td>{@link #UI_FLEX FLEX}</td><td>{@link #UI_NOWRAP NOWRAP}</td><td>{@link #UI_WRAP WRAP}</td><td>{@link #UI_START START}</td><td>{@link #UI_MIDDLE MIDDLE}</td><td>{@link #UI_END END}</td><td>{@link #UI_JUSTIFY JUSTIFY}</td></tr></table>
     */
    public static native void uiSetBox(int item, @NativeType("unsigned int") int flags);

    // --- [ uiSetMargins ] ---

    /** Unsafe version of: {@link #uiSetMargins SetMargins} */
    public static native void nuiSetMargins(int item, short l, short t, short r, short b);

    /**
     * Sets the left, top, right and bottom margins of an item.
     * 
     * <p>When the item is anchored to the parent or another item, the margin controls the distance from the neighboring element.</p>
     */
    public static void uiSetMargins(int item, @NativeType("short") int l, @NativeType("short") int t, @NativeType("short") int r, @NativeType("short") int b) {
        nuiSetMargins(item, (short)l, (short)t, (short)r, (short)b);
    }

    // --- [ uiFocus ] ---

    /**
     * Sets item as recipient of all keyboard events.
     *
     * @param item if -1, no item will be focused
     */
    public static native void uiFocus(int item);

    // --- [ uiFirstChild ] ---

    /**
     * Returns the first child item of a container item.
     * 
     * <p>If the item is not a container or does not contain any items, -1 is returned.</p>
     *
     * @param item if 0, the first child item of the root item will be returned
     */
    public static native int uiFirstChild(int item);

    // --- [ uiNextSibling ] ---

    /**
     * Returns an items next sibling in the list of the parent containers children.
     * 
     * <p>If {@code item} is 0 or the item is the last child item, -1 will be returned.</p>
     */
    public static native int uiNextSibling(int item);

    // --- [ uiGetItemCount ] ---

    /** Returns the total number of allocated items */
    public static native int uiGetItemCount();

    // --- [ uiGetAllocSize ] ---

    /** Returns the total bytes that have been allocated by {@link #uiAllocHandle AllocHandle} */
    @NativeType("unsigned int")
    public static native int uiGetAllocSize();

    // --- [ uiGetState ] ---

    /**
     * Returns the current state of the item.
     * 
     * <p>This state is only valid after a call to {@link #uiProcess Process}. The returned value is one of {@link #UI_COLD COLD}, {@link #UI_HOT HOT}, {@link #UI_ACTIVE ACTIVE}, {@link #UI_FROZEN FROZEN}.</p>
     */
    @NativeType("UIitemState")
    public static native int uiGetState(int item);

    // --- [ uiGetHandle ] ---

    /** Returns the application-dependent handle of the item as passed to {@link #uiSetHandle SetHandle} or {@link #uiAllocHandle AllocHandle}. */
    @NativeType("void *")
    public static native long uiGetHandle(int item);

    // --- [ uiGetHotItem ] ---

    /** Returns the item that is currently under the cursor or -1 for none. */
    public static native int uiGetHotItem();

    // --- [ uiGetFocusedItem ] ---

    /** Returns the item that is currently focused or -1 for none. */
    public static native int uiGetFocusedItem();

    // --- [ uiFindItem ] ---

    /**
     * Returns the topmost item containing absolute location {@code (x,y)}, starting with {@code item} as parent, using a set of flags and masks as filter.
     * 
     * <p>If both {@code flags} and {@code mask} are {@link #UI_ANY ANY}, the first topmost item is returned. If {@code mask} is {@link #UI_ANY ANY}, the first topmost item matching
     * <em>any</em> of flags is returned. otherwise the first item matching {@code (item.flags & flags) == mask} is returned. You may combine box, layout,
     * event and user flags. Frozen items will always be ignored.</p>
     */
    public static native int uiFindItem(int item, int x, int y, @NativeType("unsigned int") int flags, @NativeType("unsigned int") int mask);

    // --- [ uiGetHandler ] ---

    /** Unsafe version of: {@link #uiGetHandler GetHandler} */
    public static native long nuiGetHandler();

    /** Returns the handler callback as passed to {@link #uiSetHandler SetHandler} */
    @Nullable
    @NativeType("UIhandler")
    public static UIHandler uiGetHandler() {
        return UIHandler.createSafe(nuiGetHandler());
    }

    // --- [ uiGetEvents ] ---

    /** Returns the event flags for an item as passed to {@link #uiSetEvents SetEvents} */
    @NativeType("unsigned int")
    public static native int uiGetEvents(int item);

    // --- [ uiGetFlags ] ---

    /** Returns the user-defined flags for an item as passed to {@link #uiSetFlags SetFlags} */
    @NativeType("unsigned int")
    public static native int uiGetFlags(int item);

    // --- [ uiGetKey ] ---

    /** When handling a {@code KEY_DOWN/KEY_UP} event: the key that triggered this event. */
    @NativeType("unsigned int")
    public static native int uiGetKey();

    // --- [ uiGetModifier ] ---

    /** When handling a keyboard or mouse event: the active modifier keys. */
    @NativeType("unsigned int")
    public static native int uiGetModifier();

    // --- [ uiGetRect ] ---

    /** Unsafe version of: {@link #uiGetRect GetRect} */
    public static native void nuiGetRect(int item, long __result);

    /**
     * Returns the items layout rectangle in absolute coordinates.
     * 
     * <p>If {@code uiGetRect()} is called before {@link #uiEndLayout EndLayout}, the values of the returned rectangle are undefined.</p>
     */
    @NativeType("UIrect")
    public static UIRect uiGetRect(int item, @NativeType("UIrect") UIRect __result) {
        nuiGetRect(item, __result.address());
        return __result;
    }

    // --- [ uiContains ] ---

    /** Unsafe version of: {@link #uiContains Contains} */
    public static native int nuiContains(int item, int x, int y);

    /** Returns 1 if an items absolute rectangle contains a given coordinate, otherwise 0. */
    @NativeType("int")
    public static boolean uiContains(int item, int x, int y) {
        return nuiContains(item, x, y) != 0;
    }

    // --- [ uiGetWidth ] ---

    /** Returns the width of the item as set by {@link #uiSetSize SetSize}. */
    public static native int uiGetWidth(int item);

    // --- [ uiGetHeight ] ---

    /** Return the height of the item as set by {@link #uiSetSize SetSize}. */
    public static native int uiGetHeight(int item);

    // --- [ uiGetLayout ] ---

    /** Returns the anchoring behavior as set by {@link #uiSetLayout SetLayout}. */
    @NativeType("unsigned int")
    public static native int uiGetLayout(int item);

    // --- [ uiGetBox ] ---

    /** Returns the box model as set by {@link #uiSetBox SetBox}. */
    @NativeType("unsigned int")
    public static native int uiGetBox(int item);

    // --- [ uiGetMarginLeft ] ---

    /** Returns the left margin of the item as set with {@link #uiSetMargins SetMargins}. */
    public static native short uiGetMarginLeft(int item);

    // --- [ uiGetMarginTop ] ---

    /** Returns the top margin of the item as set with {@link #uiSetMargins SetMargins}. */
    public static native short uiGetMarginTop(int item);

    // --- [ uiGetMarginRight ] ---

    /** Returns the right margin of the item as set with {@link #uiSetMargins SetMargins}. */
    public static native short uiGetMarginRight(int item);

    // --- [ uiGetMarginDown ] ---

    /** Returns the bottom margin of the item as set with {@link #uiSetMargins SetMargins}. */
    public static native short uiGetMarginDown(int item);

    // --- [ uiRecoverItem ] ---

    /**
     * When {@link #uiBeginLayout BeginLayout} is called, the most recently declared items are retained. When {@link #uiEndLayout EndLayout} completes, it matches the old item hierarchy to the new
     * one and attempts to map old items to new items as well as possible. When passed an item Id from the previous frame, {@code uiRecoverItem()} returns the
     * item's new assumed Id, or -1 if the item could not be mapped. It is valid to pass -1 as item.
     */
    public static native int uiRecoverItem(int olditem);

    // --- [ uiRemapItem ] ---

    /**
     * In cases where it is important to recover old state over changes in the view, and the built-in remapping fails, the UI declaration can manually remap
     * old items to new IDs in cases where e.g. the previous item ID has been temporarily saved; {@code uiRemapItem()} would then be called after creating the
     * new item using {@link #uiItem Item}.
     */
    public static native void uiRemapItem(int olditem, int newitem);

    // --- [ uiGetLastItemCount ] ---

    /** Returns the number if items that have been allocated in the last frame. */
    public static native int uiGetLastItemCount();

}