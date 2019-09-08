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

#ifndef DRIFTFX_CONTEXT_H
#define DRIFTFX_CONTEXT_H

#include <DriftFX/Common.h>
#include <DriftFX/Texture.h>

namespace driftfx {

class DRIFT_API Context {

public:
	virtual ~Context();

	virtual Texture* CreateTexture(int width, int height);

protected:
	Context();
};

}

#endif /* DRIFTFX_CONTEXT_H */
