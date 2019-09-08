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

#ifndef DRIFTFX_GL_CGL_CGLLOG_H_
#define DRIFTFX_GL_CGL_CGLLOG_H_


#include <OpenGL/CGLTypes.h>
#include <string>

namespace driftfx {
namespace gl {
namespace cgl {

#ifndef __PRETTY_FUNCTION__
  #define __PRETTY_FUNCTION__ __FUNCTION__
#endif

#define CGLCALL(code) { CGLError err = code; ::driftfx::gl::cgl::CheckCGLError(err, #code, __FILE__, __LINE__, __PRETTY_FUNCTION__);}

void CheckCGLError(CGLError err, std::string call, std::string file, int line, std::string func);

std::string ToString(CGLError err);

}
}
}
#endif /* DRIFTFX_GL_CGL_CGLLOG_H_ */
