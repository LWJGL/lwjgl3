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

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiCreateContext(jint item_capacity, jint buffer_capacity) {
    return (jlong)(intptr_t)uiCreateContext((unsigned int)item_capacity, (unsigned int)buffer_capacity);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nanovg_OUI_uiCreateContext(JNIEnv *__env, jclass clazz, jint item_capacity, jint buffer_capacity) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiCreateContext(item_capacity, buffer_capacity);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiMakeCurrent(jlong ctxAddress) {
    UIcontext *ctx = (UIcontext *)(intptr_t)ctxAddress;
    uiMakeCurrent(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiMakeCurrent(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_uiMakeCurrent(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_nuiDestroyContext(jlong ctxAddress) {
    UIcontext *ctx = (UIcontext *)(intptr_t)ctxAddress;
    uiDestroyContext(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_nuiDestroyContext(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_nuiDestroyContext(ctxAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiGetContext(void) {
    return (jlong)(intptr_t)uiGetContext();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nanovg_OUI_uiGetContext(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiGetContext();
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiSetCursor(jint x, jint y) {
    uiSetCursor(x, y);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiSetCursor(JNIEnv *__env, jclass clazz, jint x, jint y) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_uiSetCursor(x, y);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_nuiGetCursor(jlong __result) {
    *((UIvec2*)(intptr_t)__result) = uiGetCursor();
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_nuiGetCursor(JNIEnv *__env, jclass clazz, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_nuiGetCursor(__result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_nuiGetCursorDelta(jlong __result) {
    *((UIvec2*)(intptr_t)__result) = uiGetCursorDelta();
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_nuiGetCursorDelta(JNIEnv *__env, jclass clazz, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_nuiGetCursorDelta(__result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_nuiGetCursorStart(jlong __result) {
    *((UIvec2*)(intptr_t)__result) = uiGetCursorStart();
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_nuiGetCursorStart(JNIEnv *__env, jclass clazz, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_nuiGetCursorStart(__result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_nuiGetCursorStartDelta(jlong __result) {
    *((UIvec2*)(intptr_t)__result) = uiGetCursorStartDelta();
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_nuiGetCursorStartDelta(JNIEnv *__env, jclass clazz, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_nuiGetCursorStartDelta(__result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_nuiSetButton(jint button, jint mod, jint enabled) {
    uiSetButton((unsigned int)button, (unsigned int)mod, enabled);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_nuiSetButton(JNIEnv *__env, jclass clazz, jint button, jint mod, jint enabled) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_nuiSetButton(button, mod, enabled);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_OUI_nuiGetButton(jint button) {
    return (jint)uiGetButton((unsigned int)button);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_nuiGetButton(JNIEnv *__env, jclass clazz, jint button) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_nuiGetButton(button);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiGetClicks(void) {
    return (jint)uiGetClicks();
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetClicks(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiGetClicks();
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_nuiSetKey(jint key, jint mod, jint enabled) {
    uiSetKey((unsigned int)key, (unsigned int)mod, enabled);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_nuiSetKey(JNIEnv *__env, jclass clazz, jint key, jint mod, jint enabled) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_nuiSetKey(key, mod, enabled);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiSetChar(jint value) {
    uiSetChar((unsigned int)value);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiSetChar(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_uiSetChar(value);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiSetScroll(jint x, jint y) {
    uiSetScroll(x, y);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiSetScroll(JNIEnv *__env, jclass clazz, jint x, jint y) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_uiSetScroll(x, y);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_nuiGetScroll(jlong __result) {
    *((UIvec2*)(intptr_t)__result) = uiGetScroll();
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_nuiGetScroll(JNIEnv *__env, jclass clazz, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_nuiGetScroll(__result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiBeginLayout(void) {
    uiBeginLayout();
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiBeginLayout(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_uiBeginLayout();
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiEndLayout(void) {
    uiEndLayout();
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiEndLayout(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_uiEndLayout();
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiUpdateHotItem(void) {
    uiUpdateHotItem();
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiUpdateHotItem(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_uiUpdateHotItem();
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiProcess(jint timestamp) {
    uiProcess(timestamp);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiProcess(JNIEnv *__env, jclass clazz, jint timestamp) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_uiProcess(timestamp);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiClearState(void) {
    uiClearState();
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiClearState(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_uiClearState();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiItem(void) {
    return (jint)uiItem();
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiItem(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiItem();
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_nuiSetFrozen(jint item, jint enable) {
    uiSetFrozen(item, enable);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_nuiSetFrozen(JNIEnv *__env, jclass clazz, jint item, jint enable) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_nuiSetFrozen(item, enable);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiSetHandle(jint item, jlong handleAddress) {
    void *handle = (void *)(intptr_t)handleAddress;
    uiSetHandle(item, handle);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiSetHandle(JNIEnv *__env, jclass clazz, jint item, jlong handleAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_uiSetHandle(item, handleAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nanovg_OUI_nuiAllocHandle(jint item, jint size) {
    return (jlong)(intptr_t)uiAllocHandle(item, (unsigned int)size);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nanovg_OUI_nuiAllocHandle(JNIEnv *__env, jclass clazz, jint item, jint size) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_nuiAllocHandle(item, size);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_nuiSetHandler(jlong handlerAddress) {
    UIhandler handler = (UIhandler)(intptr_t)handlerAddress;
    uiSetHandler(handler);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_nuiSetHandler(JNIEnv *__env, jclass clazz, jlong handlerAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_nuiSetHandler(handlerAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiSetEvents(jint item, jint flags) {
    uiSetEvents(item, (unsigned int)flags);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiSetEvents(JNIEnv *__env, jclass clazz, jint item, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_uiSetEvents(item, flags);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiSetFlags(jint item, jint flags) {
    uiSetFlags(item, (unsigned int)flags);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiSetFlags(JNIEnv *__env, jclass clazz, jint item, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_uiSetFlags(item, flags);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiInsert(jint item, jint child) {
    return (jint)uiInsert(item, child);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiInsert(JNIEnv *__env, jclass clazz, jint item, jint child) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiInsert(item, child);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiAppend(jint item, jint sibling) {
    return (jint)uiAppend(item, sibling);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiAppend(JNIEnv *__env, jclass clazz, jint item, jint sibling) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiAppend(item, sibling);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiInsertBack(jint item, jint child) {
    return (jint)uiInsertBack(item, child);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiInsertBack(JNIEnv *__env, jclass clazz, jint item, jint child) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiInsertBack(item, child);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiInsertFront(jint item, jint child) {
    return (jint)uiInsertFront(item, child);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiInsertFront(JNIEnv *__env, jclass clazz, jint item, jint child) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiInsertFront(item, child);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiSetSize(jint item, jint w, jint h) {
    uiSetSize(item, w, h);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiSetSize(JNIEnv *__env, jclass clazz, jint item, jint w, jint h) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_uiSetSize(item, w, h);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiSetLayout(jint item, jint flags) {
    uiSetLayout(item, (unsigned int)flags);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiSetLayout(JNIEnv *__env, jclass clazz, jint item, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_uiSetLayout(item, flags);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiSetBox(jint item, jint flags) {
    uiSetBox(item, (unsigned int)flags);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiSetBox(JNIEnv *__env, jclass clazz, jint item, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_uiSetBox(item, flags);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_nuiSetMargins(jint item, jshort l, jshort t, jshort r, jshort b) {
    uiSetMargins(item, l, t, r, b);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_nuiSetMargins(JNIEnv *__env, jclass clazz, jint item, jshort l, jshort t, jshort r, jshort b) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_nuiSetMargins(item, l, t, r, b);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiFocus(jint item) {
    uiFocus(item);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiFocus(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_uiFocus(item);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiFirstChild(jint item) {
    return (jint)uiFirstChild(item);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiFirstChild(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiFirstChild(item);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiNextSibling(jint item) {
    return (jint)uiNextSibling(item);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiNextSibling(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiNextSibling(item);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiGetItemCount(void) {
    return (jint)uiGetItemCount();
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetItemCount(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiGetItemCount();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiGetAllocSize(void) {
    return (jint)uiGetAllocSize();
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetAllocSize(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiGetAllocSize();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiGetState(jint item) {
    return (jint)uiGetState(item);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetState(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiGetState(item);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiGetHandle(jint item) {
    return (jlong)(intptr_t)uiGetHandle(item);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nanovg_OUI_uiGetHandle(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiGetHandle(item);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiGetHotItem(void) {
    return (jint)uiGetHotItem();
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetHotItem(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiGetHotItem();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiGetFocusedItem(void) {
    return (jint)uiGetFocusedItem();
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetFocusedItem(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiGetFocusedItem();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiFindItem(jint item, jint x, jint y, jint flags, jint mask) {
    return (jint)uiFindItem(item, x, y, (unsigned int)flags, (unsigned int)mask);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiFindItem(JNIEnv *__env, jclass clazz, jint item, jint x, jint y, jint flags, jint mask) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiFindItem(item, x, y, flags, mask);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nanovg_OUI_nuiGetHandler(void) {
    return (jlong)(intptr_t)uiGetHandler();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nanovg_OUI_nuiGetHandler(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_nuiGetHandler();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiGetEvents(jint item) {
    return (jint)uiGetEvents(item);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetEvents(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiGetEvents(item);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiGetFlags(jint item) {
    return (jint)uiGetFlags(item);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetFlags(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiGetFlags(item);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiGetKey(void) {
    return (jint)uiGetKey();
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetKey(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiGetKey();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiGetModifier(void) {
    return (jint)uiGetModifier();
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetModifier(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiGetModifier();
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_nuiGetRect(jint item, jlong __result) {
    *((UIrect*)(intptr_t)__result) = uiGetRect(item);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_nuiGetRect(JNIEnv *__env, jclass clazz, jint item, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_nuiGetRect(item, __result);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_OUI_nuiContains(jint item, jint x, jint y) {
    return (jint)uiContains(item, x, y);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_nuiContains(JNIEnv *__env, jclass clazz, jint item, jint x, jint y) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_nuiContains(item, x, y);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiGetWidth(jint item) {
    return (jint)uiGetWidth(item);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetWidth(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiGetWidth(item);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiGetHeight(jint item) {
    return (jint)uiGetHeight(item);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetHeight(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiGetHeight(item);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiGetLayout(jint item) {
    return (jint)uiGetLayout(item);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetLayout(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiGetLayout(item);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiGetBox(jint item) {
    return (jint)uiGetBox(item);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetBox(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiGetBox(item);
}

JNIEXPORT jshort JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiGetMarginLeft(jint item) {
    return (jshort)uiGetMarginLeft(item);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_nanovg_OUI_uiGetMarginLeft(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiGetMarginLeft(item);
}

JNIEXPORT jshort JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiGetMarginTop(jint item) {
    return (jshort)uiGetMarginTop(item);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_nanovg_OUI_uiGetMarginTop(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiGetMarginTop(item);
}

JNIEXPORT jshort JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiGetMarginRight(jint item) {
    return (jshort)uiGetMarginRight(item);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_nanovg_OUI_uiGetMarginRight(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiGetMarginRight(item);
}

JNIEXPORT jshort JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiGetMarginDown(jint item) {
    return (jshort)uiGetMarginDown(item);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_nanovg_OUI_uiGetMarginDown(JNIEnv *__env, jclass clazz, jint item) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiGetMarginDown(item);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiRecoverItem(jint olditem) {
    return (jint)uiRecoverItem(olditem);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiRecoverItem(JNIEnv *__env, jclass clazz, jint olditem) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiRecoverItem(olditem);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiRemapItem(jint olditem, jint newitem) {
    uiRemapItem(olditem, newitem);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_OUI_uiRemapItem(JNIEnv *__env, jclass clazz, jint olditem, jint newitem) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_OUI_uiRemapItem(olditem, newitem);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_OUI_uiGetLastItemCount(void) {
    return (jint)uiGetLastItemCount();
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_OUI_uiGetLastItemCount(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_OUI_uiGetLastItemCount();
}

EXTERN_C_EXIT
