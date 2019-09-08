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

#ifndef DRIFTFX_TEXTURE_H_
#define DRIFTFX_TEXTURE_H_

#include <DriftFX/Common.h>

namespace driftfx {

class DRIFT_API Texture {

public:
	virtual ~Texture() noexcept(false);

	virtual unsigned int GetWidth();
	virtual unsigned int GetHeight();

protected:
	Texture(unsigned int width, unsigned int height);

private:
	unsigned int width;
	unsigned int height;
};

}

#endif /* DRIFTFX_TEXTURE_H_ */
