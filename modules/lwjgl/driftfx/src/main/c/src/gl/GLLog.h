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

#ifndef DRIFTFX_GL_GLLOG_H_
#define DRIFTFX_GL_GLLOG_H_

#include <GL/glew.h>

#include <string>

namespace driftfx {
namespace gl {

#ifndef __PRETTY_FUNCTION__
  #define __PRETTY_FUNCTION__ __FUNCTION__
#endif

#define GLCALL(code) code; { ::driftfx::gl::CheckGLError(#code, __FILE__, __LINE__, __PRETTY_FUNCTION__);}

void CheckGLError(std::string call, std::string file, int line, std::string func);
std::string ToString(GLenum error);

}
}
#endif /* DRIFTFX_GL_GLLOG_H_ */
