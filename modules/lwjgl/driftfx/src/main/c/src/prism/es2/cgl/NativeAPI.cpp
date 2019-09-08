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

#include "CGLES2PrismBridge.h"

using namespace driftfx::internal::prism;
using namespace driftfx::internal::prism::es2::cgl;

extern "C" JNIEXPORT void JNICALL Java_org_eclipse_fx_drift_internal_NativeAPI_nInitializeES2Pipeline(JNIEnv *env, jclass cls, jlong pContext) {
	LogDebug("nInitializeES2Pipeline(" << pContext << ")")
	CGLES2PrismBridge::Initialize(pContext);
}

extern "C" JNIEXPORT jint JNICALL Java_org_eclipse_fx_drift_internal_NativeAPI_nES2ConnectTextureToIOSurface(JNIEnv* env, jclass cls, jint textureName, jint w, jint h, jlong ioSurfaceHandle) {
	LogDebug("nES2ConnectTextureToIOSurface(" << textureName << ", " << ioSurfaceHandle << ")");

	CGLES2PrismBridge* bridge = static_cast<CGLES2PrismBridge*>(PrismBridge::Get());
	return bridge->ConnectTextureToIOSurface(textureName, w, h, ioSurfaceHandle);
}
