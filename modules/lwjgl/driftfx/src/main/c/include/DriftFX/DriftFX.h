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
#ifndef DRIFTFX_DRIFTFX_H_
#define DRIFTFX_DRIFTFX_H_

#include <DriftFX/Common.h>

#include <DriftFX/DriftFXSurface.h>

namespace driftfx {

class DRIFT_API DriftFX {

public:
	static DriftFX* Get();
	virtual DriftFXSurface* GetSurface(long surfaceId) = 0;

protected:
	virtual ~DriftFX();
};

}

#endif /* DRIFTFX_DRIFTFX_H_ */
