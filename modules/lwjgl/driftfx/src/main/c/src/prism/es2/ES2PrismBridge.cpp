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
#include <iomanip>

#include <chrono>

#include "ES2PrismBridge.h"
#include "ES2NativeSurface.h"

#include <DriftFX/GL/GLContext.h>
#include <DriftFX/GL/GLDebug.h>
#include <utils/Logger.h>
#include <utils/JNIHelper.h>

#include <gl/GLLog.h>

using namespace driftfx::gl;

using namespace driftfx::internal;
using namespace driftfx::internal::prism;
using namespace driftfx::internal::prism::es2;

ES2PrismBridge::ES2PrismBridge(GLContext* fxContext) :
	PrismBridge(fxContext),
	fxGLContext(fxContext) {

	LogDebug("Constructed PrismBridge with fxContext = " << fxContext);

	fxSharedGLContext = fxContext->CreateSharedContext();
}

ES2PrismBridge::~ES2PrismBridge() {
	delete fxSharedGLContext;
}

void ES2PrismBridge::EnsurePrismContext() {
	GetFXSharedGLContext()->SetCurrent();
}

GLContext* ES2PrismBridge::GetFXSharedGLContext() {
	return fxSharedGLContext;
}

GLuint ES2PrismBridge::GetGLTextureName(jobject fxTexture) {
	// TODO we could handle this purely in native code via jni calls
	JNIEnv* env = JNIHelper::GetJNIEnv(true);

	jclass cls = env->FindClass("org/eclipse/fx/drift/internal/GraphicsPipelineUtil$ES2");
	cls = (jclass)env->NewGlobalRef(cls);

	jmethodID getTextureName = env->GetStaticMethodID(cls, "getTextureName", "(Lcom/sun/prism/Texture;)I");

	//LogDebug("Calling now with " << cls << " / " << getTextureName << " / " << fxTexture);
	jint val = env->CallStaticIntMethod(cls, getTextureName, fxTexture);
	//LogDebug(" Got " << val);
	return (GLuint) val;
}


int ES2PrismBridge::CopyTexture(int sourceTex, int targetTex, int width, int height) {
	// COPY OVER
	GLuint fbos[2];

	GLCALL( glGenFramebuffers(2, &fbos[0]) );

	GLCALL( glBindFramebuffer(GL_READ_FRAMEBUFFER, fbos[0]) );
	GLCALL( glFramebufferTexture(GL_READ_FRAMEBUFFER, GL_COLOR_ATTACHMENT0, sourceTex, 0) );

	GLCALL( glBindFramebuffer(GL_DRAW_FRAMEBUFFER, fbos[1]); );
	GLCALL( glFramebufferTexture(GL_DRAW_FRAMEBUFFER, GL_COLOR_ATTACHMENT0, targetTex, 0) );

	GLCALL( glClearColor(0, 0, 0, 0) );
	GLCALL( glClear(GL_COLOR_BUFFER_BIT) );

	GLCALL( glBlitFramebuffer(0, 0, width, height, 0, 0, width, height, GL_COLOR_BUFFER_BIT, GL_LINEAR) );

	// We need to wait here for the blit operation to finish to prevent copying an empty texture in FX context
	GLCALL( glFinish() );

	GLCALL( glDeleteFramebuffers(2, &fbos[0]) );

	return 0;
}

void FenceSyncWait() {
	GLsync frameReady;
	GLCALL( frameReady = glFenceSync(GL_SYNC_GPU_COMMANDS_COMPLETE, 0) );
	GLenum state;
	auto begin = std::chrono::steady_clock::now();
	GLCALL( state = glClientWaitSync(frameReady, GL_SYNC_FLUSH_COMMANDS_BIT, 1000000000) );
	GLCALL( glDeleteSync( frameReady ) );
	switch (state) {
	case GL_ALREADY_SIGNALED: LogDebug("frameDone sync already signaled"); break;
	case GL_TIMEOUT_EXPIRED: LogError("frameDone sync timed out!"); break;
	case GL_CONDITION_SATISFIED: LogDebug("frameDone sync awaited"); break;
	case GL_WAIT_FAILED: LogError("frameDone sync failed!"); break;
	}
	auto duration = std::chrono::duration_cast<std::chrono::nanoseconds>(std::chrono::steady_clock::now() - begin);
	LogDebug( "wait for frame ready needed " << duration.count() << "ns" );

}

void ES2PrismBridge::UploadTexture(int targetTex, int width, int height, void* memoryPointer, unsigned long memorySize) {
	LogDebug( "updateTexture " << targetTex << ", " << width << ", " << height << ", " << memoryPointer << ", " << memorySize );
	auto begin = std::chrono::steady_clock::now();
	GLCALL( glBindTexture(GL_TEXTURE_2D, targetTex) );
	GLCALL( glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA8, width, height, 0, GL_RGBA, GL_UNSIGNED_INT_8_8_8_8_REV, memoryPointer) );
	GLCALL( glBindTexture(GL_TEXTURE_2D, 0) );
	auto duration = std::chrono::duration_cast<std::chrono::nanoseconds>(std::chrono::steady_clock::now() - begin);
	LogDebug( "upload frame needed " << duration.count() << "ns" );

	FenceSyncWait();
}


NativeSurface* ES2PrismBridge::CreateNativeSurface(long surfaceId, JNINativeSurface* api) {
	return new ES2NativeSurface(surfaceId, api);
}


