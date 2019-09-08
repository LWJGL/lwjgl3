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

#include "CGLGLContext.h"

#include <DriftFX/GL/GLContext.h>

#include "cgl.h"

#include <cstdint>

#include <GL/glew.h>

#include <OpenGL/OpenGL.h>
#include <OpenGL/CGLContext.h>
#include <OpenGL/CGLTypes.h>
#include <OpenGL/CGLDevice.h>
#include <OpenGL/gl.h>

#include <iostream>
#include <sstream>
#include <string>
#include <thread>


#include <utils/Logger.h>

#include <gl/cgl/CGLLog.h>

using namespace std;

using namespace driftfx::gl;
using namespace driftfx::internal::gl::cgl;

CGLGLContext::CGLGLContext(std::string name, CGLContextObj cglContext, bool managed) : InternalGLContext(name),
		contextObj(cglContext),
		managed(managed) {
}

GLContext* CGLGLContext::CreateSharedContext() {
	return CreateSharedContext("shared");
}

GLContext* CGLGLContext::CreateSharedContext(std::string name) {
	LogDebug("creating shared context!!");
	CGLPixelFormatObj pix = CGLGetPixelFormat(contextObj);
	CGLContextObj newContext;
	CGLCALL( CGLCreateContext( pix, contextObj, &newContext ) );
	ostringstream s;
	s << GetName() << "/" << name;
	return new CGLGLContext(s.str(), newContext, true);
}

CGLGLContext::CGLGLContext(std::string name) : InternalGLContext(name),
	managed(true) {

	CGLPixelFormatAttribute attributes[5] = {
		//kCGLPFAPBuffer,
		kCGLPFAAccelerated,
		kCGLPFAOpenGLProfile,
		(CGLPixelFormatAttribute) kCGLOGLPVersion_GL4_Core,
		(CGLPixelFormatAttribute) 0
	};
	GLint num;

	CGLPixelFormatObj pix;
	CGLCALL( CGLChoosePixelFormat( attributes, &pix, &num ) );
	CGLCALL( CGLCreateContext( pix, 0, &contextObj ) );
	CGLCALL( CGLDestroyPixelFormat( pix ) );
}

CGLGLContext::~CGLGLContext() {
	CGLCALL( CGLDestroyContext( contextObj ) );
}

void CGLGLContext::SetCurrent() {
	CGLCALL( CGLSetCurrentContext( contextObj ) );
}
void CGLGLContext::UnsetCurrent() {
	CGLCALL( CGLSetCurrentContext( NULL ) );
}
bool CGLGLContext::IsCurrent() {
	return CGLGetCurrentContext() == contextObj;
}

void* CGLGLContext::GetHandle() {
	return (void*) contextObj;
}

CGLContextObj CGLGLContext::GetCGLContextObj() {
	return contextObj;
}

