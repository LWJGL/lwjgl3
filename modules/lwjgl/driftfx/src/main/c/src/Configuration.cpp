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
 
#include "Configuration.h"
 
#include <jni.h>
#include <utils/JNIHelper.h>

#include <utils/Logger.h>

#include <iostream>
using namespace std;
 
using namespace driftfx::internal;
 
bool Configuration::debug = false;
int Configuration::logLevel = 1;
bool Configuration::useWinFallback = false;


bool getJavaField(JNIEnv *env, jclass cls, const char * name) {
	jfieldID field = env->GetStaticFieldID(cls, name, "Z");
	return (bool) env->GetStaticBooleanField(cls, field);
}

void Configuration::Initialize() {
	JNIEnv *env = JNIHelper::GetJNIEnv(true);
	jclass jConfigurationClass = env->FindClass("org/eclipse/fx/drift/internal/Configuration");
	jfieldID jDebugField = env->GetStaticFieldID(jConfigurationClass, "DEBUG", "Z");
	jfieldID jLogLevelField = env->GetStaticFieldID(jConfigurationClass, "LOGLEVEL", "I");

	jfieldID jUseWinFallbackField = env->GetStaticFieldID(jConfigurationClass, "USEWINFALLBACK", "Z");

	debug = (bool) env->GetStaticBooleanField(jConfigurationClass, jDebugField);
	logLevel = (int )env->GetStaticIntField(jConfigurationClass, jLogLevelField);

	useWinFallback = (bool)env->GetStaticBooleanField(jConfigurationClass, jUseWinFallbackField);

	LogSetEnabled(LogLevel::Debug, false);
	LogSetEnabled(LogLevel::Info, false);
	LogSetEnabled(LogLevel::Error, false);

	switch (logLevel) {
	case LEVEL_DEBUG: LogSetEnabled(LogLevel::Debug, true);
	case LEVEL_INFO: LogSetEnabled(LogLevel::Info, true);
	case LEVEL_WARNING:
	case LEVEL_ERROR: LogSetEnabled(LogLevel::Error, true);
	}
	

	LogInfo("Loaded native driftfx configuration:");
	LogInfo("debug = " << debug);
	LogInfo("logLevel = " << logLevel);
	LogInfo("useWinFallback = " << useWinFallback);
}

bool Configuration::IsDebug() {
	return debug;
}

bool Configuration::IsUseWinFallback() {
	return useWinFallback;
}

int Configuration::GetLogLevel() {
	return logLevel;
}
