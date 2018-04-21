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

JNIEXPORT jshort JNICALL Java_org_lwjgl_system_windows_User32_nRegisterClassEx(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong lpwcxAddress) {
    RegisterClassExWPROC RegisterClassExW = (RegisterClassExWPROC)(intptr_t)__functionAddress;
    intptr_t lpwcx = (intptr_t)lpwcxAddress;
    jshort __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jshort)RegisterClassExW(lpwcx);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nUnregisterClass(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong lpClassNameAddress, jlong hInstanceAddress) {
    UnregisterClassWPROC UnregisterClassW = (UnregisterClassWPROC)(intptr_t)__functionAddress;
    intptr_t lpClassName = (intptr_t)lpClassNameAddress;
    intptr_t hInstance = (intptr_t)hInstanceAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)UnregisterClassW(lpClassName, hInstance);
    saveLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_User32_nCreateWindowEx(JNIEnv *__env, jclass clazz, jlong __functionAddress, jint dwExStyle, jlong lpClassNameAddress, jlong lpWindowNameAddress, jint dwStyle, jint x, jint y, jint nWidth, jint nHeight, jlong hWndParentAddress, jlong hMenuAddress, jlong hInstanceAddress, jlong lpParamAddress) {
    CreateWindowExWPROC CreateWindowExW = (CreateWindowExWPROC)(intptr_t)__functionAddress;
    intptr_t lpClassName = (intptr_t)lpClassNameAddress;
    intptr_t lpWindowName = (intptr_t)lpWindowNameAddress;
    intptr_t hWndParent = (intptr_t)hWndParentAddress;
    intptr_t hMenu = (intptr_t)hMenuAddress;
    intptr_t hInstance = (intptr_t)hInstanceAddress;
    intptr_t lpParam = (intptr_t)lpParamAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)CreateWindowExW(dwExStyle, lpClassName, lpWindowName, dwStyle, x, y, nWidth, nHeight, hWndParent, hMenu, hInstance, lpParam);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nDestroyWindow(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong hWndAddress) {
    DestroyWindowPROC DestroyWindow = (DestroyWindowPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)DestroyWindow(hWnd);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nSetWindowPos(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong hWndAddress, jlong hWndInsertAfterAddress, jint X, jint Y, jint cx, jint cy, jint uFlags) {
    SetWindowPosPROC SetWindowPos = (SetWindowPosPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    intptr_t hWndInsertAfter = (intptr_t)hWndInsertAfterAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)SetWindowPos(hWnd, hWndInsertAfter, X, Y, cx, cy, uFlags);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nSetWindowText(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong hWndAddress, jlong lpStringAddress) {
    SetWindowTextWPROC SetWindowTextW = (SetWindowTextWPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    intptr_t lpString = (intptr_t)lpStringAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)SetWindowTextW(hWnd, lpString);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nGetMessage(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong lpMsgAddress, jlong hWndAddress, jint wMsgFilterMin, jint wMsgFilterMax) {
    GetMessageWPROC GetMessageW = (GetMessageWPROC)(intptr_t)__functionAddress;
    intptr_t lpMsg = (intptr_t)lpMsgAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)GetMessageW(lpMsg, hWnd, wMsgFilterMin, wMsgFilterMax);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nWaitMessage(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
    WaitMessagePROC WaitMessage = (WaitMessagePROC)(intptr_t)__functionAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)WaitMessage();
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nPostMessage(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong hWndAddress, jint Msg, jlong wParam, jlong lParam) {
    PostMessageWPROC PostMessageW = (PostMessageWPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)PostMessageW(hWnd, Msg, (intptr_t)wParam, (intptr_t)lParam);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nSendMessage(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong hWndAddress, jint Msg, jlong wParam, jlong lParam) {
    SendMessageWPROC SendMessageW = (SendMessageWPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)SendMessageW(hWnd, Msg, (intptr_t)wParam, (intptr_t)lParam);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nAdjustWindowRectEx(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong lpRectAddress, jint dwStyle, jint bMenu, jint dwExStyle) {
    AdjustWindowRectExPROC AdjustWindowRectEx = (AdjustWindowRectExPROC)(intptr_t)__functionAddress;
    intptr_t lpRect = (intptr_t)lpRectAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)AdjustWindowRectEx(lpRect, dwStyle, bMenu, dwExStyle);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nGetWindowRect(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong hWndAddress, jlong lpRectAddress) {
    GetWindowRectPROC GetWindowRect = (GetWindowRectPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    intptr_t lpRect = (intptr_t)lpRectAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)GetWindowRect(hWnd, lpRect);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nMoveWindow(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong hWndAddress, jint X, jint Y, jint nWidth, jint nHeight, jint bRepaint) {
    MoveWindowPROC MoveWindow = (MoveWindowPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)MoveWindow(hWnd, X, Y, nWidth, nHeight, bRepaint);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nGetWindowPlacement(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong hWndAddress, jlong lpwndplAddress) {
    GetWindowPlacementPROC GetWindowPlacement = (GetWindowPlacementPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    intptr_t lpwndpl = (intptr_t)lpwndplAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)GetWindowPlacement(hWnd, lpwndpl);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nSetWindowPlacement(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong hWndAddress, jlong lpwndplAddress) {
    SetWindowPlacementPROC SetWindowPlacement = (SetWindowPlacementPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    intptr_t lpwndpl = (intptr_t)lpwndplAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)SetWindowPlacement(hWnd, lpwndpl);
    saveLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_User32_nSetWindowLongPtr(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong hWndAddress, jint nIndex, jlong dwNewLong) {
    SetWindowLongPtrPROC SetWindowLongPtr = (SetWindowLongPtrPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)SetWindowLongPtr(hWnd, nIndex, (intptr_t)dwNewLong);
    saveLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_User32_nGetWindowLongPtr(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong hWndAddress, jint nIndex) {
    GetWindowLongPtrPROC GetWindowLongPtr = (GetWindowLongPtrPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)GetWindowLongPtr(hWnd, nIndex);
    saveLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_User32_nSetClassLongPtr(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong hWndAddress, jint nIndex, jlong dwNewLong) {
    SetClassLongPtrPROC SetClassLongPtr = (SetClassLongPtrPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)SetClassLongPtr(hWnd, nIndex, (intptr_t)dwNewLong);
    saveLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_User32_nGetClassLongPtr(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong hWndAddress, jint nIndex) {
    GetClassLongPtrPROC GetClassLongPtr = (GetClassLongPtrPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)GetClassLongPtr(hWnd, nIndex);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nSetLayeredWindowAttributes(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong hwndAddress, jint crKey, jbyte bAlpha, jint dwFlags) {
    SetLayeredWindowAttributesPROC SetLayeredWindowAttributes = (SetLayeredWindowAttributesPROC)(intptr_t)__functionAddress;
    intptr_t hwnd = (intptr_t)hwndAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)SetLayeredWindowAttributes(hwnd, crKey, bAlpha, dwFlags);
    saveLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_User32_nLoadIcon(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong instanceAddress, jlong iconNameAddress) {
    LoadIconWPROC LoadIconW = (LoadIconWPROC)(intptr_t)__functionAddress;
    intptr_t instance = (intptr_t)instanceAddress;
    intptr_t iconName = (intptr_t)iconNameAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)LoadIconW(instance, iconName);
    saveLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_User32_nLoadCursor(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong instanceAddress, jlong cursorNameAddress) {
    LoadCursorWPROC LoadCursorW = (LoadCursorWPROC)(intptr_t)__functionAddress;
    intptr_t instance = (intptr_t)instanceAddress;
    intptr_t cursorName = (intptr_t)cursorNameAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)LoadCursorW(instance, cursorName);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nRegisterTouchWindow(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong hWndAddress, jint ulFlags) {
    RegisterTouchWindowPROC RegisterTouchWindow = (RegisterTouchWindowPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)RegisterTouchWindow(hWnd, ulFlags);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nUnregisterTouchWindow(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong hWndAddress) {
    UnregisterTouchWindowPROC UnregisterTouchWindow = (UnregisterTouchWindowPROC)(intptr_t)__functionAddress;
    intptr_t hWnd = (intptr_t)hWndAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)UnregisterTouchWindow(hWnd);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nGetTouchInputInfo(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong hTouchInputAddress, jint cInputs, jlong pInputsAddress, jint cbSize) {
    GetTouchInputInfoPROC GetTouchInputInfo = (GetTouchInputInfoPROC)(intptr_t)__functionAddress;
    intptr_t hTouchInput = (intptr_t)hTouchInputAddress;
    intptr_t pInputs = (intptr_t)pInputsAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)GetTouchInputInfo(hTouchInput, cInputs, pInputs, cbSize);
    saveLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nCloseTouchInputHandle(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong hTouchInputAddress) {
    CloseTouchInputHandlePROC CloseTouchInputHandle = (CloseTouchInputHandlePROC)(intptr_t)__functionAddress;
    intptr_t hTouchInput = (intptr_t)hTouchInputAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)CloseTouchInputHandle(hTouchInput);
    saveLastError();
    return __result;
}

EXTERN_C_EXIT
