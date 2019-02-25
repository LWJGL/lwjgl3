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
#include "lwjgl_malloc.h"
#define OUI_IMPLEMENTATION
#include "oui.h"""")

    documentation =
        """
        """

    EnumConstant(
        "",

        "USERMASK".enum(
            """
            these bits, starting at bit 24, can be safely assigned by the application, e.g. as item types, other event types, drop targets, etc.

            They can be set and queried using #SetFlags() and #GetFlags().
            """,
            0xff000000.i
        ),
        "ANY".enum("a special mask passed to #FindItem()", 0xffffffff.i)
    )

    EnumConstant(
        "Item states as returned by #GetState(). ({@code UIitemState})",

        "COLD".enum("the item is inactive", "0"),
        "HOT".enum("the item is inactive, but the cursor is hovering over this item"),
        "ACTIVE".enum("the item is toggled, activated, focused (depends on item kind)"),
        "FROZEN".enum("the item is unresponsive")
    )

    val UIboxFlags = EnumConstant(
        "Container flags to pass to #SetBox(). ({@code UIboxFlags})",

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
    ).javaDocLinks

    val UIlayoutFlags = EnumConstant(
        "Child layout flags to pass to #SetLayout(). ({@code UIlayoutFlags})",

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
            when wrapping, put this element on a new line.

            Wrapping layout code auto-inserts {@code UI_BREAK} flags, drawing routines can read them with #GetLayout().
            """,
            "0x200"
        )
    ).javaDocLinks

    val UIevent = EnumConstant(
        "Event flags. ({@code UIevent})",

        "BUTTON0_DOWN".enum("on button 0 down", "0x0400"),
        "BUTTON0_UP".enum("on button 0 up when this event has a handler, #GetState() will return #ACTIVE as long as button 0 is down", "0x0800"),
        "BUTTON0_HOT_UP".enum(
            """
            on button 0 up while item is hovered when this event has a handler, #GetState() will return #ACTIVE when the cursor is hovering the items
            rectangle; this is the behavior expected for buttons
            """,
            "0x1000"
        ),
        "BUTTON0_CAPTURE".enum(
            "item is being captured (button 0 constantly pressed); when this event has a handler, #GetState() will return #ACTIVE as long as button 0 is down",
            "0x2000"
        ),
        "BUTTON2_DOWN".enum("on button 2 down (right mouse button, usually triggers context menu)", "0x4000"),
        "SCROLL".enum("item has received a scrollwheel event the accumulated wheel offset can be queried with #GetScroll()", "0x8000"),
        "KEY_DOWN".enum("item is focused and has received a key-down event the respective key can be queried using #GetKey() and #GetModifier()", "0x10000"),
        "KEY_UP".enum("item is focused and has received a key-up event the respective key can be queried using #GetKey() and #GetModifier()", "0x20000"),
        "CHAR".enum("item is focused and has received a character event the respective character can be queried using #GetKey()", "0x40000")
    ).javaDocLinks

    UIcontext.p(
        "CreateContext",
        """
        Creates a new UI context; call #MakeCurrent() to make this context the current context.

        The context is managed by the client and must be released using #DestroyContext().
        """,

        unsigned_int("item_capacity", "the maximum number of items that can be declared. 4096 is a good starting value."),
        unsigned_int(
            "buffer_capacity",
            """
            the maximum total size of bytes that can be allocated using #AllocHandle(); you may pass 0 if you don't need to allocate handles. {@code (1<<20)}
            is a good starting value.
            """
        )
    )

    void(
        "MakeCurrent",
        "Selects an UI context as the current context; a context must always be selected before using any of the other UI functions.",

        nullable..UIcontext.p("ctx", "")
    )

    void(
        "DestroyContext",
        "Releases the memory of an UI context created with #CreateContext(); if the context is the current context, the current context will be set to #NULL.",

        UIcontext.p("ctx", "")
    )

    UIcontext.p(
        "GetContext",
        "Returns the currently selected context or #NULL.",

        void()
    )

    void(
        "SetCursor",
        "Sets the current cursor position (usually belonging to a mouse) to the screen coordinates at {@code (x,y)}.",

        int("x", ""),
        int("y", "")
    )

    UIvec2(
        "GetCursor",
        "Returns the current cursor position in screen coordinates as set by #SetCursor().",

        void()
    )

    UIvec2(
        "GetCursorDelta",
        "Returns the offset of the cursor relative to the last call to #Process().",

        void()
    )

    UIvec2(
        "GetCursorStart",
        "Returns the beginning point of a drag operation.",

        void()
    )

    UIvec2(
        "GetCursorStartDelta",
        "Returns the offset of the cursor relative to the beginning point of a drag operation.",

        void()
    )

    void(
        "SetButton",
        "Sets a mouse or gamepad button as pressed/released button is in the range {@code 0..63} and maps to an application defined input source.",

        unsigned_int("button", ""),
        unsigned_int("mod", "an application defined set of flags for modifier keys"),
        intb("enabled", "is 1 for pressed, 0 for released")
    )

    intb(
        "GetButton",
        "Returns the current state of an application dependent input button as set by #SetButton().",

        unsigned_int("button", ""),

        returnDoc = "1 if the button has been set to pressed, 0 for released"
    )

    int(
        "GetClicks",
        "Returns the number of chained clicks; 1 is a single click, 2 is a double click, etc.",

        void()
    )

    void(
        "SetKey",
        """
        Sets a key as down/up; the key can be any application defined {@code keycode}.

        All key events are being buffered until the next call to #Process().
        """,

        unsigned_int("key", ""),
        unsigned_int("mod", "an application defined set of flags for modifier keys"),
        intb("enabled", "1 for key down, 0 for key up")
    )

    void(
        "SetChar",
        """
        Sends a single character for text input; the character is usually in the unicode range, but can be application defined.

        All char events are being buffered until the next call to #Process().
        """,

        unsigned_int("value", "")
    )

    void(
        "SetScroll",
        """
        Accumulates scroll wheel offsets for the current frame.

        All offsets are being accumulated until the next call to #Process().
        """,

        int("x", ""),
        int("y", "")
    )

    UIvec2(
        "GetScroll",
        "Returns the currently accumulated scroll wheel offsets for this frame",

        void()
    )

    void(
        "BeginLayout",
        """
        Clears the item buffer.

        {@code uiBeginLayout()} should be called before the first UI declaration for this frame to avoid concatenation of the same UI multiple times. After the
        call, all previously declared item IDs are invalid, and all application dependent context data has been freed.

        {@code uiBeginLayout()} must be followed by #EndLayout().
        """,

        void()
    )

    void(
        "EndLayout",
        """
        Layout all added items starting from the root item 0.

        After calling {@code uiEndLayout()}, no further modifications to the item tree should be done until the next call to #BeginLayout(). It is safe to
        immediately draw the items after a call to {@code uiEndLayout()}.

        This is an {@code O(N)} operation for {@code N = number of declared items}.
        """,

        void()
    )

    void(
        "UpdateHotItem",
        "Updates the current hot item; this only needs to be called if items are kept for more than one frame and #EndLayout() is not called.",

        void()
    )

    void(
        "Process",
        """
        Updates the internal state according to the current cursor position and button states, and call all registered handlers.

        No further modifications to the item tree should be done until the next call to #BeginLayout(). Items should be drawn before a call to
        {@code uiProcess()}.

        This is an {@code O(N)} operation for {@code N = number of declared items}.
        """,

        int(
            "timestamp",
            """
            the time in milliseconds relative to the last call to {@code uiProcess()} and is used to estimate the threshold for double-clicks after calling
            {@code uiProcess()}.
            """
        )
    )

    void(
        "ClearState",
        """
        Resets the currently stored hot/active etc. handles.

        This should be called when a re-declaration of the UI changes the item indices, to avoid state related glitches because item identities have changed.
        """,

        void()
    )

    int(
        "Item",
        "Creates a new UI item and return the new item's ID.",

        void()
    )

    void(
        "SetFrozen",
        """
        Sets an items state to frozen.

        The UI will not recurse into frozen items when searching for hot or active items; subsequently, frozen items and their child items will not cause mouse
        event notifications. The frozen state is not applied recursively; #GetState() will report #COLD for child items. Upon encountering a frozen item, the
        drawing routine needs to handle rendering of child items appropriately.
        """,

        int("item", ""),
        intb("enable", "")
    )

    void(
        "SetHandle",
        "Sets the application-dependent handle of an item.",

        int("item", ""),
        nullable..opaque_p("handle", "an application defined 64-bit handle. If #NULL, the item will not be interactive.")
    )

    void.p(
        "AllocHandle",
        """
        Allocates space for application-dependent context data and assign it as the handle to the item.

        The memory of the pointer is managed by the UI context and released upon the next call to #BeginLayout().
        """,

        int("item", ""),
        AutoSizeResult..unsigned_int("size", "")
    )

    void(
        "SetHandler",
        """
        Sets the global handler callback for interactive items.

        The handler will be called for each item whose event flags are set using #SetEvents().
        """,

        UIhandler("handler", "")
    )

    void(
        "SetEvents",
        "",

        int("item", ""),
        unsigned_int("flags", "designates for which events the handler should be called", UIevent, LinkMode.BITFIELD)
    )

    void(
        "SetFlags",
        "",

        int("item", ""),
        unsigned_int("flags", "a user-defined set of flags defined by #USERMASK")
    )

    int(
        "Insert",
        """
        Assigns an item to a container.

        An item ID of 0 refers to the root item. The function searches for the last item and calls #Append() on it, which is an {@code O(N)} operation for
        {@code N} siblings. It is usually more efficient to call {@code uiInser}t() for the first child, then chain additional siblings using
        {@code uiAppend()}.
        """,

        int("item", ""),
        int("child", ""),

        returnDoc = "the child item ID if the container has already added items"
    )

    int(
        "Append",
        "Assigns an item to the same container as another item.",

        int("item", ""),
        int("sibling", "inserted after {@code item}")
    )

    int(
        "InsertBack",
        """
        Inserts child into container item like #Insert(), but prepend it to the first child item, effectively putting it in the background.

        It is efficient to call {@code uiInsertBack()} repeatedly in cases where drawing or layout order doesn't matter.
        """,

        int("item", ""),
        int("child", "")
    )

    int(
        "InsertFront",
        "Same as #Insert().",

        int("item", ""),
        int("child", "")
    )

    void(
        "SetSize",
        """
        Sets the size of the item.

        A size of 0 indicates the dimension to be dynamic; if the size is set, the item can not expand beyond that size.
        """,

        int("item", ""),
        int("w", ""),
        int("h", "")
    )

    void(
        "SetLayout",
        "Sets the anchoring behavior of the item to one or multiple {@code UIlayoutFlags}.",

        int("item", ""),
        unsigned_int("flags", "", UIlayoutFlags, LinkMode.BITFIELD)
    )

    void(
        "SetBox",
        "Sets the box model behavior of the item to one or multiple {@code UIboxFlags}.",

        int("item", ""),
        unsigned_int("flags", "", UIboxFlags, LinkMode.BITFIELD)
    )

    void(
        "SetMargins",
        """
        Sets the left, top, right and bottom margins of an item.

        When the item is anchored to the parent or another item, the margin controls the distance from the neighboring element.
        """,

        int("item", ""),
        MapToInt..short("l", ""),
        MapToInt..short("t", ""),
        MapToInt..short("r", ""),
        MapToInt..short("b", "")
    )

    void(
        "Focus",
        "Sets item as recipient of all keyboard events.",

        int("item", "if -1, no item will be focused")
    )

    int(
        "FirstChild",
        """
        Returns the first child item of a container item.

        If the item is not a container or does not contain any items, -1 is returned.
        """,

        int("item", "if 0, the first child item of the root item will be returned")
    )

    int(
        "NextSibling",
        """
        Returns an items next sibling in the list of the parent containers children.

        If {@code item} is 0 or the item is the last child item, -1 will be returned.
        """,

        int("item", "")
    )

    int(
        "GetItemCount",
        "Returns the total number of allocated items",

        void()
    )

    unsigned_int(
        "GetAllocSize",
        "Returns the total bytes that have been allocated by #AllocHandle()",

        void()
    )

    UIitemState(
        "GetState",
        """
        Returns the current state of the item.

        This state is only valid after a call to #Process(). The returned value is one of #COLD, #HOT, #ACTIVE, #FROZEN.
        """,

        int("item", "")
    )

    opaque_p(
        "GetHandle",
        "Returns the application-dependent handle of the item as passed to #SetHandle() or #AllocHandle().",

        int("item", "")
    )

    int(
        "GetHotItem",
        "Returns the item that is currently under the cursor or -1 for none.",

        void()
    )

    int(
        "GetFocusedItem",
        "Returns the item that is currently focused or -1 for none.",

        void()
    )

    int(
        "FindItem",
        """
        Returns the topmost item containing absolute location {@code (x,y)}, starting with {@code item} as parent, using a set of flags and masks as filter.

        If both {@code flags} and {@code mask} are #ANY, the first topmost item is returned. If {@code mask} is #ANY, the first topmost item matching
        <em>any</em> of flags is returned. otherwise the first item matching {@code (item.flags & flags) == mask} is returned. You may combine box, layout,
        event and user flags. Frozen items will always be ignored.
        """,

        int("item", ""),
        int("x", ""),
        int("y", ""),
        unsigned_int("flags", ""),
        unsigned_int("mask", "")
    )

    UIhandler(
        "GetHandler",
        "Returns the handler callback as passed to #SetHandler()",

        void()
    )

    unsigned_int(
        "GetEvents",
        "Returns the event flags for an item as passed to #SetEvents()",

        int("item", "")
    )

    unsigned_int(
        "GetFlags",
        "Returns the user-defined flags for an item as passed to #SetFlags()",

        int("item", "")
    )

    unsigned_int(
        "GetKey",
        "When handling a {@code KEY_DOWN/KEY_UP} event: the key that triggered this event.",

        void()
    )

    unsigned_int(
        "GetModifier",
        "When handling a keyboard or mouse event: the active modifier keys.",

        void()
    )

    UIrect(
        "GetRect",
        """
        Returns the items layout rectangle in absolute coordinates.

        If {@code uiGetRect()} is called before #EndLayout(), the values of the returned rectangle are undefined.
        """,

        int("item", "")
    )

    intb(
        "Contains",
        "Returns 1 if an items absolute rectangle contains a given coordinate, otherwise 0.",

        int("item", ""),
        int("x", ""),
        int("y", "")
    )

    int(
        "GetWidth",
        "Returns the width of the item as set by #SetSize().",

        int("item", "")
    )

    int(
        "GetHeight",
        "Return the height of the item as set by #SetSize().",

        int("item", "")
    )

    unsigned_int(
        "GetLayout",
        "Returns the anchoring behavior as set by #SetLayout().",

        int("item", "")
    )

    unsigned_int(
        "GetBox",
        "Returns the box model as set by #SetBox().",

        int("item", "")
    )

    short(
        "GetMarginLeft",
        "Returns the left margin of the item as set with #SetMargins().",

        int("item", "")
    )

    short(
        "GetMarginTop",
        "Returns the top margin of the item as set with #SetMargins().",

        int("item", "")
    )

    short(
        "GetMarginRight",
        "Returns the right margin of the item as set with #SetMargins().",

        int("item", "")
    )

    short(
        "GetMarginDown",
        "Returns the bottom margin of the item as set with #SetMargins().",

        int("item", "")
    )

    int(
        "RecoverItem",
        """
        When #BeginLayout() is called, the most recently declared items are retained. When #EndLayout() completes, it matches the old item hierarchy to the new
        one and attempts to map old items to new items as well as possible. When passed an item Id from the previous frame, {@code uiRecoverItem()} returns the
        item's new assumed Id, or -1 if the item could not be mapped. It is valid to pass -1 as item.
        """,

        int("olditem", "")
    )

    void(
        "RemapItem",
        """
        In cases where it is important to recover old state over changes in the view, and the built-in remapping fails, the UI declaration can manually remap
        old items to new IDs in cases where e.g. the previous item ID has been temporarily saved; {@code uiRemapItem()} would then be called after creating the
        new item using #Item().
        """,

        int("olditem", ""),
        int("newitem", "")
    )

    int(
        "GetLastItemCount",
        "Returns the number if items that have been allocated in the last frame.",

        void()
    )
}
