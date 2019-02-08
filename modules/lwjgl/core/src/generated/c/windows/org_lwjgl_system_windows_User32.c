/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#define APIENTRY __stdcall

typedef jshort (APIENTRY *RegisterClassExWPROC) (intptr_t);
typedef jint (APIENTRY *UnregisterClassWPROC) (intptr_t, intptr_t);
typedef intptr_t (APIENTRY *CreateWindowExWPROC) (jint, intptr_t, intptr_t, jint, jint, jint, jint, jint, intptr_t, intptr_t, intptr_t, intptr_t);
typedef jint (APIENTRY *DestroyWindowPROC) (intptr_t);
typedef jint (APIENTRY *SetWindowPosPROC) (intptr_t, intptr_t, jint, jint, jint, jint, jint);
typedef jint (APIENTRY *SetWindowTextWPROC) (intptr_t, intptr_t);
typedef jint (APIENTRY *GetMessageWPROC) (intptr_t, intptr_t, jint, jint);
typedef jint (APIENTRY *WaitMessagePROC) (void);
typedef jint (APIENTRY *PostMessageWPROC) (intptr_t, jint, intptr_t, intptr_t);
typedef jint (APIENTRY *SendMessageWPROC) (intptr_t, jint, intptr_t, intptr_t);
typedef jint (APIENTRY *AdjustWindowRectExPROC) (intptr_t, jint, jint, jint);
typedef jint (APIENTRY *GetWindowRectPROC) (intptr_t, intptr_t);
typedef jint (APIENTRY *MoveWindowPROC) (intptr_t, jint, jint, jint, jint, jint);
typedef jint (APIENTRY *GetWindowPlacementPROC) (intptr_t, intptr_t);
typedef jint (APIENTRY *SetWindowPlacementPROC) (intptr_t, intptr_t);
typedef intptr_t (APIENTRY *SetWindowLongPtrPROC) (intptr_t, jint, intptr_t);
typedef intptr_t (APIENTRY *GetWindowLongPtrPROC) (intptr_t, jint);
typedef intptr_t (APIENTRY *SetClassLongPtrPROC) (intptr_t, jint, intptr_t);
typedef intptr_t (APIENTRY *GetClassLongPtrPROC) (intptr_t, jint);
typedef jint (APIENTRY *SetLayeredWindowAttributesPROC) (intptr_t, jint, jbyte, jint);
typedef intptr_t (APIENTRY *LoadIconWPROC) (intptr_t, intptr_t);
typedef intptr_t (APIENTRY *LoadCursorWPROC) (intptr_t, intptr_t);
typedef jint (APIENTRY *RegisterTouchWindowPROC) (intptr_t, jint);
typedef jint (APIENTRY *UnregisterTouchWindowPROC) (intptr_t);
typedef jint (APIENTRY *GetTouchInputInfoPROC) (intptr_t, jint, intptr_t, jint);
typedef jint (APIENTRY *CloseTouchInputHandlePROC) (intptr_t);

EXTERN_C_ENTER

JNIEXPORT jshort JNICALL JavaCritical_org_lwjgl_system_windows_User32_nRegisterClassEx(jlong lpwcxAddress, jlong __functionAddress) {
    RegisterClassExWPROC RegisterClassExW = (RegisterClassExWPROC)(intptr_t)__functionAddress;
    intptr_t lpwcx = (intptr_t)lpwcxAddress;
    jshort __result;
    __result = (jshort)RegisterClassExW(lpwcx);
    saveLastError();
    return __result;
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_windows_User32_nRegisterClassEx(JNIEnv *__env, jclass clazz, jlong lpwcxAddress, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_User32_nRegisterClassEx(lpwcxAddress, __functionAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_windows_User32_nUnregisterClass(jlong lpClassNameAddress, jlong hInstanceAddress, jlong __functionAddress) {
    UnregisterClassWPROC UnregisterClassW = (UnregisterClassWPROC)(intptr_t)__functionAddress;
    intptr_t lpClassName = (intptr_t)lpClassNameAddress;
    intptr_t hInstance = (intptr_t)hInstanceAddress;
    jint __result;
    __result = (jint)UnregisterClassW(lpClassName, hInstance);
    saveLastError();
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nUnregisterClass(JNIEnv *__env, jclass clazz, jlong lpClassNameAddress, jlong hInstanceAddress, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_User32_nUnregisterClass(lpClassNameAddress, hInstanceAddress, __functionAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_windows_User32_nCreateWindowEx(jint dwExStyle, jlong lpClassNameAddress, jlong lpWindowNameAddress, jint dwStyle, jint x, jint y, jint nWidth, jint nHeight, jlong hWndParentAddress, jlong hMenuAddress, jlong hInstanceAddress, jlong lpParamAddress, jlong __functionAddress) {
    CreateWindowExWPROC CreateWindowExW = (CreateWindowExWPROC)(intptr_t)__functionAddress;
    intptr_t lpClassName = (intptr_t)lpClassNameAddress;
    intptr_t lpWindowName = (intptr_t)lpWindowNameAddress;
    intptr_t hWndParent = (intptr_t)hWndParentAddress;
    intptr_t hMenu = (intptr_t)hMenuAddress;
    intptr_t hInstance = (intptr_t)hInstanceAddress;
    intptr_t lpParam = (intptr_t)lpParamAddress;
    jlong __result;
    __result = (jlong)CreateWindowExW(dwExStyle, lpClassName, lpWindowName, dwStyle, x, y, nWidth, nHeight, hWndParent, hMenu, hInstance, lpParam);
    saveLastError();
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_User32_nCreateWindowEx(JNIEnv *__env, jclass clazz, jint dwExStyle, jlong lpClassNameAddress, jlong lpWindowNameAddress, jint dwStyle, jint x, jint y, jint nWidth, jint nHeight, jlong hWndParentAddress, jlong hMenuAddress, jlong hInstanceAddress, jlong lpParamAddress, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_User32_nCreateWindowEx(dwExStyle, lpClassNameAddress, lpWindowNameAddress, dwStyle, x, y, nWidth, nHeight, hWndParentAddress, hMenuAddress, hInstanceAddress, lpParamAddress, __functionAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_windows_User32_nDestroyWindow(jlong hWndAddress, jlong __functionAddress) {
    DestroyWindowPROC DestroyWindow = (DestroyWindowPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    jint __result;
    __result = (jint)DestroyWindow(hWnd);
    saveLastError();
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nDestroyWindow(JNIEnv *__env, jclass clazz, jlong hWndAddress, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_User32_nDestroyWindow(hWndAddress, __functionAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_system_windows_User32_nSetWindowPos)(jlong hWndAddress, jlong hWndInsertAfterAddress, jint X, jint Y, jint cx, jint cy, jint uFlags, jlong __functionAddress) {
    SetWindowPosPROC SetWindowPos = (SetWindowPosPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    intptr_t hWndInsertAfter = (intptr_t)hWndInsertAfterAddress;
    jint __result;
    __result = (jint)SetWindowPos(hWnd, hWndInsertAfter, X, Y, cx, cy, uFlags);
    saveLastError();
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nSetWindowPos(JNIEnv *__env, jclass clazz, jlong hWndAddress, jlong hWndInsertAfterAddress, jint X, jint Y, jint cx, jint cy, jint uFlags, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_system_windows_User32_nSetWindowPos)(hWndAddress, hWndInsertAfterAddress, X, Y, cx, cy, uFlags, __functionAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_windows_User32_nSetWindowText(jlong hWndAddress, jlong lpStringAddress, jlong __functionAddress) {
    SetWindowTextWPROC SetWindowTextW = (SetWindowTextWPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    intptr_t lpString = (intptr_t)lpStringAddress;
    jint __result;
    __result = (jint)SetWindowTextW(hWnd, lpString);
    saveLastError();
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nSetWindowText(JNIEnv *__env, jclass clazz, jlong hWndAddress, jlong lpStringAddress, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_User32_nSetWindowText(hWndAddress, lpStringAddress, __functionAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_windows_User32_nGetMessage(jlong lpMsgAddress, jlong hWndAddress, jint wMsgFilterMin, jint wMsgFilterMax, jlong __functionAddress) {
    GetMessageWPROC GetMessageW = (GetMessageWPROC)(intptr_t)__functionAddress;
    intptr_t lpMsg = (intptr_t)lpMsgAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    jint __result;
    __result = (jint)GetMessageW(lpMsg, hWnd, wMsgFilterMin, wMsgFilterMax);
    saveLastError();
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nGetMessage(JNIEnv *__env, jclass clazz, jlong lpMsgAddress, jlong hWndAddress, jint wMsgFilterMin, jint wMsgFilterMax, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_User32_nGetMessage(lpMsgAddress, hWndAddress, wMsgFilterMin, wMsgFilterMax, __functionAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_windows_User32_nWaitMessage(jlong __functionAddress) {
    WaitMessagePROC WaitMessage = (WaitMessagePROC)(intptr_t)__functionAddress;
    jint __result;
    __result = (jint)WaitMessage();
    saveLastError();
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nWaitMessage(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_User32_nWaitMessage(__functionAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_windows_User32_nPostMessage(jlong hWndAddress, jint Msg, jlong wParam, jlong lParam, jlong __functionAddress) {
    PostMessageWPROC PostMessageW = (PostMessageWPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    jint __result;
    __result = (jint)PostMessageW(hWnd, Msg, (intptr_t)wParam, (intptr_t)lParam);
    saveLastError();
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nPostMessage(JNIEnv *__env, jclass clazz, jlong hWndAddress, jint Msg, jlong wParam, jlong lParam, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_User32_nPostMessage(hWndAddress, Msg, wParam, lParam, __functionAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_windows_User32_nSendMessage(jlong hWndAddress, jint Msg, jlong wParam, jlong lParam, jlong __functionAddress) {
    SendMessageWPROC SendMessageW = (SendMessageWPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    jint __result;
    __result = (jint)SendMessageW(hWnd, Msg, (intptr_t)wParam, (intptr_t)lParam);
    saveLastError();
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nSendMessage(JNIEnv *__env, jclass clazz, jlong hWndAddress, jint Msg, jlong wParam, jlong lParam, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_User32_nSendMessage(hWndAddress, Msg, wParam, lParam, __functionAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_windows_User32_nAdjustWindowRectEx(jlong lpRectAddress, jint dwStyle, jint bMenu, jint dwExStyle, jlong __functionAddress) {
    AdjustWindowRectExPROC AdjustWindowRectEx = (AdjustWindowRectExPROC)(intptr_t)__functionAddress;
    intptr_t lpRect = (intptr_t)lpRectAddress;
    jint __result;
    __result = (jint)AdjustWindowRectEx(lpRect, dwStyle, bMenu, dwExStyle);
    saveLastError();
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nAdjustWindowRectEx(JNIEnv *__env, jclass clazz, jlong lpRectAddress, jint dwStyle, jint bMenu, jint dwExStyle, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_User32_nAdjustWindowRectEx(lpRectAddress, dwStyle, bMenu, dwExStyle, __functionAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_windows_User32_nGetWindowRect(jlong hWndAddress, jlong lpRectAddress, jlong __functionAddress) {
    GetWindowRectPROC GetWindowRect = (GetWindowRectPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    intptr_t lpRect = (intptr_t)lpRectAddress;
    jint __result;
    __result = (jint)GetWindowRect(hWnd, lpRect);
    saveLastError();
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nGetWindowRect(JNIEnv *__env, jclass clazz, jlong hWndAddress, jlong lpRectAddress, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_User32_nGetWindowRect(hWndAddress, lpRectAddress, __functionAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_system_windows_User32_nMoveWindow)(jlong hWndAddress, jint X, jint Y, jint nWidth, jint nHeight, jint bRepaint, jlong __functionAddress) {
    MoveWindowPROC MoveWindow = (MoveWindowPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    jint __result;
    __result = (jint)MoveWindow(hWnd, X, Y, nWidth, nHeight, bRepaint);
    saveLastError();
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nMoveWindow(JNIEnv *__env, jclass clazz, jlong hWndAddress, jint X, jint Y, jint nWidth, jint nHeight, jint bRepaint, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_system_windows_User32_nMoveWindow)(hWndAddress, X, Y, nWidth, nHeight, bRepaint, __functionAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_windows_User32_nGetWindowPlacement(jlong hWndAddress, jlong lpwndplAddress, jlong __functionAddress) {
    GetWindowPlacementPROC GetWindowPlacement = (GetWindowPlacementPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    intptr_t lpwndpl = (intptr_t)lpwndplAddress;
    jint __result;
    __result = (jint)GetWindowPlacement(hWnd, lpwndpl);
    saveLastError();
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nGetWindowPlacement(JNIEnv *__env, jclass clazz, jlong hWndAddress, jlong lpwndplAddress, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_User32_nGetWindowPlacement(hWndAddress, lpwndplAddress, __functionAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_windows_User32_nSetWindowPlacement(jlong hWndAddress, jlong lpwndplAddress, jlong __functionAddress) {
    SetWindowPlacementPROC SetWindowPlacement = (SetWindowPlacementPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    intptr_t lpwndpl = (intptr_t)lpwndplAddress;
    jint __result;
    __result = (jint)SetWindowPlacement(hWnd, lpwndpl);
    saveLastError();
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nSetWindowPlacement(JNIEnv *__env, jclass clazz, jlong hWndAddress, jlong lpwndplAddress, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_User32_nSetWindowPlacement(hWndAddress, lpwndplAddress, __functionAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_windows_User32_nSetWindowLongPtr(jlong hWndAddress, jint nIndex, jlong dwNewLong, jlong __functionAddress) {
    SetWindowLongPtrPROC SetWindowLongPtr = (SetWindowLongPtrPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    jlong __result;
    __result = (jlong)SetWindowLongPtr(hWnd, nIndex, (intptr_t)dwNewLong);
    saveLastError();
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_User32_nSetWindowLongPtr(JNIEnv *__env, jclass clazz, jlong hWndAddress, jint nIndex, jlong dwNewLong, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_User32_nSetWindowLongPtr(hWndAddress, nIndex, dwNewLong, __functionAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_windows_User32_nGetWindowLongPtr(jlong hWndAddress, jint nIndex, jlong __functionAddress) {
    GetWindowLongPtrPROC GetWindowLongPtr = (GetWindowLongPtrPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    jlong __result;
    __result = (jlong)GetWindowLongPtr(hWnd, nIndex);
    saveLastError();
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_User32_nGetWindowLongPtr(JNIEnv *__env, jclass clazz, jlong hWndAddress, jint nIndex, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_User32_nGetWindowLongPtr(hWndAddress, nIndex, __functionAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_windows_User32_nSetClassLongPtr(jlong hWndAddress, jint nIndex, jlong dwNewLong, jlong __functionAddress) {
    SetClassLongPtrPROC SetClassLongPtr = (SetClassLongPtrPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    jlong __result;
    __result = (jlong)SetClassLongPtr(hWnd, nIndex, (intptr_t)dwNewLong);
    saveLastError();
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_User32_nSetClassLongPtr(JNIEnv *__env, jclass clazz, jlong hWndAddress, jint nIndex, jlong dwNewLong, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_User32_nSetClassLongPtr(hWndAddress, nIndex, dwNewLong, __functionAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_windows_User32_nGetClassLongPtr(jlong hWndAddress, jint nIndex, jlong __functionAddress) {
    GetClassLongPtrPROC GetClassLongPtr = (GetClassLongPtrPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    jlong __result;
    __result = (jlong)GetClassLongPtr(hWnd, nIndex);
    saveLastError();
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_User32_nGetClassLongPtr(JNIEnv *__env, jclass clazz, jlong hWndAddress, jint nIndex, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_User32_nGetClassLongPtr(hWndAddress, nIndex, __functionAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_windows_User32_nSetLayeredWindowAttributes(jlong hwndAddress, jint crKey, jbyte bAlpha, jint dwFlags, jlong __functionAddress) {
    SetLayeredWindowAttributesPROC SetLayeredWindowAttributes = (SetLayeredWindowAttributesPROC)(intptr_t)__functionAddress;
    intptr_t hwnd = (intptr_t)hwndAddress;
    jint __result;
    __result = (jint)SetLayeredWindowAttributes(hwnd, crKey, bAlpha, dwFlags);
    saveLastError();
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nSetLayeredWindowAttributes(JNIEnv *__env, jclass clazz, jlong hwndAddress, jint crKey, jbyte bAlpha, jint dwFlags, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_User32_nSetLayeredWindowAttributes(hwndAddress, crKey, bAlpha, dwFlags, __functionAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_windows_User32_nLoadIcon(jlong instanceAddress, jlong iconNameAddress, jlong __functionAddress) {
    LoadIconWPROC LoadIconW = (LoadIconWPROC)(intptr_t)__functionAddress;
    intptr_t instance = (intptr_t)instanceAddress;
    intptr_t iconName = (intptr_t)iconNameAddress;
    jlong __result;
    __result = (jlong)LoadIconW(instance, iconName);
    saveLastError();
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_User32_nLoadIcon(JNIEnv *__env, jclass clazz, jlong instanceAddress, jlong iconNameAddress, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_User32_nLoadIcon(instanceAddress, iconNameAddress, __functionAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_windows_User32_nLoadCursor(jlong instanceAddress, jlong cursorNameAddress, jlong __functionAddress) {
    LoadCursorWPROC LoadCursorW = (LoadCursorWPROC)(intptr_t)__functionAddress;
    intptr_t instance = (intptr_t)instanceAddress;
    intptr_t cursorName = (intptr_t)cursorNameAddress;
    jlong __result;
    __result = (jlong)LoadCursorW(instance, cursorName);
    saveLastError();
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_User32_nLoadCursor(JNIEnv *__env, jclass clazz, jlong instanceAddress, jlong cursorNameAddress, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_User32_nLoadCursor(instanceAddress, cursorNameAddress, __functionAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_windows_User32_nRegisterTouchWindow(jlong hWndAddress, jint ulFlags, jlong __functionAddress) {
    RegisterTouchWindowPROC RegisterTouchWindow = (RegisterTouchWindowPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    jint __result;
    __result = (jint)RegisterTouchWindow(hWnd, ulFlags);
    saveLastError();
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nRegisterTouchWindow(JNIEnv *__env, jclass clazz, jlong hWndAddress, jint ulFlags, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_User32_nRegisterTouchWindow(hWndAddress, ulFlags, __functionAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_windows_User32_nUnregisterTouchWindow(jlong hWndAddress, jlong __functionAddress) {
    UnregisterTouchWindowPROC UnregisterTouchWindow = (UnregisterTouchWindowPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    jint __result;
    __result = (jint)UnregisterTouchWindow(hWnd);
    saveLastError();
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nUnregisterTouchWindow(JNIEnv *__env, jclass clazz, jlong hWndAddress, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_User32_nUnregisterTouchWindow(hWndAddress, __functionAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_windows_User32_nGetTouchInputInfo(jlong hTouchInputAddress, jint cInputs, jlong pInputsAddress, jint cbSize, jlong __functionAddress) {
    GetTouchInputInfoPROC GetTouchInputInfo = (GetTouchInputInfoPROC)(intptr_t)__functionAddress;
    intptr_t hTouchInput = (intptr_t)hTouchInputAddress;
    intptr_t pInputs = (intptr_t)pInputsAddress;
    jint __result;
    __result = (jint)GetTouchInputInfo(hTouchInput, cInputs, pInputs, cbSize);
    saveLastError();
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nGetTouchInputInfo(JNIEnv *__env, jclass clazz, jlong hTouchInputAddress, jint cInputs, jlong pInputsAddress, jint cbSize, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_User32_nGetTouchInputInfo(hTouchInputAddress, cInputs, pInputsAddress, cbSize, __functionAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_windows_User32_nCloseTouchInputHandle(jlong hTouchInputAddress, jlong __functionAddress) {
    CloseTouchInputHandlePROC CloseTouchInputHandle = (CloseTouchInputHandlePROC)(intptr_t)__functionAddress;
    intptr_t hTouchInput = (intptr_t)hTouchInputAddress;
    jint __result;
    __result = (jint)CloseTouchInputHandle(hTouchInput);
    saveLastError();
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nCloseTouchInputHandle(JNIEnv *__env, jclass clazz, jlong hTouchInputAddress, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_windows_User32_nCloseTouchInputHandle(hTouchInputAddress, __functionAddress);
}

EXTERN_C_EXIT
