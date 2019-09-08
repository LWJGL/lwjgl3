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
#ifndef JNI_JNIUTIL_H_
#define JNI_JNIUTIL_H_

#include <jni.h>

namespace driftfx {
namespace internal {
namespace jni {

jclass ResolveClass(JNIEnv* env, const char* name);
jmethodID ResolveMethod(JNIEnv* env, jclass cls, const char* name, const char* sig);
jfieldID ResolveField(JNIEnv* env, jclass cls, const char* name, const char* sig);

}
}
}

#endif
