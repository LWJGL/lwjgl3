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

#ifndef DRIFTFX_INTERNAL_MAINMEMORYSHAREDTEXTURE_H_
#define DRIFTFX_INTERNAL_MAINMEMORYSHAREDTEXTURE_H_

#include <DriftFX/GL/GLContext.h>
#include <DriftFX/math/Vec2.h>

#include <TransferModeManager.h>

#include "SharedTexture.h"

#include <GL/glew.h>

namespace driftfx {
namespace internal {

class MainMemoryShareData : public ShareData {
public:
	void* pointer;
	unsigned int length;
};

class MainMemorySharedTexture : public SharedTexture {

public:
	MainMemorySharedTexture(GLContext* context, math::Vec2ui size);
	virtual ~MainMemorySharedTexture();

	virtual bool BeforeRender();
	virtual bool AfterRender();

	virtual ShareData* CreateShareData();

protected:

	virtual void Allocate();
	virtual void Release();

	void DownloadToMemory();


private:

	unsigned long memSize;
	void* pointer;


};

}
}

#endif
