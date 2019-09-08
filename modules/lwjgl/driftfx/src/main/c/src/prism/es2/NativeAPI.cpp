/*
 * Copyright (c) 2019 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks <ccaks@bestsolution.at> - initial API and implementation
 */

#include <utils/Logger.h>

#include <jni.h>

#include <iostream>
using namespace std;

#include "ES2PrismBridge.h"

#include <GL/glew.h>

using namespace driftfx::internal::prism;
using namespace driftfx::internal::prism::es2;

// TODO Rename
extern "C" JNIEXPORT void JNICALL Java_org_eclipse_fx_drift_internal_NativeAPI_nDestroyD3DPipeline(JNIEnv *env, jclass cls) {
	LogDebug("nDestroyPrismBridge()")
	PrismBridge::Destroy();
}

//thread_local GLContext* dummy = nullptr;

extern "C" JNIEXPORT void JNICALL Java_org_eclipse_fx_drift_internal_NativeAPI_nES2CopyTexture(JNIEnv *env, jclass cls, jint sourceTexture, jint destTexture, jint width, jint height) {
	ES2PrismBridge* bridge = static_cast<ES2PrismBridge*>(PrismBridge::Get());
	bridge->GetDefaultContext()->SetCurrent();
	bridge->CopyTexture(sourceTexture, destTexture, width, height);
	//bridge->GetDefaultContext()->UnsetCurrent();
}

extern "C" JNIEXPORT void JNICALL Java_org_eclipse_fx_drift_internal_NativeAPI_nES2DeleteTexture(JNIEnv* env, jclass cls, jint textureId) {
	GLuint tex = textureId;
	glDeleteTextures(1, &tex);
}

extern "C" JNIEXPORT void JNICALL Java_org_eclipse_fx_drift_internal_NativeAPI_nES2UploadTexture(JNIEnv *env, jclass cls, jint targetTexture, jint width, jint height, jlong memoryPointer, jlong memorySize) {
	ES2PrismBridge* bridge = static_cast<ES2PrismBridge*>(PrismBridge::Get());
	bridge->GetFXSharedGLContext()->SetCurrent();
	bridge->UploadTexture((unsigned int) targetTexture, (unsigned int) width, (unsigned int) height, (void*) memoryPointer, (unsigned long) memorySize);
}


