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
#ifndef JNI_TIMING_H_
#define JNI_TIMING_H_

#include <jni.h>

namespace driftfx {
namespace internal {

namespace jni {

class Timing {
public:
	static void Initialize(JNIEnv* env);
	static void Dispose(JNIEnv* env);

	static jobject New(JNIEnv* env, jstring tag, jlong begin, jlong end);

	static jclass Class();
private:
	static jclass cls;
	static jmethodID constructor;
};

}
}
}

#endif
