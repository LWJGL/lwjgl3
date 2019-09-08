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
#ifndef DRIFTFX_SRC_INTERNALDRIFTFX_H_
#define DRIFTFX_SRC_INTERNALDRIFTFX_H_

#include <DriftFX/DriftFX.h>

#include "JNINativeSurface.h"

namespace driftfx {
namespace internal {


class InternalDriftFX : public DriftFX {

public:
	virtual DriftFXSurface* GetSurface(long surfaceId);
	virtual long CreateSurface(JNINativeSurface* api);

	static InternalDriftFX* instance;
protected:
	virtual ~InternalDriftFX();

};


}
}

#endif /* DRIFTFX_SRC_INTERNALDRIFTFX_H_ */
