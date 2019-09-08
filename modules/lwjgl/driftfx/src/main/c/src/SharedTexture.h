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

#ifndef DRIFTFX_INTERNAL_SHAREDTEXTURE_H_
#define DRIFTFX_INTERNAL_SHAREDTEXTURE_H_

#include <DriftFX/DriftFXSurface.h>
#include <DriftFX/Context.h>
#include <DriftFX/Texture.h>

#include <DriftFX/GL/GLContext.h>
#include <DriftFX/GL/GLTexture.h>

#include <DriftFX/RenderTarget.h>

#include <DriftFX/math/Vec2.h>

#include "SurfaceData.h"
#include "FrameManager.h"

#include <map>
#include <functional>

#include <GL/glew.h>

namespace driftfx {
using namespace gl;
namespace internal {



class SharedTexture {

public:
	virtual ~SharedTexture();

	virtual GLTexture* GetTexture();

	virtual bool BeforeRender() = 0;
	virtual bool AfterRender() = 0;

	virtual math::Vec2ui GetSize();

	virtual ShareData* CreateShareData() = 0;

	virtual std::string ToString();

protected:
	SharedTexture(GLContext* glContext, math::Vec2ui size);

	virtual void Allocate() = 0;
	virtual void Release() = 0;

	GLContext* glContext;
	GLTexture* glTexture;

	math::Vec2ui size;

	virtual void SignalFrameReady();
	virtual void WaitForFrameReady();

private:
	GLsync frameReady;
};

typedef unsigned int SharedTextureFactoryId;
typedef std::function<SharedTexture*(GLContext*, Context*, math::Vec2ui)> SharedTextureFactoryFunc;

struct SharedTextureFactoryData {
	unsigned int id;
	std::string name;
	SharedTextureFactoryFunc func;
};



class SharedTextureFactory {
public:
	static SharedTextureFactoryId NOOP;
	static SharedTextureFactoryId FALLBACK;
	static SharedTextureFactoryId PLATFORM_DEFAULT;

	static SharedTexture* CreateSharedTexture(SharedTextureFactoryId id, GLContext* context, Context* fxContext, math::Vec2ui size);

	static SharedTextureFactoryId RegisterSharedTextureType(std::string name, SharedTextureFactoryFunc factory);
	static SharedTextureFactoryId RegisterSharedTextureType(SharedTextureFactoryId id, std::string name, SharedTextureFactoryFunc factory);
	static SharedTextureFactoryId RegisterSharedTextureTypeAlias(SharedTextureFactoryId aliasId, SharedTextureFactoryId id);
	static std::string GetFactoryName(SharedTextureFactoryId id);

	

	static std::map<SharedTextureFactoryId, SharedTextureFactoryData> factories;
private:
	static SharedTextureFactoryId nextType;
};

}
}

#endif /* DRIFTFX_INTERNAL_SHAREDTEXTURE_H_ */
