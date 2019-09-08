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
#ifndef DRIFTFX_GL_GLCONTEXT_H_
#define DRIFTFX_GL_GLCONTEXT_H_

#include <string>
#include <exception>

#include <DriftFX/Common.h>
#include <DriftFX/Context.h>

#include <string>

namespace driftfx {
namespace gl {

class DRIFT_API GLContext : public Context {

public:
	virtual void SetCurrent() = 0;
	virtual void UnsetCurrent() = 0;

	virtual bool IsCurrent() = 0;

	virtual GLContext* CreateSharedContext() = 0;
	virtual GLContext* CreateSharedContext(std::string name) = 0;

	virtual Texture* CreateTexture(int width, int height);

	virtual std::string GetName() = 0;

};

//struct DRIFT_API GLContextException : public std::exception {
//	std::string message;
//	inline const char* what() const throw () {
//		return message.c_str();
//	}
//	GLContextException(std::string msg) : message(msg) {
//	}
//};

}
}

#endif /* DRIFTFX_GL_GLCONTEXT_H_ */
