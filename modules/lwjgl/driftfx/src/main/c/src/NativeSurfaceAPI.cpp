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

#include <jni.h>

#include <DriftFX/math/Vec2.h>

#include "prism/PrismBridge.h"

#include "NativeSurface.h"
#include "NativeSurfaceRegistry.h"
#include "JNINativeSurface.h"

#include "SharedTexture.h"


#include "Configuration.h"

#include <iostream>
#include <iomanip>

#include <TransferModeManager.h>

#include <utils/JNIHelper.h>
#include <utils/Logger.h>

using namespace std;

using namespace driftfx::internal;
using namespace driftfx::math;

extern "C" JNIEXPORT void JNICALL Java_org_eclipse_fx_drift_internal_NativeAPI_nInitialize(JNIEnv *env, jclass cls) {
	LogDebug("nInitialize")
	JavaVM* jvm;
	env->GetJavaVM(&jvm);
	JNIHelper::Initialize(jvm);
	Configuration::Initialize();
	JNINativeSurface::Initialize();
}

extern "C" JNIEXPORT jlong JNICALL Java_org_eclipse_fx_drift_internal_NativeAPI_nCreateNativeSurface(JNIEnv *env, jclass cls, jobject surfaceObj) {
	LogDebug("nCreateNativeSurface")
	JNINativeSurface *api = new JNINativeSurface(surfaceObj);
	return NativeSurfaceRegistry::Get()->Create(api);
}

extern "C" JNIEXPORT void JNICALL Java_org_eclipse_fx_drift_internal_NativeAPI_nDestroyNativeSurface(JNIEnv *env, jclass cls, jlong surfaceId) {
	LogDebug("nDestroyNativeSurface")
	NativeSurfaceRegistry::Get()->Destroy((long) surfaceId);
}

extern "C" JNIEXPORT void JNICALL Java_org_eclipse_fx_drift_internal_NativeAPI_nUpdateSurface(JNIEnv *env, jclass cls, jlong surfaceId, jdouble width, jdouble height, jdouble screenScaleX, jdouble screenScaleY, jdouble userScaleX, jdouble userScaleY, jint transferMode) {
	NativeSurface* surface = NativeSurfaceRegistry::Get()->Get((long)surfaceId);
	surface->UpdateSurface(Vec2d((double)width, (double)height), Vec2d((double)screenScaleX, (double)screenScaleY), Vec2d((double)userScaleX, (double)userScaleY), (unsigned int) transferMode);
}

extern "C" JNIEXPORT void JNICALL Java_org_eclipse_fx_drift_internal_NativeAPI_nDisposeFrame(JNIEnv* env, jclass cls, jlong surfaceId, jlong frameId) {
	LogDebug("dispose frame " << dec << surfaceId << "." << dec << frameId);
	NativeSurface* surface = NativeSurfaceRegistry::Get()->Get((long) surfaceId);
	surface->DisposeFrame((long long) frameId);
}


jobject convert(JNIEnv* env, TransferMode* mode) {
	jclass jTransferModeCls = env->FindClass("org/eclipse/fx/drift/DriftFXSurface$TransferMode");
	jmethodID jNew = env->GetMethodID(jTransferModeCls, "<init>", "(Ljava/lang/String;I)V");
	jstring name = env->NewStringUTF(mode->Name().c_str());
	jobject type = env->NewObject(jTransferModeCls, jNew, name, (jint) mode->Id());
	return type;
}


extern "C" JNIEXPORT jobject JNICALL Java_org_eclipse_fx_drift_internal_NativeAPI_nGetPlatformDefaultTransferMode(JNIEnv* env, jclass cls) {
	auto platformDefault = TransferModeManager::Instance()->GetPlatformDefault();
	return convert(env, platformDefault);
}

extern "C" JNIEXPORT jobject JNICALL Java_org_eclipse_fx_drift_internal_NativeAPI_nGetFallbackTransferMode(JNIEnv* env, jclass cls) {
	auto fallback = TransferModeManager::Instance()->GetFallback();
	return convert(env, fallback);
}

extern "C" JNIEXPORT jobjectArray JNICALL Java_org_eclipse_fx_drift_internal_NativeAPI_nGetTransferModes(JNIEnv* env, jclass cls) {
	LogDebug("getting transfer modes");

	auto modes = TransferModeManager::Instance()->GetAvailableModes();

	auto count = (jsize)modes.size();

	jclass jTransferModeCls = env->FindClass("org/eclipse/fx/drift/DriftFXSurface$TransferMode");
	jobjectArray result = env->NewObjectArray(count, jTransferModeCls, 0);

	int idx = 0;
	for (auto it = modes.begin(); it != modes.end(); it++) {
		jobject mode = convert(env, *it);
		env->SetObjectArrayElement(result, idx++, mode);
	}

	return result;

	//jclass jTransferModeCls = env->FindClass("org/eclipse/fx/drift/DriftFXSurface$TransferMode");
	//jmethodID jNew = env->GetMethodID(jTransferModeCls, "<init>", "(Ljava/lang/String;I)V");

	//auto count = (jsize) SharedTextureFactory::factories.size();

	//jobjectArray result = env->NewObjectArray(count, jTransferModeCls, 0);
	//int i = 0;
	//for (const auto& el : SharedTextureFactory::factories) {
	//	auto data = el.second;
	//	jstring name = env->NewStringUTF(data.name.c_str());
	//	jobject type = env->NewObject(jTransferModeCls, jNew, name, (jint) data.id);
	//	env->SetObjectArrayElement(result, i++, type);
	//}

	//return result;
}


extern "C" JNIEXPORT jint JNICALL Java_org_eclipse_fx_drift_internal_NativeAPI_nOnTextureCreated(JNIEnv* env, jclass cls, jlong surfaceId, jlong frameId, jobject fxTexture) {
	auto begin = std::chrono::steady_clock::now();

	LogDebug("onTextureCreated " << dec << surfaceId << "." << frameId);

	NativeSurface* surface = NativeSurfaceRegistry::Get()->Get((long) surfaceId);
	Frame* frame = surface->GetFrameManager()->GetFrame((long long) frameId);

	if (frame == nullptr) {
		LogWarning("Frame " << surfaceId << "." << frameId << " does not exist!");
		return -1;
	}

	SurfaceData surfaceData = frame->GetSurfaceData();

	LogDebug(" -> surfaceData.transferMode = " << surfaceData.transferMode );

	jint result = prism::PrismBridge::Get()->OnTextureCreated(frame, fxTexture);

	frame->fxPresentBegin = begin;
	frame->fxPresentEnd = std::chrono::steady_clock::now();

	return result;
}

