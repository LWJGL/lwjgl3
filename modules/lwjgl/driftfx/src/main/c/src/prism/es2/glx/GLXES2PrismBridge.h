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

#ifndef PRISM_ES2_GLX_GLXES2PRISMBRIDGE_H_
#define PRISM_ES2_GLX_GLXES2PRISMBRIDGE_H_

#include <jni.h>
#include "../ES2PrismBridge.h"

namespace driftfx {
namespace internal {
namespace prism {
namespace es2 {
namespace glx {


class GLXES2PrismBridge : public ES2PrismBridge {

public:
	GLXES2PrismBridge(jlong pContext);
	virtual ~GLXES2PrismBridge();

	static void Initialize(jlong pContext);
};

}
}
}
}
}

#endif /* PRISM_ES2_GLX_GLXES2PRISMBRIDGE_H_ */
