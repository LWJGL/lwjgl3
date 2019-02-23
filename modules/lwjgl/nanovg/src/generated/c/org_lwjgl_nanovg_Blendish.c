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

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_Blendish_nbndSetTheme(jlong themeAddress) {
    BNDtheme *theme = (BNDtheme *)(intptr_t)themeAddress;
    bndSetTheme(*theme);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndSetTheme(JNIEnv *__env, jclass clazz, jlong themeAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_Blendish_nbndSetTheme(themeAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nanovg_Blendish_nbndGetTheme(void) {
    return (jlong)(intptr_t)bndGetTheme();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_nanovg_Blendish_nbndGetTheme(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_Blendish_nbndGetTheme();
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_Blendish_bndSetIconImage(jint image) {
    bndSetIconImage(image);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_bndSetIconImage(JNIEnv *__env, jclass clazz, jint image) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_Blendish_bndSetIconImage(image);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_Blendish_bndSetFont(jint font) {
    bndSetFont(font);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_bndSetFont(JNIEnv *__env, jclass clazz, jint font) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_Blendish_bndSetFont(font);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndLabel)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint iconid, jlong labelAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    bndLabel(ctx, x, y, w, h, iconid, label);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndLabel(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint iconid, jlong labelAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndLabel)(ctxAddress, x, y, w, h, iconid, labelAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndToolButton)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint flags, jint state, jint iconid, jlong labelAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    bndToolButton(ctx, x, y, w, h, flags, (BNDwidgetState)state, iconid, label);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndToolButton(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint flags, jint state, jint iconid, jlong labelAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndToolButton)(ctxAddress, x, y, w, h, flags, state, iconid, labelAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndRadioButton)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint flags, jint state, jint iconid, jlong labelAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    bndRadioButton(ctx, x, y, w, h, flags, (BNDwidgetState)state, iconid, label);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndRadioButton(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint flags, jint state, jint iconid, jlong labelAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndRadioButton)(ctxAddress, x, y, w, h, flags, state, iconid, labelAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndTextFieldTextPosition)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint iconid, jlong textAddress, jint px, jint py) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    return (jint)bndTextFieldTextPosition(ctx, x, y, w, h, iconid, text, px, py);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_Blendish_nbndTextFieldTextPosition(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint iconid, jlong textAddress, jint px, jint py) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_nanovg_Blendish_nbndTextFieldTextPosition)(ctxAddress, x, y, w, h, iconid, textAddress, px, py);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndTextField)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint flags, jint state, jint iconid, jlong textAddress, jint cbegin, jint cend) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *text = (char const *)(intptr_t)textAddress;
    bndTextField(ctx, x, y, w, h, flags, (BNDwidgetState)state, iconid, text, cbegin, cend);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndTextField(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint flags, jint state, jint iconid, jlong textAddress, jint cbegin, jint cend) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndTextField)(ctxAddress, x, y, w, h, flags, state, iconid, textAddress, cbegin, cend);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndOptionButton)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint state, jlong labelAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    bndOptionButton(ctx, x, y, w, h, (BNDwidgetState)state, label);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndOptionButton(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint state, jlong labelAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndOptionButton)(ctxAddress, x, y, w, h, state, labelAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndChoiceButton)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint flags, jint state, jint iconid, jlong labelAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    bndChoiceButton(ctx, x, y, w, h, flags, (BNDwidgetState)state, iconid, label);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndChoiceButton(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint flags, jint state, jint iconid, jlong labelAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndChoiceButton)(ctxAddress, x, y, w, h, flags, state, iconid, labelAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndColorButton)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint flags, jlong colorAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    bndColorButton(ctx, x, y, w, h, flags, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndColorButton(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint flags, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndColorButton)(ctxAddress, x, y, w, h, flags, colorAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndNumberField)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint flags, jint state, jlong labelAddress, jlong valueAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    char const *value = (char const *)(intptr_t)valueAddress;
    bndNumberField(ctx, x, y, w, h, flags, (BNDwidgetState)state, label, value);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndNumberField(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint flags, jint state, jlong labelAddress, jlong valueAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndNumberField)(ctxAddress, x, y, w, h, flags, state, labelAddress, valueAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndSlider)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint flags, jint state, jfloat progress, jlong labelAddress, jlong valueAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    char const *value = (char const *)(intptr_t)valueAddress;
    bndSlider(ctx, x, y, w, h, flags, (BNDwidgetState)state, progress, label, value);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndSlider(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint flags, jint state, jfloat progress, jlong labelAddress, jlong valueAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndSlider)(ctxAddress, x, y, w, h, flags, state, progress, labelAddress, valueAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndScrollBar)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint state, jfloat offset, jfloat size) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    bndScrollBar(ctx, x, y, w, h, (BNDwidgetState)state, offset, size);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndScrollBar(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint state, jfloat offset, jfloat size) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndScrollBar)(ctxAddress, x, y, w, h, state, offset, size);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndMenuBackground)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint flags) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    bndMenuBackground(ctx, x, y, w, h, flags);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndMenuBackground(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndMenuBackground)(ctxAddress, x, y, w, h, flags);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndMenuLabel)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint iconid, jlong labelAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    bndMenuLabel(ctx, x, y, w, h, iconid, label);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndMenuLabel(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint iconid, jlong labelAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndMenuLabel)(ctxAddress, x, y, w, h, iconid, labelAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndMenuItem)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint state, jint iconid, jlong labelAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    bndMenuItem(ctx, x, y, w, h, (BNDwidgetState)state, iconid, label);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndMenuItem(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint state, jint iconid, jlong labelAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndMenuItem)(ctxAddress, x, y, w, h, state, iconid, labelAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_Blendish_nbndTooltipBackground(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    bndTooltipBackground(ctx, x, y, w, h);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndTooltipBackground(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_Blendish_nbndTooltipBackground(ctxAddress, x, y, w, h);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_Blendish_nbndNodePort(jlong ctxAddress, jfloat x, jfloat y, jint state, jlong colorAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    bndNodePort(ctx, x, y, (BNDwidgetState)state, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndNodePort(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jint state, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_Blendish_nbndNodePort(ctxAddress, x, y, state, colorAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndNodeWire)(jlong ctxAddress, jfloat x0, jfloat y0, jfloat x1, jfloat y1, jint state0, jint state1) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    bndNodeWire(ctx, x0, y0, x1, y1, (BNDwidgetState)state0, (BNDwidgetState)state1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndNodeWire(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x0, jfloat y0, jfloat x1, jfloat y1, jint state0, jint state1) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndNodeWire)(ctxAddress, x0, y0, x1, y1, state0, state1);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndColoredNodeWire)(jlong ctxAddress, jfloat x0, jfloat y0, jfloat x1, jfloat y1, jlong color0Address, jlong color1Address) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *color0 = (NVGcolor *)(intptr_t)color0Address;
    NVGcolor *color1 = (NVGcolor *)(intptr_t)color1Address;
    bndColoredNodeWire(ctx, x0, y0, x1, y1, *color0, *color1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndColoredNodeWire(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x0, jfloat y0, jfloat x1, jfloat y1, jlong color0Address, jlong color1Address) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndColoredNodeWire)(ctxAddress, x0, y0, x1, y1, color0Address, color1Address);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndNodeBackground)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint state, jint iconid, jlong labelAddress, jlong titleColorAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    NVGcolor *titleColor = (NVGcolor *)(intptr_t)titleColorAddress;
    bndNodeBackground(ctx, x, y, w, h, (BNDwidgetState)state, iconid, label, *titleColor);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndNodeBackground(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint state, jint iconid, jlong labelAddress, jlong titleColorAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndNodeBackground)(ctxAddress, x, y, w, h, state, iconid, labelAddress, titleColorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_Blendish_nbndSplitterWidgets(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    bndSplitterWidgets(ctx, x, y, w, h);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndSplitterWidgets(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_Blendish_nbndSplitterWidgets(ctxAddress, x, y, w, h);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndJoinAreaOverlay)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint vertical, jint mirror) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    bndJoinAreaOverlay(ctx, x, y, w, h, vertical, mirror);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndJoinAreaOverlay(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint vertical, jint mirror) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndJoinAreaOverlay)(ctxAddress, x, y, w, h, vertical, mirror);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_nanovg_Blendish_nbndLabelWidth(jlong ctxAddress, jint iconid, jlong labelAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    return (jfloat)bndLabelWidth(ctx, iconid, label);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_nanovg_Blendish_nbndLabelWidth(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint iconid, jlong labelAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_Blendish_nbndLabelWidth(ctxAddress, iconid, labelAddress);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_nanovg_Blendish_nbndLabelHeight(jlong ctxAddress, jint iconid, jlong labelAddress, jfloat width) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    return (jfloat)bndLabelHeight(ctx, iconid, label, width);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_nanovg_Blendish_nbndLabelHeight(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint iconid, jlong labelAddress, jfloat width) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_Blendish_nbndLabelHeight(ctxAddress, iconid, labelAddress, width);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_Blendish_nbndTransparent(jlong colorAddress, jlong __result) {
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    *((NVGcolor*)(intptr_t)__result) = bndTransparent(*color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndTransparent(JNIEnv *__env, jclass clazz, jlong colorAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_Blendish_nbndTransparent(colorAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_Blendish_nbndOffsetColor(jlong colorAddress, jint delta, jlong __result) {
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    *((NVGcolor*)(intptr_t)__result) = bndOffsetColor(*color, delta);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndOffsetColor(JNIEnv *__env, jclass clazz, jlong colorAddress, jint delta, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_Blendish_nbndOffsetColor(colorAddress, delta, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_Blendish_nbndSelectCorners__JFI(jlong radiusesAddress, jfloat r, jint flags) {
    float *radiuses = (float *)(intptr_t)radiusesAddress;
    bndSelectCorners(radiuses, r, flags);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndSelectCorners__JFI(JNIEnv *__env, jclass clazz, jlong radiusesAddress, jfloat r, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_Blendish_nbndSelectCorners__JFI(radiusesAddress, r, flags);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_Blendish_nbndInnerColors(jlong shade_topAddress, jlong shade_downAddress, jlong themeAddress, jint state, jint flipActive) {
    NVGcolor *shade_top = (NVGcolor *)(intptr_t)shade_topAddress;
    NVGcolor *shade_down = (NVGcolor *)(intptr_t)shade_downAddress;
    BNDwidgetTheme const *theme = (BNDwidgetTheme const *)(intptr_t)themeAddress;
    bndInnerColors(shade_top, shade_down, theme, (BNDwidgetState)state, flipActive);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndInnerColors(JNIEnv *__env, jclass clazz, jlong shade_topAddress, jlong shade_downAddress, jlong themeAddress, jint state, jint flipActive) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_Blendish_nbndInnerColors(shade_topAddress, shade_downAddress, themeAddress, state, flipActive);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_Blendish_nbndTextColor(jlong themeAddress, jint state, jlong __result) {
    BNDwidgetTheme const *theme = (BNDwidgetTheme const *)(intptr_t)themeAddress;
    *((NVGcolor*)(intptr_t)__result) = bndTextColor(theme, (BNDwidgetState)state);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndTextColor(JNIEnv *__env, jclass clazz, jlong themeAddress, jint state, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_Blendish_nbndTextColor(themeAddress, state, __result);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndScrollHandleRect__JJJJFF)(jlong xAddress, jlong yAddress, jlong wAddress, jlong hAddress, jfloat offset, jfloat size) {
    float *x = (float *)(intptr_t)xAddress;
    float *y = (float *)(intptr_t)yAddress;
    float *w = (float *)(intptr_t)wAddress;
    float *h = (float *)(intptr_t)hAddress;
    bndScrollHandleRect(x, y, w, h, offset, size);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndScrollHandleRect__JJJJFF(JNIEnv *__env, jclass clazz, jlong xAddress, jlong yAddress, jlong wAddress, jlong hAddress, jfloat offset, jfloat size) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndScrollHandleRect__JJJJFF)(xAddress, yAddress, wAddress, hAddress, offset, size);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndRoundedBox)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jfloat cr0, jfloat cr1, jfloat cr2, jfloat cr3) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    bndRoundedBox(ctx, x, y, w, h, cr0, cr1, cr2, cr3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndRoundedBox(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jfloat cr0, jfloat cr1, jfloat cr2, jfloat cr3) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndRoundedBox)(ctxAddress, x, y, w, h, cr0, cr1, cr2, cr3);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_Blendish_nbndBackground(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    bndBackground(ctx, x, y, w, h);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndBackground(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_Blendish_nbndBackground(ctxAddress, x, y, w, h);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_Blendish_nbndBevel(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    bndBevel(ctx, x, y, w, h);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndBevel(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_Blendish_nbndBevel(ctxAddress, x, y, w, h);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndBevelInset)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jfloat cr2, jfloat cr3) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    bndBevelInset(ctx, x, y, w, h, cr2, cr3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndBevelInset(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jfloat cr2, jfloat cr3) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndBevelInset)(ctxAddress, x, y, w, h, cr2, cr3);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_Blendish_nbndIcon(jlong ctxAddress, jfloat x, jfloat y, jint iconid) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    bndIcon(ctx, x, y, iconid);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndIcon(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jint iconid) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_Blendish_nbndIcon(ctxAddress, x, y, iconid);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndDropShadow)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jfloat r, jfloat feather, jfloat alpha) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    bndDropShadow(ctx, x, y, w, h, r, feather, alpha);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndDropShadow(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jfloat r, jfloat feather, jfloat alpha) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndDropShadow)(ctxAddress, x, y, w, h, r, feather, alpha);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndInnerBox)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jfloat cr0, jfloat cr1, jfloat cr2, jfloat cr3, jlong shade_topAddress, jlong shade_downAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *shade_top = (NVGcolor *)(intptr_t)shade_topAddress;
    NVGcolor *shade_down = (NVGcolor *)(intptr_t)shade_downAddress;
    bndInnerBox(ctx, x, y, w, h, cr0, cr1, cr2, cr3, *shade_top, *shade_down);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndInnerBox(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jfloat cr0, jfloat cr1, jfloat cr2, jfloat cr3, jlong shade_topAddress, jlong shade_downAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndInnerBox)(ctxAddress, x, y, w, h, cr0, cr1, cr2, cr3, shade_topAddress, shade_downAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndOutlineBox)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jfloat cr0, jfloat cr1, jfloat cr2, jfloat cr3, jlong colorAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    bndOutlineBox(ctx, x, y, w, h, cr0, cr1, cr2, cr3, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndOutlineBox(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jfloat cr0, jfloat cr1, jfloat cr2, jfloat cr3, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndOutlineBox)(ctxAddress, x, y, w, h, cr0, cr1, cr2, cr3, colorAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndIconLabelValue)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint iconid, jlong colorAddress, jint align, jfloat fontsize, jlong labelAddress, jlong valueAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    char const *value = (char const *)(intptr_t)valueAddress;
    bndIconLabelValue(ctx, x, y, w, h, iconid, *color, align, fontsize, label, value);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndIconLabelValue(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint iconid, jlong colorAddress, jint align, jfloat fontsize, jlong labelAddress, jlong valueAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndIconLabelValue)(ctxAddress, x, y, w, h, iconid, colorAddress, align, fontsize, labelAddress, valueAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndNodeIconLabel)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint iconid, jlong colorAddress, jlong shadowColorAddress, jint align, jfloat fontsize, jlong labelAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    NVGcolor *shadowColor = (NVGcolor *)(intptr_t)shadowColorAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    bndNodeIconLabel(ctx, x, y, w, h, iconid, *color, *shadowColor, align, fontsize, label);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndNodeIconLabel(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint iconid, jlong colorAddress, jlong shadowColorAddress, jint align, jfloat fontsize, jlong labelAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndNodeIconLabel)(ctxAddress, x, y, w, h, iconid, colorAddress, shadowColorAddress, align, fontsize, labelAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndIconLabelTextPosition)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint iconid, jfloat fontsize, jlong labelAddress, jint px, jint py) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    return (jint)bndIconLabelTextPosition(ctx, x, y, w, h, iconid, fontsize, label, px, py);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_Blendish_nbndIconLabelTextPosition(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint iconid, jfloat fontsize, jlong labelAddress, jint px, jint py) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_nanovg_Blendish_nbndIconLabelTextPosition)(ctxAddress, x, y, w, h, iconid, fontsize, labelAddress, px, py);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_Blendish_nbndIconLabelCaret)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint iconid, jlong colorAddress, jfloat fontsize, jlong labelAddress, jlong caretcolorAddress, jint cbegin, jint cend) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    char const *label = (char const *)(intptr_t)labelAddress;
    NVGcolor *caretcolor = (NVGcolor *)(intptr_t)caretcolorAddress;
    bndIconLabelCaret(ctx, x, y, w, h, iconid, *color, fontsize, label, *caretcolor, cbegin, cend);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndIconLabelCaret(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jint iconid, jlong colorAddress, jfloat fontsize, jlong labelAddress, jlong caretcolorAddress, jint cbegin, jint cend) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndIconLabelCaret)(ctxAddress, x, y, w, h, iconid, colorAddress, fontsize, labelAddress, caretcolorAddress, cbegin, cend);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_Blendish_nbndCheck(jlong ctxAddress, jfloat ox, jfloat oy, jlong colorAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    bndCheck(ctx, ox, oy, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndCheck(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat ox, jfloat oy, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_Blendish_nbndCheck(ctxAddress, ox, oy, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_Blendish_nbndArrow(jlong ctxAddress, jfloat x, jfloat y, jfloat s, jlong colorAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    bndArrow(ctx, x, y, s, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndArrow(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat s, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_Blendish_nbndArrow(ctxAddress, x, y, s, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_Blendish_nbndUpDownArrow(jlong ctxAddress, jfloat x, jfloat y, jfloat s, jlong colorAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    bndUpDownArrow(ctx, x, y, s, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndUpDownArrow(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat s, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_Blendish_nbndUpDownArrow(ctxAddress, x, y, s, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_Blendish_nbndNodeArrowDown(jlong ctxAddress, jfloat x, jfloat y, jfloat s, jlong colorAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    bndNodeArrowDown(ctx, x, y, s, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndNodeArrowDown(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat s, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_Blendish_nbndNodeArrowDown(ctxAddress, x, y, s, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_Blendish_nbndNodeWireColor(jlong themeAddress, jint state, jlong __result) {
    BNDnodeTheme const *theme = (BNDnodeTheme const *)(intptr_t)themeAddress;
    *((NVGcolor*)(intptr_t)__result) = bndNodeWireColor(theme, (BNDwidgetState)state);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndNodeWireColor(JNIEnv *__env, jclass clazz, jlong themeAddress, jint state, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_Blendish_nbndNodeWireColor(themeAddress, state, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_Blendish_nbndSelectCorners___3FFI(jint radiuses__length, jfloat* radiuses, jfloat r, jint flags) {
    UNUSED_PARAM(radiuses__length)
    JavaCritical_org_lwjgl_nanovg_Blendish_nbndSelectCorners__JFI((intptr_t)radiuses, r, flags);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndSelectCorners___3FFI(JNIEnv *__env, jclass clazz, jfloatArray radiusesAddress, jfloat r, jint flags) {
    jfloat *radiuses = (*__env)->GetPrimitiveArrayCritical(__env, radiusesAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_Blendish_nbndSelectCorners__JFI((intptr_t)radiuses, r, flags);
    (*__env)->ReleasePrimitiveArrayCritical(__env, radiusesAddress, radiuses, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_Blendish_nbndScrollHandleRect___3F_3F_3F_3FFF(jint x__length, jfloat* x, jint y__length, jfloat* y, jint w__length, jfloat* w, jint h__length, jfloat* h, jfloat offset, jfloat size) {
    UNUSED_PARAM(x__length)
    UNUSED_PARAM(y__length)
    UNUSED_PARAM(w__length)
    UNUSED_PARAM(h__length)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndScrollHandleRect__JJJJFF)((intptr_t)x, (intptr_t)y, (intptr_t)w, (intptr_t)h, offset, size);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_Blendish_nbndScrollHandleRect___3F_3F_3F_3FFF(JNIEnv *__env, jclass clazz, jfloatArray xAddress, jfloatArray yAddress, jfloatArray wAddress, jfloatArray hAddress, jfloat offset, jfloat size) {
    jfloat *x = (*__env)->GetPrimitiveArrayCritical(__env, xAddress, 0);
    jfloat *y = (*__env)->GetPrimitiveArrayCritical(__env, yAddress, 0);
    jfloat *w = (*__env)->GetPrimitiveArrayCritical(__env, wAddress, 0);
    jfloat *h = (*__env)->GetPrimitiveArrayCritical(__env, hAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_Blendish_nbndScrollHandleRect__JJJJFF)((intptr_t)x, (intptr_t)y, (intptr_t)w, (intptr_t)h, offset, size);
    (*__env)->ReleasePrimitiveArrayCritical(__env, hAddress, h, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, wAddress, w, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, yAddress, y, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xAddress, x, 0);
}

EXTERN_C_EXIT
