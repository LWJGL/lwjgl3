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

#ifndef DRIFTFX_GL_GLTEXTURE_H_
#define DRIFTFX_GL_GLTEXTURE_H_

#include <DriftFX/Common.h>

// This is the only place where we need the GL Header (GLuint for textureName) 
// for now we should just use unsigned int..
typedef unsigned int GLuint;

#include <DriftFX/Texture.h>
#include <DriftFX/GL/GLContext.h>

namespace driftfx {
namespace gl {

class DRIFT_API GLTexture : public Texture {

public:
	GLTexture(GLContext *context, int width, int height);
	virtual ~GLTexture() noexcept(false);

	GLuint Name();

protected:
	GLContext *context;
	GLuint textureName;

};

}
}


#endif /* DRIFTFX_GL_GLTEXTURE_H_ */
