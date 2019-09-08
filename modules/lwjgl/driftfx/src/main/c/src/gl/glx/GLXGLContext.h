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
#ifndef DRIFTFX_INTERNAL_GL_GLX_GLXGLCONTEXT_H_
#define DRIFTFX_INTERNAL_GL_GLX_GLXGLCONTEXT_H_

#include <DriftFX/GL/GLContext.h>

#include <X11/Xlib.h>
//#include <GL/glx.h>
#include <GL/glxew.h>

#include "../InternalGLContext.h"

namespace driftfx {
using namespace gl;
namespace internal {
namespace gl {
namespace glx {


class GLXGLContext : public InternalGLContext {

public:
	GLXGLContext(std::string name, GLXContext* context, Drawable* drawable);

	GLXGLContext(std::string name);
	GLXGLContext(std::string name, GLXGLContext* shared);
	GLXGLContext(std::string name, GLXContext glxContext);
	virtual ~GLXGLContext();

	virtual void SetCurrent();
	virtual void UnsetCurrent();
	virtual bool IsCurrent();

	virtual GLContext* CreateSharedContext();
	virtual GLContext* CreateSharedContext(std::string name);
	virtual GLXContext GetHandle();

private:
	Display* display;
	GLXContext glxContext;
	GLXPbuffer pBuffer;
};

}
}
}
}

#endif /* DRIFTFX_INTERNAL_GL_GLX_GLXGLCONTEXT_H_ */
