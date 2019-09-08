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
#ifndef PRISM_ES2_ES2NATIVESURFACE_H_
#define PRISM_ES2_ES2NATIVESURFACE_H_

#include "../../NativeSurface.h"

namespace driftfx {
namespace internal {
namespace prism {
namespace es2 {


class ES2NativeSurface : public NativeSurface {

protected:
	gl::GLContext* sharedFXContext;

public:
	ES2NativeSurface(long surfaceId, JNINativeSurface* api);
	virtual ~ES2NativeSurface();

	virtual Context* GetFxContext();

};


}
}
}
}

#endif /* PRISM_ES2_ES2NATIVESURFACE_H_ */
