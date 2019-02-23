/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nanovg.templates

import org.lwjgl.generator.*
import nanovg.*

val oui = "OUI".nativeClass(Module.NANOVG, prefix = "UI") {
    nativeDirective("""
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>
#define OUI_IMPLEMENTATION
#include "oui.h"""")

    documentation =
        """
        """

    EnumConstant(
        "",

        "USERMASK".enum(
            """
            these bits, starting at bit 24, can be safely assigned by the application, e.g. as item types, other event types, drop targets, etc. they can be
            set and queried using uiSetFlags() and uiGetFlags()
            """,
            0xff000000.i
        ),
        "ANY".enum("a special mask passed to uiFindItem()", 0xffffffff.i)
    )

    EnumConstant(
        """
        item states as returned by uiGetState()

        ({@code UIitemState})
        """,

        "COLD".enum("the item is inactive", "0"),
        "HOT".enum("the item is inactive, but the cursor is hovering over this item"),
        "ACTIVE".enum("the item is toggled, activated, focused (depends on item kind)"),
        "FROZEN".enum("the item is unresponsive")
    )

    EnumConstant(
        """
        container flags to pass to uiSetBox()

        ({@code UIboxFlags})
        """,

        "ROW".enum("left to right", "0x002"),
        "COLUMN".enum("top to bottom", "0x003"),
        "LAYOUT".enum("free layout", "0x000"),
        "FLEX".enum("flex model", "0x002"),
        "NOWRAP".enum("single-line", "0x000"),
        "WRAP".enum("multi-line, wrap left to right", "0x004"),
        "START".enum("justify-content (start, end, center, space-between) at start of row/column", "0x008"),
        "MIDDLE".enum("at center of row/column", "0x000"),
        "END".enum("at end of row/column", "0x010"),
        "JUSTIFY".enum("insert spacing to stretch across whole row/column", "0x018")
    )

    EnumConstant(
        """
        child layout flags to pass to uiSetLayout()

        ({@code UIlayoutFlags})
        """,

        "LEFT".enum("anchor to left item or left side of parent", "0x020"),
        "TOP".enum("anchor to top item or top side of parent", "0x040"),
        "RIGHT".enum("anchor to right item or right side of parent", "0x080"),
        "DOWN".enum("anchor to bottom item or bottom side of parent", "0x100"),
        "HFILL".enum("anchor to both left and right item or parent borders", "0x0a0"),
        "VFILL".enum("anchor to both top and bottom item or parent borders", "0x140"),
        "HCENTER".enum("center horizontally, with left margin as offset", "0x000"),
        "VCENTER".enum("center vertically, with top margin as offset", "0x000"),
        "CENTER".enum("center in both directions, with left/top margin as offset", "0x000"),
        "FILL".enum("anchor to all four directions", "0x1e0"),
        "BREAK".enum(
            """
            when wrapping, put this element on a new line wrapping layout code auto-inserts UI_BREAK flags, drawing routines can read them with uiGetLayout()
            """,
            "0x200"
        )
    )

    EnumConstant(
        """
        event flags

        ({@code UIevent})
        """,

        "BUTTON0_DOWN".enum("on button 0 down", "0x0400"),
        "BUTTON0_UP".enum("on button 0 up when this event has a handler, uiGetState() will return UI_ACTIVE as long as button 0 is down.", "0x0800"),
        "BUTTON0_HOT_UP".enum(
            """
            on button 0 up while item is hovered when this event has a handler, uiGetState() will return UI_ACTIVE when the cursor is hovering the items
            rectangle; this is the behavior expected for buttons.
            """,
            "0x1000"
        ),
        "BUTTON0_CAPTURE".enum(
            """
            item is being captured (button 0 constantly pressed); when this event has a handler, uiGetState() will return UI_ACTIVE as long as button 0 is
            down.
            """,
            "0x2000"
        ),
        "BUTTON2_DOWN".enum("on button 2 down (right mouse button, usually triggers context menu)", "0x4000"),
        "SCROLL".enum("item has received a scrollwheel event the accumulated wheel offset can be queried with uiGetScroll()", "0x8000"),
        "KEY_DOWN".enum("item is focused and has received a key-down event the respective key can be queried using uiGetKey() and uiGetModifier()", "0x10000"),
        "KEY_UP".enum("item is focused and has received a key-up event the respective key can be queried using uiGetKey() and uiGetModifier()", "0x20000"),
        "CHAR".enum("item is focused and has received a character event the respective character can be queried using uiGetKey()", "0x40000")
    )

    UIcontext.p(
        "CreateContext",
        """
        create a new UI context; call uiMakeCurrent() to make this context the current context. The context is managed by the client and must be released using
        uiDestroyContext() item_capacity is the maximum of number of items that can be declared. buffer_capacity is the maximum total size of bytes that can be
        allocated using uiAllocHandle(); you may pass 0 if you don't need to allocate handles. 4096 and (1 &lt; &lt;20) are good starting values.
        """,

        unsigned_int("item_capacity", ""),
        unsigned_int("buffer_capacity", "")
    )

    void(
        "MakeCurrent",
        "select an UI context as the current context; a context must always be selected before using any of the other UI functions",

        UIcontext.p("ctx", "")
    )

    void(
        "DestroyContext",
        "release the memory of an UI context created with uiCreateContext(); if the context is the current context, the current context will be set to NULL",

        UIcontext.p("ctx", "")
    )

    UIcontext.p(
        "GetContext",
        "returns the currently selected context or NULL",

        void()
    )

    void(
        "SetCursor",
        "sets the current cursor position (usually belonging to a mouse) to the screen coordinates at (x,y)",

        int("x", ""),
        int("y", "")
    )

    UIvec2(
        "GetCursor",
        "returns the current cursor position in screen coordinates as set by uiSetCursor()",

        void()
    )

    UIvec2(
        "GetCursorDelta",
        "returns the offset of the cursor relative to the last call to uiProcess()",

        void()
    )

    UIvec2(
        "GetCursorStart",
        "returns the beginning point of a drag operation.",

        void()
    )

    UIvec2(
        "GetCursorStartDelta",
        "returns the offset of the cursor relative to the beginning point of a drag operation.",

        void()
    )

    void(
        "SetButton",
        """
        sets a mouse or gamepad button as pressed/released button is in the range 0..63 and maps to an application defined input source. mod is an application
        defined set of flags for modifier keys enabled is 1 for pressed, 0 for released
        """,

        unsigned_int("button", ""),
        unsigned_int("mod", ""),
        intb("enabled", "")
    )

    int(
        "GetButton",
        """
        returns the current state of an application dependent input button as set by uiSetButton(). the function returns 1 if the button has been set to
        pressed, 0 for released.
        """,

        unsigned_int("button", "")
    )

    int(
        "GetClicks",
        "returns the number of chained clicks; 1 is a single click, 2 is a double click, etc.",

        void()
    )

    void(
        "SetKey",
        """
        sets a key as down/up; the key can be any application defined keycode mod is an application defined set of flags for modifier keys enabled is 1 for key
        down, 0 for key up all key events are being buffered until the next call to uiProcess()
        """,

        unsigned_int("key", ""),
        unsigned_int("mod", ""),
        intb("enabled", "")
    )

    void(
        "SetChar",
        """
        sends a single character for text input; the character is usually in the unicode range, but can be application defined. all char events are being
        buffered until the next call to uiProcess()
        """,

        unsigned_int("value", "")
    )

    void(
        "SetScroll",
        "accumulates scroll wheel offsets for the current frame all offsets are being accumulated until the next call to uiProcess()",

        int("x", ""),
        int("y", "")
    )

    UIvec2(
        "GetScroll",
        "returns the currently accumulated scroll wheel offsets for this frame",

        void()
    )

    void(
        "BeginLayout",
        """
        clear the item buffer; uiBeginLayout() should be called before the first UI declaration for this frame to avoid concatenation of the same UI multiple
        times. After the call, all previously declared item IDs are invalid, and all application dependent context data has been freed. uiBeginLayout() must be
        followed by uiEndLayout().
        """,

        void()
    )

    void(
        "EndLayout",
        """
        layout all added items starting from the root item 0. after calling uiEndLayout(), no further modifications to the item tree should be done until the
        next call to uiBeginLayout(). It is safe to immediately draw the items after a call to uiEndLayout(). this is an O(N) operation for N = number of
        declared items.
        """,

        void()
    )

    void(
        "UpdateHotItem",
        "update the current hot item; this only needs to be called if items are kept for more than one frame and uiEndLayout() is not called",

        void()
    )

    void(
        "Process",
        """
        update the internal state according to the current cursor position and button states, and call all registered handlers. timestamp is the time in
        milliseconds relative to the last call to uiProcess() and is used to estimate the threshold for double-clicks after calling uiProcess(), no further
        modifications to the item tree should be done until the next call to uiBeginLayout(). Items should be drawn before a call to uiProcess() this is an
        O(N) operation for N = number of declared items.
        """,

        int("timestamp", "")
    )

    void(
        "ClearState",
        """
        reset the currently stored hot/active etc. handles; this should be called when a re-declaration of the UI changes the item indices, to avoid state
        related glitches because item identities have changed.
        """,

        void()
    )

    int(
        "Item",
        "create a new UI item and return the new items ID.",

        void()
    )

    void(
        "SetFrozen",
        """
        set an items state to frozen; the UI will not recurse into frozen items when searching for hot or active items; subsequently, frozen items and their
        child items will not cause mouse event notifications. The frozen state is not applied recursively; uiGetState() will report UI_COLD for child items.
        Upon encountering a frozen item, the drawing routine needs to handle rendering of child items appropriately. see example.cpp for a demonstration.
        """,

        int("item", ""),
        intb("enable", "")
    )

    void(
        "SetHandle",
        "set the application-dependent handle of an item. handle is an application defined 64-bit handle. If handle is NULL, the item will not be interactive.",

        int("item", ""),
        nullable..opaque_p("handle", "")
    )

    void.p(
        "AllocHandle",
        """
        allocate space for application-dependent context data and assign it as the handle to the item. The memory of the pointer is managed by the UI context
        and released upon the next call to uiBeginLayout()
        """,

        int("item", ""),
        AutoSizeResult..unsigned_int("size", "")
    )

    void(
        "SetHandler",
        "set the global handler callback for interactive items. the handler will be called for each item whose event flags are set using uiSetEvents.",

        UIhandler("handler", "")
    )

    void(
        "SetEvents",
        "flags is a combination of UI_EVENT_* and designates for which events the handler should be called.",

        int("item", ""),
        unsigned_int("flags", "")
    )

    void(
        "SetFlags",
        "flags is a user-defined set of flags defined by UI_USERMASK.",

        int("item", ""),
        unsigned_int("flags", "")
    )

    int(
        "Insert",
        """
        assign an item to a container. an item ID of 0 refers to the root item. the function returns the child item ID if the container has already added
        items, the function searches for the last item and calls uiAppend() on it, which is an O(N) operation for N siblings. it is usually more efficient to
        call uiInsert() for the first child, then chain additional siblings using uiAppend().
        """,

        int("item", ""),
        int("child", "")
    )

    int(
        "Append",
        "assign an item to the same container as another item sibling is inserted after item.",

        int("item", ""),
        int("sibling", "")
    )

    int(
        "InsertBack",
        """
        insert child into container item like uiInsert(), but prepend it to the first child item, effectively putting it in the background. it is efficient to
        call uiInsertBack() repeatedly in cases where drawing or layout order doesn't matter.
        """,

        int("item", ""),
        int("child", "")
    )

    int(
        "InsertFront",
        "same as uiInsert()",

        int("item", ""),
        int("child", "")
    )

    void(
        "SetSize",
        "set the size of the item; a size of 0 indicates the dimension to be dynamic; if the size is set, the item can not expand beyond that size.",

        int("item", ""),
        int("w", ""),
        int("h", "")
    )

    void(
        "SetLayout",
        "set the anchoring behavior of the item to one or multiple UIlayoutFlags",

        int("item", ""),
        unsigned_int("flags", "")
    )

    void(
        "SetBox",
        "set the box model behavior of the item to one or multiple UIboxFlags",

        int("item", ""),
        unsigned_int("flags", "")
    )

    void(
        "SetMargins",
        """
        set the left, top, right and bottom margins of an item; when the item is anchored to the parent or another item, the margin controls the distance from
        the neighboring element.
        """,

        int("item", ""),
        MapToInt..short("l", ""),
        MapToInt..short("t", ""),
        MapToInt..short("r", ""),
        MapToInt..short("b", "")
    )

    void(
        "Focus",
        "set item as recipient of all keyboard events; if item is -1, no item will be focused.",

        int("item", "")
    )

    int(
        "FirstChild",
        """
        returns the first child item of a container item. If the item is not a container or does not contain any items, -1 is returned. if item is 0, the first
        child item of the root item will be returned.
        """,

        int("item", "")
    )

    int(
        "NextSibling",
        "returns an items next sibling in the list of the parent containers children. if item is 0 or the item is the last child item, -1 will be returned.",

        int("item", "")
    )

    int(
        "GetItemCount",
        "return the total number of allocated items",

        void()
    )

    unsigned_int(
        "GetAllocSize",
        "return the total bytes that have been allocated by uiAllocHandle()",

        void()
    )

    UIitemState(
        "GetState",
        """
        return the current state of the item. This state is only valid after a call to uiProcess(). The returned value is one of UI_COLD, UI_HOT, UI_ACTIVE,
        UI_FROZEN.
        """,

        int("item", "")
    )

    opaque_p(
        "GetHandle",
        "return the application-dependent handle of the item as passed to uiSetHandle() or uiAllocHandle().",

        int("item", "")
    )

    int(
        "GetHotItem",
        "return the item that is currently under the cursor or -1 for none",

        void()
    )

    int(
        "GetFocusedItem",
        "return the item that is currently focused or -1 for none",

        void()
    )

    int(
        "FindItem",
        """
        returns the topmost item containing absolute location (x,y), starting with item as parent, using a set of flags and masks as filter: if both flags and
        mask are UI_ANY, the first topmost item is returned. if mask is UI_ANY, the first topmost item matching *any* of flags is returned. otherwise the first
        item matching (item.flags & flags) == mask is returned. you may combine box, layout, event and user flags. frozen items will always be ignored.
        """,

        int("item", ""),
        int("x", ""),
        int("y", ""),
        unsigned_int("flags", ""),
        unsigned_int("mask", "")
    )

    UIhandler(
        "GetHandler",
        "return the handler callback as passed to uiSetHandler()",

        void()
    )

    unsigned_int(
        "GetEvents",
        "return the event flags for an item as passed to uiSetEvents()",

        int("item", "")
    )

    unsigned_int(
        "GetFlags",
        "return the user-defined flags for an item as passed to uiSetFlags()",

        int("item", "")
    )

    unsigned_int(
        "GetKey",
        "when handling a KEY_DOWN/KEY_UP event: the key that triggered this event",

        void()
    )

    unsigned_int(
        "GetModifier",
        "when handling a keyboard or mouse event: the active modifier keys",

        void()
    )

    UIrect(
        "GetRect",
        """
        returns the items layout rectangle in absolute coordinates. If uiGetRect() is called before uiEndLayout(), the values of the returned rectangle are
        undefined.
        """,

        int("item", "")
    )

    int(
        "Contains",
        "returns 1 if an items absolute rectangle contains a given coordinate otherwise 0",

        int("item", ""),
        int("x", ""),
        int("y", "")
    )

    int(
        "GetWidth",
        "return the width of the item as set by uiSetSize()",

        int("item", "")
    )

    int(
        "GetHeight",
        "return the height of the item as set by uiSetSize()",

        int("item", "")
    )

    unsigned_int(
        "GetLayout",
        "return the anchoring behavior as set by uiSetLayout()",

        int("item", "")
    )

    unsigned_int(
        "GetBox",
        "return the box model as set by uiSetBox()",

        int("item", "")
    )

    short(
        "GetMarginLeft",
        "return the left margin of the item as set with uiSetMargins()",

        int("item", "")
    )

    short(
        "GetMarginTop",
        "return the top margin of the item as set with uiSetMargins()",

        int("item", "")
    )

    short(
        "GetMarginRight",
        "return the right margin of the item as set with uiSetMargins()",

        int("item", "")
    )

    short(
        "GetMarginDown",
        "return the bottom margin of the item as set with uiSetMargins()",

        int("item", "")
    )

    int(
        "RecoverItem",
        """
        when uiBeginLayout() is called, the most recently declared items are retained. when uiEndLayout() completes, it matches the old item hierarchy to the
        new one and attempts to map old items to new items as well as possible. when passed an item Id from the previous frame, uiRecoverItem() returns the
        items new assumed Id, or -1 if the item could not be mapped. it is valid to pass -1 as item.
        """,

        int("olditem", "")
    )

    void(
        "RemapItem",
        """
        in cases where it is important to recover old state over changes in the view, and the built-in remapping fails, the UI declaration can manually remap
        old items to new IDs in cases where e.g. the previous item ID has been temporarily saved; uiRemapItem() would then be called after creating the new
        item using uiItem().
        """,

        int("olditem", ""),
        int("newitem", "")
    )

    int(
        "GetLastItemCount",
        "returns the number if items that have been allocated in the last frame",

        void()
    )
}
