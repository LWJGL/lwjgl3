
#include <jni.h>
#include <iostream>
#include <iomanip>

#include "utils/Logger.h"

#include "NativeSurfaceRegistry.h"
#include "NativeSurface.h"
#include "FrameManager.h"

#include "jni/JNITiming.h"

using namespace std;
using namespace driftfx::internal;


std::string Convert(JNIEnv* env, jstring in) {
	const char* chars = env->GetStringUTFChars(in, 0);
	string s(chars);
	env->ReleaseStringUTFChars(in, chars);
	return s;
}
jobject Convert(JNIEnv* env, Timing & t) {
	return jni::Timing::New(env, env->NewStringUTF(t.tag.c_str()), (jlong) t.begin, (jlong) t.end);
}

jobjectArray Convert(JNIEnv* env, vector<Timing> report) {
	jobjectArray result = env->NewObjectArray(report.size(), jni::Timing::Class(), 0);

	vector<Timing>::iterator it;
	int index;
	for (index = 0; index < report.size(); index++) {
		Timing & t = report[index];
		env->SetObjectArrayElement(result, index, Convert(env, t));
	}

	return result;
}

extern "C" JNIEXPORT void JNICALL Java_org_eclipse_fx_drift_internal_Frame_nBegin(JNIEnv* env, jclass cls, jlong surfaceId, jlong frameId, jstring tag) {
	NativeSurface* surface = NativeSurfaceRegistry::Get()->Get((long) surfaceId);
	Frame* frame = surface->GetFrameManager()->GetFrame(frameId);
	frame->Begin(Convert(env, tag));
}

extern "C" JNIEXPORT void JNICALL Java_org_eclipse_fx_drift_internal_Frame_nEnd(JNIEnv* env, jclass cls, jlong surfaceId, jlong frameId, jstring tag) {
	NativeSurface* surface = NativeSurfaceRegistry::Get()->Get((long) surfaceId);
	Frame* frame = surface->GetFrameManager()->GetFrame(frameId);
	frame->End(Convert(env, tag));
}


extern "C" JNIEXPORT jarray JNICALL Java_org_eclipse_fx_drift_internal_Frame_nGetReport(JNIEnv* env, jclass cls, jlong surfaceId, jlong frameId) {
	NativeSurface* surface = NativeSurfaceRegistry::Get()->Get((long) surfaceId);
	Frame* frame = surface->GetFrameManager()->GetFrame(frameId);

	vector<Timing> report = frame->GetReport();

	return Convert(env, report);
}

