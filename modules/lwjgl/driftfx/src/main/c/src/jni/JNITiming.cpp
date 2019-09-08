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

#include "JNITiming.h"
#include "jniutil.h"

using namespace driftfx::internal::jni;


jclass Timing::cls = nullptr;
jmethodID Timing::constructor = nullptr;

void Timing::Initialize(JNIEnv* env) {
	cls = ResolveClass(env, "org/eclipse/fx/drift/internal/Frame$Timing");
	cls = (jclass) env->NewGlobalRef(cls);
	constructor = ResolveMethod(env, cls, "<init>", "(Ljava/lang/String;JJ)V");
}
void Timing::Dispose(JNIEnv* env) {
	env->DeleteGlobalRef(cls);
	cls = nullptr;
	constructor = nullptr;
}
jobject Timing::New(JNIEnv* env, jstring tag, jlong begin, jlong end) {
	return env->NewObject(cls, constructor, tag, begin, end);
}
jclass Timing::Class() {
	return cls;
}
