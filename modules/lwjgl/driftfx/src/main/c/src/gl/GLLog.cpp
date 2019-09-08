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

#include <GL/glew.h>

#include <string>
#include <iostream>
#include <sstream>

#include "GLLog.h"
#include "InternalGLContext.h"

#include <utils/Logger.h>

using namespace std;

string driftfx::gl::ToString(GLenum err) {
	switch (err) {
	case GL_NO_ERROR: break;
	case GL_INVALID_FRAMEBUFFER_OPERATION: return "GL_INVALID_FRAMEBUFFER_OPERATION";
	case GL_INVALID_ENUM: return "GL_INVALID_ENUM";
	case GL_INVALID_VALUE: return "GL_INVALID_VALUE";
	case GL_INVALID_OPERATION: return "GL_INVALID_OPERATION";
	case GL_OUT_OF_MEMORY: return "GL_OUT_OF_MEMORY";
	default: break;
	}
	ostringstream r;
	r << "UNKOWN_GL_ERROR_CODE " << hex << err;
	return r.str();
}

void driftfx::gl::CheckGLError(string call, string file, int line, string func) {
	GLenum error = glGetError();
	if (GL_NO_ERROR != error) {

		ostringstream s;
		s    << "GL Error occurred! " << ToString(error) << ":" << endl
		     << " GL call: " << call << endl
			 << " Location: " << file << ";" << line << endl
			 << " Function: " << func << endl;

		Log(Error, file, line, call) << s.str();
	}
}



