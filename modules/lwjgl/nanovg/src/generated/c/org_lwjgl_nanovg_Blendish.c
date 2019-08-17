/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"

#include "nanovg.h"
#define BLENDISH_IMPLEMENTATION
#define BLENDISH_NO_NVG_TYPEDEFS
#include "blendish.h"

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndSetTheme(JNIEnv *__env, jclass clazz, jlong themeAddress) {
    BNDtheme *theme = (BNDtheme *)(intptr_t)themeAddress;
    UNUSED_PARAMS(__env, clazz)
    bndSetTheme(*theme);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nanovg_Blendish_nbndGetTheme(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)bndGetTheme();
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_bndSetIconImage(JNIEnv *__env, jclass clazz, jint image) {
    UNUSED_PARAMS(__env, clazz)
    bndSetIconImage(image);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_bndSetFont(JNIEnv *__env, jclass clazz, jint font) {
    UNUSED_PARAMS(__env, clazz)
    bndSetFont(font);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndLabel(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint iconid, jlong labelAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    UNUSED_PARAMS(__env, clazz)
    bndLabel(ctx, x, y, w, h, iconid, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndToolButton(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint flags, jint state, jint iconid, jlong labelAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    UNUSED_PARAMS(__env, clazz)
    bndToolButton(ctx, x, y, w, h, flags, (BNDwidgetState)state, iconid, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndRadioButton(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint flags, jint state, jint iconid, jlong labelAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    UNUSED_PARAMS(__env, clazz)
    bndRadioButton(ctx, x, y, w, h, flags, (BNDwidgetState)state, iconid, label);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_Blendish_nbndTextFieldTextPosition(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint iconid, jlong textAddress, jint px, jint py) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)bndTextFieldTextPosition(ctx, x, y, w, h, iconid, text, px, py);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndTextField(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint flags, jint state, jint iconid, jlong textAddress, jint cbegin, jint cend) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    bndTextField(ctx, x, y, w, h, flags, (BNDwidgetState)state, iconid, text, cbegin, cend);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndOptionButton(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint state, jlong labelAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    UNUSED_PARAMS(__env, clazz)
    bndOptionButton(ctx, x, y, w, h, (BNDwidgetState)state, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndChoiceButton(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint flags, jint state, jint iconid, jlong labelAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    UNUSED_PARAMS(__env, clazz)
    bndChoiceButton(ctx, x, y, w, h, flags, (BNDwidgetState)state, iconid, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndColorButton(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint flags, jlong colorAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    bndColorButton(ctx, x, y, w, h, flags, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndNumberField(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint flags, jint state, jlong labelAddress, jlong valueAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    char const *value = (char const *)(intptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    bndNumberField(ctx, x, y, w, h, flags, (BNDwidgetState)state, label, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndSlider(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint flags, jint state, jfloat progress, jlong labelAddress, jlong valueAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    char const *value = (char const *)(intptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    bndSlider(ctx, x, y, w, h, flags, (BNDwidgetState)state, progress, label, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndScrollBar(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint state, jfloat offset, jfloat size) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    bndScrollBar(ctx, x, y, w, h, (BNDwidgetState)state, offset, size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndMenuBackground(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint flags) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    bndMenuBackground(ctx, x, y, w, h, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndMenuLabel(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint iconid, jlong labelAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    UNUSED_PARAMS(__env, clazz)
    bndMenuLabel(ctx, x, y, w, h, iconid, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndMenuItem(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint state, jint iconid, jlong labelAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    UNUSED_PARAMS(__env, clazz)
    bndMenuItem(ctx, x, y, w, h, (BNDwidgetState)state, iconid, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndTooltipBackground(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    bndTooltipBackground(ctx, x, y, w, h);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndNodePort(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jint state, jlong colorAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    bndNodePort(ctx, x, y, (BNDwidgetState)state, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndNodeWire(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x0, jfloat y0, jfloat x1, jfloat y1, jint state0, jint state1) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    bndNodeWire(ctx, x0, y0, x1, y1, (BNDwidgetState)state0, (BNDwidgetState)state1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndColoredNodeWire(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x0, jfloat y0, jfloat x1, jfloat y1, jlong color0Address, jlong color1Address) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *color0 = (NVGcolor *)(intptr_t)color0Address;
    NVGcolor *color1 = (NVGcolor *)(intptr_t)color1Address;
    UNUSED_PARAMS(__env, clazz)
    bndColoredNodeWire(ctx, x0, y0, x1, y1, *color0, *color1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndNodeBackground(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint state, jint iconid, jlong labelAddress, jlong titleColorAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    NVGcolor *titleColor = (NVGcolor *)(intptr_t)titleColorAddress;
    UNUSED_PARAMS(__env, clazz)
    bndNodeBackground(ctx, x, y, w, h, (BNDwidgetState)state, iconid, label, *titleColor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndSplitterWidgets(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    bndSplitterWidgets(ctx, x, y, w, h);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndJoinAreaOverlay(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint vertical, jint mirror) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    bndJoinAreaOverlay(ctx, x, y, w, h, vertical, mirror);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_nanovg_Blendish_nbndLabelWidth(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint iconid, jlong labelAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)bndLabelWidth(ctx, iconid, label);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_nanovg_Blendish_nbndLabelHeight(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint iconid, jlong labelAddress, jfloat width) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)bndLabelHeight(ctx, iconid, label, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndTransparent(JNIEnv *__env, jclass clazz, jlong colorAddress, jlong __result) {
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((NVGcolor*)(intptr_t)__result) = bndTransparent(*color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndOffsetColor(JNIEnv *__env, jclass clazz, jlong colorAddress, jint delta, jlong __result) {
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((NVGcolor*)(intptr_t)__result) = bndOffsetColor(*color, delta);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndSelectCorners__JFI(JNIEnv *__env, jclass clazz, jlong radiusesAddress, jfloat r, jint flags) {
    float *radiuses = (float *)(intptr_t)radiusesAddress;
    UNUSED_PARAMS(__env, clazz)
    bndSelectCorners(radiuses, r, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndInnerColors(JNIEnv *__env, jclass clazz, jlong shade_topAddress, jlong shade_downAddress, jlong themeAddress, jint state, jint flipActive) {
    NVGcolor *shade_top = (NVGcolor *)(intptr_t)shade_topAddress;
    NVGcolor *shade_down = (NVGcolor *)(intptr_t)shade_downAddress;
    BNDwidgetTheme const *theme = (BNDwidgetTheme const *)(intptr_t)themeAddress;
    UNUSED_PARAMS(__env, clazz)
    bndInnerColors(shade_top, shade_down, theme, (BNDwidgetState)state, flipActive);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndTextColor(JNIEnv *__env, jclass clazz, jlong themeAddress, jint state, jlong __result) {
    BNDwidgetTheme const *theme = (BNDwidgetTheme const *)(intptr_t)themeAddress;
    UNUSED_PARAMS(__env, clazz)
    *((NVGcolor*)(intptr_t)__result) = bndTextColor(theme, (BNDwidgetState)state);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndScrollHandleRect__JJJJFF(JNIEnv *__env, jclass clazz, jlong xAddress, jlong yAddress, jlong wAddress, jlong hAddress, jfloat offset, jfloat size) {
    float *x = (float *)(intptr_t)xAddress;
    float *y = (float *)(intptr_t)yAddress;
    float *w = (float *)(intptr_t)wAddress;
    float *h = (float *)(intptr_t)hAddress;
    UNUSED_PARAMS(__env, clazz)
    bndScrollHandleRect(x, y, w, h, offset, size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndRoundedBox(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jfloat cr0, jfloat cr1, jfloat cr2, jfloat cr3) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    bndRoundedBox(ctx, x, y, w, h, cr0, cr1, cr2, cr3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndBackground(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    bndBackground(ctx, x, y, w, h);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndBevel(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    bndBevel(ctx, x, y, w, h);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndBevelInset(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jfloat cr2, jfloat cr3) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    bndBevelInset(ctx, x, y, w, h, cr2, cr3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndIcon(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jint iconid) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    bndIcon(ctx, x, y, iconid);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndDropShadow(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jfloat r, jfloat feather, jfloat alpha) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    bndDropShadow(ctx, x, y, w, h, r, feather, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndInnerBox(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jfloat cr0, jfloat cr1, jfloat cr2, jfloat cr3, jlong shade_topAddress, jlong shade_downAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *shade_top = (NVGcolor *)(intptr_t)shade_topAddress;
    NVGcolor *shade_down = (NVGcolor *)(intptr_t)shade_downAddress;
    UNUSED_PARAMS(__env, clazz)
    bndInnerBox(ctx, x, y, w, h, cr0, cr1, cr2, cr3, *shade_top, *shade_down);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndOutlineBox(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jfloat cr0, jfloat cr1, jfloat cr2, jfloat cr3, jlong colorAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    bndOutlineBox(ctx, x, y, w, h, cr0, cr1, cr2, cr3, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndIconLabelValue(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint iconid, jlong colorAddress, jint align, jfloat fontsize, jlong labelAddress, jlong valueAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    char const *value = (char const *)(intptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    bndIconLabelValue(ctx, x, y, w, h, iconid, *color, align, fontsize, label, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndNodeIconLabel(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint iconid, jlong colorAddress, jlong shadowColorAddress, jint align, jfloat fontsize, jlong labelAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    NVGcolor *shadowColor = (NVGcolor *)(intptr_t)shadowColorAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    UNUSED_PARAMS(__env, clazz)
    bndNodeIconLabel(ctx, x, y, w, h, iconid, *color, *shadowColor, align, fontsize, label);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_Blendish_nbndIconLabelTextPosition(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint iconid, jfloat fontsize, jlong labelAddress, jint px, jint py) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)bndIconLabelTextPosition(ctx, x, y, w, h, iconid, fontsize, label, px, py);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndIconLabelCaret(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint iconid, jlong colorAddress, jfloat fontsize, jlong labelAddress, jlong caretcolorAddress, jint cbegin, jint cend) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    NVGcolor *caretcolor = (NVGcolor *)(intptr_t)caretcolorAddress;
    UNUSED_PARAMS(__env, clazz)
    bndIconLabelCaret(ctx, x, y, w, h, iconid, *color, fontsize, label, *caretcolor, cbegin, cend);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndCheck(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat ox, jfloat oy, jlong colorAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    bndCheck(ctx, ox, oy, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndArrow(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat s, jlong colorAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    bndArrow(ctx, x, y, s, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndUpDownArrow(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat s, jlong colorAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    bndUpDownArrow(ctx, x, y, s, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndNodeArrowDown(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat s, jlong colorAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    bndNodeArrowDown(ctx, x, y, s, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndNodeWireColor(JNIEnv *__env, jclass clazz, jlong themeAddress, jint state, jlong __result) {
    BNDnodeTheme const *theme = (BNDnodeTheme const *)(intptr_t)themeAddress;
    UNUSED_PARAMS(__env, clazz)
    *((NVGcolor*)(intptr_t)__result) = bndNodeWireColor(theme, (BNDwidgetState)state);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndSelectCorners___3FFI(JNIEnv *__env, jclass clazz, jfloatArray radiusesAddress, jfloat r, jint flags) {
    jfloat *radiuses = (*__env)->GetFloatArrayElements(__env, radiusesAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    bndSelectCorners((float *)radiuses, r, flags);
    (*__env)->ReleaseFloatArrayElements(__env, radiusesAddress, radiuses, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndScrollHandleRect___3F_3F_3F_3FFF(JNIEnv *__env, jclass clazz, jfloatArray xAddress, jfloatArray yAddress, jfloatArray wAddress, jfloatArray hAddress, jfloat offset, jfloat size) {
    jfloat *x = (*__env)->GetFloatArrayElements(__env, xAddress, NULL);
    jfloat *y = (*__env)->GetFloatArrayElements(__env, yAddress, NULL);
    jfloat *w = (*__env)->GetFloatArrayElements(__env, wAddress, NULL);
    jfloat *h = (*__env)->GetFloatArrayElements(__env, hAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    bndScrollHandleRect((float *)x, (float *)y, (float *)w, (float *)h, offset, size);
    (*__env)->ReleaseFloatArrayElements(__env, hAddress, h, 0);
    (*__env)->ReleaseFloatArrayElements(__env, wAddress, w, 0);
    (*__env)->ReleaseFloatArrayElements(__env, yAddress, y, 0);
    (*__env)->ReleaseFloatArrayElements(__env, xAddress, x, 0);
}

EXTERN_C_EXIT
