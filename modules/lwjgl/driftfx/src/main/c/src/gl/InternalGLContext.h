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
#ifndef DRIFTFX_GL_INTERNAL_INTERNALGLCONTEXT_H_
#define DRIFTFX_GL_INTERNAL_INTERNALGLCONTEXT_H_

#include <DriftFX/GL/GLContext.h>

#include <GL/glew.h>

#include <string>

namespace driftfx {
namespace internal {
namespace gl {


class InternalGLContext : public driftfx::gl::GLContext {

public:
	InternalGLContext(std::string name);
	virtual ~InternalGLContext();

	virtual std::string GetName();

//	static GLenum glGetError();
//	static void glGenTextures(GLsizei n, GLuint* textures);
//	static void glDeleteTextures(GLsizei n, GLuint* textures);
//	static void glBindTexture(GLenum target, GLuint texture);
//	static void glGenFramebuffers(GLsizei n, GLuint* ids);
//	static void glDeleteFramebuffers(GLsizei n, GLuint* ids);
//	static void glBindFramebuffer(GLenum target, GLuint id);
//	static GLenum glCheckFramebufferStatus(GLenum target);
//	static void glClearColor(GLfloat red, GLfloat green, GLfloat blue, GLfloat alpha);
//	static void glClear();
//	static void glFlush();
//	static void glFinish();

//	static void GetTexImage(GLenum target, GLint level, GLenum format, GLenum type, void* pixels);

//	static void GenBuffers(GLsizei n, GLuint* buffers);
//	static void DeleteBuffers(GLsizei n, GLuint* buffers);
//	static void* MapBuffer(GLenum target, GLenum access);
//	static void UnmapBuffer(GLenum target);
//	static void BindBuffer(GLenum target, GLuint buffer);


	static void Initialize();
	static void Cleanup();

//	static void checkGLError();
//	static std::string getGLErrorString(GLenum error);

//	static bool checkGLErrors;
protected:
	std::string name;
	long instanceNum;

	static void* resolve(const GLubyte* name);

	static long instanceCount;
	static bool initialized;

};

}
}
}

#endif /* DRIFTFX_GL_INTERNAL_INTERNALGLCONTEXT_H_ */
