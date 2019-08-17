/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"

#include <stdlib.h>
#include <stdbool.h>
#include <string.h>
#include "lwjgl_malloc.h"
#define OUI_IMPLEMENTATION
#include "oui.h"

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_nanovg_OUI_uiCreateContext(JNIEnv *__env, jclass clazz, jint item_capacity, jint buffer_capacity) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)uiCreateContext((unsigned int)item_capacity, (unsigned int)buffer_capacity);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiMakeCurrent(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UIcontext *ctx = (UIcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    uiMakeCurrent(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_nuiDestroyContext(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UIcontext *ctx = (UIcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    uiDestroyContext(ctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nanovg_OUI_uiGetContext(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)uiGetContext();
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiSetCursor(JNIEnv *__env, jclass clazz, jint x, jint y) {
    UNUSED_PARAMS(__env, clazz)
    uiSetCursor(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_nuiGetCursor(JNIEnv *__env, jclass clazz, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((UIvec2*)(intptr_t)__result) = uiGetCursor();
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_nuiGetCursorDelta(JNIEnv *__env, jclass clazz, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((UIvec2*)(intptr_t)__result) = uiGetCursorDelta();
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_nuiGetCursorStart(JNIEnv *__env, jclass clazz, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((UIvec2*)(intptr_t)__result) = uiGetCursorStart();
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_nuiGetCursorStartDelta(JNIEnv *__env, jclass clazz, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((UIvec2*)(intptr_t)__result) = uiGetCursorStartDelta();
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_nuiSetButton(JNIEnv *__env, jclass clazz, jint button, jint mod, jint enabled) {
    UNUSED_PARAMS(__env, clazz)
    uiSetButton((unsigned int)button, (unsigned int)mod, enabled);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_nuiGetButton(JNIEnv *__env, jclass clazz, jint button) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)uiGetButton((unsigned int)button);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetClicks(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)uiGetClicks();
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_nuiSetKey(JNIEnv *__env, jclass clazz, jint key, jint mod, jint enabled) {
    UNUSED_PARAMS(__env, clazz)
    uiSetKey((unsigned int)key, (unsigned int)mod, enabled);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiSetChar(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    uiSetChar((unsigned int)value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiSetScroll(JNIEnv *__env, jclass clazz, jint x, jint y) {
    UNUSED_PARAMS(__env, clazz)
    uiSetScroll(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_nuiGetScroll(JNIEnv *__env, jclass clazz, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((UIvec2*)(intptr_t)__result) = uiGetScroll();
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiBeginLayout(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    uiBeginLayout();
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiEndLayout(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    uiEndLayout();
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiUpdateHotItem(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    uiUpdateHotItem();
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiProcess(JNIEnv *__env, jclass clazz, jint timestamp) {
    UNUSED_PARAMS(__env, clazz)
    uiProcess(timestamp);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiClearState(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    uiClearState();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiItem(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)uiItem();
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_nuiSetFrozen(JNIEnv *__env, jclass clazz, jint item, jint enable) {
    UNUSED_PARAMS(__env, clazz)
    uiSetFrozen(item, enable);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiSetHandle(JNIEnv *__env, jclass clazz, jint item, jlong handleAddress) {
    void *handle = (void *)(intptr_t)handleAddress;
    UNUSED_PARAMS(__env, clazz)
    uiSetHandle(item, handle);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nanovg_OUI_nuiAllocHandle(JNIEnv *__env, jclass clazz, jint item, jint size) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)uiAllocHandle(item, (unsigned int)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_nuiSetHandler(JNIEnv *__env, jclass clazz, jlong handlerAddress) {
    UIhandler handler = (UIhandler)(intptr_t)handlerAddress;
    UNUSED_PARAMS(__env, clazz)
    uiSetHandler(handler);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiSetEvents(JNIEnv *__env, jclass clazz, jint item, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    uiSetEvents(item, (unsigned int)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiSetFlags(JNIEnv *__env, jclass clazz, jint item, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    uiSetFlags(item, (unsigned int)flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiInsert(JNIEnv *__env, jclass clazz, jint item, jint child) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)uiInsert(item, child);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiAppend(JNIEnv *__env, jclass clazz, jint item, jint sibling) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)uiAppend(item, sibling);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiInsertBack(JNIEnv *__env, jclass clazz, jint item, jint child) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)uiInsertBack(item, child);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiInsertFront(JNIEnv *__env, jclass clazz, jint item, jint child) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)uiInsertFront(item, child);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiSetSize(JNIEnv *__env, jclass clazz, jint item, jint w, jint h) {
    UNUSED_PARAMS(__env, clazz)
    uiSetSize(item, w, h);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiSetLayout(JNIEnv *__env, jclass clazz, jint item, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    uiSetLayout(item, (unsigned int)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiSetBox(JNIEnv *__env, jclass clazz, jint item, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    uiSetBox(item, (unsigned int)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_nuiSetMargins(JNIEnv *__env, jclass clazz, jint item, jshort l, jshort t, jshort r, jshort b) {
    UNUSED_PARAMS(__env, clazz)
    uiSetMargins(item, l, t, r, b);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiFocus(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    uiFocus(item);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiFirstChild(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)uiFirstChild(item);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiNextSibling(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)uiNextSibling(item);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetItemCount(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)uiGetItemCount();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetAllocSize(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)uiGetAllocSize();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetState(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)uiGetState(item);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nanovg_OUI_uiGetHandle(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)uiGetHandle(item);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetHotItem(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)uiGetHotItem();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetFocusedItem(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)uiGetFocusedItem();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiFindItem(JNIEnv *__env, jclass clazz, jint item, jint x, jint y, jint flags, jint mask) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)uiFindItem(item, x, y, (unsigned int)flags, (unsigned int)mask);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nanovg_OUI_nuiGetHandler(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)uiGetHandler();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetEvents(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)uiGetEvents(item);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetFlags(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)uiGetFlags(item);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetKey(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)uiGetKey();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetModifier(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)uiGetModifier();
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_nuiGetRect(JNIEnv *__env, jclass clazz, jint item, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((UIrect*)(intptr_t)__result) = uiGetRect(item);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_nuiContains(JNIEnv *__env, jclass clazz, jint item, jint x, jint y) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)uiContains(item, x, y);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetWidth(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)uiGetWidth(item);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetHeight(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)uiGetHeight(item);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetLayout(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)uiGetLayout(item);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetBox(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)uiGetBox(item);
}

JNIEXPORT jshort JNICALL Java_org_lwjgl_nanovg_OUI_uiGetMarginLeft(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)uiGetMarginLeft(item);
}

JNIEXPORT jshort JNICALL Java_org_lwjgl_nanovg_OUI_uiGetMarginTop(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)uiGetMarginTop(item);
}

JNIEXPORT jshort JNICALL Java_org_lwjgl_nanovg_OUI_uiGetMarginRight(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)uiGetMarginRight(item);
}

JNIEXPORT jshort JNICALL Java_org_lwjgl_nanovg_OUI_uiGetMarginDown(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)uiGetMarginDown(item);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiRecoverItem(JNIEnv *__env, jclass clazz, jint olditem) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)uiRecoverItem(olditem);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiRemapItem(JNIEnv *__env, jclass clazz, jint olditem, jint newitem) {
    UNUSED_PARAMS(__env, clazz)
    uiRemapItem(olditem, newitem);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetLastItemCount(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)uiGetLastItemCount();
}

EXTERN_C_EXIT
