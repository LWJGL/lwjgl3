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

    EnumConstant(
        "USERMASK".enum(
            0xff000000.i
        ),
        "ANY".enum(0xffffffff.i)
    )

    EnumConstant(
        "COLD".enum("0"),
        "HOT".enum,
        "ACTIVE".enum,
        "FROZEN".enum
    )

    EnumConstant(
        "ROW".enum("0x002"),
        "COLUMN".enum("0x003"),
        "LAYOUT".enum("0x000"),
        "FLEX".enum("0x002"),
        "NOWRAP".enum("0x000"),
        "WRAP".enum("0x004"),
        "START".enum("0x008"),
        "MIDDLE".enum("0x000"),
        "END".enum("0x010"),
        "JUSTIFY".enum("0x018")
    )

    EnumConstant(
        "LEFT".enum("0x020"),
        "TOP".enum("0x040"),
        "RIGHT".enum("0x080"),
        "DOWN".enum("0x100"),
        "HFILL".enum("0x0a0"),
        "VFILL".enum("0x140"),
        "HCENTER".enum("0x000"),
        "VCENTER".enum("0x000"),
        "CENTER".enum("0x000"),
        "FILL".enum("0x1e0"),
        "BREAK".enum("0x200")
    )

    EnumConstant(
        "BUTTON0_DOWN".enum("0x0400"),
        "BUTTON0_UP".enum("0x0800"),
        "BUTTON0_HOT_UP".enum("0x1000"),
        "BUTTON0_CAPTURE".enum("0x2000"),
        "BUTTON2_DOWN".enum("0x4000"),
        "SCROLL".enum("0x8000"),
        "KEY_DOWN".enum("0x10000"),
        "KEY_UP".enum("0x20000"),
        "CHAR".enum("0x40000")
    )

    UIcontext.p(
        "CreateContext",

        unsigned_int("item_capacity"),
        unsigned_int("buffer_capacity")
    )

    void(
        "MakeCurrent",

        nullable..UIcontext.p("ctx")
    )

    void(
        "DestroyContext",

        UIcontext.p("ctx")
    )

    UIcontext.p(
        "GetContext",

        void()
    )

    void(
        "SetCursor",

        int("x"),
        int("y")
    )

    UIvec2(
        "GetCursor",

        void()
    )

    UIvec2(
        "GetCursorDelta",

        void()
    )

    UIvec2(
        "GetCursorStart",

        void()
    )

    UIvec2(
        "GetCursorStartDelta",

        void()
    )

    void(
        "SetButton",

        unsigned_int("button"),
        unsigned_int("mod"),
        intb("enabled")
    )

    intb(
        "GetButton",

        unsigned_int("button")
    )

    int(
        "GetClicks",

        void()
    )

    void(
        "SetKey",

        unsigned_int("key"),
        unsigned_int("mod"),
        intb("enabled")
    )

    void(
        "SetChar",

        unsigned_int("value")
    )

    void(
        "SetScroll",

        int("x"),
        int("y")
    )

    UIvec2(
        "GetScroll",

        void()
    )

    void(
        "BeginLayout",

        void()
    )

    void(
        "EndLayout",

        void()
    )

    void(
        "UpdateHotItem",

        void()
    )

    void(
        "Process",

        int("timestamp")
    )

    void(
        "ClearState",

        void()
    )

    int(
        "Item",

        void()
    )

    void(
        "SetFrozen",

        int("item"),
        intb("enable")
    )

    void(
        "SetHandle",

        int("item"),
        nullable..opaque_p("handle")
    )

    void.p(
        "AllocHandle",

        int("item"),
        AutoSizeResult..unsigned_int("size")
    )

    void(
        "SetHandler",

        UIhandler("handler")
    )

    void(
        "SetEvents",

        int("item"),
        unsigned_int("flags")
    )

    void(
        "SetFlags",

        int("item"),
        unsigned_int("flags")
    )

    int(
        "Insert",

        int("item"),
        int("child")
    )

    int(
        "Append",

        int("item"),
        int("sibling")
    )

    int(
        "InsertBack",

        int("item"),
        int("child")
    )

    int(
        "InsertFront",

        int("item"),
        int("child")
    )

    void(
        "SetSize",

        int("item"),
        int("w"),
        int("h")
    )

    void(
        "SetLayout",

        int("item"),
        unsigned_int("flags")
    )

    void(
        "SetBox",

        int("item"),
        unsigned_int("flags")
    )

    void(
        "SetMargins",

        int("item"),
        MapToInt..short("l"),
        MapToInt..short("t"),
        MapToInt..short("r"),
        MapToInt..short("b")
    )

    void(
        "Focus",

        int("item")
    )

    int(
        "FirstChild",

        int("item")
    )

    int(
        "NextSibling",

        int("item")
    )

    int(
        "GetItemCount",

        void()
    )

    unsigned_int(
        "GetAllocSize",

        void()
    )

    UIitemState(
        "GetState",

        int("item")
    )

    opaque_p(
        "GetHandle",

        int("item")
    )

    int(
        "GetHotItem",

        void()
    )

    int(
        "GetFocusedItem",

        void()
    )

    int(
        "FindItem",

        int("item"),
        int("x"),
        int("y"),
        unsigned_int("flags"),
        unsigned_int("mask")
    )

    UIhandler(
        "GetHandler",

        void()
    )

    unsigned_int(
        "GetEvents",

        int("item")
    )

    unsigned_int(
        "GetFlags",

        int("item")
    )

    unsigned_int(
        "GetKey",

        void()
    )

    unsigned_int(
        "GetModifier",

        void()
    )

    UIrect(
        "GetRect",

        int("item")
    )

    intb(
        "Contains",

        int("item"),
        int("x"),
        int("y")
    )

    int(
        "GetWidth",

        int("item")
    )

    int(
        "GetHeight",

        int("item")
    )

    unsigned_int(
        "GetLayout",

        int("item")
    )

    unsigned_int(
        "GetBox",

        int("item")
    )

    short(
        "GetMarginLeft",

        int("item")
    )

    short(
        "GetMarginTop",

        int("item")
    )

    short(
        "GetMarginRight",

        int("item")
    )

    short(
        "GetMarginDown",

        int("item")
    )

    int(
        "RecoverItem",

        int("olditem")
    )

    void(
        "RemapItem",

        int("olditem"),
        int("newitem")
    )

    int(
        "GetLastItemCount",

        void()
    )
}
