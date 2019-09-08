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

#ifndef DRIFTFX_GL_GLDEBUG_H_
#define DRIFTFX_GL_GLDEBUG_H_

#include <GL/glew.h>


#include <iomanip>
#include <iostream>
#include <string>

#include <DriftFX/Common.h>

#include <utils/Logger.h>

namespace driftfx {
namespace gl {


#define logGLErr(code) code; { GLuint err = glGetError(); if (err != 0) LogError("GL Error: 0x" << std::hex << err << " " << driftfx::gl::TranslateGLError(err) << " ( " << #code << " )" ); }


#define GLERR(code) code; { GLuint err = glGetError(); if (err != 0) LogError("GL Error: 0x" << std::hex << err << " " << driftfx::gl::TranslateGLError(err) << " ( " << #code << " )" ); }


DRIFT_API std::string TranslateGLError(GLuint err);

}
}
#endif /* DRIFTFX_GL_GLDEBUG_H_ */
