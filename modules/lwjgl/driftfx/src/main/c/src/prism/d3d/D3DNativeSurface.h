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
#ifndef PRISM_D3D_D3DNATIVESURFACE_H_
#define PRISM_D3D_D3DNATIVESURFACE_H_

#include <DriftFX/Context.h>

#include "NativeSurface.h"
#include "win32/D3D9ExContext.h"

#include "D3DPrismBridge.h"

namespace driftfx {
namespace internal {
namespace prism {
namespace d3d {


class D3DNativeSurface : public NativeSurface {

	friend D3DPrismBridge; // for calling our protected constructor

public:
	virtual ~D3DNativeSurface();

	virtual void Initialize();
	virtual void Cleanup();

protected:
	virtual Context* GetFxContext();
	D3DNativeSurface(long surfaceId, JNINativeSurface* api);

private:
	D3D9ExContext* fxContext;
};


}
}
}
}

#endif /* PRISM_D3D_D3DNATIVESURFACE_H_ */
