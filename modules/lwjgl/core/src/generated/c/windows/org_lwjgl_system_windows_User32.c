/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "WindowsLWJGL.h"

typedef uint16_t (APIENTRY *RegisterClassExWPROC) (uintptr_t);
typedef jint (APIENTRY *UnregisterClassWPROC) (uintptr_t, uintptr_t);
typedef uintptr_t (APIENTRY *CreateWindowExWPROC) (jint, uintptr_t, uintptr_t, jint, jint, jint, jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t);
typedef jint (APIENTRY *DestroyWindowPROC) (uintptr_t);
typedef jint (APIENTRY *SetWindowPosPROC) (uintptr_t, uintptr_t, jint, jint, jint, jint, jint);
typedef jint (APIENTRY *SetWindowTextWPROC) (uintptr_t, uintptr_t);
typedef jint (APIENTRY *GetMessageWPROC) (uintptr_t, uintptr_t, jint, jint);
typedef jint (APIENTRY *WaitMessagePROC) (void);
typedef jint (APIENTRY *PostMessageWPROC) (uintptr_t, jint, uintptr_t, uintptr_t);
typedef jint (APIENTRY *SendMessageWPROC) (uintptr_t, jint, uintptr_t, uintptr_t);
typedef jint (APIENTRY *AdjustWindowRectExPROC) (uintptr_t, jint, jint, jint);
typedef jint (APIENTRY *GetWindowRectPROC) (uintptr_t, uintptr_t);
typedef jint (APIENTRY *MoveWindowPROC) (uintptr_t, jint, jint, jint, jint, jint);
typedef jint (APIENTRY *GetWindowPlacementPROC) (uintptr_t, uintptr_t);
typedef jint (APIENTRY *SetWindowPlacementPROC) (uintptr_t, uintptr_t);
typedef uintptr_t (APIENTRY *SetWindowLongPtrPROC) (uintptr_t, jint, uintptr_t);
typedef uintptr_t (APIENTRY *GetWindowLongPtrPROC) (uintptr_t, jint);
typedef uintptr_t (APIENTRY *SetClassLongPtrPROC) (uintptr_t, jint, uintptr_t);
typedef uintptr_t (APIENTRY *GetClassLongPtrPROC) (uintptr_t, jint);
typedef jint (APIENTRY *SetLayeredWindowAttributesPROC) (uintptr_t, jint, jbyte, jint);
typedef uintptr_t (APIENTRY *LoadIconWPROC) (uintptr_t, uintptr_t);
typedef uintptr_t (APIENTRY *LoadCursorWPROC) (uintptr_t, uintptr_t);
typedef jint (APIENTRY *RegisterTouchWindowPROC) (uintptr_t, jint);
typedef jint (APIENTRY *UnregisterTouchWindowPROC) (uintptr_t);
typedef jint (APIENTRY *GetTouchInputInfoPROC) (uintptr_t, jint, uintptr_t, jint);
typedef jint (APIENTRY *CloseTouchInputHandlePROC) (uintptr_t);

EXTERN_C_ENTER

JNIEXPORT jshort JNICALL Java_org_lwjgl_system_windows_User32_nRegisterClassEx(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong lpwcxAddress, jlong __functionAddress) {
    RegisterClassExWPROC RegisterClassExW = (RegisterClassExWPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t lpwcx = (uintptr_t)lpwcxAddress;
    jshort __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jshort)RegisterClassExW(lpwcx);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nUnregisterClass(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong lpClassNameAddress, jlong hInstanceAddress, jlong __functionAddress) {
    UnregisterClassWPROC UnregisterClassW = (UnregisterClassWPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t lpClassName = (uintptr_t)lpClassNameAddress;
    uintptr_t hInstance = (uintptr_t)hInstanceAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = UnregisterClassW(lpClassName, hInstance);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_User32_nCreateWindowEx(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jint dwExStyle, jlong lpClassNameAddress, jlong lpWindowNameAddress, jint dwStyle, jint x, jint y, jint nWidth, jint nHeight, jlong hWndParentAddress, jlong hMenuAddress, jlong hInstanceAddress, jlong lpParamAddress, jlong __functionAddress) {
    CreateWindowExWPROC CreateWindowExW = (CreateWindowExWPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t lpClassName = (uintptr_t)lpClassNameAddress;
    uintptr_t lpWindowName = (uintptr_t)lpWindowNameAddress;
    uintptr_t hWndParent = (uintptr_t)hWndParentAddress;
    uintptr_t hMenu = (uintptr_t)hMenuAddress;
    uintptr_t hInstance = (uintptr_t)hInstanceAddress;
    uintptr_t lpParam = (uintptr_t)lpParamAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)CreateWindowExW(dwExStyle, lpClassName, lpWindowName, dwStyle, x, y, nWidth, nHeight, hWndParent, hMenu, hInstance, lpParam);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nDestroyWindow(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong hWndAddress, jlong __functionAddress) {
    DestroyWindowPROC DestroyWindow = (DestroyWindowPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t hWnd = (uintptr_t)hWndAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = DestroyWindow(hWnd);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nSetWindowPos(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong hWndAddress, jlong hWndInsertAfterAddress, jint X, jint Y, jint cx, jint cy, jint uFlags, jlong __functionAddress) {
    SetWindowPosPROC SetWindowPos = (SetWindowPosPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t hWnd = (uintptr_t)hWndAddress;
    uintptr_t hWndInsertAfter = (uintptr_t)hWndInsertAfterAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = SetWindowPos(hWnd, hWndInsertAfter, X, Y, cx, cy, uFlags);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nSetWindowText(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong hWndAddress, jlong lpStringAddress, jlong __functionAddress) {
    SetWindowTextWPROC SetWindowTextW = (SetWindowTextWPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t hWnd = (uintptr_t)hWndAddress;
    uintptr_t lpString = (uintptr_t)lpStringAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = SetWindowTextW(hWnd, lpString);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nGetMessage(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong lpMsgAddress, jlong hWndAddress, jint wMsgFilterMin, jint wMsgFilterMax, jlong __functionAddress) {
    GetMessageWPROC GetMessageW = (GetMessageWPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t lpMsg = (uintptr_t)lpMsgAddress;
    uintptr_t hWnd = (uintptr_t)hWndAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = GetMessageW(lpMsg, hWnd, wMsgFilterMin, wMsgFilterMax);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nWaitMessage(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong __functionAddress) {
    WaitMessagePROC WaitMessage = (WaitMessagePROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = WaitMessage();
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nPostMessage(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong hWndAddress, jint Msg, jlong wParam, jlong lParam, jlong __functionAddress) {
    PostMessageWPROC PostMessageW = (PostMessageWPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t hWnd = (uintptr_t)hWndAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = PostMessageW(hWnd, Msg, (uintptr_t)wParam, (uintptr_t)lParam);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nSendMessage(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong hWndAddress, jint Msg, jlong wParam, jlong lParam, jlong __functionAddress) {
    SendMessageWPROC SendMessageW = (SendMessageWPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t hWnd = (uintptr_t)hWndAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = SendMessageW(hWnd, Msg, (uintptr_t)wParam, (uintptr_t)lParam);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nAdjustWindowRectEx(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong lpRectAddress, jint dwStyle, jint bMenu, jint dwExStyle, jlong __functionAddress) {
    AdjustWindowRectExPROC AdjustWindowRectEx = (AdjustWindowRectExPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t lpRect = (uintptr_t)lpRectAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = AdjustWindowRectEx(lpRect, dwStyle, bMenu, dwExStyle);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nGetWindowRect(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong hWndAddress, jlong lpRectAddress, jlong __functionAddress) {
    GetWindowRectPROC GetWindowRect = (GetWindowRectPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t hWnd = (uintptr_t)hWndAddress;
    uintptr_t lpRect = (uintptr_t)lpRectAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = GetWindowRect(hWnd, lpRect);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nMoveWindow(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong hWndAddress, jint X, jint Y, jint nWidth, jint nHeight, jint bRepaint, jlong __functionAddress) {
    MoveWindowPROC MoveWindow = (MoveWindowPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t hWnd = (uintptr_t)hWndAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = MoveWindow(hWnd, X, Y, nWidth, nHeight, bRepaint);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nGetWindowPlacement(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong hWndAddress, jlong lpwndplAddress, jlong __functionAddress) {
    GetWindowPlacementPROC GetWindowPlacement = (GetWindowPlacementPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t hWnd = (uintptr_t)hWndAddress;
    uintptr_t lpwndpl = (uintptr_t)lpwndplAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = GetWindowPlacement(hWnd, lpwndpl);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nSetWindowPlacement(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong hWndAddress, jlong lpwndplAddress, jlong __functionAddress) {
    SetWindowPlacementPROC SetWindowPlacement = (SetWindowPlacementPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t hWnd = (uintptr_t)hWndAddress;
    uintptr_t lpwndpl = (uintptr_t)lpwndplAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = SetWindowPlacement(hWnd, lpwndpl);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_User32_nSetWindowLongPtr(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong hWndAddress, jint nIndex, jlong dwNewLong, jlong __functionAddress) {
    SetWindowLongPtrPROC SetWindowLongPtr = (SetWindowLongPtrPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t hWnd = (uintptr_t)hWndAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)SetWindowLongPtr(hWnd, nIndex, (uintptr_t)dwNewLong);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_User32_nGetWindowLongPtr(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong hWndAddress, jint nIndex, jlong __functionAddress) {
    GetWindowLongPtrPROC GetWindowLongPtr = (GetWindowLongPtrPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t hWnd = (uintptr_t)hWndAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)GetWindowLongPtr(hWnd, nIndex);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_User32_nSetClassLongPtr(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong hWndAddress, jint nIndex, jlong dwNewLong, jlong __functionAddress) {
    SetClassLongPtrPROC SetClassLongPtr = (SetClassLongPtrPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t hWnd = (uintptr_t)hWndAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)SetClassLongPtr(hWnd, nIndex, (uintptr_t)dwNewLong);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_User32_nGetClassLongPtr(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong hWndAddress, jint nIndex, jlong __functionAddress) {
    GetClassLongPtrPROC GetClassLongPtr = (GetClassLongPtrPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t hWnd = (uintptr_t)hWndAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)GetClassLongPtr(hWnd, nIndex);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nSetLayeredWindowAttributes(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong hwndAddress, jint crKey, jbyte bAlpha, jint dwFlags, jlong __functionAddress) {
    SetLayeredWindowAttributesPROC SetLayeredWindowAttributes = (SetLayeredWindowAttributesPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t hwnd = (uintptr_t)hwndAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = SetLayeredWindowAttributes(hwnd, crKey, bAlpha, dwFlags);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_User32_nLoadIcon(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong instanceAddress, jlong iconNameAddress, jlong __functionAddress) {
    LoadIconWPROC LoadIconW = (LoadIconWPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t instance = (uintptr_t)instanceAddress;
    uintptr_t iconName = (uintptr_t)iconNameAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)LoadIconW(instance, iconName);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_User32_nLoadCursor(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong instanceAddress, jlong cursorNameAddress, jlong __functionAddress) {
    LoadCursorWPROC LoadCursorW = (LoadCursorWPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t instance = (uintptr_t)instanceAddress;
    uintptr_t cursorName = (uintptr_t)cursorNameAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)LoadCursorW(instance, cursorName);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nRegisterTouchWindow(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong hWndAddress, jint ulFlags, jlong __functionAddress) {
    RegisterTouchWindowPROC RegisterTouchWindow = (RegisterTouchWindowPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t hWnd = (uintptr_t)hWndAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = RegisterTouchWindow(hWnd, ulFlags);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nUnregisterTouchWindow(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong hWndAddress, jlong __functionAddress) {
    UnregisterTouchWindowPROC UnregisterTouchWindow = (UnregisterTouchWindowPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t hWnd = (uintptr_t)hWndAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = UnregisterTouchWindow(hWnd);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nGetTouchInputInfo(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong hTouchInputAddress, jint cInputs, jlong pInputsAddress, jint cbSize, jlong __functionAddress) {
    GetTouchInputInfoPROC GetTouchInputInfo = (GetTouchInputInfoPROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t hTouchInput = (uintptr_t)hTouchInputAddress;
    uintptr_t pInputs = (uintptr_t)pInputsAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = GetTouchInputInfo(hTouchInput, cInputs, pInputs, cbSize);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_windows_User32_nCloseTouchInputHandle(JNIEnv *__env, jclass clazz, jlong _GetLastErrorAddress, jlong hTouchInputAddress, jlong __functionAddress) {
    CloseTouchInputHandlePROC CloseTouchInputHandle = (CloseTouchInputHandlePROC)(uintptr_t)__functionAddress;
    DWORD *_GetLastError = (DWORD *)(uintptr_t)_GetLastErrorAddress;
    uintptr_t hTouchInput = (uintptr_t)hTouchInputAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = CloseTouchInputHandle(hTouchInput);
    if (_GetLastError != NULL) *_GetLastError = GetLastError();
    return __result;
}

EXTERN_C_EXIT
