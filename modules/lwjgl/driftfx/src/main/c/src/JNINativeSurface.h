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
#ifndef JNINATIVESURFACE_H_
#define JNINATIVESURFACE_H_

#include <jni.h>

namespace driftfx {
namespace internal {

	class Frame;

namespace jni {

	class Frame {
	public:
		static void Initialize(JNIEnv* env);
		static void Dispose(JNIEnv* env);
		static jobject New(JNIEnv* env, jlong surfaceId, jlong frameId, jint w, jint h, jobject surfaceData, jint presentationHint);
	private:
		static jclass cls;
		static jmethodID constructor;
	};

	class SurfaceData {
	public:
		static void Initialize(JNIEnv* env);
		static void Dispose(JNIEnv* env);
		static jobject New(JNIEnv* env, jfloat width, jfloat height, jfloat renderScaleX, jfloat renderScaleY, jfloat userScaleX, jfloat userScaleY, jint transferMode);
	private:
		static jclass cls;
		static jmethodID constructor;
	};

	class NativeSurface {
	public:
		static void Initialize(JNIEnv* env);
		static void Dispose(JNIEnv* env);
		static void Present(JNIEnv* env, jobject nativeSurface, jobject frame);
	private:
		static jclass cls;
		static jmethodID present;
	};

}

class JNINativeSurface {

public:
	JNINativeSurface(jobject javaNativeSurface);
	virtual ~JNINativeSurface();

	void Present(Frame* frame);

	static void Initialize();
	static void Dispose();

private:
	jobject jNativeSurfaceInstance;
};

}
}


#endif /* JNINATIVESURFACE_H_ */
