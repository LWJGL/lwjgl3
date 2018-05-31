/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glAccumPROC) (jint, jfloat);
typedef void (APIENTRY *glAlphaFuncPROC) (jint, jfloat);
typedef jboolean (APIENTRY *glAreTexturesResidentPROC) (jint, intptr_t, intptr_t);
typedef void (APIENTRY *glArrayElementPROC) (jint);
typedef void (APIENTRY *glBeginPROC) (jint);
typedef void (APIENTRY *glBitmapPROC) (jint, jint, jfloat, jfloat, jfloat, jfloat, intptr_t);
typedef void (APIENTRY *glCallListPROC) (jint);
typedef void (APIENTRY *glCallListsPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glClearAccumPROC) (jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glClearIndexPROC) (jfloat);
typedef void (APIENTRY *glClipPlanePROC) (jint, intptr_t);
typedef void (APIENTRY *glColor3bPROC) (jbyte, jbyte, jbyte);
typedef void (APIENTRY *glColor3sPROC) (jshort, jshort, jshort);
typedef void (APIENTRY *glColor3iPROC) (jint, jint, jint);
typedef void (APIENTRY *glColor3fPROC) (jfloat, jfloat, jfloat);
typedef void (APIENTRY *glColor3dPROC) (jdouble, jdouble, jdouble);
typedef void (APIENTRY *glColor3ubPROC) (jbyte, jbyte, jbyte);
typedef void (APIENTRY *glColor3usPROC) (jshort, jshort, jshort);
typedef void (APIENTRY *glColor3uiPROC) (jint, jint, jint);
typedef void (APIENTRY *glColor3bvPROC) (intptr_t);
typedef void (APIENTRY *glColor3svPROC) (intptr_t);
typedef void (APIENTRY *glColor3ivPROC) (intptr_t);
typedef void (APIENTRY *glColor3fvPROC) (intptr_t);
typedef void (APIENTRY *glColor3dvPROC) (intptr_t);
typedef void (APIENTRY *glColor3ubvPROC) (intptr_t);
typedef void (APIENTRY *glColor3usvPROC) (intptr_t);
typedef void (APIENTRY *glColor3uivPROC) (intptr_t);
typedef void (APIENTRY *glColor4bPROC) (jbyte, jbyte, jbyte, jbyte);
typedef void (APIENTRY *glColor4sPROC) (jshort, jshort, jshort, jshort);
typedef void (APIENTRY *glColor4iPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glColor4fPROC) (jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glColor4dPROC) (jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glColor4ubPROC) (jbyte, jbyte, jbyte, jbyte);
typedef void (APIENTRY *glColor4usPROC) (jshort, jshort, jshort, jshort);
typedef void (APIENTRY *glColor4uiPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glColor4bvPROC) (intptr_t);
typedef void (APIENTRY *glColor4svPROC) (intptr_t);
typedef void (APIENTRY *glColor4ivPROC) (intptr_t);
typedef void (APIENTRY *glColor4fvPROC) (intptr_t);
typedef void (APIENTRY *glColor4dvPROC) (intptr_t);
typedef void (APIENTRY *glColor4ubvPROC) (intptr_t);
typedef void (APIENTRY *glColor4usvPROC) (intptr_t);
typedef void (APIENTRY *glColor4uivPROC) (intptr_t);
typedef void (APIENTRY *glColorMaterialPROC) (jint, jint);
typedef void (APIENTRY *glColorPointerPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glCopyPixelsPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glDeleteListsPROC) (jint, jint);
typedef void (APIENTRY *glDisableClientStatePROC) (jint);
typedef void (APIENTRY *glDrawPixelsPROC) (jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glEdgeFlagPROC) (jboolean);
typedef void (APIENTRY *glEdgeFlagvPROC) (intptr_t);
typedef void (APIENTRY *glEdgeFlagPointerPROC) (jint, intptr_t);
typedef void (APIENTRY *glEnableClientStatePROC) (jint);
typedef void (APIENTRY *glEndPROC) (void);
typedef void (APIENTRY *glEvalCoord1fPROC) (jfloat);
typedef void (APIENTRY *glEvalCoord1fvPROC) (intptr_t);
typedef void (APIENTRY *glEvalCoord1dPROC) (jdouble);
typedef void (APIENTRY *glEvalCoord1dvPROC) (intptr_t);
typedef void (APIENTRY *glEvalCoord2fPROC) (jfloat, jfloat);
typedef void (APIENTRY *glEvalCoord2fvPROC) (intptr_t);
typedef void (APIENTRY *glEvalCoord2dPROC) (jdouble, jdouble);
typedef void (APIENTRY *glEvalCoord2dvPROC) (intptr_t);
typedef void (APIENTRY *glEvalMesh1PROC) (jint, jint, jint);
typedef void (APIENTRY *glEvalMesh2PROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glEvalPoint1PROC) (jint);
typedef void (APIENTRY *glEvalPoint2PROC) (jint, jint);
typedef void (APIENTRY *glFeedbackBufferPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glFogiPROC) (jint, jint);
typedef void (APIENTRY *glFogivPROC) (jint, intptr_t);
typedef void (APIENTRY *glFogfPROC) (jint, jfloat);
typedef void (APIENTRY *glFogfvPROC) (jint, intptr_t);
typedef jint (APIENTRY *glGenListsPROC) (jint);
typedef void (APIENTRY *glGetClipPlanePROC) (jint, intptr_t);
typedef void (APIENTRY *glGetLightivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetLightfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetMapivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetMapfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetMapdvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetMaterialivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetMaterialfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetPixelMapfvPROC) (jint, intptr_t);
typedef void (APIENTRY *glGetPixelMapusvPROC) (jint, intptr_t);
typedef void (APIENTRY *glGetPixelMapuivPROC) (jint, intptr_t);
typedef void (APIENTRY *glGetPolygonStipplePROC) (intptr_t);
typedef void (APIENTRY *glGetTexEnvivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetTexEnvfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetTexGenivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetTexGenfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetTexGendvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glIndexiPROC) (jint);
typedef void (APIENTRY *glIndexubPROC) (jbyte);
typedef void (APIENTRY *glIndexsPROC) (jshort);
typedef void (APIENTRY *glIndexfPROC) (jfloat);
typedef void (APIENTRY *glIndexdPROC) (jdouble);
typedef void (APIENTRY *glIndexivPROC) (intptr_t);
typedef void (APIENTRY *glIndexubvPROC) (intptr_t);
typedef void (APIENTRY *glIndexsvPROC) (intptr_t);
typedef void (APIENTRY *glIndexfvPROC) (intptr_t);
typedef void (APIENTRY *glIndexdvPROC) (intptr_t);
typedef void (APIENTRY *glIndexMaskPROC) (jint);
typedef void (APIENTRY *glIndexPointerPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glInitNamesPROC) (void);
typedef void (APIENTRY *glInterleavedArraysPROC) (jint, jint, intptr_t);
typedef jboolean (APIENTRY *glIsListPROC) (jint);
typedef void (APIENTRY *glLightModeliPROC) (jint, jint);
typedef void (APIENTRY *glLightModelfPROC) (jint, jfloat);
typedef void (APIENTRY *glLightModelivPROC) (jint, intptr_t);
typedef void (APIENTRY *glLightModelfvPROC) (jint, intptr_t);
typedef void (APIENTRY *glLightiPROC) (jint, jint, jint);
typedef void (APIENTRY *glLightfPROC) (jint, jint, jfloat);
typedef void (APIENTRY *glLightivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glLightfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glLineStipplePROC) (jint, jshort);
typedef void (APIENTRY *glListBasePROC) (jint);
typedef void (APIENTRY *glLoadMatrixfPROC) (intptr_t);
typedef void (APIENTRY *glLoadMatrixdPROC) (intptr_t);
typedef void (APIENTRY *glLoadIdentityPROC) (void);
typedef void (APIENTRY *glLoadNamePROC) (jint);
typedef void (APIENTRY *glMap1fPROC) (jint, jfloat, jfloat, jint, jint, intptr_t);
typedef void (APIENTRY *glMap1dPROC) (jint, jdouble, jdouble, jint, jint, intptr_t);
typedef void (APIENTRY *glMap2fPROC) (jint, jfloat, jfloat, jint, jint, jfloat, jfloat, jint, jint, intptr_t);
typedef void (APIENTRY *glMap2dPROC) (jint, jdouble, jdouble, jint, jint, jdouble, jdouble, jint, jint, intptr_t);
typedef void (APIENTRY *glMapGrid1fPROC) (jint, jfloat, jfloat);
typedef void (APIENTRY *glMapGrid1dPROC) (jint, jdouble, jdouble);
typedef void (APIENTRY *glMapGrid2fPROC) (jint, jfloat, jfloat, jint, jfloat, jfloat);
typedef void (APIENTRY *glMapGrid2dPROC) (jint, jdouble, jdouble, jint, jdouble, jdouble);
typedef void (APIENTRY *glMaterialiPROC) (jint, jint, jint);
typedef void (APIENTRY *glMaterialfPROC) (jint, jint, jfloat);
typedef void (APIENTRY *glMaterialivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glMaterialfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glMatrixModePROC) (jint);
typedef void (APIENTRY *glMultMatrixfPROC) (intptr_t);
typedef void (APIENTRY *glMultMatrixdPROC) (intptr_t);
typedef void (APIENTRY *glFrustumPROC) (jdouble, jdouble, jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glNewListPROC) (jint, jint);
typedef void (APIENTRY *glEndListPROC) (void);
typedef void (APIENTRY *glNormal3fPROC) (jfloat, jfloat, jfloat);
typedef void (APIENTRY *glNormal3bPROC) (jbyte, jbyte, jbyte);
typedef void (APIENTRY *glNormal3sPROC) (jshort, jshort, jshort);
typedef void (APIENTRY *glNormal3iPROC) (jint, jint, jint);
typedef void (APIENTRY *glNormal3dPROC) (jdouble, jdouble, jdouble);
typedef void (APIENTRY *glNormal3fvPROC) (intptr_t);
typedef void (APIENTRY *glNormal3bvPROC) (intptr_t);
typedef void (APIENTRY *glNormal3svPROC) (intptr_t);
typedef void (APIENTRY *glNormal3ivPROC) (intptr_t);
typedef void (APIENTRY *glNormal3dvPROC) (intptr_t);
typedef void (APIENTRY *glNormalPointerPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glOrthoPROC) (jdouble, jdouble, jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glPassThroughPROC) (jfloat);
typedef void (APIENTRY *glPixelMapfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glPixelMapusvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glPixelMapuivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glPixelTransferiPROC) (jint, jint);
typedef void (APIENTRY *glPixelTransferfPROC) (jint, jfloat);
typedef void (APIENTRY *glPixelZoomPROC) (jfloat, jfloat);
typedef void (APIENTRY *glPolygonStipplePROC) (intptr_t);
typedef void (APIENTRY *glPushAttribPROC) (jint);
typedef void (APIENTRY *glPushClientAttribPROC) (jint);
typedef void (APIENTRY *glPopAttribPROC) (void);
typedef void (APIENTRY *glPopClientAttribPROC) (void);
typedef void (APIENTRY *glPopMatrixPROC) (void);
typedef void (APIENTRY *glPopNamePROC) (void);
typedef void (APIENTRY *glPrioritizeTexturesPROC) (jint, intptr_t, intptr_t);
typedef void (APIENTRY *glPushMatrixPROC) (void);
typedef void (APIENTRY *glPushNamePROC) (jint);
typedef void (APIENTRY *glRasterPos2iPROC) (jint, jint);
typedef void (APIENTRY *glRasterPos2sPROC) (jshort, jshort);
typedef void (APIENTRY *glRasterPos2fPROC) (jfloat, jfloat);
typedef void (APIENTRY *glRasterPos2dPROC) (jdouble, jdouble);
typedef void (APIENTRY *glRasterPos2ivPROC) (intptr_t);
typedef void (APIENTRY *glRasterPos2svPROC) (intptr_t);
typedef void (APIENTRY *glRasterPos2fvPROC) (intptr_t);
typedef void (APIENTRY *glRasterPos2dvPROC) (intptr_t);
typedef void (APIENTRY *glRasterPos3iPROC) (jint, jint, jint);
typedef void (APIENTRY *glRasterPos3sPROC) (jshort, jshort, jshort);
typedef void (APIENTRY *glRasterPos3fPROC) (jfloat, jfloat, jfloat);
typedef void (APIENTRY *glRasterPos3dPROC) (jdouble, jdouble, jdouble);
typedef void (APIENTRY *glRasterPos3ivPROC) (intptr_t);
typedef void (APIENTRY *glRasterPos3svPROC) (intptr_t);
typedef void (APIENTRY *glRasterPos3fvPROC) (intptr_t);
typedef void (APIENTRY *glRasterPos3dvPROC) (intptr_t);
typedef void (APIENTRY *glRasterPos4iPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glRasterPos4sPROC) (jshort, jshort, jshort, jshort);
typedef void (APIENTRY *glRasterPos4fPROC) (jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glRasterPos4dPROC) (jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glRasterPos4ivPROC) (intptr_t);
typedef void (APIENTRY *glRasterPos4svPROC) (intptr_t);
typedef void (APIENTRY *glRasterPos4fvPROC) (intptr_t);
typedef void (APIENTRY *glRasterPos4dvPROC) (intptr_t);
typedef void (APIENTRY *glRectiPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glRectsPROC) (jshort, jshort, jshort, jshort);
typedef void (APIENTRY *glRectfPROC) (jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glRectdPROC) (jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glRectivPROC) (intptr_t, intptr_t);
typedef void (APIENTRY *glRectsvPROC) (intptr_t, intptr_t);
typedef void (APIENTRY *glRectfvPROC) (intptr_t, intptr_t);
typedef void (APIENTRY *glRectdvPROC) (intptr_t, intptr_t);
typedef jint (APIENTRY *glRenderModePROC) (jint);
typedef void (APIENTRY *glRotatefPROC) (jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glRotatedPROC) (jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glScalefPROC) (jfloat, jfloat, jfloat);
typedef void (APIENTRY *glScaledPROC) (jdouble, jdouble, jdouble);
typedef void (APIENTRY *glSelectBufferPROC) (jint, intptr_t);
typedef void (APIENTRY *glShadeModelPROC) (jint);
typedef void (APIENTRY *glTexCoord1fPROC) (jfloat);
typedef void (APIENTRY *glTexCoord1sPROC) (jshort);
typedef void (APIENTRY *glTexCoord1iPROC) (jint);
typedef void (APIENTRY *glTexCoord1dPROC) (jdouble);
typedef void (APIENTRY *glTexCoord1fvPROC) (intptr_t);
typedef void (APIENTRY *glTexCoord1svPROC) (intptr_t);
typedef void (APIENTRY *glTexCoord1ivPROC) (intptr_t);
typedef void (APIENTRY *glTexCoord1dvPROC) (intptr_t);
typedef void (APIENTRY *glTexCoord2fPROC) (jfloat, jfloat);
typedef void (APIENTRY *glTexCoord2sPROC) (jshort, jshort);
typedef void (APIENTRY *glTexCoord2iPROC) (jint, jint);
typedef void (APIENTRY *glTexCoord2dPROC) (jdouble, jdouble);
typedef void (APIENTRY *glTexCoord2fvPROC) (intptr_t);
typedef void (APIENTRY *glTexCoord2svPROC) (intptr_t);
typedef void (APIENTRY *glTexCoord2ivPROC) (intptr_t);
typedef void (APIENTRY *glTexCoord2dvPROC) (intptr_t);
typedef void (APIENTRY *glTexCoord3fPROC) (jfloat, jfloat, jfloat);
typedef void (APIENTRY *glTexCoord3sPROC) (jshort, jshort, jshort);
typedef void (APIENTRY *glTexCoord3iPROC) (jint, jint, jint);
typedef void (APIENTRY *glTexCoord3dPROC) (jdouble, jdouble, jdouble);
typedef void (APIENTRY *glTexCoord3fvPROC) (intptr_t);
typedef void (APIENTRY *glTexCoord3svPROC) (intptr_t);
typedef void (APIENTRY *glTexCoord3ivPROC) (intptr_t);
typedef void (APIENTRY *glTexCoord3dvPROC) (intptr_t);
typedef void (APIENTRY *glTexCoord4fPROC) (jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glTexCoord4sPROC) (jshort, jshort, jshort, jshort);
typedef void (APIENTRY *glTexCoord4iPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glTexCoord4dPROC) (jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glTexCoord4fvPROC) (intptr_t);
typedef void (APIENTRY *glTexCoord4svPROC) (intptr_t);
typedef void (APIENTRY *glTexCoord4ivPROC) (intptr_t);
typedef void (APIENTRY *glTexCoord4dvPROC) (intptr_t);
typedef void (APIENTRY *glTexCoordPointerPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glTexEnviPROC) (jint, jint, jint);
typedef void (APIENTRY *glTexEnvivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glTexEnvfPROC) (jint, jint, jfloat);
typedef void (APIENTRY *glTexEnvfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glTexGeniPROC) (jint, jint, jint);
typedef void (APIENTRY *glTexGenivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glTexGenfPROC) (jint, jint, jfloat);
typedef void (APIENTRY *glTexGenfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glTexGendPROC) (jint, jint, jdouble);
typedef void (APIENTRY *glTexGendvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glTranslatefPROC) (jfloat, jfloat, jfloat);
typedef void (APIENTRY *glTranslatedPROC) (jdouble, jdouble, jdouble);
typedef void (APIENTRY *glVertex2fPROC) (jfloat, jfloat);
typedef void (APIENTRY *glVertex2sPROC) (jshort, jshort);
typedef void (APIENTRY *glVertex2iPROC) (jint, jint);
typedef void (APIENTRY *glVertex2dPROC) (jdouble, jdouble);
typedef void (APIENTRY *glVertex2fvPROC) (intptr_t);
typedef void (APIENTRY *glVertex2svPROC) (intptr_t);
typedef void (APIENTRY *glVertex2ivPROC) (intptr_t);
typedef void (APIENTRY *glVertex2dvPROC) (intptr_t);
typedef void (APIENTRY *glVertex3fPROC) (jfloat, jfloat, jfloat);
typedef void (APIENTRY *glVertex3sPROC) (jshort, jshort, jshort);
typedef void (APIENTRY *glVertex3iPROC) (jint, jint, jint);
typedef void (APIENTRY *glVertex3dPROC) (jdouble, jdouble, jdouble);
typedef void (APIENTRY *glVertex3fvPROC) (intptr_t);
typedef void (APIENTRY *glVertex3svPROC) (intptr_t);
typedef void (APIENTRY *glVertex3ivPROC) (intptr_t);
typedef void (APIENTRY *glVertex3dvPROC) (intptr_t);
typedef void (APIENTRY *glVertex4fPROC) (jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glVertex4sPROC) (jshort, jshort, jshort, jshort);
typedef void (APIENTRY *glVertex4iPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glVertex4dPROC) (jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glVertex4fvPROC) (intptr_t);
typedef void (APIENTRY *glVertex4svPROC) (intptr_t);
typedef void (APIENTRY *glVertex4ivPROC) (intptr_t);
typedef void (APIENTRY *glVertex4dvPROC) (intptr_t);
typedef void (APIENTRY *glVertexPointerPROC) (jint, jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glAccum(JNIEnv *__env, jclass clazz, jint op, jfloat value) {
    glAccumPROC glAccum = (glAccumPROC)tlsGetFunction(0);
    UNUSED_PARAM(clazz)
    glAccum(op, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glAlphaFunc(JNIEnv *__env, jclass clazz, jint func, jfloat ref) {
    glAlphaFuncPROC glAlphaFunc = (glAlphaFuncPROC)tlsGetFunction(1);
    UNUSED_PARAM(clazz)
    glAlphaFunc(func, ref);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL11_nglAreTexturesResident__IJJ(JNIEnv *__env, jclass clazz, jint n, jlong texturesAddress, jlong residencesAddress) {
    glAreTexturesResidentPROC glAreTexturesResident = (glAreTexturesResidentPROC)tlsGetFunction(2);
    intptr_t textures = (intptr_t)texturesAddress;
    intptr_t residences = (intptr_t)residencesAddress;
    UNUSED_PARAM(clazz)
    return (jboolean)glAreTexturesResident(n, textures, residences);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glArrayElement(JNIEnv *__env, jclass clazz, jint i) {
    glArrayElementPROC glArrayElement = (glArrayElementPROC)tlsGetFunction(3);
    UNUSED_PARAM(clazz)
    glArrayElement(i);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glBegin(JNIEnv *__env, jclass clazz, jint mode) {
    glBeginPROC glBegin = (glBeginPROC)tlsGetFunction(4);
    UNUSED_PARAM(clazz)
    glBegin(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglBitmap(JNIEnv *__env, jclass clazz, jint w, jint h, jfloat xOrig, jfloat yOrig, jfloat xInc, jfloat yInc, jlong dataAddress) {
    glBitmapPROC glBitmap = (glBitmapPROC)tlsGetFunction(5);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glBitmap(w, h, xOrig, yOrig, xInc, yInc, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glCallList(JNIEnv *__env, jclass clazz, jint list) {
    glCallListPROC glCallList = (glCallListPROC)tlsGetFunction(6);
    UNUSED_PARAM(clazz)
    glCallList(list);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglCallLists(JNIEnv *__env, jclass clazz, jint n, jint type, jlong listsAddress) {
    glCallListsPROC glCallLists = (glCallListsPROC)tlsGetFunction(7);
    intptr_t lists = (intptr_t)listsAddress;
    UNUSED_PARAM(clazz)
    glCallLists(n, type, lists);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glClearAccum(JNIEnv *__env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {
    glClearAccumPROC glClearAccum = (glClearAccumPROC)tlsGetFunction(8);
    UNUSED_PARAM(clazz)
    glClearAccum(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glClearIndex(JNIEnv *__env, jclass clazz, jfloat index) {
    glClearIndexPROC glClearIndex = (glClearIndexPROC)tlsGetFunction(9);
    UNUSED_PARAM(clazz)
    glClearIndex(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglClipPlane__IJ(JNIEnv *__env, jclass clazz, jint plane, jlong equationAddress) {
    glClipPlanePROC glClipPlane = (glClipPlanePROC)tlsGetFunction(10);
    intptr_t equation = (intptr_t)equationAddress;
    UNUSED_PARAM(clazz)
    glClipPlane(plane, equation);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor3b(JNIEnv *__env, jclass clazz, jbyte red, jbyte green, jbyte blue) {
    glColor3bPROC glColor3b = (glColor3bPROC)tlsGetFunction(11);
    UNUSED_PARAM(clazz)
    glColor3b(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor3s(JNIEnv *__env, jclass clazz, jshort red, jshort green, jshort blue) {
    glColor3sPROC glColor3s = (glColor3sPROC)tlsGetFunction(12);
    UNUSED_PARAM(clazz)
    glColor3s(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor3i(JNIEnv *__env, jclass clazz, jint red, jint green, jint blue) {
    glColor3iPROC glColor3i = (glColor3iPROC)tlsGetFunction(13);
    UNUSED_PARAM(clazz)
    glColor3i(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor3f(JNIEnv *__env, jclass clazz, jfloat red, jfloat green, jfloat blue) {
    glColor3fPROC glColor3f = (glColor3fPROC)tlsGetFunction(14);
    UNUSED_PARAM(clazz)
    glColor3f(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor3d(JNIEnv *__env, jclass clazz, jdouble red, jdouble green, jdouble blue) {
    glColor3dPROC glColor3d = (glColor3dPROC)tlsGetFunction(15);
    UNUSED_PARAM(clazz)
    glColor3d(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor3ub(JNIEnv *__env, jclass clazz, jbyte red, jbyte green, jbyte blue) {
    glColor3ubPROC glColor3ub = (glColor3ubPROC)tlsGetFunction(16);
    UNUSED_PARAM(clazz)
    glColor3ub(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor3us(JNIEnv *__env, jclass clazz, jshort red, jshort green, jshort blue) {
    glColor3usPROC glColor3us = (glColor3usPROC)tlsGetFunction(17);
    UNUSED_PARAM(clazz)
    glColor3us(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor3ui(JNIEnv *__env, jclass clazz, jint red, jint green, jint blue) {
    glColor3uiPROC glColor3ui = (glColor3uiPROC)tlsGetFunction(18);
    UNUSED_PARAM(clazz)
    glColor3ui(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3bv(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor3bvPROC glColor3bv = (glColor3bvPROC)tlsGetFunction(19);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor3bv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3sv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor3svPROC glColor3sv = (glColor3svPROC)tlsGetFunction(20);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor3sv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3iv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor3ivPROC glColor3iv = (glColor3ivPROC)tlsGetFunction(21);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor3iv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3fv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor3fvPROC glColor3fv = (glColor3fvPROC)tlsGetFunction(22);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor3fv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3dv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor3dvPROC glColor3dv = (glColor3dvPROC)tlsGetFunction(23);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor3dv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3ubv(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor3ubvPROC glColor3ubv = (glColor3ubvPROC)tlsGetFunction(24);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor3ubv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3usv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor3usvPROC glColor3usv = (glColor3usvPROC)tlsGetFunction(25);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor3usv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor3uiv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor3uivPROC glColor3uiv = (glColor3uivPROC)tlsGetFunction(26);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor3uiv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor4b(JNIEnv *__env, jclass clazz, jbyte red, jbyte green, jbyte blue, jbyte alpha) {
    glColor4bPROC glColor4b = (glColor4bPROC)tlsGetFunction(27);
    UNUSED_PARAM(clazz)
    glColor4b(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor4s(JNIEnv *__env, jclass clazz, jshort red, jshort green, jshort blue, jshort alpha) {
    glColor4sPROC glColor4s = (glColor4sPROC)tlsGetFunction(28);
    UNUSED_PARAM(clazz)
    glColor4s(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor4i(JNIEnv *__env, jclass clazz, jint red, jint green, jint blue, jint alpha) {
    glColor4iPROC glColor4i = (glColor4iPROC)tlsGetFunction(29);
    UNUSED_PARAM(clazz)
    glColor4i(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor4f(JNIEnv *__env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {
    glColor4fPROC glColor4f = (glColor4fPROC)tlsGetFunction(30);
    UNUSED_PARAM(clazz)
    glColor4f(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor4d(JNIEnv *__env, jclass clazz, jdouble red, jdouble green, jdouble blue, jdouble alpha) {
    glColor4dPROC glColor4d = (glColor4dPROC)tlsGetFunction(31);
    UNUSED_PARAM(clazz)
    glColor4d(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor4ub(JNIEnv *__env, jclass clazz, jbyte red, jbyte green, jbyte blue, jbyte alpha) {
    glColor4ubPROC glColor4ub = (glColor4ubPROC)tlsGetFunction(32);
    UNUSED_PARAM(clazz)
    glColor4ub(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor4us(JNIEnv *__env, jclass clazz, jshort red, jshort green, jshort blue, jshort alpha) {
    glColor4usPROC glColor4us = (glColor4usPROC)tlsGetFunction(33);
    UNUSED_PARAM(clazz)
    glColor4us(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColor4ui(JNIEnv *__env, jclass clazz, jint red, jint green, jint blue, jint alpha) {
    glColor4uiPROC glColor4ui = (glColor4uiPROC)tlsGetFunction(34);
    UNUSED_PARAM(clazz)
    glColor4ui(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4bv(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor4bvPROC glColor4bv = (glColor4bvPROC)tlsGetFunction(35);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor4bv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4sv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor4svPROC glColor4sv = (glColor4svPROC)tlsGetFunction(36);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor4sv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4iv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor4ivPROC glColor4iv = (glColor4ivPROC)tlsGetFunction(37);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor4iv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4fv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor4fvPROC glColor4fv = (glColor4fvPROC)tlsGetFunction(38);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor4fv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4dv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor4dvPROC glColor4dv = (glColor4dvPROC)tlsGetFunction(39);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor4dv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4ubv(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor4ubvPROC glColor4ubv = (glColor4ubvPROC)tlsGetFunction(40);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor4ubv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4usv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor4usvPROC glColor4usv = (glColor4usvPROC)tlsGetFunction(41);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor4usv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColor4uiv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glColor4uivPROC glColor4uiv = (glColor4uivPROC)tlsGetFunction(42);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glColor4uiv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glColorMaterial(JNIEnv *__env, jclass clazz, jint face, jint mode) {
    glColorMaterialPROC glColorMaterial = (glColorMaterialPROC)tlsGetFunction(43);
    UNUSED_PARAM(clazz)
    glColorMaterial(face, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglColorPointer(JNIEnv *__env, jclass clazz, jint size, jint type, jint stride, jlong pointerAddress) {
    glColorPointerPROC glColorPointer = (glColorPointerPROC)tlsGetFunction(44);
    intptr_t pointer = (intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glColorPointer(size, type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glCopyPixels(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height, jint type) {
    glCopyPixelsPROC glCopyPixels = (glCopyPixelsPROC)tlsGetFunction(45);
    UNUSED_PARAM(clazz)
    glCopyPixels(x, y, width, height, type);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glDeleteLists(JNIEnv *__env, jclass clazz, jint list, jint range) {
    glDeleteListsPROC glDeleteLists = (glDeleteListsPROC)tlsGetFunction(46);
    UNUSED_PARAM(clazz)
    glDeleteLists(list, range);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glDisableClientState(JNIEnv *__env, jclass clazz, jint cap) {
    glDisableClientStatePROC glDisableClientState = (glDisableClientStatePROC)tlsGetFunction(47);
    UNUSED_PARAM(clazz)
    glDisableClientState(cap);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglDrawPixels__IIIIJ(JNIEnv *__env, jclass clazz, jint width, jint height, jint format, jint type, jlong pixelsAddress) {
    glDrawPixelsPROC glDrawPixels = (glDrawPixelsPROC)tlsGetFunction(48);
    intptr_t pixels = (intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glDrawPixels(width, height, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glEdgeFlag(JNIEnv *__env, jclass clazz, jboolean flag) {
    glEdgeFlagPROC glEdgeFlag = (glEdgeFlagPROC)tlsGetFunction(49);
    UNUSED_PARAM(clazz)
    glEdgeFlag(flag);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEdgeFlagv(JNIEnv *__env, jclass clazz, jlong flagAddress) {
    glEdgeFlagvPROC glEdgeFlagv = (glEdgeFlagvPROC)tlsGetFunction(50);
    intptr_t flag = (intptr_t)flagAddress;
    UNUSED_PARAM(clazz)
    glEdgeFlagv(flag);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEdgeFlagPointer(JNIEnv *__env, jclass clazz, jint stride, jlong pointerAddress) {
    glEdgeFlagPointerPROC glEdgeFlagPointer = (glEdgeFlagPointerPROC)tlsGetFunction(51);
    intptr_t pointer = (intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glEdgeFlagPointer(stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glEnableClientState(JNIEnv *__env, jclass clazz, jint cap) {
    glEnableClientStatePROC glEnableClientState = (glEnableClientStatePROC)tlsGetFunction(52);
    UNUSED_PARAM(clazz)
    glEnableClientState(cap);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glEnd(JNIEnv *__env, jclass clazz) {
    glEndPROC glEnd = (glEndPROC)tlsGetFunction(53);
    UNUSED_PARAM(clazz)
    glEnd();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glEvalCoord1f(JNIEnv *__env, jclass clazz, jfloat u) {
    glEvalCoord1fPROC glEvalCoord1f = (glEvalCoord1fPROC)tlsGetFunction(54);
    UNUSED_PARAM(clazz)
    glEvalCoord1f(u);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEvalCoord1fv__J(JNIEnv *__env, jclass clazz, jlong uAddress) {
    glEvalCoord1fvPROC glEvalCoord1fv = (glEvalCoord1fvPROC)tlsGetFunction(55);
    intptr_t u = (intptr_t)uAddress;
    UNUSED_PARAM(clazz)
    glEvalCoord1fv(u);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glEvalCoord1d(JNIEnv *__env, jclass clazz, jdouble u) {
    glEvalCoord1dPROC glEvalCoord1d = (glEvalCoord1dPROC)tlsGetFunction(56);
    UNUSED_PARAM(clazz)
    glEvalCoord1d(u);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEvalCoord1dv__J(JNIEnv *__env, jclass clazz, jlong uAddress) {
    glEvalCoord1dvPROC glEvalCoord1dv = (glEvalCoord1dvPROC)tlsGetFunction(57);
    intptr_t u = (intptr_t)uAddress;
    UNUSED_PARAM(clazz)
    glEvalCoord1dv(u);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glEvalCoord2f(JNIEnv *__env, jclass clazz, jfloat u, jfloat v) {
    glEvalCoord2fPROC glEvalCoord2f = (glEvalCoord2fPROC)tlsGetFunction(58);
    UNUSED_PARAM(clazz)
    glEvalCoord2f(u, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEvalCoord2fv__J(JNIEnv *__env, jclass clazz, jlong uAddress) {
    glEvalCoord2fvPROC glEvalCoord2fv = (glEvalCoord2fvPROC)tlsGetFunction(59);
    intptr_t u = (intptr_t)uAddress;
    UNUSED_PARAM(clazz)
    glEvalCoord2fv(u);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glEvalCoord2d(JNIEnv *__env, jclass clazz, jdouble u, jdouble v) {
    glEvalCoord2dPROC glEvalCoord2d = (glEvalCoord2dPROC)tlsGetFunction(60);
    UNUSED_PARAM(clazz)
    glEvalCoord2d(u, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglEvalCoord2dv__J(JNIEnv *__env, jclass clazz, jlong uAddress) {
    glEvalCoord2dvPROC glEvalCoord2dv = (glEvalCoord2dvPROC)tlsGetFunction(61);
    intptr_t u = (intptr_t)uAddress;
    UNUSED_PARAM(clazz)
    glEvalCoord2dv(u);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glEvalMesh1(JNIEnv *__env, jclass clazz, jint mode, jint i1, jint i2) {
    glEvalMesh1PROC glEvalMesh1 = (glEvalMesh1PROC)tlsGetFunction(62);
    UNUSED_PARAM(clazz)
    glEvalMesh1(mode, i1, i2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glEvalMesh2(JNIEnv *__env, jclass clazz, jint mode, jint i1, jint i2, jint j1, jint j2) {
    glEvalMesh2PROC glEvalMesh2 = (glEvalMesh2PROC)tlsGetFunction(63);
    UNUSED_PARAM(clazz)
    glEvalMesh2(mode, i1, i2, j1, j2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glEvalPoint1(JNIEnv *__env, jclass clazz, jint i) {
    glEvalPoint1PROC glEvalPoint1 = (glEvalPoint1PROC)tlsGetFunction(64);
    UNUSED_PARAM(clazz)
    glEvalPoint1(i);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glEvalPoint2(JNIEnv *__env, jclass clazz, jint i, jint j) {
    glEvalPoint2PROC glEvalPoint2 = (glEvalPoint2PROC)tlsGetFunction(65);
    UNUSED_PARAM(clazz)
    glEvalPoint2(i, j);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglFeedbackBuffer__IIJ(JNIEnv *__env, jclass clazz, jint size, jint type, jlong bufferAddress) {
    glFeedbackBufferPROC glFeedbackBuffer = (glFeedbackBufferPROC)tlsGetFunction(66);
    intptr_t buffer = (intptr_t)bufferAddress;
    UNUSED_PARAM(clazz)
    glFeedbackBuffer(size, type, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glFogi(JNIEnv *__env, jclass clazz, jint pname, jint param) {
    glFogiPROC glFogi = (glFogiPROC)tlsGetFunction(67);
    UNUSED_PARAM(clazz)
    glFogi(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglFogiv__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glFogivPROC glFogiv = (glFogivPROC)tlsGetFunction(68);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glFogiv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glFogf(JNIEnv *__env, jclass clazz, jint pname, jfloat param) {
    glFogfPROC glFogf = (glFogfPROC)tlsGetFunction(69);
    UNUSED_PARAM(clazz)
    glFogf(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglFogfv__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glFogfvPROC glFogfv = (glFogfvPROC)tlsGetFunction(70);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glFogfv(pname, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL11_glGenLists(JNIEnv *__env, jclass clazz, jint s) {
    glGenListsPROC glGenLists = (glGenListsPROC)tlsGetFunction(71);
    UNUSED_PARAM(clazz)
    return (jint)glGenLists(s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetClipPlane__IJ(JNIEnv *__env, jclass clazz, jint plane, jlong equationAddress) {
    glGetClipPlanePROC glGetClipPlane = (glGetClipPlanePROC)tlsGetFunction(72);
    intptr_t equation = (intptr_t)equationAddress;
    UNUSED_PARAM(clazz)
    glGetClipPlane(plane, equation);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetLightiv__IIJ(JNIEnv *__env, jclass clazz, jint light, jint pname, jlong dataAddress) {
    glGetLightivPROC glGetLightiv = (glGetLightivPROC)tlsGetFunction(73);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetLightiv(light, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetLightfv__IIJ(JNIEnv *__env, jclass clazz, jint light, jint pname, jlong dataAddress) {
    glGetLightfvPROC glGetLightfv = (glGetLightfvPROC)tlsGetFunction(74);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetLightfv(light, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetMapiv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint query, jlong dataAddress) {
    glGetMapivPROC glGetMapiv = (glGetMapivPROC)tlsGetFunction(75);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetMapiv(target, query, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetMapfv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint query, jlong dataAddress) {
    glGetMapfvPROC glGetMapfv = (glGetMapfvPROC)tlsGetFunction(76);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetMapfv(target, query, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetMapdv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint query, jlong dataAddress) {
    glGetMapdvPROC glGetMapdv = (glGetMapdvPROC)tlsGetFunction(77);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetMapdv(target, query, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetMaterialiv__IIJ(JNIEnv *__env, jclass clazz, jint face, jint pname, jlong dataAddress) {
    glGetMaterialivPROC glGetMaterialiv = (glGetMaterialivPROC)tlsGetFunction(78);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetMaterialiv(face, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetMaterialfv__IIJ(JNIEnv *__env, jclass clazz, jint face, jint pname, jlong dataAddress) {
    glGetMaterialfvPROC glGetMaterialfv = (glGetMaterialfvPROC)tlsGetFunction(79);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetMaterialfv(face, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetPixelMapfv__IJ(JNIEnv *__env, jclass clazz, jint map, jlong dataAddress) {
    glGetPixelMapfvPROC glGetPixelMapfv = (glGetPixelMapfvPROC)tlsGetFunction(80);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetPixelMapfv(map, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetPixelMapusv__IJ(JNIEnv *__env, jclass clazz, jint map, jlong dataAddress) {
    glGetPixelMapusvPROC glGetPixelMapusv = (glGetPixelMapusvPROC)tlsGetFunction(81);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetPixelMapusv(map, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetPixelMapuiv__IJ(JNIEnv *__env, jclass clazz, jint map, jlong dataAddress) {
    glGetPixelMapuivPROC glGetPixelMapuiv = (glGetPixelMapuivPROC)tlsGetFunction(82);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetPixelMapuiv(map, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetPolygonStipple(JNIEnv *__env, jclass clazz, jlong patternAddress) {
    glGetPolygonStipplePROC glGetPolygonStipple = (glGetPolygonStipplePROC)tlsGetFunction(83);
    intptr_t pattern = (intptr_t)patternAddress;
    UNUSED_PARAM(clazz)
    glGetPolygonStipple(pattern);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetTexEnviv__IIJ(JNIEnv *__env, jclass clazz, jint env, jint pname, jlong dataAddress) {
    glGetTexEnvivPROC glGetTexEnviv = (glGetTexEnvivPROC)tlsGetFunction(84);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetTexEnviv(env, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetTexEnvfv__IIJ(JNIEnv *__env, jclass clazz, jint env, jint pname, jlong dataAddress) {
    glGetTexEnvfvPROC glGetTexEnvfv = (glGetTexEnvfvPROC)tlsGetFunction(85);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetTexEnvfv(env, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetTexGeniv__IIJ(JNIEnv *__env, jclass clazz, jint coord, jint pname, jlong dataAddress) {
    glGetTexGenivPROC glGetTexGeniv = (glGetTexGenivPROC)tlsGetFunction(86);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetTexGeniv(coord, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetTexGenfv__IIJ(JNIEnv *__env, jclass clazz, jint coord, jint pname, jlong dataAddress) {
    glGetTexGenfvPROC glGetTexGenfv = (glGetTexGenfvPROC)tlsGetFunction(87);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetTexGenfv(coord, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglGetTexGendv__IIJ(JNIEnv *__env, jclass clazz, jint coord, jint pname, jlong dataAddress) {
    glGetTexGendvPROC glGetTexGendv = (glGetTexGendvPROC)tlsGetFunction(88);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetTexGendv(coord, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glIndexi(JNIEnv *__env, jclass clazz, jint index) {
    glIndexiPROC glIndexi = (glIndexiPROC)tlsGetFunction(89);
    UNUSED_PARAM(clazz)
    glIndexi(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glIndexub(JNIEnv *__env, jclass clazz, jbyte index) {
    glIndexubPROC glIndexub = (glIndexubPROC)tlsGetFunction(90);
    UNUSED_PARAM(clazz)
    glIndexub(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glIndexs(JNIEnv *__env, jclass clazz, jshort index) {
    glIndexsPROC glIndexs = (glIndexsPROC)tlsGetFunction(91);
    UNUSED_PARAM(clazz)
    glIndexs(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glIndexf(JNIEnv *__env, jclass clazz, jfloat index) {
    glIndexfPROC glIndexf = (glIndexfPROC)tlsGetFunction(92);
    UNUSED_PARAM(clazz)
    glIndexf(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glIndexd(JNIEnv *__env, jclass clazz, jdouble index) {
    glIndexdPROC glIndexd = (glIndexdPROC)tlsGetFunction(93);
    UNUSED_PARAM(clazz)
    glIndexd(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglIndexiv__J(JNIEnv *__env, jclass clazz, jlong indexAddress) {
    glIndexivPROC glIndexiv = (glIndexivPROC)tlsGetFunction(94);
    intptr_t index = (intptr_t)indexAddress;
    UNUSED_PARAM(clazz)
    glIndexiv(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglIndexubv(JNIEnv *__env, jclass clazz, jlong indexAddress) {
    glIndexubvPROC glIndexubv = (glIndexubvPROC)tlsGetFunction(95);
    intptr_t index = (intptr_t)indexAddress;
    UNUSED_PARAM(clazz)
    glIndexubv(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglIndexsv__J(JNIEnv *__env, jclass clazz, jlong indexAddress) {
    glIndexsvPROC glIndexsv = (glIndexsvPROC)tlsGetFunction(96);
    intptr_t index = (intptr_t)indexAddress;
    UNUSED_PARAM(clazz)
    glIndexsv(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglIndexfv__J(JNIEnv *__env, jclass clazz, jlong indexAddress) {
    glIndexfvPROC glIndexfv = (glIndexfvPROC)tlsGetFunction(97);
    intptr_t index = (intptr_t)indexAddress;
    UNUSED_PARAM(clazz)
    glIndexfv(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglIndexdv__J(JNIEnv *__env, jclass clazz, jlong indexAddress) {
    glIndexdvPROC glIndexdv = (glIndexdvPROC)tlsGetFunction(98);
    intptr_t index = (intptr_t)indexAddress;
    UNUSED_PARAM(clazz)
    glIndexdv(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glIndexMask(JNIEnv *__env, jclass clazz, jint mask) {
    glIndexMaskPROC glIndexMask = (glIndexMaskPROC)tlsGetFunction(99);
    UNUSED_PARAM(clazz)
    glIndexMask(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglIndexPointer(JNIEnv *__env, jclass clazz, jint type, jint stride, jlong pointerAddress) {
    glIndexPointerPROC glIndexPointer = (glIndexPointerPROC)tlsGetFunction(100);
    intptr_t pointer = (intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glIndexPointer(type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glInitNames(JNIEnv *__env, jclass clazz) {
    glInitNamesPROC glInitNames = (glInitNamesPROC)tlsGetFunction(101);
    UNUSED_PARAM(clazz)
    glInitNames();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglInterleavedArrays__IIJ(JNIEnv *__env, jclass clazz, jint format, jint stride, jlong pointerAddress) {
    glInterleavedArraysPROC glInterleavedArrays = (glInterleavedArraysPROC)tlsGetFunction(102);
    intptr_t pointer = (intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glInterleavedArrays(format, stride, pointer);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL11_glIsList(JNIEnv *__env, jclass clazz, jint list) {
    glIsListPROC glIsList = (glIsListPROC)tlsGetFunction(103);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsList(list);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glLightModeli(JNIEnv *__env, jclass clazz, jint pname, jint param) {
    glLightModeliPROC glLightModeli = (glLightModeliPROC)tlsGetFunction(104);
    UNUSED_PARAM(clazz)
    glLightModeli(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glLightModelf(JNIEnv *__env, jclass clazz, jint pname, jfloat param) {
    glLightModelfPROC glLightModelf = (glLightModelfPROC)tlsGetFunction(105);
    UNUSED_PARAM(clazz)
    glLightModelf(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglLightModeliv__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glLightModelivPROC glLightModeliv = (glLightModelivPROC)tlsGetFunction(106);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glLightModeliv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglLightModelfv__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glLightModelfvPROC glLightModelfv = (glLightModelfvPROC)tlsGetFunction(107);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glLightModelfv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glLighti(JNIEnv *__env, jclass clazz, jint light, jint pname, jint param) {
    glLightiPROC glLighti = (glLightiPROC)tlsGetFunction(108);
    UNUSED_PARAM(clazz)
    glLighti(light, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glLightf(JNIEnv *__env, jclass clazz, jint light, jint pname, jfloat param) {
    glLightfPROC glLightf = (glLightfPROC)tlsGetFunction(109);
    UNUSED_PARAM(clazz)
    glLightf(light, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglLightiv__IIJ(JNIEnv *__env, jclass clazz, jint light, jint pname, jlong paramsAddress) {
    glLightivPROC glLightiv = (glLightivPROC)tlsGetFunction(110);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glLightiv(light, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglLightfv__IIJ(JNIEnv *__env, jclass clazz, jint light, jint pname, jlong paramsAddress) {
    glLightfvPROC glLightfv = (glLightfvPROC)tlsGetFunction(111);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glLightfv(light, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glLineStipple(JNIEnv *__env, jclass clazz, jint factor, jshort pattern) {
    glLineStipplePROC glLineStipple = (glLineStipplePROC)tlsGetFunction(112);
    UNUSED_PARAM(clazz)
    glLineStipple(factor, pattern);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glListBase(JNIEnv *__env, jclass clazz, jint base) {
    glListBasePROC glListBase = (glListBasePROC)tlsGetFunction(113);
    UNUSED_PARAM(clazz)
    glListBase(base);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglLoadMatrixf__J(JNIEnv *__env, jclass clazz, jlong mAddress) {
    glLoadMatrixfPROC glLoadMatrixf = (glLoadMatrixfPROC)tlsGetFunction(114);
    intptr_t m = (intptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glLoadMatrixf(m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglLoadMatrixd__J(JNIEnv *__env, jclass clazz, jlong mAddress) {
    glLoadMatrixdPROC glLoadMatrixd = (glLoadMatrixdPROC)tlsGetFunction(115);
    intptr_t m = (intptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glLoadMatrixd(m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glLoadIdentity(JNIEnv *__env, jclass clazz) {
    glLoadIdentityPROC glLoadIdentity = (glLoadIdentityPROC)tlsGetFunction(116);
    UNUSED_PARAM(clazz)
    glLoadIdentity();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glLoadName(JNIEnv *__env, jclass clazz, jint name) {
    glLoadNamePROC glLoadName = (glLoadNamePROC)tlsGetFunction(117);
    UNUSED_PARAM(clazz)
    glLoadName(name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMap1f__IFFIIJ(JNIEnv *__env, jclass clazz, jint target, jfloat u1, jfloat u2, jint stride, jint order, jlong pointsAddress) {
    glMap1fPROC glMap1f = (glMap1fPROC)tlsGetFunction(118);
    intptr_t points = (intptr_t)pointsAddress;
    UNUSED_PARAM(clazz)
    glMap1f(target, u1, u2, stride, order, points);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMap1d__IDDIIJ(JNIEnv *__env, jclass clazz, jint target, jdouble u1, jdouble u2, jint stride, jint order, jlong pointsAddress) {
    glMap1dPROC glMap1d = (glMap1dPROC)tlsGetFunction(119);
    intptr_t points = (intptr_t)pointsAddress;
    UNUSED_PARAM(clazz)
    glMap1d(target, u1, u2, stride, order, points);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMap2f__IFFIIFFIIJ(JNIEnv *__env, jclass clazz, jint target, jfloat u1, jfloat u2, jint ustride, jint uorder, jfloat v1, jfloat v2, jint vstride, jint vorder, jlong pointsAddress) {
    glMap2fPROC glMap2f = (glMap2fPROC)tlsGetFunction(120);
    intptr_t points = (intptr_t)pointsAddress;
    UNUSED_PARAM(clazz)
    glMap2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMap2d__IDDIIDDIIJ(JNIEnv *__env, jclass clazz, jint target, jdouble u1, jdouble u2, jint ustride, jint uorder, jdouble v1, jdouble v2, jint vstride, jint vorder, jlong pointsAddress) {
    glMap2dPROC glMap2d = (glMap2dPROC)tlsGetFunction(121);
    intptr_t points = (intptr_t)pointsAddress;
    UNUSED_PARAM(clazz)
    glMap2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glMapGrid1f(JNIEnv *__env, jclass clazz, jint n, jfloat u1, jfloat u2) {
    glMapGrid1fPROC glMapGrid1f = (glMapGrid1fPROC)tlsGetFunction(122);
    UNUSED_PARAM(clazz)
    glMapGrid1f(n, u1, u2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glMapGrid1d(JNIEnv *__env, jclass clazz, jint n, jdouble u1, jdouble u2) {
    glMapGrid1dPROC glMapGrid1d = (glMapGrid1dPROC)tlsGetFunction(123);
    UNUSED_PARAM(clazz)
    glMapGrid1d(n, u1, u2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glMapGrid2f(JNIEnv *__env, jclass clazz, jint un, jfloat u1, jfloat u2, jint vn, jfloat v1, jfloat v2) {
    glMapGrid2fPROC glMapGrid2f = (glMapGrid2fPROC)tlsGetFunction(124);
    UNUSED_PARAM(clazz)
    glMapGrid2f(un, u1, u2, vn, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glMapGrid2d(JNIEnv *__env, jclass clazz, jint un, jdouble u1, jdouble u2, jint vn, jdouble v1, jdouble v2) {
    glMapGrid2dPROC glMapGrid2d = (glMapGrid2dPROC)tlsGetFunction(125);
    UNUSED_PARAM(clazz)
    glMapGrid2d(un, u1, u2, vn, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glMateriali(JNIEnv *__env, jclass clazz, jint face, jint pname, jint param) {
    glMaterialiPROC glMateriali = (glMaterialiPROC)tlsGetFunction(126);
    UNUSED_PARAM(clazz)
    glMateriali(face, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glMaterialf(JNIEnv *__env, jclass clazz, jint face, jint pname, jfloat param) {
    glMaterialfPROC glMaterialf = (glMaterialfPROC)tlsGetFunction(127);
    UNUSED_PARAM(clazz)
    glMaterialf(face, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMaterialiv__IIJ(JNIEnv *__env, jclass clazz, jint face, jint pname, jlong paramsAddress) {
    glMaterialivPROC glMaterialiv = (glMaterialivPROC)tlsGetFunction(128);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glMaterialiv(face, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMaterialfv__IIJ(JNIEnv *__env, jclass clazz, jint face, jint pname, jlong paramsAddress) {
    glMaterialfvPROC glMaterialfv = (glMaterialfvPROC)tlsGetFunction(129);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glMaterialfv(face, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glMatrixMode(JNIEnv *__env, jclass clazz, jint mode) {
    glMatrixModePROC glMatrixMode = (glMatrixModePROC)tlsGetFunction(130);
    UNUSED_PARAM(clazz)
    glMatrixMode(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMultMatrixf__J(JNIEnv *__env, jclass clazz, jlong mAddress) {
    glMultMatrixfPROC glMultMatrixf = (glMultMatrixfPROC)tlsGetFunction(131);
    intptr_t m = (intptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMultMatrixf(m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglMultMatrixd__J(JNIEnv *__env, jclass clazz, jlong mAddress) {
    glMultMatrixdPROC glMultMatrixd = (glMultMatrixdPROC)tlsGetFunction(132);
    intptr_t m = (intptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMultMatrixd(m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glFrustum(JNIEnv *__env, jclass clazz, jdouble l, jdouble r, jdouble b, jdouble t, jdouble n, jdouble f) {
    glFrustumPROC glFrustum = (glFrustumPROC)tlsGetFunction(133);
    UNUSED_PARAM(clazz)
    glFrustum(l, r, b, t, n, f);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glNewList(JNIEnv *__env, jclass clazz, jint n, jint mode) {
    glNewListPROC glNewList = (glNewListPROC)tlsGetFunction(134);
    UNUSED_PARAM(clazz)
    glNewList(n, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glEndList(JNIEnv *__env, jclass clazz) {
    glEndListPROC glEndList = (glEndListPROC)tlsGetFunction(135);
    UNUSED_PARAM(clazz)
    glEndList();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glNormal3f(JNIEnv *__env, jclass clazz, jfloat nx, jfloat ny, jfloat nz) {
    glNormal3fPROC glNormal3f = (glNormal3fPROC)tlsGetFunction(136);
    UNUSED_PARAM(clazz)
    glNormal3f(nx, ny, nz);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glNormal3b(JNIEnv *__env, jclass clazz, jbyte nx, jbyte ny, jbyte nz) {
    glNormal3bPROC glNormal3b = (glNormal3bPROC)tlsGetFunction(137);
    UNUSED_PARAM(clazz)
    glNormal3b(nx, ny, nz);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glNormal3s(JNIEnv *__env, jclass clazz, jshort nx, jshort ny, jshort nz) {
    glNormal3sPROC glNormal3s = (glNormal3sPROC)tlsGetFunction(138);
    UNUSED_PARAM(clazz)
    glNormal3s(nx, ny, nz);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glNormal3i(JNIEnv *__env, jclass clazz, jint nx, jint ny, jint nz) {
    glNormal3iPROC glNormal3i = (glNormal3iPROC)tlsGetFunction(139);
    UNUSED_PARAM(clazz)
    glNormal3i(nx, ny, nz);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glNormal3d(JNIEnv *__env, jclass clazz, jdouble nx, jdouble ny, jdouble nz) {
    glNormal3dPROC glNormal3d = (glNormal3dPROC)tlsGetFunction(140);
    UNUSED_PARAM(clazz)
    glNormal3d(nx, ny, nz);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglNormal3fv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glNormal3fvPROC glNormal3fv = (glNormal3fvPROC)tlsGetFunction(141);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glNormal3fv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglNormal3bv(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glNormal3bvPROC glNormal3bv = (glNormal3bvPROC)tlsGetFunction(142);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glNormal3bv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglNormal3sv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glNormal3svPROC glNormal3sv = (glNormal3svPROC)tlsGetFunction(143);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glNormal3sv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglNormal3iv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glNormal3ivPROC glNormal3iv = (glNormal3ivPROC)tlsGetFunction(144);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glNormal3iv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglNormal3dv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glNormal3dvPROC glNormal3dv = (glNormal3dvPROC)tlsGetFunction(145);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glNormal3dv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglNormalPointer(JNIEnv *__env, jclass clazz, jint type, jint stride, jlong pointerAddress) {
    glNormalPointerPROC glNormalPointer = (glNormalPointerPROC)tlsGetFunction(146);
    intptr_t pointer = (intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glNormalPointer(type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glOrtho(JNIEnv *__env, jclass clazz, jdouble l, jdouble r, jdouble b, jdouble t, jdouble n, jdouble f) {
    glOrthoPROC glOrtho = (glOrthoPROC)tlsGetFunction(147);
    UNUSED_PARAM(clazz)
    glOrtho(l, r, b, t, n, f);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPassThrough(JNIEnv *__env, jclass clazz, jfloat token) {
    glPassThroughPROC glPassThrough = (glPassThroughPROC)tlsGetFunction(148);
    UNUSED_PARAM(clazz)
    glPassThrough(token);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPixelMapfv__IIJ(JNIEnv *__env, jclass clazz, jint map, jint size, jlong valuesAddress) {
    glPixelMapfvPROC glPixelMapfv = (glPixelMapfvPROC)tlsGetFunction(149);
    intptr_t values = (intptr_t)valuesAddress;
    UNUSED_PARAM(clazz)
    glPixelMapfv(map, size, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPixelMapusv__IIJ(JNIEnv *__env, jclass clazz, jint map, jint size, jlong valuesAddress) {
    glPixelMapusvPROC glPixelMapusv = (glPixelMapusvPROC)tlsGetFunction(150);
    intptr_t values = (intptr_t)valuesAddress;
    UNUSED_PARAM(clazz)
    glPixelMapusv(map, size, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPixelMapuiv__IIJ(JNIEnv *__env, jclass clazz, jint map, jint size, jlong valuesAddress) {
    glPixelMapuivPROC glPixelMapuiv = (glPixelMapuivPROC)tlsGetFunction(151);
    intptr_t values = (intptr_t)valuesAddress;
    UNUSED_PARAM(clazz)
    glPixelMapuiv(map, size, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPixelTransferi(JNIEnv *__env, jclass clazz, jint pname, jint param) {
    glPixelTransferiPROC glPixelTransferi = (glPixelTransferiPROC)tlsGetFunction(152);
    UNUSED_PARAM(clazz)
    glPixelTransferi(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPixelTransferf(JNIEnv *__env, jclass clazz, jint pname, jfloat param) {
    glPixelTransferfPROC glPixelTransferf = (glPixelTransferfPROC)tlsGetFunction(153);
    UNUSED_PARAM(clazz)
    glPixelTransferf(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPixelZoom(JNIEnv *__env, jclass clazz, jfloat xfactor, jfloat yfactor) {
    glPixelZoomPROC glPixelZoom = (glPixelZoomPROC)tlsGetFunction(154);
    UNUSED_PARAM(clazz)
    glPixelZoom(xfactor, yfactor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPolygonStipple(JNIEnv *__env, jclass clazz, jlong patternAddress) {
    glPolygonStipplePROC glPolygonStipple = (glPolygonStipplePROC)tlsGetFunction(155);
    intptr_t pattern = (intptr_t)patternAddress;
    UNUSED_PARAM(clazz)
    glPolygonStipple(pattern);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPushAttrib(JNIEnv *__env, jclass clazz, jint mask) {
    glPushAttribPROC glPushAttrib = (glPushAttribPROC)tlsGetFunction(156);
    UNUSED_PARAM(clazz)
    glPushAttrib(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPushClientAttrib(JNIEnv *__env, jclass clazz, jint mask) {
    glPushClientAttribPROC glPushClientAttrib = (glPushClientAttribPROC)tlsGetFunction(157);
    UNUSED_PARAM(clazz)
    glPushClientAttrib(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPopAttrib(JNIEnv *__env, jclass clazz) {
    glPopAttribPROC glPopAttrib = (glPopAttribPROC)tlsGetFunction(158);
    UNUSED_PARAM(clazz)
    glPopAttrib();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPopClientAttrib(JNIEnv *__env, jclass clazz) {
    glPopClientAttribPROC glPopClientAttrib = (glPopClientAttribPROC)tlsGetFunction(159);
    UNUSED_PARAM(clazz)
    glPopClientAttrib();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPopMatrix(JNIEnv *__env, jclass clazz) {
    glPopMatrixPROC glPopMatrix = (glPopMatrixPROC)tlsGetFunction(160);
    UNUSED_PARAM(clazz)
    glPopMatrix();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPopName(JNIEnv *__env, jclass clazz) {
    glPopNamePROC glPopName = (glPopNamePROC)tlsGetFunction(161);
    UNUSED_PARAM(clazz)
    glPopName();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglPrioritizeTextures__IJJ(JNIEnv *__env, jclass clazz, jint n, jlong texturesAddress, jlong prioritiesAddress) {
    glPrioritizeTexturesPROC glPrioritizeTextures = (glPrioritizeTexturesPROC)tlsGetFunction(162);
    intptr_t textures = (intptr_t)texturesAddress;
    intptr_t priorities = (intptr_t)prioritiesAddress;
    UNUSED_PARAM(clazz)
    glPrioritizeTextures(n, textures, priorities);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPushMatrix(JNIEnv *__env, jclass clazz) {
    glPushMatrixPROC glPushMatrix = (glPushMatrixPROC)tlsGetFunction(163);
    UNUSED_PARAM(clazz)
    glPushMatrix();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glPushName(JNIEnv *__env, jclass clazz, jint name) {
    glPushNamePROC glPushName = (glPushNamePROC)tlsGetFunction(164);
    UNUSED_PARAM(clazz)
    glPushName(name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRasterPos2i(JNIEnv *__env, jclass clazz, jint x, jint y) {
    glRasterPos2iPROC glRasterPos2i = (glRasterPos2iPROC)tlsGetFunction(165);
    UNUSED_PARAM(clazz)
    glRasterPos2i(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRasterPos2s(JNIEnv *__env, jclass clazz, jshort x, jshort y) {
    glRasterPos2sPROC glRasterPos2s = (glRasterPos2sPROC)tlsGetFunction(166);
    UNUSED_PARAM(clazz)
    glRasterPos2s(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRasterPos2f(JNIEnv *__env, jclass clazz, jfloat x, jfloat y) {
    glRasterPos2fPROC glRasterPos2f = (glRasterPos2fPROC)tlsGetFunction(167);
    UNUSED_PARAM(clazz)
    glRasterPos2f(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRasterPos2d(JNIEnv *__env, jclass clazz, jdouble x, jdouble y) {
    glRasterPos2dPROC glRasterPos2d = (glRasterPos2dPROC)tlsGetFunction(168);
    UNUSED_PARAM(clazz)
    glRasterPos2d(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos2iv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glRasterPos2ivPROC glRasterPos2iv = (glRasterPos2ivPROC)tlsGetFunction(169);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glRasterPos2iv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos2sv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glRasterPos2svPROC glRasterPos2sv = (glRasterPos2svPROC)tlsGetFunction(170);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glRasterPos2sv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos2fv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glRasterPos2fvPROC glRasterPos2fv = (glRasterPos2fvPROC)tlsGetFunction(171);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glRasterPos2fv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos2dv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glRasterPos2dvPROC glRasterPos2dv = (glRasterPos2dvPROC)tlsGetFunction(172);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glRasterPos2dv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRasterPos3i(JNIEnv *__env, jclass clazz, jint x, jint y, jint z) {
    glRasterPos3iPROC glRasterPos3i = (glRasterPos3iPROC)tlsGetFunction(173);
    UNUSED_PARAM(clazz)
    glRasterPos3i(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRasterPos3s(JNIEnv *__env, jclass clazz, jshort x, jshort y, jshort z) {
    glRasterPos3sPROC glRasterPos3s = (glRasterPos3sPROC)tlsGetFunction(174);
    UNUSED_PARAM(clazz)
    glRasterPos3s(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRasterPos3f(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z) {
    glRasterPos3fPROC glRasterPos3f = (glRasterPos3fPROC)tlsGetFunction(175);
    UNUSED_PARAM(clazz)
    glRasterPos3f(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRasterPos3d(JNIEnv *__env, jclass clazz, jdouble x, jdouble y, jdouble z) {
    glRasterPos3dPROC glRasterPos3d = (glRasterPos3dPROC)tlsGetFunction(176);
    UNUSED_PARAM(clazz)
    glRasterPos3d(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos3iv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glRasterPos3ivPROC glRasterPos3iv = (glRasterPos3ivPROC)tlsGetFunction(177);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glRasterPos3iv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos3sv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glRasterPos3svPROC glRasterPos3sv = (glRasterPos3svPROC)tlsGetFunction(178);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glRasterPos3sv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos3fv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glRasterPos3fvPROC glRasterPos3fv = (glRasterPos3fvPROC)tlsGetFunction(179);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glRasterPos3fv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos3dv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glRasterPos3dvPROC glRasterPos3dv = (glRasterPos3dvPROC)tlsGetFunction(180);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glRasterPos3dv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRasterPos4i(JNIEnv *__env, jclass clazz, jint x, jint y, jint z, jint w) {
    glRasterPos4iPROC glRasterPos4i = (glRasterPos4iPROC)tlsGetFunction(181);
    UNUSED_PARAM(clazz)
    glRasterPos4i(x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRasterPos4s(JNIEnv *__env, jclass clazz, jshort x, jshort y, jshort z, jshort w) {
    glRasterPos4sPROC glRasterPos4s = (glRasterPos4sPROC)tlsGetFunction(182);
    UNUSED_PARAM(clazz)
    glRasterPos4s(x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRasterPos4f(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z, jfloat w) {
    glRasterPos4fPROC glRasterPos4f = (glRasterPos4fPROC)tlsGetFunction(183);
    UNUSED_PARAM(clazz)
    glRasterPos4f(x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRasterPos4d(JNIEnv *__env, jclass clazz, jdouble x, jdouble y, jdouble z, jdouble w) {
    glRasterPos4dPROC glRasterPos4d = (glRasterPos4dPROC)tlsGetFunction(184);
    UNUSED_PARAM(clazz)
    glRasterPos4d(x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos4iv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glRasterPos4ivPROC glRasterPos4iv = (glRasterPos4ivPROC)tlsGetFunction(185);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glRasterPos4iv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos4sv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glRasterPos4svPROC glRasterPos4sv = (glRasterPos4svPROC)tlsGetFunction(186);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glRasterPos4sv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos4fv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glRasterPos4fvPROC glRasterPos4fv = (glRasterPos4fvPROC)tlsGetFunction(187);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glRasterPos4fv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRasterPos4dv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glRasterPos4dvPROC glRasterPos4dv = (glRasterPos4dvPROC)tlsGetFunction(188);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glRasterPos4dv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRecti(JNIEnv *__env, jclass clazz, jint x1, jint y1, jint x2, jint y2) {
    glRectiPROC glRecti = (glRectiPROC)tlsGetFunction(189);
    UNUSED_PARAM(clazz)
    glRecti(x1, y1, x2, y2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRects(JNIEnv *__env, jclass clazz, jshort x1, jshort y1, jshort x2, jshort y2) {
    glRectsPROC glRects = (glRectsPROC)tlsGetFunction(190);
    UNUSED_PARAM(clazz)
    glRects(x1, y1, x2, y2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRectf(JNIEnv *__env, jclass clazz, jfloat x1, jfloat y1, jfloat x2, jfloat y2) {
    glRectfPROC glRectf = (glRectfPROC)tlsGetFunction(191);
    UNUSED_PARAM(clazz)
    glRectf(x1, y1, x2, y2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRectd(JNIEnv *__env, jclass clazz, jdouble x1, jdouble y1, jdouble x2, jdouble y2) {
    glRectdPROC glRectd = (glRectdPROC)tlsGetFunction(192);
    UNUSED_PARAM(clazz)
    glRectd(x1, y1, x2, y2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRectiv__JJ(JNIEnv *__env, jclass clazz, jlong v1Address, jlong v2Address) {
    glRectivPROC glRectiv = (glRectivPROC)tlsGetFunction(193);
    intptr_t v1 = (intptr_t)v1Address;
    intptr_t v2 = (intptr_t)v2Address;
    UNUSED_PARAM(clazz)
    glRectiv(v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRectsv__JJ(JNIEnv *__env, jclass clazz, jlong v1Address, jlong v2Address) {
    glRectsvPROC glRectsv = (glRectsvPROC)tlsGetFunction(194);
    intptr_t v1 = (intptr_t)v1Address;
    intptr_t v2 = (intptr_t)v2Address;
    UNUSED_PARAM(clazz)
    glRectsv(v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRectfv__JJ(JNIEnv *__env, jclass clazz, jlong v1Address, jlong v2Address) {
    glRectfvPROC glRectfv = (glRectfvPROC)tlsGetFunction(195);
    intptr_t v1 = (intptr_t)v1Address;
    intptr_t v2 = (intptr_t)v2Address;
    UNUSED_PARAM(clazz)
    glRectfv(v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglRectdv__JJ(JNIEnv *__env, jclass clazz, jlong v1Address, jlong v2Address) {
    glRectdvPROC glRectdv = (glRectdvPROC)tlsGetFunction(196);
    intptr_t v1 = (intptr_t)v1Address;
    intptr_t v2 = (intptr_t)v2Address;
    UNUSED_PARAM(clazz)
    glRectdv(v1, v2);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL11_glRenderMode(JNIEnv *__env, jclass clazz, jint mode) {
    glRenderModePROC glRenderMode = (glRenderModePROC)tlsGetFunction(197);
    UNUSED_PARAM(clazz)
    return (jint)glRenderMode(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRotatef(JNIEnv *__env, jclass clazz, jfloat angle, jfloat x, jfloat y, jfloat z) {
    glRotatefPROC glRotatef = (glRotatefPROC)tlsGetFunction(198);
    UNUSED_PARAM(clazz)
    glRotatef(angle, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glRotated(JNIEnv *__env, jclass clazz, jdouble angle, jdouble x, jdouble y, jdouble z) {
    glRotatedPROC glRotated = (glRotatedPROC)tlsGetFunction(199);
    UNUSED_PARAM(clazz)
    glRotated(angle, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glScalef(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z) {
    glScalefPROC glScalef = (glScalefPROC)tlsGetFunction(200);
    UNUSED_PARAM(clazz)
    glScalef(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glScaled(JNIEnv *__env, jclass clazz, jdouble x, jdouble y, jdouble z) {
    glScaledPROC glScaled = (glScaledPROC)tlsGetFunction(201);
    UNUSED_PARAM(clazz)
    glScaled(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglSelectBuffer__IJ(JNIEnv *__env, jclass clazz, jint size, jlong bufferAddress) {
    glSelectBufferPROC glSelectBuffer = (glSelectBufferPROC)tlsGetFunction(202);
    intptr_t buffer = (intptr_t)bufferAddress;
    UNUSED_PARAM(clazz)
    glSelectBuffer(size, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glShadeModel(JNIEnv *__env, jclass clazz, jint mode) {
    glShadeModelPROC glShadeModel = (glShadeModelPROC)tlsGetFunction(203);
    UNUSED_PARAM(clazz)
    glShadeModel(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord1f(JNIEnv *__env, jclass clazz, jfloat s) {
    glTexCoord1fPROC glTexCoord1f = (glTexCoord1fPROC)tlsGetFunction(204);
    UNUSED_PARAM(clazz)
    glTexCoord1f(s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord1s(JNIEnv *__env, jclass clazz, jshort s) {
    glTexCoord1sPROC glTexCoord1s = (glTexCoord1sPROC)tlsGetFunction(205);
    UNUSED_PARAM(clazz)
    glTexCoord1s(s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord1i(JNIEnv *__env, jclass clazz, jint s) {
    glTexCoord1iPROC glTexCoord1i = (glTexCoord1iPROC)tlsGetFunction(206);
    UNUSED_PARAM(clazz)
    glTexCoord1i(s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord1d(JNIEnv *__env, jclass clazz, jdouble s) {
    glTexCoord1dPROC glTexCoord1d = (glTexCoord1dPROC)tlsGetFunction(207);
    UNUSED_PARAM(clazz)
    glTexCoord1d(s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord1fv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord1fvPROC glTexCoord1fv = (glTexCoord1fvPROC)tlsGetFunction(208);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord1fv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord1sv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord1svPROC glTexCoord1sv = (glTexCoord1svPROC)tlsGetFunction(209);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord1sv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord1iv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord1ivPROC glTexCoord1iv = (glTexCoord1ivPROC)tlsGetFunction(210);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord1iv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord1dv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord1dvPROC glTexCoord1dv = (glTexCoord1dvPROC)tlsGetFunction(211);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord1dv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord2f(JNIEnv *__env, jclass clazz, jfloat s, jfloat t) {
    glTexCoord2fPROC glTexCoord2f = (glTexCoord2fPROC)tlsGetFunction(212);
    UNUSED_PARAM(clazz)
    glTexCoord2f(s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord2s(JNIEnv *__env, jclass clazz, jshort s, jshort t) {
    glTexCoord2sPROC glTexCoord2s = (glTexCoord2sPROC)tlsGetFunction(213);
    UNUSED_PARAM(clazz)
    glTexCoord2s(s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord2i(JNIEnv *__env, jclass clazz, jint s, jint t) {
    glTexCoord2iPROC glTexCoord2i = (glTexCoord2iPROC)tlsGetFunction(214);
    UNUSED_PARAM(clazz)
    glTexCoord2i(s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord2d(JNIEnv *__env, jclass clazz, jdouble s, jdouble t) {
    glTexCoord2dPROC glTexCoord2d = (glTexCoord2dPROC)tlsGetFunction(215);
    UNUSED_PARAM(clazz)
    glTexCoord2d(s, t);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord2fv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord2fvPROC glTexCoord2fv = (glTexCoord2fvPROC)tlsGetFunction(216);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord2fv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord2sv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord2svPROC glTexCoord2sv = (glTexCoord2svPROC)tlsGetFunction(217);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord2sv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord2iv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord2ivPROC glTexCoord2iv = (glTexCoord2ivPROC)tlsGetFunction(218);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord2iv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord2dv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord2dvPROC glTexCoord2dv = (glTexCoord2dvPROC)tlsGetFunction(219);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord2dv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord3f(JNIEnv *__env, jclass clazz, jfloat s, jfloat t, jfloat r) {
    glTexCoord3fPROC glTexCoord3f = (glTexCoord3fPROC)tlsGetFunction(220);
    UNUSED_PARAM(clazz)
    glTexCoord3f(s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord3s(JNIEnv *__env, jclass clazz, jshort s, jshort t, jshort r) {
    glTexCoord3sPROC glTexCoord3s = (glTexCoord3sPROC)tlsGetFunction(221);
    UNUSED_PARAM(clazz)
    glTexCoord3s(s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord3i(JNIEnv *__env, jclass clazz, jint s, jint t, jint r) {
    glTexCoord3iPROC glTexCoord3i = (glTexCoord3iPROC)tlsGetFunction(222);
    UNUSED_PARAM(clazz)
    glTexCoord3i(s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord3d(JNIEnv *__env, jclass clazz, jdouble s, jdouble t, jdouble r) {
    glTexCoord3dPROC glTexCoord3d = (glTexCoord3dPROC)tlsGetFunction(223);
    UNUSED_PARAM(clazz)
    glTexCoord3d(s, t, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord3fv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord3fvPROC glTexCoord3fv = (glTexCoord3fvPROC)tlsGetFunction(224);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord3fv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord3sv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord3svPROC glTexCoord3sv = (glTexCoord3svPROC)tlsGetFunction(225);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord3sv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord3iv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord3ivPROC glTexCoord3iv = (glTexCoord3ivPROC)tlsGetFunction(226);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord3iv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord3dv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord3dvPROC glTexCoord3dv = (glTexCoord3dvPROC)tlsGetFunction(227);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord3dv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord4f(JNIEnv *__env, jclass clazz, jfloat s, jfloat t, jfloat r, jfloat q) {
    glTexCoord4fPROC glTexCoord4f = (glTexCoord4fPROC)tlsGetFunction(228);
    UNUSED_PARAM(clazz)
    glTexCoord4f(s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord4s(JNIEnv *__env, jclass clazz, jshort s, jshort t, jshort r, jshort q) {
    glTexCoord4sPROC glTexCoord4s = (glTexCoord4sPROC)tlsGetFunction(229);
    UNUSED_PARAM(clazz)
    glTexCoord4s(s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord4i(JNIEnv *__env, jclass clazz, jint s, jint t, jint r, jint q) {
    glTexCoord4iPROC glTexCoord4i = (glTexCoord4iPROC)tlsGetFunction(230);
    UNUSED_PARAM(clazz)
    glTexCoord4i(s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexCoord4d(JNIEnv *__env, jclass clazz, jdouble s, jdouble t, jdouble r, jdouble q) {
    glTexCoord4dPROC glTexCoord4d = (glTexCoord4dPROC)tlsGetFunction(231);
    UNUSED_PARAM(clazz)
    glTexCoord4d(s, t, r, q);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord4fv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord4fvPROC glTexCoord4fv = (glTexCoord4fvPROC)tlsGetFunction(232);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord4fv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord4sv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord4svPROC glTexCoord4sv = (glTexCoord4svPROC)tlsGetFunction(233);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord4sv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord4iv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord4ivPROC glTexCoord4iv = (glTexCoord4ivPROC)tlsGetFunction(234);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord4iv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoord4dv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glTexCoord4dvPROC glTexCoord4dv = (glTexCoord4dvPROC)tlsGetFunction(235);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glTexCoord4dv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexCoordPointer(JNIEnv *__env, jclass clazz, jint size, jint type, jint stride, jlong pointerAddress) {
    glTexCoordPointerPROC glTexCoordPointer = (glTexCoordPointerPROC)tlsGetFunction(236);
    intptr_t pointer = (intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glTexCoordPointer(size, type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexEnvi(JNIEnv *__env, jclass clazz, jint target, jint pname, jint param) {
    glTexEnviPROC glTexEnvi = (glTexEnviPROC)tlsGetFunction(237);
    UNUSED_PARAM(clazz)
    glTexEnvi(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexEnviv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glTexEnvivPROC glTexEnviv = (glTexEnvivPROC)tlsGetFunction(238);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexEnviv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexEnvf(JNIEnv *__env, jclass clazz, jint target, jint pname, jfloat param) {
    glTexEnvfPROC glTexEnvf = (glTexEnvfPROC)tlsGetFunction(239);
    UNUSED_PARAM(clazz)
    glTexEnvf(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexEnvfv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glTexEnvfvPROC glTexEnvfv = (glTexEnvfvPROC)tlsGetFunction(240);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexEnvfv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexGeni(JNIEnv *__env, jclass clazz, jint coord, jint pname, jint param) {
    glTexGeniPROC glTexGeni = (glTexGeniPROC)tlsGetFunction(241);
    UNUSED_PARAM(clazz)
    glTexGeni(coord, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexGeniv__IIJ(JNIEnv *__env, jclass clazz, jint coord, jint pname, jlong paramsAddress) {
    glTexGenivPROC glTexGeniv = (glTexGenivPROC)tlsGetFunction(242);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexGeniv(coord, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexGenf(JNIEnv *__env, jclass clazz, jint coord, jint pname, jfloat param) {
    glTexGenfPROC glTexGenf = (glTexGenfPROC)tlsGetFunction(243);
    UNUSED_PARAM(clazz)
    glTexGenf(coord, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexGenfv__IIJ(JNIEnv *__env, jclass clazz, jint coord, jint pname, jlong paramsAddress) {
    glTexGenfvPROC glTexGenfv = (glTexGenfvPROC)tlsGetFunction(244);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexGenfv(coord, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTexGend(JNIEnv *__env, jclass clazz, jint coord, jint pname, jdouble param) {
    glTexGendPROC glTexGend = (glTexGendPROC)tlsGetFunction(245);
    UNUSED_PARAM(clazz)
    glTexGend(coord, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglTexGendv__IIJ(JNIEnv *__env, jclass clazz, jint coord, jint pname, jlong paramsAddress) {
    glTexGendvPROC glTexGendv = (glTexGendvPROC)tlsGetFunction(246);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexGendv(coord, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTranslatef(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z) {
    glTranslatefPROC glTranslatef = (glTranslatefPROC)tlsGetFunction(247);
    UNUSED_PARAM(clazz)
    glTranslatef(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glTranslated(JNIEnv *__env, jclass clazz, jdouble x, jdouble y, jdouble z) {
    glTranslatedPROC glTranslated = (glTranslatedPROC)tlsGetFunction(248);
    UNUSED_PARAM(clazz)
    glTranslated(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glVertex2f(JNIEnv *__env, jclass clazz, jfloat x, jfloat y) {
    glVertex2fPROC glVertex2f = (glVertex2fPROC)tlsGetFunction(249);
    UNUSED_PARAM(clazz)
    glVertex2f(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glVertex2s(JNIEnv *__env, jclass clazz, jshort x, jshort y) {
    glVertex2sPROC glVertex2s = (glVertex2sPROC)tlsGetFunction(250);
    UNUSED_PARAM(clazz)
    glVertex2s(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glVertex2i(JNIEnv *__env, jclass clazz, jint x, jint y) {
    glVertex2iPROC glVertex2i = (glVertex2iPROC)tlsGetFunction(251);
    UNUSED_PARAM(clazz)
    glVertex2i(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glVertex2d(JNIEnv *__env, jclass clazz, jdouble x, jdouble y) {
    glVertex2dPROC glVertex2d = (glVertex2dPROC)tlsGetFunction(252);
    UNUSED_PARAM(clazz)
    glVertex2d(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex2fv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glVertex2fvPROC glVertex2fv = (glVertex2fvPROC)tlsGetFunction(253);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glVertex2fv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex2sv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glVertex2svPROC glVertex2sv = (glVertex2svPROC)tlsGetFunction(254);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glVertex2sv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex2iv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glVertex2ivPROC glVertex2iv = (glVertex2ivPROC)tlsGetFunction(255);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glVertex2iv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex2dv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glVertex2dvPROC glVertex2dv = (glVertex2dvPROC)tlsGetFunction(256);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glVertex2dv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glVertex3f(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z) {
    glVertex3fPROC glVertex3f = (glVertex3fPROC)tlsGetFunction(257);
    UNUSED_PARAM(clazz)
    glVertex3f(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glVertex3s(JNIEnv *__env, jclass clazz, jshort x, jshort y, jshort z) {
    glVertex3sPROC glVertex3s = (glVertex3sPROC)tlsGetFunction(258);
    UNUSED_PARAM(clazz)
    glVertex3s(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glVertex3i(JNIEnv *__env, jclass clazz, jint x, jint y, jint z) {
    glVertex3iPROC glVertex3i = (glVertex3iPROC)tlsGetFunction(259);
    UNUSED_PARAM(clazz)
    glVertex3i(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glVertex3d(JNIEnv *__env, jclass clazz, jdouble x, jdouble y, jdouble z) {
    glVertex3dPROC glVertex3d = (glVertex3dPROC)tlsGetFunction(260);
    UNUSED_PARAM(clazz)
    glVertex3d(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex3fv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glVertex3fvPROC glVertex3fv = (glVertex3fvPROC)tlsGetFunction(261);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glVertex3fv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex3sv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glVertex3svPROC glVertex3sv = (glVertex3svPROC)tlsGetFunction(262);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glVertex3sv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex3iv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glVertex3ivPROC glVertex3iv = (glVertex3ivPROC)tlsGetFunction(263);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glVertex3iv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex3dv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glVertex3dvPROC glVertex3dv = (glVertex3dvPROC)tlsGetFunction(264);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glVertex3dv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glVertex4f(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z, jfloat w) {
    glVertex4fPROC glVertex4f = (glVertex4fPROC)tlsGetFunction(265);
    UNUSED_PARAM(clazz)
    glVertex4f(x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glVertex4s(JNIEnv *__env, jclass clazz, jshort x, jshort y, jshort z, jshort w) {
    glVertex4sPROC glVertex4s = (glVertex4sPROC)tlsGetFunction(266);
    UNUSED_PARAM(clazz)
    glVertex4s(x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glVertex4i(JNIEnv *__env, jclass clazz, jint x, jint y, jint z, jint w) {
    glVertex4iPROC glVertex4i = (glVertex4iPROC)tlsGetFunction(267);
    UNUSED_PARAM(clazz)
    glVertex4i(x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_glVertex4d(JNIEnv *__env, jclass clazz, jdouble x, jdouble y, jdouble z, jdouble w) {
    glVertex4dPROC glVertex4d = (glVertex4dPROC)tlsGetFunction(268);
    UNUSED_PARAM(clazz)
    glVertex4d(x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex4fv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glVertex4fvPROC glVertex4fv = (glVertex4fvPROC)tlsGetFunction(269);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glVertex4fv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex4sv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glVertex4svPROC glVertex4sv = (glVertex4svPROC)tlsGetFunction(270);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glVertex4sv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex4iv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glVertex4ivPROC glVertex4iv = (glVertex4ivPROC)tlsGetFunction(271);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glVertex4iv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertex4dv__J(JNIEnv *__env, jclass clazz, jlong coordsAddress) {
    glVertex4dvPROC glVertex4dv = (glVertex4dvPROC)tlsGetFunction(272);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glVertex4dv(coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11_nglVertexPointer(JNIEnv *__env, jclass clazz, jint size, jint type, jint stride, jlong pointerAddress) {
    glVertexPointerPROC glVertexPointer = (glVertexPointerPROC)tlsGetFunction(273);
    intptr_t pointer = (intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glVertexPointer(size, type, stride, pointer);
}

EXTERN_C_EXIT
