/*
OUI - A minimal semi-immediate GUI handling & layouting library

Copyright (c) 2014 Leonard Ritter <leonard.ritter@duangle.com>

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 */

#ifndef _OUI_H_
#define _OUI_H_

#ifdef __cplusplus
extern "C" {
#endif

/*
Revision 4 (2014-12-17)

OUI (short for "Open UI", spoken like the french "oui" for "yes") is a
platform agnostic single-header C library for layouting GUI elements and
handling related user input. Together with a set of widget drawing and logic 
routines it can be used to build complex user interfaces.

OUI is a semi-immediate GUI. Widget declarations are persistent for the duration
of the setup and evaluation, but do not need to be kept around longer than one
frame.

OUI has no widget types; instead, it provides only one kind of element, "Items",
which can be tailored to the application by the user and expanded with custom
buffers and event handlers to behave as containers, buttons, sliders, radio
buttons, and so on.

OUI also does not draw anything; Instead it provides a set of functions to
iterate and query the layouted items in order to allow client code to render
each widget with its current state using a preferred graphics library.

See example.cpp in the repository for a full usage example.

A basic setup for OUI usage in C looks like this:
=================================================

// a header for each widget
typedef struct Data {
    int type;
    UIhandler handler;
} Data;

/// global event dispatch
void ui_handler(int item, UIevent event) {
    Data *data = (Data *)uiGetHandle(item);
    if (data && data->handler) {
        data->handler(item, event);
    }
}

void app_main(...) {
    UIcontext *context = uiCreateContext(4096, 1<<20);
    uiMakeCurrent(context);
    uiSetHandler(ui_handler);

    while (app_running()) {
        // update position of mouse cursor; the ui can also be updated
        // from received events.
        uiSetCursor(app_get_mouse_x(), app_get_mouse_y());

        // update button state
        for (int i = 0; i < 3; ++i)
            uiSetButton(i, app_get_button_state(i));

        // you can also send keys and scroll events; see example.cpp for more

        // --------------
        // this section does not have to be regenerated on frame; a good
        // policy is to invalidate it on events, as this usually alters
        // structure and layout.

        // begin new UI declarations
        uiBeginLayout();

        // - UI setup code goes here -
        app_setup_ui();

        // layout UI
        uiEndLayout();

        // --------------

        // draw UI, starting with the first item, index 0
        app_draw_ui(render_context,0);

        // update states and fire handlers
        uiProcess(get_time_ms());
    }

    uiDestroyContext(context);
}

Here's an example setup for a checkbox control:
===============================================

typedef struct CheckBoxData {
    Data head;
    const char *label;
    bool *checked;
} CheckBoxData;

// called when the item is clicked (see checkbox())
void app_checkbox_handler(int item, UIevent event) {
    // retrieve custom data (see checkbox())
    CheckBoxData *data = (CheckBoxData *)uiGetHandle(item);

    switch(event) {
    default: break;
    case UI_BUTTON0_DOWN: {
        // toggle value
        *data->checked = !(*data->checked);
    } break;
    }
}

// creates a checkbox control for a pointer to a boolean
int checkbox(const char *label, bool *checked) {

    // create new ui item
    int item = uiItem(); 

    // set minimum size of wiget; horizontal size is dynamic, vertical is fixed
    uiSetSize(item, 0, APP_WIDGET_HEIGHT);

    // store some custom data with the checkbox that we use for rendering
    // and value changes.
    CheckBoxData *data = (CheckBoxData *)uiAllocHandle(item, sizeof(CheckBoxData));

    // assign a custom typeid to the data so the renderer knows how to
    // render this control, and our event handler
    data->head.type = APP_WIDGET_CHECKBOX;
    data->head.handler = app_checkbox_handler;
    data->label = label;
    data->checked = checked;

    // set to fire as soon as the left button is
    // pressed; UI_BUTTON0_HOT_UP is also a popular alternative.
    uiSetEvents(item, UI_BUTTON0_DOWN);

    return item;
}

A simple recursive drawing routine can look like this:
======================================================

void app_draw_ui(AppRenderContext *ctx, int item) {
    // retrieve custom data and cast it to Data; we assume the first member
    // of every widget data item to be a Data field.
    Data *head = (Data *)uiGetHandle(item);

    // if a handle is set, this is a specialized widget
    if (head) {
        // get the widgets absolute rectangle
        UIrect rect = uiGetRect(item);

        switch(head->type) {
            default: break;
            case APP_WIDGET_LABEL: {
                // ...
            } break;
            case APP_WIDGET_BUTTON: {
                // ...
            } break;
            case APP_WIDGET_CHECKBOX: {
                // cast to the full data type
                CheckBoxData *data = (CheckBoxData*)head;

                // get the widgets current state
                int state = uiGetState(item);

                // if the value is set, the state is always active
                if (*data->checked)
                    state = UI_ACTIVE;

                // draw the checkbox
                app_draw_checkbox(ctx, rect, state, data->label);
            } break;
        }
    }

    // iterate through all children and draw
    int kid = uiFirstChild(item);
    while (kid != -1) {
        app_draw_ui(ctx, kid);
        kid = uiNextSibling(kid);
    }
}

Layouting items works like this:
================================

void layout_window(int w, int h) {
    // create root item; the first item always has index 0
    int parent = uiItem();
    // assign fixed size
    uiSetSize(parent, w, h);

    // create column box and use as new parent
    parent = uiInsert(parent, uiItem());
    // configure as column
    uiSetBox(parent, UI_COLUMN);
    // span horizontally, attach to top
    uiSetLayout(parent, UI_HFILL | UI_TOP);

    // add a label - we're assuming custom control functions to exist
    int item = uiInsert(parent, label("Hello World"));
    // set a fixed height for the label
    uiSetSize(item, 0, APP_WIDGET_HEIGHT);
    // span the label horizontally
    uiSetLayout(item, UI_HFILL);

    static bool checked = false;

    // add a checkbox to the same parent as item; this is faster than
    // calling uiInsert on the same parent repeatedly.
    item = uiAppend(item, checkbox("Checked:", &checked));
    // set a fixed height for the checkbox
    uiSetSize(item, 0, APP_WIDGET_HEIGHT);
    // span the checkbox in the same way as the label
    uiSetLayout(item, UI_HFILL);
}



 */

// you can override this from the outside to pick
// the export level you need
#ifndef OUI_EXPORT
#define OUI_EXPORT
#endif

// some language bindings (e.g. terra) have no good support
// for unions or unnamed structs; 
// #define OUI_USE_UNION_VECTORS 0 to disable.
#ifndef OUI_USE_UNION_VECTORS
#define OUI_USE_UNION_VECTORS 1
#endif

// limits

enum {
    // maximum size in bytes of a single data buffer passed to uiAllocData().
    UI_MAX_DATASIZE = 4096,
    // maximum depth of nested containers
    UI_MAX_DEPTH = 64,
    // maximum number of buffered input events
    UI_MAX_INPUT_EVENTS = 64,
    // consecutive click threshold in ms
    UI_CLICK_THRESHOLD = 250,
};

typedef unsigned int UIuint;

// opaque UI context
typedef struct UIcontext UIcontext;

// item states as returned by uiGetState()

typedef enum UIitemState {
    // the item is inactive
    UI_COLD = 0,
    // the item is inactive, but the cursor is hovering over this item
    UI_HOT = 1,
    // the item is toggled, activated, focused (depends on item kind)
    UI_ACTIVE = 2,
    // the item is unresponsive
    UI_FROZEN = 3,
} UIitemState;

// container flags to pass to uiSetBox()
typedef enum UIboxFlags {
    // flex-direction (bit 0+1)

    // left to right
    UI_ROW = 0x002,
    // top to bottom
    UI_COLUMN = 0x003,

    // model (bit 1)

    // free layout
    UI_LAYOUT = 0x000,
    // flex model
    UI_FLEX = 0x002,

    // flex-wrap (bit 2)

    // single-line
    UI_NOWRAP = 0x000,
    // multi-line, wrap left to right
    UI_WRAP = 0x004,


    // justify-content (start, end, center, space-between)
    // at start of row/column
    UI_START = 0x008,
    // at center of row/column
    UI_MIDDLE = 0x000,
    // at end of row/column
    UI_END = 0x010,
    // insert spacing to stretch across whole row/column
    UI_JUSTIFY = 0x018,

    // align-items
    // can be implemented by putting a flex container in a layout container,
    // then using UI_TOP, UI_DOWN, UI_VFILL, UI_VCENTER, etc.
    // FILL is equivalent to stretch/grow

    // align-content (start, end, center, stretch)
    // can be implemented by putting a flex container in a layout container,
    // then using UI_TOP, UI_DOWN, UI_VFILL, UI_VCENTER, etc.
    // FILL is equivalent to stretch; space-between is not supported.
} UIboxFlags;

// child layout flags to pass to uiSetLayout()
typedef enum UIlayoutFlags {
    // attachments (bit 5-8)
    // fully valid when parent uses UI_LAYOUT model
    // partially valid when in UI_FLEX model

    // anchor to left item or left side of parent
    UI_LEFT = 0x020,
    // anchor to top item or top side of parent
    UI_TOP = 0x040,
    // anchor to right item or right side of parent
    UI_RIGHT = 0x080,
    // anchor to bottom item or bottom side of parent
    UI_DOWN = 0x100,
    // anchor to both left and right item or parent borders
    UI_HFILL = 0x0a0,
    // anchor to both top and bottom item or parent borders
    UI_VFILL = 0x140,
    // center horizontally, with left margin as offset
    UI_HCENTER = 0x000,
    // center vertically, with top margin as offset
    UI_VCENTER = 0x000,
    // center in both directions, with left/top margin as offset
    UI_CENTER = 0x000,
    // anchor to all four directions
    UI_FILL = 0x1e0,
    // when wrapping, put this element on a new line
    // wrapping layout code auto-inserts UI_BREAK flags,
    // drawing routines can read them with uiGetLayout()
    UI_BREAK = 0x200
} UIlayoutFlags;

// event flags
typedef enum UIevent {
    // on button 0 down
    UI_BUTTON0_DOWN = 0x0400,
    // on button 0 up
    // when this event has a handler, uiGetState() will return UI_ACTIVE as
    // long as button 0 is down.
    UI_BUTTON0_UP = 0x0800,
    // on button 0 up while item is hovered
    // when this event has a handler, uiGetState() will return UI_ACTIVE
    // when the cursor is hovering the items rectangle; this is the
    // behavior expected for buttons.
    UI_BUTTON0_HOT_UP = 0x1000,
    // item is being captured (button 0 constantly pressed); 
    // when this event has a handler, uiGetState() will return UI_ACTIVE as
    // long as button 0 is down.
    UI_BUTTON0_CAPTURE = 0x2000,
    // on button 2 down (right mouse button, usually triggers context menu)
    UI_BUTTON2_DOWN = 0x4000,
    // item has received a scrollwheel event
    // the accumulated wheel offset can be queried with uiGetScroll()
    UI_SCROLL = 0x8000,
    // item is focused and has received a key-down event
    // the respective key can be queried using uiGetKey() and uiGetModifier()
    UI_KEY_DOWN = 0x10000,
    // item is focused and has received a key-up event
    // the respective key can be queried using uiGetKey() and uiGetModifier()
    UI_KEY_UP = 0x20000,
    // item is focused and has received a character event
    // the respective character can be queried using uiGetKey()
    UI_CHAR = 0x40000,
} UIevent;

enum {
    // these bits, starting at bit 24, can be safely assigned by the
    // application, e.g. as item types, other event types, drop targets, etc.
    // they can be set and queried using uiSetFlags() and uiGetFlags()
    UI_USERMASK = 0xff000000,

    // a special mask passed to uiFindItem()
    UI_ANY = 0xffffffff,
};

// handler callback; event is one of UI_EVENT_*
typedef void (*UIhandler)(int item, UIevent event);

// for cursor positions, mainly
typedef struct UIvec2 {
#if OUI_USE_UNION_VECTORS || defined(OUI_IMPLEMENTATION)
    union {
        int v[2];
        struct { int x, y; };
    };
#else
    int x, y;
#endif    
} UIvec2;

// layout rectangle
typedef struct UIrect {
#if OUI_USE_UNION_VECTORS || defined(OUI_IMPLEMENTATION)    
    union {
        int v[4];
        struct { int x, y, w, h; };
    };
#else
    int x, y, w, h;
#endif
} UIrect;

// unless declared otherwise, all operations have the complexity O(1).

// Context Management
// ------------------

// create a new UI context; call uiMakeCurrent() to make this context the
// current context. The context is managed by the client and must be released
// using uiDestroyContext()
// item_capacity is the maximum of number of items that can be declared.
// buffer_capacity is the maximum total size of bytes that can be allocated
// using uiAllocHandle(); you may pass 0 if you don't need to allocate
// handles.
// 4096 and (1<<20) are good starting values.
OUI_EXPORT UIcontext *uiCreateContext(
        unsigned int item_capacity,
        unsigned int buffer_capacity);

// select an UI context as the current context; a context must always be 
// selected before using any of the other UI functions
OUI_EXPORT void uiMakeCurrent(UIcontext *ctx);

// release the memory of an UI context created with uiCreateContext(); if the
// context is the current context, the current context will be set to NULL
OUI_EXPORT void uiDestroyContext(UIcontext *ctx);

// returns the currently selected context or NULL
OUI_EXPORT UIcontext *uiGetContext();

// Input Control
// -------------

// sets the current cursor position (usually belonging to a mouse) to the
// screen coordinates at (x,y)
OUI_EXPORT void uiSetCursor(int x, int y);

// returns the current cursor position in screen coordinates as set by 
// uiSetCursor()
OUI_EXPORT UIvec2 uiGetCursor();

// returns the offset of the cursor relative to the last call to uiProcess()
OUI_EXPORT UIvec2 uiGetCursorDelta();

// returns the beginning point of a drag operation.
OUI_EXPORT UIvec2 uiGetCursorStart();

// returns the offset of the cursor relative to the beginning point of a drag
// operation.
OUI_EXPORT UIvec2 uiGetCursorStartDelta();

// sets a mouse or gamepad button as pressed/released
// button is in the range 0..63 and maps to an application defined input
// source.
// mod is an application defined set of flags for modifier keys
// enabled is 1 for pressed, 0 for released
OUI_EXPORT void uiSetButton(unsigned int button, unsigned int mod, int enabled);

// returns the current state of an application dependent input button
// as set by uiSetButton().
// the function returns 1 if the button has been set to pressed, 0 for released.
OUI_EXPORT int uiGetButton(unsigned int button);

// returns the number of chained clicks; 1 is a single click,
// 2 is a double click, etc.
OUI_EXPORT int uiGetClicks();

// sets a key as down/up; the key can be any application defined keycode
// mod is an application defined set of flags for modifier keys
// enabled is 1 for key down, 0 for key up
// all key events are being buffered until the next call to uiProcess()
OUI_EXPORT void uiSetKey(unsigned int key, unsigned int mod, int enabled);

// sends a single character for text input; the character is usually in the
// unicode range, but can be application defined.
// all char events are being buffered until the next call to uiProcess()
OUI_EXPORT void uiSetChar(unsigned int value);

// accumulates scroll wheel offsets for the current frame
// all offsets are being accumulated until the next call to uiProcess()
OUI_EXPORT void uiSetScroll(int x, int y);

// returns the currently accumulated scroll wheel offsets for this frame
OUI_EXPORT UIvec2 uiGetScroll();





// Stages
// ------

// clear the item buffer; uiBeginLayout() should be called before the first
// UI declaration for this frame to avoid concatenation of the same UI multiple 
// times.
// After the call, all previously declared item IDs are invalid, and all
// application dependent context data has been freed.
// uiBeginLayout() must be followed by uiEndLayout().
OUI_EXPORT void uiBeginLayout();

// layout all added items starting from the root item 0.
// after calling uiEndLayout(), no further modifications to the item tree should
// be done until the next call to uiBeginLayout().
// It is safe to immediately draw the items after a call to uiEndLayout().
// this is an O(N) operation for N = number of declared items.
OUI_EXPORT void uiEndLayout();

// update the current hot item; this only needs to be called if items are kept
// for more than one frame and uiEndLayout() is not called
OUI_EXPORT void uiUpdateHotItem();

// update the internal state according to the current cursor position and 
// button states, and call all registered handlers.
// timestamp is the time in milliseconds relative to the last call to uiProcess()
// and is used to estimate the threshold for double-clicks
// after calling uiProcess(), no further modifications to the item tree should
// be done until the next call to uiBeginLayout().
// Items should be drawn before a call to uiProcess()
// this is an O(N) operation for N = number of declared items.
OUI_EXPORT void uiProcess(int timestamp);

// reset the currently stored hot/active etc. handles; this should be called when
// a re-declaration of the UI changes the item indices, to avoid state
// related glitches because item identities have changed.
OUI_EXPORT void uiClearState();

// UI Declaration
// --------------

// create a new UI item and return the new items ID.
OUI_EXPORT int uiItem();

// set an items state to frozen; the UI will not recurse into frozen items
// when searching for hot or active items; subsequently, frozen items and
// their child items will not cause mouse event notifications.
// The frozen state is not applied recursively; uiGetState() will report
// UI_COLD for child items. Upon encountering a frozen item, the drawing
// routine needs to handle rendering of child items appropriately.
// see example.cpp for a demonstration.
OUI_EXPORT void uiSetFrozen(int item, int enable);

// set the application-dependent handle of an item.
// handle is an application defined 64-bit handle. If handle is NULL, the item
// will not be interactive.
OUI_EXPORT void uiSetHandle(int item, void *handle);

// allocate space for application-dependent context data and assign it
// as the handle to the item.
// The memory of the pointer is managed by the UI context and released
// upon the next call to uiBeginLayout()
OUI_EXPORT void *uiAllocHandle(int item, unsigned int size);

// set the global handler callback for interactive items.
// the handler will be called for each item whose event flags are set using
// uiSetEvents.
OUI_EXPORT void uiSetHandler(UIhandler handler);

// flags is a combination of UI_EVENT_* and designates for which events the 
// handler should be called. 
OUI_EXPORT void uiSetEvents(int item, unsigned int flags);

// flags is a user-defined set of flags defined by UI_USERMASK.
OUI_EXPORT void uiSetFlags(int item, unsigned int flags);

// assign an item to a container.
// an item ID of 0 refers to the root item.
// the function returns the child item ID
// if the container has already added items, the function searches
// for the last item and calls uiAppend() on it, which is an
// O(N) operation for N siblings.
// it is usually more efficient to call uiInsert() for the first child,
// then chain additional siblings using uiAppend().
OUI_EXPORT int uiInsert(int item, int child);

// assign an item to the same container as another item
// sibling is inserted after item.
OUI_EXPORT int uiAppend(int item, int sibling);

// insert child into container item like uiInsert(), but prepend
// it to the first child item, effectively putting it in
// the background.
// it is efficient to call uiInsertBack() repeatedly
// in cases where drawing or layout order doesn't matter.
OUI_EXPORT int uiInsertBack(int item, int child);

// same as uiInsert()
OUI_EXPORT int uiInsertFront(int item, int child);

// set the size of the item; a size of 0 indicates the dimension to be 
// dynamic; if the size is set, the item can not expand beyond that size.
OUI_EXPORT void uiSetSize(int item, int w, int h);

// set the anchoring behavior of the item to one or multiple UIlayoutFlags
OUI_EXPORT void uiSetLayout(int item, unsigned int flags);

// set the box model behavior of the item to one or multiple UIboxFlags
OUI_EXPORT void uiSetBox(int item, unsigned int flags);

// set the left, top, right and bottom margins of an item; when the item is
// anchored to the parent or another item, the margin controls the distance
// from the neighboring element.
OUI_EXPORT void uiSetMargins(int item, short l, short t, short r, short b);

// set item as recipient of all keyboard events; if item is -1, no item will
// be focused.
OUI_EXPORT void uiFocus(int item);

// Iteration
// ---------

// returns the first child item of a container item. If the item is not
// a container or does not contain any items, -1 is returned.
// if item is 0, the first child item of the root item will be returned.
OUI_EXPORT int uiFirstChild(int item);

// returns an items next sibling in the list of the parent containers children.
// if item is 0 or the item is the last child item, -1 will be returned.
OUI_EXPORT int uiNextSibling(int item);

// Querying
// --------

// return the total number of allocated items
OUI_EXPORT int uiGetItemCount();

// return the total bytes that have been allocated by uiAllocHandle()
OUI_EXPORT unsigned int uiGetAllocSize();

// return the current state of the item. This state is only valid after
// a call to uiProcess().
// The returned value is one of UI_COLD, UI_HOT, UI_ACTIVE, UI_FROZEN.
OUI_EXPORT UIitemState uiGetState(int item);

// return the application-dependent handle of the item as passed to uiSetHandle()
// or uiAllocHandle().
OUI_EXPORT void *uiGetHandle(int item);

// return the item that is currently under the cursor or -1 for none
OUI_EXPORT int uiGetHotItem();

// return the item that is currently focused or -1 for none
OUI_EXPORT int uiGetFocusedItem();

// returns the topmost item containing absolute location (x,y), starting with
// item as parent, using a set of flags and masks as filter:
// if both flags and mask are UI_ANY, the first topmost item is returned.
// if mask is UI_ANY, the first topmost item matching *any* of flags is returned.
// otherwise the first item matching (item.flags & flags) == mask is returned.
// you may combine box, layout, event and user flags.
// frozen items will always be ignored.
OUI_EXPORT int uiFindItem(int item, int x, int y,
        unsigned int flags, unsigned int mask);

// return the handler callback as passed to uiSetHandler()
OUI_EXPORT UIhandler uiGetHandler();
// return the event flags for an item as passed to uiSetEvents()
OUI_EXPORT unsigned int uiGetEvents(int item);
// return the user-defined flags for an item as passed to uiSetFlags()
OUI_EXPORT unsigned int uiGetFlags(int item);

// when handling a KEY_DOWN/KEY_UP event: the key that triggered this event
OUI_EXPORT unsigned int uiGetKey();
// when handling a keyboard or mouse event: the active modifier keys
OUI_EXPORT unsigned int uiGetModifier();

// returns the items layout rectangle in absolute coordinates. If 
// uiGetRect() is called before uiEndLayout(), the values of the returned
// rectangle are undefined.
OUI_EXPORT UIrect uiGetRect(int item);

// returns 1 if an items absolute rectangle contains a given coordinate
// otherwise 0
OUI_EXPORT int uiContains(int item, int x, int y);

// return the width of the item as set by uiSetSize()
OUI_EXPORT int uiGetWidth(int item);
// return the height of the item as set by uiSetSize()
OUI_EXPORT int uiGetHeight(int item);

// return the anchoring behavior as set by uiSetLayout()
OUI_EXPORT unsigned int uiGetLayout(int item);
// return the box model as set by uiSetBox()
OUI_EXPORT unsigned int uiGetBox(int item);

// return the left margin of the item as set with uiSetMargins()
OUI_EXPORT short uiGetMarginLeft(int item);
// return the top margin of the item as set with uiSetMargins()
OUI_EXPORT short uiGetMarginTop(int item);
// return the right margin of the item as set with uiSetMargins()
OUI_EXPORT short uiGetMarginRight(int item);
// return the bottom margin of the item as set with uiSetMargins()
OUI_EXPORT short uiGetMarginDown(int item);

// when uiBeginLayout() is called, the most recently declared items are retained.
// when uiEndLayout() completes, it matches the old item hierarchy to the new one
// and attempts to map old items to new items as well as possible.
// when passed an item Id from the previous frame, uiRecoverItem() returns the
// items new assumed Id, or -1 if the item could not be mapped.
// it is valid to pass -1 as item.
OUI_EXPORT int uiRecoverItem(int olditem);

// in cases where it is important to recover old state over changes in
// the view, and the built-in remapping fails, the UI declaration can manually
// remap old items to new IDs in cases where e.g. the previous item ID has been
// temporarily saved; uiRemapItem() would then be called after creating the
// new item using uiItem().
OUI_EXPORT void uiRemapItem(int olditem, int newitem);

// returns the number if items that have been allocated in the last frame
OUI_EXPORT int uiGetLastItemCount();

#ifdef __cplusplus
};
#endif

#endif // _OUI_H_

#ifdef OUI_IMPLEMENTATION

#include <assert.h>

#ifdef _MSC_VER
    #pragma warning (disable: 4996) // Switch off security warnings
    #pragma warning (disable: 4100) // Switch off unreferenced formal parameter warnings
    #pragma warning (disable: 4244)
    #pragma warning (disable: 4305)

    #ifdef __cplusplus
    #define UI_INLINE inline
    #else
    #define UI_INLINE static inline
    #endif
#else
    #define UI_INLINE static inline
#endif

#define UI_MAX_KIND 16

#define UI_ANY_BUTTON0_INPUT (UI_BUTTON0_DOWN \
        |UI_BUTTON0_UP \
        |UI_BUTTON0_HOT_UP \
        |UI_BUTTON0_CAPTURE)

#define UI_ANY_BUTTON2_INPUT (UI_BUTTON2_DOWN)

#define UI_ANY_MOUSE_INPUT (UI_ANY_BUTTON0_INPUT \
        |UI_ANY_BUTTON2_INPUT)

#define UI_ANY_KEY_INPUT (UI_KEY_DOWN \
        |UI_KEY_UP \
        |UI_CHAR)

#define UI_ANY_INPUT (UI_ANY_MOUSE_INPUT \
        |UI_ANY_KEY_INPUT)

enum {
    // extra item flags

    // bit 0-2
    UI_ITEM_BOX_MODEL_MASK = 0x000007,
    // bit 0-4
    UI_ITEM_BOX_MASK       = 0x00001F,
    // bit 5-8
    UI_ITEM_LAYOUT_MASK = 0x0003E0,
    // bit 9-18
    UI_ITEM_EVENT_MASK  = 0x07FC00,
    // item is frozen (bit 19)
    UI_ITEM_FROZEN      = 0x080000,
    // item handle is pointer to data (bit 20)
    UI_ITEM_DATA	    = 0x100000,
    // item has been inserted (bit 21)
    UI_ITEM_INSERTED	= 0x200000,
    // horizontal size has been explicitly set (bit 22)
    UI_ITEM_HFIXED      = 0x400000,
    // vertical size has been explicitly set (bit 23)
    UI_ITEM_VFIXED      = 0x800000,
    // bit 22-23
    UI_ITEM_FIXED_MASK  = 0xC00000,

    // which flag bits will be compared
    UI_ITEM_COMPARE_MASK = UI_ITEM_BOX_MODEL_MASK
        | (UI_ITEM_LAYOUT_MASK & ~UI_BREAK)
        | UI_ITEM_EVENT_MASK
        | UI_USERMASK,
};

typedef struct UIitem {
    // data handle
    void *handle;

    // about 27 bits worth of flags
    unsigned int flags;

    // index of first kid
    // if old item: index of equivalent new item
    int firstkid;
    // index of next sibling with same parent
    int nextitem;

    // margin offsets, interpretation depends on flags
    // after layouting, the first two components are absolute coordinates
    short margins[4];
    // size
    short size[2];
} UIitem;

typedef enum UIstate {
    UI_STATE_IDLE = 0,
    UI_STATE_CAPTURE,
} UIstate;

typedef enum UIstage {
    UI_STAGE_LAYOUT = 0,
    UI_STAGE_POST_LAYOUT,
    UI_STAGE_PROCESS,
} UIstage;

typedef struct UIhandleEntry {
    unsigned int key;
    int item;
} UIhandleEntry;

typedef struct UIinputEvent {
    unsigned int key;
    unsigned int mod;
    UIevent event;
} UIinputEvent;

struct UIcontext {
    unsigned int item_capacity;
    unsigned int buffer_capacity;

    // handler
    UIhandler handler;

    // button state in this frame
    unsigned long long buttons;
    // button state in the previous frame
    unsigned long long last_buttons;

    // where the cursor was at the beginning of the active state
    UIvec2 start_cursor;
    // where the cursor was last frame
    UIvec2 last_cursor;
    // where the cursor is currently
    UIvec2 cursor;
    // accumulated scroll wheel offsets
    UIvec2 scroll;

    int active_item;
    int focus_item;
    int last_hot_item;
    int last_click_item;
    int hot_item;

    UIstate state;
    UIstage stage;
    unsigned int active_key;
    unsigned int active_modifier;
    unsigned int active_button_modifier;
    int last_timestamp;
    int last_click_timestamp;
    int clicks;

    int count;    
    int last_count;
    int eventcount;
    unsigned int datasize;

    UIitem *items;
    unsigned char *data;
    UIitem *last_items;
    int *item_map;
    UIinputEvent events[UI_MAX_INPUT_EVENTS];
};

UI_INLINE int ui_max(int a, int b) {
    return (a>b)?a:b;
}

UI_INLINE int ui_min(int a, int b) {
    return (a<b)?a:b;
}

UI_INLINE float ui_maxf(float a, float b) {
    return (a>b)?a:b;
}

UI_INLINE float ui_minf(float a, float b) {
    return (a<b)?a:b;
}

static UIcontext *ui_context = NULL;

void uiClear() {
    ui_context->last_count = ui_context->count;
    ui_context->count = 0;
    ui_context->datasize = 0;
    ui_context->hot_item = -1;
    // swap buffers
    UIitem *items = ui_context->items;
    ui_context->items = ui_context->last_items;
    ui_context->last_items = items;
    for (int i = 0; i < ui_context->last_count; ++i) {
        ui_context->item_map[i] = -1;
    }
}

UIcontext *uiCreateContext(
        unsigned int item_capacity,
        unsigned int buffer_capacity) {
    assert(item_capacity);
    UIcontext *ctx = (UIcontext *)org_lwjgl_malloc(sizeof(UIcontext));
    memset(ctx, 0, sizeof(UIcontext));
    ctx->item_capacity = item_capacity;
    ctx->buffer_capacity = buffer_capacity;
    ctx->stage = UI_STAGE_PROCESS;
    ctx->items = (UIitem *)org_lwjgl_malloc(sizeof(UIitem) * item_capacity);
    ctx->last_items = (UIitem *)org_lwjgl_malloc(sizeof(UIitem) * item_capacity);
    ctx->item_map = (int *)org_lwjgl_malloc(sizeof(int) * item_capacity);
    if (buffer_capacity) {
        ctx->data = (unsigned char *)org_lwjgl_malloc(buffer_capacity);
    }

    UIcontext *oldctx = ui_context;
    uiMakeCurrent(ctx);
    uiClear();
    uiClearState();
    uiMakeCurrent(oldctx);
    return ctx;
}

void uiMakeCurrent(UIcontext *ctx) {
    ui_context = ctx;
}

void uiDestroyContext(UIcontext *ctx) {
    if (ui_context == ctx)
        uiMakeCurrent(NULL);
    org_lwjgl_free(ctx->items);
    org_lwjgl_free(ctx->last_items);
    org_lwjgl_free(ctx->item_map);
    org_lwjgl_free(ctx->data);
    org_lwjgl_free(ctx);
}

OUI_EXPORT UIcontext *uiGetContext() {
    return ui_context;
}

void uiSetButton(unsigned int button, unsigned int mod, int enabled) {
    assert(ui_context);
    unsigned long long mask = 1ull<<button;
    // set new bit
    ui_context->buttons = (enabled)?
            (ui_context->buttons | mask):
            (ui_context->buttons & ~mask);
    ui_context->active_button_modifier = mod;
}

static void uiAddInputEvent(UIinputEvent event) {
    assert(ui_context);
    if (ui_context->eventcount == UI_MAX_INPUT_EVENTS) return;
    ui_context->events[ui_context->eventcount++] = event;
}

static void uiClearInputEvents() {
    assert(ui_context);
    ui_context->eventcount = 0;
    ui_context->scroll.x = 0;
    ui_context->scroll.y = 0;
}

void uiSetKey(unsigned int key, unsigned int mod, int enabled) {
    assert(ui_context);
    UIinputEvent event = { key, mod, enabled?UI_KEY_DOWN:UI_KEY_UP };
    uiAddInputEvent(event);
}

void uiSetChar(unsigned int value) {
    assert(ui_context);
    UIinputEvent event = { value, 0, UI_CHAR };
    uiAddInputEvent(event);
}

void uiSetScroll(int x, int y) {
    assert(ui_context);
    ui_context->scroll.x += x;
    ui_context->scroll.y += y;
}

UIvec2 uiGetScroll() {
    assert(ui_context);
    return ui_context->scroll;
}

int uiGetLastButton(int button) {
    assert(ui_context);
    return (ui_context->last_buttons & (1ull<<button))?1:0;
}

int uiGetButton(unsigned int button) {
    assert(ui_context);
    return (ui_context->buttons & (1ull<<button))?1:0;
}

int uiButtonPressed(int button) {
    assert(ui_context);
    return !uiGetLastButton(button) && uiGetButton(button);
}

int uiButtonReleased(int button) {
    assert(ui_context);
    return uiGetLastButton(button) && !uiGetButton(button);
}

void uiSetCursor(int x, int y) {
    assert(ui_context);
    ui_context->cursor.x = x;
    ui_context->cursor.y = y;
}

UIvec2 uiGetCursor() {
    assert(ui_context);
    return ui_context->cursor;
}

UIvec2 uiGetCursorStart() {
    assert(ui_context);
    return ui_context->start_cursor;
}

UIvec2 uiGetCursorDelta() {
    assert(ui_context);
    UIvec2 result = {{{
            ui_context->cursor.x - ui_context->last_cursor.x,
            ui_context->cursor.y - ui_context->last_cursor.y
    }}};
    return result;
}

UIvec2 uiGetCursorStartDelta() {
    assert(ui_context);
    UIvec2 result = {{{
            ui_context->cursor.x - ui_context->start_cursor.x,
            ui_context->cursor.y - ui_context->start_cursor.y
    }}};
    return result;
}

unsigned int uiGetKey() {
    assert(ui_context);
    return ui_context->active_key;
}

unsigned int uiGetModifier() {
    assert(ui_context);
    return ui_context->active_modifier;
}

int uiGetItemCount() {
    assert(ui_context);
    return ui_context->count;
}

int uiGetLastItemCount() {
    assert(ui_context);
    return ui_context->last_count;
}

unsigned int uiGetAllocSize() {
    assert(ui_context);
    return ui_context->datasize;
}

UIitem *uiItemPtr(int item) {
    assert(ui_context && (item >= 0) && (item < ui_context->count));
    return ui_context->items + item;
}

UIitem *uiLastItemPtr(int item) {
    assert(ui_context && (item >= 0) && (item < ui_context->last_count));
    return ui_context->last_items + item;
}

int uiGetHotItem() {
    assert(ui_context);
    return ui_context->hot_item;
}

void uiFocus(int item) {
    assert(ui_context && (item >= -1) && (item < ui_context->count));
    assert(ui_context->stage != UI_STAGE_LAYOUT);
    ui_context->focus_item = item;
}

static void uiValidateStateItems() {
    assert(ui_context);
    ui_context->last_hot_item = uiRecoverItem(ui_context->last_hot_item);
    ui_context->active_item = uiRecoverItem(ui_context->active_item);
    ui_context->focus_item = uiRecoverItem(ui_context->focus_item);
    ui_context->last_click_item = uiRecoverItem(ui_context->last_click_item);
}

int uiGetFocusedItem() {
    assert(ui_context);
    return ui_context->focus_item;
}


void uiBeginLayout() {
    assert(ui_context);
    assert(ui_context->stage == UI_STAGE_PROCESS); // must run uiEndLayout(), uiProcess() first
    uiClear();
    ui_context->stage = UI_STAGE_LAYOUT;
}

void uiClearState() {
    assert(ui_context);
    ui_context->last_hot_item = -1;
    ui_context->active_item = -1;
    ui_context->focus_item = -1;
    ui_context->last_click_item = -1;
}

int uiItem() {
    assert(ui_context);
    assert(ui_context->stage == UI_STAGE_LAYOUT); // must run between uiBeginLayout() and uiEndLayout()
    assert(ui_context->count < (int)ui_context->item_capacity);
    int idx = ui_context->count++;
    UIitem *item = uiItemPtr(idx);
    memset(item, 0, sizeof(UIitem));
    item->firstkid = -1;
    item->nextitem = -1;
    return idx;
}

void uiNotifyItem(int item, UIevent event) {
    assert(ui_context);
    if (!ui_context->handler)
        return;
    assert((event & UI_ITEM_EVENT_MASK) == event);
    UIitem *pitem = uiItemPtr(item);
    if (pitem->flags & event) {
        ui_context->handler(item, event);
    }
}

UI_INLINE int uiLastChild(int item) {
    item = uiFirstChild(item);
    if (item < 0)
        return -1;
    while (true) {
        int nextitem = uiNextSibling(item);
        if (nextitem < 0)
            return item;
        item = nextitem;
    }
}

int uiAppend(int item, int sibling) {
    assert(sibling > 0);
    UIitem *pitem = uiItemPtr(item);
    UIitem *psibling = uiItemPtr(sibling);
    assert(!(psibling->flags & UI_ITEM_INSERTED));
    psibling->nextitem = pitem->nextitem;
    psibling->flags |= UI_ITEM_INSERTED;
    pitem->nextitem = sibling;
    return sibling;
}

int uiInsert(int item, int child) {
    assert(child > 0);
    UIitem *pparent = uiItemPtr(item);
    UIitem *pchild = uiItemPtr(child);
    assert(!(pchild->flags & UI_ITEM_INSERTED));
    if (pparent->firstkid < 0) {
        pparent->firstkid = child;
        pchild->flags |= UI_ITEM_INSERTED;
    } else {
        uiAppend(uiLastChild(item), child);
    }
    return child;
}

int uiInsertFront(int item, int child) {
    return uiInsert(item, child);
}

int uiInsertBack(int item, int child) {
    assert(child > 0);
    UIitem *pparent = uiItemPtr(item);
    UIitem *pchild = uiItemPtr(child);
    assert(!(pchild->flags & UI_ITEM_INSERTED));
    pchild->nextitem = pparent->firstkid;
    pparent->firstkid = child;
    pchild->flags |= UI_ITEM_INSERTED;
    return child;
}

void uiSetFrozen(int item, int enable) {
    UIitem *pitem = uiItemPtr(item);
    if (enable)
        pitem->flags |= UI_ITEM_FROZEN;
    else
        pitem->flags &= ~UI_ITEM_FROZEN;
}

void uiSetSize(int item, int w, int h) {
    UIitem *pitem = uiItemPtr(item);
    pitem->size[0] = w;
    pitem->size[1] = h;
    if (!w)
        pitem->flags &= ~UI_ITEM_HFIXED;
    else
        pitem->flags |= UI_ITEM_HFIXED;
    if (!h)
        pitem->flags &= ~UI_ITEM_VFIXED;
    else
        pitem->flags |= UI_ITEM_VFIXED;
}

int uiGetWidth(int item) {
    return uiItemPtr(item)->size[0];
}

int uiGetHeight(int item) {
    return uiItemPtr(item)->size[1];
}

void uiSetLayout(int item, unsigned int flags) {
    UIitem *pitem = uiItemPtr(item);
    assert((flags & UI_ITEM_LAYOUT_MASK) == (unsigned int)flags);
    pitem->flags &= ~UI_ITEM_LAYOUT_MASK;
    pitem->flags |= flags & UI_ITEM_LAYOUT_MASK;
}

unsigned int uiGetLayout(int item) {
    return uiItemPtr(item)->flags & UI_ITEM_LAYOUT_MASK;
}

void uiSetBox(int item, unsigned int flags) {
    UIitem *pitem = uiItemPtr(item);
    assert((flags & UI_ITEM_BOX_MASK) == (unsigned int)flags);
    pitem->flags &= ~UI_ITEM_BOX_MASK;
    pitem->flags |= flags & UI_ITEM_BOX_MASK;
}

unsigned int uiGetBox(int item) {
    return uiItemPtr(item)->flags & UI_ITEM_BOX_MASK;
}

void uiSetMargins(int item, short l, short t, short r, short b) {
    UIitem *pitem = uiItemPtr(item);
    pitem->margins[0] = l;
    pitem->margins[1] = t;
    pitem->margins[2] = r;
    pitem->margins[3] = b;
}

short uiGetMarginLeft(int item) {
    return uiItemPtr(item)->margins[0];
}
short uiGetMarginTop(int item) {
    return uiItemPtr(item)->margins[1];
}
short uiGetMarginRight(int item) {
    return uiItemPtr(item)->margins[2];
}
short uiGetMarginDown(int item) {
    return uiItemPtr(item)->margins[3];
}

// compute bounding box of all items super-imposed
UI_INLINE void uiComputeImposedSize(UIitem *pitem, int dim) {
    int wdim = dim+2;
    // largest size is required size
    short need_size = 0;
    int kid = pitem->firstkid;
    while (kid >= 0) {
        UIitem *pkid = uiItemPtr(kid);

        // width = start margin + calculated width + end margin
        int kidsize = pkid->margins[dim] + pkid->size[dim] + pkid->margins[wdim];
        need_size = ui_max(need_size, kidsize);
        kid = uiNextSibling(kid);
    }
    pitem->size[dim] = need_size;
}

// compute bounding box of all items stacked
UI_INLINE void uiComputeStackedSize(UIitem *pitem, int dim) {
    int wdim = dim+2;
    short need_size = 0;
    int kid = pitem->firstkid;
    while (kid >= 0) {
        UIitem *pkid = uiItemPtr(kid);
        // width += start margin + calculated width + end margin
        need_size += pkid->margins[dim] + pkid->size[dim] + pkid->margins[wdim];
        kid = uiNextSibling(kid);
    }
    pitem->size[dim] = need_size;
}

// compute bounding box of all items stacked, repeating when breaking
UI_INLINE void uiComputeWrappedStackedSize(UIitem *pitem, int dim) {
    int wdim = dim+2;

    short need_size = 0;
    short need_size2 = 0;
    int kid = pitem->firstkid;
    while (kid >= 0) {
        UIitem *pkid = uiItemPtr(kid);

        // if next position moved back, we assume a new line
        if (pkid->flags & UI_BREAK) {
            need_size2 = ui_max(need_size2, need_size);
            // newline
            need_size = 0;
        }

        // width = start margin + calculated width + end margin
        need_size += pkid->margins[dim] + pkid->size[dim] + pkid->margins[wdim];
        kid = uiNextSibling(kid);
    }
    pitem->size[dim] = ui_max(need_size2, need_size);
}

// compute bounding box of all items stacked + wrapped
UI_INLINE void uiComputeWrappedSize(UIitem *pitem, int dim) {
    int wdim = dim+2;

    short need_size = 0;
    short need_size2 = 0;
    int kid = pitem->firstkid;
    while (kid >= 0) {
        UIitem *pkid = uiItemPtr(kid);

        // if next position moved back, we assume a new line
        if (pkid->flags & UI_BREAK) {
            need_size2 += need_size;
            // newline
            need_size = 0;
        }

        // width = start margin + calculated width + end margin
        int kidsize = pkid->margins[dim] + pkid->size[dim] + pkid->margins[wdim];
        need_size = ui_max(need_size, kidsize);
        kid = uiNextSibling(kid);
    }
    pitem->size[dim] = need_size2 + need_size;
}

static void uiComputeSize(int item, int dim) {
    UIitem *pitem = uiItemPtr(item);

    // children expand the size
    int kid = pitem->firstkid;
    while (kid >= 0) {
        uiComputeSize(kid, dim);
        kid = uiNextSibling(kid);
    }

    if (pitem->size[dim])
        return;
    switch(pitem->flags & UI_ITEM_BOX_MODEL_MASK) {
    case UI_COLUMN|UI_WRAP: {
        // flex model
        if (dim) // direction
            uiComputeStackedSize(pitem, 1);
        else
            uiComputeImposedSize(pitem, 0);
    } break;
    case UI_ROW|UI_WRAP: {
        // flex model
        if (!dim) // direction
            uiComputeWrappedStackedSize(pitem, 0);
        else
            uiComputeWrappedSize(pitem, 1);
    } break;
    case UI_COLUMN:
    case UI_ROW: {
        // flex model
        if ((pitem->flags & 1) == (unsigned int)dim) // direction
            uiComputeStackedSize(pitem, dim);
        else
            uiComputeImposedSize(pitem, dim);
    } break;
    default: {
        // layout model
        uiComputeImposedSize(pitem, dim);
    } break;
    }
}

// stack all items according to their alignment
UI_INLINE void uiArrangeStacked(UIitem *pitem, int dim, bool wrap) {
    int wdim = dim+2;

    short space = pitem->size[dim];
    float max_x2 = (float)pitem->margins[dim] + (float)space;

    int start_kid = pitem->firstkid;
    while (start_kid >= 0) {
        short used = 0;

        int count = 0; // count of fillers
        int squeezed_count = 0; // count of squeezable elements
        int total = 0;
        bool hardbreak = false;
        // first pass: count items that need to be expanded,
        // and the space that is used
        int kid = start_kid;
        int end_kid = -1;
        while (kid >= 0) {
            UIitem *pkid = uiItemPtr(kid);
            int flags = (pkid->flags & UI_ITEM_LAYOUT_MASK) >> dim;
            int fflags = (pkid->flags & UI_ITEM_FIXED_MASK) >> dim;
            short extend = used;
            if ((flags & UI_HFILL) == UI_HFILL) { // grow
                count++;
                extend += pkid->margins[dim] + pkid->margins[wdim];
            } else {
                if ((fflags & UI_ITEM_HFIXED) != UI_ITEM_HFIXED)
                    squeezed_count++;
                extend += pkid->margins[dim] + pkid->size[dim] + pkid->margins[wdim];
            }
            // wrap on end of line or manual flag
            if (wrap && (total && ((extend > space) || (pkid->flags & UI_BREAK)))) {
                end_kid = kid;
                hardbreak = ((pkid->flags & UI_BREAK) == UI_BREAK);
                // add marker for subsequent queries
                pkid->flags |= UI_BREAK;
                break;
            } else {
                used = extend;
                kid = uiNextSibling(kid);
            }
            total++;
        }

        int extra_space = space - used;
        float filler = 0.0f;
        float spacer = 0.0f;
        float extra_margin = 0.0f;
        float eater = 0.0f;

        if (extra_space > 0) {
            if (count) {
                filler = (float)extra_space / (float)count;
            } else if (total) {
                switch(pitem->flags & UI_JUSTIFY) {
                default: {
                    extra_margin = extra_space / 2.0f;
                } break;
                case UI_JUSTIFY: {
                    // justify when not wrapping or not in last line,
                    // or not manually breaking
                    if (!wrap || ((end_kid != -1) && !hardbreak))
                        spacer = (float)extra_space / (float)(total-1);
                } break;
                case UI_START: {
                } break;
                case UI_END: {
                    extra_margin = extra_space;
                } break;
                }
            }
        } else if (!wrap && (extra_space < 0)) {
           eater = (float)extra_space / (float)squeezed_count;
        }

        // distribute width among items
        float x = (float)pitem->margins[dim];
        float x1;
        // second pass: distribute and rescale
        kid = start_kid;
        while (kid != end_kid) {
            short ix0,ix1;
            UIitem *pkid = uiItemPtr(kid);
            int flags = (pkid->flags & UI_ITEM_LAYOUT_MASK) >> dim;
            int fflags = (pkid->flags & UI_ITEM_FIXED_MASK) >> dim;

            x += (float)pkid->margins[dim] + extra_margin;
            if ((flags & UI_HFILL) == UI_HFILL) { // grow
                x1 = x+filler;
            } else if ((fflags & UI_ITEM_HFIXED) == UI_ITEM_HFIXED) {
                x1 = x+(float)pkid->size[dim];
            } else {
                // squeeze
                x1 = x+ui_maxf(0.0f,(float)pkid->size[dim]+eater);
            }
            ix0 = (short)x;
            if (wrap)
                ix1 = (short)ui_minf(max_x2-(float)pkid->margins[wdim], x1);
            else
                ix1 = (short)x1;
            pkid->margins[dim] = ix0;
            pkid->size[dim] = ix1-ix0;
            x = x1 + (float)pkid->margins[wdim];

            kid = uiNextSibling(kid);
            extra_margin = spacer;
        }

        start_kid = end_kid;
    }
}

// superimpose all items according to their alignment
UI_INLINE void uiArrangeImposedRange(UIitem *pitem, int dim,
        int start_kid, int end_kid, short offset, short space) {
    int wdim = dim+2;

    int kid = start_kid;
    while (kid != end_kid) {
        UIitem *pkid = uiItemPtr(kid);

        int flags = (pkid->flags & UI_ITEM_LAYOUT_MASK) >> dim;

        switch(flags & UI_HFILL) {
        default: break;
        case UI_HCENTER: {
            pkid->margins[dim] += (space-pkid->size[dim])/2 - pkid->margins[wdim];
        } break;
        case UI_RIGHT: {
            pkid->margins[dim] = space-pkid->size[dim]-pkid->margins[wdim];
        } break;
        case UI_HFILL: {
            pkid->size[dim] = ui_max(0,space-pkid->margins[dim]-pkid->margins[wdim]);
        } break;
        }
        pkid->margins[dim] += offset;

        kid = uiNextSibling(kid);
    }
}

UI_INLINE void uiArrangeImposed(UIitem *pitem, int dim) {
    uiArrangeImposedRange(pitem, dim, pitem->firstkid, -1, pitem->margins[dim], pitem->size[dim]);
}

// superimpose all items according to their alignment,
// squeeze items that expand the available space
UI_INLINE void uiArrangeImposedSqueezedRange(UIitem *pitem, int dim,
        int start_kid, int end_kid, short offset, short space) {
    int wdim = dim+2;

    int kid = start_kid;
    while (kid != end_kid) {
        UIitem *pkid = uiItemPtr(kid);

        int flags = (pkid->flags & UI_ITEM_LAYOUT_MASK) >> dim;

        short min_size = ui_max(0,space-pkid->margins[dim]-pkid->margins[wdim]);
        switch(flags & UI_HFILL) {
        default: {
            pkid->size[dim] = ui_min(pkid->size[dim], min_size);
        } break;
        case UI_HCENTER: {
            pkid->size[dim] = ui_min(pkid->size[dim], min_size);
            pkid->margins[dim] += (space-pkid->size[dim])/2 - pkid->margins[wdim];
        } break;
        case UI_RIGHT: {
            pkid->size[dim] = ui_min(pkid->size[dim], min_size);
            pkid->margins[dim] = space-pkid->size[dim]-pkid->margins[wdim];
        } break;
        case UI_HFILL: {
            pkid->size[dim] = min_size;
        } break;
        }
        pkid->margins[dim] += offset;

        kid = uiNextSibling(kid);
    }
}

UI_INLINE void uiArrangeImposedSqueezed(UIitem *pitem, int dim) {
    uiArrangeImposedSqueezedRange(pitem, dim, pitem->firstkid, -1, pitem->margins[dim], pitem->size[dim]);
}

// superimpose all items according to their alignment
UI_INLINE short uiArrangeWrappedImposedSqueezed(UIitem *pitem, int dim) {
    int wdim = dim+2;

    short offset = pitem->margins[dim];

    short need_size = 0;
    int kid = pitem->firstkid;
    int start_kid = kid;
    while (kid >= 0) {
        UIitem *pkid = uiItemPtr(kid);

        if (pkid->flags & UI_BREAK) {
            uiArrangeImposedSqueezedRange(pitem, dim, start_kid, kid, offset, need_size);
            offset += need_size;
            start_kid = kid;
            // newline
            need_size = 0;
        }

        // width = start margin + calculated width + end margin
        int kidsize = pkid->margins[dim] + pkid->size[dim] + pkid->margins[wdim];
        need_size = ui_max(need_size, kidsize);
        kid = uiNextSibling(kid);
    }

    uiArrangeImposedSqueezedRange(pitem, dim, start_kid, -1, offset, need_size);
    offset += need_size;
    return offset;
}

static void uiArrange(int item, int dim) {
    UIitem *pitem = uiItemPtr(item);

    switch(pitem->flags & UI_ITEM_BOX_MODEL_MASK) {
    case UI_COLUMN|UI_WRAP: {
        // flex model, wrapping
        if (dim) { // direction
            uiArrangeStacked(pitem, 1, true);
            // this retroactive resize will not effect parent widths
            short offset = uiArrangeWrappedImposedSqueezed(pitem, 0);
            pitem->size[0] = offset - pitem->margins[0];
        }
    } break;
    case UI_ROW|UI_WRAP: {
        // flex model, wrapping
        if (!dim) { // direction
            uiArrangeStacked(pitem, 0, true);
        } else {
            uiArrangeWrappedImposedSqueezed(pitem, 1);
        }
    } break;
    case UI_COLUMN:
    case UI_ROW: {
        // flex model
        if ((pitem->flags & 1) == (unsigned int)dim) // direction
            uiArrangeStacked(pitem, dim, false);
        else
            uiArrangeImposedSqueezed(pitem, dim);
    } break;
    default: {
        // layout model
        uiArrangeImposed(pitem, dim);
    } break;
    }

    int kid = uiFirstChild(item);
    while (kid >= 0) {
        uiArrange(kid, dim);
        kid = uiNextSibling(kid);
    }
}

UI_INLINE bool uiCompareItems(UIitem *item1, UIitem *item2) {
    return ((item1->flags & UI_ITEM_COMPARE_MASK) == (item2->flags & UI_ITEM_COMPARE_MASK));

}

static bool uiMapItems(int item1, int item2) {
    UIitem *pitem1 = uiLastItemPtr(item1);
    if (item2 == -1) {
        return false;
    }

    UIitem *pitem2 = uiItemPtr(item2);
    if (!uiCompareItems(pitem1, pitem2)) {
        return false;
    }

    int count = 0;
    int failed = 0;
    int kid1 = pitem1->firstkid;
    int kid2 = pitem2->firstkid;
    while (kid1 != -1) {
        UIitem *pkid1 = uiLastItemPtr(kid1);
        count++;
        if (!uiMapItems(kid1, kid2)) {
            failed = count;
            break;
        }
        kid1 = pkid1->nextitem;
        if (kid2 != -1) {
            kid2 = uiItemPtr(kid2)->nextitem;
        }
    }

    if (count && (failed == 1)) {
        return false;
    }

    ui_context->item_map[item1] = item2;
    return true;
}

int uiRecoverItem(int olditem) {
    assert(ui_context);
    assert((olditem >= -1) && (olditem < ui_context->last_count));
    if (olditem == -1) return -1;
    return ui_context->item_map[olditem];
}

void uiRemapItem(int olditem, int newitem) {
    assert(ui_context);
    assert((olditem >= 0) && (olditem < ui_context->last_count));
    assert((newitem >= -1) && (newitem < ui_context->count));
    ui_context->item_map[olditem] = newitem;
}

void uiEndLayout() {
    assert(ui_context);
    assert(ui_context->stage == UI_STAGE_LAYOUT); // must run uiBeginLayout() first

    if (ui_context->count) {
        uiComputeSize(0,0);
        uiArrange(0,0);
        uiComputeSize(0,1);
        uiArrange(0,1);

        if (ui_context->last_count) {
            // map old item id to new item id
            uiMapItems(0,0);
        }
    }

    uiValidateStateItems();
    if (ui_context->count) {
        // drawing routines may require this to be set already
        uiUpdateHotItem();
    }

    ui_context->stage = UI_STAGE_POST_LAYOUT;
}

UIrect uiGetRect(int item) {
    UIitem *pitem = uiItemPtr(item);
    UIrect rc = {{{
            pitem->margins[0], pitem->margins[1],
            pitem->size[0], pitem->size[1]
    }}};
    return rc;
}

int uiFirstChild(int item) {
    return uiItemPtr(item)->firstkid;
}

int uiNextSibling(int item) {
    return uiItemPtr(item)->nextitem;
}

void *uiAllocHandle(int item, unsigned int size) {
    assert((size > 0) && (size < UI_MAX_DATASIZE));
    UIitem *pitem = uiItemPtr(item);
    assert(pitem->handle == NULL);
    assert((ui_context->datasize+size) <= ui_context->buffer_capacity);
    pitem->handle = ui_context->data + ui_context->datasize;
    pitem->flags |= UI_ITEM_DATA;
    ui_context->datasize += size;
    return pitem->handle;
}

void uiSetHandle(int item, void *handle) {
    UIitem *pitem = uiItemPtr(item);
    assert(pitem->handle == NULL);
    pitem->handle = handle;
}

void *uiGetHandle(int item) {
    return uiItemPtr(item)->handle;
}

void uiSetHandler(UIhandler handler) {
    assert(ui_context);
    ui_context->handler = handler;
}

UIhandler uiGetHandler() {
    assert(ui_context);
    return ui_context->handler;
}

void uiSetEvents(int item, unsigned int flags) {
    UIitem *pitem = uiItemPtr(item);
    pitem->flags &= ~UI_ITEM_EVENT_MASK;
    pitem->flags |= flags & UI_ITEM_EVENT_MASK;
}

unsigned int uiGetEvents(int item) {
    return uiItemPtr(item)->flags & UI_ITEM_EVENT_MASK;
}

void uiSetFlags(int item, unsigned int flags) {
    UIitem *pitem = uiItemPtr(item);
    pitem->flags &= ~UI_USERMASK;
    pitem->flags |= flags & UI_USERMASK;
}

unsigned int uiGetFlags(int item) {
    return uiItemPtr(item)->flags & UI_USERMASK;
}

int uiContains(int item, int x, int y) {
    UIrect rect = uiGetRect(item);
    x -= rect.x;
    y -= rect.y;
    if ((x>=0)
            && (y>=0)
            && (x<rect.w)
            && (y<rect.h)) return 1;
    return 0;
}

int uiFindItem(int item, int x, int y, unsigned int flags, unsigned int mask) {
    UIitem *pitem = uiItemPtr(item);
    if (pitem->flags & UI_ITEM_FROZEN) return -1;
    if (uiContains(item, x, y)) {
        int best_hit = -1;
        int kid = uiFirstChild(item);
        while (kid >= 0) {
            int hit = uiFindItem(kid, x, y, flags, mask);
            if (hit >= 0) {
                best_hit = hit;
            }
            kid = uiNextSibling(kid);
        }
        if (best_hit >= 0) {
            return best_hit;
        }
        if (((mask == UI_ANY) && ((flags == UI_ANY)
            || (pitem->flags & flags)))
            || ((pitem->flags & flags) == mask)) {
            return item;
        }
    }
    return -1;
}

void uiUpdateHotItem() {
    assert(ui_context);
    if (!ui_context->count) return;
    ui_context->hot_item = uiFindItem(0,
            ui_context->cursor.x, ui_context->cursor.y,
            UI_ANY_MOUSE_INPUT, UI_ANY);
}

int uiGetClicks() {
    return ui_context->clicks;
}

void uiProcess(int timestamp) {
    assert(ui_context);

    assert(ui_context->stage != UI_STAGE_LAYOUT); // must run uiBeginLayout(), uiEndLayout() first

    if (ui_context->stage == UI_STAGE_PROCESS) {
        uiUpdateHotItem();
    }
    ui_context->stage = UI_STAGE_PROCESS;

    if (!ui_context->count) {
        uiClearInputEvents();
        return;
    }

    int hot_item = ui_context->last_hot_item;
    int active_item = ui_context->active_item;
    int focus_item = ui_context->focus_item;

    // send all keyboard events
    if (focus_item >= 0) {
        for (int i = 0; i < ui_context->eventcount; ++i) {
            ui_context->active_key = ui_context->events[i].key;
            ui_context->active_modifier = ui_context->events[i].mod;
            uiNotifyItem(focus_item, 
                    ui_context->events[i].event);
        }
    } else {
        ui_context->focus_item = -1;
    }
    if (ui_context->scroll.x || ui_context->scroll.y) {
        int scroll_item = uiFindItem(0,
                ui_context->cursor.x, ui_context->cursor.y,
                UI_SCROLL, UI_ANY);
        if (scroll_item >= 0) {
            uiNotifyItem(scroll_item, UI_SCROLL);
        }
    }

    uiClearInputEvents();

    int hot = ui_context->hot_item;

    switch(ui_context->state) {
    default:
    case UI_STATE_IDLE: {
        ui_context->start_cursor = ui_context->cursor;
        if (uiGetButton(0)) {
            hot_item = -1;
            active_item = hot;

            if (active_item != focus_item) {
                focus_item = -1;
                ui_context->focus_item = -1;
            }

            if (active_item >= 0) {
                if (
                        ((timestamp - ui_context->last_click_timestamp) > UI_CLICK_THRESHOLD)
                        || (ui_context->last_click_item != active_item)) {
                    ui_context->clicks = 0;
                }
                ui_context->clicks++;

                ui_context->last_click_timestamp = timestamp;
                ui_context->last_click_item = active_item;
                ui_context->active_modifier = ui_context->active_button_modifier;
                uiNotifyItem(active_item, UI_BUTTON0_DOWN);
            }            
            ui_context->state = UI_STATE_CAPTURE;            
        } else if (uiGetButton(2) && !uiGetLastButton(2)) {
            hot_item = -1;
            hot = uiFindItem(0, ui_context->cursor.x, ui_context->cursor.y,
                    UI_BUTTON2_DOWN, UI_ANY);
            if (hot >= 0) {
                ui_context->active_modifier = ui_context->active_button_modifier;
                uiNotifyItem(hot, UI_BUTTON2_DOWN);
            }
        } else {
            hot_item = hot;
        }
    } break;
    case UI_STATE_CAPTURE: {
        if (!uiGetButton(0)) {
            if (active_item >= 0) {
                ui_context->active_modifier = ui_context->active_button_modifier;
                uiNotifyItem(active_item, UI_BUTTON0_UP);
                if (active_item == hot) {
                    uiNotifyItem(active_item, UI_BUTTON0_HOT_UP);
                }
            }
            active_item = -1;
            ui_context->state = UI_STATE_IDLE;
        } else {
            if (active_item >= 0) {
                ui_context->active_modifier = ui_context->active_button_modifier;
                uiNotifyItem(active_item, UI_BUTTON0_CAPTURE);
            }            
            if (hot == active_item)
                hot_item = hot;
            else
                hot_item = -1;
        }
    } break;
    }

    ui_context->last_cursor = ui_context->cursor;
    ui_context->last_hot_item = hot_item;
    ui_context->active_item = active_item;

    ui_context->last_timestamp = timestamp;
    ui_context->last_buttons = ui_context->buttons;
}

static int uiIsActive(int item) {
    assert(ui_context);
    return ui_context->active_item == item;
}

static int uiIsHot(int item) {
    assert(ui_context);
    return ui_context->last_hot_item == item;
}

static int uiIsFocused(int item) {
    assert(ui_context);
    return ui_context->focus_item == item;
}

UIitemState uiGetState(int item) {
    UIitem *pitem = uiItemPtr(item);
    if (pitem->flags & UI_ITEM_FROZEN) return UI_FROZEN;
    if (uiIsFocused(item)) {
        if (pitem->flags & (UI_KEY_DOWN|UI_CHAR|UI_KEY_UP)) return UI_ACTIVE;
    }
    if (uiIsActive(item)) {
        if (pitem->flags & (UI_BUTTON0_CAPTURE|UI_BUTTON0_UP)) return UI_ACTIVE;
        if ((pitem->flags & UI_BUTTON0_HOT_UP)
                && uiIsHot(item)) return UI_ACTIVE;
        return UI_COLD;
    } else if (uiIsHot(item)) {
        return UI_HOT;
    }
    return UI_COLD;
}

#endif // OUI_IMPLEMENTATION
