
#include <jni.h>
#include <GL/glew.h>

#include "gl/GLLog.h"

#include "utils/Logger.h"

extern "C" JNIEXPORT jlong JNICALL Java_org_eclipse_fx_drift_internal_GPUSyncUtil_nCreateFence(JNIEnv* env, jclass cls) {
	GLsync fence;
	GLCALL( fence = glFenceSync(GL_SYNC_GPU_COMMANDS_COMPLETE, 0) );
	LogDebug("nCreateFence " << fence);
	return (jlong) fence;
}

extern "C" JNIEXPORT void JNICALL Java_org_eclipse_fx_drift_internal_GPUSyncUtil_nDeleteSync(JNIEnv* env, jclass cls, jlong sync) {
	GLsync fence = (GLsync) sync;
	LogDebug("nDeleteSync " << fence);
	GLCALL( glDeleteSync(fence) );
}

extern "C" JNIEXPORT jint JNICALL Java_org_eclipse_fx_drift_internal_GPUSyncUtil_nClientWaitSync(JNIEnv* env, jclass cls, jlong sync, long timeout) {
	GLsync fence = (GLsync) sync;
	GLuint64 tout = (GLuint64) timeout;
	LogDebug("nCLientWaitSync " << fence << ", " << timeout << "ns");
	GLenum result;
	GLCALL( result = glClientWaitSync(fence, GL_SYNC_FLUSH_COMMANDS_BIT, tout) );
	return (jint) result;
}

extern "C" JNIEXPORT void JNICALL Java_org_eclipse_fx_drift_internal_GPUSyncUtil_nWaitSync(JNIEnv* env, jclass cls, jlong sync) {
	GLsync fence = (GLsync) sync;
	LogDebug("nWaitSync " << fence);
	GLCALL( glWaitSync(fence, 0, GL_TIMEOUT_IGNORED) );
}
