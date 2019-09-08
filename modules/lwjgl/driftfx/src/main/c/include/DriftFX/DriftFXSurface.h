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
#ifndef DRIFTFX_DRIFTFXSURFACE_H_
#define DRIFTFX_DRIFTFXSURFACE_H_

#include <list>

#include <DriftFX/Common.h>
#include <DriftFX/RenderTarget.h>
#include <DriftFX/Context.h>
#include <DriftFX/GL/GLContext.h>
#include <DriftFX/math/Vec2.h>

#include <DriftFX/TransferMode.h>

namespace driftfx {

enum DRIFT_API PresentationHint {
	CENTER,
	COVER,
	CONTAIN,
	TOP_LEFT,
	TOP_CENTER,
	TOP_RIGHT,
	CENTER_LEFT,
	CENTER_RIGHT,
	BOTTOM_LEFT,
	BOTTOM_CENTER,
	BOTTOM_RIGHT
};

class DRIFT_API DriftFXSurface {

public:
	/*
	 * Initializes this surface.
	 * Should be called on your render thread.
	 * This will create a GLContext. Its accessible via GetContext().
	 */
	virtual void Initialize() = 0;

	/*
	 * Cleanup this native surface.
	 * Should be called on your render thread.
	 * Releases all pending resources and destroys its contexts.
	 */
	virtual void Cleanup() = 0;

	/*
	 * Acquires a RenderTarget with the current width / height.
	 * delegates to Acquire(GetWidth(), GetHeight()).
	 */
	virtual RenderTarget* Acquire() = 0;
	virtual RenderTarget* Acquire(TransferMode* transferMode) = 0;

	/*
	 * Acquires a new RenderTarget with the given size.
	 * Should be called from your render thread.
	 *
	 */
	virtual RenderTarget* Acquire(unsigned int width, unsigned int height) = 0;
	virtual RenderTarget* Acquire(unsigned int width, unsigned int height, TransferMode* transferMode) = 0;

	virtual RenderTarget* Acquire(math::Vec2ui size) = 0;
	virtual RenderTarget* Acquire(math::Vec2ui size, TransferMode* transferMode) = 0;

	/*
	 * Presents a previously acquired RenderTarget.
	 * Should be called from your render thread.
	 *
	 */
	virtual void Present(RenderTarget* target, PresentationHint hint) = 0;


	virtual gl::GLContext* GetContext() = 0;

	/*
	 * returns the current width of the NativeSurface in JavaFX
	 */
	virtual unsigned int GetWidth() = 0;
	/*
	 * returns the current height of the NativeSurface in JavaFX
	 */
	virtual unsigned int GetHeight() = 0;

	/*
	 * returns the current surface size in JavaFX units
	 */
	virtual math::Vec2d GetSurfaceSize() = 0;

	/*
	 * returns the current screen scale
	 */
	virtual math::Vec2d GetScreenScale() = 0;

	/*
	 * returns the current user scale
	 */
	virtual math::Vec2d GetUserScale() = 0;

	/*
	 * returns ceil(surfaceSize * screenScale * userScale)
	 */
	virtual math::Vec2ui GetScaledSize() = 0;

	static std::list<TransferMode*> GetAvailableTransferModes();
	static TransferMode* GetPlatformDefaultTransferMode();
	static TransferMode* GetFallbackTransferMode();

protected:
	virtual ~DriftFXSurface() = 0;
};

}

#endif /* DRIFTFX_DRIFTFXSURFACE_H_ */
